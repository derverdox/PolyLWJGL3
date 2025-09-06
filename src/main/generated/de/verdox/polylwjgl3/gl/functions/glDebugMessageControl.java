package de.verdox.polylwjgl3.gl.functions;

import de.verdox.polylwjgl3.gl.accessor.gles31.GLES31Accessor;
import de.verdox.polylwjgl3.gl.accessor.gles31.GLES31AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengles.GLES32;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glDebugMessageControl {

/**
 * Unsafe version of: {@link #glDebugMessageControl DebugMessageControl}
 *
 * @param count the length of the array {@code ids}
 */
    public void nglDebugMessageControl(int source, int type, int severity, int count, long ids, boolean enabled);

/**
 * Controls the volume of debug output in the active debug group, by disabling specific or groups of messages.
 *
 * <p>If {@code enabled} is {@link GLES20#GL_TRUE TRUE}, the referenced subset of messages will be enabled. If {@link GLES20#GL_FALSE FALSE}, then those messages will be disabled.</p>
 *
 * <p>This command can reference different subsets of messages by first considering the set of all messages, and filtering out messages based on the following
 * ways:</p>
 *
 * <ul>
 * <li>If {@code source}, {@code type}, or {@code severity} is {@link GLES20#GL_DONT_CARE DONT_CARE}, the messages from all sources, of all types, or of all severities are
 * referenced respectively.</li>
 * <li>When values other than {@link GLES20#GL_DONT_CARE DONT_CARE} are specified, all messages whose source, type, or severity match the specified {@code source}, {@code type},
 * or {@code severity} respectively will be referenced.</li>
 * <li>If {@code count} is greater than zero, then {@code ids} is an array of {@code count} message IDs for the specified combination of {@code source} and
 * {@code type}. In this case, if {@code source} or {@code type} is {@link GLES20#GL_DONT_CARE DONT_CARE}, or {@code severity} is not {@link GLES20#GL_DONT_CARE DONT_CARE}, the error
 * {@link GLES20#GL_INVALID_OPERATION INVALID_OPERATION} is generated.</li>
 * </ul>
 *
 * <p>Unrecognized message IDs in {@code ids} are ignored. If {@code count} is zero, the value if {@code ids} is ignored.</p>
 *
 * <p>Although messages are grouped into an implicit hierarchy by their sources and types, there is no explicit per-source, per-type or per-severity enabled
 * state. Instead, the enabled state is stored individually for each message. There is no difference between disabling all messages from one source in a
 * single call, and individually disabling all messages from that source using their types and IDs.</p>
 *
 * <p>If the {@link #GL_DEBUG_OUTPUT DEBUG_OUTPUT} state is disabled the GL operates the same as if messages of every {@code source}, {@code type} or {@code severity} are
 * disabled.</p>
 *
 * @param source   the source of debug messages to enable or disable. One of:<br><table><tr><td>{@link #GL_DEBUG_SOURCE_API DEBUG_SOURCE_API}</td><td>{@link #GL_DEBUG_SOURCE_WINDOW_SYSTEM DEBUG_SOURCE_WINDOW_SYSTEM}</td><td>{@link #GL_DEBUG_SOURCE_SHADER_COMPILER DEBUG_SOURCE_SHADER_COMPILER}</td></tr><tr><td>{@link #GL_DEBUG_SOURCE_THIRD_PARTY DEBUG_SOURCE_THIRD_PARTY}</td><td>{@link #GL_DEBUG_SOURCE_APPLICATION DEBUG_SOURCE_APPLICATION}</td><td>{@link #GL_DEBUG_SOURCE_OTHER DEBUG_SOURCE_OTHER}</td></tr></table>
 * @param type     the type of debug messages to enable or disable. One of:<br><table><tr><td>{@link #GL_DEBUG_TYPE_ERROR DEBUG_TYPE_ERROR}</td><td>{@link #GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR DEBUG_TYPE_DEPRECATED_BEHAVIOR}</td><td>{@link #GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR DEBUG_TYPE_UNDEFINED_BEHAVIOR}</td></tr><tr><td>{@link #GL_DEBUG_TYPE_PORTABILITY DEBUG_TYPE_PORTABILITY}</td><td>{@link #GL_DEBUG_TYPE_PERFORMANCE DEBUG_TYPE_PERFORMANCE}</td><td>{@link #GL_DEBUG_TYPE_OTHER DEBUG_TYPE_OTHER}</td></tr><tr><td>{@link #GL_DEBUG_TYPE_MARKER DEBUG_TYPE_MARKER}</td></tr></table>
 * @param severity the severity of debug messages to enable or disable. One of:<br><table><tr><td>{@link #GL_DEBUG_SEVERITY_HIGH DEBUG_SEVERITY_HIGH}</td><td>{@link #GL_DEBUG_SEVERITY_MEDIUM DEBUG_SEVERITY_MEDIUM}</td><td>{@link #GL_DEBUG_SEVERITY_LOW DEBUG_SEVERITY_LOW}</td></tr><tr><td>{@link #GL_DEBUG_SEVERITY_NOTIFICATION DEBUG_SEVERITY_NOTIFICATION}</td></tr></table>
 * @param ids      an array of unsigned integers containing the ids of the messages to enable or disable
 * @param enabled  whether the selected messages should be enabled or disabled
 *
 * @see <a href="https://docs.gl/es3/glDebugMessageControl">Reference Page</a>
 */
    public void glDebugMessageControl(int source, int type, int severity, IntBuffer ids, boolean enabled);

/**
 * Controls the volume of debug output in the active debug group, by disabling specific or groups of messages.
 *
 * <p>If {@code enabled} is {@link GLES20#GL_TRUE TRUE}, the referenced subset of messages will be enabled. If {@link GLES20#GL_FALSE FALSE}, then those messages will be disabled.</p>
 *
 * <p>This command can reference different subsets of messages by first considering the set of all messages, and filtering out messages based on the following
 * ways:</p>
 *
 * <ul>
 * <li>If {@code source}, {@code type}, or {@code severity} is {@link GLES20#GL_DONT_CARE DONT_CARE}, the messages from all sources, of all types, or of all severities are
 * referenced respectively.</li>
 * <li>When values other than {@link GLES20#GL_DONT_CARE DONT_CARE} are specified, all messages whose source, type, or severity match the specified {@code source}, {@code type},
 * or {@code severity} respectively will be referenced.</li>
 * <li>If {@code count} is greater than zero, then {@code ids} is an array of {@code count} message IDs for the specified combination of {@code source} and
 * {@code type}. In this case, if {@code source} or {@code type} is {@link GLES20#GL_DONT_CARE DONT_CARE}, or {@code severity} is not {@link GLES20#GL_DONT_CARE DONT_CARE}, the error
 * {@link GLES20#GL_INVALID_OPERATION INVALID_OPERATION} is generated.</li>
 * </ul>
 *
 * <p>Unrecognized message IDs in {@code ids} are ignored. If {@code count} is zero, the value if {@code ids} is ignored.</p>
 *
 * <p>Although messages are grouped into an implicit hierarchy by their sources and types, there is no explicit per-source, per-type or per-severity enabled
 * state. Instead, the enabled state is stored individually for each message. There is no difference between disabling all messages from one source in a
 * single call, and individually disabling all messages from that source using their types and IDs.</p>
 *
 * <p>If the {@link #GL_DEBUG_OUTPUT DEBUG_OUTPUT} state is disabled the GL operates the same as if messages of every {@code source}, {@code type} or {@code severity} are
 * disabled.</p>
 *
 * @param source   the source of debug messages to enable or disable. One of:<br><table><tr><td>{@link #GL_DEBUG_SOURCE_API DEBUG_SOURCE_API}</td><td>{@link #GL_DEBUG_SOURCE_WINDOW_SYSTEM DEBUG_SOURCE_WINDOW_SYSTEM}</td><td>{@link #GL_DEBUG_SOURCE_SHADER_COMPILER DEBUG_SOURCE_SHADER_COMPILER}</td></tr><tr><td>{@link #GL_DEBUG_SOURCE_THIRD_PARTY DEBUG_SOURCE_THIRD_PARTY}</td><td>{@link #GL_DEBUG_SOURCE_APPLICATION DEBUG_SOURCE_APPLICATION}</td><td>{@link #GL_DEBUG_SOURCE_OTHER DEBUG_SOURCE_OTHER}</td></tr></table>
 * @param type     the type of debug messages to enable or disable. One of:<br><table><tr><td>{@link #GL_DEBUG_TYPE_ERROR DEBUG_TYPE_ERROR}</td><td>{@link #GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR DEBUG_TYPE_DEPRECATED_BEHAVIOR}</td><td>{@link #GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR DEBUG_TYPE_UNDEFINED_BEHAVIOR}</td></tr><tr><td>{@link #GL_DEBUG_TYPE_PORTABILITY DEBUG_TYPE_PORTABILITY}</td><td>{@link #GL_DEBUG_TYPE_PERFORMANCE DEBUG_TYPE_PERFORMANCE}</td><td>{@link #GL_DEBUG_TYPE_OTHER DEBUG_TYPE_OTHER}</td></tr><tr><td>{@link #GL_DEBUG_TYPE_MARKER DEBUG_TYPE_MARKER}</td></tr></table>
 * @param severity the severity of debug messages to enable or disable. One of:<br><table><tr><td>{@link #GL_DEBUG_SEVERITY_HIGH DEBUG_SEVERITY_HIGH}</td><td>{@link #GL_DEBUG_SEVERITY_MEDIUM DEBUG_SEVERITY_MEDIUM}</td><td>{@link #GL_DEBUG_SEVERITY_LOW DEBUG_SEVERITY_LOW}</td></tr><tr><td>{@link #GL_DEBUG_SEVERITY_NOTIFICATION DEBUG_SEVERITY_NOTIFICATION}</td></tr></table>
 * @param enabled  whether the selected messages should be enabled or disabled
 *
 * @see <a href="https://docs.gl/es3/glDebugMessageControl">Reference Page</a>
 */
    public void glDebugMessageControl(int source, int type, int severity, int id, boolean enabled);

/**
 * Array version of: {@link #glDebugMessageControl DebugMessageControl}
 *
 * @see <a href="https://docs.gl/es3/glDebugMessageControl">Reference Page</a>
 */
    public void glDebugMessageControl(int source, int type, int severity, int[] ids, boolean enabled);

}
