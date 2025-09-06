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

public interface glInvalidateNamedFramebufferSubData {

/**
 * Unsafe version of: {@link #glInvalidateNamedFramebufferSubData InvalidateNamedFramebufferSubData}
 *
 * @param numAttachments the number of entries in the {@code attachments} array
 */
    public void nglInvalidateNamedFramebufferSubData(int framebuffer, int numAttachments, long attachments, int x, int y, int width, int height);

/**
 * DSA version of {@link GL43C#glInvalidateSubFramebuffer InvalidateSubFramebuffer}.
 *
 * @param framebuffer the framebuffer name
 * @param attachments an array identifying the attachments to be invalidated
 * @param x           the X offset of the region to be invalidated
 * @param y           the Y offset of the region to be invalidated
 * @param width       the width of the region to be invalidated
 * @param height      the height of the region to be invalidated
 *
 * @see <a href="https://docs.gl/gl4/glInvalidateFramebufferSubData">Reference Page</a>
 */
    public void glInvalidateNamedFramebufferSubData(int framebuffer, IntBuffer attachments, int x, int y, int width, int height);

/**
 * DSA version of {@link GL43C#glInvalidateSubFramebuffer InvalidateSubFramebuffer}.
 *
 * @param framebuffer the framebuffer name
 * @param x           the X offset of the region to be invalidated
 * @param y           the Y offset of the region to be invalidated
 * @param width       the width of the region to be invalidated
 * @param height      the height of the region to be invalidated
 *
 * @see <a href="https://docs.gl/gl4/glInvalidateFramebufferSubData">Reference Page</a>
 */
    public void glInvalidateNamedFramebufferSubData(int framebuffer, int attachment, int x, int y, int width, int height);

/**
 * Array version of: {@link #glInvalidateNamedFramebufferSubData InvalidateNamedFramebufferSubData}
 *
 * @see <a href="https://docs.gl/gl4/glInvalidateFramebufferSubData">Reference Page</a>
 */
    public void glInvalidateNamedFramebufferSubData(int framebuffer, int[] attachments, int x, int y, int width, int height);

}
