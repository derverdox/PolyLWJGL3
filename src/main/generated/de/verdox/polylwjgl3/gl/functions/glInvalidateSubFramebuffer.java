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

public interface glInvalidateSubFramebuffer {

    public void nglInvalidateSubFramebuffer(int target, int numAttachments, long attachments, int x, int y, int width, int height);

/**
 * <a href="https://docs.gl/es3/glInvalidateSubFramebuffer">Reference Page</a>
 */
    public void glInvalidateSubFramebuffer(int target, IntBuffer attachments, int x, int y, int width, int height);

/**
 * <a href="https://docs.gl/es3/glInvalidateSubFramebuffer">Reference Page</a>
 */
    public void glInvalidateSubFramebuffer(int target, int attachment, int x, int y, int width, int height);

/**
 * Array version of: {@link #glInvalidateSubFramebuffer InvalidateSubFramebuffer}
 *
 * @see <a href="https://docs.gl/es3/glInvalidateSubFramebuffer">Reference Page</a>
 */
    public void glInvalidateSubFramebuffer(int target, int[] attachments, int x, int y, int width, int height);

}
