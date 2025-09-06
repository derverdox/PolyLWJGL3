package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl42.GL42Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl42.GL42AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL43;
import org.lwjgl.system.*;

public interface glInvalidateTexSubImage {

/**
 * Invalidates a region of a texture image.
 *
 * @param texture the name of a texture object a subregion of which to invalidate
 * @param level   the level of detail of the texture object within which the region resides
 * @param xoffset the X offset of the region to be invalidated
 * @param yoffset the Y offset of the region to be invalidated
 * @param zoffset the Z offset of the region to be invalidated
 * @param width   the width of the region to be invalidated
 * @param height  the height of the region to be invalidated
 * @param depth   the depth of the region to be invalidated
 *
 * @see <a href="https://docs.gl/gl4/glInvalidateTexSubImage">Reference Page</a>
 */
    public void glInvalidateTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth);

}
