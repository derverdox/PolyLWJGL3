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

public interface glGetSamplerParameterIuiv {

    public void nglGetSamplerParameterIuiv(int sampler, int pname, long params);

/**
 * <a href="https://docs.gl/es3/glGetSamplerParameter">Reference Page</a>
 */
    public void glGetSamplerParameterIuiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params);

/**
 * Array version of: {@link #glGetSamplerParameterIuiv GetSamplerParameterIuiv}
 *
 * @see <a href="https://docs.gl/es3/glGetSamplerParameter">Reference Page</a>
 */
    public void glGetSamplerParameterIuiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params);

}
