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

public interface glMultiDrawElements {

/**
 * Unsafe version of: {@link #glMultiDrawElements MultiDrawElements}
 *
 * @param drawcount the size of the {@code count} array
 */
    public void nglMultiDrawElements(int mode, long count, int type, long indices, int drawcount);

/**
 * Renders multiple sets of primitives by specifying indices of array data elements.
 *
 * <p><b>LWJGL note</b>: Use {@link org.lwjgl.system.MemoryUtil#memAddress} to retrieve pointers to the index buffers.</p>
 *
 * @param mode    the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
 * @param count   an array of the elements counts
 * @param type    the type of the values in indices. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
 * @param indices a pointer to the location where the indices are stored
 *
 * @see <a href="https://docs.gl/gl4/glMultiDrawElements">Reference Page</a>
 */
    public void glMultiDrawElements(int mode, IntBuffer count, int type, PointerBuffer indices);

/**
 * Array version of: {@link #glMultiDrawElements MultiDrawElements}
 *
 * @see <a href="https://docs.gl/gl4/glMultiDrawElements">Reference Page</a>
 */
    public void glMultiDrawElements(int mode, int[] count, int type, PointerBuffer indices);

}
