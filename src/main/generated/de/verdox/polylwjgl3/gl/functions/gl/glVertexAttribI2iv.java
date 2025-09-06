package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl21.GL21Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl21.GL21AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL30;
import org.lwjgl.system.*;

public interface glVertexAttribI2iv {

/**
 * Unsafe version of: {@link #glVertexAttribI2iv VertexAttribI2iv}
 */
    public void nglVertexAttribI2iv(int index, long v);

/**
 * Pointer version of {@link #glVertexAttribI2i VertexAttribI2i}.
 *
 * @param index the index of the pure integer generic vertex attribute to be modified
 * @param v     the pure integer vertex attribute buffer
 *
 * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
 */
    public void glVertexAttribI2iv(int index, IntBuffer v);

/**
 * Array version of: {@link #glVertexAttribI2iv VertexAttribI2iv}
 *
 * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
 */
    public void glVertexAttribI2iv(int index, int[] v);

}
