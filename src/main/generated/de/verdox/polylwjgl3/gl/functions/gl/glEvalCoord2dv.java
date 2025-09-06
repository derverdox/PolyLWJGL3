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

public interface glEvalCoord2dv {

/**
 * Unsafe version of: {@link #glEvalCoord2dv EvalCoord2dv}
 */
    public void nglEvalCoord2dv(long u);

/**
 * Pointer version of {@link #glEvalCoord2d EvalCoord2d}.
 *
 * @param u the domain coordinate buffer
 *
 * @see <a href="https://docs.gl/gl3/glEvalCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glEvalCoord2dv(@NativeType("GLdouble const *") DoubleBuffer u);

/**
 * Array version of: {@link #glEvalCoord2dv EvalCoord2dv}
 *
 * @see <a href="https://docs.gl/gl3/glEvalCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glEvalCoord2dv(@NativeType("GLdouble const *") double[] u);

}
