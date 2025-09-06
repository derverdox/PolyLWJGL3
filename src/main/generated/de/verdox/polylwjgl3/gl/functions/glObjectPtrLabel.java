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

public interface glObjectPtrLabel {

/**
 * Unsafe version of: {@link #glObjectPtrLabel ObjectPtrLabel}
 *
 * @param length the length of the label to be used for the object
 */
    public void nglObjectPtrLabel(long ptr, int length, long label);

/**
 * Labels a sync object identified by a pointer.
 *
 * @param ptr   a pointer identifying a sync object
 * @param label a string containing the label to assign to the object
 *
 * @see <a href="https://docs.gl/es3/glObjectPtrLabel">Reference Page</a>
 */
    public void glObjectPtrLabel(long ptr, ByteBuffer label);

/**
 * Labels a sync object identified by a pointer.
 *
 * @param ptr   a pointer identifying a sync object
 * @param label a string containing the label to assign to the object
 *
 * @see <a href="https://docs.gl/es3/glObjectPtrLabel">Reference Page</a>
 */
    public void glObjectPtrLabel(long ptr, CharSequence label);

}
