package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl40.GL40Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl40.GL40AccessorImpl;
import de.verdox.polylwjgl3.gl.functions.glGetShaderPrecisionFormat;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL41;
import org.lwjgl.system.*;

public interface glGetShaderPrecisionFormat_CORE extends glGetShaderPrecisionFormat {

/**
 * Retrieves the range and precision for numeric formats supported by the shader compiler.
 *
 * @param shadertype    the type of shader whose precision to query. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td></tr></table>
 * @param precisiontype the numeric format whose precision and range to query
 * @param range         the address of array of two integers into which encodings of the implementation's numeric range are returned
 *
 * @see <a href="https://docs.gl/gl4/glGetShaderPrecisionFormat">Reference Page</a>
 */
    public int glGetShaderPrecisionFormat(int shadertype, int precisiontype, IntBuffer range);

}
