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

public interface glGetMapfv {

/**
 * Unsafe version of: {@link #glGetMapfv GetMapfv}
 */
    public void nglGetMapfv(int target, int query, long data);

/**
 * Float version of {@link #glGetMapiv GetMapiv}.
 *
 * @param target the evaluator map
 * @param query  the information to query
 * @param data   a scalar or buffer in which to place the returned data
 *
 * @see <a href="https://docs.gl/gl3/glGetMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glGetMapfv(int target, int query, FloatBuffer data);

/**
 * Array version of: {@link #glGetMapfv GetMapfv}
 *
 * @see <a href="https://docs.gl/gl3/glGetMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glGetMapfv(int target, int query, float[] data);

}
