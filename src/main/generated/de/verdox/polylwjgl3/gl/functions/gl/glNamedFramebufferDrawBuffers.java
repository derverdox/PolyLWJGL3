package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl44.GL44Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl44.GL44AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL45;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glNamedFramebufferDrawBuffers {

/**
 * Unsafe version of: {@link #glNamedFramebufferDrawBuffers NamedFramebufferDrawBuffers}
 *
 * @param n the number of buffers in {@code bufs}
 */
    public void nglNamedFramebufferDrawBuffers(int framebuffer, int n, long bufs);

/**
 * DSA version of {@link GL20C#glDrawBuffers DrawBuffers}.
 *
 * @param framebuffer the framebuffer name
 * @param bufs        an array of symbolic constants specifying the buffers into which fragment colors or data values will be written. One of:<br><table><tr><td>{@link GL11#GL_NONE NONE}</td><td>{@link GL11#GL_FRONT_LEFT FRONT_LEFT}</td><td>{@link GL11#GL_FRONT_RIGHT FRONT_RIGHT}</td><td>{@link GL11#GL_BACK_LEFT BACK_LEFT}</td><td>{@link GL11#GL_BACK_RIGHT BACK_RIGHT}</td><td>{@link GL30#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td></tr><tr><td>GL30.GL_COLOR_ATTACHMENT[1-15]</td></tr></table>
 *
 * @see <a href="https://docs.gl/gl4/glFramebufferDrawBuffers">Reference Page</a>
 */
    public void glNamedFramebufferDrawBuffers(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") IntBuffer bufs);

/**
 * DSA version of {@link GL20C#glDrawBuffers DrawBuffers}.
 *
 * @param framebuffer the framebuffer name
 *
 * @see <a href="https://docs.gl/gl4/glFramebufferDrawBuffers">Reference Page</a>
 */
    public void glNamedFramebufferDrawBuffers(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") int buf);

/**
 * Array version of: {@link #glNamedFramebufferDrawBuffers NamedFramebufferDrawBuffers}
 *
 * @see <a href="https://docs.gl/gl4/glFramebufferDrawBuffers">Reference Page</a>
 */
    public void glNamedFramebufferDrawBuffers(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") int[] bufs);

}
