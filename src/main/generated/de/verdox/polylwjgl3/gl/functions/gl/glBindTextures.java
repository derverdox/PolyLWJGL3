package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl43.GL43Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl43.GL43AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL44;
import org.lwjgl.system.*;

public interface glBindTextures {

/**
 * Unsafe version of: {@link #glBindTextures BindTextures}
 *
 * @param count the number of texture objects
 */
    public void nglBindTextures(int first, int count, long textures);

/**
 * Binds {@code count} existing texture objects to texture image units numbered {@code first} through {@code first+count-1}. If {@code textures} is not
 * {@code NULL}, it specifies an array of {@code count} values, each of which must be zero or the name of an existing texture object. When an entry in
 * {@code textures} is the name of an existing texture object, that object is bound to corresponding texture unit for the target specified when the texture
 * object was created. When an entry in {@code textures} is zero, each of the targets enumerated at the beginning of this section is reset to its default
 * texture for the corresponding texture image unit. If {@code textures} is {@code NULL}, each target of each affected texture image unit from {@code first}
 * through {@code first+count-1} is reset to its default texture.
 *
 * <p>{@code BindTextures} is equivalent to:</p>
 *
 * <pre><code>
 * for ( i = 0; i &lt; count; i++ ) {
 *     uint texture;
 *     if ( textures == NULL ) {
 *         texture = 0;
 *     } else {
 *         texture = textures[i];
 *     }
 *     ActiveTexture(TEXTURE0 + first + i);
 *     if ( texture != 0 ) {
 *         enum target; // target of texture object textures[i]
 *         BindTexture(target, textures[i]);
 *     } else {
 *         for ( target in all supported targets ) {
 *             BindTexture(target, 0);
 *         }
 *     }
 * }</code></pre>
 *
 * <p>except that the active texture selector retains its original value upon completion of the command, and that textures will not be created if they do not
 * exist.</p>
 *
 * <p>The values specified in {@code textures} will be checked separately for each texture image unit. When a value for a specific texture image unit is
 * invalid, the state for that texture image unit will be unchanged and an error will be generated. However, state for other texture image units will still
 * be changed if their corresponding values are valid.</p>
 *
 * @param first    the first texture objects
 * @param textures an array of zeros or names of existing texture objects
 *
 * @see <a href="https://docs.gl/gl4/glBindTextures">Reference Page</a>
 */
    public void glBindTextures(@NativeType("GLuint") int first, @Nullable @NativeType("GLuint const *") IntBuffer textures);

/**
 * Array version of: {@link #glBindTextures BindTextures}
 *
 * @see <a href="https://docs.gl/gl4/glBindTextures">Reference Page</a>
 */
    public void glBindTextures(@NativeType("GLuint") int first, @Nullable @NativeType("GLuint const *") int[] textures);

}
