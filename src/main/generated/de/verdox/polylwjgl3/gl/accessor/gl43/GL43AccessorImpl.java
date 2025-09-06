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

    @Override public void glClearBufferData(int target, int internalformat, int format, int type, @Nullable ByteBuffer data) {
        org.lwjgl.opengl.GL43.glClearBufferData(target, internalformat, format, type, data);
    }

    @Override public void glClearBufferData(int target, int internalformat, int format, int type, @Nullable ShortBuffer data) {
        org.lwjgl.opengl.GL43.glClearBufferData(target, internalformat, format, type, data);
    }

    @Override public void glClearBufferData(int target, int internalformat, int format, int type, @Nullable IntBuffer data) {
        org.lwjgl.opengl.GL43.glClearBufferData(target, internalformat, format, type, data);
    }

    @Override public void glClearBufferData(int target, int internalformat, int format, int type, @Nullable FloatBuffer data) {
        org.lwjgl.opengl.GL43.glClearBufferData(target, internalformat, format, type, data);
    }

    @Override public void glClearBufferData(int target, int internalformat, int format, int type, @Nullable short[] data) {
        org.lwjgl.opengl.GL43.glClearBufferData(target, internalformat, format, type, data);
    }

    @Override public void glClearBufferData(int target, int internalformat, int format, int type, @Nullable int[] data) {
        org.lwjgl.opengl.GL43.glClearBufferData(target, internalformat, format, type, data);
    }

    @Override public void glClearBufferData(int target, int internalformat, int format, int type, @Nullable float[] data) {
        org.lwjgl.opengl.GL43.glClearBufferData(target, internalformat, format, type, data);
    }

    @Override public void nglClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, long data) {
        org.lwjgl.opengl.GL43.nglClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    @Override public void glClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, @Nullable ByteBuffer data) {
        org.lwjgl.opengl.GL43.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    @Override public void glClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, @Nullable ShortBuffer data) {
        org.lwjgl.opengl.GL43.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    @Override public void glClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, @Nullable IntBuffer data) {
        org.lwjgl.opengl.GL43.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    @Override public void glClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, @Nullable FloatBuffer data) {
        org.lwjgl.opengl.GL43.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    @Override public void glClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, @Nullable short[] data) {
        org.lwjgl.opengl.GL43.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    @Override public void glClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, @Nullable int[] data) {
        org.lwjgl.opengl.GL43.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    @Override public void glClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, @Nullable float[] data) {
        org.lwjgl.opengl.GL43.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    @Override public void glDispatchCompute(int num_groups_x, int num_groups_y, int num_groups_z) {
        org.lwjgl.opengl.GL43.glDispatchCompute(num_groups_x, num_groups_y, num_groups_z);
    }

    @Override public void glDispatchComputeIndirect(long indirect) {
        org.lwjgl.opengl.GL43.glDispatchComputeIndirect(indirect);
    }

    @Override public void glCopyImageSubData(int srcName, int srcTarget, int srcLevel, int srcX, int srcY, int srcZ, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int srcWidth, int srcHeight, int srcDepth) {
        org.lwjgl.opengl.GL43.glCopyImageSubData(srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, srcWidth, srcHeight, srcDepth);
    }

    @Override public void nglDebugMessageControl(int source, int type, int severity, int count, long ids, boolean enabled) {
        org.lwjgl.opengl.GL43.nglDebugMessageControl(source, type, severity, count, ids, enabled);
    }

    @Override public void glDebugMessageControl(int source, int type, int severity, @Nullable IntBuffer ids, boolean enabled) {
        org.lwjgl.opengl.GL43.glDebugMessageControl(source, type, severity, ids, enabled);
    }

    @Override public void glDebugMessageControl(int source, int type, int severity, int id, boolean enabled) {
        org.lwjgl.opengl.GL43.glDebugMessageControl(source, type, severity, id, enabled);
    }

    @Override public void glDebugMessageControl(int source, int type, int severity, @Nullable int[] ids, boolean enabled) {
        org.lwjgl.opengl.GL43.glDebugMessageControl(source, type, severity, ids, enabled);
    }

    @Override public void nglDebugMessageInsert(int source, int type, int id, int severity, int length, long message) {
        org.lwjgl.opengl.GL43.nglDebugMessageInsert(source, type, id, severity, length, message);
    }

    @Override public void glDebugMessageInsert(int source, int type, int id, int severity, ByteBuffer message) {
        org.lwjgl.opengl.GL43.glDebugMessageInsert(source, type, id, severity, message);
    }

    @Override public void glDebugMessageInsert(int source, int type, int id, int severity, CharSequence message) {
        org.lwjgl.opengl.GL43.glDebugMessageInsert(source, type, id, severity, message);
    }

    @Override public void nglDebugMessageCallback(long callback, long userParam) {
        org.lwjgl.opengl.GL43.nglDebugMessageCallback(callback, userParam);
    }

    @Override public void glDebugMessageCallback(@Nullable GLDebugMessageCallbackI callback, long userParam) {
        org.lwjgl.opengl.GL43.glDebugMessageCallback(callback, userParam);
    }

    @Override public int nglGetDebugMessageLog(int count, int bufsize, long sources, long types, long ids, long severities, long lengths, long messageLog) {
        return org.lwjgl.opengl.GL43.nglGetDebugMessageLog(count, bufsize, sources, types, ids, severities, lengths, messageLog);
    }

    @Override public int glGetDebugMessageLog(int count, @Nullable IntBuffer sources, @Nullable IntBuffer types, @Nullable IntBuffer ids, @Nullable IntBuffer severities, @Nullable IntBuffer lengths, @Nullable ByteBuffer messageLog) {
        return org.lwjgl.opengl.GL43.glGetDebugMessageLog(count, sources, types, ids, severities, lengths, messageLog);
    }

    @Override public int glGetDebugMessageLog(int count, @Nullable int[] sources, @Nullable int[] types, @Nullable int[] ids, @Nullable int[] severities, @Nullable int[] lengths, @Nullable ByteBuffer messageLog) {
        return org.lwjgl.opengl.GL43.glGetDebugMessageLog(count, sources, types, ids, severities, lengths, messageLog);
    }

    @Override public void nglPushDebugGroup(int source, int id, int length, long message) {
        org.lwjgl.opengl.GL43.nglPushDebugGroup(source, id, length, message);
    }

    @Override public void glPushDebugGroup(int source, int id, ByteBuffer message) {
        org.lwjgl.opengl.GL43.glPushDebugGroup(source, id, message);
    }

    @Override public void glPushDebugGroup(int source, int id, CharSequence message) {
        org.lwjgl.opengl.GL43.glPushDebugGroup(source, id, message);
    }

    @Override public void glPopDebugGroup() {
        org.lwjgl.opengl.GL43.glPopDebugGroup();
    }

    @Override public void nglObjectLabel(int identifier, int name, int length, long label) {
        org.lwjgl.opengl.GL43.nglObjectLabel(identifier, name, length, label);
    }

    @Override public void glObjectLabel(int identifier, int name, ByteBuffer label) {
        org.lwjgl.opengl.GL43.glObjectLabel(identifier, name, label);
    }

    @Override public void glObjectLabel(int identifier, int name, CharSequence label) {
        org.lwjgl.opengl.GL43.glObjectLabel(identifier, name, label);
    }

    @Override public void nglGetObjectLabel(int identifier, int name, int bufSize, long length, long label) {
        org.lwjgl.opengl.GL43.nglGetObjectLabel(identifier, name, bufSize, length, label);
    }

    @Override public void glGetObjectLabel(int identifier, int name, @Nullable IntBuffer length, ByteBuffer label) {
        org.lwjgl.opengl.GL43.glGetObjectLabel(identifier, name, length, label);
    }

    @Override public String glGetObjectLabel(int identifier, int name, int bufSize) {
        return org.lwjgl.opengl.GL43.glGetObjectLabel(identifier, name, bufSize);
    }

    @Override public String glGetObjectLabel(int identifier, int name) {
        return org.lwjgl.opengl.GL43.glGetObjectLabel(identifier, name);
    }

    @Override public void glGetObjectLabel(int identifier, int name, @Nullable int[] length, ByteBuffer label) {
        org.lwjgl.opengl.GL43.glGetObjectLabel(identifier, name, length, label);
    }

    @Override public void nglObjectPtrLabel(long ptr, int length, long label) {
        org.lwjgl.opengl.GL43.nglObjectPtrLabel(ptr, length, label);
    }

    @Override public void glObjectPtrLabel(long ptr, ByteBuffer label) {
        org.lwjgl.opengl.GL43.glObjectPtrLabel(ptr, label);
    }

    @Override public void glObjectPtrLabel(long ptr, CharSequence label) {
        org.lwjgl.opengl.GL43.glObjectPtrLabel(ptr, label);
    }

    @Override public void nglGetObjectPtrLabel(long ptr, int bufSize, long length, long label) {
        org.lwjgl.opengl.GL43.nglGetObjectPtrLabel(ptr, bufSize, length, label);
    }

    @Override public void glGetObjectPtrLabel(long ptr, @Nullable IntBuffer length, ByteBuffer label) {
        org.lwjgl.opengl.GL43.glGetObjectPtrLabel(ptr, length, label);
    }

    @Override public String glGetObjectPtrLabel(long ptr, int bufSize) {
        return org.lwjgl.opengl.GL43.glGetObjectPtrLabel(ptr, bufSize);
    }

    @Override public String glGetObjectPtrLabel(long ptr) {
        return org.lwjgl.opengl.GL43.glGetObjectPtrLabel(ptr);
    }

    @Override public void glGetObjectPtrLabel(long ptr, @Nullable int[] length, ByteBuffer label) {
        org.lwjgl.opengl.GL43.glGetObjectPtrLabel(ptr, length, label);
    }

    @Override public void glFramebufferParameteri(int target, int pname, int param) {
        org.lwjgl.opengl.GL43.glFramebufferParameteri(target, pname, param);
    }

    @Override public void nglGetFramebufferParameteriv(int target, int pname, long params) {
        org.lwjgl.opengl.GL43.nglGetFramebufferParameteriv(target, pname, params);
    }

    @Override public void glGetFramebufferParameteriv(int target, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL43.glGetFramebufferParameteriv(target, pname, params);
    }

    @Override public void glGetFramebufferParameteriv(int target, int pname, int[] params) {
        org.lwjgl.opengl.GL43.glGetFramebufferParameteriv(target, pname, params);
    }

    @Override public int glGetFramebufferParameteri(int target, int pname) {
        return org.lwjgl.opengl.GL43.glGetFramebufferParameteri(target, pname);
    }

    @Override public void nglGetInternalformati64v(int target, int internalformat, int pname, int bufSize, long params) {
        org.lwjgl.opengl.GL43.nglGetInternalformati64v(target, internalformat, pname, bufSize, params);
    }

    @Override public void glGetInternalformati64v(int target, int internalformat, int pname, LongBuffer params) {
        org.lwjgl.opengl.GL43.glGetInternalformati64v(target, internalformat, pname, params);
    }

    @Override public void glGetInternalformati64v(int target, int internalformat, int pname, long[] params) {
        org.lwjgl.opengl.GL43.glGetInternalformati64v(target, internalformat, pname, params);
    }

    @Override public long glGetInternalformati64(int target, int internalformat, int pname) {
        return org.lwjgl.opengl.GL43.glGetInternalformati64(target, internalformat, pname);
    }

    @Override public void glInvalidateTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth) {
        org.lwjgl.opengl.GL43.glInvalidateTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth);
    }

    @Override public void glInvalidateTexImage(int texture, int level) {
        org.lwjgl.opengl.GL43.glInvalidateTexImage(texture, level);
    }

    @Override public void glInvalidateBufferSubData(int buffer, long offset, long length) {
        org.lwjgl.opengl.GL43.glInvalidateBufferSubData(buffer, offset, length);
    }

    @Override public void glInvalidateBufferData(int buffer) {
        org.lwjgl.opengl.GL43.glInvalidateBufferData(buffer);
    }

    @Override public void nglInvalidateFramebuffer(int target, int numAttachments, long attachments) {
        org.lwjgl.opengl.GL43.nglInvalidateFramebuffer(target, numAttachments, attachments);
    }

    @Override public void glInvalidateFramebuffer(int target, IntBuffer attachments) {
        org.lwjgl.opengl.GL43.glInvalidateFramebuffer(target, attachments);
    }

    @Override public void glInvalidateFramebuffer(int target, int attachment) {
        org.lwjgl.opengl.GL43.glInvalidateFramebuffer(target, attachment);
    }

    @Override public void glInvalidateFramebuffer(int target, int[] attachments) {
        org.lwjgl.opengl.GL43.glInvalidateFramebuffer(target, attachments);
    }

    @Override public void nglInvalidateSubFramebuffer(int target, int numAttachments, long attachments, int x, int y, int width, int height) {
        org.lwjgl.opengl.GL43.nglInvalidateSubFramebuffer(target, numAttachments, attachments, x, y, width, height);
    }

    @Override public void glInvalidateSubFramebuffer(int target, IntBuffer attachments, int x, int y, int width, int height) {
        org.lwjgl.opengl.GL43.glInvalidateSubFramebuffer(target, attachments, x, y, width, height);
    }

    @Override public void glInvalidateSubFramebuffer(int target, int attachment, int x, int y, int width, int height) {
        org.lwjgl.opengl.GL43.glInvalidateSubFramebuffer(target, attachment, x, y, width, height);
    }

    @Override public void glInvalidateSubFramebuffer(int target, int[] attachments, int x, int y, int width, int height) {
        org.lwjgl.opengl.GL43.glInvalidateSubFramebuffer(target, attachments, x, y, width, height);
    }

    @Override public void nglMultiDrawArraysIndirect(int mode, long indirect, int drawcount, int stride) {
        org.lwjgl.opengl.GL43.nglMultiDrawArraysIndirect(mode, indirect, drawcount, stride);
    }

    @Override public void glMultiDrawArraysIndirect(int mode, ByteBuffer indirect, int drawcount, int stride) {
        org.lwjgl.opengl.GL43.glMultiDrawArraysIndirect(mode, indirect, drawcount, stride);
    }

    @Override public void glMultiDrawArraysIndirect(int mode, long indirect, int drawcount, int stride) {
        org.lwjgl.opengl.GL43.glMultiDrawArraysIndirect(mode, indirect, drawcount, stride);
    }

    @Override public void glMultiDrawArraysIndirect(int mode, IntBuffer indirect, int drawcount, int stride) {
        org.lwjgl.opengl.GL43.glMultiDrawArraysIndirect(mode, indirect, drawcount, stride);
    }

    @Override public void glMultiDrawArraysIndirect(int mode, int[] indirect, int drawcount, int stride) {
        org.lwjgl.opengl.GL43.glMultiDrawArraysIndirect(mode, indirect, drawcount, stride);
    }

    @Override public void nglMultiDrawElementsIndirect(int mode, int type, long indirect, int drawcount, int stride) {
        org.lwjgl.opengl.GL43.nglMultiDrawElementsIndirect(mode, type, indirect, drawcount, stride);
    }

    @Override public void glMultiDrawElementsIndirect(int mode, int type, ByteBuffer indirect, int drawcount, int stride) {
        org.lwjgl.opengl.GL43.glMultiDrawElementsIndirect(mode, type, indirect, drawcount, stride);
    }

    @Override public void glMultiDrawElementsIndirect(int mode, int type, long indirect, int drawcount, int stride) {
        org.lwjgl.opengl.GL43.glMultiDrawElementsIndirect(mode, type, indirect, drawcount, stride);
    }

    @Override public void glMultiDrawElementsIndirect(int mode, int type, IntBuffer indirect, int drawcount, int stride) {
        org.lwjgl.opengl.GL43.glMultiDrawElementsIndirect(mode, type, indirect, drawcount, stride);
    }

    @Override public void glMultiDrawElementsIndirect(int mode, int type, int[] indirect, int drawcount, int stride) {
        org.lwjgl.opengl.GL43.glMultiDrawElementsIndirect(mode, type, indirect, drawcount, stride);
    }

    @Override public void nglGetProgramInterfaceiv(int program, int programInterface, int pname, long params) {
        org.lwjgl.opengl.GL43.nglGetProgramInterfaceiv(program, programInterface, pname, params);
    }

    @Override public void glGetProgramInterfaceiv(int program, int programInterface, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL43.glGetProgramInterfaceiv(program, programInterface, pname, params);
    }

    @Override public void glGetProgramInterfaceiv(int program, int programInterface, int pname, int[] params) {
        org.lwjgl.opengl.GL43.glGetProgramInterfaceiv(program, programInterface, pname, params);
    }

    @Override public int glGetProgramInterfacei(int program, int programInterface, int pname) {
        return org.lwjgl.opengl.GL43.glGetProgramInterfacei(program, programInterface, pname);
    }

    @Override public int nglGetProgramResourceIndex(int program, int programInterface, long name) {
        return org.lwjgl.opengl.GL43.nglGetProgramResourceIndex(program, programInterface, name);
    }

    @Override public int glGetProgramResourceIndex(int program, int programInterface, ByteBuffer name) {
        return org.lwjgl.opengl.GL43.glGetProgramResourceIndex(program, programInterface, name);
    }

    @Override public int glGetProgramResourceIndex(int program, int programInterface, CharSequence name) {
        return org.lwjgl.opengl.GL43.glGetProgramResourceIndex(program, programInterface, name);
    }

    @Override public void nglGetProgramResourceName(int program, int programInterface, int index, int bufSize, long length, long name) {
        org.lwjgl.opengl.GL43.nglGetProgramResourceName(program, programInterface, index, bufSize, length, name);
    }

    @Override public void glGetProgramResourceName(int program, int programInterface, int index, @Nullable IntBuffer length, ByteBuffer name) {
        org.lwjgl.opengl.GL43.glGetProgramResourceName(program, programInterface, index, length, name);
    }

    @Override public String glGetProgramResourceName(int program, int programInterface, int index, int bufSize) {
        return org.lwjgl.opengl.GL43.glGetProgramResourceName(program, programInterface, index, bufSize);
    }

    @Override public String glGetProgramResourceName(int program, int programInterface, int index) {
        return org.lwjgl.opengl.GL43.glGetProgramResourceName(program, programInterface, index);
    }

    @Override public void glGetProgramResourceName(int program, int programInterface, int index, @Nullable int[] length, ByteBuffer name) {
        org.lwjgl.opengl.GL43.glGetProgramResourceName(program, programInterface, index, length, name);
    }

    @Override public void nglGetProgramResourceiv(int program, int programInterface, int index, int propCount, long props, int bufSize, long length, long params) {
        org.lwjgl.opengl.GL43.nglGetProgramResourceiv(program, programInterface, index, propCount, props, bufSize, length, params);
    }

    @Override public void glGetProgramResourceiv(int program, int programInterface, int index, IntBuffer props, @Nullable IntBuffer length, IntBuffer params) {
        org.lwjgl.opengl.GL43.glGetProgramResourceiv(program, programInterface, index, props, length, params);
    }

    @Override public void glGetProgramResourceiv(int program, int programInterface, int index, int[] props, @Nullable int[] length, int[] params) {
        org.lwjgl.opengl.GL43.glGetProgramResourceiv(program, programInterface, index, props, length, params);
    }

    @Override public int nglGetProgramResourceLocation(int program, int programInterface, long name) {
        return org.lwjgl.opengl.GL43.nglGetProgramResourceLocation(program, programInterface, name);
    }

    @Override public int glGetProgramResourceLocation(int program, int programInterface, ByteBuffer name) {
        return org.lwjgl.opengl.GL43.glGetProgramResourceLocation(program, programInterface, name);
    }

    @Override public int glGetProgramResourceLocation(int program, int programInterface, CharSequence name) {
        return org.lwjgl.opengl.GL43.glGetProgramResourceLocation(program, programInterface, name);
    }

    @Override public int nglGetProgramResourceLocationIndex(int program, int programInterface, long name) {
        return org.lwjgl.opengl.GL43.nglGetProgramResourceLocationIndex(program, programInterface, name);
    }

    @Override public int glGetProgramResourceLocationIndex(int program, int programInterface, ByteBuffer name) {
        return org.lwjgl.opengl.GL43.glGetProgramResourceLocationIndex(program, programInterface, name);
    }

    @Override public int glGetProgramResourceLocationIndex(int program, int programInterface, CharSequence name) {
        return org.lwjgl.opengl.GL43.glGetProgramResourceLocationIndex(program, programInterface, name);
    }

    @Override public void glShaderStorageBlockBinding(int program, int storageBlockIndex, int storageBlockBinding) {
        org.lwjgl.opengl.GL43.glShaderStorageBlockBinding(program, storageBlockIndex, storageBlockBinding);
    }

    @Override public void glTexBufferRange(int target, int internalformat, int buffer, long offset, long size) {
        org.lwjgl.opengl.GL43.glTexBufferRange(target, internalformat, buffer, offset, size);
    }

    @Override public void glTexStorage2DMultisample(int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations) {
        org.lwjgl.opengl.GL43.glTexStorage2DMultisample(target, samples, internalformat, width, height, fixedsamplelocations);
    }

    @Override public void glTexStorage3DMultisample(int target, int samples, int internalformat, int width, int height, int depth, boolean fixedsamplelocations) {
        org.lwjgl.opengl.GL43.glTexStorage3DMultisample(target, samples, internalformat, width, height, depth, fixedsamplelocations);
    }

    @Override public void glTextureView(int texture, int target, int origtexture, int internalformat, int minlevel, int numlevels, int minlayer, int numlayers) {
        org.lwjgl.opengl.GL43.glTextureView(texture, target, origtexture, internalformat, minlevel, numlevels, minlayer, numlayers);
    }

    @Override public void glBindVertexBuffer(int bindingindex, int buffer, long offset, int stride) {
        org.lwjgl.opengl.GL43.glBindVertexBuffer(bindingindex, buffer, offset, stride);
    }

    @Override public void glVertexAttribFormat(int attribindex, int size, int type, boolean normalized, int relativeoffset) {
        org.lwjgl.opengl.GL43.glVertexAttribFormat(attribindex, size, type, normalized, relativeoffset);
    }

    @Override public void glVertexAttribIFormat(int attribindex, int size, int type, int relativeoffset) {
        org.lwjgl.opengl.GL43.glVertexAttribIFormat(attribindex, size, type, relativeoffset);
    }

    @Override public void glVertexAttribLFormat(int attribindex, int size, int type, int relativeoffset) {
        org.lwjgl.opengl.GL43.glVertexAttribLFormat(attribindex, size, type, relativeoffset);
    }

    @Override public void glVertexAttribBinding(int attribindex, int bindingindex) {
        org.lwjgl.opengl.GL43.glVertexAttribBinding(attribindex, bindingindex);
    }

    @Override public void glVertexBindingDivisor(int bindingindex, int divisor) {
        org.lwjgl.opengl.GL43.glVertexBindingDivisor(bindingindex, divisor);
    }

}
