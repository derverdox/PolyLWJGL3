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

public interface glVertex2fv {

/**
 * Unsafe version of: {@link #glVertex2fv Vertex2fv}
 */
    public void nglVertex2fv(long coords);

/**
 * Pointer version of {@link #glVertex2f Vertex2f}.
 *
 * @param coords the vertex buffer
 *
 * @see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glVertex2fv(FloatBuffer coords);

/**
 * Array version of: {@link #glVertex2fv Vertex2fv}
 *
 * @see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glVertex2fv(float[] coords);

}
