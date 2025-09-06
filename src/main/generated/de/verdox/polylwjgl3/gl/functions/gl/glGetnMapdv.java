package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl44.GL44Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl44.GL44AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL45;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glGetnMapdv {

/**
 * Unsafe version of: {@link #glGetnMapdv GetnMapdv}
 *
 * @param bufSize the maximum number of bytes to write into {@code data}
 */
    public void nglGetnMapdv(int target, int query, int bufSize, long data);

/**
 * Robust version of {@link GL11#glGetMapdv GetMapdv}
 *
 * @param target the evaluator map
 * @param query  the information to query
 * @param data   a buffer in which to place the returned data
 *
 * @see <a href="https://docs.gl/gl4/glGetMap">Reference Page</a>
 */
    public void glGetnMapdv(@NativeType("GLenum") int target, @NativeType("GLenum") int query, @NativeType("GLdouble *") DoubleBuffer data);

/**
 * Array version of: {@link #glGetnMapdv GetnMapdv}
 *
 * @see <a href="https://docs.gl/gl4/glGetMap">Reference Page</a>
 */
    public void glGetnMapdv(@NativeType("GLenum") int target, @NativeType("GLenum") int query, @NativeType("GLdouble *") double[] data);

}
