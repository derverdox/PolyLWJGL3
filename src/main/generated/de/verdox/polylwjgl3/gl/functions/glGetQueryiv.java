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

public interface glGetQueryiv {

    public void nglGetQueryiv(int target, int pname, long params);

/**
 * <a href="https://docs.gl/es3/glGetQuery">Reference Page</a>
 */
    public void glGetQueryiv(int target, int pname, IntBuffer params);

/**
 * Array version of: {@link #glGetQueryiv GetQueryiv}
 *
 * @see <a href="https://docs.gl/es3/glGetQuery">Reference Page</a>
 */
    public void glGetQueryiv(int target, int pname, int[] params);

}
