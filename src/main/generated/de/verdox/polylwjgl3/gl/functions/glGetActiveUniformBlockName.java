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

public interface glGetActiveUniformBlockName {

    public void nglGetActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize, long length, long uniformBlockName);

/**
 * <a href="https://docs.gl/es3/glGetActiveUniformBlockName">Reference Page</a>
 */
    public void glGetActiveUniformBlockName(int program, int uniformBlockIndex, @Nullable IntBuffer length, ByteBuffer uniformBlockName);

/**
 * <a href="https://docs.gl/es3/glGetActiveUniformBlockName">Reference Page</a>
 */
    public String glGetActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize);

/**
 * <a href="https://docs.gl/es3/glGetActiveUniformBlockName">Reference Page</a>
 */
    public String glGetActiveUniformBlockName(int program, int uniformBlockIndex);

/**
 * Array version of: {@link #glGetActiveUniformBlockName GetActiveUniformBlockName}
 *
 * @see <a href="https://docs.gl/es3/glGetActiveUniformBlockName">Reference Page</a>
 */
    public void glGetActiveUniformBlockName(int program, int uniformBlockIndex, @Nullable int[] length, ByteBuffer uniformBlockName);

}
