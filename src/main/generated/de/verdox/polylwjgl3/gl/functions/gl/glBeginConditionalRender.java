package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl21.GL21Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl21.GL21AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL30;
import org.lwjgl.system.*;

public interface glBeginConditionalRender {

/**
 * Starts conditional rendering.
 *
 * @param id   the name of an occlusion query object whose results are used to determine if the rendering commands are discarded
 * @param mode how {@code glBeginConditionalRender} interprets the results of the occlusion query. One of:<br><table><tr><td>{@link GL30C#GL_QUERY_WAIT QUERY_WAIT}</td><td>{@link GL30C#GL_QUERY_NO_WAIT QUERY_NO_WAIT}</td><td>{@link GL30C#GL_QUERY_BY_REGION_WAIT QUERY_BY_REGION_WAIT}</td></tr><tr><td>{@link GL30C#GL_QUERY_BY_REGION_NO_WAIT QUERY_BY_REGION_NO_WAIT}</td><td>{@link GL45#GL_QUERY_WAIT_INVERTED QUERY_WAIT_INVERTED}</td><td>{@link GL45#GL_QUERY_NO_WAIT_INVERTED QUERY_NO_WAIT_INVERTED}</td></tr><tr><td>{@link GL45#GL_QUERY_BY_REGION_WAIT_INVERTED QUERY_BY_REGION_WAIT_INVERTED}</td><td>{@link GL45#GL_QUERY_BY_REGION_NO_WAIT_INVERTED QUERY_BY_REGION_NO_WAIT_INVERTED}</td></tr></table>
 *
 * @see <a href="https://docs.gl/gl4/glBeginConditionalRender">Reference Page</a>
 */
    public void glBeginConditionalRender(@NativeType("GLuint") int id, @NativeType("GLenum") int mode);

}
