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

public interface glDrawBuffer {

/**
 * Defines the color buffer to which fragment color zero is written.
 *
 * <p>Acceptable values for {@code buf} depend on whether the GL is using the default framebuffer (i.e., {@link GL30#GL_DRAW_FRAMEBUFFER_BINDING DRAW_FRAMEBUFFER_BINDING} is zero), or
 * a framebuffer object (i.e., {@link GL30#GL_DRAW_FRAMEBUFFER_BINDING DRAW_FRAMEBUFFER_BINDING} is non-zero). In the initial state, the GL is bound to the default framebuffer.</p>
 *
 * @param buf the color buffer to draw to. One of:<br><table><tr><td>{@link GL11C#GL_NONE NONE}</td><td>{@link GL11C#GL_FRONT_LEFT FRONT_LEFT}</td><td>{@link GL11C#GL_FRONT_RIGHT FRONT_RIGHT}</td><td>{@link GL11C#GL_BACK_LEFT BACK_LEFT}</td><td>{@link GL11C#GL_BACK_RIGHT BACK_RIGHT}</td><td>{@link GL11C#GL_FRONT FRONT}</td><td>{@link GL11C#GL_BACK BACK}</td><td>{@link GL11C#GL_LEFT LEFT}</td></tr><tr><td>{@link GL11C#GL_RIGHT RIGHT}</td><td>{@link GL11C#GL_FRONT_AND_BACK FRONT_AND_BACK}</td><td>{@link GL30#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>GL30.GL_COLOR_ATTACHMENT[1-15]</td></tr></table>
 *
 * @see <a href="https://docs.gl/gl4/glDrawBuffer">Reference Page</a>
 */
    public void glDrawBuffer(int buf);

}
