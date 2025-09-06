package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl12.GL12Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl12.GL12AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL13;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glMultTransposeMatrixd {

/**
 * Unsafe version of: {@link #glMultTransposeMatrixd MultTransposeMatrixd}
 */
    public void nglMultTransposeMatrixd(long m);

/**
 * Double version of {@link #glMultTransposeMatrixf MultTransposeMatrixf}.
 *
 * @param m the matrix data
 *
 * @see <a href="https://docs.gl/gl3/glMultTransposeMatrixd">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glMultTransposeMatrixd(DoubleBuffer m);

/**
 * Array version of: {@link #glMultTransposeMatrixd MultTransposeMatrixd}
 *
 * @see <a href="https://docs.gl/gl3/glMultTransposeMatrixd">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glMultTransposeMatrixd(double[] m);

}
