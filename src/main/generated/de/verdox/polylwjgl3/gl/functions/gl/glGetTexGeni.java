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

public interface glGetTexGeni {

/**
 * Returns integer information about {@code pname} for {@code coord} in {@code data}.
 *
 * @param coord the coord to query. One of:<br><table><tr><td>{@link #GL_S S}</td><td>{@link #GL_T T}</td><td>{@link #GL_R R}</td><td>{@link #GL_Q Q}</td></tr></table>
 * @param pname the parameter to query. One of:<br><table><tr><td>{@link #GL_EYE_PLANE EYE_PLANE}</td><td>{@link #GL_OBJECT_PLANE OBJECT_PLANE}</td><td>{@link #GL_TEXTURE_GEN_MODE TEXTURE_GEN_MODE}</td></tr></table>
 *
 * @see <a href="https://docs.gl/gl3/glGetTexGen">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public int glGetTexGeni(int coord, int pname);

}
