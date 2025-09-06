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

public interface glProgramUniform4iv {

    public void nglProgramUniform4iv(int program, int location, int count, long value);

/**
 * <a href="https://docs.gl/es3/glProgramUniform">Reference Page</a>
 */
    public void glProgramUniform4iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value);

/**
 * Array version of: {@link #glProgramUniform4iv ProgramUniform4iv}
 *
 * @see <a href="https://docs.gl/es3/glProgramUniform">Reference Page</a>
 */
    public void glProgramUniform4iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") int[] value);

}
