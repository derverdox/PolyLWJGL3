package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl40.GL40Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl40.GL40AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL41;
import org.lwjgl.system.*;

public interface glVertexAttribL3d {

/**
 * Specifies the value of a generic vertex attribute. The w is implicitly set to 1.0.
 *
 * @param index the index of the generic vertex attribute to be modified
 * @param x     the vertex attribute x component
 * @param y     the vertex attribute y component
 * @param z     the vertex attribute z component
 *
 * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
 */
    public void glVertexAttribL3d(int index, double x, double y, double z);

}
