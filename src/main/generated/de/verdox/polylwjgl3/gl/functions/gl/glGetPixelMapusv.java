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

public interface glGetPixelMapusv {

/**
 * Unsafe version of: {@link #glGetPixelMapusv GetPixelMapusv}
 */
    public void nglGetPixelMapusv(int map, long data);

/**
 * Unsigned short version of {@link #glGetPixelMapfv GetPixelMapfv}.
 *
 * @param map  the pixel map parameter to query
 * @param data a buffer in which to place the returned data
 *
 * @see <a href="https://docs.gl/gl3/glGetPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glGetPixelMapusv(@NativeType("GLenum") int map, @NativeType("GLushort *") ShortBuffer data);

/**
 * Unsigned short version of {@link #glGetPixelMapfv GetPixelMapfv}.
 *
 * @param map  the pixel map parameter to query
 * @param data a buffer in which to place the returned data
 *
 * @see <a href="https://docs.gl/gl3/glGetPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glGetPixelMapusv(@NativeType("GLenum") int map, @NativeType("GLushort *") long data);

/**
 * Array version of: {@link #glGetPixelMapusv GetPixelMapusv}
 *
 * @see <a href="https://docs.gl/gl3/glGetPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glGetPixelMapusv(@NativeType("GLenum") int map, @NativeType("GLushort *") short[] data);

}
