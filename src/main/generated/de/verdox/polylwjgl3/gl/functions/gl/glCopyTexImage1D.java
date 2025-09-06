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

public interface glCopyTexImage1D {

/**
 * Defines a one-dimensional texel array in exactly the manner of {@link #glTexImage1D TexImage1D}, except that the image data are taken from the framebuffer rather
 * than from client memory. For the purposes of decoding the texture image, {@code CopyTexImage1D} is equivalent to calling {@link #glCopyTexImage2D CopyTexImage2D}
 * with corresponding arguments and height of 1, except that the height of the image is always 1, regardless of the value of border. level, internalformat,
 * and border are specified using the same values, with the same meanings, as the corresponding arguments of {@link #glTexImage1D TexImage1D}. The constraints on
 * width and border are exactly those of the corresponding arguments of {@link #glTexImage1D TexImage1D}.
 *
 * @param target         the texture target. Must be:<br><table><tr><td>{@link GL11C#GL_TEXTURE_1D TEXTURE_1D}</td></tr></table>
 * @param level          the level-of-detail number
 * @param internalFormat the texture internal format. See {@link #glTexImage2D TexImage2D} for a list of supported formats.
 * @param x              the left framebuffer pixel coordinate
 * @param y              the lower framebuffer pixel coordinate
 * @param width          the texture width
 * @param border         the texture border width
 *
 * @see <a href="https://docs.gl/gl4/glCopyTexImage1D">Reference Page</a>
 */
    public void glCopyTexImage1D(int target, int level, int internalFormat, int x, int y, int width, int border);

}
