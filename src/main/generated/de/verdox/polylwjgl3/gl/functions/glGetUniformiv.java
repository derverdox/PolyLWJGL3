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

public interface glGetUniformiv {

    public void nglGetUniformiv(int program, int location, long params);

/**
 * <a href="https://docs.gl/es3/glGetUniform">Reference Page</a>
 */
    public void glGetUniformiv(int program, int location, IntBuffer params);

/**
 * Array version of: {@link #glGetUniformiv GetUniformiv}
 *
 * @see <a href="https://docs.gl/es3/glGetUniform">Reference Page</a>
 */
    public void glGetUniformiv(int program, int location, int[] params);

}
