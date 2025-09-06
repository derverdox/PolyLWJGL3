package de.verdox.polylwjgl3.gl.accessor.gl20;

import de.verdox.polylwjgl3.gl.accessor.gl15.GL15Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl15.GL15AccessorImpl;
import de.verdox.polylwjgl3.gl.functions.gl.glGetVertexAttribdv;
import de.verdox.polylwjgl3.gl.functions.gl.glGetVertexAttribi;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttrib1d;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttrib1dv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttrib1s;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttrib1sv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttrib2d;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttrib2dv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttrib2s;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttrib2sv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttrib3d;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttrib3dv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttrib3s;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttrib3sv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttrib4Nbv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttrib4Niv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttrib4Nsv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttrib4Nub;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttrib4Nubv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttrib4Nuiv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttrib4Nusv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttrib4bv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttrib4d;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttrib4dv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttrib4iv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttrib4s;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttrib4sv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttrib4ubv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttrib4uiv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttrib4usv;
import de.verdox.polylwjgl3.gl.functions.glAttachShader;
import de.verdox.polylwjgl3.gl.functions.glBindAttribLocation;
import de.verdox.polylwjgl3.gl.functions.glBlendEquationSeparate;
import de.verdox.polylwjgl3.gl.functions.glCompileShader;
import de.verdox.polylwjgl3.gl.functions.glCreateProgram;
import de.verdox.polylwjgl3.gl.functions.glCreateShader;
import de.verdox.polylwjgl3.gl.functions.glDeleteProgram;
import de.verdox.polylwjgl3.gl.functions.glDeleteShader;
import de.verdox.polylwjgl3.gl.functions.glDetachShader;
import de.verdox.polylwjgl3.gl.functions.glDisableVertexAttribArray;
import de.verdox.polylwjgl3.gl.functions.glDrawBuffers;
import de.verdox.polylwjgl3.gl.functions.glEnableVertexAttribArray;
import de.verdox.polylwjgl3.gl.functions.glGetActiveAttrib;
import de.verdox.polylwjgl3.gl.functions.glGetActiveUniform;
import de.verdox.polylwjgl3.gl.functions.glGetAttachedShaders;
import de.verdox.polylwjgl3.gl.functions.glGetAttribLocation;
import de.verdox.polylwjgl3.gl.functions.glGetProgramInfoLog;
import de.verdox.polylwjgl3.gl.functions.glGetProgrami;
import de.verdox.polylwjgl3.gl.functions.glGetProgramiv;
import de.verdox.polylwjgl3.gl.functions.glGetShaderInfoLog;
import de.verdox.polylwjgl3.gl.functions.glGetShaderSource;
import de.verdox.polylwjgl3.gl.functions.glGetShaderi;
import de.verdox.polylwjgl3.gl.functions.glGetShaderiv;
import de.verdox.polylwjgl3.gl.functions.glGetUniformLocation;
import de.verdox.polylwjgl3.gl.functions.glGetUniformf;
import de.verdox.polylwjgl3.gl.functions.glGetUniformfv;
import de.verdox.polylwjgl3.gl.functions.glGetUniformi;
import de.verdox.polylwjgl3.gl.functions.glGetUniformiv;
import de.verdox.polylwjgl3.gl.functions.glGetVertexAttribPointer;
import de.verdox.polylwjgl3.gl.functions.glGetVertexAttribPointerv;
import de.verdox.polylwjgl3.gl.functions.glGetVertexAttribfv;
import de.verdox.polylwjgl3.gl.functions.glGetVertexAttribiv;
import de.verdox.polylwjgl3.gl.functions.glIsProgram;
import de.verdox.polylwjgl3.gl.functions.glIsShader;
import de.verdox.polylwjgl3.gl.functions.glLinkProgram;
import de.verdox.polylwjgl3.gl.functions.glShaderSource;
import de.verdox.polylwjgl3.gl.functions.glStencilFuncSeparate;
import de.verdox.polylwjgl3.gl.functions.glStencilMaskSeparate;
import de.verdox.polylwjgl3.gl.functions.glStencilOpSeparate;
import de.verdox.polylwjgl3.gl.functions.glUniform1f;
import de.verdox.polylwjgl3.gl.functions.glUniform1fv;
import de.verdox.polylwjgl3.gl.functions.glUniform1i;
import de.verdox.polylwjgl3.gl.functions.glUniform1iv;
import de.verdox.polylwjgl3.gl.functions.glUniform2f;
import de.verdox.polylwjgl3.gl.functions.glUniform2fv;
import de.verdox.polylwjgl3.gl.functions.glUniform2i;
import de.verdox.polylwjgl3.gl.functions.glUniform2iv;
import de.verdox.polylwjgl3.gl.functions.glUniform3f;
import de.verdox.polylwjgl3.gl.functions.glUniform3fv;
import de.verdox.polylwjgl3.gl.functions.glUniform3i;
import de.verdox.polylwjgl3.gl.functions.glUniform3iv;
import de.verdox.polylwjgl3.gl.functions.glUniform4f;
import de.verdox.polylwjgl3.gl.functions.glUniform4fv;
import de.verdox.polylwjgl3.gl.functions.glUniform4i;
import de.verdox.polylwjgl3.gl.functions.glUniform4iv;
import de.verdox.polylwjgl3.gl.functions.glUniformMatrix2fv;
import de.verdox.polylwjgl3.gl.functions.glUniformMatrix3fv;
import de.verdox.polylwjgl3.gl.functions.glUniformMatrix4fv;
import de.verdox.polylwjgl3.gl.functions.glUseProgram;
import de.verdox.polylwjgl3.gl.functions.glValidateProgram;
import de.verdox.polylwjgl3.gl.functions.glVertexAttrib1f;
import de.verdox.polylwjgl3.gl.functions.glVertexAttrib1fv;
import de.verdox.polylwjgl3.gl.functions.glVertexAttrib2f;
import de.verdox.polylwjgl3.gl.functions.glVertexAttrib2fv;
import de.verdox.polylwjgl3.gl.functions.glVertexAttrib3f;
import de.verdox.polylwjgl3.gl.functions.glVertexAttrib3fv;
import de.verdox.polylwjgl3.gl.functions.glVertexAttrib4f;
import de.verdox.polylwjgl3.gl.functions.glVertexAttrib4fv;
import de.verdox.polylwjgl3.gl.functions.glVertexAttribPointer;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL20;
import org.lwjgl.system.*;

/**
 * OpenGL 2.0 Accessor — Programmable pipeline (shaders, programs), generic vertex attributes, and enhanced draw/blend/stencil support.
 *
 * <p>Extends {@link GL15Accessor} by introducing the programmable pipeline with
 * shaders and programs, uniform and attribute variables, as well as multiple render targets
 * and more flexible stencil/blend control.</p>
 *
 * <h2>Shader and Program Objects</h2>
 * <ul>
 *   <li>{@code glCreateShader}, {@code glDeleteShader}, {@code glIsShader} —
 *       Manage shader object lifetimes.</li>
 *   <li>{@code glShaderSource} — Upload GLSL source code to a shader object.</li>
 *   <li>{@code glCompileShader} — Compile the shader source into executable form.</li>
 *   <li>{@code glCreateProgram}, {@code glDeleteProgram}, {@code glIsProgram} —
 *       Manage program object lifetimes.</li>
 *   <li>{@code glAttachShader}, {@code glDetachShader} — Link/unlink shader objects with a program.</li>
 *   <li>{@code glLinkProgram} — Link all attached shaders into a complete program pipeline.</li>
 *   <li>{@code glUseProgram} — Bind a program for subsequent rendering.</li>
 *   <li>{@code glValidateProgram} — Validate a program against the current pipeline state.</li>
 *   <li>{@code glGetShaderiv}, {@code glGetShaderi}, {@code glGetProgramiv}, {@code glGetProgrami} —
 *       Query shader/program object parameters (compile status, link status, info log length, etc.).</li>
 *   <li>{@code glGetShaderInfoLog}, {@code glGetProgramInfoLog} — Retrieve compiler or linker error messages.</li>
 *   <li>{@code glGetAttachedShaders} — Enumerate shaders attached to a program.</li>
 *   <li>{@code glGetShaderSource} — Retrieve the source code string of a shader object.</li>
 * </ul>
 *
 * <h2>Uniform Variables</h2>
 * <ul>
 *   <li>{@code glGetUniformLocation} — Retrieve the location of a named uniform variable.</li>
 *   <li>{@code glUniform1/2/3/4f, glUniform1/2/3/4i} — Set uniform variables with scalar values.</li>
 *   <li>{@code glUniform*fv}, {@code glUniform*iv} — Set uniforms using array/vector values.</li>
 *   <li>{@code glUniformMatrix2fv}, {@code glUniformMatrix3fv}, {@code glUniformMatrix4fv} —
 *       Upload matrix values to uniform variables.</li>
 *   <li>{@code glGetUniformfv}, {@code glGetUniformiv}, {@code glGetUniformf}, {@code glGetUniformi} —
 *       Query uniform values currently stored in a program object.</li>
 *   <li>{@code glGetActiveUniform} — Query information about an active uniform (name, type, size).</li>
 * </ul>
 *
 * <h2>Generic Vertex Attributes</h2>
 * <ul>
 *   <li>{@code glVertexAttrib*} — Define generic per-vertex attribute values (1–4 components, multiple types).</li>
 *   <li>{@code glVertexAttribPointer} — Specify array-based data sources for vertex attributes.</li>
 *   <li>{@code glEnableVertexAttribArray}, {@code glDisableVertexAttribArray} —
 *       Enable/disable per-vertex attribute arrays.</li>
 *   <li>{@code glBindAttribLocation} — Assign a vertex attribute index to a variable name before linking.</li>
 *   <li>{@code glGetActiveAttrib} — Query information about an active attribute (name, type, size).</li>
 *   <li>{@code glGetAttribLocation} — Retrieve the index of a named attribute variable.</li>
 *   <li>{@code glGetVertexAttrib*i/f/d/v}, {@code glGetVertexAttribPointerv} —
 *       Query current values or array pointer of vertex attributes.</li>
 * </ul>
 *
 * <h2>Multiple Render Targets</h2>
 * <ul>
 *   <li>{@code glDrawBuffers} — Specify an array of color buffers as rendering targets, enabling MRT (multiple render targets).</li>
 * </ul>
 *
 * <h2>Advanced Blending and Stencil</h2>
 * <ul>
 *   <li>{@code glBlendEquationSeparate} — Specify separate blend equations for RGB and alpha channels.</li>
 *   <li>{@code glStencilOpSeparate} — Configure stencil operations per face (front/back) separately.</li>
 *   <li>{@code glStencilFuncSeparate} — Configure stencil test functions separately for front and back faces.</li>
 *   <li>{@code glStencilMaskSeparate} — Control writable bits in stencil buffer per face.</li>
 * </ul>
 *
 * <h3>Notes</h3>
 * <ul>
 *   <li>OpenGL 2.0 introduces GLSL as a first-class shading language; most fixed-function shading features
 *       are now programmable.</li>
 *   <li>Uniforms are program-object state, not global GL state — they change with {@code glUseProgram}.</li>
 *   <li>Generic attributes replace legacy fixed-function attributes (e.g., {@code glColor}, {@code glNormal}).</li>
 *   <li>MRTs allow writing to several color attachments in one pass, useful for deferred shading.</li>
 * </ul>
 */
public interface GL20Accessor extends GL15Accessor, glCreateProgram, glDeleteProgram, glIsProgram, glCreateShader, glDeleteShader, glIsShader, glAttachShader, glDetachShader, glShaderSource, glCompileShader, glLinkProgram, glUseProgram, glValidateProgram, glUniform1f, glUniform2f, glUniform3f, glUniform4f, glUniform1i, glUniform2i, glUniform3i, glUniform4i, glUniform1fv, glUniform2fv, glUniform3fv, glUniform4fv, glUniform1iv, glUniform2iv, glUniform3iv, glUniform4iv, glUniformMatrix2fv, glUniformMatrix3fv, glUniformMatrix4fv, glGetShaderiv, glGetShaderi, glGetProgramiv, glGetProgrami, glGetShaderInfoLog, glGetProgramInfoLog, glGetAttachedShaders, glGetUniformLocation, glGetActiveUniform, glGetUniformfv, glGetUniformf, glGetUniformiv, glGetUniformi, glGetShaderSource, glVertexAttrib1f, glVertexAttrib1s, glVertexAttrib1d, glVertexAttrib2f, glVertexAttrib2s, glVertexAttrib2d, glVertexAttrib3f, glVertexAttrib3s, glVertexAttrib3d, glVertexAttrib4f, glVertexAttrib4s, glVertexAttrib4d, glVertexAttrib4Nub, glVertexAttrib1fv, glVertexAttrib1sv, glVertexAttrib1dv, glVertexAttrib2fv, glVertexAttrib2sv, glVertexAttrib2dv, glVertexAttrib3fv, glVertexAttrib3sv, glVertexAttrib3dv, glVertexAttrib4fv, glVertexAttrib4sv, glVertexAttrib4dv, glVertexAttrib4iv, glVertexAttrib4bv, glVertexAttrib4ubv, glVertexAttrib4usv, glVertexAttrib4uiv, glVertexAttrib4Nbv, glVertexAttrib4Nsv, glVertexAttrib4Niv, glVertexAttrib4Nubv, glVertexAttrib4Nusv, glVertexAttrib4Nuiv, glVertexAttribPointer, glEnableVertexAttribArray, glDisableVertexAttribArray, glBindAttribLocation, glGetActiveAttrib, glGetAttribLocation, glGetVertexAttribiv, glGetVertexAttribi, glGetVertexAttribfv, glGetVertexAttribdv, glGetVertexAttribPointerv, glGetVertexAttribPointer, glDrawBuffers, glBlendEquationSeparate, glStencilOpSeparate, glStencilFuncSeparate, glStencilMaskSeparate {

}
