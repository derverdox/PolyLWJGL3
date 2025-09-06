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

public interface glColorMaterial {

/**
 * It is possible to attach one or more material properties to the current color, so that they continuously track its component values. This behavior is
 * enabled and disabled by calling {@link #glEnable Enable} or {@link #glDisable Disable} with the symbolic value {@link #GL_COLOR_MATERIAL COLOR_MATERIAL}. This function controls which
 * of these modes is selected.
 *
 * @param face specifies which material face is affected by the current color. One of:<br><table><tr><td>{@link #GL_FRONT FRONT}</td><td>{@link #GL_BACK BACK}</td><td>{@link #GL_FRONT_AND_BACK FRONT_AND_BACK}</td></tr></table>
 * @param mode specifies which material property or properties track the current color. One of:<br><table><tr><td>{@link #GL_EMISSION EMISSION}</td><td>{@link #GL_AMBIENT AMBIENT}</td><td>{@link #GL_DIFFUSE DIFFUSE}</td><td>{@link #GL_SPECULAR SPECULAR}</td><td>{@link #GL_AMBIENT_AND_DIFFUSE AMBIENT_AND_DIFFUSE}</td></tr></table>
 *
 * @see <a href="https://docs.gl/gl3/glColorMaterial">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glColorMaterial(int face, int mode);

}
