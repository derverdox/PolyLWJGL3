package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl44.GL44Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl44.GL44AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL45;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glGetnPixelMapuiv {

/**
 * Unsafe version of: {@link #glGetnPixelMapuiv GetnPixelMapuiv}
 *
 * @param bufSize the maximum number of bytes to write into {@code data}
 */
    public void nglGetnPixelMapuiv(int map, int bufSize, long data);

/**
 * Robust version of {@link GL11#glGetPixelMapuiv GetPixelMapuiv}
 *
 * @param map  the pixel map parameter to query
 * @param data a buffer in which to place the returned data
 *
 * @see <a href="https://docs.gl/gl4/glGetPixelMap">Reference Page</a>
 */
    public void glGetnPixelMapuiv(int map, IntBuffer data);

/**
 * Array version of: {@link #glGetnPixelMapuiv GetnPixelMapuiv}
 *
 * @see <a href="https://docs.gl/gl4/glGetPixelMap">Reference Page</a>
 */
    public void glGetnPixelMapuiv(int map, int[] data);

}
