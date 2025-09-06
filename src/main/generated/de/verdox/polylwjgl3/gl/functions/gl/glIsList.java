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

public interface glIsList {

/**
 * Returns true if the {@code list} is the index of some display list.
 *
 * @param list the list index to query
 *
 * @see <a href="https://docs.gl/gl3/glIsList">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
@NativeType("GLboolean")
    public boolean glIsList(@NativeType("GLuint") int list);

}
