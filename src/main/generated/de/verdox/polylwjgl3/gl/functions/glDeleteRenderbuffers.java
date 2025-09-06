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

public interface glDeleteRenderbuffers {

    public void nglDeleteRenderbuffers(int n, long renderbuffers);

/**
 * <a href="https://docs.gl/es3/glDeleteRenderbuffers">Reference Page</a>
 */
    public void glDeleteRenderbuffers(IntBuffer renderbuffers);

/**
 * <a href="https://docs.gl/es3/glDeleteRenderbuffers">Reference Page</a>
 */
    public void glDeleteRenderbuffers(int renderbuffer);

/**
 * Array version of: {@link #glDeleteRenderbuffers DeleteRenderbuffers}
 *
 * @see <a href="https://docs.gl/es3/glDeleteRenderbuffers">Reference Page</a>
 */
    public void glDeleteRenderbuffers(int[] renderbuffers);

}
