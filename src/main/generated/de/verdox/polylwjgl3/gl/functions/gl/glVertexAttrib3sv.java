package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl15.GL15Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl15.GL15AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL20;
import org.lwjgl.system.*;

public interface glVertexAttrib3sv {

/**
 * Unsafe version of: {@link #glVertexAttrib3sv VertexAttrib3sv}
 */
    public void nglVertexAttrib3sv(int index, long v);

/**
 * Pointer version of {@link #glVertexAttrib3s VertexAttrib3s}.
 *
 * @param index the index of the generic vertex attribute to be modified
 * @param v     the vertex attribute buffer
 *
 * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
 */
    public void glVertexAttrib3sv(int index, ShortBuffer v);

/**
 * Array version of: {@link #glVertexAttrib3sv VertexAttrib3sv}
 *
 * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
 */
    public void glVertexAttrib3sv(int index, short[] v);

}
