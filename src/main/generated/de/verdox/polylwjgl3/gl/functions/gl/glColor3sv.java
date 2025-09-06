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

public interface glColor3sv {

/**
 * Unsafe version of: {@link #glColor3sv Color3sv}
 */
    public void nglColor3sv(long v);

/**
 * Pointer version of {@link #glColor3s Color3s}.
 *
 * @param v the color buffer
 *
 * @see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glColor3sv(ShortBuffer v);

/**
 * Array version of: {@link #glColor3sv Color3sv}
 *
 * @see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glColor3sv(short[] v);

}
