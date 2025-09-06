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

public interface glMaterialiv {

/**
 * Unsafe version of: {@link #glMaterialiv Materialiv}
 */
    public void nglMaterialiv(int face, int pname, long params);

/**
 * Pointer version of {@link #glMateriali Materiali}.
 *
 * @param face   the material face for which to set the parameter
 * @param pname  the parameter to set. One of:<br><table><tr><td>{@link #GL_AMBIENT AMBIENT}</td><td>{@link #GL_DIFFUSE DIFFUSE}</td><td>{@link #GL_AMBIENT_AND_DIFFUSE AMBIENT_AND_DIFFUSE}</td><td>{@link #GL_SPECULAR SPECULAR}</td><td>{@link #GL_EMISSION EMISSION}</td></tr></table>
 * @param params the parameter value
 *
 * @see <a href="https://docs.gl/gl3/glMaterial">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glMaterialiv(int face, int pname, IntBuffer params);

/**
 * Array version of: {@link #glMaterialiv Materialiv}
 *
 * @see <a href="https://docs.gl/gl3/glMaterial">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glMaterialiv(int face, int pname, int[] params);

}
