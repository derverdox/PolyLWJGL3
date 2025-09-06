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

public interface glCreateRenderbuffers {

/**
 * Unsafe version of: {@link #glCreateRenderbuffers CreateRenderbuffers}
 *
 * @param n the number of renderbuffer names to create
 */
    public void nglCreateRenderbuffers(int n, long renderbuffers);

/**
 * Returns {@code n} previously unused renderbuffer names in {@code renderbuffers}, each representing a new renderbuffer object.
 *
 * @param renderbuffers the buffer in which to store the created renderbuffer names
 *
 * @see <a href="https://docs.gl/gl4/glCreateRenderbuffers">Reference Page</a>
 */
    public void glCreateRenderbuffers(@NativeType("GLuint *") IntBuffer renderbuffers);

/**
 * Returns {@code n} previously unused renderbuffer names in {@code renderbuffers}, each representing a new renderbuffer object.
 *
 * @see <a href="https://docs.gl/gl4/glCreateRenderbuffers">Reference Page</a>
 */
@NativeType("void")
    public int glCreateRenderbuffers();

/**
 * Array version of: {@link #glCreateRenderbuffers CreateRenderbuffers}
 *
 * @see <a href="https://docs.gl/gl4/glCreateRenderbuffers">Reference Page</a>
 */
    public void glCreateRenderbuffers(@NativeType("GLuint *") int[] renderbuffers);

}
