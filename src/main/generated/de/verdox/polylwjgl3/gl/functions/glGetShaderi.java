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

public interface glGetShaderi {

/**
 * <a href="https://docs.gl/es3/glGetShader">Reference Page</a>
 */
@NativeType("void")
    public int glGetShaderi(@NativeType("GLuint") int shader, @NativeType("GLenum") int pname);

}
