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

public interface glGenVertexArrays {

    public void nglGenVertexArrays(int n, long arrays);

/**
 * <a href="https://docs.gl/es3/glGenVertexArrays">Reference Page</a>
 */
    public void glGenVertexArrays(@NativeType("GLuint *") IntBuffer arrays);

/**
 * <a href="https://docs.gl/es3/glGenVertexArrays">Reference Page</a>
 */
@NativeType("void")
    public int glGenVertexArrays();

/**
 * Array version of: {@link #glGenVertexArrays GenVertexArrays}
 *
 * @see <a href="https://docs.gl/es3/glGenVertexArrays">Reference Page</a>
 */
    public void glGenVertexArrays(@NativeType("GLuint *") int[] arrays);

}
