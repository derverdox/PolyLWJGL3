package de.verdox.polylwjgl3.gl.accessor.gl32;

import de.verdox.polylwjgl3.gl.accessor.gl31.GL31Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl31.GL31AccessorImpl;
import de.verdox.polylwjgl3.gl.functions.gl.glMultiDrawElementsBaseVertex;
import de.verdox.polylwjgl3.gl.functions.gl.glProvokingVertex;
import de.verdox.polylwjgl3.gl.functions.gl.glTexImage2DMultisample;
import de.verdox.polylwjgl3.gl.functions.gl.glTexImage3DMultisample;
import de.verdox.polylwjgl3.gl.functions.glClientWaitSync;
import de.verdox.polylwjgl3.gl.functions.glDeleteSync;
import de.verdox.polylwjgl3.gl.functions.glDrawElementsBaseVertex;
import de.verdox.polylwjgl3.gl.functions.glDrawElementsInstancedBaseVertex;
import de.verdox.polylwjgl3.gl.functions.glDrawRangeElementsBaseVertex;
import de.verdox.polylwjgl3.gl.functions.glFenceSync;
import de.verdox.polylwjgl3.gl.functions.glFramebufferTexture;
import de.verdox.polylwjgl3.gl.functions.glGetBufferParameteri64;
import de.verdox.polylwjgl3.gl.functions.glGetBufferParameteri64v;
import de.verdox.polylwjgl3.gl.functions.glGetInteger64;
import de.verdox.polylwjgl3.gl.functions.glGetInteger64i;
import de.verdox.polylwjgl3.gl.functions.glGetInteger64i_v;
import de.verdox.polylwjgl3.gl.functions.glGetInteger64v;
import de.verdox.polylwjgl3.gl.functions.glGetMultisamplef;
import de.verdox.polylwjgl3.gl.functions.glGetMultisamplefv;
import de.verdox.polylwjgl3.gl.functions.glGetSynci;
import de.verdox.polylwjgl3.gl.functions.glGetSynciv;
import de.verdox.polylwjgl3.gl.functions.glIsSync;
import de.verdox.polylwjgl3.gl.functions.glSampleMaski;
import de.verdox.polylwjgl3.gl.functions.glWaitSync;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL32;
import org.lwjgl.system.*;

public interface GL32Accessor extends GL31Accessor, glGetBufferParameteri64v, glGetBufferParameteri64, glDrawElementsBaseVertex, glDrawRangeElementsBaseVertex, glDrawElementsInstancedBaseVertex, glMultiDrawElementsBaseVertex, glProvokingVertex, glTexImage2DMultisample, glTexImage3DMultisample, glGetMultisamplefv, glGetMultisamplef, glSampleMaski, glFramebufferTexture, glFenceSync, glIsSync, glDeleteSync, glClientWaitSync, glWaitSync, glGetInteger64v, glGetInteger64, glGetInteger64i_v, glGetInteger64i, glGetSynciv, glGetSynci {

}
