package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl44.GL44Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl44.GL44AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL45;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glCreateVertexArrays {

/**
 * Unsafe version of: {@link #glCreateVertexArrays CreateVertexArrays}
 *
 * @param n the number of vertex array object names to create
 */
    public void nglCreateVertexArrays(int n, long arrays);

/**
 * Returns {@code n} previously unused vertex array object names in {@code arrays}.
 *
 * @param arrays the buffer in which to return the created vertex array object names
 *
 * @see <a href="https://docs.gl/gl4/glCreateVertexArrays">Reference Page</a>
 */
    public void glCreateVertexArrays(IntBuffer arrays);

/**
 * Returns {@code n} previously unused vertex array object names in {@code arrays}.
 *
 * @see <a href="https://docs.gl/gl4/glCreateVertexArrays">Reference Page</a>
 */
    public int glCreateVertexArrays();

/**
 * Array version of: {@link #glCreateVertexArrays CreateVertexArrays}
 *
 * @see <a href="https://docs.gl/gl4/glCreateVertexArrays">Reference Page</a>
 */
    public void glCreateVertexArrays(int[] arrays);

}
