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

public interface glTexImage3D {

    public void nglTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixels);

/**
 * <a href="https://docs.gl/es3/glTexImage3D">Reference Page</a>
 */
    public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, @Nullable ByteBuffer pixels);

/**
 * <a href="https://docs.gl/es3/glTexImage3D">Reference Page</a>
 */
    public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixels);

/**
 * <a href="https://docs.gl/es3/glTexImage3D">Reference Page</a>
 */
    public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, @Nullable ShortBuffer pixels);

/**
 * <a href="https://docs.gl/es3/glTexImage3D">Reference Page</a>
 */
    public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, @Nullable IntBuffer pixels);

/**
 * <a href="https://docs.gl/es3/glTexImage3D">Reference Page</a>
 */
    public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, @Nullable FloatBuffer pixels);

/**
 * Array version of: {@link #glTexImage3D TexImage3D}
 *
 * @see <a href="https://docs.gl/es3/glTexImage3D">Reference Page</a>
 */
    public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, @Nullable short[] pixels);

/**
 * Array version of: {@link #glTexImage3D TexImage3D}
 *
 * @see <a href="https://docs.gl/es3/glTexImage3D">Reference Page</a>
 */
    public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, @Nullable int[] pixels);

/**
 * Array version of: {@link #glTexImage3D TexImage3D}
 *
 * @see <a href="https://docs.gl/es3/glTexImage3D">Reference Page</a>
 */
    public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, @Nullable float[] pixels);

}
