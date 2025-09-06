package de.verdox.polylwjgl3.gl.functions.gles;

import de.verdox.polylwjgl3.gl.accessor.gles31.GLES31Accessor;
import de.verdox.polylwjgl3.gl.accessor.gles31.GLES31AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengles.GLES32;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public interface glBlendBarrier {

/**
 * Specifies a boundary between passes when using advanced blend equations.
 *
 * <p>When using advanced blending equations, applications should split their rendering into a collection of blending passes, none of which touch an
 * individual sample in the framebuffer more than once. The results of blending are undefined if the sample being blended has been touched previously in
 * the same pass. Any command that causes the value of a sample to be modified using the framebuffer is considered to touch the sample, including clears,
 * blended or unblended primitives, and {@link GLES30#glBlitFramebuffer BlitFramebuffer} copies.</p>
 *
 * @see <a href="https://docs.gl/es3/glBlendBarrier">Reference Page</a>
 */
    public void glBlendBarrier();

}
