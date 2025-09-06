package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl42.GL42Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl42.GL42AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL43;
import org.lwjgl.system.*;

public interface glInvalidateTexImage {

/**
 * Invalidates the entirety of a texture image.
 *
 * @param texture the name of a texture object to invalidate
 * @param level   the level of detail of the texture object to invalidate
 *
 * @see <a href="https://docs.gl/gl4/glInvalidateTexImage">Reference Page</a>
 */
    public void glInvalidateTexImage(int texture, int level);

}
