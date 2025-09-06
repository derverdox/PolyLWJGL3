package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl33.GL33Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl33.GL33AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL40;
import org.lwjgl.system.*;

public interface glUniformMatrix4x3dv {

/**
 * Unsafe version of: {@link #glUniformMatrix4x3dv UniformMatrix4x3dv}
 *
 * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
 */
    public void nglUniformMatrix4x3dv(int location, int count, boolean transpose, long value);

/**
 * Specifies the value of a single dmat4x3 uniform variable or a dmat4x3 uniform variable array for the current program object.
 *
 * @param location  the location of the uniform variable to be modified
 * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
 * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
 *
 * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
 */
    public void glUniformMatrix4x3dv(int location, boolean transpose, DoubleBuffer value);

/**
 * Array version of: {@link #glUniformMatrix4x3dv UniformMatrix4x3dv}
 *
 * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
 */
    public void glUniformMatrix4x3dv(int location, boolean transpose, double[] value);

}
