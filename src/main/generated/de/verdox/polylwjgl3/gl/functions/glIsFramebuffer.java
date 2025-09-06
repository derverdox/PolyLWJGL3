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

public interface glIsFramebuffer {

/**
 * <a href="https://docs.gl/es3/glIsFramebuffer">Reference Page</a>
 */
@NativeType("GLboolean")
    public boolean glIsFramebuffer(@NativeType("GLuint") int framebuffer);

}
