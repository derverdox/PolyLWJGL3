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

public interface glNormal3sv {

/**
 * Unsafe version of: {@link #glNormal3sv Normal3sv}
 */
    public void nglNormal3sv(long v);

/**
 * Pointer version of {@link #glNormal3s Normal3s}.
 *
 * @param v the normal buffer
 *
 * @see <a href="https://docs.gl/gl3/glNormal">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glNormal3sv(@NativeType("GLshort const *") ShortBuffer v);

/**
 * Array version of: {@link #glNormal3sv Normal3sv}
 *
 * @see <a href="https://docs.gl/gl3/glNormal">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glNormal3sv(@NativeType("GLshort const *") short[] v);

}
