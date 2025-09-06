package de.verdox.polylwjgl3.gl.accessor.gl45;

import de.verdox.polylwjgl3.gl.accessor.gl44.GL44Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl44.GL44AccessorImpl;
import de.verdox.polylwjgl3.gl.functions.gl.glBindTextureUnit;
import de.verdox.polylwjgl3.gl.functions.gl.glBlitNamedFramebuffer;
import de.verdox.polylwjgl3.gl.functions.gl.glCheckNamedFramebufferStatus;
import de.verdox.polylwjgl3.gl.functions.gl.glClearNamedBufferData;
import de.verdox.polylwjgl3.gl.functions.gl.glClearNamedBufferSubData;
import de.verdox.polylwjgl3.gl.functions.gl.glClearNamedFramebufferfi;
import de.verdox.polylwjgl3.gl.functions.gl.glClearNamedFramebufferfv;
import de.verdox.polylwjgl3.gl.functions.gl.glClearNamedFramebufferiv;
import de.verdox.polylwjgl3.gl.functions.gl.glClearNamedFramebufferuiv;
import de.verdox.polylwjgl3.gl.functions.gl.glClipControl;
import de.verdox.polylwjgl3.gl.functions.gl.glCompressedTextureSubImage1D;
import de.verdox.polylwjgl3.gl.functions.gl.glCompressedTextureSubImage2D;
import de.verdox.polylwjgl3.gl.functions.gl.glCompressedTextureSubImage3D;
import de.verdox.polylwjgl3.gl.functions.gl.glCopyNamedBufferSubData;
import de.verdox.polylwjgl3.gl.functions.gl.glCopyTextureSubImage1D;
import de.verdox.polylwjgl3.gl.functions.gl.glCopyTextureSubImage2D;
import de.verdox.polylwjgl3.gl.functions.gl.glCopyTextureSubImage3D;
import de.verdox.polylwjgl3.gl.functions.gl.glCreateBuffers;
import de.verdox.polylwjgl3.gl.functions.gl.glCreateFramebuffers;
import de.verdox.polylwjgl3.gl.functions.gl.glCreateProgramPipelines;
import de.verdox.polylwjgl3.gl.functions.gl.glCreateQueries;
import de.verdox.polylwjgl3.gl.functions.gl.glCreateRenderbuffers;
import de.verdox.polylwjgl3.gl.functions.gl.glCreateSamplers;
import de.verdox.polylwjgl3.gl.functions.gl.glCreateTextures;
import de.verdox.polylwjgl3.gl.functions.gl.glCreateTransformFeedbacks;
import de.verdox.polylwjgl3.gl.functions.gl.glCreateVertexArrays;
import de.verdox.polylwjgl3.gl.functions.gl.glDisableVertexArrayAttrib;
import de.verdox.polylwjgl3.gl.functions.gl.glEnableVertexArrayAttrib;
import de.verdox.polylwjgl3.gl.functions.gl.glFlushMappedNamedBufferRange;
import de.verdox.polylwjgl3.gl.functions.gl.glGenerateTextureMipmap;
import de.verdox.polylwjgl3.gl.functions.gl.glGetCompressedTextureImage;
import de.verdox.polylwjgl3.gl.functions.gl.glGetCompressedTextureSubImage;
import de.verdox.polylwjgl3.gl.functions.gl.glGetNamedBufferParameteri64;
import de.verdox.polylwjgl3.gl.functions.gl.glGetNamedBufferParameteri64v;
import de.verdox.polylwjgl3.gl.functions.gl.glGetNamedBufferParameteri;
import de.verdox.polylwjgl3.gl.functions.gl.glGetNamedBufferParameteriv;
import de.verdox.polylwjgl3.gl.functions.gl.glGetNamedBufferPointer;
import de.verdox.polylwjgl3.gl.functions.gl.glGetNamedBufferPointerv;
import de.verdox.polylwjgl3.gl.functions.gl.glGetNamedBufferSubData;
import de.verdox.polylwjgl3.gl.functions.gl.glGetNamedFramebufferAttachmentParameteri;
import de.verdox.polylwjgl3.gl.functions.gl.glGetNamedFramebufferAttachmentParameteriv;
import de.verdox.polylwjgl3.gl.functions.gl.glGetNamedFramebufferParameteri;
import de.verdox.polylwjgl3.gl.functions.gl.glGetNamedFramebufferParameteriv;
import de.verdox.polylwjgl3.gl.functions.gl.glGetNamedRenderbufferParameteri;
import de.verdox.polylwjgl3.gl.functions.gl.glGetNamedRenderbufferParameteriv;
import de.verdox.polylwjgl3.gl.functions.gl.glGetQueryBufferObjecti64v;
import de.verdox.polylwjgl3.gl.functions.gl.glGetQueryBufferObjectiv;
import de.verdox.polylwjgl3.gl.functions.gl.glGetQueryBufferObjectui64v;
import de.verdox.polylwjgl3.gl.functions.gl.glGetQueryBufferObjectuiv;
import de.verdox.polylwjgl3.gl.functions.gl.glGetTextureImage;
import de.verdox.polylwjgl3.gl.functions.gl.glGetTextureLevelParameterf;
import de.verdox.polylwjgl3.gl.functions.gl.glGetTextureLevelParameterfv;
import de.verdox.polylwjgl3.gl.functions.gl.glGetTextureLevelParameteri;
import de.verdox.polylwjgl3.gl.functions.gl.glGetTextureLevelParameteriv;
import de.verdox.polylwjgl3.gl.functions.gl.glGetTextureParameterIi;
import de.verdox.polylwjgl3.gl.functions.gl.glGetTextureParameterIiv;
import de.verdox.polylwjgl3.gl.functions.gl.glGetTextureParameterIui;
import de.verdox.polylwjgl3.gl.functions.gl.glGetTextureParameterIuiv;
import de.verdox.polylwjgl3.gl.functions.gl.glGetTextureParameterf;
import de.verdox.polylwjgl3.gl.functions.gl.glGetTextureParameterfv;
import de.verdox.polylwjgl3.gl.functions.gl.glGetTextureParameteri;
import de.verdox.polylwjgl3.gl.functions.gl.glGetTextureParameteriv;
import de.verdox.polylwjgl3.gl.functions.gl.glGetTextureSubImage;
import de.verdox.polylwjgl3.gl.functions.gl.glGetTransformFeedbacki64;
import de.verdox.polylwjgl3.gl.functions.gl.glGetTransformFeedbacki64_v;
import de.verdox.polylwjgl3.gl.functions.gl.glGetTransformFeedbacki;
import de.verdox.polylwjgl3.gl.functions.gl.glGetTransformFeedbacki_v;
import de.verdox.polylwjgl3.gl.functions.gl.glGetTransformFeedbackiv;
import de.verdox.polylwjgl3.gl.functions.gl.glGetVertexArrayIndexed64i;
import de.verdox.polylwjgl3.gl.functions.gl.glGetVertexArrayIndexed64iv;
import de.verdox.polylwjgl3.gl.functions.gl.glGetVertexArrayIndexedi;
import de.verdox.polylwjgl3.gl.functions.gl.glGetVertexArrayIndexediv;
import de.verdox.polylwjgl3.gl.functions.gl.glGetVertexArrayi;
import de.verdox.polylwjgl3.gl.functions.gl.glGetVertexArrayiv;
import de.verdox.polylwjgl3.gl.functions.gl.glGetnColorTable;
import de.verdox.polylwjgl3.gl.functions.gl.glGetnCompressedTexImage;
import de.verdox.polylwjgl3.gl.functions.gl.glGetnConvolutionFilter;
import de.verdox.polylwjgl3.gl.functions.gl.glGetnHistogram;
import de.verdox.polylwjgl3.gl.functions.gl.glGetnMapd;
import de.verdox.polylwjgl3.gl.functions.gl.glGetnMapdv;
import de.verdox.polylwjgl3.gl.functions.gl.glGetnMapf;
import de.verdox.polylwjgl3.gl.functions.gl.glGetnMapfv;
import de.verdox.polylwjgl3.gl.functions.gl.glGetnMapi;
import de.verdox.polylwjgl3.gl.functions.gl.glGetnMapiv;
import de.verdox.polylwjgl3.gl.functions.gl.glGetnMinmax;
import de.verdox.polylwjgl3.gl.functions.gl.glGetnPixelMapfv;
import de.verdox.polylwjgl3.gl.functions.gl.glGetnPixelMapuiv;
import de.verdox.polylwjgl3.gl.functions.gl.glGetnPixelMapusv;
import de.verdox.polylwjgl3.gl.functions.gl.glGetnPolygonStipple;
import de.verdox.polylwjgl3.gl.functions.gl.glGetnSeparableFilter;
import de.verdox.polylwjgl3.gl.functions.gl.glGetnTexImage;
import de.verdox.polylwjgl3.gl.functions.gl.glGetnUniformd;
import de.verdox.polylwjgl3.gl.functions.gl.glGetnUniformdv;
import de.verdox.polylwjgl3.gl.functions.gl.glGetnUniformi_CORE;
import de.verdox.polylwjgl3.gl.functions.gl.glGetnUniformiv_CORE;
import de.verdox.polylwjgl3.gl.functions.gl.glGetnUniformui_CORE;
import de.verdox.polylwjgl3.gl.functions.gl.glGetnUniformuiv_CORE;
import de.verdox.polylwjgl3.gl.functions.gl.glInvalidateNamedFramebufferData;
import de.verdox.polylwjgl3.gl.functions.gl.glInvalidateNamedFramebufferSubData;
import de.verdox.polylwjgl3.gl.functions.gl.glMapNamedBuffer;
import de.verdox.polylwjgl3.gl.functions.gl.glMapNamedBufferRange;
import de.verdox.polylwjgl3.gl.functions.gl.glNamedBufferData;
import de.verdox.polylwjgl3.gl.functions.gl.glNamedBufferStorage;
import de.verdox.polylwjgl3.gl.functions.gl.glNamedBufferSubData;
import de.verdox.polylwjgl3.gl.functions.gl.glNamedFramebufferDrawBuffer;
import de.verdox.polylwjgl3.gl.functions.gl.glNamedFramebufferDrawBuffers;
import de.verdox.polylwjgl3.gl.functions.gl.glNamedFramebufferParameteri;
import de.verdox.polylwjgl3.gl.functions.gl.glNamedFramebufferReadBuffer;
import de.verdox.polylwjgl3.gl.functions.gl.glNamedFramebufferRenderbuffer;
import de.verdox.polylwjgl3.gl.functions.gl.glNamedFramebufferTexture;
import de.verdox.polylwjgl3.gl.functions.gl.glNamedFramebufferTextureLayer;
import de.verdox.polylwjgl3.gl.functions.gl.glNamedRenderbufferStorage;
import de.verdox.polylwjgl3.gl.functions.gl.glNamedRenderbufferStorageMultisample;
import de.verdox.polylwjgl3.gl.functions.gl.glTextureBarrier;
import de.verdox.polylwjgl3.gl.functions.gl.glTextureBuffer;
import de.verdox.polylwjgl3.gl.functions.gl.glTextureBufferRange;
import de.verdox.polylwjgl3.gl.functions.gl.glTextureParameterIi;
import de.verdox.polylwjgl3.gl.functions.gl.glTextureParameterIiv;
import de.verdox.polylwjgl3.gl.functions.gl.glTextureParameterIui;
import de.verdox.polylwjgl3.gl.functions.gl.glTextureParameterIuiv;
import de.verdox.polylwjgl3.gl.functions.gl.glTextureParameterf;
import de.verdox.polylwjgl3.gl.functions.gl.glTextureParameterfv;
import de.verdox.polylwjgl3.gl.functions.gl.glTextureParameteri;
import de.verdox.polylwjgl3.gl.functions.gl.glTextureParameteriv;
import de.verdox.polylwjgl3.gl.functions.gl.glTextureStorage1D;
import de.verdox.polylwjgl3.gl.functions.gl.glTextureStorage2D;
import de.verdox.polylwjgl3.gl.functions.gl.glTextureStorage2DMultisample;
import de.verdox.polylwjgl3.gl.functions.gl.glTextureStorage3D;
import de.verdox.polylwjgl3.gl.functions.gl.glTextureStorage3DMultisample;
import de.verdox.polylwjgl3.gl.functions.gl.glTextureSubImage1D;
import de.verdox.polylwjgl3.gl.functions.gl.glTextureSubImage2D;
import de.verdox.polylwjgl3.gl.functions.gl.glTextureSubImage3D;
import de.verdox.polylwjgl3.gl.functions.gl.glTransformFeedbackBufferBase;
import de.verdox.polylwjgl3.gl.functions.gl.glTransformFeedbackBufferRange;
import de.verdox.polylwjgl3.gl.functions.gl.glUnmapNamedBuffer;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexArrayAttribBinding;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexArrayAttribFormat;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexArrayAttribIFormat;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexArrayAttribLFormat;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexArrayBindingDivisor;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexArrayElementBuffer;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexArrayVertexBuffer;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexArrayVertexBuffers;
import de.verdox.polylwjgl3.gl.functions.glGetGraphicsResetStatus;
import de.verdox.polylwjgl3.gl.functions.glGetnUniformf;
import de.verdox.polylwjgl3.gl.functions.glGetnUniformfv;
import de.verdox.polylwjgl3.gl.functions.glGetnUniformi;
import de.verdox.polylwjgl3.gl.functions.glGetnUniformiv;
import de.verdox.polylwjgl3.gl.functions.glGetnUniformui;
import de.verdox.polylwjgl3.gl.functions.glGetnUniformuiv;
import de.verdox.polylwjgl3.gl.functions.glMemoryBarrierByRegion;
import de.verdox.polylwjgl3.gl.functions.glReadnPixels;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL45;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

/**
 * OpenGL 4.5 Accessor — Direct State Access (DSA) everywhere, clip control, query-buffer reads,
 * robustness “Getn*” queries, regional barriers, and assorted modern quality-of-life APIs.
 *
 * <p>Extends {@link GL44Accessor}. OpenGL 4.5 completes the DSA transition: most objects can be
 * created, configured, and queried without temporary binding, reducing state churn and CPU overhead.</p>
 *
 * <h2>Rasterization & Synchronization Tweaks</h2>
 * <ul>
 *   <li>{@code glClipControl} — Choose clip-space origin (lower/upper-left) and depth mode (0..1 or −1..1).</li>
 *   <li>{@code glMemoryBarrierByRegion} — A finer-grained memory barrier affecting only overlapping pixels/tiles.</li>
 *   <li>{@code glTextureBarrier} — Enforce ordering for texture read-after-write hazards within a frame.</li>
 * </ul>
 *
 * <h2>Transform Feedback (DSA)</h2>
 * <ul>
 *   <li>{@code glCreateTransformFeedbacks} — Create TF objects without binding.</li>
 *   <li>{@code glTransformFeedbackBufferBase}, {@code glTransformFeedbackBufferRange} —
 *       Bind buffers (whole or ranged) to TF binding points.</li>
 *   <li>{@code glGetTransformFeedbackiv}, {@code glGetTransformFeedbacki},
 *       {@code glGetTransformFeedbacki_v}, {@code glGetTransformFeedbacki64_v}, {@code glGetTransformFeedbacki64} —
 *       Query TF object state.</li>
 * </ul>
 *
 * <h2>Buffers (DSA)</h2>
 * <ul>
 *   <li>{@code glCreateBuffers} — Create buffer names with storage unbound.</li>
 *   <li>{@code glNamedBufferStorage}, {@code glNamedBufferData}, {@code glNamedBufferSubData} —
 *       Allocate/resize/update buffer contents without binding.</li>
 *   <li>{@code glCopyNamedBufferSubData} — GPU-side copies between named buffers.</li>
 *   <li>{@code glClearNamedBufferData}, {@code glClearNamedBufferSubData} — Fast clears on named buffers.</li>
 *   <li>{@code glMapNamedBuffer}, {@code glMapNamedBufferRange}, {@code glUnmapNamedBuffer},
 *       {@code glFlushMappedNamedBufferRange} — Map and flush named buffers.</li>
 *   <li>{@code glGetNamedBufferParameteriv}/{@code i64v}, {@code glGetNamedBufferPointerv},
 *       {@code glGetNamedBufferSubData} — Query and read back named buffer state/data.</li>
 * </ul>
 *
 * <h2>Framebuffers & Renderbuffers (DSA)</h2>
 * <ul>
 *   <li>{@code glCreateFramebuffers}, {@code glCreateRenderbuffers} — Create without binding.</li>
 *   <li>{@code glNamedFramebufferTexture}, {@code glNamedFramebufferTextureLayer},
 *       {@code glNamedFramebufferRenderbuffer} — Attach resources to FBOs directly.</li>
 *   <li>{@code glNamedFramebufferParameteri}, {@code glNamedFramebufferDrawBuffer(s)},
 *       {@code glNamedFramebufferReadBuffer} — Configure FBO parameters and buffers.</li>
 *   <li>{@code glInvalidateNamedFramebufferData}, {@code glInvalidateNamedFramebufferSubData} — Hint discard regions.</li>
 *   <li>{@code glClearNamedFramebufferiv/uiv/fv/fi} — Typed clears on named FBOs.</li>
 *   <li>{@code glBlitNamedFramebuffer} — Blit between named FBOs; resolves, copies, scales.</li>
 *   <li>{@code glCheckNamedFramebufferStatus} — Completeness check without binding.</li>
 *   <li>{@code glGetNamedFramebufferParameteriv}/{@code i}, {@code glGetNamedFramebufferAttachmentParameteriv}/{@code i} — Query FBO/attachment state.</li>
 *   <li>{@code glNamedRenderbufferStorage}, {@code glNamedRenderbufferStorageMultisample} — Allocate RBO storage.</li>
 *   <li>{@code glGetNamedRenderbufferParameteriv}/{@code i} — Query RBO parameters.</li>
 * </ul>
 *
 * <h2>Textures & Samplers (DSA)</h2>
 * <ul>
 *   <li>{@code glCreateTextures} — Allocate texture names with a target baked in.</li>
 *   <li>{@code glTextureStorage1D/2D/3D}, {@code glTextureStorage2DMultisample/3DMultisample} —
 *       Immutable storage for named textures.</li>
 *   <li>{@code glTextureSubImage1D/2D/3D}, {@code glCompressedTextureSubImage1D/2D/3D},
 *       {@code glCopyTextureSubImage1D/2D/3D} — Update/copy sub-regions of named textures.</li>
 *   <li>{@code glTextureBuffer}, {@code glTextureBufferRange} — Bind (range of) buffer as a texel buffer.</li>
 *   <li>{@code glTextureParameterf/i/...}, {@code glTextureParameterIiv/Iuiv} — Set parameters on named textures.</li>
 *   <li>{@code glGenerateTextureMipmap} — Generate mipmaps without binding.</li>
 *   <li>{@code glBindTextureUnit} — Bind a texture to a texture unit in one call.</li>
 *   <li>{@code glGetTextureImage}, {@code glGetCompressedTextureImage} — Read full images from named textures.</li>
 *   <li>{@code glGetTextureSubImage}, {@code glGetCompressedTextureSubImage} — Read sub-rectangles from named textures.</li>
 *   <li>{@code glGetTextureLevelParameter*f/i}, {@code glGetTextureParameter*f/i/Iiv/Iuiv} — Query texture parameters.</li>
 *   <li>{@code glCreateSamplers} — Create sampler objects without binding.</li>
 * </ul>
 *
 * <h2>Vertex Arrays (DSA)</h2>
 * <ul>
 *   <li>{@code glCreateVertexArrays} — Create VAOs without binding.</li>
 *   <li>{@code glVertexArrayVertexBuffer(s)} — Attach one or many vertex buffers with offsets/strides to a VAO.</li>
 *   <li>{@code glVertexArrayElementBuffer} — Attach an element/index buffer to a VAO.</li>
 *   <li>{@code glVertexArrayAttribFormat/IFormat/LFormat}, {@code glVertexArrayAttribBinding} —
 *       Describe attribute formats and route them to buffer bindings.</li>
 *   <li>{@code glEnableVertexArrayAttrib}, {@code glDisableVertexArrayAttrib} — Toggle attributes on a VAO.</li>
 *   <li>{@code glVertexArrayBindingDivisor} — Per-binding instancing divisor.</li>
 *   <li>{@code glGetVertexArrayiv/i}, {@code glGetVertexArrayIndexediv/indexedi/indexed64iv/indexed64i} — Query VAO state.</li>
 * </ul>
 *
 * <h2>Program Pipelines, Samplers, and Queries (creation helpers)</h2>
 * <ul>
 *   <li>{@code glCreateProgramPipelines} — Create pipeline objects directly.</li>
 *   <li>{@code glCreateQueries} — Allocate query objects for a target.</li>
 *   <li>{@code glCreateSamplers} — See Textures & Samplers.</li>
 * </ul>
 *
 * <h2>Query Results to Buffers</h2>
 * <ul>
 *   <li>{@code glGetQueryBufferObjectiv/uiv/i64v/ui64v} — Write query results directly into a buffer object.</li>
 * </ul>
 *
 * <h2>Robustness & Diagnostics</h2>
 * <ul>
 *   <li>{@code glGetGraphicsResetStatus} — Detect GPU reset/robustness events.</li>
 *   <li>{@code glGetn*} family — Size-limited “safe” getters for legacy states and pixel/texture/map reads:
 *       {@code glGetnMap*}, {@code glGetnPixelMap*}, {@code glGetnPolygonStipple}, {@code glGetnTexImage},
 *       {@code glReadnPixels}, {@code glGetnColorTable}, {@code glGetnConvolutionFilter},
 *       {@code glGetnSeparableFilter}, {@code glGetnHistogram}, {@code glGetnMinmax},
 *       {@code glGetnCompressedTexImage}, {@code glGetnUniform*} (float/double/int/uint and CORE variants).</li>
 * </ul>
 *
 * <h3>Notes</h3>
 * <ul>
 *   <li>DSA (“named*” and “Create*”) avoids bind-to-edit; it’s generally preferred for clarity and performance.</li>
 *   <li>Use {@code glGetGraphicsResetStatus} and the {@code glGetn*} APIs to build robust applications that survive GPU resets
 *       and avoid buffer overruns on reads.</li>
 *   <li>Query-to-buffer reads integrate naturally with indirect/multi-draw and GPU-driven pipelines.</li>
 *   <li>{@code glClipControl} helps match coordinate conventions across APIs (e.g., Vulkan/D3D vs. GL).</li>
 * </ul>
 */
public interface GL45Accessor extends GL44Accessor, glClipControl, glCreateTransformFeedbacks, glTransformFeedbackBufferBase, glTransformFeedbackBufferRange, glGetTransformFeedbackiv, glGetTransformFeedbacki, glGetTransformFeedbacki_v, glGetTransformFeedbacki64_v, glGetTransformFeedbacki64, glCreateBuffers, glNamedBufferStorage, glNamedBufferData, glNamedBufferSubData, glCopyNamedBufferSubData, glClearNamedBufferData, glClearNamedBufferSubData, glMapNamedBuffer, glMapNamedBufferRange, glUnmapNamedBuffer, glFlushMappedNamedBufferRange, glGetNamedBufferParameteriv, glGetNamedBufferParameteri, glGetNamedBufferParameteri64v, glGetNamedBufferParameteri64, glGetNamedBufferPointerv, glGetNamedBufferPointer, glGetNamedBufferSubData, glCreateFramebuffers, glNamedFramebufferRenderbuffer, glNamedFramebufferParameteri, glNamedFramebufferTexture, glNamedFramebufferTextureLayer, glNamedFramebufferDrawBuffer, glNamedFramebufferDrawBuffers, glNamedFramebufferReadBuffer, glInvalidateNamedFramebufferData, glInvalidateNamedFramebufferSubData, glClearNamedFramebufferiv, glClearNamedFramebufferuiv, glClearNamedFramebufferfv, glClearNamedFramebufferfi, glBlitNamedFramebuffer, glCheckNamedFramebufferStatus, glGetNamedFramebufferParameteriv, glGetNamedFramebufferParameteri, glGetNamedFramebufferAttachmentParameteriv, glGetNamedFramebufferAttachmentParameteri, glCreateRenderbuffers, glNamedRenderbufferStorage, glNamedRenderbufferStorageMultisample, glGetNamedRenderbufferParameteriv, glGetNamedRenderbufferParameteri, glCreateTextures, glTextureBuffer, glTextureBufferRange, glTextureStorage1D, glTextureStorage2D, glTextureStorage3D, glTextureStorage2DMultisample, glTextureStorage3DMultisample, glTextureSubImage1D, glTextureSubImage2D, glTextureSubImage3D, glCompressedTextureSubImage1D, glCompressedTextureSubImage2D, glCompressedTextureSubImage3D, glCopyTextureSubImage1D, glCopyTextureSubImage2D, glCopyTextureSubImage3D, glTextureParameterf, glTextureParameterfv, glTextureParameteri, glTextureParameterIiv, glTextureParameterIi, glTextureParameterIuiv, glTextureParameterIui, glTextureParameteriv, glGenerateTextureMipmap, glBindTextureUnit, glGetTextureImage, glGetCompressedTextureImage, glGetTextureLevelParameterfv, glGetTextureLevelParameterf, glGetTextureLevelParameteriv, glGetTextureLevelParameteri, glGetTextureParameterfv, glGetTextureParameterf, glGetTextureParameterIiv, glGetTextureParameterIi, glGetTextureParameterIuiv, glGetTextureParameterIui, glGetTextureParameteriv, glGetTextureParameteri, glCreateVertexArrays, glDisableVertexArrayAttrib, glEnableVertexArrayAttrib, glVertexArrayElementBuffer, glVertexArrayVertexBuffer, glVertexArrayVertexBuffers, glVertexArrayAttribFormat, glVertexArrayAttribIFormat, glVertexArrayAttribLFormat, glVertexArrayAttribBinding, glVertexArrayBindingDivisor, glGetVertexArrayiv, glGetVertexArrayi, glGetVertexArrayIndexediv, glGetVertexArrayIndexedi, glGetVertexArrayIndexed64iv, glGetVertexArrayIndexed64i, glCreateSamplers, glCreateProgramPipelines, glCreateQueries, glGetQueryBufferObjectiv, glGetQueryBufferObjectuiv, glGetQueryBufferObjecti64v, glGetQueryBufferObjectui64v, glMemoryBarrierByRegion, glGetTextureSubImage, glGetCompressedTextureSubImage, glTextureBarrier, glGetGraphicsResetStatus, glGetnMapdv, glGetnMapd, glGetnMapfv, glGetnMapf, glGetnMapiv, glGetnMapi, glGetnPixelMapfv, glGetnPixelMapuiv, glGetnPixelMapusv, glGetnPolygonStipple, glGetnTexImage, glReadnPixels, glGetnColorTable, glGetnConvolutionFilter, glGetnSeparableFilter, glGetnHistogram, glGetnMinmax, glGetnCompressedTexImage, glGetnUniformfv, glGetnUniformf, glGetnUniformdv, glGetnUniformd, glGetnUniformiv, glGetnUniformiv_CORE, glGetnUniformi, glGetnUniformi_CORE, glGetnUniformuiv, glGetnUniformuiv_CORE, glGetnUniformui, glGetnUniformui_CORE {

}
