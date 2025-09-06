package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl33.GL33Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl33.GL33AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL40;
import org.lwjgl.system.*;

public interface glUniform4d {

/**
 * Specifies the value of a dvec4 uniform variable for the current program object.
 *
 * @param location the location of the uniform variable to be modified
 * @param x        the uniform x value
 * @param y        the uniform y value
 * @param z        the uniform z value
 * @param w        the uniform w value
 *
 * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
 */
    public void glUniform4d(int location, double x, double y, double z, double w);

}
