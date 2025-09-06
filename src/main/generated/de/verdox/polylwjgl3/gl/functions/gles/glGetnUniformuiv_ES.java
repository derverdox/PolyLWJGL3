package de.verdox.polylwjgl3.gl.functions.gles;

import de.verdox.polylwjgl3.gl.accessor.gles31.GLES31Accessor;
import de.verdox.polylwjgl3.gl.accessor.gles31.GLES31AccessorImpl;
import de.verdox.polylwjgl3.gl.functions.glGetnUniformuiv;
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

public interface glGetnUniformuiv_ES extends glGetnUniformuiv {

/**
 * Unsigned version of {@link #glGetnUniformiv GetnUniformiv}.
 *
 * @param program  the program object
 * @param location the uniform location
 * @param params   the buffer in which to place the returned data
 *
 * @see <a href="https://docs.gl/es3/glGetUniform">Reference Page</a>
 */
    public void glGetnUniformuiv(int program, int location, FloatBuffer params);

/**
 * Array version of: {@link #glGetnUniformuiv GetnUniformuiv}
 *
 * @see <a href="https://docs.gl/es3/glGetUniform">Reference Page</a>
 */
    public void glGetnUniformuiv(int program, int location, float[] params);

}
