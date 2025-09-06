package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl33.GL33Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl33.GL33AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL40;
import org.lwjgl.system.*;

public interface glGetQueryIndexediv {

/**
 * Unsafe version of: {@link #glGetQueryIndexediv GetQueryIndexediv}
 */
    public void nglGetQueryIndexediv(int target, int index, int pname, long params);

/**
 * Returns parameters of an indexed query object target.
 *
 * @param target a query object target. One of:<br><table><tr><td>{@link GL15#GL_SAMPLES_PASSED SAMPLES_PASSED}</td><td>{@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}</td><td>{@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}</td></tr><tr><td>{@link GL33#GL_TIMESTAMP TIMESTAMP}</td><td>{@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}</td><td>{@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}</td></tr></table>
 * @param index  the index of the query object target
 * @param pname  the symbolic name of a query object target parameter
 * @param params the requested data
 *
 * @see <a href="https://docs.gl/gl4/glGetQueryIndexed">Reference Page</a>
 */
    public void glGetQueryIndexediv(int target, int index, int pname, IntBuffer params);

/**
 * Array version of: {@link #glGetQueryIndexediv GetQueryIndexediv}
 *
 * @see <a href="https://docs.gl/gl4/glGetQueryIndexed">Reference Page</a>
 */
    public void glGetQueryIndexediv(int target, int index, int pname, int[] params);

}
