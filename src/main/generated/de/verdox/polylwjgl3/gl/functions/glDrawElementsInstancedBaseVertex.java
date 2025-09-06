package de.verdox.polylwjgl3.gl.functions;

import de.verdox.polylwjgl3.gl.accessor.gles31.GLES31Accessor;
import de.verdox.polylwjgl3.gl.accessor.gles31.GLES31AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengles.GLES32;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glDrawElementsInstancedBaseVertex {

    public void nglDrawElementsInstancedBaseVertex(int mode, int count, int type, long indices, int instancecount, int basevertex);

/**
 * <a href="https://docs.gl/es3/glDrawElementsInstancedBaseVertex">Reference Page</a>
 */
    public void glDrawElementsInstancedBaseVertex(int mode, int count, int type, long indices, int instancecount, int basevertex);

/**
 * <a href="https://docs.gl/es3/glDrawElementsInstancedBaseVertex">Reference Page</a>
 */
    public void glDrawElementsInstancedBaseVertex(int mode, int type, ByteBuffer indices, int instancecount, int basevertex);

/**
 * <a href="https://docs.gl/es3/glDrawElementsInstancedBaseVertex">Reference Page</a>
 */
    public void glDrawElementsInstancedBaseVertex(int mode, ByteBuffer indices, int instancecount, int basevertex);

/**
 * <a href="https://docs.gl/es3/glDrawElementsInstancedBaseVertex">Reference Page</a>
 */
    public void glDrawElementsInstancedBaseVertex(int mode, ShortBuffer indices, int instancecount, int basevertex);

/**
 * <a href="https://docs.gl/es3/glDrawElementsInstancedBaseVertex">Reference Page</a>
 */
    public void glDrawElementsInstancedBaseVertex(int mode, IntBuffer indices, int instancecount, int basevertex);

}
