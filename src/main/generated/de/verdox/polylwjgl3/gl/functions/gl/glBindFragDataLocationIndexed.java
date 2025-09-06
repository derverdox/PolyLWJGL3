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

public interface glBindFragDataLocationIndexed {

/**
 * Unsafe version of: {@link #glBindFragDataLocationIndexed BindFragDataLocationIndexed}
 */
    public void nglBindFragDataLocationIndexed(int program, int colorNumber, int index, long name);

/**
 * Binds a user-defined varying out variable to a fragment shader color number and index.
 *
 * @param program     the name of the program containing varying out variable whose binding to modify
 * @param colorNumber the color number to bind the user-defined varying out variable to
 * @param index       the index of the color input to bind the user-defined varying out variable to
 * @param name        the name of the user-defined varying out variable whose binding to modify
 *
 * @see <a href="https://docs.gl/gl4/glBindFragDataLocationIndexed">Reference Page</a>
 */
    public void glBindFragDataLocationIndexed(@NativeType("GLuint") int program, @NativeType("GLuint") int colorNumber, @NativeType("GLuint") int index, @NativeType("GLchar const *") ByteBuffer name);

/**
 * Binds a user-defined varying out variable to a fragment shader color number and index.
 *
 * @param program     the name of the program containing varying out variable whose binding to modify
 * @param colorNumber the color number to bind the user-defined varying out variable to
 * @param index       the index of the color input to bind the user-defined varying out variable to
 * @param name        the name of the user-defined varying out variable whose binding to modify
 *
 * @see <a href="https://docs.gl/gl4/glBindFragDataLocationIndexed">Reference Page</a>
 */
    public void glBindFragDataLocationIndexed(@NativeType("GLuint") int program, @NativeType("GLuint") int colorNumber, @NativeType("GLuint") int index, @NativeType("GLchar const *") CharSequence name);

}
