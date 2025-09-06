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

public interface glGetProgramInterfaceiv {

    public void nglGetProgramInterfaceiv(int program, int programInterface, int pname, long params);

/**
 * <a href="https://docs.gl/es3/glGetProgramInterface">Reference Page</a>
 */
    public void glGetProgramInterfaceiv(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params);

/**
 * Array version of: {@link #glGetProgramInterfaceiv GetProgramInterfaceiv}
 *
 * @see <a href="https://docs.gl/es3/glGetProgramInterface">Reference Page</a>
 */
    public void glGetProgramInterfaceiv(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params);

}
