package de.verdox.polylwjgl3.gl.accessor.gl40;

import de.verdox.polylwjgl3.gl.accessor.gl33.GL33Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl33.GL33AccessorImpl;
import de.verdox.polylwjgl3.gl.functions.gl.glBeginQueryIndexed;
import de.verdox.polylwjgl3.gl.functions.gl.glDrawTransformFeedback;
import de.verdox.polylwjgl3.gl.functions.gl.glDrawTransformFeedbackStream;
import de.verdox.polylwjgl3.gl.functions.gl.glEndQueryIndexed;
import de.verdox.polylwjgl3.gl.functions.gl.glGetActiveSubroutineName;
import de.verdox.polylwjgl3.gl.functions.gl.glGetActiveSubroutineUniformName;
import de.verdox.polylwjgl3.gl.functions.gl.glGetActiveSubroutineUniformi;
import de.verdox.polylwjgl3.gl.functions.gl.glGetActiveSubroutineUniformiv;
import de.verdox.polylwjgl3.gl.functions.gl.glGetProgramStagei;
import de.verdox.polylwjgl3.gl.functions.gl.glGetProgramStageiv;
import de.verdox.polylwjgl3.gl.functions.gl.glGetQueryIndexedi;
import de.verdox.polylwjgl3.gl.functions.gl.glGetQueryIndexediv;
import de.verdox.polylwjgl3.gl.functions.gl.glGetSubroutineIndex;
import de.verdox.polylwjgl3.gl.functions.gl.glGetSubroutineUniformLocation;
import de.verdox.polylwjgl3.gl.functions.gl.glGetUniformSubroutineui;
import de.verdox.polylwjgl3.gl.functions.gl.glGetUniformSubroutineuiv;
import de.verdox.polylwjgl3.gl.functions.gl.glGetUniformd;
import de.verdox.polylwjgl3.gl.functions.gl.glGetUniformdv;
import de.verdox.polylwjgl3.gl.functions.gl.glPatchParameterfv;
import de.verdox.polylwjgl3.gl.functions.gl.glUniform1d;
import de.verdox.polylwjgl3.gl.functions.gl.glUniform1dv;
import de.verdox.polylwjgl3.gl.functions.gl.glUniform2d;
import de.verdox.polylwjgl3.gl.functions.gl.glUniform2dv;
import de.verdox.polylwjgl3.gl.functions.gl.glUniform3d;
import de.verdox.polylwjgl3.gl.functions.gl.glUniform3dv;
import de.verdox.polylwjgl3.gl.functions.gl.glUniform4d;
import de.verdox.polylwjgl3.gl.functions.gl.glUniform4dv;
import de.verdox.polylwjgl3.gl.functions.gl.glUniformMatrix2dv;
import de.verdox.polylwjgl3.gl.functions.gl.glUniformMatrix2x3dv;
import de.verdox.polylwjgl3.gl.functions.gl.glUniformMatrix2x4dv;
import de.verdox.polylwjgl3.gl.functions.gl.glUniformMatrix3dv;
import de.verdox.polylwjgl3.gl.functions.gl.glUniformMatrix3x2dv;
import de.verdox.polylwjgl3.gl.functions.gl.glUniformMatrix3x4dv;
import de.verdox.polylwjgl3.gl.functions.gl.glUniformMatrix4dv;
import de.verdox.polylwjgl3.gl.functions.gl.glUniformMatrix4x2dv;
import de.verdox.polylwjgl3.gl.functions.gl.glUniformMatrix4x3dv;
import de.verdox.polylwjgl3.gl.functions.gl.glUniformSubroutinesui;
import de.verdox.polylwjgl3.gl.functions.gl.glUniformSubroutinesuiv;
import de.verdox.polylwjgl3.gl.functions.glBindTransformFeedback;
import de.verdox.polylwjgl3.gl.functions.glBlendEquationSeparatei;
import de.verdox.polylwjgl3.gl.functions.glBlendEquationi;
import de.verdox.polylwjgl3.gl.functions.glBlendFuncSeparatei;
import de.verdox.polylwjgl3.gl.functions.glBlendFunci;
import de.verdox.polylwjgl3.gl.functions.glDeleteTransformFeedbacks;
import de.verdox.polylwjgl3.gl.functions.glDrawArraysIndirect;
import de.verdox.polylwjgl3.gl.functions.glDrawElementsIndirect;
import de.verdox.polylwjgl3.gl.functions.glGenTransformFeedbacks;
import de.verdox.polylwjgl3.gl.functions.glIsTransformFeedback;
import de.verdox.polylwjgl3.gl.functions.glMinSampleShading;
import de.verdox.polylwjgl3.gl.functions.glPatchParameteri;
import de.verdox.polylwjgl3.gl.functions.glPauseTransformFeedback;
import de.verdox.polylwjgl3.gl.functions.glResumeTransformFeedback;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL40;
import org.lwjgl.system.*;

/**
 * OpenGL 4.0 Accessor — Indexed blending, indirect drawing, double-precision uniforms,
 * shader subroutines, tessellation patch parameters, transform feedback objects, and
 * indexed queries with per-stage introspection.
 *
 * <p>Extends {@link GL33Accessor} with features aimed at reducing CPU overhead,
 * improving numerical precision, and enabling more dynamic shader control.</p>
 *
 * <h2>Per-Draw-Buffer (Indexed) Blending</h2>
 * <ul>
 *   <li>{@code glBlendEquationi}, {@code glBlendEquationSeparatei} —
 *       Set blend equation(s) for a specific color attachment index.</li>
 *   <li>{@code glBlendFunci}, {@code glBlendFuncSeparatei} —
 *       Set blend factors per draw buffer; separate RGB vs. alpha variants supported.</li>
 * </ul>
 *
 * <h2>Indirect Drawing</h2>
 * <ul>
 *   <li>{@code glDrawArraysIndirect}, {@code glDrawElementsIndirect} —
 *       Issue draws whose parameters are read from a buffer object, enabling GPU-driven
 *       multi-draw workflows with minimal CPU involvement.</li>
 * </ul>
 *
 * <h2>Double-Precision Uniforms</h2>
 * <ul>
 *   <li>{@code glUniform1/2/3/4d}, {@code glUniform1/2/3/4dv} —
 *       Upload double-precision scalar/vector uniforms.</li>
 *   <li>{@code glUniformMatrix2/3/4dv}, {@code glUniformMatrix2x3/2x4/3x2/3x4/4x2/4x3dv} —
 *       Upload double-precision matrix uniforms (square and non-square).</li>
 *   <li>{@code glGetUniformdv}, {@code glGetUniformd} — Read back double-precision uniform values.</li>
 * </ul>
 *
 * <h2>Shader Subroutines</h2>
 * <ul>
 *   <li>{@code glGetSubroutineUniformLocation}, {@code glGetSubroutineIndex} —
 *       Query locations/indices of subroutine uniforms and subroutine functions.</li>
 *   <li>{@code glGetActiveSubroutineUniformiv}, {@code glGetActiveSubroutineUniformi},
 *       {@code glGetActiveSubroutineUniformName} —
 *       Inspect subroutine uniform metadata (name, size, compatibilities).</li>
 *   <li>{@code glGetActiveSubroutineName} — Query subroutine function names.</li>
 *   <li>{@code glUniformSubroutinesuiv}, {@code glUniformSubroutinesui} —
 *       Select the active subroutine implementation(s) per shader stage at draw time.</li>
 *   <li>{@code glGetUniformSubroutineuiv}, {@code glGetUniformSubroutineui} —
 *       Query current subroutine selections.</li>
 *   <li>{@code glGetProgramStageiv}, {@code glGetProgramStagei} —
 *       Per-stage program queries (e.g., active subroutines, uniform counts).</li>
 * </ul>
 *
 * <h2>Sample Shading</h2>
 * <ul>
 *   <li>{@code glMinSampleShading} — Specify the minimum fraction of samples that
 *       must be evaluated per fragment (enables per-sample shading effects).</li>
 * </ul>
 *
 * <h2>Tessellation Patch Parameters</h2>
 * <ul>
 *   <li>{@code glPatchParameteri}, {@code glPatchParameterfv} —
 *       Define tessellation patch parameters such as control-point count
 *       and default inner/outer tessellation levels.</li>
 * </ul>
 *
 * <h2>Transform Feedback Objects</h2>
 * <ul>
 *   <li>{@code glGenTransformFeedbacks}, {@code glDeleteTransformFeedbacks},
 *       {@code glBindTransformFeedback}, {@code glIsTransformFeedback} —
 *       Manage transform feedback objects (capture state/resources).</li>
 *   <li>{@code glPauseTransformFeedback}, {@code glResumeTransformFeedback} —
 *       Temporarily suspend/resume capturing.</li>
 *   <li>{@code glDrawTransformFeedback}, {@code glDrawTransformFeedbackStream} —
 *       Draw primitives captured by transform feedback, optionally per stream.</li>
 * </ul>
 *
 * <h2>Indexed Queries</h2>
 * <ul>
 *   <li>{@code glBeginQueryIndexed}, {@code glEndQueryIndexed} —
 *       Begin/end a query on a specific index (e.g., per-target statistics).</li>
 *   <li>{@code glGetQueryIndexediv}, {@code glGetQueryIndexedi} —
 *       Retrieve parameters/results of indexed queries.</li>
 * </ul>
 *
 * <h3>Notes</h3>
 * <ul>
 *   <li>Indirect draws require properly formatted parameter buffers and matching bindings.</li>
 *   <li>Double-precision uniforms are consumed by shaders using {@code double}, {@code dvec*}, and {@code dmat*} types.</li>
 *   <li>Subroutines provide function-level indirection inside shaders, allowing dynamic behavior
 *       without relinking programs.</li>
 *   <li>Patch parameters configure tessellation stages; ensure a tessellation control/evaluation
 *       shader pair is active for effects to take place.</li>
 * </ul>
 */
public interface GL40Accessor extends GL33Accessor, glBlendEquationi, glBlendEquationSeparatei, glBlendFunci, glBlendFuncSeparatei, glDrawArraysIndirect, glDrawElementsIndirect, glUniform1d, glUniform2d, glUniform3d, glUniform4d, glUniform1dv, glUniform2dv, glUniform3dv, glUniform4dv, glUniformMatrix2dv, glUniformMatrix3dv, glUniformMatrix4dv, glUniformMatrix2x3dv, glUniformMatrix2x4dv, glUniformMatrix3x2dv, glUniformMatrix3x4dv, glUniformMatrix4x2dv, glUniformMatrix4x3dv, glGetUniformdv, glGetUniformd, glMinSampleShading, glGetSubroutineUniformLocation, glGetSubroutineIndex, glGetActiveSubroutineUniformiv, glGetActiveSubroutineUniformi, glGetActiveSubroutineUniformName, glGetActiveSubroutineName, glUniformSubroutinesuiv, glUniformSubroutinesui, glGetUniformSubroutineuiv, glGetUniformSubroutineui, glGetProgramStageiv, glGetProgramStagei, glPatchParameteri, glPatchParameterfv, glBindTransformFeedback, glDeleteTransformFeedbacks, glGenTransformFeedbacks, glIsTransformFeedback, glPauseTransformFeedback, glResumeTransformFeedback, glDrawTransformFeedback, glDrawTransformFeedbackStream, glBeginQueryIndexed, glEndQueryIndexed, glGetQueryIndexediv, glGetQueryIndexedi {

}
