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

public interface glRectfv {

/**
 * Unsafe version of: {@link #glRectfv Rectfv}
 */
    public void nglRectfv(long v1, long v2);

/**
 * Pointer version of {@link #glRectf Rectf}.
 *
 * @param v1 the first vertex buffer
 * @param v2 the second vertex buffer
 *
 * @see <a href="https://docs.gl/gl3/glRect">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glRectfv(@NativeType("GLfloat const *") FloatBuffer v1, @NativeType("GLfloat const *") FloatBuffer v2);

/**
 * Array version of: {@link #glRectfv Rectfv}
 *
 * @see <a href="https://docs.gl/gl3/glRect">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glRectfv(@NativeType("GLfloat const *") float[] v1, @NativeType("GLfloat const *") float[] v2);

}
