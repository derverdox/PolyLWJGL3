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

public interface glListBase {

/**
 * Sets the display list base.
 *
 * @param base the display list base offset
 *
 * @see <a href="https://docs.gl/gl3/glListBase">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glListBase(int base);

}
