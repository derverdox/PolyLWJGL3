package de.verdox.polylwjgl3.gl.functions;

import de.verdox.polylwjgl3.gl.accessor.gles31.GLES31Accessor;
import de.verdox.polylwjgl3.gl.accessor.gles31.GLES31AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengles.GLES32;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glDrawElementsBaseVertex {

    public void nglDrawElementsBaseVertex(int mode, int count, int type, long indices, int basevertex);

/**
 * <a href="https://docs.gl/es3/glDrawElementsBaseVertex">Reference Page</a>
 */
    public void glDrawElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLint") int basevertex);

/**
 * <a href="https://docs.gl/es3/glDrawElementsBaseVertex">Reference Page</a>
 */
    public void glDrawElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLint") int basevertex);

/**
 * <a href="https://docs.gl/es3/glDrawElementsBaseVertex">Reference Page</a>
 */
    public void glDrawElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices, @NativeType("GLint") int basevertex);

/**
 * <a href="https://docs.gl/es3/glDrawElementsBaseVertex">Reference Page</a>
 */
    public void glDrawElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices, @NativeType("GLint") int basevertex);

/**
 * <a href="https://docs.gl/es3/glDrawElementsBaseVertex">Reference Page</a>
 */
    public void glDrawElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices, @NativeType("GLint") int basevertex);

}
