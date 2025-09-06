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

public interface glGetnMapf {

/**
 * Robust version of {@link GL11#glGetMapfv GetMapfv}
 *
 * @param target the evaluator map
 * @param query  the information to query
 *
 * @see <a href="https://docs.gl/gl4/glGetMap">Reference Page</a>
 */
    public float glGetnMapf(int target, int query);

}
