package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl40.GL40Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl40.GL40AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL41;
import org.lwjgl.system.*;

public interface glViewportIndexedf {

/**
 * Sets a specified viewport.
 *
 * @param index the viewport to set
 * @param x     the left viewport coordinate
 * @param y     the bottom viewport coordinate
 * @param w     the viewport width
 * @param h     the viewport height
 *
 * @see <a href="https://docs.gl/gl4/glViewportIndexedf">Reference Page</a>
 */
    public void glViewportIndexedf(@NativeType("GLuint") int index, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float w, @NativeType("GLfloat") float h);

}
