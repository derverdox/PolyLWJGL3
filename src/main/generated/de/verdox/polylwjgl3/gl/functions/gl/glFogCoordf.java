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

public interface glFogCoordf {

/**
 * Sets the current fog coordinate.
 *
 * @param coord the fog coordinate value
 *
 * @see <a href="https://docs.gl/gl3/glFogCoordf">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glFogCoordf(float coord);

}
