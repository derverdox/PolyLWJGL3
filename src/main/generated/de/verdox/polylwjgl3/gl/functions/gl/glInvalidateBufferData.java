package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl42.GL42Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl42.GL42AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL43;
import org.lwjgl.system.*;

public interface glInvalidateBufferData {

/**
 * Invalidates the content of a buffer object's data store.
 *
 * @param buffer the name of a buffer object whose data store to invalidate
 *
 * @see <a href="https://docs.gl/gl4/glInvalidateBufferData">Reference Page</a>
 */
    public void glInvalidateBufferData(@NativeType("GLuint") int buffer);

}
