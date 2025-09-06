package de.verdox.polylwjgl3.gl.functions.gl;

import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glPixelTransferi {

/**
 * Sets the integer value of a pixel transfer parameter.
 *
 * @param pname the pixel transfer parameter to set. One of:<br><table><tr><td>{@link #GL_MAP_COLOR MAP_COLOR}</td><td>{@link #GL_MAP_STENCIL MAP_STENCIL}</td><td>{@link #GL_INDEX_SHIFT INDEX_SHIFT}</td><td>{@link #GL_INDEX_OFFSET INDEX_OFFSET}</td></tr><tr><td>{@link #GL_RED_SCALE RED_SCALE}</td><td>{@link #GL_GREEN_SCALE GREEN_SCALE}</td><td>{@link #GL_BLUE_SCALE BLUE_SCALE}</td><td>{@link #GL_ALPHA_SCALE ALPHA_SCALE}</td></tr><tr><td>{@link #GL_DEPTH_SCALE DEPTH_SCALE}</td><td>{@link #GL_RED_BIAS RED_BIAS}</td><td>{@link #GL_GREEN_BIAS GREEN_BIAS}</td><td>{@link #GL_BLUE_BIAS BLUE_BIAS}</td></tr><tr><td>{@link #GL_ALPHA_BIAS ALPHA_BIAS}</td><td>{@link #GL_DEPTH_BIAS DEPTH_BIAS}</td><td>{@link ARBImaging#GL_POST_CONVOLUTION_RED_SCALE POST_CONVOLUTION_RED_SCALE}</td><td>{@link ARBImaging#GL_POST_CONVOLUTION_RED_BIAS POST_CONVOLUTION_RED_BIAS}</td></tr><tr><td>{@link ARBImaging#GL_POST_COLOR_MATRIX_RED_SCALE POST_COLOR_MATRIX_RED_SCALE}</td><td>{@link ARBImaging#GL_POST_COLOR_MATRIX_RED_BIAS POST_COLOR_MATRIX_RED_BIAS}</td><td>{@link ARBImaging#GL_POST_CONVOLUTION_GREEN_SCALE POST_CONVOLUTION_GREEN_SCALE}</td><td>{@link ARBImaging#GL_POST_CONVOLUTION_GREEN_BIAS POST_CONVOLUTION_GREEN_BIAS}</td></tr><tr><td>{@link ARBImaging#GL_POST_COLOR_MATRIX_GREEN_SCALE POST_COLOR_MATRIX_GREEN_SCALE}</td><td>{@link ARBImaging#GL_POST_COLOR_MATRIX_GREEN_BIAS POST_COLOR_MATRIX_GREEN_BIAS}</td><td>{@link ARBImaging#GL_POST_CONVOLUTION_BLUE_SCALE POST_CONVOLUTION_BLUE_SCALE}</td><td>{@link ARBImaging#GL_POST_CONVOLUTION_BLUE_BIAS POST_CONVOLUTION_BLUE_BIAS}</td></tr><tr><td>{@link ARBImaging#GL_POST_COLOR_MATRIX_BLUE_SCALE POST_COLOR_MATRIX_BLUE_SCALE}</td><td>{@link ARBImaging#GL_POST_COLOR_MATRIX_BLUE_BIAS POST_COLOR_MATRIX_BLUE_BIAS}</td><td>{@link ARBImaging#GL_POST_CONVOLUTION_ALPHA_SCALE POST_CONVOLUTION_ALPHA_SCALE}</td><td>{@link ARBImaging#GL_POST_CONVOLUTION_ALPHA_BIAS POST_CONVOLUTION_ALPHA_BIAS}</td></tr><tr><td>{@link ARBImaging#GL_POST_COLOR_MATRIX_ALPHA_SCALE POST_COLOR_MATRIX_ALPHA_SCALE}</td><td>{@link ARBImaging#GL_POST_COLOR_MATRIX_ALPHA_BIAS POST_COLOR_MATRIX_ALPHA_BIAS}</td></tr></table>
 * @param param the parameter value
 *
 * @see <a href="https://docs.gl/gl3/glPixelTransferi">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glPixelTransferi(@NativeType("GLenum") int pname, @NativeType("GLint") int param);

}
