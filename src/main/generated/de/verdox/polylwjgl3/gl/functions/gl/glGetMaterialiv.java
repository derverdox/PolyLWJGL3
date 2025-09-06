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

public interface glGetMaterialiv {

/**
 * Unsafe version of: {@link #glGetMaterialiv GetMaterialiv}
 */
    public void nglGetMaterialiv(int face, int pname, long data);

/**
 * Returns integer information about material property {@code pname} for {@code face} in {@code data}.
 *
 * @param face  the material face for which to return information. One of:<br><table><tr><td>{@link #GL_FRONT FRONT}</td><td>{@link #GL_BACK BACK}</td></tr></table>
 * @param pname the information to query. One of:<br><table><tr><td>{@link #GL_AMBIENT AMBIENT}</td><td>{@link #GL_DIFFUSE DIFFUSE}</td><td>{@link #GL_SPECULAR SPECULAR}</td><td>{@link #GL_EMISSION EMISSION}</td><td>{@link #GL_SHININESS SHININESS}</td></tr></table>
 * @param data  a scalar or buffer in which to place the returned data
 *
 * @see <a href="https://docs.gl/gl3/glGetMaterial">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glGetMaterialiv(@NativeType("GLenum") int face, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer data);

/**
 * Array version of: {@link #glGetMaterialiv GetMaterialiv}
 *
 * @see <a href="https://docs.gl/gl3/glGetMaterial">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glGetMaterialiv(@NativeType("GLenum") int face, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] data);

}
