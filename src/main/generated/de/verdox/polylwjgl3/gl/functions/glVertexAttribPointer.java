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

public interface glVertexAttribPointer {

    public void nglVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, long pointer);

/**
 * <a href="https://docs.gl/es3/glVertexAttribPointer">Reference Page</a>
 */
    public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, ByteBuffer pointer);

/**
 * <a href="https://docs.gl/es3/glVertexAttribPointer">Reference Page</a>
 */
    public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, long pointer);

/**
 * <a href="https://docs.gl/es3/glVertexAttribPointer">Reference Page</a>
 */
    public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, ShortBuffer pointer);

/**
 * <a href="https://docs.gl/es3/glVertexAttribPointer">Reference Page</a>
 */
    public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, IntBuffer pointer);

/**
 * <a href="https://docs.gl/es3/glVertexAttribPointer">Reference Page</a>
 */
    public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, FloatBuffer pointer);

}
