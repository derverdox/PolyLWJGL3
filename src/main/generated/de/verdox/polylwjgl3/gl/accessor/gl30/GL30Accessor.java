package de.verdox.polylwjgl3.gl.accessor.gl30;

import de.verdox.polylwjgl3.gl.accessor.gl21.GL21Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl21.GL21AccessorImpl;
import de.verdox.polylwjgl3.gl.functions.gl.glBeginConditionalRender;
import de.verdox.polylwjgl3.gl.functions.gl.glBindFragDataLocation;
import de.verdox.polylwjgl3.gl.functions.gl.glClampColor;
import de.verdox.polylwjgl3.gl.functions.gl.glEndConditionalRender;
import de.verdox.polylwjgl3.gl.functions.gl.glFramebufferTexture1D;
import de.verdox.polylwjgl3.gl.functions.gl.glFramebufferTexture3D;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttribI1i;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttribI1iv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttribI1ui;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttribI1uiv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttribI2i;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttribI2iv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttribI2ui;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttribI2uiv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttribI3i;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttribI3iv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttribI3ui;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttribI3uiv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttribI4bv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttribI4sv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttribI4ubv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttribI4usv;
import de.verdox.polylwjgl3.gl.functions.glBeginTransformFeedback;
import de.verdox.polylwjgl3.gl.functions.glBindBufferBase;
import de.verdox.polylwjgl3.gl.functions.glBindBufferRange;
import de.verdox.polylwjgl3.gl.functions.glBindFramebuffer;
import de.verdox.polylwjgl3.gl.functions.glBindRenderbuffer;
import de.verdox.polylwjgl3.gl.functions.glBindVertexArray;
import de.verdox.polylwjgl3.gl.functions.glBlitFramebuffer;
import de.verdox.polylwjgl3.gl.functions.glCheckFramebufferStatus;
import de.verdox.polylwjgl3.gl.functions.glClearBufferfi;
import de.verdox.polylwjgl3.gl.functions.glClearBufferfv;
import de.verdox.polylwjgl3.gl.functions.glClearBufferiv;
import de.verdox.polylwjgl3.gl.functions.glClearBufferuiv;
import de.verdox.polylwjgl3.gl.functions.glColorMaski;
import de.verdox.polylwjgl3.gl.functions.glDeleteFramebuffers;
import de.verdox.polylwjgl3.gl.functions.glDeleteRenderbuffers;
import de.verdox.polylwjgl3.gl.functions.glDeleteVertexArrays;
import de.verdox.polylwjgl3.gl.functions.glDisablei;
import de.verdox.polylwjgl3.gl.functions.glEnablei;
import de.verdox.polylwjgl3.gl.functions.glEndTransformFeedback;
import de.verdox.polylwjgl3.gl.functions.glFlushMappedBufferRange;
import de.verdox.polylwjgl3.gl.functions.glFramebufferRenderbuffer;
import de.verdox.polylwjgl3.gl.functions.glFramebufferTexture2D;
import de.verdox.polylwjgl3.gl.functions.glFramebufferTextureLayer;
import de.verdox.polylwjgl3.gl.functions.glGenFramebuffers;
import de.verdox.polylwjgl3.gl.functions.glGenRenderbuffers;
import de.verdox.polylwjgl3.gl.functions.glGenVertexArrays;
import de.verdox.polylwjgl3.gl.functions.glGenerateMipmap;
import de.verdox.polylwjgl3.gl.functions.glGetBooleani;
import de.verdox.polylwjgl3.gl.functions.glGetBooleani_v;
import de.verdox.polylwjgl3.gl.functions.glGetFragDataLocation;
import de.verdox.polylwjgl3.gl.functions.glGetFramebufferAttachmentParameteri;
import de.verdox.polylwjgl3.gl.functions.glGetFramebufferAttachmentParameteriv;
import de.verdox.polylwjgl3.gl.functions.glGetIntegeri;
import de.verdox.polylwjgl3.gl.functions.glGetIntegeri_v;
import de.verdox.polylwjgl3.gl.functions.glGetRenderbufferParameteri;
import de.verdox.polylwjgl3.gl.functions.glGetRenderbufferParameteriv;
import de.verdox.polylwjgl3.gl.functions.glGetStringi;
import de.verdox.polylwjgl3.gl.functions.glGetTexParameterIi;
import de.verdox.polylwjgl3.gl.functions.glGetTexParameterIiv;
import de.verdox.polylwjgl3.gl.functions.glGetTexParameterIui;
import de.verdox.polylwjgl3.gl.functions.glGetTexParameterIuiv;
import de.verdox.polylwjgl3.gl.functions.glGetTransformFeedbackVarying;
import de.verdox.polylwjgl3.gl.functions.glGetUniformui;
import de.verdox.polylwjgl3.gl.functions.glGetUniformuiv;
import de.verdox.polylwjgl3.gl.functions.glGetVertexAttribIi;
import de.verdox.polylwjgl3.gl.functions.glGetVertexAttribIiv;
import de.verdox.polylwjgl3.gl.functions.glGetVertexAttribIui;
import de.verdox.polylwjgl3.gl.functions.glGetVertexAttribIuiv;
import de.verdox.polylwjgl3.gl.functions.glIsEnabledi;
import de.verdox.polylwjgl3.gl.functions.glIsFramebuffer;
import de.verdox.polylwjgl3.gl.functions.glIsRenderbuffer;
import de.verdox.polylwjgl3.gl.functions.glIsVertexArray;
import de.verdox.polylwjgl3.gl.functions.glMapBufferRange;
import de.verdox.polylwjgl3.gl.functions.glRenderbufferStorage;
import de.verdox.polylwjgl3.gl.functions.glRenderbufferStorageMultisample;
import de.verdox.polylwjgl3.gl.functions.glTexParameterIi;
import de.verdox.polylwjgl3.gl.functions.glTexParameterIiv;
import de.verdox.polylwjgl3.gl.functions.glTexParameterIui;
import de.verdox.polylwjgl3.gl.functions.glTexParameterIuiv;
import de.verdox.polylwjgl3.gl.functions.glTransformFeedbackVaryings;
import de.verdox.polylwjgl3.gl.functions.glUniform1ui;
import de.verdox.polylwjgl3.gl.functions.glUniform1uiv;
import de.verdox.polylwjgl3.gl.functions.glUniform2ui;
import de.verdox.polylwjgl3.gl.functions.glUniform2uiv;
import de.verdox.polylwjgl3.gl.functions.glUniform3ui;
import de.verdox.polylwjgl3.gl.functions.glUniform3uiv;
import de.verdox.polylwjgl3.gl.functions.glUniform4ui;
import de.verdox.polylwjgl3.gl.functions.glUniform4uiv;
import de.verdox.polylwjgl3.gl.functions.glVertexAttribI4i;
import de.verdox.polylwjgl3.gl.functions.glVertexAttribI4iv;
import de.verdox.polylwjgl3.gl.functions.glVertexAttribI4ui;
import de.verdox.polylwjgl3.gl.functions.glVertexAttribI4uiv;
import de.verdox.polylwjgl3.gl.functions.glVertexAttribIPointer;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL30;
import org.lwjgl.system.*;

/**
 * OpenGL 3.0 Accessor — Integer attributes/uniforms, framebuffer/renderbuffer objects, VAOs,
 * transform feedback, conditional rendering, and assorted API modernizations.
 *
 * <p>Extends {@link GL21Accessor} with features that solidify the modern GL object model:
 * vertex array objects, framebuffer/renderbuffer objects (FBO/RBO), integer attribute/uniform
 * support, transform feedback, refined buffer mapping, and indexed state queries.</p>
 *
 * <h2>General & Diagnostics</h2>
 * <ul>
 *   <li>{@code glGetStringi} — Query a specific string entry (e.g., extensions) by index.</li>
 *   <li>{@code glClampColor} — Control clamping behavior for color reads/writes.</li>
 * </ul>
 *
 * <h2>Clear by Buffer</h2>
 * <ul>
 *   <li>{@code glClearBufferiv}, {@code glClearBufferuiv}, {@code glClearBufferfv}, {@code glClearBufferfi} —
 *       Clear individual draw buffers (color, depth/stencil) with typed values.</li>
 * </ul>
 *
 * <h2>Integer Vertex Attributes</h2>
 * <ul>
 *   <li>{@code glVertexAttribI*} / {@code glVertexAttribIPointer} —
 *       Define generic vertex attributes with <em>integer</em> interpretation (no normalization/float conversion).</li>
 *   <li>{@code glGetVertexAttribI*} — Query integer attribute state and array bindings.</li>
 * </ul>
 *
 * <h2>Unsigned Integer Uniforms</h2>
 * <ul>
 *   <li>{@code glUniform1/2/3/4ui}, {@code glUniform1/2/3/4uiv} —
 *       Set unsigned integer uniforms.</li>
 *   <li>{@code glGetUniformuiv}, {@code glGetUniformui} — Query unsigned integer uniform values.</li>
 * </ul>
 *
 * <h2>Fragment Outputs</h2>
 * <ul>
 *   <li>{@code glBindFragDataLocation} — Bind a user-defined fragment shader output to a color number.</li>
 *   <li>{@code glGetFragDataLocation} — Query the color number for a named fragment output.</li>
 * </ul>
 *
 * <h2>Conditional Rendering</h2>
 * <ul>
 *   <li>{@code glBeginConditionalRender}, {@code glEndConditionalRender} —
 *       Conditionally execute rendering based on the result of a query object (e.g., occlusion).</li>
 * </ul>
 *
 * <h2>Buffer Mapping & Ranges</h2>
 * <ul>
 *   <li>{@code glMapBufferRange} — Map a subrange of a buffer with fine-grained access flags (read, write, invalidate, flush).</li>
 *   <li>{@code glFlushMappedBufferRange} — Explicitly flush a modified subrange of a mapped buffer to the GPU.</li>
 * </ul>
 *
 * <h2>Renderbuffers & Framebuffers (FBO)</h2>
 * <ul>
 *   <li>{@code glIsRenderbuffer}, {@code glBindRenderbuffer}, {@code glGenRenderbuffers}, {@code glDeleteRenderbuffers} —
 *       Manage renderbuffer objects (RBOs).</li>
 *   <li>{@code glRenderbufferStorage}, {@code glRenderbufferStorageMultisample} —
 *       Allocate (multisampled) RBO storage.</li>
 *   <li>{@code glGetRenderbufferParameteriv}, {@code glGetRenderbufferParameteri} —
 *       Query RBO parameters (width, height, samples, format).</li>
 *   <li>{@code glIsFramebuffer}, {@code glBindFramebuffer}, {@code glGenFramebuffers}, {@code glDeleteFramebuffers} —
 *       Manage framebuffer objects (FBOs).</li>
 *   <li>{@code glCheckFramebufferStatus} — Validate FBO completeness.</li>
 *   <li>{@code glFramebufferTexture1D/2D/3D}, {@code glFramebufferTextureLayer} —
 *       Attach textures or texture layers to FBO attachment points.</li>
 *   <li>{@code glFramebufferRenderbuffer} — Attach a renderbuffer to an FBO.</li>
 *   <li>{@code glGetFramebufferAttachmentParameteriv}, {@code glGetFramebufferAttachmentParameteri} —
 *       Query FBO attachment state.</li>
 *   <li>{@code glBlitFramebuffer} — Copy/resolve rectangles between framebuffers (supports multisample resolve).</li>
 *   <li>{@code glGenerateMipmap} — Generate the complete set of mipmaps for the currently bound texture.</li>
 * </ul>
 *
 * <h2>Integer Texture Parameters</h2>
 * <ul>
 *   <li>{@code glTexParameterI*i / glGetTexParameterI*i} —
 *       Set/get texture parameters with integer forms (useful for comparing exact enum values).</li>
 * </ul>
 *
 * <h2>Indexed, Per-Target State</h2>
 * <ul>
 *   <li>{@code glColorMaski} — Set per-draw-buffer color write masks.</li>
 *   <li>{@code glGetBooleani_v}, {@code glGetIntegeri_v} (and convenience {@code glGetBooleani}, {@code glGetIntegeri}) —
 *       Query indexed state values.</li>
 *   <li>{@code glEnablei}, {@code glDisablei}, {@code glIsEnabledi} —
 *       Enable/disable/query capabilities on a per-index basis (e.g., clip distances, color writes).</li>
 * </ul>
 *
 * <h2>Uniform/Buffer Bind Ranges</h2>
 * <ul>
 *   <li>{@code glBindBufferRange}, {@code glBindBufferBase} —
 *       Bind buffer objects to indexed binding points (e.g., transform feedback, uniform buffers).</li>
 * </ul>
 *
 * <h2>Transform Feedback</h2>
 * <ul>
 *   <li>{@code glBeginTransformFeedback}, {@code glEndTransformFeedback} —
 *       Capture selected vertex shader (or geometry shader) outputs into buffer objects.</li>
 *   <li>{@code glTransformFeedbackVaryings} — Declare which shader varyings to capture.</li>
 *   <li>{@code glGetTransformFeedbackVarying} — Query information about captured varyings.</li>
 * </ul>
 *
 * <h2>Vertex Array Objects (VAO)</h2>
 * <ul>
 *   <li>{@code glGenVertexArrays}, {@code glDeleteVertexArrays}, {@code glBindVertexArray}, {@code glIsVertexArray} —
 *       Encapsulate vertex attribute array state into reusable VAO objects.</li>
 * </ul>
 *
 * <h3>Notes</h3>
 * <ul>
 *   <li>Integer attributes and uniforms transmit exact integer values to shaders; use the {@code ivec* / uvec*} GLSL types.</li>
 *   <li>FBOs decouple rendering destinations from the default framebuffer, enabling off-screen rendering, MSAA resolves,
 *       and post-processing pipelines.</li>
 *   <li>VAOs minimize state setup cost by bundling attribute array enables, formats, and bindings.</li>
 *   <li>{@code glMapBufferRange} allows partial updates and better synchronization semantics than {@code glMapBuffer}.</li>
 * </ul>
 */

public interface GL30Accessor extends GL21Accessor, glGetStringi, glClearBufferiv, glClearBufferuiv, glClearBufferfv, glClearBufferfi, glVertexAttribI1i, glVertexAttribI2i, glVertexAttribI3i, glVertexAttribI4i, glVertexAttribI1ui, glVertexAttribI2ui, glVertexAttribI3ui, glVertexAttribI4ui, glVertexAttribI1iv, glVertexAttribI2iv, glVertexAttribI3iv, glVertexAttribI4iv, glVertexAttribI1uiv, glVertexAttribI2uiv, glVertexAttribI3uiv, glVertexAttribI4uiv, glVertexAttribI4bv, glVertexAttribI4sv, glVertexAttribI4ubv, glVertexAttribI4usv, glVertexAttribIPointer, glGetVertexAttribIiv, glGetVertexAttribIi, glGetVertexAttribIuiv, glGetVertexAttribIui, glUniform1ui, glUniform2ui, glUniform3ui, glUniform4ui, glUniform1uiv, glUniform2uiv, glUniform3uiv, glUniform4uiv, glGetUniformuiv, glGetUniformui, glBindFragDataLocation, glGetFragDataLocation, glBeginConditionalRender, glEndConditionalRender, glMapBufferRange, glFlushMappedBufferRange, glClampColor, glIsRenderbuffer, glBindRenderbuffer, glDeleteRenderbuffers, glGenRenderbuffers, glRenderbufferStorage, glRenderbufferStorageMultisample, glGetRenderbufferParameteriv, glGetRenderbufferParameteri, glIsFramebuffer, glBindFramebuffer, glDeleteFramebuffers, glGenFramebuffers, glCheckFramebufferStatus, glFramebufferTexture1D, glFramebufferTexture2D, glFramebufferTexture3D, glFramebufferTextureLayer, glFramebufferRenderbuffer, glGetFramebufferAttachmentParameteriv, glGetFramebufferAttachmentParameteri, glBlitFramebuffer, glGenerateMipmap, glTexParameterIiv, glTexParameterIi, glTexParameterIuiv, glTexParameterIui, glGetTexParameterIiv, glGetTexParameterIi, glGetTexParameterIuiv, glGetTexParameterIui, glColorMaski, glGetBooleani_v, glGetBooleani, glGetIntegeri_v, glGetIntegeri, glEnablei, glDisablei, glIsEnabledi, glBindBufferRange, glBindBufferBase, glBeginTransformFeedback, glEndTransformFeedback, glTransformFeedbackVaryings, glGetTransformFeedbackVarying, glBindVertexArray, glDeleteVertexArrays, glGenVertexArrays, glIsVertexArray {

}
