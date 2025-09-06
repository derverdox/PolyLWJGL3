package de.verdox.polylwjgl3.gl.functions.gl;

import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glVertex4s {

/**
 * Short version of {@link #glVertex4f Vertex4f}.
 *
 * @param x the vertex x coordinate
 * @param y the vertex y coordinate
 * @param z the vertex z coordinate
 * @param w the vertex w coordinate
 *
 * @see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glVertex4s(short x, short y, short z, short w);

}
