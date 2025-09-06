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

public interface glMap2f {

/**
 * Unsafe version of: {@link #glMap2f Map2f}
 */
    public void nglMap2f(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, long points);

/**
 * Bivariate version of {@link #glMap1f Map1f}.
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
    public void glMap2f(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, FloatBuffer points);

/**
 * Array version of: {@link #glMap2f Map2f}
 *
 * @see <a href="https://docs.gl/gl3/glMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glMap2f(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, float[] points);

}
