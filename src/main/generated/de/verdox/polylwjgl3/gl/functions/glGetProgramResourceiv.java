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

public interface glGetProgramResourceiv {

    public void nglGetProgramResourceiv(int program, int programInterface, int index, int propCount, long props, int bufSize, long length, long params);

/**
 * <a href="https://docs.gl/es3/glGetProgramResource">Reference Page</a>
 */
    public void glGetProgramResourceiv(int program, int programInterface, int index, IntBuffer props, @Nullable IntBuffer length, IntBuffer params);

/**
 * Array version of: {@link #glGetProgramResourceiv GetProgramResourceiv}
 *
 * @see <a href="https://docs.gl/es3/glGetProgramResource">Reference Page</a>
 */
    public void glGetProgramResourceiv(int program, int programInterface, int index, int[] props, @Nullable int[] length, int[] params);

}
