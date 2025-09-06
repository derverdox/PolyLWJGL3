package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl13.GL13Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl13.GL13AccessorImpl;
import java.nio.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL14;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glFogCoordfv {

/**
 * Unsafe version of: {@link #glFogCoordfv FogCoordfv}
 */
    public void nglFogCoordfv(long coord);

/**
 * Pointer version of {@link #glFogCoordf FogCoordf}.
 *
 * @param coord the fog coordinate value
 *
 * @see <a href="https://docs.gl/gl3/glFogCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glFogCoordfv(FloatBuffer coord);

/**
 * Array version of: {@link #glFogCoordfv FogCoordfv}
 *
 * @see <a href="https://docs.gl/gl3/glFogCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glFogCoordfv(float[] coord);

}
