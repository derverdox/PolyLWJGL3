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

public interface glColor4iv {

/**
 * Unsafe version of: {@link #glColor4iv Color4iv}
 */
    public void nglColor4iv(long v);

/**
 * Pointer version of {@link #glColor4i Color4i}.
 *
 * @param v the color buffer
 *
 * @see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glColor4iv(@NativeType("GLint const *") IntBuffer v);

/**
 * Array version of: {@link #glColor4iv Color4iv}
 *
 * @see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glColor4iv(@NativeType("GLint const *") int[] v);

}
