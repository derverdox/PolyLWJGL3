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

public interface glUniformMatrix4x2fv {

    public void nglUniformMatrix4x2fv(int location, int count, boolean transpose, long value);

/**
 * <a href="https://docs.gl/es3/glUniform">Reference Page</a>
 */
    public void glUniformMatrix4x2fv(int location, boolean transpose, FloatBuffer value);

/**
 * Array version of: {@link #glUniformMatrix4x2fv UniformMatrix4x2fv}
 *
 * @see <a href="https://docs.gl/es3/glUniform">Reference Page</a>
 */
    public void glUniformMatrix4x2fv(int location, boolean transpose, float[] value);

}
