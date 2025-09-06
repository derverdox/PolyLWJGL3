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

public interface glNamedFramebufferTexture {

/**
 * DSA version of {@link GL32C#glFramebufferTexture FramebufferTexture}.
 *
 * @param framebuffer the framebuffer name
 * @param attachment  the attachment point of the framebuffer
 * @param texture     the texture object to attach to the framebuffer attachment point named by {@code attachment}
 * @param level       the mipmap level of {@code texture} to attach
 *
 * @see <a href="https://docs.gl/gl4/glFramebufferTexture">Reference Page</a>
 */
    public void glNamedFramebufferTexture(int framebuffer, int attachment, int texture, int level);

}
