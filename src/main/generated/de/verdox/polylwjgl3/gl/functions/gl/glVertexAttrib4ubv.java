package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl15.GL15Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl15.GL15AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL20;
import org.lwjgl.system.*;

public interface glVertexAttrib4ubv {

/**
 * Unsafe version of: {@link #glVertexAttrib4ubv VertexAttrib4ubv}
 */
    public void nglVertexAttrib4ubv(int index, long v);

/**
 * Pointer version of {@link #glVertexAttrib4Nub VertexAttrib4Nub}.
 *
 * @param index the index of the generic vertex attribute to be modified
 * @param v     the vertex attribute buffer
 *
 * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
 */
    public void glVertexAttrib4ubv(int index, ByteBuffer v);

}
