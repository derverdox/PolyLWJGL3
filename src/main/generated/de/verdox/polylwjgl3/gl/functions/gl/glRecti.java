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

public interface glRecti {

/**
 * Specifies a rectangle as two corner vertices. The effect of the Rect command
 *
 * <p>{@code Rect(x1, y1, x2, y2);}</p>
 *
 * <p>is exactly the same as the following sequence of commands:
 * {@code
 * Begin(POLYGON);
 * Vertex2(x1, y1);
 * Vertex2(x2, y1);
 * Vertex2(x2, y2);
 * Vertex2(x1, y2);
 * End();}</p>
 *
 * <p>The appropriate Vertex2 command would be invoked depending on which of the Rect commands is issued.</p>
 *
 * @param x1 the x coordinate of the first corner vertex
 * @param y1 the y coordinate of the first corner vertex
 * @param x2 the x coordinate of the second corner vertex
 * @param y2 the y coordinate of the second corner vertex
 *
 * @see <a href="https://docs.gl/gl3/glRecti">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glRecti(@NativeType("GLint") int x1, @NativeType("GLint") int y1, @NativeType("GLint") int x2, @NativeType("GLint") int y2);

}
