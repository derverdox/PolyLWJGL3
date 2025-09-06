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

public interface glScalef {

/**
 * Manipulates the current matrix with a general scaling matrix along the x-, y- and z- axes.
 *
 * <p>Calling this function is equivalent to calling {@link #glMultMatrixf MultMatrixf} with the following matrix:</p>
 *
 * <table class=striped>
 * <tr><td>x</td><td>0</td><td>0</td><td>0</td></tr>
 * <tr><td>0</td><td>y</td><td>0</td><td>0</td></tr>
 * <tr><td>0</td><td>0</td><td>z</td><td>0</td></tr>
 * <tr><td>0</td><td>0</td><td>0</td><td>1</td></tr>
 * </table>
 *
 * @param x the x-axis scaling factor
 * @param y the y-axis scaling factor
 * @param z the z-axis scaling factor
 *
 * @see <a href="https://docs.gl/gl3/glScalef">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glScalef(float x, float y, float z);

}
