package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl43.GL43Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl43.GL43AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL44;
import org.lwjgl.system.*;

public interface glBindSamplers {

/**
 * Unsafe version of: {@link #glBindSamplers BindSamplers}
 *
 * @param count the number of sampler objects
 */
    public void nglBindSamplers(int first, int count, long samplers);

/**
 * Binds {@code count} existing sampler objects to texture image units numbered {@code first} through {@code first+count-1}. If {@code samplers} is not
 * {@code NULL}, it specifies an array of {@code count} values, each of which must be zero or the name of an existing sampler object. If {@code samplers} is {@code NULL},
 * each affected texture image unit from {@code first} through {@code first+count-1} will be reset to have no bound sampler object.
 *
 * <p>{@code BindSamplers} is equivalent to:</p>
 *
 * <pre><code>
 * for ( i = 0; i &lt; count; i++ ) {
 *     if ( samplers == NULL ) {
 *         glBindSampler(first + i, 0);
 *     } else {
 *         glBindSampler(first + i, samplers[i]);
 *     }
 * }</code></pre>
 *
 * <p>The values specified in {@code samplers} will be checked separately for each texture image unit. When a value for a specific texture image unit is
 * invalid, the state for that texture image unit will be unchanged and an error will be generated. However, state for other texture image units will still
 * be changed if their corresponding values are valid.</p>
 *
 * @param first    the first sampler object
 * @param samplers an array of zeros or names of existing sampler objects
 *
 * @see <a href="https://docs.gl/gl4/glBindSamplers">Reference Page</a>
 */
    public void glBindSamplers(int first, @Nullable IntBuffer samplers);

/**
 * Array version of: {@link #glBindSamplers BindSamplers}
 *
 * @see <a href="https://docs.gl/gl4/glBindSamplers">Reference Page</a>
 */
    public void glBindSamplers(int first, @Nullable int[] samplers);

}
