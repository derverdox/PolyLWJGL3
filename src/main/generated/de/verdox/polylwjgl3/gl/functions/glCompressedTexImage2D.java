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

public interface glCompressedTexImage2D {

    public void nglCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, long data);

/**
 * <a href="https://docs.gl/es3/glCompressedTexImage2D">Reference Page</a>
 */
    public void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, long data);

/**
 * <a href="https://docs.gl/es3/glCompressedTexImage2D">Reference Page</a>
 */
    public void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, @Nullable ByteBuffer data);

}
