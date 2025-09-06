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

public interface glMateriali {

/**
 * Sets the integer value of a material parameter.
 *
 * @param face  the material face for which to set the parameter. One of:<br><table><tr><td>{@link #GL_FRONT FRONT}</td><td>{@link #GL_BACK BACK}</td><td>{@link #GL_FRONT_AND_BACK FRONT_AND_BACK}</td></tr></table>
 * @param pname the parameter to set. Must be:<br><table><tr><td>{@link #GL_SHININESS SHININESS}</td></tr></table>
 * @param param the parameter value
 *
 * @see <a href="https://docs.gl/gl3/glMateriali">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glMateriali(int face, int pname, int param);

}
