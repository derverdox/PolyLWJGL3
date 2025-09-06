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

    @Override public void glReadBuffer(@NativeType("GLenum") int src) {
        org.lwjgl.opengles.GLES30.glReadBuffer(src);
    }

    @Override public void nglDrawRangeElements(int mode, int start, int end, int count, int type, long indices) {
        org.lwjgl.opengles.GLES30.nglDrawRangeElements(mode, start, end, count, type, indices);
    }

    @Override public void glDrawRangeElements(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices) {
        org.lwjgl.opengles.GLES30.glDrawRangeElements(mode, start, end, count, type, indices);
    }

    @Override public void glDrawRangeElements(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices) {
        org.lwjgl.opengles.GLES30.glDrawRangeElements(mode, start, end, type, indices);
    }

    @Override public void glDrawRangeElements(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("void const *") ByteBuffer indices) {
        org.lwjgl.opengles.GLES30.glDrawRangeElements(mode, start, end, indices);
    }

    @Override public void glDrawRangeElements(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("void const *") ShortBuffer indices) {
        org.lwjgl.opengles.GLES30.glDrawRangeElements(mode, start, end, indices);
    }

    @Override public void glDrawRangeElements(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("void const *") IntBuffer indices) {
        org.lwjgl.opengles.GLES30.glDrawRangeElements(mode, start, end, indices);
    }

    @Override public void nglTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixels) {
        org.lwjgl.opengles.GLES30.nglTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    @Override public void glTexImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ByteBuffer pixels) {
        org.lwjgl.opengles.GLES30.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    @Override public void glTexImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        org.lwjgl.opengles.GLES30.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    @Override public void glTexImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ShortBuffer pixels) {
        org.lwjgl.opengles.GLES30.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    @Override public void glTexImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") IntBuffer pixels) {
        org.lwjgl.opengles.GLES30.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    @Override public void glTexImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") FloatBuffer pixels) {
        org.lwjgl.opengles.GLES30.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    @Override public void glTexImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") short[] pixels) {
        org.lwjgl.opengles.GLES30.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    @Override public void glTexImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") int[] pixels) {
        org.lwjgl.opengles.GLES30.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    @Override public void glTexImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") float[] pixels) {
        org.lwjgl.opengles.GLES30.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    @Override public void nglTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels) {
        org.lwjgl.opengles.GLES30.nglTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glTexSubImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer pixels) {
        org.lwjgl.opengles.GLES30.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glTexSubImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        org.lwjgl.opengles.GLES30.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glTexSubImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer pixels) {
        org.lwjgl.opengles.GLES30.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glTexSubImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer pixels) {
        org.lwjgl.opengles.GLES30.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glTexSubImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer pixels) {
        org.lwjgl.opengles.GLES30.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glTexSubImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] pixels) {
        org.lwjgl.opengles.GLES30.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glTexSubImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] pixels) {
        org.lwjgl.opengles.GLES30.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glTexSubImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] pixels) {
        org.lwjgl.opengles.GLES30.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glCopyTexSubImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        org.lwjgl.opengles.GLES30.glCopyTexSubImage3D(target, level, xoffset, yoffset, zoffset, x, y, width, height);
    }

    @Override public void nglCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data) {
        org.lwjgl.opengles.GLES30.nglCompressedTexImage3D(target, level, internalformat, width, height, depth, border, imageSize, data);
    }

    @Override public void glCompressedTexImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        org.lwjgl.opengles.GLES30.glCompressedTexImage3D(target, level, internalformat, width, height, depth, border, imageSize, data);
    }

    @Override public void glCompressedTexImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @Nullable @NativeType("void const *") ByteBuffer data) {
        org.lwjgl.opengles.GLES30.glCompressedTexImage3D(target, level, internalformat, width, height, depth, border, data);
    }

    @Override public void nglCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data) {
        org.lwjgl.opengles.GLES30.nglCompressedTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
    }

    @Override public void glCompressedTexSubImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        org.lwjgl.opengles.GLES30.glCompressedTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
    }

    @Override public void glCompressedTexSubImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer data) {
        org.lwjgl.opengles.GLES30.glCompressedTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, data);
    }

    @Override public void nglGenQueries(int n, long ids) {
        org.lwjgl.opengles.GLES30.nglGenQueries(n, ids);
    }

    @Override public void glGenQueries(@NativeType("GLuint *") IntBuffer ids) {
        org.lwjgl.opengles.GLES30.glGenQueries(ids);
    }

@NativeType("void")
    @Override public int glGenQueries() {
        return org.lwjgl.opengles.GLES30.glGenQueries();
    }

    @Override public void glGenQueries(@NativeType("GLuint *") int[] ids) {
        org.lwjgl.opengles.GLES30.glGenQueries(ids);
    }

    @Override public void nglDeleteQueries(int n, long ids) {
        org.lwjgl.opengles.GLES30.nglDeleteQueries(n, ids);
    }

    @Override public void glDeleteQueries(@NativeType("GLuint const *") IntBuffer ids) {
        org.lwjgl.opengles.GLES30.glDeleteQueries(ids);
    }

    @Override public void glDeleteQueries(@NativeType("GLuint const *") int id) {
        org.lwjgl.opengles.GLES30.glDeleteQueries(id);
    }

    @Override public void glDeleteQueries(@NativeType("GLuint const *") int[] ids) {
        org.lwjgl.opengles.GLES30.glDeleteQueries(ids);
    }

@NativeType("GLboolean")
    @Override public boolean glIsQuery(@NativeType("GLuint") int id) {
        return org.lwjgl.opengles.GLES30.glIsQuery(id);
    }

    @Override public void glBeginQuery(@NativeType("GLenum") int target, @NativeType("GLuint") int id) {
        org.lwjgl.opengles.GLES30.glBeginQuery(target, id);
    }

    @Override public void glEndQuery(@NativeType("GLenum") int target) {
        org.lwjgl.opengles.GLES30.glEndQuery(target);
    }

    @Override public void nglGetQueryiv(int target, int pname, long params) {
        org.lwjgl.opengles.GLES30.nglGetQueryiv(target, pname, params);
    }

    @Override public void glGetQueryiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengles.GLES30.glGetQueryiv(target, pname, params);
    }

    @Override public void glGetQueryiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengles.GLES30.glGetQueryiv(target, pname, params);
    }

@NativeType("void")
    @Override public int glGetQueryi(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengles.GLES30.glGetQueryi(target, pname);
    }

    @Override public void nglGetQueryObjectuiv(int id, int pname, long params) {
        org.lwjgl.opengles.GLES30.nglGetQueryObjectuiv(id, pname, params);
    }

    @Override public void glGetQueryObjectuiv(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        org.lwjgl.opengles.GLES30.glGetQueryObjectuiv(id, pname, params);
    }

    @Override public void glGetQueryObjectuiv(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        org.lwjgl.opengles.GLES30.glGetQueryObjectuiv(id, pname, params);
    }

@NativeType("void")
    @Override public int glGetQueryObjectui(@NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengles.GLES30.glGetQueryObjectui(id, pname);
    }

@NativeType("GLboolean")
    @Override public boolean glUnmapBuffer(@NativeType("GLenum") int target) {
        return org.lwjgl.opengles.GLES30.glUnmapBuffer(target);
    }

    @Override public void nglGetBufferPointerv(int target, int pname, long params) {
        org.lwjgl.opengles.GLES30.nglGetBufferPointerv(target, pname, params);
    }

    @Override public void glGetBufferPointerv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("void **") PointerBuffer params) {
        org.lwjgl.opengles.GLES30.glGetBufferPointerv(target, pname, params);
    }

@NativeType("void")
    @Override public long glGetBufferPointer(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengles.GLES30.glGetBufferPointer(target, pname);
    }

    @Override public void nglDrawBuffers(int n, long bufs) {
        org.lwjgl.opengles.GLES30.nglDrawBuffers(n, bufs);
    }

    @Override public void glDrawBuffers(@NativeType("GLenum const *") IntBuffer bufs) {
        org.lwjgl.opengles.GLES30.glDrawBuffers(bufs);
    }

    @Override public void glDrawBuffers(@NativeType("GLenum const *") int buf) {
        org.lwjgl.opengles.GLES30.glDrawBuffers(buf);
    }

    @Override public void glDrawBuffers(@NativeType("GLenum const *") int[] bufs) {
        org.lwjgl.opengles.GLES30.glDrawBuffers(bufs);
    }

    @Override public void nglUniformMatrix2x3fv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengles.GLES30.nglUniformMatrix2x3fv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix2x3fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengles.GLES30.glUniformMatrix2x3fv(location, transpose, value);
    }

    @Override public void glUniformMatrix2x3fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengles.GLES30.glUniformMatrix2x3fv(location, transpose, value);
    }

    @Override public void nglUniformMatrix3x2fv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengles.GLES30.nglUniformMatrix3x2fv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix3x2fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengles.GLES30.glUniformMatrix3x2fv(location, transpose, value);
    }

    @Override public void glUniformMatrix3x2fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengles.GLES30.glUniformMatrix3x2fv(location, transpose, value);
    }

    @Override public void nglUniformMatrix2x4fv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengles.GLES30.nglUniformMatrix2x4fv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix2x4fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengles.GLES30.glUniformMatrix2x4fv(location, transpose, value);
    }

    @Override public void glUniformMatrix2x4fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengles.GLES30.glUniformMatrix2x4fv(location, transpose, value);
    }

    @Override public void nglUniformMatrix4x2fv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengles.GLES30.nglUniformMatrix4x2fv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix4x2fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengles.GLES30.glUniformMatrix4x2fv(location, transpose, value);
    }

    @Override public void glUniformMatrix4x2fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengles.GLES30.glUniformMatrix4x2fv(location, transpose, value);
    }

    @Override public void nglUniformMatrix3x4fv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengles.GLES30.nglUniformMatrix3x4fv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix3x4fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengles.GLES30.glUniformMatrix3x4fv(location, transpose, value);
    }

    @Override public void glUniformMatrix3x4fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengles.GLES30.glUniformMatrix3x4fv(location, transpose, value);
    }

    @Override public void nglUniformMatrix4x3fv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengles.GLES30.nglUniformMatrix4x3fv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix4x3fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengles.GLES30.glUniformMatrix4x3fv(location, transpose, value);
    }

    @Override public void glUniformMatrix4x3fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengles.GLES30.glUniformMatrix4x3fv(location, transpose, value);
    }

    @Override public void glBlitFramebuffer(@NativeType("GLint") int srcX0, @NativeType("GLint") int srcY0, @NativeType("GLint") int srcX1, @NativeType("GLint") int srcY1, @NativeType("GLint") int dstX0, @NativeType("GLint") int dstY0, @NativeType("GLint") int dstX1, @NativeType("GLint") int dstY1, @NativeType("GLbitfield") int mask, @NativeType("GLenum") int filter) {
        org.lwjgl.opengles.GLES30.glBlitFramebuffer(srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
    }

    @Override public void glRenderbufferStorageMultisample(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        org.lwjgl.opengles.GLES30.glRenderbufferStorageMultisample(target, samples, internalformat, width, height);
    }

    @Override public void glFramebufferTextureLayer(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int layer) {
        org.lwjgl.opengles.GLES30.glFramebufferTextureLayer(target, attachment, texture, level, layer);
    }

    @Override public long nglMapBufferRange(int target, long offset, long length, int access) {
        return org.lwjgl.opengles.GLES30.nglMapBufferRange(target, offset, length, access);
    }

@Nullable
@NativeType("void *")
    @Override public ByteBuffer glMapBufferRange(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length, @NativeType("GLbitfield") int access) {
        return org.lwjgl.opengles.GLES30.glMapBufferRange(target, offset, length, access);
    }

@Nullable
@NativeType("void *")
    @Override public ByteBuffer glMapBufferRange(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length, @NativeType("GLbitfield") int access, @Nullable ByteBuffer old_buffer) {
        return org.lwjgl.opengles.GLES30.glMapBufferRange(target, offset, length, access, old_buffer);
    }

    @Override public void glFlushMappedBufferRange(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length) {
        org.lwjgl.opengles.GLES30.glFlushMappedBufferRange(target, offset, length);
    }

    @Override public void glBindVertexArray(@NativeType("GLuint") int array) {
        org.lwjgl.opengles.GLES30.glBindVertexArray(array);
    }

    @Override public void nglDeleteVertexArrays(int n, long arrays) {
        org.lwjgl.opengles.GLES30.nglDeleteVertexArrays(n, arrays);
    }

    @Override public void glDeleteVertexArrays(@NativeType("GLuint const *") IntBuffer arrays) {
        org.lwjgl.opengles.GLES30.glDeleteVertexArrays(arrays);
    }

    @Override public void glDeleteVertexArrays(@NativeType("GLuint const *") int array) {
        org.lwjgl.opengles.GLES30.glDeleteVertexArrays(array);
    }

    @Override public void glDeleteVertexArrays(@NativeType("GLuint const *") int[] arrays) {
        org.lwjgl.opengles.GLES30.glDeleteVertexArrays(arrays);
    }

    @Override public void nglGenVertexArrays(int n, long arrays) {
        org.lwjgl.opengles.GLES30.nglGenVertexArrays(n, arrays);
    }

    @Override public void glGenVertexArrays(@NativeType("GLuint *") IntBuffer arrays) {
        org.lwjgl.opengles.GLES30.glGenVertexArrays(arrays);
    }

@NativeType("void")
    @Override public int glGenVertexArrays() {
        return org.lwjgl.opengles.GLES30.glGenVertexArrays();
    }

    @Override public void glGenVertexArrays(@NativeType("GLuint *") int[] arrays) {
        org.lwjgl.opengles.GLES30.glGenVertexArrays(arrays);
    }

@NativeType("GLboolean")
    @Override public boolean glIsVertexArray(@NativeType("GLuint") int array) {
        return org.lwjgl.opengles.GLES30.glIsVertexArray(array);
    }

    @Override public void nglGetIntegeri_v(int target, int index, long data) {
        org.lwjgl.opengles.GLES30.nglGetIntegeri_v(target, index, data);
    }

    @Override public void glGetIntegeri_v(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint *") IntBuffer data) {
        org.lwjgl.opengles.GLES30.glGetIntegeri_v(target, index, data);
    }

    @Override public void glGetIntegeri_v(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint *") int[] data) {
        org.lwjgl.opengles.GLES30.glGetIntegeri_v(target, index, data);
    }

@NativeType("void")
    @Override public int glGetIntegeri(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        return org.lwjgl.opengles.GLES30.glGetIntegeri(target, index);
    }

    @Override public void glBeginTransformFeedback(@NativeType("GLenum") int primitiveMode) {
        org.lwjgl.opengles.GLES30.glBeginTransformFeedback(primitiveMode);
    }

    @Override public void glEndTransformFeedback() {
        org.lwjgl.opengles.GLES30.glEndTransformFeedback();
    }

    @Override public void glBindBufferRange(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size) {
        org.lwjgl.opengles.GLES30.glBindBufferRange(target, index, buffer, offset, size);
    }

    @Override public void glBindBufferBase(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint") int buffer) {
        org.lwjgl.opengles.GLES30.glBindBufferBase(target, index, buffer);
    }

    @Override public void nglTransformFeedbackVaryings(int program, int count, long varyings, int bufferMode) {
        org.lwjgl.opengles.GLES30.nglTransformFeedbackVaryings(program, count, varyings, bufferMode);
    }

    @Override public void glTransformFeedbackVaryings(@NativeType("GLuint") int program, @NativeType("GLchar const * const *") PointerBuffer varyings, @NativeType("GLenum") int bufferMode) {
        org.lwjgl.opengles.GLES30.glTransformFeedbackVaryings(program, varyings, bufferMode);
    }

    @Override public void glTransformFeedbackVaryings(@NativeType("GLuint") int program, @NativeType("GLchar const * const *") CharSequence[] varyings, @NativeType("GLenum") int bufferMode) {
        org.lwjgl.opengles.GLES30.glTransformFeedbackVaryings(program, varyings, bufferMode);
    }

    @Override public void glTransformFeedbackVaryings(@NativeType("GLuint") int program, @NativeType("GLchar const * const *") CharSequence varying, @NativeType("GLenum") int bufferMode) {
        org.lwjgl.opengles.GLES30.glTransformFeedbackVaryings(program, varying, bufferMode);
    }

    @Override public void nglGetTransformFeedbackVarying(int program, int index, int bufSize, long length, long size, long type, long name) {
        org.lwjgl.opengles.GLES30.nglGetTransformFeedbackVarying(program, index, bufSize, length, size, type, name);
    }

    @Override public void glGetTransformFeedbackVarying(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLsizei *") IntBuffer size, @NativeType("GLenum *") IntBuffer type, @NativeType("GLchar *") ByteBuffer name) {
        org.lwjgl.opengles.GLES30.glGetTransformFeedbackVarying(program, index, length, size, type, name);
    }

@NativeType("void")
    @Override public String glGetTransformFeedbackVarying(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei") int bufSize, @NativeType("GLsizei *") IntBuffer size, @NativeType("GLenum *") IntBuffer type) {
        return org.lwjgl.opengles.GLES30.glGetTransformFeedbackVarying(program, index, bufSize, size, type);
    }

@NativeType("void")
    @Override public String glGetTransformFeedbackVarying(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei *") IntBuffer size, @NativeType("GLenum *") IntBuffer type) {
        return org.lwjgl.opengles.GLES30.glGetTransformFeedbackVarying(program, index, size, type);
    }

    @Override public void glGetTransformFeedbackVarying(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLsizei *") int[] size, @NativeType("GLenum *") int[] type, @NativeType("GLchar *") ByteBuffer name) {
        org.lwjgl.opengles.GLES30.glGetTransformFeedbackVarying(program, index, length, size, type, name);
    }

    @Override public void nglVertexAttribIPointer(int index, int size, int type, int stride, long pointer) {
        org.lwjgl.opengles.GLES30.nglVertexAttribIPointer(index, size, type, stride, pointer);
    }

    @Override public void glVertexAttribIPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        org.lwjgl.opengles.GLES30.glVertexAttribIPointer(index, size, type, stride, pointer);
    }

    @Override public void glVertexAttribIPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        org.lwjgl.opengles.GLES30.glVertexAttribIPointer(index, size, type, stride, pointer);
    }

    @Override public void glVertexAttribIPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer) {
        org.lwjgl.opengles.GLES30.glVertexAttribIPointer(index, size, type, stride, pointer);
    }

    @Override public void glVertexAttribIPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") IntBuffer pointer) {
        org.lwjgl.opengles.GLES30.glVertexAttribIPointer(index, size, type, stride, pointer);
    }

    @Override public void nglGetVertexAttribIiv(int index, int pname, long params) {
        org.lwjgl.opengles.GLES30.nglGetVertexAttribIiv(index, pname, params);
    }

    @Override public void glGetVertexAttribIiv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengles.GLES30.glGetVertexAttribIiv(index, pname, params);
    }

    @Override public void glGetVertexAttribIiv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengles.GLES30.glGetVertexAttribIiv(index, pname, params);
    }

@NativeType("void")
    @Override public int glGetVertexAttribIi(@NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengles.GLES30.glGetVertexAttribIi(index, pname);
    }

    @Override public void nglGetVertexAttribIuiv(int index, int pname, long params) {
        org.lwjgl.opengles.GLES30.nglGetVertexAttribIuiv(index, pname, params);
    }

    @Override public void glGetVertexAttribIuiv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        org.lwjgl.opengles.GLES30.glGetVertexAttribIuiv(index, pname, params);
    }

    @Override public void glGetVertexAttribIuiv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        org.lwjgl.opengles.GLES30.glGetVertexAttribIuiv(index, pname, params);
    }

@NativeType("void")
    @Override public int glGetVertexAttribIui(@NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengles.GLES30.glGetVertexAttribIui(index, pname);
    }

    @Override public void glVertexAttribI4i(@NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z, @NativeType("GLint") int w) {
        org.lwjgl.opengles.GLES30.glVertexAttribI4i(index, x, y, z, w);
    }

    @Override public void glVertexAttribI4ui(@NativeType("GLuint") int index, @NativeType("GLuint") int x, @NativeType("GLuint") int y, @NativeType("GLuint") int z, @NativeType("GLuint") int w) {
        org.lwjgl.opengles.GLES30.glVertexAttribI4ui(index, x, y, z, w);
    }

    @Override public void nglVertexAttribI4iv(int index, long v) {
        org.lwjgl.opengles.GLES30.nglVertexAttribI4iv(index, v);
    }

    @Override public void glVertexAttribI4iv(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        org.lwjgl.opengles.GLES30.glVertexAttribI4iv(index, v);
    }

    @Override public void glVertexAttribI4iv(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        org.lwjgl.opengles.GLES30.glVertexAttribI4iv(index, v);
    }

    @Override public void nglVertexAttribI4uiv(int index, long v) {
        org.lwjgl.opengles.GLES30.nglVertexAttribI4uiv(index, v);
    }

    @Override public void glVertexAttribI4uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer v) {
        org.lwjgl.opengles.GLES30.glVertexAttribI4uiv(index, v);
    }

    @Override public void glVertexAttribI4uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        org.lwjgl.opengles.GLES30.glVertexAttribI4uiv(index, v);
    }

    @Override public void nglGetUniformuiv(int program, int location, long params) {
        org.lwjgl.opengles.GLES30.nglGetUniformuiv(program, location, params);
    }

    @Override public void glGetUniformuiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint *") IntBuffer params) {
        org.lwjgl.opengles.GLES30.glGetUniformuiv(program, location, params);
    }

    @Override public void glGetUniformuiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint *") int[] params) {
        org.lwjgl.opengles.GLES30.glGetUniformuiv(program, location, params);
    }

@NativeType("void")
    @Override public int glGetUniformui(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        return org.lwjgl.opengles.GLES30.glGetUniformui(program, location);
    }

    @Override public int nglGetFragDataLocation(int program, long name) {
        return org.lwjgl.opengles.GLES30.nglGetFragDataLocation(program, name);
    }

@NativeType("GLint")
    @Override public int glGetFragDataLocation(@NativeType("GLuint") int program, @NativeType("GLchar const *") ByteBuffer name) {
        return org.lwjgl.opengles.GLES30.glGetFragDataLocation(program, name);
    }

@NativeType("GLint")
    @Override public int glGetFragDataLocation(@NativeType("GLuint") int program, @NativeType("GLchar const *") CharSequence name) {
        return org.lwjgl.opengles.GLES30.glGetFragDataLocation(program, name);
    }

    @Override public void glUniform1ui(@NativeType("GLint") int location, @NativeType("GLuint") int v0) {
        org.lwjgl.opengles.GLES30.glUniform1ui(location, v0);
    }

    @Override public void glUniform2ui(@NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1) {
        org.lwjgl.opengles.GLES30.glUniform2ui(location, v0, v1);
    }

    @Override public void glUniform3ui(@NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1, @NativeType("GLuint") int v2) {
        org.lwjgl.opengles.GLES30.glUniform3ui(location, v0, v1, v2);
    }

    @Override public void glUniform4ui(@NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1, @NativeType("GLuint") int v2, @NativeType("GLuint") int v3) {
        org.lwjgl.opengles.GLES30.glUniform4ui(location, v0, v1, v2, v3);
    }

    @Override public void nglUniform1uiv(int location, int count, long value) {
        org.lwjgl.opengles.GLES30.nglUniform1uiv(location, count, value);
    }

    @Override public void glUniform1uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        org.lwjgl.opengles.GLES30.glUniform1uiv(location, value);
    }

    @Override public void glUniform1uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        org.lwjgl.opengles.GLES30.glUniform1uiv(location, value);
    }

    @Override public void nglUniform2uiv(int location, int count, long value) {
        org.lwjgl.opengles.GLES30.nglUniform2uiv(location, count, value);
    }

    @Override public void glUniform2uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        org.lwjgl.opengles.GLES30.glUniform2uiv(location, value);
    }

    @Override public void glUniform2uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        org.lwjgl.opengles.GLES30.glUniform2uiv(location, value);
    }

    @Override public void nglUniform3uiv(int location, int count, long value) {
        org.lwjgl.opengles.GLES30.nglUniform3uiv(location, count, value);
    }

    @Override public void glUniform3uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        org.lwjgl.opengles.GLES30.glUniform3uiv(location, value);
    }

    @Override public void glUniform3uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        org.lwjgl.opengles.GLES30.glUniform3uiv(location, value);
    }

    @Override public void nglUniform4uiv(int location, int count, long value) {
        org.lwjgl.opengles.GLES30.nglUniform4uiv(location, count, value);
    }

    @Override public void glUniform4uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        org.lwjgl.opengles.GLES30.glUniform4uiv(location, value);
    }

    @Override public void glUniform4uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        org.lwjgl.opengles.GLES30.glUniform4uiv(location, value);
    }

    @Override public void nglClearBufferiv(int buffer, int drawbuffer, long value) {
        org.lwjgl.opengles.GLES30.nglClearBufferiv(buffer, drawbuffer, value);
    }

    @Override public void glClearBufferiv(@NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLint const *") IntBuffer value) {
        org.lwjgl.opengles.GLES30.glClearBufferiv(buffer, drawbuffer, value);
    }

    @Override public void glClearBufferiv(@NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLint const *") int[] value) {
        org.lwjgl.opengles.GLES30.glClearBufferiv(buffer, drawbuffer, value);
    }

    @Override public void nglClearBufferuiv(int buffer, int drawbuffer, long value) {
        org.lwjgl.opengles.GLES30.nglClearBufferuiv(buffer, drawbuffer, value);
    }

    @Override public void glClearBufferuiv(@NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLuint const *") IntBuffer value) {
        org.lwjgl.opengles.GLES30.glClearBufferuiv(buffer, drawbuffer, value);
    }

    @Override public void glClearBufferuiv(@NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLuint const *") int[] value) {
        org.lwjgl.opengles.GLES30.glClearBufferuiv(buffer, drawbuffer, value);
    }

    @Override public void nglClearBufferfv(int buffer, int drawbuffer, long value) {
        org.lwjgl.opengles.GLES30.nglClearBufferfv(buffer, drawbuffer, value);
    }

    @Override public void glClearBufferfv(@NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengles.GLES30.glClearBufferfv(buffer, drawbuffer, value);
    }

    @Override public void glClearBufferfv(@NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengles.GLES30.glClearBufferfv(buffer, drawbuffer, value);
    }

    @Override public void glClearBufferfi(@NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLfloat") float depth, @NativeType("GLint") int stencil) {
        org.lwjgl.opengles.GLES30.glClearBufferfi(buffer, drawbuffer, depth, stencil);
    }

    @Override public long nglGetStringi(int name, int index) {
        return org.lwjgl.opengles.GLES30.nglGetStringi(name, index);
    }

@Nullable
@NativeType("GLubyte const *")
    @Override public String glGetStringi(@NativeType("GLenum") int name, @NativeType("GLuint") int index) {
        return org.lwjgl.opengles.GLES30.glGetStringi(name, index);
    }

    @Override public void glCopyBufferSubData(@NativeType("GLenum") int readTarget, @NativeType("GLenum") int writeTarget, @NativeType("GLintptr") long readOffset, @NativeType("GLintptr") long writeOffset, @NativeType("GLsizeiptr") long size) {
        org.lwjgl.opengles.GLES30.glCopyBufferSubData(readTarget, writeTarget, readOffset, writeOffset, size);
    }

    @Override public void nglGetUniformIndices(int program, int uniformCount, long uniformNames, long uniformIndices) {
        org.lwjgl.opengles.GLES30.nglGetUniformIndices(program, uniformCount, uniformNames, uniformIndices);
    }

    @Override public void glGetUniformIndices(@NativeType("GLuint") int program, @NativeType("GLchar const * const *") PointerBuffer uniformNames, @NativeType("GLuint *") IntBuffer uniformIndices) {
        org.lwjgl.opengles.GLES30.glGetUniformIndices(program, uniformNames, uniformIndices);
    }

    @Override public void glGetUniformIndices(@NativeType("GLuint") int program, @NativeType("GLchar const * const *") PointerBuffer uniformNames, @NativeType("GLuint *") int[] uniformIndices) {
        org.lwjgl.opengles.GLES30.glGetUniformIndices(program, uniformNames, uniformIndices);
    }

    @Override public void nglGetActiveUniformsiv(int program, int uniformCount, long uniformIndices, int pname, long params) {
        org.lwjgl.opengles.GLES30.nglGetActiveUniformsiv(program, uniformCount, uniformIndices, pname, params);
    }

    @Override public void glGetActiveUniformsiv(@NativeType("GLuint") int program, @NativeType("GLuint const *") IntBuffer uniformIndices, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengles.GLES30.glGetActiveUniformsiv(program, uniformIndices, pname, params);
    }

    @Override public void glGetActiveUniformsiv(@NativeType("GLuint") int program, @NativeType("GLuint const *") int[] uniformIndices, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengles.GLES30.glGetActiveUniformsiv(program, uniformIndices, pname, params);
    }

    @Override public int nglGetUniformBlockIndex(int program, long uniformBlockName) {
        return org.lwjgl.opengles.GLES30.nglGetUniformBlockIndex(program, uniformBlockName);
    }

@NativeType("GLuint")
    @Override public int glGetUniformBlockIndex(@NativeType("GLuint") int program, @NativeType("GLchar const *") ByteBuffer uniformBlockName) {
        return org.lwjgl.opengles.GLES30.glGetUniformBlockIndex(program, uniformBlockName);
    }

@NativeType("GLuint")
    @Override public int glGetUniformBlockIndex(@NativeType("GLuint") int program, @NativeType("GLchar const *") CharSequence uniformBlockName) {
        return org.lwjgl.opengles.GLES30.glGetUniformBlockIndex(program, uniformBlockName);
    }

    @Override public void nglGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, long params) {
        org.lwjgl.opengles.GLES30.nglGetActiveUniformBlockiv(program, uniformBlockIndex, pname, params);
    }

    @Override public void glGetActiveUniformBlockiv(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengles.GLES30.glGetActiveUniformBlockiv(program, uniformBlockIndex, pname, params);
    }

    @Override public void glGetActiveUniformBlockiv(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengles.GLES30.glGetActiveUniformBlockiv(program, uniformBlockIndex, pname, params);
    }

@NativeType("void")
    @Override public int glGetActiveUniformBlocki(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengles.GLES30.glGetActiveUniformBlocki(program, uniformBlockIndex, pname);
    }

    @Override public void nglGetActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize, long length, long uniformBlockName) {
        org.lwjgl.opengles.GLES30.nglGetActiveUniformBlockName(program, uniformBlockIndex, bufSize, length, uniformBlockName);
    }

    @Override public void glGetActiveUniformBlockName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLchar *") ByteBuffer uniformBlockName) {
        org.lwjgl.opengles.GLES30.glGetActiveUniformBlockName(program, uniformBlockIndex, length, uniformBlockName);
    }

@NativeType("void")
    @Override public String glGetActiveUniformBlockName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @NativeType("GLsizei") int bufSize) {
        return org.lwjgl.opengles.GLES30.glGetActiveUniformBlockName(program, uniformBlockIndex, bufSize);
    }

@NativeType("void")
    @Override public String glGetActiveUniformBlockName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex) {
        return org.lwjgl.opengles.GLES30.glGetActiveUniformBlockName(program, uniformBlockIndex);
    }

    @Override public void glGetActiveUniformBlockName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLchar *") ByteBuffer uniformBlockName) {
        org.lwjgl.opengles.GLES30.glGetActiveUniformBlockName(program, uniformBlockIndex, length, uniformBlockName);
    }

    @Override public void glUniformBlockBinding(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @NativeType("GLuint") int uniformBlockBinding) {
        org.lwjgl.opengles.GLES30.glUniformBlockBinding(program, uniformBlockIndex, uniformBlockBinding);
    }

    @Override public void glDrawArraysInstanced(@NativeType("GLenum") int mode, @NativeType("GLint") int first, @NativeType("GLsizei") int count, @NativeType("GLsizei") int instancecount) {
        org.lwjgl.opengles.GLES30.glDrawArraysInstanced(mode, first, count, instancecount);
    }

    @Override public void nglDrawElementsInstanced(int mode, int count, int type, long indices, int instancecount) {
        org.lwjgl.opengles.GLES30.nglDrawElementsInstanced(mode, count, type, indices, instancecount);
    }

    @Override public void glDrawElementsInstanced(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLsizei") int instancecount) {
        org.lwjgl.opengles.GLES30.glDrawElementsInstanced(mode, count, type, indices, instancecount);
    }

    @Override public void glDrawElementsInstanced(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int instancecount) {
        org.lwjgl.opengles.GLES30.glDrawElementsInstanced(mode, type, indices, instancecount);
    }

    @Override public void glDrawElementsInstanced(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int instancecount) {
        org.lwjgl.opengles.GLES30.glDrawElementsInstanced(mode, indices, instancecount);
    }

    @Override public void glDrawElementsInstanced(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices, @NativeType("GLsizei") int instancecount) {
        org.lwjgl.opengles.GLES30.glDrawElementsInstanced(mode, indices, instancecount);
    }

    @Override public void glDrawElementsInstanced(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices, @NativeType("GLsizei") int instancecount) {
        org.lwjgl.opengles.GLES30.glDrawElementsInstanced(mode, indices, instancecount);
    }

@NativeType("GLsync")
    @Override public long glFenceSync(@NativeType("GLenum") int condition, @NativeType("GLbitfield") int flags) {
        return org.lwjgl.opengles.GLES30.glFenceSync(condition, flags);
    }

    @Override public boolean nglIsSync(long sync) {
        return org.lwjgl.opengles.GLES30.nglIsSync(sync);
    }

@NativeType("GLboolean")
    @Override public boolean glIsSync(@NativeType("GLsync") long sync) {
        return org.lwjgl.opengles.GLES30.glIsSync(sync);
    }

    @Override public void nglDeleteSync(long sync) {
        org.lwjgl.opengles.GLES30.nglDeleteSync(sync);
    }

    @Override public void glDeleteSync(@NativeType("GLsync") long sync) {
        org.lwjgl.opengles.GLES30.glDeleteSync(sync);
    }

    @Override public int nglClientWaitSync(long sync, int flags, long timeout) {
        return org.lwjgl.opengles.GLES30.nglClientWaitSync(sync, flags, timeout);
    }

@NativeType("GLenum")
    @Override public int glClientWaitSync(@NativeType("GLsync") long sync, @NativeType("GLbitfield") int flags, @NativeType("GLuint64") long timeout) {
        return org.lwjgl.opengles.GLES30.glClientWaitSync(sync, flags, timeout);
    }

    @Override public void nglWaitSync(long sync, int flags, long timeout) {
        org.lwjgl.opengles.GLES30.nglWaitSync(sync, flags, timeout);
    }

    @Override public void glWaitSync(@NativeType("GLsync") long sync, @NativeType("GLbitfield") int flags, @NativeType("GLuint64") long timeout) {
        org.lwjgl.opengles.GLES30.glWaitSync(sync, flags, timeout);
    }

    @Override public void nglGetInteger64v(int pname, long data) {
        org.lwjgl.opengles.GLES30.nglGetInteger64v(pname, data);
    }

    @Override public void glGetInteger64v(@NativeType("GLenum") int pname, @NativeType("GLint64 *") LongBuffer data) {
        org.lwjgl.opengles.GLES30.glGetInteger64v(pname, data);
    }

    @Override public void glGetInteger64v(@NativeType("GLenum") int pname, @NativeType("GLint64 *") long[] data) {
        org.lwjgl.opengles.GLES30.glGetInteger64v(pname, data);
    }

@NativeType("void")
    @Override public long glGetInteger64(@NativeType("GLenum") int pname) {
        return org.lwjgl.opengles.GLES30.glGetInteger64(pname);
    }

    @Override public void nglGetSynciv(long sync, int pname, int bufSize, long length, long values) {
        org.lwjgl.opengles.GLES30.nglGetSynciv(sync, pname, bufSize, length, values);
    }

    @Override public void glGetSynciv(@NativeType("GLsync") long sync, @NativeType("GLenum") int pname, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLint *") IntBuffer values) {
        org.lwjgl.opengles.GLES30.glGetSynciv(sync, pname, length, values);
    }

    @Override public void glGetSynciv(@NativeType("GLsync") long sync, @NativeType("GLenum") int pname, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLint *") int[] values) {
        org.lwjgl.opengles.GLES30.glGetSynciv(sync, pname, length, values);
    }

@NativeType("void")
    @Override public int glGetSynci(@NativeType("GLsync") long sync, @NativeType("GLenum") int pname, @Nullable @NativeType("GLsizei *") IntBuffer length) {
        return org.lwjgl.opengles.GLES30.glGetSynci(sync, pname, length);
    }

    @Override public void nglGetInteger64i_v(int target, int index, long data) {
        org.lwjgl.opengles.GLES30.nglGetInteger64i_v(target, index, data);
    }

    @Override public void glGetInteger64i_v(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint64 *") LongBuffer data) {
        org.lwjgl.opengles.GLES30.glGetInteger64i_v(target, index, data);
    }

    @Override public void glGetInteger64i_v(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint64 *") long[] data) {
        org.lwjgl.opengles.GLES30.glGetInteger64i_v(target, index, data);
    }

@NativeType("void")
    @Override public long glGetInteger64i(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        return org.lwjgl.opengles.GLES30.glGetInteger64i(target, index);
    }

    @Override public void nglGetBufferParameteri64v(int target, int pname, long params) {
        org.lwjgl.opengles.GLES30.nglGetBufferParameteri64v(target, pname, params);
    }

    @Override public void glGetBufferParameteri64v(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint64 *") LongBuffer params) {
        org.lwjgl.opengles.GLES30.glGetBufferParameteri64v(target, pname, params);
    }

    @Override public void glGetBufferParameteri64v(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint64 *") long[] params) {
        org.lwjgl.opengles.GLES30.glGetBufferParameteri64v(target, pname, params);
    }

@NativeType("void")
    @Override public long glGetBufferParameteri64(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengles.GLES30.glGetBufferParameteri64(target, pname);
    }

    @Override public void nglGenSamplers(int count, long samplers) {
        org.lwjgl.opengles.GLES30.nglGenSamplers(count, samplers);
    }

    @Override public void glGenSamplers(@NativeType("GLuint *") IntBuffer samplers) {
        org.lwjgl.opengles.GLES30.glGenSamplers(samplers);
    }

@NativeType("void")
    @Override public int glGenSamplers() {
        return org.lwjgl.opengles.GLES30.glGenSamplers();
    }

    @Override public void glGenSamplers(@NativeType("GLuint *") int[] samplers) {
        org.lwjgl.opengles.GLES30.glGenSamplers(samplers);
    }

    @Override public void nglDeleteSamplers(int count, long samplers) {
        org.lwjgl.opengles.GLES30.nglDeleteSamplers(count, samplers);
    }

    @Override public void glDeleteSamplers(@NativeType("GLuint const *") IntBuffer samplers) {
        org.lwjgl.opengles.GLES30.glDeleteSamplers(samplers);
    }

    @Override public void glDeleteSamplers(@NativeType("GLuint const *") int sampler) {
        org.lwjgl.opengles.GLES30.glDeleteSamplers(sampler);
    }

    @Override public void glDeleteSamplers(@NativeType("GLuint const *") int[] samplers) {
        org.lwjgl.opengles.GLES30.glDeleteSamplers(samplers);
    }

@NativeType("GLboolean")
    @Override public boolean glIsSampler(@NativeType("GLuint") int sampler) {
        return org.lwjgl.opengles.GLES30.glIsSampler(sampler);
    }

    @Override public void glBindSampler(@NativeType("GLuint") int unit, @NativeType("GLuint") int sampler) {
        org.lwjgl.opengles.GLES30.glBindSampler(unit, sampler);
    }

    @Override public void glSamplerParameteri(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        org.lwjgl.opengles.GLES30.glSamplerParameteri(sampler, pname, param);
    }

    @Override public void nglSamplerParameteriv(int sampler, int pname, long param) {
        org.lwjgl.opengles.GLES30.nglSamplerParameteriv(sampler, pname, param);
    }

    @Override public void glSamplerParameteriv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer param) {
        org.lwjgl.opengles.GLES30.glSamplerParameteriv(sampler, pname, param);
    }

    @Override public void glSamplerParameteriv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] param) {
        org.lwjgl.opengles.GLES30.glSamplerParameteriv(sampler, pname, param);
    }

    @Override public void glSamplerParameterf(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param) {
        org.lwjgl.opengles.GLES30.glSamplerParameterf(sampler, pname, param);
    }

    @Override public void nglSamplerParameterfv(int sampler, int pname, long param) {
        org.lwjgl.opengles.GLES30.nglSamplerParameterfv(sampler, pname, param);
    }

    @Override public void glSamplerParameterfv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer param) {
        org.lwjgl.opengles.GLES30.glSamplerParameterfv(sampler, pname, param);
    }

    @Override public void glSamplerParameterfv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] param) {
        org.lwjgl.opengles.GLES30.glSamplerParameterfv(sampler, pname, param);
    }

    @Override public void nglGetSamplerParameteriv(int sampler, int pname, long params) {
        org.lwjgl.opengles.GLES30.nglGetSamplerParameteriv(sampler, pname, params);
    }

    @Override public void glGetSamplerParameteriv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengles.GLES30.glGetSamplerParameteriv(sampler, pname, params);
    }

    @Override public void glGetSamplerParameteriv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengles.GLES30.glGetSamplerParameteriv(sampler, pname, params);
    }

@NativeType("void")
    @Override public int glGetSamplerParameteri(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengles.GLES30.glGetSamplerParameteri(sampler, pname);
    }

    @Override public void nglGetSamplerParameterfv(int sampler, int pname, long params) {
        org.lwjgl.opengles.GLES30.nglGetSamplerParameterfv(sampler, pname, params);
    }

    @Override public void glGetSamplerParameterfv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        org.lwjgl.opengles.GLES30.glGetSamplerParameterfv(sampler, pname, params);
    }

    @Override public void glGetSamplerParameterfv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        org.lwjgl.opengles.GLES30.glGetSamplerParameterfv(sampler, pname, params);
    }

@NativeType("void")
    @Override public float glGetSamplerParameterf(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengles.GLES30.glGetSamplerParameterf(sampler, pname);
    }

    @Override public void glVertexAttribDivisor(@NativeType("GLuint") int index, @NativeType("GLuint") int divisor) {
        org.lwjgl.opengles.GLES30.glVertexAttribDivisor(index, divisor);
    }

    @Override public void glBindTransformFeedback(@NativeType("GLenum") int target, @NativeType("GLuint") int id) {
        org.lwjgl.opengles.GLES30.glBindTransformFeedback(target, id);
    }

    @Override public void nglDeleteTransformFeedbacks(int n, long ids) {
        org.lwjgl.opengles.GLES30.nglDeleteTransformFeedbacks(n, ids);
    }

    @Override public void glDeleteTransformFeedbacks(@NativeType("GLuint const *") IntBuffer ids) {
        org.lwjgl.opengles.GLES30.glDeleteTransformFeedbacks(ids);
    }

    @Override public void glDeleteTransformFeedbacks(@NativeType("GLuint const *") int id) {
        org.lwjgl.opengles.GLES30.glDeleteTransformFeedbacks(id);
    }

    @Override public void glDeleteTransformFeedbacks(@NativeType("GLuint const *") int[] ids) {
        org.lwjgl.opengles.GLES30.glDeleteTransformFeedbacks(ids);
    }

    @Override public void nglGenTransformFeedbacks(int n, long ids) {
        org.lwjgl.opengles.GLES30.nglGenTransformFeedbacks(n, ids);
    }

    @Override public void glGenTransformFeedbacks(@NativeType("GLuint *") IntBuffer ids) {
        org.lwjgl.opengles.GLES30.glGenTransformFeedbacks(ids);
    }

@NativeType("void")
    @Override public int glGenTransformFeedbacks() {
        return org.lwjgl.opengles.GLES30.glGenTransformFeedbacks();
    }

    @Override public void glGenTransformFeedbacks(@NativeType("GLuint *") int[] ids) {
        org.lwjgl.opengles.GLES30.glGenTransformFeedbacks(ids);
    }

@NativeType("GLboolean")
    @Override public boolean glIsTransformFeedback(@NativeType("GLuint") int id) {
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

    @Override public void glGetProgramBinary(@NativeType("GLuint") int program, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLenum *") IntBuffer binaryFormat, @NativeType("void *") ByteBuffer binary) {
        org.lwjgl.opengles.GLES30.glGetProgramBinary(program, length, binaryFormat, binary);
    }

    @Override public void glGetProgramBinary(@NativeType("GLuint") int program, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLenum *") int[] binaryFormat, @NativeType("void *") ByteBuffer binary) {
        org.lwjgl.opengles.GLES30.glGetProgramBinary(program, length, binaryFormat, binary);
    }

    @Override public void nglProgramBinary(int program, int binaryFormat, long binary, int length) {
        org.lwjgl.opengles.GLES30.nglProgramBinary(program, binaryFormat, binary, length);
    }

    @Override public void glProgramBinary(@NativeType("GLuint") int program, @NativeType("GLenum") int binaryFormat, @NativeType("void const *") ByteBuffer binary) {
        org.lwjgl.opengles.GLES30.glProgramBinary(program, binaryFormat, binary);
    }

    @Override public void glProgramParameteri(@NativeType("GLuint") int program, @NativeType("GLenum") int pname, @NativeType("GLint") int value) {
        org.lwjgl.opengles.GLES30.glProgramParameteri(program, pname, value);
    }

    @Override public void nglInvalidateFramebuffer(int target, int numAttachments, long attachments) {
        org.lwjgl.opengles.GLES30.nglInvalidateFramebuffer(target, numAttachments, attachments);
    }

    @Override public void glInvalidateFramebuffer(@NativeType("GLenum") int target, @NativeType("GLenum const *") IntBuffer attachments) {
        org.lwjgl.opengles.GLES30.glInvalidateFramebuffer(target, attachments);
    }

    @Override public void glInvalidateFramebuffer(@NativeType("GLenum") int target, @NativeType("GLenum const *") int attachment) {
        org.lwjgl.opengles.GLES30.glInvalidateFramebuffer(target, attachment);
    }

    @Override public void glInvalidateFramebuffer(@NativeType("GLenum") int target, @NativeType("GLenum const *") int[] attachments) {
        org.lwjgl.opengles.GLES30.glInvalidateFramebuffer(target, attachments);
    }

    @Override public void nglInvalidateSubFramebuffer(int target, int numAttachments, long attachments, int x, int y, int width, int height) {
        org.lwjgl.opengles.GLES30.nglInvalidateSubFramebuffer(target, numAttachments, attachments, x, y, width, height);
    }

    @Override public void glInvalidateSubFramebuffer(@NativeType("GLenum") int target, @NativeType("GLenum const *") IntBuffer attachments, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        org.lwjgl.opengles.GLES30.glInvalidateSubFramebuffer(target, attachments, x, y, width, height);
    }

    @Override public void glInvalidateSubFramebuffer(@NativeType("GLenum") int target, @NativeType("GLenum const *") int attachment, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        org.lwjgl.opengles.GLES30.glInvalidateSubFramebuffer(target, attachment, x, y, width, height);
    }

    @Override public void glInvalidateSubFramebuffer(@NativeType("GLenum") int target, @NativeType("GLenum const *") int[] attachments, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        org.lwjgl.opengles.GLES30.glInvalidateSubFramebuffer(target, attachments, x, y, width, height);
    }

    @Override public void glTexStorage2D(@NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        org.lwjgl.opengles.GLES30.glTexStorage2D(target, levels, internalformat, width, height);
    }

    @Override public void glTexStorage3D(@NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth) {
        org.lwjgl.opengles.GLES30.glTexStorage3D(target, levels, internalformat, width, height, depth);
    }

    @Override public void nglGetInternalformativ(int target, int internalformat, int pname, int bufSize, long params) {
        org.lwjgl.opengles.GLES30.nglGetInternalformativ(target, internalformat, pname, bufSize, params);
    }

    @Override public void glGetInternalformativ(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengles.GLES30.glGetInternalformativ(target, internalformat, pname, params);
    }

    @Override public void glGetInternalformativ(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengles.GLES30.glGetInternalformativ(target, internalformat, pname, params);
    }

@NativeType("void")
    @Override public int glGetInternalformati(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengles.GLES30.glGetInternalformati(target, internalformat, pname);
    }

}
