package de.verdox.polylwjgl3.gl.accessor.gl15;

import de.verdox.polylwjgl3.gl.accessor.gl14.GL14Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl14.GL14AccessorImpl;
import de.verdox.polylwjgl3.gl.functions.gl.glBufferData_CORE;
import de.verdox.polylwjgl3.gl.functions.gl.glBufferSubData_CORE;
import de.verdox.polylwjgl3.gl.functions.gl.glGetBufferSubData;
import de.verdox.polylwjgl3.gl.functions.gl.glGetQueryObjecti;
import de.verdox.polylwjgl3.gl.functions.gl.glGetQueryObjectiv;
import de.verdox.polylwjgl3.gl.functions.gl.glMapBuffer;
import de.verdox.polylwjgl3.gl.functions.glBeginQuery;
import de.verdox.polylwjgl3.gl.functions.glBindBuffer;
import de.verdox.polylwjgl3.gl.functions.glBufferData;
import de.verdox.polylwjgl3.gl.functions.glBufferSubData;
import de.verdox.polylwjgl3.gl.functions.glDeleteBuffers;
import de.verdox.polylwjgl3.gl.functions.glDeleteQueries;
import de.verdox.polylwjgl3.gl.functions.glEndQuery;
import de.verdox.polylwjgl3.gl.functions.glGenBuffers;
import de.verdox.polylwjgl3.gl.functions.glGenQueries;
import de.verdox.polylwjgl3.gl.functions.glGetBufferParameteri;
import de.verdox.polylwjgl3.gl.functions.glGetBufferParameteriv;
import de.verdox.polylwjgl3.gl.functions.glGetBufferPointer;
import de.verdox.polylwjgl3.gl.functions.glGetBufferPointerv;
import de.verdox.polylwjgl3.gl.functions.glGetQueryObjectui;
import de.verdox.polylwjgl3.gl.functions.glGetQueryObjectuiv;
import de.verdox.polylwjgl3.gl.functions.glGetQueryi;
import de.verdox.polylwjgl3.gl.functions.glGetQueryiv;
import de.verdox.polylwjgl3.gl.functions.glIsBuffer;
import de.verdox.polylwjgl3.gl.functions.glIsQuery;
import de.verdox.polylwjgl3.gl.functions.glUnmapBuffer;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL15;
import org.lwjgl.system.*;

/**
 * OpenGL 1.5 Accessor — Vertex Buffer Objects (VBOs) and Occlusion Queries.
 *
 * <p>Extends {@link GL14Accessor} with the introduction of buffer objects for storing
 * vertex/index data on the GPU, and query objects for measuring rendering results
 * (such as samples passed for occlusion culling).</p>
 *
 * <h2>Buffer Objects (VBOs)</h2>
 * <ul>
 *   <li>{@code glGenBuffers}, {@code glDeleteBuffers}, {@code glIsBuffer} —
 *       Create, delete, and test buffer object names.</li>
 *   <li>{@code glBindBuffer} — Bind a buffer to a target such as {@code GL_ARRAY_BUFFER}
 *       or {@code GL_ELEMENT_ARRAY_BUFFER}.</li>
 *   <li>{@code glBufferData} / {@code glBufferData_CORE} —
 *       Allocate and initialize buffer storage (full data upload or null for allocation only).
 *       The “_CORE” variant denotes desktop-only signatures.</li>
 *   <li>{@code glBufferSubData} / {@code glBufferSubData_CORE} —
 *       Update a sub-region of an existing buffer’s data store.</li>
 *   <li>{@code glGetBufferSubData} — Read back a sub-region of buffer contents to client memory.</li>
 *   <li>{@code glMapBuffer}, {@code glUnmapBuffer} —
 *       Map a buffer’s data store into the client address space for direct CPU access, then unmap.</li>
 *   <li>{@code glGetBufferParameteriv} / {@code glGetBufferParameteri} —
 *       Query integer-valued buffer object parameters (size, usage, access flags, etc.).</li>
 *   <li>{@code glGetBufferPointerv} / {@code glGetBufferPointer} —
 *       Query a pointer to a mapped buffer object’s data store.</li>
 * </ul>
 *
 * <h2>Query Objects (Occlusion Queries)</h2>
 * <ul>
 *   <li>{@code glGenQueries}, {@code glDeleteQueries}, {@code glIsQuery} —
 *       Create, delete, and test query object names.</li>
 *   <li>{@code glBeginQuery}, {@code glEndQuery} —
 *       Delimit a section of rendering commands whose result will be recorded in the active query.</li>
 *   <li>{@code glGetQueryiv}, {@code glGetQueryi} —
 *       Retrieve state about query objects (target, current query, availability).</li>
 *   <li>{@code glGetQueryObjectiv}, {@code glGetQueryObjecti} —
 *       Retrieve integer results from a completed query (e.g., number of samples passed).</li>
 *   <li>{@code glGetQueryObjectuiv}, {@code glGetQueryObjectui} —
 *       Retrieve unsigned integer results from a completed query.</li>
 * </ul>
 *
 * <h3>Notes</h3>
 * <ul>
 *   <li>Buffer objects decouple vertex data from client memory, allowing efficient reuse
 *       and reduced CPU-GPU bandwidth overhead.</li>
 *   <li>Mapping buffers should be done with care; unmapping is required before issuing
 *       draw commands that use the buffer.</li>
 *   <li>Occlusion queries are typically used for conditional rendering or visibility determination.</li>
 *   <li>“_CORE” interfaces appear only in desktop OpenGL; GLES versions may lack those overloads.</li>
 * </ul>
 */
public interface GL15Accessor extends GL14Accessor, glBindBuffer, glDeleteBuffers, glGenBuffers, glIsBuffer, glBufferData, glBufferData_CORE, glBufferSubData, glBufferSubData_CORE, glGetBufferSubData, glMapBuffer, glUnmapBuffer, glGetBufferParameteriv, glGetBufferParameteri, glGetBufferPointerv, glGetBufferPointer, glGenQueries, glDeleteQueries, glIsQuery, glBeginQuery, glEndQuery, glGetQueryiv, glGetQueryi, glGetQueryObjectiv, glGetQueryObjecti, glGetQueryObjectuiv, glGetQueryObjectui {

    void glGetQueryObjectuiv(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint *") long params);
}
