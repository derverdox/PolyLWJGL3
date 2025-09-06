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

public interface glMultMatrixf {

/**
 * Unsafe version of: {@link #glMultMatrixf MultMatrixf}
 */
    public void nglMultMatrixf(long m);

/**
 * Multiplies the current matrix with a 4 &times; 4 matrix in column-major order. See {@link #glLoadMatrixf LoadMatrixf} for details.
 *
 * @param m the matrix data
 *
 * @see <a href="https://docs.gl/gl3/glMultMatrixf">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glMultMatrixf(FloatBuffer m);

/**
 * Array version of: {@link #glMultMatrixf MultMatrixf}
 *
 * @see <a href="https://docs.gl/gl3/glMultMatrixf">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glMultMatrixf(float[] m);

}
