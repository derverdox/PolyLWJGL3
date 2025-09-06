package de.verdox.polylwjgl3.gl.accessor.gl42;

import de.verdox.polylwjgl3.gl.accessor.gl41.GL41Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl41.GL41AccessorImpl;
import de.verdox.polylwjgl3.gl.functions.gl.glDrawArraysInstancedBaseInstance;
import de.verdox.polylwjgl3.gl.functions.gl.glDrawElementsInstancedBaseInstance;
import de.verdox.polylwjgl3.gl.functions.gl.glDrawElementsInstancedBaseVertexBaseInstance;
import de.verdox.polylwjgl3.gl.functions.gl.glDrawTransformFeedbackInstanced;
import de.verdox.polylwjgl3.gl.functions.gl.glDrawTransformFeedbackStreamInstanced;
import de.verdox.polylwjgl3.gl.functions.gl.glGetActiveAtomicCounterBufferi;
import de.verdox.polylwjgl3.gl.functions.gl.glGetActiveAtomicCounterBufferiv;
import de.verdox.polylwjgl3.gl.functions.gl.glTexStorage1D;
import de.verdox.polylwjgl3.gl.functions.glBindImageTexture;
import de.verdox.polylwjgl3.gl.functions.glGetInternalformati;
import de.verdox.polylwjgl3.gl.functions.glGetInternalformativ;
import de.verdox.polylwjgl3.gl.functions.glMemoryBarrier;
import de.verdox.polylwjgl3.gl.functions.glTexStorage2D;
import de.verdox.polylwjgl3.gl.functions.glTexStorage3D;
import java.nio.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL42;
import org.lwjgl.system.*;

/**
 * OpenGL 4.2 Accessor — Immutable texture storage, instanced/base-instance drawing,
 * image load/store with memory barriers, internal format queries, and atomic counter
 * buffer introspection.
 *
 * <p>Extends {@link GL41Accessor} with features that improve texture allocation
 * robustness, enable GPU-driven read–modify–write access to textures, and add
 * richer draw and query entry points.</p>
 *
 * <h2>Atomic Counter Buffers</h2>
 * <ul>
 *   <li>{@code glGetActiveAtomicCounterBufferiv}, {@code glGetActiveAtomicCounterBufferi} —
 *       Query properties of a program’s active atomic counter buffers
 *       (binding point, data size, active counters, referenced stages, etc.).</li>
 * </ul>
 *
 * <h2>Immutable Texture Storage</h2>
 * <ul>
 *   <li>{@code glTexStorage1D}, {@code glTexStorage2D}, {@code glTexStorage3D} —
 *       Allocate all mip levels of a texture up front with an immutable internal format.
 *       Prevents redefinition mistakes and enables driver-side optimizations.</li>
 * </ul>
 *
 * <h2>Instanced & Base-Instance Drawing</h2>
 * <ul>
 *   <li>{@code glDrawTransformFeedbackInstanced}, {@code glDrawTransformFeedbackStreamInstanced} —
 *       Draw primitives captured by transform feedback, issuing multiple instances per call.</li>
 *   <li>{@code glDrawArraysInstancedBaseInstance}, {@code glDrawElementsInstancedBaseInstance} —
 *       Instanced draws with a starting instance ID offset ({@code baseInstance}).</li>
 *   <li>{@code glDrawElementsInstancedBaseVertexBaseInstance} —
 *       Combine base-vertex and base-instance offsets for maximum indexed/instanced flexibility.</li>
 * </ul>
 *
 * <h2>Image Load/Store</h2>
 * <ul>
 *   <li>{@code glBindImageTexture} — Bind a texture level/layer to an image unit with access qualifiers
 *       (read, write, or read-write) for use in shaders via {@code image*} variables.</li>
 *   <li>{@code glMemoryBarrier} — Declare ordering/visibility constraints between image/SSBO/texture
 *       operations and subsequent shader or fixed-function stages to ensure correct data hazards handling.</li>
 * </ul>
 *
 * <h2>Internal Format Queries</h2>
 * <ul>
 *   <li>{@code glGetInternalformativ}, {@code glGetInternalformati} —
 *       Query implementation limits and properties for a given internal format and target
 *       (e.g., sample counts, preferred tiling, supported usages, color/depth/stencil features).</li>
 * </ul>
 *
 * <h3>Notes</h3>
 * <ul>
 *   <li>Immutable textures prohibit redefinition via {@code glTexImage*}; use views or new objects
 *       if you need different formats/sizes.</li>
 *   <li>When using image load/store, choose appropriate barriers (e.g., {@code GL_SHADER_IMAGE_ACCESS_BARRIER_BIT})
 *       to synchronize producers/consumers; insufficient barriers lead to data races.</li>
 *   <li>Base-instance draws pair well with per-instance data packed into vertex buffers and accessed via divisors.</li>
 *   <li>Internal-format queries help pick portable formats while still taking advantage of hardware capabilities.</li>
 * </ul>
 */
public interface GL42Accessor extends GL41Accessor, glGetActiveAtomicCounterBufferiv, glGetActiveAtomicCounterBufferi, glTexStorage1D, glTexStorage2D, glTexStorage3D, glDrawTransformFeedbackInstanced, glDrawTransformFeedbackStreamInstanced, glDrawArraysInstancedBaseInstance, glDrawElementsInstancedBaseInstance, glDrawElementsInstancedBaseVertexBaseInstance, glBindImageTexture, glMemoryBarrier, glGetInternalformativ, glGetInternalformati {

}
