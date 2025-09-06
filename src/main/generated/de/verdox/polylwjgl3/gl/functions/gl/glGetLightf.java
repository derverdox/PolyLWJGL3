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

public interface glGetLightf {

/**
 * Float version of {@link #glGetLightiv GetLightiv}.
 *
 * @param light the light for which to return information
 * @param pname the light parameter to query
 *
 * @see <a href="https://docs.gl/gl3/glGetLight">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public float glGetLightf(int light, int pname);

}
