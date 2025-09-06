package de.verdox.polylwjgl3.gl.accessor.gl46;

import de.verdox.polylwjgl3.gl.accessor.gl45.GL45Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl45.GL45AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL46;
import org.lwjgl.system.*;

public class GL46AccessorImpl extends GL45AccessorImpl implements GL46Accessor {

    @Override public void nglMultiDrawArraysIndirectCount(int mode, long indirect, long drawcount, int maxdrawcount, int stride) {
        org.lwjgl.opengl.GL46.nglMultiDrawArraysIndirectCount(mode, indirect, drawcount, maxdrawcount, stride);
    }

    @Override public void glMultiDrawArraysIndirectCount(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        org.lwjgl.opengl.GL46.glMultiDrawArraysIndirectCount(mode, indirect, drawcount, maxdrawcount, stride);
    }

    @Override public void glMultiDrawArraysIndirectCount(@NativeType("GLenum") int mode, @NativeType("void const *") long indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        org.lwjgl.opengl.GL46.glMultiDrawArraysIndirectCount(mode, indirect, drawcount, maxdrawcount, stride);
    }

    @Override public void glMultiDrawArraysIndirectCount(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        org.lwjgl.opengl.GL46.glMultiDrawArraysIndirectCount(mode, indirect, drawcount, maxdrawcount, stride);
    }

    @Override public void glMultiDrawArraysIndirectCount(@NativeType("GLenum") int mode, @NativeType("void const *") int[] indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        org.lwjgl.opengl.GL46.glMultiDrawArraysIndirectCount(mode, indirect, drawcount, maxdrawcount, stride);
    }

    @Override public void nglMultiDrawElementsIndirectCount(int mode, int type, long indirect, long drawcount, int maxdrawcount, int stride) {
        org.lwjgl.opengl.GL46.nglMultiDrawElementsIndirectCount(mode, type, indirect, drawcount, maxdrawcount, stride);
    }

    @Override public void glMultiDrawElementsIndirectCount(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        org.lwjgl.opengl.GL46.glMultiDrawElementsIndirectCount(mode, type, indirect, drawcount, maxdrawcount, stride);
    }

    @Override public void glMultiDrawElementsIndirectCount(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") long indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        org.lwjgl.opengl.GL46.glMultiDrawElementsIndirectCount(mode, type, indirect, drawcount, maxdrawcount, stride);
    }

    @Override public void glMultiDrawElementsIndirectCount(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        org.lwjgl.opengl.GL46.glMultiDrawElementsIndirectCount(mode, type, indirect, drawcount, maxdrawcount, stride);
    }

    @Override public void glMultiDrawElementsIndirectCount(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") int[] indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        org.lwjgl.opengl.GL46.glMultiDrawElementsIndirectCount(mode, type, indirect, drawcount, maxdrawcount, stride);
    }

    @Override public void glPolygonOffsetClamp(@NativeType("GLfloat") float factor, @NativeType("GLfloat") float units, @NativeType("GLfloat") float clamp) {
        org.lwjgl.opengl.GL46.glPolygonOffsetClamp(factor, units, clamp);
    }

    @Override public void nglSpecializeShader(int shader, long pEntryPoint, int numSpecializationConstants, long pConstantIndex, long pConstantValue) {
        org.lwjgl.opengl.GL46.nglSpecializeShader(shader, pEntryPoint, numSpecializationConstants, pConstantIndex, pConstantValue);
    }

    @Override public void glSpecializeShader(@NativeType("GLuint") int shader, @NativeType("GLchar const *") ByteBuffer pEntryPoint, @Nullable @NativeType("GLuint const *") IntBuffer pConstantIndex, @Nullable @NativeType("GLuint const *") IntBuffer pConstantValue) {
        org.lwjgl.opengl.GL46.glSpecializeShader(shader, pEntryPoint, pConstantIndex, pConstantValue);
    }

    @Override public void glSpecializeShader(@NativeType("GLuint") int shader, @NativeType("GLchar const *") CharSequence pEntryPoint, @Nullable @NativeType("GLuint const *") IntBuffer pConstantIndex, @Nullable @NativeType("GLuint const *") IntBuffer pConstantValue) {
        org.lwjgl.opengl.GL46.glSpecializeShader(shader, pEntryPoint, pConstantIndex, pConstantValue);
    }

    @Override public void glSpecializeShader(@NativeType("GLuint") int shader, @NativeType("GLchar const *") ByteBuffer pEntryPoint, @Nullable @NativeType("GLuint const *") int[] pConstantIndex, @Nullable @NativeType("GLuint const *") int[] pConstantValue) {
        org.lwjgl.opengl.GL46.glSpecializeShader(shader, pEntryPoint, pConstantIndex, pConstantValue);
    }

    @Override public void glSpecializeShader(@NativeType("GLuint") int shader, @NativeType("GLchar const *") CharSequence pEntryPoint, @Nullable @NativeType("GLuint const *") int[] pConstantIndex, @Nullable @NativeType("GLuint const *") int[] pConstantValue) {
        org.lwjgl.opengl.GL46.glSpecializeShader(shader, pEntryPoint, pConstantIndex, pConstantValue);
    }

}
