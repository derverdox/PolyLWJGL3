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
    public void glDrawElements(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices);

/**
 * <a href="https://docs.gl/es3/glDrawElements">Reference Page</a>
 */
    public void glDrawElements(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices);

/**
 * <a href="https://docs.gl/es3/glDrawElements">Reference Page</a>
 */
    public void glDrawElements(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices);

/**
 * <a href="https://docs.gl/es3/glDrawElements">Reference Page</a>
 */
    public void glDrawElements(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices);

/**
 * <a href="https://docs.gl/es3/glDrawElements">Reference Page</a>
 */
    public void glDrawElements(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices);

}
