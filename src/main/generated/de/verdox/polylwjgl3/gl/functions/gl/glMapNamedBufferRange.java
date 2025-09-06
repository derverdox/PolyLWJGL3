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

public interface glMapNamedBufferRange {

/**
 * Unsafe version of: {@link #glMapNamedBufferRange MapNamedBufferRange}
 */
    public long nglMapNamedBufferRange(int buffer, long offset, long length, int access);

/**
 * DSA version of {@link GL30C#glMapBufferRange MapBufferRange}.
 *
 * @param buffer the buffer object name
 * @param offset the starting offset within the buffer of the range to be mapped
 * @param length the length of the range to be mapped
 * @param access a combination of access flags indicating the desired access to the range. One or more of:<br><table><tr><td>{@link GL30#GL_MAP_READ_BIT MAP_READ_BIT}</td><td>{@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT}</td><td>{@link GL30#GL_MAP_INVALIDATE_RANGE_BIT MAP_INVALIDATE_RANGE_BIT}</td><td>{@link GL30#GL_MAP_INVALIDATE_BUFFER_BIT MAP_INVALIDATE_BUFFER_BIT}</td></tr><tr><td>{@link GL30#GL_MAP_FLUSH_EXPLICIT_BIT MAP_FLUSH_EXPLICIT_BIT}</td><td>{@link GL30#GL_MAP_UNSYNCHRONIZED_BIT MAP_UNSYNCHRONIZED_BIT}</td></tr></table>
 *
 * @see <a href="https://docs.gl/gl4/glMapBufferRange">Reference Page</a>
 */
@Nullable
    public ByteBuffer glMapNamedBufferRange(int buffer, long offset, long length, int access);

/**
 * DSA version of {@link GL30C#glMapBufferRange MapBufferRange}.
 *
 * @param buffer the buffer object name
 * @param offset the starting offset within the buffer of the range to be mapped
 * @param length the length of the range to be mapped
 * @param access a combination of access flags indicating the desired access to the range. One or more of:<br><table><tr><td>{@link GL30#GL_MAP_READ_BIT MAP_READ_BIT}</td><td>{@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT}</td><td>{@link GL30#GL_MAP_INVALIDATE_RANGE_BIT MAP_INVALIDATE_RANGE_BIT}</td><td>{@link GL30#GL_MAP_INVALIDATE_BUFFER_BIT MAP_INVALIDATE_BUFFER_BIT}</td></tr><tr><td>{@link GL30#GL_MAP_FLUSH_EXPLICIT_BIT MAP_FLUSH_EXPLICIT_BIT}</td><td>{@link GL30#GL_MAP_UNSYNCHRONIZED_BIT MAP_UNSYNCHRONIZED_BIT}</td></tr></table>
 *
 * @see <a href="https://docs.gl/gl4/glMapBufferRange">Reference Page</a>
 */
@Nullable
    public ByteBuffer glMapNamedBufferRange(int buffer, long offset, long length, int access, @Nullable ByteBuffer old_buffer);

}
