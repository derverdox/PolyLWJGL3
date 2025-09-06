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

public interface glLightModelfv {

/**
 * Unsafe version of: {@link #glLightModelfv LightModelfv}
 */
    public void nglLightModelfv(int pname, long params);

/**
 * Pointer version of {@link #glLightModelf LightModelf}.
 *
 * @param pname  the lighting model parameter to set
 * @param params the parameter value
 *
 * @see <a href="https://docs.gl/gl3/glLightModel">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glLightModelfv(int pname, FloatBuffer params);

/**
 * Array version of: {@link #glLightModelfv LightModelfv}
 *
 * @see <a href="https://docs.gl/gl3/glLightModel">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glLightModelfv(int pname, float[] params);

}
