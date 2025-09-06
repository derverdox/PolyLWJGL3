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

public interface glGetVertexAttribfv {

    public void nglGetVertexAttribfv(int index, int pname, long params);

/**
 * <a href="https://docs.gl/es3/glGetVertexAttrib">Reference Page</a>
 */
    public void glGetVertexAttribfv(int index, int pname, FloatBuffer params);

/**
 * Array version of: {@link #glGetVertexAttribfv GetVertexAttribfv}
 *
 * @see <a href="https://docs.gl/es3/glGetVertexAttrib">Reference Page</a>
 */
    public void glGetVertexAttribfv(int index, int pname, float[] params);

}
