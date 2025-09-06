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

public interface glGetClipPlane {

/**
 * Unsafe version of: {@link #glGetClipPlane GetClipPlane}
 */
    public void nglGetClipPlane(int plane, long equation);

/**
 * Returns four double-precision values in {@code equation}; these are the coefficients of the plane equation of plane in eye coordinates (these
 * coordinates are those that were computed when the plane was specified).
 *
 * @param plane    the clip plane
 * @param equation a buffer in which to place the returned values
 *
 * @see <a href="https://docs.gl/gl3/glGetClipPlane">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glGetClipPlane(int plane, DoubleBuffer equation);

/**
 * Array version of: {@link #glGetClipPlane GetClipPlane}
 *
 * @see <a href="https://docs.gl/gl3/glGetClipPlane">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glGetClipPlane(int plane, double[] equation);

}
