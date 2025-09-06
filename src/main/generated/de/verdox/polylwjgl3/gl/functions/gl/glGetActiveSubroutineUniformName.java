package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl33.GL33Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl33.GL33AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL40;
import org.lwjgl.system.*;

public interface glGetActiveSubroutineUniformName {

/**
 * Unsafe version of: {@link #glGetActiveSubroutineUniformName GetActiveSubroutineUniformName}
 *
 * @param bufsize the size of the buffer whose address is given in {@code name}
 */
    public void nglGetActiveSubroutineUniformName(int program, int shadertype, int index, int bufsize, long length, long name);

/**
 * Queries the name of an active shader subroutine uniform.
 *
 * @param program    the name of the program containing the subroutine
 * @param shadertype the shader stage from which to query for the subroutine parameter. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40C#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40C#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
 * @param index      the index of the shader subroutine uniform
 * @param length     the address of a variable into which is written the number of characters copied into {@code name}
 * @param name       the address of a buffer that will receive the name of the specified shader subroutine uniform
 *
 * @see <a href="https://docs.gl/gl4/glGetActiveSubroutineUniformName">Reference Page</a>
 */
    public void glGetActiveSubroutineUniformName(int program, int shadertype, int index, @Nullable IntBuffer length, ByteBuffer name);

/**
 * Queries the name of an active shader subroutine uniform.
 *
 * @param program    the name of the program containing the subroutine
 * @param shadertype the shader stage from which to query for the subroutine parameter. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40C#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40C#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
 * @param index      the index of the shader subroutine uniform
 * @param bufsize    the size of the buffer whose address is given in {@code name}
 *
 * @see <a href="https://docs.gl/gl4/glGetActiveSubroutineUniformName">Reference Page</a>
 */
    public String glGetActiveSubroutineUniformName(int program, int shadertype, int index, int bufsize);

/**
 * Queries the name of an active shader subroutine uniform.
 *
 * @param program    the name of the program containing the subroutine
 * @param shadertype the shader stage from which to query for the subroutine parameter. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40C#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40C#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
 * @param index      the index of the shader subroutine uniform
 *
 * @see <a href="https://docs.gl/gl4/glGetActiveSubroutineUniformName">Reference Page</a>
 */
    public String glGetActiveSubroutineUniformName(int program, int shadertype, int index);

/**
 * Array version of: {@link #glGetActiveSubroutineUniformName GetActiveSubroutineUniformName}
 *
 * @see <a href="https://docs.gl/gl4/glGetActiveSubroutineUniformName">Reference Page</a>
 */
    public void glGetActiveSubroutineUniformName(int program, int shadertype, int index, @Nullable int[] length, ByteBuffer name);

}
