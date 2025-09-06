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

public interface glColor3b {

/**
 * Sets the R, G, and B components of the current color. The alpha component is set to 1.0.
 *
 * @param red   the red component of the current color
 * @param green the green component of the current color
 * @param blue  the blue component of the current color
 *
 * @see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glColor3b(byte red, byte green, byte blue);

}
