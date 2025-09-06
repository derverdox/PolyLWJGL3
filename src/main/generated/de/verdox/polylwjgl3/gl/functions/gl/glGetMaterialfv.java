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

public interface glGetMaterialfv {

/**
 * Unsafe version of: {@link #glGetMaterialfv GetMaterialfv}
 */
    public void nglGetMaterialfv(int face, int pname, long data);

/**
 * Float version of {@link #glGetMaterialiv GetMaterialiv}.
 *
 * @param face  the material face for which to return information
 * @param pname the information to query
 * @param data  a scalar or buffer in which to place the returned data
 *
 * @see <a href="https://docs.gl/gl3/glGetMaterial">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glGetMaterialfv(@NativeType("GLenum") int face, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer data);

/**
 * Array version of: {@link #glGetMaterialfv GetMaterialfv}
 *
 * @see <a href="https://docs.gl/gl3/glGetMaterial">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glGetMaterialfv(@NativeType("GLenum") int face, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] data);

}
