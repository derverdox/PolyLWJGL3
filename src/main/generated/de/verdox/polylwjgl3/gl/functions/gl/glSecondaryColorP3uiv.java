package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl32.GL32Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl32.GL32AccessorImpl;
import java.nio.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL33;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glSecondaryColorP3uiv {

/**
 * Unsafe version of: {@link #glSecondaryColorP3uiv SecondaryColorP3uiv}
 */
    public void nglSecondaryColorP3uiv(int type, long color);

/**
 * Pointer version of {@link #glSecondaryColorP3ui SecondaryColorP3ui}.
 *
 * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
 * @param color the packed value
 *
 * @see <a href="https://docs.gl/gl3/glSecondaryColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glSecondaryColorP3uiv(int type, IntBuffer color);

/**
 * Array version of: {@link #glSecondaryColorP3uiv SecondaryColorP3uiv}
 *
 * @see <a href="https://docs.gl/gl3/glSecondaryColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glSecondaryColorP3uiv(int type, int[] color);

}
