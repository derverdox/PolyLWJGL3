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

public interface glGenTextures {

    public void nglGenTextures(int n, long textures);

/**
 * <a href="https://docs.gl/es3/glGenTextures">Reference Page</a>
 */
    public void glGenTextures(IntBuffer textures);

/**
 * <a href="https://docs.gl/es3/glGenTextures">Reference Page</a>
 */
    public int glGenTextures();

/**
 * Array version of: {@link #glGenTextures GenTextures}
 *
 * @see <a href="https://docs.gl/es3/glGenTextures">Reference Page</a>
 */
    public void glGenTextures(int[] textures);

}
