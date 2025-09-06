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

public interface glGetnPolygonStipple {

/**
 * Unsafe version of: {@link #glGetnPolygonStipple GetnPolygonStipple}
 *
 * @param bufSize the maximum number of bytes to write into {@code pattern}
 */
    public void nglGetnPolygonStipple(int bufSize, long pattern);

/**
 * Robust version of {@link GL11#glGetPolygonStipple GetPolygonStipple}
 *
 * @param bufSize the maximum number of bytes to write into {@code pattern}
 * @param pattern a buffer in which to place the returned pattern
 *
 * @see <a href="https://docs.gl/gl4/glGetnPolygonStipple">Reference Page</a>
 */
    public void glGetnPolygonStipple(@NativeType("GLsizei") int bufSize, @NativeType("GLubyte *") long pattern);

/**
 * Robust version of {@link GL11#glGetPolygonStipple GetPolygonStipple}
 *
 * @param pattern a buffer in which to place the returned pattern
 *
 * @see <a href="https://docs.gl/gl4/glGetnPolygonStipple">Reference Page</a>
 */
    public void glGetnPolygonStipple(@NativeType("GLubyte *") ByteBuffer pattern);

}
