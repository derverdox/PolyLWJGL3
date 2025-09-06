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

public interface glUniform3fv {

    public void nglUniform3fv(int location, int count, long value);

/**
 * <a href="https://docs.gl/es3/glUniform">Reference Page</a>
 */
    public void glUniform3fv(int location, FloatBuffer value);

/**
 * Array version of: {@link #glUniform3fv Uniform3fv}
 *
 * @see <a href="https://docs.gl/es3/glUniform">Reference Page</a>
 */
    public void glUniform3fv(int location, float[] value);

}
