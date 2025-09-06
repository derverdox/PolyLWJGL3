package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl41.GL41Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl41.GL41AccessorImpl;
import java.nio.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL42;
import org.lwjgl.system.*;

public interface glTexStorage1D {

/**
 * Simultaneously specifies storage for all levels of a one-dimensional texture.
 *
 * @param target         the target of the operation. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_PROXY_TEXTURE_1D PROXY_TEXTURE_1D}</td></tr></table>
 * @param levels         the number of texture levels
 * @param internalformat the sized internal format to be used to store texture image data
 * @param width          the width of the texture, in texels
 *
 * @see <a href="https://docs.gl/gl4/glTexStorage1D">Reference Page</a>
 */
    public void glTexStorage1D(@NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width);

}
