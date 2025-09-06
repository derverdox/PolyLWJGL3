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

public interface glGetProgramBinary {

    public void nglGetProgramBinary(int program, int bufSize, long length, long binaryFormat, long binary);

/**
 * <a href="https://docs.gl/es3/glGetProgramBinary">Reference Page</a>
 */
    public void glGetProgramBinary(int program, @Nullable IntBuffer length, IntBuffer binaryFormat, ByteBuffer binary);

/**
 * Array version of: {@link #glGetProgramBinary GetProgramBinary}
 *
 * @see <a href="https://docs.gl/es3/glGetProgramBinary">Reference Page</a>
 */
    public void glGetProgramBinary(int program, @Nullable int[] length, int[] binaryFormat, ByteBuffer binary);

}
