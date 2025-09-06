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

public interface glVertex4iv {

/**
 * Unsafe version of: {@link #glVertex4iv Vertex4iv}
 */
    public void nglVertex4iv(long coords);

/**
 * Pointer version of {@link #glVertex4i Vertex4i}.
 *
 * @param coords the vertex buffer
 *
 * @see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glVertex4iv(@NativeType("GLint const *") IntBuffer coords);

/**
 * Array version of: {@link #glVertex4iv Vertex4iv}
 *
 * @see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glVertex4iv(@NativeType("GLint const *") int[] coords);

}
