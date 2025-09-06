package de.verdox.polylwjgl3.gl.accessor.gl14;

import de.verdox.polylwjgl3.gl.accessor.gl13.GL13Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl13.GL13AccessorImpl;
import de.verdox.polylwjgl3.gl.functions.gl.glFogCoordPointer;
import de.verdox.polylwjgl3.gl.functions.gl.glFogCoordd;
import de.verdox.polylwjgl3.gl.functions.gl.glFogCoorddv;
import de.verdox.polylwjgl3.gl.functions.gl.glFogCoordf;
import de.verdox.polylwjgl3.gl.functions.gl.glFogCoordfv;
import de.verdox.polylwjgl3.gl.functions.gl.glMultiDrawArrays;
import de.verdox.polylwjgl3.gl.functions.gl.glMultiDrawElements;
import de.verdox.polylwjgl3.gl.functions.gl.glPointParameterf;
import de.verdox.polylwjgl3.gl.functions.gl.glPointParameterfv;
import de.verdox.polylwjgl3.gl.functions.gl.glPointParameteri;
import de.verdox.polylwjgl3.gl.functions.gl.glPointParameteriv;
import de.verdox.polylwjgl3.gl.functions.gl.glSecondaryColor3b;
import de.verdox.polylwjgl3.gl.functions.gl.glSecondaryColor3bv;
import de.verdox.polylwjgl3.gl.functions.gl.glSecondaryColor3d;
import de.verdox.polylwjgl3.gl.functions.gl.glSecondaryColor3dv;
import de.verdox.polylwjgl3.gl.functions.gl.glSecondaryColor3f;
import de.verdox.polylwjgl3.gl.functions.gl.glSecondaryColor3fv;
import de.verdox.polylwjgl3.gl.functions.gl.glSecondaryColor3i;
import de.verdox.polylwjgl3.gl.functions.gl.glSecondaryColor3iv;
import de.verdox.polylwjgl3.gl.functions.gl.glSecondaryColor3s;
import de.verdox.polylwjgl3.gl.functions.gl.glSecondaryColor3sv;
import de.verdox.polylwjgl3.gl.functions.gl.glSecondaryColor3ub;
import de.verdox.polylwjgl3.gl.functions.gl.glSecondaryColor3ubv;
import de.verdox.polylwjgl3.gl.functions.gl.glSecondaryColor3ui;
import de.verdox.polylwjgl3.gl.functions.gl.glSecondaryColor3uiv;
import de.verdox.polylwjgl3.gl.functions.gl.glSecondaryColor3us;
import de.verdox.polylwjgl3.gl.functions.gl.glSecondaryColor3usv;
import de.verdox.polylwjgl3.gl.functions.gl.glSecondaryColorPointer;
import de.verdox.polylwjgl3.gl.functions.gl.glWindowPos2d;
import de.verdox.polylwjgl3.gl.functions.gl.glWindowPos2dv;
import de.verdox.polylwjgl3.gl.functions.gl.glWindowPos2f;
import de.verdox.polylwjgl3.gl.functions.gl.glWindowPos2fv;
import de.verdox.polylwjgl3.gl.functions.gl.glWindowPos2i;
import de.verdox.polylwjgl3.gl.functions.gl.glWindowPos2iv;
import de.verdox.polylwjgl3.gl.functions.gl.glWindowPos2s;
import de.verdox.polylwjgl3.gl.functions.gl.glWindowPos2sv;
import de.verdox.polylwjgl3.gl.functions.gl.glWindowPos3d;
import de.verdox.polylwjgl3.gl.functions.gl.glWindowPos3dv;
import de.verdox.polylwjgl3.gl.functions.gl.glWindowPos3f;
import de.verdox.polylwjgl3.gl.functions.gl.glWindowPos3fv;
import de.verdox.polylwjgl3.gl.functions.gl.glWindowPos3i;
import de.verdox.polylwjgl3.gl.functions.gl.glWindowPos3iv;
import de.verdox.polylwjgl3.gl.functions.gl.glWindowPos3s;
import de.verdox.polylwjgl3.gl.functions.gl.glWindowPos3sv;
import de.verdox.polylwjgl3.gl.functions.glBlendColor;
import de.verdox.polylwjgl3.gl.functions.glBlendEquation;
import de.verdox.polylwjgl3.gl.functions.glBlendFuncSeparate;
import java.nio.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL14;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryUtil.*;

/**
 * OpenGL 1.4 Accessor — Advanced blending, fog coordinates, multi-draw, point params, secondary color, and window positions.
 *
 * <p>Extends {@link GL13Accessor} with more flexible blending controls, per-vertex fog coordinates,
 * batched draw entry points, tunable point rasterization, an additional (secondary) color attribute,
 * and helpers to set raster positions in window space.</p>
 *
 * <h2>Blending Enhancements</h2>
 * <ul>
 *   <li>{@code glBlendColor} — Define a constant blend color used by blend factors like {@code GL_CONSTANT_COLOR}.</li>
 *   <li>{@code glBlendEquation} — Select the blend equation (e.g., ADD, SUBTRACT, REVERSE_SUBTRACT, MIN, MAX).</li>
 *   <li>{@code glBlendFuncSeparate} — Specify separate RGB and alpha blend factors for finer control.</li>
 * </ul>
 *
 * <h2>Fog Coordinates</h2>
 * <ul>
 *   <li>{@code glFogCoord*} / {@code glFogCoordPointer} — Supply or array-bind per-vertex fog coordinates
 *       to control fog intensity independent of eye-space depth.</li>
 * </ul>
 *
 * <h2>Multi-Draw</h2>
 * <ul>
 *   <li>{@code glMultiDrawArrays}, {@code glMultiDrawElements} — Issue multiple draw calls in one API invocation
 *       by passing arrays of first/count (and optional index pointers) to reduce CPU overhead.</li>
 * </ul>
 *
 * <h2>Point Sprite Parameters</h2>
 * <ul>
 *   <li>{@code glPointParameter*i/f/v} — Configure point rasterization behavior (e.g., size attenuation,
 *       min/max size, fade threshold) for particle-like rendering.</li>
 * </ul>
 *
 * <h2>Secondary Color</h2>
 * <ul>
 *   <li>{@code glSecondaryColor3*} / {@code glSecondaryColorPointer} — Provide a secondary per-vertex color
 *       used by certain fixed-function operations (e.g., separate specular color).</li>
 * </ul>
 *
 * <h2>Window-Space Raster Position</h2>
 * <ul>
 *   <li>{@code glWindowPos2* / 3*} — Set the current raster position directly in window coordinates,
 *       bypassing modelview/projection transforms (useful for HUD/text overlays).</li>
 * </ul>
 *
 * <h3>Notes</h3>
 * <ul>
 *   <li>Per-vertex fog coordinates interact with the fog equation set via {@code glFog*} state.</li>
 *   <li>Secondary color arrays require enabling {@code GL_SECONDARY_COLOR_ARRAY} client state.</li>
 *   <li>Multi-draw functions expect arrays that remain valid for the duration of the call.</li>
 * </ul>
 */
public interface GL14Accessor extends GL13Accessor, glBlendColor, glBlendEquation, glFogCoordf, glFogCoordd, glFogCoordfv, glFogCoorddv, glFogCoordPointer, glMultiDrawArrays, glMultiDrawElements, glPointParameterf, glPointParameteri, glPointParameterfv, glPointParameteriv, glSecondaryColor3b, glSecondaryColor3s, glSecondaryColor3i, glSecondaryColor3f, glSecondaryColor3d, glSecondaryColor3ub, glSecondaryColor3us, glSecondaryColor3ui, glSecondaryColor3bv, glSecondaryColor3sv, glSecondaryColor3iv, glSecondaryColor3fv, glSecondaryColor3dv, glSecondaryColor3ubv, glSecondaryColor3usv, glSecondaryColor3uiv, glSecondaryColorPointer, glBlendFuncSeparate, glWindowPos2i, glWindowPos2s, glWindowPos2f, glWindowPos2d, glWindowPos2iv, glWindowPos2sv, glWindowPos2fv, glWindowPos2dv, glWindowPos3i, glWindowPos3s, glWindowPos3f, glWindowPos3d, glWindowPos3iv, glWindowPos3sv, glWindowPos3fv, glWindowPos3dv {

}
