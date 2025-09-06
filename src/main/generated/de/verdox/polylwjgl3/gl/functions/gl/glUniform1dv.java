package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl33.GL33Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl33.GL33AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL40;
import org.lwjgl.system.*;

public interface glUniform1dv {

/**
 * Unsafe version of: {@link #glUniform1dv Uniform1dv}
 *
 * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
 */
    public void nglUniform1dv(int location, int count, long value);

/**
 * Specifies the value of a single double uniform variable or a double uniform variable array for the current program object.
 *
 * @param location the location of the uniform variable to be modified
 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
 *
 * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
 */
    public void glUniform1dv(int location, DoubleBuffer value);

/**
 * Array version of: {@link #glUniform1dv Uniform1dv}
 *
 * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
 */
    public void glUniform1dv(int location, double[] value);

}
