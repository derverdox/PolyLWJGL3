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

public interface glGetNamedBufferParameteri64v {

/**
 * Unsafe version of: {@link #glGetNamedBufferParameteri64v GetNamedBufferParameteri64v}
 */
    public void nglGetNamedBufferParameteri64v(int buffer, int pname, long params);

/**
 * DSA version of {@link GL32C#glGetBufferParameteri64v GetBufferParameteri64v}.
 *
 * @param buffer the buffer object name
 * @param pname  the symbolic name of a buffer object parameter. One of:<br><table><tr><td>{@link GL15#GL_BUFFER_SIZE BUFFER_SIZE}</td><td>{@link GL15#GL_BUFFER_USAGE BUFFER_USAGE}</td><td>{@link GL15#GL_BUFFER_ACCESS BUFFER_ACCESS}</td><td>{@link GL15#GL_BUFFER_MAPPED BUFFER_MAPPED}</td></tr><tr><td>{@link GL30#GL_BUFFER_ACCESS_FLAGS BUFFER_ACCESS_FLAGS}</td><td>{@link GL30#GL_BUFFER_MAP_LENGTH BUFFER_MAP_LENGTH}</td><td>{@link GL30#GL_BUFFER_MAP_OFFSET BUFFER_MAP_OFFSET}</td><td>{@link GL44#GL_BUFFER_IMMUTABLE_STORAGE BUFFER_IMMUTABLE_STORAGE}</td></tr><tr><td>{@link GL44#GL_BUFFER_STORAGE_FLAGS BUFFER_STORAGE_FLAGS}</td></tr></table>
 * @param params the requested parameter
 *
 * @see <a href="https://docs.gl/gl4/glGetBufferParameter">Reference Page</a>
 */
    public void glGetNamedBufferParameteri64v(int buffer, int pname, LongBuffer params);

/**
 * Array version of: {@link #glGetNamedBufferParameteri64v GetNamedBufferParameteri64v}
 *
 * @see <a href="https://docs.gl/gl4/glGetBufferParameter">Reference Page</a>
 */
    public void glGetNamedBufferParameteri64v(int buffer, int pname, long[] params);

}
