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

public interface glGetTexGenfv {

/**
 * Unsafe version of: {@link #glGetTexGenfv GetTexGenfv}
 */
    public void nglGetTexGenfv(int coord, int pname, long data);

/**
 * Float version of {@link #glGetTexGeniv GetTexGeniv}.
 *
 * @param coord the coord to query
 * @param pname the parameter to query
 * @param data  a scalar or buffer in which to place the returned data
 *
 * @see <a href="https://docs.gl/gl3/glGetTexGen">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glGetTexGenfv(int coord, int pname, FloatBuffer data);

/**
 * Array version of: {@link #glGetTexGenfv GetTexGenfv}
 *
 * @see <a href="https://docs.gl/gl3/glGetTexGen">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glGetTexGenfv(int coord, int pname, float[] data);

}
