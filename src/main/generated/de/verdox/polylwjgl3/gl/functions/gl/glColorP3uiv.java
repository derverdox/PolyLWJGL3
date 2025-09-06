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

public interface glColorP3uiv {

/**
 * Unsafe version of: {@link #glColorP3uiv ColorP3uiv}
 */
    public void nglColorP3uiv(int type, long color);

/**
 * Pointer version of {@link #glColorP3ui ColorP3ui}.
 *
 * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
 * @param color the packed value
 *
 * @see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glColorP3uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer color);

/**
 * Array version of: {@link #glColorP3uiv ColorP3uiv}
 *
 * @see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glColorP3uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") int[] color);

}
