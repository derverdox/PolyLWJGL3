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

public interface glMapNamedBuffer {

/**
 * Unsafe version of: {@link #glMapNamedBuffer MapNamedBuffer}
 */
    public long nglMapNamedBuffer(int buffer, int access);

/**
 * DSA version of {@link GL15C#glMapBuffer MapBuffer}.
 *
 * @param buffer the buffer object name
 * @param access the access policy, indicating whether it will be possible to read from, write to, or both read from and write to the buffer object's mapped data store. One of:<br><table><tr><td>{@link GL15#GL_READ_ONLY READ_ONLY}</td><td>{@link GL15#GL_WRITE_ONLY WRITE_ONLY}</td><td>{@link GL15#GL_READ_WRITE READ_WRITE}</td></tr></table>
 *
 * @see <a href="https://docs.gl/gl4/glMapBuffer">Reference Page</a>
 */
@Nullable
@NativeType("void *")
    public ByteBuffer glMapNamedBuffer(@NativeType("GLuint") int buffer, @NativeType("GLenum") int access);

/**
 * DSA version of {@link GL15C#glMapBuffer MapBuffer}.
 *
 * @param buffer the buffer object name
 * @param access the access policy, indicating whether it will be possible to read from, write to, or both read from and write to the buffer object's mapped data store. One of:<br><table><tr><td>{@link GL15#GL_READ_ONLY READ_ONLY}</td><td>{@link GL15#GL_WRITE_ONLY WRITE_ONLY}</td><td>{@link GL15#GL_READ_WRITE READ_WRITE}</td></tr></table>
 *
 * @see <a href="https://docs.gl/gl4/glMapBuffer">Reference Page</a>
 */
@Nullable
@NativeType("void *")
    public ByteBuffer glMapNamedBuffer(@NativeType("GLuint") int buffer, @NativeType("GLenum") int access, @Nullable ByteBuffer old_buffer);

/**
 * DSA version of {@link GL15C#glMapBuffer MapBuffer}.
 *
 * @param buffer the buffer object name
 * @param access the access policy, indicating whether it will be possible to read from, write to, or both read from and write to the buffer object's mapped data store. One of:<br><table><tr><td>{@link GL15#GL_READ_ONLY READ_ONLY}</td><td>{@link GL15#GL_WRITE_ONLY WRITE_ONLY}</td><td>{@link GL15#GL_READ_WRITE READ_WRITE}</td></tr></table>
 *
 * @see <a href="https://docs.gl/gl4/glMapBuffer">Reference Page</a>
 */
@Nullable
@NativeType("void *")
    public ByteBuffer glMapNamedBuffer(@NativeType("GLuint") int buffer, @NativeType("GLenum") int access, long length, @Nullable ByteBuffer old_buffer);

}
