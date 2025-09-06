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

public interface glGetTransformFeedbackiv {

/**
 * Unsafe version of: {@link #glGetTransformFeedbackiv GetTransformFeedbackiv}
 */
    public void nglGetTransformFeedbackiv(int xfb, int pname, long param);

/**
 * Returns information about a transform feedback object.
 *
 * @param xfb   zero or the name of an existing transform feedback object
 * @param pname the parameter to query. One of:<br><table><tr><td>{@link GL42#GL_TRANSFORM_FEEDBACK_PAUSED TRANSFORM_FEEDBACK_PAUSED}</td><td>{@link GL42#GL_TRANSFORM_FEEDBACK_ACTIVE TRANSFORM_FEEDBACK_ACTIVE}</td></tr></table>
 * @param param the buffer in which to return the parameter value
 *
 * @see <a href="https://docs.gl/gl4/glGetTransformFeedback">Reference Page</a>
 */
    public void glGetTransformFeedbackiv(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer param);

/**
 * Array version of: {@link #glGetTransformFeedbackiv GetTransformFeedbackiv}
 *
 * @see <a href="https://docs.gl/gl4/glGetTransformFeedback">Reference Page</a>
 */
    public void glGetTransformFeedbackiv(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] param);

}
