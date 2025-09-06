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

public interface glObjectLabel {

/**
 * Unsafe version of: {@link #glObjectLabel ObjectLabel}
 *
 * @param length the length of the label to be used for the object
 */
    public void nglObjectLabel(int identifier, int name, int length, long label);

/**
 * Labels a named object identified within a namespace.
 *
 * @param identifier the namespace from which the name of the object is allocated. One of:<br><table><tr><td>{@link #GL_BUFFER BUFFER}</td><td>{@link #GL_SHADER SHADER}</td><td>{@link #GL_PROGRAM PROGRAM}</td><td>{@link #GL_QUERY QUERY}</td><td>{@link #GL_PROGRAM_PIPELINE PROGRAM_PIPELINE}</td><td>{@link #GL_SAMPLER SAMPLER}</td><td>{@link GLES20#GL_TEXTURE TEXTURE}</td><td>{@link GLES20#GL_RENDERBUFFER RENDERBUFFER}</td></tr><tr><td>{@link GLES20#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GLES30#GL_TRANSFORM_FEEDBACK TRANSFORM_FEEDBACK}</td></tr></table>
 * @param name       the name of the object to label
 * @param label      a string containing the label to assign to the object
 *
 * @see <a href="https://docs.gl/es3/glObjectLabel">Reference Page</a>
 */
    public void glObjectLabel(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name, @NativeType("GLchar const *") ByteBuffer label);

/**
 * Labels a named object identified within a namespace.
 *
 * @param identifier the namespace from which the name of the object is allocated. One of:<br><table><tr><td>{@link #GL_BUFFER BUFFER}</td><td>{@link #GL_SHADER SHADER}</td><td>{@link #GL_PROGRAM PROGRAM}</td><td>{@link #GL_QUERY QUERY}</td><td>{@link #GL_PROGRAM_PIPELINE PROGRAM_PIPELINE}</td><td>{@link #GL_SAMPLER SAMPLER}</td><td>{@link GLES20#GL_TEXTURE TEXTURE}</td><td>{@link GLES20#GL_RENDERBUFFER RENDERBUFFER}</td></tr><tr><td>{@link GLES20#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GLES30#GL_TRANSFORM_FEEDBACK TRANSFORM_FEEDBACK}</td></tr></table>
 * @param name       the name of the object to label
 * @param label      a string containing the label to assign to the object
 *
 * @see <a href="https://docs.gl/es3/glObjectLabel">Reference Page</a>
 */
    public void glObjectLabel(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name, @NativeType("GLchar const *") CharSequence label);

}
