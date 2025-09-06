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

public interface glGetTextureParameterIiv {

/**
 * Unsafe version of: {@link #glGetTextureParameterIiv GetTextureParameterIiv}
 */
    public void nglGetTextureParameterIiv(int texture, int pname, long params);

/**
 * DSA version of {@link GL30C#glGetTexParameterIiv GetTexParameterIiv}.
 *
 * @param texture the texture name
 * @param pname   the symbolic name of a texture parameter
 * @param params  returns the texture parameter value
 *
 * @see <a href="https://docs.gl/gl4/glGetTextureParameter">Reference Page</a>
 */
    public void glGetTextureParameterIiv(int texture, int pname, IntBuffer params);

/**
 * Array version of: {@link #glGetTextureParameterIiv GetTextureParameterIiv}
 *
 * @see <a href="https://docs.gl/gl4/glGetTextureParameter">Reference Page</a>
 */
    public void glGetTextureParameterIiv(int texture, int pname, int[] params);

}
