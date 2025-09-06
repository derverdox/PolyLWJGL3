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

public interface glDeleteTextures {

    public void nglDeleteTextures(int n, long textures);

/**
 * <a href="https://docs.gl/es3/glDeleteTextures">Reference Page</a>
 */
    public void glDeleteTextures(IntBuffer textures);

/**
 * <a href="https://docs.gl/es3/glDeleteTextures">Reference Page</a>
 */
    public void glDeleteTextures(int texture);

/**
 * Array version of: {@link #glDeleteTextures DeleteTextures}
 *
 * @see <a href="https://docs.gl/es3/glDeleteTextures">Reference Page</a>
 */
    public void glDeleteTextures(int[] textures);

}
