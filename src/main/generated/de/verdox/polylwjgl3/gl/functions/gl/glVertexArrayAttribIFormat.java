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

public interface glVertexArrayAttribIFormat {

/**
 * DSA version of {@link GL43C#glVertexAttribIFormat VertexAttribIFormat}.
 *
 * @param vaobj          the vertex array object name
 * @param attribindex    the generic vertex attribute array being described
 * @param size           the number of values per vertex that are stored in the array. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
 * @param type           the type of the data stored in the array
 * @param relativeoffset the offset, measured in basic machine units of the first element relative to the start of the vertex buffer binding this attribute fetches from
 *
 * @see <a href="https://docs.gl/gl4/glVertexArrayAttribIFormat">Reference Page</a>
 */
    public void glVertexArrayAttribIFormat(int vaobj, int attribindex, int size, int type, int relativeoffset);

}
