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

public interface glGetPolygonStipple {

/**
 * Unsafe version of: {@link #glGetPolygonStipple GetPolygonStipple}
 */
    public void nglGetPolygonStipple(long pattern);

/**
 * Obtains the polygon stipple.
 *
 * @param pattern a buffer in which to place the returned data
 *
 * @see <a href="https://docs.gl/gl3/glGetPolygonStipple">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glGetPolygonStipple(ByteBuffer pattern);

/**
 * Obtains the polygon stipple.
 *
 * @param pattern a buffer in which to place the returned data
 *
 * @see <a href="https://docs.gl/gl3/glGetPolygonStipple">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glGetPolygonStipple(long pattern);

}
