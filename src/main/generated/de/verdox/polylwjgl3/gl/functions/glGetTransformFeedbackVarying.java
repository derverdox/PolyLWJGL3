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

public interface glGetTransformFeedbackVarying {

    public void nglGetTransformFeedbackVarying(int program, int index, int bufSize, long length, long size, long type, long name);

/**
 * <a href="https://docs.gl/es3/glGetTransformFeedbackVarying">Reference Page</a>
 */
    public void glGetTransformFeedbackVarying(int program, int index, @Nullable IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name);

/**
 * <a href="https://docs.gl/es3/glGetTransformFeedbackVarying">Reference Page</a>
 */
    public String glGetTransformFeedbackVarying(int program, int index, int bufSize, IntBuffer size, IntBuffer type);

/**
 * <a href="https://docs.gl/es3/glGetTransformFeedbackVarying">Reference Page</a>
 */
    public String glGetTransformFeedbackVarying(int program, int index, IntBuffer size, IntBuffer type);

/**
 * Array version of: {@link #glGetTransformFeedbackVarying GetTransformFeedbackVarying}
 *
 * @see <a href="https://docs.gl/es3/glGetTransformFeedbackVarying">Reference Page</a>
 */
    public void glGetTransformFeedbackVarying(int program, int index, @Nullable int[] length, int[] size, int[] type, ByteBuffer name);

}
