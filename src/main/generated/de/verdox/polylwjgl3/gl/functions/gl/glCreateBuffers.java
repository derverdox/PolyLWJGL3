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

public interface glCreateBuffers {

/**
 * Unsafe version of: {@link #glCreateBuffers CreateBuffers}
 *
 * @param n the number of buffer names to create
 */
    public void nglCreateBuffers(int n, long buffers);

/**
 * Returns {@code n} previously unused buffer names in {@code buffers}, each representing a new buffer object initialized as if it had been bound to an
 * unspecified target.
 *
 * @param buffers the buffer in which to return the names
 *
 * @see <a href="https://docs.gl/gl4/glCreateBuffers">Reference Page</a>
 */
    public void glCreateBuffers(@NativeType("GLuint *") IntBuffer buffers);

/**
 * Returns {@code n} previously unused buffer names in {@code buffers}, each representing a new buffer object initialized as if it had been bound to an
 * unspecified target.
 *
 * @see <a href="https://docs.gl/gl4/glCreateBuffers">Reference Page</a>
 */
@NativeType("void")
    public int glCreateBuffers();

/**
 * Array version of: {@link #glCreateBuffers CreateBuffers}
 *
 * @see <a href="https://docs.gl/gl4/glCreateBuffers">Reference Page</a>
 */
    public void glCreateBuffers(@NativeType("GLuint *") int[] buffers);

}
