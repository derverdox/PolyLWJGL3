package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl40.GL40Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl40.GL40AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL41;
import org.lwjgl.system.*;

public interface glGetFloati {

/**
 * Queries the float value of an indexed state variable.
 *
 * @param target the indexed state to query
 * @param index  the index of the element being queried
 *
 * @see <a href="https://docs.gl/gl4/glGetFloati_v">Reference Page</a>
 */
@NativeType("void")
    public float glGetFloati(@NativeType("GLenum") int target, @NativeType("GLuint") int index);

}
