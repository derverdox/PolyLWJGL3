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

public interface glRectiv {

/**
 * Unsafe version of: {@link #glRectiv Rectiv}
 */
    public void nglRectiv(long v1, long v2);

/**
 * Pointer version of {@link #glRecti Recti}.
 *
 * @param v1 the first vertex buffer
 * @param v2 the second vertex buffer
 *
 * @see <a href="https://docs.gl/gl3/glRect">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glRectiv(IntBuffer v1, IntBuffer v2);

/**
 * Array version of: {@link #glRectiv Rectiv}
 *
 * @see <a href="https://docs.gl/gl3/glRect">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glRectiv(int[] v1, int[] v2);

}
