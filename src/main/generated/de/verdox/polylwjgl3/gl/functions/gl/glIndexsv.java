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

public interface glIndexsv {

/**
 * Unsafe version of: {@link #glIndexsv Indexsv}
 */
    public void nglIndexsv(long index);

/**
 * Pointer version of {@link #glIndexs Indexs}.
 *
 * @param index the value to which the current color index should be set
 *
 * @see <a href="https://docs.gl/gl3/glIndex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glIndexsv(@NativeType("GLshort const *") ShortBuffer index);

/**
 * Array version of: {@link #glIndexsv Indexsv}
 *
 * @see <a href="https://docs.gl/gl3/glIndex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glIndexsv(@NativeType("GLshort const *") short[] index);

}
