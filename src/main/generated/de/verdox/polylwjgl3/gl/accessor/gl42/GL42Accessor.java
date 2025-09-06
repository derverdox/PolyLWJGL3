package de.verdox.polylwjgl3.gl.accessor.gl42;

import de.verdox.polylwjgl3.gl.accessor.gl41.GL41Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl41.GL41AccessorImpl;
import de.verdox.polylwjgl3.gl.functions.gl.glDrawArraysInstancedBaseInstance;
import de.verdox.polylwjgl3.gl.functions.gl.glDrawElementsInstancedBaseInstance;
import de.verdox.polylwjgl3.gl.functions.gl.glDrawElementsInstancedBaseVertexBaseInstance;
import de.verdox.polylwjgl3.gl.functions.gl.glDrawTransformFeedbackInstanced;
import de.verdox.polylwjgl3.gl.functions.gl.glDrawTransformFeedbackStreamInstanced;
import de.verdox.polylwjgl3.gl.functions.gl.glGetActiveAtomicCounterBufferi;
import de.verdox.polylwjgl3.gl.functions.gl.glGetActiveAtomicCounterBufferiv;
import de.verdox.polylwjgl3.gl.functions.gl.glTexStorage1D;
import de.verdox.polylwjgl3.gl.functions.glBindImageTexture;
import de.verdox.polylwjgl3.gl.functions.glGetInternalformati;
import de.verdox.polylwjgl3.gl.functions.glGetInternalformativ;
import de.verdox.polylwjgl3.gl.functions.glMemoryBarrier;
import de.verdox.polylwjgl3.gl.functions.glTexStorage2D;
import de.verdox.polylwjgl3.gl.functions.glTexStorage3D;
import java.nio.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL42;
import org.lwjgl.system.*;

public interface GL42Accessor extends GL41Accessor, glGetActiveAtomicCounterBufferiv, glGetActiveAtomicCounterBufferi, glTexStorage1D, glTexStorage2D, glTexStorage3D, glDrawTransformFeedbackInstanced, glDrawTransformFeedbackStreamInstanced, glDrawArraysInstancedBaseInstance, glDrawElementsInstancedBaseInstance, glDrawElementsInstancedBaseVertexBaseInstance, glBindImageTexture, glMemoryBarrier, glGetInternalformativ, glGetInternalformati {

}
