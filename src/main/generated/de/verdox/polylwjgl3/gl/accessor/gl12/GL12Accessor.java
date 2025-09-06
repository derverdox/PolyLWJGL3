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

public interface GL12Accessor extends GL11Accessor, glTexImage3D, glTexImage3D_CORE, glTexSubImage3D, glTexSubImage3D_CORE, glCopyTexSubImage3D, glDrawRangeElements {

}
