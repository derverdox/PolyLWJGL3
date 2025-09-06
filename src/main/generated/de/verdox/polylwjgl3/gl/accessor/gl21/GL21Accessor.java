package de.verdox.polylwjgl3.gl.accessor.gl21;

import de.verdox.polylwjgl3.gl.accessor.gl20.GL20Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl20.GL20AccessorImpl;
import de.verdox.polylwjgl3.gl.functions.glUniformMatrix2x3fv;
import de.verdox.polylwjgl3.gl.functions.glUniformMatrix2x4fv;
import de.verdox.polylwjgl3.gl.functions.glUniformMatrix3x2fv;
import de.verdox.polylwjgl3.gl.functions.glUniformMatrix3x4fv;
import de.verdox.polylwjgl3.gl.functions.glUniformMatrix4x2fv;
import de.verdox.polylwjgl3.gl.functions.glUniformMatrix4x3fv;
import java.nio.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL21;
import org.lwjgl.system.*;

public interface GL21Accessor extends GL20Accessor, glUniformMatrix2x3fv, glUniformMatrix3x2fv, glUniformMatrix2x4fv, glUniformMatrix4x2fv, glUniformMatrix3x4fv, glUniformMatrix4x3fv {

}
