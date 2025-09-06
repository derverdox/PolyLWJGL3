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

public interface glIndexfv {

/**
 * Unsafe version of: {@link #glIndexfv Indexfv}
 */
    public void nglIndexfv(long index);

/**
 * Pointer version of {@link #glIndexf Indexf}.
 *
 * @param index the value to which the current color index should be set
 *
 * @see <a href="https://docs.gl/gl3/glIndex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glIndexfv(@NativeType("GLfloat const *") FloatBuffer index);

/**
 * Array version of: {@link #glIndexfv Indexfv}
 *
 * @see <a href="https://docs.gl/gl3/glIndex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glIndexfv(@NativeType("GLfloat const *") float[] index);

}
