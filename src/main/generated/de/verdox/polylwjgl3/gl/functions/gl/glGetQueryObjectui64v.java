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

public interface glGetQueryObjectui64v {

/**
 * Unsafe version of: {@link #glGetQueryObjectui64v GetQueryObjectui64v}
 */
    public void nglGetQueryObjectui64v(int id, int pname, long params);

/**
 * Unsigned version of {@link #glGetQueryObjecti64v GetQueryObjecti64v}.
 *
 * @param id     the name of a query object
 * @param pname  the symbolic name of a query object parameter
 * @param params the requested data
 *
 * @see <a href="https://docs.gl/gl4/glGetQueryObject">Reference Page</a>
 */
    public void glGetQueryObjectui64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") LongBuffer params);

/**
 * Unsigned version of {@link #glGetQueryObjecti64v GetQueryObjecti64v}.
 *
 * @param id     the name of a query object
 * @param pname  the symbolic name of a query object parameter
 * @param params the requested data
 *
 * @see <a href="https://docs.gl/gl4/glGetQueryObject">Reference Page</a>
 */
    public void glGetQueryObjectui64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") long params);

/**
 * Array version of: {@link #glGetQueryObjectui64v GetQueryObjectui64v}
 *
 * @see <a href="https://docs.gl/gl4/glGetQueryObject">Reference Page</a>
 */
    public void glGetQueryObjectui64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") long[] params);

}
