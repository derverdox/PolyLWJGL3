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

public interface glCopyNamedBufferSubData {

/**
 * DSA version of {@link GL31C#glCopyBufferSubData CopyBufferSubData}.
 *
 * @param readBuffer  the source buffer object name
 * @param writeBuffer the destination buffer object name
 * @param readOffset  the source buffer object offset, in bytes
 * @param writeOffset the destination buffer object offset, in bytes
 * @param size        the number of bytes to copy
 *
 * @see <a href="https://docs.gl/gl4/glCopyBufferSubData">Reference Page</a>
 */
    public void glCopyNamedBufferSubData(@NativeType("GLuint") int readBuffer, @NativeType("GLuint") int writeBuffer, @NativeType("GLintptr") long readOffset, @NativeType("GLintptr") long writeOffset, @NativeType("GLsizeiptr") long size);

}
