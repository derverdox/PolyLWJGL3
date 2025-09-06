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

public interface glGetProgramResourceName {

    public void nglGetProgramResourceName(int program, int programInterface, int index, int bufSize, long length, long name);

/**
 * <a href="https://docs.gl/es3/glGetProgramResourceName">Reference Page</a>
 */
    public void glGetProgramResourceName(int program, int programInterface, int index, @Nullable IntBuffer length, ByteBuffer name);

/**
 * <a href="https://docs.gl/es3/glGetProgramResourceName">Reference Page</a>
 */
    public String glGetProgramResourceName(int program, int programInterface, int index, int bufSize);

/**
 * <a href="https://docs.gl/es3/glGetProgramResourceName">Reference Page</a>
 */
    public String glGetProgramResourceName(int program, int programInterface, int index);

/**
 * Array version of: {@link #glGetProgramResourceName GetProgramResourceName}
 *
 * @see <a href="https://docs.gl/es3/glGetProgramResourceName">Reference Page</a>
 */
    public void glGetProgramResourceName(int program, int programInterface, int index, @Nullable int[] length, ByteBuffer name);

}
