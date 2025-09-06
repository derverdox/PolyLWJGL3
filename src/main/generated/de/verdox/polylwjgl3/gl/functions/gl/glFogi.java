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

public interface glFogi {

/**
 * Sets the integer value of a fog parameter.
 *
 * @param pname the fog parameter. One of:<br><table><tr><td>{@link #GL_FOG_MODE FOG_MODE}</td><td>{@link GL15#GL_FOG_COORD_SRC FOG_COORD_SRC}</td></tr></table>
 * @param param the fog parameter value. One of:<br><table><tr><td>{@link #GL_EXP EXP}</td><td>{@link #GL_EXP2 EXP2}</td><td>{@link #GL_LINEAR LINEAR}</td><td>{@link GL14#GL_FRAGMENT_DEPTH FRAGMENT_DEPTH}</td><td>{@link GL15#GL_FOG_COORD FOG_COORD}</td></tr></table>
 *
 * @see <a href="https://docs.gl/gl3/glFogi">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glFogi(@NativeType("GLenum") int pname, @NativeType("GLint") int param);

}
