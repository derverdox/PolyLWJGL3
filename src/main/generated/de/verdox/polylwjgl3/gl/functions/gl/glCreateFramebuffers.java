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

public interface glCreateFramebuffers {

/**
 * Unsafe version of: {@link #glCreateFramebuffers CreateFramebuffers}
 *
 * @param n the number of framebuffer names to create
 */
    public void nglCreateFramebuffers(int n, long framebuffers);

/**
 * Returns {@code n} previously unused framebuffer names in {@code framebuffers}, each representing a new framebuffer object.
 *
 * @param framebuffers the buffer in which to store the framebuffer names
 *
 * @see <a href="https://docs.gl/gl4/glCreateFramebuffers">Reference Page</a>
 */
    public void glCreateFramebuffers(IntBuffer framebuffers);

/**
 * Returns {@code n} previously unused framebuffer names in {@code framebuffers}, each representing a new framebuffer object.
 *
 * @see <a href="https://docs.gl/gl4/glCreateFramebuffers">Reference Page</a>
 */
    public int glCreateFramebuffers();

/**
 * Array version of: {@link #glCreateFramebuffers CreateFramebuffers}
 *
 * @see <a href="https://docs.gl/gl4/glCreateFramebuffers">Reference Page</a>
 */
    public void glCreateFramebuffers(int[] framebuffers);

}
