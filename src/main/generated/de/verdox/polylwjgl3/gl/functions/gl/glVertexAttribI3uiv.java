package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl21.GL21Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl21.GL21AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL30;
import org.lwjgl.system.*;

public interface glVertexAttribI3uiv {

/**
 * Unsafe version of: {@link #glVertexAttribI3uiv VertexAttribI3uiv}
 */
    public void nglVertexAttribI3uiv(int index, long v);

/**
 * Pointer version of {@link #glVertexAttribI3ui VertexAttribI3ui}.
 *
 * @param index the index of the pure integer generic vertex attribute to be modified
 * @param v     the pure integer vertex attribute buffer
 *
 * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
 */
    public void glVertexAttribI3uiv(int index, IntBuffer v);

/**
 * Array version of: {@link #glVertexAttribI3uiv VertexAttribI3uiv}
 *
 * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
 */
    public void glVertexAttribI3uiv(int index, int[] v);

}
