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

public interface glLighti {

/**
 * Sets the integer value of a light parameter.
 *
 * @param light the light for which to set the parameter. One of:<br><table><tr><td>{@link #GL_LIGHT0 LIGHT0}</td><td>GL_LIGHT[1-7]</td></tr></table>
 * @param pname the parameter to set. One of:<br><table><tr><td>{@link #GL_AMBIENT AMBIENT}</td><td>{@link #GL_DIFFUSE DIFFUSE}</td><td>{@link #GL_SPECULAR SPECULAR}</td><td>{@link #GL_POSITION POSITION}</td><td>{@link #GL_CONSTANT_ATTENUATION CONSTANT_ATTENUATION}</td><td>{@link #GL_LINEAR_ATTENUATION LINEAR_ATTENUATION}</td></tr><tr><td>{@link #GL_QUADRATIC_ATTENUATION QUADRATIC_ATTENUATION}</td><td>{@link #GL_SPOT_DIRECTION SPOT_DIRECTION}</td><td>{@link #GL_SPOT_EXPONENT SPOT_EXPONENT}</td><td>{@link #GL_SPOT_CUTOFF SPOT_CUTOFF}</td></tr></table>
 * @param param the parameter value
 *
 * @see <a href="https://docs.gl/gl3/glLighti">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glLighti(int light, int pname, int param);

}
