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

public interface glGetNamedRenderbufferParameteriv {

/**
 * Unsafe version of: {@link #glGetNamedRenderbufferParameteriv GetNamedRenderbufferParameteriv}
 */
    public void nglGetNamedRenderbufferParameteriv(int renderbuffer, int pname, long params);

/**
 * DSA version of {@link GL30C#glGetRenderbufferParameteriv GetRenderbufferParameteriv}.
 *
 * @param pname  the parameter whose value to retrieve from the renderbuffer bound to {@code target}. One of:<br><table><tr><td>{@link GL30#GL_RENDERBUFFER_WIDTH RENDERBUFFER_WIDTH}</td><td>{@link GL30#GL_RENDERBUFFER_HEIGHT RENDERBUFFER_HEIGHT}</td><td>{@link GL30#GL_RENDERBUFFER_INTERNAL_FORMAT RENDERBUFFER_INTERNAL_FORMAT}</td></tr><tr><td>{@link GL30#GL_RENDERBUFFER_RED_SIZE RENDERBUFFER_RED_SIZE}</td><td>{@link GL30#GL_RENDERBUFFER_GREEN_SIZE RENDERBUFFER_GREEN_SIZE}</td><td>{@link GL30#GL_RENDERBUFFER_BLUE_SIZE RENDERBUFFER_BLUE_SIZE}</td></tr><tr><td>{@link GL30#GL_RENDERBUFFER_ALPHA_SIZE RENDERBUFFER_ALPHA_SIZE}</td><td>{@link GL30#GL_RENDERBUFFER_DEPTH_SIZE RENDERBUFFER_DEPTH_SIZE}</td><td>{@link GL30#GL_RENDERBUFFER_STENCIL_SIZE RENDERBUFFER_STENCIL_SIZE}</td></tr><tr><td>{@link GL30#GL_RENDERBUFFER_SAMPLES RENDERBUFFER_SAMPLES}</td></tr></table>
 * @param params an array to receive the value of the queried parameter
 *
 * @see <a href="https://docs.gl/gl4/glGetRenderbufferParameter">Reference Page</a>
 */
    public void glGetNamedRenderbufferParameteriv(int renderbuffer, int pname, IntBuffer params);

/**
 * Array version of: {@link #glGetNamedRenderbufferParameteriv GetNamedRenderbufferParameteriv}
 *
 * @see <a href="https://docs.gl/gl4/glGetRenderbufferParameter">Reference Page</a>
 */
    public void glGetNamedRenderbufferParameteriv(int renderbuffer, int pname, int[] params);

}
