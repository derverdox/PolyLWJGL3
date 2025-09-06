package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl40.GL40Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl40.GL40AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL41;
import org.lwjgl.system.*;

public interface glVertexAttribL1d {

/**
 * Specifies the value of a generic vertex attribute. The y and z components are implicitly set to 0.0 and w to 1.0.
 *
 * @param index the index of the generic vertex attribute to be modified
 * @param x     the vertex attribute x component
 *
 * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
 */
    public void glVertexAttribL1d(int index, double x);

}
