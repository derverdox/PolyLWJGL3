package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl21.GL21Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl21.GL21AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL30;
import org.lwjgl.system.*;

public interface glVertexAttribI3i {

/**
 * Specifies the value of a pure integer generic vertex attribute. The w component is implicitly set to 1.
 *
 * @param index the index of the pure integer generic vertex attribute to be modified
 * @param x     the vertex attribute x component
 * @param y     the vertex attribute y component
 * @param z     the vertex attribute z component
 *
 * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
 */
    public void glVertexAttribI3i(int index, int x, int y, int z);

}
