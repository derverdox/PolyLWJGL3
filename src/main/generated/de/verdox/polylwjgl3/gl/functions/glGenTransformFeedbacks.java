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

public interface glGenTransformFeedbacks {

    public void nglGenTransformFeedbacks(int n, long ids);

/**
 * <a href="https://docs.gl/es3/glGenTransformFeedbacks">Reference Page</a>
 */
    public void glGenTransformFeedbacks(@NativeType("GLuint *") IntBuffer ids);

/**
 * <a href="https://docs.gl/es3/glGenTransformFeedbacks">Reference Page</a>
 */
@NativeType("void")
    public int glGenTransformFeedbacks();

/**
 * Array version of: {@link #glGenTransformFeedbacks GenTransformFeedbacks}
 *
 * @see <a href="https://docs.gl/es3/glGenTransformFeedbacks">Reference Page</a>
 */
    public void glGenTransformFeedbacks(@NativeType("GLuint *") int[] ids);

}
