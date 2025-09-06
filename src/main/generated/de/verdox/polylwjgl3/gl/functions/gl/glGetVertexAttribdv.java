package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl15.GL15Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl15.GL15AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL20;
import org.lwjgl.system.*;

public interface glGetVertexAttribdv {

/**
 * Unsafe version of: {@link #glGetVertexAttribdv GetVertexAttribdv}
 */
    public void nglGetVertexAttribdv(int index, int pname, long params);

/**
 * Double version of {@link #glGetVertexAttribiv GetVertexAttribiv}.
 *
 * @param index  the generic vertex attribute parameter to be queried
 * @param pname  the symbolic name of the vertex attribute parameter to be queried
 * @param params returns the requested data
 *
 * @see <a href="https://docs.gl/gl4/glGetVertexAttrib">Reference Page</a>
 */
    public void glGetVertexAttribdv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLdouble *") DoubleBuffer params);

/**
 * Array version of: {@link #glGetVertexAttribdv GetVertexAttribdv}
 *
 * @see <a href="https://docs.gl/gl4/glGetVertexAttrib">Reference Page</a>
 */
    public void glGetVertexAttribdv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLdouble *") double[] params);

}
