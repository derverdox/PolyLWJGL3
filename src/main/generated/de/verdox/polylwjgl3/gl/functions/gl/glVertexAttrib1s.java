package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl15.GL15Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl15.GL15AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL20;
import org.lwjgl.system.*;

public interface glVertexAttrib1s {

/**
 * Short version of {@link #glVertexAttrib1f VertexAttrib1f}.
 *
 * @param index the index of the generic vertex attribute to be modified
 * @param v0    the vertex attribute x component
 *
 * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
 */
    public void glVertexAttrib1s(int index, short v0);

}
