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

public interface glPolygonMode {

/**
 * Controls the interpretation of polygons for rasterization.
 *
 * <p>{@link GL11C#GL_FILL FILL} is the default mode of polygon rasterization. Note that these modes affect only the final rasterization of polygons: in particular, a
 * polygon's vertices are lit, and the polygon is clipped and possibly culled before these modes are applied. Polygon antialiasing applies only to the
 * {@link GL11C#GL_FILL FILL} state of PolygonMode. For {@link GL11C#GL_POINT POINT} or {@link GL11C#GL_LINE LINE}, point antialiasing or line segment antialiasing, respectively, apply.</p>
 *
 * @param face the face for which to set the rasterizing method. One of:<br><table><tr><td>{@link GL11C#GL_FRONT FRONT}</td><td>{@link GL11C#GL_BACK BACK}</td><td>{@link GL11C#GL_FRONT_AND_BACK FRONT_AND_BACK}</td></tr></table>
 * @param mode the rasterization mode. One of:<br><table><tr><td>{@link GL11C#GL_POINT POINT}</td><td>{@link GL11C#GL_LINE LINE}</td><td>{@link GL11C#GL_FILL FILL}</td></tr></table>
 *
 * @see <a href="https://docs.gl/gl4/glPolygonMode">Reference Page</a>
 */
    public void glPolygonMode(@NativeType("GLenum") int face, @NativeType("GLenum") int mode);

}
