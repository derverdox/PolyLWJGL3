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

public interface glTexCoord3fv {

/**
 * Unsafe version of: {@link #glTexCoord3fv TexCoord3fv}
 */
    public void nglTexCoord3fv(long v);

/**
 * Pointer version of {@link #glTexCoord3f TexCoord3f}.
 *
 * @param v the texture coordinate buffer
 *
 * @see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glTexCoord3fv(FloatBuffer v);

/**
 * Array version of: {@link #glTexCoord3fv TexCoord3fv}
 *
 * @see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glTexCoord3fv(float[] v);

}
