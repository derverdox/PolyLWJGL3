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

public interface glPixelMapfv {

/**
 * Unsafe version of: {@link #glPixelMapfv PixelMapfv}
 *
 * @param size the map size
 */
    public void nglPixelMapfv(int map, int size, long values);

/**
 * Sets a pixel map lookup table.
 *
 * @param map    the map to set. One of:<br><table><tr><td>{@link #GL_PIXEL_MAP_I_TO_I PIXEL_MAP_I_TO_I}</td><td>{@link #GL_PIXEL_MAP_S_TO_S PIXEL_MAP_S_TO_S}</td><td>{@link #GL_PIXEL_MAP_I_TO_R PIXEL_MAP_I_TO_R}</td><td>{@link #GL_PIXEL_MAP_I_TO_G PIXEL_MAP_I_TO_G}</td><td>{@link #GL_PIXEL_MAP_I_TO_B PIXEL_MAP_I_TO_B}</td></tr><tr><td>{@link #GL_PIXEL_MAP_I_TO_A PIXEL_MAP_I_TO_A}</td><td>{@link #GL_PIXEL_MAP_R_TO_R PIXEL_MAP_R_TO_R}</td><td>{@link #GL_PIXEL_MAP_G_TO_G PIXEL_MAP_G_TO_G}</td><td>{@link #GL_PIXEL_MAP_B_TO_B PIXEL_MAP_B_TO_B}</td><td>{@link #GL_PIXEL_MAP_A_TO_A PIXEL_MAP_A_TO_A}</td></tr></table>
 * @param size   the map size
 * @param values the map values
 *
 * @see <a href="https://docs.gl/gl3/glPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glPixelMapfv(int map, int size, long values);

/**
 * Sets a pixel map lookup table.
 *
 * @param map    the map to set. One of:<br><table><tr><td>{@link #GL_PIXEL_MAP_I_TO_I PIXEL_MAP_I_TO_I}</td><td>{@link #GL_PIXEL_MAP_S_TO_S PIXEL_MAP_S_TO_S}</td><td>{@link #GL_PIXEL_MAP_I_TO_R PIXEL_MAP_I_TO_R}</td><td>{@link #GL_PIXEL_MAP_I_TO_G PIXEL_MAP_I_TO_G}</td><td>{@link #GL_PIXEL_MAP_I_TO_B PIXEL_MAP_I_TO_B}</td></tr><tr><td>{@link #GL_PIXEL_MAP_I_TO_A PIXEL_MAP_I_TO_A}</td><td>{@link #GL_PIXEL_MAP_R_TO_R PIXEL_MAP_R_TO_R}</td><td>{@link #GL_PIXEL_MAP_G_TO_G PIXEL_MAP_G_TO_G}</td><td>{@link #GL_PIXEL_MAP_B_TO_B PIXEL_MAP_B_TO_B}</td><td>{@link #GL_PIXEL_MAP_A_TO_A PIXEL_MAP_A_TO_A}</td></tr></table>
 * @param values the map values
 *
 * @see <a href="https://docs.gl/gl3/glPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glPixelMapfv(int map, FloatBuffer values);

/**
 * Array version of: {@link #glPixelMapfv PixelMapfv}
 *
 * @see <a href="https://docs.gl/gl3/glPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glPixelMapfv(int map, float[] values);

}
