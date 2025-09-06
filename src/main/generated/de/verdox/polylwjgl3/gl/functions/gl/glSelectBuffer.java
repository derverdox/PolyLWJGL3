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

public interface glSelectBuffer {

/**
 * Unsafe version of: {@link #glSelectBuffer SelectBuffer}
 *
 * @param size the maximum number of values that can be stored in {@code buffer}
 */
    public void nglSelectBuffer(int size, long buffer);

/**
 * Sets the selection array.
 *
 * @param buffer an array of unsigned integers to be potentially filled names
 *
 * @see <a href="https://docs.gl/gl3/glSelectBuffer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glSelectBuffer(@NativeType("GLuint *") IntBuffer buffer);

/**
 * Array version of: {@link #glSelectBuffer SelectBuffer}
 *
 * @see <a href="https://docs.gl/gl3/glSelectBuffer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glSelectBuffer(@NativeType("GLuint *") int[] buffer);

}
