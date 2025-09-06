package de.verdox.polylwjgl3.gl.functions;

import de.verdox.polylwjgl3.gl.accessor.gles30.GLES30Accessor;
import de.verdox.polylwjgl3.gl.accessor.gles30.GLES30AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengles.GLES31;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glCreateShaderProgramv {

    public int nglCreateShaderProgramv(int type, int count, long strings);

/**
 * <a href="https://docs.gl/es3/glCreateShaderProgramv">Reference Page</a>
 */
@NativeType("GLuint")
    public int glCreateShaderProgramv(@NativeType("GLenum") int type, @NativeType("GLchar const * const *") PointerBuffer strings);

/**
 * <a href="https://docs.gl/es3/glCreateShaderProgramv">Reference Page</a>
 */
@NativeType("GLuint")
    public int glCreateShaderProgramv(@NativeType("GLenum") int type, @NativeType("GLchar const * const *") CharSequence... strings);

/**
 * <a href="https://docs.gl/es3/glCreateShaderProgramv">Reference Page</a>
 */
@NativeType("GLuint")
    public int glCreateShaderProgramv(@NativeType("GLenum") int type, @NativeType("GLchar const * const *") CharSequence string);

}
