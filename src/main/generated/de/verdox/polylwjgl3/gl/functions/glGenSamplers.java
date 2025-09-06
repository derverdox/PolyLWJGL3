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

public interface glGenSamplers {

    public void nglGenSamplers(int count, long samplers);

/**
 * <a href="https://docs.gl/es3/glGenSamplers">Reference Page</a>
 */
    public void glGenSamplers(@NativeType("GLuint *") IntBuffer samplers);

/**
 * <a href="https://docs.gl/es3/glGenSamplers">Reference Page</a>
 */
@NativeType("void")
    public int glGenSamplers();

/**
 * Array version of: {@link #glGenSamplers GenSamplers}
 *
 * @see <a href="https://docs.gl/es3/glGenSamplers">Reference Page</a>
 */
    public void glGenSamplers(@NativeType("GLuint *") int[] samplers);

}
