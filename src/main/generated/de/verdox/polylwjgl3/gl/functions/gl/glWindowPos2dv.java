package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl13.GL13Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl13.GL13AccessorImpl;
import java.nio.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL14;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glWindowPos2dv {

/**
 * Unsafe version of: {@link #glWindowPos2dv WindowPos2dv}
 */
    public void nglWindowPos2dv(long p);

/**
 * Pointer version of {@link #glWindowPos2d WindowPos2d}.
 *
 * @param p the position value
 *
 * @see <a href="https://docs.gl/gl3/glWindowPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glWindowPos2dv(DoubleBuffer p);

/**
 * Array version of: {@link #glWindowPos2dv WindowPos2dv}
 *
 * @see <a href="https://docs.gl/gl3/glWindowPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glWindowPos2dv(double[] p);

}
