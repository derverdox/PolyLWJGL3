package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl40.GL40Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl40.GL40AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL41;
import org.lwjgl.system.*;

public interface glProgramUniform2dv {

/**
 * Unsafe version of: {@link #glProgramUniform2dv ProgramUniform2dv}
 *
 * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
 */
    public void nglProgramUniform2dv(int program, int location, int count, long value);

/**
 * Specifies the value of a single dvec2 uniform variable or a dvec2 uniform variable array for a specified program object.
 *
 * @param program  the handle of the program containing the uniform variable to be modified
 * @param location the location of the uniform variable to be modified
 * @param value    an array of {@code count} values that will be used to update the specified uniform variable
 *
 * @see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>
 */
    public void glProgramUniform2dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble const *") DoubleBuffer value);

/**
 * Array version of: {@link #glProgramUniform2dv ProgramUniform2dv}
 *
 * @see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>
 */
    public void glProgramUniform2dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble const *") double[] value);

}
