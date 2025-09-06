package de.verdox.polylwjgl3.gl.accessor.gles30;

import de.verdox.polylwjgl3.gl.accessor.gles20.GLES20Accessor;
import de.verdox.polylwjgl3.gl.accessor.gles20.GLES20AccessorImpl;
import de.verdox.polylwjgl3.gl.functions.glBeginQuery;
import de.verdox.polylwjgl3.gl.functions.glBeginTransformFeedback;
import de.verdox.polylwjgl3.gl.functions.glBindBufferBase;
import de.verdox.polylwjgl3.gl.functions.glBindBufferRange;
import de.verdox.polylwjgl3.gl.functions.glBindSampler;
import de.verdox.polylwjgl3.gl.functions.glBindTransformFeedback;
import de.verdox.polylwjgl3.gl.functions.glBindVertexArray;
import de.verdox.polylwjgl3.gl.functions.glBlitFramebuffer;
import de.verdox.polylwjgl3.gl.functions.glClearBufferfi;
import de.verdox.polylwjgl3.gl.functions.glClearBufferfv;
import de.verdox.polylwjgl3.gl.functions.glClearBufferiv;
import de.verdox.polylwjgl3.gl.functions.glClearBufferuiv;
import de.verdox.polylwjgl3.gl.functions.glClientWaitSync;
import de.verdox.polylwjgl3.gl.functions.glCompressedTexImage3D;
import de.verdox.polylwjgl3.gl.functions.glCompressedTexSubImage3D;
import de.verdox.polylwjgl3.gl.functions.glCopyBufferSubData;
import de.verdox.polylwjgl3.gl.functions.glCopyTexSubImage3D;
import de.verdox.polylwjgl3.gl.functions.glDeleteQueries;
import de.verdox.polylwjgl3.gl.functions.glDeleteSamplers;
import de.verdox.polylwjgl3.gl.functions.glDeleteSync;
import de.verdox.polylwjgl3.gl.functions.glDeleteTransformFeedbacks;
import de.verdox.polylwjgl3.gl.functions.glDeleteVertexArrays;
import de.verdox.polylwjgl3.gl.functions.glDrawArraysInstanced;
import de.verdox.polylwjgl3.gl.functions.glDrawBuffers;
import de.verdox.polylwjgl3.gl.functions.glDrawElementsInstanced;
import de.verdox.polylwjgl3.gl.functions.glDrawRangeElements;
import de.verdox.polylwjgl3.gl.functions.glEndQuery;
import de.verdox.polylwjgl3.gl.functions.glEndTransformFeedback;
import de.verdox.polylwjgl3.gl.functions.glFenceSync;
import de.verdox.polylwjgl3.gl.functions.glFlushMappedBufferRange;
import de.verdox.polylwjgl3.gl.functions.glFramebufferTextureLayer;
import de.verdox.polylwjgl3.gl.functions.glGenQueries;
import de.verdox.polylwjgl3.gl.functions.glGenSamplers;
import de.verdox.polylwjgl3.gl.functions.glGenTransformFeedbacks;
import de.verdox.polylwjgl3.gl.functions.glGenVertexArrays;
import de.verdox.polylwjgl3.gl.functions.glGetActiveUniformBlockName;
import de.verdox.polylwjgl3.gl.functions.glGetActiveUniformBlocki;
import de.verdox.polylwjgl3.gl.functions.glGetActiveUniformBlockiv;
import de.verdox.polylwjgl3.gl.functions.glGetActiveUniformsiv;
import de.verdox.polylwjgl3.gl.functions.glGetBufferParameteri64;
import de.verdox.polylwjgl3.gl.functions.glGetBufferParameteri64v;
import de.verdox.polylwjgl3.gl.functions.glGetBufferPointer;
import de.verdox.polylwjgl3.gl.functions.glGetBufferPointerv;
import de.verdox.polylwjgl3.gl.functions.glGetFragDataLocation;
import de.verdox.polylwjgl3.gl.functions.glGetInteger64;
import de.verdox.polylwjgl3.gl.functions.glGetInteger64i;
import de.verdox.polylwjgl3.gl.functions.glGetInteger64i_v;
import de.verdox.polylwjgl3.gl.functions.glGetInteger64v;
import de.verdox.polylwjgl3.gl.functions.glGetIntegeri;
import de.verdox.polylwjgl3.gl.functions.glGetIntegeri_v;
import de.verdox.polylwjgl3.gl.functions.glGetInternalformati;
import de.verdox.polylwjgl3.gl.functions.glGetInternalformativ;
import de.verdox.polylwjgl3.gl.functions.glGetProgramBinary;
import de.verdox.polylwjgl3.gl.functions.glGetQueryObjectui;
import de.verdox.polylwjgl3.gl.functions.glGetQueryObjectuiv;
import de.verdox.polylwjgl3.gl.functions.glGetQueryi;
import de.verdox.polylwjgl3.gl.functions.glGetQueryiv;
import de.verdox.polylwjgl3.gl.functions.glGetSamplerParameterf;
import de.verdox.polylwjgl3.gl.functions.glGetSamplerParameterfv;
import de.verdox.polylwjgl3.gl.functions.glGetSamplerParameteri;
import de.verdox.polylwjgl3.gl.functions.glGetSamplerParameteriv;
import de.verdox.polylwjgl3.gl.functions.glGetStringi;
import de.verdox.polylwjgl3.gl.functions.glGetSynci;
import de.verdox.polylwjgl3.gl.functions.glGetSynciv;
import de.verdox.polylwjgl3.gl.functions.glGetTransformFeedbackVarying;
import de.verdox.polylwjgl3.gl.functions.glGetUniformBlockIndex;
import de.verdox.polylwjgl3.gl.functions.glGetUniformIndices;
import de.verdox.polylwjgl3.gl.functions.glGetUniformui;
import de.verdox.polylwjgl3.gl.functions.glGetUniformuiv;
import de.verdox.polylwjgl3.gl.functions.glGetVertexAttribIi;
import de.verdox.polylwjgl3.gl.functions.glGetVertexAttribIiv;
import de.verdox.polylwjgl3.gl.functions.glGetVertexAttribIui;
import de.verdox.polylwjgl3.gl.functions.glGetVertexAttribIuiv;
import de.verdox.polylwjgl3.gl.functions.glInvalidateFramebuffer;
import de.verdox.polylwjgl3.gl.functions.glInvalidateSubFramebuffer;
import de.verdox.polylwjgl3.gl.functions.glIsQuery;
import de.verdox.polylwjgl3.gl.functions.glIsSampler;
import de.verdox.polylwjgl3.gl.functions.glIsSync;
import de.verdox.polylwjgl3.gl.functions.glIsTransformFeedback;
import de.verdox.polylwjgl3.gl.functions.glIsVertexArray;
import de.verdox.polylwjgl3.gl.functions.glMapBufferRange;
import de.verdox.polylwjgl3.gl.functions.glPauseTransformFeedback;
import de.verdox.polylwjgl3.gl.functions.glProgramBinary;
import de.verdox.polylwjgl3.gl.functions.glProgramParameteri;
import de.verdox.polylwjgl3.gl.functions.glReadBuffer;
import de.verdox.polylwjgl3.gl.functions.glRenderbufferStorageMultisample;
import de.verdox.polylwjgl3.gl.functions.glResumeTransformFeedback;
import de.verdox.polylwjgl3.gl.functions.glSamplerParameterf;
import de.verdox.polylwjgl3.gl.functions.glSamplerParameterfv;
import de.verdox.polylwjgl3.gl.functions.glSamplerParameteri;
import de.verdox.polylwjgl3.gl.functions.glSamplerParameteriv;
import de.verdox.polylwjgl3.gl.functions.glTexImage3D;
import de.verdox.polylwjgl3.gl.functions.glTexStorage2D;
import de.verdox.polylwjgl3.gl.functions.glTexStorage3D;
import de.verdox.polylwjgl3.gl.functions.glTexSubImage3D;
import de.verdox.polylwjgl3.gl.functions.glTransformFeedbackVaryings;
import de.verdox.polylwjgl3.gl.functions.glUniform1ui;
import de.verdox.polylwjgl3.gl.functions.glUniform1uiv;
import de.verdox.polylwjgl3.gl.functions.glUniform2ui;
import de.verdox.polylwjgl3.gl.functions.glUniform2uiv;
import de.verdox.polylwjgl3.gl.functions.glUniform3ui;
import de.verdox.polylwjgl3.gl.functions.glUniform3uiv;
import de.verdox.polylwjgl3.gl.functions.glUniform4ui;
import de.verdox.polylwjgl3.gl.functions.glUniform4uiv;
import de.verdox.polylwjgl3.gl.functions.glUniformBlockBinding;
import de.verdox.polylwjgl3.gl.functions.glUniformMatrix2x3fv;
import de.verdox.polylwjgl3.gl.functions.glUniformMatrix2x4fv;
import de.verdox.polylwjgl3.gl.functions.glUniformMatrix3x2fv;
import de.verdox.polylwjgl3.gl.functions.glUniformMatrix3x4fv;
import de.verdox.polylwjgl3.gl.functions.glUniformMatrix4x2fv;
import de.verdox.polylwjgl3.gl.functions.glUniformMatrix4x3fv;
import de.verdox.polylwjgl3.gl.functions.glUnmapBuffer;
import de.verdox.polylwjgl3.gl.functions.glVertexAttribDivisor;
import de.verdox.polylwjgl3.gl.functions.glVertexAttribI4i;
import de.verdox.polylwjgl3.gl.functions.glVertexAttribI4iv;
import de.verdox.polylwjgl3.gl.functions.glVertexAttribI4ui;
import de.verdox.polylwjgl3.gl.functions.glVertexAttribI4uiv;
import de.verdox.polylwjgl3.gl.functions.glVertexAttribIPointer;
import de.verdox.polylwjgl3.gl.functions.glWaitSync;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengles.GLES30;
import org.lwjgl.system.*;
import org.lwjgl.system.APIUtil.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

/**
 * OpenGL ES 3.0 Accessor — 3D/immutable textures, integer attributes & uniforms, MRT,
 * VAOs, transform feedback, instancing, queries & sync objects, buffer mapping/ranges,
 * sampler objects, program binaries, and internal-format queries.
 *
 * <p>Extends {@link GLES20Accessor} with the major ES 3.0 feature set that aligns the
 * mobile API with modern desktop GL concepts while remaining tile-renderer friendly.</p>
 *
 * <h2>Core Additions & Introspection</h2>
 * <ul>
 *   <li>{@code glGetStringi} — Indexed string queries (e.g., extension list).</li>
 *   <li>{@code glReadBuffer} — Select read buffer for pixel transfers.</li>
 *   <li>{@code glDrawRangeElements} — Hint min/max index to optimize indexed draws.</li>
 * </ul>
 *
 * <h2>Textures</h2>
 * <ul>
 *   <li>{@code glTexImage3D}, {@code glTexSubImage3D}, {@code glCopyTexSubImage3D} —
 *       True 3D textures and sub-region updates/copies.</li>
 *   <li>{@code glCompressedTexImage3D}, {@code glCompressedTexSubImage3D} — Compressed 3D texture uploads.</li>
 *   <li>{@code glTexStorage2D}, {@code glTexStorage3D} — Immutable texture storage (all mip levels allocated up front).</li>
 *   <li>{@code glGetInternalformativ}/{@code glGetInternalformati} — Internal-format capabilities/limits.</li>
 * </ul>
 *
 * <h2>Multiple Render Targets & Framebuffers</h2>
 * <ul>
 *   <li>{@code glDrawBuffers} — Multiple color attachments (MRT).</li>
 *   <li>{@code glBlitFramebuffer} — Resolve/copy rectangles between FBOs.</li>
 *   <li>{@code glRenderbufferStorageMultisample} — Multisample RBO storage.</li>
 *   <li>{@code glFramebufferTextureLayer} — Attach a specific texture layer to FBOs.</li>
 *   <li>{@code glInvalidateFramebuffer}, {@code glInvalidateSubFramebuffer} — Content discard hints for tilers.</li>
 * </ul>
 *
 * <h2>Vertex Arrays & Attributes</h2>
 * <ul>
 *   <li>{@code glGenVertexArrays}, {@code glBindVertexArray}, {@code glDeleteVertexArrays}, {@code glIsVertexArray} — VAOs.</li>
 *   <li>{@code glVertexAttribIPointer} — Integer attribute arrays (no normalization/float conversion).</li>
 *   <li>{@code glVertexAttribI4i/ui}, {@code glVertexAttribI4iv/uiv} — Constant integer attribute values.</li>
 *   <li>{@code glGetVertexAttribIiv/Iuiv}, {@code glGetVertexAttribIi/Iui} — Integer attribute state queries.</li>
 *   <li>{@code glVertexAttribDivisor} — Per-instance step rate for instanced draws.</li>
 * </ul>
 *
 * <h2>Instanced Rendering</h2>
 * <ul>
 *   <li>{@code glDrawArraysInstanced}, {@code glDrawElementsInstanced} — Draw many instances with a single call.</li>
 * </ul>
 *
 * <h2>Transform Feedback</h2>
 * <ul>
 *   <li>{@code glBeginTransformFeedback}, {@code glEndTransformFeedback} — Capture shader outputs.</li>
 *   <li>{@code glTransformFeedbackVaryings}, {@code glGetTransformFeedbackVarying} — Select/query captured varyings.</li>
 *   <li>{@code glBindTransformFeedback}, {@code glGenTransformFeedbacks}, {@code glDeleteTransformFeedbacks},
 *       {@code glIsTransformFeedback}, {@code glPauseTransformFeedback}, {@code glResumeTransformFeedback} — TF objects.</li>
 * </ul>
 *
 * <h2>Uniforms & Uniform Blocks</h2>
 * <ul>
 *   <li>{@code glUniformMatrix* x *fv} — Non-square matrix uploads (2x3, 3x2, 2x4, 4x2, 3x4, 4x3).</li>
 *   <li>{@code glUniform1/2/3/4ui}, {@code glUniform1/2/3/4uiv} — Unsigned-integer uniforms.</li>
 *   <li>{@code glGetUniformuiv}/{@code glGetUniformui} — Read back unsigned-integer uniforms.</li>
 *   <li>{@code glGetUniformIndices}, {@code glGetActiveUniformsiv}, {@code glGetUniformBlockIndex},
 *       {@code glGetActiveUniformBlockiv}/{@code i}, {@code glGetActiveUniformBlockName},
 *       {@code glUniformBlockBinding} — UBO discovery and binding.</li>
 *   <li>{@code glBindBufferBase}, {@code glBindBufferRange} — Bind buffers to indexed UBO/TF binding points.</li>
 *   <li>{@code glGetFragDataLocation} — Query fragment shader output location.</li>
 * </ul>
 *
 * <h2>Buffer Objects: Mapping, Ranges & Copies</h2>
 * <ul>
 *   <li>{@code glMapBufferRange}, {@code glFlushMappedBufferRange}, {@code glUnmapBuffer} — Fine-grained mapping with access flags.</li>
 *   <li>{@code glCopyBufferSubData} — GPU-to-GPU buffer copies.</li>
 *   <li>{@code glGetBufferPointerv}/{@code glGetBufferPointer} — Query mapped pointer.</li>
 *   <li>{@code glGetBufferParameteri64v}/{@code glGetBufferParameteri64} — 64-bit buffer parameter queries.</li>
 * </ul>
 *
 * <h2>Queries & Synchronization</h2>
 * <ul>
 *   <li>{@code glGenQueries}, {@code glDeleteQueries}, {@code glIsQuery}, {@code glBeginQuery}, {@code glEndQuery} — Query objects.</li>
 *   <li>{@code glGetQueryiv}/{@code glGetQueryi}, {@code glGetQueryObjectuiv}/{@code glGetQueryObjectui} — Query status/results.</li>
 *   <li>{@code glFenceSync}, {@code glIsSync}, {@code glDeleteSync}, {@code glClientWaitSync}, {@code glWaitSync},
 *       {@code glGetSynciv}/{@code glGetSynci} — Fence sync objects for explicit CPU/GPU coordination.</li>
 *   <li>{@code glGetIntegeri_v}/{@code glGetIntegeri}, {@code glGetInteger64v}/{@code glGetInteger64},
 *       {@code glGetInteger64i_v}/{@code glGetInteger64i} — Indexed and 64-bit state queries.</li>
 * </ul>
 *
 * <h2>Sampler Objects</h2>
 * <ul>
 *   <li>{@code glGenSamplers}, {@code glDeleteSamplers}, {@code glIsSampler}, {@code glBindSampler} — Sampler lifecycle/binding.</li>
 *   <li>{@code glSamplerParameteri/f}, {@code glSamplerParameteriv/fv} — Sampling parameters (wrap, filter, LOD, compare).</li>
 *   <li>{@code glGetSamplerParameter*i/f/v} — Sampler state queries.</li>
 * </ul>
 *
 * <h2>Program Binaries</h2>
 * <ul>
 *   <li>{@code glGetProgramBinary}, {@code glProgramBinary}, {@code glProgramParameteri} —
 *       Save/load program binaries (e.g., for faster startup).</li>
 * </ul>
 */
public interface GLES30Accessor extends GLES20Accessor, glReadBuffer, glDrawRangeElements, glTexImage3D, glTexSubImage3D, glCopyTexSubImage3D, glCompressedTexImage3D, glCompressedTexSubImage3D, glGenQueries, glDeleteQueries, glIsQuery, glBeginQuery, glEndQuery, glGetQueryiv, glGetQueryi, glGetQueryObjectuiv, glGetQueryObjectui, glUnmapBuffer, glGetBufferPointerv, glGetBufferPointer, glDrawBuffers, glUniformMatrix2x3fv, glUniformMatrix3x2fv, glUniformMatrix2x4fv, glUniformMatrix4x2fv, glUniformMatrix3x4fv, glUniformMatrix4x3fv, glBlitFramebuffer, glRenderbufferStorageMultisample, glFramebufferTextureLayer, glMapBufferRange, glFlushMappedBufferRange, glBindVertexArray, glDeleteVertexArrays, glGenVertexArrays, glIsVertexArray, glGetIntegeri_v, glGetIntegeri, glBeginTransformFeedback, glEndTransformFeedback, glBindBufferRange, glBindBufferBase, glTransformFeedbackVaryings, glGetTransformFeedbackVarying, glVertexAttribIPointer, glGetVertexAttribIiv, glGetVertexAttribIi, glGetVertexAttribIuiv, glGetVertexAttribIui, glVertexAttribI4i, glVertexAttribI4ui, glVertexAttribI4iv, glVertexAttribI4uiv, glGetUniformuiv, glGetUniformui, glGetFragDataLocation, glUniform1ui, glUniform2ui, glUniform3ui, glUniform4ui, glUniform1uiv, glUniform2uiv, glUniform3uiv, glUniform4uiv, glClearBufferiv, glClearBufferuiv, glClearBufferfv, glClearBufferfi, glGetStringi, glCopyBufferSubData, glGetUniformIndices, glGetActiveUniformsiv, glGetUniformBlockIndex, glGetActiveUniformBlockiv, glGetActiveUniformBlocki, glGetActiveUniformBlockName, glUniformBlockBinding, glDrawArraysInstanced, glDrawElementsInstanced, glFenceSync, glIsSync, glDeleteSync, glClientWaitSync, glWaitSync, glGetInteger64v, glGetInteger64, glGetSynciv, glGetSynci, glGetInteger64i_v, glGetInteger64i, glGetBufferParameteri64v, glGetBufferParameteri64, glGenSamplers, glDeleteSamplers, glIsSampler, glBindSampler, glSamplerParameteri, glSamplerParameteriv, glSamplerParameterf, glSamplerParameterfv, glGetSamplerParameteriv, glGetSamplerParameteri, glGetSamplerParameterfv, glGetSamplerParameterf, glVertexAttribDivisor, glBindTransformFeedback, glDeleteTransformFeedbacks, glGenTransformFeedbacks, glIsTransformFeedback, glPauseTransformFeedback, glResumeTransformFeedback, glGetProgramBinary, glProgramBinary, glProgramParameteri, glInvalidateFramebuffer, glInvalidateSubFramebuffer, glTexStorage2D, glTexStorage3D, glGetInternalformativ, glGetInternalformati {

}
