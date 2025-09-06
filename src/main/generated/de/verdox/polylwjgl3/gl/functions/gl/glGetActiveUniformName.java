package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl30.GL30Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl30.GL30AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL31;
import org.lwjgl.system.*;

public interface glGetActiveUniformName {

/**
 * Unsafe version of: {@link #glGetActiveUniformName GetActiveUniformName}
 *
 * @param bufSize the size of the buffer, in units of {@code GLchar}, of the buffer whose address is specified in {@code uniformName}
 */
    public void nglGetActiveUniformName(int program, int uniformIndex, int bufSize, long length, long uniformName);

/**
 * Queries the name of an active uniform.
 *
 * @param program      the program containing the active uniform index {@code uniformIndex}
 * @param uniformIndex the index of the active uniform whose name to query
 * @param length       the address of a variable that will receive the number of characters that were or would have been written to the buffer addressed by {@code uniformName}
 * @param uniformName  the address of a buffer into which the GL will place the name of the active uniform at {@code uniformIndex} within {@code program}
 *
 * @see <a href="https://docs.gl/gl4/glGetActiveUniformName">Reference Page</a>
 */
    public void glGetActiveUniformName(int program, int uniformIndex, @Nullable IntBuffer length, ByteBuffer uniformName);

/**
 * Queries the name of an active uniform.
 *
 * @param program      the program containing the active uniform index {@code uniformIndex}
 * @param uniformIndex the index of the active uniform whose name to query
 * @param bufSize      the size of the buffer, in units of {@code GLchar}, of the buffer whose address is specified in {@code uniformName}
 *
 * @see <a href="https://docs.gl/gl4/glGetActiveUniformName">Reference Page</a>
 */
    public String glGetActiveUniformName(int program, int uniformIndex, int bufSize);

/**
 * Queries the name of an active uniform.
 *
 * @param program      the program containing the active uniform index {@code uniformIndex}
 * @param uniformIndex the index of the active uniform whose name to query
 *
 * @see <a href="https://docs.gl/gl4/glGetActiveUniformName">Reference Page</a>
 */
    public String glGetActiveUniformName(int program, int uniformIndex);

/**
 * Array version of: {@link #glGetActiveUniformName GetActiveUniformName}
 *
 * @see <a href="https://docs.gl/gl4/glGetActiveUniformName">Reference Page</a>
 */
    public void glGetActiveUniformName(int program, int uniformIndex, @Nullable int[] length, ByteBuffer uniformName);

}
