package de.verdox.polylwjgl3.gl.accessor.gl31;

import de.verdox.polylwjgl3.gl.accessor.gl30.GL30Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl30.GL30AccessorImpl;
import de.verdox.polylwjgl3.gl.functions.gl.glGetActiveUniformName;
import de.verdox.polylwjgl3.gl.functions.gl.glGetActiveUniformsi;
import de.verdox.polylwjgl3.gl.functions.gl.glGetUniformIndices_CORE;
import de.verdox.polylwjgl3.gl.functions.gl.glPrimitiveRestartIndex;
import de.verdox.polylwjgl3.gl.functions.glCopyBufferSubData;
import de.verdox.polylwjgl3.gl.functions.glDrawArraysInstanced;
import de.verdox.polylwjgl3.gl.functions.glDrawElementsInstanced;
import de.verdox.polylwjgl3.gl.functions.glGetActiveUniformBlockName;
import de.verdox.polylwjgl3.gl.functions.glGetActiveUniformBlocki;
import de.verdox.polylwjgl3.gl.functions.glGetActiveUniformBlockiv;
import de.verdox.polylwjgl3.gl.functions.glGetActiveUniformsiv;
import de.verdox.polylwjgl3.gl.functions.glGetUniformBlockIndex;
import de.verdox.polylwjgl3.gl.functions.glGetUniformIndices;
import de.verdox.polylwjgl3.gl.functions.glTexBuffer;
import de.verdox.polylwjgl3.gl.functions.glUniformBlockBinding;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL31;
import org.lwjgl.system.*;

public interface GL31Accessor extends GL30Accessor, glDrawArraysInstanced, glDrawElementsInstanced, glCopyBufferSubData, glPrimitiveRestartIndex, glTexBuffer, glGetUniformIndices, glGetUniformIndices_CORE, glGetActiveUniformsiv, glGetActiveUniformsi, glGetActiveUniformName, glGetUniformBlockIndex, glGetActiveUniformBlockiv, glGetActiveUniformBlocki, glGetActiveUniformBlockName, glUniformBlockBinding {

}
