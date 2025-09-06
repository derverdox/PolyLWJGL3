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

public interface glFogiv {

/**
 * Unsafe version of: {@link #glFogiv Fogiv}
 */
    public void nglFogiv(int pname, long params);

/**
 * Pointer version of {@link #glFogi Fogi}.
 *
 * @param pname  the fog parameter. One of:<br><table><tr><td>{@link #GL_FOG_MODE FOG_MODE}</td><td>{@link GL15#GL_FOG_COORD_SRC FOG_COORD_SRC}</td></tr></table>
 * @param params the fog parameter buffer
 *
 * @see <a href="https://docs.gl/gl3/glFog">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glFogiv(@NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params);

/**
 * Array version of: {@link #glFogiv Fogiv}
 *
 * @see <a href="https://docs.gl/gl3/glFog">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glFogiv(@NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params);

}
