package de.verdox.polylwjgl3.gl.accessor.gl12;

import de.verdox.polylwjgl3.gl.accessor.gl11.GL11Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl11.GL11AccessorImpl;
import de.verdox.polylwjgl3.gl.functions.gl.glTexImage3D_CORE;
import de.verdox.polylwjgl3.gl.functions.gl.glTexSubImage3D_CORE;
import de.verdox.polylwjgl3.gl.functions.glCopyTexSubImage3D;
import de.verdox.polylwjgl3.gl.functions.glDrawRangeElements;
import de.verdox.polylwjgl3.gl.functions.glTexImage3D;
import de.verdox.polylwjgl3.gl.functions.glTexSubImage3D;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL12;
import org.lwjgl.system.*;

/**
 * OpenGL 1.2 Accessor — 3D textures and indexed drawing range.
 *
 * <p>Additions over GL 1.1 focus on true three-dimensional textures and a more
 * efficient indexed drawing path. This accessor extends {@code GL11Accessor}
 * and exposes the following method families:</p>
 *
 * <h2>3D Textures</h2>
 * <ul>
 *   <li>{@code glTexImage3D} — Define a three-dimensional texture image
 *       (target e.g. {@code GL_TEXTURE_3D}); supplies full mip level data.</li>
 *   <li>{@code glTexImage3D_CORE} — Core-only overloads/variants of {@code glTexImage3D}
 *       (e.g., sized internal formats or data type combinations not present in ES).</li>
 *   <li>{@code glTexSubImage3D} — Replace a sub-box (x/y/z region, level) of an existing
 *       3D texture image with client memory.</li>
 *   <li>{@code glTexSubImage3D_CORE} — Core-only overloads/variants of {@code glTexSubImage3D}.</li>
 *   <li>{@code glCopyTexSubImage3D} — Copy a sub-box for a 3D texture level directly
 *       from the current read framebuffer (no client memory transfer).</li>
 * </ul>
 *
 * <h2>Indexed Drawing Optimization</h2>
 * <ul>
 *   <li>{@code glDrawRangeElements} — Draw indexed primitives while explicitly declaring
 *       the minimum and maximum index referenced; allows drivers to optimize vertex transform
 *       and cache usage compared to {@code glDrawElements}.</li>
 * </ul>
 *
 * <h3>Notes</h3>
 * <ul>
 *   <li>3D texture definitions honor the current pixel storage parameters
 *       ({@code GL_UNPACK_ALIGNMENT}, row length, image height, skip images/rows/pixels).</li>
 *   <li>Mipmap completeness rules apply per level; use appropriate filters and levels when sampling.</li>
 *   <li>“_CORE” interfaces denote signatures only available in desktop GL; ES builds provide the ES flavor.</li>
 * </ul>
 */
public interface GL12Accessor extends GL11Accessor, glTexImage3D, glTexImage3D_CORE, glTexSubImage3D, glTexSubImage3D_CORE, glCopyTexSubImage3D, glDrawRangeElements {

}
