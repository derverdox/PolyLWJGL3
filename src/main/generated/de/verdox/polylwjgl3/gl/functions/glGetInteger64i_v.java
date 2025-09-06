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

public interface glGetInteger64i_v {

    public void nglGetInteger64i_v(int target, int index, long data);

/**
 * <a href="https://docs.gl/es3/glGetInteger">Reference Page</a>
 */
    public void glGetInteger64i_v(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint64 *") LongBuffer data);

/**
 * Array version of: {@link #glGetInteger64i_v GetInteger64i_v}
 *
 * @see <a href="https://docs.gl/es3/glGetInteger">Reference Page</a>
 */
    public void glGetInteger64i_v(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint64 *") long[] data);

}
