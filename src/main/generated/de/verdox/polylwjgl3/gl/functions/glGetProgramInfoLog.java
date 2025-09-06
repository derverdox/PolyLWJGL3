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
    public void glGetProgramInfoLog(int program, @Nullable IntBuffer length, ByteBuffer infoLog);

/**
 * <a href="https://docs.gl/es3/glGetProgramInfoLog">Reference Page</a>
 */
    public String glGetProgramInfoLog(int program, int bufSize);

/**
 * <a href="https://docs.gl/es3/glGetProgramInfoLog">Reference Page</a>
 */
    public String glGetProgramInfoLog(int program);

/**
 * Array version of: {@link #glGetProgramInfoLog GetProgramInfoLog}
 *
 * @see <a href="https://docs.gl/es3/glGetProgramInfoLog">Reference Page</a>
 */
    public void glGetProgramInfoLog(int program, @Nullable int[] length, ByteBuffer infoLog);

}
