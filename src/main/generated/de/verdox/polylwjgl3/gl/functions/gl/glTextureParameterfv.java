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

public interface glTextureParameterfv {

/**
 * Unsafe version of: {@link #glTextureParameterfv TextureParameterfv}
 */
    public void nglTextureParameterfv(int texture, int pname, long params);

/**
 * DSA version of {@link GL11C#glTexParameterfv TexParameterfv}.
 *
 * @param texture the texture name
 * @param pname   the parameter to set
 * @param params  the parameter value
 *
 * @see <a href="https://docs.gl/gl4/glTextureParameter">Reference Page</a>
 */
    public void glTextureParameterfv(int texture, int pname, FloatBuffer params);

/**
 * Array version of: {@link #glTextureParameterfv TextureParameterfv}
 *
 * @see <a href="https://docs.gl/gl4/glTextureParameter">Reference Page</a>
 */
    public void glTextureParameterfv(int texture, int pname, float[] params);

}
