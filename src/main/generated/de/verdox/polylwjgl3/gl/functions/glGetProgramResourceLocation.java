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

public interface glGetProgramResourceLocation {

    public int nglGetProgramResourceLocation(int program, int programInterface, long name);

/**
 * <a href="https://docs.gl/es3/glGetProgramResourceLocation">Reference Page</a>
 */
    public int glGetProgramResourceLocation(int program, int programInterface, ByteBuffer name);

/**
 * <a href="https://docs.gl/es3/glGetProgramResourceLocation">Reference Page</a>
 */
    public int glGetProgramResourceLocation(int program, int programInterface, CharSequence name);

}
