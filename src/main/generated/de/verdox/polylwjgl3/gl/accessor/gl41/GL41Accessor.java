package de.verdox.polylwjgl3.gl.accessor.gl41;

import de.verdox.polylwjgl3.gl.accessor.gl40.GL40Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl40.GL40AccessorImpl;
import de.verdox.polylwjgl3.gl.functions.gl.glDepthRangeArrayv;
import de.verdox.polylwjgl3.gl.functions.gl.glDepthRangeIndexed;
import de.verdox.polylwjgl3.gl.functions.gl.glGetDoublei;
import de.verdox.polylwjgl3.gl.functions.gl.glGetDoublei_v;
import de.verdox.polylwjgl3.gl.functions.gl.glGetFloati;
import de.verdox.polylwjgl3.gl.functions.gl.glGetFloati_v;
import de.verdox.polylwjgl3.gl.functions.gl.glGetShaderPrecisionFormat_CORE;
import de.verdox.polylwjgl3.gl.functions.gl.glGetVertexAttribLdv;
import de.verdox.polylwjgl3.gl.functions.gl.glProgramUniform1d;
import de.verdox.polylwjgl3.gl.functions.gl.glProgramUniform1dv;
import de.verdox.polylwjgl3.gl.functions.gl.glProgramUniform2d;
import de.verdox.polylwjgl3.gl.functions.gl.glProgramUniform2dv;
import de.verdox.polylwjgl3.gl.functions.gl.glProgramUniform3d;
import de.verdox.polylwjgl3.gl.functions.gl.glProgramUniform3dv;
import de.verdox.polylwjgl3.gl.functions.gl.glProgramUniform4d;
import de.verdox.polylwjgl3.gl.functions.gl.glProgramUniform4dv;
import de.verdox.polylwjgl3.gl.functions.gl.glProgramUniformMatrix2dv;
import de.verdox.polylwjgl3.gl.functions.gl.glProgramUniformMatrix2x3dv;
import de.verdox.polylwjgl3.gl.functions.gl.glProgramUniformMatrix2x4dv;
import de.verdox.polylwjgl3.gl.functions.gl.glProgramUniformMatrix3dv;
import de.verdox.polylwjgl3.gl.functions.gl.glProgramUniformMatrix3x2dv;
import de.verdox.polylwjgl3.gl.functions.gl.glProgramUniformMatrix3x4dv;
import de.verdox.polylwjgl3.gl.functions.gl.glProgramUniformMatrix4dv;
import de.verdox.polylwjgl3.gl.functions.gl.glProgramUniformMatrix4x2dv;
import de.verdox.polylwjgl3.gl.functions.gl.glProgramUniformMatrix4x3dv;
import de.verdox.polylwjgl3.gl.functions.gl.glScissorArrayv;
import de.verdox.polylwjgl3.gl.functions.gl.glScissorIndexed;
import de.verdox.polylwjgl3.gl.functions.gl.glScissorIndexedv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttribL1d;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttribL1dv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttribL2d;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttribL2dv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttribL3d;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttribL3dv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttribL4d;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttribL4dv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttribLPointer;
import de.verdox.polylwjgl3.gl.functions.gl.glViewportArrayv;
import de.verdox.polylwjgl3.gl.functions.gl.glViewportIndexedf;
import de.verdox.polylwjgl3.gl.functions.gl.glViewportIndexedfv;
import de.verdox.polylwjgl3.gl.functions.glActiveShaderProgram;
import de.verdox.polylwjgl3.gl.functions.glBindProgramPipeline;
import de.verdox.polylwjgl3.gl.functions.glClearDepthf;
import de.verdox.polylwjgl3.gl.functions.glCreateShaderProgramv;
import de.verdox.polylwjgl3.gl.functions.glDeleteProgramPipelines;
import de.verdox.polylwjgl3.gl.functions.glDepthRangef;
import de.verdox.polylwjgl3.gl.functions.glGenProgramPipelines;
import de.verdox.polylwjgl3.gl.functions.glGetProgramBinary;
import de.verdox.polylwjgl3.gl.functions.glGetProgramPipelineInfoLog;
import de.verdox.polylwjgl3.gl.functions.glGetProgramPipelinei;
import de.verdox.polylwjgl3.gl.functions.glGetProgramPipelineiv;
import de.verdox.polylwjgl3.gl.functions.glGetShaderPrecisionFormat;
import de.verdox.polylwjgl3.gl.functions.glIsProgramPipeline;
import de.verdox.polylwjgl3.gl.functions.glProgramBinary;
import de.verdox.polylwjgl3.gl.functions.glProgramParameteri;
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
import de.verdox.polylwjgl3.gl.functions.glReleaseShaderCompiler;
import de.verdox.polylwjgl3.gl.functions.glShaderBinary;
import de.verdox.polylwjgl3.gl.functions.glUseProgramStages;
import de.verdox.polylwjgl3.gl.functions.glValidateProgramPipeline;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL41;
import org.lwjgl.system.*;

/**
 * OpenGL 4.1 Accessor — Shader binaries/precision queries, float-depth variants,
 * program binaries, separable programs & program pipelines, program-scope uniform updates,
 * double-precision vertex attributes, and indexed viewport/scissor/depth-range arrays.
 *
 * <p>Extends {@link GL40Accessor} with cross-platform utilities (ES compatibility),
 * offline shader/program workflows, pipeline objectization, and expanded per-viewport controls.</p>
 *
 * <h2>Shader Management & Precision Queries</h2>
 * <ul>
 *   <li>{@code glReleaseShaderCompiler} — Hint that the implementation may free internal shader compiler resources.</li>
 *   <li>{@code glShaderBinary} — Load precompiled/binary shader images (implementation-defined formats).</li>
 *   <li>{@code glGetShaderPrecisionFormat}, {@code glGetShaderPrecisionFormat_CORE} —
 *       Query numeric precision/range for shader types and precisions (useful for ES-style precision qualifiers).</li>
 * </ul>
 *
 * <h2>Float Depth Utilities (ES Compatibility)</h2>
 * <ul>
 *   <li>{@code glDepthRangef} — Set depth mapping range using single-precision floats.</li>
 *   <li>{@code glClearDepthf} — Specify the depth clear value as a float.</li>
 * </ul>
 *
 * <h2>Program Binaries</h2>
 * <ul>
 *   <li>{@code glGetProgramBinary}, {@code glProgramBinary} —
 *       Retrieve and load program binaries for faster application startup (offline caching).</li>
 *   <li>{@code glProgramParameteri} — Control program parameters (e.g., mark program separable).</li>
 * </ul>
 *
 * <h2>Separable Programs & Program Pipelines</h2>
 * <ul>
 *   <li>{@code glUseProgramStages}, {@code glActiveShaderProgram} —
 *       Bind specific stages from separable programs into a pipeline, and select the program
 *       targeted by program-uniform updates.</li>
 *   <li>{@code glCreateShaderProgramv} — Create and link a separable program from source in one call.</li>
 *   <li>{@code glBindProgramPipeline}, {@code glGenProgramPipelines}, {@code glDeleteProgramPipelines}, {@code glIsProgramPipeline} —
 *       Manage program pipeline objects.</li>
 *   <li>{@code glGetProgramPipelineiv}/{@code glGetProgramPipelinei}, {@code glValidateProgramPipeline},
 *       {@code glGetProgramPipelineInfoLog} — Inspect/validate pipelines and retrieve diagnostic logs.</li>
 * </ul>
 *
 * <h2>Program-Scoped Uniform Updates</h2>
 * <ul>
 *   <li>{@code glProgramUniform1/2/3/4i}, {@code glProgramUniform1/2/3/4ui}, {@code glProgramUniform1/2/3/4f},
 *       {@code glProgramUniform1/2/3/4d} and their array forms —
 *       Set uniforms on a specific program object without binding it with {@code glUseProgram}.</li>
 *   <li>{@code glProgramUniformMatrix*fv}, {@code glProgramUniformMatrix*dv} (square and non-square) —
 *       Upload matrices directly to a program object.</li>
 * </ul>
 *
 * <h2>Double-Precision Vertex Attributes</h2>
 * <ul>
 *   <li>{@code glVertexAttribL1/2/3/4d}, {@code glVertexAttribL1/2/3/4dv} —
 *       Specify generic vertex attributes in double precision.</li>
 *   <li>{@code glVertexAttribLPointer} — Define array-backed double-precision attribute data.</li>
 *   <li>{@code glGetVertexAttribLdv} — Query double-precision attribute state.</li>
 * </ul>
 *
 * <h2>Indexed Viewports, Scissors, and Depth Ranges</h2>
 * <ul>
 *   <li>{@code glViewportArrayv}, {@code glViewportIndexedf}, {@code glViewportIndexedfv} —
 *       Define per-viewport rectangles (multi-viewport rendering).</li>
 *   <li>{@code glScissorArrayv}, {@code glScissorIndexed}, {@code glScissorIndexedv} —
 *       Per-viewport scissor rectangles.</li>
 *   <li>{@code glDepthRangeArrayv}, {@code glDepthRangeIndexed} —
 *       Per-viewport depth range mapping.</li>
 *   <li>{@code glGetFloati_v}/{@code glGetFloati}, {@code glGetDoublei_v}/{@code glGetDoublei} —
 *       Query indexed floating-point state (e.g., viewport, depth range) per index.</li>
 * </ul>
 *
 * <h3>Notes</h3>
 * <ul>
 *   <li>Mark programs as {@code GL_PROGRAM_SEPARABLE} to use them in pipelines; otherwise they can only be used via {@code glUseProgram}.</li>
 *   <li>Program binaries are implementation-specific; cache and reload only when the binary format matches the current driver.</li>
 *   <li>Program-uniform entry points simplify state management in multi-program, multi-pipeline scenarios.</li>
 *   <li>Indexed viewport/scissor/depth-range enable multi-viewport techniques like stereoscopic or split-screen rendering.</li>
 * </ul>
 */
public interface GL41Accessor extends GL40Accessor, glReleaseShaderCompiler, glShaderBinary, glGetShaderPrecisionFormat, glGetShaderPrecisionFormat_CORE, glDepthRangef, glClearDepthf, glGetProgramBinary, glProgramBinary, glProgramParameteri, glUseProgramStages, glActiveShaderProgram, glCreateShaderProgramv, glBindProgramPipeline, glDeleteProgramPipelines, glGenProgramPipelines, glIsProgramPipeline, glGetProgramPipelineiv, glGetProgramPipelinei, glProgramUniform1i, glProgramUniform2i, glProgramUniform3i, glProgramUniform4i, glProgramUniform1ui, glProgramUniform2ui, glProgramUniform3ui, glProgramUniform4ui, glProgramUniform1f, glProgramUniform2f, glProgramUniform3f, glProgramUniform4f, glProgramUniform1d, glProgramUniform2d, glProgramUniform3d, glProgramUniform4d, glProgramUniform1iv, glProgramUniform2iv, glProgramUniform3iv, glProgramUniform4iv, glProgramUniform1uiv, glProgramUniform2uiv, glProgramUniform3uiv, glProgramUniform4uiv, glProgramUniform1fv, glProgramUniform2fv, glProgramUniform3fv, glProgramUniform4fv, glProgramUniform1dv, glProgramUniform2dv, glProgramUniform3dv, glProgramUniform4dv, glProgramUniformMatrix2fv, glProgramUniformMatrix3fv, glProgramUniformMatrix4fv, glProgramUniformMatrix2dv, glProgramUniformMatrix3dv, glProgramUniformMatrix4dv, glProgramUniformMatrix2x3fv, glProgramUniformMatrix3x2fv, glProgramUniformMatrix2x4fv, glProgramUniformMatrix4x2fv, glProgramUniformMatrix3x4fv, glProgramUniformMatrix4x3fv, glProgramUniformMatrix2x3dv, glProgramUniformMatrix3x2dv, glProgramUniformMatrix2x4dv, glProgramUniformMatrix4x2dv, glProgramUniformMatrix3x4dv, glProgramUniformMatrix4x3dv, glValidateProgramPipeline, glGetProgramPipelineInfoLog, glVertexAttribL1d, glVertexAttribL2d, glVertexAttribL3d, glVertexAttribL4d, glVertexAttribL1dv, glVertexAttribL2dv, glVertexAttribL3dv, glVertexAttribL4dv, glVertexAttribLPointer, glGetVertexAttribLdv, glViewportArrayv, glViewportIndexedf, glViewportIndexedfv, glScissorArrayv, glScissorIndexed, glScissorIndexedv, glDepthRangeArrayv, glDepthRangeIndexed, glGetFloati_v, glGetFloati, glGetDoublei_v, glGetDoublei {

}
