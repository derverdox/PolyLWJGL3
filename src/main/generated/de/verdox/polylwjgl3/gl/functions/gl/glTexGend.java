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

public interface glTexGend {

/**
 * Double version of {@link #glTexGeni TexGeni}.
 *
 * @param coord the coordinate for which to set the parameter
 * @param pname the parameter to set
 * @param param the parameter value
 *
 * @see <a href="https://docs.gl/gl3/glTexGend">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glTexGend(int coord, int pname, double param);

}
