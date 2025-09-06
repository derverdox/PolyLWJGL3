package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl15.GL15Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl15.GL15AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL20;
import org.lwjgl.system.*;

public interface glVertexAttrib2sv {

/**
 * Unsafe version of: {@link #glVertexAttrib2sv VertexAttrib2sv}
 */
    public void nglVertexAttrib2sv(int index, long v);

/**
 * Pointer version of {@link #glVertexAttrib2s VertexAttrib2s}.
 *
 * @param index the index of the generic vertex attribute to be modified
 * @param v     the vertex attribute buffer
 *
 * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
 */
    public void glVertexAttrib2sv(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v);

/**
 * Array version of: {@link #glVertexAttrib2sv VertexAttrib2sv}
 *
 * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
 */
    public void glVertexAttrib2sv(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v);

}
