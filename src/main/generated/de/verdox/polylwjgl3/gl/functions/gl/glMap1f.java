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

public interface glMap1f {

/**
 * Unsafe version of: {@link #glMap1f Map1f}
 */
    public void nglMap1f(int target, float u1, float u2, int stride, int order, long points);

/**
 * Defines a polynomial or rational polynomial mapping to produce vertex, normal, texture coordinates and colors. The values so produced are sent on to
 * further stages of the GL as if they had been provided directly by the client.
 *
 * @param target the evaluator target. One of:<br><table><tr><td>{@link #GL_MAP1_VERTEX_3 MAP1_VERTEX_3}</td><td>{@link #GL_MAP1_VERTEX_4 MAP1_VERTEX_4}</td><td>{@link #GL_MAP1_COLOR_4 MAP1_COLOR_4}</td><td>{@link #GL_MAP1_NORMAL MAP1_NORMAL}</td><td>{@link #GL_MAP1_TEXTURE_COORD_1 MAP1_TEXTURE_COORD_1}</td></tr><tr><td>{@link #GL_MAP1_TEXTURE_COORD_2 MAP1_TEXTURE_COORD_2}</td><td>{@link #GL_MAP1_TEXTURE_COORD_3 MAP1_TEXTURE_COORD_3}</td><td>{@link #GL_MAP1_TEXTURE_COORD_4 MAP1_TEXTURE_COORD_4}</td></tr></table>
 * @param u1     the first endpoint of the pre-image of the map
 * @param u2     the second endpoint of the pre-image of the map
 * @param stride the number of values in each block of storage
 * @param order  the polynomial order
 * @param points a set of {@code order} blocks of storage containing control points
 *
 * @see <a href="https://docs.gl/gl3/glMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glMap1f(@NativeType("GLenum") int target, @NativeType("GLfloat") float u1, @NativeType("GLfloat") float u2, @NativeType("GLint") int stride, @NativeType("GLint") int order, @NativeType("GLfloat const *") FloatBuffer points);

/**
 * Array version of: {@link #glMap1f Map1f}
 *
 * @see <a href="https://docs.gl/gl3/glMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glMap1f(@NativeType("GLenum") int target, @NativeType("GLfloat") float u1, @NativeType("GLfloat") float u2, @NativeType("GLint") int stride, @NativeType("GLint") int order, @NativeType("GLfloat const *") float[] points);

}
