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

public interface glGetDebugMessageLog {

/**
 * Unsafe version of: {@link #glGetDebugMessageLog GetDebugMessageLog}
 *
 * @param bufsize the size of the buffer whose address is given by {@code messageLog}
 */
    public int nglGetDebugMessageLog(int count, int bufsize, long sources, long types, long ids, long severities, long lengths, long messageLog);

/**
 * Retrieves messages from the debug message log.
 *
 * <p>This function fetches a maximum of {@code count} messages from the message log, and will return the number of messages successfully fetched.</p>
 *
 * <p>Messages will be fetched from the log in order of oldest to newest. Those messages that were fetched will be removed from the log.</p>
 *
 * <p>The sources, types, severities, IDs, and string lengths of fetched messages will be stored in the application-provided arrays {@code sources},
 * {@code types}, {@code severities}, {@code ids}, and {@code lengths}, respectively. The application is responsible for allocating enough space for each
 * array to hold up to {@code count} elements. The string representations of all fetched messages are stored in the {@code messageLog} array. If multiple
 * messages are fetched, their strings are concatenated into the same {@code messageLog} array and will be separated by single null terminators. The last
 * string in the array will also be null-terminated. The maximum size of {@code messageLog}, including the space used by all null terminators, is given by
 * {@code bufSize}. If {@code bufSize} is less than zero and {@code messageLog} is not {@code NULL}, an {@link GLES20#GL_INVALID_VALUE INVALID_VALUE} error will be generated. If a message's
 * string, including its null terminator, can not fully fit within the {@code messageLog} array's remaining space, then that message and any subsequent
 * messages will not be fetched and will remain in the log. The string lengths stored in the array {@code lengths} include the space for the null terminator of each string.</p>
 *
 * <p>Any or all of the arrays {@code sources}, {@code types}, {@code ids}, {@code severities}, {@code lengths} and {@code messageLog} can also be null
 * pointers, which causes the attributes for such arrays to be discarded when messages are fetched, however those messages will still be removed from the
 * log. Thus to simply delete up to {@code count} messages from the message log while ignoring their attributes, the application can call the function with
 * null pointers for all attribute arrays.</p>
 *
 * <p>If the context was created without the {@link #GL_CONTEXT_FLAG_DEBUG_BIT CONTEXT_FLAG_DEBUG_BIT}, then the GL can opt to never add messages to the message log so GetDebugMessageLog will
 * always return zero.</p>
 *
 * @param count      the number of debug messages to retrieve from the log
 * @param sources    an array of variables to receive the sources of the retrieved messages
 * @param types      an array of variables to receive the types of the retrieved messages
 * @param ids        an array of unsigned integers to receive the ids of the retrieved messages
 * @param severities an array of variables to receive the severites of the retrieved messages
 * @param lengths    an array of variables to receive the lengths of the received messages
 * @param messageLog an array of characters that will receive the messages
 *
 * @see <a href="https://docs.gl/es3/glGetDebugMessageLog">Reference Page</a>
 */
    public int glGetDebugMessageLog(int count, @Nullable IntBuffer sources, @Nullable IntBuffer types, @Nullable IntBuffer ids, @Nullable IntBuffer severities, @Nullable IntBuffer lengths, @Nullable ByteBuffer messageLog);

/**
 * Array version of: {@link #glGetDebugMessageLog GetDebugMessageLog}
 *
 * @see <a href="https://docs.gl/es3/glGetDebugMessageLog">Reference Page</a>
 */
    public int glGetDebugMessageLog(int count, @Nullable int[] sources, @Nullable int[] types, @Nullable int[] ids, @Nullable int[] severities, @Nullable int[] lengths, @Nullable ByteBuffer messageLog);

}
