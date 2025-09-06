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

public interface glPopAttrib {

/**
 * Resets the values of those state variables that were saved with the last {@link #glPushAttrib PushAttrib}. Those not saved remain unchanged.
 *
 * @see <a href="https://docs.gl/gl3/glPopAttrib">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glPopAttrib();

}
