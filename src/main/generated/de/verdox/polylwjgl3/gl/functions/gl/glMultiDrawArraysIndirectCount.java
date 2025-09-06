package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl45.GL45Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl45.GL45AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL46;
import org.lwjgl.system.*;

public interface glMultiDrawArraysIndirectCount {

/**
 * Unsafe version of: {@link #glMultiDrawArraysIndirectCount MultiDrawArraysIndirectCount}
 */
    public void nglMultiDrawArraysIndirectCount(int mode, long indirect, long drawcount, int maxdrawcount, int stride);

/**
 * Behaves similarly to {@link GL43C#glMultiDrawArraysIndirect MultiDrawArraysIndirect}, except that {@code drawcount} defines an offset (in bytes) into the buffer object bound to the
 * {@link GL46C#GL_PARAMETER_BUFFER PARAMETER_BUFFER} binding point at which a single {@code sizei} typed value is stored, which contains the draw count. {@code maxdrawcount} specifies
 * the maximum number of draws that are expected to be stored in the buffer. If the value stored at {@code drawcount} into the buffer is greater than
 * {@code maxdrawcount}, the implementation stops processing draws after {@code maxdrawcount} parameter sets. {@code drawcount} must be a multiple of
 * four.
 *
 * @param mode         what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
 * @param indirect     an array of structures containing the draw parameters
 * @param drawcount    the offset into the parameter buffer object
 * @param maxdrawcount the maximum number of draws
 * @param stride       the distance in basic machine units between elements of the draw parameter array
 *
 * @see <a href="https://docs.gl/gl4/glMultiDrawArraysIndirectCount">Reference Page</a>
 */
    public void glMultiDrawArraysIndirectCount(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride);

/**
 * Behaves similarly to {@link GL43C#glMultiDrawArraysIndirect MultiDrawArraysIndirect}, except that {@code drawcount} defines an offset (in bytes) into the buffer object bound to the
 * {@link GL46C#GL_PARAMETER_BUFFER PARAMETER_BUFFER} binding point at which a single {@code sizei} typed value is stored, which contains the draw count. {@code maxdrawcount} specifies
 * the maximum number of draws that are expected to be stored in the buffer. If the value stored at {@code drawcount} into the buffer is greater than
 * {@code maxdrawcount}, the implementation stops processing draws after {@code maxdrawcount} parameter sets. {@code drawcount} must be a multiple of
 * four.
 *
 * @param mode         what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
 * @param indirect     an array of structures containing the draw parameters
 * @param drawcount    the offset into the parameter buffer object
 * @param maxdrawcount the maximum number of draws
 * @param stride       the distance in basic machine units between elements of the draw parameter array
 *
 * @see <a href="https://docs.gl/gl4/glMultiDrawArraysIndirectCount">Reference Page</a>
 */
    public void glMultiDrawArraysIndirectCount(@NativeType("GLenum") int mode, @NativeType("void const *") long indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride);

/**
 * Behaves similarly to {@link GL43C#glMultiDrawArraysIndirect MultiDrawArraysIndirect}, except that {@code drawcount} defines an offset (in bytes) into the buffer object bound to the
 * {@link GL46C#GL_PARAMETER_BUFFER PARAMETER_BUFFER} binding point at which a single {@code sizei} typed value is stored, which contains the draw count. {@code maxdrawcount} specifies
 * the maximum number of draws that are expected to be stored in the buffer. If the value stored at {@code drawcount} into the buffer is greater than
 * {@code maxdrawcount}, the implementation stops processing draws after {@code maxdrawcount} parameter sets. {@code drawcount} must be a multiple of
 * four.
 *
 * @param mode         what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
 * @param indirect     an array of structures containing the draw parameters
 * @param drawcount    the offset into the parameter buffer object
 * @param maxdrawcount the maximum number of draws
 * @param stride       the distance in basic machine units between elements of the draw parameter array
 *
 * @see <a href="https://docs.gl/gl4/glMultiDrawArraysIndirectCount">Reference Page</a>
 */
    public void glMultiDrawArraysIndirectCount(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride);

/**
 * Array version of: {@link #glMultiDrawArraysIndirectCount MultiDrawArraysIndirectCount}
 *
 * @see <a href="https://docs.gl/gl4/glMultiDrawArraysIndirectCount">Reference Page</a>
 */
    public void glMultiDrawArraysIndirectCount(@NativeType("GLenum") int mode, @NativeType("void const *") int[] indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride);

}
