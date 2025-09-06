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

public interface glPopMatrix {

/**
 * Pops the top entry off the current matrix stack, replacing the current matrix with the matrix that was the second entry in the stack.
 *
 * @see <a href="https://docs.gl/gl3/glPopMatrix">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glPopMatrix();

}
