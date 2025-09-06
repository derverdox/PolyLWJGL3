package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl40.GL40Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl40.GL40AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL41;
import org.lwjgl.system.*;

public interface glProgramUniformMatrix4x2dv {

/**
 * Unsafe version of: {@link #glProgramUniformMatrix4x2dv ProgramUniformMatrix4x2dv}
 *
 * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
 */
    public void nglProgramUniformMatrix4x2dv(int program, int location, int count, boolean transpose, long value);

/**
 * Specifies the value of a single dmat4x2 uniform variable or a dmat4x2 uniform variable array for the current program object.
 *
 * @param program   the handle of the program containing the uniform variable to be modified
 * @param location  the location of the uniform variable to be modified
 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
 * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
 *
 * @see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>
 */
    public void glProgramUniformMatrix4x2dv(int program, int location, boolean transpose, DoubleBuffer value);

/**
 * Array version of: {@link #glProgramUniformMatrix4x2dv ProgramUniformMatrix4x2dv}
 *
 * @see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>
 */
    public void glProgramUniformMatrix4x2dv(int program, int location, boolean transpose, double[] value);

}
