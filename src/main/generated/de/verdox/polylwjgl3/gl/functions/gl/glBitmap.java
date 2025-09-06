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

public interface glBitmap {

/**
 * Unsafe version of: {@link #glBitmap Bitmap}
 */
    public void nglBitmap(int w, int h, float xOrig, float yOrig, float xInc, float yInc, long data);

/**
 * Sents a bitmap to the GL. Bitmaps are rectangles of zeros and ones specifying a particular pattern of fragments to be produced. Each of these fragments
 * has the same associated data. These data are those associated with the current raster position.
 *
 * @param w     the bitmap width
 * @param h     the bitmap width
 * @param xOrig the bitmap origin x coordinate
 * @param yOrig the bitmap origin y coordinate
 * @param xInc  the x increment added to the raster position
 * @param yInc  the y increment added to the raster position
 * @param data  the buffer containing the bitmap data.
 *
 * @see <a href="https://docs.gl/gl3/glBitmap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glBitmap(@NativeType("GLsizei") int w, @NativeType("GLsizei") int h, @NativeType("GLfloat") float xOrig, @NativeType("GLfloat") float yOrig, @NativeType("GLfloat") float xInc, @NativeType("GLfloat") float yInc, @Nullable @NativeType("GLubyte const *") ByteBuffer data);

/**
 * Sents a bitmap to the GL. Bitmaps are rectangles of zeros and ones specifying a particular pattern of fragments to be produced. Each of these fragments
 * has the same associated data. These data are those associated with the current raster position.
 *
 * @param w     the bitmap width
 * @param h     the bitmap width
 * @param xOrig the bitmap origin x coordinate
 * @param yOrig the bitmap origin y coordinate
 * @param xInc  the x increment added to the raster position
 * @param yInc  the y increment added to the raster position
 * @param data  the buffer containing the bitmap data.
 *
 * @see <a href="https://docs.gl/gl3/glBitmap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glBitmap(@NativeType("GLsizei") int w, @NativeType("GLsizei") int h, @NativeType("GLfloat") float xOrig, @NativeType("GLfloat") float yOrig, @NativeType("GLfloat") float xInc, @NativeType("GLfloat") float yInc, @NativeType("GLubyte const *") long data);

}
