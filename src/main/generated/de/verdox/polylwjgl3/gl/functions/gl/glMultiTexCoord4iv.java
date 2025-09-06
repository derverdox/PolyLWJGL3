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

public interface glMultiTexCoord4iv {

/**
 * Unsafe version of: {@link #glMultiTexCoord4iv MultiTexCoord4iv}
 */
    public void nglMultiTexCoord4iv(int texture, long v);

/**
 * Pointer version of {@link #glMultiTexCoord4i MultiTexCoord4i}.
 *
 * @param texture the coordinate set to be modified
 * @param v       the texture coordinate buffer
 *
 * @see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glMultiTexCoord4iv(@NativeType("GLenum") int texture, @NativeType("GLint const *") IntBuffer v);

/**
 * Array version of: {@link #glMultiTexCoord4iv MultiTexCoord4iv}
 *
 * @see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glMultiTexCoord4iv(@NativeType("GLenum") int texture, @NativeType("GLint const *") int[] v);

}
