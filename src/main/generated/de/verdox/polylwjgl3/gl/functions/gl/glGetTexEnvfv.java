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

public interface glGetTexEnvfv {

/**
 * Unsafe version of: {@link #glGetTexEnvfv GetTexEnvfv}
 */
    public void nglGetTexEnvfv(int env, int pname, long data);

/**
 * Float version of {@link #glGetTexEnviv GetTexEnviv}.
 *
 * @param env   the texture environment to query
 * @param pname the parameter to query
 * @param data  a scalar or buffer in which to place the returned data
 *
 * @see <a href="https://docs.gl/gl3/glGetTexEnv">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glGetTexEnvfv(@NativeType("GLenum") int env, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer data);

/**
 * Array version of: {@link #glGetTexEnvfv GetTexEnvfv}
 *
 * @see <a href="https://docs.gl/gl3/glGetTexEnv">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glGetTexEnvfv(@NativeType("GLenum") int env, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] data);

}
