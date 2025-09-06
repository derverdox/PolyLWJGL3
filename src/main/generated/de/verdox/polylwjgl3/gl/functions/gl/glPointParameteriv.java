package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl13.GL13Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl13.GL13AccessorImpl;
import java.nio.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL14;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glPointParameteriv {

/**
 * Unsafe version of: {@link #glPointParameteriv PointParameteriv}
 */
    public void nglPointParameteriv(int pname, long params);

/**
 * Pointer version of {@link #glPointParameteri PointParameteri}.
 *
 * @param pname  the parameter to set
 * @param params the parameter value
 *
 * @see <a href="https://docs.gl/gl4/glPointParameter">Reference Page</a>
 */
    public void glPointParameteriv(@NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params);

/**
 * Array version of: {@link #glPointParameteriv PointParameteriv}
 *
 * @see <a href="https://docs.gl/gl4/glPointParameter">Reference Page</a>
 */
    public void glPointParameteriv(@NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params);

}
