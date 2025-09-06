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

public interface glVertexAttrib2fv {

    public void nglVertexAttrib2fv(int index, long v);

/**
 * <a href="https://docs.gl/es3/glVertexAttrib">Reference Page</a>
 */
    public void glVertexAttrib2fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer v);

/**
 * Array version of: {@link #glVertexAttrib2fv VertexAttrib2fv}
 *
 * @see <a href="https://docs.gl/es3/glVertexAttrib">Reference Page</a>
 */
    public void glVertexAttrib2fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] v);

}
