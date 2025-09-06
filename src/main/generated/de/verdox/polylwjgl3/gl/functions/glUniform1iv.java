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

public interface glUniform1iv {

    public void nglUniform1iv(int location, int count, long value);

/**
 * <a href="https://docs.gl/es3/glUniform">Reference Page</a>
 */
    public void glUniform1iv(int location, IntBuffer value);

/**
 * Array version of: {@link #glUniform1iv Uniform1iv}
 *
 * @see <a href="https://docs.gl/es3/glUniform">Reference Page</a>
 */
    public void glUniform1iv(int location, int[] value);

}
