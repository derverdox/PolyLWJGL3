package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl31.GL31Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl31.GL31AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL32;
import org.lwjgl.system.*;

public interface glProvokingVertex {

/**
 * Specifies the vertex to be used as the source of data for flat shaded varyings.
 *
 * @param mode the provoking vertex mode. One of:<br><table><tr><td>{@link GL32C#GL_FIRST_VERTEX_CONVENTION FIRST_VERTEX_CONVENTION}</td><td>{@link GL32C#GL_LAST_VERTEX_CONVENTION LAST_VERTEX_CONVENTION}</td></tr></table>
 *
 * @see <a href="https://docs.gl/gl4/glProvokingVertex">Reference Page</a>
 */
    public void glProvokingVertex(@NativeType("GLenum") int mode);

}
