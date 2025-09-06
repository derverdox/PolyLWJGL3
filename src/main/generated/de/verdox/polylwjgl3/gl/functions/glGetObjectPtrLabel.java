package de.verdox.polylwjgl3.gl.functions;

import de.verdox.polylwjgl3.gl.accessor.gles31.GLES31Accessor;
import de.verdox.polylwjgl3.gl.accessor.gles31.GLES31AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengles.GLES32;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glGetObjectPtrLabel {

/**
 * Unsafe version of: {@link #glGetObjectPtrLabel GetObjectPtrLabel}
 *
 * @param bufSize the length of the buffer whose address is in {@code label}
 */
    public void nglGetObjectPtrLabel(long ptr, int bufSize, long length, long label);

/**
 * Retrieves the label of a sync object identified by a pointer.
 *
 * @param ptr    the name of the sync object whose label to retrieve
 * @param length a variable to receive the length of the object label
 * @param label  a string that will receive the object label
 *
 * @see <a href="https://docs.gl/es3/glGetObjectPtrLabel">Reference Page</a>
 */
    public void glGetObjectPtrLabel(long ptr, @Nullable IntBuffer length, ByteBuffer label);

/**
 * Retrieves the label of a sync object identified by a pointer.
 *
 * @param ptr     the name of the sync object whose label to retrieve
 * @param bufSize the length of the buffer whose address is in {@code label}
 *
 * @see <a href="https://docs.gl/es3/glGetObjectPtrLabel">Reference Page</a>
 */
    public String glGetObjectPtrLabel(long ptr, int bufSize);

/**
 * Retrieves the label of a sync object identified by a pointer.
 *
 * @param ptr the name of the sync object whose label to retrieve
 *
 * @see <a href="https://docs.gl/es3/glGetObjectPtrLabel">Reference Page</a>
 */
    public String glGetObjectPtrLabel(long ptr);

/**
 * Array version of: {@link #glGetObjectPtrLabel GetObjectPtrLabel}
 *
 * @see <a href="https://docs.gl/es3/glGetObjectPtrLabel">Reference Page</a>
 */
    public void glGetObjectPtrLabel(long ptr, @Nullable int[] length, ByteBuffer label);

}
