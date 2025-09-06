package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl40.GL40Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl40.GL40AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL41;
import org.lwjgl.system.*;

public interface glViewportArrayv {

/**
 * Unsafe version of: {@link #glViewportArrayv ViewportArrayv}
 *
 * @param count the number of viewports to set
 */
    public void nglViewportArrayv(int first, int count, long v);

/**
 * Sets multiple viewports.
 *
 * @param first the first viewport to set
 * @param v     an array containing the viewport parameters
 *
 * @see <a href="https://docs.gl/gl4/glViewportArrayv">Reference Page</a>
 */
    public void glViewportArrayv(int first, FloatBuffer v);

/**
 * Array version of: {@link #glViewportArrayv ViewportArrayv}
 *
 * @see <a href="https://docs.gl/gl4/glViewportArrayv">Reference Page</a>
 */
    public void glViewportArrayv(int first, float[] v);

}
