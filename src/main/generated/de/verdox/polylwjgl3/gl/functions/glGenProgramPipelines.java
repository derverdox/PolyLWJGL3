package de.verdox.polylwjgl3.gl.functions;

import de.verdox.polylwjgl3.gl.accessor.gles30.GLES30Accessor;
import de.verdox.polylwjgl3.gl.accessor.gles30.GLES30AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengles.GLES31;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glGenProgramPipelines {

    public void nglGenProgramPipelines(int n, long pipelines);

/**
 * <a href="https://docs.gl/es3/glGenProgramPipelines">Reference Page</a>
 */
    public void glGenProgramPipelines(IntBuffer pipelines);

/**
 * <a href="https://docs.gl/es3/glGenProgramPipelines">Reference Page</a>
 */
    public int glGenProgramPipelines();

/**
 * Array version of: {@link #glGenProgramPipelines GenProgramPipelines}
 *
 * @see <a href="https://docs.gl/es3/glGenProgramPipelines">Reference Page</a>
 */
    public void glGenProgramPipelines(int[] pipelines);

}
