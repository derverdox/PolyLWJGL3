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

public interface glGetVertexArrayIndexed64iv {

/**
 * Unsafe version of: {@link #glGetVertexArrayIndexed64iv GetVertexArrayIndexed64iv}
 */
    public void nglGetVertexArrayIndexed64iv(int vaobj, int index, int pname, long param);

/**
 * Queries parameters of an attribute of a vertex array object.
 *
 * @param vaobj the vertex array object name
 * @param index the attribute to query
 * @param pname the parameter to query. Must be:<br><table><tr><td>{@link GL43#GL_VERTEX_BINDING_OFFSET VERTEX_BINDING_OFFSET}</td></tr></table>
 * @param param the buffer in which to return the parameter values
 *
 * @see <a href="https://docs.gl/gl4/glGetVertexArrayIndexed">Reference Page</a>
 */
    public void glGetVertexArrayIndexed64iv(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint64 *") LongBuffer param);

/**
 * Array version of: {@link #glGetVertexArrayIndexed64iv GetVertexArrayIndexed64iv}
 *
 * @see <a href="https://docs.gl/gl4/glGetVertexArrayIndexed">Reference Page</a>
 */
    public void glGetVertexArrayIndexed64iv(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint64 *") long[] param);

}
