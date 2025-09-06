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

public interface glGetShaderPrecisionFormat {

    public void nglGetShaderPrecisionFormat(int shadertype, int precisiontype, long range, long precision);

/**
 * <a href="https://docs.gl/es3/glGetShaderPrecisionFormat">Reference Page</a>
 */
    public void glGetShaderPrecisionFormat(int shadertype, int precisiontype, IntBuffer range, IntBuffer precision);

/**
 * Array version of: {@link #glGetShaderPrecisionFormat GetShaderPrecisionFormat}
 *
 * @see <a href="https://docs.gl/es3/glGetShaderPrecisionFormat">Reference Page</a>
 */
    public void glGetShaderPrecisionFormat(int shadertype, int precisiontype, int[] range, int[] precision);

}
