package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl32.GL32Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl32.GL32AccessorImpl;
import java.nio.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL33;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glGetFragDataIndex {

/**
 * Unsafe version of: {@link #glGetFragDataIndex GetFragDataIndex}
 */
    public int nglGetFragDataIndex(int program, long name);

/**
 * Queries the bindings of color indices to user-defined varying out variables.
 *
 * @param program the name of the program containing varying out variable whose binding to query
 * @param name    the name of the user-defined varying out variable whose index to query
 *
 * @see <a href="https://docs.gl/gl4/glGetFragDataIndex">Reference Page</a>
 */
@NativeType("GLint")
    public int glGetFragDataIndex(@NativeType("GLuint") int program, @NativeType("GLchar const *") ByteBuffer name);

/**
 * Queries the bindings of color indices to user-defined varying out variables.
 *
 * @param program the name of the program containing varying out variable whose binding to query
 * @param name    the name of the user-defined varying out variable whose index to query
 *
 * @see <a href="https://docs.gl/gl4/glGetFragDataIndex">Reference Page</a>
 */
@NativeType("GLint")
    public int glGetFragDataIndex(@NativeType("GLuint") int program, @NativeType("GLchar const *") CharSequence name);

}
