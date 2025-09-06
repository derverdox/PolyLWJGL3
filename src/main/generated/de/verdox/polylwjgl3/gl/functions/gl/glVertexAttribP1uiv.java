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

public interface glVertexAttribP1uiv {

/**
 * Unsafe version of: {@link #glVertexAttribP1uiv VertexAttribP1uiv}
 */
    public void nglVertexAttribP1uiv(int index, int type, boolean normalized, long value);

/**
 * Pointer version of {@link #glVertexAttribP1ui VertexAttribP1ui}.
 *
 * @param index      the index of the generic vertex attribute to be modified
 * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link GL33C#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
 * @param normalized whether values should be normalized or cast directly to floating-point
 * @param value      the packed value
 *
 * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
 */
    public void glVertexAttribP1uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") IntBuffer value);

/**
 * Array version of: {@link #glVertexAttribP1uiv VertexAttribP1uiv}
 *
 * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
 */
    public void glVertexAttribP1uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") int[] value);

}
