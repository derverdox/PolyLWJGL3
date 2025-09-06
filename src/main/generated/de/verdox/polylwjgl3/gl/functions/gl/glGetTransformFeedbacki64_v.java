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

public interface glGetTransformFeedbacki64_v {

/**
 * Unsafe version of: {@link #glGetTransformFeedbacki64_v GetTransformFeedbacki64_v}
 */
    public void nglGetTransformFeedbacki64_v(int xfb, int pname, int index, long param);

/**
 * Returns information about a transform feedback object.
 *
 * @param xfb   zero or the name of an existing transform feedback object
 * @param pname the parameter to query. One of:<br><table><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER_START TRANSFORM_FEEDBACK_BUFFER_START}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER_SIZE TRANSFORM_FEEDBACK_BUFFER_SIZE}</td></tr></table>
 * @param index the transform feedback stream index
 * @param param the buffer in which to return the parameter value
 *
 * @see <a href="https://docs.gl/gl4/glGetTransformFeedbacki64_v">Reference Page</a>
 */
    public void glGetTransformFeedbacki64_v(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLint64 *") LongBuffer param);

/**
 * Array version of: {@link #glGetTransformFeedbacki64_v GetTransformFeedbacki64_v}
 *
 * @see <a href="https://docs.gl/gl4/glGetTransformFeedbacki64_v">Reference Page</a>
 */
    public void glGetTransformFeedbacki64_v(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLint64 *") long[] param);

}
