package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl33.GL33Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl33.GL33AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL40;
import org.lwjgl.system.*;

public interface glPatchParameterfv {

/**
 * Unsafe version of: {@link #glPatchParameterfv PatchParameterfv}
 */
    public void nglPatchParameterfv(int pname, long values);

/**
 * Specifies an array of float values for the specified parameter for patch primitives.
 *
 * @param pname  the name of the parameter to set. One of:<br><table><tr><td>{@link GL40C#GL_PATCH_DEFAULT_OUTER_LEVEL PATCH_DEFAULT_OUTER_LEVEL}</td><td>{@link GL40C#GL_PATCH_DEFAULT_INNER_LEVEL PATCH_DEFAULT_INNER_LEVEL}</td></tr></table>
 * @param values an array containing the new values for the parameter given by {@code pname}
 *
 * @see <a href="https://docs.gl/gl4/glPatchParameter">Reference Page</a>
 */
    public void glPatchParameterfv(int pname, FloatBuffer values);

/**
 * Array version of: {@link #glPatchParameterfv PatchParameterfv}
 *
 * @see <a href="https://docs.gl/gl4/glPatchParameter">Reference Page</a>
 */
    public void glPatchParameterfv(int pname, float[] values);

}
