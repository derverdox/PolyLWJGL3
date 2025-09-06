package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl14.GL14Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl14.GL14AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL15;
import org.lwjgl.system.*;

public interface glGetBufferSubData {

/**
 * Unsafe version of: {@link #glGetBufferSubData GetBufferSubData}
 *
 * @param size the size in bytes of the data store region being returned
 */
    public void nglGetBufferSubData(int target, long offset, long size, long data);

/**
 * Returns a subset of a buffer object's data store.
 *
 * @param target the target buffer object. One of:<br><table><tr><td>{@link GL15C#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15C#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
 * @param offset the offset into the buffer object's data store from which data will be returned, measured in bytes
 * @param data   a pointer to the location where buffer object data is returned
 *
 * @see <a href="https://docs.gl/gl4/glGetBufferSubData">Reference Page</a>
 */
    public void glGetBufferSubData(int target, long offset, ByteBuffer data);

/**
 * Returns a subset of a buffer object's data store.
 *
 * @param target the target buffer object. One of:<br><table><tr><td>{@link GL15C#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15C#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
 * @param offset the offset into the buffer object's data store from which data will be returned, measured in bytes
 * @param data   a pointer to the location where buffer object data is returned
 *
 * @see <a href="https://docs.gl/gl4/glGetBufferSubData">Reference Page</a>
 */
    public void glGetBufferSubData(int target, long offset, ShortBuffer data);

/**
 * Returns a subset of a buffer object's data store.
 *
 * @param target the target buffer object. One of:<br><table><tr><td>{@link GL15C#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15C#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
 * @param offset the offset into the buffer object's data store from which data will be returned, measured in bytes
 * @param data   a pointer to the location where buffer object data is returned
 *
 * @see <a href="https://docs.gl/gl4/glGetBufferSubData">Reference Page</a>
 */
    public void glGetBufferSubData(int target, long offset, IntBuffer data);

/**
 * Returns a subset of a buffer object's data store.
 *
 * @param target the target buffer object. One of:<br><table><tr><td>{@link GL15C#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15C#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
 * @param offset the offset into the buffer object's data store from which data will be returned, measured in bytes
 * @param data   a pointer to the location where buffer object data is returned
 *
 * @see <a href="https://docs.gl/gl4/glGetBufferSubData">Reference Page</a>
 */
    public void glGetBufferSubData(int target, long offset, LongBuffer data);

/**
 * Returns a subset of a buffer object's data store.
 *
 * @param target the target buffer object. One of:<br><table><tr><td>{@link GL15C#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15C#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
 * @param offset the offset into the buffer object's data store from which data will be returned, measured in bytes
 * @param data   a pointer to the location where buffer object data is returned
 *
 * @see <a href="https://docs.gl/gl4/glGetBufferSubData">Reference Page</a>
 */
    public void glGetBufferSubData(int target, long offset, FloatBuffer data);

/**
 * Returns a subset of a buffer object's data store.
 *
 * @param target the target buffer object. One of:<br><table><tr><td>{@link GL15C#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15C#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
 * @param offset the offset into the buffer object's data store from which data will be returned, measured in bytes
 * @param data   a pointer to the location where buffer object data is returned
 *
 * @see <a href="https://docs.gl/gl4/glGetBufferSubData">Reference Page</a>
 */
    public void glGetBufferSubData(int target, long offset, DoubleBuffer data);

/**
 * Array version of: {@link #glGetBufferSubData GetBufferSubData}
 *
 * @see <a href="https://docs.gl/gl4/glGetBufferSubData">Reference Page</a>
 */
    public void glGetBufferSubData(int target, long offset, short[] data);

/**
 * Array version of: {@link #glGetBufferSubData GetBufferSubData}
 *
 * @see <a href="https://docs.gl/gl4/glGetBufferSubData">Reference Page</a>
 */
    public void glGetBufferSubData(int target, long offset, int[] data);

/**
 * Array version of: {@link #glGetBufferSubData GetBufferSubData}
 *
 * @see <a href="https://docs.gl/gl4/glGetBufferSubData">Reference Page</a>
 */
    public void glGetBufferSubData(int target, long offset, long[] data);

/**
 * Array version of: {@link #glGetBufferSubData GetBufferSubData}
 *
 * @see <a href="https://docs.gl/gl4/glGetBufferSubData">Reference Page</a>
 */
    public void glGetBufferSubData(int target, long offset, float[] data);

/**
 * Array version of: {@link #glGetBufferSubData GetBufferSubData}
 *
 * @see <a href="https://docs.gl/gl4/glGetBufferSubData">Reference Page</a>
 */
    public void glGetBufferSubData(int target, long offset, double[] data);

}
