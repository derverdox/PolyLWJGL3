package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl15.GL15Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl15.GL15AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL20;
import org.lwjgl.system.*;

public interface glVertexAttrib4iv {

/**
 * Unsafe version of: {@link #glVertexAttrib4iv VertexAttrib4iv}
 */
    public void nglVertexAttrib4iv(int index, long v);

/**
 * Integer pointer version of {@link #glVertexAttrib4f VertexAttrib4f}.
 *
 * @param index the index of the generic vertex attribute to be modified
 * @param v     the vertex attribute buffer
 *
 * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
 */
    public void glVertexAttrib4iv(int index, IntBuffer v);

/**
 * Array version of: {@link #glVertexAttrib4iv VertexAttrib4iv}
 *
 * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
 */
    public void glVertexAttrib4iv(int index, int[] v);

}
