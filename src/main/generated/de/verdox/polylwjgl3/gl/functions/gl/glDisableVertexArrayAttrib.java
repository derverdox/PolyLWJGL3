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

public interface glDisableVertexArrayAttrib {

/**
 * DSA version of {@link GL20C#glDisableVertexAttribArray DisableVertexAttribArray}.
 *
 * @param vaobj the vertex array object name
 * @param index the index of the generic vertex attribute to be disabled
 *
 * @see <a href="https://docs.gl/gl4/glDisableVertexArrayAttrib">Reference Page</a>
 */
    public void glDisableVertexArrayAttrib(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index);

}
