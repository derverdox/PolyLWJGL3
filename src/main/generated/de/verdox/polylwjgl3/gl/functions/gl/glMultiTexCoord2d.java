package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl12.GL12Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl12.GL12AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL13;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glMultiTexCoord2d {

/**
 * Double version of {@link #glMultiTexCoord2f MultiTexCoord2f}.
 *
 * @param texture the coordinate set to be modified
 * @param s       the s component of the current texture coordinates
 * @param t       the t component of the current texture coordinates
 *
 * @see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glMultiTexCoord2d(int texture, double s, double t);

}
