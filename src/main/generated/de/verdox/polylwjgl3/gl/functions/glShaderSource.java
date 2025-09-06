package de.verdox.polylwjgl3.gl.functions;

import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengles.GLES20;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glShaderSource {

    public void nglShaderSource(int shader, int count, long string, long length);

/**
 * <a href="https://docs.gl/es3/glShaderSource">Reference Page</a>
 */
    public void glShaderSource(@NativeType("GLuint") int shader, @NativeType("GLchar const * const *") PointerBuffer string, @Nullable @NativeType("GLint const *") IntBuffer length);

/**
 * <a href="https://docs.gl/es3/glShaderSource">Reference Page</a>
 */
    public void glShaderSource(@NativeType("GLuint") int shader, @NativeType("GLchar const * const *") CharSequence... string);

/**
 * <a href="https://docs.gl/es3/glShaderSource">Reference Page</a>
 */
    public void glShaderSource(@NativeType("GLuint") int shader, @NativeType("GLchar const * const *") CharSequence string);

/**
 * Array version of: {@link #glShaderSource ShaderSource}
 *
 * @see <a href="https://docs.gl/es3/glShaderSource">Reference Page</a>
 */
    public void glShaderSource(@NativeType("GLuint") int shader, @NativeType("GLchar const * const *") PointerBuffer string, @Nullable @NativeType("GLint const *") int[] length);

}
