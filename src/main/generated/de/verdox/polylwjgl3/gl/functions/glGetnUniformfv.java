package de.verdox.polylwjgl3.gl.functions;

import de.verdox.polylwjgl3.gl.accessor.gles31.GLES31Accessor;
import de.verdox.polylwjgl3.gl.accessor.gles31.GLES31AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengles.GLES32;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glGetnUniformfv {

/**
 * Unsafe version of: {@link #glGetnUniformfv GetnUniformfv}
 *
 * @param bufSize the maximum number of bytes to write to {@code params}
 */
    public void nglGetnUniformfv(int program, int location, int bufSize, long params);

/**
 * Returns the value or values of a uniform of the default uniform block.
 *
 * @param program  the program object
 * @param location the uniform location
 * @param params   the buffer in which to place the returned data
 *
 * @see <a href="https://docs.gl/es3/glGetUniform">Reference Page</a>
 */
    public void glGetnUniformfv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") FloatBuffer params);

/**
 * Array version of: {@link #glGetnUniformfv GetnUniformfv}
 *
 * @see <a href="https://docs.gl/es3/glGetUniform">Reference Page</a>
 */
    public void glGetnUniformfv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") float[] params);

}
