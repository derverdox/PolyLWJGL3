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

public interface glGetDoublev {

/**
 * Unsafe version of: {@link #glGetDoublev GetDoublev}
 */
    public void nglGetDoublev(int pname, long params);

/**
 * Returns the current double value of the specified state variable.
 *
 * <p><b>LWJGL note</b>: The state that corresponds to the state variable may be a single value or an array of values. In the case of an array of values,
 * LWJGL will <b>not</b> validate if {@code params} has enough space to store that array. Doing so would introduce significant overhead, as the
 * OpenGL state variables are too many. It is the user's responsibility to avoid JVM crashes by ensuring enough space for the returned values.</p>
 *
 * @param pname  the state variable
 * @param params a scalar or buffer in which to place the returned data
 *
 * @see <a href="https://docs.gl/gl4/glGetDoublev">Reference Page</a>
 */
    public void glGetDoublev(@NativeType("GLenum") int pname, @NativeType("GLdouble *") DoubleBuffer params);

/**
 * Array version of: {@link #glGetDoublev GetDoublev}
 *
 * @see <a href="https://docs.gl/gl4/glGetDoublev">Reference Page</a>
 */
    public void glGetDoublev(@NativeType("GLenum") int pname, @NativeType("GLdouble *") double[] params);

}
