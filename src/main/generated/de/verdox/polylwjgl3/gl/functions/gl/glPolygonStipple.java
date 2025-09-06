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

public interface glPolygonStipple {

/**
 * Unsafe version of: {@link #glPolygonStipple PolygonStipple}
 */
    public void nglPolygonStipple(long pattern);

/**
 * Defines a polygon stipple. It works much the same way as {@link #glLineStipple LineStipple}, masking out certain fragments produced by rasterization so that they
 * are not sent to the next stage of the GL. This is the case regardless of the state of polygon antialiasing.
 *
 * <p>If x<sub>w</sub> and y<sub>w</sub> are the window coordinates of a rasterized polygon fragment, then that fragment is sent to the next stage of the GL
 * if and only if the bit of the pattern (x<sub>w</sub> mod 32, y<sub>w</sub> mod 32) is 1.</p>
 *
 * <p>Polygon stippling may be enabled or disabled with {@link #glEnable Enable} or {@link #glDisable Disable} using the constant {@link #GL_POLYGON_STIPPLE POLYGON_STIPPLE}. When disabled,
 * it is as if the stipple pattern were all ones.</p>
 *
 * @param pattern a pointer to memory into which a 32 &times; 32 pattern is packed
 *
 * @see <a href="https://docs.gl/gl3/glPolygonStipple">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glPolygonStipple(ByteBuffer pattern);

/**
 * Defines a polygon stipple. It works much the same way as {@link #glLineStipple LineStipple}, masking out certain fragments produced by rasterization so that they
 * are not sent to the next stage of the GL. This is the case regardless of the state of polygon antialiasing.
 *
 * <p>If x<sub>w</sub> and y<sub>w</sub> are the window coordinates of a rasterized polygon fragment, then that fragment is sent to the next stage of the GL
 * if and only if the bit of the pattern (x<sub>w</sub> mod 32, y<sub>w</sub> mod 32) is 1.</p>
 *
 * <p>Polygon stippling may be enabled or disabled with {@link #glEnable Enable} or {@link #glDisable Disable} using the constant {@link #GL_POLYGON_STIPPLE POLYGON_STIPPLE}. When disabled,
 * it is as if the stipple pattern were all ones.</p>
 *
 * @param pattern a pointer to memory into which a 32 &times; 32 pattern is packed
 *
 * @see <a href="https://docs.gl/gl3/glPolygonStipple">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glPolygonStipple(long pattern);

}
