package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl30.GL30Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl30.GL30AccessorImpl;
import de.verdox.polylwjgl3.gl.functions.glGetUniformIndices;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL31;
import org.lwjgl.system.*;

public interface glGetUniformIndices_CORE extends glGetUniformIndices {

/**
 * Retrieves the indices of a number of uniforms within a program object
 *
 * @param program        the name of a program containing uniforms whose indices to query
 * @param uniformNames   an array of pointers to buffers containing the names of the queried uniforms
 * @param uniformIndices an array that will receive the indices of the uniforms
 *
 * @see <a href="https://docs.gl/gl4/glGetUniformIndices">Reference Page</a>
 */
    public void glGetUniformIndices(int program, CharSequence[] uniformNames, IntBuffer uniformIndices);

/**
 * Retrieves the indices of a number of uniforms within a program object
 *
 * @param program the name of a program containing uniforms whose indices to query
 *
 * @see <a href="https://docs.gl/gl4/glGetUniformIndices">Reference Page</a>
 */
    public int glGetUniformIndices(int program, CharSequence uniformName);

}
