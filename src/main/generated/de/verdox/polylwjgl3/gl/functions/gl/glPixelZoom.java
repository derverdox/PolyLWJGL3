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

public interface glPixelZoom {

/**
 * Controls the conversion of a group of fragments.
 *
 * <p>Let (x<sub>rp</sub>, y<sub>rp</sub>) be the current raster position. If a particular group is the n<sup>th</sup> in a row and belongs to the
 * m<sup>th</sup> row, consider the region in window coordinates bounded by the rectangle with corners</p>
 *
 * <p>(x<sub>rp</sub> + z<sub>x</sub>n, y<sub>rp</sub> + z<sub>y</sub>m) and (x<sub>rp</sub> + z<sub>x</sub>(n + 1), y<sub>rp</sub> + z<sub>y</sub>(m + 1))</p>
 *
 * <p>(either z<sub>x</sub> or z<sub>y</sub> may be negative). A fragment representing group {@code (n, m)} is produced for each framebuffer pixel inside, or
 * on the bottom or left boundary, of this rectangle.</p>
 *
 * @param xfactor the z<sub>x</sub> factor
 * @param yfactor the z<sub>y</sub> factor
 *
 * @see <a href="https://docs.gl/gl3/glPixelZoom">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
 */
    public void glPixelZoom(float xfactor, float yfactor);

}
