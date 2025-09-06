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

public interface glFrustum {

/**
 * Manipulates the current matrix with a matrix that produces perspective projection, in such a way that the coordinates <code>(lb &ndash; n)<sup>T</sup></code>
 * and <code>(rt &ndash; n)<sup>T</sup></code> specify the points on the near clipping plane that are mapped to the lower left and upper right corners of the
 * window, respectively (assuming that the eye is located at <code>(0 0 0)<sup>T</sup></code>). {@code f} gives the distance from the eye to the far clipping
 * plane.
 *
 * <p>Calling this function is equivalent to calling {@link #glMultMatrixf MultMatrixf} with the following matrix:</p>
 *
 * <table class=striped>
 * <tr><td>2n / (r - l)</td><td>0</td><td>(r + l) / (r - l)</td><td>0</td></tr>
 * <tr><td>0</td><td>2n / (t - b)</td><td>(t + b) / (t - b)</td><td>0</td></tr>
 * <tr><td>0</td><td>0</td><td>- (f + n) / (f - n)</td><td>- (2fn) / (f - n)</td></tr>
 * <tr><td>0</td><td>0</td><td>-1</td><td>0</td></tr>
 * </table>
 *
 * @param l the left frustum plane
 * @param r the right frustum plane
 * @param b the bottom frustum plane
 * @param t the top frustum plane
 * @param n the near frustum plane
 * @param f the far frustum plane
 *
 * @see <a href="https://docs.gl/gl3/glFrustum">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glFrustum(@NativeType("GLdouble") double l, @NativeType("GLdouble") double r, @NativeType("GLdouble") double b, @NativeType("GLdouble") double t, @NativeType("GLdouble") double n, @NativeType("GLdouble") double f);

}
