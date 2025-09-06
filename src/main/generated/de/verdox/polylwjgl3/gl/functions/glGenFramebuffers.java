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

public interface glGenFramebuffers {

    public void nglGenFramebuffers(int n, long framebuffers);

/**
 * <a href="https://docs.gl/es3/glGenFramebuffers">Reference Page</a>
 */
    public void glGenFramebuffers(IntBuffer framebuffers);

/**
 * <a href="https://docs.gl/es3/glGenFramebuffers">Reference Page</a>
 */
    public int glGenFramebuffers();

/**
 * Array version of: {@link #glGenFramebuffers GenFramebuffers}
 *
 * @see <a href="https://docs.gl/es3/glGenFramebuffers">Reference Page</a>
 */
    public void glGenFramebuffers(int[] framebuffers);

}
