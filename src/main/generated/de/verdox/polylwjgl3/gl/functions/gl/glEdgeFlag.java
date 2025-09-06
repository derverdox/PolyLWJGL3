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

public interface glEdgeFlag {

/**
 * Each edge of each polygon primitive generated is flagged as either boundary or non-boundary. These classifications are used during polygon
 * rasterization; some modes affect the interpretation of polygon boundary edges. By default, all edges are boundary edges, but the flagging of polygons,
 * separate triangles, or separate quadrilaterals may be altered by calling this function.
 *
 * <p>When a primitive of type {@link #GL_POLYGON POLYGON}, {@link #GL_TRIANGLES TRIANGLES}, or {@link #GL_QUADS QUADS} is drawn, each vertex transferred begins an edge. If the edge
 * flag bit is TRUE, then each specified vertex begins an edge that is flagged as boundary. If the bit is FALSE, then induced edges are flagged as
 * non-boundary.</p>
 *
 * @param flag the edge flag bit
 *
 * @see <a href="https://docs.gl/gl3/glEdgeFlag">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glEdgeFlag(boolean flag);

}
