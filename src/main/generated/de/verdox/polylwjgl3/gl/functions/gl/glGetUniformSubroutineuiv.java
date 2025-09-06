package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl33.GL33Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl33.GL33AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL40;
import org.lwjgl.system.*;

public interface glGetUniformSubroutineuiv {

/**
 * Unsafe version of: {@link #glGetUniformSubroutineuiv GetUniformSubroutineuiv}
 */
    public void nglGetUniformSubroutineuiv(int shadertype, int location, long params);

/**
 * Retrieves the value of a subroutine uniform of a given shader stage of the current program.
 *
 * @param shadertype the shader stage from which to query for subroutine uniform index. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40C#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40C#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
 * @param location   the location of the subroutine uniform
 * @param params     a variable to receive the value or values of the subroutine uniform
 *
 * @see <a href="https://docs.gl/gl4/glGetUniformSubroutine">Reference Page</a>
 */
    public void glGetUniformSubroutineuiv(@NativeType("GLenum") int shadertype, @NativeType("GLint") int location, @NativeType("GLuint *") IntBuffer params);

/**
 * Array version of: {@link #glGetUniformSubroutineuiv GetUniformSubroutineuiv}
 *
 * @see <a href="https://docs.gl/gl4/glGetUniformSubroutine">Reference Page</a>
 */
    public void glGetUniformSubroutineuiv(@NativeType("GLenum") int shadertype, @NativeType("GLint") int location, @NativeType("GLuint *") int[] params);

}
