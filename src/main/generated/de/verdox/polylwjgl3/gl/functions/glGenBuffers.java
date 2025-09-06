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

public interface glGenBuffers {

    public void nglGenBuffers(int n, long buffers);

/**
 * <a href="https://docs.gl/es3/glGenBuffers">Reference Page</a>
 */
    public void glGenBuffers(@NativeType("GLuint *") IntBuffer buffers);

/**
 * <a href="https://docs.gl/es3/glGenBuffers">Reference Page</a>
 */
@NativeType("void")
    public int glGenBuffers();

/**
 * Array version of: {@link #glGenBuffers GenBuffers}
 *
 * @see <a href="https://docs.gl/es3/glGenBuffers">Reference Page</a>
 */
    public void glGenBuffers(@NativeType("GLuint *") int[] buffers);

}
