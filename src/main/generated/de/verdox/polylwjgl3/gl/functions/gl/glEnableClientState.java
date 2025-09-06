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

public interface glEnableClientState {

/**
 * Enables a client-side capability.
 *
 * <p>If the {@link NVVertexBufferUnifiedMemory} extension is supported, this function is available even in a core profile context.</p>
 *
 * @param cap the capability to enable. One of:<br><table><tr><td>{@link #GL_COLOR_ARRAY COLOR_ARRAY}</td><td>{@link #GL_EDGE_FLAG_ARRAY EDGE_FLAG_ARRAY}</td><td>{@link GL15#GL_FOG_COORD_ARRAY FOG_COORD_ARRAY}</td><td>{@link #GL_INDEX_ARRAY INDEX_ARRAY}</td></tr><tr><td>{@link #GL_NORMAL_ARRAY NORMAL_ARRAY}</td><td>{@link GL14#GL_SECONDARY_COLOR_ARRAY SECONDARY_COLOR_ARRAY}</td><td>{@link #GL_TEXTURE_COORD_ARRAY TEXTURE_COORD_ARRAY}</td><td>{@link #GL_VERTEX_ARRAY VERTEX_ARRAY}</td></tr><tr><td>{@link NVVertexBufferUnifiedMemory#GL_VERTEX_ATTRIB_ARRAY_UNIFIED_NV VERTEX_ATTRIB_ARRAY_UNIFIED_NV}</td><td>{@link NVVertexBufferUnifiedMemory#GL_ELEMENT_ARRAY_UNIFIED_NV ELEMENT_ARRAY_UNIFIED_NV}</td></tr></table>
 *
 * @see <a href="https://docs.gl/gl3/glEnableClientState">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glEnableClientState(@NativeType("GLenum") int cap);

}
