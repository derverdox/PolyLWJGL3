package de.verdox.polylwjgl3.gl.functions.gl;

import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glCallLists {

/**
 * Unsafe version of: {@link #glCallLists CallLists}
 *
 * @param n    the number of display lists to be called
 * @param type the data type of each element in {@code lists}. One of:<br><table><tr><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_2_BYTES 2_BYTES}</td><td>{@link #GL_3_BYTES 3_BYTES}</td><td>{@link #GL_4_BYTES 4_BYTES}</td></tr></table>
 */
    public void nglCallLists(int n, int type, long lists);

/**
 * Provides an efficient means for executing a number of display lists.
 *
 * @param type  the data type of each element in {@code lists}. One of:<br><table><tr><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_2_BYTES 2_BYTES}</td><td>{@link #GL_3_BYTES 3_BYTES}</td><td>{@link #GL_4_BYTES 4_BYTES}</td></tr></table>
 * @param lists an array of offsets. Each offset is added to the display list base to obtain the display list number.
 *
 * @see <a href="https://docs.gl/gl3/glCallLists">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glCallLists(@NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer lists);

/**
 * Provides an efficient means for executing a number of display lists.
 *
 * @param lists an array of offsets. Each offset is added to the display list base to obtain the display list number.
 *
 * @see <a href="https://docs.gl/gl3/glCallLists">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glCallLists(@NativeType("void const *") ByteBuffer lists);

/**
 * Provides an efficient means for executing a number of display lists.
 *
 * @param lists an array of offsets. Each offset is added to the display list base to obtain the display list number.
 *
 * @see <a href="https://docs.gl/gl3/glCallLists">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glCallLists(@NativeType("void const *") ShortBuffer lists);

/**
 * Provides an efficient means for executing a number of display lists.
 *
 * @param lists an array of offsets. Each offset is added to the display list base to obtain the display list number.
 *
 * @see <a href="https://docs.gl/gl3/glCallLists">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glCallLists(@NativeType("void const *") IntBuffer lists);

}
