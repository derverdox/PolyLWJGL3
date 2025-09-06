package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl40.GL40Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl40.GL40AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL41;
import org.lwjgl.system.*;

public interface glDepthRangeIndexed {

/**
 * Specifies mapping of depth values from normalized device coordinates to window coordinates for a specified viewport.
 *
 * @param index the index of the viewport whose depth range to update
 * @param zNear the mapping of the near clipping plane to window coordinates. The initial value is 0.
 * @param zFar  the mapping of the far clipping plane to window coordinates. The initial value is 1.
 *
 * @see <a href="https://docs.gl/gl4/glDepthRangeIndexed">Reference Page</a>
 */
    public void glDepthRangeIndexed(int index, double zNear, double zFar);

}
