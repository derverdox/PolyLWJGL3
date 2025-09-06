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

public interface glVertex2f {

/**
 * Specifies a single vertex between {@link #glBegin Begin} and {@link #glEnd End} by giving its coordinates in two dimensions. The z coordinate is implicitly set
 * to zero and the w coordinate to one.
 *
 * @param x the vertex x coordinate
 * @param y the vertex y coordinate
 *
 * @see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glVertex2f(@NativeType("GLfloat") float x, @NativeType("GLfloat") float y);

}
