package de.verdox.polylwjgl3.gl.accessor.gl12;

import de.verdox.polylwjgl3.gl.accessor.gl11.GL11Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl11.GL11AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL12;
import org.lwjgl.system.*;

public class GL12AccessorImpl extends GL11AccessorImpl implements GL12Accessor {

    @Override public void nglTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixels) {
        org.lwjgl.opengl.GL12.nglTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    @Override public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, @Nullable ByteBuffer pixels) {
        org.lwjgl.opengl.GL12.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    @Override public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixels) {
        org.lwjgl.opengl.GL12.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    @Override public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, @Nullable ShortBuffer pixels) {
        org.lwjgl.opengl.GL12.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    @Override public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, @Nullable IntBuffer pixels) {
        org.lwjgl.opengl.GL12.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    @Override public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, @Nullable FloatBuffer pixels) {
        org.lwjgl.opengl.GL12.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    @Override public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, @Nullable DoubleBuffer pixels) {
        org.lwjgl.opengl.GL12.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    @Override public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, @Nullable short[] pixels) {
        org.lwjgl.opengl.GL12.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    @Override public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, @Nullable int[] pixels) {
        org.lwjgl.opengl.GL12.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    @Override public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, @Nullable float[] pixels) {
        org.lwjgl.opengl.GL12.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    @Override public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, @Nullable double[] pixels) {
        org.lwjgl.opengl.GL12.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    @Override public void nglTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels) {
        org.lwjgl.opengl.GL12.nglTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ByteBuffer pixels) {
        org.lwjgl.opengl.GL12.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels) {
        org.lwjgl.opengl.GL12.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ShortBuffer pixels) {
        org.lwjgl.opengl.GL12.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, IntBuffer pixels) {
        org.lwjgl.opengl.GL12.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, FloatBuffer pixels) {
        org.lwjgl.opengl.GL12.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, DoubleBuffer pixels) {
        org.lwjgl.opengl.GL12.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, short[] pixels) {
        org.lwjgl.opengl.GL12.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int[] pixels) {
        org.lwjgl.opengl.GL12.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, float[] pixels) {
        org.lwjgl.opengl.GL12.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, double[] pixels) {
        org.lwjgl.opengl.GL12.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    @Override public void glCopyTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height) {
        org.lwjgl.opengl.GL12.glCopyTexSubImage3D(target, level, xoffset, yoffset, zoffset, x, y, width, height);
    }

    @Override public void nglDrawRangeElements(int mode, int start, int end, int count, int type, long indices) {
        org.lwjgl.opengl.GL12.nglDrawRangeElements(mode, start, end, count, type, indices);
    }

    @Override public void glDrawRangeElements(int mode, int start, int end, int count, int type, long indices) {
        org.lwjgl.opengl.GL12.glDrawRangeElements(mode, start, end, count, type, indices);
    }

    @Override public void glDrawRangeElements(int mode, int start, int end, int type, ByteBuffer indices) {
        org.lwjgl.opengl.GL12.glDrawRangeElements(mode, start, end, type, indices);
    }

    @Override public void glDrawRangeElements(int mode, int start, int end, ByteBuffer indices) {
        org.lwjgl.opengl.GL12.glDrawRangeElements(mode, start, end, indices);
    }

    @Override public void glDrawRangeElements(int mode, int start, int end, ShortBuffer indices) {
        org.lwjgl.opengl.GL12.glDrawRangeElements(mode, start, end, indices);
    }

    @Override public void glDrawRangeElements(int mode, int start, int end, IntBuffer indices) {
        org.lwjgl.opengl.GL12.glDrawRangeElements(mode, start, end, indices);
    }

}
