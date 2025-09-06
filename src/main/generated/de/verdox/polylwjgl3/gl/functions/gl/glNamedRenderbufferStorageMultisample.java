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

public interface glNamedRenderbufferStorageMultisample {

/**
 * DSA version of {@link GL30C#glRenderbufferStorageMultisample RenderbufferStorageMultisample}.
 *
 * @param samples        the number of samples to be used for the renderbuffer object's storage
 * @param internalformat the internal format to use for the renderbuffer object's image. Must be a color-renderable, depth-renderable, or stencil-renderable format.
 * @param width          the width of the renderbuffer, in pixels
 * @param height         the height of the renderbuffer, in pixels
 *
 * @see <a href="https://docs.gl/gl4/glRenderbufferStorageMultisample">Reference Page</a>
 */
    public void glNamedRenderbufferStorageMultisample(int renderbuffer, int samples, int internalformat, int width, int height);

}
