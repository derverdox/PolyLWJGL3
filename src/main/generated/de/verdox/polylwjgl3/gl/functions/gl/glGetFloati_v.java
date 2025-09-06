package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl40.GL40Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl40.GL40AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL41;
import org.lwjgl.system.*;

public interface glGetFloati_v {

/**
 * Unsafe version of: {@link #glGetFloati_v GetFloati_v}
 */
    public void nglGetFloati_v(int target, int index, long data);

/**
 * Queries the float value of an indexed state variable.
 *
 * @param target the indexed state to query
 * @param index  the index of the element being queried
 * @param data   a scalar or buffer in which to place the returned data
 *
 * @see <a href="https://docs.gl/gl4/glGetFloati_v">Reference Page</a>
 */
    public void glGetFloati_v(int target, int index, FloatBuffer data);

/**
 * Array version of: {@link #glGetFloati_v GetFloati_v}
 *
 * @see <a href="https://docs.gl/gl4/glGetFloati_v">Reference Page</a>
 */
    public void glGetFloati_v(int target, int index, float[] data);

}
