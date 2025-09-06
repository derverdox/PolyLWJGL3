package de.verdox.polylwjgl3.gl.accessor.gl44;

import de.verdox.polylwjgl3.gl.accessor.gl43.GL43Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl43.GL43AccessorImpl;
import de.verdox.polylwjgl3.gl.functions.gl.glBindBuffersBase;
import de.verdox.polylwjgl3.gl.functions.gl.glBindBuffersRange;
import de.verdox.polylwjgl3.gl.functions.gl.glBindImageTextures;
import de.verdox.polylwjgl3.gl.functions.gl.glBindSamplers;
import de.verdox.polylwjgl3.gl.functions.gl.glBindTextures;
import de.verdox.polylwjgl3.gl.functions.gl.glBindVertexBuffers;
import de.verdox.polylwjgl3.gl.functions.gl.glBufferStorage;
import de.verdox.polylwjgl3.gl.functions.gl.glClearTexImage;
import de.verdox.polylwjgl3.gl.functions.gl.glClearTexSubImage;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL44;
import org.lwjgl.system.*;

public interface GL44Accessor extends GL43Accessor, glBufferStorage, glClearTexSubImage, glClearTexImage, glBindBuffersBase, glBindBuffersRange, glBindTextures, glBindSamplers, glBindImageTextures, glBindVertexBuffers {

}
