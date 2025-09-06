package de.verdox.polylwjgl3.gl.functions;

import de.verdox.polylwjgl3.gl.accessor.gles20.GLES20Accessor;
import de.verdox.polylwjgl3.gl.accessor.gles20.GLES20AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengles.GLES30;
import org.lwjgl.system.*;
import org.lwjgl.system.APIUtil.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glTransformFeedbackVaryings {

    public void nglTransformFeedbackVaryings(int program, int count, long varyings, int bufferMode);

/**
 * <a href="https://docs.gl/es3/glTransformFeedbackVaryings">Reference Page</a>
 */
    public void glTransformFeedbackVaryings(@NativeType("GLuint") int program, @NativeType("GLchar const * const *") PointerBuffer varyings, @NativeType("GLenum") int bufferMode);

/**
 * <a href="https://docs.gl/es3/glTransformFeedbackVaryings">Reference Page</a>
 */
    public void glTransformFeedbackVaryings(@NativeType("GLuint") int program, @NativeType("GLchar const * const *") CharSequence[] varyings, @NativeType("GLenum") int bufferMode);

/**
 * <a href="https://docs.gl/es3/glTransformFeedbackVaryings">Reference Page</a>
 */
    public void glTransformFeedbackVaryings(@NativeType("GLuint") int program, @NativeType("GLchar const * const *") CharSequence varying, @NativeType("GLenum") int bufferMode);

}
