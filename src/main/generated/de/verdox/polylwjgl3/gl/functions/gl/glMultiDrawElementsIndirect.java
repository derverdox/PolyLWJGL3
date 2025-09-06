package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl42.GL42Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl42.GL42AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL43;
import org.lwjgl.system.*;

public interface glMultiDrawElementsIndirect {

/**
 * Unsafe version of: {@link #glMultiDrawElementsIndirect MultiDrawElementsIndirect}
 */
    public void nglMultiDrawElementsIndirect(int mode, int type, long indirect, int drawcount, int stride);

/**
 * Renders multiple indexed primitives from array data, taking parameters from memory.
 *
 * <p>The parameters addressed by indirect are packed into a structure that takes the form (in C):</p>
 *
 * <pre><code>
 * typedef struct {
 *     uint count;
 *     uint primCount;
 *     uint firstIndex;
 *     uint baseVertex;
 *     uint baseInstance;
 * } DrawElementsIndirectCommand;</code></pre>
 *
 * <p>A single call to {@code glMultiDrawElementsIndirect} is equivalent, assuming no errors are generated to:</p>
 *
 * <pre><code>
 * const ubyte *ptr = (const ubyte *)indirect;
 * for ( i = 0; i &lt; drawcount; i++ ) {
 *     DrawElementsIndirect(mode, type, (DrawElementsIndirectCommand *)ptr);
 *     if ( stride == 0 )
 *         ptr += sizeof(DrawElementsIndirectCommand);
 *     else
 *         ptr += stride;
 * }</code></pre>
 *
 * @param mode      what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
 * @param type      the type of data in the buffer bound to the GL_ELEMENT_ARRAY_BUFFER binding. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
 * @param indirect  a structure containing an array of draw parameters
 * @param drawcount the number of elements in the array addressed by {@code indirect}
 * @param stride    the distance in basic machine units between elements of the draw parameter array
 *
 * @see <a href="https://docs.gl/gl4/glMultiDrawElementsIndirect">Reference Page</a>
 */
    public void glMultiDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride);

/**
 * Renders multiple indexed primitives from array data, taking parameters from memory.
 *
 * <p>The parameters addressed by indirect are packed into a structure that takes the form (in C):</p>
 *
 * <pre><code>
 * typedef struct {
 *     uint count;
 *     uint primCount;
 *     uint firstIndex;
 *     uint baseVertex;
 *     uint baseInstance;
 * } DrawElementsIndirectCommand;</code></pre>
 *
 * <p>A single call to {@code glMultiDrawElementsIndirect} is equivalent, assuming no errors are generated to:</p>
 *
 * <pre><code>
 * const ubyte *ptr = (const ubyte *)indirect;
 * for ( i = 0; i &lt; drawcount; i++ ) {
 *     DrawElementsIndirect(mode, type, (DrawElementsIndirectCommand *)ptr);
 *     if ( stride == 0 )
 *         ptr += sizeof(DrawElementsIndirectCommand);
 *     else
 *         ptr += stride;
 * }</code></pre>
 *
 * @param mode      what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
 * @param type      the type of data in the buffer bound to the GL_ELEMENT_ARRAY_BUFFER binding. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
 * @param indirect  a structure containing an array of draw parameters
 * @param drawcount the number of elements in the array addressed by {@code indirect}
 * @param stride    the distance in basic machine units between elements of the draw parameter array
 *
 * @see <a href="https://docs.gl/gl4/glMultiDrawElementsIndirect">Reference Page</a>
 */
    public void glMultiDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") long indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride);

/**
 * Renders multiple indexed primitives from array data, taking parameters from memory.
 *
 * <p>The parameters addressed by indirect are packed into a structure that takes the form (in C):</p>
 *
 * <pre><code>
 * typedef struct {
 *     uint count;
 *     uint primCount;
 *     uint firstIndex;
 *     uint baseVertex;
 *     uint baseInstance;
 * } DrawElementsIndirectCommand;</code></pre>
 *
 * <p>A single call to {@code glMultiDrawElementsIndirect} is equivalent, assuming no errors are generated to:</p>
 *
 * <pre><code>
 * const ubyte *ptr = (const ubyte *)indirect;
 * for ( i = 0; i &lt; drawcount; i++ ) {
 *     DrawElementsIndirect(mode, type, (DrawElementsIndirectCommand *)ptr);
 *     if ( stride == 0 )
 *         ptr += sizeof(DrawElementsIndirectCommand);
 *     else
 *         ptr += stride;
 * }</code></pre>
 *
 * @param mode      what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
 * @param type      the type of data in the buffer bound to the GL_ELEMENT_ARRAY_BUFFER binding. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
 * @param indirect  a structure containing an array of draw parameters
 * @param drawcount the number of elements in the array addressed by {@code indirect}
 * @param stride    the distance in basic machine units between elements of the draw parameter array
 *
 * @see <a href="https://docs.gl/gl4/glMultiDrawElementsIndirect">Reference Page</a>
 */
    public void glMultiDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride);

/**
 * Array version of: {@link #glMultiDrawElementsIndirect MultiDrawElementsIndirect}
 *
 * @see <a href="https://docs.gl/gl4/glMultiDrawElementsIndirect">Reference Page</a>
 */
    public void glMultiDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") int[] indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride);

}
