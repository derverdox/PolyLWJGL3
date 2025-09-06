package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl21.GL21Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl21.GL21AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL30;
import org.lwjgl.system.*;

public interface glClampColor {

/**
 * Controls color clamping.
 *
 * @param target target for color clamping. Must be:<br><table><tr><td>{@link GL30C#GL_CLAMP_READ_COLOR CLAMP_READ_COLOR}</td></tr></table>
 * @param clamp  whether to apply color clamping. One of:<br><table><tr><td>{@link GL11#GL_TRUE TRUE}</td><td>{@link GL11#GL_FALSE FALSE}</td><td>{@link GL30C#GL_FIXED_ONLY FIXED_ONLY}</td></tr></table>
 *
 * @see <a href="https://docs.gl/gl4/glClampColor">Reference Page</a>
 */
    public void glClampColor(@NativeType("GLenum") int target, @NativeType("GLenum") int clamp);

}
