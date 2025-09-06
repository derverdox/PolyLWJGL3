package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl42.GL42Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl42.GL42AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL43;
import org.lwjgl.system.*;

public interface glMultiDrawArraysIndirect {

/**
 * Unsafe version of: {@link #glMultiDrawArraysIndirect MultiDrawArraysIndirect}
 */
    public void nglMultiDrawArraysIndirect(int mode, long indirect, int drawcount, int stride);

/**
 * Renders multiple sets of primitives from array data, taking parameters from memory.
 *
 * <p>The parameters addressed by {@code indirect} are packed into an array of structures, each element of which takes the form (in C):</p>
 *
 * <pre><code>
 * typedef struct {
 *     uint count;
 *     uint primCount;
 *     uint first;
 *     uint baseInstance;
 * } DrawArraysIndirectCommand;</code></pre>
 *
 * <p>A single call to {@code glMultiDrawArraysIndirect} is equivalent, assuming no errors are generated to:</p>
 *
 * <pre><code>
 * const ubyte *ptr = (const ubyte *)indirect;
 * for ( i = 0; i &lt; drawcount; i++ ) {
 *     DrawArraysIndirect(mode, (DrawArraysIndirectCommand*)ptr);
 *     if ( stride == 0 )
 *         ptr += sizeof(DrawArraysIndirectCommand);
 *     else
 *         ptr += stride;
 * }</code></pre>
 *
 * @param mode      what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
 * @param indirect  an array of structures containing the draw parameters
 * @param drawcount the number of elements in the array of draw parameter structures
 * @param stride    the distance in basic machine units between elements of the draw parameter array
 *
 * @see <a href="https://docs.gl/gl4/glMultiDrawArraysIndirect">Reference Page</a>
 */
    public void glMultiDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride);

/**
 * Renders multiple sets of primitives from array data, taking parameters from memory.
 *
 * <p>The parameters addressed by {@code indirect} are packed into an array of structures, each element of which takes the form (in C):</p>
 *
 * <pre><code>
 * typedef struct {
 *     uint count;
 *     uint primCount;
 *     uint first;
 *     uint baseInstance;
 * } DrawArraysIndirectCommand;</code></pre>
 *
 * <p>A single call to {@code glMultiDrawArraysIndirect} is equivalent, assuming no errors are generated to:</p>
 *
 * <pre><code>
 * const ubyte *ptr = (const ubyte *)indirect;
 * for ( i = 0; i &lt; drawcount; i++ ) {
 *     DrawArraysIndirect(mode, (DrawArraysIndirectCommand*)ptr);
 *     if ( stride == 0 )
 *         ptr += sizeof(DrawArraysIndirectCommand);
 *     else
 *         ptr += stride;
 * }</code></pre>
 *
 * @param mode      what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
 * @param indirect  an array of structures containing the draw parameters
 * @param drawcount the number of elements in the array of draw parameter structures
 * @param stride    the distance in basic machine units between elements of the draw parameter array
 *
 * @see <a href="https://docs.gl/gl4/glMultiDrawArraysIndirect">Reference Page</a>
 */
    public void glMultiDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") long indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride);

/**
 * Renders multiple sets of primitives from array data, taking parameters from memory.
 *
 * <p>The parameters addressed by {@code indirect} are packed into an array of structures, each element of which takes the form (in C):</p>
 *
 * <pre><code>
 * typedef struct {
 *     uint count;
 *     uint primCount;
 *     uint first;
 *     uint baseInstance;
 * } DrawArraysIndirectCommand;</code></pre>
 *
 * <p>A single call to {@code glMultiDrawArraysIndirect} is equivalent, assuming no errors are generated to:</p>
 *
 * <pre><code>
 * const ubyte *ptr = (const ubyte *)indirect;
 * for ( i = 0; i &lt; drawcount; i++ ) {
 *     DrawArraysIndirect(mode, (DrawArraysIndirectCommand*)ptr);
 *     if ( stride == 0 )
 *         ptr += sizeof(DrawArraysIndirectCommand);
 *     else
 *         ptr += stride;
 * }</code></pre>
 *
 * @param mode      what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
 * @param indirect  an array of structures containing the draw parameters
 * @param drawcount the number of elements in the array of draw parameter structures
 * @param stride    the distance in basic machine units between elements of the draw parameter array
 *
 * @see <a href="https://docs.gl/gl4/glMultiDrawArraysIndirect">Reference Page</a>
 */
    public void glMultiDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride);

/**
 * Array version of: {@link #glMultiDrawArraysIndirect MultiDrawArraysIndirect}
 *
 * @see <a href="https://docs.gl/gl4/glMultiDrawArraysIndirect">Reference Page</a>
 */
    public void glMultiDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") int[] indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride);

}
