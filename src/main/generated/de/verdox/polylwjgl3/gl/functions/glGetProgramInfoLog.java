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

public interface glGetProgramInfoLog {

    public void nglGetProgramInfoLog(int program, int bufSize, long length, long infoLog);

/**
 * <a href="https://docs.gl/es3/glGetProgramInfoLog">Reference Page</a>
 */
    public void glGetProgramInfoLog(@NativeType("GLuint") int program, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLchar *") ByteBuffer infoLog);

/**
 * <a href="https://docs.gl/es3/glGetProgramInfoLog">Reference Page</a>
 */
@NativeType("void")
    public String glGetProgramInfoLog(@NativeType("GLuint") int program, @NativeType("GLsizei") int bufSize);

/**
 * <a href="https://docs.gl/es3/glGetProgramInfoLog">Reference Page</a>
 */
@NativeType("void")
    public String glGetProgramInfoLog(@NativeType("GLuint") int program);

/**
 * Array version of: {@link #glGetProgramInfoLog GetProgramInfoLog}
 *
 * @see <a href="https://docs.gl/es3/glGetProgramInfoLog">Reference Page</a>
 */
    public void glGetProgramInfoLog(@NativeType("GLuint") int program, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLchar *") ByteBuffer infoLog);

}
