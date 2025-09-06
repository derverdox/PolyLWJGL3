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

public interface glTexParameteriv {

    public void nglTexParameteriv(int target, int pname, long params);

/**
 * <a href="https://docs.gl/es3/glTexParameter">Reference Page</a>
 */
    public void glTexParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params);

/**
 * Array version of: {@link #glTexParameteriv TexParameteriv}
 *
 * @see <a href="https://docs.gl/es3/glTexParameter">Reference Page</a>
 */
    public void glTexParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params);

}
