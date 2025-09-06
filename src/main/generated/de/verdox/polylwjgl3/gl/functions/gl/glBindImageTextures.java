package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl43.GL43Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl43.GL43AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL44;
import org.lwjgl.system.*;

public interface glBindImageTextures {

/**
 * Unsafe version of: {@link #glBindImageTextures BindImageTextures}
 *
 * @param count the number of image units
 */
    public void nglBindImageTextures(int first, int count, long textures);

/**
 * Binds {@code count} existing texture objects to image units numbered {@code first} through {@code first+count-1}. If {@code textures} is not {@code NULL}, it
 * specifies an array of {@code count} values, each of which must be zero or the name of an existing texture object. If {@code textures} is {@code NULL}, each
 * affected image unit from {@code first} through {@code first+count-1} will be reset to have no bound texture object.
 *
 * <p>When binding a non-zero texture object to an image unit, the image unit {@code level}, {@code layered}, {@code layer}, and {@code access} parameters are
 * set to zero, {@link GL11#GL_TRUE TRUE}, zero, and {@link GL15#GL_READ_WRITE READ_WRITE}, respectively. The image unit {@code format} parameter is taken from the internal
 * format of the texture image at level zero of the texture object identified by {@code textures}. For cube map textures, the internal format of the
 * {@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_X TEXTURE_CUBE_MAP_POSITIVE_X} image of level zero is used. For multisample, multisample array, buffer, and rectangle textures, the internal
 * format of the single texture level is used.</p>
 *
 * <p>When unbinding a texture object from an image unit, the image unit parameters {@code level}, {@code layered}, {@code layer}, and {@code format} will be
 * reset to their default values of zero, {@link GL11#GL_FALSE FALSE}, 0, and {@link GL30#GL_R8 R8}, respectively.</p>
 *
 * <p>{@code BindImageTextures} is equivalent to:</p>
 *
 * <pre><code>
 * for ( i = 0; i &lt; count; i++ ) {
 *     if ( textures == NULL || textures[i] = 0 ) {
 *         glBindImageTexture(first + i, 0, 0, FALSE, 0, READ_ONLY, R8);
 *     } else {
 *         glBindImageTexture(first + i, textures[i], 0, TRUE, 0, READ_WRITE, lookupInternalFormat(textures[i]));
 *     }
 * }</code></pre>
 *
 * <p>where {@code lookupInternalFormat} returns the internal format of the specified texture object.</p>
 *
 * <p>The values specified in {@code textures} will be checked separately for each image unit. When a value for a specific image unit is invalid, the state
 * for that image unit will be unchanged and an error will be generated. However, state for other image units will still be changed if their corresponding
 * values are valid.</p>
 *
 * @param first    the first image unit
 * @param textures an array of zeros or names of existing texture objects
 *
 * @see <a href="https://docs.gl/gl4/glBindImageTextures">Reference Page</a>
 */
    public void glBindImageTextures(int first, @Nullable IntBuffer textures);

/**
 * Array version of: {@link #glBindImageTextures BindImageTextures}
 *
 * @see <a href="https://docs.gl/gl4/glBindImageTextures">Reference Page</a>
 */
    public void glBindImageTextures(int first, @Nullable int[] textures);

}
