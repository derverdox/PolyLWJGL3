package de.verdox.polylwjgl3.gl.accessor.gl32;

import de.verdox.polylwjgl3.gl.accessor.gl31.GL31Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl31.GL31AccessorImpl;
import de.verdox.polylwjgl3.gl.functions.gl.glMultiDrawElementsBaseVertex;
import de.verdox.polylwjgl3.gl.functions.gl.glProvokingVertex;
import de.verdox.polylwjgl3.gl.functions.gl.glTexImage2DMultisample;
import de.verdox.polylwjgl3.gl.functions.gl.glTexImage3DMultisample;
import de.verdox.polylwjgl3.gl.functions.glClientWaitSync;
import de.verdox.polylwjgl3.gl.functions.glDeleteSync;
import de.verdox.polylwjgl3.gl.functions.glDrawElementsBaseVertex;
import de.verdox.polylwjgl3.gl.functions.glDrawElementsInstancedBaseVertex;
import de.verdox.polylwjgl3.gl.functions.glDrawRangeElementsBaseVertex;
import de.verdox.polylwjgl3.gl.functions.glFenceSync;
import de.verdox.polylwjgl3.gl.functions.glFramebufferTexture;
import de.verdox.polylwjgl3.gl.functions.glGetBufferParameteri64;
import de.verdox.polylwjgl3.gl.functions.glGetBufferParameteri64v;
import de.verdox.polylwjgl3.gl.functions.glGetInteger64;
import de.verdox.polylwjgl3.gl.functions.glGetInteger64i;
import de.verdox.polylwjgl3.gl.functions.glGetInteger64i_v;
import de.verdox.polylwjgl3.gl.functions.glGetInteger64v;
import de.verdox.polylwjgl3.gl.functions.glGetMultisamplef;
import de.verdox.polylwjgl3.gl.functions.glGetMultisamplefv;
import de.verdox.polylwjgl3.gl.functions.glGetSynci;
import de.verdox.polylwjgl3.gl.functions.glGetSynciv;
import de.verdox.polylwjgl3.gl.functions.glIsSync;
import de.verdox.polylwjgl3.gl.functions.glSampleMaski;
import de.verdox.polylwjgl3.gl.functions.glWaitSync;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL32;
import org.lwjgl.system.*;

/**
 * OpenGL 3.2 Accessor — Base-vertex drawing, provoking-vertex conventions, multisample textures,
 * sync objects, and 64-bit state/queries.
 *
 * <p>Extends {@link GL31Accessor} with features that improve indexed drawing flexibility,
 * control flat-shading semantics, add true multisample texture storage, expose explicit
 * synchronization primitives, and provide 64-bit query/state accessors.</p>
 *
 * <h2>64-bit Buffer & Global State</h2>
 * <ul>
 *   <li>{@code glGetBufferParameteri64v}, {@code glGetBufferParameteri64} —
 *       Query buffer object parameters with 64-bit precision (e.g., sizes).</li>
 *   <li>{@code glGetInteger64v}, {@code glGetInteger64}, {@code glGetInteger64i_v}, {@code glGetInteger64i} —
 *       Query global or indexed integer state in 64-bit form.</li>
 * </ul>
 *
 * <h2>Base-Vertex Indexed Drawing</h2>
 * <ul>
 *   <li>{@code glDrawElementsBaseVertex}, {@code glDrawRangeElementsBaseVertex},
 *       {@code glDrawElementsInstancedBaseVertex}, {@code glMultiDrawElementsBaseVertex} —
 *       Add a constant <em>base vertex</em> offset to all indices, enabling shared index buffers,
 *       sub-meshes, and atlas-style layouts without rebasing CPU-side index data.</li>
 * </ul>
 *
 * <h2>Provoking Vertex</h2>
 * <ul>
 *   <li>{@code glProvokingVertex} — Select which vertex in a primitive supplies the
 *       flat-shaded attributes (first vs. last provoking vertex).</li>
 * </ul>
 *
 * <h2>Multisample Textures & Sampling Control</h2>
 * <ul>
 *   <li>{@code glTexImage2DMultisample}, {@code glTexImage3DMultisample} —
 *       Allocate true multisample texture storage (fixed sample count, no filtering).</li>
 *   <li>{@code glGetMultisamplefv}, {@code glGetMultisamplef} —
 *       Query sample positions for a multisampled buffer.</li>
 *   <li>{@code glSampleMaski} — Set per-sample mask bits for fine-grained MSAA coverage control.</li>
 * </ul>
 *
 * <h2>Framebuffer Attachment Convenience</h2>
 * <ul>
 *   <li>{@code glFramebufferTexture} — Attach a texture level (or layered attachments) to a framebuffer
 *       in a single entry point.</li>
 * </ul>
 *
 * <h2>Sync Objects (Fences)</h2>
 * <ul>
 *   <li>{@code glFenceSync}, {@code glIsSync}, {@code glDeleteSync} —
 *       Create, test, and delete GPU fence sync objects.</li>
 *   <li>{@code glClientWaitSync}, {@code glWaitSync} —
 *       Client- or server-side waits for GPU completion of prior commands.</li>
 *   <li>{@code glGetSynciv}, {@code glGetSynci} —
 *       Query sync object parameters/status.</li>
 * </ul>
 *
 * <h3>Notes</h3>
 * <ul>
 *   <li>Base-vertex draws pair naturally with interleaved vertex buffers and shared index streams.</li>
 *   <li>Multisample textures are not filterable; use {@code glBlitFramebuffer} for resolves.</li>
 *   <li>Fence syncs provide explicit, fine-grained CPU/GPU coordination compared to implicit flushes.</li>
 *   <li>Use 64-bit queries when sizes or counters can exceed 32-bit ranges on modern hardware.</li>
 * </ul>
 */
public interface GL32Accessor extends GL31Accessor, glGetBufferParameteri64v, glGetBufferParameteri64, glDrawElementsBaseVertex, glDrawRangeElementsBaseVertex, glDrawElementsInstancedBaseVertex, glMultiDrawElementsBaseVertex, glProvokingVertex, glTexImage2DMultisample, glTexImage3DMultisample, glGetMultisamplefv, glGetMultisamplef, glSampleMaski, glFramebufferTexture, glFenceSync, glIsSync, glDeleteSync, glClientWaitSync, glWaitSync, glGetInteger64v, glGetInteger64, glGetInteger64i_v, glGetInteger64i, glGetSynciv, glGetSynci {

}
