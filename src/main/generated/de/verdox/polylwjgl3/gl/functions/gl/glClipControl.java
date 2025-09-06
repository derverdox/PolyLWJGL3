package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl44.GL44Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl44.GL44AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL45;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glClipControl {

/**
 * Controls the clipping volume behavior.
 *
 * <p>These parameters update the clip control origin and depth mode respectively. The initial value of the clip control origin is {@link GL20#GL_LOWER_LEFT LOWER_LEFT} and the
 * initial value of the depth mode is {@link GL45C#GL_NEGATIVE_ONE_TO_ONE NEGATIVE_ONE_TO_ONE}.</p>
 *
 * <p>The error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated if ClipControl is executed between the execution of {@link GL11#glBegin Begin} and the corresponding
 * execution of {@link GL11#glEnd End}.</p>
 *
 * @param origin the clip origin. One of:<br><table><tr><td>{@link GL20#GL_LOWER_LEFT LOWER_LEFT}</td><td>{@link GL20#GL_UPPER_LEFT UPPER_LEFT}</td></tr></table>
 * @param depth  the clip depth mode. One of:<br><table><tr><td>{@link GL45C#GL_NEGATIVE_ONE_TO_ONE NEGATIVE_ONE_TO_ONE}</td><td>{@link GL45C#GL_ZERO_TO_ONE ZERO_TO_ONE}</td></tr></table>
 *
 * @see <a href="https://docs.gl/gl4/glClipControl">Reference Page</a>
 */
    public void glClipControl(int origin, int depth);

}
