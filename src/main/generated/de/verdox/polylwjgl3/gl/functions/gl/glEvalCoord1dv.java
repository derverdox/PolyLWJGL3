package de.verdox.polylwjgl3.gl.functions.gl;

import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glEvalCoord1dv {

/**
 * Unsafe version of: {@link #glEvalCoord1dv EvalCoord1dv}
 */
    public void nglEvalCoord1dv(long u);

/**
 * Pointer version of {@link #glEvalCoord1d EvalCoord1d}.
 *
 * @param u the domain coordinate buffer
 *
 * @see <a href="https://docs.gl/gl3/glEvalCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glEvalCoord1dv(@NativeType("GLdouble const *") DoubleBuffer u);

/**
 * Array version of: {@link #glEvalCoord1dv EvalCoord1dv}
 *
 * @see <a href="https://docs.gl/gl3/glEvalCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glEvalCoord1dv(@NativeType("GLdouble const *") double[] u);

}
