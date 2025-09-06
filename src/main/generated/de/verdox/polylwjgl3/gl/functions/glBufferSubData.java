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

public interface glBufferSubData {

    public void nglBufferSubData(int target, long offset, long size, long data);

/**
 * <a href="https://docs.gl/es3/glBufferSubData">Reference Page</a>
 */
    public void glBufferSubData(int target, long offset, ByteBuffer data);

/**
 * <a href="https://docs.gl/es3/glBufferSubData">Reference Page</a>
 */
    public void glBufferSubData(int target, long offset, ShortBuffer data);

/**
 * <a href="https://docs.gl/es3/glBufferSubData">Reference Page</a>
 */
    public void glBufferSubData(int target, long offset, IntBuffer data);

/**
 * <a href="https://docs.gl/es3/glBufferSubData">Reference Page</a>
 */
    public void glBufferSubData(int target, long offset, FloatBuffer data);

/**
 * Array version of: {@link #glBufferSubData BufferSubData}
 *
 * @see <a href="https://docs.gl/es3/glBufferSubData">Reference Page</a>
 */
    public void glBufferSubData(int target, long offset, short[] data);

/**
 * Array version of: {@link #glBufferSubData BufferSubData}
 *
 * @see <a href="https://docs.gl/es3/glBufferSubData">Reference Page</a>
 */
    public void glBufferSubData(int target, long offset, int[] data);

/**
 * Array version of: {@link #glBufferSubData BufferSubData}
 *
 * @see <a href="https://docs.gl/es3/glBufferSubData">Reference Page</a>
 */
    public void glBufferSubData(int target, long offset, float[] data);

}
