package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl33.GL33Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl33.GL33AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL40;
import org.lwjgl.system.*;

public interface glGetSubroutineIndex {

/**
 * Unsafe version of: {@link #glGetSubroutineIndex GetSubroutineIndex}
 */
    public int nglGetSubroutineIndex(int program, int shadertype, long name);

/**
 * Retrieves the index of a subroutine function of a given shader stage within a program.
 *
 * @param program    the name of the program containing shader stage
 * @param shadertype the shader stage from which to query for subroutine function index. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40C#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40C#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
 * @param name       the name of the subroutine function whose index to query
 *
 * @see <a href="https://docs.gl/gl4/glGetSubroutineIndex">Reference Page</a>
 */
    public int glGetSubroutineIndex(int program, int shadertype, ByteBuffer name);

/**
 * Retrieves the index of a subroutine function of a given shader stage within a program.
 *
 * @param program    the name of the program containing shader stage
 * @param shadertype the shader stage from which to query for subroutine function index. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40C#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40C#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
 * @param name       the name of the subroutine function whose index to query
 *
 * @see <a href="https://docs.gl/gl4/glGetSubroutineIndex">Reference Page</a>
 */
    public int glGetSubroutineIndex(int program, int shadertype, CharSequence name);

}
