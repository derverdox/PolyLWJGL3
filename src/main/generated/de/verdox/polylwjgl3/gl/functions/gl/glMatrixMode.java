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

public interface glMatrixMode {

/**
 * Set the current matrix mode.
 *
 * @param mode the matrix mode. One of:<br><table><tr><td>{@link #GL_MODELVIEW MODELVIEW}</td><td>{@link #GL_PROJECTION PROJECTION}</td><td>{@link #GL_TEXTURE TEXTURE}</td><td>{@link #GL_COLOR COLOR}</td></tr></table>
 *
 * @see <a href="https://docs.gl/gl3/glMatrixMode">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glMatrixMode(@NativeType("GLenum") int mode);

}
