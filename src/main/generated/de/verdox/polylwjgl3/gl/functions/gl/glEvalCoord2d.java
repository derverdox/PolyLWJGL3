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

public interface glEvalCoord2d {

/**
 * Double version of {@link #glEvalCoord2f EvalCoord2f}.
 *
 * @param u the domain coordinate u
 * @param v the domain coordinate v
 *
 * @see <a href="https://docs.gl/gl3/glEvalCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glEvalCoord2d(@NativeType("GLdouble") double u, @NativeType("GLdouble") double v);

}
