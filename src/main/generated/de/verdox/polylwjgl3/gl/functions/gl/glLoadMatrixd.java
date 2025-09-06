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

public interface glLoadMatrixd {

/**
 * Unsafe version of: {@link #glLoadMatrixd LoadMatrixd}
 */
    public void nglLoadMatrixd(long m);

/**
 * Double version of {@link #glLoadMatrixf LoadMatrixf}.
 *
 * @param m the matrix data
 *
 * @see <a href="https://docs.gl/gl3/glLoadMatrixd">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glLoadMatrixd(@NativeType("GLdouble const *") DoubleBuffer m);

/**
 * Array version of: {@link #glLoadMatrixd LoadMatrixd}
 *
 * @see <a href="https://docs.gl/gl3/glLoadMatrixd">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glLoadMatrixd(@NativeType("GLdouble const *") double[] m);

}
