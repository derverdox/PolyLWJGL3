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

public interface glDeleteFramebuffers {

    public void nglDeleteFramebuffers(int n, long framebuffers);

/**
 * <a href="https://docs.gl/es3/glDeleteFramebuffers">Reference Page</a>
 */
    public void glDeleteFramebuffers(@NativeType("GLuint const *") IntBuffer framebuffers);

/**
 * <a href="https://docs.gl/es3/glDeleteFramebuffers">Reference Page</a>
 */
    public void glDeleteFramebuffers(@NativeType("GLuint const *") int framebuffer);

/**
 * Array version of: {@link #glDeleteFramebuffers DeleteFramebuffers}
 *
 * @see <a href="https://docs.gl/es3/glDeleteFramebuffers">Reference Page</a>
 */
    public void glDeleteFramebuffers(@NativeType("GLuint const *") int[] framebuffers);

}
