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

public interface glGenQueries {

    public void nglGenQueries(int n, long ids);

/**
 * <a href="https://docs.gl/es3/glGenQueries">Reference Page</a>
 */
    public void glGenQueries(IntBuffer ids);

/**
 * <a href="https://docs.gl/es3/glGenQueries">Reference Page</a>
 */
    public int glGenQueries();

/**
 * Array version of: {@link #glGenQueries GenQueries}
 *
 * @see <a href="https://docs.gl/es3/glGenQueries">Reference Page</a>
 */
    public void glGenQueries(int[] ids);

}
