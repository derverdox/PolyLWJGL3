package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl40.GL40Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl40.GL40AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL41;
import org.lwjgl.system.*;

public interface glViewportIndexedfv {

/**
 * Unsafe version of: {@link #glViewportIndexedfv ViewportIndexedfv}
 */
    public void nglViewportIndexedfv(int index, long v);

/**
 * Pointer version of {@link #glViewportIndexedf ViewportIndexedf}.
 *
 * @param index the viewport to set
 * @param v     the viewport parameters
 *
 * @see <a href="https://docs.gl/gl4/glViewportIndexed">Reference Page</a>
 */
    public void glViewportIndexedfv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer v);

/**
 * Array version of: {@link #glViewportIndexedfv ViewportIndexedfv}
 *
 * @see <a href="https://docs.gl/gl4/glViewportIndexed">Reference Page</a>
 */
    public void glViewportIndexedfv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] v);

}
