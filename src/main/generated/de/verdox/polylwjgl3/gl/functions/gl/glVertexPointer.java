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

public interface glVertexPointer {

/**
 * Unsafe version of: {@link #glVertexPointer VertexPointer}
 */
    public void nglVertexPointer(int size, int type, int stride, long pointer);

/**
 * Specifies the location and organization of a vertex array.
 *
 * @param size    the number of values per vertex that are stored in the array. One of:<br><table><tr><td>2</td><td>3</td><td>4</td></tr></table>
 * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>
 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
 * @param pointer the vertex array data
 *
 * @see <a href="https://docs.gl/gl3/glVertexPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glVertexPointer(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer);

/**
 * Specifies the location and organization of a vertex array.
 *
 * @param size    the number of values per vertex that are stored in the array. One of:<br><table><tr><td>2</td><td>3</td><td>4</td></tr></table>
 * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>
 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
 * @param pointer the vertex array data
 *
 * @see <a href="https://docs.gl/gl3/glVertexPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glVertexPointer(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer);

/**
 * Specifies the location and organization of a vertex array.
 *
 * @param size    the number of values per vertex that are stored in the array. One of:<br><table><tr><td>2</td><td>3</td><td>4</td></tr></table>
 * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>
 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
 * @param pointer the vertex array data
 *
 * @see <a href="https://docs.gl/gl3/glVertexPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glVertexPointer(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer);

/**
 * Specifies the location and organization of a vertex array.
 *
 * @param size    the number of values per vertex that are stored in the array. One of:<br><table><tr><td>2</td><td>3</td><td>4</td></tr></table>
 * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>
 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
 * @param pointer the vertex array data
 *
 * @see <a href="https://docs.gl/gl3/glVertexPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glVertexPointer(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") IntBuffer pointer);

/**
 * Specifies the location and organization of a vertex array.
 *
 * @param size    the number of values per vertex that are stored in the array. One of:<br><table><tr><td>2</td><td>3</td><td>4</td></tr></table>
 * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>
 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
 * @param pointer the vertex array data
 *
 * @see <a href="https://docs.gl/gl3/glVertexPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glVertexPointer(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") FloatBuffer pointer);

}
