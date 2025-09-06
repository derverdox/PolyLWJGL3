package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl42.GL42Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl42.GL42AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL43;
import org.lwjgl.system.*;

public interface glInvalidateBufferSubData {

/**
 * Invalidates a region of a buffer object's data store.
 *
 * @param buffer the name of a buffer object, a subrange of whose data store to invalidate
 * @param offset the offset within the buffer's data store of the start of the range to be invalidated
 * @param length the length of the range within the buffer's data store to be invalidated
 *
 * @see <a href="https://docs.gl/gl4/glInvalidateBufferSubData">Reference Page</a>
 */
    public void glInvalidateBufferSubData(int buffer, long offset, long length);

}
