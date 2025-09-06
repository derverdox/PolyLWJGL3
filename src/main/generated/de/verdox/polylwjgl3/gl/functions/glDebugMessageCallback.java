package de.verdox.polylwjgl3.gl.functions;

import de.verdox.polylwjgl3.gl.accessor.gles31.GLES31Accessor;
import de.verdox.polylwjgl3.gl.accessor.gles31.GLES31AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GLDebugMessageCallbackI;
import org.lwjgl.opengles.GLES32;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glDebugMessageCallback {

/**
 * Unsafe version of: {@link #glDebugMessageCallback DebugMessageCallback}
 */
    public void nglDebugMessageCallback(long callback, long userParam);

/**
 * Specifies a callback to receive debugging messages from the GL.
 *
 * <p>The function's prototype must follow the type definition of DEBUGPROC including its platform-dependent calling convention. Anything else will result in
 * undefined behavior. Only one debug callback can be specified for the current context, and further calls overwrite the previous callback. Specifying
 * {@code NULL} as the value of {@code callback} clears the current callback and disables message output through callbacks. Applications can provide
 * user-specified data through the pointer {@code userParam}. The context will store this pointer and will include it as one of the parameters in each call
 * to the callback function.</p>
 *
 * <p>If the application has specified a callback function for receiving debug output, the implementation will call that function whenever any enabled message
 * is generated.  The source, type, ID, and severity of the message are specified by the DEBUGPROC parameters {@code source}, {@code type}, {@code id}, and
 * {@code severity}, respectively. The string representation of the message is stored in {@code message} and its length (excluding the null-terminator) is
 * stored in {@code length}. The parameter {@code userParam} is the user-specified parameter that was given when calling DebugMessageCallback.</p>
 *
 * <p>Applications can query the current callback function and the current user-specified parameter by obtaining the values of {@link #GL_DEBUG_CALLBACK_FUNCTION DEBUG_CALLBACK_FUNCTION}
 * and {@link #GL_DEBUG_CALLBACK_USER_PARAM DEBUG_CALLBACK_USER_PARAM}, respectively.</p>
 *
 * <p>Applications that specify a callback function must be aware of certain special conditions when executing code inside a callback when it is called by the
 * GL, regardless of the debug source.</p>
 *
 * <p>The memory for {@code message} is owned and managed by the GL, and should only be considered valid for the duration of the function call.</p>
 *
 * <p>The behavior of calling any GL or window system function from within the callback function is undefined and may lead to program termination.</p>
 *
 * <p>Care must also be taken in securing debug callbacks for use with asynchronous debug output by multi-threaded GL implementations.</p>
 *
 * <p>If the {@link #GL_DEBUG_OUTPUT DEBUG_OUTPUT} state is disabled then the GL will not call the callback function.</p>
 *
 * @param callback  a callback function that will be called when a debug message is generated
 * @param userParam a user supplied pointer that will be passed on each invocation of {@code callback}
 *
 * @see <a href="https://docs.gl/es3/glDebugMessageCallback">Reference Page</a>
 */
    public void glDebugMessageCallback(@Nullable GLDebugMessageCallbackI callback, long userParam);

}
