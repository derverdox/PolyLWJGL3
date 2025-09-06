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

public interface glClearNamedFramebufferuiv {

/**
 * Unsafe version of: {@link #glClearNamedFramebufferuiv ClearNamedFramebufferuiv}
 */
    public void nglClearNamedFramebufferuiv(int framebuffer, int buffer, int drawbuffer, long value);

/**
 * DSA version of {@link GL30C#glClearBufferuiv ClearBufferuiv}.
 *
 * @param framebuffer the framebuffer name
 * @param buffer      the buffer to clear. Must be:<br><table><tr><td>{@link GL11#GL_COLOR COLOR}</td></tr></table>
 * @param drawbuffer  the draw buffer to clear
 * @param value       a pointer to a four-element vector specifying R, G, B and A values to clear the buffer to
 *
 * @see <a href="https://docs.gl/gl4/glClearFramebuffer">Reference Page</a>
 */
    public void glClearNamedFramebufferuiv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLint const *") IntBuffer value);

/**
 * Array version of: {@link #glClearNamedFramebufferuiv ClearNamedFramebufferuiv}
 *
 * @see <a href="https://docs.gl/gl4/glClearFramebuffer">Reference Page</a>
 */
    public void glClearNamedFramebufferuiv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLint const *") int[] value);

}
