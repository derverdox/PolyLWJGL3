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

public interface glGetFramebufferParameteriv {

    public void nglGetFramebufferParameteriv(int target, int pname, long params);

/**
 * <a href="https://docs.gl/es3/glGetFramebufferParameter">Reference Page</a>
 */
    public void glGetFramebufferParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params);

/**
 * Array version of: {@link #glGetFramebufferParameteriv GetFramebufferParameteriv}
 *
 * @see <a href="https://docs.gl/es3/glGetFramebufferParameter">Reference Page</a>
 */
    public void glGetFramebufferParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params);

}
