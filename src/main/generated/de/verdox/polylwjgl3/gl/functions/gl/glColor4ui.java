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

public interface glColor4ui {

/**
 * Unsigned int version of {@link #glColor4b Color4b}
 *
 * @param red   the red component of the current color
 * @param green the green component of the current color
 * @param blue  the blue component of the current color
 * @param alpha the alpha component of the current color
 *
 * @see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glColor4ui(int red, int green, int blue, int alpha);

}
