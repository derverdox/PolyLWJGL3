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

public interface glUniform3uiv {

    public void nglUniform3uiv(int location, int count, long value);

/**
 * <a href="https://docs.gl/es3/glUniform">Reference Page</a>
 */
    public void glUniform3uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value);

/**
 * Array version of: {@link #glUniform3uiv Uniform3uiv}
 *
 * @see <a href="https://docs.gl/es3/glUniform">Reference Page</a>
 */
    public void glUniform3uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") int[] value);

}
