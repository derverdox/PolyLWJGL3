package de.verdox.polylwjgl3;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.comments.JavadocComment;
import com.github.javaparser.ast.type.ReferenceType;
import com.github.javaparser.ast.type.Type;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.expr.AnnotationExpr;
import com.github.javaparser.ast.body.Parameter;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public final class GlWrapperAstGen {

    private GlWrapperAstGen() {}

    /** Resource patterns to probe on the classpath and (as fallback) filesystem */
    private static final String[] ACCESSOR_HEADER_RESOURCE_PATTERNS = new String[] {
            "/header/%s.javadoc",
            "/header/%s.javdoc" // tolerate minor typo
    };

    /** key: canonical (gl...) method name (return type NOT part of key) */
    private record FnKey(String canonicalName) {}

    private static final String JB_NULLABLE_FQN = "org.jetbrains.annotations.Nullable";
    private static final String JB_NOTNULL_FQN  = "org.jetbrains.annotations.NotNull";

    /** small structs */
    private record FnIfaceRef(String pkg, String simpleName) {}
    private record WriteResult(String pkgUsed, String simpleNameUsed) {}

    private enum WriteKind { API_SIG_ONLY, IMPL_FULL_TEXT }

    public enum Flavor { GL_CORE, GLES }

    /* ------------------------------------------------------------------------------------------------
       BATCH-API
       ------------------------------------------------------------------------------------------------ */

    public static record Spec(
            String tag,
            Path inputFile,
            String apiInterfaceName,
            String implName,
            String delegateClassFqn,
            String apiPackageName,
            String fnPackageName,
            String fnPackageNameAlternative,
            String fnIfacePrefix,
            String baseApiInterfaceFqn,
            String baseImplClassFqn,
            Flavor flavor
    ) {}

    public static void generateAll(List<Spec> specs, Path outDir, Path fnOutDir) throws IOException {
        if (specs == null || specs.isEmpty()) return;
        if (fnOutDir == null) fnOutDir = outDir;

        // 1) prescan
        Map<String, Map<Flavor, List<MethodSig>>> sigsByFnAndFlavor = new LinkedHashMap<>();

        for (Spec s : specs) {
            String src = Files.readString(s.inputFile, StandardCharsets.UTF_8);
            CompilationUnit cu = StaticJavaParser.parse(src);

            Set<String> baseImports = cu.getImports().stream()
                    .map(i -> "import " + i.getNameAsString() + (i.isAsterisk() ? ".*" : "") + ";")
                    .collect(Collectors.toCollection(LinkedHashSet::new));
            if (s.delegateClassFqn != null && s.delegateClassFqn.contains(".")) {
                baseImports.add("import " + s.delegateClassFqn + ";");
            }
            baseImports.add("import org.jetbrains.annotations.*;");

            List<MethodDeclaration> methods = cu.findAll(MethodDeclaration.class).stream()
                    .filter(m -> m.getNameAsString().matches("(?:n?gl)\\w+"))
                    .filter(m -> m.getModifiers().stream().anyMatch(md -> md.getKeyword() == Modifier.Keyword.PUBLIC))
                    .collect(Collectors.toList());

            Map<String, List<MethodDeclaration>> byCanon = new LinkedHashMap<>();
            for (MethodDeclaration m : methods) {
                String canon = canonicalizeName(m.getNameAsString());
                byCanon.computeIfAbsent(canon, k -> new ArrayList<>()).add(m);
            }

            for (Map.Entry<String, List<MethodDeclaration>> e : byCanon.entrySet()) {
                String canonicalName = e.getKey();
                String ifaceName = buildFunctionInterfaceName(s.fnIfacePrefix, canonicalName);

                String tmp = buildFunctionInterface(
                        s.fnPackageName, baseImports, ifaceName,
                        new FnKey(canonicalName),
                        e.getValue(),
                        null
                );
                List<MethodSig> sigs = parseInterfaceMethods(tmp);
                sigsByFnAndFlavor
                        .computeIfAbsent(canonicalName, k -> new EnumMap<>(Flavor.class))
                        .put(s.flavor, sigs);
            }
        }

        // 2) generate files per spec
        for (Spec s : specs) {
            String src = Files.readString(s.inputFile, StandardCharsets.UTF_8);
            CompilationUnit cu = StaticJavaParser.parse(src);

            String apiPkg = (s.apiPackageName != null && !s.apiPackageName.isBlank())
                    ? s.apiPackageName
                    : cu.getPackageDeclaration().map(pd -> pd.getName().asString()).orElse(null);

            Set<String> baseImports = cu.getImports().stream()
                    .map(i -> "import " + i.getNameAsString() + (i.isAsterisk() ? ".*" : "") + ";")
                    .collect(Collectors.toCollection(LinkedHashSet::new));
            if (s.delegateClassFqn != null && s.delegateClassFqn.contains(".")) {
                baseImports.add("import " + s.delegateClassFqn + ";");
            }
            if (s.baseApiInterfaceFqn != null && !s.baseApiInterfaceFqn.isBlank()) {
                baseImports.add("import " + s.baseApiInterfaceFqn + ";");
            }
            if (s.baseImplClassFqn != null && !s.baseImplClassFqn.isBlank()) {
                baseImports.add("import " + s.baseImplClassFqn + ";");
            }
            baseImports.add("import org.jetbrains.annotations.*;");

            List<MethodDeclaration> methods = cu.findAll(MethodDeclaration.class).stream()
                    .filter(m -> m.getNameAsString().matches("(?:n?gl)\\w+"))
                    .filter(m -> m.getModifiers().stream().anyMatch(md -> md.getKeyword() == Modifier.Keyword.PUBLIC))
                    .collect(Collectors.toList());

            Map<FnKey, List<MethodDeclaration>> groups = new LinkedHashMap<>();
            for (MethodDeclaration m : methods) {
                String canonical = canonicalizeName(m.getNameAsString());
                groups.computeIfAbsent(new FnKey(canonical), k -> new ArrayList<>()).add(m);
            }

            List<FnIfaceRef> fnIfaceRefs = new ArrayList<>();

            for (Map.Entry<FnKey, List<MethodDeclaration>> e : groups.entrySet()) {
                String canonical = e.getKey().canonicalName();
                String baseName  = buildFunctionInterfaceName(s.fnIfacePrefix, canonical);
                String baseFqn   = s.fnPackageName + "." + baseName;

                Map<Flavor, List<MethodSig>> byFlavor = sigsByFnAndFlavor.getOrDefault(canonical, Map.of());
                List<MethodSig> coreSigs = byFlavor.getOrDefault(Flavor.GL_CORE, List.of());
                List<MethodSig> esSigs   = byFlavor.getOrDefault(Flavor.GLES, List.of());

                Set<MethodSig> common   = intersectBySignature(coreSigs, esSigs);
                Set<MethodSig> coreOnly = new LinkedHashSet<>(coreSigs); coreOnly.removeAll(common);
                Set<MethodSig> esOnly   = new LinkedHashSet<>(esSigs);   esOnly.removeAll(common);

                // special-case debug callback: typed variant stays flavor-only; base keeps only unsafe long version
                if ("glDebugMessageCallback".equals(canonical)) {
                    Set<MethodSig> typedInCommon = common.stream()
                            .filter(GlWrapperAstGen::isTypedDebugCallbackSig)
                            .collect(Collectors.toCollection(LinkedHashSet::new));
                    if (!typedInCommon.isEmpty()) {
                        common.removeAll(typedInCommon);
                        for (MethodSig ms : typedInCommon) {
                            if (coreSigs.contains(ms)) coreOnly.add(ms);
                            if (esSigs.contains(ms))   esOnly.add(ms);
                        }
                    }
                }

                boolean onlyCore = !coreOnly.isEmpty() && esSigs.isEmpty() && common.isEmpty();
                boolean onlyES   = !esOnly.isEmpty()  && coreSigs.isEmpty() && common.isEmpty();

                if (onlyCore) {
                    String subpkg = s.fnPackageName + ".gl";
                    String name   = baseName;
                    String code   = buildFunctionInterface(
                            subpkg, baseImports, name,
                            new FnKey(canonical),
                            filterOverloadsBySignatures(e.getValue(), coreOnly, baseImports),
                            null
                    );
                    writeJavaFile(s.tag, fnOutDir, subpkg, "", name, code, WriteKind.API_SIG_ONLY);
                    fnIfaceRefs.add(new FnIfaceRef(subpkg, name));
                    continue;
                }
                if (onlyES) {
                    String subpkg = s.fnPackageName + ".gles";
                    String name   = baseName;
                    String code   = buildFunctionInterface(
                            subpkg, baseImports, name,
                            new FnKey(canonical),
                            filterOverloadsBySignatures(e.getValue(), esOnly, baseImports),
                            null
                    );
                    writeJavaFile(s.tag, fnOutDir, subpkg, "", name, code, WriteKind.API_SIG_ONLY);
                    fnIfaceRefs.add(new FnIfaceRef(subpkg, name));
                    continue;
                }

                // base
                String baseCode = buildFunctionInterface(
                        s.fnPackageName, baseImports, baseName,
                        new FnKey(canonical),
                        filterOverloadsBySignatures(e.getValue(), common, baseImports),
                        null
                );
                writeJavaFile(s.tag, fnOutDir, s.fnPackageName, "", baseName, baseCode, WriteKind.API_SIG_ONLY);
                fnIfaceRefs.add(new FnIfaceRef(s.fnPackageName, baseName));

                // flavor-only children
                if (s.flavor == Flavor.GL_CORE && !coreOnly.isEmpty()) {
                    String subpkg = s.fnPackageName + ".gl";
                    String name   = baseName + "_CORE";
                    String code   = buildFunctionInterface(
                            subpkg, baseImports, name,
                            new FnKey(canonical),
                            filterOverloadsBySignatures(e.getValue(), coreOnly, baseImports),
                            baseFqn
                    );
                    writeJavaFile(s.tag, fnOutDir, subpkg, "", name, code, WriteKind.API_SIG_ONLY);
                    fnIfaceRefs.add(new FnIfaceRef(subpkg, name));
                }
                if (s.flavor == Flavor.GLES && !esOnly.isEmpty()) {
                    String subpkg = s.fnPackageName + ".gles";
                    String name   = baseName + "_ES";
                    String code   = buildFunctionInterface(
                            subpkg, baseImports, name,
                            new FnKey(canonical),
                            filterOverloadsBySignatures(e.getValue(), esOnly, baseImports),
                            baseFqn
                    );
                    writeJavaFile(s.tag, fnOutDir, subpkg, "", name, code, WriteKind.API_SIG_ONLY);
                    fnIfaceRefs.add(new FnIfaceRef(subpkg, name));
                }
            }

            String baseApiSimple = s.baseApiInterfaceFqn == null ? null
                    : s.baseApiInterfaceFqn.substring(s.baseApiInterfaceFqn.lastIndexOf('.') + 1);
            String baseImplSimple = s.baseImplClassFqn == null ? null
                    : s.baseImplClassFqn.substring(s.baseImplClassFqn.lastIndexOf('.') + 1);

            String apiIfaceCode = buildApiInterface(apiPkg, baseImports, s.apiInterfaceName, fnIfaceRefs, baseApiSimple);
            writeJavaFile(s.tag, outDir, apiPkg, s.fnPackageNameAlternative, s.apiInterfaceName, apiIfaceCode, WriteKind.API_SIG_ONLY);

            String implCode = buildImpl(apiPkg, baseImports, s.apiInterfaceName, s.implName, groups, s.delegateClassFqn, baseImplSimple);
            writeJavaFile(s.tag, outDir, apiPkg, s.fnPackageNameAlternative, s.implName, implCode, WriteKind.IMPL_FULL_TEXT);
        }
    }

    /* ------------------------------------------------------------------------------------------------
       Single-run (keine Schnittmengenoptimierung)
       ------------------------------------------------------------------------------------------------ */

    public static void generate(
            String GLVersionTag,
            Path inputFile,
            String apiInterfaceName,
            String implName,
            String delegateClassFqn,
            Path outDir,
            String apiPackageName,
            String fnPackageName,
            String fnPackageNameAlternative,
            Path fnOutDir,
            String fnIfacePrefix,
            String baseApiInterfaceFqn,
            String baseImplClassFqn,
            Flavor flavor
    ) throws IOException {

        String src = Files.readString(inputFile, StandardCharsets.UTF_8);
        CompilationUnit cu = StaticJavaParser.parse(src);

        String apiPkg = (apiPackageName != null && !apiPackageName.isBlank())
                ? apiPackageName
                : cu.getPackageDeclaration().map(pd -> pd.getName().asString()).orElse(null);

        if (fnPackageName == null || fnPackageName.isBlank()) {
            throw new IllegalArgumentException("fnPackageName must not be empty");
        }
        if (fnOutDir == null) fnOutDir = outDir;

        Set<String> baseImports = cu.getImports().stream()
                .map(i -> "import " + i.getNameAsString() + (i.isAsterisk() ? ".*" : "") + ";")
                .collect(Collectors.toCollection(LinkedHashSet::new));

        if (delegateClassFqn != null && delegateClassFqn.contains(".")) {
            baseImports.add("import " + delegateClassFqn + ";");
        }

        String baseApiSimple = null;
        if (baseApiInterfaceFqn != null && !baseApiInterfaceFqn.isBlank()) {
            baseApiSimple = baseApiInterfaceFqn.substring(baseApiInterfaceFqn.lastIndexOf('.') + 1);
            baseImports.add("import " + baseApiInterfaceFqn + ";");
        }
        String baseImplSimple = null;
        if (baseImplClassFqn != null && !baseImplClassFqn.isBlank()) {
            baseImplSimple = baseImplClassFqn.substring(baseImplClassFqn.lastIndexOf('.') + 1);
            baseImports.add("import " + baseImplClassFqn + ";");
        }

        baseImports.add("import org.jetbrains.annotations.*;");

        List<MethodDeclaration> methods = cu.findAll(MethodDeclaration.class).stream()
                .filter(m -> m.getNameAsString().matches("(?:n?gl)\\w+"))
                .filter(m -> m.getModifiers().stream().anyMatch(md -> md.getKeyword() == Modifier.Keyword.PUBLIC))
                .collect(Collectors.toList());

        if (methods.isEmpty()) {
            throw new IllegalStateException("Keine passenden GL-Methoden in: " + inputFile);
        }

        Map<FnKey, List<MethodDeclaration>> groups = new LinkedHashMap<>();
        for (MethodDeclaration m : methods) {
            String canonical = canonicalizeName(m.getNameAsString());
            groups.computeIfAbsent(new FnKey(canonical), k -> new ArrayList<>()).add(m);
        }

        List<FnIfaceRef> fnIfaceRefs = new ArrayList<>();

        for (Map.Entry<FnKey, List<MethodDeclaration>> e : groups.entrySet()) {
            FnKey fnKey = e.getKey();
            List<MethodDeclaration> allOverloads = e.getValue();

            String baseName   = buildFunctionInterfaceName(fnIfacePrefix, fnKey.canonicalName());
            String baseFqn    = fnPackageName + "." + baseName;
            Path   baseFile   = fnOutDir.resolve(fnPackageName.replace('.', '/')).resolve(baseName + ".java");

            String tmpIface = buildFunctionInterface(
                    fnPackageName, baseImports, baseName, fnKey, allOverloads, null
            );
            List<MethodSig> thisSigs = parseInterfaceMethods(tmpIface);

            List<MethodSig> baseSigs = Files.exists(baseFile)
                    ? parseInterfaceMethods(Files.readString(baseFile, StandardCharsets.UTF_8))
                    : List.of();

            if (baseSigs.isEmpty()) {
                String fnCodeBase = buildFunctionInterface(
                        fnPackageName, baseImports, baseName, fnKey,
                        filterOverloadsBySignatures(allOverloads, thisSigs, baseImports),
                        null
                );
                writeJavaFile(
                        GLVersionTag, fnOutDir, fnPackageName, "",
                        baseName, fnCodeBase, WriteKind.API_SIG_ONLY
                );
                fnIfaceRefs.add(new FnIfaceRef(fnPackageName, baseName));
                continue;
            }

            Set<MethodSig> common    = intersectBySignature(baseSigs, thisSigs);
            Set<MethodSig> baseOnly  = new LinkedHashSet<>(baseSigs); baseOnly.removeAll(common);
            Set<MethodSig> thisOnly  = new LinkedHashSet<>(thisSigs); thisOnly.removeAll(common);

            if ("glDebugMessageCallback".equals(fnKey.canonicalName())) {
                Set<MethodSig> typedInCommon = common.stream()
                        .filter(GlWrapperAstGen::isTypedDebugCallbackSig)
                        .collect(Collectors.toCollection(LinkedHashSet::new));
                if (!typedInCommon.isEmpty()) {
                    common.removeAll(typedInCommon);
                    for (MethodSig ms : typedInCommon) {
                        if (thisSigs.contains(ms)) thisOnly.add(ms);
                        if (baseSigs.contains(ms)) baseOnly.add(ms);
                    }
                }
            }

            String fnCodeBase = buildFunctionInterface(
                    fnPackageName, baseImports, baseName, fnKey,
                    filterOverloadsBySignatures(allOverloads, common, baseImports),
                    null
            );
            writeJavaFile(
                    GLVersionTag, fnOutDir, fnPackageName, "",
                    baseName, fnCodeBase, WriteKind.API_SIG_ONLY
            );
            fnIfaceRefs.add(new FnIfaceRef(fnPackageName, baseName));

            if (!thisOnly.isEmpty()) {
                String subpkgThis = fnPackageName + "." + flavorSubpkg(flavor);
                String nameThis   = baseName + suffix(flavor);
                String codeThis   = buildFunctionInterface(
                        subpkgThis, baseImports, nameThis, fnKey,
                        filterOverloadsBySignatures(allOverloads, thisOnly, baseImports),
                        baseFqn
                );
                writeJavaFile(
                        GLVersionTag, fnOutDir, subpkgThis, "",
                        nameThis, codeThis, WriteKind.API_SIG_ONLY
                );
                fnIfaceRefs.add(new FnIfaceRef(subpkgThis, nameThis));
            }

            if (!baseOnly.isEmpty()) {
                Flavor otherFlavor   = other(flavor);
                String subpkgOther   = fnPackageName + "." + flavorSubpkg(otherFlavor);
                String nameOther     = baseName + suffix(otherFlavor);
                String codeOther     = buildFunctionInterface(
                        subpkgOther, baseImports, nameOther, fnKey,
                        filterOverloadsBySignatures(allOverloads, baseOnly, baseImports),
                        baseFqn
                );
                writeJavaFile(
                        GLVersionTag, fnOutDir, subpkgOther, "",
                        nameOther, codeOther, WriteKind.API_SIG_ONLY
                );
            }
        }

        String apiIfaceCode = buildApiInterface(apiPkg, baseImports, apiInterfaceName, fnIfaceRefs, baseApiSimple);
        writeJavaFile(GLVersionTag, outDir, apiPkg, fnPackageNameAlternative, apiInterfaceName, apiIfaceCode, WriteKind.API_SIG_ONLY);

        String implCode = buildImpl(apiPkg, baseImports, apiInterfaceName, implName, groups, delegateClassFqn, baseImplSimple);
        writeJavaFile(GLVersionTag, outDir, apiPkg, fnPackageNameAlternative, implName, implCode, WriteKind.IMPL_FULL_TEXT);
    }

    /* ------------------------------------------------------------------------------------------------
       Function interface builder
       ------------------------------------------------------------------------------------------------ */

    private static String buildFunctionInterface(
            String pkg,
            Set<String> imports,
            String ifaceName,
            FnKey key,
            List<MethodDeclaration> overloads,
            String extendsBaseFqn
    ) {
        StringBuilder sb = new StringBuilder(16_384);
        if (pkg != null && !pkg.isBlank()) sb.append("package ").append(pkg).append(";\n\n");

        Set<String> localImports = new TreeSet<>(imports);
        String extendsSimple = null;
        if (extendsBaseFqn != null && !extendsBaseFqn.isBlank()) {
            extendsSimple = extendsBaseFqn.substring(extendsBaseFqn.lastIndexOf('.') + 1);
            localImports.add("import " + extendsBaseFqn + ";");
        }

        for (String imp : localImports) sb.append(imp).append('\n');
        if (!localImports.isEmpty()) sb.append('\n');

        sb.append("public interface ").append(ifaceName);
        if (extendsSimple != null) {
            sb.append(" extends ").append(extendsSimple);
        }
        sb.append(" {\n\n");

        for (MethodDeclaration m : overloads) {
            m.getJavadocComment().ifPresent((JavadocComment j) -> sb.append(j.toString()));
            sb.append(methodLevelAnnotationsToString(m, localImports));

            String ret = m.getType().toString();
            String params = paramsToString(m.getParameters(), localImports);
            String throwsStr = throwsToString(m.getThrownExceptions());

            sb.append("    public ")
                    .append(ret).append(' ')
                    .append(m.getNameAsString()).append('(').append(params).append(')')
                    .append(throwsStr.isEmpty() ? "" : " " + throwsStr)
                    .append(";\n\n");
        }

        sb.append("}\n");
        return sb.toString();
    }

    /* ------------------------------------------------------------------------------------------------
       API interface builder (injects external Javadoc header)
       ------------------------------------------------------------------------------------------------ */

    private static String buildApiInterface(String pkg, Set<String> baseImports, String apiInterfaceName,
                                            List<FnIfaceRef> fnIfaceRefs, String baseApiSimple) {
        StringBuilder sb = new StringBuilder(8_192);
        if (pkg != null && !pkg.isBlank()) sb.append("package ").append(pkg).append(";\n\n");

        Set<String> imports = new TreeSet<>(baseImports);
        for (FnIfaceRef ref : fnIfaceRefs) {
            imports.add("import " + ref.pkg + "." + ref.simpleName + ";");
        }
        for (String imp : imports) sb.append(imp).append('\n');
        if (!imports.isEmpty()) sb.append('\n');

        // try to load an external Javadoc from resources (/header/<name>.javadoc|.javdoc)
        String externalHeader = loadAccessorJavadocFromResources(apiInterfaceName);
        if (externalHeader != null && !externalHeader.isBlank()) {
            sb.append(externalHeader).append('\n');
        }

        sb.append("public interface ").append(apiInterfaceName);
        List<String> extendsList = new ArrayList<>();
        if (baseApiSimple != null) extendsList.add(baseApiSimple);
        extendsList.addAll(fnIfaceRefs.stream().map(r -> r.simpleName).toList());

        if (!extendsList.isEmpty()) {
            sb.append(" extends ").append(String.join(", ", extendsList));
        }
        sb.append(" {\n\n}\n");
        return sb.toString();
    }

    /* ------------------------------------------------------------------------------------------------
       Impl
       ------------------------------------------------------------------------------------------------ */

    private static String buildImpl(String pkg, Set<String> imports, String apiInterfaceName, String implName,
                                    Map<FnKey, List<MethodDeclaration>> groups, String delegateClassFqn,
                                    String baseImplSimple) {
        StringBuilder sb = new StringBuilder(24_576);
        if (pkg != null && !pkg.isBlank()) sb.append("package ").append(pkg).append(";\n\n");
        Set<String> localImports = new TreeSet<>(imports);
        for (String imp : localImports) sb.append(imp).append('\n');
        if (!localImports.isEmpty()) sb.append('\n');

        sb.append("public class ").append(implName);
        if (baseImplSimple != null) sb.append(" extends ").append(baseImplSimple);
        sb.append(" implements ").append(apiInterfaceName).append(" {\n\n");

        for (List<MethodDeclaration> overloads : groups.values()) {
            for (MethodDeclaration m : overloads) {
                sb.append(methodLevelAnnotationsToString(m, localImports));
                String ret = m.getType().toString();
                String name = m.getNameAsString();
                String params = paramsToString(m.getParameters(), localImports);
                String throwsStr = throwsToString(m.getThrownExceptions());

                sb.append("    @Override public ")
                        .append(ret).append(' ')
                        .append(name).append('(').append(params).append(')')
                        .append(throwsStr.isEmpty() ? "" : " " + throwsStr)
                        .append(" {\n");

                String delegateCall = delegateClassFqn + "." + name + "(" +
                        m.getParameters().stream().map(p -> p.getNameAsString()).collect(Collectors.joining(", ")) + ")";
                if (!"void".equals(ret)) {
                    sb.append("        return ").append(delegateCall).append(";\n");
                } else {
                    sb.append("        ").append(delegateCall).append(";\n");
                }
                sb.append("    }\n\n");
            }
        }

        sb.append("}\n");
        return sb.toString();
    }

    /* ------------------------------------------------------------------------------------------------
       Helpers
       ------------------------------------------------------------------------------------------------ */

    /** Load external Javadoc for accessor from classpath resources under /header/*. */
    private static String loadAccessorJavadocFromResources(String accessorSimpleName) {
        if (accessorSimpleName == null || accessorSimpleName.isBlank()) return null;

        // name candidates: GL11Accessor, GL11, gl11
        List<String> nameCandidates = new ArrayList<>();
        nameCandidates.add(accessorSimpleName);

        if (accessorSimpleName.endsWith("Accessor") && accessorSimpleName.length() > "Accessor".length()) {
            String base = accessorSimpleName.substring(0, accessorSimpleName.length() - "Accessor".length());
            nameCandidates.add(base);
            nameCandidates.add(base.toLowerCase(Locale.ROOT));
        } else {
            nameCandidates.add(accessorSimpleName.toLowerCase(Locale.ROOT));
        }

        // 1) classpath lookup
        for (String n : nameCandidates) {
            for (String pattern : ACCESSOR_HEADER_RESOURCE_PATTERNS) {
                String resPath = String.format(pattern, n);
                try (InputStream is = GlWrapperAstGen.class.getResourceAsStream(resPath)) {
                    if (is != null) {
                        String raw = new String(is.readAllBytes(), StandardCharsets.UTF_8).trim();
                        if (raw.isEmpty()) return null;
                        if (raw.startsWith("/**")) return raw;
                        return wrapAsJavadoc(raw);
                    }
                } catch (IOException ignored) {}
            }
        }

        // 2) filesystem fallback (useful when running from sources without resources on classpath)
        Path resourcesRoot = Paths.get("src/main/resources");
        for (String n : nameCandidates) {
            for (String pattern : ACCESSOR_HEADER_RESOURCE_PATTERNS) {
                String rel = String.format(pattern, n);
                // pattern starts with "/header/..." → strip leading slash for resolve
                if (rel.startsWith("/")) rel = rel.substring(1);
                Path file = resourcesRoot.resolve(rel);
                try {
                    if (Files.exists(file)) {
                        String raw = Files.readString(file, StandardCharsets.UTF_8).trim();
                        if (raw.isEmpty()) return null;
                        if (raw.startsWith("/**")) return raw;
                        return wrapAsJavadoc(raw);
                    }
                } catch (IOException ignored) {}
            }
        }

        return null;
    }

    /** Wrap plain text into a valid Javadoc block. */
    private static String wrapAsJavadoc(String text) {
        String normalized = text.replace("\r\n", "\n");
        StringBuilder sb = new StringBuilder(normalized.length() + 64);
        sb.append("/**\n");
        for (String line : normalized.split("\n", -1)) {
            sb.append(" * ");
            sb.append(line.replace("*/", "*&#47;"));
            sb.append('\n');
        }
        sb.append(" */");
        return sb.toString();
    }

    /** Normalize 'nglXYZ' → 'glXYZ' */
    private static String canonicalizeName(String name) {
        if (name != null && name.startsWith("ngl") && name.length() > 3) {
            return "gl" + name.substring(3);
        }
        return name;
    }

    private static String buildFunctionInterfaceName(String prefix, String canonicalName) {
        return (prefix == null ? "" : prefix) + canonicalName;
    }

    private static String throwsToString(NodeList<ReferenceType> thrown) {
        if (thrown == null || thrown.isEmpty()) return "";
        return "throws " + thrown.stream().map(Type::toString).collect(Collectors.joining(", "));
    }

    private static List<String> transformAnnotations(NodeList<AnnotationExpr> anns, Set<String> importSink) {
        List<String> out = new ArrayList<>(anns.size());
        for (AnnotationExpr a : anns) {
            String simple = a.getName().getIdentifier();

/*            if ("NativeType".equals(simple)) {
                continue;
            }*/
            if ("Nullable".equals(simple)) {
                importSink.add("import " + JB_NULLABLE_FQN + ";");
                out.add("@Nullable");
                continue;
            }
            if ("NotNull".equals(simple) || "NonNull".equals(simple)) {
                importSink.add("import " + JB_NOTNULL_FQN + ";");
                out.add("@NotNull");
                continue;
            }
            out.add(a.toString());
        }
        return out;
    }

    private static String paramsToString(NodeList<Parameter> params, Set<String> importSink) {
        return params.stream().map(p -> {
            List<String> anns = transformAnnotations(p.getAnnotations(), importSink);
            String annStr = anns.isEmpty() ? "" : String.join(" ", anns) + " ";
            String type = p.getType().toString() + (p.isVarArgs() ? "..." : "");
            String name = p.getNameAsString();
            return annStr + type + " " + name;
        }).collect(Collectors.joining(", "));
    }

    private static String methodLevelAnnotationsToString(MethodDeclaration m, Set<String> importSink) {
        List<String> anns = transformAnnotations(m.getAnnotations(), importSink);
        return anns.isEmpty() ? "" : (String.join("\n", anns) + "\n");
    }

    // ---- signature model ----
    private static final class MethodSig {
        final String name;
        final String returnType;
        final List<String> paramTypes;
        MethodSig(String name, String returnType, List<String> paramTypes) {
            this.name = name;
            this.returnType = returnType;
            this.paramTypes = List.copyOf(paramTypes);
        }
        @Override public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof MethodSig m)) return false;
            return name.equals(m.name) && returnType.equals(m.returnType) && paramTypes.equals(m.paramTypes);
        }
        @Override public int hashCode() {
            return Objects.hash(name, returnType, paramTypes);
        }
    }

    private static String cleanType(String t) {
        String s = t;
        s = s.replaceAll("/\\*.*?\\*/", "");
        s = s.replaceAll("@\\w+(\\([^)]*\\))?\\s*", "");
        s = s.replaceAll("<[^>]*>", "");
        s = s.replace(" ...", "[]").replace("...", "[]");
        s = s.replaceAll("\\s+", " ").trim();
        return s;
    }

    private static boolean isPrimitiveOrArrayPrimitive(String s) {
        String base = s.replace("[]", "");
        return switch (base) {
            case "void","boolean","byte","short","int","long","char","float","double" -> true;
            default -> false;
        };
    }

    private static Map<String, String> importsToMap(Collection<String> importLines) {
        Map<String, String> m = new HashMap<>();
        for (String line : importLines) {
            String trim = line.trim();
            if (!trim.startsWith("import ")) continue;
            String fqn = trim.substring("import ".length(), trim.length() - 1).trim();
            if (fqn.endsWith(".*")) continue;
            int lastDot = fqn.lastIndexOf('.');
            if (lastDot > 0) {
                String simple = fqn.substring(lastDot + 1);
                m.put(simple, fqn);
            }
        }
        return m;
    }

    private static String resolveWithImports(String rawType, Map<String, String> importMap) {
        int arrayDims = 0;
        String base = rawType.trim();
        while (base.endsWith("[]")) {
            arrayDims++;
            base = base.substring(0, base.length() - 2).trim();
        }

        if (isPrimitiveOrArrayPrimitive(base)) {
            // keep
        } else if (base.contains(".")) {
            // already FQN
        } else {
            String fqn = importMap.get(base);
            if (fqn != null) base = fqn;
        }

        StringBuilder sb = new StringBuilder(base);
        for (int i = 0; i < arrayDims; i++) sb.append("[]");
        return sb.toString();
    }

    private static List<MethodSig> parseInterfaceMethods(String srcWithImports) {
        CompilationUnit cu = StaticJavaParser.parse(srcWithImports);
        Map<String, String> importMap = new HashMap<>();
        cu.getImports().forEach(i -> {
            if (!i.isAsterisk()) {
                String fqn = i.getNameAsString();
                String simple = fqn.substring(fqn.lastIndexOf('.') + 1);
                importMap.put(simple, fqn);
            }
        });

        List<MethodSig> out = new ArrayList<>();
        cu.findAll(MethodDeclaration.class).forEach(m -> {
            if (m.getBody().isPresent()) return;
            String name = canonicalizeName(m.getNameAsString());
            String ret  = resolveWithImports(cleanType(m.getType().toString()), importMap);
            List<String> params = m.getParameters().stream()
                    .map(p -> {
                        String tt = cleanType(p.getType().toString());
                        if (p.isVarArgs()) tt = tt + "[]";
                        return resolveWithImports(tt, importMap);
                    })
                    .collect(Collectors.toList());
            out.add(new MethodSig(name, ret, params));
        });
        return out;
    }

    private static Set<MethodSig> intersectBySignature(List<MethodSig> a, List<MethodSig> b) {
        Set<MethodSig> sa = new LinkedHashSet<>(a);
        Set<MethodSig> sb = new LinkedHashSet<>(b);
        sa.retainAll(sb);
        return sa;
    }

    private static List<MethodDeclaration> filterOverloadsBySignatures(List<MethodDeclaration> pool,
                                                                       Collection<MethodSig> sigs,
                                                                       Set<String> importLines) {
        Map<String, String> importMap = importsToMap(importLines);
        Set<MethodSig> set = new LinkedHashSet<>(sigs);
        List<MethodDeclaration> out = new ArrayList<>();
        for (MethodDeclaration m : pool) {
            MethodSig ms = new MethodSig(
                    canonicalizeName(m.getNameAsString()),
                    resolveWithImports(cleanType(m.getType().toString()), importMap),
                    m.getParameters().stream().map(p -> {
                        String tt = cleanType(p.getType().toString());
                        if (p.isVarArgs()) tt = tt + "[]";
                        return resolveWithImports(tt, importMap);
                    }).collect(Collectors.toList())
            );
            if (set.contains(ms)) out.add(m);
        }
        return out;
    }

    private static final Path LOG_FILE = Path.of("generated", "log.txt");

    private static WriteResult writeJavaFile(
            String GLVersionTag,
            Path outDir,
            String pkg,
            String altPkg,
            String simpleName,
            String content,
            WriteKind kind
    ) throws IOException {

        Path pkgDir = (pkg == null || pkg.isBlank()) ? outDir : outDir.resolve(pkg.replace('.', '/'));
        Files.createDirectories(pkgDir);
        Path targetFile = pkgDir.resolve(simpleName + ".java");

        if (Files.exists(targetFile)) {
            String existing = Files.readString(targetFile, StandardCharsets.UTF_8);

            boolean same;
            if (kind == WriteKind.API_SIG_ONLY) {
                List<MethodSig> a = parseInterfaceMethods(existing);
                List<MethodSig> b = parseInterfaceMethods(content);
                same = new LinkedHashSet<>(a).equals(new LinkedHashSet<>(b));
            } else {
                same = Objects.equals(existing, content);
            }

            if (same) {
                System.out.println("[GlWrapperAstGen] File unchanged: " + targetFile.toAbsolutePath());
                appendToLog("[UNCHANGED] " + targetFile.toAbsolutePath());
                return new WriteResult(pkg, simpleName);
            } else {
                if (kind == WriteKind.API_SIG_ONLY) {
                    if (altPkg == null || altPkg.isBlank()) {
                        System.out.println("[GlWrapperAstGen] Overwrite API: " + targetFile.toAbsolutePath());
                        appendToLog("[OVERWRITE-API] " + targetFile.toAbsolutePath());
                        Files.writeString(targetFile, content, StandardCharsets.UTF_8);
                        return new WriteResult(pkg, simpleName);
                    }
                    String renamed = content.replaceFirst(
                            "(?m)(public\\s+interface\\s+)" + Pattern.quote(simpleName) + "(\\b)",
                            "$1" + simpleName + GLVersionTag + "$2"
                    );
                    String relocated = setPackageDeclaration(renamed, altPkg);

                    Path altPkgDir = outDir.resolve(altPkg.replace('.', '/'));
                    Files.createDirectories(altPkgDir);
                    Path altFile = altPkgDir.resolve(simpleName + GLVersionTag + ".java");

                    System.out.println("[GlWrapperAstGen] API diff → write alt: " + altFile.toAbsolutePath());
                    appendToLog("=== MOVE-TO-ALT ===\n  from: " + targetFile.toAbsolutePath() + "\n  to:   " + altFile.toAbsolutePath() + "\n");

                    Files.writeString(altFile, relocated, StandardCharsets.UTF_8);
                    return new WriteResult(altPkg, simpleName + GLVersionTag);
                } else {
                    System.out.println("[GlWrapperAstGen] Overwrite impl: " + targetFile.toAbsolutePath());
                    appendToLog("[OVERWRITE] " + targetFile.toAbsolutePath());
                    Files.writeString(targetFile, content, StandardCharsets.UTF_8);
                    return new WriteResult(pkg, simpleName);
                }
            }
        }

        System.out.println("[GlWrapperAstGen] Generating new file: " + targetFile.toAbsolutePath());
        appendToLog("[NEW] " + targetFile.toAbsolutePath());
        Files.writeString(targetFile, content, StandardCharsets.UTF_8);
        return new WriteResult(pkg, simpleName);
    }

    private static String setPackageDeclaration(String source, String newPkg) {
        String src = source.replace("\r\n", "\n");
        String newDecl = (newPkg == null || newPkg.isBlank()) ? "" : "package " + newPkg + ";\n\n";
        Pattern p = Pattern.compile("(?m)^\\s*package\\s+([a-zA-Z0-9_.]+)\\s*;\\s*$");
        Matcher m = p.matcher(src);
        if (m.find()) {
            return m.replaceFirst(Matcher.quoteReplacement("package " + newPkg + ";"));
        }
        return newDecl + src;
    }

    private static void appendToLog(String text) {
        try {
            Files.createDirectories(LOG_FILE.getParent());
            Files.writeString(
                    LOG_FILE,
                    text + System.lineSeparator(),
                    StandardCharsets.UTF_8,
                    Files.exists(LOG_FILE) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE
            );
        } catch (IOException ignored) {}
    }

    private static String flavorSubpkg(Flavor flavor) {
        return (flavor == Flavor.GLES) ? "gles" : "gl";
    }

    private static String suffix(Flavor flavor) {
        return (flavor == Flavor.GLES) ? "_ES" : "_CORE";
    }

    private static Flavor other(Flavor f) {
        return f == Flavor.GLES ? Flavor.GL_CORE : Flavor.GLES;
    }

    /** true if signature uses typed debug callback interface (any package). */
    private static boolean isTypedDebugCallbackSig(MethodSig ms) {
        if (!"glDebugMessageCallback".equals(ms.name)) return false;
        for (String p : ms.paramTypes) {
            if (p.endsWith(".GLDebugMessageCallbackI") || p.equals("GLDebugMessageCallbackI")) {
                return true;
            }
        }
        return false;
    }
}
