package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl21.GL21Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl21.GL21AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL30;
import org.lwjgl.system.*;

public interface glBindFragDataLocation {

/**
 * Unsafe version of: {@link #glBindFragDataLocation BindFragDataLocation}
 */
    public void nglBindFragDataLocation(int program, int colorNumber, long name);

/**
 * Binds a user-defined varying out variable to a fragment shader color number.
 *
 * @param program     the name of the program containing varying out variable whose binding to modify
 * @param colorNumber the color number to bind the user-defined varying out variable to
 * @param name        the name of the user-defined varying out variable whose binding to modify
 *
 * @see <a href="https://docs.gl/gl4/glBindFragDataLocation">Reference Page</a>
 */
    public void glBindFragDataLocation(@NativeType("GLuint") int program, @NativeType("GLuint") int colorNumber, @NativeType("GLchar const *") ByteBuffer name);

/**
 * Binds a user-defined varying out variable to a fragment shader color number.
 *
 * @param program     the name of the program containing varying out variable whose binding to modify
 * @param colorNumber the color number to bind the user-defined varying out variable to
 * @param name        the name of the user-defined varying out variable whose binding to modify
 *
 * @see <a href="https://docs.gl/gl4/glBindFragDataLocation">Reference Page</a>
 */
    public void glBindFragDataLocation(@NativeType("GLuint") int program, @NativeType("GLuint") int colorNumber, @NativeType("GLchar const *") CharSequence name);

}
