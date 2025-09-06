package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl15.GL15Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl15.GL15AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL20;
import org.lwjgl.system.*;

public interface glVertexAttrib4Nsv {

/**
 * Unsafe version of: {@link #glVertexAttrib4Nsv VertexAttrib4Nsv}
 */
    public void nglVertexAttrib4Nsv(int index, long v);

/**
 * Normalized short pointer version of {@link #glVertexAttrib4f VertexAttrib4f}.
 *
 * @param index the index of the generic vertex attribute to be modified
 * @param v     the vertex attribute buffer
 *
 * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
 */
    public void glVertexAttrib4Nsv(int index, ShortBuffer v);

/**
 * Array version of: {@link #glVertexAttrib4Nsv VertexAttrib4Nsv}
 *
 * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
 */
    public void glVertexAttrib4Nsv(int index, short[] v);

}
