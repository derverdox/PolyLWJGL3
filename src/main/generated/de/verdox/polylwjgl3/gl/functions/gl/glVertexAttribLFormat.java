package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl42.GL42Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl42.GL42AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL43;
import org.lwjgl.system.*;

public interface glVertexAttribLFormat {

/**
 * Specifies the organization of 64-bit double data in vertex arrays.
 *
 * @param attribindex    the generic vertex attribute array being described
 * @param size           the number of values per vertex that are stored in the array. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
 * @param type           the type of the data stored in the array
 * @param relativeoffset the offset, measured in basic machine units of the first element relative to the start of the vertex buffer binding this attribute fetches from
 *
 * @see <a href="https://docs.gl/gl4/glVertexAttribLFormat">Reference Page</a>
 */
    public void glVertexAttribLFormat(int attribindex, int size, int type, int relativeoffset);

}
