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

public interface glEdgeFlagv {

/**
 * Unsafe version of: {@link #glEdgeFlagv EdgeFlagv}
 */
    public void nglEdgeFlagv(long flag);

/**
 * Pointer version of {@link #glEdgeFlag EdgeFlag}.
 *
 * @param flag the edge flag buffer
 *
 * @see <a href="https://docs.gl/gl3/glEdgeFlagv">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glEdgeFlagv(ByteBuffer flag);

}
