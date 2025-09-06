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

    @Override public void glMultiDrawArraysIndirectCount(int mode, ByteBuffer indirect, long drawcount, int maxdrawcount, int stride) {
        org.lwjgl.opengl.GL46.glMultiDrawArraysIndirectCount(mode, indirect, drawcount, maxdrawcount, stride);
    }

    @Override public void glMultiDrawArraysIndirectCount(int mode, long indirect, long drawcount, int maxdrawcount, int stride) {
        org.lwjgl.opengl.GL46.glMultiDrawArraysIndirectCount(mode, indirect, drawcount, maxdrawcount, stride);
    }

    @Override public void glMultiDrawArraysIndirectCount(int mode, IntBuffer indirect, long drawcount, int maxdrawcount, int stride) {
        org.lwjgl.opengl.GL46.glMultiDrawArraysIndirectCount(mode, indirect, drawcount, maxdrawcount, stride);
    }

    @Override public void glMultiDrawArraysIndirectCount(int mode, int[] indirect, long drawcount, int maxdrawcount, int stride) {
        org.lwjgl.opengl.GL46.glMultiDrawArraysIndirectCount(mode, indirect, drawcount, maxdrawcount, stride);
    }

    @Override public void nglMultiDrawElementsIndirectCount(int mode, int type, long indirect, long drawcount, int maxdrawcount, int stride) {
        org.lwjgl.opengl.GL46.nglMultiDrawElementsIndirectCount(mode, type, indirect, drawcount, maxdrawcount, stride);
    }

    @Override public void glMultiDrawElementsIndirectCount(int mode, int type, ByteBuffer indirect, long drawcount, int maxdrawcount, int stride) {
        org.lwjgl.opengl.GL46.glMultiDrawElementsIndirectCount(mode, type, indirect, drawcount, maxdrawcount, stride);
    }

    @Override public void glMultiDrawElementsIndirectCount(int mode, int type, long indirect, long drawcount, int maxdrawcount, int stride) {
        org.lwjgl.opengl.GL46.glMultiDrawElementsIndirectCount(mode, type, indirect, drawcount, maxdrawcount, stride);
    }

    @Override public void glMultiDrawElementsIndirectCount(int mode, int type, IntBuffer indirect, long drawcount, int maxdrawcount, int stride) {
        org.lwjgl.opengl.GL46.glMultiDrawElementsIndirectCount(mode, type, indirect, drawcount, maxdrawcount, stride);
    }

    @Override public void glMultiDrawElementsIndirectCount(int mode, int type, int[] indirect, long drawcount, int maxdrawcount, int stride) {
        org.lwjgl.opengl.GL46.glMultiDrawElementsIndirectCount(mode, type, indirect, drawcount, maxdrawcount, stride);
    }

    @Override public void glPolygonOffsetClamp(float factor, float units, float clamp) {
        org.lwjgl.opengl.GL46.glPolygonOffsetClamp(factor, units, clamp);
    }

    @Override public void nglSpecializeShader(int shader, long pEntryPoint, int numSpecializationConstants, long pConstantIndex, long pConstantValue) {
        org.lwjgl.opengl.GL46.nglSpecializeShader(shader, pEntryPoint, numSpecializationConstants, pConstantIndex, pConstantValue);
    }

    @Override public void glSpecializeShader(int shader, ByteBuffer pEntryPoint, @Nullable IntBuffer pConstantIndex, @Nullable IntBuffer pConstantValue) {
        org.lwjgl.opengl.GL46.glSpecializeShader(shader, pEntryPoint, pConstantIndex, pConstantValue);
    }

    @Override public void glSpecializeShader(int shader, CharSequence pEntryPoint, @Nullable IntBuffer pConstantIndex, @Nullable IntBuffer pConstantValue) {
        org.lwjgl.opengl.GL46.glSpecializeShader(shader, pEntryPoint, pConstantIndex, pConstantValue);
    }

    @Override public void glSpecializeShader(int shader, ByteBuffer pEntryPoint, @Nullable int[] pConstantIndex, @Nullable int[] pConstantValue) {
        org.lwjgl.opengl.GL46.glSpecializeShader(shader, pEntryPoint, pConstantIndex, pConstantValue);
    }

    @Override public void glSpecializeShader(int shader, CharSequence pEntryPoint, @Nullable int[] pConstantIndex, @Nullable int[] pConstantValue) {
        org.lwjgl.opengl.GL46.glSpecializeShader(shader, pEntryPoint, pConstantIndex, pConstantValue);
    }

}
