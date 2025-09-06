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

public interface glLoadMatrixf {

/**
 * Unsafe version of: {@link #glLoadMatrixf LoadMatrixf}
 */
    public void nglLoadMatrixf(long m);

/**
 * Sets the current matrix to a 4 &times; 4 matrix in column-major order.
 *
 * <p>The matrix is stored as 16 consecutive values, i.e. as:</p>
 *
 * <table class=striped>
 * <tr><td>a1</td><td>a5</td><td>a9</td><td>a13</td></tr>
 * <tr><td>a2</td><td>a6</td><td>a10</td><td>a14</td></tr>
 * <tr><td>a3</td><td>a7</td><td>a11</td><td>a15</td></tr>
 * <tr><td>a4</td><td>a8</td><td>a12</td><td>a16</td></tr>
 * </table>
 *
 * <p>This differs from the standard row-major ordering for matrix elements. If the standard ordering is used, all of the subsequent transformation equations
 * are transposed, and the columns representing vectors become rows.</p>
 *
 * @param m the matrix data
 *
 * @see <a href="https://docs.gl/gl3/glLoadMatrixf">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glLoadMatrixf(@NativeType("GLfloat const *") FloatBuffer m);

/**
 * Array version of: {@link #glLoadMatrixf LoadMatrixf}
 *
 * @see <a href="https://docs.gl/gl3/glLoadMatrixf">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glLoadMatrixf(@NativeType("GLfloat const *") float[] m);

}
