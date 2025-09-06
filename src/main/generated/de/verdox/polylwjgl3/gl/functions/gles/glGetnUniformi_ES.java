package de.verdox.polylwjgl3.gl.functions.gles;

import de.verdox.polylwjgl3.gl.accessor.gles31.GLES31Accessor;
import de.verdox.polylwjgl3.gl.accessor.gles31.GLES31AccessorImpl;
import de.verdox.polylwjgl3.gl.functions.glGetnUniformi;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengles.GLES32;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glGetnUniformi_ES extends glGetnUniformi {

/**
 * Integer version of {@link #glGetnUniformfv GetnUniformfv}.
 *
 * @param program  the program object
 * @param location the uniform location
 *
 * @see <a href="https://docs.gl/es3/glGetUniform">Reference Page</a>
 */
    public float glGetnUniformi(int program, int location);

}
