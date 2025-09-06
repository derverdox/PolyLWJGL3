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

public interface glTexGeniv {

/**
 * Unsafe version of: {@link #glTexGeniv TexGeniv}
 */
    public void nglTexGeniv(int coord, int pname, long params);

/**
 * Pointer version of {@link #glTexGeni TexGeni}.
 *
 * @param coord  the coordinate for which to set the parameter
 * @param pname  the parameter to set. One of:<br><table><tr><td>{@link #GL_OBJECT_PLANE OBJECT_PLANE}</td><td>{@link #GL_EYE_PLANE EYE_PLANE}</td></tr></table>
 * @param params the parameter value
 *
 * @see <a href="https://docs.gl/gl3/glTexGen">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glTexGeniv(int coord, int pname, IntBuffer params);

/**
 * Array version of: {@link #glTexGeniv TexGeniv}
 *
 * @see <a href="https://docs.gl/gl3/glTexGen">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glTexGeniv(int coord, int pname, int[] params);

}
