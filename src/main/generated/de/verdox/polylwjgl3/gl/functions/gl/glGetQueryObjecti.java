package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl14.GL14Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl14.GL14AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL15;
import org.lwjgl.system.*;

public interface glGetQueryObjecti {

/**
 * Returns the integer value of a query object parameter.
 *
 * @param id    the name of a query object
 * @param pname the symbolic name of a query object parameter. One of:<br><table><tr><td>{@link GL15C#GL_QUERY_RESULT QUERY_RESULT}</td><td>{@link GL15C#GL_QUERY_RESULT_AVAILABLE QUERY_RESULT_AVAILABLE}</td></tr></table>
 *
 * @see <a href="https://docs.gl/gl4/glGetQueryObject">Reference Page</a>
 */
    public int glGetQueryObjecti(int id, int pname);

}
