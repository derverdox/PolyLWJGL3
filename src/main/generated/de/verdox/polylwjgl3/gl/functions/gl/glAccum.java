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

public interface glAccum {

/**
 * Each portion of a pixel in the accumulation buffer consists of four values: one for each of R, G, B, and A. The accumulation buffer is controlled
 * exclusively through the use of this method (except for clearing it).
 *
 * @param op    a symbolic constant indicating an accumulation buffer operation
 * @param value a floating-point value to be used in that operation. One of:<br><table><tr><td>{@link #GL_ACCUM ACCUM}</td><td>{@link #GL_LOAD LOAD}</td><td>{@link #GL_RETURN RETURN}</td><td>{@link #GL_MULT MULT}</td><td>{@link #GL_ADD ADD}</td></tr></table>
 *
 * @see <a href="https://docs.gl/gl3/glAccum">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glAccum(@NativeType("GLenum") int op, @NativeType("GLfloat") float value);

}
