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

public interface glBufferData {

    public void nglBufferData(int target, long size, long data, int usage);

/**
 * <a href="https://docs.gl/es3/glBufferData">Reference Page</a>
 */
    public void glBufferData(@NativeType("GLenum") int target, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int usage);

/**
 * <a href="https://docs.gl/es3/glBufferData">Reference Page</a>
 */
    public void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") ByteBuffer data, @NativeType("GLenum") int usage);

/**
 * <a href="https://docs.gl/es3/glBufferData">Reference Page</a>
 */
    public void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") ShortBuffer data, @NativeType("GLenum") int usage);

/**
 * <a href="https://docs.gl/es3/glBufferData">Reference Page</a>
 */
    public void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") IntBuffer data, @NativeType("GLenum") int usage);

/**
 * <a href="https://docs.gl/es3/glBufferData">Reference Page</a>
 */
    public void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") FloatBuffer data, @NativeType("GLenum") int usage);

/**
 * Array version of: {@link #glBufferData BufferData}
 *
 * @see <a href="https://docs.gl/es3/glBufferData">Reference Page</a>
 */
    public void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") short[] data, @NativeType("GLenum") int usage);

/**
 * Array version of: {@link #glBufferData BufferData}
 *
 * @see <a href="https://docs.gl/es3/glBufferData">Reference Page</a>
 */
    public void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") int[] data, @NativeType("GLenum") int usage);

/**
 * Array version of: {@link #glBufferData BufferData}
 *
 * @see <a href="https://docs.gl/es3/glBufferData">Reference Page</a>
 */
    public void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") float[] data, @NativeType("GLenum") int usage);

}
