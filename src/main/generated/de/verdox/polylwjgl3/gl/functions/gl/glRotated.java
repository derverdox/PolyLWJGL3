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

public interface glRotated {

/**
 * Double version of {@link #glRotatef Rotatef}.
 *
 * @param angle the angle of rotation in degrees
 * @param x     the x coordinate of the rotation vector
 * @param y     the y coordinate of the rotation vector
 * @param z     the z coordinate of the rotation vector
 *
 * @see <a href="https://docs.gl/gl3/glRotated">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glRotated(double angle, double x, double y, double z);

}
