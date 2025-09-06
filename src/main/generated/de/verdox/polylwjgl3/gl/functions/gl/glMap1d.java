package de.verdox.polylwjgl3.gl.functions.gl;

import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glMap1d {

/**
 * Unsafe version of: {@link #glMap1d Map1d}
 */
    public void nglMap1d(int target, double u1, double u2, int stride, int order, long points);

/**
 * Double version of {@link #glMap1f Map1f}.
 *
 * @param target the evaluator target
 * @param u1     the first endpoint of the pre-image of the map
 * @param u2     the second endpoint of the pre-image of the map
 * @param stride the number of values in each block of storage
 * @param order  the polynomial order
 * @param points a set of {@code order} blocks of storage containing control points
 *
 * @see <a href="https://docs.gl/gl3/glMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glMap1d(int target, double u1, double u2, int stride, int order, DoubleBuffer points);

/**
 * Array version of: {@link #glMap1d Map1d}
 *
 * @see <a href="https://docs.gl/gl3/glMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glMap1d(int target, double u1, double u2, int stride, int order, double[] points);

}
