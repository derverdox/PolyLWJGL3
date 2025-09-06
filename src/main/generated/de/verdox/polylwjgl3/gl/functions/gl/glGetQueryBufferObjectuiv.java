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

public interface glGetQueryBufferObjectuiv {

/**
 * Unsigned version of {@link #glGetQueryBufferObjectiv GetQueryBufferObjectiv}.
 *
 * @param id     the name of a query object
 * @param buffer the name of a buffer object
 * @param pname  the state to query
 * @param offset the offset into {@code buffer} at which the queried value is written
 *
 * @see <a href="https://docs.gl/gl4/glGetQueryBufferObject">Reference Page</a>
 */
    public void glGetQueryBufferObjectuiv(@NativeType("GLuint") int id, @NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLintptr") long offset);

}
