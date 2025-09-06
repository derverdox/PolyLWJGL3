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

public interface glDrawElements {

    public void nglDrawElements(int mode, int count, int type, long indices);

/**
 * <a href="https://docs.gl/es3/glDrawElements">Reference Page</a>
 */
    public void glDrawElements(int mode, int count, int type, long indices);

/**
 * <a href="https://docs.gl/es3/glDrawElements">Reference Page</a>
 */
    public void glDrawElements(int mode, int type, ByteBuffer indices);

/**
 * <a href="https://docs.gl/es3/glDrawElements">Reference Page</a>
 */
    public void glDrawElements(int mode, ByteBuffer indices);

/**
 * <a href="https://docs.gl/es3/glDrawElements">Reference Page</a>
 */
    public void glDrawElements(int mode, ShortBuffer indices);

/**
 * <a href="https://docs.gl/es3/glDrawElements">Reference Page</a>
 */
    public void glDrawElements(int mode, IntBuffer indices);

}
