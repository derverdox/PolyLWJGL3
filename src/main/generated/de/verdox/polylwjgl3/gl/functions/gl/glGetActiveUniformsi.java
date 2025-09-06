package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl30.GL30Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl30.GL30AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL31;
import org.lwjgl.system.*;

public interface glGetActiveUniformsi {

/**
 * Returns information about several active uniform variables for the specified program object.
 *
 * @param program the program object to be queried
 * @param pname   the property of the each uniform in {@code uniformIndices} that should be written into the corresponding element of {@code params}
 *
 * @see <a href="https://docs.gl/gl4/glGetActiveUniforms">Reference Page</a>
 */
    public int glGetActiveUniformsi(int program, int uniformIndex, int pname);

}
