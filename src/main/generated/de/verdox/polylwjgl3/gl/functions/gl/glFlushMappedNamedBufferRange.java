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

public interface glFlushMappedNamedBufferRange {

/**
 * DSA version of {@link GL30C#glFlushMappedBufferRange FlushMappedBufferRange}.
 *
 * @param buffer the buffer object name
 * @param offset the start of the buffer subrange, in basic machine units
 * @param length the length of the buffer subrange, in basic machine units
 *
 * @see <a href="https://docs.gl/gl4/glFlushMappedBufferRange">Reference Page</a>
 */
    public void glFlushMappedNamedBufferRange(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length);

}
