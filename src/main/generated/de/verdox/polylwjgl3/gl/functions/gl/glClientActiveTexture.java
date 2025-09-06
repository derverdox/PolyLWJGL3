package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl12.GL12Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl12.GL12AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL13;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glClientActiveTexture {

/**
 * Selects the vertex array client state parameters to be modified by the TexCoordPointer command and the array affected by EnableClientState and
 * DisableClientState with parameter TEXTURE_COORD_ARRAY.
 *
 * @param texture which texture coordinate array to make active. One of:<br><table><tr><td>{@link #GL_TEXTURE0 TEXTURE0}</td><td>GL_TEXTURE[1-31]</td></tr></table>
 *
 * @see <a href="https://docs.gl/gl3/glClientActiveTexture">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glClientActiveTexture(@NativeType("GLenum") int texture);

}
