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

public interface glGetShaderSource {

    public void nglGetShaderSource(int shader, int bufSize, long length, long source);

/**
 * <a href="https://docs.gl/es3/glGetShaderSource">Reference Page</a>
 */
    public void glGetShaderSource(@NativeType("GLuint") int shader, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLchar *") ByteBuffer source);

/**
 * <a href="https://docs.gl/es3/glGetShaderSource">Reference Page</a>
 */
@NativeType("void")
    public String glGetShaderSource(@NativeType("GLuint") int shader, @NativeType("GLsizei") int bufSize);

/**
 * <a href="https://docs.gl/es3/glGetShaderSource">Reference Page</a>
 */
@NativeType("void")
    public String glGetShaderSource(@NativeType("GLuint") int shader);

/**
 * Array version of: {@link #glGetShaderSource GetShaderSource}
 *
 * @see <a href="https://docs.gl/es3/glGetShaderSource">Reference Page</a>
 */
    public void glGetShaderSource(@NativeType("GLuint") int shader, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLchar *") ByteBuffer source);

}
