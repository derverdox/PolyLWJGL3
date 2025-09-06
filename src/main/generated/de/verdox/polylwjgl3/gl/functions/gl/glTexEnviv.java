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

public interface glTexEnviv {

/**
 * Unsafe version of: {@link #glTexEnviv TexEnviv}
 */
    public void nglTexEnviv(int target, int pname, long params);

/**
 * Pointer version of {@link #glTexEnvi TexEnvi}.
 *
 * @param target the texture environment target. Must be:<br><table><tr><td>{@link #GL_TEXTURE_ENV TEXTURE_ENV}</td></tr></table>
 * @param pname  the parameter to set. Must be:<br><table><tr><td>{@link #GL_TEXTURE_ENV_COLOR TEXTURE_ENV_COLOR}</td></tr></table>
 * @param params the parameter value
 *
 * @see <a href="https://docs.gl/gl3/glTexEnv">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glTexEnviv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params);

/**
 * Array version of: {@link #glTexEnviv TexEnviv}
 *
 * @see <a href="https://docs.gl/gl3/glTexEnv">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glTexEnviv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params);

}
