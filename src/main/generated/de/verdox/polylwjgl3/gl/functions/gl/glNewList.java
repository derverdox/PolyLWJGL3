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

public interface glNewList {

/**
 * Begins the definition of a display list.
 *
 * @param n    a positive integer to which the display list that follows is assigned
 * @param mode a symbolic constant that controls the behavior of the GL during display list creation. One of:<br><table><tr><td>{@link #GL_COMPILE COMPILE}</td><td>{@link #GL_COMPILE_AND_EXECUTE COMPILE_AND_EXECUTE}</td></tr></table>
 *
 * @see <a href="https://docs.gl/gl3/glNewList">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glNewList(int n, int mode);

}
