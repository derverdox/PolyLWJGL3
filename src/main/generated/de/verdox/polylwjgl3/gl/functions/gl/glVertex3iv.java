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

public interface glVertex3iv {

/**
 * Unsafe version of: {@link #glVertex3iv Vertex3iv}
 */
    public void nglVertex3iv(long coords);

/**
 * Pointer version of {@link #glVertex3i Vertex3i}.
 *
 * @param coords the vertex buffer
 *
 * @see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glVertex3iv(IntBuffer coords);

/**
 * Array version of: {@link #glVertex3iv Vertex3iv}
 *
 * @see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glVertex3iv(int[] coords);

}
