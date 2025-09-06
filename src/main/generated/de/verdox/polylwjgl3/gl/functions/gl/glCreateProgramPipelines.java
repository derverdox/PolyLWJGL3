package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl44.GL44Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl44.GL44AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL45;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glCreateProgramPipelines {

/**
 * Unsafe version of: {@link #glCreateProgramPipelines CreateProgramPipelines}
 *
 * @param n the number of program pipeline names to create
 */
    public void nglCreateProgramPipelines(int n, long pipelines);

/**
 * Returns {@code n} previously unused program pipeline names in {@code pipelines}, each representing a new program pipeline object.
 *
 * @param pipelines the buffer in which to return the created program pipeline names
 *
 * @see <a href="https://docs.gl/gl4/glCreateProgramPipelines">Reference Page</a>
 */
    public void glCreateProgramPipelines(@NativeType("GLuint *") IntBuffer pipelines);

/**
 * Returns {@code n} previously unused program pipeline names in {@code pipelines}, each representing a new program pipeline object.
 *
 * @see <a href="https://docs.gl/gl4/glCreateProgramPipelines">Reference Page</a>
 */
@NativeType("void")
    public int glCreateProgramPipelines();

/**
 * Array version of: {@link #glCreateProgramPipelines CreateProgramPipelines}
 *
 * @see <a href="https://docs.gl/gl4/glCreateProgramPipelines">Reference Page</a>
 */
    public void glCreateProgramPipelines(@NativeType("GLuint *") int[] pipelines);

}
