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

public interface glGenLists {

/**
 * Returns an integer n such that the indices {@code n,..., n + s - 1} are previously unused (i.e. there are {@code s} previously unused display list
 * indices starting at n). {@code GenLists} also has the effect of creating an empty display list for each of the indices {@code n,..., n + s - 1}, so
 * that these indices all become used. {@code GenLists} returns zero if there is no group of {@code s} contiguous previously unused display list indices,
 * or if {@code s = 0}.
 *
 * @param s the number of display lists to create
 *
 * @see <a href="https://docs.gl/gl3/glGenLists">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
@NativeType("GLuint")
    public int glGenLists(@NativeType("GLsizei") int s);

}
