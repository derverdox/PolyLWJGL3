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

public interface glGetFloatv {

    public void nglGetFloatv(int pname, long data);

/**
 * <a href="https://docs.gl/es3/glGetFloatv">Reference Page</a>
 */
    public void glGetFloatv(int pname, FloatBuffer data);

/**
 * Array version of: {@link #glGetFloatv GetFloatv}
 *
 * @see <a href="https://docs.gl/es3/glGetFloatv">Reference Page</a>
 */
    public void glGetFloatv(int pname, float[] data);

}
