package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl42.GL42Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl42.GL42AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL43;
import org.lwjgl.system.*;

public interface glGetProgramResourceLocationIndex {

/**
 * Unsafe version of: {@link #glGetProgramResourceLocationIndex GetProgramResourceLocationIndex}
 */
    public int nglGetProgramResourceLocationIndex(int program, int programInterface, long name);

/**
 * Queries the fragment color index of a named variable within a program.
 *
 * @param program          the name of a program object whose resources to query
 * @param programInterface a token identifying the interface within {@code program} containing the resource named {@code name}. Must be:<br><table><tr><td>{@link GL43C#GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}</td></tr></table>
 * @param name             the name of the resource to query the location of
 *
 * @see <a href="https://docs.gl/gl4/glGetProgramResourceLocationIndex">Reference Page</a>
 */
@NativeType("GLint")
    public int glGetProgramResourceLocationIndex(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") ByteBuffer name);

/**
 * Queries the fragment color index of a named variable within a program.
 *
 * @param program          the name of a program object whose resources to query
 * @param programInterface a token identifying the interface within {@code program} containing the resource named {@code name}. Must be:<br><table><tr><td>{@link GL43C#GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}</td></tr></table>
 * @param name             the name of the resource to query the location of
 *
 * @see <a href="https://docs.gl/gl4/glGetProgramResourceLocationIndex">Reference Page</a>
 */
@NativeType("GLint")
    public int glGetProgramResourceLocationIndex(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") CharSequence name);

}
