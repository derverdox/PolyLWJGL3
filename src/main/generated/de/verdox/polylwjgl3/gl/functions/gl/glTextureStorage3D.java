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

public interface glTextureStorage3D {

/**
 * DSA version of {@link GL42C#glTexStorage3D TexStorage3D}.
 *
 * @param texture        the texture name
 * @param levels         the number of texture levels
 * @param internalformat the sized internal format to be used to store texture image data
 * @param width          the width of the texture, in texels
 * @param height         the height of the texture, in texels
 * @param depth          the depth of the texture, in texels
 *
 * @see <a href="https://docs.gl/gl4/glTextureStorage3D">Reference Page</a>
 */
    public void glTextureStorage3D(int texture, int levels, int internalformat, int width, int height, int depth);

}
