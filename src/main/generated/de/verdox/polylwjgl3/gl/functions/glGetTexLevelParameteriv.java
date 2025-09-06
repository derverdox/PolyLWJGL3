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

public interface glGetTexLevelParameteriv {

    public void nglGetTexLevelParameteriv(int target, int level, int pname, long params);

/**
 * <a href="https://docs.gl/es3/glGetTexLevelParameter">Reference Page</a>
 */
    public void glGetTexLevelParameteriv(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params);

/**
 * Array version of: {@link #glGetTexLevelParameteriv GetTexLevelParameteriv}
 *
 * @see <a href="https://docs.gl/es3/glGetTexLevelParameter">Reference Page</a>
 */
    public void glGetTexLevelParameteriv(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params);

}
