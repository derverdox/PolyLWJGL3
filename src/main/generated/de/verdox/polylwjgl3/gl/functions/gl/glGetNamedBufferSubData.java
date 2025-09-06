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

public interface glGetNamedBufferSubData {

/**
 * Unsafe version of: {@link #glGetNamedBufferSubData GetNamedBufferSubData}
 *
 * @param size the size in bytes of the data store region being returned
 */
    public void nglGetNamedBufferSubData(int buffer, long offset, long size, long data);

/**
 * DSA version of {@link GL15C#glGetBufferSubData GetBufferSubData}.
 *
 * @param buffer the buffer object name
 * @param offset the offset into the buffer object's data store from which data will be returned, measured in bytes
 * @param data   a pointer to the location where buffer object data is returned
 *
 * @see <a href="https://docs.gl/gl4/glGetBufferSubData">Reference Page</a>
 */
    public void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") ByteBuffer data);

/**
 * DSA version of {@link GL15C#glGetBufferSubData GetBufferSubData}.
 *
 * @param buffer the buffer object name
 * @param offset the offset into the buffer object's data store from which data will be returned, measured in bytes
 * @param data   a pointer to the location where buffer object data is returned
 *
 * @see <a href="https://docs.gl/gl4/glGetBufferSubData">Reference Page</a>
 */
    public void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") ShortBuffer data);

/**
 * DSA version of {@link GL15C#glGetBufferSubData GetBufferSubData}.
 *
 * @param buffer the buffer object name
 * @param offset the offset into the buffer object's data store from which data will be returned, measured in bytes
 * @param data   a pointer to the location where buffer object data is returned
 *
 * @see <a href="https://docs.gl/gl4/glGetBufferSubData">Reference Page</a>
 */
    public void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") IntBuffer data);

/**
 * DSA version of {@link GL15C#glGetBufferSubData GetBufferSubData}.
 *
 * @param buffer the buffer object name
 * @param offset the offset into the buffer object's data store from which data will be returned, measured in bytes
 * @param data   a pointer to the location where buffer object data is returned
 *
 * @see <a href="https://docs.gl/gl4/glGetBufferSubData">Reference Page</a>
 */
    public void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") LongBuffer data);

/**
 * DSA version of {@link GL15C#glGetBufferSubData GetBufferSubData}.
 *
 * @param buffer the buffer object name
 * @param offset the offset into the buffer object's data store from which data will be returned, measured in bytes
 * @param data   a pointer to the location where buffer object data is returned
 *
 * @see <a href="https://docs.gl/gl4/glGetBufferSubData">Reference Page</a>
 */
    public void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") FloatBuffer data);

/**
 * DSA version of {@link GL15C#glGetBufferSubData GetBufferSubData}.
 *
 * @param buffer the buffer object name
 * @param offset the offset into the buffer object's data store from which data will be returned, measured in bytes
 * @param data   a pointer to the location where buffer object data is returned
 *
 * @see <a href="https://docs.gl/gl4/glGetBufferSubData">Reference Page</a>
 */
    public void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") DoubleBuffer data);

/**
 * Array version of: {@link #glGetNamedBufferSubData GetNamedBufferSubData}
 *
 * @see <a href="https://docs.gl/gl4/glGetBufferSubData">Reference Page</a>
 */
    public void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") short[] data);

/**
 * Array version of: {@link #glGetNamedBufferSubData GetNamedBufferSubData}
 *
 * @see <a href="https://docs.gl/gl4/glGetBufferSubData">Reference Page</a>
 */
    public void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") int[] data);

/**
 * Array version of: {@link #glGetNamedBufferSubData GetNamedBufferSubData}
 *
 * @see <a href="https://docs.gl/gl4/glGetBufferSubData">Reference Page</a>
 */
    public void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") long[] data);

/**
 * Array version of: {@link #glGetNamedBufferSubData GetNamedBufferSubData}
 *
 * @see <a href="https://docs.gl/gl4/glGetBufferSubData">Reference Page</a>
 */
    public void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") float[] data);

/**
 * Array version of: {@link #glGetNamedBufferSubData GetNamedBufferSubData}
 *
 * @see <a href="https://docs.gl/gl4/glGetBufferSubData">Reference Page</a>
 */
    public void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") double[] data);

}
