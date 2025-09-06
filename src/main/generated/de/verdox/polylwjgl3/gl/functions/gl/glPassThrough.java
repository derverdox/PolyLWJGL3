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

public interface glPassThrough {

/**
 * Inserts a marker when the GL is in feeback mode. {@code token} is returned as if it were a primitive; it is indicated with its own unique identifying
 * value. The ordering of any {@code PassThrough} commands with respect to primitive specification is maintained by feedback. {@code PassThrough} may
 * not occur between {@link #glBegin Begin} and {@link #glEnd End}.
 *
 * @param token the marker value to insert
 *
 * @see <a href="https://docs.gl/gl3/glPassThrough">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glPassThrough(@NativeType("GLfloat") float token);

}
