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

public interface glUniformMatrix3fv {

    public void nglUniformMatrix3fv(int location, int count, boolean transpose, long value);

/**
 * <a href="https://docs.gl/es3/glUniform">Reference Page</a>
 */
    public void glUniformMatrix3fv(int location, boolean transpose, FloatBuffer value);

/**
 * Array version of: {@link #glUniformMatrix3fv UniformMatrix3fv}
 *
 * @see <a href="https://docs.gl/es3/glUniform">Reference Page</a>
 */
    public void glUniformMatrix3fv(int location, boolean transpose, float[] value);

}
