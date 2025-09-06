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

public interface glMap2d {

/**
 * Unsafe version of: {@link #glMap2d Map2d}
 */
    public void nglMap2d(int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, long points);

/**
 * Double version of {@link #glMap2f Map2f}.
 *
 * @param target  the evaluator target
 * @param u1      the first u-dimension endpoint of the pre-image rectangle of the map
 * @param u2      the second u-dimension endpoint of the pre-image rectangle of the map
 * @param ustride the number of values in the u-dimension in each block of storage
 * @param uorder  the polynomial order in the u-dimension
 * @param v1      the first v-dimension endpoint of the pre-image rectangle of the map
 * @param v2      the second v-dimension endpoint of the pre-image rectangle of the map
 * @param vstride the number of values in the v-dimension in each block of storage
 * @param vorder  the polynomial order in the v-dimension
 * @param points  a set of <code>uorder &times; vorder</code> blocks of storage containing control points
 *
 * @see <a href="https://docs.gl/gl3/glMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glMap2d(int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, DoubleBuffer points);

/**
 * Array version of: {@link #glMap2d Map2d}
 *
 * @see <a href="https://docs.gl/gl3/glMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glMap2d(int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, double[] points);

}
