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

public interface glCopyTexImage2D {

/**
 * <a href="https://docs.gl/es3/glCopyTexImage2D">Reference Page</a>
 */
    public void glCopyTexImage2D(int target, int level, int internalformat, int x, int y, int width, int height, int border);

}
