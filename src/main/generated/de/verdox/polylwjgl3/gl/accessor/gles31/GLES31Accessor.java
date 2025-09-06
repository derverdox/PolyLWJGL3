package de.verdox.polylwjgl3.gl.accessor.gles31;

import de.verdox.polylwjgl3.gl.accessor.gles30.GLES30Accessor;
import de.verdox.polylwjgl3.gl.accessor.gles30.GLES30AccessorImpl;
import de.verdox.polylwjgl3.gl.functions.glActiveShaderProgram;
import de.verdox.polylwjgl3.gl.functions.glBindImageTexture;
import de.verdox.polylwjgl3.gl.functions.glBindProgramPipeline;
import de.verdox.polylwjgl3.gl.functions.glBindVertexBuffer;
import de.verdox.polylwjgl3.gl.functions.glCreateShaderProgramv;
import de.verdox.polylwjgl3.gl.functions.glDeleteProgramPipelines;
import de.verdox.polylwjgl3.gl.functions.glDispatchCompute;
import de.verdox.polylwjgl3.gl.functions.glDispatchComputeIndirect;
import de.verdox.polylwjgl3.gl.functions.glDrawArraysIndirect;
import de.verdox.polylwjgl3.gl.functions.glDrawElementsIndirect;
import de.verdox.polylwjgl3.gl.functions.glFramebufferParameteri;
import de.verdox.polylwjgl3.gl.functions.glGenProgramPipelines;
import de.verdox.polylwjgl3.gl.functions.glGetBooleani;
import de.verdox.polylwjgl3.gl.functions.glGetBooleani_v;
import de.verdox.polylwjgl3.gl.functions.glGetFramebufferParameteri;
import de.verdox.polylwjgl3.gl.functions.glGetFramebufferParameteriv;
import de.verdox.polylwjgl3.gl.functions.glGetMultisamplef;
import de.verdox.polylwjgl3.gl.functions.glGetMultisamplefv;
import de.verdox.polylwjgl3.gl.functions.glGetProgramInterfacei;
import de.verdox.polylwjgl3.gl.functions.glGetProgramInterfaceiv;
import de.verdox.polylwjgl3.gl.functions.glGetProgramPipelineInfoLog;
import de.verdox.polylwjgl3.gl.functions.glGetProgramPipelinei;
import de.verdox.polylwjgl3.gl.functions.glGetProgramPipelineiv;
import de.verdox.polylwjgl3.gl.functions.glGetProgramResourceIndex;
import de.verdox.polylwjgl3.gl.functions.glGetProgramResourceLocation;
import de.verdox.polylwjgl3.gl.functions.glGetProgramResourceName;
import de.verdox.polylwjgl3.gl.functions.glGetProgramResourceiv;
import de.verdox.polylwjgl3.gl.functions.glGetTexLevelParameterf;
import de.verdox.polylwjgl3.gl.functions.glGetTexLevelParameterfv;
import de.verdox.polylwjgl3.gl.functions.glGetTexLevelParameteri;
import de.verdox.polylwjgl3.gl.functions.glGetTexLevelParameteriv;
import de.verdox.polylwjgl3.gl.functions.glIsProgramPipeline;
import de.verdox.polylwjgl3.gl.functions.glMemoryBarrier;
import de.verdox.polylwjgl3.gl.functions.glMemoryBarrierByRegion;
import de.verdox.polylwjgl3.gl.functions.glProgramUniform1f;
import de.verdox.polylwjgl3.gl.functions.glProgramUniform1fv;
import de.verdox.polylwjgl3.gl.functions.glProgramUniform1i;
import de.verdox.polylwjgl3.gl.functions.glProgramUniform1iv;
import de.verdox.polylwjgl3.gl.functions.glProgramUniform1ui;
import de.verdox.polylwjgl3.gl.functions.glProgramUniform1uiv;
import de.verdox.polylwjgl3.gl.functions.glProgramUniform2f;
import de.verdox.polylwjgl3.gl.functions.glProgramUniform2fv;
import de.verdox.polylwjgl3.gl.functions.glProgramUniform2i;
import de.verdox.polylwjgl3.gl.functions.glProgramUniform2iv;
import de.verdox.polylwjgl3.gl.functions.glProgramUniform2ui;
import de.verdox.polylwjgl3.gl.functions.glProgramUniform2uiv;
import de.verdox.polylwjgl3.gl.functions.glProgramUniform3f;
import de.verdox.polylwjgl3.gl.functions.glProgramUniform3fv;
import de.verdox.polylwjgl3.gl.functions.glProgramUniform3i;
import de.verdox.polylwjgl3.gl.functions.glProgramUniform3iv;
import de.verdox.polylwjgl3.gl.functions.glProgramUniform3ui;
import de.verdox.polylwjgl3.gl.functions.glProgramUniform3uiv;
import de.verdox.polylwjgl3.gl.functions.glProgramUniform4f;
import de.verdox.polylwjgl3.gl.functions.glProgramUniform4fv;
import de.verdox.polylwjgl3.gl.functions.glProgramUniform4i;
import de.verdox.polylwjgl3.gl.functions.glProgramUniform4iv;
import de.verdox.polylwjgl3.gl.functions.glProgramUniform4ui;
import de.verdox.polylwjgl3.gl.functions.glProgramUniform4uiv;
import de.verdox.polylwjgl3.gl.functions.glProgramUniformMatrix2fv;
import de.verdox.polylwjgl3.gl.functions.glProgramUniformMatrix2x3fv;
import de.verdox.polylwjgl3.gl.functions.glProgramUniformMatrix2x4fv;
import de.verdox.polylwjgl3.gl.functions.glProgramUniformMatrix3fv;
import de.verdox.polylwjgl3.gl.functions.glProgramUniformMatrix3x2fv;
import de.verdox.polylwjgl3.gl.functions.glProgramUniformMatrix3x4fv;
import de.verdox.polylwjgl3.gl.functions.glProgramUniformMatrix4fv;
import de.verdox.polylwjgl3.gl.functions.glProgramUniformMatrix4x2fv;
import de.verdox.polylwjgl3.gl.functions.glProgramUniformMatrix4x3fv;
import de.verdox.polylwjgl3.gl.functions.glSampleMaski;
import de.verdox.polylwjgl3.gl.functions.glTexStorage2DMultisample;
import de.verdox.polylwjgl3.gl.functions.glUseProgramStages;
import de.verdox.polylwjgl3.gl.functions.glValidateProgramPipeline;
import de.verdox.polylwjgl3.gl.functions.glVertexAttribBinding;
import de.verdox.polylwjgl3.gl.functions.glVertexAttribFormat;
import de.verdox.polylwjgl3.gl.functions.glVertexAttribIFormat;
import de.verdox.polylwjgl3.gl.functions.glVertexBindingDivisor;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengles.GLES31;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

/**
 * OpenGL ES 3.1 Accessor — Compute shaders, indirect draws, program pipelines with
 * program-scope uniform updates, image load/store with memory barriers, multisample
 * texture storage, indexed state queries, and the vertex-attrib binding model.
 *
 * <p>Extends {@link GLES30Accessor} with a modern, GPU-driven workflow: dispatch compute
 * workloads, issue draws from parameter buffers, configure separable programs/pipelines,
 * and write to textures from shaders with explicit synchronization.</p>
 *
 * <h2>Compute & Indirect Drawing</h2>
 * <ul>
 *   <li>{@code glDispatchCompute}, {@code glDispatchComputeIndirect} — Launch compute work groups,
 *       optionally with parameters sourced from a buffer for GPU-driven dispatch.</li>
 *   <li>{@code glDrawArraysIndirect}, {@code glDrawElementsIndirect} — Issue draw calls whose arguments
 *       live in a buffer object (pairs well with compute that builds command buffers).</li>
 * </ul>
 *
 * <h2>Program Pipelines & Separable Programs</h2>
 * <ul>
 *   <li>{@code glUseProgramStages}, {@code glActiveShaderProgram}, {@code glCreateShaderProgramv} —
 *       Create separable programs, select the active one for program-uniform updates, and bind
 *       stages into a pipeline.</li>
 *   <li>{@code glBindProgramPipeline}, {@code glGenProgramPipelines}, {@code glDeleteProgramPipelines},
 *       {@code glIsProgramPipeline} — Manage program pipeline objects.</li>
 *   <li>{@code glGetProgramPipelineiv}/{@code glGetProgramPipelinei}, {@code glValidateProgramPipeline},
 *       {@code glGetProgramPipelineInfoLog} — Inspect and validate pipelines.</li>
 * </ul>
 *
 * <h2>Program-Scoped Uniform Updates</h2>
 * <ul>
 *   <li>{@code glProgramUniform1/2/3/4i/ui/f} and vector/matrix variants —
 *       Set uniforms on a specific program object without rebinding it via {@code glUseProgram}.</li>
 * </ul>
 *
 * <h2>Program Interface Introspection</h2>
 * <ul>
 *   <li>{@code glGetProgramInterfaceiv}/{@code glGetProgramInterfacei},
 *       {@code glGetProgramResourceIndex}, {@code glGetProgramResourceName},
 *       {@code glGetProgramResourceiv}, {@code glGetProgramResourceLocation} —
 *       Query active resources (uniforms/blocks, inputs/outputs, images, buffers) of a program.</li>
 * </ul>
 *
 * <h2>Image Load/Store & Memory Barriers</h2>
 * <ul>
 *   <li>{@code glBindImageTexture} — Bind a texture level/layer to an image unit with read/write access for shaders.</li>
 *   <li>{@code glMemoryBarrier}, {@code glMemoryBarrierByRegion} — Establish ordering/visibility between shader
 *       writes and subsequent reads to avoid data hazards (regional barrier affects overlapping pixels/tiles only).</li>
 * </ul>
 *
 * <h2>Multisample & Framebuffer Parameters</h2>
 * <ul>
 *   <li>{@code glTexStorage2DMultisample} — Immutable storage for multisample textures.</li>
 *   <li>{@code glGetMultisamplefv}/{@code glGetMultisamplef}, {@code glSampleMaski} — Query sample positions and
 *       control sample coverage masks.</li>
 *   <li>{@code glFramebufferParameteri}, {@code glGetFramebufferParameteriv}/{@code glGetFramebufferParameteri} —
 *       Set/query default FBO parameters (width/height/samples/layers).</li>
 * </ul>
 *
 * <h2>Texture Level Parameters</h2>
 * <ul>
 *   <li>{@code glGetTexLevelParameteriv}/{@code glGetTexLevelParameteri},
 *       {@code glGetTexLevelParameterfv}/{@code glGetTexLevelParameterf} —
 *       Query size/format/other properties of a specific texture level.</li>
 * </ul>
 *
 * <h2>Vertex Attrib Binding Model</h2>
 * <ul>
 *   <li>{@code glBindVertexBuffer} — Bind a buffer to a VAO binding index with offset/stride.</li>
 *   <li>{@code glVertexAttribFormat}, {@code glVertexAttribIFormat} — Describe per-attribute layout
 *       (normalized, integer variants) independent of buffer bindings.</li>
 *   <li>{@code glVertexAttribBinding} — Route attribute indices to binding indices.</li>
 *   <li>{@code glVertexBindingDivisor} — Set per-binding instancing divisors.</li>
 * </ul>
 *
 * <h2>Indexed State Queries</h2>
 * <ul>
 *   <li>{@code glGetBooleani_v}/{@code glGetBooleani} — Read indexed boolean state (e.g., per-viewport/per-attachment).</li>
 * </ul>
 *
 * <h3>Notes</h3>
 * <ul>
 *   <li>When using image load/store or compute-generated geometry/textures, insert the appropriate
 *       memory barriers before consumers execute.</li>
 *   <li>Indirect draws and program pipelines enable multi-stage, GPU-driven engines with minimal CPU overhead.</li>
 *   <li>The vertex-attrib binding model decouples format from buffer binding, making VAO updates cheaper and clearer.</li>
 * </ul>
 */
public interface GLES31Accessor extends GLES30Accessor, glDispatchCompute, glDispatchComputeIndirect, glDrawArraysIndirect, glDrawElementsIndirect, glFramebufferParameteri, glGetFramebufferParameteriv, glGetFramebufferParameteri, glGetProgramInterfaceiv, glGetProgramInterfacei, glGetProgramResourceIndex, glGetProgramResourceName, glGetProgramResourceiv, glGetProgramResourceLocation, glUseProgramStages, glActiveShaderProgram, glCreateShaderProgramv, glBindProgramPipeline, glDeleteProgramPipelines, glGenProgramPipelines, glIsProgramPipeline, glGetProgramPipelineiv, glGetProgramPipelinei, glProgramUniform1i, glProgramUniform2i, glProgramUniform3i, glProgramUniform4i, glProgramUniform1ui, glProgramUniform2ui, glProgramUniform3ui, glProgramUniform4ui, glProgramUniform1f, glProgramUniform2f, glProgramUniform3f, glProgramUniform4f, glProgramUniform1iv, glProgramUniform2iv, glProgramUniform3iv, glProgramUniform4iv, glProgramUniform1uiv, glProgramUniform2uiv, glProgramUniform3uiv, glProgramUniform4uiv, glProgramUniform1fv, glProgramUniform2fv, glProgramUniform3fv, glProgramUniform4fv, glProgramUniformMatrix2fv, glProgramUniformMatrix3fv, glProgramUniformMatrix4fv, glProgramUniformMatrix2x3fv, glProgramUniformMatrix3x2fv, glProgramUniformMatrix2x4fv, glProgramUniformMatrix4x2fv, glProgramUniformMatrix3x4fv, glProgramUniformMatrix4x3fv, glValidateProgramPipeline, glGetProgramPipelineInfoLog, glBindImageTexture, glGetBooleani_v, glGetBooleani, glMemoryBarrier, glMemoryBarrierByRegion, glTexStorage2DMultisample, glGetMultisamplefv, glGetMultisamplef, glSampleMaski, glGetTexLevelParameteriv, glGetTexLevelParameteri, glGetTexLevelParameterfv, glGetTexLevelParameterf, glBindVertexBuffer, glVertexAttribFormat, glVertexAttribIFormat, glVertexAttribBinding, glVertexBindingDivisor {

}
