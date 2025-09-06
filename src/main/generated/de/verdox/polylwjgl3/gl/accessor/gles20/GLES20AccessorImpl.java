package de.verdox.polylwjgl3.gl.accessor.gles20;

import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengles.GLES20;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public class GLES20AccessorImpl implements GLES20Accessor {

    @Override public void glActiveTexture(@NativeType("GLenum") int texture) {
        org.lwjgl.opengles.GLES20.glActiveTexture(texture);
    }

    @Override public void glAttachShader(@NativeType("GLuint") int program, @NativeType("GLuint") int shader) {
        org.lwjgl.opengles.GLES20.glAttachShader(program, shader);
    }

    @Override public void nglBindAttribLocation(int program, int index, long name) {
        org.lwjgl.opengles.GLES20.nglBindAttribLocation(program, index, name);
    }

    @Override public void glBindAttribLocation(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLchar const *") ByteBuffer name) {
        org.lwjgl.opengles.GLES20.glBindAttribLocation(program, index, name);
    }

    @Override public void glBindAttribLocation(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLchar const *") CharSequence name) {
        org.lwjgl.opengles.GLES20.glBindAttribLocation(program, index, name);
    }

    @Override public void glBindBuffer(@NativeType("GLenum") int target, @NativeType("GLuint") int buffer) {
        org.lwjgl.opengles.GLES20.glBindBuffer(target, buffer);
    }

    @Override public void glBindFramebuffer(@NativeType("GLenum") int target, @NativeType("GLuint") int framebuffer) {
        org.lwjgl.opengles.GLES20.glBindFramebuffer(target, framebuffer);
    }

    @Override public void glBindRenderbuffer(@NativeType("GLenum") int target, @NativeType("GLuint") int renderbuffer) {
        org.lwjgl.opengles.GLES20.glBindRenderbuffer(target, renderbuffer);
    }

    @Override public void glBindTexture(@NativeType("GLenum") int target, @NativeType("GLuint") int texture) {
        org.lwjgl.opengles.GLES20.glBindTexture(target, texture);
    }

    @Override public void glBlendColor(@NativeType("GLfloat") float red, @NativeType("GLfloat") float green, @NativeType("GLfloat") float blue, @NativeType("GLfloat") float alpha) {
        org.lwjgl.opengles.GLES20.glBlendColor(red, green, blue, alpha);
    }

    @Override public void glBlendEquation(@NativeType("GLenum") int mode) {
        org.lwjgl.opengles.GLES20.glBlendEquation(mode);
    }

    @Override public void glBlendEquationSeparate(@NativeType("GLenum") int modeRGB, @NativeType("GLenum") int modeAlpha) {
        org.lwjgl.opengles.GLES20.glBlendEquationSeparate(modeRGB, modeAlpha);
    }

    @Override public void glBlendFunc(@NativeType("GLenum") int sfactor, @NativeType("GLenum") int dfactor) {
        org.lwjgl.opengles.GLES20.glBlendFunc(sfactor, dfactor);
    }

    @Override public void glBlendFuncSeparate(@NativeType("GLenum") int sfactorRGB, @NativeType("GLenum") int dfactorRGB, @NativeType("GLenum") int sfactorAlpha, @NativeType("GLenum") int dfactorAlpha) {
        org.lwjgl.opengles.GLES20.glBlendFuncSeparate(sfactorRGB, dfactorRGB, sfactorAlpha, dfactorAlpha);
    }

    @Override public void nglBufferData(int target, long size, long data, int usage) {
        org.lwjgl.opengles.GLES20.nglBufferData(target, size, data, usage);
    }

    @Override public void glBufferData(@NativeType("GLenum") int target, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int usage) {
        org.lwjgl.opengles.GLES20.glBufferData(target, size, usage);
    }

    @Override public void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") ByteBuffer data, @NativeType("GLenum") int usage) {
        org.lwjgl.opengles.GLES20.glBufferData(target, data, usage);
    }

    @Override public void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") ShortBuffer data, @NativeType("GLenum") int usage) {
        org.lwjgl.opengles.GLES20.glBufferData(target, data, usage);
    }

    @Override public void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") IntBuffer data, @NativeType("GLenum") int usage) {
        org.lwjgl.opengles.GLES20.glBufferData(target, data, usage);
    }

    @Override public void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") FloatBuffer data, @NativeType("GLenum") int usage) {
        org.lwjgl.opengles.GLES20.glBufferData(target, data, usage);
    }

    @Override public void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") short[] data, @NativeType("GLenum") int usage) {
        org.lwjgl.opengles.GLES20.glBufferData(target, data, usage);
    }

    @Override public void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") int[] data, @NativeType("GLenum") int usage) {
        org.lwjgl.opengles.GLES20.glBufferData(target, data, usage);
    }

    @Override public void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") float[] data, @NativeType("GLenum") int usage) {
        org.lwjgl.opengles.GLES20.glBufferData(target, data, usage);
    }

    @Override public void nglBufferSubData(int target, long offset, long size, long data) {
        org.lwjgl.opengles.GLES20.nglBufferSubData(target, offset, size, data);
    }

    @Override public void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") ByteBuffer data) {
        org.lwjgl.opengles.GLES20.glBufferSubData(target, offset, data);
    }

    @Override public void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") ShortBuffer data) {
        org.lwjgl.opengles.GLES20.glBufferSubData(target, offset, data);
    }

    @Override public void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") IntBuffer data) {
        org.lwjgl.opengles.GLES20.glBufferSubData(target, offset, data);
    }

    @Override public void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") FloatBuffer data) {
        org.lwjgl.opengles.GLES20.glBufferSubData(target, offset, data);
    }

    @Override public void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") short[] data) {
        org.lwjgl.opengles.GLES20.glBufferSubData(target, offset, data);
    }

    @Override public void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") int[] data) {
        org.lwjgl.opengles.GLES20.glBufferSubData(target, offset, data);
    }

    @Override public void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") float[] data) {
        org.lwjgl.opengles.GLES20.glBufferSubData(target, offset, data);
    }

@NativeType("GLenum")
    @Override public int glCheckFramebufferStatus(@NativeType("GLenum") int target) {
        return org.lwjgl.opengles.GLES20.glCheckFramebufferStatus(target);
    }

    @Override public void glClear(@NativeType("GLbitfield") int mask) {
        org.lwjgl.opengles.GLES20.glClear(mask);
    }

    @Override public void glClearColor(@NativeType("GLfloat") float red, @NativeType("GLfloat") float green, @NativeType("GLfloat") float blue, @NativeType("GLfloat") float alpha) {
        org.lwjgl.opengles.GLES20.glClearColor(red, green, blue, alpha);
    }

    @Override public void glClearDepthf(@NativeType("GLfloat") float d) {
        org.lwjgl.opengles.GLES20.glClearDepthf(d);
    }

    @Override public void glClearStencil(@NativeType("GLint") int s) {
        org.lwjgl.opengles.GLES20.glClearStencil(s);
    }

    @Override public void glColorMask(@NativeType("GLboolean") boolean red, @NativeType("GLboolean") boolean green, @NativeType("GLboolean") boolean blue, @NativeType("GLboolean") boolean alpha) {
        org.lwjgl.opengles.GLES20.glColorMask(red, green, blue, alpha);
    }

    @Override public void glCompileShader(@NativeType("GLuint") int shader) {
        org.lwjgl.opengles.GLES20.glCompileShader(shader);
    }

    @Override public void nglCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, long data) {
        org.lwjgl.opengles.GLES20.nglCompressedTexImage2D(target, level, internalformat, width, height, border, imageSize, data);
    }

    @Override public void glCompressedTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        org.lwjgl.opengles.GLES20.glCompressedTexImage2D(target, level, internalformat, width, height, border, imageSize, data);
    }

    @Override public void glCompressedTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @Nullable @NativeType("void const *") ByteBuffer data) {
        org.lwjgl.opengles.GLES20.glCompressedTexImage2D(target, level, internalformat, width, height, border, data);
    }

    @Override public void nglCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data) {
        org.lwjgl.opengles.GLES20.nglCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, imageSize, data);
    }

    @Override public void glCompressedTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        org.lwjgl.opengles.GLES20.glCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, imageSize, data);
    }

    @Override public void glCompressedTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer data) {
        org.lwjgl.opengles.GLES20.glCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, data);
    }

    @Override public void glCopyTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border) {
        org.lwjgl.opengles.GLES20.glCopyTexImage2D(target, level, internalformat, x, y, width, height, border);
    }

    @Override public void glCopyTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        org.lwjgl.opengles.GLES20.glCopyTexSubImage2D(target, level, xoffset, yoffset, x, y, width, height);
    }

@NativeType("GLuint")
    @Override public int glCreateProgram() {
        return org.lwjgl.opengles.GLES20.glCreateProgram();
    }

@NativeType("GLuint")
    @Override public int glCreateShader(@NativeType("GLenum") int type) {
        return org.lwjgl.opengles.GLES20.glCreateShader(type);
    }

    @Override public void glCullFace(@NativeType("GLenum") int mode) {
        org.lwjgl.opengles.GLES20.glCullFace(mode);
    }

    @Override public void nglDeleteBuffers(int n, long buffers) {
        org.lwjgl.opengles.GLES20.nglDeleteBuffers(n, buffers);
    }

    @Override public void glDeleteBuffers(@NativeType("GLuint const *") IntBuffer buffers) {
        org.lwjgl.opengles.GLES20.glDeleteBuffers(buffers);
    }

    @Override public void glDeleteBuffers(@NativeType("GLuint const *") int buffer) {
        org.lwjgl.opengles.GLES20.glDeleteBuffers(buffer);
    }

    @Override public void glDeleteBuffers(@NativeType("GLuint const *") int[] buffers) {
        org.lwjgl.opengles.GLES20.glDeleteBuffers(buffers);
    }

    @Override public void nglDeleteFramebuffers(int n, long framebuffers) {
        org.lwjgl.opengles.GLES20.nglDeleteFramebuffers(n, framebuffers);
    }

    @Override public void glDeleteFramebuffers(@NativeType("GLuint const *") IntBuffer framebuffers) {
        org.lwjgl.opengles.GLES20.glDeleteFramebuffers(framebuffers);
    }

    @Override public void glDeleteFramebuffers(@NativeType("GLuint const *") int framebuffer) {
        org.lwjgl.opengles.GLES20.glDeleteFramebuffers(framebuffer);
    }

    @Override public void glDeleteFramebuffers(@NativeType("GLuint const *") int[] framebuffers) {
        org.lwjgl.opengles.GLES20.glDeleteFramebuffers(framebuffers);
    }

    @Override public void glDeleteProgram(@NativeType("GLuint") int program) {
        org.lwjgl.opengles.GLES20.glDeleteProgram(program);
    }

    @Override public void nglDeleteRenderbuffers(int n, long renderbuffers) {
        org.lwjgl.opengles.GLES20.nglDeleteRenderbuffers(n, renderbuffers);
    }

    @Override public void glDeleteRenderbuffers(@NativeType("GLuint const *") IntBuffer renderbuffers) {
        org.lwjgl.opengles.GLES20.glDeleteRenderbuffers(renderbuffers);
    }

    @Override public void glDeleteRenderbuffers(@NativeType("GLuint const *") int renderbuffer) {
        org.lwjgl.opengles.GLES20.glDeleteRenderbuffers(renderbuffer);
    }

    @Override public void glDeleteRenderbuffers(@NativeType("GLuint const *") int[] renderbuffers) {
        org.lwjgl.opengles.GLES20.glDeleteRenderbuffers(renderbuffers);
    }

    @Override public void glDeleteShader(@NativeType("GLuint") int shader) {
        org.lwjgl.opengles.GLES20.glDeleteShader(shader);
    }

    @Override public void nglDeleteTextures(int n, long textures) {
        org.lwjgl.opengles.GLES20.nglDeleteTextures(n, textures);
    }

    @Override public void glDeleteTextures(@NativeType("GLuint const *") IntBuffer textures) {
        org.lwjgl.opengles.GLES20.glDeleteTextures(textures);
    }

    @Override public void glDeleteTextures(@NativeType("GLuint const *") int texture) {
        org.lwjgl.opengles.GLES20.glDeleteTextures(texture);
    }

    @Override public void glDeleteTextures(@NativeType("GLuint const *") int[] textures) {
        org.lwjgl.opengles.GLES20.glDeleteTextures(textures);
    }

    @Override public void glDepthFunc(@NativeType("GLenum") int func) {
        org.lwjgl.opengles.GLES20.glDepthFunc(func);
    }

    @Override public void glDepthMask(@NativeType("GLboolean") boolean flag) {
        org.lwjgl.opengles.GLES20.glDepthMask(flag);
    }

    @Override public void glDepthRangef(@NativeType("GLfloat") float n, @NativeType("GLfloat") float f) {
        org.lwjgl.opengles.GLES20.glDepthRangef(n, f);
    }

    @Override public void glDetachShader(@NativeType("GLuint") int program, @NativeType("GLuint") int shader) {
        org.lwjgl.opengles.GLES20.glDetachShader(program, shader);
    }

    @Override public void glDisable(@NativeType("GLenum") int cap) {
        org.lwjgl.opengles.GLES20.glDisable(cap);
    }

    @Override public void glDisableVertexAttribArray(@NativeType("GLuint") int index) {
        org.lwjgl.opengles.GLES20.glDisableVertexAttribArray(index);
    }

    @Override public void glDrawArrays(@NativeType("GLenum") int mode, @NativeType("GLint") int first, @NativeType("GLsizei") int count) {
        org.lwjgl.opengles.GLES20.glDrawArrays(mode, first, count);
    }

    @Override public void nglDrawElements(int mode, int count, int type, long indices) {
        org.lwjgl.opengles.GLES20.nglDrawElements(mode, count, type, indices);
    }

    @Override public void glDrawElements(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices) {
        org.lwjgl.opengles.GLES20.glDrawElements(mode, count, type, indices);
    }

    @Override public void glDrawElements(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices) {
        org.lwjgl.opengles.GLES20.glDrawElements(mode, type, indices);
    }

    @Override public void glDrawElements(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices) {
        org.lwjgl.opengles.GLES20.glDrawElements(mode, indices);
    }

    @Override public void glDrawElements(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices) {
        org.lwjgl.opengles.GLES20.glDrawElements(mode, indices);
    }

    @Override public void glDrawElements(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices) {
        org.lwjgl.opengles.GLES20.glDrawElements(mode, indices);
    }

    @Override public void glEnable(@NativeType("GLenum") int cap) {
        org.lwjgl.opengles.GLES20.glEnable(cap);
    }

    @Override public void glEnableVertexAttribArray(@NativeType("GLuint") int index) {
        org.lwjgl.opengles.GLES20.glEnableVertexAttribArray(index);
    }

    @Override public void glFinish() {
        org.lwjgl.opengles.GLES20.glFinish();
    }

    @Override public void glFlush() {
        org.lwjgl.opengles.GLES20.glFlush();
    }

    @Override public void glFramebufferRenderbuffer(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int renderbuffertarget, @NativeType("GLuint") int renderbuffer) {
        org.lwjgl.opengles.GLES20.glFramebufferRenderbuffer(target, attachment, renderbuffertarget, renderbuffer);
    }

    @Override public void glFramebufferTexture2D(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level) {
        org.lwjgl.opengles.GLES20.glFramebufferTexture2D(target, attachment, textarget, texture, level);
    }

    @Override public void glFrontFace(@NativeType("GLenum") int mode) {
        org.lwjgl.opengles.GLES20.glFrontFace(mode);
    }

    @Override public void nglGenBuffers(int n, long buffers) {
        org.lwjgl.opengles.GLES20.nglGenBuffers(n, buffers);
    }

    @Override public void glGenBuffers(@NativeType("GLuint *") IntBuffer buffers) {
        org.lwjgl.opengles.GLES20.glGenBuffers(buffers);
    }

@NativeType("void")
    @Override public int glGenBuffers() {
        return org.lwjgl.opengles.GLES20.glGenBuffers();
    }

    @Override public void glGenBuffers(@NativeType("GLuint *") int[] buffers) {
        org.lwjgl.opengles.GLES20.glGenBuffers(buffers);
    }

    @Override public void glGenerateMipmap(@NativeType("GLenum") int target) {
        org.lwjgl.opengles.GLES20.glGenerateMipmap(target);
    }

    @Override public void nglGenFramebuffers(int n, long framebuffers) {
        org.lwjgl.opengles.GLES20.nglGenFramebuffers(n, framebuffers);
    }

    @Override public void glGenFramebuffers(@NativeType("GLuint *") IntBuffer framebuffers) {
        org.lwjgl.opengles.GLES20.glGenFramebuffers(framebuffers);
    }

@NativeType("void")
    @Override public int glGenFramebuffers() {
        return org.lwjgl.opengles.GLES20.glGenFramebuffers();
    }

    @Override public void glGenFramebuffers(@NativeType("GLuint *") int[] framebuffers) {
        org.lwjgl.opengles.GLES20.glGenFramebuffers(framebuffers);
    }

    @Override public void nglGenRenderbuffers(int n, long renderbuffers) {
        org.lwjgl.opengles.GLES20.nglGenRenderbuffers(n, renderbuffers);
    }

    @Override public void glGenRenderbuffers(@NativeType("GLuint *") IntBuffer renderbuffers) {
        org.lwjgl.opengles.GLES20.glGenRenderbuffers(renderbuffers);
    }

@NativeType("void")
    @Override public int glGenRenderbuffers() {
        return org.lwjgl.opengles.GLES20.glGenRenderbuffers();
    }

    @Override public void glGenRenderbuffers(@NativeType("GLuint *") int[] renderbuffers) {
        org.lwjgl.opengles.GLES20.glGenRenderbuffers(renderbuffers);
    }

    @Override public void nglGenTextures(int n, long textures) {
        org.lwjgl.opengles.GLES20.nglGenTextures(n, textures);
    }

    @Override public void glGenTextures(@NativeType("GLuint *") IntBuffer textures) {
        org.lwjgl.opengles.GLES20.glGenTextures(textures);
    }

@NativeType("void")
    @Override public int glGenTextures() {
        return org.lwjgl.opengles.GLES20.glGenTextures();
    }

    @Override public void glGenTextures(@NativeType("GLuint *") int[] textures) {
        org.lwjgl.opengles.GLES20.glGenTextures(textures);
    }

    @Override public void nglGetActiveAttrib(int program, int index, int bufSize, long length, long size, long type, long name) {
        org.lwjgl.opengles.GLES20.nglGetActiveAttrib(program, index, bufSize, length, size, type, name);
    }

    @Override public void glGetActiveAttrib(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type, @NativeType("GLchar *") ByteBuffer name) {
        org.lwjgl.opengles.GLES20.glGetActiveAttrib(program, index, length, size, type, name);
    }

@NativeType("void")
    @Override public String glGetActiveAttrib(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei") int bufSize, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type) {
        return org.lwjgl.opengles.GLES20.glGetActiveAttrib(program, index, bufSize, size, type);
    }

@NativeType("void")
    @Override public String glGetActiveAttrib(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type) {
        return org.lwjgl.opengles.GLES20.glGetActiveAttrib(program, index, size, type);
    }

    @Override public void glGetActiveAttrib(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLint *") int[] size, @NativeType("GLenum *") int[] type, @NativeType("GLchar *") ByteBuffer name) {
        org.lwjgl.opengles.GLES20.glGetActiveAttrib(program, index, length, size, type, name);
    }

    @Override public void nglGetActiveUniform(int program, int index, int bufSize, long length, long size, long type, long name) {
        org.lwjgl.opengles.GLES20.nglGetActiveUniform(program, index, bufSize, length, size, type, name);
    }

    @Override public void glGetActiveUniform(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type, @NativeType("GLchar *") ByteBuffer name) {
        org.lwjgl.opengles.GLES20.glGetActiveUniform(program, index, length, size, type, name);
    }

@NativeType("void")
    @Override public String glGetActiveUniform(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei") int bufSize, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type) {
        return org.lwjgl.opengles.GLES20.glGetActiveUniform(program, index, bufSize, size, type);
    }

@NativeType("void")
    @Override public String glGetActiveUniform(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type) {
        return org.lwjgl.opengles.GLES20.glGetActiveUniform(program, index, size, type);
    }

    @Override public void glGetActiveUniform(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLint *") int[] size, @NativeType("GLenum *") int[] type, @NativeType("GLchar *") ByteBuffer name) {
        org.lwjgl.opengles.GLES20.glGetActiveUniform(program, index, length, size, type, name);
    }

    @Override public void nglGetAttachedShaders(int program, int maxCount, long count, long shaders) {
        org.lwjgl.opengles.GLES20.nglGetAttachedShaders(program, maxCount, count, shaders);
    }

    @Override public void glGetAttachedShaders(@NativeType("GLuint") int program, @Nullable @NativeType("GLsizei *") IntBuffer count, @NativeType("GLuint *") IntBuffer shaders) {
        org.lwjgl.opengles.GLES20.glGetAttachedShaders(program, count, shaders);
    }

    @Override public void glGetAttachedShaders(@NativeType("GLuint") int program, @Nullable @NativeType("GLsizei *") int[] count, @NativeType("GLuint *") int[] shaders) {
        org.lwjgl.opengles.GLES20.glGetAttachedShaders(program, count, shaders);
    }

    @Override public int nglGetAttribLocation(int program, long name) {
        return org.lwjgl.opengles.GLES20.nglGetAttribLocation(program, name);
    }

@NativeType("GLint")
    @Override public int glGetAttribLocation(@NativeType("GLuint") int program, @NativeType("GLchar const *") ByteBuffer name) {
        return org.lwjgl.opengles.GLES20.glGetAttribLocation(program, name);
    }

@NativeType("GLint")
    @Override public int glGetAttribLocation(@NativeType("GLuint") int program, @NativeType("GLchar const *") CharSequence name) {
        return org.lwjgl.opengles.GLES20.glGetAttribLocation(program, name);
    }

    @Override public void nglGetBooleanv(int pname, long data) {
        org.lwjgl.opengles.GLES20.nglGetBooleanv(pname, data);
    }

    @Override public void glGetBooleanv(@NativeType("GLenum") int pname, @NativeType("GLboolean *") ByteBuffer data) {
        org.lwjgl.opengles.GLES20.glGetBooleanv(pname, data);
    }

@NativeType("void")
    @Override public boolean glGetBoolean(@NativeType("GLenum") int pname) {
        return org.lwjgl.opengles.GLES20.glGetBoolean(pname);
    }

    @Override public void nglGetBufferParameteriv(int target, int pname, long params) {
        org.lwjgl.opengles.GLES20.nglGetBufferParameteriv(target, pname, params);
    }

    @Override public void glGetBufferParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengles.GLES20.glGetBufferParameteriv(target, pname, params);
    }

    @Override public void glGetBufferParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengles.GLES20.glGetBufferParameteriv(target, pname, params);
    }

@NativeType("void")
    @Override public int glGetBufferParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengles.GLES20.glGetBufferParameteri(target, pname);
    }

@NativeType("GLenum")
    @Override public int glGetError() {
        return org.lwjgl.opengles.GLES20.glGetError();
    }

    @Override public void nglGetFloatv(int pname, long data) {
        org.lwjgl.opengles.GLES20.nglGetFloatv(pname, data);
    }

    @Override public void glGetFloatv(@NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer data) {
        org.lwjgl.opengles.GLES20.glGetFloatv(pname, data);
    }

    @Override public void glGetFloatv(@NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] data) {
        org.lwjgl.opengles.GLES20.glGetFloatv(pname, data);
    }

@NativeType("void")
    @Override public float glGetFloat(@NativeType("GLenum") int pname) {
        return org.lwjgl.opengles.GLES20.glGetFloat(pname);
    }

    @Override public void nglGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, long params) {
        org.lwjgl.opengles.GLES20.nglGetFramebufferAttachmentParameteriv(target, attachment, pname, params);
    }

    @Override public void glGetFramebufferAttachmentParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengles.GLES20.glGetFramebufferAttachmentParameteriv(target, attachment, pname, params);
    }

    @Override public void glGetFramebufferAttachmentParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengles.GLES20.glGetFramebufferAttachmentParameteriv(target, attachment, pname, params);
    }

@NativeType("void")
    @Override public int glGetFramebufferAttachmentParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengles.GLES20.glGetFramebufferAttachmentParameteri(target, attachment, pname);
    }

    @Override public void nglGetIntegerv(int pname, long data) {
        org.lwjgl.opengles.GLES20.nglGetIntegerv(pname, data);
    }

    @Override public void glGetIntegerv(@NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer data) {
        org.lwjgl.opengles.GLES20.glGetIntegerv(pname, data);
    }

    @Override public void glGetIntegerv(@NativeType("GLenum") int pname, @NativeType("GLint *") int[] data) {
        org.lwjgl.opengles.GLES20.glGetIntegerv(pname, data);
    }

@NativeType("void")
    @Override public int glGetInteger(@NativeType("GLenum") int pname) {
        return org.lwjgl.opengles.GLES20.glGetInteger(pname);
    }

    @Override public void nglGetProgramiv(int program, int pname, long params) {
        org.lwjgl.opengles.GLES20.nglGetProgramiv(program, pname, params);
    }

    @Override public void glGetProgramiv(@NativeType("GLuint") int program, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengles.GLES20.glGetProgramiv(program, pname, params);
    }

    @Override public void glGetProgramiv(@NativeType("GLuint") int program, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengles.GLES20.glGetProgramiv(program, pname, params);
    }

@NativeType("void")
    @Override public int glGetProgrami(@NativeType("GLuint") int program, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengles.GLES20.glGetProgrami(program, pname);
    }

    @Override public void nglGetProgramInfoLog(int program, int bufSize, long length, long infoLog) {
        org.lwjgl.opengles.GLES20.nglGetProgramInfoLog(program, bufSize, length, infoLog);
    }

    @Override public void glGetProgramInfoLog(@NativeType("GLuint") int program, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLchar *") ByteBuffer infoLog) {
        org.lwjgl.opengles.GLES20.glGetProgramInfoLog(program, length, infoLog);
    }

@NativeType("void")
    @Override public String glGetProgramInfoLog(@NativeType("GLuint") int program, @NativeType("GLsizei") int bufSize) {
        return org.lwjgl.opengles.GLES20.glGetProgramInfoLog(program, bufSize);
    }

@NativeType("void")
    @Override public String glGetProgramInfoLog(@NativeType("GLuint") int program) {
        return org.lwjgl.opengles.GLES20.glGetProgramInfoLog(program);
    }

    @Override public void glGetProgramInfoLog(@NativeType("GLuint") int program, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLchar *") ByteBuffer infoLog) {
        org.lwjgl.opengles.GLES20.glGetProgramInfoLog(program, length, infoLog);
    }

    @Override public void nglGetRenderbufferParameteriv(int target, int pname, long params) {
        org.lwjgl.opengles.GLES20.nglGetRenderbufferParameteriv(target, pname, params);
    }

    @Override public void glGetRenderbufferParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengles.GLES20.glGetRenderbufferParameteriv(target, pname, params);
    }

    @Override public void glGetRenderbufferParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengles.GLES20.glGetRenderbufferParameteriv(target, pname, params);
    }

@NativeType("void")
    @Override public int glGetRenderbufferParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengles.GLES20.glGetRenderbufferParameteri(target, pname);
    }

    @Override public void nglGetShaderiv(int shader, int pname, long params) {
        org.lwjgl.opengles.GLES20.nglGetShaderiv(shader, pname, params);
    }

    @Override public void glGetShaderiv(@NativeType("GLuint") int shader, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengles.GLES20.glGetShaderiv(shader, pname, params);
    }

    @Override public void glGetShaderiv(@NativeType("GLuint") int shader, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengles.GLES20.glGetShaderiv(shader, pname, params);
    }

@NativeType("void")
    @Override public int glGetShaderi(@NativeType("GLuint") int shader, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengles.GLES20.glGetShaderi(shader, pname);
    }

    @Override public void nglGetShaderInfoLog(int shader, int bufSize, long length, long infoLog) {
        org.lwjgl.opengles.GLES20.nglGetShaderInfoLog(shader, bufSize, length, infoLog);
    }

    @Override public void glGetShaderInfoLog(@NativeType("GLuint") int shader, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLchar *") ByteBuffer infoLog) {
        org.lwjgl.opengles.GLES20.glGetShaderInfoLog(shader, length, infoLog);
    }

@NativeType("void")
    @Override public String glGetShaderInfoLog(@NativeType("GLuint") int shader, @NativeType("GLsizei") int bufSize) {
        return org.lwjgl.opengles.GLES20.glGetShaderInfoLog(shader, bufSize);
    }

@NativeType("void")
    @Override public String glGetShaderInfoLog(@NativeType("GLuint") int shader) {
        return org.lwjgl.opengles.GLES20.glGetShaderInfoLog(shader);
    }

    @Override public void glGetShaderInfoLog(@NativeType("GLuint") int shader, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLchar *") ByteBuffer infoLog) {
        org.lwjgl.opengles.GLES20.glGetShaderInfoLog(shader, length, infoLog);
    }

    @Override public void nglGetShaderPrecisionFormat(int shadertype, int precisiontype, long range, long precision) {
        org.lwjgl.opengles.GLES20.nglGetShaderPrecisionFormat(shadertype, precisiontype, range, precision);
    }

    @Override public void glGetShaderPrecisionFormat(@NativeType("GLenum") int shadertype, @NativeType("GLenum") int precisiontype, @NativeType("GLint *") IntBuffer range, @NativeType("GLint *") IntBuffer precision) {
        org.lwjgl.opengles.GLES20.glGetShaderPrecisionFormat(shadertype, precisiontype, range, precision);
    }

    @Override public void glGetShaderPrecisionFormat(@NativeType("GLenum") int shadertype, @NativeType("GLenum") int precisiontype, @NativeType("GLint *") int[] range, @NativeType("GLint *") int[] precision) {
        org.lwjgl.opengles.GLES20.glGetShaderPrecisionFormat(shadertype, precisiontype, range, precision);
    }

    @Override public void nglGetShaderSource(int shader, int bufSize, long length, long source) {
        org.lwjgl.opengles.GLES20.nglGetShaderSource(shader, bufSize, length, source);
    }

    @Override public void glGetShaderSource(@NativeType("GLuint") int shader, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLchar *") ByteBuffer source) {
        org.lwjgl.opengles.GLES20.glGetShaderSource(shader, length, source);
    }

@NativeType("void")
    @Override public String glGetShaderSource(@NativeType("GLuint") int shader, @NativeType("GLsizei") int bufSize) {
        return org.lwjgl.opengles.GLES20.glGetShaderSource(shader, bufSize);
    }

@NativeType("void")
    @Override public String glGetShaderSource(@NativeType("GLuint") int shader) {
        return org.lwjgl.opengles.GLES20.glGetShaderSource(shader);
    }

    @Override public void glGetShaderSource(@NativeType("GLuint") int shader, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLchar *") ByteBuffer source) {
        org.lwjgl.opengles.GLES20.glGetShaderSource(shader, length, source);
    }

    @Override public long nglGetString(int name) {
        return org.lwjgl.opengles.GLES20.nglGetString(name);
    }

@Nullable
@NativeType("GLubyte const *")
    @Override public String glGetString(@NativeType("GLenum") int name) {
        return org.lwjgl.opengles.GLES20.glGetString(name);
    }

    @Override public void nglGetTexParameterfv(int target, int pname, long params) {
        org.lwjgl.opengles.GLES20.nglGetTexParameterfv(target, pname, params);
    }

    @Override public void glGetTexParameterfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        org.lwjgl.opengles.GLES20.glGetTexParameterfv(target, pname, params);
    }

    @Override public void glGetTexParameterfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        org.lwjgl.opengles.GLES20.glGetTexParameterfv(target, pname, params);
    }

@NativeType("void")
    @Override public float glGetTexParameterf(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengles.GLES20.glGetTexParameterf(target, pname);
    }

    @Override public void nglGetTexParameteriv(int target, int pname, long params) {
        org.lwjgl.opengles.GLES20.nglGetTexParameteriv(target, pname, params);
    }

    @Override public void glGetTexParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengles.GLES20.glGetTexParameteriv(target, pname, params);
    }

    @Override public void glGetTexParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengles.GLES20.glGetTexParameteriv(target, pname, params);
    }

@NativeType("void")
    @Override public int glGetTexParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengles.GLES20.glGetTexParameteri(target, pname);
    }

    @Override public void nglGetUniformfv(int program, int location, long params) {
        org.lwjgl.opengles.GLES20.nglGetUniformfv(program, location, params);
    }

    @Override public void glGetUniformfv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") FloatBuffer params) {
        org.lwjgl.opengles.GLES20.glGetUniformfv(program, location, params);
    }

    @Override public void glGetUniformfv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") float[] params) {
        org.lwjgl.opengles.GLES20.glGetUniformfv(program, location, params);
    }

@NativeType("void")
    @Override public float glGetUniformf(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        return org.lwjgl.opengles.GLES20.glGetUniformf(program, location);
    }

    @Override public void nglGetUniformiv(int program, int location, long params) {
        org.lwjgl.opengles.GLES20.nglGetUniformiv(program, location, params);
    }

    @Override public void glGetUniformiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengles.GLES20.glGetUniformiv(program, location, params);
    }

    @Override public void glGetUniformiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengles.GLES20.glGetUniformiv(program, location, params);
    }

@NativeType("void")
    @Override public int glGetUniformi(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        return org.lwjgl.opengles.GLES20.glGetUniformi(program, location);
    }

    @Override public int nglGetUniformLocation(int program, long name) {
        return org.lwjgl.opengles.GLES20.nglGetUniformLocation(program, name);
    }

@NativeType("GLint")
    @Override public int glGetUniformLocation(@NativeType("GLuint") int program, @NativeType("GLchar const *") ByteBuffer name) {
        return org.lwjgl.opengles.GLES20.glGetUniformLocation(program, name);
    }

@NativeType("GLint")
    @Override public int glGetUniformLocation(@NativeType("GLuint") int program, @NativeType("GLchar const *") CharSequence name) {
        return org.lwjgl.opengles.GLES20.glGetUniformLocation(program, name);
    }

    @Override public void nglGetVertexAttribfv(int index, int pname, long params) {
        org.lwjgl.opengles.GLES20.nglGetVertexAttribfv(index, pname, params);
    }

    @Override public void glGetVertexAttribfv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        org.lwjgl.opengles.GLES20.glGetVertexAttribfv(index, pname, params);
    }

    @Override public void glGetVertexAttribfv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        org.lwjgl.opengles.GLES20.glGetVertexAttribfv(index, pname, params);
    }

    @Override public void nglGetVertexAttribiv(int index, int pname, long params) {
        org.lwjgl.opengles.GLES20.nglGetVertexAttribiv(index, pname, params);
    }

    @Override public void glGetVertexAttribiv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengles.GLES20.glGetVertexAttribiv(index, pname, params);
    }

    @Override public void glGetVertexAttribiv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengles.GLES20.glGetVertexAttribiv(index, pname, params);
    }

    @Override public void nglGetVertexAttribPointerv(int index, int pname, long pointer) {
        org.lwjgl.opengles.GLES20.nglGetVertexAttribPointerv(index, pname, pointer);
    }

    @Override public void glGetVertexAttribPointerv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("void **") PointerBuffer pointer) {
        org.lwjgl.opengles.GLES20.glGetVertexAttribPointerv(index, pname, pointer);
    }

@NativeType("void")
    @Override public long glGetVertexAttribPointer(@NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengles.GLES20.glGetVertexAttribPointer(index, pname);
    }

    @Override public void glHint(@NativeType("GLenum") int target, @NativeType("GLenum") int mode) {
        org.lwjgl.opengles.GLES20.glHint(target, mode);
    }

@NativeType("GLboolean")
    @Override public boolean glIsBuffer(@NativeType("GLuint") int buffer) {
        return org.lwjgl.opengles.GLES20.glIsBuffer(buffer);
    }

@NativeType("GLboolean")
    @Override public boolean glIsEnabled(@NativeType("GLenum") int cap) {
        return org.lwjgl.opengles.GLES20.glIsEnabled(cap);
    }

@NativeType("GLboolean")
    @Override public boolean glIsFramebuffer(@NativeType("GLuint") int framebuffer) {
        return org.lwjgl.opengles.GLES20.glIsFramebuffer(framebuffer);
    }

@NativeType("GLboolean")
    @Override public boolean glIsProgram(@NativeType("GLuint") int program) {
        return org.lwjgl.opengles.GLES20.glIsProgram(program);
    }

@NativeType("GLboolean")
    @Override public boolean glIsRenderbuffer(@NativeType("GLuint") int renderbuffer) {
        return org.lwjgl.opengles.GLES20.glIsRenderbuffer(renderbuffer);
    }

@NativeType("GLboolean")
    @Override public boolean glIsShader(@NativeType("GLuint") int shader) {
        return org.lwjgl.opengles.GLES20.glIsShader(shader);
    }

@NativeType("GLboolean")
    @Override public boolean glIsTexture(@NativeType("GLuint") int texture) {
        return org.lwjgl.opengles.GLES20.glIsTexture(texture);
    }

    @Override public void glLineWidth(@NativeType("GLfloat") float width) {
        org.lwjgl.opengles.GLES20.glLineWidth(width);
    }

    @Override public void glLinkProgram(@NativeType("GLuint") int program) {
        org.lwjgl.opengles.GLES20.glLinkProgram(program);
    }

    @Override public void glPixelStorei(@NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        org.lwjgl.opengles.GLES20.glPixelStorei(pname, param);
    }

    @Override public void glPolygonOffset(@NativeType("GLfloat") float factor, @NativeType("GLfloat") float units) {
        org.lwjgl.opengles.GLES20.glPolygonOffset(factor, units);
    }

    @Override public void nglReadPixels(int x, int y, int width, int height, int format, int type, long pixels) {
        org.lwjgl.opengles.GLES20.nglReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer pixels) {
        org.lwjgl.opengles.GLES20.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") long pixels) {
        org.lwjgl.opengles.GLES20.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ShortBuffer pixels) {
        org.lwjgl.opengles.GLES20.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") IntBuffer pixels) {
        org.lwjgl.opengles.GLES20.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") FloatBuffer pixels) {
        org.lwjgl.opengles.GLES20.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") short[] pixels) {
        org.lwjgl.opengles.GLES20.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") int[] pixels) {
        org.lwjgl.opengles.GLES20.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") float[] pixels) {
        org.lwjgl.opengles.GLES20.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReleaseShaderCompiler() {
        org.lwjgl.opengles.GLES20.glReleaseShaderCompiler();
    }

    @Override public void glRenderbufferStorage(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        org.lwjgl.opengles.GLES20.glRenderbufferStorage(target, internalformat, width, height);
    }

    @Override public void glSampleCoverage(@NativeType("GLfloat") float value, @NativeType("GLboolean") boolean invert) {
        org.lwjgl.opengles.GLES20.glSampleCoverage(value, invert);
    }

    @Override public void glScissor(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        org.lwjgl.opengles.GLES20.glScissor(x, y, width, height);
    }

    @Override public void nglShaderBinary(int count, long shaders, int binaryformat, long binary, int length) {
        org.lwjgl.opengles.GLES20.nglShaderBinary(count, shaders, binaryformat, binary, length);
    }

    @Override public void glShaderBinary(@NativeType("GLuint const *") IntBuffer shaders, @NativeType("GLenum") int binaryformat, @NativeType("void const *") ByteBuffer binary) {
        org.lwjgl.opengles.GLES20.glShaderBinary(shaders, binaryformat, binary);
    }

    @Override public void glShaderBinary(@NativeType("GLuint const *") int[] shaders, @NativeType("GLenum") int binaryformat, @NativeType("void const *") ByteBuffer binary) {
        org.lwjgl.opengles.GLES20.glShaderBinary(shaders, binaryformat, binary);
    }

    @Override public void nglShaderSource(int shader, int count, long string, long length) {
        org.lwjgl.opengles.GLES20.nglShaderSource(shader, count, string, length);
    }

    @Override public void glShaderSource(@NativeType("GLuint") int shader, @NativeType("GLchar const * const *") PointerBuffer string, @Nullable @NativeType("GLint const *") IntBuffer length) {
        org.lwjgl.opengles.GLES20.glShaderSource(shader, string, length);
    }

    @Override public void glShaderSource(@NativeType("GLuint") int shader, @NativeType("GLchar const * const *") CharSequence... string) {
        org.lwjgl.opengles.GLES20.glShaderSource(shader, string);
    }

    @Override public void glShaderSource(@NativeType("GLuint") int shader, @NativeType("GLchar const * const *") CharSequence string) {
        org.lwjgl.opengles.GLES20.glShaderSource(shader, string);
    }

    @Override public void glShaderSource(@NativeType("GLuint") int shader, @NativeType("GLchar const * const *") PointerBuffer string, @Nullable @NativeType("GLint const *") int[] length) {
        org.lwjgl.opengles.GLES20.glShaderSource(shader, string, length);
    }

    @Override public void glStencilFunc(@NativeType("GLenum") int func, @NativeType("GLint") int ref, @NativeType("GLuint") int mask) {
        org.lwjgl.opengles.GLES20.glStencilFunc(func, ref, mask);
    }

    @Override public void glStencilFuncSeparate(@NativeType("GLenum") int face, @NativeType("GLenum") int func, @NativeType("GLint") int ref, @NativeType("GLuint") int mask) {
        org.lwjgl.opengles.GLES20.glStencilFuncSeparate(face, func, ref, mask);
    }

    @Override public void glStencilMask(@NativeType("GLuint") int mask) {
        org.lwjgl.opengles.GLES20.glStencilMask(mask);
    }

    @Override public void glStencilMaskSeparate(@NativeType("GLenum") int face, @NativeType("GLuint") int mask) {
        org.lwjgl.opengles.GLES20.glStencilMaskSeparate(face, mask);
    }

    @Override public void glStencilOp(@NativeType("GLenum") int fail, @NativeType("GLenum") int zfail, @NativeType("GLenum") int zpass) {
        org.lwjgl.opengles.GLES20.glStencilOp(fail, zfail, zpass);
    }

    @Override public void glStencilOpSeparate(@NativeType("GLenum") int face, @NativeType("GLenum") int sfail, @NativeType("GLenum") int dpfail, @NativeType("GLenum") int dppass) {
        org.lwjgl.opengles.GLES20.glStencilOpSeparate(face, sfail, dpfail, dppass);
    }

    @Override public void nglTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels) {
        org.lwjgl.opengles.GLES20.nglTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override public void glTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ByteBuffer pixels) {
        org.lwjgl.opengles.GLES20.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override public void glTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        org.lwjgl.opengles.GLES20.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override public void glTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ShortBuffer pixels) {
        org.lwjgl.opengles.GLES20.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override public void glTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") IntBuffer pixels) {
        org.lwjgl.opengles.GLES20.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override public void glTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") FloatBuffer pixels) {
        org.lwjgl.opengles.GLES20.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override public void glTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") short[] pixels) {
        org.lwjgl.opengles.GLES20.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override public void glTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") int[] pixels) {
        org.lwjgl.opengles.GLES20.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override public void glTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") float[] pixels) {
        org.lwjgl.opengles.GLES20.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override public void glTexParameterf(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param) {
        org.lwjgl.opengles.GLES20.glTexParameterf(target, pname, param);
    }

    @Override public void nglTexParameterfv(int target, int pname, long params) {
        org.lwjgl.opengles.GLES20.nglTexParameterfv(target, pname, params);
    }

    @Override public void glTexParameterfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params) {
        org.lwjgl.opengles.GLES20.glTexParameterfv(target, pname, params);
    }

    @Override public void glTexParameterfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] params) {
        org.lwjgl.opengles.GLES20.glTexParameterfv(target, pname, params);
    }

    @Override public void glTexParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        org.lwjgl.opengles.GLES20.glTexParameteri(target, pname, param);
    }

    @Override public void nglTexParameteriv(int target, int pname, long params) {
        org.lwjgl.opengles.GLES20.nglTexParameteriv(target, pname, params);
    }

    @Override public void glTexParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        org.lwjgl.opengles.GLES20.glTexParameteriv(target, pname, params);
    }

    @Override public void glTexParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        org.lwjgl.opengles.GLES20.glTexParameteriv(target, pname, params);
    }

    @Override public void nglTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels) {
        org.lwjgl.opengles.GLES20.nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer pixels) {
        org.lwjgl.opengles.GLES20.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        org.lwjgl.opengles.GLES20.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer pixels) {
        org.lwjgl.opengles.GLES20.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer pixels) {
        org.lwjgl.opengles.GLES20.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer pixels) {
        org.lwjgl.opengles.GLES20.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] pixels) {
        org.lwjgl.opengles.GLES20.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] pixels) {
        org.lwjgl.opengles.GLES20.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] pixels) {
        org.lwjgl.opengles.GLES20.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glUniform1f(@NativeType("GLint") int location, @NativeType("GLfloat") float v0) {
        org.lwjgl.opengles.GLES20.glUniform1f(location, v0);
    }

    @Override public void nglUniform1fv(int location, int count, long value) {
        org.lwjgl.opengles.GLES20.nglUniform1fv(location, count, value);
    }

    @Override public void glUniform1fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengles.GLES20.glUniform1fv(location, value);
    }

    @Override public void glUniform1fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengles.GLES20.glUniform1fv(location, value);
    }

    @Override public void glUniform1i(@NativeType("GLint") int location, @NativeType("GLint") int v0) {
        org.lwjgl.opengles.GLES20.glUniform1i(location, v0);
    }

    @Override public void nglUniform1iv(int location, int count, long value) {
        org.lwjgl.opengles.GLES20.nglUniform1iv(location, count, value);
    }

    @Override public void glUniform1iv(@NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        org.lwjgl.opengles.GLES20.glUniform1iv(location, value);
    }

    @Override public void glUniform1iv(@NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        org.lwjgl.opengles.GLES20.glUniform1iv(location, value);
    }

    @Override public void glUniform2f(@NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1) {
        org.lwjgl.opengles.GLES20.glUniform2f(location, v0, v1);
    }

    @Override public void nglUniform2fv(int location, int count, long value) {
        org.lwjgl.opengles.GLES20.nglUniform2fv(location, count, value);
    }

    @Override public void glUniform2fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengles.GLES20.glUniform2fv(location, value);
    }

    @Override public void glUniform2fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengles.GLES20.glUniform2fv(location, value);
    }

    @Override public void glUniform2i(@NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1) {
        org.lwjgl.opengles.GLES20.glUniform2i(location, v0, v1);
    }

    @Override public void nglUniform2iv(int location, int count, long value) {
        org.lwjgl.opengles.GLES20.nglUniform2iv(location, count, value);
    }

    @Override public void glUniform2iv(@NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        org.lwjgl.opengles.GLES20.glUniform2iv(location, value);
    }

    @Override public void glUniform2iv(@NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        org.lwjgl.opengles.GLES20.glUniform2iv(location, value);
    }

    @Override public void glUniform3f(@NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2) {
        org.lwjgl.opengles.GLES20.glUniform3f(location, v0, v1, v2);
    }

    @Override public void nglUniform3fv(int location, int count, long value) {
        org.lwjgl.opengles.GLES20.nglUniform3fv(location, count, value);
    }

    @Override public void glUniform3fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengles.GLES20.glUniform3fv(location, value);
    }

    @Override public void glUniform3fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengles.GLES20.glUniform3fv(location, value);
    }

    @Override public void glUniform3i(@NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1, @NativeType("GLint") int v2) {
        org.lwjgl.opengles.GLES20.glUniform3i(location, v0, v1, v2);
    }

    @Override public void nglUniform3iv(int location, int count, long value) {
        org.lwjgl.opengles.GLES20.nglUniform3iv(location, count, value);
    }

    @Override public void glUniform3iv(@NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        org.lwjgl.opengles.GLES20.glUniform3iv(location, value);
    }

    @Override public void glUniform3iv(@NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        org.lwjgl.opengles.GLES20.glUniform3iv(location, value);
    }

    @Override public void glUniform4f(@NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2, @NativeType("GLfloat") float v3) {
        org.lwjgl.opengles.GLES20.glUniform4f(location, v0, v1, v2, v3);
    }

    @Override public void nglUniform4fv(int location, int count, long value) {
        org.lwjgl.opengles.GLES20.nglUniform4fv(location, count, value);
    }

    @Override public void glUniform4fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengles.GLES20.glUniform4fv(location, value);
    }

    @Override public void glUniform4fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengles.GLES20.glUniform4fv(location, value);
    }

    @Override public void glUniform4i(@NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1, @NativeType("GLint") int v2, @NativeType("GLint") int v3) {
        org.lwjgl.opengles.GLES20.glUniform4i(location, v0, v1, v2, v3);
    }

    @Override public void nglUniform4iv(int location, int count, long value) {
        org.lwjgl.opengles.GLES20.nglUniform4iv(location, count, value);
    }

    @Override public void glUniform4iv(@NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        org.lwjgl.opengles.GLES20.glUniform4iv(location, value);
    }

    @Override public void glUniform4iv(@NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        org.lwjgl.opengles.GLES20.glUniform4iv(location, value);
    }

    @Override public void nglUniformMatrix2fv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengles.GLES20.nglUniformMatrix2fv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix2fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengles.GLES20.glUniformMatrix2fv(location, transpose, value);
    }

    @Override public void glUniformMatrix2fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengles.GLES20.glUniformMatrix2fv(location, transpose, value);
    }

    @Override public void nglUniformMatrix3fv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengles.GLES20.nglUniformMatrix3fv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix3fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengles.GLES20.glUniformMatrix3fv(location, transpose, value);
    }

    @Override public void glUniformMatrix3fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengles.GLES20.glUniformMatrix3fv(location, transpose, value);
    }

    @Override public void nglUniformMatrix4fv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengles.GLES20.nglUniformMatrix4fv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix4fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengles.GLES20.glUniformMatrix4fv(location, transpose, value);
    }

    @Override public void glUniformMatrix4fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengles.GLES20.glUniformMatrix4fv(location, transpose, value);
    }

    @Override public void glUseProgram(@NativeType("GLuint") int program) {
        org.lwjgl.opengles.GLES20.glUseProgram(program);
    }

    @Override public void glValidateProgram(@NativeType("GLuint") int program) {
        org.lwjgl.opengles.GLES20.glValidateProgram(program);
    }

    @Override public void glVertexAttrib1f(@NativeType("GLuint") int index, @NativeType("GLfloat") float x) {
        org.lwjgl.opengles.GLES20.glVertexAttrib1f(index, x);
    }

    @Override public void nglVertexAttrib1fv(int index, long v) {
        org.lwjgl.opengles.GLES20.nglVertexAttrib1fv(index, v);
    }

    @Override public void glVertexAttrib1fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer v) {
        org.lwjgl.opengles.GLES20.glVertexAttrib1fv(index, v);
    }

    @Override public void glVertexAttrib1fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] v) {
        org.lwjgl.opengles.GLES20.glVertexAttrib1fv(index, v);
    }

    @Override public void glVertexAttrib2f(@NativeType("GLuint") int index, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y) {
        org.lwjgl.opengles.GLES20.glVertexAttrib2f(index, x, y);
    }

    @Override public void nglVertexAttrib2fv(int index, long v) {
        org.lwjgl.opengles.GLES20.nglVertexAttrib2fv(index, v);
    }

    @Override public void glVertexAttrib2fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer v) {
        org.lwjgl.opengles.GLES20.glVertexAttrib2fv(index, v);
    }

    @Override public void glVertexAttrib2fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] v) {
        org.lwjgl.opengles.GLES20.glVertexAttrib2fv(index, v);
    }

    @Override public void glVertexAttrib3f(@NativeType("GLuint") int index, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z) {
        org.lwjgl.opengles.GLES20.glVertexAttrib3f(index, x, y, z);
    }

    @Override public void nglVertexAttrib3fv(int index, long v) {
        org.lwjgl.opengles.GLES20.nglVertexAttrib3fv(index, v);
    }

    @Override public void glVertexAttrib3fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer v) {
        org.lwjgl.opengles.GLES20.glVertexAttrib3fv(index, v);
    }

    @Override public void glVertexAttrib3fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] v) {
        org.lwjgl.opengles.GLES20.glVertexAttrib3fv(index, v);
    }

    @Override public void glVertexAttrib4f(@NativeType("GLuint") int index, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z, @NativeType("GLfloat") float w) {
        org.lwjgl.opengles.GLES20.glVertexAttrib4f(index, x, y, z, w);
    }

    @Override public void nglVertexAttrib4fv(int index, long v) {
        org.lwjgl.opengles.GLES20.nglVertexAttrib4fv(index, v);
    }

    @Override public void glVertexAttrib4fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer v) {
        org.lwjgl.opengles.GLES20.glVertexAttrib4fv(index, v);
    }

    @Override public void glVertexAttrib4fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] v) {
        org.lwjgl.opengles.GLES20.glVertexAttrib4fv(index, v);
    }

    @Override public void nglVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, long pointer) {
        org.lwjgl.opengles.GLES20.nglVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    @Override public void glVertexAttribPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        org.lwjgl.opengles.GLES20.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    @Override public void glVertexAttribPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        org.lwjgl.opengles.GLES20.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    @Override public void glVertexAttribPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer) {
        org.lwjgl.opengles.GLES20.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    @Override public void glVertexAttribPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") IntBuffer pointer) {
        org.lwjgl.opengles.GLES20.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    @Override public void glVertexAttribPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") FloatBuffer pointer) {
        org.lwjgl.opengles.GLES20.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    @Override public void glViewport(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        org.lwjgl.opengles.GLES20.glViewport(x, y, width, height);
    }

}
