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

public interface glAreTexturesResident {

/**
 * Unsafe version of: {@link #glAreTexturesResident AreTexturesResident}
 *
 * @param n the number of texture objects in {@code textures}
 */
    public boolean nglAreTexturesResident(int n, long textures, long residences);

/**
 * Returns {@link #GL_TRUE TRUE} if all of the texture objects named in textures are resident, or if the implementation does not distinguish a working set. If
 * at least one of the texture objects named in textures is not resident, then {@link #GL_FALSE FALSE} is returned, and the residence of each texture object is
 * returned in residences. Otherwise the contents of residences are not changed.
 *
 * @param textures   an array of texture objects
 * @param residences returns the residences of each texture object
 *
 * @see <a href="https://docs.gl/gl3/glAreTexturesResident">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public boolean glAreTexturesResident(IntBuffer textures, ByteBuffer residences);

/**
 * Returns {@link #GL_TRUE TRUE} if all of the texture objects named in textures are resident, or if the implementation does not distinguish a working set. If
 * at least one of the texture objects named in textures is not resident, then {@link #GL_FALSE FALSE} is returned, and the residence of each texture object is
 * returned in residences. Otherwise the contents of residences are not changed.
 *
 * @param residences returns the residences of each texture object
 *
 * @see <a href="https://docs.gl/gl3/glAreTexturesResident">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public boolean glAreTexturesResident(int texture, ByteBuffer residences);

/**
 * Array version of: {@link #glAreTexturesResident AreTexturesResident}
 *
 * @see <a href="https://docs.gl/gl3/glAreTexturesResident">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public boolean glAreTexturesResident(int[] textures, ByteBuffer residences);

}
