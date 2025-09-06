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

public interface glCreateTransformFeedbacks {

/**
 * Unsafe version of: {@link #glCreateTransformFeedbacks CreateTransformFeedbacks}
 *
 * @param n the number of transform feedback object names to create
 */
    public void nglCreateTransformFeedbacks(int n, long ids);

/**
 * Returns {@code n} previously unused transform feedback object names in {@code ids}, each representing a new state vector.
 *
 * @param ids the buffer in which to return the names
 *
 * @see <a href="https://docs.gl/gl4/glCreateTransformFeedbacks">Reference Page</a>
 */
    public void glCreateTransformFeedbacks(@NativeType("GLuint *") IntBuffer ids);

/**
 * Returns {@code n} previously unused transform feedback object names in {@code ids}, each representing a new state vector.
 *
 * @see <a href="https://docs.gl/gl4/glCreateTransformFeedbacks">Reference Page</a>
 */
@NativeType("void")
    public int glCreateTransformFeedbacks();

/**
 * Array version of: {@link #glCreateTransformFeedbacks CreateTransformFeedbacks}
 *
 * @see <a href="https://docs.gl/gl4/glCreateTransformFeedbacks">Reference Page</a>
 */
    public void glCreateTransformFeedbacks(@NativeType("GLuint *") int[] ids);

}
