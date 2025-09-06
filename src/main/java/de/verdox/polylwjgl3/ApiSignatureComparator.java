package de.verdox.polylwjgl3;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParserConfiguration;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.*;
import com.github.javaparser.ast.type.Type;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

/** Vergleich nur der öffentlichen Methodensignaturen zweier .java-Quellen. */
public final class ApiSignatureComparator {

    private static final ParserConfiguration PARSER_CFG = new ParserConfiguration()
            .setLanguageLevel(ParserConfiguration.LanguageLevel.JAVA_17);

    private final boolean unifyGLandNGLNames;
    private final JavaParser jp = new JavaParser(PARSER_CFG);

    ApiSignatureComparator(boolean unifyGLandNGLNames) {
        this.unifyGLandNGLNames = unifyGLandNGLNames;
    }

    public MethodDiff compareApis(String oldSource, String newSource) {
        Set<MethodSig> oldSigs = extractPublicMethodSigs(oldSource);
        Set<MethodSig> newSigs = extractPublicMethodSigs(newSource);

        Set<MethodSig> added = new HashSet<>(newSigs);
        added.removeAll(oldSigs);

        Set<MethodSig> removed = new HashSet<>(oldSigs);
        removed.removeAll(newSigs);

        Set<String> changed = findReturnTypeChanges(oldSigs, newSigs);

        return new MethodDiff(added, removed, changed);
    }

    private Set<MethodSig> extractPublicMethodSigs(String source) {
        CompilationUnit cu = jp.parse(source).getResult()
                .orElseThrow(() -> new IllegalArgumentException("Parse failed"));
        Set<MethodSig> out = new LinkedHashSet<>();
        for (TypeDeclaration<?> td : cu.getTypes()) {
            collect(td, out);
        }
        return out;
    }

    private void collect(TypeDeclaration<?> td, Set<MethodSig> sink) {
        for (MethodDeclaration m : td.getMethods()) {
            if (!m.isPublic()) continue;
            String name = normalizeMethodName(m.getNameAsString());
            String ret = normalizeType(m.getType());
            List<String> params = m.getParameters().stream()
                    .map(p -> normalizeType(p.getType()))
                    .collect(Collectors.toList());
            sink.add(new MethodSig(name, ret, params));
        }
        for (BodyDeclaration<?> b : td.getMembers()) {
            if (b instanceof TypeDeclaration<?> inner) {
                collect(inner, sink);
            }
        }
    }

    private String normalizeMethodName(String raw) {
        if (!unifyGLandNGLNames) return raw;
        if (raw.startsWith("ngl") && raw.length() > 3 && Character.isUpperCase(raw.charAt(3))) {
            return "gl" + raw.substring(3);
        }
        return raw;
    }

    private String normalizeType(Type t) {
        String s = t.toString();
        s = s.replace("\r\n", "\n").replace("\n", " ").trim();
        s = s.replaceAll("\\s+", " ");
        s = s.replaceAll("@\\w+(\\([^)]*\\))?\\s*", "");
        s = s.replace("...", "[]");
        return s;
    }

    private Set<String> findReturnTypeChanges(Set<MethodSig> oldSigs, Set<MethodSig> newSigs) {
        Map<String, String> oldMap = byNameAndParams(oldSigs);
        Map<String, String> newMap = byNameAndParams(newSigs);
        Set<String> out = new LinkedHashSet<>();
        for (Map.Entry<String, String> e : oldMap.entrySet()) {
            String key = e.getKey();
            String oldRet = e.getValue();
            String newRet = newMap.get(key);
            if (newRet != null && !newRet.equals(oldRet)) {
                out.add(key + " : " + oldRet + " -> " + newRet);
            }
        }
        return out;
    }

    private Map<String, String> byNameAndParams(Set<MethodSig> sigs) {
        Map<String, String> map = new LinkedHashMap<>();
        for (MethodSig m : sigs) {
            String key = m.name + "(" + String.join(",", m.paramTypes) + ")";
            map.put(key, m.returnType);
        }
        return map;
    }

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
        @Override public int hashCode() { return Objects.hash(name, returnType, paramTypes); }
        @Override public String toString() { return returnType + " " + name + "(" + String.join(", ", paramTypes) + ")"; }
    }

    public static final class MethodDiff {
        final Set<MethodSig> added;
        final Set<MethodSig> removed;
        final Set<String> changedReturnType;

        MethodDiff(Set<MethodSig> added, Set<MethodSig> removed, Set<String> changedReturnType) {
            this.added = added;
            this.removed = removed;
            this.changedReturnType = changedReturnType;
        }

        boolean isEmpty() {
            return added.isEmpty() && removed.isEmpty() && changedReturnType.isEmpty();
        }

        @Override public String toString() {
            StringBuilder sb = new StringBuilder();
            if (!added.isEmpty()) {
                sb.append("ADDED:\n");
                added.forEach(m -> sb.append("  + ").append(m).append('\n'));
            }
            if (!removed.isEmpty()) {
                sb.append("REMOVED:\n");
                removed.forEach(m -> sb.append("  - ").append(m).append('\n'));
            }
            if (!changedReturnType.isEmpty()) {
                sb.append("CHANGED RETURN TYPE:\n");
                changedReturnType.forEach(s -> sb.append("  ~ ").append(s).append('\n'));
            }
            return sb.toString();
        }
    }
}
