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

public interface glBufferData {

    public void nglBufferData(int target, long size, long data, int usage);

/**
 * <a href="https://docs.gl/es3/glBufferData">Reference Page</a>
 */
    public void glBufferData(int target, long size, int usage);

/**
 * <a href="https://docs.gl/es3/glBufferData">Reference Page</a>
 */
    public void glBufferData(int target, ByteBuffer data, int usage);

/**
 * <a href="https://docs.gl/es3/glBufferData">Reference Page</a>
 */
    public void glBufferData(int target, ShortBuffer data, int usage);

/**
 * <a href="https://docs.gl/es3/glBufferData">Reference Page</a>
 */
    public void glBufferData(int target, IntBuffer data, int usage);

/**
 * <a href="https://docs.gl/es3/glBufferData">Reference Page</a>
 */
    public void glBufferData(int target, FloatBuffer data, int usage);

/**
 * Array version of: {@link #glBufferData BufferData}
 *
 * @see <a href="https://docs.gl/es3/glBufferData">Reference Page</a>
 */
    public void glBufferData(int target, short[] data, int usage);

/**
 * Array version of: {@link #glBufferData BufferData}
 *
 * @see <a href="https://docs.gl/es3/glBufferData">Reference Page</a>
 */
    public void glBufferData(int target, int[] data, int usage);

/**
 * Array version of: {@link #glBufferData BufferData}
 *
 * @see <a href="https://docs.gl/es3/glBufferData">Reference Page</a>
 */
    public void glBufferData(int target, float[] data, int usage);

}
