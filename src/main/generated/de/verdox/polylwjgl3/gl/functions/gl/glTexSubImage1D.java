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

public interface glTexSubImage1D {

/**
 * Unsafe version of: {@link #glTexSubImage1D TexSubImage1D}
 */
    public void nglTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, long pixels);

/**
 * One-dimensional version of {@link #glTexSubImage2D TexSubImage2D}.
 *
 * @param target  the texture target. Must be:<br><table><tr><td>{@link GL11C#GL_TEXTURE_1D TEXTURE_1D}</td></tr></table>
 * @param level   the level-of-detail-number
 * @param xoffset the left coordinate of the texel subregion
 * @param width   the subregion width
 * @param format  the pixel data format. One of:<br><table><tr><td>{@link GL11C#GL_RED RED}</td><td>{@link GL11C#GL_GREEN GREEN}</td><td>{@link GL11C#GL_BLUE BLUE}</td><td>{@link GL11C#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11C#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11C#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11C#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
 * @param type    the pixel data type. One of:<br><table><tr><td>{@link GL11C#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11C#GL_BYTE BYTE}</td><td>{@link GL11C#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11C#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11C#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11C#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11C#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
 * @param pixels  the pixel data
 *
 * @see <a href="https://docs.gl/gl4/glTexSubImage1D">Reference Page</a>
 */
    public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, ByteBuffer pixels);

/**
 * One-dimensional version of {@link #glTexSubImage2D TexSubImage2D}.
 *
 * @param target  the texture target. Must be:<br><table><tr><td>{@link GL11C#GL_TEXTURE_1D TEXTURE_1D}</td></tr></table>
 * @param level   the level-of-detail-number
 * @param xoffset the left coordinate of the texel subregion
 * @param width   the subregion width
 * @param format  the pixel data format. One of:<br><table><tr><td>{@link GL11C#GL_RED RED}</td><td>{@link GL11C#GL_GREEN GREEN}</td><td>{@link GL11C#GL_BLUE BLUE}</td><td>{@link GL11C#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11C#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11C#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11C#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
 * @param type    the pixel data type. One of:<br><table><tr><td>{@link GL11C#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11C#GL_BYTE BYTE}</td><td>{@link GL11C#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11C#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11C#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11C#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11C#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
 * @param pixels  the pixel data
 *
 * @see <a href="https://docs.gl/gl4/glTexSubImage1D">Reference Page</a>
 */
    public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, long pixels);

/**
 * One-dimensional version of {@link #glTexSubImage2D TexSubImage2D}.
 *
 * @param target  the texture target. Must be:<br><table><tr><td>{@link GL11C#GL_TEXTURE_1D TEXTURE_1D}</td></tr></table>
 * @param level   the level-of-detail-number
 * @param xoffset the left coordinate of the texel subregion
 * @param width   the subregion width
 * @param format  the pixel data format. One of:<br><table><tr><td>{@link GL11C#GL_RED RED}</td><td>{@link GL11C#GL_GREEN GREEN}</td><td>{@link GL11C#GL_BLUE BLUE}</td><td>{@link GL11C#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11C#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11C#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11C#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
 * @param type    the pixel data type. One of:<br><table><tr><td>{@link GL11C#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11C#GL_BYTE BYTE}</td><td>{@link GL11C#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11C#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11C#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11C#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11C#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
 * @param pixels  the pixel data
 *
 * @see <a href="https://docs.gl/gl4/glTexSubImage1D">Reference Page</a>
 */
    public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, ShortBuffer pixels);

/**
 * One-dimensional version of {@link #glTexSubImage2D TexSubImage2D}.
 *
 * @param target  the texture target. Must be:<br><table><tr><td>{@link GL11C#GL_TEXTURE_1D TEXTURE_1D}</td></tr></table>
 * @param level   the level-of-detail-number
 * @param xoffset the left coordinate of the texel subregion
 * @param width   the subregion width
 * @param format  the pixel data format. One of:<br><table><tr><td>{@link GL11C#GL_RED RED}</td><td>{@link GL11C#GL_GREEN GREEN}</td><td>{@link GL11C#GL_BLUE BLUE}</td><td>{@link GL11C#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11C#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11C#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11C#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
 * @param type    the pixel data type. One of:<br><table><tr><td>{@link GL11C#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11C#GL_BYTE BYTE}</td><td>{@link GL11C#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11C#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11C#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11C#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11C#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
 * @param pixels  the pixel data
 *
 * @see <a href="https://docs.gl/gl4/glTexSubImage1D">Reference Page</a>
 */
    public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, IntBuffer pixels);

/**
 * One-dimensional version of {@link #glTexSubImage2D TexSubImage2D}.
 *
 * @param target  the texture target. Must be:<br><table><tr><td>{@link GL11C#GL_TEXTURE_1D TEXTURE_1D}</td></tr></table>
 * @param level   the level-of-detail-number
 * @param xoffset the left coordinate of the texel subregion
 * @param width   the subregion width
 * @param format  the pixel data format. One of:<br><table><tr><td>{@link GL11C#GL_RED RED}</td><td>{@link GL11C#GL_GREEN GREEN}</td><td>{@link GL11C#GL_BLUE BLUE}</td><td>{@link GL11C#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11C#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11C#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11C#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
 * @param type    the pixel data type. One of:<br><table><tr><td>{@link GL11C#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11C#GL_BYTE BYTE}</td><td>{@link GL11C#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11C#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11C#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11C#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11C#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
 * @param pixels  the pixel data
 *
 * @see <a href="https://docs.gl/gl4/glTexSubImage1D">Reference Page</a>
 */
    public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, FloatBuffer pixels);

/**
 * One-dimensional version of {@link #glTexSubImage2D TexSubImage2D}.
 *
 * @param target  the texture target. Must be:<br><table><tr><td>{@link GL11C#GL_TEXTURE_1D TEXTURE_1D}</td></tr></table>
 * @param level   the level-of-detail-number
 * @param xoffset the left coordinate of the texel subregion
 * @param width   the subregion width
 * @param format  the pixel data format. One of:<br><table><tr><td>{@link GL11C#GL_RED RED}</td><td>{@link GL11C#GL_GREEN GREEN}</td><td>{@link GL11C#GL_BLUE BLUE}</td><td>{@link GL11C#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td><td>{@link GL11C#GL_RGB RGB}</td><td>{@link GL11C#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td></tr><tr><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td></tr><tr><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td><td>{@link GL11C#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11C#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
 * @param type    the pixel data type. One of:<br><table><tr><td>{@link GL11C#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11C#GL_BYTE BYTE}</td><td>{@link GL11C#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11C#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11C#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11C#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11C#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr></table>
 * @param pixels  the pixel data
 *
 * @see <a href="https://docs.gl/gl4/glTexSubImage1D">Reference Page</a>
 */
    public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, DoubleBuffer pixels);

/**
 * Array version of: {@link #glTexSubImage1D TexSubImage1D}
 *
 * @see <a href="https://docs.gl/gl4/glTexSubImage1D">Reference Page</a>
 */
    public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, short[] pixels);

/**
 * Array version of: {@link #glTexSubImage1D TexSubImage1D}
 *
 * @see <a href="https://docs.gl/gl4/glTexSubImage1D">Reference Page</a>
 */
    public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, int[] pixels);

/**
 * Array version of: {@link #glTexSubImage1D TexSubImage1D}
 *
 * @see <a href="https://docs.gl/gl4/glTexSubImage1D">Reference Page</a>
 */
    public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, float[] pixels);

/**
 * Array version of: {@link #glTexSubImage1D TexSubImage1D}
 *
 * @see <a href="https://docs.gl/gl4/glTexSubImage1D">Reference Page</a>
 */
    public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, double[] pixels);

}
