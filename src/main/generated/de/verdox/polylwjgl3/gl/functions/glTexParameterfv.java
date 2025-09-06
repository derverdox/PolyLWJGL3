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

public interface glTexParameterfv {

    public void nglTexParameterfv(int target, int pname, long params);

/**
 * <a href="https://docs.gl/es3/glTexParameter">Reference Page</a>
 */
    public void glTexParameterfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params);

/**
 * Array version of: {@link #glTexParameterfv TexParameterfv}
 *
 * @see <a href="https://docs.gl/es3/glTexParameter">Reference Page</a>
 */
    public void glTexParameterfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] params);

}
