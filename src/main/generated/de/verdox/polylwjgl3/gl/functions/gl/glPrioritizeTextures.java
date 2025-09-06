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

public interface glPrioritizeTextures {

/**
 * Unsafe version of: {@link #glPrioritizeTextures PrioritizeTextures}
 *
 * @param n the number of texture object priorities to set
 */
    public void nglPrioritizeTextures(int n, long textures, long priorities);

/**
 * Sets the priority of texture objects. Each priority value is clamped to the range [0, 1] before it is assigned. Zero indicates the lowest priority, with
 * the least likelihood of being resident. One indicates the highest priority, with the greatest likelihood of being resident.
 *
 * @param textures   an array of texture object names
 * @param priorities an array of texture object priorities
 *
 * @see <a href="https://docs.gl/gl3/glPrioritizeTextures">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glPrioritizeTextures(@NativeType("GLuint const *") IntBuffer textures, @NativeType("GLfloat const *") FloatBuffer priorities);

/**
 * Array version of: {@link #glPrioritizeTextures PrioritizeTextures}
 *
 * @see <a href="https://docs.gl/gl3/glPrioritizeTextures">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glPrioritizeTextures(@NativeType("GLuint const *") int[] textures, @NativeType("GLfloat const *") float[] priorities);

}
