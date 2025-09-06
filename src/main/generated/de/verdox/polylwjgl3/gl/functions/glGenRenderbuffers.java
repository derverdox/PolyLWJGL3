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

public interface glGenRenderbuffers {

    public void nglGenRenderbuffers(int n, long renderbuffers);

/**
 * <a href="https://docs.gl/es3/glGenRenderbuffers">Reference Page</a>
 */
    public void glGenRenderbuffers(@NativeType("GLuint *") IntBuffer renderbuffers);

/**
 * <a href="https://docs.gl/es3/glGenRenderbuffers">Reference Page</a>
 */
@NativeType("void")
    public int glGenRenderbuffers();

/**
 * Array version of: {@link #glGenRenderbuffers GenRenderbuffers}
 *
 * @see <a href="https://docs.gl/es3/glGenRenderbuffers">Reference Page</a>
 */
    public void glGenRenderbuffers(@NativeType("GLuint *") int[] renderbuffers);

}
