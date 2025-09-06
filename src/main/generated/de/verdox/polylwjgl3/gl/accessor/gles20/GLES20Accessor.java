package de.verdox.polylwjgl3.gl.accessor.gles20;

import de.verdox.polylwjgl3.gl.functions.glActiveTexture;
import de.verdox.polylwjgl3.gl.functions.glAttachShader;
import de.verdox.polylwjgl3.gl.functions.glBindAttribLocation;
import de.verdox.polylwjgl3.gl.functions.glBindBuffer;
import de.verdox.polylwjgl3.gl.functions.glBindFramebuffer;
import de.verdox.polylwjgl3.gl.functions.glBindRenderbuffer;
import de.verdox.polylwjgl3.gl.functions.glBindTexture;
import de.verdox.polylwjgl3.gl.functions.glBlendColor;
import de.verdox.polylwjgl3.gl.functions.glBlendEquation;
import de.verdox.polylwjgl3.gl.functions.glBlendEquationSeparate;
import de.verdox.polylwjgl3.gl.functions.glBlendFunc;
import de.verdox.polylwjgl3.gl.functions.glBlendFuncSeparate;
import de.verdox.polylwjgl3.gl.functions.glBufferData;
import de.verdox.polylwjgl3.gl.functions.glBufferSubData;
import de.verdox.polylwjgl3.gl.functions.glCheckFramebufferStatus;
import de.verdox.polylwjgl3.gl.functions.glClear;
import de.verdox.polylwjgl3.gl.functions.glClearColor;
import de.verdox.polylwjgl3.gl.functions.glClearDepthf;
import de.verdox.polylwjgl3.gl.functions.glClearStencil;
import de.verdox.polylwjgl3.gl.functions.glColorMask;
import de.verdox.polylwjgl3.gl.functions.glCompileShader;
import de.verdox.polylwjgl3.gl.functions.glCompressedTexImage2D;
import de.verdox.polylwjgl3.gl.functions.glCompressedTexSubImage2D;
import de.verdox.polylwjgl3.gl.functions.glCopyTexImage2D;
import de.verdox.polylwjgl3.gl.functions.glCopyTexSubImage2D;
import de.verdox.polylwjgl3.gl.functions.glCreateProgram;
import de.verdox.polylwjgl3.gl.functions.glCreateShader;
import de.verdox.polylwjgl3.gl.functions.glCullFace;
import de.verdox.polylwjgl3.gl.functions.glDeleteBuffers;
import de.verdox.polylwjgl3.gl.functions.glDeleteFramebuffers;
import de.verdox.polylwjgl3.gl.functions.glDeleteProgram;
import de.verdox.polylwjgl3.gl.functions.glDeleteRenderbuffers;
import de.verdox.polylwjgl3.gl.functions.glDeleteShader;
import de.verdox.polylwjgl3.gl.functions.glDeleteTextures;
import de.verdox.polylwjgl3.gl.functions.glDepthFunc;
import de.verdox.polylwjgl3.gl.functions.glDepthMask;
import de.verdox.polylwjgl3.gl.functions.glDepthRangef;
import de.verdox.polylwjgl3.gl.functions.glDetachShader;
import de.verdox.polylwjgl3.gl.functions.glDisable;
import de.verdox.polylwjgl3.gl.functions.glDisableVertexAttribArray;
import de.verdox.polylwjgl3.gl.functions.glDrawArrays;
import de.verdox.polylwjgl3.gl.functions.glDrawElements;
import de.verdox.polylwjgl3.gl.functions.glEnable;
import de.verdox.polylwjgl3.gl.functions.glEnableVertexAttribArray;
import de.verdox.polylwjgl3.gl.functions.glFinish;
import de.verdox.polylwjgl3.gl.functions.glFlush;
import de.verdox.polylwjgl3.gl.functions.glFramebufferRenderbuffer;
import de.verdox.polylwjgl3.gl.functions.glFramebufferTexture2D;
import de.verdox.polylwjgl3.gl.functions.glFrontFace;
import de.verdox.polylwjgl3.gl.functions.glGenBuffers;
import de.verdox.polylwjgl3.gl.functions.glGenFramebuffers;
import de.verdox.polylwjgl3.gl.functions.glGenRenderbuffers;
import de.verdox.polylwjgl3.gl.functions.glGenTextures;
import de.verdox.polylwjgl3.gl.functions.glGenerateMipmap;
import de.verdox.polylwjgl3.gl.functions.glGetActiveAttrib;
import de.verdox.polylwjgl3.gl.functions.glGetActiveUniform;
import de.verdox.polylwjgl3.gl.functions.glGetAttachedShaders;
import de.verdox.polylwjgl3.gl.functions.glGetAttribLocation;
import de.verdox.polylwjgl3.gl.functions.glGetBoolean;
import de.verdox.polylwjgl3.gl.functions.glGetBooleanv;
import de.verdox.polylwjgl3.gl.functions.glGetBufferParameteri;
import de.verdox.polylwjgl3.gl.functions.glGetBufferParameteriv;
import de.verdox.polylwjgl3.gl.functions.glGetError;
import de.verdox.polylwjgl3.gl.functions.glGetFloat;
import de.verdox.polylwjgl3.gl.functions.glGetFloatv;
import de.verdox.polylwjgl3.gl.functions.glGetFramebufferAttachmentParameteri;
import de.verdox.polylwjgl3.gl.functions.glGetFramebufferAttachmentParameteriv;
import de.verdox.polylwjgl3.gl.functions.glGetInteger;
import de.verdox.polylwjgl3.gl.functions.glGetIntegerv;
import de.verdox.polylwjgl3.gl.functions.glGetProgramInfoLog;
import de.verdox.polylwjgl3.gl.functions.glGetProgrami;
import de.verdox.polylwjgl3.gl.functions.glGetProgramiv;
import de.verdox.polylwjgl3.gl.functions.glGetRenderbufferParameteri;
import de.verdox.polylwjgl3.gl.functions.glGetRenderbufferParameteriv;
import de.verdox.polylwjgl3.gl.functions.glGetShaderInfoLog;
import de.verdox.polylwjgl3.gl.functions.glGetShaderPrecisionFormat;
import de.verdox.polylwjgl3.gl.functions.glGetShaderSource;
import de.verdox.polylwjgl3.gl.functions.glGetShaderi;
import de.verdox.polylwjgl3.gl.functions.glGetShaderiv;
import de.verdox.polylwjgl3.gl.functions.glGetString;
import de.verdox.polylwjgl3.gl.functions.glGetTexParameterf;
import de.verdox.polylwjgl3.gl.functions.glGetTexParameterfv;
import de.verdox.polylwjgl3.gl.functions.glGetTexParameteri;
import de.verdox.polylwjgl3.gl.functions.glGetTexParameteriv;
import de.verdox.polylwjgl3.gl.functions.glGetUniformLocation;
import de.verdox.polylwjgl3.gl.functions.glGetUniformf;
import de.verdox.polylwjgl3.gl.functions.glGetUniformfv;
import de.verdox.polylwjgl3.gl.functions.glGetUniformi;
import de.verdox.polylwjgl3.gl.functions.glGetUniformiv;
import de.verdox.polylwjgl3.gl.functions.glGetVertexAttribPointer;
import de.verdox.polylwjgl3.gl.functions.glGetVertexAttribPointerv;
import de.verdox.polylwjgl3.gl.functions.glGetVertexAttribfv;
import de.verdox.polylwjgl3.gl.functions.glGetVertexAttribiv;
import de.verdox.polylwjgl3.gl.functions.glHint;
import de.verdox.polylwjgl3.gl.functions.glIsBuffer;
import de.verdox.polylwjgl3.gl.functions.glIsEnabled;
import de.verdox.polylwjgl3.gl.functions.glIsFramebuffer;
import de.verdox.polylwjgl3.gl.functions.glIsProgram;
import de.verdox.polylwjgl3.gl.functions.glIsRenderbuffer;
import de.verdox.polylwjgl3.gl.functions.glIsShader;
import de.verdox.polylwjgl3.gl.functions.glIsTexture;
import de.verdox.polylwjgl3.gl.functions.glLineWidth;
import de.verdox.polylwjgl3.gl.functions.glLinkProgram;
import de.verdox.polylwjgl3.gl.functions.glPixelStorei;
import de.verdox.polylwjgl3.gl.functions.glPolygonOffset;
import de.verdox.polylwjgl3.gl.functions.glReadPixels;
import de.verdox.polylwjgl3.gl.functions.glReleaseShaderCompiler;
import de.verdox.polylwjgl3.gl.functions.glRenderbufferStorage;
import de.verdox.polylwjgl3.gl.functions.glSampleCoverage;
import de.verdox.polylwjgl3.gl.functions.glScissor;
import de.verdox.polylwjgl3.gl.functions.glShaderBinary;
import de.verdox.polylwjgl3.gl.functions.glShaderSource;
import de.verdox.polylwjgl3.gl.functions.glStencilFunc;
import de.verdox.polylwjgl3.gl.functions.glStencilFuncSeparate;
import de.verdox.polylwjgl3.gl.functions.glStencilMask;
import de.verdox.polylwjgl3.gl.functions.glStencilMaskSeparate;
import de.verdox.polylwjgl3.gl.functions.glStencilOp;
import de.verdox.polylwjgl3.gl.functions.glStencilOpSeparate;
import de.verdox.polylwjgl3.gl.functions.glTexImage2D;
import de.verdox.polylwjgl3.gl.functions.glTexParameterf;
import de.verdox.polylwjgl3.gl.functions.glTexParameterfv;
import de.verdox.polylwjgl3.gl.functions.glTexParameteri;
import de.verdox.polylwjgl3.gl.functions.glTexParameteriv;
import de.verdox.polylwjgl3.gl.functions.glTexSubImage2D;
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
import de.verdox.polylwjgl3.gl.functions.glViewport;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengles.GLES20;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

/**
 * OpenGL ES 2.0 Accessor — Programmable pipeline for mobile/embedded: shaders & programs,
 * vertex buffers/attributes, textures & samplers, framebuffers, and core fixed-function state.
 *
 * <p>Defines the ES 2.0 API surface used by most mobile GPUs. Compared to desktop GL,
 * ES 2.0 is leaner (no fixed-function lighting/texgen, no immediate mode) and centers
 * everything around GLSL ES shaders, vertex arrays, 2D textures, and FBOs.</p>
 *
 * <h2>Shaders & Programs</h2>
 * <ul>
 *   <li>{@code glCreateShader}, {@code glShaderSource}, {@code glCompileShader},
 *       {@code glDeleteShader}, {@code glIsShader} — Manage shader objects.</li>
 *   <li>{@code glCreateProgram}, {@code glAttachShader}, {@code glBindAttribLocation},
 *       {@code glLinkProgram}, {@code glUseProgram}, {@code glValidateProgram},
 *       {@code glDeleteProgram}, {@code glIsProgram} — Manage/link program objects.</li>
 *   <li>{@code glGetShaderiv}/{@code glGetShaderi}, {@code glGetShaderInfoLog},
 *       {@code glGetProgramiv}/{@code glGetProgrami}, {@code glGetProgramInfoLog},
 *       {@code glGetAttachedShaders}, {@code glGetShaderSource} — Introspection & logs.</li>
 *   <li>{@code glGetUniformLocation} — Look up uniform locations by name.</li>
 *   <li>{@code glUniform*} / {@code glUniform*fv} / {@code glUniform*iv} —
 *       Upload scalar/vector/matrix uniforms to the current program.</li>
 *   <li>{@code glGetUniformf/i} / {@code glGetUniformfv/iv} — Read current uniform values.</li>
 *   <li>{@code glReleaseShaderCompiler} — Hint to free internal compiler resources.</li>
 *   <li>{@code glShaderBinary}, {@code glGetShaderPrecisionFormat} —
 *       Load binary shaders and query numeric precision/ranges (ES-style qualifiers).</li>
 * </ul>
 *
 * <h2>Vertex Input</h2>
 * <ul>
 *   <li>{@code glGenBuffers}, {@code glDeleteBuffers}, {@code glBindBuffer},
 *       {@code glIsBuffer} — Create/bind VBOs (array/element array).</li>
 *   <li>{@code glBufferData}, {@code glBufferSubData} — Allocate and update buffer storage.</li>
 *   <li>{@code glGetBufferParameteri}/{@code glGetBufferParameteriv} — Query buffer parameters.</li>
 *   <li>{@code glVertexAttribPointer}, {@code glEnableVertexAttribArray},
 *       {@code glDisableVertexAttribArray} — Describe/enable generic vertex attributes.</li>
 *   <li>{@code glVertexAttrib*}, {@code glVertexAttrib*fv} — Set constant (non-array) attribute values.</li>
 *   <li>{@code glGetVertexAttribfv/iv}, {@code glGetVertexAttribPointerv} — Query attribute state/pointers.</li>
 *   <li>{@code glDrawArrays}, {@code glDrawElements} — Issue draw calls.</li>
 * </ul>
 *
 * <h2>Textures & Sampling</h2>
 * <ul>
 *   <li>{@code glGenTextures}, {@code glDeleteTextures}, {@code glBindTexture}, {@code glIsTexture} — Manage textures.</li>
 *   <li>{@code glTexImage2D}, {@code glTexSubImage2D} — Define/replace 2D texture images.</li>
 *   <li>{@code glCompressedTexImage2D}, {@code glCompressedTexSubImage2D} — Use compressed texture formats.</li>
 *   <li>{@code glCopyTexImage2D}, {@code glCopyTexSubImage2D} — Copy from framebuffer to texture.</li>
 *   <li>{@code glTexParameterf/i/fv/iv} — Set filtering, wrap modes, LOD bias, etc.; {@code glGetTexParameter*} to query.</li>
 *   <li>{@code glGenerateMipmap} — Generate mip chains for the bound texture.</li>
 * </ul>
 *
 * <h2>Framebuffers & Renderbuffers</h2>
 * <ul>
 *   <li>{@code glGenFramebuffers}, {@code glDeleteFramebuffers}, {@code glBindFramebuffer}, {@code glIsFramebuffer} — FBOs.</li>
 *   <li>{@code glGenRenderbuffers}, {@code glDeleteRenderbuffers}, {@code glBindRenderbuffer}, {@code glIsRenderbuffer} — RBOs.</li>
 *   <li>{@code glRenderbufferStorage} — Allocate renderbuffer storage.</li>
 *   <li>{@code glFramebufferTexture2D}, {@code glFramebufferRenderbuffer} — Attach textures/RBOs to FBOs.</li>
 *   <li>{@code glCheckFramebufferStatus} — Verify FBO completeness.</li>
 *   <li>{@code glGetFramebufferAttachmentParameteriv}/{@code i} — Inspect FBO attachments.</li>
 *   <li>{@code glGetRenderbufferParameteriv}/{@code i} — Query RBO properties.</li>
 * </ul>
 *
 * <h2>Pipeline State & Rasterization</h2>
 * <ul>
 *   <li>{@code glEnable}/{@code glDisable}, {@code glIsEnabled} — Toggle capabilities (blend, cull, depth test, stencil, scissor).</li>
 *   <li>{@code glBlendFunc}, {@code glBlendFuncSeparate}, {@code glBlendEquation}, {@code glBlendEquationSeparate}, {@code glBlendColor} — Blending.</li>
 *   <li>{@code glDepthFunc}, {@code glDepthMask}, {@code glDepthRangef}, {@code glClearDepthf} — Depth testing & clear value.</li>
 *   <li>{@code glStencilFunc}, {@code glStencilFuncSeparate}, {@code glStencilOp}, {@code glStencilOpSeparate}, {@code glStencilMask}, {@code glStencilMaskSeparate} — Stencil.</li>
 *   <li>{@code glCullFace}, {@code glFrontFace} — Face culling.</li>
 *   <li>{@code glPolygonOffset} — Depth bias for polygons.</li>
 *   <li>{@code glSampleCoverage} — Control multisample coverage (if supported).</li>
 *   <li>{@code glViewport}, {@code glScissor} — Rasterization rectangles.</li>
 *   <li>{@code glHint}, {@code glLineWidth} — Quality/performance hints and line width.</li>
 * </ul>
 *
 * <h2>Clears, Reads & Queries</h2>
 * <ul>
 *   <li>{@code glClear}, {@code glClearColor}, {@code glClearStencil} — Clear framebuffer buffers.</li>
 *   <li>{@code glReadPixels} — Read back pixels from the framebuffer.</li>
 *   <li>{@code glGetString} — Obtain renderer/version/extension strings.</li>
 *   <li>{@code glGetError} — Retrieve the current GL error flag.</li>
 *   <li>{@code glGetBoolean/Float/Integer*v} — Query scalar/vector state.</li>
 *   <li>{@code glFinish}, {@code glFlush} — Synchronize command execution.</li>
 * </ul>
 *
 * <h3>Notes</h3>
 * <ul>
 *   <li>ES 2.0 requires vertex/fragment shaders for all drawing; fixed-function transforms/lighting are not available.</li>
 *   <li>Only 2D textures are core; cube maps and others may depend on extensions/ES version.</li>
 *   <li>Precision qualifiers in GLSL ES interact with {@code glGetShaderPrecisionFormat} capabilities.</li>
 *   <li>Always check framebuffer completeness before rendering to FBOs.</li>
 * </ul>
 */
public interface GLES20Accessor extends glActiveTexture, glAttachShader, glBindAttribLocation, glBindBuffer, glBindFramebuffer, glBindRenderbuffer, glBindTexture, glBlendColor, glBlendEquation, glBlendEquationSeparate, glBlendFunc, glBlendFuncSeparate, glBufferData, glBufferSubData, glCheckFramebufferStatus, glClear, glClearColor, glClearDepthf, glClearStencil, glColorMask, glCompileShader, glCompressedTexImage2D, glCompressedTexSubImage2D, glCopyTexImage2D, glCopyTexSubImage2D, glCreateProgram, glCreateShader, glCullFace, glDeleteBuffers, glDeleteFramebuffers, glDeleteProgram, glDeleteRenderbuffers, glDeleteShader, glDeleteTextures, glDepthFunc, glDepthMask, glDepthRangef, glDetachShader, glDisable, glDisableVertexAttribArray, glDrawArrays, glDrawElements, glEnable, glEnableVertexAttribArray, glFinish, glFlush, glFramebufferRenderbuffer, glFramebufferTexture2D, glFrontFace, glGenBuffers, glGenerateMipmap, glGenFramebuffers, glGenRenderbuffers, glGenTextures, glGetActiveAttrib, glGetActiveUniform, glGetAttachedShaders, glGetAttribLocation, glGetBooleanv, glGetBoolean, glGetBufferParameteriv, glGetBufferParameteri, glGetError, glGetFloatv, glGetFloat, glGetFramebufferAttachmentParameteriv, glGetFramebufferAttachmentParameteri, glGetIntegerv, glGetInteger, glGetProgramiv, glGetProgrami, glGetProgramInfoLog, glGetRenderbufferParameteriv, glGetRenderbufferParameteri, glGetShaderiv, glGetShaderi, glGetShaderInfoLog, glGetShaderPrecisionFormat, glGetShaderSource, glGetString, glGetTexParameterfv, glGetTexParameterf, glGetTexParameteriv, glGetTexParameteri, glGetUniformfv, glGetUniformf, glGetUniformiv, glGetUniformi, glGetUniformLocation, glGetVertexAttribfv, glGetVertexAttribiv, glGetVertexAttribPointerv, glGetVertexAttribPointer, glHint, glIsBuffer, glIsEnabled, glIsFramebuffer, glIsProgram, glIsRenderbuffer, glIsShader, glIsTexture, glLineWidth, glLinkProgram, glPixelStorei, glPolygonOffset, glReadPixels, glReleaseShaderCompiler, glRenderbufferStorage, glSampleCoverage, glScissor, glShaderBinary, glShaderSource, glStencilFunc, glStencilFuncSeparate, glStencilMask, glStencilMaskSeparate, glStencilOp, glStencilOpSeparate, glTexImage2D, glTexParameterf, glTexParameterfv, glTexParameteri, glTexParameteriv, glTexSubImage2D, glUniform1f, glUniform1fv, glUniform1i, glUniform1iv, glUniform2f, glUniform2fv, glUniform2i, glUniform2iv, glUniform3f, glUniform3fv, glUniform3i, glUniform3iv, glUniform4f, glUniform4fv, glUniform4i, glUniform4iv, glUniformMatrix2fv, glUniformMatrix3fv, glUniformMatrix4fv, glUseProgram, glValidateProgram, glVertexAttrib1f, glVertexAttrib1fv, glVertexAttrib2f, glVertexAttrib2fv, glVertexAttrib3f, glVertexAttrib3fv, glVertexAttrib4f, glVertexAttrib4fv, glVertexAttribPointer, glViewport {

}
