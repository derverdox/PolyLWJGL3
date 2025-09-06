package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl32.GL32Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl32.GL32AccessorImpl;
import java.nio.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL33;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glGetQueryObjecti64v {

/**
 * Unsafe version of: {@link #glGetQueryObjecti64v GetQueryObjecti64v}
 */
    public void nglGetQueryObjecti64v(int id, int pname, long params);

/**
 * Returns the 64bit integer value of query object parameter.
 *
 * @param id     the name of a query object
 * @param pname  the symbolic name of a query object parameter. One of:<br><table><tr><td>{@link GL15#GL_QUERY_RESULT QUERY_RESULT}</td><td>{@link GL15#GL_QUERY_RESULT_AVAILABLE QUERY_RESULT_AVAILABLE}</td></tr></table>
 * @param params the requested data
 *
 * @see <a href="https://docs.gl/gl4/glGetQueryObject">Reference Page</a>
 */
    public void glGetQueryObjecti64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint64 *") LongBuffer params);

/**
 * Returns the 64bit integer value of query object parameter.
 *
 * @param id     the name of a query object
 * @param pname  the symbolic name of a query object parameter. One of:<br><table><tr><td>{@link GL15#GL_QUERY_RESULT QUERY_RESULT}</td><td>{@link GL15#GL_QUERY_RESULT_AVAILABLE QUERY_RESULT_AVAILABLE}</td></tr></table>
 * @param params the requested data
 *
 * @see <a href="https://docs.gl/gl4/glGetQueryObject">Reference Page</a>
 */
    public void glGetQueryObjecti64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint64 *") long params);

/**
 * Array version of: {@link #glGetQueryObjecti64v GetQueryObjecti64v}
 *
 * @see <a href="https://docs.gl/gl4/glGetQueryObject">Reference Page</a>
 */
    public void glGetQueryObjecti64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint64 *") long[] params);

}
