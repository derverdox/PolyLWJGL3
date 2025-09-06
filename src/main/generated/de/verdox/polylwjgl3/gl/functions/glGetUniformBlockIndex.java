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

public interface glGetUniformBlockIndex {

    public int nglGetUniformBlockIndex(int program, long uniformBlockName);

/**
 * <a href="https://docs.gl/es3/glGetUniformBlockIndex">Reference Page</a>
 */
    public int glGetUniformBlockIndex(int program, ByteBuffer uniformBlockName);

/**
 * <a href="https://docs.gl/es3/glGetUniformBlockIndex">Reference Page</a>
 */
    public int glGetUniformBlockIndex(int program, CharSequence uniformBlockName);

}
