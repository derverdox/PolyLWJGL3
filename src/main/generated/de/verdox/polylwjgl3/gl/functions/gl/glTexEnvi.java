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

public interface glTexEnvi {

/**
 * Sets parameters of the texture environment that specifies how texture values are interpreted when texturing a fragment, or sets per-texture-unit
 * filtering parameters.
 *
 * @param target the texture environment target. One of:<br><table><tr><td>{@link #GL_TEXTURE_ENV TEXTURE_ENV}</td><td>{@link GL14#GL_TEXTURE_FILTER_CONTROL TEXTURE_FILTER_CONTROL}</td><td>{@link GL20#GL_POINT_SPRITE POINT_SPRITE}</td></tr></table>
 * @param pname  the parameter to set. One of:<br><table><tr><td>{@link GL20#GL_COORD_REPLACE COORD_REPLACE}</td><td>{@link #GL_TEXTURE_ENV_MODE TEXTURE_ENV_MODE}</td><td>{@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}</td><td>{@link GL13#GL_COMBINE_RGB COMBINE_RGB}</td><td>{@link GL13#GL_COMBINE_ALPHA COMBINE_ALPHA}</td><td>{@link GL15#GL_SRC0_RGB SRC0_RGB}</td></tr><tr><td>{@link GL15#GL_SRC1_RGB SRC1_RGB}</td><td>{@link GL15#GL_SRC2_RGB SRC2_RGB}</td><td>{@link GL15#GL_SRC0_ALPHA SRC0_ALPHA}</td><td>{@link GL15#GL_SRC1_ALPHA SRC1_ALPHA}</td><td>{@link GL15#GL_SRC2_ALPHA SRC2_ALPHA}</td><td>{@link GL13#GL_OPERAND0_RGB OPERAND0_RGB}</td></tr><tr><td>{@link GL13#GL_OPERAND1_RGB OPERAND1_RGB}</td><td>{@link GL13#GL_OPERAND2_RGB OPERAND2_RGB}</td><td>{@link GL13#GL_OPERAND0_ALPHA OPERAND0_ALPHA}</td><td>{@link GL13#GL_OPERAND1_ALPHA OPERAND1_ALPHA}</td><td>{@link GL13#GL_OPERAND2_ALPHA OPERAND2_ALPHA}</td><td>{@link GL13#GL_RGB_SCALE RGB_SCALE}</td></tr><tr><td>{@link #GL_ALPHA_SCALE ALPHA_SCALE}</td></tr></table>
 * @param param  the parameter value. Scalar value or one of:<br><table><tr><td>{@link #GL_REPLACE REPLACE}</td><td>{@link #GL_MODULATE MODULATE}</td><td>{@link #GL_DECAL DECAL}</td><td>{@link #GL_BLEND BLEND}</td><td>{@link #GL_ADD ADD}</td><td>{@link GL13#GL_COMBINE COMBINE}</td><td>{@link GL13#GL_ADD_SIGNED ADD_SIGNED}</td><td>{@link GL13#GL_INTERPOLATE INTERPOLATE}</td></tr><tr><td>{@link GL13#GL_SUBTRACT SUBTRACT}</td><td>{@link GL13#GL_DOT3_RGB DOT3_RGB}</td><td>{@link GL13#GL_DOT3_RGBA DOT3_RGBA}</td><td>{@link #GL_TEXTURE TEXTURE}</td><td>{@link GL13#GL_TEXTURE0 TEXTURE0}</td><td>GL13.GL_TEXTURE[1-31]</td><td>{@link GL13#GL_CONSTANT CONSTANT}</td><td>{@link GL13#GL_PRIMARY_COLOR PRIMARY_COLOR}</td></tr><tr><td>{@link GL13#GL_PREVIOUS PREVIOUS}</td></tr></table>
 *
 * @see <a href="https://docs.gl/gl3/glTexEnvi">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glTexEnvi(int target, int pname, int param);

}
