package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl15.GL15Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl15.GL15AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL20;
import org.lwjgl.system.*;

public interface glVertexAttrib4Nusv {

/**
 * Unsafe version of: {@link #glVertexAttrib4Nusv VertexAttrib4Nusv}
 */
    public void nglVertexAttrib4Nusv(int index, long v);

/**
 * Normalized unsigned short pointer version of {@link #glVertexAttrib4f VertexAttrib4f}.
 *
 * @param index the index of the generic vertex attribute to be modified
 * @param v     the vertex attribute buffer
 *
 * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
 */
    public void glVertexAttrib4Nusv(int index, ShortBuffer v);

/**
 * Array version of: {@link #glVertexAttrib4Nusv VertexAttrib4Nusv}
 *
 * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
 */
    public void glVertexAttrib4Nusv(int index, short[] v);

}
