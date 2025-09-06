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

public interface glEvalPoint2 {

/**
 * Carries out an evalutation of a single point on the two-dimensional map grid.
 *
 * @param i the u-dimension grid index
 * @param j the v-dimension grid index
 *
 * @see <a href="https://docs.gl/gl3/glEvalPoint2">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glEvalPoint2(@NativeType("GLint") int i, @NativeType("GLint") int j);

}
