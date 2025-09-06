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

public interface glPixelMapuiv {

/**
 * Unsafe version of: {@link #glPixelMapuiv PixelMapuiv}
 *
 * @param size the map size
 */
    public void nglPixelMapuiv(int map, int size, long values);

/**
 * Unsigned integer version of {@link #glPixelMapfv PixelMapfv}.
 *
 * @param map    the map to set
 * @param size   the map size
 * @param values the map values
 *
 * @see <a href="https://docs.gl/gl3/glPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glPixelMapuiv(@NativeType("GLenum") int map, @NativeType("GLsizei") int size, @NativeType("GLuint const *") long values);

/**
 * Unsigned integer version of {@link #glPixelMapfv PixelMapfv}.
 *
 * @param map    the map to set
 * @param values the map values
 *
 * @see <a href="https://docs.gl/gl3/glPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glPixelMapuiv(@NativeType("GLenum") int map, @NativeType("GLuint const *") IntBuffer values);

/**
 * Array version of: {@link #glPixelMapuiv PixelMapuiv}
 *
 * @see <a href="https://docs.gl/gl3/glPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glPixelMapuiv(@NativeType("GLenum") int map, @NativeType("GLuint const *") int[] values);

}
