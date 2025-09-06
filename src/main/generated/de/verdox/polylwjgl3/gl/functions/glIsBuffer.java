package de.verdox.polylwjgl3.gl.functions;

import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengles.GLES20;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glIsBuffer {

/**
 * <a href="https://docs.gl/es3/glIsBuffer">Reference Page</a>
 */
@NativeType("GLboolean")
    public boolean glIsBuffer(@NativeType("GLuint") int buffer);

}
