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

public interface glProgramUniform1fv {

    public void nglProgramUniform1fv(int program, int location, int count, long value);

/**
 * <a href="https://docs.gl/es3/glProgramUniform">Reference Page</a>
 */
    public void glProgramUniform1fv(int program, int location, FloatBuffer value);

/**
 * Array version of: {@link #glProgramUniform1fv ProgramUniform1fv}
 *
 * @see <a href="https://docs.gl/es3/glProgramUniform">Reference Page</a>
 */
    public void glProgramUniform1fv(int program, int location, float[] value);

}
