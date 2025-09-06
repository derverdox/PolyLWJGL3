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

public interface glLoadIdentity {

/**
 * Sets the current matrix to the identity matrix.
 *
 * <p>Calling this function is equivalent to calling {@link #glLoadMatrixf LoadMatrixf} with the following matrix:</p>
 *
 * <table class=striped>
 * <tr><td>1</td><td>0</td><td>0</td><td>0</td></tr>
 * <tr><td>0</td><td>1</td><td>0</td><td>0</td></tr>
 * <tr><td>0</td><td>0</td><td>1</td><td>0</td></tr>
 * <tr><td>0</td><td>0</td><td>0</td><td>1</td></tr>
 * </table>
 *
 * @see <a href="https://docs.gl/gl3/glLoadIdentity">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glLoadIdentity();

}
