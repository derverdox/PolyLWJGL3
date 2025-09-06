package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl21.GL21Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl21.GL21AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL30;
import org.lwjgl.system.*;

public interface glVertexAttribI2uiv {

/**
 * Unsafe version of: {@link #glVertexAttribI2uiv VertexAttribI2uiv}
 */
    public void nglVertexAttribI2uiv(int index, long v);

/**
 * Pointer version of {@link #glVertexAttribI2ui VertexAttribI2ui}.
 *
 * @param index the index of the pure integer generic vertex attribute to be modified
 * @param v     the pure integer vertex attribute buffer
 *
 * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
 */
    public void glVertexAttribI2uiv(int index, IntBuffer v);

/**
 * Array version of: {@link #glVertexAttribI2uiv VertexAttribI2uiv}
 *
 * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
 */
    public void glVertexAttribI2uiv(int index, int[] v);

}
