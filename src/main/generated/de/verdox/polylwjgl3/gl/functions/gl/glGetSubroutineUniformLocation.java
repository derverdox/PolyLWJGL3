package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl33.GL33Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl33.GL33AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL40;
import org.lwjgl.system.*;

public interface glGetSubroutineUniformLocation {

/**
 * Unsafe version of: {@link #glGetSubroutineUniformLocation GetSubroutineUniformLocation}
 */
    public int nglGetSubroutineUniformLocation(int program, int shadertype, long name);

/**
 * Retrieves the location of a subroutine uniform of a given shader stage within a program.
 *
 * @param program    the name of the program containing shader stage
 * @param shadertype the shader stage from which to query for subroutine uniform index. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40C#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40C#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
 * @param name       the name of the subroutine uniform whose index to query.
 *
 * @see <a href="https://docs.gl/gl4/glGetSubroutineUniformLocation">Reference Page</a>
 */
@NativeType("GLint")
    public int glGetSubroutineUniformLocation(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLchar const *") ByteBuffer name);

/**
 * Retrieves the location of a subroutine uniform of a given shader stage within a program.
 *
 * @param program    the name of the program containing shader stage
 * @param shadertype the shader stage from which to query for subroutine uniform index. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40C#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40C#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
 * @param name       the name of the subroutine uniform whose index to query.
 *
 * @see <a href="https://docs.gl/gl4/glGetSubroutineUniformLocation">Reference Page</a>
 */
@NativeType("GLint")
    public int glGetSubroutineUniformLocation(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLchar const *") CharSequence name);

}
