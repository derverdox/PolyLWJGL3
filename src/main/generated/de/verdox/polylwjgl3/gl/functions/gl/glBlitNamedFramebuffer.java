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

public interface glBlitNamedFramebuffer {

/**
 * DSA version of {@link GL30C#glBlitFramebuffer BlitFramebuffer}.
 *
 * @param readFramebuffer the source framebuffer name
 * @param drawFramebuffer the destination framebuffer name
 * @param srcX0           the lower-left coordinate of the source rectangle within the read buffer
 * @param srcY0           the upper-left coordinate of the source rectangle within the read buffer
 * @param srcX1           the lower-right coordinate of the source rectangle within the read buffer
 * @param srcY1           the upper-right coordinate of the source rectangle within the read buffer
 * @param dstX0           the lower-left coordinate of the destination rectangle within the write buffer
 * @param dstY0           the upper-left coordinate of the destination rectangle within the write buffer
 * @param dstX1           the lower-right coordinate of the destination rectangle within the write buffer
 * @param dstY1           the upper-right coordinate of the destination rectangle within the write buffer
 * @param mask            the bitwise OR of the flags indicating which buffers are to be copied. One of:<br><table><tr><td>{@link GL11#GL_COLOR_BUFFER_BIT COLOR_BUFFER_BIT}</td><td>{@link GL11#GL_DEPTH_BUFFER_BIT DEPTH_BUFFER_BIT}</td><td>{@link GL11#GL_STENCIL_BUFFER_BIT STENCIL_BUFFER_BIT}</td></tr></table>
 * @param filter          the interpolation to be applied if the image is stretched. One of:<br><table><tr><td>{@link GL11#GL_NEAREST NEAREST}</td><td>{@link GL11#GL_LINEAR LINEAR}</td></tr></table>
 *
 * @see <a href="https://docs.gl/gl4/glBlitFramebuffer">Reference Page</a>
 */
    public void glBlitNamedFramebuffer(int readFramebuffer, int drawFramebuffer, int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter);

}
