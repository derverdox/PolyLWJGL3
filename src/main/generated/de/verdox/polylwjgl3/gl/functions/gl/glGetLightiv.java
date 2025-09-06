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

public interface glGetLightiv {

/**
 * Unsafe version of: {@link #glGetLightiv GetLightiv}
 */
    public void nglGetLightiv(int light, int pname, long data);

/**
 * Returns integer information about light parameter {@code pname} for {@code light} in {@code data}.
 *
 * @param light the light for which to return information. One of:<br><table><tr><td>{@link #GL_LIGHT0 LIGHT0}</td><td>GL_LIGHT[1-7]</td></tr></table>
 * @param pname the light parameter to query. One of:<br><table><tr><td>{@link #GL_AMBIENT AMBIENT}</td><td>{@link #GL_DIFFUSE DIFFUSE}</td><td>{@link #GL_SPECULAR SPECULAR}</td><td>{@link #GL_POSITION POSITION}</td><td>{@link #GL_CONSTANT_ATTENUATION CONSTANT_ATTENUATION}</td><td>{@link #GL_LINEAR_ATTENUATION LINEAR_ATTENUATION}</td></tr><tr><td>{@link #GL_QUADRATIC_ATTENUATION QUADRATIC_ATTENUATION}</td><td>{@link #GL_SPOT_DIRECTION SPOT_DIRECTION}</td><td>{@link #GL_SPOT_EXPONENT SPOT_EXPONENT}</td><td>{@link #GL_SPOT_CUTOFF SPOT_CUTOFF}</td></tr></table>
 * @param data  a scalar or buffer in which to place the returned data
 *
 * @see <a href="https://docs.gl/gl3/glGetLight">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glGetLightiv(int light, int pname, IntBuffer data);

/**
 * Array version of: {@link #glGetLightiv GetLightiv}
 *
 * @see <a href="https://docs.gl/gl3/glGetLight">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glGetLightiv(int light, int pname, int[] data);

}
