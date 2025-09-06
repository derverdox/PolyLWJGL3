package de.verdox.polylwjgl3;

import org.lwjgl.opengl.*;
import org.lwjgl.opengles.GLES20;
import org.lwjgl.opengles.GLES30;
import org.lwjgl.opengles.GLES31;
import org.lwjgl.opengles.GLES32;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class GenerateWrappers {
    private static final Path projectRoot = Paths.get("./src");
    private static final Path outDir = projectRoot.resolve("main/generated");
    private static final Path fnOutDir = outDir; // optional separater Ordner für Fn-Interfaces

    public static void main(String[] args) throws IOException {
        List<GlWrapperAstGen.Spec> specs = new ArrayList<>();

        // GLES zuerst
        add(specs, "GLES20", GLES20.class, null, GlWrapperAstGen.Flavor.GLES);
        add(specs, "GLES30", GLES30.class, "GLES20", GlWrapperAstGen.Flavor.GLES);
        add(specs, "GLES31", GLES31.class, "GLES30", GlWrapperAstGen.Flavor.GLES);
        add(specs, "GLES32", GLES32.class, "GLES31", GlWrapperAstGen.Flavor.GLES);

        // Danach GL Core
        add(specs, "GL11", GL11.class, null, GlWrapperAstGen.Flavor.GL_CORE);
        add(specs, "GL12", GL12.class, "GL11", GlWrapperAstGen.Flavor.GL_CORE);
        add(specs, "GL13", GL13.class, "GL12", GlWrapperAstGen.Flavor.GL_CORE);
        add(specs, "GL14", GL14.class, "GL13", GlWrapperAstGen.Flavor.GL_CORE);
        add(specs, "GL15", GL15.class, "GL14", GlWrapperAstGen.Flavor.GL_CORE);

        add(specs, "GL20", GL20.class, "GL15", GlWrapperAstGen.Flavor.GL_CORE);
        add(specs, "GL21", GL21.class, "GL20", GlWrapperAstGen.Flavor.GL_CORE);

        add(specs, "GL30", GL30.class, "GL21", GlWrapperAstGen.Flavor.GL_CORE);
        add(specs, "GL31", GL31.class, "GL30", GlWrapperAstGen.Flavor.GL_CORE);
        add(specs, "GL32", GL32.class, "GL31", GlWrapperAstGen.Flavor.GL_CORE);
        add(specs, "GL33", GL33.class, "GL32", GlWrapperAstGen.Flavor.GL_CORE);

        add(specs, "GL40", GL40.class, "GL33", GlWrapperAstGen.Flavor.GL_CORE);
        add(specs, "GL41", GL41.class, "GL40", GlWrapperAstGen.Flavor.GL_CORE);
        add(specs, "GL42", GL42.class, "GL41", GlWrapperAstGen.Flavor.GL_CORE);
        add(specs, "GL43", GL43.class, "GL42", GlWrapperAstGen.Flavor.GL_CORE);
        add(specs, "GL44", GL44.class, "GL43", GlWrapperAstGen.Flavor.GL_CORE);
        add(specs, "GL45", GL45.class, "GL44", GlWrapperAstGen.Flavor.GL_CORE);
        add(specs, "GL46", GL46.class, "GL45", GlWrapperAstGen.Flavor.GL_CORE);

        GlWrapperAstGen.generateAll(specs, outDir, fnOutDir);
    }

    private static void add(List<GlWrapperAstGen.Spec> specs,
                            String tag,
                            Class<?> callerClass,
                            String parentTag,
                            GlWrapperAstGen.Flavor flavor) {
        String apiPkg = "de.verdox.polylwjgl3.gl.accessor." + tag.toLowerCase();
        String fnPkg  = "de.verdox.polylwjgl3.gl.functions";
        String altFnPkg = fnPkg + "." + tag.toLowerCase(); // nur falls du die Alt-Ablage weiterhin brauchst

        String baseApiFqn  = parentTag == null ? null : "de.verdox.polylwjgl3.gl.accessor." + parentTag.toLowerCase() + "." + parentTag + "Accessor";
        String baseImplFqn = parentTag == null ? null : "de.verdox.polylwjgl3.gl.accessor." + parentTag.toLowerCase() + "." + parentTag + "AccessorImpl";

        specs.add(new GlWrapperAstGen.Spec(
                tag,
                Path.of("input/" + tag + ".java"),
                tag + "Accessor",
                tag + "AccessorImpl",
                callerClass.getName(),
                apiPkg,
                fnPkg,
                altFnPkg,
                "",                 // fnIfacePrefix (leer lassen)
                baseApiFqn,
                baseImplFqn,
                flavor
        ));
    }
}
