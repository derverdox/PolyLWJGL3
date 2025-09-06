package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl44.GL44Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl44.GL44AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL45;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glCopyTextureSubImage1D {

/**
 * DSA version of {@link GL11C#glCopyTexSubImage1D CopyTexSubImage1D}.
 *
 * @param texture the texture name
 * @param level   the level-of-detail number
 * @param xoffset the left texel coordinate of the texture subregion to update
 * @param x       the left framebuffer pixel coordinate
 * @param y       the lower framebuffer pixel coordinate
 * @param width   the texture subregion width
 *
 * @see <a href="https://docs.gl/gl4/glCopyTextureSubImage1D">Reference Page</a>
 */
    public void glCopyTextureSubImage1D(int texture, int level, int xoffset, int x, int y, int width);

}
