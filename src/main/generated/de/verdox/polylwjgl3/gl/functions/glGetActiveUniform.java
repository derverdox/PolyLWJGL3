package de.verdox.polylwjgl3.gl.functions;

import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengles.GLES20;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glGetActiveUniform {

    public void nglGetActiveUniform(int program, int index, int bufSize, long length, long size, long type, long name);

/**
 * <a href="https://docs.gl/es3/glGetActiveUniform">Reference Page</a>
 */
    public void glGetActiveUniform(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type, @NativeType("GLchar *") ByteBuffer name);

/**
 * <a href="https://docs.gl/es3/glGetActiveUniform">Reference Page</a>
 */
@NativeType("void")
    public String glGetActiveUniform(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei") int bufSize, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type);

/**
 * <a href="https://docs.gl/es3/glGetActiveUniform">Reference Page</a>
 */
@NativeType("void")
    public String glGetActiveUniform(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type);

/**
 * Array version of: {@link #glGetActiveUniform GetActiveUniform}
 *
 * @see <a href="https://docs.gl/es3/glGetActiveUniform">Reference Page</a>
 */
    public void glGetActiveUniform(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLint *") int[] size, @NativeType("GLenum *") int[] type, @NativeType("GLchar *") ByteBuffer name);

}
