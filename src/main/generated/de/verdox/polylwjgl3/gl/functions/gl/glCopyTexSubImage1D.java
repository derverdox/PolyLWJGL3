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

public interface glCopyTexSubImage1D {

/**
 * Respecifies a rectangular subregion of an existing texel array. No change is made to the {@code internalformat}, {@code width} or {@code border}
 * parameters of the specified texel array, nor is any change made to texel values outside the specified subregion. See {@link #glCopyTexImage1D CopyTexImage1D} for more
 * details.
 *
 * @param target  the texture target. Must be:<br><table><tr><td>{@link GL11C#GL_TEXTURE_1D TEXTURE_1D}</td></tr></table>
 * @param level   the level-of-detail number
 * @param xoffset the left texel coordinate of the texture subregion to update
 * @param x       the left framebuffer pixel coordinate
 * @param y       the lower framebuffer pixel coordinate
 * @param width   the texture subregion width
 *
 * @see <a href="https://docs.gl/gl4/glCopyTexSubImage1D">Reference Page</a>
 */
    public void glCopyTexSubImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width);

}
