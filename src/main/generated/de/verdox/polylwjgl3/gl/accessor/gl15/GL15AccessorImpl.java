package de.verdox.polylwjgl3.gl.accessor.gl15;

import de.verdox.polylwjgl3.gl.accessor.gl14.GL14AccessorImpl;
import java.nio.*;

import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.system.*;

public class GL15AccessorImpl extends GL14AccessorImpl implements GL15Accessor {

    @Override public void glBindBuffer(@NativeType("GLenum") int target, @NativeType("GLuint") int buffer) {
        org.lwjgl.opengl.GL15.glBindBuffer(target, buffer);
    }

    @Override public void nglDeleteBuffers(int n, long buffers) {
        org.lwjgl.opengl.GL15.nglDeleteBuffers(n, buffers);
    }

    @Override public void glDeleteBuffers(@NativeType("GLuint const *") IntBuffer buffers) {
        org.lwjgl.opengl.GL15.glDeleteBuffers(buffers);
    }

    @Override public void glDeleteBuffers(@NativeType("GLuint const *") int buffer) {
        org.lwjgl.opengl.GL15.glDeleteBuffers(buffer);
    }

    @Override public void glDeleteBuffers(@NativeType("GLuint const *") int[] buffers) {
        org.lwjgl.opengl.GL15.glDeleteBuffers(buffers);
    }

    @Override public void nglGenBuffers(int n, long buffers) {
        org.lwjgl.opengl.GL15.nglGenBuffers(n, buffers);
    }

    @Override public void glGenBuffers(@NativeType("GLuint *") IntBuffer buffers) {
        org.lwjgl.opengl.GL15.glGenBuffers(buffers);
    }

@NativeType("void")
    @Override public int glGenBuffers() {
        return org.lwjgl.opengl.GL15.glGenBuffers();
    }

    @Override public void glGenBuffers(@NativeType("GLuint *") int[] buffers) {
        org.lwjgl.opengl.GL15.glGenBuffers(buffers);
    }

@NativeType("GLboolean")
    @Override public boolean glIsBuffer(@NativeType("GLuint") int buffer) {
        return org.lwjgl.opengl.GL15.glIsBuffer(buffer);
    }

    @Override public void nglBufferData(int target, long size, long data, int usage) {
        org.lwjgl.opengl.GL15.nglBufferData(target, size, data, usage);
    }

    @Override public void glBufferData(@NativeType("GLenum") int target, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int usage) {
        org.lwjgl.opengl.GL15.glBufferData(target, size, usage);
    }

    @Override public void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") ByteBuffer data, @NativeType("GLenum") int usage) {
        org.lwjgl.opengl.GL15.glBufferData(target, data, usage);
    }

    @Override public void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") ShortBuffer data, @NativeType("GLenum") int usage) {
        org.lwjgl.opengl.GL15.glBufferData(target, data, usage);
    }

    @Override public void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") IntBuffer data, @NativeType("GLenum") int usage) {
        org.lwjgl.opengl.GL15.glBufferData(target, data, usage);
    }

    @Override public void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") LongBuffer data, @NativeType("GLenum") int usage) {
        org.lwjgl.opengl.GL15.glBufferData(target, data, usage);
    }

    @Override public void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") FloatBuffer data, @NativeType("GLenum") int usage) {
        org.lwjgl.opengl.GL15.glBufferData(target, data, usage);
    }

    @Override public void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") DoubleBuffer data, @NativeType("GLenum") int usage) {
        org.lwjgl.opengl.GL15.glBufferData(target, data, usage);
    }

    @Override public void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") short[] data, @NativeType("GLenum") int usage) {
        org.lwjgl.opengl.GL15.glBufferData(target, data, usage);
    }

    @Override public void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") int[] data, @NativeType("GLenum") int usage) {
        org.lwjgl.opengl.GL15.glBufferData(target, data, usage);
    }

    @Override public void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") long[] data, @NativeType("GLenum") int usage) {
        org.lwjgl.opengl.GL15.glBufferData(target, data, usage);
    }

    @Override public void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") float[] data, @NativeType("GLenum") int usage) {
        org.lwjgl.opengl.GL15.glBufferData(target, data, usage);
    }

    @Override public void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") double[] data, @NativeType("GLenum") int usage) {
        org.lwjgl.opengl.GL15.glBufferData(target, data, usage);
    }

    @Override public void nglBufferSubData(int target, long offset, long size, long data) {
        org.lwjgl.opengl.GL15.nglBufferSubData(target, offset, size, data);
    }

    @Override public void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") ByteBuffer data) {
        org.lwjgl.opengl.GL15.glBufferSubData(target, offset, data);
    }

    @Override public void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") ShortBuffer data) {
        org.lwjgl.opengl.GL15.glBufferSubData(target, offset, data);
    }

    @Override public void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") IntBuffer data) {
        org.lwjgl.opengl.GL15.glBufferSubData(target, offset, data);
    }

    @Override public void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") LongBuffer data) {
        org.lwjgl.opengl.GL15.glBufferSubData(target, offset, data);
    }

    @Override public void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") FloatBuffer data) {
        org.lwjgl.opengl.GL15.glBufferSubData(target, offset, data);
    }

    @Override public void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") DoubleBuffer data) {
        org.lwjgl.opengl.GL15.glBufferSubData(target, offset, data);
    }

    @Override public void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") short[] data) {
        org.lwjgl.opengl.GL15.glBufferSubData(target, offset, data);
    }

    @Override public void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") int[] data) {
        org.lwjgl.opengl.GL15.glBufferSubData(target, offset, data);
    }

    @Override public void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") long[] data) {
        org.lwjgl.opengl.GL15.glBufferSubData(target, offset, data);
    }

    @Override public void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") float[] data) {
        org.lwjgl.opengl.GL15.glBufferSubData(target, offset, data);
    }

    @Override public void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") double[] data) {
        org.lwjgl.opengl.GL15.glBufferSubData(target, offset, data);
    }

    @Override public void nglGetBufferSubData(int target, long offset, long size, long data) {
        org.lwjgl.opengl.GL15.nglGetBufferSubData(target, offset, size, data);
    }

    @Override public void glGetBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void *") ByteBuffer data) {
        org.lwjgl.opengl.GL15.glGetBufferSubData(target, offset, data);
    }

    @Override public void glGetBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void *") ShortBuffer data) {
        org.lwjgl.opengl.GL15.glGetBufferSubData(target, offset, data);
    }

    @Override public void glGetBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void *") IntBuffer data) {
        org.lwjgl.opengl.GL15.glGetBufferSubData(target, offset, data);
    }

    @Override public void glGetBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void *") LongBuffer data) {
        org.lwjgl.opengl.GL15.glGetBufferSubData(target, offset, data);
    }

    @Override public void glGetBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void *") FloatBuffer data) {
        org.lwjgl.opengl.GL15.glGetBufferSubData(target, offset, data);
    }

    @Override public void glGetBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void *") DoubleBuffer data) {
        org.lwjgl.opengl.GL15.glGetBufferSubData(target, offset, data);
    }

    @Override public void glGetBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void *") short[] data) {
        org.lwjgl.opengl.GL15.glGetBufferSubData(target, offset, data);
    }

    @Override public void glGetBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void *") int[] data) {
        org.lwjgl.opengl.GL15.glGetBufferSubData(target, offset, data);
    }

    @Override public void glGetBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void *") long[] data) {
        org.lwjgl.opengl.GL15.glGetBufferSubData(target, offset, data);
    }

    @Override public void glGetBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void *") float[] data) {
        org.lwjgl.opengl.GL15.glGetBufferSubData(target, offset, data);
    }

    @Override public void glGetBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void *") double[] data) {
        org.lwjgl.opengl.GL15.glGetBufferSubData(target, offset, data);
    }

    @Override public long nglMapBuffer(int target, int access) {
        return org.lwjgl.opengl.GL15.nglMapBuffer(target, access);
    }

@Nullable
@NativeType("void *")
    @Override public ByteBuffer glMapBuffer(@NativeType("GLenum") int target, @NativeType("GLenum") int access) {
        return org.lwjgl.opengl.GL15.glMapBuffer(target, access);
    }

@Nullable
@NativeType("void *")
    @Override public ByteBuffer glMapBuffer(@NativeType("GLenum") int target, @NativeType("GLenum") int access, @Nullable ByteBuffer old_buffer) {
        return org.lwjgl.opengl.GL15.glMapBuffer(target, access, old_buffer);
    }

@Nullable
@NativeType("void *")
    @Override public ByteBuffer glMapBuffer(@NativeType("GLenum") int target, @NativeType("GLenum") int access, long length, @Nullable ByteBuffer old_buffer) {
        return org.lwjgl.opengl.GL15.glMapBuffer(target, access, length, old_buffer);
    }

@NativeType("GLboolean")
    @Override public boolean glUnmapBuffer(@NativeType("GLenum") int target) {
        return org.lwjgl.opengl.GL15.glUnmapBuffer(target);
    }

    @Override public void nglGetBufferParameteriv(int target, int pname, long params) {
        org.lwjgl.opengl.GL15.nglGetBufferParameteriv(target, pname, params);
    }

    @Override public void glGetBufferParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengl.GL15.glGetBufferParameteriv(target, pname, params);
    }

    @Override public void glGetBufferParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengl.GL15.glGetBufferParameteriv(target, pname, params);
    }

@NativeType("void")
    @Override public int glGetBufferParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL15.glGetBufferParameteri(target, pname);
    }

    @Override public void nglGetBufferPointerv(int target, int pname, long params) {
        org.lwjgl.opengl.GL15.nglGetBufferPointerv(target, pname, params);
    }

    @Override public void glGetBufferPointerv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("void **") PointerBuffer params) {
        org.lwjgl.opengl.GL15.glGetBufferPointerv(target, pname, params);
    }

@NativeType("void")
    @Override public long glGetBufferPointer(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL15.glGetBufferPointer(target, pname);
    }

    @Override public void nglGenQueries(int n, long ids) {
        org.lwjgl.opengl.GL15.nglGenQueries(n, ids);
    }

    @Override public void glGenQueries(@NativeType("GLuint *") IntBuffer ids) {
        org.lwjgl.opengl.GL15.glGenQueries(ids);
    }

@NativeType("void")
    @Override public int glGenQueries() {
        return org.lwjgl.opengl.GL15.glGenQueries();
    }

    @Override public void glGenQueries(@NativeType("GLuint *") int[] ids) {
        org.lwjgl.opengl.GL15.glGenQueries(ids);
    }

    @Override public void nglDeleteQueries(int n, long ids) {
        org.lwjgl.opengl.GL15.nglDeleteQueries(n, ids);
    }

    @Override public void glDeleteQueries(@NativeType("GLuint const *") IntBuffer ids) {
        org.lwjgl.opengl.GL15.glDeleteQueries(ids);
    }

    @Override public void glDeleteQueries(@NativeType("GLuint const *") int id) {
        org.lwjgl.opengl.GL15.glDeleteQueries(id);
    }

    @Override public void glDeleteQueries(@NativeType("GLuint const *") int[] ids) {
        org.lwjgl.opengl.GL15.glDeleteQueries(ids);
    }

@NativeType("GLboolean")
    @Override public boolean glIsQuery(@NativeType("GLuint") int id) {
        return org.lwjgl.opengl.GL15.glIsQuery(id);
    }

    @Override public void glBeginQuery(@NativeType("GLenum") int target, @NativeType("GLuint") int id) {
        org.lwjgl.opengl.GL15.glBeginQuery(target, id);
    }

    @Override public void glEndQuery(@NativeType("GLenum") int target) {
        org.lwjgl.opengl.GL15.glEndQuery(target);
    }

    @Override public void nglGetQueryiv(int target, int pname, long params) {
        org.lwjgl.opengl.GL15.nglGetQueryiv(target, pname, params);
    }

    @Override public void glGetQueryiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengl.GL15.glGetQueryiv(target, pname, params);
    }

    @Override public void glGetQueryiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengl.GL15.glGetQueryiv(target, pname, params);
    }

@NativeType("void")
    @Override public int glGetQueryi(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL15.glGetQueryi(target, pname);
    }

    @Override public void nglGetQueryObjectiv(int id, int pname, long params) {
        org.lwjgl.opengl.GL15.nglGetQueryObjectiv(id, pname, params);
    }

    @Override public void glGetQueryObjectiv(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengl.GL15.glGetQueryObjectiv(id, pname, params);
    }

    @Override public void glGetQueryObjectiv(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint *") long params) {
        org.lwjgl.opengl.GL15.glGetQueryObjectiv(id, pname, params);
    }

    @Override public void glGetQueryObjectiv(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengl.GL15.glGetQueryObjectiv(id, pname, params);
    }

@NativeType("void")
    @Override public int glGetQueryObjecti(@NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL15.glGetQueryObjecti(id, pname);
    }

    @Override public void nglGetQueryObjectuiv(int id, int pname, long params) {
        org.lwjgl.opengl.GL15.nglGetQueryObjectuiv(id, pname, params);
    }

    @Override public void glGetQueryObjectuiv(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        org.lwjgl.opengl.GL15.glGetQueryObjectuiv(id, pname, params);
    }

    @Override
    public void glGetQueryObjectuiv(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint *") long params) {
        org.lwjgl.opengl.GL15.glGetQueryObjectuiv(id, pname, params);
    }

    @Override public void glGetQueryObjectuiv(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        org.lwjgl.opengl.GL15.glGetQueryObjectuiv(id, pname, params);
    }

@NativeType("void")
    @Override public int glGetQueryObjectui(@NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL15.glGetQueryObjectui(id, pname);
    }

}
