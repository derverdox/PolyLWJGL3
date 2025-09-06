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

public interface glGetTexParameteri {

/**
 * <a href="https://docs.gl/es3/glGetTexParameter">Reference Page</a>
 */
@NativeType("void")
    public int glGetTexParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname);

}
