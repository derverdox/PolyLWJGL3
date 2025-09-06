package de.verdox.polylwjgl3.gl.functions;

import de.verdox.polylwjgl3.gl.accessor.gles30.GLES30Accessor;
import de.verdox.polylwjgl3.gl.accessor.gles30.GLES30AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengles.GLES31;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glDrawArraysIndirect {

    public void nglDrawArraysIndirect(int mode, long indirect);

/**
 * <a href="https://docs.gl/es3/glDrawArraysIndirect">Reference Page</a>
 */
    public void glDrawArraysIndirect(int mode, ByteBuffer indirect);

/**
 * <a href="https://docs.gl/es3/glDrawArraysIndirect">Reference Page</a>
 */
    public void glDrawArraysIndirect(int mode, long indirect);

/**
 * <a href="https://docs.gl/es3/glDrawArraysIndirect">Reference Page</a>
 */
    public void glDrawArraysIndirect(int mode, IntBuffer indirect);

/**
 * Array version of: {@link #glDrawArraysIndirect DrawArraysIndirect}
 *
 * @see <a href="https://docs.gl/es3/glDrawArraysIndirect">Reference Page</a>
 */
    public void glDrawArraysIndirect(int mode, int[] indirect);

}
