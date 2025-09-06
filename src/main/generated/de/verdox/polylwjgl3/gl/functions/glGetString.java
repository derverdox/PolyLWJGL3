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

public interface glGetString {

    public long nglGetString(int name);

/**
 * <a href="https://docs.gl/es3/glGetString">Reference Page</a>
 */
@Nullable
@NativeType("GLubyte const *")
    public String glGetString(@NativeType("GLenum") int name);

}
