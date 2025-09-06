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

public interface glClipPlane {

/**
 * Unsafe version of: {@link #glClipPlane ClipPlane}
 */
    public void nglClipPlane(int plane, long equation);

/**
 * Specifies a client-defined clip plane.
 *
 * <p>The value of the first argument, {@code plane}, is a symbolic constant, CLIP_PLANEi, where i is an integer between 0 and n &ndash; 1, indicating one of
 * n client-defined clip planes. {@code equation} is an array of four double-precision floating-point values. These are the coefficients of a plane
 * equation in object coordinates: p1, p2, p3, and p4 (in that order).</p>
 *
 * @param plane    the clip plane to define
 * @param equation the clip plane coefficients
 *
 * @see <a href="https://docs.gl/gl3/glClipPlane">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glClipPlane(int plane, DoubleBuffer equation);

/**
 * Array version of: {@link #glClipPlane ClipPlane}
 *
 * @see <a href="https://docs.gl/gl3/glClipPlane">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glClipPlane(int plane, double[] equation);

}
