package de.verdox.polylwjgl3.gl.functions;

import de.verdox.polylwjgl3.gl.accessor.gles30.GLES30Accessor;
import de.verdox.polylwjgl3.gl.accessor.gles30.GLES30AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengles.GLES31;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glDrawElementsIndirect {

    public void nglDrawElementsIndirect(int mode, int type, long indirect);

/**
 * <a href="https://docs.gl/es3/glDrawElementsIndirect">Reference Page</a>
 */
    public void glDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indirect);

/**
 * <a href="https://docs.gl/es3/glDrawElementsIndirect">Reference Page</a>
 */
    public void glDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") long indirect);

/**
 * <a href="https://docs.gl/es3/glDrawElementsIndirect">Reference Page</a>
 */
    public void glDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer indirect);

/**
 * Array version of: {@link #glDrawElementsIndirect DrawElementsIndirect}
 *
 * @see <a href="https://docs.gl/es3/glDrawElementsIndirect">Reference Page</a>
 */
    public void glDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") int[] indirect);

}
