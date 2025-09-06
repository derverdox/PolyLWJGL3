package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl43.GL43Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl43.GL43AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL44;
import org.lwjgl.system.*;

public interface glBindVertexBuffers {

/**
 * Unsafe version of: {@link #glBindVertexBuffers BindVertexBuffers}
 *
 * @param count the number of vertex buffer binding points
 */
    public void nglBindVertexBuffers(int first, int count, long buffers, long offsets, long strides);

/**
 * Binds {@code count} existing buffer objects to vertex buffer binding points numbered {@code first} through {@code first+count-1}. If {@code buffers} is
 * not {@code NULL}, it specifies an array of {@code count} values, each of which must be zero or the name of an existing buffer object. {@code offsets} and
 * {@code strides} specify arrays of {@code count} values indicating the offset of the first element and stride between elements in each buffer,
 * respectively. If {@code buffers} is {@code NULL}, each affected vertex buffer binding point from {@code first} through {@code first+count-1} will be reset to
 * have no bound buffer object. In this case, the offsets and strides associated with the binding points are set to default values, ignoring
 * {@code offsets} and {@code strides}.
 *
 * <p>{@code BindVertexBuffers} is equivalent to:</p>
 *
 * <pre><code>
 * for ( i = 0; i &lt; count; i++ ) {
 *     if ( buffers == NULL ) {
 *         glBindVertexBuffer(first + i, 0, 0, 16);
 *     } else {
 *         glBindVertexBuffer(first + i, buffers[i], offsets[i], strides[i]);
 *     }
 * }</code></pre>
 *
 * <p>except that buffers will not be created if they do not exist.</p>
 *
 * <p>The values specified in {@code buffers}, {@code offsets}, and {@code strides} will be checked separately for each vertex buffer binding point. When a
 * value for a specific binding point is invalid, the state for that binding point will be unchanged and an error will be generated. However, state for
 * other binding points will still be changed if their corresponding values are valid.</p>
 *
 * @param first   the first vertex buffer binding point
 * @param buffers an array of zeros or names of existing buffers objects
 * @param offsets an array of offses
 * @param strides an array of stride values
 *
 * @see <a href="https://docs.gl/gl4/glBindVertexBuffers">Reference Page</a>
 */
    public void glBindVertexBuffers(int first, @Nullable IntBuffer buffers, @Nullable PointerBuffer offsets, @Nullable IntBuffer strides);

/**
 * Array version of: {@link #glBindVertexBuffers BindVertexBuffers}
 *
 * @see <a href="https://docs.gl/gl4/glBindVertexBuffers">Reference Page</a>
 */
    public void glBindVertexBuffers(int first, @Nullable int[] buffers, @Nullable PointerBuffer offsets, @Nullable int[] strides);

}
