package de.verdox.polylwjgl3.gl.functions.gl;

import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glTexCoord2s {

/**
 * Short version of {@link #glTexCoord2f TexCoord2f}.
 *
 * @param s the s component of the current texture coordinates
 * @param t the t component of the current texture coordinates
 *
 * @see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glTexCoord2s(@NativeType("GLshort") short s, @NativeType("GLshort") short t);

}
