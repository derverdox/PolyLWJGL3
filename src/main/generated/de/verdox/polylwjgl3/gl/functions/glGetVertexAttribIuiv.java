package de.verdox.polylwjgl3.gl.functions;

import de.verdox.polylwjgl3.gl.accessor.gles20.GLES20Accessor;
import de.verdox.polylwjgl3.gl.accessor.gles20.GLES20AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengles.GLES30;
import org.lwjgl.system.*;
import org.lwjgl.system.APIUtil.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glGetVertexAttribIuiv {

    public void nglGetVertexAttribIuiv(int index, int pname, long params);

/**
 * <a href="https://docs.gl/es3/glGetVertexAttrib">Reference Page</a>
 */
    public void glGetVertexAttribIuiv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params);

/**
 * Array version of: {@link #glGetVertexAttribIuiv GetVertexAttribIuiv}
 *
 * @see <a href="https://docs.gl/es3/glGetVertexAttrib">Reference Page</a>
 */
    public void glGetVertexAttribIuiv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params);

}
