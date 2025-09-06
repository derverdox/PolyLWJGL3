package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl44.GL44Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl44.GL44AccessorImpl;
import de.verdox.polylwjgl3.gl.functions.glGetnUniformi;
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

public interface glGetnUniformi_CORE extends glGetnUniformi {

/**
 * Integer version of {@link #glGetnUniformfv GetnUniformfv}.
 *
 * @param program  the program object
 * @param location the uniform location
 *
 * @see <a href="https://docs.gl/gl4/glGetUniform">Reference Page</a>
 */
    public int glGetnUniformi(int program, int location);

}
