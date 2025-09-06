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

public interface glLoadTransposeMatrixd {

/**
 * Unsafe version of: {@link #glLoadTransposeMatrixd LoadTransposeMatrixd}
 */
    public void nglLoadTransposeMatrixd(long m);

/**
 * Double version of {@link #glLoadTransposeMatrixf LoadTransposeMatrixf}.
 *
 * @param m the matrix data
 *
 * @see <a href="https://docs.gl/gl3/glLoadTransposeMatrixd">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glLoadTransposeMatrixd(DoubleBuffer m);

/**
 * Array version of: {@link #glLoadTransposeMatrixd LoadTransposeMatrixd}
 *
 * @see <a href="https://docs.gl/gl3/glLoadTransposeMatrixd">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glLoadTransposeMatrixd(double[] m);

}
