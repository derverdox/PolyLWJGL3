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

public interface glProgramUniform2fv {

    public void nglProgramUniform2fv(int program, int location, int count, long value);

/**
 * <a href="https://docs.gl/es3/glProgramUniform">Reference Page</a>
 */
    public void glProgramUniform2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value);

/**
 * Array version of: {@link #glProgramUniform2fv ProgramUniform2fv}
 *
 * @see <a href="https://docs.gl/es3/glProgramUniform">Reference Page</a>
 */
    public void glProgramUniform2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value);

}
