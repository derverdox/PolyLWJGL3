package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl41.GL41Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl41.GL41AccessorImpl;
import java.nio.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL42;
import org.lwjgl.system.*;

public interface glGetActiveAtomicCounterBufferi {

/**
 * Obtains information about the set of active atomic counter buffers for a program.
 *
 * @param program     the name of a program object for which the command {@link GL20C#glLinkProgram LinkProgram} has been issued in the past
 * @param bufferIndex the index of an active atomic counter buffer
 * @param pname       the parameter to query. One of:<br><table><tr><td>{@link GL42C#GL_ATOMIC_COUNTER_BUFFER_DATA_SIZE ATOMIC_COUNTER_BUFFER_DATA_SIZE}</td></tr><tr><td>{@link GL42C#GL_ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTERS ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTERS}</td></tr><tr><td>{@link GL42C#GL_ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTER_INDICES ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTER_INDICES}</td></tr><tr><td>{@link GL42C#GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_VERTEX_SHADER ATOMIC_COUNTER_BUFFER_REFERENCED_BY_VERTEX_SHADER}</td></tr><tr><td>{@link GL42C#GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_CONTROL_SHADER ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL42C#GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_EVALUATION_SHADER ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_EVALUATION_SHADER}</td></tr><tr><td>{@link GL42C#GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_GEOMETRY_SHADER ATOMIC_COUNTER_BUFFER_REFERENCED_BY_GEOMETRY_SHADER}</td></tr><tr><td>{@link GL42C#GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_FRAGMENT_SHADER ATOMIC_COUNTER_BUFFER_REFERENCED_BY_FRAGMENT_SHADER}</td></tr></table>
 *
 * @see <a href="https://docs.gl/gl4/glGetActiveAtomicCounterBuffer">Reference Page</a>
 */
@NativeType("void")
    public int glGetActiveAtomicCounterBufferi(@NativeType("GLuint") int program, @NativeType("GLuint") int bufferIndex, @NativeType("GLenum") int pname);

}
