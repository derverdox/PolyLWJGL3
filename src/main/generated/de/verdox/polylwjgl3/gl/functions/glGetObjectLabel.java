package de.verdox.polylwjgl3.gl.functions;

import de.verdox.polylwjgl3.gl.accessor.gles31.GLES31Accessor;
import de.verdox.polylwjgl3.gl.accessor.gles31.GLES31AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengles.GLES32;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glGetObjectLabel {

/**
 * Unsafe version of: {@link #glGetObjectLabel GetObjectLabel}
 *
 * @param bufSize the length of the buffer whose address is in {@code label}
 */
    public void nglGetObjectLabel(int identifier, int name, int bufSize, long length, long label);

/**
 * Retrieves the label of a named object identified within a namespace.
 *
 * @param identifier the namespace from which the name of the object is allocated. One of:<br><table><tr><td>{@link #GL_BUFFER BUFFER}</td><td>{@link #GL_SHADER SHADER}</td><td>{@link #GL_PROGRAM PROGRAM}</td><td>{@link #GL_QUERY QUERY}</td><td>{@link #GL_PROGRAM_PIPELINE PROGRAM_PIPELINE}</td><td>{@link #GL_SAMPLER SAMPLER}</td><td>{@link GLES20#GL_TEXTURE TEXTURE}</td><td>{@link GLES20#GL_RENDERBUFFER RENDERBUFFER}</td></tr><tr><td>{@link GLES20#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GLES30#GL_TRANSFORM_FEEDBACK TRANSFORM_FEEDBACK}</td></tr></table>
 * @param name       the name of the object whose label to retrieve
 * @param length     the address of a variable to receive the length of the object label
 * @param label      a string that will receive the object label
 *
 * @see <a href="https://docs.gl/es3/glGetObjectLabel">Reference Page</a>
 */
    public void glGetObjectLabel(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLchar *") ByteBuffer label);

/**
 * Retrieves the label of a named object identified within a namespace.
 *
 * @param identifier the namespace from which the name of the object is allocated. One of:<br><table><tr><td>{@link #GL_BUFFER BUFFER}</td><td>{@link #GL_SHADER SHADER}</td><td>{@link #GL_PROGRAM PROGRAM}</td><td>{@link #GL_QUERY QUERY}</td><td>{@link #GL_PROGRAM_PIPELINE PROGRAM_PIPELINE}</td><td>{@link #GL_SAMPLER SAMPLER}</td><td>{@link GLES20#GL_TEXTURE TEXTURE}</td><td>{@link GLES20#GL_RENDERBUFFER RENDERBUFFER}</td></tr><tr><td>{@link GLES20#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GLES30#GL_TRANSFORM_FEEDBACK TRANSFORM_FEEDBACK}</td></tr></table>
 * @param name       the name of the object whose label to retrieve
 * @param bufSize    the length of the buffer whose address is in {@code label}
 *
 * @see <a href="https://docs.gl/es3/glGetObjectLabel">Reference Page</a>
 */
@NativeType("void")
    public String glGetObjectLabel(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name, @NativeType("GLsizei") int bufSize);

/**
 * Retrieves the label of a named object identified within a namespace.
 *
 * @param identifier the namespace from which the name of the object is allocated. One of:<br><table><tr><td>{@link #GL_BUFFER BUFFER}</td><td>{@link #GL_SHADER SHADER}</td><td>{@link #GL_PROGRAM PROGRAM}</td><td>{@link #GL_QUERY QUERY}</td><td>{@link #GL_PROGRAM_PIPELINE PROGRAM_PIPELINE}</td><td>{@link #GL_SAMPLER SAMPLER}</td><td>{@link GLES20#GL_TEXTURE TEXTURE}</td><td>{@link GLES20#GL_RENDERBUFFER RENDERBUFFER}</td></tr><tr><td>{@link GLES20#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GLES30#GL_TRANSFORM_FEEDBACK TRANSFORM_FEEDBACK}</td></tr></table>
 * @param name       the name of the object whose label to retrieve
 *
 * @see <a href="https://docs.gl/es3/glGetObjectLabel">Reference Page</a>
 */
@NativeType("void")
    public String glGetObjectLabel(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name);

/**
 * Array version of: {@link #glGetObjectLabel GetObjectLabel}
 *
 * @see <a href="https://docs.gl/es3/glGetObjectLabel">Reference Page</a>
 */
    public void glGetObjectLabel(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLchar *") ByteBuffer label);

}
