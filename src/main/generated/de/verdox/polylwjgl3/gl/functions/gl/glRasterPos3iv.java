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

public interface glRasterPos3iv {

/**
 * Unsafe version of: {@link #glRasterPos3iv RasterPos3iv}
 */
    public void nglRasterPos3iv(long coords);

/**
 * Pointer version of {@link #glRasterPos3i RasterPos3i}.
 *
 * @param coords the raster position buffer
 *
 * @see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glRasterPos3iv(@NativeType("GLint const *") IntBuffer coords);

/**
 * Array version of: {@link #glRasterPos3iv RasterPos3iv}
 *
 * @see <a href="https://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glRasterPos3iv(@NativeType("GLint const *") int[] coords);

}
