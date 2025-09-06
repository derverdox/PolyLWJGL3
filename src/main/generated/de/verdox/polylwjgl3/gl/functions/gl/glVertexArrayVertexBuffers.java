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

public interface glVertexArrayVertexBuffers {

/**
 * Unsafe version of: {@link #glVertexArrayVertexBuffers VertexArrayVertexBuffers}
 *
 * @param count the number of vertex buffer binding points
 */
    public void nglVertexArrayVertexBuffers(int vaobj, int first, int count, long buffers, long offsets, long strides);

/**
 * DSA version of {@link GL44C#glBindVertexBuffers BindVertexBuffers}.
 *
 * @param vaobj   the vertex array object name
 * @param first   the first vertex buffer binding point
 * @param buffers an array of zeros or names of existing buffers objects
 * @param offsets an array of offses
 * @param strides an array of stride values
 *
 * @see <a href="https://docs.gl/gl4/glVertexArrayVertexBuffers">Reference Page</a>
 */
    public void glVertexArrayVertexBuffers(int vaobj, int first, @Nullable IntBuffer buffers, @Nullable PointerBuffer offsets, @Nullable IntBuffer strides);

/**
 * Array version of: {@link #glVertexArrayVertexBuffers VertexArrayVertexBuffers}
 *
 * @see <a href="https://docs.gl/gl4/glVertexArrayVertexBuffers">Reference Page</a>
 */
    public void glVertexArrayVertexBuffers(int vaobj, int first, @Nullable int[] buffers, @Nullable PointerBuffer offsets, @Nullable int[] strides);

}
