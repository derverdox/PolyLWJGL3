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

public interface glColor3fv {

/**
 * Unsafe version of: {@link #glColor3fv Color3fv}
 */
    public void nglColor3fv(long v);

/**
 * Pointer version of {@link #glColor3f Color3f}.
 *
 * @param v the color buffer
 *
 * @see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glColor3fv(@NativeType("GLfloat const *") FloatBuffer v);

/**
 * Array version of: {@link #glColor3fv Color3fv}
 *
 * @see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glColor3fv(@NativeType("GLfloat const *") float[] v);

}
