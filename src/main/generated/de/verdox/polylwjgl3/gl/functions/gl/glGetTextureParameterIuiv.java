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

public interface glGetTextureParameterIuiv {

/**
 * Unsafe version of: {@link #glGetTextureParameterIuiv GetTextureParameterIuiv}
 */
    public void nglGetTextureParameterIuiv(int texture, int pname, long params);

/**
 * DSA version of {@link GL30C#glGetTexParameterIuiv GetTexParameterIuiv}.
 *
 * @param texture the texture name
 * @param pname   the symbolic name of a texture parameter
 * @param params  returns the texture parameter value
 *
 * @see <a href="https://docs.gl/gl4/glGetTextureParameter">Reference Page</a>
 */
    public void glGetTextureParameterIuiv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params);

/**
 * Array version of: {@link #glGetTextureParameterIuiv GetTextureParameterIuiv}
 *
 * @see <a href="https://docs.gl/gl4/glGetTextureParameter">Reference Page</a>
 */
    public void glGetTextureParameterIuiv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params);

}
