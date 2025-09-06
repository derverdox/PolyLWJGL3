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

public interface glGetnUniformdv {

/**
 * Unsafe version of: {@link #glGetnUniformdv GetnUniformdv}
 *
 * @param bufSize the maximum number of bytes to write to {@code params}
 */
    public void nglGetnUniformdv(int program, int location, int bufSize, long params);

/**
 * Double version of {@link #glGetnUniformfv GetnUniformfv}.
 *
 * @param program  the program object
 * @param location the uniform location
 * @param params   the buffer in which to place the returned data
 *
 * @see <a href="https://docs.gl/gl4/glGetUniform">Reference Page</a>
 */
    public void glGetnUniformdv(int program, int location, DoubleBuffer params);

/**
 * Array version of: {@link #glGetnUniformdv GetnUniformdv}
 *
 * @see <a href="https://docs.gl/gl4/glGetUniform">Reference Page</a>
 */
    public void glGetnUniformdv(int program, int location, double[] params);

}
