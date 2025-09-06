package de.verdox.polylwjgl3.gl.accessor.gl31;

import de.verdox.polylwjgl3.gl.accessor.gl30.GL30Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl30.GL30AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL31;
import org.lwjgl.system.*;

public class GL31AccessorImpl extends GL30AccessorImpl implements GL31Accessor {

    @Override public void glDrawArraysInstanced(@NativeType("GLenum") int mode, @NativeType("GLint") int first, @NativeType("GLsizei") int count, @NativeType("GLsizei") int primcount) {
        org.lwjgl.opengl.GL31.glDrawArraysInstanced(mode, first, count, primcount);
    }

    @Override public void nglDrawElementsInstanced(int mode, int count, int type, long indices, int primcount) {
        org.lwjgl.opengl.GL31.nglDrawElementsInstanced(mode, count, type, indices, primcount);
    }

    @Override public void glDrawElementsInstanced(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLsizei") int primcount) {
        org.lwjgl.opengl.GL31.glDrawElementsInstanced(mode, count, type, indices, primcount);
    }

    @Override public void glDrawElementsInstanced(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount) {
        org.lwjgl.opengl.GL31.glDrawElementsInstanced(mode, type, indices, primcount);
    }

    @Override public void glDrawElementsInstanced(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount) {
        org.lwjgl.opengl.GL31.glDrawElementsInstanced(mode, indices, primcount);
    }

    @Override public void glDrawElementsInstanced(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices, @NativeType("GLsizei") int primcount) {
        org.lwjgl.opengl.GL31.glDrawElementsInstanced(mode, indices, primcount);
    }

    @Override public void glDrawElementsInstanced(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices, @NativeType("GLsizei") int primcount) {
        org.lwjgl.opengl.GL31.glDrawElementsInstanced(mode, indices, primcount);
    }

    @Override public void glCopyBufferSubData(@NativeType("GLenum") int readTarget, @NativeType("GLenum") int writeTarget, @NativeType("GLintptr") long readOffset, @NativeType("GLintptr") long writeOffset, @NativeType("GLsizeiptr") long size) {
        org.lwjgl.opengl.GL31.glCopyBufferSubData(readTarget, writeTarget, readOffset, writeOffset, size);
    }

    @Override public void glPrimitiveRestartIndex(@NativeType("GLuint") int index) {
        org.lwjgl.opengl.GL31.glPrimitiveRestartIndex(index);
    }

    @Override public void glTexBuffer(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int buffer) {
        org.lwjgl.opengl.GL31.glTexBuffer(target, internalformat, buffer);
    }

    @Override public void nglGetUniformIndices(int program, int uniformCount, long uniformNames, long uniformIndices) {
        org.lwjgl.opengl.GL31.nglGetUniformIndices(program, uniformCount, uniformNames, uniformIndices);
    }

    @Override public void glGetUniformIndices(@NativeType("GLuint") int program, @NativeType("GLchar const * const *") PointerBuffer uniformNames, @NativeType("GLuint *") IntBuffer uniformIndices) {
        org.lwjgl.opengl.GL31.glGetUniformIndices(program, uniformNames, uniformIndices);
    }

    @Override public void glGetUniformIndices(@NativeType("GLuint") int program, @NativeType("GLchar const * const *") CharSequence[] uniformNames, @NativeType("GLuint *") IntBuffer uniformIndices) {
        org.lwjgl.opengl.GL31.glGetUniformIndices(program, uniformNames, uniformIndices);
    }

@NativeType("void")
    @Override public int glGetUniformIndices(@NativeType("GLuint") int program, @NativeType("GLchar const * const *") CharSequence uniformName) {
        return org.lwjgl.opengl.GL31.glGetUniformIndices(program, uniformName);
    }

    @Override public void glGetUniformIndices(@NativeType("GLuint") int program, @NativeType("GLchar const * const *") PointerBuffer uniformNames, @NativeType("GLuint *") int[] uniformIndices) {
        org.lwjgl.opengl.GL31.glGetUniformIndices(program, uniformNames, uniformIndices);
    }

    @Override public void nglGetActiveUniformsiv(int program, int uniformCount, long uniformIndices, int pname, long params) {
        org.lwjgl.opengl.GL31.nglGetActiveUniformsiv(program, uniformCount, uniformIndices, pname, params);
    }

    @Override public void glGetActiveUniformsiv(@NativeType("GLuint") int program, @NativeType("GLuint const *") IntBuffer uniformIndices, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengl.GL31.glGetActiveUniformsiv(program, uniformIndices, pname, params);
    }

    @Override public void glGetActiveUniformsiv(@NativeType("GLuint") int program, @NativeType("GLuint const *") int[] uniformIndices, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengl.GL31.glGetActiveUniformsiv(program, uniformIndices, pname, params);
    }

@NativeType("void")
    @Override public int glGetActiveUniformsi(@NativeType("GLuint") int program, @NativeType("GLuint const *") int uniformIndex, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL31.glGetActiveUniformsi(program, uniformIndex, pname);
    }

    @Override public void nglGetActiveUniformName(int program, int uniformIndex, int bufSize, long length, long uniformName) {
        org.lwjgl.opengl.GL31.nglGetActiveUniformName(program, uniformIndex, bufSize, length, uniformName);
    }

    @Override public void glGetActiveUniformName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformIndex, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLchar *") ByteBuffer uniformName) {
        org.lwjgl.opengl.GL31.glGetActiveUniformName(program, uniformIndex, length, uniformName);
    }

@NativeType("void")
    @Override public String glGetActiveUniformName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformIndex, @NativeType("GLsizei") int bufSize) {
        return org.lwjgl.opengl.GL31.glGetActiveUniformName(program, uniformIndex, bufSize);
    }

@NativeType("void")
    @Override public String glGetActiveUniformName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformIndex) {
        return org.lwjgl.opengl.GL31.glGetActiveUniformName(program, uniformIndex);
    }

    @Override public void glGetActiveUniformName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformIndex, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLchar *") ByteBuffer uniformName) {
        org.lwjgl.opengl.GL31.glGetActiveUniformName(program, uniformIndex, length, uniformName);
    }

    @Override public int nglGetUniformBlockIndex(int program, long uniformBlockName) {
        return org.lwjgl.opengl.GL31.nglGetUniformBlockIndex(program, uniformBlockName);
    }

@NativeType("GLuint")
    @Override public int glGetUniformBlockIndex(@NativeType("GLuint") int program, @NativeType("GLchar const *") ByteBuffer uniformBlockName) {
        return org.lwjgl.opengl.GL31.glGetUniformBlockIndex(program, uniformBlockName);
    }

@NativeType("GLuint")
    @Override public int glGetUniformBlockIndex(@NativeType("GLuint") int program, @NativeType("GLchar const *") CharSequence uniformBlockName) {
        return org.lwjgl.opengl.GL31.glGetUniformBlockIndex(program, uniformBlockName);
    }

    @Override public void nglGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, long params) {
        org.lwjgl.opengl.GL31.nglGetActiveUniformBlockiv(program, uniformBlockIndex, pname, params);
    }

    @Override public void glGetActiveUniformBlockiv(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengl.GL31.glGetActiveUniformBlockiv(program, uniformBlockIndex, pname, params);
    }

    @Override public void glGetActiveUniformBlockiv(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengl.GL31.glGetActiveUniformBlockiv(program, uniformBlockIndex, pname, params);
    }

@NativeType("void")
    @Override public int glGetActiveUniformBlocki(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL31.glGetActiveUniformBlocki(program, uniformBlockIndex, pname);
    }

    @Override public void nglGetActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize, long length, long uniformBlockName) {
        org.lwjgl.opengl.GL31.nglGetActiveUniformBlockName(program, uniformBlockIndex, bufSize, length, uniformBlockName);
    }

    @Override public void glGetActiveUniformBlockName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLchar *") ByteBuffer uniformBlockName) {
        org.lwjgl.opengl.GL31.glGetActiveUniformBlockName(program, uniformBlockIndex, length, uniformBlockName);
    }

@NativeType("void")
    @Override public String glGetActiveUniformBlockName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @NativeType("GLsizei") int bufSize) {
        return org.lwjgl.opengl.GL31.glGetActiveUniformBlockName(program, uniformBlockIndex, bufSize);
    }

@NativeType("void")
    @Override public String glGetActiveUniformBlockName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex) {
        return org.lwjgl.opengl.GL31.glGetActiveUniformBlockName(program, uniformBlockIndex);
    }

    @Override public void glGetActiveUniformBlockName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLchar *") ByteBuffer uniformBlockName) {
        org.lwjgl.opengl.GL31.glGetActiveUniformBlockName(program, uniformBlockIndex, length, uniformBlockName);
    }

    @Override public void glUniformBlockBinding(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @NativeType("GLuint") int uniformBlockBinding) {
        org.lwjgl.opengl.GL31.glUniformBlockBinding(program, uniformBlockIndex, uniformBlockBinding);
    }

}
