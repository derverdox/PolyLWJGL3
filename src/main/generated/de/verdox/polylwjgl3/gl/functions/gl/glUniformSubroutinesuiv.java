package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl33.GL33Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl33.GL33AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL40;
import org.lwjgl.system.*;

public interface glUniformSubroutinesuiv {

/**
 * Unsafe version of: {@link #glUniformSubroutinesuiv UniformSubroutinesuiv}
 *
 * @param count the number of uniform indices stored in {@code indices}
 */
    public void nglUniformSubroutinesuiv(int shadertype, int count, long indices);

/**
 * Loads active subroutine uniforms.
 *
 * @param shadertype the shader stage to update. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40C#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40C#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
 * @param indices    an array holding the indices to load into the shader subroutine variables
 *
 * @see <a href="https://docs.gl/gl4/glUniformSubroutines">Reference Page</a>
 */
    public void glUniformSubroutinesuiv(@NativeType("GLenum") int shadertype, @NativeType("GLuint const *") IntBuffer indices);

/**
 * Array version of: {@link #glUniformSubroutinesuiv UniformSubroutinesuiv}
 *
 * @see <a href="https://docs.gl/gl4/glUniformSubroutines">Reference Page</a>
 */
    public void glUniformSubroutinesuiv(@NativeType("GLenum") int shadertype, @NativeType("GLuint const *") int[] indices);

}
