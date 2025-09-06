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

public interface glLightfv {

/**
 * Unsafe version of: {@link #glLightfv Lightfv}
 */
    public void nglLightfv(int light, int pname, long params);

/**
 * Pointer version of {@link #glLightf Lightf}.
 *
 * @param light  the light for which to set the parameter
 * @param pname  the parameter to set
 * @param params the parameter value
 *
 * @see <a href="https://docs.gl/gl3/glLight">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glLightfv(int light, int pname, FloatBuffer params);

/**
 * Array version of: {@link #glLightfv Lightfv}
 *
 * @see <a href="https://docs.gl/gl3/glLight">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glLightfv(int light, int pname, float[] params);

}
