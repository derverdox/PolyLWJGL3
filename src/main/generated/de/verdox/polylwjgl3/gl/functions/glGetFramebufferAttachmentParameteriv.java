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

public interface glGetFramebufferAttachmentParameteriv {

    public void nglGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, long params);

/**
 * <a href="https://docs.gl/es3/glGetFramebufferAttachmentParameter">Reference Page</a>
 */
    public void glGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, IntBuffer params);

/**
 * Array version of: {@link #glGetFramebufferAttachmentParameteriv GetFramebufferAttachmentParameteriv}
 *
 * @see <a href="https://docs.gl/es3/glGetFramebufferAttachmentParameter">Reference Page</a>
 */
    public void glGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, int[] params);

}
