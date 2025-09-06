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

public interface glTransformFeedbackBufferBase {

/**
 * Binds a buffer object to a transform feedback object.
 *
 * @param xfb    zero or the name of an existing transform feedback object
 * @param index  the transform feedback stream index
 * @param buffer the name of an existing buffer object
 *
 * @see <a href="https://docs.gl/gl4/glTransformFeedbackBufferBase">Reference Page</a>
 */
    public void glTransformFeedbackBufferBase(@NativeType("GLuint") int xfb, @NativeType("GLuint") int index, @NativeType("GLuint") int buffer);

}
