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

public interface glClearIndex {

/**
 * sets the clear color index. index is converted to a fixed-point value with unspecified precision to the left of the binary point; the integer part of
 * this value is then masked with <code>2<sup>m</sup> &ndash; 1</code>, where {@code m} is the number of bits in a color index value stored in the
 * framebuffer.
 *
 * @param index the value to which to clear the color buffer in color index mode
 *
 * @see <a href="https://docs.gl/gl3/glClearIndex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glClearIndex(@NativeType("GLfloat") float index);

}
