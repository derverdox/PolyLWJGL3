package de.verdox.polylwjgl3.gl.accessor.gl44;

import de.verdox.polylwjgl3.gl.accessor.gl43.GL43Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl43.GL43AccessorImpl;
import de.verdox.polylwjgl3.gl.functions.gl.glBindBuffersBase;
import de.verdox.polylwjgl3.gl.functions.gl.glBindBuffersRange;
import de.verdox.polylwjgl3.gl.functions.gl.glBindImageTextures;
import de.verdox.polylwjgl3.gl.functions.gl.glBindSamplers;
import de.verdox.polylwjgl3.gl.functions.gl.glBindTextures;
import de.verdox.polylwjgl3.gl.functions.gl.glBindVertexBuffers;
import de.verdox.polylwjgl3.gl.functions.gl.glBufferStorage;
import de.verdox.polylwjgl3.gl.functions.gl.glClearTexImage;
import de.verdox.polylwjgl3.gl.functions.gl.glClearTexSubImage;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL44;
import org.lwjgl.system.*;

/**
 * OpenGL 4.4 Accessor — Immutable/persistent buffer storage, fast texture clears,
 * and bulk “multi-bind” helpers for textures, samplers, images, and vertex buffers.
 *
 * <p>Extends {@link GL43Accessor} with new ways to create and stream buffer data
 * efficiently, plus batched binding entry points that reduce CPU overhead when
 * updating many objects at once.</p>
 *
 * <h2>Buffer Storage</h2>
 * <ul>
 *   <li>{@code glBufferStorage} — Create an immutable buffer data store with usage flags
 *       (e.g., {@code MAP_PERSISTENT_BIT}, {@code MAP_COHERENT_BIT}, {@code DYNAMIC_STORAGE_BIT}).
 *       Enables persistent/coherent mapping for lock-free streaming.</li>
 * </ul>
 *
 * <h2>Fast Texture Clears</h2>
 * <ul>
 *   <li>{@code glClearTexImage}, {@code glClearTexSubImage} — Clear an entire texture
 *       or a sub-region to a constant value entirely on the GPU.</li>
 * </ul>
 *
 * <h2>Bulk Binding (Multi-Bind)</h2>
 * <ul>
 *   <li>{@code glBindBuffersBase}, {@code glBindBuffersRange} — Bind many buffers to
 *       consecutive indexed targets (UBO/SSBO/TFB) in one call (optionally with ranges).</li>
 *   <li>{@code glBindTextures} — Bind an array of textures to consecutive texture units.</li>
 *   <li>{@code glBindSamplers} — Bind multiple sampler objects to consecutive texture units.</li>
 *   <li>{@code glBindImageTextures} — Bind multiple images to consecutive image units.</li>
 *   <li>{@code glBindVertexBuffers} — Bind several vertex buffers to a VAO’s binding indices
 *       with per-binding offsets and strides in a single call.</li>
 * </ul>
 *
 * <h3>Notes</h3>
 * <ul>
 *   <li>Immutable buffer storage forbids later reallocation; choose flags up front.
 *       Persistent mapping can eliminate map/unmap churn; use fences or coherent flags
 *       plus memory barriers to ensure correctness.</li>
 *   <li>Texture clears respect the texture’s internal format; provide a matching clear value
 *       type/size (integer vs float).</li>
 *   <li>Multi-bind calls skip unused slots by passing zero object names; arrays must be sized
 *       appropriately for the targeted binding range.</li>
 * </ul>
 */
public interface GL44Accessor extends GL43Accessor, glBufferStorage, glClearTexSubImage, glClearTexImage, glBindBuffersBase, glBindBuffersRange, glBindTextures, glBindSamplers, glBindImageTextures, glBindVertexBuffers {

}
