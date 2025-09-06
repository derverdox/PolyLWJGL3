package de.verdox.polylwjgl3.gl.accessor.gl45;

import de.verdox.polylwjgl3.gl.accessor.gl44.GL44Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl44.GL44AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL45;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public class GL45AccessorImpl extends GL44AccessorImpl implements GL45Accessor {

    @Override public void glClipControl(@NativeType("GLenum") int origin, @NativeType("GLenum") int depth) {
        org.lwjgl.opengl.GL45.glClipControl(origin, depth);
    }

    @Override public void nglCreateTransformFeedbacks(int n, long ids) {
        org.lwjgl.opengl.GL45.nglCreateTransformFeedbacks(n, ids);
    }

    @Override public void glCreateTransformFeedbacks(@NativeType("GLuint *") IntBuffer ids) {
        org.lwjgl.opengl.GL45.glCreateTransformFeedbacks(ids);
    }

@NativeType("void")
    @Override public int glCreateTransformFeedbacks() {
        return org.lwjgl.opengl.GL45.glCreateTransformFeedbacks();
    }

    @Override public void glCreateTransformFeedbacks(@NativeType("GLuint *") int[] ids) {
        org.lwjgl.opengl.GL45.glCreateTransformFeedbacks(ids);
    }

    @Override public void glTransformFeedbackBufferBase(@NativeType("GLuint") int xfb, @NativeType("GLuint") int index, @NativeType("GLuint") int buffer) {
        org.lwjgl.opengl.GL45.glTransformFeedbackBufferBase(xfb, index, buffer);
    }

    @Override public void glTransformFeedbackBufferRange(@NativeType("GLuint") int xfb, @NativeType("GLuint") int index, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size) {
        org.lwjgl.opengl.GL45.glTransformFeedbackBufferRange(xfb, index, buffer, offset, size);
    }

    @Override public void nglGetTransformFeedbackiv(int xfb, int pname, long param) {
        org.lwjgl.opengl.GL45.nglGetTransformFeedbackiv(xfb, pname, param);
    }

    @Override public void glGetTransformFeedbackiv(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer param) {
        org.lwjgl.opengl.GL45.glGetTransformFeedbackiv(xfb, pname, param);
    }

    @Override public void glGetTransformFeedbackiv(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] param) {
        org.lwjgl.opengl.GL45.glGetTransformFeedbackiv(xfb, pname, param);
    }

@NativeType("void")
    @Override public int glGetTransformFeedbacki(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL45.glGetTransformFeedbacki(xfb, pname);
    }

@NativeType("void")
    @Override public int glGetTransformFeedbacki(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname, @NativeType("GLuint") int index) {
        return org.lwjgl.opengl.GL45.glGetTransformFeedbacki(xfb, pname, index);
    }

    @Override public void nglGetTransformFeedbacki_v(int xfb, int pname, int index, long param) {
        org.lwjgl.opengl.GL45.nglGetTransformFeedbacki_v(xfb, pname, index, param);
    }

    @Override public void glGetTransformFeedbacki_v(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLint *") IntBuffer param) {
        org.lwjgl.opengl.GL45.glGetTransformFeedbacki_v(xfb, pname, index, param);
    }

    @Override public void glGetTransformFeedbacki_v(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLint *") int[] param) {
        org.lwjgl.opengl.GL45.glGetTransformFeedbacki_v(xfb, pname, index, param);
    }

    @Override public void nglGetTransformFeedbacki64_v(int xfb, int pname, int index, long param) {
        org.lwjgl.opengl.GL45.nglGetTransformFeedbacki64_v(xfb, pname, index, param);
    }

    @Override public void glGetTransformFeedbacki64_v(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLint64 *") LongBuffer param) {
        org.lwjgl.opengl.GL45.glGetTransformFeedbacki64_v(xfb, pname, index, param);
    }

    @Override public void glGetTransformFeedbacki64_v(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLint64 *") long[] param) {
        org.lwjgl.opengl.GL45.glGetTransformFeedbacki64_v(xfb, pname, index, param);
    }

@NativeType("void")
    @Override public long glGetTransformFeedbacki64(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname, @NativeType("GLuint") int index) {
        return org.lwjgl.opengl.GL45.glGetTransformFeedbacki64(xfb, pname, index);
    }

    @Override public void nglCreateBuffers(int n, long buffers) {
        org.lwjgl.opengl.GL45.nglCreateBuffers(n, buffers);
    }

    @Override public void glCreateBuffers(@NativeType("GLuint *") IntBuffer buffers) {
        org.lwjgl.opengl.GL45.glCreateBuffers(buffers);
    }

@NativeType("void")
    @Override public int glCreateBuffers() {
        return org.lwjgl.opengl.GL45.glCreateBuffers();
    }

    @Override public void glCreateBuffers(@NativeType("GLuint *") int[] buffers) {
        org.lwjgl.opengl.GL45.glCreateBuffers(buffers);
    }

    @Override public void nglNamedBufferStorage(int buffer, long size, long data, int flags) {
        org.lwjgl.opengl.GL45.nglNamedBufferStorage(buffer, size, data, flags);
    }

    @Override public void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("GLsizeiptr") long size, @NativeType("GLbitfield") int flags) {
        org.lwjgl.opengl.GL45.glNamedBufferStorage(buffer, size, flags);
    }

    @Override public void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("void const *") ByteBuffer data, @NativeType("GLbitfield") int flags) {
        org.lwjgl.opengl.GL45.glNamedBufferStorage(buffer, data, flags);
    }

    @Override public void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("void const *") ShortBuffer data, @NativeType("GLbitfield") int flags) {
        org.lwjgl.opengl.GL45.glNamedBufferStorage(buffer, data, flags);
    }

    @Override public void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("void const *") IntBuffer data, @NativeType("GLbitfield") int flags) {
        org.lwjgl.opengl.GL45.glNamedBufferStorage(buffer, data, flags);
    }

    @Override public void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("void const *") FloatBuffer data, @NativeType("GLbitfield") int flags) {
        org.lwjgl.opengl.GL45.glNamedBufferStorage(buffer, data, flags);
    }

    @Override public void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("void const *") DoubleBuffer data, @NativeType("GLbitfield") int flags) {
        org.lwjgl.opengl.GL45.glNamedBufferStorage(buffer, data, flags);
    }

    @Override public void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("void const *") short[] data, @NativeType("GLbitfield") int flags) {
        org.lwjgl.opengl.GL45.glNamedBufferStorage(buffer, data, flags);
    }

    @Override public void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("void const *") int[] data, @NativeType("GLbitfield") int flags) {
        org.lwjgl.opengl.GL45.glNamedBufferStorage(buffer, data, flags);
    }

    @Override public void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("void const *") float[] data, @NativeType("GLbitfield") int flags) {
        org.lwjgl.opengl.GL45.glNamedBufferStorage(buffer, data, flags);
    }

    @Override public void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("void const *") double[] data, @NativeType("GLbitfield") int flags) {
        org.lwjgl.opengl.GL45.glNamedBufferStorage(buffer, data, flags);
    }

    @Override public void nglNamedBufferData(int buffer, long size, long data, int usage) {
        org.lwjgl.opengl.GL45.nglNamedBufferData(buffer, size, data, usage);
    }

    @Override public void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int usage) {
        org.lwjgl.opengl.GL45.glNamedBufferData(buffer, size, usage);
    }

    @Override public void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") ByteBuffer data, @NativeType("GLenum") int usage) {
        org.lwjgl.opengl.GL45.glNamedBufferData(buffer, data, usage);
    }

    @Override public void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") ShortBuffer data, @NativeType("GLenum") int usage) {
        org.lwjgl.opengl.GL45.glNamedBufferData(buffer, data, usage);
    }

    @Override public void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") IntBuffer data, @NativeType("GLenum") int usage) {
        org.lwjgl.opengl.GL45.glNamedBufferData(buffer, data, usage);
    }

    @Override public void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") LongBuffer data, @NativeType("GLenum") int usage) {
        org.lwjgl.opengl.GL45.glNamedBufferData(buffer, data, usage);
    }

    @Override public void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") FloatBuffer data, @NativeType("GLenum") int usage) {
        org.lwjgl.opengl.GL45.glNamedBufferData(buffer, data, usage);
    }

    @Override public void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") DoubleBuffer data, @NativeType("GLenum") int usage) {
        org.lwjgl.opengl.GL45.glNamedBufferData(buffer, data, usage);
    }

    @Override public void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") short[] data, @NativeType("GLenum") int usage) {
        org.lwjgl.opengl.GL45.glNamedBufferData(buffer, data, usage);
    }

    @Override public void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") int[] data, @NativeType("GLenum") int usage) {
        org.lwjgl.opengl.GL45.glNamedBufferData(buffer, data, usage);
    }

    @Override public void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") long[] data, @NativeType("GLenum") int usage) {
        org.lwjgl.opengl.GL45.glNamedBufferData(buffer, data, usage);
    }

    @Override public void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") float[] data, @NativeType("GLenum") int usage) {
        org.lwjgl.opengl.GL45.glNamedBufferData(buffer, data, usage);
    }

    @Override public void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") double[] data, @NativeType("GLenum") int usage) {
        org.lwjgl.opengl.GL45.glNamedBufferData(buffer, data, usage);
    }

    @Override public void nglNamedBufferSubData(int buffer, long offset, long size, long data) {
        org.lwjgl.opengl.GL45.nglNamedBufferSubData(buffer, offset, size, data);
    }

    @Override public void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") ByteBuffer data) {
        org.lwjgl.opengl.GL45.glNamedBufferSubData(buffer, offset, data);
    }

    @Override public void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") ShortBuffer data) {
        org.lwjgl.opengl.GL45.glNamedBufferSubData(buffer, offset, data);
    }

    @Override public void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") IntBuffer data) {
        org.lwjgl.opengl.GL45.glNamedBufferSubData(buffer, offset, data);
    }

    @Override public void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") LongBuffer data) {
        org.lwjgl.opengl.GL45.glNamedBufferSubData(buffer, offset, data);
    }

    @Override public void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") FloatBuffer data) {
        org.lwjgl.opengl.GL45.glNamedBufferSubData(buffer, offset, data);
    }

    @Override public void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") DoubleBuffer data) {
        org.lwjgl.opengl.GL45.glNamedBufferSubData(buffer, offset, data);
    }

    @Override public void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") short[] data) {
        org.lwjgl.opengl.GL45.glNamedBufferSubData(buffer, offset, data);
    }

    @Override public void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") int[] data) {
        org.lwjgl.opengl.GL45.glNamedBufferSubData(buffer, offset, data);
    }

    @Override public void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") long[] data) {
        org.lwjgl.opengl.GL45.glNamedBufferSubData(buffer, offset, data);
    }

    @Override public void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") float[] data) {
        org.lwjgl.opengl.GL45.glNamedBufferSubData(buffer, offset, data);
    }

    @Override public void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") double[] data) {
        org.lwjgl.opengl.GL45.glNamedBufferSubData(buffer, offset, data);
    }

    @Override public void glCopyNamedBufferSubData(@NativeType("GLuint") int readBuffer, @NativeType("GLuint") int writeBuffer, @NativeType("GLintptr") long readOffset, @NativeType("GLintptr") long writeOffset, @NativeType("GLsizeiptr") long size) {
        org.lwjgl.opengl.GL45.glCopyNamedBufferSubData(readBuffer, writeBuffer, readOffset, writeOffset, size);
    }

    @Override public void nglClearNamedBufferData(int buffer, int internalformat, int format, int type, long data) {
        org.lwjgl.opengl.GL45.nglClearNamedBufferData(buffer, internalformat, format, type, data);
    }

    @Override public void glClearNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ByteBuffer data) {
        org.lwjgl.opengl.GL45.glClearNamedBufferData(buffer, internalformat, format, type, data);
    }

    @Override public void glClearNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ShortBuffer data) {
        org.lwjgl.opengl.GL45.glClearNamedBufferData(buffer, internalformat, format, type, data);
    }

    @Override public void glClearNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") IntBuffer data) {
        org.lwjgl.opengl.GL45.glClearNamedBufferData(buffer, internalformat, format, type, data);
    }

    @Override public void glClearNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") FloatBuffer data) {
        org.lwjgl.opengl.GL45.glClearNamedBufferData(buffer, internalformat, format, type, data);
    }

    @Override public void glClearNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") short[] data) {
        org.lwjgl.opengl.GL45.glClearNamedBufferData(buffer, internalformat, format, type, data);
    }

    @Override public void glClearNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") int[] data) {
        org.lwjgl.opengl.GL45.glClearNamedBufferData(buffer, internalformat, format, type, data);
    }

    @Override public void glClearNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") float[] data) {
        org.lwjgl.opengl.GL45.glClearNamedBufferData(buffer, internalformat, format, type, data);
    }

    @Override public void nglClearNamedBufferSubData(int buffer, int internalformat, long offset, long size, int format, int type, long data) {
        org.lwjgl.opengl.GL45.nglClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, data);
    }

    @Override public void glClearNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ByteBuffer data) {
        org.lwjgl.opengl.GL45.glClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, data);
    }

    @Override public void glClearNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ShortBuffer data) {
        org.lwjgl.opengl.GL45.glClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, data);
    }

    @Override public void glClearNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") IntBuffer data) {
        org.lwjgl.opengl.GL45.glClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, data);
    }

    @Override public void glClearNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") FloatBuffer data) {
        org.lwjgl.opengl.GL45.glClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, data);
    }

    @Override public void glClearNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") short[] data) {
        org.lwjgl.opengl.GL45.glClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, data);
    }

    @Override public void glClearNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") int[] data) {
        org.lwjgl.opengl.GL45.glClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, data);
    }

    @Override public void glClearNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") float[] data) {
        org.lwjgl.opengl.GL45.glClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, data);
    }

    @Override public long nglMapNamedBuffer(int buffer, int access) {
        return org.lwjgl.opengl.GL45.nglMapNamedBuffer(buffer, access);
    }

@Nullable
@NativeType("void *")
    @Override public ByteBuffer glMapNamedBuffer(@NativeType("GLuint") int buffer, @NativeType("GLenum") int access) {
        return org.lwjgl.opengl.GL45.glMapNamedBuffer(buffer, access);
    }

@Nullable
@NativeType("void *")
    @Override public ByteBuffer glMapNamedBuffer(@NativeType("GLuint") int buffer, @NativeType("GLenum") int access, @Nullable ByteBuffer old_buffer) {
        return org.lwjgl.opengl.GL45.glMapNamedBuffer(buffer, access, old_buffer);
    }

@Nullable
@NativeType("void *")
    @Override public ByteBuffer glMapNamedBuffer(@NativeType("GLuint") int buffer, @NativeType("GLenum") int access, long length, @Nullable ByteBuffer old_buffer) {
        return org.lwjgl.opengl.GL45.glMapNamedBuffer(buffer, access, length, old_buffer);
    }

    @Override public long nglMapNamedBufferRange(int buffer, long offset, long length, int access) {
        return org.lwjgl.opengl.GL45.nglMapNamedBufferRange(buffer, offset, length, access);
    }

@Nullable
@NativeType("void *")
    @Override public ByteBuffer glMapNamedBufferRange(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length, @NativeType("GLbitfield") int access) {
        return org.lwjgl.opengl.GL45.glMapNamedBufferRange(buffer, offset, length, access);
    }

@Nullable
@NativeType("void *")
    @Override public ByteBuffer glMapNamedBufferRange(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length, @NativeType("GLbitfield") int access, @Nullable ByteBuffer old_buffer) {
        return org.lwjgl.opengl.GL45.glMapNamedBufferRange(buffer, offset, length, access, old_buffer);
    }

@NativeType("GLboolean")
    @Override public boolean glUnmapNamedBuffer(@NativeType("GLuint") int buffer) {
        return org.lwjgl.opengl.GL45.glUnmapNamedBuffer(buffer);
    }

    @Override public void glFlushMappedNamedBufferRange(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length) {
        org.lwjgl.opengl.GL45.glFlushMappedNamedBufferRange(buffer, offset, length);
    }

    @Override public void nglGetNamedBufferParameteriv(int buffer, int pname, long params) {
        org.lwjgl.opengl.GL45.nglGetNamedBufferParameteriv(buffer, pname, params);
    }

    @Override public void glGetNamedBufferParameteriv(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengl.GL45.glGetNamedBufferParameteriv(buffer, pname, params);
    }

    @Override public void glGetNamedBufferParameteriv(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengl.GL45.glGetNamedBufferParameteriv(buffer, pname, params);
    }

@NativeType("void")
    @Override public int glGetNamedBufferParameteri(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL45.glGetNamedBufferParameteri(buffer, pname);
    }

    @Override public void nglGetNamedBufferParameteri64v(int buffer, int pname, long params) {
        org.lwjgl.opengl.GL45.nglGetNamedBufferParameteri64v(buffer, pname, params);
    }

    @Override public void glGetNamedBufferParameteri64v(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLint64 *") LongBuffer params) {
        org.lwjgl.opengl.GL45.glGetNamedBufferParameteri64v(buffer, pname, params);
    }

    @Override public void glGetNamedBufferParameteri64v(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLint64 *") long[] params) {
        org.lwjgl.opengl.GL45.glGetNamedBufferParameteri64v(buffer, pname, params);
    }

@NativeType("void")
    @Override public long glGetNamedBufferParameteri64(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL45.glGetNamedBufferParameteri64(buffer, pname);
    }

    @Override public void nglGetNamedBufferPointerv(int buffer, int pname, long params) {
        org.lwjgl.opengl.GL45.nglGetNamedBufferPointerv(buffer, pname, params);
    }

    @Override public void glGetNamedBufferPointerv(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("void **") PointerBuffer params) {
        org.lwjgl.opengl.GL45.glGetNamedBufferPointerv(buffer, pname, params);
    }

@NativeType("void")
    @Override public long glGetNamedBufferPointer(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL45.glGetNamedBufferPointer(buffer, pname);
    }

    @Override public void nglGetNamedBufferSubData(int buffer, long offset, long size, long data) {
        org.lwjgl.opengl.GL45.nglGetNamedBufferSubData(buffer, offset, size, data);
    }

    @Override public void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") ByteBuffer data) {
        org.lwjgl.opengl.GL45.glGetNamedBufferSubData(buffer, offset, data);
    }

    @Override public void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") ShortBuffer data) {
        org.lwjgl.opengl.GL45.glGetNamedBufferSubData(buffer, offset, data);
    }

    @Override public void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") IntBuffer data) {
        org.lwjgl.opengl.GL45.glGetNamedBufferSubData(buffer, offset, data);
    }

    @Override public void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") LongBuffer data) {
        org.lwjgl.opengl.GL45.glGetNamedBufferSubData(buffer, offset, data);
    }

    @Override public void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") FloatBuffer data) {
        org.lwjgl.opengl.GL45.glGetNamedBufferSubData(buffer, offset, data);
    }

    @Override public void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") DoubleBuffer data) {
        org.lwjgl.opengl.GL45.glGetNamedBufferSubData(buffer, offset, data);
    }

    @Override public void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") short[] data) {
        org.lwjgl.opengl.GL45.glGetNamedBufferSubData(buffer, offset, data);
    }

    @Override public void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") int[] data) {
        org.lwjgl.opengl.GL45.glGetNamedBufferSubData(buffer, offset, data);
    }

    @Override public void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") long[] data) {
        org.lwjgl.opengl.GL45.glGetNamedBufferSubData(buffer, offset, data);
    }

    @Override public void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") float[] data) {
        org.lwjgl.opengl.GL45.glGetNamedBufferSubData(buffer, offset, data);
    }

    @Override public void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") double[] data) {
        org.lwjgl.opengl.GL45.glGetNamedBufferSubData(buffer, offset, data);
    }

    @Override public void nglCreateFramebuffers(int n, long framebuffers) {
        org.lwjgl.opengl.GL45.nglCreateFramebuffers(n, framebuffers);
    }

    @Override public void glCreateFramebuffers(@NativeType("GLuint *") IntBuffer framebuffers) {
        org.lwjgl.opengl.GL45.glCreateFramebuffers(framebuffers);
    }

@NativeType("void")
    @Override public int glCreateFramebuffers() {
        return org.lwjgl.opengl.GL45.glCreateFramebuffers();
    }

    @Override public void glCreateFramebuffers(@NativeType("GLuint *") int[] framebuffers) {
        org.lwjgl.opengl.GL45.glCreateFramebuffers(framebuffers);
    }

    @Override public void glNamedFramebufferRenderbuffer(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLenum") int renderbuffertarget, @NativeType("GLuint") int renderbuffer) {
        org.lwjgl.opengl.GL45.glNamedFramebufferRenderbuffer(framebuffer, attachment, renderbuffertarget, renderbuffer);
    }

    @Override public void glNamedFramebufferParameteri(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        org.lwjgl.opengl.GL45.glNamedFramebufferParameteri(framebuffer, pname, param);
    }

    @Override public void glNamedFramebufferTexture(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level) {
        org.lwjgl.opengl.GL45.glNamedFramebufferTexture(framebuffer, attachment, texture, level);
    }

    @Override public void glNamedFramebufferTextureLayer(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int layer) {
        org.lwjgl.opengl.GL45.glNamedFramebufferTextureLayer(framebuffer, attachment, texture, level, layer);
    }

    @Override public void glNamedFramebufferDrawBuffer(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int buf) {
        org.lwjgl.opengl.GL45.glNamedFramebufferDrawBuffer(framebuffer, buf);
    }

    @Override public void nglNamedFramebufferDrawBuffers(int framebuffer, int n, long bufs) {
        org.lwjgl.opengl.GL45.nglNamedFramebufferDrawBuffers(framebuffer, n, bufs);
    }

    @Override public void glNamedFramebufferDrawBuffers(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") IntBuffer bufs) {
        org.lwjgl.opengl.GL45.glNamedFramebufferDrawBuffers(framebuffer, bufs);
    }

    @Override public void glNamedFramebufferDrawBuffers(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") int buf) {
        org.lwjgl.opengl.GL45.glNamedFramebufferDrawBuffers(framebuffer, buf);
    }

    @Override public void glNamedFramebufferDrawBuffers(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") int[] bufs) {
        org.lwjgl.opengl.GL45.glNamedFramebufferDrawBuffers(framebuffer, bufs);
    }

    @Override public void glNamedFramebufferReadBuffer(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int src) {
        org.lwjgl.opengl.GL45.glNamedFramebufferReadBuffer(framebuffer, src);
    }

    @Override public void nglInvalidateNamedFramebufferData(int framebuffer, int numAttachments, long attachments) {
        org.lwjgl.opengl.GL45.nglInvalidateNamedFramebufferData(framebuffer, numAttachments, attachments);
    }

    @Override public void glInvalidateNamedFramebufferData(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") IntBuffer attachments) {
        org.lwjgl.opengl.GL45.glInvalidateNamedFramebufferData(framebuffer, attachments);
    }

    @Override public void glInvalidateNamedFramebufferData(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") int attachment) {
        org.lwjgl.opengl.GL45.glInvalidateNamedFramebufferData(framebuffer, attachment);
    }

    @Override public void glInvalidateNamedFramebufferData(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") int[] attachments) {
        org.lwjgl.opengl.GL45.glInvalidateNamedFramebufferData(framebuffer, attachments);
    }

    @Override public void nglInvalidateNamedFramebufferSubData(int framebuffer, int numAttachments, long attachments, int x, int y, int width, int height) {
        org.lwjgl.opengl.GL45.nglInvalidateNamedFramebufferSubData(framebuffer, numAttachments, attachments, x, y, width, height);
    }

    @Override public void glInvalidateNamedFramebufferSubData(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") IntBuffer attachments, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        org.lwjgl.opengl.GL45.glInvalidateNamedFramebufferSubData(framebuffer, attachments, x, y, width, height);
    }

    @Override public void glInvalidateNamedFramebufferSubData(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") int attachment, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        org.lwjgl.opengl.GL45.glInvalidateNamedFramebufferSubData(framebuffer, attachment, x, y, width, height);
    }

    @Override public void glInvalidateNamedFramebufferSubData(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") int[] attachments, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        org.lwjgl.opengl.GL45.glInvalidateNamedFramebufferSubData(framebuffer, attachments, x, y, width, height);
    }

    @Override public void nglClearNamedFramebufferiv(int framebuffer, int buffer, int drawbuffer, long value) {
        org.lwjgl.opengl.GL45.nglClearNamedFramebufferiv(framebuffer, buffer, drawbuffer, value);
    }

    @Override public void glClearNamedFramebufferiv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLint const *") IntBuffer value) {
        org.lwjgl.opengl.GL45.glClearNamedFramebufferiv(framebuffer, buffer, drawbuffer, value);
    }

    @Override public void glClearNamedFramebufferiv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLint const *") int[] value) {
        org.lwjgl.opengl.GL45.glClearNamedFramebufferiv(framebuffer, buffer, drawbuffer, value);
    }

    @Override public void nglClearNamedFramebufferuiv(int framebuffer, int buffer, int drawbuffer, long value) {
        org.lwjgl.opengl.GL45.nglClearNamedFramebufferuiv(framebuffer, buffer, drawbuffer, value);
    }

    @Override public void glClearNamedFramebufferuiv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLint const *") IntBuffer value) {
        org.lwjgl.opengl.GL45.glClearNamedFramebufferuiv(framebuffer, buffer, drawbuffer, value);
    }

    @Override public void glClearNamedFramebufferuiv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLint const *") int[] value) {
        org.lwjgl.opengl.GL45.glClearNamedFramebufferuiv(framebuffer, buffer, drawbuffer, value);
    }

    @Override public void nglClearNamedFramebufferfv(int framebuffer, int buffer, int drawbuffer, long value) {
        org.lwjgl.opengl.GL45.nglClearNamedFramebufferfv(framebuffer, buffer, drawbuffer, value);
    }

    @Override public void glClearNamedFramebufferfv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengl.GL45.glClearNamedFramebufferfv(framebuffer, buffer, drawbuffer, value);
    }

    @Override public void glClearNamedFramebufferfv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengl.GL45.glClearNamedFramebufferfv(framebuffer, buffer, drawbuffer, value);
    }

    @Override public void glClearNamedFramebufferfi(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLfloat") float depth, @NativeType("GLint") int stencil) {
        org.lwjgl.opengl.GL45.glClearNamedFramebufferfi(framebuffer, buffer, drawbuffer, depth, stencil);
    }

    @Override public void glBlitNamedFramebuffer(@NativeType("GLuint") int readFramebuffer, @NativeType("GLuint") int drawFramebuffer, @NativeType("GLint") int srcX0, @NativeType("GLint") int srcY0, @NativeType("GLint") int srcX1, @NativeType("GLint") int srcY1, @NativeType("GLint") int dstX0, @NativeType("GLint") int dstY0, @NativeType("GLint") int dstX1, @NativeType("GLint") int dstY1, @NativeType("GLbitfield") int mask, @NativeType("GLenum") int filter) {
        org.lwjgl.opengl.GL45.glBlitNamedFramebuffer(readFramebuffer, drawFramebuffer, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
    }

@NativeType("GLenum")
    @Override public int glCheckNamedFramebufferStatus(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int target) {
        return org.lwjgl.opengl.GL45.glCheckNamedFramebufferStatus(framebuffer, target);
    }

    @Override public void nglGetNamedFramebufferParameteriv(int framebuffer, int pname, long params) {
        org.lwjgl.opengl.GL45.nglGetNamedFramebufferParameteriv(framebuffer, pname, params);
    }

    @Override public void glGetNamedFramebufferParameteriv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengl.GL45.glGetNamedFramebufferParameteriv(framebuffer, pname, params);
    }

    @Override public void glGetNamedFramebufferParameteriv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengl.GL45.glGetNamedFramebufferParameteriv(framebuffer, pname, params);
    }

@NativeType("void")
    @Override public int glGetNamedFramebufferParameteri(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL45.glGetNamedFramebufferParameteri(framebuffer, pname);
    }

    @Override public void nglGetNamedFramebufferAttachmentParameteriv(int framebuffer, int attachment, int pname, long params) {
        org.lwjgl.opengl.GL45.nglGetNamedFramebufferAttachmentParameteriv(framebuffer, attachment, pname, params);
    }

    @Override public void glGetNamedFramebufferAttachmentParameteriv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengl.GL45.glGetNamedFramebufferAttachmentParameteriv(framebuffer, attachment, pname, params);
    }

    @Override public void glGetNamedFramebufferAttachmentParameteriv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengl.GL45.glGetNamedFramebufferAttachmentParameteriv(framebuffer, attachment, pname, params);
    }

@NativeType("void")
    @Override public int glGetNamedFramebufferAttachmentParameteri(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL45.glGetNamedFramebufferAttachmentParameteri(framebuffer, attachment, pname);
    }

    @Override public void nglCreateRenderbuffers(int n, long renderbuffers) {
        org.lwjgl.opengl.GL45.nglCreateRenderbuffers(n, renderbuffers);
    }

    @Override public void glCreateRenderbuffers(@NativeType("GLuint *") IntBuffer renderbuffers) {
        org.lwjgl.opengl.GL45.glCreateRenderbuffers(renderbuffers);
    }

@NativeType("void")
    @Override public int glCreateRenderbuffers() {
        return org.lwjgl.opengl.GL45.glCreateRenderbuffers();
    }

    @Override public void glCreateRenderbuffers(@NativeType("GLuint *") int[] renderbuffers) {
        org.lwjgl.opengl.GL45.glCreateRenderbuffers(renderbuffers);
    }

    @Override public void glNamedRenderbufferStorage(@NativeType("GLuint") int renderbuffer, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        org.lwjgl.opengl.GL45.glNamedRenderbufferStorage(renderbuffer, internalformat, width, height);
    }

    @Override public void glNamedRenderbufferStorageMultisample(@NativeType("GLuint") int renderbuffer, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        org.lwjgl.opengl.GL45.glNamedRenderbufferStorageMultisample(renderbuffer, samples, internalformat, width, height);
    }

    @Override public void nglGetNamedRenderbufferParameteriv(int renderbuffer, int pname, long params) {
        org.lwjgl.opengl.GL45.nglGetNamedRenderbufferParameteriv(renderbuffer, pname, params);
    }

    @Override public void glGetNamedRenderbufferParameteriv(@NativeType("GLuint") int renderbuffer, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengl.GL45.glGetNamedRenderbufferParameteriv(renderbuffer, pname, params);
    }

    @Override public void glGetNamedRenderbufferParameteriv(@NativeType("GLuint") int renderbuffer, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengl.GL45.glGetNamedRenderbufferParameteriv(renderbuffer, pname, params);
    }

@NativeType("void")
    @Override public int glGetNamedRenderbufferParameteri(@NativeType("GLuint") int renderbuffer, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL45.glGetNamedRenderbufferParameteri(renderbuffer, pname);
    }

    @Override public void nglCreateTextures(int target, int n, long textures) {
        org.lwjgl.opengl.GL45.nglCreateTextures(target, n, textures);
    }

    @Override public void glCreateTextures(@NativeType("GLenum") int target, @NativeType("GLuint *") IntBuffer textures) {
        org.lwjgl.opengl.GL45.glCreateTextures(target, textures);
    }

@NativeType("void")
    @Override public int glCreateTextures(@NativeType("GLenum") int target) {
        return org.lwjgl.opengl.GL45.glCreateTextures(target);
    }

    @Override public void glCreateTextures(@NativeType("GLenum") int target, @NativeType("GLuint *") int[] textures) {
        org.lwjgl.opengl.GL45.glCreateTextures(target, textures);
    }

    @Override public void glTextureBuffer(@NativeType("GLuint") int texture, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int buffer) {
        org.lwjgl.opengl.GL45.glTextureBuffer(texture, internalformat, buffer);
    }

    @Override public void glTextureBufferRange(@NativeType("GLuint") int texture, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size) {
        org.lwjgl.opengl.GL45.glTextureBufferRange(texture, internalformat, buffer, offset, size);
    }

    @Override public void glTextureStorage1D(@NativeType("GLuint") int texture, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width) {
        org.lwjgl.opengl.GL45.glTextureStorage1D(texture, levels, internalformat, width);
    }

    @Override public void glTextureStorage2D(@NativeType("GLuint") int texture, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        org.lwjgl.opengl.GL45.glTextureStorage2D(texture, levels, internalformat, width, height);
    }

    @Override public void glTextureStorage3D(@NativeType("GLuint") int texture, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth) {
        org.lwjgl.opengl.GL45.glTextureStorage3D(texture, levels, internalformat, width, height, depth);
    }

    @Override public void glTextureStorage2DMultisample(@NativeType("GLuint") int texture, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLboolean") boolean fixedsamplelocations) {
        org.lwjgl.opengl.GL45.glTextureStorage2DMultisample(texture, samples, internalformat, width, height, fixedsamplelocations);
    }

    @Override public void glTextureStorage3DMultisample(@NativeType("GLuint") int texture, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLboolean") boolean fixedsamplelocations) {
        org.lwjgl.opengl.GL45.glTextureStorage3DMultisample(texture, samples, internalformat, width, height, depth, fixedsamplelocations);
    }

    @Override public void nglTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, long pixels) {
        org.lwjgl.opengl.GL45.nglTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    @Override public void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    @Override public void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    @Override public void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    @Override public void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    @Override public void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    @Override public void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") DoubleBuffer pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    @Override public void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    @Override public void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    @Override public void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    @Override public void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") double[] pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    @Override public void nglTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels) {
        org.lwjgl.opengl.GL45.nglTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") DoubleBuffer pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") double[] pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void nglTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels) {
        org.lwjgl.opengl.GL45.nglTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") DoubleBuffer pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") double[] pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void nglCompressedTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int imageSize, long data) {
        org.lwjgl.opengl.GL45.nglCompressedTextureSubImage1D(texture, level, xoffset, width, format, imageSize, data);
    }

    @Override public void glCompressedTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        org.lwjgl.opengl.GL45.glCompressedTextureSubImage1D(texture, level, xoffset, width, format, imageSize, data);
    }

    @Override public void glCompressedTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer data) {
        org.lwjgl.opengl.GL45.glCompressedTextureSubImage1D(texture, level, xoffset, width, format, data);
    }

    @Override public void nglCompressedTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data) {
        org.lwjgl.opengl.GL45.nglCompressedTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, imageSize, data);
    }

    @Override public void glCompressedTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        org.lwjgl.opengl.GL45.glCompressedTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, imageSize, data);
    }

    @Override public void glCompressedTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer data) {
        org.lwjgl.opengl.GL45.glCompressedTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, data);
    }

    @Override public void nglCompressedTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data) {
        org.lwjgl.opengl.GL45.nglCompressedTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
    }

    @Override public void glCompressedTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        org.lwjgl.opengl.GL45.glCompressedTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
    }

    @Override public void glCompressedTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer data) {
        org.lwjgl.opengl.GL45.glCompressedTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, data);
    }

    @Override public void glCopyTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width) {
        org.lwjgl.opengl.GL45.glCopyTextureSubImage1D(texture, level, xoffset, x, y, width);
    }

    @Override public void glCopyTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        org.lwjgl.opengl.GL45.glCopyTextureSubImage2D(texture, level, xoffset, yoffset, x, y, width, height);
    }

    @Override public void glCopyTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        org.lwjgl.opengl.GL45.glCopyTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, x, y, width, height);
    }

    @Override public void glTextureParameterf(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param) {
        org.lwjgl.opengl.GL45.glTextureParameterf(texture, pname, param);
    }

    @Override public void nglTextureParameterfv(int texture, int pname, long params) {
        org.lwjgl.opengl.GL45.nglTextureParameterfv(texture, pname, params);
    }

    @Override public void glTextureParameterfv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params) {
        org.lwjgl.opengl.GL45.glTextureParameterfv(texture, pname, params);
    }

    @Override public void glTextureParameterfv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] params) {
        org.lwjgl.opengl.GL45.glTextureParameterfv(texture, pname, params);
    }

    @Override public void glTextureParameteri(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        org.lwjgl.opengl.GL45.glTextureParameteri(texture, pname, param);
    }

    @Override public void nglTextureParameterIiv(int texture, int pname, long params) {
        org.lwjgl.opengl.GL45.nglTextureParameterIiv(texture, pname, params);
    }

    @Override public void glTextureParameterIiv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        org.lwjgl.opengl.GL45.glTextureParameterIiv(texture, pname, params);
    }

    @Override public void glTextureParameterIiv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        org.lwjgl.opengl.GL45.glTextureParameterIiv(texture, pname, params);
    }

    @Override public void glTextureParameterIi(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint const *") int param) {
        org.lwjgl.opengl.GL45.glTextureParameterIi(texture, pname, param);
    }

    @Override public void nglTextureParameterIuiv(int texture, int pname, long params) {
        org.lwjgl.opengl.GL45.nglTextureParameterIuiv(texture, pname, params);
    }

    @Override public void glTextureParameterIuiv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLuint const *") IntBuffer params) {
        org.lwjgl.opengl.GL45.glTextureParameterIuiv(texture, pname, params);
    }

    @Override public void glTextureParameterIuiv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLuint const *") int[] params) {
        org.lwjgl.opengl.GL45.glTextureParameterIuiv(texture, pname, params);
    }

    @Override public void glTextureParameterIui(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLuint const *") int param) {
        org.lwjgl.opengl.GL45.glTextureParameterIui(texture, pname, param);
    }

    @Override public void nglTextureParameteriv(int texture, int pname, long params) {
        org.lwjgl.opengl.GL45.nglTextureParameteriv(texture, pname, params);
    }

    @Override public void glTextureParameteriv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        org.lwjgl.opengl.GL45.glTextureParameteriv(texture, pname, params);
    }

    @Override public void glTextureParameteriv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        org.lwjgl.opengl.GL45.glTextureParameteriv(texture, pname, params);
    }

    @Override public void glGenerateTextureMipmap(@NativeType("GLuint") int texture) {
        org.lwjgl.opengl.GL45.glGenerateTextureMipmap(texture);
    }

    @Override public void glBindTextureUnit(@NativeType("GLuint") int unit, @NativeType("GLuint") int texture) {
        org.lwjgl.opengl.GL45.glBindTextureUnit(unit, texture);
    }

    @Override public void nglGetTextureImage(int texture, int level, int format, int type, int bufSize, long pixels) {
        org.lwjgl.opengl.GL45.nglGetTextureImage(texture, level, format, type, bufSize, pixels);
    }

    @Override public void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int bufSize, @NativeType("void *") long pixels) {
        org.lwjgl.opengl.GL45.glGetTextureImage(texture, level, format, type, bufSize, pixels);
    }

    @Override public void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetTextureImage(texture, level, format, type, pixels);
    }

    @Override public void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ShortBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetTextureImage(texture, level, format, type, pixels);
    }

    @Override public void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") IntBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetTextureImage(texture, level, format, type, pixels);
    }

    @Override public void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") FloatBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetTextureImage(texture, level, format, type, pixels);
    }

    @Override public void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") DoubleBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetTextureImage(texture, level, format, type, pixels);
    }

    @Override public void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") short[] pixels) {
        org.lwjgl.opengl.GL45.glGetTextureImage(texture, level, format, type, pixels);
    }

    @Override public void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") int[] pixels) {
        org.lwjgl.opengl.GL45.glGetTextureImage(texture, level, format, type, pixels);
    }

    @Override public void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") float[] pixels) {
        org.lwjgl.opengl.GL45.glGetTextureImage(texture, level, format, type, pixels);
    }

    @Override public void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") double[] pixels) {
        org.lwjgl.opengl.GL45.glGetTextureImage(texture, level, format, type, pixels);
    }

    @Override public void nglGetCompressedTextureImage(int texture, int level, int bufSize, long pixels) {
        org.lwjgl.opengl.GL45.nglGetCompressedTextureImage(texture, level, bufSize, pixels);
    }

    @Override public void glGetCompressedTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLsizei") int bufSize, @NativeType("void *") long pixels) {
        org.lwjgl.opengl.GL45.glGetCompressedTextureImage(texture, level, bufSize, pixels);
    }

    @Override public void glGetCompressedTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("void *") ByteBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetCompressedTextureImage(texture, level, pixels);
    }

    @Override public void nglGetTextureLevelParameterfv(int texture, int level, int pname, long params) {
        org.lwjgl.opengl.GL45.nglGetTextureLevelParameterfv(texture, level, pname, params);
    }

    @Override public void glGetTextureLevelParameterfv(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        org.lwjgl.opengl.GL45.glGetTextureLevelParameterfv(texture, level, pname, params);
    }

    @Override public void glGetTextureLevelParameterfv(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        org.lwjgl.opengl.GL45.glGetTextureLevelParameterfv(texture, level, pname, params);
    }

@NativeType("void")
    @Override public float glGetTextureLevelParameterf(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL45.glGetTextureLevelParameterf(texture, level, pname);
    }

    @Override public void nglGetTextureLevelParameteriv(int texture, int level, int pname, long params) {
        org.lwjgl.opengl.GL45.nglGetTextureLevelParameteriv(texture, level, pname, params);
    }

    @Override public void glGetTextureLevelParameteriv(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengl.GL45.glGetTextureLevelParameteriv(texture, level, pname, params);
    }

    @Override public void glGetTextureLevelParameteriv(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengl.GL45.glGetTextureLevelParameteriv(texture, level, pname, params);
    }

@NativeType("void")
    @Override public int glGetTextureLevelParameteri(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL45.glGetTextureLevelParameteri(texture, level, pname);
    }

    @Override public void nglGetTextureParameterfv(int texture, int pname, long params) {
        org.lwjgl.opengl.GL45.nglGetTextureParameterfv(texture, pname, params);
    }

    @Override public void glGetTextureParameterfv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        org.lwjgl.opengl.GL45.glGetTextureParameterfv(texture, pname, params);
    }

    @Override public void glGetTextureParameterfv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        org.lwjgl.opengl.GL45.glGetTextureParameterfv(texture, pname, params);
    }

@NativeType("void")
    @Override public float glGetTextureParameterf(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL45.glGetTextureParameterf(texture, pname);
    }

    @Override public void nglGetTextureParameterIiv(int texture, int pname, long params) {
        org.lwjgl.opengl.GL45.nglGetTextureParameterIiv(texture, pname, params);
    }

    @Override public void glGetTextureParameterIiv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengl.GL45.glGetTextureParameterIiv(texture, pname, params);
    }

    @Override public void glGetTextureParameterIiv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengl.GL45.glGetTextureParameterIiv(texture, pname, params);
    }

@NativeType("void")
    @Override public int glGetTextureParameterIi(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL45.glGetTextureParameterIi(texture, pname);
    }

    @Override public void nglGetTextureParameterIuiv(int texture, int pname, long params) {
        org.lwjgl.opengl.GL45.nglGetTextureParameterIuiv(texture, pname, params);
    }

    @Override public void glGetTextureParameterIuiv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        org.lwjgl.opengl.GL45.glGetTextureParameterIuiv(texture, pname, params);
    }

    @Override public void glGetTextureParameterIuiv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        org.lwjgl.opengl.GL45.glGetTextureParameterIuiv(texture, pname, params);
    }

@NativeType("void")
    @Override public int glGetTextureParameterIui(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL45.glGetTextureParameterIui(texture, pname);
    }

    @Override public void nglGetTextureParameteriv(int texture, int pname, long params) {
        org.lwjgl.opengl.GL45.nglGetTextureParameteriv(texture, pname, params);
    }

    @Override public void glGetTextureParameteriv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengl.GL45.glGetTextureParameteriv(texture, pname, params);
    }

    @Override public void glGetTextureParameteriv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengl.GL45.glGetTextureParameteriv(texture, pname, params);
    }

@NativeType("void")
    @Override public int glGetTextureParameteri(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL45.glGetTextureParameteri(texture, pname);
    }

    @Override public void nglCreateVertexArrays(int n, long arrays) {
        org.lwjgl.opengl.GL45.nglCreateVertexArrays(n, arrays);
    }

    @Override public void glCreateVertexArrays(@NativeType("GLuint *") IntBuffer arrays) {
        org.lwjgl.opengl.GL45.glCreateVertexArrays(arrays);
    }

@NativeType("void")
    @Override public int glCreateVertexArrays() {
        return org.lwjgl.opengl.GL45.glCreateVertexArrays();
    }

    @Override public void glCreateVertexArrays(@NativeType("GLuint *") int[] arrays) {
        org.lwjgl.opengl.GL45.glCreateVertexArrays(arrays);
    }

    @Override public void glDisableVertexArrayAttrib(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index) {
        org.lwjgl.opengl.GL45.glDisableVertexArrayAttrib(vaobj, index);
    }

    @Override public void glEnableVertexArrayAttrib(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index) {
        org.lwjgl.opengl.GL45.glEnableVertexArrayAttrib(vaobj, index);
    }

    @Override public void glVertexArrayElementBuffer(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int buffer) {
        org.lwjgl.opengl.GL45.glVertexArrayElementBuffer(vaobj, buffer);
    }

    @Override public void glVertexArrayVertexBuffer(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int bindingindex, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizei") int stride) {
        org.lwjgl.opengl.GL45.glVertexArrayVertexBuffer(vaobj, bindingindex, buffer, offset, stride);
    }

    @Override public void nglVertexArrayVertexBuffers(int vaobj, int first, int count, long buffers, long offsets, long strides) {
        org.lwjgl.opengl.GL45.nglVertexArrayVertexBuffers(vaobj, first, count, buffers, offsets, strides);
    }

    @Override public void glVertexArrayVertexBuffers(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int first, @Nullable @NativeType("GLuint const *") IntBuffer buffers, @Nullable @NativeType("GLintptr const *") PointerBuffer offsets, @Nullable @NativeType("GLsizei const *") IntBuffer strides) {
        org.lwjgl.opengl.GL45.glVertexArrayVertexBuffers(vaobj, first, buffers, offsets, strides);
    }

    @Override public void glVertexArrayVertexBuffers(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int first, @Nullable @NativeType("GLuint const *") int[] buffers, @Nullable @NativeType("GLintptr const *") PointerBuffer offsets, @Nullable @NativeType("GLsizei const *") int[] strides) {
        org.lwjgl.opengl.GL45.glVertexArrayVertexBuffers(vaobj, first, buffers, offsets, strides);
    }

    @Override public void glVertexArrayAttribFormat(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int attribindex, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int relativeoffset) {
        org.lwjgl.opengl.GL45.glVertexArrayAttribFormat(vaobj, attribindex, size, type, normalized, relativeoffset);
    }

    @Override public void glVertexArrayAttribIFormat(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int attribindex, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLuint") int relativeoffset) {
        org.lwjgl.opengl.GL45.glVertexArrayAttribIFormat(vaobj, attribindex, size, type, relativeoffset);
    }

    @Override public void glVertexArrayAttribLFormat(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int attribindex, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLuint") int relativeoffset) {
        org.lwjgl.opengl.GL45.glVertexArrayAttribLFormat(vaobj, attribindex, size, type, relativeoffset);
    }

    @Override public void glVertexArrayAttribBinding(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int attribindex, @NativeType("GLuint") int bindingindex) {
        org.lwjgl.opengl.GL45.glVertexArrayAttribBinding(vaobj, attribindex, bindingindex);
    }

    @Override public void glVertexArrayBindingDivisor(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int bindingindex, @NativeType("GLuint") int divisor) {
        org.lwjgl.opengl.GL45.glVertexArrayBindingDivisor(vaobj, bindingindex, divisor);
    }

    @Override public void nglGetVertexArrayiv(int vaobj, int pname, long param) {
        org.lwjgl.opengl.GL45.nglGetVertexArrayiv(vaobj, pname, param);
    }

    @Override public void glGetVertexArrayiv(@NativeType("GLuint") int vaobj, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer param) {
        org.lwjgl.opengl.GL45.glGetVertexArrayiv(vaobj, pname, param);
    }

    @Override public void glGetVertexArrayiv(@NativeType("GLuint") int vaobj, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] param) {
        org.lwjgl.opengl.GL45.glGetVertexArrayiv(vaobj, pname, param);
    }

@NativeType("void")
    @Override public int glGetVertexArrayi(@NativeType("GLuint") int vaobj, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL45.glGetVertexArrayi(vaobj, pname);
    }

    @Override public void nglGetVertexArrayIndexediv(int vaobj, int index, int pname, long param) {
        org.lwjgl.opengl.GL45.nglGetVertexArrayIndexediv(vaobj, index, pname, param);
    }

    @Override public void glGetVertexArrayIndexediv(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer param) {
        org.lwjgl.opengl.GL45.glGetVertexArrayIndexediv(vaobj, index, pname, param);
    }

    @Override public void glGetVertexArrayIndexediv(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] param) {
        org.lwjgl.opengl.GL45.glGetVertexArrayIndexediv(vaobj, index, pname, param);
    }

@NativeType("void")
    @Override public int glGetVertexArrayIndexedi(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL45.glGetVertexArrayIndexedi(vaobj, index, pname);
    }

    @Override public void nglGetVertexArrayIndexed64iv(int vaobj, int index, int pname, long param) {
        org.lwjgl.opengl.GL45.nglGetVertexArrayIndexed64iv(vaobj, index, pname, param);
    }

    @Override public void glGetVertexArrayIndexed64iv(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint64 *") LongBuffer param) {
        org.lwjgl.opengl.GL45.glGetVertexArrayIndexed64iv(vaobj, index, pname, param);
    }

    @Override public void glGetVertexArrayIndexed64iv(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint64 *") long[] param) {
        org.lwjgl.opengl.GL45.glGetVertexArrayIndexed64iv(vaobj, index, pname, param);
    }

@NativeType("void")
    @Override public long glGetVertexArrayIndexed64i(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL45.glGetVertexArrayIndexed64i(vaobj, index, pname);
    }

    @Override public void nglCreateSamplers(int n, long samplers) {
        org.lwjgl.opengl.GL45.nglCreateSamplers(n, samplers);
    }

    @Override public void glCreateSamplers(@NativeType("GLuint *") IntBuffer samplers) {
        org.lwjgl.opengl.GL45.glCreateSamplers(samplers);
    }

@NativeType("void")
    @Override public int glCreateSamplers() {
        return org.lwjgl.opengl.GL45.glCreateSamplers();
    }

    @Override public void glCreateSamplers(@NativeType("GLuint *") int[] samplers) {
        org.lwjgl.opengl.GL45.glCreateSamplers(samplers);
    }

    @Override public void nglCreateProgramPipelines(int n, long pipelines) {
        org.lwjgl.opengl.GL45.nglCreateProgramPipelines(n, pipelines);
    }

    @Override public void glCreateProgramPipelines(@NativeType("GLuint *") IntBuffer pipelines) {
        org.lwjgl.opengl.GL45.glCreateProgramPipelines(pipelines);
    }

@NativeType("void")
    @Override public int glCreateProgramPipelines() {
        return org.lwjgl.opengl.GL45.glCreateProgramPipelines();
    }

    @Override public void glCreateProgramPipelines(@NativeType("GLuint *") int[] pipelines) {
        org.lwjgl.opengl.GL45.glCreateProgramPipelines(pipelines);
    }

    @Override public void nglCreateQueries(int target, int n, long ids) {
        org.lwjgl.opengl.GL45.nglCreateQueries(target, n, ids);
    }

    @Override public void glCreateQueries(@NativeType("GLenum") int target, @NativeType("GLuint *") IntBuffer ids) {
        org.lwjgl.opengl.GL45.glCreateQueries(target, ids);
    }

@NativeType("void")
    @Override public int glCreateQueries(@NativeType("GLenum") int target) {
        return org.lwjgl.opengl.GL45.glCreateQueries(target);
    }

    @Override public void glCreateQueries(@NativeType("GLenum") int target, @NativeType("GLuint *") int[] ids) {
        org.lwjgl.opengl.GL45.glCreateQueries(target, ids);
    }

    @Override public void glGetQueryBufferObjectiv(@NativeType("GLuint") int id, @NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLintptr") long offset) {
        org.lwjgl.opengl.GL45.glGetQueryBufferObjectiv(id, buffer, pname, offset);
    }

    @Override public void glGetQueryBufferObjectuiv(@NativeType("GLuint") int id, @NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLintptr") long offset) {
        org.lwjgl.opengl.GL45.glGetQueryBufferObjectuiv(id, buffer, pname, offset);
    }

    @Override public void glGetQueryBufferObjecti64v(@NativeType("GLuint") int id, @NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLintptr") long offset) {
        org.lwjgl.opengl.GL45.glGetQueryBufferObjecti64v(id, buffer, pname, offset);
    }

    @Override public void glGetQueryBufferObjectui64v(@NativeType("GLuint") int id, @NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLintptr") long offset) {
        org.lwjgl.opengl.GL45.glGetQueryBufferObjectui64v(id, buffer, pname, offset);
    }

    @Override public void glMemoryBarrierByRegion(@NativeType("GLbitfield") int barriers) {
        org.lwjgl.opengl.GL45.glMemoryBarrierByRegion(barriers);
    }

    @Override public void nglGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int bufSize, long pixels) {
        org.lwjgl.opengl.GL45.nglGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, bufSize, pixels);
    }

    @Override public void glGetTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int bufSize, @NativeType("void *") long pixels) {
        org.lwjgl.opengl.GL45.glGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, bufSize, pixels);
    }

    @Override public void glGetTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glGetTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ShortBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glGetTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") IntBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glGetTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") FloatBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glGetTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") DoubleBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glGetTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") short[] pixels) {
        org.lwjgl.opengl.GL45.glGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glGetTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") int[] pixels) {
        org.lwjgl.opengl.GL45.glGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glGetTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") float[] pixels) {
        org.lwjgl.opengl.GL45.glGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glGetTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") double[] pixels) {
        org.lwjgl.opengl.GL45.glGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void nglGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int bufSize, long pixels) {
        org.lwjgl.opengl.GL45.nglGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, bufSize, pixels);
    }

    @Override public void glGetCompressedTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLsizei") int bufSize, @NativeType("void *") long pixels) {
        org.lwjgl.opengl.GL45.glGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, bufSize, pixels);
    }

    @Override public void glGetCompressedTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("void *") ByteBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels);
    }

    @Override public void glGetCompressedTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("void *") ShortBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels);
    }

    @Override public void glGetCompressedTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("void *") IntBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels);
    }

    @Override public void glGetCompressedTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("void *") FloatBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels);
    }

    @Override public void glGetCompressedTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("void *") DoubleBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels);
    }

    @Override public void glGetCompressedTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("void *") short[] pixels) {
        org.lwjgl.opengl.GL45.glGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels);
    }

    @Override public void glGetCompressedTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("void *") int[] pixels) {
        org.lwjgl.opengl.GL45.glGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels);
    }

    @Override public void glGetCompressedTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("void *") float[] pixels) {
        org.lwjgl.opengl.GL45.glGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels);
    }

    @Override public void glGetCompressedTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("void *") double[] pixels) {
        org.lwjgl.opengl.GL45.glGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels);
    }

    @Override public void glTextureBarrier() {
        org.lwjgl.opengl.GL45.glTextureBarrier();
    }

@NativeType("GLenum")
    @Override public int glGetGraphicsResetStatus() {
        return org.lwjgl.opengl.GL45.glGetGraphicsResetStatus();
    }

    @Override public void nglGetnMapdv(int target, int query, int bufSize, long data) {
        org.lwjgl.opengl.GL45.nglGetnMapdv(target, query, bufSize, data);
    }

    @Override public void glGetnMapdv(@NativeType("GLenum") int target, @NativeType("GLenum") int query, @NativeType("GLdouble *") DoubleBuffer data) {
        org.lwjgl.opengl.GL45.glGetnMapdv(target, query, data);
    }

    @Override public void glGetnMapdv(@NativeType("GLenum") int target, @NativeType("GLenum") int query, @NativeType("GLdouble *") double[] data) {
        org.lwjgl.opengl.GL45.glGetnMapdv(target, query, data);
    }

@NativeType("void")
    @Override public double glGetnMapd(@NativeType("GLenum") int target, @NativeType("GLenum") int query) {
        return org.lwjgl.opengl.GL45.glGetnMapd(target, query);
    }

    @Override public void nglGetnMapfv(int target, int query, int bufSize, long data) {
        org.lwjgl.opengl.GL45.nglGetnMapfv(target, query, bufSize, data);
    }

    @Override public void glGetnMapfv(@NativeType("GLenum") int target, @NativeType("GLenum") int query, @NativeType("GLfloat *") FloatBuffer data) {
        org.lwjgl.opengl.GL45.glGetnMapfv(target, query, data);
    }

    @Override public void glGetnMapfv(@NativeType("GLenum") int target, @NativeType("GLenum") int query, @NativeType("GLfloat *") float[] data) {
        org.lwjgl.opengl.GL45.glGetnMapfv(target, query, data);
    }

@NativeType("void")
    @Override public float glGetnMapf(@NativeType("GLenum") int target, @NativeType("GLenum") int query) {
        return org.lwjgl.opengl.GL45.glGetnMapf(target, query);
    }

    @Override public void nglGetnMapiv(int target, int query, int bufSize, long data) {
        org.lwjgl.opengl.GL45.nglGetnMapiv(target, query, bufSize, data);
    }

    @Override public void glGetnMapiv(@NativeType("GLenum") int target, @NativeType("GLenum") int query, @NativeType("GLint *") IntBuffer data) {
        org.lwjgl.opengl.GL45.glGetnMapiv(target, query, data);
    }

    @Override public void glGetnMapiv(@NativeType("GLenum") int target, @NativeType("GLenum") int query, @NativeType("GLint *") int[] data) {
        org.lwjgl.opengl.GL45.glGetnMapiv(target, query, data);
    }

@NativeType("void")
    @Override public int glGetnMapi(@NativeType("GLenum") int target, @NativeType("GLenum") int query) {
        return org.lwjgl.opengl.GL45.glGetnMapi(target, query);
    }

    @Override public void nglGetnPixelMapfv(int map, int bufSize, long data) {
        org.lwjgl.opengl.GL45.nglGetnPixelMapfv(map, bufSize, data);
    }

    @Override public void glGetnPixelMapfv(@NativeType("GLenum") int map, @NativeType("GLfloat *") FloatBuffer data) {
        org.lwjgl.opengl.GL45.glGetnPixelMapfv(map, data);
    }

    @Override public void glGetnPixelMapfv(@NativeType("GLenum") int map, @NativeType("GLfloat *") float[] data) {
        org.lwjgl.opengl.GL45.glGetnPixelMapfv(map, data);
    }

    @Override public void nglGetnPixelMapuiv(int map, int bufSize, long data) {
        org.lwjgl.opengl.GL45.nglGetnPixelMapuiv(map, bufSize, data);
    }

    @Override public void glGetnPixelMapuiv(@NativeType("GLenum") int map, @NativeType("GLuint *") IntBuffer data) {
        org.lwjgl.opengl.GL45.glGetnPixelMapuiv(map, data);
    }

    @Override public void glGetnPixelMapuiv(@NativeType("GLenum") int map, @NativeType("GLuint *") int[] data) {
        org.lwjgl.opengl.GL45.glGetnPixelMapuiv(map, data);
    }

    @Override public void nglGetnPixelMapusv(int map, int bufSize, long data) {
        org.lwjgl.opengl.GL45.nglGetnPixelMapusv(map, bufSize, data);
    }

    @Override public void glGetnPixelMapusv(@NativeType("GLenum") int map, @NativeType("GLushort *") ShortBuffer data) {
        org.lwjgl.opengl.GL45.glGetnPixelMapusv(map, data);
    }

    @Override public void glGetnPixelMapusv(@NativeType("GLenum") int map, @NativeType("GLushort *") short[] data) {
        org.lwjgl.opengl.GL45.glGetnPixelMapusv(map, data);
    }

    @Override public void nglGetnPolygonStipple(int bufSize, long pattern) {
        org.lwjgl.opengl.GL45.nglGetnPolygonStipple(bufSize, pattern);
    }

    @Override public void glGetnPolygonStipple(@NativeType("GLsizei") int bufSize, @NativeType("GLubyte *") long pattern) {
        org.lwjgl.opengl.GL45.glGetnPolygonStipple(bufSize, pattern);
    }

    @Override public void glGetnPolygonStipple(@NativeType("GLubyte *") ByteBuffer pattern) {
        org.lwjgl.opengl.GL45.glGetnPolygonStipple(pattern);
    }

    @Override public void nglGetnTexImage(int tex, int level, int format, int type, int bufSize, long img) {
        org.lwjgl.opengl.GL45.nglGetnTexImage(tex, level, format, type, bufSize, img);
    }

    @Override public void glGetnTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int bufSize, @NativeType("void *") long img) {
        org.lwjgl.opengl.GL45.glGetnTexImage(tex, level, format, type, bufSize, img);
    }

    @Override public void glGetnTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer img) {
        org.lwjgl.opengl.GL45.glGetnTexImage(tex, level, format, type, img);
    }

    @Override public void glGetnTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ShortBuffer img) {
        org.lwjgl.opengl.GL45.glGetnTexImage(tex, level, format, type, img);
    }

    @Override public void glGetnTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") IntBuffer img) {
        org.lwjgl.opengl.GL45.glGetnTexImage(tex, level, format, type, img);
    }

    @Override public void glGetnTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") FloatBuffer img) {
        org.lwjgl.opengl.GL45.glGetnTexImage(tex, level, format, type, img);
    }

    @Override public void glGetnTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") DoubleBuffer img) {
        org.lwjgl.opengl.GL45.glGetnTexImage(tex, level, format, type, img);
    }

    @Override public void glGetnTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") short[] img) {
        org.lwjgl.opengl.GL45.glGetnTexImage(tex, level, format, type, img);
    }

    @Override public void glGetnTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") int[] img) {
        org.lwjgl.opengl.GL45.glGetnTexImage(tex, level, format, type, img);
    }

    @Override public void glGetnTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") float[] img) {
        org.lwjgl.opengl.GL45.glGetnTexImage(tex, level, format, type, img);
    }

    @Override public void glGetnTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") double[] img) {
        org.lwjgl.opengl.GL45.glGetnTexImage(tex, level, format, type, img);
    }

    @Override public void nglReadnPixels(int x, int y, int width, int height, int format, int type, int bufSize, long pixels) {
        org.lwjgl.opengl.GL45.nglReadnPixels(x, y, width, height, format, type, bufSize, pixels);
    }

    @Override public void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int bufSize, @NativeType("void *") long pixels) {
        org.lwjgl.opengl.GL45.glReadnPixels(x, y, width, height, format, type, bufSize, pixels);
    }

    @Override public void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer pixels) {
        org.lwjgl.opengl.GL45.glReadnPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ShortBuffer pixels) {
        org.lwjgl.opengl.GL45.glReadnPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") IntBuffer pixels) {
        org.lwjgl.opengl.GL45.glReadnPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") FloatBuffer pixels) {
        org.lwjgl.opengl.GL45.glReadnPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") short[] pixels) {
        org.lwjgl.opengl.GL45.glReadnPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") int[] pixels) {
        org.lwjgl.opengl.GL45.glReadnPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") float[] pixels) {
        org.lwjgl.opengl.GL45.glReadnPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void nglGetnColorTable(int target, int format, int type, int bufSize, long table) {
        org.lwjgl.opengl.GL45.nglGetnColorTable(target, format, type, bufSize, table);
    }

    @Override public void glGetnColorTable(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int bufSize, @NativeType("void *") long table) {
        org.lwjgl.opengl.GL45.glGetnColorTable(target, format, type, bufSize, table);
    }

    @Override public void glGetnColorTable(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer table) {
        org.lwjgl.opengl.GL45.glGetnColorTable(target, format, type, table);
    }

    @Override public void glGetnColorTable(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ShortBuffer table) {
        org.lwjgl.opengl.GL45.glGetnColorTable(target, format, type, table);
    }

    @Override public void glGetnColorTable(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") IntBuffer table) {
        org.lwjgl.opengl.GL45.glGetnColorTable(target, format, type, table);
    }

    @Override public void glGetnColorTable(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") FloatBuffer table) {
        org.lwjgl.opengl.GL45.glGetnColorTable(target, format, type, table);
    }

    @Override public void glGetnColorTable(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") short[] table) {
        org.lwjgl.opengl.GL45.glGetnColorTable(target, format, type, table);
    }

    @Override public void glGetnColorTable(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") int[] table) {
        org.lwjgl.opengl.GL45.glGetnColorTable(target, format, type, table);
    }

    @Override public void glGetnColorTable(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") float[] table) {
        org.lwjgl.opengl.GL45.glGetnColorTable(target, format, type, table);
    }

    @Override public void nglGetnConvolutionFilter(int target, int format, int type, int bufSize, long image) {
        org.lwjgl.opengl.GL45.nglGetnConvolutionFilter(target, format, type, bufSize, image);
    }

    @Override public void glGetnConvolutionFilter(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int bufSize, @NativeType("void *") long image) {
        org.lwjgl.opengl.GL45.glGetnConvolutionFilter(target, format, type, bufSize, image);
    }

    @Override public void glGetnConvolutionFilter(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer image) {
        org.lwjgl.opengl.GL45.glGetnConvolutionFilter(target, format, type, image);
    }

    @Override public void nglGetnSeparableFilter(int target, int format, int type, int rowBufSize, long row, int columnBufSize, long column, long span) {
        org.lwjgl.opengl.GL45.nglGetnSeparableFilter(target, format, type, rowBufSize, row, columnBufSize, column, span);
    }

    @Override public void glGetnSeparableFilter(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int rowBufSize, @NativeType("void *") long row, @NativeType("GLsizei") int columnBufSize, @NativeType("void *") long column, @Nullable @NativeType("void *") ByteBuffer span) {
        org.lwjgl.opengl.GL45.glGetnSeparableFilter(target, format, type, rowBufSize, row, columnBufSize, column, span);
    }

    @Override public void glGetnSeparableFilter(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer row, @NativeType("void *") ByteBuffer column, @Nullable @NativeType("void *") ByteBuffer span) {
        org.lwjgl.opengl.GL45.glGetnSeparableFilter(target, format, type, row, column, span);
    }

    @Override public void nglGetnHistogram(int target, boolean reset, int format, int type, int bufSize, long values) {
        org.lwjgl.opengl.GL45.nglGetnHistogram(target, reset, format, type, bufSize, values);
    }

    @Override public void glGetnHistogram(@NativeType("GLenum") int target, @NativeType("GLboolean") boolean reset, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int bufSize, @NativeType("void *") long values) {
        org.lwjgl.opengl.GL45.glGetnHistogram(target, reset, format, type, bufSize, values);
    }

    @Override public void glGetnHistogram(@NativeType("GLenum") int target, @NativeType("GLboolean") boolean reset, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer values) {
        org.lwjgl.opengl.GL45.glGetnHistogram(target, reset, format, type, values);
    }

    @Override public void nglGetnMinmax(int target, boolean reset, int format, int type, int bufSize, long values) {
        org.lwjgl.opengl.GL45.nglGetnMinmax(target, reset, format, type, bufSize, values);
    }

    @Override public void glGetnMinmax(@NativeType("GLenum") int target, @NativeType("GLboolean") boolean reset, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int bufSize, @NativeType("void *") long values) {
        org.lwjgl.opengl.GL45.glGetnMinmax(target, reset, format, type, bufSize, values);
    }

    @Override public void glGetnMinmax(@NativeType("GLenum") int target, @NativeType("GLboolean") boolean reset, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer values) {
        org.lwjgl.opengl.GL45.glGetnMinmax(target, reset, format, type, values);
    }

    @Override public void nglGetnCompressedTexImage(int target, int level, int bufSize, long img) {
        org.lwjgl.opengl.GL45.nglGetnCompressedTexImage(target, level, bufSize, img);
    }

    @Override public void glGetnCompressedTexImage(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLsizei") int bufSize, @NativeType("void *") long img) {
        org.lwjgl.opengl.GL45.glGetnCompressedTexImage(target, level, bufSize, img);
    }

    @Override public void glGetnCompressedTexImage(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("void *") ByteBuffer img) {
        org.lwjgl.opengl.GL45.glGetnCompressedTexImage(target, level, img);
    }

    @Override public void nglGetnUniformfv(int program, int location, int bufSize, long params) {
        org.lwjgl.opengl.GL45.nglGetnUniformfv(program, location, bufSize, params);
    }

    @Override public void glGetnUniformfv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") FloatBuffer params) {
        org.lwjgl.opengl.GL45.glGetnUniformfv(program, location, params);
    }

    @Override public void glGetnUniformfv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") float[] params) {
        org.lwjgl.opengl.GL45.glGetnUniformfv(program, location, params);
    }

@NativeType("void")
    @Override public float glGetnUniformf(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        return org.lwjgl.opengl.GL45.glGetnUniformf(program, location);
    }

    @Override public void nglGetnUniformdv(int program, int location, int bufSize, long params) {
        org.lwjgl.opengl.GL45.nglGetnUniformdv(program, location, bufSize, params);
    }

    @Override public void glGetnUniformdv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble *") DoubleBuffer params) {
        org.lwjgl.opengl.GL45.glGetnUniformdv(program, location, params);
    }

    @Override public void glGetnUniformdv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble *") double[] params) {
        org.lwjgl.opengl.GL45.glGetnUniformdv(program, location, params);
    }

@NativeType("void")
    @Override public double glGetnUniformd(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        return org.lwjgl.opengl.GL45.glGetnUniformd(program, location);
    }

    @Override public void nglGetnUniformiv(int program, int location, int bufSize, long params) {
        org.lwjgl.opengl.GL45.nglGetnUniformiv(program, location, bufSize, params);
    }

    @Override public void glGetnUniformiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengl.GL45.glGetnUniformiv(program, location, params);
    }

    @Override public void glGetnUniformiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengl.GL45.glGetnUniformiv(program, location, params);
    }

@NativeType("void")
    @Override public int glGetnUniformi(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        return org.lwjgl.opengl.GL45.glGetnUniformi(program, location);
    }

    @Override public void nglGetnUniformuiv(int program, int location, int bufSize, long params) {
        org.lwjgl.opengl.GL45.nglGetnUniformuiv(program, location, bufSize, params);
    }

    @Override public void glGetnUniformuiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint *") IntBuffer params) {
        org.lwjgl.opengl.GL45.glGetnUniformuiv(program, location, params);
    }

    @Override public void glGetnUniformuiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint *") int[] params) {
        org.lwjgl.opengl.GL45.glGetnUniformuiv(program, location, params);
    }

@NativeType("void")
    @Override public int glGetnUniformui(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        return org.lwjgl.opengl.GL45.glGetnUniformui(program, location);
    }

}
