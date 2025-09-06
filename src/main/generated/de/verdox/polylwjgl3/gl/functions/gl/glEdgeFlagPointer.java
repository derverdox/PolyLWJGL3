package de.verdox.polylwjgl3.gl.functions.gl;

import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glEdgeFlagPointer {

/**
 * Unsafe version of: {@link #glEdgeFlagPointer EdgeFlagPointer}
 */
    public void nglEdgeFlagPointer(int stride, long pointer);

/**
 * Specifies the location and organization of an edge flag array.
 *
 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
 * @param pointer the edge flag array data
 *
 * @see <a href="https://docs.gl/gl3/glEdgeFlagPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glEdgeFlagPointer(@NativeType("GLsizei") int stride, @NativeType("GLboolean const *") ByteBuffer pointer);

/**
 * Specifies the location and organization of an edge flag array.
 *
 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
 * @param pointer the edge flag array data
 *
 * @see <a href="https://docs.gl/gl3/glEdgeFlagPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glEdgeFlagPointer(@NativeType("GLsizei") int stride, @NativeType("GLboolean const *") long pointer);

}
