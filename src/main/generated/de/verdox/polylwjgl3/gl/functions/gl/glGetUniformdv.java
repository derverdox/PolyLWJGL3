package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl33.GL33Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl33.GL33AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL40;
import org.lwjgl.system.*;

public interface glGetUniformdv {

/**
 * Unsafe version of: {@link #glGetUniformdv GetUniformdv}
 */
    public void nglGetUniformdv(int program, int location, long params);

/**
 * Returns the double value(s) of a uniform variable.
 *
 * @param program  the program object to be queried
 * @param location the location of the uniform variable to be queried
 * @param params   the value of the specified uniform variable
 *
 * @see <a href="https://docs.gl/gl4/glGetUniform">Reference Page</a>
 */
    public void glGetUniformdv(int program, int location, DoubleBuffer params);

/**
 * Array version of: {@link #glGetUniformdv GetUniformdv}
 *
 * @see <a href="https://docs.gl/gl4/glGetUniform">Reference Page</a>
 */
    public void glGetUniformdv(int program, int location, double[] params);

}
