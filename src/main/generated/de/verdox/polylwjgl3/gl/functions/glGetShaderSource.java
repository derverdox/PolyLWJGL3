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
    public void glGetShaderSource(int shader, @Nullable IntBuffer length, ByteBuffer source);

/**
 * <a href="https://docs.gl/es3/glGetShaderSource">Reference Page</a>
 */
    public String glGetShaderSource(int shader, int bufSize);

/**
 * <a href="https://docs.gl/es3/glGetShaderSource">Reference Page</a>
 */
    public String glGetShaderSource(int shader);

/**
 * Array version of: {@link #glGetShaderSource GetShaderSource}
 *
 * @see <a href="https://docs.gl/es3/glGetShaderSource">Reference Page</a>
 */
    public void glGetShaderSource(int shader, @Nullable int[] length, ByteBuffer source);

}
