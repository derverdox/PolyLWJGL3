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

public interface glSecondaryColor3uiv {

/**
 * Unsafe version of: {@link #glSecondaryColor3uiv SecondaryColor3uiv}
 */
    public void nglSecondaryColor3uiv(long v);

/**
 * Pointer version of {@link #glSecondaryColor3ui SecondaryColor3ui}.
 *
 * @param v the secondary color buffer
 *
 * @see <a href="https://docs.gl/gl3/glSecondaryColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glSecondaryColor3uiv(IntBuffer v);

/**
 * Array version of: {@link #glSecondaryColor3uiv SecondaryColor3uiv}
 *
 * @see <a href="https://docs.gl/gl3/glSecondaryColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glSecondaryColor3uiv(int[] v);

}
