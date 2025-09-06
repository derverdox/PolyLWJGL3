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

public interface glTextureStorage3DMultisample {

/**
 * DSA version of {@link GL43C#glTexStorage3DMultisample TexStorage3DMultisample}.
 *
 * @param texture              the texture name
 * @param samples              the number of samples in the texture
 * @param internalformat       the sized internal format to be used to store texture image data
 * @param width                the width of the texture, in texels
 * @param height               the height of the texture, in texels
 * @param depth                the depth of the texture, in texels
 * @param fixedsamplelocations whether the image will use identical sample locations and the same number of samples for all texels in the image, and the sample locations will not
 *                             depend on the internal format or size of the image
 *
 * @see <a href="https://docs.gl/gl4/glTextureStorage3DMultisample">Reference Page</a>
 */
    public void glTextureStorage3DMultisample(int texture, int samples, int internalformat, int width, int height, int depth, boolean fixedsamplelocations);

}
