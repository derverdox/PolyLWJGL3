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

public interface glDrawElementsInstanced {

    public void nglDrawElementsInstanced(int mode, int count, int type, long indices, int instancecount);

/**
 * <a href="https://docs.gl/es3/glDrawElementsInstanced">Reference Page</a>
 */
    public void glDrawElementsInstanced(int mode, int count, int type, long indices, int instancecount);

/**
 * <a href="https://docs.gl/es3/glDrawElementsInstanced">Reference Page</a>
 */
    public void glDrawElementsInstanced(int mode, int type, ByteBuffer indices, int instancecount);

/**
 * <a href="https://docs.gl/es3/glDrawElementsInstanced">Reference Page</a>
 */
    public void glDrawElementsInstanced(int mode, ByteBuffer indices, int instancecount);

/**
 * <a href="https://docs.gl/es3/glDrawElementsInstanced">Reference Page</a>
 */
    public void glDrawElementsInstanced(int mode, ShortBuffer indices, int instancecount);

/**
 * <a href="https://docs.gl/es3/glDrawElementsInstanced">Reference Page</a>
 */
    public void glDrawElementsInstanced(int mode, IntBuffer indices, int instancecount);

}
