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

public interface glPushAttrib {

/**
 * Takes a bitwise OR of symbolic constants indicating which groups of state variables to push onto the server attribute stack. Each constant refers to a
 * group of state variables.
 *
 * <p>Bits set in mask that do not correspond to an attribute group are ignored. The special mask value {@link #GL_ALL_ATTRIB_BITS ALL_ATTRIB_BITS} may be used to push all
 * stackable server state.</p>
 *
 * <p>A {@link #GL_STACK_OVERFLOW STACK_OVERFLOW} error is generated if {@code PushAttrib} is called and the attribute stack depth is equal to the value of
 * {@link #GL_MAX_ATTRIB_STACK_DEPTH MAX_ATTRIB_STACK_DEPTH}.</p>
 *
 * @param mask the state variables to push. One or more of:<br><table><tr><td>{@link #GL_ACCUM_BUFFER_BIT ACCUM_BUFFER_BIT}</td><td>{@link #GL_COLOR_BUFFER_BIT COLOR_BUFFER_BIT}</td><td>{@link #GL_CURRENT_BIT CURRENT_BIT}</td><td>{@link #GL_DEPTH_BUFFER_BIT DEPTH_BUFFER_BIT}</td><td>{@link #GL_ENABLE_BIT ENABLE_BIT}</td><td>{@link #GL_EVAL_BIT EVAL_BIT}</td></tr><tr><td>{@link #GL_FOG_BIT FOG_BIT}</td><td>{@link #GL_HINT_BIT HINT_BIT}</td><td>{@link #GL_LIGHTING_BIT LIGHTING_BIT}</td><td>{@link #GL_LINE_BIT LINE_BIT}</td><td>{@link #GL_LIST_BIT LIST_BIT}</td><td>{@link GL13#GL_MULTISAMPLE_BIT MULTISAMPLE_BIT}</td></tr><tr><td>{@link #GL_PIXEL_MODE_BIT PIXEL_MODE_BIT}</td><td>{@link #GL_POINT_BIT POINT_BIT}</td><td>{@link #GL_POLYGON_BIT POLYGON_BIT}</td><td>{@link #GL_POLYGON_STIPPLE_BIT POLYGON_STIPPLE_BIT}</td><td>{@link #GL_SCISSOR_BIT SCISSOR_BIT}</td><td>{@link #GL_STENCIL_BUFFER_BIT STENCIL_BUFFER_BIT}</td></tr><tr><td>{@link #GL_TEXTURE_BIT TEXTURE_BIT}</td><td>{@link #GL_TRANSFORM_BIT TRANSFORM_BIT}</td><td>{@link #GL_VIEWPORT_BIT VIEWPORT_BIT}</td><td>{@link #GL_ALL_ATTRIB_BITS ALL_ATTRIB_BITS}</td></tr></table>
 *
 * @see <a href="https://docs.gl/gl3/glPushAttrib">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glPushAttrib(@NativeType("GLbitfield") int mask);

}
