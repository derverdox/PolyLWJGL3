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

public interface glFogfv {

/**
 * Unsafe version of: {@link #glFogfv Fogfv}
 */
    public void nglFogfv(int pname, long params);

/**
 * Pointer version of {@link #glFogf Fogf}.
 *
 * @param pname  the fog parameter. One of:<br><table><tr><td>{@link #GL_FOG_DENSITY FOG_DENSITY}</td><td>{@link #GL_FOG_START FOG_START}</td><td>{@link #GL_FOG_END FOG_END}</td></tr></table>
 * @param params the fog parameter buffer
 *
 * @see <a href="https://docs.gl/gl3/glFog">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glFogfv(int pname, FloatBuffer params);

/**
 * Array version of: {@link #glFogfv Fogfv}
 *
 * @see <a href="https://docs.gl/gl3/glFog">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glFogfv(int pname, float[] params);

}
