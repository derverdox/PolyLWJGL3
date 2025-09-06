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

public interface glGetTexParameteriv {

    public void nglGetTexParameteriv(int target, int pname, long params);

/**
 * <a href="https://docs.gl/es3/glGetTexParameter">Reference Page</a>
 */
    public void glGetTexParameteriv(int target, int pname, IntBuffer params);

/**
 * Array version of: {@link #glGetTexParameteriv GetTexParameteriv}
 *
 * @see <a href="https://docs.gl/es3/glGetTexParameter">Reference Page</a>
 */
    public void glGetTexParameteriv(int target, int pname, int[] params);

}
