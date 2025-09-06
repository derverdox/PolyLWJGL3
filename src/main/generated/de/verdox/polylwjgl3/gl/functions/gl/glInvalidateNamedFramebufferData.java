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

public interface glInvalidateNamedFramebufferData {

/**
 * Unsafe version of: {@link #glInvalidateNamedFramebufferData InvalidateNamedFramebufferData}
 *
 * @param numAttachments the number of entries in the {@code attachments} array
 */
    public void nglInvalidateNamedFramebufferData(int framebuffer, int numAttachments, long attachments);

/**
 * DSA version of {@link GL43C#glInvalidateFramebuffer InvalidateFramebuffer}.
 *
 * @param framebuffer the framebuffer name
 * @param attachments the address of an array identifying the attachments to be invalidated
 *
 * @see <a href="https://docs.gl/gl4/glInvalidateFramebufferData">Reference Page</a>
 */
    public void glInvalidateNamedFramebufferData(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") IntBuffer attachments);

/**
 * DSA version of {@link GL43C#glInvalidateFramebuffer InvalidateFramebuffer}.
 *
 * @param framebuffer the framebuffer name
 *
 * @see <a href="https://docs.gl/gl4/glInvalidateFramebufferData">Reference Page</a>
 */
    public void glInvalidateNamedFramebufferData(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") int attachment);

/**
 * Array version of: {@link #glInvalidateNamedFramebufferData InvalidateNamedFramebufferData}
 *
 * @see <a href="https://docs.gl/gl4/glInvalidateFramebufferData">Reference Page</a>
 */
    public void glInvalidateNamedFramebufferData(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") int[] attachments);

}
