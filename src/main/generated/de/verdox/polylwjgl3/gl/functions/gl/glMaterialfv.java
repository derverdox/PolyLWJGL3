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

public interface glMaterialfv {

/**
 * Unsafe version of: {@link #glMaterialfv Materialfv}
 */
    public void nglMaterialfv(int face, int pname, long params);

/**
 * Pointer version of {@link #glMaterialf Materialf}.
 *
 * @param face   the material face for which to set the parameter
 * @param pname  the parameter to set
 * @param params the parameter value
 *
 * @see <a href="https://docs.gl/gl3/glMaterial">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glMaterialfv(@NativeType("GLenum") int face, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params);

/**
 * Array version of: {@link #glMaterialfv Materialfv}
 *
 * @see <a href="https://docs.gl/gl3/glMaterial">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glMaterialfv(@NativeType("GLenum") int face, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] params);

}
