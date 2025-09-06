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

public interface glTexCoord4f {

/**
 * Sets the current four-dimensional texture coordinate.
 *
 * @param s the s component of the current texture coordinates
 * @param t the t component of the current texture coordinates
 * @param r the r component of the current texture coordinates
 * @param q the q component of the current texture coordinates
 *
 * @see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glTexCoord4f(float s, float t, float r, float q);

}
