package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl31.GL31Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl31.GL31AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL32;
import org.lwjgl.system.*;

public interface glTexImage2DMultisample {

/**
 * Establishes the data storage, format, dimensions, and number of samples of a 2D multisample texture's image.
 *
 * @param target               the target of the operation. One of:<br><table><tr><td>{@link GL32C#GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE}</td><td>{@link GL32C#GL_PROXY_TEXTURE_2D_MULTISAMPLE PROXY_TEXTURE_2D_MULTISAMPLE}</td></tr></table>
 * @param samples              the number of samples in the multisample texture's image
 * @param internalformat       the internal format to be used to store the multisample texture's image. {@code internalformat} must specify a color-renderable, depth-renderable,
 *                             or stencil-renderable format.
 * @param width                the width of the multisample texture's image, in texels
 * @param height               the height of the multisample texture's image, in texels
 * @param fixedsamplelocations whether the image will use identical sample locations and the same number of samples for all texels in the image, and the sample locations will not
 *                             depend on the internal format or size of the image
 *
 * @see <a href="https://docs.gl/gl4/glTexImage2DMultisample">Reference Page</a>
 */
    public void glTexImage2DMultisample(int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations);

}
