package de.verdox.polylwjgl3.gl.functions;

import de.verdox.polylwjgl3.gl.accessor.gles30.GLES30Accessor;
import de.verdox.polylwjgl3.gl.accessor.gles30.GLES30AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengles.GLES31;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glGetProgramPipelineInfoLog {

    public void nglGetProgramPipelineInfoLog(int pipeline, int bufSize, long length, long infoLog);

/**
 * <a href="https://docs.gl/es3/glGetProgramPipelineInfoLog">Reference Page</a>
 */
    public void glGetProgramPipelineInfoLog(int pipeline, @Nullable IntBuffer length, ByteBuffer infoLog);

/**
 * <a href="https://docs.gl/es3/glGetProgramPipelineInfoLog">Reference Page</a>
 */
    public String glGetProgramPipelineInfoLog(int pipeline, int bufSize);

/**
 * <a href="https://docs.gl/es3/glGetProgramPipelineInfoLog">Reference Page</a>
 */
    public String glGetProgramPipelineInfoLog(int pipeline);

/**
 * Array version of: {@link #glGetProgramPipelineInfoLog GetProgramPipelineInfoLog}
 *
 * @see <a href="https://docs.gl/es3/glGetProgramPipelineInfoLog">Reference Page</a>
 */
    public void glGetProgramPipelineInfoLog(int pipeline, @Nullable int[] length, ByteBuffer infoLog);

}
