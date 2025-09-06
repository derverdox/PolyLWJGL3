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

public interface glTextureParameteriv {

/**
 * Unsafe version of: {@link #glTextureParameteriv TextureParameteriv}
 */
    public void nglTextureParameteriv(int texture, int pname, long params);

/**
 * DSA version of {@link GL11C#glTexParameteriv TexParameteriv}.
 *
 * @param texture the texture name
 * @param pname   the parameter to set
 * @param params  the parameter value
 *
 * @see <a href="https://docs.gl/gl4/glTextureParameter">Reference Page</a>
 */
    public void glTextureParameteriv(int texture, int pname, IntBuffer params);

/**
 * Array version of: {@link #glTextureParameteriv TextureParameteriv}
 *
 * @see <a href="https://docs.gl/gl4/glTextureParameter">Reference Page</a>
 */
    public void glTextureParameteriv(int texture, int pname, int[] params);

}
