package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl40.GL40Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl40.GL40AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL41;
import org.lwjgl.system.*;

public interface glScissorIndexed {

/**
 * Defines the scissor box for a specific viewport.
 *
 * @param index  the index of the viewport whose scissor box to modify
 * @param left   the left scissor box coordinate
 * @param bottom the bottom scissor box coordinate
 * @param width  the scissor box width
 * @param height the scissor box height
 *
 * @see <a href="https://docs.gl/gl4/glScissorIndexed">Reference Page</a>
 */
    public void glScissorIndexed(int index, int left, int bottom, int width, int height);

}
