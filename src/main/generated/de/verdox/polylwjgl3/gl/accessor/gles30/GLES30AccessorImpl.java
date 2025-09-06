package de.verdox.polylwjgl3.gl.accessor.gles30;

import de.verdox.polylwjgl3.gl.accessor.gles20.GLES20Accessor;
import de.verdox.polylwjgl3.gl.accessor.gles20.GLES20AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengles.GLES30;
import org.lwjgl.system.*;
import org.lwjgl.system.APIUtil.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public class GLES30AccessorImpl extends GLES20AccessorImpl implements GLES30Accessor {

    @Override public void glReadBuffer(int src) {
        org.lwjgl.opengles.GLES30.glReadBuffer(src);
    }

    @Override public void nglDrawRangeElements(int mode, int start, int end, int count, int type, long indices) {
        org.lwjgl.opengles.GLES30.nglDrawRangeElements(mode, start, end, count, type, indices);
    }

    @Override public void glDrawRangeElements(int mode, int start, int end, int count, int type, long indices) {
        org.lwjgl.opengles.GLES30.glDrawRangeElements(mode, start, end, count, type, indices);
    }

    @Override public void glDrawRangeElements(int mode, int start, int end, int type, ByteBuffer indices) {
        org.lwjgl.opengles.GLES30.glDrawRangeElements(mode, start, end, type, indices);
    }

    @Override public void glDrawRangeElements(int mode, int start, int end, ByteBuffer indices) {
        org.lwjgl.opengles.GLES30.glDrawRangeElements(mode, start, end, indices);
    }

    @Override public void glDrawRangeElements(int mode, int start, int end, ShortBuffer indices) {
        org.lwjgl.opengles.GLES30.glDrawRangeElements(mode, start, end, indices);
    }

    @Override public void glDrawRangeElements(int mode, int start, int end, IntBuffer indices) {
        org.lwjgl.opengles.GLES30.glDrawRangeElements(mode, start, end, indices);
    }

    @Override public void nglTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixels) {
        org.lwjgl.opengles.GLES30.nglTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    @Override public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, @Nullable ByteBuffer pixels) {
        org.lwjgl.opengles.GLES30.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    @Override public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixels) {
        org.lwjgl.opengles.GLES30.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    @Override public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, @Nullable ShortBuffer pixels) {
        org.lwjgl.opengles.GLES30.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    @Override public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, @Nullable IntBuffer pixels) {
        org.lwjgl.opengles.GLES30.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    @Override public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, @Nullable FloatBuffer pixels) {
        org.lwjgl.opengles.GLES30.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    @Override public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, @Nullable short[] pixels) {
        org.lwjgl.opengles.GLES30.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    @Override public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, @Nullable int[] pixels) {
        org.lwjgl.opengles.GLES30.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    @Override public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, @Nullable float[] pixels) {
        org.lwjgl.opengles.GLES30.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    @Override public void nglTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels) {
        org.lwjgl.opengles.GLES30.nglTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ByteBuffer pixels) {
        org.lwjgl.opengles.GLES30.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels) {
        org.lwjgl.opengles.GLES30.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ShortBuffer pixels) {
        org.lwjgl.opengles.GLES30.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, IntBuffer pixels) {
        org.lwjgl.opengles.GLES30.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, FloatBuffer pixels) {
        org.lwjgl.opengles.GLES30.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, short[] pixels) {
        org.lwjgl.opengles.GLES30.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int[] pixels) {
        org.lwjgl.opengles.GLES30.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, float[] pixels) {
        org.lwjgl.opengles.GLES30.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glCopyTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height) {
        org.lwjgl.opengles.GLES30.glCopyTexSubImage3D(target, level, xoffset, yoffset, zoffset, x, y, width, height);
    }

    @Override public void nglCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data) {
        org.lwjgl.opengles.GLES30.nglCompressedTexImage3D(target, level, internalformat, width, height, depth, border, imageSize, data);
    }

    @Override public void glCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data) {
        org.lwjgl.opengles.GLES30.glCompressedTexImage3D(target, level, internalformat, width, height, depth, border, imageSize, data);
    }

    @Override public void glCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, @Nullable ByteBuffer data) {
        org.lwjgl.opengles.GLES30.glCompressedTexImage3D(target, level, internalformat, width, height, depth, border, data);
    }

    @Override public void nglCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data) {
        org.lwjgl.opengles.GLES30.nglCompressedTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
    }

    @Override public void glCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data) {
        org.lwjgl.opengles.GLES30.glCompressedTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
    }

    @Override public void glCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, ByteBuffer data) {
        org.lwjgl.opengles.GLES30.glCompressedTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, data);
    }

    @Override public void nglGenQueries(int n, long ids) {
        org.lwjgl.opengles.GLES30.nglGenQueries(n, ids);
    }

    @Override public void glGenQueries(IntBuffer ids) {
        org.lwjgl.opengles.GLES30.glGenQueries(ids);
    }

    @Override public int glGenQueries() {
        return org.lwjgl.opengles.GLES30.glGenQueries();
    }

    @Override public void glGenQueries(int[] ids) {
        org.lwjgl.opengles.GLES30.glGenQueries(ids);
    }

    @Override public void nglDeleteQueries(int n, long ids) {
        org.lwjgl.opengles.GLES30.nglDeleteQueries(n, ids);
    }

    @Override public void glDeleteQueries(IntBuffer ids) {
        org.lwjgl.opengles.GLES30.glDeleteQueries(ids);
    }

    @Override public void glDeleteQueries(int id) {
        org.lwjgl.opengles.GLES30.glDeleteQueries(id);
    }

    @Override public void glDeleteQueries(int[] ids) {
        org.lwjgl.opengles.GLES30.glDeleteQueries(ids);
    }

    @Override public boolean glIsQuery(int id) {
        return org.lwjgl.opengles.GLES30.glIsQuery(id);
    }

    @Override public void glBeginQuery(int target, int id) {
        org.lwjgl.opengles.GLES30.glBeginQuery(target, id);
    }

    @Override public void glEndQuery(int target) {
        org.lwjgl.opengles.GLES30.glEndQuery(target);
    }

    @Override public void nglGetQueryiv(int target, int pname, long params) {
        org.lwjgl.opengles.GLES30.nglGetQueryiv(target, pname, params);
    }

    @Override public void glGetQueryiv(int target, int pname, IntBuffer params) {
        org.lwjgl.opengles.GLES30.glGetQueryiv(target, pname, params);
    }

    @Override public void glGetQueryiv(int target, int pname, int[] params) {
        org.lwjgl.opengles.GLES30.glGetQueryiv(target, pname, params);
    }

    @Override public int glGetQueryi(int target, int pname) {
        return org.lwjgl.opengles.GLES30.glGetQueryi(target, pname);
    }

    @Override public void nglGetQueryObjectuiv(int id, int pname, long params) {
        org.lwjgl.opengles.GLES30.nglGetQueryObjectuiv(id, pname, params);
    }

    @Override public void glGetQueryObjectuiv(int id, int pname, IntBuffer params) {
        org.lwjgl.opengles.GLES30.glGetQueryObjectuiv(id, pname, params);
    }

    @Override public void glGetQueryObjectuiv(int id, int pname, int[] params) {
        org.lwjgl.opengles.GLES30.glGetQueryObjectuiv(id, pname, params);
    }

    @Override public int glGetQueryObjectui(int id, int pname) {
        return org.lwjgl.opengles.GLES30.glGetQueryObjectui(id, pname);
    }

    @Override public boolean glUnmapBuffer(int target) {
        return org.lwjgl.opengles.GLES30.glUnmapBuffer(target);
    }

    @Override public void nglGetBufferPointerv(int target, int pname, long params) {
        org.lwjgl.opengles.GLES30.nglGetBufferPointerv(target, pname, params);
    }

    @Override public void glGetBufferPointerv(int target, int pname, PointerBuffer params) {
        org.lwjgl.opengles.GLES30.glGetBufferPointerv(target, pname, params);
    }

    @Override public long glGetBufferPointer(int target, int pname) {
        return org.lwjgl.opengles.GLES30.glGetBufferPointer(target, pname);
    }

    @Override public void nglDrawBuffers(int n, long bufs) {
        org.lwjgl.opengles.GLES30.nglDrawBuffers(n, bufs);
    }

    @Override public void glDrawBuffers(IntBuffer bufs) {
        org.lwjgl.opengles.GLES30.glDrawBuffers(bufs);
    }

    @Override public void glDrawBuffers(int buf) {
        org.lwjgl.opengles.GLES30.glDrawBuffers(buf);
    }

    @Override public void glDrawBuffers(int[] bufs) {
        org.lwjgl.opengles.GLES30.glDrawBuffers(bufs);
    }

    @Override public void nglUniformMatrix2x3fv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengles.GLES30.nglUniformMatrix2x3fv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix2x3fv(int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengles.GLES30.glUniformMatrix2x3fv(location, transpose, value);
    }

    @Override public void glUniformMatrix2x3fv(int location, boolean transpose, float[] value) {
        org.lwjgl.opengles.GLES30.glUniformMatrix2x3fv(location, transpose, value);
    }

    @Override public void nglUniformMatrix3x2fv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengles.GLES30.nglUniformMatrix3x2fv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix3x2fv(int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengles.GLES30.glUniformMatrix3x2fv(location, transpose, value);
    }

    @Override public void glUniformMatrix3x2fv(int location, boolean transpose, float[] value) {
        org.lwjgl.opengles.GLES30.glUniformMatrix3x2fv(location, transpose, value);
    }

    @Override public void nglUniformMatrix2x4fv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengles.GLES30.nglUniformMatrix2x4fv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix2x4fv(int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengles.GLES30.glUniformMatrix2x4fv(location, transpose, value);
    }

    @Override public void glUniformMatrix2x4fv(int location, boolean transpose, float[] value) {
        org.lwjgl.opengles.GLES30.glUniformMatrix2x4fv(location, transpose, value);
    }

    @Override public void nglUniformMatrix4x2fv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengles.GLES30.nglUniformMatrix4x2fv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix4x2fv(int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengles.GLES30.glUniformMatrix4x2fv(location, transpose, value);
    }

    @Override public void glUniformMatrix4x2fv(int location, boolean transpose, float[] value) {
        org.lwjgl.opengles.GLES30.glUniformMatrix4x2fv(location, transpose, value);
    }

    @Override public void nglUniformMatrix3x4fv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengles.GLES30.nglUniformMatrix3x4fv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix3x4fv(int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengles.GLES30.glUniformMatrix3x4fv(location, transpose, value);
    }

    @Override public void glUniformMatrix3x4fv(int location, boolean transpose, float[] value) {
        org.lwjgl.opengles.GLES30.glUniformMatrix3x4fv(location, transpose, value);
    }

    @Override public void nglUniformMatrix4x3fv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengles.GLES30.nglUniformMatrix4x3fv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix4x3fv(int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengles.GLES30.glUniformMatrix4x3fv(location, transpose, value);
    }

    @Override public void glUniformMatrix4x3fv(int location, boolean transpose, float[] value) {
        org.lwjgl.opengles.GLES30.glUniformMatrix4x3fv(location, transpose, value);
    }

    @Override public void glBlitFramebuffer(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
        org.lwjgl.opengles.GLES30.glBlitFramebuffer(srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
    }

    @Override public void glRenderbufferStorageMultisample(int target, int samples, int internalformat, int width, int height) {
        org.lwjgl.opengles.GLES30.glRenderbufferStorageMultisample(target, samples, internalformat, width, height);
    }

    @Override public void glFramebufferTextureLayer(int target, int attachment, int texture, int level, int layer) {
        org.lwjgl.opengles.GLES30.glFramebufferTextureLayer(target, attachment, texture, level, layer);
    }

    @Override public long nglMapBufferRange(int target, long offset, long length, int access) {
        return org.lwjgl.opengles.GLES30.nglMapBufferRange(target, offset, length, access);
    }

@Nullable
    @Override public ByteBuffer glMapBufferRange(int target, long offset, long length, int access) {
        return org.lwjgl.opengles.GLES30.glMapBufferRange(target, offset, length, access);
    }

@Nullable
    @Override public ByteBuffer glMapBufferRange(int target, long offset, long length, int access, @Nullable ByteBuffer old_buffer) {
        return org.lwjgl.opengles.GLES30.glMapBufferRange(target, offset, length, access, old_buffer);
    }

    @Override public void glFlushMappedBufferRange(int target, long offset, long length) {
        org.lwjgl.opengles.GLES30.glFlushMappedBufferRange(target, offset, length);
    }

    @Override public void glBindVertexArray(int array) {
        org.lwjgl.opengles.GLES30.glBindVertexArray(array);
    }

    @Override public void nglDeleteVertexArrays(int n, long arrays) {
        org.lwjgl.opengles.GLES30.nglDeleteVertexArrays(n, arrays);
    }

    @Override public void glDeleteVertexArrays(IntBuffer arrays) {
        org.lwjgl.opengles.GLES30.glDeleteVertexArrays(arrays);
    }

    @Override public void glDeleteVertexArrays(int array) {
        org.lwjgl.opengles.GLES30.glDeleteVertexArrays(array);
    }

    @Override public void glDeleteVertexArrays(int[] arrays) {
        org.lwjgl.opengles.GLES30.glDeleteVertexArrays(arrays);
    }

    @Override public void nglGenVertexArrays(int n, long arrays) {
        org.lwjgl.opengles.GLES30.nglGenVertexArrays(n, arrays);
    }

    @Override public void glGenVertexArrays(IntBuffer arrays) {
        org.lwjgl.opengles.GLES30.glGenVertexArrays(arrays);
    }

    @Override public int glGenVertexArrays() {
        return org.lwjgl.opengles.GLES30.glGenVertexArrays();
    }

    @Override public void glGenVertexArrays(int[] arrays) {
        org.lwjgl.opengles.GLES30.glGenVertexArrays(arrays);
    }

    @Override public boolean glIsVertexArray(int array) {
        return org.lwjgl.opengles.GLES30.glIsVertexArray(array);
    }

    @Override public void nglGetIntegeri_v(int target, int index, long data) {
        org.lwjgl.opengles.GLES30.nglGetIntegeri_v(target, index, data);
    }

    @Override public void glGetIntegeri_v(int target, int index, IntBuffer data) {
        org.lwjgl.opengles.GLES30.glGetIntegeri_v(target, index, data);
    }

    @Override public void glGetIntegeri_v(int target, int index, int[] data) {
        org.lwjgl.opengles.GLES30.glGetIntegeri_v(target, index, data);
    }

    @Override public int glGetIntegeri(int target, int index) {
        return org.lwjgl.opengles.GLES30.glGetIntegeri(target, index);
    }

    @Override public void glBeginTransformFeedback(int primitiveMode) {
        org.lwjgl.opengles.GLES30.glBeginTransformFeedback(primitiveMode);
    }

    @Override public void glEndTransformFeedback() {
        org.lwjgl.opengles.GLES30.glEndTransformFeedback();
    }

    @Override public void glBindBufferRange(int target, int index, int buffer, long offset, long size) {
        org.lwjgl.opengles.GLES30.glBindBufferRange(target, index, buffer, offset, size);
    }

    @Override public void glBindBufferBase(int target, int index, int buffer) {
        org.lwjgl.opengles.GLES30.glBindBufferBase(target, index, buffer);
    }

    @Override public void nglTransformFeedbackVaryings(int program, int count, long varyings, int bufferMode) {
        org.lwjgl.opengles.GLES30.nglTransformFeedbackVaryings(program, count, varyings, bufferMode);
    }

    @Override public void glTransformFeedbackVaryings(int program, PointerBuffer varyings, int bufferMode) {
        org.lwjgl.opengles.GLES30.glTransformFeedbackVaryings(program, varyings, bufferMode);
    }

    @Override public void glTransformFeedbackVaryings(int program, CharSequence[] varyings, int bufferMode) {
        org.lwjgl.opengles.GLES30.glTransformFeedbackVaryings(program, varyings, bufferMode);
    }

    @Override public void glTransformFeedbackVaryings(int program, CharSequence varying, int bufferMode) {
        org.lwjgl.opengles.GLES30.glTransformFeedbackVaryings(program, varying, bufferMode);
    }

    @Override public void nglGetTransformFeedbackVarying(int program, int index, int bufSize, long length, long size, long type, long name) {
        org.lwjgl.opengles.GLES30.nglGetTransformFeedbackVarying(program, index, bufSize, length, size, type, name);
    }

    @Override public void glGetTransformFeedbackVarying(int program, int index, @Nullable IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
        org.lwjgl.opengles.GLES30.glGetTransformFeedbackVarying(program, index, length, size, type, name);
    }

    @Override public String glGetTransformFeedbackVarying(int program, int index, int bufSize, IntBuffer size, IntBuffer type) {
        return org.lwjgl.opengles.GLES30.glGetTransformFeedbackVarying(program, index, bufSize, size, type);
    }

    @Override public String glGetTransformFeedbackVarying(int program, int index, IntBuffer size, IntBuffer type) {
        return org.lwjgl.opengles.GLES30.glGetTransformFeedbackVarying(program, index, size, type);
    }

    @Override public void glGetTransformFeedbackVarying(int program, int index, @Nullable int[] length, int[] size, int[] type, ByteBuffer name) {
        org.lwjgl.opengles.GLES30.glGetTransformFeedbackVarying(program, index, length, size, type, name);
    }

    @Override public void nglVertexAttribIPointer(int index, int size, int type, int stride, long pointer) {
        org.lwjgl.opengles.GLES30.nglVertexAttribIPointer(index, size, type, stride, pointer);
    }

    @Override public void glVertexAttribIPointer(int index, int size, int type, int stride, ByteBuffer pointer) {
        org.lwjgl.opengles.GLES30.glVertexAttribIPointer(index, size, type, stride, pointer);
    }

    @Override public void glVertexAttribIPointer(int index, int size, int type, int stride, long pointer) {
        org.lwjgl.opengles.GLES30.glVertexAttribIPointer(index, size, type, stride, pointer);
    }

    @Override public void glVertexAttribIPointer(int index, int size, int type, int stride, ShortBuffer pointer) {
        org.lwjgl.opengles.GLES30.glVertexAttribIPointer(index, size, type, stride, pointer);
    }

    @Override public void glVertexAttribIPointer(int index, int size, int type, int stride, IntBuffer pointer) {
        org.lwjgl.opengles.GLES30.glVertexAttribIPointer(index, size, type, stride, pointer);
    }

    @Override public void nglGetVertexAttribIiv(int index, int pname, long params) {
        org.lwjgl.opengles.GLES30.nglGetVertexAttribIiv(index, pname, params);
    }

    @Override public void glGetVertexAttribIiv(int index, int pname, IntBuffer params) {
        org.lwjgl.opengles.GLES30.glGetVertexAttribIiv(index, pname, params);
    }

    @Override public void glGetVertexAttribIiv(int index, int pname, int[] params) {
        org.lwjgl.opengles.GLES30.glGetVertexAttribIiv(index, pname, params);
    }

    @Override public int glGetVertexAttribIi(int index, int pname) {
        return org.lwjgl.opengles.GLES30.glGetVertexAttribIi(index, pname);
    }

    @Override public void nglGetVertexAttribIuiv(int index, int pname, long params) {
        org.lwjgl.opengles.GLES30.nglGetVertexAttribIuiv(index, pname, params);
    }

    @Override public void glGetVertexAttribIuiv(int index, int pname, IntBuffer params) {
        org.lwjgl.opengles.GLES30.glGetVertexAttribIuiv(index, pname, params);
    }

    @Override public void glGetVertexAttribIuiv(int index, int pname, int[] params) {
        org.lwjgl.opengles.GLES30.glGetVertexAttribIuiv(index, pname, params);
    }

    @Override public int glGetVertexAttribIui(int index, int pname) {
        return org.lwjgl.opengles.GLES30.glGetVertexAttribIui(index, pname);
    }

    @Override public void glVertexAttribI4i(int index, int x, int y, int z, int w) {
        org.lwjgl.opengles.GLES30.glVertexAttribI4i(index, x, y, z, w);
    }

    @Override public void glVertexAttribI4ui(int index, int x, int y, int z, int w) {
        org.lwjgl.opengles.GLES30.glVertexAttribI4ui(index, x, y, z, w);
    }

    @Override public void nglVertexAttribI4iv(int index, long v) {
        org.lwjgl.opengles.GLES30.nglVertexAttribI4iv(index, v);
    }

    @Override public void glVertexAttribI4iv(int index, IntBuffer v) {
        org.lwjgl.opengles.GLES30.glVertexAttribI4iv(index, v);
    }

    @Override public void glVertexAttribI4iv(int index, int[] v) {
        org.lwjgl.opengles.GLES30.glVertexAttribI4iv(index, v);
    }

    @Override public void nglVertexAttribI4uiv(int index, long v) {
        org.lwjgl.opengles.GLES30.nglVertexAttribI4uiv(index, v);
    }

    @Override public void glVertexAttribI4uiv(int index, IntBuffer v) {
        org.lwjgl.opengles.GLES30.glVertexAttribI4uiv(index, v);
    }

    @Override public void glVertexAttribI4uiv(int index, int[] v) {
        org.lwjgl.opengles.GLES30.glVertexAttribI4uiv(index, v);
    }

    @Override public void nglGetUniformuiv(int program, int location, long params) {
        org.lwjgl.opengles.GLES30.nglGetUniformuiv(program, location, params);
    }

    @Override public void glGetUniformuiv(int program, int location, IntBuffer params) {
        org.lwjgl.opengles.GLES30.glGetUniformuiv(program, location, params);
    }

    @Override public void glGetUniformuiv(int program, int location, int[] params) {
        org.lwjgl.opengles.GLES30.glGetUniformuiv(program, location, params);
    }

    @Override public int glGetUniformui(int program, int location) {
        return org.lwjgl.opengles.GLES30.glGetUniformui(program, location);
    }

    @Override public int nglGetFragDataLocation(int program, long name) {
        return org.lwjgl.opengles.GLES30.nglGetFragDataLocation(program, name);
    }

    @Override public int glGetFragDataLocation(int program, ByteBuffer name) {
        return org.lwjgl.opengles.GLES30.glGetFragDataLocation(program, name);
    }

    @Override public int glGetFragDataLocation(int program, CharSequence name) {
        return org.lwjgl.opengles.GLES30.glGetFragDataLocation(program, name);
    }

    @Override public void glUniform1ui(int location, int v0) {
        org.lwjgl.opengles.GLES30.glUniform1ui(location, v0);
    }

    @Override public void glUniform2ui(int location, int v0, int v1) {
        org.lwjgl.opengles.GLES30.glUniform2ui(location, v0, v1);
    }

    @Override public void glUniform3ui(int location, int v0, int v1, int v2) {
        org.lwjgl.opengles.GLES30.glUniform3ui(location, v0, v1, v2);
    }

    @Override public void glUniform4ui(int location, int v0, int v1, int v2, int v3) {
        org.lwjgl.opengles.GLES30.glUniform4ui(location, v0, v1, v2, v3);
    }

    @Override public void nglUniform1uiv(int location, int count, long value) {
        org.lwjgl.opengles.GLES30.nglUniform1uiv(location, count, value);
    }

    @Override public void glUniform1uiv(int location, IntBuffer value) {
        org.lwjgl.opengles.GLES30.glUniform1uiv(location, value);
    }

    @Override public void glUniform1uiv(int location, int[] value) {
        org.lwjgl.opengles.GLES30.glUniform1uiv(location, value);
    }

    @Override public void nglUniform2uiv(int location, int count, long value) {
        org.lwjgl.opengles.GLES30.nglUniform2uiv(location, count, value);
    }

    @Override public void glUniform2uiv(int location, IntBuffer value) {
        org.lwjgl.opengles.GLES30.glUniform2uiv(location, value);
    }

    @Override public void glUniform2uiv(int location, int[] value) {
        org.lwjgl.opengles.GLES30.glUniform2uiv(location, value);
    }

    @Override public void nglUniform3uiv(int location, int count, long value) {
        org.lwjgl.opengles.GLES30.nglUniform3uiv(location, count, value);
    }

    @Override public void glUniform3uiv(int location, IntBuffer value) {
        org.lwjgl.opengles.GLES30.glUniform3uiv(location, value);
    }

    @Override public void glUniform3uiv(int location, int[] value) {
        org.lwjgl.opengles.GLES30.glUniform3uiv(location, value);
    }

    @Override public void nglUniform4uiv(int location, int count, long value) {
        org.lwjgl.opengles.GLES30.nglUniform4uiv(location, count, value);
    }

    @Override public void glUniform4uiv(int location, IntBuffer value) {
        org.lwjgl.opengles.GLES30.glUniform4uiv(location, value);
    }

    @Override public void glUniform4uiv(int location, int[] value) {
        org.lwjgl.opengles.GLES30.glUniform4uiv(location, value);
    }

    @Override public void nglClearBufferiv(int buffer, int drawbuffer, long value) {
        org.lwjgl.opengles.GLES30.nglClearBufferiv(buffer, drawbuffer, value);
    }

    @Override public void glClearBufferiv(int buffer, int drawbuffer, IntBuffer value) {
        org.lwjgl.opengles.GLES30.glClearBufferiv(buffer, drawbuffer, value);
    }

    @Override public void glClearBufferiv(int buffer, int drawbuffer, int[] value) {
        org.lwjgl.opengles.GLES30.glClearBufferiv(buffer, drawbuffer, value);
    }

    @Override public void nglClearBufferuiv(int buffer, int drawbuffer, long value) {
        org.lwjgl.opengles.GLES30.nglClearBufferuiv(buffer, drawbuffer, value);
    }

    @Override public void glClearBufferuiv(int buffer, int drawbuffer, IntBuffer value) {
        org.lwjgl.opengles.GLES30.glClearBufferuiv(buffer, drawbuffer, value);
    }

    @Override public void glClearBufferuiv(int buffer, int drawbuffer, int[] value) {
        org.lwjgl.opengles.GLES30.glClearBufferuiv(buffer, drawbuffer, value);
    }

    @Override public void nglClearBufferfv(int buffer, int drawbuffer, long value) {
        org.lwjgl.opengles.GLES30.nglClearBufferfv(buffer, drawbuffer, value);
    }

    @Override public void glClearBufferfv(int buffer, int drawbuffer, FloatBuffer value) {
        org.lwjgl.opengles.GLES30.glClearBufferfv(buffer, drawbuffer, value);
    }

    @Override public void glClearBufferfv(int buffer, int drawbuffer, float[] value) {
        org.lwjgl.opengles.GLES30.glClearBufferfv(buffer, drawbuffer, value);
    }

    @Override public void glClearBufferfi(int buffer, int drawbuffer, float depth, int stencil) {
        org.lwjgl.opengles.GLES30.glClearBufferfi(buffer, drawbuffer, depth, stencil);
    }

    @Override public long nglGetStringi(int name, int index) {
        return org.lwjgl.opengles.GLES30.nglGetStringi(name, index);
    }

@Nullable
    @Override public String glGetStringi(int name, int index) {
        return org.lwjgl.opengles.GLES30.glGetStringi(name, index);
    }

    @Override public void glCopyBufferSubData(int readTarget, int writeTarget, long readOffset, long writeOffset, long size) {
        org.lwjgl.opengles.GLES30.glCopyBufferSubData(readTarget, writeTarget, readOffset, writeOffset, size);
    }

    @Override public void nglGetUniformIndices(int program, int uniformCount, long uniformNames, long uniformIndices) {
        org.lwjgl.opengles.GLES30.nglGetUniformIndices(program, uniformCount, uniformNames, uniformIndices);
    }

    @Override public void glGetUniformIndices(int program, PointerBuffer uniformNames, IntBuffer uniformIndices) {
        org.lwjgl.opengles.GLES30.glGetUniformIndices(program, uniformNames, uniformIndices);
    }

    @Override public void glGetUniformIndices(int program, PointerBuffer uniformNames, int[] uniformIndices) {
        org.lwjgl.opengles.GLES30.glGetUniformIndices(program, uniformNames, uniformIndices);
    }

    @Override public void nglGetActiveUniformsiv(int program, int uniformCount, long uniformIndices, int pname, long params) {
        org.lwjgl.opengles.GLES30.nglGetActiveUniformsiv(program, uniformCount, uniformIndices, pname, params);
    }

    @Override public void glGetActiveUniformsiv(int program, IntBuffer uniformIndices, int pname, IntBuffer params) {
        org.lwjgl.opengles.GLES30.glGetActiveUniformsiv(program, uniformIndices, pname, params);
    }

    @Override public void glGetActiveUniformsiv(int program, int[] uniformIndices, int pname, int[] params) {
        org.lwjgl.opengles.GLES30.glGetActiveUniformsiv(program, uniformIndices, pname, params);
    }

    @Override public int nglGetUniformBlockIndex(int program, long uniformBlockName) {
        return org.lwjgl.opengles.GLES30.nglGetUniformBlockIndex(program, uniformBlockName);
    }

    @Override public int glGetUniformBlockIndex(int program, ByteBuffer uniformBlockName) {
        return org.lwjgl.opengles.GLES30.glGetUniformBlockIndex(program, uniformBlockName);
    }

    @Override public int glGetUniformBlockIndex(int program, CharSequence uniformBlockName) {
        return org.lwjgl.opengles.GLES30.glGetUniformBlockIndex(program, uniformBlockName);
    }

    @Override public void nglGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, long params) {
        org.lwjgl.opengles.GLES30.nglGetActiveUniformBlockiv(program, uniformBlockIndex, pname, params);
    }

    @Override public void glGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, IntBuffer params) {
        org.lwjgl.opengles.GLES30.glGetActiveUniformBlockiv(program, uniformBlockIndex, pname, params);
    }

    @Override public void glGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, int[] params) {
        org.lwjgl.opengles.GLES30.glGetActiveUniformBlockiv(program, uniformBlockIndex, pname, params);
    }

    @Override public int glGetActiveUniformBlocki(int program, int uniformBlockIndex, int pname) {
        return org.lwjgl.opengles.GLES30.glGetActiveUniformBlocki(program, uniformBlockIndex, pname);
    }

    @Override public void nglGetActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize, long length, long uniformBlockName) {
        org.lwjgl.opengles.GLES30.nglGetActiveUniformBlockName(program, uniformBlockIndex, bufSize, length, uniformBlockName);
    }

    @Override public void glGetActiveUniformBlockName(int program, int uniformBlockIndex, @Nullable IntBuffer length, ByteBuffer uniformBlockName) {
        org.lwjgl.opengles.GLES30.glGetActiveUniformBlockName(program, uniformBlockIndex, length, uniformBlockName);
    }

    @Override public String glGetActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize) {
        return org.lwjgl.opengles.GLES30.glGetActiveUniformBlockName(program, uniformBlockIndex, bufSize);
    }

    @Override public String glGetActiveUniformBlockName(int program, int uniformBlockIndex) {
        return org.lwjgl.opengles.GLES30.glGetActiveUniformBlockName(program, uniformBlockIndex);
    }

    @Override public void glGetActiveUniformBlockName(int program, int uniformBlockIndex, @Nullable int[] length, ByteBuffer uniformBlockName) {
        org.lwjgl.opengles.GLES30.glGetActiveUniformBlockName(program, uniformBlockIndex, length, uniformBlockName);
    }

    @Override public void glUniformBlockBinding(int program, int uniformBlockIndex, int uniformBlockBinding) {
        org.lwjgl.opengles.GLES30.glUniformBlockBinding(program, uniformBlockIndex, uniformBlockBinding);
    }

    @Override public void glDrawArraysInstanced(int mode, int first, int count, int instancecount) {
        org.lwjgl.opengles.GLES30.glDrawArraysInstanced(mode, first, count, instancecount);
    }

    @Override public void nglDrawElementsInstanced(int mode, int count, int type, long indices, int instancecount) {
        org.lwjgl.opengles.GLES30.nglDrawElementsInstanced(mode, count, type, indices, instancecount);
    }

    @Override public void glDrawElementsInstanced(int mode, int count, int type, long indices, int instancecount) {
        org.lwjgl.opengles.GLES30.glDrawElementsInstanced(mode, count, type, indices, instancecount);
    }

    @Override public void glDrawElementsInstanced(int mode, int type, ByteBuffer indices, int instancecount) {
        org.lwjgl.opengles.GLES30.glDrawElementsInstanced(mode, type, indices, instancecount);
    }

    @Override public void glDrawElementsInstanced(int mode, ByteBuffer indices, int instancecount) {
        org.lwjgl.opengles.GLES30.glDrawElementsInstanced(mode, indices, instancecount);
    }

    @Override public void glDrawElementsInstanced(int mode, ShortBuffer indices, int instancecount) {
        org.lwjgl.opengles.GLES30.glDrawElementsInstanced(mode, indices, instancecount);
    }

    @Override public void glDrawElementsInstanced(int mode, IntBuffer indices, int instancecount) {
        org.lwjgl.opengles.GLES30.glDrawElementsInstanced(mode, indices, instancecount);
    }

    @Override public long glFenceSync(int condition, int flags) {
        return org.lwjgl.opengles.GLES30.glFenceSync(condition, flags);
    }

    @Override public boolean nglIsSync(long sync) {
        return org.lwjgl.opengles.GLES30.nglIsSync(sync);
    }

    @Override public boolean glIsSync(long sync) {
        return org.lwjgl.opengles.GLES30.glIsSync(sync);
    }

    @Override public void nglDeleteSync(long sync) {
        org.lwjgl.opengles.GLES30.nglDeleteSync(sync);
    }

    @Override public void glDeleteSync(long sync) {
        org.lwjgl.opengles.GLES30.glDeleteSync(sync);
    }

    @Override public int nglClientWaitSync(long sync, int flags, long timeout) {
        return org.lwjgl.opengles.GLES30.nglClientWaitSync(sync, flags, timeout);
    }

    @Override public int glClientWaitSync(long sync, int flags, long timeout) {
        return org.lwjgl.opengles.GLES30.glClientWaitSync(sync, flags, timeout);
    }

    @Override public void nglWaitSync(long sync, int flags, long timeout) {
        org.lwjgl.opengles.GLES30.nglWaitSync(sync, flags, timeout);
    }

    @Override public void glWaitSync(long sync, int flags, long timeout) {
        org.lwjgl.opengles.GLES30.glWaitSync(sync, flags, timeout);
    }

    @Override public void nglGetInteger64v(int pname, long data) {
        org.lwjgl.opengles.GLES30.nglGetInteger64v(pname, data);
    }

    @Override public void glGetInteger64v(int pname, LongBuffer data) {
        org.lwjgl.opengles.GLES30.glGetInteger64v(pname, data);
    }

    @Override public void glGetInteger64v(int pname, long[] data) {
        org.lwjgl.opengles.GLES30.glGetInteger64v(pname, data);
    }

    @Override public long glGetInteger64(int pname) {
        return org.lwjgl.opengles.GLES30.glGetInteger64(pname);
    }

    @Override public void nglGetSynciv(long sync, int pname, int bufSize, long length, long values) {
        org.lwjgl.opengles.GLES30.nglGetSynciv(sync, pname, bufSize, length, values);
    }

    @Override public void glGetSynciv(long sync, int pname, @Nullable IntBuffer length, IntBuffer values) {
        org.lwjgl.opengles.GLES30.glGetSynciv(sync, pname, length, values);
    }

    @Override public void glGetSynciv(long sync, int pname, @Nullable int[] length, int[] values) {
        org.lwjgl.opengles.GLES30.glGetSynciv(sync, pname, length, values);
    }

    @Override public int glGetSynci(long sync, int pname, @Nullable IntBuffer length) {
        return org.lwjgl.opengles.GLES30.glGetSynci(sync, pname, length);
    }

    @Override public void nglGetInteger64i_v(int target, int index, long data) {
        org.lwjgl.opengles.GLES30.nglGetInteger64i_v(target, index, data);
    }

    @Override public void glGetInteger64i_v(int target, int index, LongBuffer data) {
        org.lwjgl.opengles.GLES30.glGetInteger64i_v(target, index, data);
    }

    @Override public void glGetInteger64i_v(int target, int index, long[] data) {
        org.lwjgl.opengles.GLES30.glGetInteger64i_v(target, index, data);
    }

    @Override public long glGetInteger64i(int target, int index) {
        return org.lwjgl.opengles.GLES30.glGetInteger64i(target, index);
    }

    @Override public void nglGetBufferParameteri64v(int target, int pname, long params) {
        org.lwjgl.opengles.GLES30.nglGetBufferParameteri64v(target, pname, params);
    }

    @Override public void glGetBufferParameteri64v(int target, int pname, LongBuffer params) {
        org.lwjgl.opengles.GLES30.glGetBufferParameteri64v(target, pname, params);
    }

    @Override public void glGetBufferParameteri64v(int target, int pname, long[] params) {
        org.lwjgl.opengles.GLES30.glGetBufferParameteri64v(target, pname, params);
    }

    @Override public long glGetBufferParameteri64(int target, int pname) {
        return org.lwjgl.opengles.GLES30.glGetBufferParameteri64(target, pname);
    }

    @Override public void nglGenSamplers(int count, long samplers) {
        org.lwjgl.opengles.GLES30.nglGenSamplers(count, samplers);
    }

    @Override public void glGenSamplers(IntBuffer samplers) {
        org.lwjgl.opengles.GLES30.glGenSamplers(samplers);
    }

    @Override public int glGenSamplers() {
        return org.lwjgl.opengles.GLES30.glGenSamplers();
    }

    @Override public void glGenSamplers(int[] samplers) {
        org.lwjgl.opengles.GLES30.glGenSamplers(samplers);
    }

    @Override public void nglDeleteSamplers(int count, long samplers) {
        org.lwjgl.opengles.GLES30.nglDeleteSamplers(count, samplers);
    }

    @Override public void glDeleteSamplers(IntBuffer samplers) {
        org.lwjgl.opengles.GLES30.glDeleteSamplers(samplers);
    }

    @Override public void glDeleteSamplers(int sampler) {
        org.lwjgl.opengles.GLES30.glDeleteSamplers(sampler);
    }

    @Override public void glDeleteSamplers(int[] samplers) {
        org.lwjgl.opengles.GLES30.glDeleteSamplers(samplers);
    }

    @Override public boolean glIsSampler(int sampler) {
        return org.lwjgl.opengles.GLES30.glIsSampler(sampler);
    }

    @Override public void glBindSampler(int unit, int sampler) {
        org.lwjgl.opengles.GLES30.glBindSampler(unit, sampler);
    }

    @Override public void glSamplerParameteri(int sampler, int pname, int param) {
        org.lwjgl.opengles.GLES30.glSamplerParameteri(sampler, pname, param);
    }

    @Override public void nglSamplerParameteriv(int sampler, int pname, long param) {
        org.lwjgl.opengles.GLES30.nglSamplerParameteriv(sampler, pname, param);
    }

    @Override public void glSamplerParameteriv(int sampler, int pname, IntBuffer param) {
        org.lwjgl.opengles.GLES30.glSamplerParameteriv(sampler, pname, param);
    }

    @Override public void glSamplerParameteriv(int sampler, int pname, int[] param) {
        org.lwjgl.opengles.GLES30.glSamplerParameteriv(sampler, pname, param);
    }

    @Override public void glSamplerParameterf(int sampler, int pname, float param) {
        org.lwjgl.opengles.GLES30.glSamplerParameterf(sampler, pname, param);
    }

    @Override public void nglSamplerParameterfv(int sampler, int pname, long param) {
        org.lwjgl.opengles.GLES30.nglSamplerParameterfv(sampler, pname, param);
    }

    @Override public void glSamplerParameterfv(int sampler, int pname, FloatBuffer param) {
        org.lwjgl.opengles.GLES30.glSamplerParameterfv(sampler, pname, param);
    }

    @Override public void glSamplerParameterfv(int sampler, int pname, float[] param) {
        org.lwjgl.opengles.GLES30.glSamplerParameterfv(sampler, pname, param);
    }

    @Override public void nglGetSamplerParameteriv(int sampler, int pname, long params) {
        org.lwjgl.opengles.GLES30.nglGetSamplerParameteriv(sampler, pname, params);
    }

    @Override public void glGetSamplerParameteriv(int sampler, int pname, IntBuffer params) {
        org.lwjgl.opengles.GLES30.glGetSamplerParameteriv(sampler, pname, params);
    }

    @Override public void glGetSamplerParameteriv(int sampler, int pname, int[] params) {
        org.lwjgl.opengles.GLES30.glGetSamplerParameteriv(sampler, pname, params);
    }

    @Override public int glGetSamplerParameteri(int sampler, int pname) {
        return org.lwjgl.opengles.GLES30.glGetSamplerParameteri(sampler, pname);
    }

    @Override public void nglGetSamplerParameterfv(int sampler, int pname, long params) {
        org.lwjgl.opengles.GLES30.nglGetSamplerParameterfv(sampler, pname, params);
    }

    @Override public void glGetSamplerParameterfv(int sampler, int pname, FloatBuffer params) {
        org.lwjgl.opengles.GLES30.glGetSamplerParameterfv(sampler, pname, params);
    }

    @Override public void glGetSamplerParameterfv(int sampler, int pname, float[] params) {
        org.lwjgl.opengles.GLES30.glGetSamplerParameterfv(sampler, pname, params);
    }

    @Override public float glGetSamplerParameterf(int sampler, int pname) {
        return org.lwjgl.opengles.GLES30.glGetSamplerParameterf(sampler, pname);
    }

    @Override public void glVertexAttribDivisor(int index, int divisor) {
        org.lwjgl.opengles.GLES30.glVertexAttribDivisor(index, divisor);
    }

    @Override public void glBindTransformFeedback(int target, int id) {
        org.lwjgl.opengles.GLES30.glBindTransformFeedback(target, id);
    }

    @Override public void nglDeleteTransformFeedbacks(int n, long ids) {
        org.lwjgl.opengles.GLES30.nglDeleteTransformFeedbacks(n, ids);
    }

    @Override public void glDeleteTransformFeedbacks(IntBuffer ids) {
        org.lwjgl.opengles.GLES30.glDeleteTransformFeedbacks(ids);
    }

    @Override public void glDeleteTransformFeedbacks(int id) {
        org.lwjgl.opengles.GLES30.glDeleteTransformFeedbacks(id);
    }

    @Override public void glDeleteTransformFeedbacks(int[] ids) {
        org.lwjgl.opengles.GLES30.glDeleteTransformFeedbacks(ids);
    }

    @Override public void nglGenTransformFeedbacks(int n, long ids) {
        org.lwjgl.opengles.GLES30.nglGenTransformFeedbacks(n, ids);
    }

    @Override public void glGenTransformFeedbacks(IntBuffer ids) {
        org.lwjgl.opengles.GLES30.glGenTransformFeedbacks(ids);
    }

    @Override public int glGenTransformFeedbacks() {
        return org.lwjgl.opengles.GLES30.glGenTransformFeedbacks();
    }

    @Override public void glGenTransformFeedbacks(int[] ids) {
        org.lwjgl.opengles.GLES30.glGenTransformFeedbacks(ids);
    }

    @Override public boolean glIsTransformFeedback(int id) {
        return org.lwjgl.opengles.GLES30.glIsTransformFeedback(id);
    }

    @Override public void glPauseTransformFeedback() {
        org.lwjgl.opengles.GLES30.glPauseTransformFeedback();
    }

    @Override public void glResumeTransformFeedback() {
        org.lwjgl.opengles.GLES30.glResumeTransformFeedback();
    }

    @Override public void nglGetProgramBinary(int program, int bufSize, long length, long binaryFormat, long binary) {
        org.lwjgl.opengles.GLES30.nglGetProgramBinary(program, bufSize, length, binaryFormat, binary);
    }

    @Override public void glGetProgramBinary(int program, @Nullable IntBuffer length, IntBuffer binaryFormat, ByteBuffer binary) {
        org.lwjgl.opengles.GLES30.glGetProgramBinary(program, length, binaryFormat, binary);
    }

    @Override public void glGetProgramBinary(int program, @Nullable int[] length, int[] binaryFormat, ByteBuffer binary) {
        org.lwjgl.opengles.GLES30.glGetProgramBinary(program, length, binaryFormat, binary);
    }

    @Override public void nglProgramBinary(int program, int binaryFormat, long binary, int length) {
        org.lwjgl.opengles.GLES30.nglProgramBinary(program, binaryFormat, binary, length);
    }

    @Override public void glProgramBinary(int program, int binaryFormat, ByteBuffer binary) {
        org.lwjgl.opengles.GLES30.glProgramBinary(program, binaryFormat, binary);
    }

    @Override public void glProgramParameteri(int program, int pname, int value) {
        org.lwjgl.opengles.GLES30.glProgramParameteri(program, pname, value);
    }

    @Override public void nglInvalidateFramebuffer(int target, int numAttachments, long attachments) {
        org.lwjgl.opengles.GLES30.nglInvalidateFramebuffer(target, numAttachments, attachments);
    }

    @Override public void glInvalidateFramebuffer(int target, IntBuffer attachments) {
        org.lwjgl.opengles.GLES30.glInvalidateFramebuffer(target, attachments);
    }

    @Override public void glInvalidateFramebuffer(int target, int attachment) {
        org.lwjgl.opengles.GLES30.glInvalidateFramebuffer(target, attachment);
    }

    @Override public void glInvalidateFramebuffer(int target, int[] attachments) {
        org.lwjgl.opengles.GLES30.glInvalidateFramebuffer(target, attachments);
    }

    @Override public void nglInvalidateSubFramebuffer(int target, int numAttachments, long attachments, int x, int y, int width, int height) {
        org.lwjgl.opengles.GLES30.nglInvalidateSubFramebuffer(target, numAttachments, attachments, x, y, width, height);
    }

    @Override public void glInvalidateSubFramebuffer(int target, IntBuffer attachments, int x, int y, int width, int height) {
        org.lwjgl.opengles.GLES30.glInvalidateSubFramebuffer(target, attachments, x, y, width, height);
    }

    @Override public void glInvalidateSubFramebuffer(int target, int attachment, int x, int y, int width, int height) {
        org.lwjgl.opengles.GLES30.glInvalidateSubFramebuffer(target, attachment, x, y, width, height);
    }

    @Override public void glInvalidateSubFramebuffer(int target, int[] attachments, int x, int y, int width, int height) {
        org.lwjgl.opengles.GLES30.glInvalidateSubFramebuffer(target, attachments, x, y, width, height);
    }

    @Override public void glTexStorage2D(int target, int levels, int internalformat, int width, int height) {
        org.lwjgl.opengles.GLES30.glTexStorage2D(target, levels, internalformat, width, height);
    }

    @Override public void glTexStorage3D(int target, int levels, int internalformat, int width, int height, int depth) {
        org.lwjgl.opengles.GLES30.glTexStorage3D(target, levels, internalformat, width, height, depth);
    }

    @Override public void nglGetInternalformativ(int target, int internalformat, int pname, int bufSize, long params) {
        org.lwjgl.opengles.GLES30.nglGetInternalformativ(target, internalformat, pname, bufSize, params);
    }

    @Override public void glGetInternalformativ(int target, int internalformat, int pname, IntBuffer params) {
        org.lwjgl.opengles.GLES30.glGetInternalformativ(target, internalformat, pname, params);
    }

    @Override public void glGetInternalformativ(int target, int internalformat, int pname, int[] params) {
        org.lwjgl.opengles.GLES30.glGetInternalformativ(target, internalformat, pname, params);
    }

    @Override public int glGetInternalformati(int target, int internalformat, int pname) {
        return org.lwjgl.opengles.GLES30.glGetInternalformati(target, internalformat, pname);
    }

}
