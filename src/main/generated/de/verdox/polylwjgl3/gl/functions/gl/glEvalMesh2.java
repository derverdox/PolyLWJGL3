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

public interface glEvalMesh2 {

/**
 * Carries out an evaluation on a rectangular subset of the two-dimensional map grid.
 *
 * @param mode the mesh type. One of:<br><table><tr><td>{@link #GL_FILL FILL}</td><td>{@link #GL_LINE LINE}</td><td>{@link #GL_POINT POINT}</td></tr></table>
 * @param i1   the u-dimension start index
 * @param i2   the u-dimension end index
 * @param j1   the v-dimension start index
 * @param j2   the v-dimension end index
 *
 * @see <a href="https://docs.gl/gl3/glEvalMesh2">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glEvalMesh2(int mode, int i1, int i2, int j1, int j2);

}
