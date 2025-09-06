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

public interface glReadPixels {

    public void nglReadPixels(int x, int y, int width, int height, int format, int type, long pixels);

/**
 * <a href="https://docs.gl/es3/glReadPixels">Reference Page</a>
 */
    public void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer pixels);

/**
 * <a href="https://docs.gl/es3/glReadPixels">Reference Page</a>
 */
    public void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") long pixels);

/**
 * <a href="https://docs.gl/es3/glReadPixels">Reference Page</a>
 */
    public void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ShortBuffer pixels);

/**
 * <a href="https://docs.gl/es3/glReadPixels">Reference Page</a>
 */
    public void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") IntBuffer pixels);

/**
 * <a href="https://docs.gl/es3/glReadPixels">Reference Page</a>
 */
    public void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") FloatBuffer pixels);

/**
 * Array version of: {@link #glReadPixels ReadPixels}
 *
 * @see <a href="https://docs.gl/es3/glReadPixels">Reference Page</a>
 */
    public void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") short[] pixels);

/**
 * Array version of: {@link #glReadPixels ReadPixels}
 *
 * @see <a href="https://docs.gl/es3/glReadPixels">Reference Page</a>
 */
    public void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") int[] pixels);

/**
 * Array version of: {@link #glReadPixels ReadPixels}
 *
 * @see <a href="https://docs.gl/es3/glReadPixels">Reference Page</a>
 */
    public void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") float[] pixels);

}
