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

public interface glTexGendv {

/**
 * Unsafe version of: {@link #glTexGendv TexGendv}
 */
    public void nglTexGendv(int coord, int pname, long params);

/**
 * Pointer version of {@link #glTexGend TexGend}.
 *
 * @param coord  the coordinate for which to set the parameter
 * @param pname  the parameter to set
 * @param params the parameter value
 *
 * @see <a href="https://docs.gl/gl3/glTexGen">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glTexGendv(int coord, int pname, DoubleBuffer params);

/**
 * Array version of: {@link #glTexGendv TexGendv}
 *
 * @see <a href="https://docs.gl/gl3/glTexGen">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glTexGendv(int coord, int pname, double[] params);

}
