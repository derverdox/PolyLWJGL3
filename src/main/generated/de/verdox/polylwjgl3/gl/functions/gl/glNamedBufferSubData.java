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

public interface glNamedBufferSubData {

/**
 * Unsafe version of: {@link #glNamedBufferSubData NamedBufferSubData}
 *
 * @param size the size in bytes of the data store region being replaced
 */
    public void nglNamedBufferSubData(int buffer, long offset, long size, long data);

/**
 * DSA version of {@link GL15C#glBufferSubData BufferSubData}.
 *
 * @param offset the offset into the buffer object's data store where data replacement will begin, measured in bytes
 * @param data   a pointer to the new data that will be copied into the data store
 *
 * @see <a href="https://docs.gl/gl4/glBufferSubData">Reference Page</a>
 */
    public void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") ByteBuffer data);

/**
 * DSA version of {@link GL15C#glBufferSubData BufferSubData}.
 *
 * @param offset the offset into the buffer object's data store where data replacement will begin, measured in bytes
 * @param data   a pointer to the new data that will be copied into the data store
 *
 * @see <a href="https://docs.gl/gl4/glBufferSubData">Reference Page</a>
 */
    public void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") ShortBuffer data);

/**
 * DSA version of {@link GL15C#glBufferSubData BufferSubData}.
 *
 * @param offset the offset into the buffer object's data store where data replacement will begin, measured in bytes
 * @param data   a pointer to the new data that will be copied into the data store
 *
 * @see <a href="https://docs.gl/gl4/glBufferSubData">Reference Page</a>
 */
    public void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") IntBuffer data);

/**
 * DSA version of {@link GL15C#glBufferSubData BufferSubData}.
 *
 * @param offset the offset into the buffer object's data store where data replacement will begin, measured in bytes
 * @param data   a pointer to the new data that will be copied into the data store
 *
 * @see <a href="https://docs.gl/gl4/glBufferSubData">Reference Page</a>
 */
    public void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") LongBuffer data);

/**
 * DSA version of {@link GL15C#glBufferSubData BufferSubData}.
 *
 * @param offset the offset into the buffer object's data store where data replacement will begin, measured in bytes
 * @param data   a pointer to the new data that will be copied into the data store
 *
 * @see <a href="https://docs.gl/gl4/glBufferSubData">Reference Page</a>
 */
    public void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") FloatBuffer data);

/**
 * DSA version of {@link GL15C#glBufferSubData BufferSubData}.
 *
 * @param offset the offset into the buffer object's data store where data replacement will begin, measured in bytes
 * @param data   a pointer to the new data that will be copied into the data store
 *
 * @see <a href="https://docs.gl/gl4/glBufferSubData">Reference Page</a>
 */
    public void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") DoubleBuffer data);

/**
 * Array version of: {@link #glNamedBufferSubData NamedBufferSubData}
 *
 * @see <a href="https://docs.gl/gl4/glBufferSubData">Reference Page</a>
 */
    public void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") short[] data);

/**
 * Array version of: {@link #glNamedBufferSubData NamedBufferSubData}
 *
 * @see <a href="https://docs.gl/gl4/glBufferSubData">Reference Page</a>
 */
    public void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") int[] data);

/**
 * Array version of: {@link #glNamedBufferSubData NamedBufferSubData}
 *
 * @see <a href="https://docs.gl/gl4/glBufferSubData">Reference Page</a>
 */
    public void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") long[] data);

/**
 * Array version of: {@link #glNamedBufferSubData NamedBufferSubData}
 *
 * @see <a href="https://docs.gl/gl4/glBufferSubData">Reference Page</a>
 */
    public void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") float[] data);

/**
 * Array version of: {@link #glNamedBufferSubData NamedBufferSubData}
 *
 * @see <a href="https://docs.gl/gl4/glBufferSubData">Reference Page</a>
 */
    public void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") double[] data);

}
