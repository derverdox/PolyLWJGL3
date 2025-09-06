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

public interface glMaterialf {

/**
 * Float version of {@link #glMateriali Materiali}.
 *
 * @param face  the material face for which to set the parameter
 * @param pname the parameter to set
 * @param param the parameter value
 *
 * @see <a href="https://docs.gl/gl3/glMaterialf">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glMaterialf(@NativeType("GLenum") int face, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param);

}
