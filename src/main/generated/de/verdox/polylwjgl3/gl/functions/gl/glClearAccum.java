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

public interface glClearAccum {

/**
 * Sets the clear values for the accumulation buffer. These values are clamped to the range [-1,1] when they are specified.
 *
 * @param red   the value to which to clear the R values of the accumulation buffer
 * @param green the value to which to clear the G values of the accumulation buffer
 * @param blue  the value to which to clear the B values of the accumulation buffer
 * @param alpha the value to which to clear the A values of the accumulation buffer
 *
 * @see <a href="https://docs.gl/gl3/glClearAccum">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glClearAccum(@NativeType("GLfloat") float red, @NativeType("GLfloat") float green, @NativeType("GLfloat") float blue, @NativeType("GLfloat") float alpha);

}
