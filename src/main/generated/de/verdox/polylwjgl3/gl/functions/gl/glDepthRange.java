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

public interface glDepthRange {

/**
 * Sets the depth range for all viewports to the same values.
 *
 * @param zNear the near depth range
 * @param zFar  the far depth range
 *
 * @see <a href="https://docs.gl/gl4/glDepthRange">Reference Page</a>
 */
    public void glDepthRange(@NativeType("GLdouble") double zNear, @NativeType("GLdouble") double zFar);

}
