package de.verdox.polylwjgl3.gl.functions;

import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengles.GLES20;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glDeleteBuffers {

    public void nglDeleteBuffers(int n, long buffers);

/**
 * <a href="https://docs.gl/es3/glDeleteBuffers">Reference Page</a>
 */
    public void glDeleteBuffers(@NativeType("GLuint const *") IntBuffer buffers);

/**
 * <a href="https://docs.gl/es3/glDeleteBuffers">Reference Page</a>
 */
    public void glDeleteBuffers(@NativeType("GLuint const *") int buffer);

/**
 * Array version of: {@link #glDeleteBuffers DeleteBuffers}
 *
 * @see <a href="https://docs.gl/es3/glDeleteBuffers">Reference Page</a>
 */
    public void glDeleteBuffers(@NativeType("GLuint const *") int[] buffers);

}
