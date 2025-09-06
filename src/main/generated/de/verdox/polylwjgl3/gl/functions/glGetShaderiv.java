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

public interface glGetShaderiv {

    public void nglGetShaderiv(int shader, int pname, long params);

/**
 * <a href="https://docs.gl/es3/glGetShader">Reference Page</a>
 */
    public void glGetShaderiv(int shader, int pname, IntBuffer params);

/**
 * Array version of: {@link #glGetShaderiv GetShaderiv}
 *
 * @see <a href="https://docs.gl/es3/glGetShader">Reference Page</a>
 */
    public void glGetShaderiv(int shader, int pname, int[] params);

}
