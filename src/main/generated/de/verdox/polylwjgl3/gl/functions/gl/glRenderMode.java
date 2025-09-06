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

public interface glRenderMode {

/**
 * Sets the current render mode. The default is {@link #GL_RENDER RENDER}.
 *
 * @param mode the render mode. One of:<br><table><tr><td>{@link #GL_RENDER RENDER}</td><td>{@link #GL_SELECT SELECT}</td><td>{@link #GL_FEEDBACK FEEDBACK}</td></tr></table>
 *
 * @see <a href="https://docs.gl/gl3/glRenderMode">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
@NativeType("GLint")
    public int glRenderMode(@NativeType("GLenum") int mode);

}
