package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl44.GL44Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl44.GL44AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL45;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glBindTextureUnit {

/**
 * Binds an existing texture object to the texture unit numbered {@code unit}.
 *
 * <p>{@code texture} must be zero or the name of an existing texture object. When {@code texture} is the name of an existing texture object, that object is
 * bound to the target, in the corresponding texture unit, that was specified when the object was created. When {@code texture} is zero, each of the targets
 * enumerated at the beginning of this section is reset to its default texture for the corresponding texture image unit.</p>
 *
 * @param unit    the texture unit number
 * @param texture the texture name
 *
 * @see <a href="https://docs.gl/gl4/glBindTextureUnit">Reference Page</a>
 */
    public void glBindTextureUnit(int unit, int texture);

}
