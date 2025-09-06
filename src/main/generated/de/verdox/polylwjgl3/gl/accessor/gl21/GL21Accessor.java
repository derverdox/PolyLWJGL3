package de.verdox.polylwjgl3.gl.accessor.gl21;

import de.verdox.polylwjgl3.gl.accessor.gl20.GL20Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl20.GL20AccessorImpl;
import de.verdox.polylwjgl3.gl.functions.glUniformMatrix2x3fv;
import de.verdox.polylwjgl3.gl.functions.glUniformMatrix2x4fv;
import de.verdox.polylwjgl3.gl.functions.glUniformMatrix3x2fv;
import de.verdox.polylwjgl3.gl.functions.glUniformMatrix3x4fv;
import de.verdox.polylwjgl3.gl.functions.glUniformMatrix4x2fv;
import de.verdox.polylwjgl3.gl.functions.glUniformMatrix4x3fv;
import java.nio.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL21;
import org.lwjgl.system.*;

/**
 * OpenGL 2.1 Accessor — Non-square matrix uniforms.
 *
 * <p>Extends {@link GL20Accessor} by introducing support for uploading
 * non-square matrix uniforms to GLSL programs.</p>
 *
 * <h2>Non-Square Matrix Uniforms</h2>
 * <ul>
 *   <li>{@code glUniformMatrix2x3fv} — Upload one or more 2×3 float matrices.</li>
 *   <li>{@code glUniformMatrix3x2fv} — Upload one or more 3×2 float matrices.</li>
 *   <li>{@code glUniformMatrix2x4fv} — Upload one or more 2×4 float matrices.</li>
 *   <li>{@code glUniformMatrix4x2fv} — Upload one or more 4×2 float matrices.</li>
 *   <li>{@code glUniformMatrix3x4fv} — Upload one or more 3×4 float matrices.</li>
 *   <li>{@code glUniformMatrix4x3fv} — Upload one or more 4×3 float matrices.</li>
 * </ul>
 *
 * <h3>Notes</h3>
 * <ul>
 *   <li>These functions complement the square matrix uniforms introduced in OpenGL 2.0.</li>
 *   <li>Non-square matrices are useful for certain linear algebra operations
 *       (e.g., affine transforms, projective mappings) in GLSL.</li>
 *   <li>The {@code transpose} parameter allows controlling row-major vs column-major data layout.</li>
 * </ul>
 */
public interface GL21Accessor extends GL20Accessor, glUniformMatrix2x3fv, glUniformMatrix3x2fv, glUniformMatrix2x4fv, glUniformMatrix4x2fv, glUniformMatrix3x4fv, glUniformMatrix4x3fv {

}
