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

public interface glPixelMapusv {

/**
 * Unsafe version of: {@link #glPixelMapusv PixelMapusv}
 *
 * @param size the map size
 */
    public void nglPixelMapusv(int map, int size, long values);

/**
 * Unsigned short version of {@link #glPixelMapfv PixelMapfv}.
 *
 * @param map    the map to set
 * @param size   the map size
 * @param values the map values
 *
 * @see <a href="https://docs.gl/gl3/glPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glPixelMapusv(int map, int size, long values);

/**
 * Unsigned short version of {@link #glPixelMapfv PixelMapfv}.
 *
 * @param map    the map to set
 * @param values the map values
 *
 * @see <a href="https://docs.gl/gl3/glPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glPixelMapusv(int map, ShortBuffer values);

/**
 * Array version of: {@link #glPixelMapusv PixelMapusv}
 *
 * @see <a href="https://docs.gl/gl3/glPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glPixelMapusv(int map, short[] values);

}
