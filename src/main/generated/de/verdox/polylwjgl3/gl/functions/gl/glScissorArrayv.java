package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl40.GL40Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl40.GL40AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL41;
import org.lwjgl.system.*;

public interface glScissorArrayv {

/**
 * Unsafe version of: {@link #glScissorArrayv ScissorArrayv}
 *
 * @param count the number of scissor boxes to modify
 */
    public void nglScissorArrayv(int first, int count, long v);

/**
 * Defines the scissor box for multiple viewports.
 *
 * @param first the index of the first viewport whose scissor box to modify
 * @param v     an array containing the left, bottom, width and height of each scissor box, in that order
 *
 * @see <a href="https://docs.gl/gl4/glScissorArrayv">Reference Page</a>
 */
    public void glScissorArrayv(int first, IntBuffer v);

/**
 * Array version of: {@link #glScissorArrayv ScissorArrayv}
 *
 * @see <a href="https://docs.gl/gl4/glScissorArrayv">Reference Page</a>
 */
    public void glScissorArrayv(int first, int[] v);

}
