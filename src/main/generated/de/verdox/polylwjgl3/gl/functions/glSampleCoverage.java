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

public interface glSampleCoverage {

/**
 * <a href="https://docs.gl/es3/glSampleCoverage">Reference Page</a>
 */
    public void glSampleCoverage(@NativeType("GLfloat") float value, @NativeType("GLboolean") boolean invert);

}
