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

public interface glWindowPos2iv {

/**
 * Unsafe version of: {@link #glWindowPos2iv WindowPos2iv}
 */
    public void nglWindowPos2iv(long p);

/**
 * Pointer version of {@link #glWindowPos2i WindowPos2i}.
 *
 * @param p the position value
 *
 * @see <a href="https://docs.gl/gl3/glWindowPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glWindowPos2iv(@NativeType("GLint const *") IntBuffer p);

/**
 * Array version of: {@link #glWindowPos2iv WindowPos2iv}
 *
 * @see <a href="https://docs.gl/gl3/glWindowPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glWindowPos2iv(@NativeType("GLint const *") int[] p);

}
