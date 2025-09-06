package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl32.GL32Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl32.GL32AccessorImpl;
import java.nio.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL33;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glQueryCounter {

/**
 * Records the GL time into a query object after all previous commands have reached the GL server but have not yet necessarily executed.
 *
 * @param id     the name of a query object into which to record the GL time
 * @param target the counter to query. Must be:<br><table><tr><td>{@link GL33C#GL_TIMESTAMP TIMESTAMP}</td></tr></table>
 *
 * @see <a href="https://docs.gl/gl4/glQueryCounter">Reference Page</a>
 */
    public void glQueryCounter(int id, int target);

}
