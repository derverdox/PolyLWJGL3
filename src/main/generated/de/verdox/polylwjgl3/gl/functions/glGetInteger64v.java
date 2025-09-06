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

public interface glGetInteger64v {

    public void nglGetInteger64v(int pname, long data);

/**
 * <a href="https://docs.gl/es3/glGetInteger64v">Reference Page</a>
 */
    public void glGetInteger64v(@NativeType("GLenum") int pname, @NativeType("GLint64 *") LongBuffer data);

/**
 * Array version of: {@link #glGetInteger64v GetInteger64v}
 *
 * @see <a href="https://docs.gl/es3/glGetInteger64v">Reference Page</a>
 */
    public void glGetInteger64v(@NativeType("GLenum") int pname, @NativeType("GLint64 *") long[] data);

}
