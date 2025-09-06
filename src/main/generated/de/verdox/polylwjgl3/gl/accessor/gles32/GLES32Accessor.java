package de.verdox.polylwjgl3.gl.accessor.gles32;

import de.verdox.polylwjgl3.gl.accessor.gles31.GLES31Accessor;
import de.verdox.polylwjgl3.gl.accessor.gles31.GLES31AccessorImpl;
import de.verdox.polylwjgl3.gl.functions.glBlendEquationSeparatei;
import de.verdox.polylwjgl3.gl.functions.glBlendEquationi;
import de.verdox.polylwjgl3.gl.functions.glBlendFuncSeparatei;
import de.verdox.polylwjgl3.gl.functions.glBlendFunci;
import de.verdox.polylwjgl3.gl.functions.glColorMaski;
import de.verdox.polylwjgl3.gl.functions.glCopyImageSubData;
import de.verdox.polylwjgl3.gl.functions.glDebugMessageCallback;
import de.verdox.polylwjgl3.gl.functions.glDebugMessageControl;
import de.verdox.polylwjgl3.gl.functions.glDebugMessageInsert;
import de.verdox.polylwjgl3.gl.functions.glDisablei;
import de.verdox.polylwjgl3.gl.functions.glDrawElementsBaseVertex;
import de.verdox.polylwjgl3.gl.functions.glDrawElementsInstancedBaseVertex;
import de.verdox.polylwjgl3.gl.functions.glDrawRangeElementsBaseVertex;
import de.verdox.polylwjgl3.gl.functions.glEnablei;
import de.verdox.polylwjgl3.gl.functions.glFramebufferTexture;
import de.verdox.polylwjgl3.gl.functions.glGetDebugMessageLog;
import de.verdox.polylwjgl3.gl.functions.glGetGraphicsResetStatus;
import de.verdox.polylwjgl3.gl.functions.glGetObjectLabel;
import de.verdox.polylwjgl3.gl.functions.glGetObjectPtrLabel;
import de.verdox.polylwjgl3.gl.functions.glGetPointer;
import de.verdox.polylwjgl3.gl.functions.glGetPointerv;
import de.verdox.polylwjgl3.gl.functions.glGetSamplerParameterIi;
import de.verdox.polylwjgl3.gl.functions.glGetSamplerParameterIiv;
import de.verdox.polylwjgl3.gl.functions.glGetSamplerParameterIui;
import de.verdox.polylwjgl3.gl.functions.glGetSamplerParameterIuiv;
import de.verdox.polylwjgl3.gl.functions.glGetTexParameterIi;
import de.verdox.polylwjgl3.gl.functions.glGetTexParameterIiv;
import de.verdox.polylwjgl3.gl.functions.glGetTexParameterIui;
import de.verdox.polylwjgl3.gl.functions.glGetTexParameterIuiv;
import de.verdox.polylwjgl3.gl.functions.glGetnUniformf;
import de.verdox.polylwjgl3.gl.functions.glGetnUniformfv;
import de.verdox.polylwjgl3.gl.functions.glGetnUniformi;
import de.verdox.polylwjgl3.gl.functions.glGetnUniformiv;
import de.verdox.polylwjgl3.gl.functions.glGetnUniformui;
import de.verdox.polylwjgl3.gl.functions.glGetnUniformuiv;
import de.verdox.polylwjgl3.gl.functions.glIsEnabledi;
import de.verdox.polylwjgl3.gl.functions.glMinSampleShading;
import de.verdox.polylwjgl3.gl.functions.glObjectLabel;
import de.verdox.polylwjgl3.gl.functions.glObjectPtrLabel;
import de.verdox.polylwjgl3.gl.functions.glPatchParameteri;
import de.verdox.polylwjgl3.gl.functions.glPopDebugGroup;
import de.verdox.polylwjgl3.gl.functions.glPushDebugGroup;
import de.verdox.polylwjgl3.gl.functions.glReadnPixels;
import de.verdox.polylwjgl3.gl.functions.glSamplerParameterIiv;
import de.verdox.polylwjgl3.gl.functions.glSamplerParameterIuiv;
import de.verdox.polylwjgl3.gl.functions.glTexBuffer;
import de.verdox.polylwjgl3.gl.functions.glTexBufferRange;
import de.verdox.polylwjgl3.gl.functions.glTexParameterIi;
import de.verdox.polylwjgl3.gl.functions.glTexParameterIiv;
import de.verdox.polylwjgl3.gl.functions.glTexParameterIui;
import de.verdox.polylwjgl3.gl.functions.glTexParameterIuiv;
import de.verdox.polylwjgl3.gl.functions.glTexStorage3DMultisample;
import de.verdox.polylwjgl3.gl.functions.gles.glBlendBarrier;
import de.verdox.polylwjgl3.gl.functions.gles.glDebugMessageCallback_ES;
import de.verdox.polylwjgl3.gl.functions.gles.glGetnUniformi_ES;
import de.verdox.polylwjgl3.gl.functions.gles.glGetnUniformiv_ES;
import de.verdox.polylwjgl3.gl.functions.gles.glGetnUniformui_ES;
import de.verdox.polylwjgl3.gl.functions.gles.glGetnUniformuiv_ES;
import de.verdox.polylwjgl3.gl.functions.gles.glPrimitiveBoundingBox;
import de.verdox.polylwjgl3.gl.functions.gles.glSamplerParameterIi;
import de.verdox.polylwjgl3.gl.functions.gles.glSamplerParameterIui;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengles.GLES32;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

/**
 * OpenGL ES 3.2 Accessor — Debug output & object labels, indexed/advanced blending,
 * base-vertex drawing, framebuffer attach convenience, primitive bounding boxes,
 * robustness “getn*”/readn pixels, integer texture/sampler params, TBOs, image copies,
 * and multisample 3D texture storage.
 *
 * <p>Extends {@link GLES31Accessor} with KHR_debug diagnostics, per-index blend/state
 * control, base-vertex indexed draws, ES geometry-friendly bounding boxes, and additional
 * robustness/format features that close the gap to desktop GL.</p>
 *
 * <h2>Debug Output & Object Labels (KHR_debug)</h2>
 * <ul>
 *   <li>{@code glDebugMessageControl}, {@code glDebugMessageInsert} — Filter/inject debug messages.</li>
 *   <li>{@code glDebugMessageCallback}, {@code glDebugMessageCallback_ES} — Register a callback for async GL diagnostics.
 *       The {@code _ES} variant uses the ES callback interface type.</li>
 *   <li>{@code glGetDebugMessageLog} — Pull messages when no callback is set.</li>
 *   <li>{@code glPushDebugGroup}, {@code glPopDebugGroup} — Scope messages for easy tracing.</li>
 *   <li>{@code glObjectLabel}, {@code glGetObjectLabel}, {@code glObjectPtrLabel}, {@code glGetObjectPtrLabel} — Name/query GL objects.</li>
 *   <li>{@code glGetPointerv}, {@code glGetPointer} — Query debug callback pointer and related function pointers.</li>
 * </ul>
 *
 * <h2>Indexed Blending & Per-Target State</h2>
 * <ul>
 *   <li>{@code glEnablei}, {@code glDisablei}, {@code glIsEnabledi} — Enable/disable/query capabilities per index.</li>
 *   <li>{@code glBlendEquationi}, {@code glBlendEquationSeparatei}, {@code glBlendFunci}, {@code glBlendFuncSeparatei} —
 *       Set blend equations/factors per draw buffer.</li>
 *   <li>{@code glColorMaski} — Per-attachment color write masks.</li>
 *   <li>{@code glBlendBarrier} — Define a barrier for advanced blending operations.</li>
 * </ul>
 *
 * <h2>Base-Vertex Indexed Drawing</h2>
 * <ul>
 *   <li>{@code glDrawElementsBaseVertex}, {@code glDrawRangeElementsBaseVertex},
 *       {@code glDrawElementsInstancedBaseVertex} — Add a constant base-vertex offset to indices
 *       (enables sub-meshes without rebasing index data).</li>
 * </ul>
 *
 * <h2>Framebuffer & Geometry Support</h2>
 * <ul>
 *   <li>{@code glFramebufferTexture} — Attach a texture level/layer to an FBO with a single entry point.</li>
 *   <li>{@code glPrimitiveBoundingBox} — Specify a bounding box for primitives (consumed by geometry/tessellation
 *       stages in ES for efficient clipping and correctness).</li>
 * </ul>
 *
 * <h2>Robustness Reads & Diagnostics</h2>
 * <ul>
 *   <li>{@code glReadnPixels} — Size-limited pixel reads that avoid buffer overruns.</li>
 *   <li>{@code glGetnUniformf/fv}, {@code glGetnUniformi/iv}, {@code glGetnUniformui/uiv} and ES variants
 *       ({@code *_ES}) — Robust, size-capped uniform queries.</li>
 *   <li>{@code glGetGraphicsResetStatus} — Detect and handle GPU reset conditions.</li>
 * </ul>
 *
 * <h2>Tessellation & Sample Shading Hooks</h2>
 * <ul>
 *   <li>{@code glPatchParameteri} — Configure tessellation control points (when tessellation stages are present).</li>
 *   <li>{@code glMinSampleShading} — Require a minimum fraction of samples to be shaded per fragment.</li>
 * </ul>
 *
 * <h2>Integer Texture/Sampler Parameters</h2>
 * <ul>
 *   <li>{@code glTexParameterIiv/Iuiv} and getters {@code glGetTexParameterIiv/Iuiv} —
 *       Set/query integer forms of texture parameters.</li>
 *   <li>{@code glSamplerParameterIiv/Iuiv} and getters {@code glGetSamplerParameterIiv/Iuiv} —
 *       Integer parameter variants for sampler objects.</li>
 * </ul>
 *
 * <h2>Texture Buffer Objects & Ranges</h2>
 * <ul>
 *   <li>{@code glTexBuffer} — Bind a buffer as a 1D texel array (TBO).</li>
 *   <li>{@code glTexBufferRange} — Bind a subrange of a buffer as a TBO.</li>
 * </ul>
 *
 * <h2>Image/Texture Utilities & Multisample Storage</h2>
 * <ul>
 *   <li>{@code glCopyImageSubData} — Copy texel rectangles between images (compatible formats/targets).</li>
 *   <li>{@code glTexStorage3DMultisample} — Immutable storage for multisampled 3D textures.</li>
 * </ul>
 *
 * <h3>Notes</h3>
 * <ul>
 *   <li>Use the appropriate “getn”/“readn” APIs when building robust paths to prevent buffer overreads.</li>
 *   <li>Base-vertex draws pair well with shared vertex/index buffers and instancing.</li>
 *   <li>{@code glPrimitiveBoundingBox} must be kept in sync with your scene bounds when geometry/tess stages are active.</li>
 *   <li>When using debug output, label objects and group regions to streamline driver diagnostics.</li>
 * </ul>
 */
public interface GLES32Accessor extends GLES31Accessor, glBlendBarrier, glCopyImageSubData, glDebugMessageControl, glDebugMessageInsert, glDebugMessageCallback, glDebugMessageCallback_ES, glGetDebugMessageLog, glGetPointerv, glGetPointer, glPushDebugGroup, glPopDebugGroup, glObjectLabel, glGetObjectLabel, glObjectPtrLabel, glGetObjectPtrLabel, glEnablei, glDisablei, glBlendEquationi, glBlendEquationSeparatei, glBlendFunci, glBlendFuncSeparatei, glColorMaski, glIsEnabledi, glDrawElementsBaseVertex, glDrawRangeElementsBaseVertex, glDrawElementsInstancedBaseVertex, glFramebufferTexture, glPrimitiveBoundingBox, glGetGraphicsResetStatus, glReadnPixels, glGetnUniformfv, glGetnUniformf, glGetnUniformiv, glGetnUniformiv_ES, glGetnUniformi, glGetnUniformi_ES, glGetnUniformuiv, glGetnUniformuiv_ES, glGetnUniformui, glGetnUniformui_ES, glMinSampleShading, glPatchParameteri, glTexParameterIiv, glTexParameterIi, glTexParameterIuiv, glTexParameterIui, glGetTexParameterIiv, glGetTexParameterIi, glGetTexParameterIuiv, glGetTexParameterIui, glSamplerParameterIiv, glSamplerParameterIi, glSamplerParameterIuiv, glSamplerParameterIui, glGetSamplerParameterIiv, glGetSamplerParameterIi, glGetSamplerParameterIuiv, glGetSamplerParameterIui, glTexBuffer, glTexBufferRange, glTexStorage3DMultisample {

}
