package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl40.GL40Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl40.GL40AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL41;
import org.lwjgl.system.*;

public interface glDepthRangeArrayv {

/**
 * Unsafe version of: {@link #glDepthRangeArrayv DepthRangeArrayv}
 *
 * @param count the number of viewports whose depth range to update
 */
    public void nglDepthRangeArrayv(int first, int count, long v);

/**
 * Specifies mapping of depth values from normalized device coordinates to window coordinates for a specified set of viewports.
 *
 * @param first the index of the first viewport whose depth range to update
 * @param v     n array containing the near and far values for the depth range of each modified viewport
 *
 * @see <a href="https://docs.gl/gl4/glDepthRangeArrayv">Reference Page</a>
 */
    public void glDepthRangeArrayv(int first, DoubleBuffer v);

/**
 * Array version of: {@link #glDepthRangeArrayv DepthRangeArrayv}
 *
 * @see <a href="https://docs.gl/gl4/glDepthRangeArrayv">Reference Page</a>
 */
    public void glDepthRangeArrayv(int first, double[] v);

}
