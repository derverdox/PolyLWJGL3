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

public interface glGetTextureLevelParameterfv {

/**
 * Unsafe version of: {@link #glGetTextureLevelParameterfv GetTextureLevelParameterfv}
 */
    public void nglGetTextureLevelParameterfv(int texture, int level, int pname, long params);

/**
 * DSA version of {@link GL11C#glGetTexLevelParameterfv GetTexLevelParameterfv}.
 *
 * @param texture the texture name
 * @param level   the level-of-detail number
 * @param pname   the parameter to query
 * @param params  a scalar or buffer in which to place the returned data
 *
 * @see <a href="https://docs.gl/gl4/glGetTextureLevelParameter">Reference Page</a>
 */
    public void glGetTextureLevelParameterfv(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params);

/**
 * Array version of: {@link #glGetTextureLevelParameterfv GetTextureLevelParameterfv}
 *
 * @see <a href="https://docs.gl/gl4/glGetTextureLevelParameter">Reference Page</a>
 */
    public void glGetTextureLevelParameterfv(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params);

}
