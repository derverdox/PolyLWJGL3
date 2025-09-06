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

    @Override public void glActiveTexture(int texture) {
        org.lwjgl.opengles.GLES20.glActiveTexture(texture);
    }

    @Override public void glAttachShader(int program, int shader) {
        org.lwjgl.opengles.GLES20.glAttachShader(program, shader);
    }

    @Override public void nglBindAttribLocation(int program, int index, long name) {
        org.lwjgl.opengles.GLES20.nglBindAttribLocation(program, index, name);
    }

    @Override public void glBindAttribLocation(int program, int index, ByteBuffer name) {
        org.lwjgl.opengles.GLES20.glBindAttribLocation(program, index, name);
    }

    @Override public void glBindAttribLocation(int program, int index, CharSequence name) {
        org.lwjgl.opengles.GLES20.glBindAttribLocation(program, index, name);
    }

    @Override public void glBindBuffer(int target, int buffer) {
        org.lwjgl.opengles.GLES20.glBindBuffer(target, buffer);
    }

    @Override public void glBindFramebuffer(int target, int framebuffer) {
        org.lwjgl.opengles.GLES20.glBindFramebuffer(target, framebuffer);
    }

    @Override public void glBindRenderbuffer(int target, int renderbuffer) {
        org.lwjgl.opengles.GLES20.glBindRenderbuffer(target, renderbuffer);
    }

    @Override public void glBindTexture(int target, int texture) {
        org.lwjgl.opengles.GLES20.glBindTexture(target, texture);
    }

    @Override public void glBlendColor(float red, float green, float blue, float alpha) {
        org.lwjgl.opengles.GLES20.glBlendColor(red, green, blue, alpha);
    }

    @Override public void glBlendEquation(int mode) {
        org.lwjgl.opengles.GLES20.glBlendEquation(mode);
    }

    @Override public void glBlendEquationSeparate(int modeRGB, int modeAlpha) {
        org.lwjgl.opengles.GLES20.glBlendEquationSeparate(modeRGB, modeAlpha);
    }

    @Override public void glBlendFunc(int sfactor, int dfactor) {
        org.lwjgl.opengles.GLES20.glBlendFunc(sfactor, dfactor);
    }

    @Override public void glBlendFuncSeparate(int sfactorRGB, int dfactorRGB, int sfactorAlpha, int dfactorAlpha) {
        org.lwjgl.opengles.GLES20.glBlendFuncSeparate(sfactorRGB, dfactorRGB, sfactorAlpha, dfactorAlpha);
    }

    @Override public void nglBufferData(int target, long size, long data, int usage) {
        org.lwjgl.opengles.GLES20.nglBufferData(target, size, data, usage);
    }

    @Override public void glBufferData(int target, long size, int usage) {
        org.lwjgl.opengles.GLES20.glBufferData(target, size, usage);
    }

    @Override public void glBufferData(int target, ByteBuffer data, int usage) {
        org.lwjgl.opengles.GLES20.glBufferData(target, data, usage);
    }

    @Override public void glBufferData(int target, ShortBuffer data, int usage) {
        org.lwjgl.opengles.GLES20.glBufferData(target, data, usage);
    }

    @Override public void glBufferData(int target, IntBuffer data, int usage) {
        org.lwjgl.opengles.GLES20.glBufferData(target, data, usage);
    }

    @Override public void glBufferData(int target, FloatBuffer data, int usage) {
        org.lwjgl.opengles.GLES20.glBufferData(target, data, usage);
    }

    @Override public void glBufferData(int target, short[] data, int usage) {
        org.lwjgl.opengles.GLES20.glBufferData(target, data, usage);
    }

    @Override public void glBufferData(int target, int[] data, int usage) {
        org.lwjgl.opengles.GLES20.glBufferData(target, data, usage);
    }

    @Override public void glBufferData(int target, float[] data, int usage) {
        org.lwjgl.opengles.GLES20.glBufferData(target, data, usage);
    }

    @Override public void nglBufferSubData(int target, long offset, long size, long data) {
        org.lwjgl.opengles.GLES20.nglBufferSubData(target, offset, size, data);
    }

    @Override public void glBufferSubData(int target, long offset, ByteBuffer data) {
        org.lwjgl.opengles.GLES20.glBufferSubData(target, offset, data);
    }

    @Override public void glBufferSubData(int target, long offset, ShortBuffer data) {
        org.lwjgl.opengles.GLES20.glBufferSubData(target, offset, data);
    }

    @Override public void glBufferSubData(int target, long offset, IntBuffer data) {
        org.lwjgl.opengles.GLES20.glBufferSubData(target, offset, data);
    }

    @Override public void glBufferSubData(int target, long offset, FloatBuffer data) {
        org.lwjgl.opengles.GLES20.glBufferSubData(target, offset, data);
    }

    @Override public void glBufferSubData(int target, long offset, short[] data) {
        org.lwjgl.opengles.GLES20.glBufferSubData(target, offset, data);
    }

    @Override public void glBufferSubData(int target, long offset, int[] data) {
        org.lwjgl.opengles.GLES20.glBufferSubData(target, offset, data);
    }

    @Override public void glBufferSubData(int target, long offset, float[] data) {
        org.lwjgl.opengles.GLES20.glBufferSubData(target, offset, data);
    }

    @Override public int glCheckFramebufferStatus(int target) {
        return org.lwjgl.opengles.GLES20.glCheckFramebufferStatus(target);
    }

    @Override public void glClear(int mask) {
        org.lwjgl.opengles.GLES20.glClear(mask);
    }

    @Override public void glClearColor(float red, float green, float blue, float alpha) {
        org.lwjgl.opengles.GLES20.glClearColor(red, green, blue, alpha);
    }

    @Override public void glClearDepthf(float d) {
        org.lwjgl.opengles.GLES20.glClearDepthf(d);
    }

    @Override public void glClearStencil(int s) {
        org.lwjgl.opengles.GLES20.glClearStencil(s);
    }

    @Override public void glColorMask(boolean red, boolean green, boolean blue, boolean alpha) {
        org.lwjgl.opengles.GLES20.glColorMask(red, green, blue, alpha);
    }

    @Override public void glCompileShader(int shader) {
        org.lwjgl.opengles.GLES20.glCompileShader(shader);
    }

    @Override public void nglCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, long data) {
        org.lwjgl.opengles.GLES20.nglCompressedTexImage2D(target, level, internalformat, width, height, border, imageSize, data);
    }

    @Override public void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, long data) {
        org.lwjgl.opengles.GLES20.glCompressedTexImage2D(target, level, internalformat, width, height, border, imageSize, data);
    }

    @Override public void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, @Nullable ByteBuffer data) {
        org.lwjgl.opengles.GLES20.glCompressedTexImage2D(target, level, internalformat, width, height, border, data);
    }

    @Override public void nglCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data) {
        org.lwjgl.opengles.GLES20.nglCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, imageSize, data);
    }

    @Override public void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data) {
        org.lwjgl.opengles.GLES20.glCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, imageSize, data);
    }

    @Override public void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, ByteBuffer data) {
        org.lwjgl.opengles.GLES20.glCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, data);
    }

    @Override public void glCopyTexImage2D(int target, int level, int internalformat, int x, int y, int width, int height, int border) {
        org.lwjgl.opengles.GLES20.glCopyTexImage2D(target, level, internalformat, x, y, width, height, border);
    }

    @Override public void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
        org.lwjgl.opengles.GLES20.glCopyTexSubImage2D(target, level, xoffset, yoffset, x, y, width, height);
    }

    @Override public int glCreateProgram() {
        return org.lwjgl.opengles.GLES20.glCreateProgram();
    }

    @Override public int glCreateShader(int type) {
        return org.lwjgl.opengles.GLES20.glCreateShader(type);
    }

    @Override public void glCullFace(int mode) {
        org.lwjgl.opengles.GLES20.glCullFace(mode);
    }

    @Override public void nglDeleteBuffers(int n, long buffers) {
        org.lwjgl.opengles.GLES20.nglDeleteBuffers(n, buffers);
    }

    @Override public void glDeleteBuffers(IntBuffer buffers) {
        org.lwjgl.opengles.GLES20.glDeleteBuffers(buffers);
    }

    @Override public void glDeleteBuffers(int buffer) {
        org.lwjgl.opengles.GLES20.glDeleteBuffers(buffer);
    }

    @Override public void glDeleteBuffers(int[] buffers) {
        org.lwjgl.opengles.GLES20.glDeleteBuffers(buffers);
    }

    @Override public void nglDeleteFramebuffers(int n, long framebuffers) {
        org.lwjgl.opengles.GLES20.nglDeleteFramebuffers(n, framebuffers);
    }

    @Override public void glDeleteFramebuffers(IntBuffer framebuffers) {
        org.lwjgl.opengles.GLES20.glDeleteFramebuffers(framebuffers);
    }

    @Override public void glDeleteFramebuffers(int framebuffer) {
        org.lwjgl.opengles.GLES20.glDeleteFramebuffers(framebuffer);
    }

    @Override public void glDeleteFramebuffers(int[] framebuffers) {
        org.lwjgl.opengles.GLES20.glDeleteFramebuffers(framebuffers);
    }

    @Override public void glDeleteProgram(int program) {
        org.lwjgl.opengles.GLES20.glDeleteProgram(program);
    }

    @Override public void nglDeleteRenderbuffers(int n, long renderbuffers) {
        org.lwjgl.opengles.GLES20.nglDeleteRenderbuffers(n, renderbuffers);
    }

    @Override public void glDeleteRenderbuffers(IntBuffer renderbuffers) {
        org.lwjgl.opengles.GLES20.glDeleteRenderbuffers(renderbuffers);
    }

    @Override public void glDeleteRenderbuffers(int renderbuffer) {
        org.lwjgl.opengles.GLES20.glDeleteRenderbuffers(renderbuffer);
    }

    @Override public void glDeleteRenderbuffers(int[] renderbuffers) {
        org.lwjgl.opengles.GLES20.glDeleteRenderbuffers(renderbuffers);
    }

    @Override public void glDeleteShader(int shader) {
        org.lwjgl.opengles.GLES20.glDeleteShader(shader);
    }

    @Override public void nglDeleteTextures(int n, long textures) {
        org.lwjgl.opengles.GLES20.nglDeleteTextures(n, textures);
    }

    @Override public void glDeleteTextures(IntBuffer textures) {
        org.lwjgl.opengles.GLES20.glDeleteTextures(textures);
    }

    @Override public void glDeleteTextures(int texture) {
        org.lwjgl.opengles.GLES20.glDeleteTextures(texture);
    }

    @Override public void glDeleteTextures(int[] textures) {
        org.lwjgl.opengles.GLES20.glDeleteTextures(textures);
    }

    @Override public void glDepthFunc(int func) {
        org.lwjgl.opengles.GLES20.glDepthFunc(func);
    }

    @Override public void glDepthMask(boolean flag) {
        org.lwjgl.opengles.GLES20.glDepthMask(flag);
    }

    @Override public void glDepthRangef(float n, float f) {
        org.lwjgl.opengles.GLES20.glDepthRangef(n, f);
    }

    @Override public void glDetachShader(int program, int shader) {
        org.lwjgl.opengles.GLES20.glDetachShader(program, shader);
    }

    @Override public void glDisable(int cap) {
        org.lwjgl.opengles.GLES20.glDisable(cap);
    }

    @Override public void glDisableVertexAttribArray(int index) {
        org.lwjgl.opengles.GLES20.glDisableVertexAttribArray(index);
    }

    @Override public void glDrawArrays(int mode, int first, int count) {
        org.lwjgl.opengles.GLES20.glDrawArrays(mode, first, count);
    }

    @Override public void nglDrawElements(int mode, int count, int type, long indices) {
        org.lwjgl.opengles.GLES20.nglDrawElements(mode, count, type, indices);
    }

    @Override public void glDrawElements(int mode, int count, int type, long indices) {
        org.lwjgl.opengles.GLES20.glDrawElements(mode, count, type, indices);
    }

    @Override public void glDrawElements(int mode, int type, ByteBuffer indices) {
        org.lwjgl.opengles.GLES20.glDrawElements(mode, type, indices);
    }

    @Override public void glDrawElements(int mode, ByteBuffer indices) {
        org.lwjgl.opengles.GLES20.glDrawElements(mode, indices);
    }

    @Override public void glDrawElements(int mode, ShortBuffer indices) {
        org.lwjgl.opengles.GLES20.glDrawElements(mode, indices);
    }

    @Override public void glDrawElements(int mode, IntBuffer indices) {
        org.lwjgl.opengles.GLES20.glDrawElements(mode, indices);
    }

    @Override public void glEnable(int cap) {
        org.lwjgl.opengles.GLES20.glEnable(cap);
    }

    @Override public void glEnableVertexAttribArray(int index) {
        org.lwjgl.opengles.GLES20.glEnableVertexAttribArray(index);
    }

    @Override public void glFinish() {
        org.lwjgl.opengles.GLES20.glFinish();
    }

    @Override public void glFlush() {
        org.lwjgl.opengles.GLES20.glFlush();
    }

    @Override public void glFramebufferRenderbuffer(int target, int attachment, int renderbuffertarget, int renderbuffer) {
        org.lwjgl.opengles.GLES20.glFramebufferRenderbuffer(target, attachment, renderbuffertarget, renderbuffer);
    }

    @Override public void glFramebufferTexture2D(int target, int attachment, int textarget, int texture, int level) {
        org.lwjgl.opengles.GLES20.glFramebufferTexture2D(target, attachment, textarget, texture, level);
    }

    @Override public void glFrontFace(int mode) {
        org.lwjgl.opengles.GLES20.glFrontFace(mode);
    }

    @Override public void nglGenBuffers(int n, long buffers) {
        org.lwjgl.opengles.GLES20.nglGenBuffers(n, buffers);
    }

    @Override public void glGenBuffers(IntBuffer buffers) {
        org.lwjgl.opengles.GLES20.glGenBuffers(buffers);
    }

    @Override public int glGenBuffers() {
        return org.lwjgl.opengles.GLES20.glGenBuffers();
    }

    @Override public void glGenBuffers(int[] buffers) {
        org.lwjgl.opengles.GLES20.glGenBuffers(buffers);
    }

    @Override public void glGenerateMipmap(int target) {
        org.lwjgl.opengles.GLES20.glGenerateMipmap(target);
    }

    @Override public void nglGenFramebuffers(int n, long framebuffers) {
        org.lwjgl.opengles.GLES20.nglGenFramebuffers(n, framebuffers);
    }

    @Override public void glGenFramebuffers(IntBuffer framebuffers) {
        org.lwjgl.opengles.GLES20.glGenFramebuffers(framebuffers);
    }

    @Override public int glGenFramebuffers() {
        return org.lwjgl.opengles.GLES20.glGenFramebuffers();
    }

    @Override public void glGenFramebuffers(int[] framebuffers) {
        org.lwjgl.opengles.GLES20.glGenFramebuffers(framebuffers);
    }

    @Override public void nglGenRenderbuffers(int n, long renderbuffers) {
        org.lwjgl.opengles.GLES20.nglGenRenderbuffers(n, renderbuffers);
    }

    @Override public void glGenRenderbuffers(IntBuffer renderbuffers) {
        org.lwjgl.opengles.GLES20.glGenRenderbuffers(renderbuffers);
    }

    @Override public int glGenRenderbuffers() {
        return org.lwjgl.opengles.GLES20.glGenRenderbuffers();
    }

    @Override public void glGenRenderbuffers(int[] renderbuffers) {
        org.lwjgl.opengles.GLES20.glGenRenderbuffers(renderbuffers);
    }

    @Override public void nglGenTextures(int n, long textures) {
        org.lwjgl.opengles.GLES20.nglGenTextures(n, textures);
    }

    @Override public void glGenTextures(IntBuffer textures) {
        org.lwjgl.opengles.GLES20.glGenTextures(textures);
    }

    @Override public int glGenTextures() {
        return org.lwjgl.opengles.GLES20.glGenTextures();
    }

    @Override public void glGenTextures(int[] textures) {
        org.lwjgl.opengles.GLES20.glGenTextures(textures);
    }

    @Override public void nglGetActiveAttrib(int program, int index, int bufSize, long length, long size, long type, long name) {
        org.lwjgl.opengles.GLES20.nglGetActiveAttrib(program, index, bufSize, length, size, type, name);
    }

    @Override public void glGetActiveAttrib(int program, int index, @Nullable IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
        org.lwjgl.opengles.GLES20.glGetActiveAttrib(program, index, length, size, type, name);
    }

    @Override public String glGetActiveAttrib(int program, int index, int bufSize, IntBuffer size, IntBuffer type) {
        return org.lwjgl.opengles.GLES20.glGetActiveAttrib(program, index, bufSize, size, type);
    }

    @Override public String glGetActiveAttrib(int program, int index, IntBuffer size, IntBuffer type) {
        return org.lwjgl.opengles.GLES20.glGetActiveAttrib(program, index, size, type);
    }

    @Override public void glGetActiveAttrib(int program, int index, @Nullable int[] length, int[] size, int[] type, ByteBuffer name) {
        org.lwjgl.opengles.GLES20.glGetActiveAttrib(program, index, length, size, type, name);
    }

    @Override public void nglGetActiveUniform(int program, int index, int bufSize, long length, long size, long type, long name) {
        org.lwjgl.opengles.GLES20.nglGetActiveUniform(program, index, bufSize, length, size, type, name);
    }

    @Override public void glGetActiveUniform(int program, int index, @Nullable IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
        org.lwjgl.opengles.GLES20.glGetActiveUniform(program, index, length, size, type, name);
    }

    @Override public String glGetActiveUniform(int program, int index, int bufSize, IntBuffer size, IntBuffer type) {
        return org.lwjgl.opengles.GLES20.glGetActiveUniform(program, index, bufSize, size, type);
    }

    @Override public String glGetActiveUniform(int program, int index, IntBuffer size, IntBuffer type) {
        return org.lwjgl.opengles.GLES20.glGetActiveUniform(program, index, size, type);
    }

    @Override public void glGetActiveUniform(int program, int index, @Nullable int[] length, int[] size, int[] type, ByteBuffer name) {
        org.lwjgl.opengles.GLES20.glGetActiveUniform(program, index, length, size, type, name);
    }

    @Override public void nglGetAttachedShaders(int program, int maxCount, long count, long shaders) {
        org.lwjgl.opengles.GLES20.nglGetAttachedShaders(program, maxCount, count, shaders);
    }

    @Override public void glGetAttachedShaders(int program, @Nullable IntBuffer count, IntBuffer shaders) {
        org.lwjgl.opengles.GLES20.glGetAttachedShaders(program, count, shaders);
    }

    @Override public void glGetAttachedShaders(int program, @Nullable int[] count, int[] shaders) {
        org.lwjgl.opengles.GLES20.glGetAttachedShaders(program, count, shaders);
    }

    @Override public int nglGetAttribLocation(int program, long name) {
        return org.lwjgl.opengles.GLES20.nglGetAttribLocation(program, name);
    }

    @Override public int glGetAttribLocation(int program, ByteBuffer name) {
        return org.lwjgl.opengles.GLES20.glGetAttribLocation(program, name);
    }

    @Override public int glGetAttribLocation(int program, CharSequence name) {
        return org.lwjgl.opengles.GLES20.glGetAttribLocation(program, name);
    }

    @Override public void nglGetBooleanv(int pname, long data) {
        org.lwjgl.opengles.GLES20.nglGetBooleanv(pname, data);
    }

    @Override public void glGetBooleanv(int pname, ByteBuffer data) {
        org.lwjgl.opengles.GLES20.glGetBooleanv(pname, data);
    }

    @Override public boolean glGetBoolean(int pname) {
        return org.lwjgl.opengles.GLES20.glGetBoolean(pname);
    }

    @Override public void nglGetBufferParameteriv(int target, int pname, long params) {
        org.lwjgl.opengles.GLES20.nglGetBufferParameteriv(target, pname, params);
    }

    @Override public void glGetBufferParameteriv(int target, int pname, IntBuffer params) {
        org.lwjgl.opengles.GLES20.glGetBufferParameteriv(target, pname, params);
    }

    @Override public void glGetBufferParameteriv(int target, int pname, int[] params) {
        org.lwjgl.opengles.GLES20.glGetBufferParameteriv(target, pname, params);
    }

    @Override public int glGetBufferParameteri(int target, int pname) {
        return org.lwjgl.opengles.GLES20.glGetBufferParameteri(target, pname);
    }

    @Override public int glGetError() {
        return org.lwjgl.opengles.GLES20.glGetError();
    }

    @Override public void nglGetFloatv(int pname, long data) {
        org.lwjgl.opengles.GLES20.nglGetFloatv(pname, data);
    }

    @Override public void glGetFloatv(int pname, FloatBuffer data) {
        org.lwjgl.opengles.GLES20.glGetFloatv(pname, data);
    }

    @Override public void glGetFloatv(int pname, float[] data) {
        org.lwjgl.opengles.GLES20.glGetFloatv(pname, data);
    }

    @Override public float glGetFloat(int pname) {
        return org.lwjgl.opengles.GLES20.glGetFloat(pname);
    }

    @Override public void nglGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, long params) {
        org.lwjgl.opengles.GLES20.nglGetFramebufferAttachmentParameteriv(target, attachment, pname, params);
    }

    @Override public void glGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, IntBuffer params) {
        org.lwjgl.opengles.GLES20.glGetFramebufferAttachmentParameteriv(target, attachment, pname, params);
    }

    @Override public void glGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, int[] params) {
        org.lwjgl.opengles.GLES20.glGetFramebufferAttachmentParameteriv(target, attachment, pname, params);
    }

    @Override public int glGetFramebufferAttachmentParameteri(int target, int attachment, int pname) {
        return org.lwjgl.opengles.GLES20.glGetFramebufferAttachmentParameteri(target, attachment, pname);
    }

    @Override public void nglGetIntegerv(int pname, long data) {
        org.lwjgl.opengles.GLES20.nglGetIntegerv(pname, data);
    }

    @Override public void glGetIntegerv(int pname, IntBuffer data) {
        org.lwjgl.opengles.GLES20.glGetIntegerv(pname, data);
    }

    @Override public void glGetIntegerv(int pname, int[] data) {
        org.lwjgl.opengles.GLES20.glGetIntegerv(pname, data);
    }

    @Override public int glGetInteger(int pname) {
        return org.lwjgl.opengles.GLES20.glGetInteger(pname);
    }

    @Override public void nglGetProgramiv(int program, int pname, long params) {
        org.lwjgl.opengles.GLES20.nglGetProgramiv(program, pname, params);
    }

    @Override public void glGetProgramiv(int program, int pname, IntBuffer params) {
        org.lwjgl.opengles.GLES20.glGetProgramiv(program, pname, params);
    }

    @Override public void glGetProgramiv(int program, int pname, int[] params) {
        org.lwjgl.opengles.GLES20.glGetProgramiv(program, pname, params);
    }

    @Override public int glGetProgrami(int program, int pname) {
        return org.lwjgl.opengles.GLES20.glGetProgrami(program, pname);
    }

    @Override public void nglGetProgramInfoLog(int program, int bufSize, long length, long infoLog) {
        org.lwjgl.opengles.GLES20.nglGetProgramInfoLog(program, bufSize, length, infoLog);
    }

    @Override public void glGetProgramInfoLog(int program, @Nullable IntBuffer length, ByteBuffer infoLog) {
        org.lwjgl.opengles.GLES20.glGetProgramInfoLog(program, length, infoLog);
    }

    @Override public String glGetProgramInfoLog(int program, int bufSize) {
        return org.lwjgl.opengles.GLES20.glGetProgramInfoLog(program, bufSize);
    }

    @Override public String glGetProgramInfoLog(int program) {
        return org.lwjgl.opengles.GLES20.glGetProgramInfoLog(program);
    }

    @Override public void glGetProgramInfoLog(int program, @Nullable int[] length, ByteBuffer infoLog) {
        org.lwjgl.opengles.GLES20.glGetProgramInfoLog(program, length, infoLog);
    }

    @Override public void nglGetRenderbufferParameteriv(int target, int pname, long params) {
        org.lwjgl.opengles.GLES20.nglGetRenderbufferParameteriv(target, pname, params);
    }

    @Override public void glGetRenderbufferParameteriv(int target, int pname, IntBuffer params) {
        org.lwjgl.opengles.GLES20.glGetRenderbufferParameteriv(target, pname, params);
    }

    @Override public void glGetRenderbufferParameteriv(int target, int pname, int[] params) {
        org.lwjgl.opengles.GLES20.glGetRenderbufferParameteriv(target, pname, params);
    }

    @Override public int glGetRenderbufferParameteri(int target, int pname) {
        return org.lwjgl.opengles.GLES20.glGetRenderbufferParameteri(target, pname);
    }

    @Override public void nglGetShaderiv(int shader, int pname, long params) {
        org.lwjgl.opengles.GLES20.nglGetShaderiv(shader, pname, params);
    }

    @Override public void glGetShaderiv(int shader, int pname, IntBuffer params) {
        org.lwjgl.opengles.GLES20.glGetShaderiv(shader, pname, params);
    }

    @Override public void glGetShaderiv(int shader, int pname, int[] params) {
        org.lwjgl.opengles.GLES20.glGetShaderiv(shader, pname, params);
    }

    @Override public int glGetShaderi(int shader, int pname) {
        return org.lwjgl.opengles.GLES20.glGetShaderi(shader, pname);
    }

    @Override public void nglGetShaderInfoLog(int shader, int bufSize, long length, long infoLog) {
        org.lwjgl.opengles.GLES20.nglGetShaderInfoLog(shader, bufSize, length, infoLog);
    }

    @Override public void glGetShaderInfoLog(int shader, @Nullable IntBuffer length, ByteBuffer infoLog) {
        org.lwjgl.opengles.GLES20.glGetShaderInfoLog(shader, length, infoLog);
    }

    @Override public String glGetShaderInfoLog(int shader, int bufSize) {
        return org.lwjgl.opengles.GLES20.glGetShaderInfoLog(shader, bufSize);
    }

    @Override public String glGetShaderInfoLog(int shader) {
        return org.lwjgl.opengles.GLES20.glGetShaderInfoLog(shader);
    }

    @Override public void glGetShaderInfoLog(int shader, @Nullable int[] length, ByteBuffer infoLog) {
        org.lwjgl.opengles.GLES20.glGetShaderInfoLog(shader, length, infoLog);
    }

    @Override public void nglGetShaderPrecisionFormat(int shadertype, int precisiontype, long range, long precision) {
        org.lwjgl.opengles.GLES20.nglGetShaderPrecisionFormat(shadertype, precisiontype, range, precision);
    }

    @Override public void glGetShaderPrecisionFormat(int shadertype, int precisiontype, IntBuffer range, IntBuffer precision) {
        org.lwjgl.opengles.GLES20.glGetShaderPrecisionFormat(shadertype, precisiontype, range, precision);
    }

    @Override public void glGetShaderPrecisionFormat(int shadertype, int precisiontype, int[] range, int[] precision) {
        org.lwjgl.opengles.GLES20.glGetShaderPrecisionFormat(shadertype, precisiontype, range, precision);
    }

    @Override public void nglGetShaderSource(int shader, int bufSize, long length, long source) {
        org.lwjgl.opengles.GLES20.nglGetShaderSource(shader, bufSize, length, source);
    }

    @Override public void glGetShaderSource(int shader, @Nullable IntBuffer length, ByteBuffer source) {
        org.lwjgl.opengles.GLES20.glGetShaderSource(shader, length, source);
    }

    @Override public String glGetShaderSource(int shader, int bufSize) {
        return org.lwjgl.opengles.GLES20.glGetShaderSource(shader, bufSize);
    }

    @Override public String glGetShaderSource(int shader) {
        return org.lwjgl.opengles.GLES20.glGetShaderSource(shader);
    }

    @Override public void glGetShaderSource(int shader, @Nullable int[] length, ByteBuffer source) {
        org.lwjgl.opengles.GLES20.glGetShaderSource(shader, length, source);
    }

    @Override public long nglGetString(int name) {
        return org.lwjgl.opengles.GLES20.nglGetString(name);
    }

@Nullable
    @Override public String glGetString(int name) {
        return org.lwjgl.opengles.GLES20.glGetString(name);
    }

    @Override public void nglGetTexParameterfv(int target, int pname, long params) {
        org.lwjgl.opengles.GLES20.nglGetTexParameterfv(target, pname, params);
    }

    @Override public void glGetTexParameterfv(int target, int pname, FloatBuffer params) {
        org.lwjgl.opengles.GLES20.glGetTexParameterfv(target, pname, params);
    }

    @Override public void glGetTexParameterfv(int target, int pname, float[] params) {
        org.lwjgl.opengles.GLES20.glGetTexParameterfv(target, pname, params);
    }

    @Override public float glGetTexParameterf(int target, int pname) {
        return org.lwjgl.opengles.GLES20.glGetTexParameterf(target, pname);
    }

    @Override public void nglGetTexParameteriv(int target, int pname, long params) {
        org.lwjgl.opengles.GLES20.nglGetTexParameteriv(target, pname, params);
    }

    @Override public void glGetTexParameteriv(int target, int pname, IntBuffer params) {
        org.lwjgl.opengles.GLES20.glGetTexParameteriv(target, pname, params);
    }

    @Override public void glGetTexParameteriv(int target, int pname, int[] params) {
        org.lwjgl.opengles.GLES20.glGetTexParameteriv(target, pname, params);
    }

    @Override public int glGetTexParameteri(int target, int pname) {
        return org.lwjgl.opengles.GLES20.glGetTexParameteri(target, pname);
    }

    @Override public void nglGetUniformfv(int program, int location, long params) {
        org.lwjgl.opengles.GLES20.nglGetUniformfv(program, location, params);
    }

    @Override public void glGetUniformfv(int program, int location, FloatBuffer params) {
        org.lwjgl.opengles.GLES20.glGetUniformfv(program, location, params);
    }

    @Override public void glGetUniformfv(int program, int location, float[] params) {
        org.lwjgl.opengles.GLES20.glGetUniformfv(program, location, params);
    }

    @Override public float glGetUniformf(int program, int location) {
        return org.lwjgl.opengles.GLES20.glGetUniformf(program, location);
    }

    @Override public void nglGetUniformiv(int program, int location, long params) {
        org.lwjgl.opengles.GLES20.nglGetUniformiv(program, location, params);
    }

    @Override public void glGetUniformiv(int program, int location, IntBuffer params) {
        org.lwjgl.opengles.GLES20.glGetUniformiv(program, location, params);
    }

    @Override public void glGetUniformiv(int program, int location, int[] params) {
        org.lwjgl.opengles.GLES20.glGetUniformiv(program, location, params);
    }

    @Override public int glGetUniformi(int program, int location) {
        return org.lwjgl.opengles.GLES20.glGetUniformi(program, location);
    }

    @Override public int nglGetUniformLocation(int program, long name) {
        return org.lwjgl.opengles.GLES20.nglGetUniformLocation(program, name);
    }

    @Override public int glGetUniformLocation(int program, ByteBuffer name) {
        return org.lwjgl.opengles.GLES20.glGetUniformLocation(program, name);
    }

    @Override public int glGetUniformLocation(int program, CharSequence name) {
        return org.lwjgl.opengles.GLES20.glGetUniformLocation(program, name);
    }

    @Override public void nglGetVertexAttribfv(int index, int pname, long params) {
        org.lwjgl.opengles.GLES20.nglGetVertexAttribfv(index, pname, params);
    }

    @Override public void glGetVertexAttribfv(int index, int pname, FloatBuffer params) {
        org.lwjgl.opengles.GLES20.glGetVertexAttribfv(index, pname, params);
    }

    @Override public void glGetVertexAttribfv(int index, int pname, float[] params) {
        org.lwjgl.opengles.GLES20.glGetVertexAttribfv(index, pname, params);
    }

    @Override public void nglGetVertexAttribiv(int index, int pname, long params) {
        org.lwjgl.opengles.GLES20.nglGetVertexAttribiv(index, pname, params);
    }

    @Override public void glGetVertexAttribiv(int index, int pname, IntBuffer params) {
        org.lwjgl.opengles.GLES20.glGetVertexAttribiv(index, pname, params);
    }

    @Override public void glGetVertexAttribiv(int index, int pname, int[] params) {
        org.lwjgl.opengles.GLES20.glGetVertexAttribiv(index, pname, params);
    }

    @Override public void nglGetVertexAttribPointerv(int index, int pname, long pointer) {
        org.lwjgl.opengles.GLES20.nglGetVertexAttribPointerv(index, pname, pointer);
    }

    @Override public void glGetVertexAttribPointerv(int index, int pname, PointerBuffer pointer) {
        org.lwjgl.opengles.GLES20.glGetVertexAttribPointerv(index, pname, pointer);
    }

    @Override public long glGetVertexAttribPointer(int index, int pname) {
        return org.lwjgl.opengles.GLES20.glGetVertexAttribPointer(index, pname);
    }

    @Override public void glHint(int target, int mode) {
        org.lwjgl.opengles.GLES20.glHint(target, mode);
    }

    @Override public boolean glIsBuffer(int buffer) {
        return org.lwjgl.opengles.GLES20.glIsBuffer(buffer);
    }

    @Override public boolean glIsEnabled(int cap) {
        return org.lwjgl.opengles.GLES20.glIsEnabled(cap);
    }

    @Override public boolean glIsFramebuffer(int framebuffer) {
        return org.lwjgl.opengles.GLES20.glIsFramebuffer(framebuffer);
    }

    @Override public boolean glIsProgram(int program) {
        return org.lwjgl.opengles.GLES20.glIsProgram(program);
    }

    @Override public boolean glIsRenderbuffer(int renderbuffer) {
        return org.lwjgl.opengles.GLES20.glIsRenderbuffer(renderbuffer);
    }

    @Override public boolean glIsShader(int shader) {
        return org.lwjgl.opengles.GLES20.glIsShader(shader);
    }

    @Override public boolean glIsTexture(int texture) {
        return org.lwjgl.opengles.GLES20.glIsTexture(texture);
    }

    @Override public void glLineWidth(float width) {
        org.lwjgl.opengles.GLES20.glLineWidth(width);
    }

    @Override public void glLinkProgram(int program) {
        org.lwjgl.opengles.GLES20.glLinkProgram(program);
    }

    @Override public void glPixelStorei(int pname, int param) {
        org.lwjgl.opengles.GLES20.glPixelStorei(pname, param);
    }

    @Override public void glPolygonOffset(float factor, float units) {
        org.lwjgl.opengles.GLES20.glPolygonOffset(factor, units);
    }

    @Override public void nglReadPixels(int x, int y, int width, int height, int format, int type, long pixels) {
        org.lwjgl.opengles.GLES20.nglReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadPixels(int x, int y, int width, int height, int format, int type, ByteBuffer pixels) {
        org.lwjgl.opengles.GLES20.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadPixels(int x, int y, int width, int height, int format, int type, long pixels) {
        org.lwjgl.opengles.GLES20.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadPixels(int x, int y, int width, int height, int format, int type, ShortBuffer pixels) {
        org.lwjgl.opengles.GLES20.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadPixels(int x, int y, int width, int height, int format, int type, IntBuffer pixels) {
        org.lwjgl.opengles.GLES20.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadPixels(int x, int y, int width, int height, int format, int type, FloatBuffer pixels) {
        org.lwjgl.opengles.GLES20.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadPixels(int x, int y, int width, int height, int format, int type, short[] pixels) {
        org.lwjgl.opengles.GLES20.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadPixels(int x, int y, int width, int height, int format, int type, int[] pixels) {
        org.lwjgl.opengles.GLES20.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadPixels(int x, int y, int width, int height, int format, int type, float[] pixels) {
        org.lwjgl.opengles.GLES20.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReleaseShaderCompiler() {
        org.lwjgl.opengles.GLES20.glReleaseShaderCompiler();
    }

    @Override public void glRenderbufferStorage(int target, int internalformat, int width, int height) {
        org.lwjgl.opengles.GLES20.glRenderbufferStorage(target, internalformat, width, height);
    }

    @Override public void glSampleCoverage(float value, boolean invert) {
        org.lwjgl.opengles.GLES20.glSampleCoverage(value, invert);
    }

    @Override public void glScissor(int x, int y, int width, int height) {
        org.lwjgl.opengles.GLES20.glScissor(x, y, width, height);
    }

    @Override public void nglShaderBinary(int count, long shaders, int binaryformat, long binary, int length) {
        org.lwjgl.opengles.GLES20.nglShaderBinary(count, shaders, binaryformat, binary, length);
    }

    @Override public void glShaderBinary(IntBuffer shaders, int binaryformat, ByteBuffer binary) {
        org.lwjgl.opengles.GLES20.glShaderBinary(shaders, binaryformat, binary);
    }

    @Override public void glShaderBinary(int[] shaders, int binaryformat, ByteBuffer binary) {
        org.lwjgl.opengles.GLES20.glShaderBinary(shaders, binaryformat, binary);
    }

    @Override public void nglShaderSource(int shader, int count, long string, long length) {
        org.lwjgl.opengles.GLES20.nglShaderSource(shader, count, string, length);
    }

    @Override public void glShaderSource(int shader, PointerBuffer string, @Nullable IntBuffer length) {
        org.lwjgl.opengles.GLES20.glShaderSource(shader, string, length);
    }

    @Override public void glShaderSource(int shader, CharSequence... string) {
        org.lwjgl.opengles.GLES20.glShaderSource(shader, string);
    }

    @Override public void glShaderSource(int shader, CharSequence string) {
        org.lwjgl.opengles.GLES20.glShaderSource(shader, string);
    }

    @Override public void glShaderSource(int shader, PointerBuffer string, @Nullable int[] length) {
        org.lwjgl.opengles.GLES20.glShaderSource(shader, string, length);
    }

    @Override public void glStencilFunc(int func, int ref, int mask) {
        org.lwjgl.opengles.GLES20.glStencilFunc(func, ref, mask);
    }

    @Override public void glStencilFuncSeparate(int face, int func, int ref, int mask) {
        org.lwjgl.opengles.GLES20.glStencilFuncSeparate(face, func, ref, mask);
    }

    @Override public void glStencilMask(int mask) {
        org.lwjgl.opengles.GLES20.glStencilMask(mask);
    }

    @Override public void glStencilMaskSeparate(int face, int mask) {
        org.lwjgl.opengles.GLES20.glStencilMaskSeparate(face, mask);
    }

    @Override public void glStencilOp(int fail, int zfail, int zpass) {
        org.lwjgl.opengles.GLES20.glStencilOp(fail, zfail, zpass);
    }

    @Override public void glStencilOpSeparate(int face, int sfail, int dpfail, int dppass) {
        org.lwjgl.opengles.GLES20.glStencilOpSeparate(face, sfail, dpfail, dppass);
    }

    @Override public void nglTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels) {
        org.lwjgl.opengles.GLES20.nglTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, @Nullable ByteBuffer pixels) {
        org.lwjgl.opengles.GLES20.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels) {
        org.lwjgl.opengles.GLES20.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, @Nullable ShortBuffer pixels) {
        org.lwjgl.opengles.GLES20.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, @Nullable IntBuffer pixels) {
        org.lwjgl.opengles.GLES20.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, @Nullable FloatBuffer pixels) {
        org.lwjgl.opengles.GLES20.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, @Nullable short[] pixels) {
        org.lwjgl.opengles.GLES20.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, @Nullable int[] pixels) {
        org.lwjgl.opengles.GLES20.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, @Nullable float[] pixels) {
        org.lwjgl.opengles.GLES20.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override public void glTexParameterf(int target, int pname, float param) {
        org.lwjgl.opengles.GLES20.glTexParameterf(target, pname, param);
    }

    @Override public void nglTexParameterfv(int target, int pname, long params) {
        org.lwjgl.opengles.GLES20.nglTexParameterfv(target, pname, params);
    }

    @Override public void glTexParameterfv(int target, int pname, FloatBuffer params) {
        org.lwjgl.opengles.GLES20.glTexParameterfv(target, pname, params);
    }

    @Override public void glTexParameterfv(int target, int pname, float[] params) {
        org.lwjgl.opengles.GLES20.glTexParameterfv(target, pname, params);
    }

    @Override public void glTexParameteri(int target, int pname, int param) {
        org.lwjgl.opengles.GLES20.glTexParameteri(target, pname, param);
    }

    @Override public void nglTexParameteriv(int target, int pname, long params) {
        org.lwjgl.opengles.GLES20.nglTexParameteriv(target, pname, params);
    }

    @Override public void glTexParameteriv(int target, int pname, IntBuffer params) {
        org.lwjgl.opengles.GLES20.glTexParameteriv(target, pname, params);
    }

    @Override public void glTexParameteriv(int target, int pname, int[] params) {
        org.lwjgl.opengles.GLES20.glTexParameteriv(target, pname, params);
    }

    @Override public void nglTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels) {
        org.lwjgl.opengles.GLES20.nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ByteBuffer pixels) {
        org.lwjgl.opengles.GLES20.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels) {
        org.lwjgl.opengles.GLES20.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ShortBuffer pixels) {
        org.lwjgl.opengles.GLES20.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, IntBuffer pixels) {
        org.lwjgl.opengles.GLES20.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, FloatBuffer pixels) {
        org.lwjgl.opengles.GLES20.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, short[] pixels) {
        org.lwjgl.opengles.GLES20.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, int[] pixels) {
        org.lwjgl.opengles.GLES20.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, float[] pixels) {
        org.lwjgl.opengles.GLES20.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glUniform1f(int location, float v0) {
        org.lwjgl.opengles.GLES20.glUniform1f(location, v0);
    }

    @Override public void nglUniform1fv(int location, int count, long value) {
        org.lwjgl.opengles.GLES20.nglUniform1fv(location, count, value);
    }

    @Override public void glUniform1fv(int location, FloatBuffer value) {
        org.lwjgl.opengles.GLES20.glUniform1fv(location, value);
    }

    @Override public void glUniform1fv(int location, float[] value) {
        org.lwjgl.opengles.GLES20.glUniform1fv(location, value);
    }

    @Override public void glUniform1i(int location, int v0) {
        org.lwjgl.opengles.GLES20.glUniform1i(location, v0);
    }

    @Override public void nglUniform1iv(int location, int count, long value) {
        org.lwjgl.opengles.GLES20.nglUniform1iv(location, count, value);
    }

    @Override public void glUniform1iv(int location, IntBuffer value) {
        org.lwjgl.opengles.GLES20.glUniform1iv(location, value);
    }

    @Override public void glUniform1iv(int location, int[] value) {
        org.lwjgl.opengles.GLES20.glUniform1iv(location, value);
    }

    @Override public void glUniform2f(int location, float v0, float v1) {
        org.lwjgl.opengles.GLES20.glUniform2f(location, v0, v1);
    }

    @Override public void nglUniform2fv(int location, int count, long value) {
        org.lwjgl.opengles.GLES20.nglUniform2fv(location, count, value);
    }

    @Override public void glUniform2fv(int location, FloatBuffer value) {
        org.lwjgl.opengles.GLES20.glUniform2fv(location, value);
    }

    @Override public void glUniform2fv(int location, float[] value) {
        org.lwjgl.opengles.GLES20.glUniform2fv(location, value);
    }

    @Override public void glUniform2i(int location, int v0, int v1) {
        org.lwjgl.opengles.GLES20.glUniform2i(location, v0, v1);
    }

    @Override public void nglUniform2iv(int location, int count, long value) {
        org.lwjgl.opengles.GLES20.nglUniform2iv(location, count, value);
    }

    @Override public void glUniform2iv(int location, IntBuffer value) {
        org.lwjgl.opengles.GLES20.glUniform2iv(location, value);
    }

    @Override public void glUniform2iv(int location, int[] value) {
        org.lwjgl.opengles.GLES20.glUniform2iv(location, value);
    }

    @Override public void glUniform3f(int location, float v0, float v1, float v2) {
        org.lwjgl.opengles.GLES20.glUniform3f(location, v0, v1, v2);
    }

    @Override public void nglUniform3fv(int location, int count, long value) {
        org.lwjgl.opengles.GLES20.nglUniform3fv(location, count, value);
    }

    @Override public void glUniform3fv(int location, FloatBuffer value) {
        org.lwjgl.opengles.GLES20.glUniform3fv(location, value);
    }

    @Override public void glUniform3fv(int location, float[] value) {
        org.lwjgl.opengles.GLES20.glUniform3fv(location, value);
    }

    @Override public void glUniform3i(int location, int v0, int v1, int v2) {
        org.lwjgl.opengles.GLES20.glUniform3i(location, v0, v1, v2);
    }

    @Override public void nglUniform3iv(int location, int count, long value) {
        org.lwjgl.opengles.GLES20.nglUniform3iv(location, count, value);
    }

    @Override public void glUniform3iv(int location, IntBuffer value) {
        org.lwjgl.opengles.GLES20.glUniform3iv(location, value);
    }

    @Override public void glUniform3iv(int location, int[] value) {
        org.lwjgl.opengles.GLES20.glUniform3iv(location, value);
    }

    @Override public void glUniform4f(int location, float v0, float v1, float v2, float v3) {
        org.lwjgl.opengles.GLES20.glUniform4f(location, v0, v1, v2, v3);
    }

    @Override public void nglUniform4fv(int location, int count, long value) {
        org.lwjgl.opengles.GLES20.nglUniform4fv(location, count, value);
    }

    @Override public void glUniform4fv(int location, FloatBuffer value) {
        org.lwjgl.opengles.GLES20.glUniform4fv(location, value);
    }

    @Override public void glUniform4fv(int location, float[] value) {
        org.lwjgl.opengles.GLES20.glUniform4fv(location, value);
    }

    @Override public void glUniform4i(int location, int v0, int v1, int v2, int v3) {
        org.lwjgl.opengles.GLES20.glUniform4i(location, v0, v1, v2, v3);
    }

    @Override public void nglUniform4iv(int location, int count, long value) {
        org.lwjgl.opengles.GLES20.nglUniform4iv(location, count, value);
    }

    @Override public void glUniform4iv(int location, IntBuffer value) {
        org.lwjgl.opengles.GLES20.glUniform4iv(location, value);
    }

    @Override public void glUniform4iv(int location, int[] value) {
        org.lwjgl.opengles.GLES20.glUniform4iv(location, value);
    }

    @Override public void nglUniformMatrix2fv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengles.GLES20.nglUniformMatrix2fv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix2fv(int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengles.GLES20.glUniformMatrix2fv(location, transpose, value);
    }

    @Override public void glUniformMatrix2fv(int location, boolean transpose, float[] value) {
        org.lwjgl.opengles.GLES20.glUniformMatrix2fv(location, transpose, value);
    }

    @Override public void nglUniformMatrix3fv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengles.GLES20.nglUniformMatrix3fv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix3fv(int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengles.GLES20.glUniformMatrix3fv(location, transpose, value);
    }

    @Override public void glUniformMatrix3fv(int location, boolean transpose, float[] value) {
        org.lwjgl.opengles.GLES20.glUniformMatrix3fv(location, transpose, value);
    }

    @Override public void nglUniformMatrix4fv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengles.GLES20.nglUniformMatrix4fv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix4fv(int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengles.GLES20.glUniformMatrix4fv(location, transpose, value);
    }

    @Override public void glUniformMatrix4fv(int location, boolean transpose, float[] value) {
        org.lwjgl.opengles.GLES20.glUniformMatrix4fv(location, transpose, value);
    }

    @Override public void glUseProgram(int program) {
        org.lwjgl.opengles.GLES20.glUseProgram(program);
    }

    @Override public void glValidateProgram(int program) {
        org.lwjgl.opengles.GLES20.glValidateProgram(program);
    }

    @Override public void glVertexAttrib1f(int index, float x) {
        org.lwjgl.opengles.GLES20.glVertexAttrib1f(index, x);
    }

    @Override public void nglVertexAttrib1fv(int index, long v) {
        org.lwjgl.opengles.GLES20.nglVertexAttrib1fv(index, v);
    }

    @Override public void glVertexAttrib1fv(int index, FloatBuffer v) {
        org.lwjgl.opengles.GLES20.glVertexAttrib1fv(index, v);
    }

    @Override public void glVertexAttrib1fv(int index, float[] v) {
        org.lwjgl.opengles.GLES20.glVertexAttrib1fv(index, v);
    }

    @Override public void glVertexAttrib2f(int index, float x, float y) {
        org.lwjgl.opengles.GLES20.glVertexAttrib2f(index, x, y);
    }

    @Override public void nglVertexAttrib2fv(int index, long v) {
        org.lwjgl.opengles.GLES20.nglVertexAttrib2fv(index, v);
    }

    @Override public void glVertexAttrib2fv(int index, FloatBuffer v) {
        org.lwjgl.opengles.GLES20.glVertexAttrib2fv(index, v);
    }

    @Override public void glVertexAttrib2fv(int index, float[] v) {
        org.lwjgl.opengles.GLES20.glVertexAttrib2fv(index, v);
    }

    @Override public void glVertexAttrib3f(int index, float x, float y, float z) {
        org.lwjgl.opengles.GLES20.glVertexAttrib3f(index, x, y, z);
    }

    @Override public void nglVertexAttrib3fv(int index, long v) {
        org.lwjgl.opengles.GLES20.nglVertexAttrib3fv(index, v);
    }

    @Override public void glVertexAttrib3fv(int index, FloatBuffer v) {
        org.lwjgl.opengles.GLES20.glVertexAttrib3fv(index, v);
    }

    @Override public void glVertexAttrib3fv(int index, float[] v) {
        org.lwjgl.opengles.GLES20.glVertexAttrib3fv(index, v);
    }

    @Override public void glVertexAttrib4f(int index, float x, float y, float z, float w) {
        org.lwjgl.opengles.GLES20.glVertexAttrib4f(index, x, y, z, w);
    }

    @Override public void nglVertexAttrib4fv(int index, long v) {
        org.lwjgl.opengles.GLES20.nglVertexAttrib4fv(index, v);
    }

    @Override public void glVertexAttrib4fv(int index, FloatBuffer v) {
        org.lwjgl.opengles.GLES20.glVertexAttrib4fv(index, v);
    }

    @Override public void glVertexAttrib4fv(int index, float[] v) {
        org.lwjgl.opengles.GLES20.glVertexAttrib4fv(index, v);
    }

    @Override public void nglVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, long pointer) {
        org.lwjgl.opengles.GLES20.nglVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    @Override public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, ByteBuffer pointer) {
        org.lwjgl.opengles.GLES20.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    @Override public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, long pointer) {
        org.lwjgl.opengles.GLES20.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    @Override public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, ShortBuffer pointer) {
        org.lwjgl.opengles.GLES20.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    @Override public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, IntBuffer pointer) {
        org.lwjgl.opengles.GLES20.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    @Override public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, FloatBuffer pointer) {
        org.lwjgl.opengles.GLES20.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    @Override public void glViewport(int x, int y, int width, int height) {
        org.lwjgl.opengles.GLES20.glViewport(x, y, width, height);
    }

}
