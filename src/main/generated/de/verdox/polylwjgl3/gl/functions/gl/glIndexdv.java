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

public interface glIndexdv {

/**
 * Unsafe version of: {@link #glIndexdv Indexdv}
 */
    public void nglIndexdv(long index);

/**
 * Pointer version of {@link #glIndexd Indexd}.
 *
 * @param index the value to which the current color index should be set
 *
 * @see <a href="https://docs.gl/gl3/glIndex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glIndexdv(@NativeType("GLdouble const *") DoubleBuffer index);

/**
 * Array version of: {@link #glIndexdv Indexdv}
 *
 * @see <a href="https://docs.gl/gl3/glIndex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glIndexdv(@NativeType("GLdouble const *") double[] index);

}
