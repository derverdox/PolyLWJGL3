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

public interface glGetTransformFeedbackVarying {

    public void nglGetTransformFeedbackVarying(int program, int index, int bufSize, long length, long size, long type, long name);

/**
 * <a href="https://docs.gl/es3/glGetTransformFeedbackVarying">Reference Page</a>
 */
    public void glGetTransformFeedbackVarying(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLsizei *") IntBuffer size, @NativeType("GLenum *") IntBuffer type, @NativeType("GLchar *") ByteBuffer name);

/**
 * <a href="https://docs.gl/es3/glGetTransformFeedbackVarying">Reference Page</a>
 */
@NativeType("void")
    public String glGetTransformFeedbackVarying(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei") int bufSize, @NativeType("GLsizei *") IntBuffer size, @NativeType("GLenum *") IntBuffer type);

/**
 * <a href="https://docs.gl/es3/glGetTransformFeedbackVarying">Reference Page</a>
 */
@NativeType("void")
    public String glGetTransformFeedbackVarying(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei *") IntBuffer size, @NativeType("GLenum *") IntBuffer type);

/**
 * Array version of: {@link #glGetTransformFeedbackVarying GetTransformFeedbackVarying}
 *
 * @see <a href="https://docs.gl/es3/glGetTransformFeedbackVarying">Reference Page</a>
 */
    public void glGetTransformFeedbackVarying(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLsizei *") int[] size, @NativeType("GLenum *") int[] type, @NativeType("GLchar *") ByteBuffer name);

}
