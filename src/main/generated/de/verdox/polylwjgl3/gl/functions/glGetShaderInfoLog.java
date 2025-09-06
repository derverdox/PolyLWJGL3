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

public interface glGetShaderInfoLog {

    public void nglGetShaderInfoLog(int shader, int bufSize, long length, long infoLog);

/**
 * <a href="https://docs.gl/es3/glGetShaderInfoLog">Reference Page</a>
 */
    public void glGetShaderInfoLog(@NativeType("GLuint") int shader, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLchar *") ByteBuffer infoLog);

/**
 * <a href="https://docs.gl/es3/glGetShaderInfoLog">Reference Page</a>
 */
@NativeType("void")
    public String glGetShaderInfoLog(@NativeType("GLuint") int shader, @NativeType("GLsizei") int bufSize);

/**
 * <a href="https://docs.gl/es3/glGetShaderInfoLog">Reference Page</a>
 */
@NativeType("void")
    public String glGetShaderInfoLog(@NativeType("GLuint") int shader);

/**
 * Array version of: {@link #glGetShaderInfoLog GetShaderInfoLog}
 *
 * @see <a href="https://docs.gl/es3/glGetShaderInfoLog">Reference Page</a>
 */
    public void glGetShaderInfoLog(@NativeType("GLuint") int shader, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLchar *") ByteBuffer infoLog);

}
