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

public interface glMapGrid2d {

/**
 * Double version of {@link #glMapGrid2f MapGrid2f}.
 *
 * @param un the number of partitions of the interval in the u-dimension
 * @param u1 the first u-dimension interval endpoint
 * @param u2 the second u-dimension interval endpoint
 * @param vn the number of partitions of the interval in the v-dimension
 * @param v1 the first v-dimension interval endpoint
 * @param v2 the second v-dimension interval endpoint
 *
 * @see <a href="https://docs.gl/gl3/glMapGrid">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glMapGrid2d(@NativeType("GLint") int un, @NativeType("GLdouble") double u1, @NativeType("GLdouble") double u2, @NativeType("GLint") int vn, @NativeType("GLdouble") double v1, @NativeType("GLdouble") double v2);

}
