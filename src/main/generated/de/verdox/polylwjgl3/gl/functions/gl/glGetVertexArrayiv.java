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

public interface glGetVertexArrayiv {

/**
 * Unsafe version of: {@link #glGetVertexArrayiv GetVertexArrayiv}
 */
    public void nglGetVertexArrayiv(int vaobj, int pname, long param);

/**
 * Queries parameters of a vertex array object.
 *
 * @param vaobj the vertex array object name
 * @param pname the parameter to query. Must be:<br><table><tr><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER_BINDING ELEMENT_ARRAY_BUFFER_BINDING}</td></tr></table>
 * @param param the buffer in which to return the parameter values
 *
 * @see <a href="https://docs.gl/gl4/glGetVertexArray">Reference Page</a>
 */
    public void glGetVertexArrayiv(int vaobj, int pname, IntBuffer param);

/**
 * Array version of: {@link #glGetVertexArrayiv GetVertexArrayiv}
 *
 * @see <a href="https://docs.gl/gl4/glGetVertexArray">Reference Page</a>
 */
    public void glGetVertexArrayiv(int vaobj, int pname, int[] param);

}
