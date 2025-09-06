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

public interface glMultTransposeMatrixf {

/**
 * Unsafe version of: {@link #glMultTransposeMatrixf MultTransposeMatrixf}
 */
    public void nglMultTransposeMatrixf(long m);

/**
 * Multiplies the current matrix with a 4 &times; 4 matrix in row-major order. See {@link #glLoadTransposeMatrixf LoadTransposeMatrixf} for details.
 *
 * @param m the matrix data
 *
 * @see <a href="https://docs.gl/gl3/glMultTransposeMatrixf">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glMultTransposeMatrixf(FloatBuffer m);

/**
 * Array version of: {@link #glMultTransposeMatrixf MultTransposeMatrixf}
 *
 * @see <a href="https://docs.gl/gl3/glMultTransposeMatrixf">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glMultTransposeMatrixf(float[] m);

}
