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

public interface glGetTexGenf {

/**
 * Float version of {@link #glGetTexGeniv GetTexGeniv}.
 *
 * @param coord the coord to query
 * @param pname the parameter to query
 *
 * @see <a href="https://docs.gl/gl3/glGetTexGen">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public float glGetTexGenf(int coord, int pname);

}
