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

public interface glFeedbackBuffer {

/**
 * Unsafe version of: {@link #glFeedbackBuffer FeedbackBuffer}
 *
 * @param size the maximum number of values that can be written to {@code buffer}
 */
    public void nglFeedbackBuffer(int size, int type, long buffer);

/**
 * Returns information about primitives when the GL is in feedback mode.
 *
 * @param type   the type of information to feed back for each vertex. One of:<br><table><tr><td>{@link #GL_2D 2D}</td><td>{@link #GL_3D 3D}</td><td>{@link #GL_3D_COLOR 3D_COLOR}</td><td>{@link #GL_3D_COLOR_TEXTURE 3D_COLOR_TEXTURE}</td><td>{@link #GL_4D_COLOR_TEXTURE 4D_COLOR_TEXTURE}</td></tr></table>
 * @param buffer an array of floating-point values into which feedback information will be placed
 *
 * @see <a href="https://docs.gl/gl3/glFeedbackBuffer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glFeedbackBuffer(@NativeType("GLenum") int type, @NativeType("GLfloat *") FloatBuffer buffer);

/**
 * Array version of: {@link #glFeedbackBuffer FeedbackBuffer}
 *
 * @see <a href="https://docs.gl/gl3/glFeedbackBuffer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glFeedbackBuffer(@NativeType("GLenum") int type, @NativeType("GLfloat *") float[] buffer);

}
