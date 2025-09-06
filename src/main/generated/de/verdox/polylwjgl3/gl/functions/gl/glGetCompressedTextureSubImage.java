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

public interface glGetCompressedTextureSubImage {

/**
 * Unsafe version of: {@link #glGetCompressedTextureSubImage GetCompressedTextureSubImage}
 *
 * @param bufSize the size of the buffer to receive the retrieved pixel data
 */
    public void nglGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int bufSize, long pixels);

/**
 * Obtains a sub-region of a compressed texture image.
 *
 * @param texture the source texture object name
 * @param level   the level-of-detail number
 * @param xoffset the x-position of the subregion
 * @param yoffset the y-position of the subregion
 * @param zoffset the z-position of the subregion
 * @param width   the subregion width
 * @param height  the subregion height
 * @param depth   the subregion depth
 * @param bufSize the size of the buffer to receive the retrieved pixel data
 * @param pixels  the buffer in which to place the returned data
 *
 * @see <a href="https://docs.gl/gl4/glGetCompressedTextureSubImage">Reference Page</a>
 */
    public void glGetCompressedTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLsizei") int bufSize, @NativeType("void *") long pixels);

/**
 * Obtains a sub-region of a compressed texture image.
 *
 * @param texture the source texture object name
 * @param level   the level-of-detail number
 * @param xoffset the x-position of the subregion
 * @param yoffset the y-position of the subregion
 * @param zoffset the z-position of the subregion
 * @param width   the subregion width
 * @param height  the subregion height
 * @param depth   the subregion depth
 * @param pixels  the buffer in which to place the returned data
 *
 * @see <a href="https://docs.gl/gl4/glGetCompressedTextureSubImage">Reference Page</a>
 */
    public void glGetCompressedTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("void *") ByteBuffer pixels);

/**
 * Obtains a sub-region of a compressed texture image.
 *
 * @param texture the source texture object name
 * @param level   the level-of-detail number
 * @param xoffset the x-position of the subregion
 * @param yoffset the y-position of the subregion
 * @param zoffset the z-position of the subregion
 * @param width   the subregion width
 * @param height  the subregion height
 * @param depth   the subregion depth
 * @param pixels  the buffer in which to place the returned data
 *
 * @see <a href="https://docs.gl/gl4/glGetCompressedTextureSubImage">Reference Page</a>
 */
    public void glGetCompressedTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("void *") ShortBuffer pixels);

/**
 * Obtains a sub-region of a compressed texture image.
 *
 * @param texture the source texture object name
 * @param level   the level-of-detail number
 * @param xoffset the x-position of the subregion
 * @param yoffset the y-position of the subregion
 * @param zoffset the z-position of the subregion
 * @param width   the subregion width
 * @param height  the subregion height
 * @param depth   the subregion depth
 * @param pixels  the buffer in which to place the returned data
 *
 * @see <a href="https://docs.gl/gl4/glGetCompressedTextureSubImage">Reference Page</a>
 */
    public void glGetCompressedTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("void *") IntBuffer pixels);

/**
 * Obtains a sub-region of a compressed texture image.
 *
 * @param texture the source texture object name
 * @param level   the level-of-detail number
 * @param xoffset the x-position of the subregion
 * @param yoffset the y-position of the subregion
 * @param zoffset the z-position of the subregion
 * @param width   the subregion width
 * @param height  the subregion height
 * @param depth   the subregion depth
 * @param pixels  the buffer in which to place the returned data
 *
 * @see <a href="https://docs.gl/gl4/glGetCompressedTextureSubImage">Reference Page</a>
 */
    public void glGetCompressedTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("void *") FloatBuffer pixels);

/**
 * Obtains a sub-region of a compressed texture image.
 *
 * @param texture the source texture object name
 * @param level   the level-of-detail number
 * @param xoffset the x-position of the subregion
 * @param yoffset the y-position of the subregion
 * @param zoffset the z-position of the subregion
 * @param width   the subregion width
 * @param height  the subregion height
 * @param depth   the subregion depth
 * @param pixels  the buffer in which to place the returned data
 *
 * @see <a href="https://docs.gl/gl4/glGetCompressedTextureSubImage">Reference Page</a>
 */
    public void glGetCompressedTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("void *") DoubleBuffer pixels);

/**
 * Array version of: {@link #glGetCompressedTextureSubImage GetCompressedTextureSubImage}
 *
 * @see <a href="https://docs.gl/gl4/glGetCompressedTextureSubImage">Reference Page</a>
 */
    public void glGetCompressedTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("void *") short[] pixels);

/**
 * Array version of: {@link #glGetCompressedTextureSubImage GetCompressedTextureSubImage}
 *
 * @see <a href="https://docs.gl/gl4/glGetCompressedTextureSubImage">Reference Page</a>
 */
    public void glGetCompressedTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("void *") int[] pixels);

/**
 * Array version of: {@link #glGetCompressedTextureSubImage GetCompressedTextureSubImage}
 *
 * @see <a href="https://docs.gl/gl4/glGetCompressedTextureSubImage">Reference Page</a>
 */
    public void glGetCompressedTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("void *") float[] pixels);

/**
 * Array version of: {@link #glGetCompressedTextureSubImage GetCompressedTextureSubImage}
 *
 * @see <a href="https://docs.gl/gl4/glGetCompressedTextureSubImage">Reference Page</a>
 */
    public void glGetCompressedTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("void *") double[] pixels);

}
