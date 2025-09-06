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

public interface glGenerateTextureMipmap {

/**
 * DSA version of {@link GL30C#glGenerateMipmap GenerateMipmap}.
 *
 * @param texture the texture name
 *
 * @see <a href="https://docs.gl/gl4/glGenerateTextureMipmap">Reference Page</a>
 */
    public void glGenerateTextureMipmap(int texture);

}
