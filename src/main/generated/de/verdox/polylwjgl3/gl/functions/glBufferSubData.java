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

public interface glBufferSubData {

    public void nglBufferSubData(int target, long offset, long size, long data);

/**
 * <a href="https://docs.gl/es3/glBufferSubData">Reference Page</a>
 */
    public void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") ByteBuffer data);

/**
 * <a href="https://docs.gl/es3/glBufferSubData">Reference Page</a>
 */
    public void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") ShortBuffer data);

/**
 * <a href="https://docs.gl/es3/glBufferSubData">Reference Page</a>
 */
    public void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") IntBuffer data);

/**
 * <a href="https://docs.gl/es3/glBufferSubData">Reference Page</a>
 */
    public void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") FloatBuffer data);

/**
 * Array version of: {@link #glBufferSubData BufferSubData}
 *
 * @see <a href="https://docs.gl/es3/glBufferSubData">Reference Page</a>
 */
    public void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") short[] data);

/**
 * Array version of: {@link #glBufferSubData BufferSubData}
 *
 * @see <a href="https://docs.gl/es3/glBufferSubData">Reference Page</a>
 */
    public void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") int[] data);

/**
 * Array version of: {@link #glBufferSubData BufferSubData}
 *
 * @see <a href="https://docs.gl/es3/glBufferSubData">Reference Page</a>
 */
    public void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") float[] data);

}
