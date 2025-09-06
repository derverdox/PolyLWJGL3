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

public interface glTexCoord4dv {

/**
 * Unsafe version of: {@link #glTexCoord4dv TexCoord4dv}
 */
    public void nglTexCoord4dv(long v);

/**
 * Pointer version of {@link #glTexCoord4d TexCoord4d}.
 *
 * @param v the texture coordinate buffer
 *
 * @see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glTexCoord4dv(@NativeType("GLdouble const *") DoubleBuffer v);

/**
 * Array version of: {@link #glTexCoord4dv TexCoord4dv}
 *
 * @see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glTexCoord4dv(@NativeType("GLdouble const *") double[] v);

}
