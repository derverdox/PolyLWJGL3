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

public interface glRasterPos4f {

/**
 * Float version of RasterPos4i.
 *
 * @param x the {@code x} raster coordinate
 * @param y the {@code y} raster coordinate
 * @param z the {@code z} raster coordinate
 * @param w the {@code w} raster coordinate
 *
 * @see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glRasterPos4f(float x, float y, float z, float w);

}
