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

public interface glClearDepth {

/**
 * Sets the depth value used when clearing the depth buffer. When clearing a fixedpoint depth buffer, {@code depth} is clamped to the range [0,1] and
 * converted to fixed-point. No conversion is applied when clearing a floating-point depth buffer.
 *
 * @param depth the value to which to clear the depth buffer
 *
 * @see <a href="https://docs.gl/gl4/glClearDepth">Reference Page</a>
 */
    public void glClearDepth(double depth);

}
