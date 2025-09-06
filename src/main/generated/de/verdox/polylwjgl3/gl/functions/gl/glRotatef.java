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

public interface glRotatef {

/**
 * Manipulates the current matrix with a rotation matrix.
 *
 * <p>{@code angle} gives an angle of rotation in degrees; the coordinates of a vector v are given by <code>v = (x y z)<sup>T</sup></code>. The computed matrix
 * is a counter-clockwise rotation about the line through the origin with the specified axis when that axis is pointing up (i.e. the right-hand rule
 * determines the sense of the rotation angle). The matrix is thus</p>
 *
 * <table class=striped>
 * <tr><td colspan=3 rowspan=3><b>R</b></td><td>0</td></tr>
 * <tr><td>0</td></tr>
 * <tr><td>0</td></tr>
 * <tr><td>0</td><td>0</td><td>0</td><td>1</td></tr>
 * </table>
 *
 * <p>Let <code>u = v / ||v|| = (x' y' z')<sup>T</sup></code>. If <b>S</b> =</p>
 *
 * <table class=striped>
 * <tr><td>0</td><td>-z'</td><td>y'</td></tr>
 * <tr><td>z'</td><td>0</td><td>-x'</td></tr>
 * <tr><td>-y'</td><td>x'</td><td>0</td></tr>
 * </table>
 *
 * <p>then <code><b>R</b> = uu<sup>T</sup> + cos(angle)(I - uu<sup>T</sup>) + sin(angle)<b>S</b></code></p>
 *
 * @param angle the angle of rotation in degrees
 * @param x     the x coordinate of the rotation vector
 * @param y     the y coordinate of the rotation vector
 * @param z     the z coordinate of the rotation vector
 *
 * @see <a href="https://docs.gl/gl3/glRotatef">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glRotatef(float angle, float x, float y, float z);

}
