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

public interface glTexCoord3f {

/**
 * Sets the current three-dimensional texture coordinate. {@code q} is implicitly set to 1.
 *
 * @param s the s component of the current texture coordinates
 * @param t the t component of the current texture coordinates
 * @param r the r component of the current texture coordinates
 *
 * @see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glTexCoord3f(@NativeType("GLfloat") float s, @NativeType("GLfloat") float t, @NativeType("GLfloat") float r);

}
