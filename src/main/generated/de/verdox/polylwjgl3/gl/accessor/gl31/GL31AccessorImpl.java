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

    @Override public void glDrawArraysInstanced(int mode, int first, int count, int primcount) {
        org.lwjgl.opengl.GL31.glDrawArraysInstanced(mode, first, count, primcount);
    }

    @Override public void nglDrawElementsInstanced(int mode, int count, int type, long indices, int primcount) {
        org.lwjgl.opengl.GL31.nglDrawElementsInstanced(mode, count, type, indices, primcount);
    }

    @Override public void glDrawElementsInstanced(int mode, int count, int type, long indices, int primcount) {
        org.lwjgl.opengl.GL31.glDrawElementsInstanced(mode, count, type, indices, primcount);
    }

    @Override public void glDrawElementsInstanced(int mode, int type, ByteBuffer indices, int primcount) {
        org.lwjgl.opengl.GL31.glDrawElementsInstanced(mode, type, indices, primcount);
    }

    @Override public void glDrawElementsInstanced(int mode, ByteBuffer indices, int primcount) {
        org.lwjgl.opengl.GL31.glDrawElementsInstanced(mode, indices, primcount);
    }

    @Override public void glDrawElementsInstanced(int mode, ShortBuffer indices, int primcount) {
        org.lwjgl.opengl.GL31.glDrawElementsInstanced(mode, indices, primcount);
    }

    @Override public void glDrawElementsInstanced(int mode, IntBuffer indices, int primcount) {
        org.lwjgl.opengl.GL31.glDrawElementsInstanced(mode, indices, primcount);
    }

    @Override public void glCopyBufferSubData(int readTarget, int writeTarget, long readOffset, long writeOffset, long size) {
        org.lwjgl.opengl.GL31.glCopyBufferSubData(readTarget, writeTarget, readOffset, writeOffset, size);
    }

    @Override public void glPrimitiveRestartIndex(int index) {
        org.lwjgl.opengl.GL31.glPrimitiveRestartIndex(index);
    }

    @Override public void glTexBuffer(int target, int internalformat, int buffer) {
        org.lwjgl.opengl.GL31.glTexBuffer(target, internalformat, buffer);
    }

    @Override public void nglGetUniformIndices(int program, int uniformCount, long uniformNames, long uniformIndices) {
        org.lwjgl.opengl.GL31.nglGetUniformIndices(program, uniformCount, uniformNames, uniformIndices);
    }

    @Override public void glGetUniformIndices(int program, PointerBuffer uniformNames, IntBuffer uniformIndices) {
        org.lwjgl.opengl.GL31.glGetUniformIndices(program, uniformNames, uniformIndices);
    }

    @Override public void glGetUniformIndices(int program, CharSequence[] uniformNames, IntBuffer uniformIndices) {
        org.lwjgl.opengl.GL31.glGetUniformIndices(program, uniformNames, uniformIndices);
    }

    @Override public int glGetUniformIndices(int program, CharSequence uniformName) {
        return org.lwjgl.opengl.GL31.glGetUniformIndices(program, uniformName);
    }

    @Override public void glGetUniformIndices(int program, PointerBuffer uniformNames, int[] uniformIndices) {
        org.lwjgl.opengl.GL31.glGetUniformIndices(program, uniformNames, uniformIndices);
    }

    @Override public void nglGetActiveUniformsiv(int program, int uniformCount, long uniformIndices, int pname, long params) {
        org.lwjgl.opengl.GL31.nglGetActiveUniformsiv(program, uniformCount, uniformIndices, pname, params);
    }

    @Override public void glGetActiveUniformsiv(int program, IntBuffer uniformIndices, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL31.glGetActiveUniformsiv(program, uniformIndices, pname, params);
    }

    @Override public void glGetActiveUniformsiv(int program, int[] uniformIndices, int pname, int[] params) {
        org.lwjgl.opengl.GL31.glGetActiveUniformsiv(program, uniformIndices, pname, params);
    }

    @Override public int glGetActiveUniformsi(int program, int uniformIndex, int pname) {
        return org.lwjgl.opengl.GL31.glGetActiveUniformsi(program, uniformIndex, pname);
    }

    @Override public void nglGetActiveUniformName(int program, int uniformIndex, int bufSize, long length, long uniformName) {
        org.lwjgl.opengl.GL31.nglGetActiveUniformName(program, uniformIndex, bufSize, length, uniformName);
    }

    @Override public void glGetActiveUniformName(int program, int uniformIndex, @Nullable IntBuffer length, ByteBuffer uniformName) {
        org.lwjgl.opengl.GL31.glGetActiveUniformName(program, uniformIndex, length, uniformName);
    }

    @Override public String glGetActiveUniformName(int program, int uniformIndex, int bufSize) {
        return org.lwjgl.opengl.GL31.glGetActiveUniformName(program, uniformIndex, bufSize);
    }

    @Override public String glGetActiveUniformName(int program, int uniformIndex) {
        return org.lwjgl.opengl.GL31.glGetActiveUniformName(program, uniformIndex);
    }

    @Override public void glGetActiveUniformName(int program, int uniformIndex, @Nullable int[] length, ByteBuffer uniformName) {
        org.lwjgl.opengl.GL31.glGetActiveUniformName(program, uniformIndex, length, uniformName);
    }

    @Override public int nglGetUniformBlockIndex(int program, long uniformBlockName) {
        return org.lwjgl.opengl.GL31.nglGetUniformBlockIndex(program, uniformBlockName);
    }

    @Override public int glGetUniformBlockIndex(int program, ByteBuffer uniformBlockName) {
        return org.lwjgl.opengl.GL31.glGetUniformBlockIndex(program, uniformBlockName);
    }

    @Override public int glGetUniformBlockIndex(int program, CharSequence uniformBlockName) {
        return org.lwjgl.opengl.GL31.glGetUniformBlockIndex(program, uniformBlockName);
    }

    @Override public void nglGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, long params) {
        org.lwjgl.opengl.GL31.nglGetActiveUniformBlockiv(program, uniformBlockIndex, pname, params);
    }

    @Override public void glGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL31.glGetActiveUniformBlockiv(program, uniformBlockIndex, pname, params);
    }

    @Override public void glGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, int[] params) {
        org.lwjgl.opengl.GL31.glGetActiveUniformBlockiv(program, uniformBlockIndex, pname, params);
    }

    @Override public int glGetActiveUniformBlocki(int program, int uniformBlockIndex, int pname) {
        return org.lwjgl.opengl.GL31.glGetActiveUniformBlocki(program, uniformBlockIndex, pname);
    }

    @Override public void nglGetActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize, long length, long uniformBlockName) {
        org.lwjgl.opengl.GL31.nglGetActiveUniformBlockName(program, uniformBlockIndex, bufSize, length, uniformBlockName);
    }

    @Override public void glGetActiveUniformBlockName(int program, int uniformBlockIndex, @Nullable IntBuffer length, ByteBuffer uniformBlockName) {
        org.lwjgl.opengl.GL31.glGetActiveUniformBlockName(program, uniformBlockIndex, length, uniformBlockName);
    }

    @Override public String glGetActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize) {
        return org.lwjgl.opengl.GL31.glGetActiveUniformBlockName(program, uniformBlockIndex, bufSize);
    }

    @Override public String glGetActiveUniformBlockName(int program, int uniformBlockIndex) {
        return org.lwjgl.opengl.GL31.glGetActiveUniformBlockName(program, uniformBlockIndex);
    }

    @Override public void glGetActiveUniformBlockName(int program, int uniformBlockIndex, @Nullable int[] length, ByteBuffer uniformBlockName) {
        org.lwjgl.opengl.GL31.glGetActiveUniformBlockName(program, uniformBlockIndex, length, uniformBlockName);
    }

    @Override public void glUniformBlockBinding(int program, int uniformBlockIndex, int uniformBlockBinding) {
        org.lwjgl.opengl.GL31.glUniformBlockBinding(program, uniformBlockIndex, uniformBlockBinding);
    }

}
