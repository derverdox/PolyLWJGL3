package de.verdox.polylwjgl3.gl.functions;

import de.verdox.polylwjgl3.gl.accessor.gles31.GLES31Accessor;
import de.verdox.polylwjgl3.gl.accessor.gles31.GLES31AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengles.GLES32;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glReadnPixels {

/**
 * Unsafe version of: {@link #glReadnPixels ReadnPixels}
 *
 * @param bufSize the maximum number of bytes to write into {@code data}
 */
    public void nglReadnPixels(int x, int y, int width, int height, int format, int type, int bufSize, long pixels);

/**
 * Behaves identically to {@link GLES20#glReadPixels ReadPixels} except that it does not write more than {@code bufSize} bytes into {@code data}
 *
 * @param x       the left pixel coordinate
 * @param y       the lower pixel coordinate
 * @param width   the number of pixels to read in the x-dimension
 * @param height  the number of pixels to read in the y-dimension
 * @param format  the pixel format
 * @param type    the pixel type
 * @param bufSize the maximum number of bytes to write into {@code data}
 * @param pixels  a buffer in which to place the returned pixel data
 *
 * @see <a href="https://docs.gl/es3/glReadnPixels">Reference Page</a>
 */
    public void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int bufSize, @NativeType("void *") long pixels);

/**
 * Behaves identically to {@link GLES20#glReadPixels ReadPixels} except that it does not write more than {@code bufSize} bytes into {@code data}
 *
 * @param x      the left pixel coordinate
 * @param y      the lower pixel coordinate
 * @param width  the number of pixels to read in the x-dimension
 * @param height the number of pixels to read in the y-dimension
 * @param format the pixel format
 * @param type   the pixel type
 * @param pixels a buffer in which to place the returned pixel data
 *
 * @see <a href="https://docs.gl/es3/glReadnPixels">Reference Page</a>
 */
    public void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer pixels);

/**
 * Behaves identically to {@link GLES20#glReadPixels ReadPixels} except that it does not write more than {@code bufSize} bytes into {@code data}
 *
 * @param x      the left pixel coordinate
 * @param y      the lower pixel coordinate
 * @param width  the number of pixels to read in the x-dimension
 * @param height the number of pixels to read in the y-dimension
 * @param format the pixel format
 * @param type   the pixel type
 * @param pixels a buffer in which to place the returned pixel data
 *
 * @see <a href="https://docs.gl/es3/glReadnPixels">Reference Page</a>
 */
    public void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ShortBuffer pixels);

/**
 * Behaves identically to {@link GLES20#glReadPixels ReadPixels} except that it does not write more than {@code bufSize} bytes into {@code data}
 *
 * @param x      the left pixel coordinate
 * @param y      the lower pixel coordinate
 * @param width  the number of pixels to read in the x-dimension
 * @param height the number of pixels to read in the y-dimension
 * @param format the pixel format
 * @param type   the pixel type
 * @param pixels a buffer in which to place the returned pixel data
 *
 * @see <a href="https://docs.gl/es3/glReadnPixels">Reference Page</a>
 */
    public void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") IntBuffer pixels);

/**
 * Behaves identically to {@link GLES20#glReadPixels ReadPixels} except that it does not write more than {@code bufSize} bytes into {@code data}
 *
 * @param x      the left pixel coordinate
 * @param y      the lower pixel coordinate
 * @param width  the number of pixels to read in the x-dimension
 * @param height the number of pixels to read in the y-dimension
 * @param format the pixel format
 * @param type   the pixel type
 * @param pixels a buffer in which to place the returned pixel data
 *
 * @see <a href="https://docs.gl/es3/glReadnPixels">Reference Page</a>
 */
    public void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") FloatBuffer pixels);

/**
 * Array version of: {@link #glReadnPixels ReadnPixels}
 *
 * @see <a href="https://docs.gl/es3/glReadnPixels">Reference Page</a>
 */
    public void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") short[] pixels);

/**
 * Array version of: {@link #glReadnPixels ReadnPixels}
 *
 * @see <a href="https://docs.gl/es3/glReadnPixels">Reference Page</a>
 */
    public void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") int[] pixels);

/**
 * Array version of: {@link #glReadnPixels ReadnPixels}
 *
 * @see <a href="https://docs.gl/es3/glReadnPixels">Reference Page</a>
 */
    public void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") float[] pixels);

}
