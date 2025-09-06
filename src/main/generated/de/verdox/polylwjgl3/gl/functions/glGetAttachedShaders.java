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

public interface glGetAttachedShaders {

    public void nglGetAttachedShaders(int program, int maxCount, long count, long shaders);

/**
 * <a href="https://docs.gl/es3/glGetAttachedShaders">Reference Page</a>
 */
    public void glGetAttachedShaders(int program, @Nullable IntBuffer count, IntBuffer shaders);

/**
 * Array version of: {@link #glGetAttachedShaders GetAttachedShaders}
 *
 * @see <a href="https://docs.gl/es3/glGetAttachedShaders">Reference Page</a>
 */
    public void glGetAttachedShaders(int program, @Nullable int[] count, int[] shaders);

}
