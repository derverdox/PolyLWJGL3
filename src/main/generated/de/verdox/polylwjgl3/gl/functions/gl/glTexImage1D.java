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

public interface glTexImage1D {

/**
 * Unsafe version of: {@link #glTexImage1D TexImage1D}
 */
    public void nglTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, long pixels);

/**
 * One-dimensional version of {@link #glTexImage2D TexImage2D}}.
 *
 * @param target         the texture target. One of:<br><table><tr><td>{@link GL11C#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11C#GL_PROXY_TEXTURE_1D PROXY_TEXTURE_1D}</td></tr></table>
 * @param level          the level-of-detail number
 * @param internalformat the texture internal format
 * @param width          the texture width
 * @param border         the texture border width
 * @param format         the texel data format
 * @param type           the texel data type
 * @param pixels         the texel data
 *
 * @see <a href="https://docs.gl/gl4/glTexImage1D">Reference Page</a>
 */
    public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, @Nullable ByteBuffer pixels);

/**
 * One-dimensional version of {@link #glTexImage2D TexImage2D}}.
 *
 * @param target         the texture target. One of:<br><table><tr><td>{@link GL11C#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11C#GL_PROXY_TEXTURE_1D PROXY_TEXTURE_1D}</td></tr></table>
 * @param level          the level-of-detail number
 * @param internalformat the texture internal format
 * @param width          the texture width
 * @param border         the texture border width
 * @param format         the texel data format
 * @param type           the texel data type
 * @param pixels         the texel data
 *
 * @see <a href="https://docs.gl/gl4/glTexImage1D">Reference Page</a>
 */
    public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, long pixels);

/**
 * One-dimensional version of {@link #glTexImage2D TexImage2D}}.
 *
 * @param target         the texture target. One of:<br><table><tr><td>{@link GL11C#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11C#GL_PROXY_TEXTURE_1D PROXY_TEXTURE_1D}</td></tr></table>
 * @param level          the level-of-detail number
 * @param internalformat the texture internal format
 * @param width          the texture width
 * @param border         the texture border width
 * @param format         the texel data format
 * @param type           the texel data type
 * @param pixels         the texel data
 *
 * @see <a href="https://docs.gl/gl4/glTexImage1D">Reference Page</a>
 */
    public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, @Nullable ShortBuffer pixels);

/**
 * One-dimensional version of {@link #glTexImage2D TexImage2D}}.
 *
 * @param target         the texture target. One of:<br><table><tr><td>{@link GL11C#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11C#GL_PROXY_TEXTURE_1D PROXY_TEXTURE_1D}</td></tr></table>
 * @param level          the level-of-detail number
 * @param internalformat the texture internal format
 * @param width          the texture width
 * @param border         the texture border width
 * @param format         the texel data format
 * @param type           the texel data type
 * @param pixels         the texel data
 *
 * @see <a href="https://docs.gl/gl4/glTexImage1D">Reference Page</a>
 */
    public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, @Nullable IntBuffer pixels);

/**
 * One-dimensional version of {@link #glTexImage2D TexImage2D}}.
 *
 * @param target         the texture target. One of:<br><table><tr><td>{@link GL11C#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11C#GL_PROXY_TEXTURE_1D PROXY_TEXTURE_1D}</td></tr></table>
 * @param level          the level-of-detail number
 * @param internalformat the texture internal format
 * @param width          the texture width
 * @param border         the texture border width
 * @param format         the texel data format
 * @param type           the texel data type
 * @param pixels         the texel data
 *
 * @see <a href="https://docs.gl/gl4/glTexImage1D">Reference Page</a>
 */
    public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, @Nullable FloatBuffer pixels);

/**
 * One-dimensional version of {@link #glTexImage2D TexImage2D}}.
 *
 * @param target         the texture target. One of:<br><table><tr><td>{@link GL11C#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11C#GL_PROXY_TEXTURE_1D PROXY_TEXTURE_1D}</td></tr></table>
 * @param level          the level-of-detail number
 * @param internalformat the texture internal format
 * @param width          the texture width
 * @param border         the texture border width
 * @param format         the texel data format
 * @param type           the texel data type
 * @param pixels         the texel data
 *
 * @see <a href="https://docs.gl/gl4/glTexImage1D">Reference Page</a>
 */
    public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, @Nullable DoubleBuffer pixels);

/**
 * Array version of: {@link #glTexImage1D TexImage1D}
 *
 * @see <a href="https://docs.gl/gl4/glTexImage1D">Reference Page</a>
 */
    public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, @Nullable short[] pixels);

/**
 * Array version of: {@link #glTexImage1D TexImage1D}
 *
 * @see <a href="https://docs.gl/gl4/glTexImage1D">Reference Page</a>
 */
    public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, @Nullable int[] pixels);

/**
 * Array version of: {@link #glTexImage1D TexImage1D}
 *
 * @see <a href="https://docs.gl/gl4/glTexImage1D">Reference Page</a>
 */
    public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, @Nullable float[] pixels);

/**
 * Array version of: {@link #glTexImage1D TexImage1D}
 *
 * @see <a href="https://docs.gl/gl4/glTexImage1D">Reference Page</a>
 */
    public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, @Nullable double[] pixels);

}
