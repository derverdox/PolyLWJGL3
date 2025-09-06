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

public interface glEndList {

/**
 * Ends the definition of GL commands to be placed in a display list. It is only when {@code EndList} occurs that the specified display list is actually
 * associated with the index indicated with {@link #glNewList NewList}.
 *
 * @see <a href="https://docs.gl/gl3/glEndList">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glEndList();

}
