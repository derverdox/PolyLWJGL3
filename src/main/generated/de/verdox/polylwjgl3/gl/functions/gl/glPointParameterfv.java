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

public interface glPointParameterfv {

/**
 * Unsafe version of: {@link #glPointParameterfv PointParameterfv}
 */
    public void nglPointParameterfv(int pname, long params);

/**
 * Pointer version of {@link #glPointParameterf PointParameterf}.
 *
 * @param pname  the parameter to set
 * @param params the parameter value
 *
 * @see <a href="https://docs.gl/gl4/glPointParameter">Reference Page</a>
 */
    public void glPointParameterfv(@NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params);

/**
 * Array version of: {@link #glPointParameterfv PointParameterfv}
 *
 * @see <a href="https://docs.gl/gl4/glPointParameter">Reference Page</a>
 */
    public void glPointParameterfv(@NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] params);

}
