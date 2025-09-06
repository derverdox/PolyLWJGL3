package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl13.GL13Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl13.GL13AccessorImpl;
import java.nio.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL14;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glFogCoordPointer {

/**
 * Unsafe version of: {@link #glFogCoordPointer FogCoordPointer}
 */
    public void nglFogCoordPointer(int type, int stride, long pointer);

/**
 * Specifies the location and organization of a fog coordinate array.
 *
 * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link GL11#GL_DOUBLE DOUBLE}</td></tr></table>
 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
 * @param pointer the fog coordinate array data
 *
 * @see <a href="https://docs.gl/gl3/glFogCoordPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glFogCoordPointer(int type, int stride, ByteBuffer pointer);

/**
 * Specifies the location and organization of a fog coordinate array.
 *
 * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link GL11#GL_DOUBLE DOUBLE}</td></tr></table>
 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
 * @param pointer the fog coordinate array data
 *
 * @see <a href="https://docs.gl/gl3/glFogCoordPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glFogCoordPointer(int type, int stride, long pointer);

/**
 * Specifies the location and organization of a fog coordinate array.
 *
 * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link GL11#GL_DOUBLE DOUBLE}</td></tr></table>
 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
 * @param pointer the fog coordinate array data
 *
 * @see <a href="https://docs.gl/gl3/glFogCoordPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glFogCoordPointer(int type, int stride, ShortBuffer pointer);

/**
 * Specifies the location and organization of a fog coordinate array.
 *
 * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link GL11#GL_DOUBLE DOUBLE}</td></tr></table>
 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
 * @param pointer the fog coordinate array data
 *
 * @see <a href="https://docs.gl/gl3/glFogCoordPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glFogCoordPointer(int type, int stride, FloatBuffer pointer);

}
