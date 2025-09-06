package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl44.GL44Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl44.GL44AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL45;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glGetnMapiv {

/**
 * Unsafe version of: {@link #glGetnMapiv GetnMapiv}
 *
 * @param bufSize the maximum number of bytes to write into {@code data}
 */
    public void nglGetnMapiv(int target, int query, int bufSize, long data);

/**
 * Robust version of {@link GL11#glGetMapiv GetMapiv}
 *
 * @param target the evaluator target. One of:<br><table><tr><td>{@link GL11#GL_MAP1_VERTEX_3 MAP1_VERTEX_3}</td><td>{@link GL11#GL_MAP1_VERTEX_4 MAP1_VERTEX_4}</td><td>{@link GL11#GL_MAP1_COLOR_4 MAP1_COLOR_4}</td><td>{@link GL11#GL_MAP1_NORMAL MAP1_NORMAL}</td><td>{@link GL11#GL_MAP1_TEXTURE_COORD_1 MAP1_TEXTURE_COORD_1}</td></tr><tr><td>{@link GL11#GL_MAP1_TEXTURE_COORD_2 MAP1_TEXTURE_COORD_2}</td><td>{@link GL11#GL_MAP1_TEXTURE_COORD_3 MAP1_TEXTURE_COORD_3}</td><td>{@link GL11#GL_MAP1_TEXTURE_COORD_4 MAP1_TEXTURE_COORD_4}</td><td>{@link GL11#GL_MAP2_VERTEX_3 MAP2_VERTEX_3}</td><td>{@link GL11#GL_MAP2_VERTEX_4 MAP2_VERTEX_4}</td></tr><tr><td>{@link GL11#GL_MAP2_COLOR_4 MAP2_COLOR_4}</td><td>{@link GL11#GL_MAP2_NORMAL MAP2_NORMAL}</td><td>{@link GL11#GL_MAP2_TEXTURE_COORD_1 MAP2_TEXTURE_COORD_1}</td><td>{@link GL11#GL_MAP2_TEXTURE_COORD_2 MAP2_TEXTURE_COORD_2}</td><td>{@link GL11#GL_MAP2_TEXTURE_COORD_3 MAP2_TEXTURE_COORD_3}</td></tr><tr><td>{@link GL11#GL_MAP2_TEXTURE_COORD_4 MAP2_TEXTURE_COORD_4}</td></tr></table>
 * @param query  the information to query. One of:<br><table><tr><td>{@link GL11#GL_ORDER ORDER}</td><td>{@link GL11#GL_COEFF COEFF}</td><td>{@link GL11#GL_DOMAIN DOMAIN}</td></tr></table>
 * @param data   a buffer in which to place the returned data
 *
 * @see <a href="https://docs.gl/gl4/glGetMap">Reference Page</a>
 */
    public void glGetnMapiv(int target, int query, IntBuffer data);

/**
 * Array version of: {@link #glGetnMapiv GetnMapiv}
 *
 * @see <a href="https://docs.gl/gl4/glGetMap">Reference Page</a>
 */
    public void glGetnMapiv(int target, int query, int[] data);

}
