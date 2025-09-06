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

public interface glColor4s {

/**
 * Short version of {@link #glColor4b Color4b}
 *
 * @param red   the red component of the current color
 * @param green the green component of the current color
 * @param blue  the blue component of the current color
 * @param alpha the alpha component of the current color
 *
 * @see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glColor4s(@NativeType("GLshort") short red, @NativeType("GLshort") short green, @NativeType("GLshort") short blue, @NativeType("GLshort") short alpha);

}
