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

public interface glRasterPos3dv {

/**
 * Unsafe version of: {@link #glRasterPos3dv RasterPos3dv}
 */
    public void nglRasterPos3dv(long coords);

/**
 * Pointer version of {@link #glRasterPos3d RasterPos3d}.
 *
 * @param coords the raster position buffer
 *
 * @see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glRasterPos3dv(DoubleBuffer coords);

/**
 * Array version of: {@link #glRasterPos3dv RasterPos3dv}
 *
 * @see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glRasterPos3dv(double[] coords);

}
