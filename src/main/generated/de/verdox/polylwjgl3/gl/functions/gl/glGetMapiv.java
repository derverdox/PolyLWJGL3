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

public interface glGetMapiv {

/**
 * Unsafe version of: {@link #glGetMapiv GetMapiv}
 */
    public void nglGetMapiv(int target, int query, long data);

/**
 * Returns integer information about {@code query} for evaluator map {@code target} in {@code data}.
 *
 * @param target the evaluator target. One of:<br><table><tr><td>{@link #GL_MAP1_VERTEX_3 MAP1_VERTEX_3}</td><td>{@link #GL_MAP1_VERTEX_4 MAP1_VERTEX_4}</td><td>{@link #GL_MAP1_COLOR_4 MAP1_COLOR_4}</td><td>{@link #GL_MAP1_NORMAL MAP1_NORMAL}</td><td>{@link #GL_MAP1_TEXTURE_COORD_1 MAP1_TEXTURE_COORD_1}</td></tr><tr><td>{@link #GL_MAP1_TEXTURE_COORD_2 MAP1_TEXTURE_COORD_2}</td><td>{@link #GL_MAP1_TEXTURE_COORD_3 MAP1_TEXTURE_COORD_3}</td><td>{@link #GL_MAP1_TEXTURE_COORD_4 MAP1_TEXTURE_COORD_4}</td><td>{@link #GL_MAP2_VERTEX_3 MAP2_VERTEX_3}</td><td>{@link #GL_MAP2_VERTEX_4 MAP2_VERTEX_4}</td></tr><tr><td>{@link #GL_MAP2_COLOR_4 MAP2_COLOR_4}</td><td>{@link #GL_MAP2_NORMAL MAP2_NORMAL}</td><td>{@link #GL_MAP2_TEXTURE_COORD_1 MAP2_TEXTURE_COORD_1}</td><td>{@link #GL_MAP2_TEXTURE_COORD_2 MAP2_TEXTURE_COORD_2}</td><td>{@link #GL_MAP2_TEXTURE_COORD_3 MAP2_TEXTURE_COORD_3}</td></tr><tr><td>{@link #GL_MAP2_TEXTURE_COORD_4 MAP2_TEXTURE_COORD_4}</td></tr></table>
 * @param query  the information to query. One of:<br><table><tr><td>{@link #GL_ORDER ORDER}</td><td>{@link #GL_COEFF COEFF}</td><td>{@link #GL_DOMAIN DOMAIN}</td></tr></table>
 * @param data   a scalar or buffer in which to place the returned data
 *
 * @see <a href="https://docs.gl/gl3/glGetMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glGetMapiv(int target, int query, IntBuffer data);

/**
 * Array version of: {@link #glGetMapiv GetMapiv}
 *
 * @see <a href="https://docs.gl/gl3/glGetMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glGetMapiv(int target, int query, int[] data);

}
