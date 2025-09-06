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

public interface glRasterPos3fv {

/**
 * Unsafe version of: {@link #glRasterPos3fv RasterPos3fv}
 */
    public void nglRasterPos3fv(long coords);

/**
 * Pointer version of {@link #glRasterPos3f RasterPos3f}.
 *
 * @param coords the raster position buffer
 *
 * @see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glRasterPos3fv(@NativeType("GLfloat const *") FloatBuffer coords);

/**
 * Array version of: {@link #glRasterPos3fv RasterPos3fv}
 *
 * @see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glRasterPos3fv(@NativeType("GLfloat const *") float[] coords);

}
