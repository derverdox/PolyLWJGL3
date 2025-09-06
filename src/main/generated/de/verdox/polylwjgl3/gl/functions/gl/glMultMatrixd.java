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

public interface glMultMatrixd {

/**
 * Unsafe version of: {@link #glMultMatrixd MultMatrixd}
 */
    public void nglMultMatrixd(long m);

/**
 * Double version of {@link #glMultMatrixf MultMatrixf}.
 *
 * @param m the matrix data
 *
 * @see <a href="https://docs.gl/gl3/glMultMatrixd">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glMultMatrixd(DoubleBuffer m);

/**
 * Array version of: {@link #glMultMatrixd MultMatrixd}
 *
 * @see <a href="https://docs.gl/gl3/glMultMatrixd">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glMultMatrixd(double[] m);

}
