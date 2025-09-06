package de.verdox.polylwjgl3.gl.accessor.gl15;

import de.verdox.polylwjgl3.gl.accessor.gl14.GL14Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl14.GL14AccessorImpl;
import de.verdox.polylwjgl3.gl.functions.gl.glBufferData_CORE;
import de.verdox.polylwjgl3.gl.functions.gl.glBufferSubData_CORE;
import de.verdox.polylwjgl3.gl.functions.gl.glGetBufferSubData;
import de.verdox.polylwjgl3.gl.functions.gl.glGetQueryObjecti;
import de.verdox.polylwjgl3.gl.functions.gl.glGetQueryObjectiv;
import de.verdox.polylwjgl3.gl.functions.gl.glMapBuffer;
import de.verdox.polylwjgl3.gl.functions.glBeginQuery;
import de.verdox.polylwjgl3.gl.functions.glBindBuffer;
import de.verdox.polylwjgl3.gl.functions.glBufferData;
import de.verdox.polylwjgl3.gl.functions.glBufferSubData;
import de.verdox.polylwjgl3.gl.functions.glDeleteBuffers;
import de.verdox.polylwjgl3.gl.functions.glDeleteQueries;
import de.verdox.polylwjgl3.gl.functions.glEndQuery;
import de.verdox.polylwjgl3.gl.functions.glGenBuffers;
import de.verdox.polylwjgl3.gl.functions.glGenQueries;
import de.verdox.polylwjgl3.gl.functions.glGetBufferParameteri;
import de.verdox.polylwjgl3.gl.functions.glGetBufferParameteriv;
import de.verdox.polylwjgl3.gl.functions.glGetBufferPointer;
import de.verdox.polylwjgl3.gl.functions.glGetBufferPointerv;
import de.verdox.polylwjgl3.gl.functions.glGetQueryObjectui;
import de.verdox.polylwjgl3.gl.functions.glGetQueryObjectuiv;
import de.verdox.polylwjgl3.gl.functions.glGetQueryi;
import de.verdox.polylwjgl3.gl.functions.glGetQueryiv;
import de.verdox.polylwjgl3.gl.functions.glIsBuffer;
import de.verdox.polylwjgl3.gl.functions.glIsQuery;
import de.verdox.polylwjgl3.gl.functions.glUnmapBuffer;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL15;
import org.lwjgl.system.*;

public interface GL15Accessor extends GL14Accessor, glBindBuffer, glDeleteBuffers, glGenBuffers, glIsBuffer, glBufferData, glBufferData_CORE, glBufferSubData, glBufferSubData_CORE, glGetBufferSubData, glMapBuffer, glUnmapBuffer, glGetBufferParameteriv, glGetBufferParameteri, glGetBufferPointerv, glGetBufferPointer, glGenQueries, glDeleteQueries, glIsQuery, glBeginQuery, glEndQuery, glGetQueryiv, glGetQueryi, glGetQueryObjectiv, glGetQueryObjecti, glGetQueryObjectuiv, glGetQueryObjectui {

    void glGetQueryObjectuiv(int id, int pname, long params);
}
