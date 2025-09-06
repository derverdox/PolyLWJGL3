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

public interface glRasterPos2sv {

/**
 * Unsafe version of: {@link #glRasterPos2sv RasterPos2sv}
 */
    public void nglRasterPos2sv(long coords);

/**
 * Pointer version of {@link #glRasterPos2s RasterPos2s}.
 *
 * @param coords the raster position buffer
 *
 * @see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glRasterPos2sv(@NativeType("GLshort const *") ShortBuffer coords);

/**
 * Array version of: {@link #glRasterPos2sv RasterPos2sv}
 *
 * @see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glRasterPos2sv(@NativeType("GLshort const *") short[] coords);

}
