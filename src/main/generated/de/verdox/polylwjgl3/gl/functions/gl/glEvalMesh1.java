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

public interface glEvalMesh1 {

/**
 * Carries out an evaluation on a subset of the one-dimensional map grid.
 *
 * @param mode the mesh type. One of:<br><table><tr><td>{@link #GL_POINT POINT}</td><td>{@link #GL_LINE LINE}</td></tr></table>
 * @param i1   the start index
 * @param i2   the end index
 *
 * @see <a href="https://docs.gl/gl3/glEvalMesh1">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glEvalMesh1(@NativeType("GLenum") int mode, @NativeType("GLint") int i1, @NativeType("GLint") int i2);

}
