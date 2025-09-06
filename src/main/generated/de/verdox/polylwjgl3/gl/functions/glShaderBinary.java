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

public interface glShaderBinary {

    public void nglShaderBinary(int count, long shaders, int binaryformat, long binary, int length);

/**
 * <a href="https://docs.gl/es3/glShaderBinary">Reference Page</a>
 */
    public void glShaderBinary(IntBuffer shaders, int binaryformat, ByteBuffer binary);

/**
 * Array version of: {@link #glShaderBinary ShaderBinary}
 *
 * @see <a href="https://docs.gl/es3/glShaderBinary">Reference Page</a>
 */
    public void glShaderBinary(int[] shaders, int binaryformat, ByteBuffer binary);

}
