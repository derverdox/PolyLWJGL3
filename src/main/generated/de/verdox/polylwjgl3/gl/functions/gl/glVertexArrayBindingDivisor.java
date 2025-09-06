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

public interface glVertexArrayBindingDivisor {

/**
 * DSA version of {@link GL43C#glVertexBindingDivisor VertexBindingDivisor}.
 *
 * @param vaobj        the vertex array object name
 * @param bindingindex the index of the generic vertex attribute
 * @param divisor      the number of instances that will pass between updates of the generic attribute at slot {@code index}
 *
 * @see <a href="https://docs.gl/gl4/glVertexArrayBindingDivisor">Reference Page</a>
 */
    public void glVertexArrayBindingDivisor(int vaobj, int bindingindex, int divisor);

}
