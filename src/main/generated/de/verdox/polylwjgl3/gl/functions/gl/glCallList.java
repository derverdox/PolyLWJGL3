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

public interface glCallList {

/**
 * Executes a display list. Causes the commands saved in the display list to be executed, in order, just as if they were issued without using a display list.
 *
 * @param list the index of the display list to be called
 *
 * @see <a href="https://docs.gl/gl3/glCallList">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glCallList(@NativeType("GLuint") int list);

}
