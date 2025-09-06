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
    public void glDrawElementsInstanced(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLsizei") int instancecount);

/**
 * <a href="https://docs.gl/es3/glDrawElementsInstanced">Reference Page</a>
 */
    public void glDrawElementsInstanced(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int instancecount);

/**
 * <a href="https://docs.gl/es3/glDrawElementsInstanced">Reference Page</a>
 */
    public void glDrawElementsInstanced(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int instancecount);

/**
 * <a href="https://docs.gl/es3/glDrawElementsInstanced">Reference Page</a>
 */
    public void glDrawElementsInstanced(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices, @NativeType("GLsizei") int instancecount);

/**
 * <a href="https://docs.gl/es3/glDrawElementsInstanced">Reference Page</a>
 */
    public void glDrawElementsInstanced(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices, @NativeType("GLsizei") int instancecount);

}
