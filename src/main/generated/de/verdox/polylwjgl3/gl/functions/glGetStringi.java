package de.verdox.polylwjgl3.gl.functions;

import de.verdox.polylwjgl3.gl.accessor.gles20.GLES20Accessor;
import de.verdox.polylwjgl3.gl.accessor.gles20.GLES20AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengles.GLES30;
import org.lwjgl.system.*;
import org.lwjgl.system.APIUtil.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glGetStringi {

    public long nglGetStringi(int name, int index);

/**
 * <a href="https://docs.gl/es3/glGetStringi">Reference Page</a>
 */
@Nullable
@NativeType("GLubyte const *")
    public String glGetStringi(@NativeType("GLenum") int name, @NativeType("GLuint") int index);

}
