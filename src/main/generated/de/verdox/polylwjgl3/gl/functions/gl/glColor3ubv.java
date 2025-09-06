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

public interface glColor3ubv {

/**
 * Unsafe version of: {@link #glColor3ubv Color3ubv}
 */
    public void nglColor3ubv(long v);

/**
 * Pointer version of {@link #glColor3ub Color3ub}.
 *
 * @param v the color buffer
 *
 * @see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glColor3ubv(@NativeType("GLubyte const *") ByteBuffer v);

}
