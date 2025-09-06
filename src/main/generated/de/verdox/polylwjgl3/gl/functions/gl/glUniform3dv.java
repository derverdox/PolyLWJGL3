package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl33.GL33Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl33.GL33AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL40;
import org.lwjgl.system.*;

public interface glUniform3dv {

/**
 * Unsafe version of: {@link #glUniform3dv Uniform3dv}
 *
 * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
 */
    public void nglUniform3dv(int location, int count, long value);

/**
 * Specifies the value of a single dvec3 uniform variable or a dvec3 uniform variable array for the current program object.
 *
 * @param location the location of the uniform variable to be modified
 * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
 *
 * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
 */
    public void glUniform3dv(@NativeType("GLint") int location, @NativeType("GLdouble const *") DoubleBuffer value);

/**
 * Array version of: {@link #glUniform3dv Uniform3dv}
 *
 * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
 */
    public void glUniform3dv(@NativeType("GLint") int location, @NativeType("GLdouble const *") double[] value);

}
