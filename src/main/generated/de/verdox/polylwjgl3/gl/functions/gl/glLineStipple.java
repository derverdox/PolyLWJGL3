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

public interface glLineStipple {

/**
 * Defines a line stipple. It determines those fragments that are to be drawn when the line is rasterized. Line stippling may be enabled or disabled using
 * {@link #glEnable Enable} or {@link #glDisable Disable} with the constant {@link #GL_LINE_STIPPLE LINE_STIPPLE}. When disabled, it is as if the line stipple has its default value.
 *
 * @param factor  a count that is used to modify the effective line stipple by causing each bit in pattern to be used {@code factor} times. {@code factor} is clamped
 *                to the range [1, 256].
 * @param pattern an unsigned short integer whose 16 bits define the stipple pattern
 *
 * @see <a href="https://docs.gl/gl3/glLineStipple">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glLineStipple(@NativeType("GLint") int factor, @NativeType("GLushort") short pattern);

}
