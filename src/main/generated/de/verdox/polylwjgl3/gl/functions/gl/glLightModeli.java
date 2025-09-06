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

public interface glLightModeli {

/**
 * Set the integer value of a lighting model parameter.
 *
 * @param pname the lighting model parameter to set. One of:<br><table><tr><td>{@link #GL_LIGHT_MODEL_AMBIENT LIGHT_MODEL_AMBIENT}</td><td>{@link #GL_LIGHT_MODEL_LOCAL_VIEWER LIGHT_MODEL_LOCAL_VIEWER}</td><td>{@link #GL_LIGHT_MODEL_TWO_SIDE LIGHT_MODEL_TWO_SIDE}</td></tr><tr><td>{@link GL12#GL_LIGHT_MODEL_COLOR_CONTROL LIGHT_MODEL_COLOR_CONTROL}</td></tr></table>
 * @param param the parameter value
 *
 * @see <a href="https://docs.gl/gl3/glLightModeli">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glLightModeli(@NativeType("GLenum") int pname, @NativeType("GLint") int param);

}
