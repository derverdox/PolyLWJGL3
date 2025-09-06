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

public interface glTexSubImage2D {

    public void nglTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels);

/**
 * <a href="https://docs.gl/es3/glTexSubImage2D">Reference Page</a>
 */
    public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ByteBuffer pixels);

/**
 * <a href="https://docs.gl/es3/glTexSubImage2D">Reference Page</a>
 */
    public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels);

/**
 * <a href="https://docs.gl/es3/glTexSubImage2D">Reference Page</a>
 */
    public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ShortBuffer pixels);

/**
 * <a href="https://docs.gl/es3/glTexSubImage2D">Reference Page</a>
 */
    public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, IntBuffer pixels);

/**
 * <a href="https://docs.gl/es3/glTexSubImage2D">Reference Page</a>
 */
    public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, FloatBuffer pixels);

/**
 * Array version of: {@link #glTexSubImage2D TexSubImage2D}
 *
 * @see <a href="https://docs.gl/es3/glTexSubImage2D">Reference Page</a>
 */
    public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, short[] pixels);

/**
 * Array version of: {@link #glTexSubImage2D TexSubImage2D}
 *
 * @see <a href="https://docs.gl/es3/glTexSubImage2D">Reference Page</a>
 */
    public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, int[] pixels);

/**
 * Array version of: {@link #glTexSubImage2D TexSubImage2D}
 *
 * @see <a href="https://docs.gl/es3/glTexSubImage2D">Reference Page</a>
 */
    public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, float[] pixels);

}
