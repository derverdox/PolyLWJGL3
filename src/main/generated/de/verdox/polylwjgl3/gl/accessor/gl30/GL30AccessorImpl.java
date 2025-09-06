package de.verdox.polylwjgl3.gl.accessor.gl30;

import de.verdox.polylwjgl3.gl.accessor.gl21.GL21Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl21.GL21AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL30;
import org.lwjgl.system.*;

public class GL30AccessorImpl extends GL21AccessorImpl implements GL30Accessor {

    @Override public long nglGetStringi(int name, int index) {
        return org.lwjgl.opengl.GL30.nglGetStringi(name, index);
    }

@Nullable
@NativeType("GLubyte const *")
    @Override public String glGetStringi(@NativeType("GLenum") int name, @NativeType("GLuint") int index) {
        return org.lwjgl.opengl.GL30.glGetStringi(name, index);
    }

    @Override public void nglClearBufferiv(int buffer, int drawbuffer, long value) {
        org.lwjgl.opengl.GL30.nglClearBufferiv(buffer, drawbuffer, value);
    }

    @Override public void glClearBufferiv(@NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLint const *") IntBuffer value) {
        org.lwjgl.opengl.GL30.glClearBufferiv(buffer, drawbuffer, value);
    }

    @Override public void glClearBufferiv(@NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLint const *") int[] value) {
        org.lwjgl.opengl.GL30.glClearBufferiv(buffer, drawbuffer, value);
    }

    @Override public void nglClearBufferuiv(int buffer, int drawbuffer, long value) {
        org.lwjgl.opengl.GL30.nglClearBufferuiv(buffer, drawbuffer, value);
    }

    @Override public void glClearBufferuiv(@NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLint const *") IntBuffer value) {
        org.lwjgl.opengl.GL30.glClearBufferuiv(buffer, drawbuffer, value);
    }

    @Override public void glClearBufferuiv(@NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLint const *") int[] value) {
        org.lwjgl.opengl.GL30.glClearBufferuiv(buffer, drawbuffer, value);
    }

    @Override public void nglClearBufferfv(int buffer, int drawbuffer, long value) {
        org.lwjgl.opengl.GL30.nglClearBufferfv(buffer, drawbuffer, value);
    }

    @Override public void glClearBufferfv(@NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengl.GL30.glClearBufferfv(buffer, drawbuffer, value);
    }

    @Override public void glClearBufferfv(@NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengl.GL30.glClearBufferfv(buffer, drawbuffer, value);
    }

    @Override public void glClearBufferfi(@NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLfloat") float depth, @NativeType("GLint") int stencil) {
        org.lwjgl.opengl.GL30.glClearBufferfi(buffer, drawbuffer, depth, stencil);
    }

    @Override public void glVertexAttribI1i(@NativeType("GLuint") int index, @NativeType("GLint") int x) {
        org.lwjgl.opengl.GL30.glVertexAttribI1i(index, x);
    }

    @Override public void glVertexAttribI2i(@NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y) {
        org.lwjgl.opengl.GL30.glVertexAttribI2i(index, x, y);
    }

    @Override public void glVertexAttribI3i(@NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z) {
        org.lwjgl.opengl.GL30.glVertexAttribI3i(index, x, y, z);
    }

    @Override public void glVertexAttribI4i(@NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z, @NativeType("GLint") int w) {
        org.lwjgl.opengl.GL30.glVertexAttribI4i(index, x, y, z, w);
    }

    @Override public void glVertexAttribI1ui(@NativeType("GLuint") int index, @NativeType("GLuint") int x) {
        org.lwjgl.opengl.GL30.glVertexAttribI1ui(index, x);
    }

    @Override public void glVertexAttribI2ui(@NativeType("GLuint") int index, @NativeType("GLuint") int x, @NativeType("GLuint") int y) {
        org.lwjgl.opengl.GL30.glVertexAttribI2ui(index, x, y);
    }

    @Override public void glVertexAttribI3ui(@NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z) {
        org.lwjgl.opengl.GL30.glVertexAttribI3ui(index, x, y, z);
    }

    @Override public void glVertexAttribI4ui(@NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z, @NativeType("GLint") int w) {
        org.lwjgl.opengl.GL30.glVertexAttribI4ui(index, x, y, z, w);
    }

    @Override public void nglVertexAttribI1iv(int index, long v) {
        org.lwjgl.opengl.GL30.nglVertexAttribI1iv(index, v);
    }

    @Override public void glVertexAttribI1iv(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        org.lwjgl.opengl.GL30.glVertexAttribI1iv(index, v);
    }

    @Override public void glVertexAttribI1iv(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        org.lwjgl.opengl.GL30.glVertexAttribI1iv(index, v);
    }

    @Override public void nglVertexAttribI2iv(int index, long v) {
        org.lwjgl.opengl.GL30.nglVertexAttribI2iv(index, v);
    }

    @Override public void glVertexAttribI2iv(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        org.lwjgl.opengl.GL30.glVertexAttribI2iv(index, v);
    }

    @Override public void glVertexAttribI2iv(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        org.lwjgl.opengl.GL30.glVertexAttribI2iv(index, v);
    }

    @Override public void nglVertexAttribI3iv(int index, long v) {
        org.lwjgl.opengl.GL30.nglVertexAttribI3iv(index, v);
    }

    @Override public void glVertexAttribI3iv(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        org.lwjgl.opengl.GL30.glVertexAttribI3iv(index, v);
    }

    @Override public void glVertexAttribI3iv(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        org.lwjgl.opengl.GL30.glVertexAttribI3iv(index, v);
    }

    @Override public void nglVertexAttribI4iv(int index, long v) {
        org.lwjgl.opengl.GL30.nglVertexAttribI4iv(index, v);
    }

    @Override public void glVertexAttribI4iv(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        org.lwjgl.opengl.GL30.glVertexAttribI4iv(index, v);
    }

    @Override public void glVertexAttribI4iv(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        org.lwjgl.opengl.GL30.glVertexAttribI4iv(index, v);
    }

    @Override public void nglVertexAttribI1uiv(int index, long v) {
        org.lwjgl.opengl.GL30.nglVertexAttribI1uiv(index, v);
    }

    @Override public void glVertexAttribI1uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer v) {
        org.lwjgl.opengl.GL30.glVertexAttribI1uiv(index, v);
    }

    @Override public void glVertexAttribI1uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        org.lwjgl.opengl.GL30.glVertexAttribI1uiv(index, v);
    }

    @Override public void nglVertexAttribI2uiv(int index, long v) {
        org.lwjgl.opengl.GL30.nglVertexAttribI2uiv(index, v);
    }

    @Override public void glVertexAttribI2uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer v) {
        org.lwjgl.opengl.GL30.glVertexAttribI2uiv(index, v);
    }

    @Override public void glVertexAttribI2uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        org.lwjgl.opengl.GL30.glVertexAttribI2uiv(index, v);
    }

    @Override public void nglVertexAttribI3uiv(int index, long v) {
        org.lwjgl.opengl.GL30.nglVertexAttribI3uiv(index, v);
    }

    @Override public void glVertexAttribI3uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer v) {
        org.lwjgl.opengl.GL30.glVertexAttribI3uiv(index, v);
    }

    @Override public void glVertexAttribI3uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        org.lwjgl.opengl.GL30.glVertexAttribI3uiv(index, v);
    }

    @Override public void nglVertexAttribI4uiv(int index, long v) {
        org.lwjgl.opengl.GL30.nglVertexAttribI4uiv(index, v);
    }

    @Override public void glVertexAttribI4uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer v) {
        org.lwjgl.opengl.GL30.glVertexAttribI4uiv(index, v);
    }

    @Override public void glVertexAttribI4uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        org.lwjgl.opengl.GL30.glVertexAttribI4uiv(index, v);
    }

    @Override public void nglVertexAttribI4bv(int index, long v) {
        org.lwjgl.opengl.GL30.nglVertexAttribI4bv(index, v);
    }

    @Override public void glVertexAttribI4bv(@NativeType("GLuint") int index, @NativeType("GLbyte const *") ByteBuffer v) {
        org.lwjgl.opengl.GL30.glVertexAttribI4bv(index, v);
    }

    @Override public void nglVertexAttribI4sv(int index, long v) {
        org.lwjgl.opengl.GL30.nglVertexAttribI4sv(index, v);
    }

    @Override public void glVertexAttribI4sv(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        org.lwjgl.opengl.GL30.glVertexAttribI4sv(index, v);
    }

    @Override public void glVertexAttribI4sv(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        org.lwjgl.opengl.GL30.glVertexAttribI4sv(index, v);
    }

    @Override public void nglVertexAttribI4ubv(int index, long v) {
        org.lwjgl.opengl.GL30.nglVertexAttribI4ubv(index, v);
    }

    @Override public void glVertexAttribI4ubv(@NativeType("GLuint") int index, @NativeType("GLbyte const *") ByteBuffer v) {
        org.lwjgl.opengl.GL30.glVertexAttribI4ubv(index, v);
    }

    @Override public void nglVertexAttribI4usv(int index, long v) {
        org.lwjgl.opengl.GL30.nglVertexAttribI4usv(index, v);
    }

    @Override public void glVertexAttribI4usv(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        org.lwjgl.opengl.GL30.glVertexAttribI4usv(index, v);
    }

    @Override public void glVertexAttribI4usv(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        org.lwjgl.opengl.GL30.glVertexAttribI4usv(index, v);
    }

    @Override public void nglVertexAttribIPointer(int index, int size, int type, int stride, long pointer) {
        org.lwjgl.opengl.GL30.nglVertexAttribIPointer(index, size, type, stride, pointer);
    }

    @Override public void glVertexAttribIPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        org.lwjgl.opengl.GL30.glVertexAttribIPointer(index, size, type, stride, pointer);
    }

    @Override public void glVertexAttribIPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        org.lwjgl.opengl.GL30.glVertexAttribIPointer(index, size, type, stride, pointer);
    }

    @Override public void glVertexAttribIPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer) {
        org.lwjgl.opengl.GL30.glVertexAttribIPointer(index, size, type, stride, pointer);
    }

    @Override public void glVertexAttribIPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") IntBuffer pointer) {
        org.lwjgl.opengl.GL30.glVertexAttribIPointer(index, size, type, stride, pointer);
    }

    @Override public void nglGetVertexAttribIiv(int index, int pname, long params) {
        org.lwjgl.opengl.GL30.nglGetVertexAttribIiv(index, pname, params);
    }

    @Override public void glGetVertexAttribIiv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengl.GL30.glGetVertexAttribIiv(index, pname, params);
    }

    @Override public void glGetVertexAttribIiv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengl.GL30.glGetVertexAttribIiv(index, pname, params);
    }

@NativeType("void")
    @Override public int glGetVertexAttribIi(@NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL30.glGetVertexAttribIi(index, pname);
    }

    @Override public void nglGetVertexAttribIuiv(int index, int pname, long params) {
        org.lwjgl.opengl.GL30.nglGetVertexAttribIuiv(index, pname, params);
    }

    @Override public void glGetVertexAttribIuiv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        org.lwjgl.opengl.GL30.glGetVertexAttribIuiv(index, pname, params);
    }

    @Override public void glGetVertexAttribIuiv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        org.lwjgl.opengl.GL30.glGetVertexAttribIuiv(index, pname, params);
    }

@NativeType("void")
    @Override public int glGetVertexAttribIui(@NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL30.glGetVertexAttribIui(index, pname);
    }

    @Override public void glUniform1ui(@NativeType("GLint") int location, @NativeType("GLuint") int v0) {
        org.lwjgl.opengl.GL30.glUniform1ui(location, v0);
    }

    @Override public void glUniform2ui(@NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1) {
        org.lwjgl.opengl.GL30.glUniform2ui(location, v0, v1);
    }

    @Override public void glUniform3ui(@NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1, @NativeType("GLuint") int v2) {
        org.lwjgl.opengl.GL30.glUniform3ui(location, v0, v1, v2);
    }

    @Override public void glUniform4ui(@NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1, @NativeType("GLuint") int v2, @NativeType("GLuint") int v3) {
        org.lwjgl.opengl.GL30.glUniform4ui(location, v0, v1, v2, v3);
    }

    @Override public void nglUniform1uiv(int location, int count, long value) {
        org.lwjgl.opengl.GL30.nglUniform1uiv(location, count, value);
    }

    @Override public void glUniform1uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        org.lwjgl.opengl.GL30.glUniform1uiv(location, value);
    }

    @Override public void glUniform1uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        org.lwjgl.opengl.GL30.glUniform1uiv(location, value);
    }

    @Override public void nglUniform2uiv(int location, int count, long value) {
        org.lwjgl.opengl.GL30.nglUniform2uiv(location, count, value);
    }

    @Override public void glUniform2uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        org.lwjgl.opengl.GL30.glUniform2uiv(location, value);
    }

    @Override public void glUniform2uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        org.lwjgl.opengl.GL30.glUniform2uiv(location, value);
    }

    @Override public void nglUniform3uiv(int location, int count, long value) {
        org.lwjgl.opengl.GL30.nglUniform3uiv(location, count, value);
    }

    @Override public void glUniform3uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        org.lwjgl.opengl.GL30.glUniform3uiv(location, value);
    }

    @Override public void glUniform3uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        org.lwjgl.opengl.GL30.glUniform3uiv(location, value);
    }

    @Override public void nglUniform4uiv(int location, int count, long value) {
        org.lwjgl.opengl.GL30.nglUniform4uiv(location, count, value);
    }

    @Override public void glUniform4uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        org.lwjgl.opengl.GL30.glUniform4uiv(location, value);
    }

    @Override public void glUniform4uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        org.lwjgl.opengl.GL30.glUniform4uiv(location, value);
    }

    @Override public void nglGetUniformuiv(int program, int location, long params) {
        org.lwjgl.opengl.GL30.nglGetUniformuiv(program, location, params);
    }

    @Override public void glGetUniformuiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint *") IntBuffer params) {
        org.lwjgl.opengl.GL30.glGetUniformuiv(program, location, params);
    }

    @Override public void glGetUniformuiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint *") int[] params) {
        org.lwjgl.opengl.GL30.glGetUniformuiv(program, location, params);
    }

@NativeType("void")
    @Override public int glGetUniformui(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        return org.lwjgl.opengl.GL30.glGetUniformui(program, location);
    }

    @Override public void nglBindFragDataLocation(int program, int colorNumber, long name) {
        org.lwjgl.opengl.GL30.nglBindFragDataLocation(program, colorNumber, name);
    }

    @Override public void glBindFragDataLocation(@NativeType("GLuint") int program, @NativeType("GLuint") int colorNumber, @NativeType("GLchar const *") ByteBuffer name) {
        org.lwjgl.opengl.GL30.glBindFragDataLocation(program, colorNumber, name);
    }

    @Override public void glBindFragDataLocation(@NativeType("GLuint") int program, @NativeType("GLuint") int colorNumber, @NativeType("GLchar const *") CharSequence name) {
        org.lwjgl.opengl.GL30.glBindFragDataLocation(program, colorNumber, name);
    }

    @Override public int nglGetFragDataLocation(int program, long name) {
        return org.lwjgl.opengl.GL30.nglGetFragDataLocation(program, name);
    }

@NativeType("GLint")
    @Override public int glGetFragDataLocation(@NativeType("GLuint") int program, @NativeType("GLchar const *") ByteBuffer name) {
        return org.lwjgl.opengl.GL30.glGetFragDataLocation(program, name);
    }

@NativeType("GLint")
    @Override public int glGetFragDataLocation(@NativeType("GLuint") int program, @NativeType("GLchar const *") CharSequence name) {
        return org.lwjgl.opengl.GL30.glGetFragDataLocation(program, name);
    }

    @Override public void glBeginConditionalRender(@NativeType("GLuint") int id, @NativeType("GLenum") int mode) {
        org.lwjgl.opengl.GL30.glBeginConditionalRender(id, mode);
    }

    @Override public void glEndConditionalRender() {
        org.lwjgl.opengl.GL30.glEndConditionalRender();
    }

    @Override public long nglMapBufferRange(int target, long offset, long length, int access) {
        return org.lwjgl.opengl.GL30.nglMapBufferRange(target, offset, length, access);
    }

@Nullable
@NativeType("void *")
    @Override public ByteBuffer glMapBufferRange(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length, @NativeType("GLbitfield") int access) {
        return org.lwjgl.opengl.GL30.glMapBufferRange(target, offset, length, access);
    }

@Nullable
@NativeType("void *")
    @Override public ByteBuffer glMapBufferRange(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length, @NativeType("GLbitfield") int access, @Nullable ByteBuffer old_buffer) {
        return org.lwjgl.opengl.GL30.glMapBufferRange(target, offset, length, access, old_buffer);
    }

    @Override public void glFlushMappedBufferRange(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length) {
        org.lwjgl.opengl.GL30.glFlushMappedBufferRange(target, offset, length);
    }

    @Override public void glClampColor(@NativeType("GLenum") int target, @NativeType("GLenum") int clamp) {
        org.lwjgl.opengl.GL30.glClampColor(target, clamp);
    }

@NativeType("GLboolean")
    @Override public boolean glIsRenderbuffer(@NativeType("GLuint") int renderbuffer) {
        return org.lwjgl.opengl.GL30.glIsRenderbuffer(renderbuffer);
    }

    @Override public void glBindRenderbuffer(@NativeType("GLenum") int target, @NativeType("GLuint") int renderbuffer) {
        org.lwjgl.opengl.GL30.glBindRenderbuffer(target, renderbuffer);
    }

    @Override public void nglDeleteRenderbuffers(int n, long renderbuffers) {
        org.lwjgl.opengl.GL30.nglDeleteRenderbuffers(n, renderbuffers);
    }

    @Override public void glDeleteRenderbuffers(@NativeType("GLuint const *") IntBuffer renderbuffers) {
        org.lwjgl.opengl.GL30.glDeleteRenderbuffers(renderbuffers);
    }

    @Override public void glDeleteRenderbuffers(@NativeType("GLuint const *") int renderbuffer) {
        org.lwjgl.opengl.GL30.glDeleteRenderbuffers(renderbuffer);
    }

    @Override public void glDeleteRenderbuffers(@NativeType("GLuint const *") int[] renderbuffers) {
        org.lwjgl.opengl.GL30.glDeleteRenderbuffers(renderbuffers);
    }

    @Override public void nglGenRenderbuffers(int n, long renderbuffers) {
        org.lwjgl.opengl.GL30.nglGenRenderbuffers(n, renderbuffers);
    }

    @Override public void glGenRenderbuffers(@NativeType("GLuint *") IntBuffer renderbuffers) {
        org.lwjgl.opengl.GL30.glGenRenderbuffers(renderbuffers);
    }

@NativeType("void")
    @Override public int glGenRenderbuffers() {
        return org.lwjgl.opengl.GL30.glGenRenderbuffers();
    }

    @Override public void glGenRenderbuffers(@NativeType("GLuint *") int[] renderbuffers) {
        org.lwjgl.opengl.GL30.glGenRenderbuffers(renderbuffers);
    }

    @Override public void glRenderbufferStorage(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        org.lwjgl.opengl.GL30.glRenderbufferStorage(target, internalformat, width, height);
    }

    @Override public void glRenderbufferStorageMultisample(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        org.lwjgl.opengl.GL30.glRenderbufferStorageMultisample(target, samples, internalformat, width, height);
    }

    @Override public void nglGetRenderbufferParameteriv(int target, int pname, long params) {
        org.lwjgl.opengl.GL30.nglGetRenderbufferParameteriv(target, pname, params);
    }

    @Override public void glGetRenderbufferParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengl.GL30.glGetRenderbufferParameteriv(target, pname, params);
    }

    @Override public void glGetRenderbufferParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengl.GL30.glGetRenderbufferParameteriv(target, pname, params);
    }

@NativeType("void")
    @Override public int glGetRenderbufferParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL30.glGetRenderbufferParameteri(target, pname);
    }

@NativeType("GLboolean")
    @Override public boolean glIsFramebuffer(@NativeType("GLuint") int framebuffer) {
        return org.lwjgl.opengl.GL30.glIsFramebuffer(framebuffer);
    }

    @Override public void glBindFramebuffer(@NativeType("GLenum") int target, @NativeType("GLuint") int framebuffer) {
        org.lwjgl.opengl.GL30.glBindFramebuffer(target, framebuffer);
    }

    @Override public void nglDeleteFramebuffers(int n, long framebuffers) {
        org.lwjgl.opengl.GL30.nglDeleteFramebuffers(n, framebuffers);
    }

    @Override public void glDeleteFramebuffers(@NativeType("GLuint const *") IntBuffer framebuffers) {
        org.lwjgl.opengl.GL30.glDeleteFramebuffers(framebuffers);
    }

    @Override public void glDeleteFramebuffers(@NativeType("GLuint const *") int framebuffer) {
        org.lwjgl.opengl.GL30.glDeleteFramebuffers(framebuffer);
    }

    @Override public void glDeleteFramebuffers(@NativeType("GLuint const *") int[] framebuffers) {
        org.lwjgl.opengl.GL30.glDeleteFramebuffers(framebuffers);
    }

    @Override public void nglGenFramebuffers(int n, long framebuffers) {
        org.lwjgl.opengl.GL30.nglGenFramebuffers(n, framebuffers);
    }

    @Override public void glGenFramebuffers(@NativeType("GLuint *") IntBuffer framebuffers) {
        org.lwjgl.opengl.GL30.glGenFramebuffers(framebuffers);
    }

@NativeType("void")
    @Override public int glGenFramebuffers() {
        return org.lwjgl.opengl.GL30.glGenFramebuffers();
    }

    @Override public void glGenFramebuffers(@NativeType("GLuint *") int[] framebuffers) {
        org.lwjgl.opengl.GL30.glGenFramebuffers(framebuffers);
    }

@NativeType("GLenum")
    @Override public int glCheckFramebufferStatus(@NativeType("GLenum") int target) {
        return org.lwjgl.opengl.GL30.glCheckFramebufferStatus(target);
    }

    @Override public void glFramebufferTexture1D(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level) {
        org.lwjgl.opengl.GL30.glFramebufferTexture1D(target, attachment, textarget, texture, level);
    }

    @Override public void glFramebufferTexture2D(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level) {
        org.lwjgl.opengl.GL30.glFramebufferTexture2D(target, attachment, textarget, texture, level);
    }

    @Override public void glFramebufferTexture3D(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int layer) {
        org.lwjgl.opengl.GL30.glFramebufferTexture3D(target, attachment, textarget, texture, level, layer);
    }

    @Override public void glFramebufferTextureLayer(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int layer) {
        org.lwjgl.opengl.GL30.glFramebufferTextureLayer(target, attachment, texture, level, layer);
    }

    @Override public void glFramebufferRenderbuffer(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int renderbuffertarget, @NativeType("GLuint") int renderbuffer) {
        org.lwjgl.opengl.GL30.glFramebufferRenderbuffer(target, attachment, renderbuffertarget, renderbuffer);
    }

    @Override public void nglGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, long params) {
        org.lwjgl.opengl.GL30.nglGetFramebufferAttachmentParameteriv(target, attachment, pname, params);
    }

    @Override public void glGetFramebufferAttachmentParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengl.GL30.glGetFramebufferAttachmentParameteriv(target, attachment, pname, params);
    }

    @Override public void glGetFramebufferAttachmentParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengl.GL30.glGetFramebufferAttachmentParameteriv(target, attachment, pname, params);
    }

@NativeType("void")
    @Override public int glGetFramebufferAttachmentParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL30.glGetFramebufferAttachmentParameteri(target, attachment, pname);
    }

    @Override public void glBlitFramebuffer(@NativeType("GLint") int srcX0, @NativeType("GLint") int srcY0, @NativeType("GLint") int srcX1, @NativeType("GLint") int srcY1, @NativeType("GLint") int dstX0, @NativeType("GLint") int dstY0, @NativeType("GLint") int dstX1, @NativeType("GLint") int dstY1, @NativeType("GLbitfield") int mask, @NativeType("GLenum") int filter) {
        org.lwjgl.opengl.GL30.glBlitFramebuffer(srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
    }

    @Override public void glGenerateMipmap(@NativeType("GLenum") int target) {
        org.lwjgl.opengl.GL30.glGenerateMipmap(target);
    }

    @Override public void nglTexParameterIiv(int target, int pname, long params) {
        org.lwjgl.opengl.GL30.nglTexParameterIiv(target, pname, params);
    }

    @Override public void glTexParameterIiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        org.lwjgl.opengl.GL30.glTexParameterIiv(target, pname, params);
    }

    @Override public void glTexParameterIiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        org.lwjgl.opengl.GL30.glTexParameterIiv(target, pname, params);
    }

    @Override public void glTexParameterIi(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") int param) {
        org.lwjgl.opengl.GL30.glTexParameterIi(target, pname, param);
    }

    @Override public void nglTexParameterIuiv(int target, int pname, long params) {
        org.lwjgl.opengl.GL30.nglTexParameterIuiv(target, pname, params);
    }

    @Override public void glTexParameterIuiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint const *") IntBuffer params) {
        org.lwjgl.opengl.GL30.glTexParameterIuiv(target, pname, params);
    }

    @Override public void glTexParameterIuiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint const *") int[] params) {
        org.lwjgl.opengl.GL30.glTexParameterIuiv(target, pname, params);
    }

    @Override public void glTexParameterIui(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint const *") int param) {
        org.lwjgl.opengl.GL30.glTexParameterIui(target, pname, param);
    }

    @Override public void nglGetTexParameterIiv(int target, int pname, long params) {
        org.lwjgl.opengl.GL30.nglGetTexParameterIiv(target, pname, params);
    }

    @Override public void glGetTexParameterIiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengl.GL30.glGetTexParameterIiv(target, pname, params);
    }

    @Override public void glGetTexParameterIiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengl.GL30.glGetTexParameterIiv(target, pname, params);
    }

@NativeType("void")
    @Override public int glGetTexParameterIi(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL30.glGetTexParameterIi(target, pname);
    }

    @Override public void nglGetTexParameterIuiv(int target, int pname, long params) {
        org.lwjgl.opengl.GL30.nglGetTexParameterIuiv(target, pname, params);
    }

    @Override public void glGetTexParameterIuiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        org.lwjgl.opengl.GL30.glGetTexParameterIuiv(target, pname, params);
    }

    @Override public void glGetTexParameterIuiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        org.lwjgl.opengl.GL30.glGetTexParameterIuiv(target, pname, params);
    }

@NativeType("void")
    @Override public int glGetTexParameterIui(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL30.glGetTexParameterIui(target, pname);
    }

    @Override public void glColorMaski(@NativeType("GLuint") int buf, @NativeType("GLboolean") boolean r, @NativeType("GLboolean") boolean g, @NativeType("GLboolean") boolean b, @NativeType("GLboolean") boolean a) {
        org.lwjgl.opengl.GL30.glColorMaski(buf, r, g, b, a);
    }

    @Override public void nglGetBooleani_v(int target, int index, long data) {
        org.lwjgl.opengl.GL30.nglGetBooleani_v(target, index, data);
    }

    @Override public void glGetBooleani_v(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLboolean *") ByteBuffer data) {
        org.lwjgl.opengl.GL30.glGetBooleani_v(target, index, data);
    }

@NativeType("void")
    @Override public boolean glGetBooleani(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        return org.lwjgl.opengl.GL30.glGetBooleani(target, index);
    }

    @Override public void nglGetIntegeri_v(int target, int index, long data) {
        org.lwjgl.opengl.GL30.nglGetIntegeri_v(target, index, data);
    }

    @Override public void glGetIntegeri_v(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint *") IntBuffer data) {
        org.lwjgl.opengl.GL30.glGetIntegeri_v(target, index, data);
    }

    @Override public void glGetIntegeri_v(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint *") int[] data) {
        org.lwjgl.opengl.GL30.glGetIntegeri_v(target, index, data);
    }

@NativeType("void")
    @Override public int glGetIntegeri(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        return org.lwjgl.opengl.GL30.glGetIntegeri(target, index);
    }

    @Override public void glEnablei(@NativeType("GLenum") int cap, @NativeType("GLuint") int index) {
        org.lwjgl.opengl.GL30.glEnablei(cap, index);
    }

    @Override public void glDisablei(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        org.lwjgl.opengl.GL30.glDisablei(target, index);
    }

@NativeType("GLboolean")
    @Override public boolean glIsEnabledi(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        return org.lwjgl.opengl.GL30.glIsEnabledi(target, index);
    }

    @Override public void glBindBufferRange(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size) {
        org.lwjgl.opengl.GL30.glBindBufferRange(target, index, buffer, offset, size);
    }

    @Override public void glBindBufferBase(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint") int buffer) {
        org.lwjgl.opengl.GL30.glBindBufferBase(target, index, buffer);
    }

    @Override public void glBeginTransformFeedback(@NativeType("GLenum") int primitiveMode) {
        org.lwjgl.opengl.GL30.glBeginTransformFeedback(primitiveMode);
    }

    @Override public void glEndTransformFeedback() {
        org.lwjgl.opengl.GL30.glEndTransformFeedback();
    }

    @Override public void nglTransformFeedbackVaryings(int program, int count, long varyings, int bufferMode) {
        org.lwjgl.opengl.GL30.nglTransformFeedbackVaryings(program, count, varyings, bufferMode);
    }

    @Override public void glTransformFeedbackVaryings(@NativeType("GLuint") int program, @NativeType("GLchar const * const *") PointerBuffer varyings, @NativeType("GLenum") int bufferMode) {
        org.lwjgl.opengl.GL30.glTransformFeedbackVaryings(program, varyings, bufferMode);
    }

    @Override public void glTransformFeedbackVaryings(@NativeType("GLuint") int program, @NativeType("GLchar const * const *") CharSequence[] varyings, @NativeType("GLenum") int bufferMode) {
        org.lwjgl.opengl.GL30.glTransformFeedbackVaryings(program, varyings, bufferMode);
    }

    @Override public void glTransformFeedbackVaryings(@NativeType("GLuint") int program, @NativeType("GLchar const * const *") CharSequence varying, @NativeType("GLenum") int bufferMode) {
        org.lwjgl.opengl.GL30.glTransformFeedbackVaryings(program, varying, bufferMode);
    }

    @Override public void nglGetTransformFeedbackVarying(int program, int index, int bufSize, long length, long size, long type, long name) {
        org.lwjgl.opengl.GL30.nglGetTransformFeedbackVarying(program, index, bufSize, length, size, type, name);
    }

    @Override public void glGetTransformFeedbackVarying(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLsizei *") IntBuffer size, @NativeType("GLenum *") IntBuffer type, @NativeType("GLchar *") ByteBuffer name) {
        org.lwjgl.opengl.GL30.glGetTransformFeedbackVarying(program, index, length, size, type, name);
    }

@NativeType("void")
    @Override public String glGetTransformFeedbackVarying(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei") int bufSize, @NativeType("GLsizei *") IntBuffer size, @NativeType("GLenum *") IntBuffer type) {
        return org.lwjgl.opengl.GL30.glGetTransformFeedbackVarying(program, index, bufSize, size, type);
    }

@NativeType("void")
    @Override public String glGetTransformFeedbackVarying(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei *") IntBuffer size, @NativeType("GLenum *") IntBuffer type) {
        return org.lwjgl.opengl.GL30.glGetTransformFeedbackVarying(program, index, size, type);
    }

    @Override public void glGetTransformFeedbackVarying(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLsizei *") int[] size, @NativeType("GLenum *") int[] type, @NativeType("GLchar *") ByteBuffer name) {
        org.lwjgl.opengl.GL30.glGetTransformFeedbackVarying(program, index, length, size, type, name);
    }

    @Override public void glBindVertexArray(@NativeType("GLuint") int array) {
        org.lwjgl.opengl.GL30.glBindVertexArray(array);
    }

    @Override public void nglDeleteVertexArrays(int n, long arrays) {
        org.lwjgl.opengl.GL30.nglDeleteVertexArrays(n, arrays);
    }

    @Override public void glDeleteVertexArrays(@NativeType("GLuint const *") IntBuffer arrays) {
        org.lwjgl.opengl.GL30.glDeleteVertexArrays(arrays);
    }

    @Override public void glDeleteVertexArrays(@NativeType("GLuint const *") int array) {
        org.lwjgl.opengl.GL30.glDeleteVertexArrays(array);
    }

    @Override public void glDeleteVertexArrays(@NativeType("GLuint const *") int[] arrays) {
        org.lwjgl.opengl.GL30.glDeleteVertexArrays(arrays);
    }

    @Override public void nglGenVertexArrays(int n, long arrays) {
        org.lwjgl.opengl.GL30.nglGenVertexArrays(n, arrays);
    }

    @Override public void glGenVertexArrays(@NativeType("GLuint *") IntBuffer arrays) {
        org.lwjgl.opengl.GL30.glGenVertexArrays(arrays);
    }

@NativeType("void")
    @Override public int glGenVertexArrays() {
        return org.lwjgl.opengl.GL30.glGenVertexArrays();
    }

    @Override public void glGenVertexArrays(@NativeType("GLuint *") int[] arrays) {
        org.lwjgl.opengl.GL30.glGenVertexArrays(arrays);
    }

@NativeType("GLboolean")
    @Override public boolean glIsVertexArray(@NativeType("GLuint") int array) {
        return org.lwjgl.opengl.GL30.glIsVertexArray(array);
    }

}
