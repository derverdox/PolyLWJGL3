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

public interface glReadPixels {

    public void nglReadPixels(int x, int y, int width, int height, int format, int type, long pixels);

/**
 * <a href="https://docs.gl/es3/glReadPixels">Reference Page</a>
 */
    public void glReadPixels(int x, int y, int width, int height, int format, int type, ByteBuffer pixels);

/**
 * <a href="https://docs.gl/es3/glReadPixels">Reference Page</a>
 */
    public void glReadPixels(int x, int y, int width, int height, int format, int type, long pixels);

/**
 * <a href="https://docs.gl/es3/glReadPixels">Reference Page</a>
 */
    public void glReadPixels(int x, int y, int width, int height, int format, int type, ShortBuffer pixels);

/**
 * <a href="https://docs.gl/es3/glReadPixels">Reference Page</a>
 */
    public void glReadPixels(int x, int y, int width, int height, int format, int type, IntBuffer pixels);

/**
 * <a href="https://docs.gl/es3/glReadPixels">Reference Page</a>
 */
    public void glReadPixels(int x, int y, int width, int height, int format, int type, FloatBuffer pixels);

/**
 * Array version of: {@link #glReadPixels ReadPixels}
 *
 * @see <a href="https://docs.gl/es3/glReadPixels">Reference Page</a>
 */
    public void glReadPixels(int x, int y, int width, int height, int format, int type, short[] pixels);

/**
 * Array version of: {@link #glReadPixels ReadPixels}
 *
 * @see <a href="https://docs.gl/es3/glReadPixels">Reference Page</a>
 */
    public void glReadPixels(int x, int y, int width, int height, int format, int type, int[] pixels);

/**
 * Array version of: {@link #glReadPixels ReadPixels}
 *
 * @see <a href="https://docs.gl/es3/glReadPixels">Reference Page</a>
 */
    public void glReadPixels(int x, int y, int width, int height, int format, int type, float[] pixels);

}
