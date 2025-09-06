package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl44.GL44Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl44.GL44AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL45;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glGetTextureParameterfv {

/**
 * Unsafe version of: {@link #glGetTextureParameterfv GetTextureParameterfv}
 */
    public void nglGetTextureParameterfv(int texture, int pname, long params);

/**
 * DSA version of {@link GL11C#glGetTexParameterfv GetTexParameterfv}.
 *
 * @param texture the texture name
 * @param pname   the parameter to query
 * @param params  a scalar or buffer in which to place the returned data
 *
 * @see <a href="https://docs.gl/gl4/glGetTextureParameter">Reference Page</a>
 */
    public void glGetTextureParameterfv(int texture, int pname, FloatBuffer params);

/**
 * Array version of: {@link #glGetTextureParameterfv GetTextureParameterfv}
 *
 * @see <a href="https://docs.gl/gl4/glGetTextureParameter">Reference Page</a>
 */
    public void glGetTextureParameterfv(int texture, int pname, float[] params);

}
