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

public interface glVertexAttrib4fv {

    public void nglVertexAttrib4fv(int index, long v);

/**
 * <a href="https://docs.gl/es3/glVertexAttrib">Reference Page</a>
 */
    public void glVertexAttrib4fv(int index, FloatBuffer v);

/**
 * Array version of: {@link #glVertexAttrib4fv VertexAttrib4fv}
 *
 * @see <a href="https://docs.gl/es3/glVertexAttrib">Reference Page</a>
 */
    public void glVertexAttrib4fv(int index, float[] v);

}
