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

public interface glLightModeliv {

/**
 * Unsafe version of: {@link #glLightModeliv LightModeliv}
 */
    public void nglLightModeliv(int pname, long params);

/**
 * Pointer version of {@link #glLightModeli LightModeli}.
 *
 * @param pname  the lighting model parameter to set
 * @param params the parameter value
 *
 * @see <a href="https://docs.gl/gl3/glLightModel">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glLightModeliv(int pname, IntBuffer params);

/**
 * Array version of: {@link #glLightModeliv LightModeliv}
 *
 * @see <a href="https://docs.gl/gl3/glLightModel">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glLightModeliv(int pname, int[] params);

}
