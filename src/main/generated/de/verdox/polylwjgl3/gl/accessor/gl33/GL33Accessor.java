package de.verdox.polylwjgl3.gl.accessor.gl33;

import de.verdox.polylwjgl3.gl.accessor.gl32.GL32Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl32.GL32AccessorImpl;
import de.verdox.polylwjgl3.gl.functions.gl.glBindFragDataLocationIndexed;
import de.verdox.polylwjgl3.gl.functions.gl.glColorP3ui;
import de.verdox.polylwjgl3.gl.functions.gl.glColorP3uiv;
import de.verdox.polylwjgl3.gl.functions.gl.glColorP4ui;
import de.verdox.polylwjgl3.gl.functions.gl.glColorP4uiv;
import de.verdox.polylwjgl3.gl.functions.gl.glGetFragDataIndex;
import de.verdox.polylwjgl3.gl.functions.gl.glGetQueryObjecti64;
import de.verdox.polylwjgl3.gl.functions.gl.glGetQueryObjecti64v;
import de.verdox.polylwjgl3.gl.functions.gl.glGetQueryObjectui64;
import de.verdox.polylwjgl3.gl.functions.gl.glGetQueryObjectui64v;
import de.verdox.polylwjgl3.gl.functions.gl.glMultiTexCoordP1ui;
import de.verdox.polylwjgl3.gl.functions.gl.glMultiTexCoordP1uiv;
import de.verdox.polylwjgl3.gl.functions.gl.glMultiTexCoordP2ui;
import de.verdox.polylwjgl3.gl.functions.gl.glMultiTexCoordP2uiv;
import de.verdox.polylwjgl3.gl.functions.gl.glMultiTexCoordP3ui;
import de.verdox.polylwjgl3.gl.functions.gl.glMultiTexCoordP3uiv;
import de.verdox.polylwjgl3.gl.functions.gl.glMultiTexCoordP4ui;
import de.verdox.polylwjgl3.gl.functions.gl.glMultiTexCoordP4uiv;
import de.verdox.polylwjgl3.gl.functions.gl.glNormalP3ui;
import de.verdox.polylwjgl3.gl.functions.gl.glNormalP3uiv;
import de.verdox.polylwjgl3.gl.functions.gl.glQueryCounter;
import de.verdox.polylwjgl3.gl.functions.gl.glSecondaryColorP3ui;
import de.verdox.polylwjgl3.gl.functions.gl.glSecondaryColorP3uiv;
import de.verdox.polylwjgl3.gl.functions.gl.glTexCoordP1ui;
import de.verdox.polylwjgl3.gl.functions.gl.glTexCoordP1uiv;
import de.verdox.polylwjgl3.gl.functions.gl.glTexCoordP2ui;
import de.verdox.polylwjgl3.gl.functions.gl.glTexCoordP2uiv;
import de.verdox.polylwjgl3.gl.functions.gl.glTexCoordP3ui;
import de.verdox.polylwjgl3.gl.functions.gl.glTexCoordP3uiv;
import de.verdox.polylwjgl3.gl.functions.gl.glTexCoordP4ui;
import de.verdox.polylwjgl3.gl.functions.gl.glTexCoordP4uiv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttribP1ui;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttribP1uiv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttribP2ui;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttribP2uiv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttribP3ui;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttribP3uiv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttribP4ui;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexAttribP4uiv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexP2ui;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexP2uiv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexP3ui;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexP3uiv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexP4ui;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexP4uiv;
import de.verdox.polylwjgl3.gl.functions.glBindSampler;
import de.verdox.polylwjgl3.gl.functions.glDeleteSamplers;
import de.verdox.polylwjgl3.gl.functions.glGenSamplers;
import de.verdox.polylwjgl3.gl.functions.glGetSamplerParameterIi;
import de.verdox.polylwjgl3.gl.functions.glGetSamplerParameterIiv;
import de.verdox.polylwjgl3.gl.functions.glGetSamplerParameterIui;
import de.verdox.polylwjgl3.gl.functions.glGetSamplerParameterIuiv;
import de.verdox.polylwjgl3.gl.functions.glGetSamplerParameterf;
import de.verdox.polylwjgl3.gl.functions.glGetSamplerParameterfv;
import de.verdox.polylwjgl3.gl.functions.glGetSamplerParameteri;
import de.verdox.polylwjgl3.gl.functions.glGetSamplerParameteriv;
import de.verdox.polylwjgl3.gl.functions.glIsSampler;
import de.verdox.polylwjgl3.gl.functions.glSamplerParameterIiv;
import de.verdox.polylwjgl3.gl.functions.glSamplerParameterIuiv;
import de.verdox.polylwjgl3.gl.functions.glSamplerParameterf;
import de.verdox.polylwjgl3.gl.functions.glSamplerParameterfv;
import de.verdox.polylwjgl3.gl.functions.glSamplerParameteri;
import de.verdox.polylwjgl3.gl.functions.glSamplerParameteriv;
import de.verdox.polylwjgl3.gl.functions.glVertexAttribDivisor;
import java.nio.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL33;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryUtil.*;

/**
 * OpenGL 3.3 Accessor — Indexed fragment outputs, sampler objects, timer queries,
 * instanced attribute divisors, and packed attribute submission helpers.
 *
 * <p>Extends {@link GL32Accessor} with API that refines fragment output binding,
 * decouples texture sampling state via sampler objects, exposes high-precision GPU
 * timing, and streamlines vertex/texcoord/color submission using “packed” formats.
 * Also adds per-attribute instance divisors for instanced rendering.</p>
 *
 * <h2>Indexed Fragment Outputs</h2>
 * <ul>
 *   <li>{@code glBindFragDataLocationIndexed} — Bind a fragment shader output
 *       (by name) to a numbered color attachment and optional index (dual-source blending).</li>
 *   <li>{@code glGetFragDataIndex} — Query the index assigned to a named fragment output.</li>
 * </ul>
 *
 * <h2>Sampler Objects</h2>
 * <ul>
 *   <li>{@code glGenSamplers}, {@code glDeleteSamplers}, {@code glIsSampler}, {@code glBindSampler} —
 *       Create/manage sampler objects and bind them to texture units independently of textures.</li>
 *   <li>{@code glSamplerParameteri/f}, {@code glSamplerParameteriv/fv},
 *       {@code glSamplerParameterIiv/Iuiv} — Set filtering, wrap modes, compare mode/func,
 *       LOD range/bias, border color, and other sampling parameters.</li>
 *   <li>{@code glGetSamplerParameter*i/f/v/Iiv/Iuiv} — Query sampler parameters.</li>
 * </ul>
 *
 * <h2>Timer Queries (64-bit)</h2>
 * <ul>
 *   <li>{@code glQueryCounter} — Insert a timestamp into the GL command stream.</li>
 *   <li>{@code glGetQueryObjecti64v/ui64v} (and convenience {@code glGetQueryObjecti64/ui64}) —
 *       Retrieve 64-bit query results such as elapsed GPU time and timestamps.</li>
 * </ul>
 *
 * <h2>Instancing Control</h2>
 * <ul>
 *   <li>{@code glVertexAttribDivisor} — Set per-vertex-attrib instance rate
 *       (e.g., 1 = advance once per instance, 0 = per-vertex).</li>
 * </ul>
 *
 * <h2>Packed Attribute Submission</h2>
 * <ul>
 *   <li>{@code glVertexP2/3/4ui}, {@code glVertexP2/3/4uiv} —
 *       Submit positions encoded in packed normalized integer formats.</li>
 *   <li>{@code glTexCoordP1/2/3/4ui}, {@code glTexCoordP1/2/3/4uiv} —
 *       Submit texture coordinates in packed form.</li>
 *   <li>{@code glMultiTexCoordP1/2/3/4ui}, {@code glMultiTexCoordP1/2/3/4uiv} —
 *       Packed multi-texturing coordinates for a specified texture unit.</li>
 *   <li>{@code glNormalP3ui}, {@code glNormalP3uiv} — Submit packed normals.</li>
 *   <li>{@code glColorP3/4ui}, {@code glColorP3/4uiv} — Submit packed primary colors.</li>
 *   <li>{@code glSecondaryColorP3ui}, {@code glSecondaryColorP3uiv} — Submit packed secondary colors.</li>
 *   <li>{@code glVertexAttribP1/2/3/4ui}, {@code glVertexAttribP1/2/3/4uiv} —
 *       Submit packed generic vertex attributes.</li>
 * </ul>
 *
 * <h3>Notes</h3>
 * <ul>
 *   <li>Sampler objects allow sharing and switching sampling state without rebinding textures,
 *       improving pipeline clarity and performance.</li>
 *   <li>Timer queries return nanosecond-resolution timestamps; always check availability before reading.</li>
 *   <li>Packed submission encodes multiple components into a single integer based on the chosen format
 *       (e.g., 10:10:10:2), useful for compact vertex data and bandwidth savings.</li>
 *   <li>Dual-source blending (via output index) requires appropriate blend state and hardware support.</li>
 * </ul>
 */
public interface GL33Accessor extends GL32Accessor, glBindFragDataLocationIndexed, glGetFragDataIndex, glGenSamplers, glDeleteSamplers, glIsSampler, glBindSampler, glSamplerParameteri, glSamplerParameterf, glSamplerParameteriv, glSamplerParameterfv, glSamplerParameterIiv, glSamplerParameterIuiv, glGetSamplerParameteriv, glGetSamplerParameteri, glGetSamplerParameterfv, glGetSamplerParameterf, glGetSamplerParameterIiv, glGetSamplerParameterIi, glGetSamplerParameterIuiv, glGetSamplerParameterIui, glQueryCounter, glGetQueryObjecti64v, glGetQueryObjecti64, glGetQueryObjectui64v, glGetQueryObjectui64, glVertexAttribDivisor, glVertexP2ui, glVertexP3ui, glVertexP4ui, glVertexP2uiv, glVertexP3uiv, glVertexP4uiv, glTexCoordP1ui, glTexCoordP2ui, glTexCoordP3ui, glTexCoordP4ui, glTexCoordP1uiv, glTexCoordP2uiv, glTexCoordP3uiv, glTexCoordP4uiv, glMultiTexCoordP1ui, glMultiTexCoordP2ui, glMultiTexCoordP3ui, glMultiTexCoordP4ui, glMultiTexCoordP1uiv, glMultiTexCoordP2uiv, glMultiTexCoordP3uiv, glMultiTexCoordP4uiv, glNormalP3ui, glNormalP3uiv, glColorP3ui, glColorP4ui, glColorP3uiv, glColorP4uiv, glSecondaryColorP3ui, glSecondaryColorP3uiv, glVertexAttribP1ui, glVertexAttribP2ui, glVertexAttribP3ui, glVertexAttribP4ui, glVertexAttribP1uiv, glVertexAttribP2uiv, glVertexAttribP3uiv, glVertexAttribP4uiv {

}
