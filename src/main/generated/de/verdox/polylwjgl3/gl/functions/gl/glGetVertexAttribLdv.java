package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl40.GL40Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl40.GL40AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL41;
import org.lwjgl.system.*;

public interface glGetVertexAttribLdv {

/**
 * Unsafe version of: {@link #glGetVertexAttribLdv GetVertexAttribLdv}
 */
    public void nglGetVertexAttribLdv(int index, int pname, long params);

/**
 * Double version of {@link GL20C#glGetVertexAttribiv GetVertexAttribiv}.
 *
 * @param index  the generic vertex attribute parameter to be queried
 * @param pname  the symbolic name of the vertex attribute parameter to be queried
 * @param params the requested data
 *
 * @see <a href="https://docs.gl/gl4/glGetVertexAttrib">Reference Page</a>
 */
    public void glGetVertexAttribLdv(int index, int pname, DoubleBuffer params);

/**
 * Array version of: {@link #glGetVertexAttribLdv GetVertexAttribLdv}
 *
 * @see <a href="https://docs.gl/gl4/glGetVertexAttrib">Reference Page</a>
 */
    public void glGetVertexAttribLdv(int index, int pname, double[] params);

}
