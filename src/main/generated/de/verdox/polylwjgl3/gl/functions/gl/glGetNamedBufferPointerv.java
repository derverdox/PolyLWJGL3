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

public interface glGetNamedBufferPointerv {

/**
 * Unsafe version of: {@link #glGetNamedBufferPointerv GetNamedBufferPointerv}
 */
    public void nglGetNamedBufferPointerv(int buffer, int pname, long params);

/**
 * DSA version of {@link GL15C#glGetBufferPointerv GetBufferPointerv}.
 *
 * @param buffer the buffer object name
 * @param pname  the pointer to be returned. Must be:<br><table><tr><td>{@link GL15#GL_BUFFER_MAP_POINTER BUFFER_MAP_POINTER}</td></tr></table>
 * @param params the pointer value specified by {@code pname}
 *
 * @see <a href="https://docs.gl/gl4/glGetBufferPointerv">Reference Page</a>
 */
    public void glGetNamedBufferPointerv(int buffer, int pname, PointerBuffer params);

}
