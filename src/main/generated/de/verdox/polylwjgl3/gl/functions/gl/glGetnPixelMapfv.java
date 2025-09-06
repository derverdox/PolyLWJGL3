package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl44.GL44Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl44.GL44AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL45;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glGetnPixelMapfv {

/**
 * Unsafe version of: {@link #glGetnPixelMapfv GetnPixelMapfv}
 *
 * @param bufSize the maximum number of bytes to write into {@code data}
 */
    public void nglGetnPixelMapfv(int map, int bufSize, long data);

/**
 * Robust version of {@link GL11#glGetPixelMapfv GetPixelMapfv}
 *
 * @param map  the pixel map parameter to query. One of:<br><table><tr><td>{@link GL11#GL_PIXEL_MAP_I_TO_I PIXEL_MAP_I_TO_I}</td><td>{@link GL11#GL_PIXEL_MAP_S_TO_S PIXEL_MAP_S_TO_S}</td><td>{@link GL11#GL_PIXEL_MAP_I_TO_R PIXEL_MAP_I_TO_R}</td><td>{@link GL11#GL_PIXEL_MAP_I_TO_G PIXEL_MAP_I_TO_G}</td><td>{@link GL11#GL_PIXEL_MAP_I_TO_B PIXEL_MAP_I_TO_B}</td></tr><tr><td>{@link GL11#GL_PIXEL_MAP_I_TO_A PIXEL_MAP_I_TO_A}</td><td>{@link GL11#GL_PIXEL_MAP_R_TO_R PIXEL_MAP_R_TO_R}</td><td>{@link GL11#GL_PIXEL_MAP_G_TO_G PIXEL_MAP_G_TO_G}</td><td>{@link GL11#GL_PIXEL_MAP_B_TO_B PIXEL_MAP_B_TO_B}</td><td>{@link GL11#GL_PIXEL_MAP_A_TO_A PIXEL_MAP_A_TO_A}</td></tr></table>
 * @param data a buffer in which to place the returned data
 *
 * @see <a href="https://docs.gl/gl4/glGetPixelMap">Reference Page</a>
 */
    public void glGetnPixelMapfv(int map, FloatBuffer data);

/**
 * Array version of: {@link #glGetnPixelMapfv GetnPixelMapfv}
 *
 * @see <a href="https://docs.gl/gl4/glGetPixelMap">Reference Page</a>
 */
    public void glGetnPixelMapfv(int map, float[] data);

}
