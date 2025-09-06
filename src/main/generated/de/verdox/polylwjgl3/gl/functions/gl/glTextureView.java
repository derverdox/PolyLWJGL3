package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl42.GL42Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl42.GL42AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL43;
import org.lwjgl.system.*;

public interface glTextureView {

/**
 * Initializes a texture as a data alias of another texture's data store.
 *
 * @param texture        the texture object to be initialized as a view
 * @param target         the target to be used for the newly initialized texture
 * @param origtexture    the name of a texture object of which to make a view
 * @param internalformat the internal format for the newly created view
 * @param minlevel       the  lowest level of detail of the view
 * @param numlevels      the number of levels of detail to include in the view
 * @param minlayer       the index of the first layer to include in the view
 * @param numlayers      the number of layers to include in the view
 *
 * @see <a href="https://docs.gl/gl4/glTextureView">Reference Page</a>
 */
    public void glTextureView(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLuint") int origtexture, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int minlevel, @NativeType("GLuint") int numlevels, @NativeType("GLuint") int minlayer, @NativeType("GLuint") int numlayers);

}
