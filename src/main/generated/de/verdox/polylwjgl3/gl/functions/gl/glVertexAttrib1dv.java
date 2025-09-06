package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl15.GL15Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl15.GL15AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL20;
import org.lwjgl.system.*;

public interface glVertexAttrib1dv {

/**
 * Unsafe version of: {@link #glVertexAttrib1dv VertexAttrib1dv}
 */
    public void nglVertexAttrib1dv(int index, long v);

/**
 * Pointer version of {@link #glVertexAttrib1d VertexAttrib1d}.
 *
 * @param index the index of the generic vertex attribute to be modified
 * @param v     the vertex attribute buffer
 *
 * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
 */
    public void glVertexAttrib1dv(int index, DoubleBuffer v);

/**
 * Array version of: {@link #glVertexAttrib1dv VertexAttrib1dv}
 *
 * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
 */
    public void glVertexAttrib1dv(int index, double[] v);

}
