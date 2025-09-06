package de.verdox.polylwjgl3.gl.functions.gl;

import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glPixelStoref {

/**
 * Float version of {@link #glPixelStorei PixelStorei}.
 *
 * @param pname the pixel store parameter to set
 * @param param the parameter value
 *
 * @see <a href="https://docs.gl/gl4/glPixelStoref">Reference Page</a>
 */
    public void glPixelStoref(int pname, float param);

}
