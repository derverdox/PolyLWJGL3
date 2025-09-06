package de.verdox.polylwjgl3.gl.functions;

import de.verdox.polylwjgl3.gl.accessor.gles20.GLES20Accessor;
import de.verdox.polylwjgl3.gl.accessor.gles20.GLES20AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengles.GLES30;
import org.lwjgl.system.*;
import org.lwjgl.system.APIUtil.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glGetSamplerParameterfv {

    public void nglGetSamplerParameterfv(int sampler, int pname, long params);

/**
 * <a href="https://docs.gl/es3/glGetSamplerParameter">Reference Page</a>
 */
    public void glGetSamplerParameterfv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params);

/**
 * Array version of: {@link #glGetSamplerParameterfv GetSamplerParameterfv}
 *
 * @see <a href="https://docs.gl/es3/glGetSamplerParameter">Reference Page</a>
 */
    public void glGetSamplerParameterfv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params);

}
