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
    public void glGetActiveUniform(int program, int index, @Nullable IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name);

/**
 * <a href="https://docs.gl/es3/glGetActiveUniform">Reference Page</a>
 */
    public String glGetActiveUniform(int program, int index, int bufSize, IntBuffer size, IntBuffer type);

/**
 * <a href="https://docs.gl/es3/glGetActiveUniform">Reference Page</a>
 */
    public String glGetActiveUniform(int program, int index, IntBuffer size, IntBuffer type);

/**
 * Array version of: {@link #glGetActiveUniform GetActiveUniform}
 *
 * @see <a href="https://docs.gl/es3/glGetActiveUniform">Reference Page</a>
 */
    public void glGetActiveUniform(int program, int index, @Nullable int[] length, int[] size, int[] type, ByteBuffer name);

}
