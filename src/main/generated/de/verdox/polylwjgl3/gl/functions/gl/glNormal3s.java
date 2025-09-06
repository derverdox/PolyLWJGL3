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

public interface glNormal3s {

/**
 * Short version of {@link #glNormal3f Normal3f}.
 *
 * @param nx the x coordinate of the current normal
 * @param ny the y coordinate of the current normal
 * @param nz the z coordinate of the current normal
 *
 * @see <a href="https://docs.gl/gl3/glNormal">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glNormal3s(short nx, short ny, short nz);

}
