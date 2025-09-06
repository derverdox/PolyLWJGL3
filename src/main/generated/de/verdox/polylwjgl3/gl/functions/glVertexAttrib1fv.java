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

public interface glVertexAttrib1fv {

    public void nglVertexAttrib1fv(int index, long v);

/**
 * <a href="https://docs.gl/es3/glVertexAttrib">Reference Page</a>
 */
    public void glVertexAttrib1fv(int index, FloatBuffer v);

/**
 * Array version of: {@link #glVertexAttrib1fv VertexAttrib1fv}
 *
 * @see <a href="https://docs.gl/es3/glVertexAttrib">Reference Page</a>
 */
    public void glVertexAttrib1fv(int index, float[] v);

}
