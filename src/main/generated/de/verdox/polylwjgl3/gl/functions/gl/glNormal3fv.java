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

public interface glNormal3fv {

/**
 * Unsafe version of: {@link #glNormal3fv Normal3fv}
 */
    public void nglNormal3fv(long v);

/**
 * Pointer version of {@link #glNormal3f Normal3f}.
 *
 * @param v the normal buffer
 *
 * @see <a href="https://docs.gl/gl3/glNormal">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glNormal3fv(@NativeType("GLfloat const *") FloatBuffer v);

/**
 * Array version of: {@link #glNormal3fv Normal3fv}
 *
 * @see <a href="https://docs.gl/gl3/glNormal">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glNormal3fv(@NativeType("GLfloat const *") float[] v);

}
