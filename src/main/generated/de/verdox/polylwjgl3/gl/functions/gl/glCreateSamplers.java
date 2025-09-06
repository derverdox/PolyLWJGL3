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

public interface glCreateSamplers {

/**
 * Unsafe version of: {@link #glCreateSamplers CreateSamplers}
 *
 * @param n the number of sampler object names to create
 */
    public void nglCreateSamplers(int n, long samplers);

/**
 * Returns {@code n} previously unused sampler names in {@code samplers}, each representing a new sampler object.
 *
 * @param samplers the buffer in which to return the created sampler object names
 *
 * @see <a href="https://docs.gl/gl4/glCreateSamplers">Reference Page</a>
 */
    public void glCreateSamplers(IntBuffer samplers);

/**
 * Returns {@code n} previously unused sampler names in {@code samplers}, each representing a new sampler object.
 *
 * @see <a href="https://docs.gl/gl4/glCreateSamplers">Reference Page</a>
 */
    public int glCreateSamplers();

/**
 * Array version of: {@link #glCreateSamplers CreateSamplers}
 *
 * @see <a href="https://docs.gl/gl4/glCreateSamplers">Reference Page</a>
 */
    public void glCreateSamplers(int[] samplers);

}
