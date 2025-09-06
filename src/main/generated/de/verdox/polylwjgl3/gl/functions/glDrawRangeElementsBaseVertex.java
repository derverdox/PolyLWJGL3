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

public interface glDrawRangeElementsBaseVertex {

    public void nglDrawRangeElementsBaseVertex(int mode, int start, int end, int count, int type, long indices, int basevertex);

/**
 * <a href="https://docs.gl/es3/glDrawRangeElementsBaseVertex">Reference Page</a>
 */
    public void glDrawRangeElementsBaseVertex(int mode, int start, int end, int count, int type, long indices, int basevertex);

/**
 * <a href="https://docs.gl/es3/glDrawRangeElementsBaseVertex">Reference Page</a>
 */
    public void glDrawRangeElementsBaseVertex(int mode, int start, int end, int type, ByteBuffer indices, int basevertex);

/**
 * <a href="https://docs.gl/es3/glDrawRangeElementsBaseVertex">Reference Page</a>
 */
    public void glDrawRangeElementsBaseVertex(int mode, int start, int end, ByteBuffer indices, int basevertex);

/**
 * <a href="https://docs.gl/es3/glDrawRangeElementsBaseVertex">Reference Page</a>
 */
    public void glDrawRangeElementsBaseVertex(int mode, int start, int end, ShortBuffer indices, int basevertex);

/**
 * <a href="https://docs.gl/es3/glDrawRangeElementsBaseVertex">Reference Page</a>
 */
    public void glDrawRangeElementsBaseVertex(int mode, int start, int end, IntBuffer indices, int basevertex);

}
