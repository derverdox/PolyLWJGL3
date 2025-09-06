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

public interface glLogicOp {

/**
 * Sets the logical framebuffer operation.
 *
 * @param op the operation to set. One of:<br><table><tr><td>{@link GL11C#GL_CLEAR CLEAR}</td><td>{@link GL11C#GL_AND AND}</td><td>{@link GL11C#GL_AND_REVERSE AND_REVERSE}</td><td>{@link GL11C#GL_COPY COPY}</td><td>{@link GL11C#GL_AND_INVERTED AND_INVERTED}</td><td>{@link GL11C#GL_NOOP NOOP}</td><td>{@link GL11C#GL_XOR XOR}</td><td>{@link GL11C#GL_OR OR}</td><td>{@link GL11C#GL_NOR NOR}</td><td>{@link GL11C#GL_EQUIV EQUIV}</td><td>{@link GL11C#GL_INVERT INVERT}</td><td>{@link GL11C#GL_OR_REVERSE OR_REVERSE}</td><td>{@link GL11C#GL_COPY_INVERTED COPY_INVERTED}</td></tr><tr><td>{@link GL11C#GL_OR_INVERTED OR_INVERTED}</td><td>{@link GL11C#GL_NAND NAND}</td><td>{@link GL11C#GL_SET SET}</td></tr></table>
 *
 * @see <a href="https://docs.gl/gl4/glLogicOp">Reference Page</a>
 */
    public void glLogicOp(int op);

}
