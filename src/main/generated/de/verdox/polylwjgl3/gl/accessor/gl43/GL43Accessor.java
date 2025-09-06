package de.verdox.polylwjgl3.gl.accessor.gl43;

import de.verdox.polylwjgl3.gl.accessor.gl42.GL42Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl42.GL42AccessorImpl;
import de.verdox.polylwjgl3.gl.functions.gl.glClearBufferData;
import de.verdox.polylwjgl3.gl.functions.gl.glClearBufferSubData;
import de.verdox.polylwjgl3.gl.functions.gl.glDebugMessageCallback_CORE;
import de.verdox.polylwjgl3.gl.functions.gl.glGetInternalformati64;
import de.verdox.polylwjgl3.gl.functions.gl.glGetInternalformati64v;
import de.verdox.polylwjgl3.gl.functions.gl.glGetProgramResourceLocationIndex;
import de.verdox.polylwjgl3.gl.functions.gl.glInvalidateBufferData;
import de.verdox.polylwjgl3.gl.functions.gl.glInvalidateBufferSubData;
import de.verdox.polylwjgl3.gl.functions.gl.glInvalidateTexImage;
import de.verdox.polylwjgl3.gl.functions.gl.glInvalidateTexSubImage;
import de.verdox.polylwjgl3.gl.functions.gl.glMultiDrawArraysIndirect;
import de.verdox.polylwjgl3.gl.functions.gl.glMultiDrawElementsIndirect;
import de.verdox.polylwjgl3.gl.functions.gl.glShaderStorageBlockBinding;
import de.verdox.polylwjgl3.gl.functions.gl.glTextureView;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttribLFormat;
import de.verdox.polylwjgl3.gl.functions.glBindVertexBuffer;
import de.verdox.polylwjgl3.gl.functions.glCopyImageSubData;
import de.verdox.polylwjgl3.gl.functions.glDebugMessageCallback;
import de.verdox.polylwjgl3.gl.functions.glDebugMessageControl;
import de.verdox.polylwjgl3.gl.functions.glDebugMessageInsert;
import de.verdox.polylwjgl3.gl.functions.glDispatchCompute;
import de.verdox.polylwjgl3.gl.functions.glDispatchComputeIndirect;
import de.verdox.polylwjgl3.gl.functions.glFramebufferParameteri;
import de.verdox.polylwjgl3.gl.functions.glGetDebugMessageLog;
import de.verdox.polylwjgl3.gl.functions.glGetFramebufferParameteri;
import de.verdox.polylwjgl3.gl.functions.glGetFramebufferParameteriv;
import de.verdox.polylwjgl3.gl.functions.glGetObjectLabel;
import de.verdox.polylwjgl3.gl.functions.glGetObjectPtrLabel;
import de.verdox.polylwjgl3.gl.functions.glGetProgramInterfacei;
import de.verdox.polylwjgl3.gl.functions.glGetProgramInterfaceiv;
import de.verdox.polylwjgl3.gl.functions.glGetProgramResourceIndex;
import de.verdox.polylwjgl3.gl.functions.glGetProgramResourceLocation;
import de.verdox.polylwjgl3.gl.functions.glGetProgramResourceName;
import de.verdox.polylwjgl3.gl.functions.glGetProgramResourceiv;
import de.verdox.polylwjgl3.gl.functions.glInvalidateFramebuffer;
import de.verdox.polylwjgl3.gl.functions.glInvalidateSubFramebuffer;
import de.verdox.polylwjgl3.gl.functions.glObjectLabel;
import de.verdox.polylwjgl3.gl.functions.glObjectPtrLabel;
import de.verdox.polylwjgl3.gl.functions.glPopDebugGroup;
import de.verdox.polylwjgl3.gl.functions.glPushDebugGroup;
import de.verdox.polylwjgl3.gl.functions.glTexBufferRange;
import de.verdox.polylwjgl3.gl.functions.glTexStorage2DMultisample;
import de.verdox.polylwjgl3.gl.functions.glTexStorage3DMultisample;
import de.verdox.polylwjgl3.gl.functions.glVertexAttribBinding;
import de.verdox.polylwjgl3.gl.functions.glVertexAttribFormat;
import de.verdox.polylwjgl3.gl.functions.glVertexAttribIFormat;
import de.verdox.polylwjgl3.gl.functions.glVertexBindingDivisor;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL43;
import org.lwjgl.system.*;

/**
 * OpenGL 4.3 Accessor — Compute shaders, robust buffer/image clears & invalidation,
 * multi-draw indirect, debug output & object labels, program interface queries,
 * shader storage blocks, texture views & buffer ranges, multisample storage, and
 * the vertex-attrib binding model.
 *
 * <p>Extends {@link GL42Accessor} with the first core compute pipeline and a large set of
 * API quality-of-life features for validation, streaming, and binding flexibility.</p>
 *
 * <h2>Buffer/Image Clears & Invalidation</h2>
 * <ul>
 *   <li>{@code glClearBufferData}, {@code glClearBufferSubData} — Fast, GPU-side initialization of buffer contents.</li>
 *   <li>{@code glInvalidateTexImage}, {@code glInvalidateTexSubImage},
 *       {@code glInvalidateBufferData}, {@code glInvalidateBufferSubData},
 *       {@code glInvalidateFramebuffer}, {@code glInvalidateSubFramebuffer} —
 *       Hint that contents are no longer needed, allowing drivers to skip preserves/copies.</li>
 * </ul>
 *
 * <h2>Compute Shaders</h2>
 * <ul>
 *   <li>{@code glDispatchCompute} — Launch compute work groups.</li>
 *   <li>{@code glDispatchComputeIndirect} — Launch via parameters stored in a buffer (GPU-driven dispatch).</li>
 * </ul>
 *
 * <h2>Image & Texture Utilities</h2>
 * <ul>
 *   <li>{@code glCopyImageSubData} — Copy texel rectangles between images (any compatible formats/targets).</li>
 *   <li>{@code glTexBufferRange} — Bind a subrange of a buffer as a texel buffer (TBO) instead of the whole buffer.</li>
 *   <li>{@code glTextureView} — Create texture “views” that reinterpret an existing storage (format swizzles, mip/layer subset).</li>
 *   <li>{@code glTexStorage2DMultisample}, {@code glTexStorage3DMultisample} — Immutable multisample texture allocations.</li>
 * </ul>
 *
 * <h2>Debug Output & Object Labels (KHR_debug)</h2>
 * <ul>
 *   <li>{@code glDebugMessageControl}, {@code glDebugMessageInsert} — Filter and inject debug messages.</li>
 *   <li>{@code glDebugMessageCallback} / {@code glDebugMessageCallback_CORE} — Register a callback for asynchronous GL diagnostics.</li>
 *   <li>{@code glGetDebugMessageLog} — Pull messages if no callback is set.</li>
 *   <li>{@code glPushDebugGroup}, {@code glPopDebugGroup} — Scope messages for easier tracing.</li>
 *   <li>{@code glObjectLabel}, {@code glGetObjectLabel}, {@code glObjectPtrLabel}, {@code glGetObjectPtrLabel} — Name GL objects for readable logs.</li>
 * </ul>
 *
 * <h2>Framebuffer Parameters & Internal Formats</h2>
 * <ul>
 *   <li>{@code glFramebufferParameteri}, {@code glGetFramebufferParameteriv}/{@code glGetFramebufferParameteri} —
 *       Set/query framebuffer-level parameters (e.g., default width/height/layers/samples).</li>
 *   <li>{@code glGetInternalformati64v}, {@code glGetInternalformati64} — 64-bit-capable internal-format capability queries.</li>
 * </ul>
 *
 * <h2>Multi-Draw Indirect</h2>
 * <ul>
 *   <li>{@code glMultiDrawArraysIndirect}, {@code glMultiDrawElementsIndirect} —
 *       Issue many draws from a parameter buffer in one call for GPU-driven rendering.</li>
 * </ul>
 *
 * <h2>Program Interface Queries</h2>
 * <ul>
 *   <li>{@code glGetProgramInterfaceiv}/{@code glGetProgramInterfacei}, {@code glGetProgramResourceIndex},
 *       {@code glGetProgramResourceName}, {@code glGetProgramResourceiv},
 *       {@code glGetProgramResourceLocation}, {@code glGetProgramResourceLocationIndex} —
 *       Introspect active resources (uniforms, blocks, inputs/outputs, buffers, images, etc.).</li>
 * </ul>
 *
 * <h2>Shader Storage Buffer Objects (SSBO)</h2>
 * <ul>
 *   <li>{@code glShaderStorageBlockBinding} — Bind shader storage blocks to indexed binding points
 *       (large read/write buffers accessible from shaders).</li>
 * </ul>
 *
 * <h2>Vertex Attrib Binding Model</h2>
 * <ul>
 *   <li>{@code glBindVertexBuffer} — Bind buffers to <em>binding indices</em> with offset/stride.</li>
 *   <li>{@code glVertexAttribFormat}, {@code glVertexAttribIFormat}, {@code glVertexAttribLFormat} —
 *       Describe per-attribute format (normalized/integer/double variants).</li>
 *   <li>{@code glVertexAttribBinding} — Route attributes to buffer bindings.</li>
 *   <li>{@code glVertexBindingDivisor} — Set per-binding instance divisors (pairs with instanced rendering).</li>
 * </ul>
 *
 * <h3>Notes</h3>
 * <ul>
 *   <li>Compute shaders require appropriate memory barriers (e.g., {@code GL_SHADER_IMAGE_ACCESS_BARRIER_BIT},
 *       {@code GL_SHADER_STORAGE_BARRIER_BIT}) between producers and consumers.</li>
 *   <li>Multi-draw indirect and indirect dispatch enable GPU-driven pipelines; ensure buffers use the correct layouts.</li>
 *   <li>Use object labels and debug groups liberally during development; they greatly simplify driver and application diagnostics.</li>
 *   <li>The vertex-attrib binding model decouples format from buffer binding for leaner VAO updates and better reuse.</li>
 * </ul>
 */
public interface GL43Accessor extends GL42Accessor, glClearBufferData, glClearBufferSubData, glDispatchCompute, glDispatchComputeIndirect, glCopyImageSubData, glDebugMessageControl, glDebugMessageInsert, glDebugMessageCallback, glDebugMessageCallback_CORE, glGetDebugMessageLog, glPushDebugGroup, glPopDebugGroup, glObjectLabel, glGetObjectLabel, glObjectPtrLabel, glGetObjectPtrLabel, glFramebufferParameteri, glGetFramebufferParameteriv, glGetFramebufferParameteri, glGetInternalformati64v, glGetInternalformati64, glInvalidateTexSubImage, glInvalidateTexImage, glInvalidateBufferSubData, glInvalidateBufferData, glInvalidateFramebuffer, glInvalidateSubFramebuffer, glMultiDrawArraysIndirect, glMultiDrawElementsIndirect, glGetProgramInterfaceiv, glGetProgramInterfacei, glGetProgramResourceIndex, glGetProgramResourceName, glGetProgramResourceiv, glGetProgramResourceLocation, glGetProgramResourceLocationIndex, glShaderStorageBlockBinding, glTexBufferRange, glTexStorage2DMultisample, glTexStorage3DMultisample, glTextureView, glBindVertexBuffer, glVertexAttribFormat, glVertexAttribIFormat, glVertexAttribLFormat, glVertexAttribBinding, glVertexBindingDivisor {

}
