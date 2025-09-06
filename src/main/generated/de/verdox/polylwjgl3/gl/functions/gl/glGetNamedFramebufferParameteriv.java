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

public interface glGetNamedFramebufferParameteriv {

/**
 * Unsafe version of: {@link #glGetNamedFramebufferParameteriv GetNamedFramebufferParameteriv}
 */
    public void nglGetNamedFramebufferParameteriv(int framebuffer, int pname, long params);

/**
 * DSA version of {@link GL43C#glGetFramebufferParameteriv GetFramebufferParameteriv}.
 *
 * @param framebuffer the framebuffer name
 * @param pname       a token indicating the parameter to be retrieved. One of:<br><table><tr><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_WIDTH FRAMEBUFFER_DEFAULT_WIDTH}</td><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_HEIGHT FRAMEBUFFER_DEFAULT_HEIGHT}</td></tr><tr><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_LAYERS FRAMEBUFFER_DEFAULT_LAYERS}</td><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_SAMPLES FRAMEBUFFER_DEFAULT_SAMPLES}</td></tr><tr><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS}</td></tr></table>
 * @param params      a variable to receive the value of the parameter named {@code pname}
 *
 * @see <a href="https://docs.gl/gl4/glGetFramebufferParameter">Reference Page</a>
 */
    public void glGetNamedFramebufferParameteriv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params);

/**
 * Array version of: {@link #glGetNamedFramebufferParameteriv GetNamedFramebufferParameteriv}
 *
 * @see <a href="https://docs.gl/gl4/glGetFramebufferParameter">Reference Page</a>
 */
    public void glGetNamedFramebufferParameteriv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params);

}
