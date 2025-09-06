package de.verdox.polylwjgl3.gl.accessor.gl15;

import de.verdox.polylwjgl3.gl.accessor.gl14.GL14AccessorImpl;
import java.nio.*;

import org.jetbrains.annotations.*;
import org.lwjgl.*;

public class GL15AccessorImpl extends GL14AccessorImpl implements GL15Accessor {

    @Override public void glBindBuffer(int target, int buffer) {
        org.lwjgl.opengl.GL15.glBindBuffer(target, buffer);
    }

    @Override public void nglDeleteBuffers(int n, long buffers) {
        org.lwjgl.opengl.GL15.nglDeleteBuffers(n, buffers);
    }

    @Override public void glDeleteBuffers(IntBuffer buffers) {
        org.lwjgl.opengl.GL15.glDeleteBuffers(buffers);
    }

    @Override public void glDeleteBuffers(int buffer) {
        org.lwjgl.opengl.GL15.glDeleteBuffers(buffer);
    }

    @Override public void glDeleteBuffers(int[] buffers) {
        org.lwjgl.opengl.GL15.glDeleteBuffers(buffers);
    }

    @Override public void nglGenBuffers(int n, long buffers) {
        org.lwjgl.opengl.GL15.nglGenBuffers(n, buffers);
    }

    @Override public void glGenBuffers(IntBuffer buffers) {
        org.lwjgl.opengl.GL15.glGenBuffers(buffers);
    }

    @Override public int glGenBuffers() {
        return org.lwjgl.opengl.GL15.glGenBuffers();
    }

    @Override public void glGenBuffers(int[] buffers) {
        org.lwjgl.opengl.GL15.glGenBuffers(buffers);
    }

    @Override public boolean glIsBuffer(int buffer) {
        return org.lwjgl.opengl.GL15.glIsBuffer(buffer);
    }

    @Override public void nglBufferData(int target, long size, long data, int usage) {
        org.lwjgl.opengl.GL15.nglBufferData(target, size, data, usage);
    }

    @Override public void glBufferData(int target, long size, int usage) {
        org.lwjgl.opengl.GL15.glBufferData(target, size, usage);
    }

    @Override public void glBufferData(int target, ByteBuffer data, int usage) {
        org.lwjgl.opengl.GL15.glBufferData(target, data, usage);
    }

    @Override public void glBufferData(int target, ShortBuffer data, int usage) {
        org.lwjgl.opengl.GL15.glBufferData(target, data, usage);
    }

    @Override public void glBufferData(int target, IntBuffer data, int usage) {
        org.lwjgl.opengl.GL15.glBufferData(target, data, usage);
    }

    @Override public void glBufferData(int target, LongBuffer data, int usage) {
        org.lwjgl.opengl.GL15.glBufferData(target, data, usage);
    }

    @Override public void glBufferData(int target, FloatBuffer data, int usage) {
        org.lwjgl.opengl.GL15.glBufferData(target, data, usage);
    }

    @Override public void glBufferData(int target, DoubleBuffer data, int usage) {
        org.lwjgl.opengl.GL15.glBufferData(target, data, usage);
    }

    @Override public void glBufferData(int target, short[] data, int usage) {
        org.lwjgl.opengl.GL15.glBufferData(target, data, usage);
    }

    @Override public void glBufferData(int target, int[] data, int usage) {
        org.lwjgl.opengl.GL15.glBufferData(target, data, usage);
    }

    @Override public void glBufferData(int target, long[] data, int usage) {
        org.lwjgl.opengl.GL15.glBufferData(target, data, usage);
    }

    @Override public void glBufferData(int target, float[] data, int usage) {
        org.lwjgl.opengl.GL15.glBufferData(target, data, usage);
    }

    @Override public void glBufferData(int target, double[] data, int usage) {
        org.lwjgl.opengl.GL15.glBufferData(target, data, usage);
    }

    @Override public void nglBufferSubData(int target, long offset, long size, long data) {
        org.lwjgl.opengl.GL15.nglBufferSubData(target, offset, size, data);
    }

    @Override public void glBufferSubData(int target, long offset, ByteBuffer data) {
        org.lwjgl.opengl.GL15.glBufferSubData(target, offset, data);
    }

    @Override public void glBufferSubData(int target, long offset, ShortBuffer data) {
        org.lwjgl.opengl.GL15.glBufferSubData(target, offset, data);
    }

    @Override public void glBufferSubData(int target, long offset, IntBuffer data) {
        org.lwjgl.opengl.GL15.glBufferSubData(target, offset, data);
    }

    @Override public void glBufferSubData(int target, long offset, LongBuffer data) {
        org.lwjgl.opengl.GL15.glBufferSubData(target, offset, data);
    }

    @Override public void glBufferSubData(int target, long offset, FloatBuffer data) {
        org.lwjgl.opengl.GL15.glBufferSubData(target, offset, data);
    }

    @Override public void glBufferSubData(int target, long offset, DoubleBuffer data) {
        org.lwjgl.opengl.GL15.glBufferSubData(target, offset, data);
    }

    @Override public void glBufferSubData(int target, long offset, short[] data) {
        org.lwjgl.opengl.GL15.glBufferSubData(target, offset, data);
    }

    @Override public void glBufferSubData(int target, long offset, int[] data) {
        org.lwjgl.opengl.GL15.glBufferSubData(target, offset, data);
    }

    @Override public void glBufferSubData(int target, long offset, long[] data) {
        org.lwjgl.opengl.GL15.glBufferSubData(target, offset, data);
    }

    @Override public void glBufferSubData(int target, long offset, float[] data) {
        org.lwjgl.opengl.GL15.glBufferSubData(target, offset, data);
    }

    @Override public void glBufferSubData(int target, long offset, double[] data) {
        org.lwjgl.opengl.GL15.glBufferSubData(target, offset, data);
    }

    @Override public void nglGetBufferSubData(int target, long offset, long size, long data) {
        org.lwjgl.opengl.GL15.nglGetBufferSubData(target, offset, size, data);
    }

    @Override public void glGetBufferSubData(int target, long offset, ByteBuffer data) {
        org.lwjgl.opengl.GL15.glGetBufferSubData(target, offset, data);
    }

    @Override public void glGetBufferSubData(int target, long offset, ShortBuffer data) {
        org.lwjgl.opengl.GL15.glGetBufferSubData(target, offset, data);
    }

    @Override public void glGetBufferSubData(int target, long offset, IntBuffer data) {
        org.lwjgl.opengl.GL15.glGetBufferSubData(target, offset, data);
    }

    @Override public void glGetBufferSubData(int target, long offset, LongBuffer data) {
        org.lwjgl.opengl.GL15.glGetBufferSubData(target, offset, data);
    }

    @Override public void glGetBufferSubData(int target, long offset, FloatBuffer data) {
        org.lwjgl.opengl.GL15.glGetBufferSubData(target, offset, data);
    }

    @Override public void glGetBufferSubData(int target, long offset, DoubleBuffer data) {
        org.lwjgl.opengl.GL15.glGetBufferSubData(target, offset, data);
    }

    @Override public void glGetBufferSubData(int target, long offset, short[] data) {
        org.lwjgl.opengl.GL15.glGetBufferSubData(target, offset, data);
    }

    @Override public void glGetBufferSubData(int target, long offset, int[] data) {
        org.lwjgl.opengl.GL15.glGetBufferSubData(target, offset, data);
    }

    @Override public void glGetBufferSubData(int target, long offset, long[] data) {
        org.lwjgl.opengl.GL15.glGetBufferSubData(target, offset, data);
    }

    @Override public void glGetBufferSubData(int target, long offset, float[] data) {
        org.lwjgl.opengl.GL15.glGetBufferSubData(target, offset, data);
    }

    @Override public void glGetBufferSubData(int target, long offset, double[] data) {
        org.lwjgl.opengl.GL15.glGetBufferSubData(target, offset, data);
    }

    @Override public long nglMapBuffer(int target, int access) {
        return org.lwjgl.opengl.GL15.nglMapBuffer(target, access);
    }

@Nullable
    @Override public ByteBuffer glMapBuffer(int target, int access) {
        return org.lwjgl.opengl.GL15.glMapBuffer(target, access);
    }

@Nullable
    @Override public ByteBuffer glMapBuffer(int target, int access, @Nullable ByteBuffer old_buffer) {
        return org.lwjgl.opengl.GL15.glMapBuffer(target, access, old_buffer);
    }

@Nullable
    @Override public ByteBuffer glMapBuffer(int target, int access, long length, @Nullable ByteBuffer old_buffer) {
        return org.lwjgl.opengl.GL15.glMapBuffer(target, access, length, old_buffer);
    }

    @Override public boolean glUnmapBuffer(int target) {
        return org.lwjgl.opengl.GL15.glUnmapBuffer(target);
    }

    @Override public void nglGetBufferParameteriv(int target, int pname, long params) {
        org.lwjgl.opengl.GL15.nglGetBufferParameteriv(target, pname, params);
    }

    @Override public void glGetBufferParameteriv(int target, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL15.glGetBufferParameteriv(target, pname, params);
    }

    @Override public void glGetBufferParameteriv(int target, int pname, int[] params) {
        org.lwjgl.opengl.GL15.glGetBufferParameteriv(target, pname, params);
    }

    @Override public int glGetBufferParameteri(int target, int pname) {
        return org.lwjgl.opengl.GL15.glGetBufferParameteri(target, pname);
    }

    @Override public void nglGetBufferPointerv(int target, int pname, long params) {
        org.lwjgl.opengl.GL15.nglGetBufferPointerv(target, pname, params);
    }

    @Override public void glGetBufferPointerv(int target, int pname, PointerBuffer params) {
        org.lwjgl.opengl.GL15.glGetBufferPointerv(target, pname, params);
    }

    @Override public long glGetBufferPointer(int target, int pname) {
        return org.lwjgl.opengl.GL15.glGetBufferPointer(target, pname);
    }

    @Override public void nglGenQueries(int n, long ids) {
        org.lwjgl.opengl.GL15.nglGenQueries(n, ids);
    }

    @Override public void glGenQueries(IntBuffer ids) {
        org.lwjgl.opengl.GL15.glGenQueries(ids);
    }

    @Override public int glGenQueries() {
        return org.lwjgl.opengl.GL15.glGenQueries();
    }

    @Override public void glGenQueries(int[] ids) {
        org.lwjgl.opengl.GL15.glGenQueries(ids);
    }

    @Override public void nglDeleteQueries(int n, long ids) {
        org.lwjgl.opengl.GL15.nglDeleteQueries(n, ids);
    }

    @Override public void glDeleteQueries(IntBuffer ids) {
        org.lwjgl.opengl.GL15.glDeleteQueries(ids);
    }

    @Override public void glDeleteQueries(int id) {
        org.lwjgl.opengl.GL15.glDeleteQueries(id);
    }

    @Override public void glDeleteQueries(int[] ids) {
        org.lwjgl.opengl.GL15.glDeleteQueries(ids);
    }

    @Override public boolean glIsQuery(int id) {
        return org.lwjgl.opengl.GL15.glIsQuery(id);
    }

    @Override public void glBeginQuery(int target, int id) {
        org.lwjgl.opengl.GL15.glBeginQuery(target, id);
    }

    @Override public void glEndQuery(int target) {
        org.lwjgl.opengl.GL15.glEndQuery(target);
    }

    @Override public void nglGetQueryiv(int target, int pname, long params) {
        org.lwjgl.opengl.GL15.nglGetQueryiv(target, pname, params);
    }

    @Override public void glGetQueryiv(int target, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL15.glGetQueryiv(target, pname, params);
    }

    @Override public void glGetQueryiv(int target, int pname, int[] params) {
        org.lwjgl.opengl.GL15.glGetQueryiv(target, pname, params);
    }

    @Override public int glGetQueryi(int target, int pname) {
        return org.lwjgl.opengl.GL15.glGetQueryi(target, pname);
    }

    @Override public void nglGetQueryObjectiv(int id, int pname, long params) {
        org.lwjgl.opengl.GL15.nglGetQueryObjectiv(id, pname, params);
    }

    @Override public void glGetQueryObjectiv(int id, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL15.glGetQueryObjectiv(id, pname, params);
    }

    @Override public void glGetQueryObjectiv(int id, int pname, long params) {
        org.lwjgl.opengl.GL15.glGetQueryObjectiv(id, pname, params);
    }

    @Override public void glGetQueryObjectiv(int id, int pname, int[] params) {
        org.lwjgl.opengl.GL15.glGetQueryObjectiv(id, pname, params);
    }

    @Override public int glGetQueryObjecti(int id, int pname) {
        return org.lwjgl.opengl.GL15.glGetQueryObjecti(id, pname);
    }

    @Override public void nglGetQueryObjectuiv(int id, int pname, long params) {
        org.lwjgl.opengl.GL15.nglGetQueryObjectuiv(id, pname, params);
    }

    @Override public void glGetQueryObjectuiv(int id, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL15.glGetQueryObjectuiv(id, pname, params);
    }

    @Override
    public void glGetQueryObjectuiv(int id, int pname, long params) {
        org.lwjgl.opengl.GL15.glGetQueryObjectuiv(id, pname, params);
    }

    @Override public void glGetQueryObjectuiv(int id, int pname, int[] params) {
        org.lwjgl.opengl.GL15.glGetQueryObjectuiv(id, pname, params);
    }

    @Override public int glGetQueryObjectui(int id, int pname) {
        return org.lwjgl.opengl.GL15.glGetQueryObjectui(id, pname);
    }

}
