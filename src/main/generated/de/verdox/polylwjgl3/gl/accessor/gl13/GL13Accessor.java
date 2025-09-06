package de.verdox.polylwjgl3.gl.accessor.gl13;

import de.verdox.polylwjgl3.gl.accessor.gl12.GL12Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl12.GL12AccessorImpl;
import de.verdox.polylwjgl3.gl.functions.gl.glClientActiveTexture;
import de.verdox.polylwjgl3.gl.functions.gl.glCompressedTexImage1D;
import de.verdox.polylwjgl3.gl.functions.gl.glCompressedTexSubImage1D;
import de.verdox.polylwjgl3.gl.functions.gl.glGetCompressedTexImage;
import de.verdox.polylwjgl3.gl.functions.gl.glLoadTransposeMatrixd;
import de.verdox.polylwjgl3.gl.functions.gl.glLoadTransposeMatrixf;
import de.verdox.polylwjgl3.gl.functions.gl.glMultTransposeMatrixd;
import de.verdox.polylwjgl3.gl.functions.gl.glMultTransposeMatrixf;
import de.verdox.polylwjgl3.gl.functions.gl.glMultiTexCoord1d;
import de.verdox.polylwjgl3.gl.functions.gl.glMultiTexCoord1dv;
import de.verdox.polylwjgl3.gl.functions.gl.glMultiTexCoord1f;
import de.verdox.polylwjgl3.gl.functions.gl.glMultiTexCoord1fv;
import de.verdox.polylwjgl3.gl.functions.gl.glMultiTexCoord1i;
import de.verdox.polylwjgl3.gl.functions.gl.glMultiTexCoord1iv;
import de.verdox.polylwjgl3.gl.functions.gl.glMultiTexCoord1s;
import de.verdox.polylwjgl3.gl.functions.gl.glMultiTexCoord1sv;
import de.verdox.polylwjgl3.gl.functions.gl.glMultiTexCoord2d;
import de.verdox.polylwjgl3.gl.functions.gl.glMultiTexCoord2dv;
import de.verdox.polylwjgl3.gl.functions.gl.glMultiTexCoord2f;
import de.verdox.polylwjgl3.gl.functions.gl.glMultiTexCoord2fv;
import de.verdox.polylwjgl3.gl.functions.gl.glMultiTexCoord2i;
import de.verdox.polylwjgl3.gl.functions.gl.glMultiTexCoord2iv;
import de.verdox.polylwjgl3.gl.functions.gl.glMultiTexCoord2s;
import de.verdox.polylwjgl3.gl.functions.gl.glMultiTexCoord2sv;
import de.verdox.polylwjgl3.gl.functions.gl.glMultiTexCoord3d;
import de.verdox.polylwjgl3.gl.functions.gl.glMultiTexCoord3dv;
import de.verdox.polylwjgl3.gl.functions.gl.glMultiTexCoord3f;
import de.verdox.polylwjgl3.gl.functions.gl.glMultiTexCoord3fv;
import de.verdox.polylwjgl3.gl.functions.gl.glMultiTexCoord3i;
import de.verdox.polylwjgl3.gl.functions.gl.glMultiTexCoord3iv;
import de.verdox.polylwjgl3.gl.functions.gl.glMultiTexCoord3s;
import de.verdox.polylwjgl3.gl.functions.gl.glMultiTexCoord3sv;
import de.verdox.polylwjgl3.gl.functions.gl.glMultiTexCoord4d;
import de.verdox.polylwjgl3.gl.functions.gl.glMultiTexCoord4dv;
import de.verdox.polylwjgl3.gl.functions.gl.glMultiTexCoord4f;
import de.verdox.polylwjgl3.gl.functions.gl.glMultiTexCoord4fv;
import de.verdox.polylwjgl3.gl.functions.gl.glMultiTexCoord4i;
import de.verdox.polylwjgl3.gl.functions.gl.glMultiTexCoord4iv;
import de.verdox.polylwjgl3.gl.functions.gl.glMultiTexCoord4s;
import de.verdox.polylwjgl3.gl.functions.gl.glMultiTexCoord4sv;
import de.verdox.polylwjgl3.gl.functions.glActiveTexture;
import de.verdox.polylwjgl3.gl.functions.glCompressedTexImage2D;
import de.verdox.polylwjgl3.gl.functions.glCompressedTexImage3D;
import de.verdox.polylwjgl3.gl.functions.glCompressedTexSubImage2D;
import de.verdox.polylwjgl3.gl.functions.glCompressedTexSubImage3D;
import de.verdox.polylwjgl3.gl.functions.glSampleCoverage;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL13;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryUtil.*;

/**
 * OpenGL 1.3 Accessor — Compressed textures, multitexturing, and transpose matrices.
 *
 * <p>Extends {@link GL12Accessor} with new capabilities for texture compression,
 * multiple texture units, and improved matrix handling.</p>
 *
 * <h2>Compressed Textures</h2>
 * <ul>
 *   <li>{@code glCompressedTexImage1D / 2D / 3D} —
 *       Define a 1D, 2D, or 3D texture image using a compressed format (e.g., S3TC/DXTn).</li>
 *   <li>{@code glCompressedTexSubImage1D / 2D / 3D} —
 *       Replace a portion of an existing compressed texture image with new compressed data.</li>
 *   <li>{@code glGetCompressedTexImage} —
 *       Retrieve compressed texture image data from GPU memory back to client memory.</li>
 * </ul>
 *
 * <h2>Multitexturing</h2>
 * <ul>
 *   <li>{@code glActiveTexture} — Selects the active texture unit for subsequent texture state calls.</li>
 *   <li>{@code glClientActiveTexture} — Selects the client texture unit for vertex array specification.</li>
 *   <li>{@code glMultiTexCoord1/2/3/4*} — Directly supply texture coordinates for a specified texture unit
 *       (supports all scalar types: float, double, int, short, etc. and vector variants).</li>
 * </ul>
 *
 * <h2>Matrix Operations</h2>
 * <ul>
 *   <li>{@code glLoadTransposeMatrixf / glLoadTransposeMatrixd} —
 *       Load a row-major matrix (transposed) directly into the current matrix stack.</li>
 *   <li>{@code glMultTransposeMatrixf / glMultTransposeMatrixd} —
 *       Multiply the current matrix with a transposed (row-major) matrix.</li>
 * </ul>
 *
 * <h2>Antialiasing Control</h2>
 * <ul>
 *   <li>{@code glSampleCoverage} — Define multisample coverage parameters,
 *       controlling how samples are weighted for antialiasing.</li>
 * </ul>
 *
 * <h3>Notes</h3>
 * <ul>
 *   <li>Compressed textures reduce memory bandwidth and storage requirements;
 *       formats are implementation-dependent but can be queried via {@code glGet}.</li>
 *   <li>Multitexture coordinates allow combining multiple textures in a single draw call,
 *       enabling effects such as light mapping and detail texturing.</li>
 *   <li>Transpose matrix functions simplify integration with libraries that store matrices
 *       in row-major order (e.g., DirectX, certain math libraries).</li>
 * </ul>
 */
public interface GL13Accessor extends GL12Accessor, glCompressedTexImage3D, glCompressedTexImage2D, glCompressedTexImage1D, glCompressedTexSubImage3D, glCompressedTexSubImage2D, glCompressedTexSubImage1D, glGetCompressedTexImage, glSampleCoverage, glActiveTexture, glClientActiveTexture, glMultiTexCoord1f, glMultiTexCoord1s, glMultiTexCoord1i, glMultiTexCoord1d, glMultiTexCoord1fv, glMultiTexCoord1sv, glMultiTexCoord1iv, glMultiTexCoord1dv, glMultiTexCoord2f, glMultiTexCoord2s, glMultiTexCoord2i, glMultiTexCoord2d, glMultiTexCoord2fv, glMultiTexCoord2sv, glMultiTexCoord2iv, glMultiTexCoord2dv, glMultiTexCoord3f, glMultiTexCoord3s, glMultiTexCoord3i, glMultiTexCoord3d, glMultiTexCoord3fv, glMultiTexCoord3sv, glMultiTexCoord3iv, glMultiTexCoord3dv, glMultiTexCoord4f, glMultiTexCoord4s, glMultiTexCoord4i, glMultiTexCoord4d, glMultiTexCoord4fv, glMultiTexCoord4sv, glMultiTexCoord4iv, glMultiTexCoord4dv, glLoadTransposeMatrixf, glLoadTransposeMatrixd, glMultTransposeMatrixf, glMultTransposeMatrixd {

}
