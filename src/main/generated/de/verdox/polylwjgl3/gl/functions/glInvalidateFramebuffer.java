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

public interface glInvalidateFramebuffer {

    public void nglInvalidateFramebuffer(int target, int numAttachments, long attachments);

/**
 * <a href="https://docs.gl/es3/glInvalidateFramebuffer">Reference Page</a>
 */
    public void glInvalidateFramebuffer(int target, IntBuffer attachments);

/**
 * <a href="https://docs.gl/es3/glInvalidateFramebuffer">Reference Page</a>
 */
    public void glInvalidateFramebuffer(int target, int attachment);

/**
 * Array version of: {@link #glInvalidateFramebuffer InvalidateFramebuffer}
 *
 * @see <a href="https://docs.gl/es3/glInvalidateFramebuffer">Reference Page</a>
 */
    public void glInvalidateFramebuffer(int target, int[] attachments);

}
