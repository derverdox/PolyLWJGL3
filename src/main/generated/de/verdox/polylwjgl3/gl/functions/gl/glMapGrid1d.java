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

public interface glMapGrid1d {

/**
 * Double version of {@link #glMapGrid1f MapGrid1f}.
 *
 * @param n  the number of partitions of the interval
 * @param u1 the first interval endpoint
 * @param u2 the second interval endpoint
 *
 * @see <a href="https://docs.gl/gl3/glMapGrid">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glMapGrid1d(int n, double u1, double u2);

}
