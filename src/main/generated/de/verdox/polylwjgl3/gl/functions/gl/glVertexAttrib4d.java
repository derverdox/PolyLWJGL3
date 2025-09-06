package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl15.GL15Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl15.GL15AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL20;
import org.lwjgl.system.*;

public interface glVertexAttrib4d {

/**
 * Double version of {@link #glVertexAttrib4f VertexAttrib4f}.
 *
 * @param index the index of the generic vertex attribute to be modified
 * @param v0    the vertex attribute x component
 * @param v1    the vertex attribute y component
 * @param v2    the vertex attribute z component
 * @param v3    the vertex attribute w component
 *
 * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
 */
    public void glVertexAttrib4d(int index, double v0, double v1, double v2, double v3);

}
