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

public interface glGetProgramiv {

    public void nglGetProgramiv(int program, int pname, long params);

/**
 * <a href="https://docs.gl/es3/glGetProgram">Reference Page</a>
 */
    public void glGetProgramiv(int program, int pname, IntBuffer params);

/**
 * Array version of: {@link #glGetProgramiv GetProgramiv}
 *
 * @see <a href="https://docs.gl/es3/glGetProgram">Reference Page</a>
 */
    public void glGetProgramiv(int program, int pname, int[] params);

}
