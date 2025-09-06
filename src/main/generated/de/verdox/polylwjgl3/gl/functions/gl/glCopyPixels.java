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

public interface glCopyPixels {

/**
 * Transfers a rectangle of pixel values from one region of the read framebuffer to another in the draw framebuffer
 *
 * @param x      the left framebuffer pixel coordinate
 * @param y      the lower framebuffer pixel coordinate
 * @param width  the rectangle width
 * @param height the rectangle height
 * @param type   Indicates the type of values to be transfered. One of:<br><table><tr><td>{@link #GL_COLOR COLOR}</td><td>{@link #GL_STENCIL STENCIL}</td><td>{@link #GL_DEPTH DEPTH}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
 *
 * @see <a href="https://docs.gl/gl3/glCopyPixels">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glCopyPixels(int x, int y, int width, int height, int type);

}
