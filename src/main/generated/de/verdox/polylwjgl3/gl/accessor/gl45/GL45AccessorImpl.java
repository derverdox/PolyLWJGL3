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

    @Override public void glClipControl(int origin, int depth) {
        org.lwjgl.opengl.GL45.glClipControl(origin, depth);
    }

    @Override public void nglCreateTransformFeedbacks(int n, long ids) {
        org.lwjgl.opengl.GL45.nglCreateTransformFeedbacks(n, ids);
    }

    @Override public void glCreateTransformFeedbacks(IntBuffer ids) {
        org.lwjgl.opengl.GL45.glCreateTransformFeedbacks(ids);
    }

    @Override public int glCreateTransformFeedbacks() {
        return org.lwjgl.opengl.GL45.glCreateTransformFeedbacks();
    }

    @Override public void glCreateTransformFeedbacks(int[] ids) {
        org.lwjgl.opengl.GL45.glCreateTransformFeedbacks(ids);
    }

    @Override public void glTransformFeedbackBufferBase(int xfb, int index, int buffer) {
        org.lwjgl.opengl.GL45.glTransformFeedbackBufferBase(xfb, index, buffer);
    }

    @Override public void glTransformFeedbackBufferRange(int xfb, int index, int buffer, long offset, long size) {
        org.lwjgl.opengl.GL45.glTransformFeedbackBufferRange(xfb, index, buffer, offset, size);
    }

    @Override public void nglGetTransformFeedbackiv(int xfb, int pname, long param) {
        org.lwjgl.opengl.GL45.nglGetTransformFeedbackiv(xfb, pname, param);
    }

    @Override public void glGetTransformFeedbackiv(int xfb, int pname, IntBuffer param) {
        org.lwjgl.opengl.GL45.glGetTransformFeedbackiv(xfb, pname, param);
    }

    @Override public void glGetTransformFeedbackiv(int xfb, int pname, int[] param) {
        org.lwjgl.opengl.GL45.glGetTransformFeedbackiv(xfb, pname, param);
    }

    @Override public int glGetTransformFeedbacki(int xfb, int pname) {
        return org.lwjgl.opengl.GL45.glGetTransformFeedbacki(xfb, pname);
    }

    @Override public int glGetTransformFeedbacki(int xfb, int pname, int index) {
        return org.lwjgl.opengl.GL45.glGetTransformFeedbacki(xfb, pname, index);
    }

    @Override public void nglGetTransformFeedbacki_v(int xfb, int pname, int index, long param) {
        org.lwjgl.opengl.GL45.nglGetTransformFeedbacki_v(xfb, pname, index, param);
    }

    @Override public void glGetTransformFeedbacki_v(int xfb, int pname, int index, IntBuffer param) {
        org.lwjgl.opengl.GL45.glGetTransformFeedbacki_v(xfb, pname, index, param);
    }

    @Override public void glGetTransformFeedbacki_v(int xfb, int pname, int index, int[] param) {
        org.lwjgl.opengl.GL45.glGetTransformFeedbacki_v(xfb, pname, index, param);
    }

    @Override public void nglGetTransformFeedbacki64_v(int xfb, int pname, int index, long param) {
        org.lwjgl.opengl.GL45.nglGetTransformFeedbacki64_v(xfb, pname, index, param);
    }

    @Override public void glGetTransformFeedbacki64_v(int xfb, int pname, int index, LongBuffer param) {
        org.lwjgl.opengl.GL45.glGetTransformFeedbacki64_v(xfb, pname, index, param);
    }

    @Override public void glGetTransformFeedbacki64_v(int xfb, int pname, int index, long[] param) {
        org.lwjgl.opengl.GL45.glGetTransformFeedbacki64_v(xfb, pname, index, param);
    }

    @Override public long glGetTransformFeedbacki64(int xfb, int pname, int index) {
        return org.lwjgl.opengl.GL45.glGetTransformFeedbacki64(xfb, pname, index);
    }

    @Override public void nglCreateBuffers(int n, long buffers) {
        org.lwjgl.opengl.GL45.nglCreateBuffers(n, buffers);
    }

    @Override public void glCreateBuffers(IntBuffer buffers) {
        org.lwjgl.opengl.GL45.glCreateBuffers(buffers);
    }

    @Override public int glCreateBuffers() {
        return org.lwjgl.opengl.GL45.glCreateBuffers();
    }

    @Override public void glCreateBuffers(int[] buffers) {
        org.lwjgl.opengl.GL45.glCreateBuffers(buffers);
    }

    @Override public void nglNamedBufferStorage(int buffer, long size, long data, int flags) {
        org.lwjgl.opengl.GL45.nglNamedBufferStorage(buffer, size, data, flags);
    }

    @Override public void glNamedBufferStorage(int buffer, long size, int flags) {
        org.lwjgl.opengl.GL45.glNamedBufferStorage(buffer, size, flags);
    }

    @Override public void glNamedBufferStorage(int buffer, ByteBuffer data, int flags) {
        org.lwjgl.opengl.GL45.glNamedBufferStorage(buffer, data, flags);
    }

    @Override public void glNamedBufferStorage(int buffer, ShortBuffer data, int flags) {
        org.lwjgl.opengl.GL45.glNamedBufferStorage(buffer, data, flags);
    }

    @Override public void glNamedBufferStorage(int buffer, IntBuffer data, int flags) {
        org.lwjgl.opengl.GL45.glNamedBufferStorage(buffer, data, flags);
    }

    @Override public void glNamedBufferStorage(int buffer, FloatBuffer data, int flags) {
        org.lwjgl.opengl.GL45.glNamedBufferStorage(buffer, data, flags);
    }

    @Override public void glNamedBufferStorage(int buffer, DoubleBuffer data, int flags) {
        org.lwjgl.opengl.GL45.glNamedBufferStorage(buffer, data, flags);
    }

    @Override public void glNamedBufferStorage(int buffer, short[] data, int flags) {
        org.lwjgl.opengl.GL45.glNamedBufferStorage(buffer, data, flags);
    }

    @Override public void glNamedBufferStorage(int buffer, int[] data, int flags) {
        org.lwjgl.opengl.GL45.glNamedBufferStorage(buffer, data, flags);
    }

    @Override public void glNamedBufferStorage(int buffer, float[] data, int flags) {
        org.lwjgl.opengl.GL45.glNamedBufferStorage(buffer, data, flags);
    }

    @Override public void glNamedBufferStorage(int buffer, double[] data, int flags) {
        org.lwjgl.opengl.GL45.glNamedBufferStorage(buffer, data, flags);
    }

    @Override public void nglNamedBufferData(int buffer, long size, long data, int usage) {
        org.lwjgl.opengl.GL45.nglNamedBufferData(buffer, size, data, usage);
    }

    @Override public void glNamedBufferData(int buffer, long size, int usage) {
        org.lwjgl.opengl.GL45.glNamedBufferData(buffer, size, usage);
    }

    @Override public void glNamedBufferData(int buffer, ByteBuffer data, int usage) {
        org.lwjgl.opengl.GL45.glNamedBufferData(buffer, data, usage);
    }

    @Override public void glNamedBufferData(int buffer, ShortBuffer data, int usage) {
        org.lwjgl.opengl.GL45.glNamedBufferData(buffer, data, usage);
    }

    @Override public void glNamedBufferData(int buffer, IntBuffer data, int usage) {
        org.lwjgl.opengl.GL45.glNamedBufferData(buffer, data, usage);
    }

    @Override public void glNamedBufferData(int buffer, LongBuffer data, int usage) {
        org.lwjgl.opengl.GL45.glNamedBufferData(buffer, data, usage);
    }

    @Override public void glNamedBufferData(int buffer, FloatBuffer data, int usage) {
        org.lwjgl.opengl.GL45.glNamedBufferData(buffer, data, usage);
    }

    @Override public void glNamedBufferData(int buffer, DoubleBuffer data, int usage) {
        org.lwjgl.opengl.GL45.glNamedBufferData(buffer, data, usage);
    }

    @Override public void glNamedBufferData(int buffer, short[] data, int usage) {
        org.lwjgl.opengl.GL45.glNamedBufferData(buffer, data, usage);
    }

    @Override public void glNamedBufferData(int buffer, int[] data, int usage) {
        org.lwjgl.opengl.GL45.glNamedBufferData(buffer, data, usage);
    }

    @Override public void glNamedBufferData(int buffer, long[] data, int usage) {
        org.lwjgl.opengl.GL45.glNamedBufferData(buffer, data, usage);
    }

    @Override public void glNamedBufferData(int buffer, float[] data, int usage) {
        org.lwjgl.opengl.GL45.glNamedBufferData(buffer, data, usage);
    }

    @Override public void glNamedBufferData(int buffer, double[] data, int usage) {
        org.lwjgl.opengl.GL45.glNamedBufferData(buffer, data, usage);
    }

    @Override public void nglNamedBufferSubData(int buffer, long offset, long size, long data) {
        org.lwjgl.opengl.GL45.nglNamedBufferSubData(buffer, offset, size, data);
    }

    @Override public void glNamedBufferSubData(int buffer, long offset, ByteBuffer data) {
        org.lwjgl.opengl.GL45.glNamedBufferSubData(buffer, offset, data);
    }

    @Override public void glNamedBufferSubData(int buffer, long offset, ShortBuffer data) {
        org.lwjgl.opengl.GL45.glNamedBufferSubData(buffer, offset, data);
    }

    @Override public void glNamedBufferSubData(int buffer, long offset, IntBuffer data) {
        org.lwjgl.opengl.GL45.glNamedBufferSubData(buffer, offset, data);
    }

    @Override public void glNamedBufferSubData(int buffer, long offset, LongBuffer data) {
        org.lwjgl.opengl.GL45.glNamedBufferSubData(buffer, offset, data);
    }

    @Override public void glNamedBufferSubData(int buffer, long offset, FloatBuffer data) {
        org.lwjgl.opengl.GL45.glNamedBufferSubData(buffer, offset, data);
    }

    @Override public void glNamedBufferSubData(int buffer, long offset, DoubleBuffer data) {
        org.lwjgl.opengl.GL45.glNamedBufferSubData(buffer, offset, data);
    }

    @Override public void glNamedBufferSubData(int buffer, long offset, short[] data) {
        org.lwjgl.opengl.GL45.glNamedBufferSubData(buffer, offset, data);
    }

    @Override public void glNamedBufferSubData(int buffer, long offset, int[] data) {
        org.lwjgl.opengl.GL45.glNamedBufferSubData(buffer, offset, data);
    }

    @Override public void glNamedBufferSubData(int buffer, long offset, long[] data) {
        org.lwjgl.opengl.GL45.glNamedBufferSubData(buffer, offset, data);
    }

    @Override public void glNamedBufferSubData(int buffer, long offset, float[] data) {
        org.lwjgl.opengl.GL45.glNamedBufferSubData(buffer, offset, data);
    }

    @Override public void glNamedBufferSubData(int buffer, long offset, double[] data) {
        org.lwjgl.opengl.GL45.glNamedBufferSubData(buffer, offset, data);
    }

    @Override public void glCopyNamedBufferSubData(int readBuffer, int writeBuffer, long readOffset, long writeOffset, long size) {
        org.lwjgl.opengl.GL45.glCopyNamedBufferSubData(readBuffer, writeBuffer, readOffset, writeOffset, size);
    }

    @Override public void nglClearNamedBufferData(int buffer, int internalformat, int format, int type, long data) {
        org.lwjgl.opengl.GL45.nglClearNamedBufferData(buffer, internalformat, format, type, data);
    }

    @Override public void glClearNamedBufferData(int buffer, int internalformat, int format, int type, @Nullable ByteBuffer data) {
        org.lwjgl.opengl.GL45.glClearNamedBufferData(buffer, internalformat, format, type, data);
    }

    @Override public void glClearNamedBufferData(int buffer, int internalformat, int format, int type, @Nullable ShortBuffer data) {
        org.lwjgl.opengl.GL45.glClearNamedBufferData(buffer, internalformat, format, type, data);
    }

    @Override public void glClearNamedBufferData(int buffer, int internalformat, int format, int type, @Nullable IntBuffer data) {
        org.lwjgl.opengl.GL45.glClearNamedBufferData(buffer, internalformat, format, type, data);
    }

    @Override public void glClearNamedBufferData(int buffer, int internalformat, int format, int type, @Nullable FloatBuffer data) {
        org.lwjgl.opengl.GL45.glClearNamedBufferData(buffer, internalformat, format, type, data);
    }

    @Override public void glClearNamedBufferData(int buffer, int internalformat, int format, int type, @Nullable short[] data) {
        org.lwjgl.opengl.GL45.glClearNamedBufferData(buffer, internalformat, format, type, data);
    }

    @Override public void glClearNamedBufferData(int buffer, int internalformat, int format, int type, @Nullable int[] data) {
        org.lwjgl.opengl.GL45.glClearNamedBufferData(buffer, internalformat, format, type, data);
    }

    @Override public void glClearNamedBufferData(int buffer, int internalformat, int format, int type, @Nullable float[] data) {
        org.lwjgl.opengl.GL45.glClearNamedBufferData(buffer, internalformat, format, type, data);
    }

    @Override public void nglClearNamedBufferSubData(int buffer, int internalformat, long offset, long size, int format, int type, long data) {
        org.lwjgl.opengl.GL45.nglClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, data);
    }

    @Override public void glClearNamedBufferSubData(int buffer, int internalformat, long offset, long size, int format, int type, @Nullable ByteBuffer data) {
        org.lwjgl.opengl.GL45.glClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, data);
    }

    @Override public void glClearNamedBufferSubData(int buffer, int internalformat, long offset, long size, int format, int type, @Nullable ShortBuffer data) {
        org.lwjgl.opengl.GL45.glClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, data);
    }

    @Override public void glClearNamedBufferSubData(int buffer, int internalformat, long offset, long size, int format, int type, @Nullable IntBuffer data) {
        org.lwjgl.opengl.GL45.glClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, data);
    }

    @Override public void glClearNamedBufferSubData(int buffer, int internalformat, long offset, long size, int format, int type, @Nullable FloatBuffer data) {
        org.lwjgl.opengl.GL45.glClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, data);
    }

    @Override public void glClearNamedBufferSubData(int buffer, int internalformat, long offset, long size, int format, int type, @Nullable short[] data) {
        org.lwjgl.opengl.GL45.glClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, data);
    }

    @Override public void glClearNamedBufferSubData(int buffer, int internalformat, long offset, long size, int format, int type, @Nullable int[] data) {
        org.lwjgl.opengl.GL45.glClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, data);
    }

    @Override public void glClearNamedBufferSubData(int buffer, int internalformat, long offset, long size, int format, int type, @Nullable float[] data) {
        org.lwjgl.opengl.GL45.glClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, data);
    }

    @Override public long nglMapNamedBuffer(int buffer, int access) {
        return org.lwjgl.opengl.GL45.nglMapNamedBuffer(buffer, access);
    }

@Nullable
    @Override public ByteBuffer glMapNamedBuffer(int buffer, int access) {
        return org.lwjgl.opengl.GL45.glMapNamedBuffer(buffer, access);
    }

@Nullable
    @Override public ByteBuffer glMapNamedBuffer(int buffer, int access, @Nullable ByteBuffer old_buffer) {
        return org.lwjgl.opengl.GL45.glMapNamedBuffer(buffer, access, old_buffer);
    }

@Nullable
    @Override public ByteBuffer glMapNamedBuffer(int buffer, int access, long length, @Nullable ByteBuffer old_buffer) {
        return org.lwjgl.opengl.GL45.glMapNamedBuffer(buffer, access, length, old_buffer);
    }

    @Override public long nglMapNamedBufferRange(int buffer, long offset, long length, int access) {
        return org.lwjgl.opengl.GL45.nglMapNamedBufferRange(buffer, offset, length, access);
    }

@Nullable
    @Override public ByteBuffer glMapNamedBufferRange(int buffer, long offset, long length, int access) {
        return org.lwjgl.opengl.GL45.glMapNamedBufferRange(buffer, offset, length, access);
    }

@Nullable
    @Override public ByteBuffer glMapNamedBufferRange(int buffer, long offset, long length, int access, @Nullable ByteBuffer old_buffer) {
        return org.lwjgl.opengl.GL45.glMapNamedBufferRange(buffer, offset, length, access, old_buffer);
    }

    @Override public boolean glUnmapNamedBuffer(int buffer) {
        return org.lwjgl.opengl.GL45.glUnmapNamedBuffer(buffer);
    }

    @Override public void glFlushMappedNamedBufferRange(int buffer, long offset, long length) {
        org.lwjgl.opengl.GL45.glFlushMappedNamedBufferRange(buffer, offset, length);
    }

    @Override public void nglGetNamedBufferParameteriv(int buffer, int pname, long params) {
        org.lwjgl.opengl.GL45.nglGetNamedBufferParameteriv(buffer, pname, params);
    }

    @Override public void glGetNamedBufferParameteriv(int buffer, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL45.glGetNamedBufferParameteriv(buffer, pname, params);
    }

    @Override public void glGetNamedBufferParameteriv(int buffer, int pname, int[] params) {
        org.lwjgl.opengl.GL45.glGetNamedBufferParameteriv(buffer, pname, params);
    }

    @Override public int glGetNamedBufferParameteri(int buffer, int pname) {
        return org.lwjgl.opengl.GL45.glGetNamedBufferParameteri(buffer, pname);
    }

    @Override public void nglGetNamedBufferParameteri64v(int buffer, int pname, long params) {
        org.lwjgl.opengl.GL45.nglGetNamedBufferParameteri64v(buffer, pname, params);
    }

    @Override public void glGetNamedBufferParameteri64v(int buffer, int pname, LongBuffer params) {
        org.lwjgl.opengl.GL45.glGetNamedBufferParameteri64v(buffer, pname, params);
    }

    @Override public void glGetNamedBufferParameteri64v(int buffer, int pname, long[] params) {
        org.lwjgl.opengl.GL45.glGetNamedBufferParameteri64v(buffer, pname, params);
    }

    @Override public long glGetNamedBufferParameteri64(int buffer, int pname) {
        return org.lwjgl.opengl.GL45.glGetNamedBufferParameteri64(buffer, pname);
    }

    @Override public void nglGetNamedBufferPointerv(int buffer, int pname, long params) {
        org.lwjgl.opengl.GL45.nglGetNamedBufferPointerv(buffer, pname, params);
    }

    @Override public void glGetNamedBufferPointerv(int buffer, int pname, PointerBuffer params) {
        org.lwjgl.opengl.GL45.glGetNamedBufferPointerv(buffer, pname, params);
    }

    @Override public long glGetNamedBufferPointer(int buffer, int pname) {
        return org.lwjgl.opengl.GL45.glGetNamedBufferPointer(buffer, pname);
    }

    @Override public void nglGetNamedBufferSubData(int buffer, long offset, long size, long data) {
        org.lwjgl.opengl.GL45.nglGetNamedBufferSubData(buffer, offset, size, data);
    }

    @Override public void glGetNamedBufferSubData(int buffer, long offset, ByteBuffer data) {
        org.lwjgl.opengl.GL45.glGetNamedBufferSubData(buffer, offset, data);
    }

    @Override public void glGetNamedBufferSubData(int buffer, long offset, ShortBuffer data) {
        org.lwjgl.opengl.GL45.glGetNamedBufferSubData(buffer, offset, data);
    }

    @Override public void glGetNamedBufferSubData(int buffer, long offset, IntBuffer data) {
        org.lwjgl.opengl.GL45.glGetNamedBufferSubData(buffer, offset, data);
    }

    @Override public void glGetNamedBufferSubData(int buffer, long offset, LongBuffer data) {
        org.lwjgl.opengl.GL45.glGetNamedBufferSubData(buffer, offset, data);
    }

    @Override public void glGetNamedBufferSubData(int buffer, long offset, FloatBuffer data) {
        org.lwjgl.opengl.GL45.glGetNamedBufferSubData(buffer, offset, data);
    }

    @Override public void glGetNamedBufferSubData(int buffer, long offset, DoubleBuffer data) {
        org.lwjgl.opengl.GL45.glGetNamedBufferSubData(buffer, offset, data);
    }

    @Override public void glGetNamedBufferSubData(int buffer, long offset, short[] data) {
        org.lwjgl.opengl.GL45.glGetNamedBufferSubData(buffer, offset, data);
    }

    @Override public void glGetNamedBufferSubData(int buffer, long offset, int[] data) {
        org.lwjgl.opengl.GL45.glGetNamedBufferSubData(buffer, offset, data);
    }

    @Override public void glGetNamedBufferSubData(int buffer, long offset, long[] data) {
        org.lwjgl.opengl.GL45.glGetNamedBufferSubData(buffer, offset, data);
    }

    @Override public void glGetNamedBufferSubData(int buffer, long offset, float[] data) {
        org.lwjgl.opengl.GL45.glGetNamedBufferSubData(buffer, offset, data);
    }

    @Override public void glGetNamedBufferSubData(int buffer, long offset, double[] data) {
        org.lwjgl.opengl.GL45.glGetNamedBufferSubData(buffer, offset, data);
    }

    @Override public void nglCreateFramebuffers(int n, long framebuffers) {
        org.lwjgl.opengl.GL45.nglCreateFramebuffers(n, framebuffers);
    }

    @Override public void glCreateFramebuffers(IntBuffer framebuffers) {
        org.lwjgl.opengl.GL45.glCreateFramebuffers(framebuffers);
    }

    @Override public int glCreateFramebuffers() {
        return org.lwjgl.opengl.GL45.glCreateFramebuffers();
    }

    @Override public void glCreateFramebuffers(int[] framebuffers) {
        org.lwjgl.opengl.GL45.glCreateFramebuffers(framebuffers);
    }

    @Override public void glNamedFramebufferRenderbuffer(int framebuffer, int attachment, int renderbuffertarget, int renderbuffer) {
        org.lwjgl.opengl.GL45.glNamedFramebufferRenderbuffer(framebuffer, attachment, renderbuffertarget, renderbuffer);
    }

    @Override public void glNamedFramebufferParameteri(int framebuffer, int pname, int param) {
        org.lwjgl.opengl.GL45.glNamedFramebufferParameteri(framebuffer, pname, param);
    }

    @Override public void glNamedFramebufferTexture(int framebuffer, int attachment, int texture, int level) {
        org.lwjgl.opengl.GL45.glNamedFramebufferTexture(framebuffer, attachment, texture, level);
    }

    @Override public void glNamedFramebufferTextureLayer(int framebuffer, int attachment, int texture, int level, int layer) {
        org.lwjgl.opengl.GL45.glNamedFramebufferTextureLayer(framebuffer, attachment, texture, level, layer);
    }

    @Override public void glNamedFramebufferDrawBuffer(int framebuffer, int buf) {
        org.lwjgl.opengl.GL45.glNamedFramebufferDrawBuffer(framebuffer, buf);
    }

    @Override public void nglNamedFramebufferDrawBuffers(int framebuffer, int n, long bufs) {
        org.lwjgl.opengl.GL45.nglNamedFramebufferDrawBuffers(framebuffer, n, bufs);
    }

    @Override public void glNamedFramebufferDrawBuffers(int framebuffer, IntBuffer bufs) {
        org.lwjgl.opengl.GL45.glNamedFramebufferDrawBuffers(framebuffer, bufs);
    }

    @Override public void glNamedFramebufferDrawBuffers(int framebuffer, int buf) {
        org.lwjgl.opengl.GL45.glNamedFramebufferDrawBuffers(framebuffer, buf);
    }

    @Override public void glNamedFramebufferDrawBuffers(int framebuffer, int[] bufs) {
        org.lwjgl.opengl.GL45.glNamedFramebufferDrawBuffers(framebuffer, bufs);
    }

    @Override public void glNamedFramebufferReadBuffer(int framebuffer, int src) {
        org.lwjgl.opengl.GL45.glNamedFramebufferReadBuffer(framebuffer, src);
    }

    @Override public void nglInvalidateNamedFramebufferData(int framebuffer, int numAttachments, long attachments) {
        org.lwjgl.opengl.GL45.nglInvalidateNamedFramebufferData(framebuffer, numAttachments, attachments);
    }

    @Override public void glInvalidateNamedFramebufferData(int framebuffer, IntBuffer attachments) {
        org.lwjgl.opengl.GL45.glInvalidateNamedFramebufferData(framebuffer, attachments);
    }

    @Override public void glInvalidateNamedFramebufferData(int framebuffer, int attachment) {
        org.lwjgl.opengl.GL45.glInvalidateNamedFramebufferData(framebuffer, attachment);
    }

    @Override public void glInvalidateNamedFramebufferData(int framebuffer, int[] attachments) {
        org.lwjgl.opengl.GL45.glInvalidateNamedFramebufferData(framebuffer, attachments);
    }

    @Override public void nglInvalidateNamedFramebufferSubData(int framebuffer, int numAttachments, long attachments, int x, int y, int width, int height) {
        org.lwjgl.opengl.GL45.nglInvalidateNamedFramebufferSubData(framebuffer, numAttachments, attachments, x, y, width, height);
    }

    @Override public void glInvalidateNamedFramebufferSubData(int framebuffer, IntBuffer attachments, int x, int y, int width, int height) {
        org.lwjgl.opengl.GL45.glInvalidateNamedFramebufferSubData(framebuffer, attachments, x, y, width, height);
    }

    @Override public void glInvalidateNamedFramebufferSubData(int framebuffer, int attachment, int x, int y, int width, int height) {
        org.lwjgl.opengl.GL45.glInvalidateNamedFramebufferSubData(framebuffer, attachment, x, y, width, height);
    }

    @Override public void glInvalidateNamedFramebufferSubData(int framebuffer, int[] attachments, int x, int y, int width, int height) {
        org.lwjgl.opengl.GL45.glInvalidateNamedFramebufferSubData(framebuffer, attachments, x, y, width, height);
    }

    @Override public void nglClearNamedFramebufferiv(int framebuffer, int buffer, int drawbuffer, long value) {
        org.lwjgl.opengl.GL45.nglClearNamedFramebufferiv(framebuffer, buffer, drawbuffer, value);
    }

    @Override public void glClearNamedFramebufferiv(int framebuffer, int buffer, int drawbuffer, IntBuffer value) {
        org.lwjgl.opengl.GL45.glClearNamedFramebufferiv(framebuffer, buffer, drawbuffer, value);
    }

    @Override public void glClearNamedFramebufferiv(int framebuffer, int buffer, int drawbuffer, int[] value) {
        org.lwjgl.opengl.GL45.glClearNamedFramebufferiv(framebuffer, buffer, drawbuffer, value);
    }

    @Override public void nglClearNamedFramebufferuiv(int framebuffer, int buffer, int drawbuffer, long value) {
        org.lwjgl.opengl.GL45.nglClearNamedFramebufferuiv(framebuffer, buffer, drawbuffer, value);
    }

    @Override public void glClearNamedFramebufferuiv(int framebuffer, int buffer, int drawbuffer, IntBuffer value) {
        org.lwjgl.opengl.GL45.glClearNamedFramebufferuiv(framebuffer, buffer, drawbuffer, value);
    }

    @Override public void glClearNamedFramebufferuiv(int framebuffer, int buffer, int drawbuffer, int[] value) {
        org.lwjgl.opengl.GL45.glClearNamedFramebufferuiv(framebuffer, buffer, drawbuffer, value);
    }

    @Override public void nglClearNamedFramebufferfv(int framebuffer, int buffer, int drawbuffer, long value) {
        org.lwjgl.opengl.GL45.nglClearNamedFramebufferfv(framebuffer, buffer, drawbuffer, value);
    }

    @Override public void glClearNamedFramebufferfv(int framebuffer, int buffer, int drawbuffer, FloatBuffer value) {
        org.lwjgl.opengl.GL45.glClearNamedFramebufferfv(framebuffer, buffer, drawbuffer, value);
    }

    @Override public void glClearNamedFramebufferfv(int framebuffer, int buffer, int drawbuffer, float[] value) {
        org.lwjgl.opengl.GL45.glClearNamedFramebufferfv(framebuffer, buffer, drawbuffer, value);
    }

    @Override public void glClearNamedFramebufferfi(int framebuffer, int buffer, int drawbuffer, float depth, int stencil) {
        org.lwjgl.opengl.GL45.glClearNamedFramebufferfi(framebuffer, buffer, drawbuffer, depth, stencil);
    }

    @Override public void glBlitNamedFramebuffer(int readFramebuffer, int drawFramebuffer, int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
        org.lwjgl.opengl.GL45.glBlitNamedFramebuffer(readFramebuffer, drawFramebuffer, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
    }

    @Override public int glCheckNamedFramebufferStatus(int framebuffer, int target) {
        return org.lwjgl.opengl.GL45.glCheckNamedFramebufferStatus(framebuffer, target);
    }

    @Override public void nglGetNamedFramebufferParameteriv(int framebuffer, int pname, long params) {
        org.lwjgl.opengl.GL45.nglGetNamedFramebufferParameteriv(framebuffer, pname, params);
    }

    @Override public void glGetNamedFramebufferParameteriv(int framebuffer, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL45.glGetNamedFramebufferParameteriv(framebuffer, pname, params);
    }

    @Override public void glGetNamedFramebufferParameteriv(int framebuffer, int pname, int[] params) {
        org.lwjgl.opengl.GL45.glGetNamedFramebufferParameteriv(framebuffer, pname, params);
    }

    @Override public int glGetNamedFramebufferParameteri(int framebuffer, int pname) {
        return org.lwjgl.opengl.GL45.glGetNamedFramebufferParameteri(framebuffer, pname);
    }

    @Override public void nglGetNamedFramebufferAttachmentParameteriv(int framebuffer, int attachment, int pname, long params) {
        org.lwjgl.opengl.GL45.nglGetNamedFramebufferAttachmentParameteriv(framebuffer, attachment, pname, params);
    }

    @Override public void glGetNamedFramebufferAttachmentParameteriv(int framebuffer, int attachment, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL45.glGetNamedFramebufferAttachmentParameteriv(framebuffer, attachment, pname, params);
    }

    @Override public void glGetNamedFramebufferAttachmentParameteriv(int framebuffer, int attachment, int pname, int[] params) {
        org.lwjgl.opengl.GL45.glGetNamedFramebufferAttachmentParameteriv(framebuffer, attachment, pname, params);
    }

    @Override public int glGetNamedFramebufferAttachmentParameteri(int framebuffer, int attachment, int pname) {
        return org.lwjgl.opengl.GL45.glGetNamedFramebufferAttachmentParameteri(framebuffer, attachment, pname);
    }

    @Override public void nglCreateRenderbuffers(int n, long renderbuffers) {
        org.lwjgl.opengl.GL45.nglCreateRenderbuffers(n, renderbuffers);
    }

    @Override public void glCreateRenderbuffers(IntBuffer renderbuffers) {
        org.lwjgl.opengl.GL45.glCreateRenderbuffers(renderbuffers);
    }

    @Override public int glCreateRenderbuffers() {
        return org.lwjgl.opengl.GL45.glCreateRenderbuffers();
    }

    @Override public void glCreateRenderbuffers(int[] renderbuffers) {
        org.lwjgl.opengl.GL45.glCreateRenderbuffers(renderbuffers);
    }

    @Override public void glNamedRenderbufferStorage(int renderbuffer, int internalformat, int width, int height) {
        org.lwjgl.opengl.GL45.glNamedRenderbufferStorage(renderbuffer, internalformat, width, height);
    }

    @Override public void glNamedRenderbufferStorageMultisample(int renderbuffer, int samples, int internalformat, int width, int height) {
        org.lwjgl.opengl.GL45.glNamedRenderbufferStorageMultisample(renderbuffer, samples, internalformat, width, height);
    }

    @Override public void nglGetNamedRenderbufferParameteriv(int renderbuffer, int pname, long params) {
        org.lwjgl.opengl.GL45.nglGetNamedRenderbufferParameteriv(renderbuffer, pname, params);
    }

    @Override public void glGetNamedRenderbufferParameteriv(int renderbuffer, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL45.glGetNamedRenderbufferParameteriv(renderbuffer, pname, params);
    }

    @Override public void glGetNamedRenderbufferParameteriv(int renderbuffer, int pname, int[] params) {
        org.lwjgl.opengl.GL45.glGetNamedRenderbufferParameteriv(renderbuffer, pname, params);
    }

    @Override public int glGetNamedRenderbufferParameteri(int renderbuffer, int pname) {
        return org.lwjgl.opengl.GL45.glGetNamedRenderbufferParameteri(renderbuffer, pname);
    }

    @Override public void nglCreateTextures(int target, int n, long textures) {
        org.lwjgl.opengl.GL45.nglCreateTextures(target, n, textures);
    }

    @Override public void glCreateTextures(int target, IntBuffer textures) {
        org.lwjgl.opengl.GL45.glCreateTextures(target, textures);
    }

    @Override public int glCreateTextures(int target) {
        return org.lwjgl.opengl.GL45.glCreateTextures(target);
    }

    @Override public void glCreateTextures(int target, int[] textures) {
        org.lwjgl.opengl.GL45.glCreateTextures(target, textures);
    }

    @Override public void glTextureBuffer(int texture, int internalformat, int buffer) {
        org.lwjgl.opengl.GL45.glTextureBuffer(texture, internalformat, buffer);
    }

    @Override public void glTextureBufferRange(int texture, int internalformat, int buffer, long offset, long size) {
        org.lwjgl.opengl.GL45.glTextureBufferRange(texture, internalformat, buffer, offset, size);
    }

    @Override public void glTextureStorage1D(int texture, int levels, int internalformat, int width) {
        org.lwjgl.opengl.GL45.glTextureStorage1D(texture, levels, internalformat, width);
    }

    @Override public void glTextureStorage2D(int texture, int levels, int internalformat, int width, int height) {
        org.lwjgl.opengl.GL45.glTextureStorage2D(texture, levels, internalformat, width, height);
    }

    @Override public void glTextureStorage3D(int texture, int levels, int internalformat, int width, int height, int depth) {
        org.lwjgl.opengl.GL45.glTextureStorage3D(texture, levels, internalformat, width, height, depth);
    }

    @Override public void glTextureStorage2DMultisample(int texture, int samples, int internalformat, int width, int height, boolean fixedsamplelocations) {
        org.lwjgl.opengl.GL45.glTextureStorage2DMultisample(texture, samples, internalformat, width, height, fixedsamplelocations);
    }

    @Override public void glTextureStorage3DMultisample(int texture, int samples, int internalformat, int width, int height, int depth, boolean fixedsamplelocations) {
        org.lwjgl.opengl.GL45.glTextureStorage3DMultisample(texture, samples, internalformat, width, height, depth, fixedsamplelocations);
    }

    @Override public void nglTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, long pixels) {
        org.lwjgl.opengl.GL45.nglTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    @Override public void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, ByteBuffer pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    @Override public void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, long pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    @Override public void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, ShortBuffer pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    @Override public void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, IntBuffer pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    @Override public void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, FloatBuffer pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    @Override public void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, DoubleBuffer pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    @Override public void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, short[] pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    @Override public void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, int[] pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    @Override public void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, float[] pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    @Override public void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, double[] pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    @Override public void nglTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels) {
        org.lwjgl.opengl.GL45.nglTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, ByteBuffer pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, ShortBuffer pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, IntBuffer pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, FloatBuffer pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, DoubleBuffer pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, short[] pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, int[] pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, float[] pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, double[] pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void nglTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels) {
        org.lwjgl.opengl.GL45.nglTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ByteBuffer pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ShortBuffer pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, IntBuffer pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, FloatBuffer pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, DoubleBuffer pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, short[] pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int[] pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, float[] pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, double[] pixels) {
        org.lwjgl.opengl.GL45.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void nglCompressedTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int imageSize, long data) {
        org.lwjgl.opengl.GL45.nglCompressedTextureSubImage1D(texture, level, xoffset, width, format, imageSize, data);
    }

    @Override public void glCompressedTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int imageSize, long data) {
        org.lwjgl.opengl.GL45.glCompressedTextureSubImage1D(texture, level, xoffset, width, format, imageSize, data);
    }

    @Override public void glCompressedTextureSubImage1D(int texture, int level, int xoffset, int width, int format, ByteBuffer data) {
        org.lwjgl.opengl.GL45.glCompressedTextureSubImage1D(texture, level, xoffset, width, format, data);
    }

    @Override public void nglCompressedTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data) {
        org.lwjgl.opengl.GL45.nglCompressedTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, imageSize, data);
    }

    @Override public void glCompressedTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data) {
        org.lwjgl.opengl.GL45.glCompressedTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, imageSize, data);
    }

    @Override public void glCompressedTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, ByteBuffer data) {
        org.lwjgl.opengl.GL45.glCompressedTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, data);
    }

    @Override public void nglCompressedTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data) {
        org.lwjgl.opengl.GL45.nglCompressedTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
    }

    @Override public void glCompressedTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data) {
        org.lwjgl.opengl.GL45.glCompressedTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
    }

    @Override public void glCompressedTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, ByteBuffer data) {
        org.lwjgl.opengl.GL45.glCompressedTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, data);
    }

    @Override public void glCopyTextureSubImage1D(int texture, int level, int xoffset, int x, int y, int width) {
        org.lwjgl.opengl.GL45.glCopyTextureSubImage1D(texture, level, xoffset, x, y, width);
    }

    @Override public void glCopyTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
        org.lwjgl.opengl.GL45.glCopyTextureSubImage2D(texture, level, xoffset, yoffset, x, y, width, height);
    }

    @Override public void glCopyTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height) {
        org.lwjgl.opengl.GL45.glCopyTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, x, y, width, height);
    }

    @Override public void glTextureParameterf(int texture, int pname, float param) {
        org.lwjgl.opengl.GL45.glTextureParameterf(texture, pname, param);
    }

    @Override public void nglTextureParameterfv(int texture, int pname, long params) {
        org.lwjgl.opengl.GL45.nglTextureParameterfv(texture, pname, params);
    }

    @Override public void glTextureParameterfv(int texture, int pname, FloatBuffer params) {
        org.lwjgl.opengl.GL45.glTextureParameterfv(texture, pname, params);
    }

    @Override public void glTextureParameterfv(int texture, int pname, float[] params) {
        org.lwjgl.opengl.GL45.glTextureParameterfv(texture, pname, params);
    }

    @Override public void glTextureParameteri(int texture, int pname, int param) {
        org.lwjgl.opengl.GL45.glTextureParameteri(texture, pname, param);
    }

    @Override public void nglTextureParameterIiv(int texture, int pname, long params) {
        org.lwjgl.opengl.GL45.nglTextureParameterIiv(texture, pname, params);
    }

    @Override public void glTextureParameterIiv(int texture, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL45.glTextureParameterIiv(texture, pname, params);
    }

    @Override public void glTextureParameterIiv(int texture, int pname, int[] params) {
        org.lwjgl.opengl.GL45.glTextureParameterIiv(texture, pname, params);
    }

    @Override public void glTextureParameterIi(int texture, int pname, int param) {
        org.lwjgl.opengl.GL45.glTextureParameterIi(texture, pname, param);
    }

    @Override public void nglTextureParameterIuiv(int texture, int pname, long params) {
        org.lwjgl.opengl.GL45.nglTextureParameterIuiv(texture, pname, params);
    }

    @Override public void glTextureParameterIuiv(int texture, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL45.glTextureParameterIuiv(texture, pname, params);
    }

    @Override public void glTextureParameterIuiv(int texture, int pname, int[] params) {
        org.lwjgl.opengl.GL45.glTextureParameterIuiv(texture, pname, params);
    }

    @Override public void glTextureParameterIui(int texture, int pname, int param) {
        org.lwjgl.opengl.GL45.glTextureParameterIui(texture, pname, param);
    }

    @Override public void nglTextureParameteriv(int texture, int pname, long params) {
        org.lwjgl.opengl.GL45.nglTextureParameteriv(texture, pname, params);
    }

    @Override public void glTextureParameteriv(int texture, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL45.glTextureParameteriv(texture, pname, params);
    }

    @Override public void glTextureParameteriv(int texture, int pname, int[] params) {
        org.lwjgl.opengl.GL45.glTextureParameteriv(texture, pname, params);
    }

    @Override public void glGenerateTextureMipmap(int texture) {
        org.lwjgl.opengl.GL45.glGenerateTextureMipmap(texture);
    }

    @Override public void glBindTextureUnit(int unit, int texture) {
        org.lwjgl.opengl.GL45.glBindTextureUnit(unit, texture);
    }

    @Override public void nglGetTextureImage(int texture, int level, int format, int type, int bufSize, long pixels) {
        org.lwjgl.opengl.GL45.nglGetTextureImage(texture, level, format, type, bufSize, pixels);
    }

    @Override public void glGetTextureImage(int texture, int level, int format, int type, int bufSize, long pixels) {
        org.lwjgl.opengl.GL45.glGetTextureImage(texture, level, format, type, bufSize, pixels);
    }

    @Override public void glGetTextureImage(int texture, int level, int format, int type, ByteBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetTextureImage(texture, level, format, type, pixels);
    }

    @Override public void glGetTextureImage(int texture, int level, int format, int type, ShortBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetTextureImage(texture, level, format, type, pixels);
    }

    @Override public void glGetTextureImage(int texture, int level, int format, int type, IntBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetTextureImage(texture, level, format, type, pixels);
    }

    @Override public void glGetTextureImage(int texture, int level, int format, int type, FloatBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetTextureImage(texture, level, format, type, pixels);
    }

    @Override public void glGetTextureImage(int texture, int level, int format, int type, DoubleBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetTextureImage(texture, level, format, type, pixels);
    }

    @Override public void glGetTextureImage(int texture, int level, int format, int type, short[] pixels) {
        org.lwjgl.opengl.GL45.glGetTextureImage(texture, level, format, type, pixels);
    }

    @Override public void glGetTextureImage(int texture, int level, int format, int type, int[] pixels) {
        org.lwjgl.opengl.GL45.glGetTextureImage(texture, level, format, type, pixels);
    }

    @Override public void glGetTextureImage(int texture, int level, int format, int type, float[] pixels) {
        org.lwjgl.opengl.GL45.glGetTextureImage(texture, level, format, type, pixels);
    }

    @Override public void glGetTextureImage(int texture, int level, int format, int type, double[] pixels) {
        org.lwjgl.opengl.GL45.glGetTextureImage(texture, level, format, type, pixels);
    }

    @Override public void nglGetCompressedTextureImage(int texture, int level, int bufSize, long pixels) {
        org.lwjgl.opengl.GL45.nglGetCompressedTextureImage(texture, level, bufSize, pixels);
    }

    @Override public void glGetCompressedTextureImage(int texture, int level, int bufSize, long pixels) {
        org.lwjgl.opengl.GL45.glGetCompressedTextureImage(texture, level, bufSize, pixels);
    }

    @Override public void glGetCompressedTextureImage(int texture, int level, ByteBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetCompressedTextureImage(texture, level, pixels);
    }

    @Override public void nglGetTextureLevelParameterfv(int texture, int level, int pname, long params) {
        org.lwjgl.opengl.GL45.nglGetTextureLevelParameterfv(texture, level, pname, params);
    }

    @Override public void glGetTextureLevelParameterfv(int texture, int level, int pname, FloatBuffer params) {
        org.lwjgl.opengl.GL45.glGetTextureLevelParameterfv(texture, level, pname, params);
    }

    @Override public void glGetTextureLevelParameterfv(int texture, int level, int pname, float[] params) {
        org.lwjgl.opengl.GL45.glGetTextureLevelParameterfv(texture, level, pname, params);
    }

    @Override public float glGetTextureLevelParameterf(int texture, int level, int pname) {
        return org.lwjgl.opengl.GL45.glGetTextureLevelParameterf(texture, level, pname);
    }

    @Override public void nglGetTextureLevelParameteriv(int texture, int level, int pname, long params) {
        org.lwjgl.opengl.GL45.nglGetTextureLevelParameteriv(texture, level, pname, params);
    }

    @Override public void glGetTextureLevelParameteriv(int texture, int level, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL45.glGetTextureLevelParameteriv(texture, level, pname, params);
    }

    @Override public void glGetTextureLevelParameteriv(int texture, int level, int pname, int[] params) {
        org.lwjgl.opengl.GL45.glGetTextureLevelParameteriv(texture, level, pname, params);
    }

    @Override public int glGetTextureLevelParameteri(int texture, int level, int pname) {
        return org.lwjgl.opengl.GL45.glGetTextureLevelParameteri(texture, level, pname);
    }

    @Override public void nglGetTextureParameterfv(int texture, int pname, long params) {
        org.lwjgl.opengl.GL45.nglGetTextureParameterfv(texture, pname, params);
    }

    @Override public void glGetTextureParameterfv(int texture, int pname, FloatBuffer params) {
        org.lwjgl.opengl.GL45.glGetTextureParameterfv(texture, pname, params);
    }

    @Override public void glGetTextureParameterfv(int texture, int pname, float[] params) {
        org.lwjgl.opengl.GL45.glGetTextureParameterfv(texture, pname, params);
    }

    @Override public float glGetTextureParameterf(int texture, int pname) {
        return org.lwjgl.opengl.GL45.glGetTextureParameterf(texture, pname);
    }

    @Override public void nglGetTextureParameterIiv(int texture, int pname, long params) {
        org.lwjgl.opengl.GL45.nglGetTextureParameterIiv(texture, pname, params);
    }

    @Override public void glGetTextureParameterIiv(int texture, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL45.glGetTextureParameterIiv(texture, pname, params);
    }

    @Override public void glGetTextureParameterIiv(int texture, int pname, int[] params) {
        org.lwjgl.opengl.GL45.glGetTextureParameterIiv(texture, pname, params);
    }

    @Override public int glGetTextureParameterIi(int texture, int pname) {
        return org.lwjgl.opengl.GL45.glGetTextureParameterIi(texture, pname);
    }

    @Override public void nglGetTextureParameterIuiv(int texture, int pname, long params) {
        org.lwjgl.opengl.GL45.nglGetTextureParameterIuiv(texture, pname, params);
    }

    @Override public void glGetTextureParameterIuiv(int texture, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL45.glGetTextureParameterIuiv(texture, pname, params);
    }

    @Override public void glGetTextureParameterIuiv(int texture, int pname, int[] params) {
        org.lwjgl.opengl.GL45.glGetTextureParameterIuiv(texture, pname, params);
    }

    @Override public int glGetTextureParameterIui(int texture, int pname) {
        return org.lwjgl.opengl.GL45.glGetTextureParameterIui(texture, pname);
    }

    @Override public void nglGetTextureParameteriv(int texture, int pname, long params) {
        org.lwjgl.opengl.GL45.nglGetTextureParameteriv(texture, pname, params);
    }

    @Override public void glGetTextureParameteriv(int texture, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL45.glGetTextureParameteriv(texture, pname, params);
    }

    @Override public void glGetTextureParameteriv(int texture, int pname, int[] params) {
        org.lwjgl.opengl.GL45.glGetTextureParameteriv(texture, pname, params);
    }

    @Override public int glGetTextureParameteri(int texture, int pname) {
        return org.lwjgl.opengl.GL45.glGetTextureParameteri(texture, pname);
    }

    @Override public void nglCreateVertexArrays(int n, long arrays) {
        org.lwjgl.opengl.GL45.nglCreateVertexArrays(n, arrays);
    }

    @Override public void glCreateVertexArrays(IntBuffer arrays) {
        org.lwjgl.opengl.GL45.glCreateVertexArrays(arrays);
    }

    @Override public int glCreateVertexArrays() {
        return org.lwjgl.opengl.GL45.glCreateVertexArrays();
    }

    @Override public void glCreateVertexArrays(int[] arrays) {
        org.lwjgl.opengl.GL45.glCreateVertexArrays(arrays);
    }

    @Override public void glDisableVertexArrayAttrib(int vaobj, int index) {
        org.lwjgl.opengl.GL45.glDisableVertexArrayAttrib(vaobj, index);
    }

    @Override public void glEnableVertexArrayAttrib(int vaobj, int index) {
        org.lwjgl.opengl.GL45.glEnableVertexArrayAttrib(vaobj, index);
    }

    @Override public void glVertexArrayElementBuffer(int vaobj, int buffer) {
        org.lwjgl.opengl.GL45.glVertexArrayElementBuffer(vaobj, buffer);
    }

    @Override public void glVertexArrayVertexBuffer(int vaobj, int bindingindex, int buffer, long offset, int stride) {
        org.lwjgl.opengl.GL45.glVertexArrayVertexBuffer(vaobj, bindingindex, buffer, offset, stride);
    }

    @Override public void nglVertexArrayVertexBuffers(int vaobj, int first, int count, long buffers, long offsets, long strides) {
        org.lwjgl.opengl.GL45.nglVertexArrayVertexBuffers(vaobj, first, count, buffers, offsets, strides);
    }

    @Override public void glVertexArrayVertexBuffers(int vaobj, int first, @Nullable IntBuffer buffers, @Nullable PointerBuffer offsets, @Nullable IntBuffer strides) {
        org.lwjgl.opengl.GL45.glVertexArrayVertexBuffers(vaobj, first, buffers, offsets, strides);
    }

    @Override public void glVertexArrayVertexBuffers(int vaobj, int first, @Nullable int[] buffers, @Nullable PointerBuffer offsets, @Nullable int[] strides) {
        org.lwjgl.opengl.GL45.glVertexArrayVertexBuffers(vaobj, first, buffers, offsets, strides);
    }

    @Override public void glVertexArrayAttribFormat(int vaobj, int attribindex, int size, int type, boolean normalized, int relativeoffset) {
        org.lwjgl.opengl.GL45.glVertexArrayAttribFormat(vaobj, attribindex, size, type, normalized, relativeoffset);
    }

    @Override public void glVertexArrayAttribIFormat(int vaobj, int attribindex, int size, int type, int relativeoffset) {
        org.lwjgl.opengl.GL45.glVertexArrayAttribIFormat(vaobj, attribindex, size, type, relativeoffset);
    }

    @Override public void glVertexArrayAttribLFormat(int vaobj, int attribindex, int size, int type, int relativeoffset) {
        org.lwjgl.opengl.GL45.glVertexArrayAttribLFormat(vaobj, attribindex, size, type, relativeoffset);
    }

    @Override public void glVertexArrayAttribBinding(int vaobj, int attribindex, int bindingindex) {
        org.lwjgl.opengl.GL45.glVertexArrayAttribBinding(vaobj, attribindex, bindingindex);
    }

    @Override public void glVertexArrayBindingDivisor(int vaobj, int bindingindex, int divisor) {
        org.lwjgl.opengl.GL45.glVertexArrayBindingDivisor(vaobj, bindingindex, divisor);
    }

    @Override public void nglGetVertexArrayiv(int vaobj, int pname, long param) {
        org.lwjgl.opengl.GL45.nglGetVertexArrayiv(vaobj, pname, param);
    }

    @Override public void glGetVertexArrayiv(int vaobj, int pname, IntBuffer param) {
        org.lwjgl.opengl.GL45.glGetVertexArrayiv(vaobj, pname, param);
    }

    @Override public void glGetVertexArrayiv(int vaobj, int pname, int[] param) {
        org.lwjgl.opengl.GL45.glGetVertexArrayiv(vaobj, pname, param);
    }

    @Override public int glGetVertexArrayi(int vaobj, int pname) {
        return org.lwjgl.opengl.GL45.glGetVertexArrayi(vaobj, pname);
    }

    @Override public void nglGetVertexArrayIndexediv(int vaobj, int index, int pname, long param) {
        org.lwjgl.opengl.GL45.nglGetVertexArrayIndexediv(vaobj, index, pname, param);
    }

    @Override public void glGetVertexArrayIndexediv(int vaobj, int index, int pname, IntBuffer param) {
        org.lwjgl.opengl.GL45.glGetVertexArrayIndexediv(vaobj, index, pname, param);
    }

    @Override public void glGetVertexArrayIndexediv(int vaobj, int index, int pname, int[] param) {
        org.lwjgl.opengl.GL45.glGetVertexArrayIndexediv(vaobj, index, pname, param);
    }

    @Override public int glGetVertexArrayIndexedi(int vaobj, int index, int pname) {
        return org.lwjgl.opengl.GL45.glGetVertexArrayIndexedi(vaobj, index, pname);
    }

    @Override public void nglGetVertexArrayIndexed64iv(int vaobj, int index, int pname, long param) {
        org.lwjgl.opengl.GL45.nglGetVertexArrayIndexed64iv(vaobj, index, pname, param);
    }

    @Override public void glGetVertexArrayIndexed64iv(int vaobj, int index, int pname, LongBuffer param) {
        org.lwjgl.opengl.GL45.glGetVertexArrayIndexed64iv(vaobj, index, pname, param);
    }

    @Override public void glGetVertexArrayIndexed64iv(int vaobj, int index, int pname, long[] param) {
        org.lwjgl.opengl.GL45.glGetVertexArrayIndexed64iv(vaobj, index, pname, param);
    }

    @Override public long glGetVertexArrayIndexed64i(int vaobj, int index, int pname) {
        return org.lwjgl.opengl.GL45.glGetVertexArrayIndexed64i(vaobj, index, pname);
    }

    @Override public void nglCreateSamplers(int n, long samplers) {
        org.lwjgl.opengl.GL45.nglCreateSamplers(n, samplers);
    }

    @Override public void glCreateSamplers(IntBuffer samplers) {
        org.lwjgl.opengl.GL45.glCreateSamplers(samplers);
    }

    @Override public int glCreateSamplers() {
        return org.lwjgl.opengl.GL45.glCreateSamplers();
    }

    @Override public void glCreateSamplers(int[] samplers) {
        org.lwjgl.opengl.GL45.glCreateSamplers(samplers);
    }

    @Override public void nglCreateProgramPipelines(int n, long pipelines) {
        org.lwjgl.opengl.GL45.nglCreateProgramPipelines(n, pipelines);
    }

    @Override public void glCreateProgramPipelines(IntBuffer pipelines) {
        org.lwjgl.opengl.GL45.glCreateProgramPipelines(pipelines);
    }

    @Override public int glCreateProgramPipelines() {
        return org.lwjgl.opengl.GL45.glCreateProgramPipelines();
    }

    @Override public void glCreateProgramPipelines(int[] pipelines) {
        org.lwjgl.opengl.GL45.glCreateProgramPipelines(pipelines);
    }

    @Override public void nglCreateQueries(int target, int n, long ids) {
        org.lwjgl.opengl.GL45.nglCreateQueries(target, n, ids);
    }

    @Override public void glCreateQueries(int target, IntBuffer ids) {
        org.lwjgl.opengl.GL45.glCreateQueries(target, ids);
    }

    @Override public int glCreateQueries(int target) {
        return org.lwjgl.opengl.GL45.glCreateQueries(target);
    }

    @Override public void glCreateQueries(int target, int[] ids) {
        org.lwjgl.opengl.GL45.glCreateQueries(target, ids);
    }

    @Override public void glGetQueryBufferObjectiv(int id, int buffer, int pname, long offset) {
        org.lwjgl.opengl.GL45.glGetQueryBufferObjectiv(id, buffer, pname, offset);
    }

    @Override public void glGetQueryBufferObjectuiv(int id, int buffer, int pname, long offset) {
        org.lwjgl.opengl.GL45.glGetQueryBufferObjectuiv(id, buffer, pname, offset);
    }

    @Override public void glGetQueryBufferObjecti64v(int id, int buffer, int pname, long offset) {
        org.lwjgl.opengl.GL45.glGetQueryBufferObjecti64v(id, buffer, pname, offset);
    }

    @Override public void glGetQueryBufferObjectui64v(int id, int buffer, int pname, long offset) {
        org.lwjgl.opengl.GL45.glGetQueryBufferObjectui64v(id, buffer, pname, offset);
    }

    @Override public void glMemoryBarrierByRegion(int barriers) {
        org.lwjgl.opengl.GL45.glMemoryBarrierByRegion(barriers);
    }

    @Override public void nglGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int bufSize, long pixels) {
        org.lwjgl.opengl.GL45.nglGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, bufSize, pixels);
    }

    @Override public void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int bufSize, long pixels) {
        org.lwjgl.opengl.GL45.glGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, bufSize, pixels);
    }

    @Override public void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ByteBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ShortBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, IntBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, FloatBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, DoubleBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, short[] pixels) {
        org.lwjgl.opengl.GL45.glGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int[] pixels) {
        org.lwjgl.opengl.GL45.glGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, float[] pixels) {
        org.lwjgl.opengl.GL45.glGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, double[] pixels) {
        org.lwjgl.opengl.GL45.glGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void nglGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int bufSize, long pixels) {
        org.lwjgl.opengl.GL45.nglGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, bufSize, pixels);
    }

    @Override public void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int bufSize, long pixels) {
        org.lwjgl.opengl.GL45.glGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, bufSize, pixels);
    }

    @Override public void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, ByteBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels);
    }

    @Override public void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, ShortBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels);
    }

    @Override public void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, IntBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels);
    }

    @Override public void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, FloatBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels);
    }

    @Override public void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, DoubleBuffer pixels) {
        org.lwjgl.opengl.GL45.glGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels);
    }

    @Override public void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, short[] pixels) {
        org.lwjgl.opengl.GL45.glGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels);
    }

    @Override public void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int[] pixels) {
        org.lwjgl.opengl.GL45.glGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels);
    }

    @Override public void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, float[] pixels) {
        org.lwjgl.opengl.GL45.glGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels);
    }

    @Override public void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, double[] pixels) {
        org.lwjgl.opengl.GL45.glGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels);
    }

    @Override public void glTextureBarrier() {
        org.lwjgl.opengl.GL45.glTextureBarrier();
    }

    @Override public int glGetGraphicsResetStatus() {
        return org.lwjgl.opengl.GL45.glGetGraphicsResetStatus();
    }

    @Override public void nglGetnMapdv(int target, int query, int bufSize, long data) {
        org.lwjgl.opengl.GL45.nglGetnMapdv(target, query, bufSize, data);
    }

    @Override public void glGetnMapdv(int target, int query, DoubleBuffer data) {
        org.lwjgl.opengl.GL45.glGetnMapdv(target, query, data);
    }

    @Override public void glGetnMapdv(int target, int query, double[] data) {
        org.lwjgl.opengl.GL45.glGetnMapdv(target, query, data);
    }

    @Override public double glGetnMapd(int target, int query) {
        return org.lwjgl.opengl.GL45.glGetnMapd(target, query);
    }

    @Override public void nglGetnMapfv(int target, int query, int bufSize, long data) {
        org.lwjgl.opengl.GL45.nglGetnMapfv(target, query, bufSize, data);
    }

    @Override public void glGetnMapfv(int target, int query, FloatBuffer data) {
        org.lwjgl.opengl.GL45.glGetnMapfv(target, query, data);
    }

    @Override public void glGetnMapfv(int target, int query, float[] data) {
        org.lwjgl.opengl.GL45.glGetnMapfv(target, query, data);
    }

    @Override public float glGetnMapf(int target, int query) {
        return org.lwjgl.opengl.GL45.glGetnMapf(target, query);
    }

    @Override public void nglGetnMapiv(int target, int query, int bufSize, long data) {
        org.lwjgl.opengl.GL45.nglGetnMapiv(target, query, bufSize, data);
    }

    @Override public void glGetnMapiv(int target, int query, IntBuffer data) {
        org.lwjgl.opengl.GL45.glGetnMapiv(target, query, data);
    }

    @Override public void glGetnMapiv(int target, int query, int[] data) {
        org.lwjgl.opengl.GL45.glGetnMapiv(target, query, data);
    }

    @Override public int glGetnMapi(int target, int query) {
        return org.lwjgl.opengl.GL45.glGetnMapi(target, query);
    }

    @Override public void nglGetnPixelMapfv(int map, int bufSize, long data) {
        org.lwjgl.opengl.GL45.nglGetnPixelMapfv(map, bufSize, data);
    }

    @Override public void glGetnPixelMapfv(int map, FloatBuffer data) {
        org.lwjgl.opengl.GL45.glGetnPixelMapfv(map, data);
    }

    @Override public void glGetnPixelMapfv(int map, float[] data) {
        org.lwjgl.opengl.GL45.glGetnPixelMapfv(map, data);
    }

    @Override public void nglGetnPixelMapuiv(int map, int bufSize, long data) {
        org.lwjgl.opengl.GL45.nglGetnPixelMapuiv(map, bufSize, data);
    }

    @Override public void glGetnPixelMapuiv(int map, IntBuffer data) {
        org.lwjgl.opengl.GL45.glGetnPixelMapuiv(map, data);
    }

    @Override public void glGetnPixelMapuiv(int map, int[] data) {
        org.lwjgl.opengl.GL45.glGetnPixelMapuiv(map, data);
    }

    @Override public void nglGetnPixelMapusv(int map, int bufSize, long data) {
        org.lwjgl.opengl.GL45.nglGetnPixelMapusv(map, bufSize, data);
    }

    @Override public void glGetnPixelMapusv(int map, ShortBuffer data) {
        org.lwjgl.opengl.GL45.glGetnPixelMapusv(map, data);
    }

    @Override public void glGetnPixelMapusv(int map, short[] data) {
        org.lwjgl.opengl.GL45.glGetnPixelMapusv(map, data);
    }

    @Override public void nglGetnPolygonStipple(int bufSize, long pattern) {
        org.lwjgl.opengl.GL45.nglGetnPolygonStipple(bufSize, pattern);
    }

    @Override public void glGetnPolygonStipple(int bufSize, long pattern) {
        org.lwjgl.opengl.GL45.glGetnPolygonStipple(bufSize, pattern);
    }

    @Override public void glGetnPolygonStipple(ByteBuffer pattern) {
        org.lwjgl.opengl.GL45.glGetnPolygonStipple(pattern);
    }

    @Override public void nglGetnTexImage(int tex, int level, int format, int type, int bufSize, long img) {
        org.lwjgl.opengl.GL45.nglGetnTexImage(tex, level, format, type, bufSize, img);
    }

    @Override public void glGetnTexImage(int tex, int level, int format, int type, int bufSize, long img) {
        org.lwjgl.opengl.GL45.glGetnTexImage(tex, level, format, type, bufSize, img);
    }

    @Override public void glGetnTexImage(int tex, int level, int format, int type, ByteBuffer img) {
        org.lwjgl.opengl.GL45.glGetnTexImage(tex, level, format, type, img);
    }

    @Override public void glGetnTexImage(int tex, int level, int format, int type, ShortBuffer img) {
        org.lwjgl.opengl.GL45.glGetnTexImage(tex, level, format, type, img);
    }

    @Override public void glGetnTexImage(int tex, int level, int format, int type, IntBuffer img) {
        org.lwjgl.opengl.GL45.glGetnTexImage(tex, level, format, type, img);
    }

    @Override public void glGetnTexImage(int tex, int level, int format, int type, FloatBuffer img) {
        org.lwjgl.opengl.GL45.glGetnTexImage(tex, level, format, type, img);
    }

    @Override public void glGetnTexImage(int tex, int level, int format, int type, DoubleBuffer img) {
        org.lwjgl.opengl.GL45.glGetnTexImage(tex, level, format, type, img);
    }

    @Override public void glGetnTexImage(int tex, int level, int format, int type, short[] img) {
        org.lwjgl.opengl.GL45.glGetnTexImage(tex, level, format, type, img);
    }

    @Override public void glGetnTexImage(int tex, int level, int format, int type, int[] img) {
        org.lwjgl.opengl.GL45.glGetnTexImage(tex, level, format, type, img);
    }

    @Override public void glGetnTexImage(int tex, int level, int format, int type, float[] img) {
        org.lwjgl.opengl.GL45.glGetnTexImage(tex, level, format, type, img);
    }

    @Override public void glGetnTexImage(int tex, int level, int format, int type, double[] img) {
        org.lwjgl.opengl.GL45.glGetnTexImage(tex, level, format, type, img);
    }

    @Override public void nglReadnPixels(int x, int y, int width, int height, int format, int type, int bufSize, long pixels) {
        org.lwjgl.opengl.GL45.nglReadnPixels(x, y, width, height, format, type, bufSize, pixels);
    }

    @Override public void glReadnPixels(int x, int y, int width, int height, int format, int type, int bufSize, long pixels) {
        org.lwjgl.opengl.GL45.glReadnPixels(x, y, width, height, format, type, bufSize, pixels);
    }

    @Override public void glReadnPixels(int x, int y, int width, int height, int format, int type, ByteBuffer pixels) {
        org.lwjgl.opengl.GL45.glReadnPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadnPixels(int x, int y, int width, int height, int format, int type, ShortBuffer pixels) {
        org.lwjgl.opengl.GL45.glReadnPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadnPixels(int x, int y, int width, int height, int format, int type, IntBuffer pixels) {
        org.lwjgl.opengl.GL45.glReadnPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadnPixels(int x, int y, int width, int height, int format, int type, FloatBuffer pixels) {
        org.lwjgl.opengl.GL45.glReadnPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadnPixels(int x, int y, int width, int height, int format, int type, short[] pixels) {
        org.lwjgl.opengl.GL45.glReadnPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadnPixels(int x, int y, int width, int height, int format, int type, int[] pixels) {
        org.lwjgl.opengl.GL45.glReadnPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadnPixels(int x, int y, int width, int height, int format, int type, float[] pixels) {
        org.lwjgl.opengl.GL45.glReadnPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void nglGetnColorTable(int target, int format, int type, int bufSize, long table) {
        org.lwjgl.opengl.GL45.nglGetnColorTable(target, format, type, bufSize, table);
    }

    @Override public void glGetnColorTable(int target, int format, int type, int bufSize, long table) {
        org.lwjgl.opengl.GL45.glGetnColorTable(target, format, type, bufSize, table);
    }

    @Override public void glGetnColorTable(int target, int format, int type, ByteBuffer table) {
        org.lwjgl.opengl.GL45.glGetnColorTable(target, format, type, table);
    }

    @Override public void glGetnColorTable(int target, int format, int type, ShortBuffer table) {
        org.lwjgl.opengl.GL45.glGetnColorTable(target, format, type, table);
    }

    @Override public void glGetnColorTable(int target, int format, int type, IntBuffer table) {
        org.lwjgl.opengl.GL45.glGetnColorTable(target, format, type, table);
    }

    @Override public void glGetnColorTable(int target, int format, int type, FloatBuffer table) {
        org.lwjgl.opengl.GL45.glGetnColorTable(target, format, type, table);
    }

    @Override public void glGetnColorTable(int target, int format, int type, short[] table) {
        org.lwjgl.opengl.GL45.glGetnColorTable(target, format, type, table);
    }

    @Override public void glGetnColorTable(int target, int format, int type, int[] table) {
        org.lwjgl.opengl.GL45.glGetnColorTable(target, format, type, table);
    }

    @Override public void glGetnColorTable(int target, int format, int type, float[] table) {
        org.lwjgl.opengl.GL45.glGetnColorTable(target, format, type, table);
    }

    @Override public void nglGetnConvolutionFilter(int target, int format, int type, int bufSize, long image) {
        org.lwjgl.opengl.GL45.nglGetnConvolutionFilter(target, format, type, bufSize, image);
    }

    @Override public void glGetnConvolutionFilter(int target, int format, int type, int bufSize, long image) {
        org.lwjgl.opengl.GL45.glGetnConvolutionFilter(target, format, type, bufSize, image);
    }

    @Override public void glGetnConvolutionFilter(int target, int format, int type, ByteBuffer image) {
        org.lwjgl.opengl.GL45.glGetnConvolutionFilter(target, format, type, image);
    }

    @Override public void nglGetnSeparableFilter(int target, int format, int type, int rowBufSize, long row, int columnBufSize, long column, long span) {
        org.lwjgl.opengl.GL45.nglGetnSeparableFilter(target, format, type, rowBufSize, row, columnBufSize, column, span);
    }

    @Override public void glGetnSeparableFilter(int target, int format, int type, int rowBufSize, long row, int columnBufSize, long column, @Nullable ByteBuffer span) {
        org.lwjgl.opengl.GL45.glGetnSeparableFilter(target, format, type, rowBufSize, row, columnBufSize, column, span);
    }

    @Override public void glGetnSeparableFilter(int target, int format, int type, ByteBuffer row, ByteBuffer column, @Nullable ByteBuffer span) {
        org.lwjgl.opengl.GL45.glGetnSeparableFilter(target, format, type, row, column, span);
    }

    @Override public void nglGetnHistogram(int target, boolean reset, int format, int type, int bufSize, long values) {
        org.lwjgl.opengl.GL45.nglGetnHistogram(target, reset, format, type, bufSize, values);
    }

    @Override public void glGetnHistogram(int target, boolean reset, int format, int type, int bufSize, long values) {
        org.lwjgl.opengl.GL45.glGetnHistogram(target, reset, format, type, bufSize, values);
    }

    @Override public void glGetnHistogram(int target, boolean reset, int format, int type, ByteBuffer values) {
        org.lwjgl.opengl.GL45.glGetnHistogram(target, reset, format, type, values);
    }

    @Override public void nglGetnMinmax(int target, boolean reset, int format, int type, int bufSize, long values) {
        org.lwjgl.opengl.GL45.nglGetnMinmax(target, reset, format, type, bufSize, values);
    }

    @Override public void glGetnMinmax(int target, boolean reset, int format, int type, int bufSize, long values) {
        org.lwjgl.opengl.GL45.glGetnMinmax(target, reset, format, type, bufSize, values);
    }

    @Override public void glGetnMinmax(int target, boolean reset, int format, int type, ByteBuffer values) {
        org.lwjgl.opengl.GL45.glGetnMinmax(target, reset, format, type, values);
    }

    @Override public void nglGetnCompressedTexImage(int target, int level, int bufSize, long img) {
        org.lwjgl.opengl.GL45.nglGetnCompressedTexImage(target, level, bufSize, img);
    }

    @Override public void glGetnCompressedTexImage(int target, int level, int bufSize, long img) {
        org.lwjgl.opengl.GL45.glGetnCompressedTexImage(target, level, bufSize, img);
    }

    @Override public void glGetnCompressedTexImage(int target, int level, ByteBuffer img) {
        org.lwjgl.opengl.GL45.glGetnCompressedTexImage(target, level, img);
    }

    @Override public void nglGetnUniformfv(int program, int location, int bufSize, long params) {
        org.lwjgl.opengl.GL45.nglGetnUniformfv(program, location, bufSize, params);
    }

    @Override public void glGetnUniformfv(int program, int location, FloatBuffer params) {
        org.lwjgl.opengl.GL45.glGetnUniformfv(program, location, params);
    }

    @Override public void glGetnUniformfv(int program, int location, float[] params) {
        org.lwjgl.opengl.GL45.glGetnUniformfv(program, location, params);
    }

    @Override public float glGetnUniformf(int program, int location) {
        return org.lwjgl.opengl.GL45.glGetnUniformf(program, location);
    }

    @Override public void nglGetnUniformdv(int program, int location, int bufSize, long params) {
        org.lwjgl.opengl.GL45.nglGetnUniformdv(program, location, bufSize, params);
    }

    @Override public void glGetnUniformdv(int program, int location, DoubleBuffer params) {
        org.lwjgl.opengl.GL45.glGetnUniformdv(program, location, params);
    }

    @Override public void glGetnUniformdv(int program, int location, double[] params) {
        org.lwjgl.opengl.GL45.glGetnUniformdv(program, location, params);
    }

    @Override public double glGetnUniformd(int program, int location) {
        return org.lwjgl.opengl.GL45.glGetnUniformd(program, location);
    }

    @Override public void nglGetnUniformiv(int program, int location, int bufSize, long params) {
        org.lwjgl.opengl.GL45.nglGetnUniformiv(program, location, bufSize, params);
    }

    @Override public void glGetnUniformiv(int program, int location, IntBuffer params) {
        org.lwjgl.opengl.GL45.glGetnUniformiv(program, location, params);
    }

    @Override public void glGetnUniformiv(int program, int location, int[] params) {
        org.lwjgl.opengl.GL45.glGetnUniformiv(program, location, params);
    }

    @Override public int glGetnUniformi(int program, int location) {
        return org.lwjgl.opengl.GL45.glGetnUniformi(program, location);
    }

    @Override public void nglGetnUniformuiv(int program, int location, int bufSize, long params) {
        org.lwjgl.opengl.GL45.nglGetnUniformuiv(program, location, bufSize, params);
    }

    @Override public void glGetnUniformuiv(int program, int location, IntBuffer params) {
        org.lwjgl.opengl.GL45.glGetnUniformuiv(program, location, params);
    }

    @Override public void glGetnUniformuiv(int program, int location, int[] params) {
        org.lwjgl.opengl.GL45.glGetnUniformuiv(program, location, params);
    }

    @Override public int glGetnUniformui(int program, int location) {
        return org.lwjgl.opengl.GL45.glGetnUniformui(program, location);
    }

}
