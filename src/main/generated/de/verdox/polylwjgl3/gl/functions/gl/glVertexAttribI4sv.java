package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl21.GL21Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl21.GL21AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL30;
import org.lwjgl.system.*;

public interface glVertexAttribI4sv {

/**
 * Unsafe version of: {@link #glVertexAttribI4sv VertexAttribI4sv}
 */
    public void nglVertexAttribI4sv(int index, long v);

/**
 * Short version of {@link #glVertexAttribI4iv VertexAttribI4iv}.
 *
 * @param index the index of the pure integer generic vertex attribute to be modified
 * @param v     the pure integer vertex attribute buffer
 *
 * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
 */
    public void glVertexAttribI4sv(int index, ShortBuffer v);

/**
 * Array version of: {@link #glVertexAttribI4sv VertexAttribI4sv}
 *
 * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
 */
    public void glVertexAttribI4sv(int index, short[] v);

}
