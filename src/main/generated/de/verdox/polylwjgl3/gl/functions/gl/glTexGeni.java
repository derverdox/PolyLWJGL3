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

public interface glTexGeni {

/**
 * Sets an integer texture coordinate generation parameter.
 *
 * <p>A texture coordinate generation function is enabled or disabled using {@link #glEnable Enable} and {@link #glDisable Disable} with an argument of
 * {@link #GL_TEXTURE_GEN_S TEXTURE_GEN_S}, {@link #GL_TEXTURE_GEN_T TEXTURE_GEN_T}, {@link #GL_TEXTURE_GEN_R TEXTURE_GEN_R}, or {@link #GL_TEXTURE_GEN_Q TEXTURE_GEN_Q} (each indicates the corresponding texture
 * coordinate). When enabled, the specified texture coordinate is computed according to the current {@link #GL_EYE_LINEAR EYE_LINEAR}, {@link #GL_OBJECT_LINEAR OBJECT_LINEAR} or
 * {@link #GL_SPHERE_MAP SPHERE_MAP} specification, depending on the current setting of {@link #GL_TEXTURE_GEN_MODE TEXTURE_GEN_MODE} for that coordinate. When disabled, subsequent
 * vertices will take the indicated texture coordinate from the current texture coordinates.</p>
 *
 * <p>The initial state has the texture generation function disabled for all texture coordinates. Initially all texture generation modes are EYE_LINEAR.</p>
 *
 * @param coord the coordinate for which to set the parameter. One of:<br><table><tr><td>{@link #GL_S S}</td><td>{@link #GL_T T}</td><td>{@link #GL_R R}</td><td>{@link #GL_Q Q}</td></tr></table>
 * @param pname the parameter to set. Must be:<br><table><tr><td>{@link #GL_TEXTURE_GEN_MODE TEXTURE_GEN_MODE}</td></tr></table>
 * @param param the parameter value. One of:<br><table><tr><td>{@link #GL_OBJECT_LINEAR OBJECT_LINEAR}</td><td>{@link #GL_EYE_LINEAR EYE_LINEAR}</td><td>{@link #GL_SPHERE_MAP SPHERE_MAP}</td><td>{@link GL13#GL_REFLECTION_MAP REFLECTION_MAP}</td><td>{@link GL13#GL_NORMAL_MAP NORMAL_MAP}</td></tr></table>
 *
 * @see <a href="https://docs.gl/gl3/glTexGeni">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glTexGeni(int coord, int pname, int param);

}
