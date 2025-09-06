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

public interface glMultiTexCoord4fv {

/**
 * Unsafe version of: {@link #glMultiTexCoord4fv MultiTexCoord4fv}
 */
    public void nglMultiTexCoord4fv(int texture, long v);

/**
 * Pointer version of {@link #glMultiTexCoord4f MultiTexCoord4f}.
 *
 * @param texture the coordinate set to be modified
 * @param v       the texture coordinate buffer
 *
 * @see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glMultiTexCoord4fv(@NativeType("GLenum") int texture, @NativeType("GLfloat const *") FloatBuffer v);

/**
 * Array version of: {@link #glMultiTexCoord4fv MultiTexCoord4fv}
 *
 * @see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glMultiTexCoord4fv(@NativeType("GLenum") int texture, @NativeType("GLfloat const *") float[] v);

}
