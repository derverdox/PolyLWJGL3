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

public interface glGetTextureLevelParameterf {

/**
 * DSA version of {@link GL11C#glGetTexLevelParameterfv GetTexLevelParameterfv}.
 *
 * @param texture the texture name
 * @param level   the level-of-detail number
 * @param pname   the parameter to query
 *
 * @see <a href="https://docs.gl/gl4/glGetTextureLevelParameter">Reference Page</a>
 */
@NativeType("void")
    public float glGetTextureLevelParameterf(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int pname);

}
