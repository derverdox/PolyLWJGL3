package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl12.GL12Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl12.GL12AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL13;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glLoadTransposeMatrixf {

/**
 * Unsafe version of: {@link #glLoadTransposeMatrixf LoadTransposeMatrixf}
 */
    public void nglLoadTransposeMatrixf(long m);

/**
 * Sets the current matrix to a 4 &times; 4 matrix in row-major order.
 *
 * <p>The matrix is stored as 16 consecutive values, i.e. as:</p>
 *
 * <table class=striped>
 * <tr><td>a1</td><td>a2</td><td>a3</td><td>a4</td></tr>
 * <tr><td>a5</td><td>a6</td><td>a7</td><td>a8</td></tr>
 * <tr><td>a9</td><td>a10</td><td>a11</td><td>a12</td></tr>
 * <tr><td>a13</td><td>a14</td><td>a15</td><td>a16</td></tr>
 * </table>
 *
 * @param m the matrix data
 *
 * @see <a href="https://docs.gl/gl3/glLoadTransposeMatrixf">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glLoadTransposeMatrixf(FloatBuffer m);

/**
 * Array version of: {@link #glLoadTransposeMatrixf LoadTransposeMatrixf}
 *
 * @see <a href="https://docs.gl/gl3/glLoadTransposeMatrixf">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glLoadTransposeMatrixf(float[] m);

}
