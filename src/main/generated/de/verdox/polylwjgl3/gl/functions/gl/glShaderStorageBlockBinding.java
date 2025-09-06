package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl42.GL42Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl42.GL42AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL43;
import org.lwjgl.system.*;

public interface glShaderStorageBlockBinding {

/**
 * Changes an active shader storage block binding.
 *
 * @param program             the name of the program containing the block whose binding to change
 * @param storageBlockIndex   the index storage block within the program
 * @param storageBlockBinding the index storage block binding to associate with the specified storage block
 *
 * @see <a href="https://docs.gl/gl4/glShaderStorageBlockBinding">Reference Page</a>
 */
    public void glShaderStorageBlockBinding(@NativeType("GLuint") int program, @NativeType("GLuint") int storageBlockIndex, @NativeType("GLuint") int storageBlockBinding);

}
