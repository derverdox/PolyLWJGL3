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

public interface glRasterPos4i {

/**
 * Sets the four-dimensional current raster position. See {@link #glRasterPos2i RasterPos2i} for more details.
 *
 * @param x the {@code x} raster coordinate
 * @param y the {@code y} raster coordinate
 * @param z the {@code z} raster coordinate
 * @param w the {@code w} raster coordinate
 *
 * @see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glRasterPos4i(int x, int y, int z, int w);

}
