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

public interface glTexSubImage3D {

    public void nglTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels);

/**
 * <a href="https://docs.gl/es3/glTexSubImage3D">Reference Page</a>
 */
    public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ByteBuffer pixels);

/**
 * <a href="https://docs.gl/es3/glTexSubImage3D">Reference Page</a>
 */
    public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels);

/**
 * <a href="https://docs.gl/es3/glTexSubImage3D">Reference Page</a>
 */
    public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ShortBuffer pixels);

/**
 * <a href="https://docs.gl/es3/glTexSubImage3D">Reference Page</a>
 */
    public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, IntBuffer pixels);

/**
 * <a href="https://docs.gl/es3/glTexSubImage3D">Reference Page</a>
 */
    public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, FloatBuffer pixels);

/**
 * Array version of: {@link #glTexSubImage3D TexSubImage3D}
 *
 * @see <a href="https://docs.gl/es3/glTexSubImage3D">Reference Page</a>
 */
    public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, short[] pixels);

/**
 * Array version of: {@link #glTexSubImage3D TexSubImage3D}
 *
 * @see <a href="https://docs.gl/es3/glTexSubImage3D">Reference Page</a>
 */
    public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int[] pixels);

/**
 * Array version of: {@link #glTexSubImage3D TexSubImage3D}
 *
 * @see <a href="https://docs.gl/es3/glTexSubImage3D">Reference Page</a>
 */
    public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, float[] pixels);

}
