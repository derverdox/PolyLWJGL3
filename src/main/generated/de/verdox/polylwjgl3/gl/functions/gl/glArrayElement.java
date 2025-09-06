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

public interface glArrayElement {

/**
 * Transfers the ith element of every enabled, non-instanced array, and the first element of every enabled, instanced array to the GL.
 *
 * @param i the element to transfer
 *
 * @see <a href="https://docs.gl/gl3/glArrayElement">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glArrayElement(@NativeType("GLint") int i);

}
