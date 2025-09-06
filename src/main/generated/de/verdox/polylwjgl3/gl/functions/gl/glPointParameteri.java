package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl13.GL13Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl13.GL13AccessorImpl;
import java.nio.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL14;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glPointParameteri {

/**
 * Integer version of {@link #glPointParameterf PointParameterf}.
 *
 * @param pname the parameter to set. Must be:<br><table><tr><td>{@link GL14C#GL_POINT_FADE_THRESHOLD_SIZE POINT_FADE_THRESHOLD_SIZE}</td></tr></table>
 * @param param the parameter value
 *
 * @see <a href="https://docs.gl/gl4/glPointParameteri">Reference Page</a>
 */
    public void glPointParameteri(@NativeType("GLenum") int pname, @NativeType("GLint") int param);

}
