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

public interface glIndexMask {

/**
 * The least significant n bits of mask, where n is the number of bits in a color index buffer, specify a mask. Where a 1 appears in this mask, the
 * corresponding bit in the color index buffer (or buffers) is written; where a 0 appears, the bit is not written. This mask applies only in color index
 * mode.
 *
 * @param mask the color index mask value
 *
 * @see <a href="https://docs.gl/gl3/glIndexMask">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glIndexMask(@NativeType("GLuint") int mask);

}
