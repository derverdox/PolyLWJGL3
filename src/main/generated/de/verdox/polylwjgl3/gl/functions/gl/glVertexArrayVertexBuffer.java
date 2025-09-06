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

public interface glVertexArrayVertexBuffer {

/**
 * DSA version of {@link GL43C#glBindVertexBuffer BindVertexBuffer}.
 *
 * @param vaobj        the vertex array object name
 * @param bindingindex the index of the vertex buffer binding point to which to bind the buffer
 * @param buffer       the name of an existing buffer to bind to the vertex buffer binding point
 * @param offset       the offset of the first element of the buffer
 * @param stride       the distance between elements within the buffer
 *
 * @see <a href="https://docs.gl/gl4/glVertexArrayVertexBuffer">Reference Page</a>
 */
    public void glVertexArrayVertexBuffer(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int bindingindex, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizei") int stride);

}
