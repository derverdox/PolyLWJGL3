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

public interface glRectdv {

/**
 * Unsafe version of: {@link #glRectdv Rectdv}
 */
    public void nglRectdv(long v1, long v2);

/**
 * Pointer version of {@link #glRectd Rectd}.
 *
 * @param v1 the first vertex buffer
 * @param v2 the second vertex buffer
 *
 * @see <a href="https://docs.gl/gl3/glRect">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glRectdv(DoubleBuffer v1, DoubleBuffer v2);

/**
 * Array version of: {@link #glRectdv Rectdv}
 *
 * @see <a href="https://docs.gl/gl3/glRect">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glRectdv(double[] v1, double[] v2);

}
