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

public interface glTextureParameterIiv {

/**
 * Unsafe version of: {@link #glTextureParameterIiv TextureParameterIiv}
 */
    public void nglTextureParameterIiv(int texture, int pname, long params);

/**
 * DSA version of {@link GL30C#glTexParameterIiv TexParameterIiv}.
 *
 * @param texture the texture name
 * @param pname   the symbolic name of a single-valued texture parameter
 * @param params  the value of {@code pname}
 *
 * @see <a href="https://docs.gl/gl4/glTextureParameter">Reference Page</a>
 */
    public void glTextureParameterIiv(int texture, int pname, IntBuffer params);

/**
 * Array version of: {@link #glTextureParameterIiv TextureParameterIiv}
 *
 * @see <a href="https://docs.gl/gl4/glTextureParameter">Reference Page</a>
 */
    public void glTextureParameterIiv(int texture, int pname, int[] params);

}
