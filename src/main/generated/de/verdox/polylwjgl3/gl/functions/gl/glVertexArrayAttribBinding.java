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

public interface glVertexArrayAttribBinding {

/**
 * DSA version of {@link GL43C#glVertexAttribBinding VertexAttribBinding}.
 *
 * @param vaobj        the vertex array object name
 * @param attribindex  the index of the attribute to associate with a vertex buffer binding
 * @param bindingindex the index of the vertex buffer binding with which to associate the generic vertex attribute
 *
 * @see <a href="https://docs.gl/gl4/glVertexArrayAttribBinding">Reference Page</a>
 */
    public void glVertexArrayAttribBinding(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int attribindex, @NativeType("GLuint") int bindingindex);

}
