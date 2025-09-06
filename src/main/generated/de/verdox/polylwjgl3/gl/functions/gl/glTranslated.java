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

public interface glTranslated {

/**
 * Double version of {@link #glTranslatef Translatef}.
 *
 * @param x the x-axis translation
 * @param y the y-axis translation
 * @param z the z-axis translation
 *
 * @see <a href="https://docs.gl/gl3/glTranslated">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glTranslated(double x, double y, double z);

}
