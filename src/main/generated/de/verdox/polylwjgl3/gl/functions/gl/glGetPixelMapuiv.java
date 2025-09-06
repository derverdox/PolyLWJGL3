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

public interface glGetPixelMapuiv {

/**
 * Unsafe version of: {@link #glGetPixelMapuiv GetPixelMapuiv}
 */
    public void nglGetPixelMapuiv(int map, long data);

/**
 * Unsigned integer version of {@link #glGetPixelMapfv GetPixelMapfv}.
 *
 * @param map  the pixel map parameter to query
 * @param data a buffer in which to place the returned data
 *
 * @see <a href="https://docs.gl/gl3/glGetPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glGetPixelMapuiv(@NativeType("GLenum") int map, @NativeType("GLuint *") IntBuffer data);

/**
 * Unsigned integer version of {@link #glGetPixelMapfv GetPixelMapfv}.
 *
 * @param map  the pixel map parameter to query
 * @param data a buffer in which to place the returned data
 *
 * @see <a href="https://docs.gl/gl3/glGetPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glGetPixelMapuiv(@NativeType("GLenum") int map, @NativeType("GLuint *") long data);

/**
 * Array version of: {@link #glGetPixelMapuiv GetPixelMapuiv}
 *
 * @see <a href="https://docs.gl/gl3/glGetPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glGetPixelMapuiv(@NativeType("GLenum") int map, @NativeType("GLuint *") int[] data);

}
