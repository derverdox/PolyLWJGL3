package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl40.GL40Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl40.GL40AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL41;
import org.lwjgl.system.*;

public interface glScissorIndexedv {

/**
 * Unsafe version of: {@link #glScissorIndexedv ScissorIndexedv}
 */
    public void nglScissorIndexedv(int index, long v);

/**
 * Pointer version of {@link #glScissorIndexed ScissorIndexed}.
 *
 * @param index the index of the viewport whose scissor box to modify
 * @param v     an array containing the left, bottom, width and height of each scissor box, in that order
 *
 * @see <a href="https://docs.gl/gl4/glScissorIndexed">Reference Page</a>
 */
    public void glScissorIndexedv(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v);

/**
 * Array version of: {@link #glScissorIndexedv ScissorIndexedv}
 *
 * @see <a href="https://docs.gl/gl4/glScissorIndexed">Reference Page</a>
 */
    public void glScissorIndexedv(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v);

}
