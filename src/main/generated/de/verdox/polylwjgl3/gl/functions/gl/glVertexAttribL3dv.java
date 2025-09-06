package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl40.GL40Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl40.GL40AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL41;
import org.lwjgl.system.*;

public interface glVertexAttribL3dv {

/**
 * Unsafe version of: {@link #glVertexAttribL3dv VertexAttribL3dv}
 */
    public void nglVertexAttribL3dv(int index, long v);

/**
 * Pointer version of {@link #glVertexAttribL3d VertexAttribL3d}.
 *
 * @param index the index of the generic vertex attribute to be modified
 * @param v     the vertex attribute buffer
 *
 * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
 */
    public void glVertexAttribL3dv(int index, DoubleBuffer v);

/**
 * Array version of: {@link #glVertexAttribL3dv VertexAttribL3dv}
 *
 * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
 */
    public void glVertexAttribL3dv(int index, double[] v);

}
