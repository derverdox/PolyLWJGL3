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

public interface glRasterPos4sv {

/**
 * Unsafe version of: {@link #glRasterPos4sv RasterPos4sv}
 */
    public void nglRasterPos4sv(long coords);

/**
 * Pointer version of {@link #glRasterPos4s RasterPos4s}.
 *
 * @param coords the raster position buffer
 *
 * @see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glRasterPos4sv(ShortBuffer coords);

/**
 * Array version of: {@link #glRasterPos4sv RasterPos4sv}
 *
 * @see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glRasterPos4sv(short[] coords);

}
