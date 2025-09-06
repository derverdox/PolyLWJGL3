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

public interface glRectf {

/**
 * Float version of {@link #glRecti Recti}.
 *
 * @param x1 the x coordinate of the first corner vertex
 * @param y1 the y coordinate of the first corner vertex
 * @param x2 the x coordinate of the second corner vertex
 * @param y2 the y coordinate of the second corner vertex
 *
 * @see <a href="https://docs.gl/gl3/glRectf">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glRectf(float x1, float y1, float x2, float y2);

}
