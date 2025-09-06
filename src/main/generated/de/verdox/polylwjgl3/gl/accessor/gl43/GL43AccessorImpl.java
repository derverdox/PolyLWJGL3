package de.verdox.polylwjgl3.gl.accessor.gl43;

import de.verdox.polylwjgl3.gl.accessor.gl42.GL42Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl42.GL42AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL43;
import org.lwjgl.opengl.GLDebugMessageCallbackI;
import org.lwjgl.system.*;

public class GL43AccessorImpl extends GL42AccessorImpl implements GL43Accessor {

    @Override public void nglClearBufferData(int target, int internalformat, int format, int type, long data) {
        org.lwjgl.opengl.GL43.nglClearBufferData(target, internalformat, format, type, data);
    }

    @Override public void glClearBufferData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ByteBuffer data) {
        org.lwjgl.opengl.GL43.glClearBufferData(target, internalformat, format, type, data);
    }

    @Override public void glClearBufferData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ShortBuffer data) {
        org.lwjgl.opengl.GL43.glClearBufferData(target, internalformat, format, type, data);
    }

    @Override public void glClearBufferData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") IntBuffer data) {
        org.lwjgl.opengl.GL43.glClearBufferData(target, internalformat, format, type, data);
    }

    @Override public void glClearBufferData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") FloatBuffer data) {
        org.lwjgl.opengl.GL43.glClearBufferData(target, internalformat, format, type, data);
    }

    @Override public void glClearBufferData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") short[] data) {
        org.lwjgl.opengl.GL43.glClearBufferData(target, internalformat, format, type, data);
    }

    @Override public void glClearBufferData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") int[] data) {
        org.lwjgl.opengl.GL43.glClearBufferData(target, internalformat, format, type, data);
    }

    @Override public void glClearBufferData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") float[] data) {
        org.lwjgl.opengl.GL43.glClearBufferData(target, internalformat, format, type, data);
    }

    @Override public void nglClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, long data) {
        org.lwjgl.opengl.GL43.nglClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    @Override public void glClearBufferSubData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ByteBuffer data) {
        org.lwjgl.opengl.GL43.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    @Override public void glClearBufferSubData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ShortBuffer data) {
        org.lwjgl.opengl.GL43.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    @Override public void glClearBufferSubData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") IntBuffer data) {
        org.lwjgl.opengl.GL43.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    @Override public void glClearBufferSubData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") FloatBuffer data) {
        org.lwjgl.opengl.GL43.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    @Override public void glClearBufferSubData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") short[] data) {
        org.lwjgl.opengl.GL43.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    @Override public void glClearBufferSubData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") int[] data) {
        org.lwjgl.opengl.GL43.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    @Override public void glClearBufferSubData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") float[] data) {
        org.lwjgl.opengl.GL43.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    @Override public void glDispatchCompute(@NativeType("GLuint") int num_groups_x, @NativeType("GLuint") int num_groups_y, @NativeType("GLuint") int num_groups_z) {
        org.lwjgl.opengl.GL43.glDispatchCompute(num_groups_x, num_groups_y, num_groups_z);
    }

    @Override public void glDispatchComputeIndirect(@NativeType("GLintptr") long indirect) {
        org.lwjgl.opengl.GL43.glDispatchComputeIndirect(indirect);
    }

    @Override public void glCopyImageSubData(@NativeType("GLuint") int srcName, @NativeType("GLenum") int srcTarget, @NativeType("GLint") int srcLevel, @NativeType("GLint") int srcX, @NativeType("GLint") int srcY, @NativeType("GLint") int srcZ, @NativeType("GLuint") int dstName, @NativeType("GLenum") int dstTarget, @NativeType("GLint") int dstLevel, @NativeType("GLint") int dstX, @NativeType("GLint") int dstY, @NativeType("GLint") int dstZ, @NativeType("GLsizei") int srcWidth, @NativeType("GLsizei") int srcHeight, @NativeType("GLsizei") int srcDepth) {
        org.lwjgl.opengl.GL43.glCopyImageSubData(srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, srcWidth, srcHeight, srcDepth);
    }

    @Override public void nglDebugMessageControl(int source, int type, int severity, int count, long ids, boolean enabled) {
        org.lwjgl.opengl.GL43.nglDebugMessageControl(source, type, severity, count, ids, enabled);
    }

    @Override public void glDebugMessageControl(@NativeType("GLenum") int source, @NativeType("GLenum") int type, @NativeType("GLenum") int severity, @Nullable @NativeType("GLuint const *") IntBuffer ids, @NativeType("GLboolean") boolean enabled) {
        org.lwjgl.opengl.GL43.glDebugMessageControl(source, type, severity, ids, enabled);
    }

    @Override public void glDebugMessageControl(@NativeType("GLenum") int source, @NativeType("GLenum") int type, @NativeType("GLenum") int severity, @NativeType("GLuint const *") int id, @NativeType("GLboolean") boolean enabled) {
        org.lwjgl.opengl.GL43.glDebugMessageControl(source, type, severity, id, enabled);
    }

    @Override public void glDebugMessageControl(@NativeType("GLenum") int source, @NativeType("GLenum") int type, @NativeType("GLenum") int severity, @Nullable @NativeType("GLuint const *") int[] ids, @NativeType("GLboolean") boolean enabled) {
        org.lwjgl.opengl.GL43.glDebugMessageControl(source, type, severity, ids, enabled);
    }

    @Override public void nglDebugMessageInsert(int source, int type, int id, int severity, int length, long message) {
        org.lwjgl.opengl.GL43.nglDebugMessageInsert(source, type, id, severity, length, message);
    }

    @Override public void glDebugMessageInsert(@NativeType("GLenum") int source, @NativeType("GLenum") int type, @NativeType("GLuint") int id, @NativeType("GLenum") int severity, @NativeType("GLchar const *") ByteBuffer message) {
        org.lwjgl.opengl.GL43.glDebugMessageInsert(source, type, id, severity, message);
    }

    @Override public void glDebugMessageInsert(@NativeType("GLenum") int source, @NativeType("GLenum") int type, @NativeType("GLuint") int id, @NativeType("GLenum") int severity, @NativeType("GLchar const *") CharSequence message) {
        org.lwjgl.opengl.GL43.glDebugMessageInsert(source, type, id, severity, message);
    }

    @Override public void nglDebugMessageCallback(long callback, long userParam) {
        org.lwjgl.opengl.GL43.nglDebugMessageCallback(callback, userParam);
    }

    @Override public void glDebugMessageCallback(@Nullable @NativeType("GLDEBUGPROC") GLDebugMessageCallbackI callback, @NativeType("void const *") long userParam) {
        org.lwjgl.opengl.GL43.glDebugMessageCallback(callback, userParam);
    }

    @Override public int nglGetDebugMessageLog(int count, int bufsize, long sources, long types, long ids, long severities, long lengths, long messageLog) {
        return org.lwjgl.opengl.GL43.nglGetDebugMessageLog(count, bufsize, sources, types, ids, severities, lengths, messageLog);
    }

@NativeType("GLuint")
    @Override public int glGetDebugMessageLog(@NativeType("GLuint") int count, @Nullable @NativeType("GLenum *") IntBuffer sources, @Nullable @NativeType("GLenum *") IntBuffer types, @Nullable @NativeType("GLuint *") IntBuffer ids, @Nullable @NativeType("GLenum *") IntBuffer severities, @Nullable @NativeType("GLsizei *") IntBuffer lengths, @Nullable @NativeType("GLchar *") ByteBuffer messageLog) {
        return org.lwjgl.opengl.GL43.glGetDebugMessageLog(count, sources, types, ids, severities, lengths, messageLog);
    }

@NativeType("GLuint")
    @Override public int glGetDebugMessageLog(@NativeType("GLuint") int count, @Nullable @NativeType("GLenum *") int[] sources, @Nullable @NativeType("GLenum *") int[] types, @Nullable @NativeType("GLuint *") int[] ids, @Nullable @NativeType("GLenum *") int[] severities, @Nullable @NativeType("GLsizei *") int[] lengths, @Nullable @NativeType("GLchar *") ByteBuffer messageLog) {
        return org.lwjgl.opengl.GL43.glGetDebugMessageLog(count, sources, types, ids, severities, lengths, messageLog);
    }

    @Override public void nglPushDebugGroup(int source, int id, int length, long message) {
        org.lwjgl.opengl.GL43.nglPushDebugGroup(source, id, length, message);
    }

    @Override public void glPushDebugGroup(@NativeType("GLenum") int source, @NativeType("GLuint") int id, @NativeType("GLchar const *") ByteBuffer message) {
        org.lwjgl.opengl.GL43.glPushDebugGroup(source, id, message);
    }

    @Override public void glPushDebugGroup(@NativeType("GLenum") int source, @NativeType("GLuint") int id, @NativeType("GLchar const *") CharSequence message) {
        org.lwjgl.opengl.GL43.glPushDebugGroup(source, id, message);
    }

    @Override public void glPopDebugGroup() {
        org.lwjgl.opengl.GL43.glPopDebugGroup();
    }

    @Override public void nglObjectLabel(int identifier, int name, int length, long label) {
        org.lwjgl.opengl.GL43.nglObjectLabel(identifier, name, length, label);
    }

    @Override public void glObjectLabel(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name, @NativeType("GLchar const *") ByteBuffer label) {
        org.lwjgl.opengl.GL43.glObjectLabel(identifier, name, label);
    }

    @Override public void glObjectLabel(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name, @NativeType("GLchar const *") CharSequence label) {
        org.lwjgl.opengl.GL43.glObjectLabel(identifier, name, label);
    }

    @Override public void nglGetObjectLabel(int identifier, int name, int bufSize, long length, long label) {
        org.lwjgl.opengl.GL43.nglGetObjectLabel(identifier, name, bufSize, length, label);
    }

    @Override public void glGetObjectLabel(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLchar *") ByteBuffer label) {
        org.lwjgl.opengl.GL43.glGetObjectLabel(identifier, name, length, label);
    }

@NativeType("void")
    @Override public String glGetObjectLabel(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name, @NativeType("GLsizei") int bufSize) {
        return org.lwjgl.opengl.GL43.glGetObjectLabel(identifier, name, bufSize);
    }

@NativeType("void")
    @Override public String glGetObjectLabel(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name) {
        return org.lwjgl.opengl.GL43.glGetObjectLabel(identifier, name);
    }

    @Override public void glGetObjectLabel(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLchar *") ByteBuffer label) {
        org.lwjgl.opengl.GL43.glGetObjectLabel(identifier, name, length, label);
    }

    @Override public void nglObjectPtrLabel(long ptr, int length, long label) {
        org.lwjgl.opengl.GL43.nglObjectPtrLabel(ptr, length, label);
    }

    @Override public void glObjectPtrLabel(@NativeType("void *") long ptr, @NativeType("GLchar const *") ByteBuffer label) {
        org.lwjgl.opengl.GL43.glObjectPtrLabel(ptr, label);
    }

    @Override public void glObjectPtrLabel(@NativeType("void *") long ptr, @NativeType("GLchar const *") CharSequence label) {
        org.lwjgl.opengl.GL43.glObjectPtrLabel(ptr, label);
    }

    @Override public void nglGetObjectPtrLabel(long ptr, int bufSize, long length, long label) {
        org.lwjgl.opengl.GL43.nglGetObjectPtrLabel(ptr, bufSize, length, label);
    }

    @Override public void glGetObjectPtrLabel(@NativeType("void *") long ptr, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLchar *") ByteBuffer label) {
        org.lwjgl.opengl.GL43.glGetObjectPtrLabel(ptr, length, label);
    }

@NativeType("void")
    @Override public String glGetObjectPtrLabel(@NativeType("void *") long ptr, @NativeType("GLsizei") int bufSize) {
        return org.lwjgl.opengl.GL43.glGetObjectPtrLabel(ptr, bufSize);
    }

@NativeType("void")
    @Override public String glGetObjectPtrLabel(@NativeType("void *") long ptr) {
        return org.lwjgl.opengl.GL43.glGetObjectPtrLabel(ptr);
    }

    @Override public void glGetObjectPtrLabel(@NativeType("void *") long ptr, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLchar *") ByteBuffer label) {
        org.lwjgl.opengl.GL43.glGetObjectPtrLabel(ptr, length, label);
    }

    @Override public void glFramebufferParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        org.lwjgl.opengl.GL43.glFramebufferParameteri(target, pname, param);
    }

    @Override public void nglGetFramebufferParameteriv(int target, int pname, long params) {
        org.lwjgl.opengl.GL43.nglGetFramebufferParameteriv(target, pname, params);
    }

    @Override public void glGetFramebufferParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengl.GL43.glGetFramebufferParameteriv(target, pname, params);
    }

    @Override public void glGetFramebufferParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengl.GL43.glGetFramebufferParameteriv(target, pname, params);
    }

@NativeType("void")
    @Override public int glGetFramebufferParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL43.glGetFramebufferParameteri(target, pname);
    }

    @Override public void nglGetInternalformati64v(int target, int internalformat, int pname, int bufSize, long params) {
        org.lwjgl.opengl.GL43.nglGetInternalformati64v(target, internalformat, pname, bufSize, params);
    }

    @Override public void glGetInternalformati64v(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int pname, @NativeType("GLint64 *") LongBuffer params) {
        org.lwjgl.opengl.GL43.glGetInternalformati64v(target, internalformat, pname, params);
    }

    @Override public void glGetInternalformati64v(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int pname, @NativeType("GLint64 *") long[] params) {
        org.lwjgl.opengl.GL43.glGetInternalformati64v(target, internalformat, pname, params);
    }

@NativeType("void")
    @Override public long glGetInternalformati64(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL43.glGetInternalformati64(target, internalformat, pname);
    }

    @Override public void glInvalidateTexSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth) {
        org.lwjgl.opengl.GL43.glInvalidateTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth);
    }

    @Override public void glInvalidateTexImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level) {
        org.lwjgl.opengl.GL43.glInvalidateTexImage(texture, level);
    }

    @Override public void glInvalidateBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length) {
        org.lwjgl.opengl.GL43.glInvalidateBufferSubData(buffer, offset, length);
    }

    @Override public void glInvalidateBufferData(@NativeType("GLuint") int buffer) {
        org.lwjgl.opengl.GL43.glInvalidateBufferData(buffer);
    }

    @Override public void nglInvalidateFramebuffer(int target, int numAttachments, long attachments) {
        org.lwjgl.opengl.GL43.nglInvalidateFramebuffer(target, numAttachments, attachments);
    }

    @Override public void glInvalidateFramebuffer(@NativeType("GLenum") int target, @NativeType("GLenum const *") IntBuffer attachments) {
        org.lwjgl.opengl.GL43.glInvalidateFramebuffer(target, attachments);
    }

    @Override public void glInvalidateFramebuffer(@NativeType("GLenum") int target, @NativeType("GLenum const *") int attachment) {
        org.lwjgl.opengl.GL43.glInvalidateFramebuffer(target, attachment);
    }

    @Override public void glInvalidateFramebuffer(@NativeType("GLenum") int target, @NativeType("GLenum const *") int[] attachments) {
        org.lwjgl.opengl.GL43.glInvalidateFramebuffer(target, attachments);
    }

    @Override public void nglInvalidateSubFramebuffer(int target, int numAttachments, long attachments, int x, int y, int width, int height) {
        org.lwjgl.opengl.GL43.nglInvalidateSubFramebuffer(target, numAttachments, attachments, x, y, width, height);
    }

    @Override public void glInvalidateSubFramebuffer(@NativeType("GLenum") int target, @NativeType("GLenum const *") IntBuffer attachments, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        org.lwjgl.opengl.GL43.glInvalidateSubFramebuffer(target, attachments, x, y, width, height);
    }

    @Override public void glInvalidateSubFramebuffer(@NativeType("GLenum") int target, @NativeType("GLenum const *") int attachment, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        org.lwjgl.opengl.GL43.glInvalidateSubFramebuffer(target, attachment, x, y, width, height);
    }

    @Override public void glInvalidateSubFramebuffer(@NativeType("GLenum") int target, @NativeType("GLenum const *") int[] attachments, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        org.lwjgl.opengl.GL43.glInvalidateSubFramebuffer(target, attachments, x, y, width, height);
    }

    @Override public void nglMultiDrawArraysIndirect(int mode, long indirect, int drawcount, int stride) {
        org.lwjgl.opengl.GL43.nglMultiDrawArraysIndirect(mode, indirect, drawcount, stride);
    }

    @Override public void glMultiDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride) {
        org.lwjgl.opengl.GL43.glMultiDrawArraysIndirect(mode, indirect, drawcount, stride);
    }

    @Override public void glMultiDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") long indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride) {
        org.lwjgl.opengl.GL43.glMultiDrawArraysIndirect(mode, indirect, drawcount, stride);
    }

    @Override public void glMultiDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride) {
        org.lwjgl.opengl.GL43.glMultiDrawArraysIndirect(mode, indirect, drawcount, stride);
    }

    @Override public void glMultiDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") int[] indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride) {
        org.lwjgl.opengl.GL43.glMultiDrawArraysIndirect(mode, indirect, drawcount, stride);
    }

    @Override public void nglMultiDrawElementsIndirect(int mode, int type, long indirect, int drawcount, int stride) {
        org.lwjgl.opengl.GL43.nglMultiDrawElementsIndirect(mode, type, indirect, drawcount, stride);
    }

    @Override public void glMultiDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride) {
        org.lwjgl.opengl.GL43.glMultiDrawElementsIndirect(mode, type, indirect, drawcount, stride);
    }

    @Override public void glMultiDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") long indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride) {
        org.lwjgl.opengl.GL43.glMultiDrawElementsIndirect(mode, type, indirect, drawcount, stride);
    }

    @Override public void glMultiDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride) {
        org.lwjgl.opengl.GL43.glMultiDrawElementsIndirect(mode, type, indirect, drawcount, stride);
    }

    @Override public void glMultiDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") int[] indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride) {
        org.lwjgl.opengl.GL43.glMultiDrawElementsIndirect(mode, type, indirect, drawcount, stride);
    }

    @Override public void nglGetProgramInterfaceiv(int program, int programInterface, int pname, long params) {
        org.lwjgl.opengl.GL43.nglGetProgramInterfaceiv(program, programInterface, pname, params);
    }

    @Override public void glGetProgramInterfaceiv(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengl.GL43.glGetProgramInterfaceiv(program, programInterface, pname, params);
    }

    @Override public void glGetProgramInterfaceiv(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengl.GL43.glGetProgramInterfaceiv(program, programInterface, pname, params);
    }

@NativeType("void")
    @Override public int glGetProgramInterfacei(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL43.glGetProgramInterfacei(program, programInterface, pname);
    }

    @Override public int nglGetProgramResourceIndex(int program, int programInterface, long name) {
        return org.lwjgl.opengl.GL43.nglGetProgramResourceIndex(program, programInterface, name);
    }

@NativeType("GLuint")
    @Override public int glGetProgramResourceIndex(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") ByteBuffer name) {
        return org.lwjgl.opengl.GL43.glGetProgramResourceIndex(program, programInterface, name);
    }

@NativeType("GLuint")
    @Override public int glGetProgramResourceIndex(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") CharSequence name) {
        return org.lwjgl.opengl.GL43.glGetProgramResourceIndex(program, programInterface, name);
    }

    @Override public void nglGetProgramResourceName(int program, int programInterface, int index, int bufSize, long length, long name) {
        org.lwjgl.opengl.GL43.nglGetProgramResourceName(program, programInterface, index, bufSize, length, name);
    }

    @Override public void glGetProgramResourceName(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLchar *") ByteBuffer name) {
        org.lwjgl.opengl.GL43.glGetProgramResourceName(program, programInterface, index, length, name);
    }

@NativeType("void")
    @Override public String glGetProgramResourceName(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index, @NativeType("GLsizei") int bufSize) {
        return org.lwjgl.opengl.GL43.glGetProgramResourceName(program, programInterface, index, bufSize);
    }

@NativeType("void")
    @Override public String glGetProgramResourceName(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index) {
        return org.lwjgl.opengl.GL43.glGetProgramResourceName(program, programInterface, index);
    }

    @Override public void glGetProgramResourceName(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLchar *") ByteBuffer name) {
        org.lwjgl.opengl.GL43.glGetProgramResourceName(program, programInterface, index, length, name);
    }

    @Override public void nglGetProgramResourceiv(int program, int programInterface, int index, int propCount, long props, int bufSize, long length, long params) {
        org.lwjgl.opengl.GL43.nglGetProgramResourceiv(program, programInterface, index, propCount, props, bufSize, length, params);
    }

    @Override public void glGetProgramResourceiv(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index, @NativeType("GLenum const *") IntBuffer props, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengl.GL43.glGetProgramResourceiv(program, programInterface, index, props, length, params);
    }

    @Override public void glGetProgramResourceiv(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index, @NativeType("GLenum const *") int[] props, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengl.GL43.glGetProgramResourceiv(program, programInterface, index, props, length, params);
    }

    @Override public int nglGetProgramResourceLocation(int program, int programInterface, long name) {
        return org.lwjgl.opengl.GL43.nglGetProgramResourceLocation(program, programInterface, name);
    }

@NativeType("GLint")
    @Override public int glGetProgramResourceLocation(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") ByteBuffer name) {
        return org.lwjgl.opengl.GL43.glGetProgramResourceLocation(program, programInterface, name);
    }

@NativeType("GLint")
    @Override public int glGetProgramResourceLocation(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") CharSequence name) {
        return org.lwjgl.opengl.GL43.glGetProgramResourceLocation(program, programInterface, name);
    }

    @Override public int nglGetProgramResourceLocationIndex(int program, int programInterface, long name) {
        return org.lwjgl.opengl.GL43.nglGetProgramResourceLocationIndex(program, programInterface, name);
    }

@NativeType("GLint")
    @Override public int glGetProgramResourceLocationIndex(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") ByteBuffer name) {
        return org.lwjgl.opengl.GL43.glGetProgramResourceLocationIndex(program, programInterface, name);
    }

@NativeType("GLint")
    @Override public int glGetProgramResourceLocationIndex(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") CharSequence name) {
        return org.lwjgl.opengl.GL43.glGetProgramResourceLocationIndex(program, programInterface, name);
    }

    @Override public void glShaderStorageBlockBinding(@NativeType("GLuint") int program, @NativeType("GLuint") int storageBlockIndex, @NativeType("GLuint") int storageBlockBinding) {
        org.lwjgl.opengl.GL43.glShaderStorageBlockBinding(program, storageBlockIndex, storageBlockBinding);
    }

    @Override public void glTexBufferRange(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size) {
        org.lwjgl.opengl.GL43.glTexBufferRange(target, internalformat, buffer, offset, size);
    }

    @Override public void glTexStorage2DMultisample(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLboolean") boolean fixedsamplelocations) {
        org.lwjgl.opengl.GL43.glTexStorage2DMultisample(target, samples, internalformat, width, height, fixedsamplelocations);
    }

    @Override public void glTexStorage3DMultisample(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLboolean") boolean fixedsamplelocations) {
        org.lwjgl.opengl.GL43.glTexStorage3DMultisample(target, samples, internalformat, width, height, depth, fixedsamplelocations);
    }

    @Override public void glTextureView(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLuint") int origtexture, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int minlevel, @NativeType("GLuint") int numlevels, @NativeType("GLuint") int minlayer, @NativeType("GLuint") int numlayers) {
        org.lwjgl.opengl.GL43.glTextureView(texture, target, origtexture, internalformat, minlevel, numlevels, minlayer, numlayers);
    }

    @Override public void glBindVertexBuffer(@NativeType("GLuint") int bindingindex, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizei") int stride) {
        org.lwjgl.opengl.GL43.glBindVertexBuffer(bindingindex, buffer, offset, stride);
    }

    @Override public void glVertexAttribFormat(@NativeType("GLuint") int attribindex, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int relativeoffset) {
        org.lwjgl.opengl.GL43.glVertexAttribFormat(attribindex, size, type, normalized, relativeoffset);
    }

    @Override public void glVertexAttribIFormat(@NativeType("GLuint") int attribindex, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLuint") int relativeoffset) {
        org.lwjgl.opengl.GL43.glVertexAttribIFormat(attribindex, size, type, relativeoffset);
    }

    @Override public void glVertexAttribLFormat(@NativeType("GLuint") int attribindex, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLuint") int relativeoffset) {
        org.lwjgl.opengl.GL43.glVertexAttribLFormat(attribindex, size, type, relativeoffset);
    }

    @Override public void glVertexAttribBinding(@NativeType("GLuint") int attribindex, @NativeType("GLuint") int bindingindex) {
        org.lwjgl.opengl.GL43.glVertexAttribBinding(attribindex, bindingindex);
    }

    @Override public void glVertexBindingDivisor(@NativeType("GLuint") int bindingindex, @NativeType("GLuint") int divisor) {
        org.lwjgl.opengl.GL43.glVertexBindingDivisor(bindingindex, divisor);
    }

}
