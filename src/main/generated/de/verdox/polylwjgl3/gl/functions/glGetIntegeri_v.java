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

public interface glGetIntegeri_v {

    public void nglGetIntegeri_v(int target, int index, long data);

/**
 * <a href="https://docs.gl/es3/glGetIntegeri_v">Reference Page</a>
 */
    public void glGetIntegeri_v(int target, int index, IntBuffer data);

/**
 * Array version of: {@link #glGetIntegeri_v GetIntegeri_v}
 *
 * @see <a href="https://docs.gl/es3/glGetIntegeri_v">Reference Page</a>
 */
    public void glGetIntegeri_v(int target, int index, int[] data);

}
