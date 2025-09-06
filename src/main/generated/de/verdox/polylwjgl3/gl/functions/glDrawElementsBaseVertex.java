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

public interface glDrawElementsBaseVertex {

    public void nglDrawElementsBaseVertex(int mode, int count, int type, long indices, int basevertex);

/**
 * <a href="https://docs.gl/es3/glDrawElementsBaseVertex">Reference Page</a>
 */
    public void glDrawElementsBaseVertex(int mode, int count, int type, long indices, int basevertex);

/**
 * <a href="https://docs.gl/es3/glDrawElementsBaseVertex">Reference Page</a>
 */
    public void glDrawElementsBaseVertex(int mode, int type, ByteBuffer indices, int basevertex);

/**
 * <a href="https://docs.gl/es3/glDrawElementsBaseVertex">Reference Page</a>
 */
    public void glDrawElementsBaseVertex(int mode, ByteBuffer indices, int basevertex);

/**
 * <a href="https://docs.gl/es3/glDrawElementsBaseVertex">Reference Page</a>
 */
    public void glDrawElementsBaseVertex(int mode, ShortBuffer indices, int basevertex);

/**
 * <a href="https://docs.gl/es3/glDrawElementsBaseVertex">Reference Page</a>
 */
    public void glDrawElementsBaseVertex(int mode, IntBuffer indices, int basevertex);

}
