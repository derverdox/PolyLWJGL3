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

public interface glGetCompressedTextureImage {

/**
 * Unsafe version of: {@link #glGetCompressedTextureImage GetCompressedTextureImage}
 *
 * @param bufSize the size of the buffer to receive the retrieved pixel data
 */
    public void nglGetCompressedTextureImage(int texture, int level, int bufSize, long pixels);

/**
 * DSA version of {@link GL13C#glGetCompressedTexImage GetCompressedTexImage}.
 *
 * @param texture the texture name
 * @param level   the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
 * @param bufSize the size of the buffer to receive the retrieved pixel data
 * @param pixels  a buffer in which to return the compressed texture image
 *
 * @see <a href="https://docs.gl/gl4/glGetCompressedTextureImage">Reference Page</a>
 */
    public void glGetCompressedTextureImage(int texture, int level, int bufSize, long pixels);

/**
 * DSA version of {@link GL13C#glGetCompressedTexImage GetCompressedTexImage}.
 *
 * @param texture the texture name
 * @param level   the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
 * @param pixels  a buffer in which to return the compressed texture image
 *
 * @see <a href="https://docs.gl/gl4/glGetCompressedTextureImage">Reference Page</a>
 */
    public void glGetCompressedTextureImage(int texture, int level, ByteBuffer pixels);

}
