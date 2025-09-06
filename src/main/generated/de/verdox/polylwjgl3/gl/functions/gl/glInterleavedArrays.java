package de.verdox.polylwjgl3.gl.functions.gl;

import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glInterleavedArrays {

/**
 * Unsafe version of: {@link #glInterleavedArrays InterleavedArrays}
 */
    public void nglInterleavedArrays(int format, int stride, long pointer);

/**
 * Efficiently initializes the six vertex arrays and their enables to one of 14 configurations.
 *
 * @param format  the interleaved array format. One of:<br><table><tr><td>{@link #GL_V2F V2F}</td><td>{@link #GL_V3F V3F}</td><td>{@link #GL_C4UB_V2F C4UB_V2F}</td><td>{@link #GL_C4UB_V3F C4UB_V3F}</td><td>{@link #GL_C3F_V3F C3F_V3F}</td><td>{@link #GL_N3F_V3F N3F_V3F}</td><td>{@link #GL_C4F_N3F_V3F C4F_N3F_V3F}</td><td>{@link #GL_T2F_V3F T2F_V3F}</td></tr><tr><td>{@link #GL_T4F_V4F T4F_V4F}</td><td>{@link #GL_T2F_C4UB_V3F T2F_C4UB_V3F}</td><td>{@link #GL_T2F_C3F_V3F T2F_C3F_V3F}</td><td>{@link #GL_T2F_N3F_V3F T2F_N3F_V3F}</td><td>{@link #GL_T2F_C4F_N3F_V3F T2F_C4F_N3F_V3F}</td><td>{@link #GL_T4F_C4F_N3F_V4F T4F_C4F_N3F_V4F}</td></tr></table>
 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
 * @param pointer the vertex array data
 *
 * @see <a href="https://docs.gl/gl3/glInterleavedArrays">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glInterleavedArrays(int format, int stride, ByteBuffer pointer);

/**
 * Efficiently initializes the six vertex arrays and their enables to one of 14 configurations.
 *
 * @param format  the interleaved array format. One of:<br><table><tr><td>{@link #GL_V2F V2F}</td><td>{@link #GL_V3F V3F}</td><td>{@link #GL_C4UB_V2F C4UB_V2F}</td><td>{@link #GL_C4UB_V3F C4UB_V3F}</td><td>{@link #GL_C3F_V3F C3F_V3F}</td><td>{@link #GL_N3F_V3F N3F_V3F}</td><td>{@link #GL_C4F_N3F_V3F C4F_N3F_V3F}</td><td>{@link #GL_T2F_V3F T2F_V3F}</td></tr><tr><td>{@link #GL_T4F_V4F T4F_V4F}</td><td>{@link #GL_T2F_C4UB_V3F T2F_C4UB_V3F}</td><td>{@link #GL_T2F_C3F_V3F T2F_C3F_V3F}</td><td>{@link #GL_T2F_N3F_V3F T2F_N3F_V3F}</td><td>{@link #GL_T2F_C4F_N3F_V3F T2F_C4F_N3F_V3F}</td><td>{@link #GL_T4F_C4F_N3F_V4F T4F_C4F_N3F_V4F}</td></tr></table>
 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
 * @param pointer the vertex array data
 *
 * @see <a href="https://docs.gl/gl3/glInterleavedArrays">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glInterleavedArrays(int format, int stride, long pointer);

/**
 * Efficiently initializes the six vertex arrays and their enables to one of 14 configurations.
 *
 * @param format  the interleaved array format. One of:<br><table><tr><td>{@link #GL_V2F V2F}</td><td>{@link #GL_V3F V3F}</td><td>{@link #GL_C4UB_V2F C4UB_V2F}</td><td>{@link #GL_C4UB_V3F C4UB_V3F}</td><td>{@link #GL_C3F_V3F C3F_V3F}</td><td>{@link #GL_N3F_V3F N3F_V3F}</td><td>{@link #GL_C4F_N3F_V3F C4F_N3F_V3F}</td><td>{@link #GL_T2F_V3F T2F_V3F}</td></tr><tr><td>{@link #GL_T4F_V4F T4F_V4F}</td><td>{@link #GL_T2F_C4UB_V3F T2F_C4UB_V3F}</td><td>{@link #GL_T2F_C3F_V3F T2F_C3F_V3F}</td><td>{@link #GL_T2F_N3F_V3F T2F_N3F_V3F}</td><td>{@link #GL_T2F_C4F_N3F_V3F T2F_C4F_N3F_V3F}</td><td>{@link #GL_T4F_C4F_N3F_V4F T4F_C4F_N3F_V4F}</td></tr></table>
 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
 * @param pointer the vertex array data
 *
 * @see <a href="https://docs.gl/gl3/glInterleavedArrays">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glInterleavedArrays(int format, int stride, ShortBuffer pointer);

/**
 * Efficiently initializes the six vertex arrays and their enables to one of 14 configurations.
 *
 * @param format  the interleaved array format. One of:<br><table><tr><td>{@link #GL_V2F V2F}</td><td>{@link #GL_V3F V3F}</td><td>{@link #GL_C4UB_V2F C4UB_V2F}</td><td>{@link #GL_C4UB_V3F C4UB_V3F}</td><td>{@link #GL_C3F_V3F C3F_V3F}</td><td>{@link #GL_N3F_V3F N3F_V3F}</td><td>{@link #GL_C4F_N3F_V3F C4F_N3F_V3F}</td><td>{@link #GL_T2F_V3F T2F_V3F}</td></tr><tr><td>{@link #GL_T4F_V4F T4F_V4F}</td><td>{@link #GL_T2F_C4UB_V3F T2F_C4UB_V3F}</td><td>{@link #GL_T2F_C3F_V3F T2F_C3F_V3F}</td><td>{@link #GL_T2F_N3F_V3F T2F_N3F_V3F}</td><td>{@link #GL_T2F_C4F_N3F_V3F T2F_C4F_N3F_V3F}</td><td>{@link #GL_T4F_C4F_N3F_V4F T4F_C4F_N3F_V4F}</td></tr></table>
 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
 * @param pointer the vertex array data
 *
 * @see <a href="https://docs.gl/gl3/glInterleavedArrays">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glInterleavedArrays(int format, int stride, IntBuffer pointer);

/**
 * Efficiently initializes the six vertex arrays and their enables to one of 14 configurations.
 *
 * @param format  the interleaved array format. One of:<br><table><tr><td>{@link #GL_V2F V2F}</td><td>{@link #GL_V3F V3F}</td><td>{@link #GL_C4UB_V2F C4UB_V2F}</td><td>{@link #GL_C4UB_V3F C4UB_V3F}</td><td>{@link #GL_C3F_V3F C3F_V3F}</td><td>{@link #GL_N3F_V3F N3F_V3F}</td><td>{@link #GL_C4F_N3F_V3F C4F_N3F_V3F}</td><td>{@link #GL_T2F_V3F T2F_V3F}</td></tr><tr><td>{@link #GL_T4F_V4F T4F_V4F}</td><td>{@link #GL_T2F_C4UB_V3F T2F_C4UB_V3F}</td><td>{@link #GL_T2F_C3F_V3F T2F_C3F_V3F}</td><td>{@link #GL_T2F_N3F_V3F T2F_N3F_V3F}</td><td>{@link #GL_T2F_C4F_N3F_V3F T2F_C4F_N3F_V3F}</td><td>{@link #GL_T4F_C4F_N3F_V4F T4F_C4F_N3F_V4F}</td></tr></table>
 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
 * @param pointer the vertex array data
 *
 * @see <a href="https://docs.gl/gl3/glInterleavedArrays">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glInterleavedArrays(int format, int stride, FloatBuffer pointer);

/**
 * Efficiently initializes the six vertex arrays and their enables to one of 14 configurations.
 *
 * @param format  the interleaved array format. One of:<br><table><tr><td>{@link #GL_V2F V2F}</td><td>{@link #GL_V3F V3F}</td><td>{@link #GL_C4UB_V2F C4UB_V2F}</td><td>{@link #GL_C4UB_V3F C4UB_V3F}</td><td>{@link #GL_C3F_V3F C3F_V3F}</td><td>{@link #GL_N3F_V3F N3F_V3F}</td><td>{@link #GL_C4F_N3F_V3F C4F_N3F_V3F}</td><td>{@link #GL_T2F_V3F T2F_V3F}</td></tr><tr><td>{@link #GL_T4F_V4F T4F_V4F}</td><td>{@link #GL_T2F_C4UB_V3F T2F_C4UB_V3F}</td><td>{@link #GL_T2F_C3F_V3F T2F_C3F_V3F}</td><td>{@link #GL_T2F_N3F_V3F T2F_N3F_V3F}</td><td>{@link #GL_T2F_C4F_N3F_V3F T2F_C4F_N3F_V3F}</td><td>{@link #GL_T4F_C4F_N3F_V4F T4F_C4F_N3F_V4F}</td></tr></table>
 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
 * @param pointer the vertex array data
 *
 * @see <a href="https://docs.gl/gl3/glInterleavedArrays">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glInterleavedArrays(int format, int stride, DoubleBuffer pointer);

/**
 * Array version of: {@link #glInterleavedArrays InterleavedArrays}
 *
 * @see <a href="https://docs.gl/gl3/glInterleavedArrays">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glInterleavedArrays(int format, int stride, short[] pointer);

/**
 * Array version of: {@link #glInterleavedArrays InterleavedArrays}
 *
 * @see <a href="https://docs.gl/gl3/glInterleavedArrays">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glInterleavedArrays(int format, int stride, int[] pointer);

/**
 * Array version of: {@link #glInterleavedArrays InterleavedArrays}
 *
 * @see <a href="https://docs.gl/gl3/glInterleavedArrays">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glInterleavedArrays(int format, int stride, float[] pointer);

/**
 * Array version of: {@link #glInterleavedArrays InterleavedArrays}
 *
 * @see <a href="https://docs.gl/gl3/glInterleavedArrays">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glInterleavedArrays(int format, int stride, double[] pointer);

}
