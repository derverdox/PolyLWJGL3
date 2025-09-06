package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl15.GL15Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl15.GL15AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL20;
import org.lwjgl.system.*;

public interface glVertexAttrib1sv {

/**
 * Unsafe version of: {@link #glVertexAttrib1sv VertexAttrib1sv}
 */
    public void nglVertexAttrib1sv(int index, long v);

/**
 * Pointer version of {@link #glVertexAttrib1s VertexAttrib1s}.
 *
 * @param index the index of the generic vertex attribute to be modified
 * @param v     the vertex attribute buffer
 *
 * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
 */
    public void glVertexAttrib1sv(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v);

/**
 * Array version of: {@link #glVertexAttrib1sv VertexAttrib1sv}
 *
 * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
 */
    public void glVertexAttrib1sv(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v);

}
