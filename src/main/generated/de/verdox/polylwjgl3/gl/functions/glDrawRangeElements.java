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

public interface glDrawRangeElements {

    public void nglDrawRangeElements(int mode, int start, int end, int count, int type, long indices);

/**
 * <a href="https://docs.gl/es3/glDrawRangeElements">Reference Page</a>
 */
    public void glDrawRangeElements(int mode, int start, int end, int count, int type, long indices);

/**
 * <a href="https://docs.gl/es3/glDrawRangeElements">Reference Page</a>
 */
    public void glDrawRangeElements(int mode, int start, int end, int type, ByteBuffer indices);

/**
 * <a href="https://docs.gl/es3/glDrawRangeElements">Reference Page</a>
 */
    public void glDrawRangeElements(int mode, int start, int end, ByteBuffer indices);

/**
 * <a href="https://docs.gl/es3/glDrawRangeElements">Reference Page</a>
 */
    public void glDrawRangeElements(int mode, int start, int end, ShortBuffer indices);

/**
 * <a href="https://docs.gl/es3/glDrawRangeElements">Reference Page</a>
 */
    public void glDrawRangeElements(int mode, int start, int end, IntBuffer indices);

}
