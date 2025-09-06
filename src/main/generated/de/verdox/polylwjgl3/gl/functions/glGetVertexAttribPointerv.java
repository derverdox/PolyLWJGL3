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

public interface glGetVertexAttribPointerv {

    public void nglGetVertexAttribPointerv(int index, int pname, long pointer);

/**
 * <a href="https://docs.gl/es3/glGetVertexAttribPointerv">Reference Page</a>
 */
    public void glGetVertexAttribPointerv(int index, int pname, PointerBuffer pointer);

}
