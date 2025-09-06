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

public interface glColor4usv {

/**
 * Unsafe version of: {@link #glColor4usv Color4usv}
 */
    public void nglColor4usv(long v);

/**
 * Pointer version of {@link #glColor4us Color4us}.
 *
 * @param v the color buffer
 *
 * @see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glColor4usv(@NativeType("GLushort const *") ShortBuffer v);

/**
 * Array version of: {@link #glColor4usv Color4usv}
 *
 * @see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glColor4usv(@NativeType("GLushort const *") short[] v);

}
