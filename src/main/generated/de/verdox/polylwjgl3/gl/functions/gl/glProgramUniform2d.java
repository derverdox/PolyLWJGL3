package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl40.GL40Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl40.GL40AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL41;
import org.lwjgl.system.*;

public interface glProgramUniform2d {

/**
 * Specifies the value of a dvec2 uniform variable for a specified program object.
 *
 * @param program  the handle of the program containing the uniform variable to be modified
 * @param location the location of the uniform variable to be modified
 * @param x        the uniform x value
 * @param y        the uniform y value
 *
 * @see <a href="https://docs.gl/gl4/glProgramUniform">Reference Page</a>
 */
    public void glProgramUniform2d(int program, int location, double x, double y);

}
