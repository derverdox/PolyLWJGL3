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

public interface glPushClientAttrib {

/**
 * Takes a bitwise OR of symbolic constants indicating which groups of state variables to push onto the client attribute stack. Each constant refers to a
 * group of state variables.
 *
 * <p>Bits set in mask that do not correspond to an attribute group are ignored. The special mask value {@link #GL_CLIENT_ALL_ATTRIB_BITS CLIENT_ALL_ATTRIB_BITS} may be used to push
 * all stackable client state.</p>
 *
 * <p>A {@link #GL_STACK_OVERFLOW STACK_OVERFLOW} error is generated if {@code PushAttrib} is called and the client attribute stack depth is equal to the value of
 * {@link #GL_MAX_CLIENT_ATTRIB_STACK_DEPTH MAX_CLIENT_ATTRIB_STACK_DEPTH}.</p>
 *
 * @param mask the state variables to push. One or more of:<br><table><tr><td>{@link #GL_CLIENT_VERTEX_ARRAY_BIT CLIENT_VERTEX_ARRAY_BIT}</td><td>{@link #GL_CLIENT_PIXEL_STORE_BIT CLIENT_PIXEL_STORE_BIT}</td><td>{@link #GL_CLIENT_ALL_ATTRIB_BITS CLIENT_ALL_ATTRIB_BITS}</td></tr></table>
 *
 * @see <a href="https://docs.gl/gl3/glPushClientAttrib">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glPushClientAttrib(int mask);

}
