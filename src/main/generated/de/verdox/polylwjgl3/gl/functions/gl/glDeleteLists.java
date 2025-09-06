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

public interface glDeleteLists {

/**
 * Deletes a contiguous group of display lists. All information about the display lists is lost, and the indices become unused. Indices to which no display
 * list corresponds are ignored. If {@code range} is zero, nothing happens.
 *
 * @param list  the index of the first display list to be deleted
 * @param range the number of display lists to be deleted
 *
 * @see <a href="https://docs.gl/gl3/glDeleteLists">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glDeleteLists(@NativeType("GLuint") int list, @NativeType("GLsizei") int range);

}
