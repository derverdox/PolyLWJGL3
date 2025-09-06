package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl30.GL30Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl30.GL30AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL31;
import org.lwjgl.system.*;

public interface glPrimitiveRestartIndex {

/**
 * Specifies the primitive restart index.
 *
 * @param index the value to be interpreted as the primitive restart index
 *
 * @see <a href="https://docs.gl/gl4/glPrimitiveRestartIndex">Reference Page</a>
 */
    public void glPrimitiveRestartIndex(int index);

}
