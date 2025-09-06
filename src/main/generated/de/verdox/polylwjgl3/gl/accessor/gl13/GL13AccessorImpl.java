package de.verdox.polylwjgl3.gl.accessor.gl13;

import de.verdox.polylwjgl3.gl.accessor.gl12.GL12Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl12.GL12AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL13;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryUtil.*;

public class GL13AccessorImpl extends GL12AccessorImpl implements GL13Accessor {

    @Override public void nglCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data) {
        org.lwjgl.opengl.GL13.nglCompressedTexImage3D(target, level, internalformat, width, height, depth, border, imageSize, data);
    }

    @Override public void glCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data) {
        org.lwjgl.opengl.GL13.glCompressedTexImage3D(target, level, internalformat, width, height, depth, border, imageSize, data);
    }

    @Override public void glCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, @Nullable ByteBuffer data) {
        org.lwjgl.opengl.GL13.glCompressedTexImage3D(target, level, internalformat, width, height, depth, border, data);
    }

    @Override public void nglCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, long data) {
        org.lwjgl.opengl.GL13.nglCompressedTexImage2D(target, level, internalformat, width, height, border, imageSize, data);
    }

    @Override public void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, long data) {
        org.lwjgl.opengl.GL13.glCompressedTexImage2D(target, level, internalformat, width, height, border, imageSize, data);
    }

    @Override public void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, @Nullable ByteBuffer data) {
        org.lwjgl.opengl.GL13.glCompressedTexImage2D(target, level, internalformat, width, height, border, data);
    }

    @Override public void nglCompressedTexImage1D(int target, int level, int internalformat, int width, int border, int imageSize, long data) {
        org.lwjgl.opengl.GL13.nglCompressedTexImage1D(target, level, internalformat, width, border, imageSize, data);
    }

    @Override public void glCompressedTexImage1D(int target, int level, int internalformat, int width, int border, int imageSize, long data) {
        org.lwjgl.opengl.GL13.glCompressedTexImage1D(target, level, internalformat, width, border, imageSize, data);
    }

    @Override public void glCompressedTexImage1D(int target, int level, int internalformat, int width, int border, @Nullable ByteBuffer data) {
        org.lwjgl.opengl.GL13.glCompressedTexImage1D(target, level, internalformat, width, border, data);
    }

    @Override public void nglCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data) {
        org.lwjgl.opengl.GL13.nglCompressedTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
    }

    @Override public void glCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data) {
        org.lwjgl.opengl.GL13.glCompressedTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
    }

    @Override public void glCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, ByteBuffer data) {
        org.lwjgl.opengl.GL13.glCompressedTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, data);
    }

    @Override public void nglCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data) {
        org.lwjgl.opengl.GL13.nglCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, imageSize, data);
    }

    @Override public void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data) {
        org.lwjgl.opengl.GL13.glCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, imageSize, data);
    }

    @Override public void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, ByteBuffer data) {
        org.lwjgl.opengl.GL13.glCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, data);
    }

    @Override public void nglCompressedTexSubImage1D(int target, int level, int xoffset, int width, int format, int imageSize, long data) {
        org.lwjgl.opengl.GL13.nglCompressedTexSubImage1D(target, level, xoffset, width, format, imageSize, data);
    }

    @Override public void glCompressedTexSubImage1D(int target, int level, int xoffset, int width, int format, int imageSize, long data) {
        org.lwjgl.opengl.GL13.glCompressedTexSubImage1D(target, level, xoffset, width, format, imageSize, data);
    }

    @Override public void glCompressedTexSubImage1D(int target, int level, int xoffset, int width, int format, ByteBuffer data) {
        org.lwjgl.opengl.GL13.glCompressedTexSubImage1D(target, level, xoffset, width, format, data);
    }

    @Override public void nglGetCompressedTexImage(int target, int level, long pixels) {
        org.lwjgl.opengl.GL13.nglGetCompressedTexImage(target, level, pixels);
    }

    @Override public void glGetCompressedTexImage(int target, int level, ByteBuffer pixels) {
        org.lwjgl.opengl.GL13.glGetCompressedTexImage(target, level, pixels);
    }

    @Override public void glGetCompressedTexImage(int target, int level, long pixels) {
        org.lwjgl.opengl.GL13.glGetCompressedTexImage(target, level, pixels);
    }

    @Override public void glSampleCoverage(float value, boolean invert) {
        org.lwjgl.opengl.GL13.glSampleCoverage(value, invert);
    }

    @Override public void glActiveTexture(int texture) {
        org.lwjgl.opengl.GL13.glActiveTexture(texture);
    }

    @Override public void glClientActiveTexture(int texture) {
        org.lwjgl.opengl.GL13.glClientActiveTexture(texture);
    }

    @Override public void glMultiTexCoord1f(int texture, float s) {
        org.lwjgl.opengl.GL13.glMultiTexCoord1f(texture, s);
    }

    @Override public void glMultiTexCoord1s(int texture, short s) {
        org.lwjgl.opengl.GL13.glMultiTexCoord1s(texture, s);
    }

    @Override public void glMultiTexCoord1i(int texture, int s) {
        org.lwjgl.opengl.GL13.glMultiTexCoord1i(texture, s);
    }

    @Override public void glMultiTexCoord1d(int texture, double s) {
        org.lwjgl.opengl.GL13.glMultiTexCoord1d(texture, s);
    }

    @Override public void nglMultiTexCoord1fv(int texture, long v) {
        org.lwjgl.opengl.GL13.nglMultiTexCoord1fv(texture, v);
    }

    @Override public void glMultiTexCoord1fv(int texture, FloatBuffer v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord1fv(texture, v);
    }

    @Override public void glMultiTexCoord1fv(int texture, float[] v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord1fv(texture, v);
    }

    @Override public void nglMultiTexCoord1sv(int texture, long v) {
        org.lwjgl.opengl.GL13.nglMultiTexCoord1sv(texture, v);
    }

    @Override public void glMultiTexCoord1sv(int texture, ShortBuffer v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord1sv(texture, v);
    }

    @Override public void glMultiTexCoord1sv(int texture, short[] v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord1sv(texture, v);
    }

    @Override public void nglMultiTexCoord1iv(int texture, long v) {
        org.lwjgl.opengl.GL13.nglMultiTexCoord1iv(texture, v);
    }

    @Override public void glMultiTexCoord1iv(int texture, IntBuffer v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord1iv(texture, v);
    }

    @Override public void glMultiTexCoord1iv(int texture, int[] v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord1iv(texture, v);
    }

    @Override public void nglMultiTexCoord1dv(int texture, long v) {
        org.lwjgl.opengl.GL13.nglMultiTexCoord1dv(texture, v);
    }

    @Override public void glMultiTexCoord1dv(int texture, DoubleBuffer v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord1dv(texture, v);
    }

    @Override public void glMultiTexCoord1dv(int texture, double[] v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord1dv(texture, v);
    }

    @Override public void glMultiTexCoord2f(int texture, float s, float t) {
        org.lwjgl.opengl.GL13.glMultiTexCoord2f(texture, s, t);
    }

    @Override public void glMultiTexCoord2s(int texture, short s, short t) {
        org.lwjgl.opengl.GL13.glMultiTexCoord2s(texture, s, t);
    }

    @Override public void glMultiTexCoord2i(int texture, int s, int t) {
        org.lwjgl.opengl.GL13.glMultiTexCoord2i(texture, s, t);
    }

    @Override public void glMultiTexCoord2d(int texture, double s, double t) {
        org.lwjgl.opengl.GL13.glMultiTexCoord2d(texture, s, t);
    }

    @Override public void nglMultiTexCoord2fv(int texture, long v) {
        org.lwjgl.opengl.GL13.nglMultiTexCoord2fv(texture, v);
    }

    @Override public void glMultiTexCoord2fv(int texture, FloatBuffer v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord2fv(texture, v);
    }

    @Override public void glMultiTexCoord2fv(int texture, float[] v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord2fv(texture, v);
    }

    @Override public void nglMultiTexCoord2sv(int texture, long v) {
        org.lwjgl.opengl.GL13.nglMultiTexCoord2sv(texture, v);
    }

    @Override public void glMultiTexCoord2sv(int texture, ShortBuffer v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord2sv(texture, v);
    }

    @Override public void glMultiTexCoord2sv(int texture, short[] v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord2sv(texture, v);
    }

    @Override public void nglMultiTexCoord2iv(int texture, long v) {
        org.lwjgl.opengl.GL13.nglMultiTexCoord2iv(texture, v);
    }

    @Override public void glMultiTexCoord2iv(int texture, IntBuffer v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord2iv(texture, v);
    }

    @Override public void glMultiTexCoord2iv(int texture, int[] v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord2iv(texture, v);
    }

    @Override public void nglMultiTexCoord2dv(int texture, long v) {
        org.lwjgl.opengl.GL13.nglMultiTexCoord2dv(texture, v);
    }

    @Override public void glMultiTexCoord2dv(int texture, DoubleBuffer v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord2dv(texture, v);
    }

    @Override public void glMultiTexCoord2dv(int texture, double[] v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord2dv(texture, v);
    }

    @Override public void glMultiTexCoord3f(int texture, float s, float t, float r) {
        org.lwjgl.opengl.GL13.glMultiTexCoord3f(texture, s, t, r);
    }

    @Override public void glMultiTexCoord3s(int texture, short s, short t, short r) {
        org.lwjgl.opengl.GL13.glMultiTexCoord3s(texture, s, t, r);
    }

    @Override public void glMultiTexCoord3i(int texture, int s, int t, int r) {
        org.lwjgl.opengl.GL13.glMultiTexCoord3i(texture, s, t, r);
    }

    @Override public void glMultiTexCoord3d(int texture, double s, double t, double r) {
        org.lwjgl.opengl.GL13.glMultiTexCoord3d(texture, s, t, r);
    }

    @Override public void nglMultiTexCoord3fv(int texture, long v) {
        org.lwjgl.opengl.GL13.nglMultiTexCoord3fv(texture, v);
    }

    @Override public void glMultiTexCoord3fv(int texture, FloatBuffer v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord3fv(texture, v);
    }

    @Override public void glMultiTexCoord3fv(int texture, float[] v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord3fv(texture, v);
    }

    @Override public void nglMultiTexCoord3sv(int texture, long v) {
        org.lwjgl.opengl.GL13.nglMultiTexCoord3sv(texture, v);
    }

    @Override public void glMultiTexCoord3sv(int texture, ShortBuffer v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord3sv(texture, v);
    }

    @Override public void glMultiTexCoord3sv(int texture, short[] v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord3sv(texture, v);
    }

    @Override public void nglMultiTexCoord3iv(int texture, long v) {
        org.lwjgl.opengl.GL13.nglMultiTexCoord3iv(texture, v);
    }

    @Override public void glMultiTexCoord3iv(int texture, IntBuffer v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord3iv(texture, v);
    }

    @Override public void glMultiTexCoord3iv(int texture, int[] v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord3iv(texture, v);
    }

    @Override public void nglMultiTexCoord3dv(int texture, long v) {
        org.lwjgl.opengl.GL13.nglMultiTexCoord3dv(texture, v);
    }

    @Override public void glMultiTexCoord3dv(int texture, DoubleBuffer v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord3dv(texture, v);
    }

    @Override public void glMultiTexCoord3dv(int texture, double[] v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord3dv(texture, v);
    }

    @Override public void glMultiTexCoord4f(int texture, float s, float t, float r, float q) {
        org.lwjgl.opengl.GL13.glMultiTexCoord4f(texture, s, t, r, q);
    }

    @Override public void glMultiTexCoord4s(int texture, short s, short t, short r, short q) {
        org.lwjgl.opengl.GL13.glMultiTexCoord4s(texture, s, t, r, q);
    }

    @Override public void glMultiTexCoord4i(int texture, int s, int t, int r, int q) {
        org.lwjgl.opengl.GL13.glMultiTexCoord4i(texture, s, t, r, q);
    }

    @Override public void glMultiTexCoord4d(int texture, double s, double t, double r, double q) {
        org.lwjgl.opengl.GL13.glMultiTexCoord4d(texture, s, t, r, q);
    }

    @Override public void nglMultiTexCoord4fv(int texture, long v) {
        org.lwjgl.opengl.GL13.nglMultiTexCoord4fv(texture, v);
    }

    @Override public void glMultiTexCoord4fv(int texture, FloatBuffer v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord4fv(texture, v);
    }

    @Override public void glMultiTexCoord4fv(int texture, float[] v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord4fv(texture, v);
    }

    @Override public void nglMultiTexCoord4sv(int texture, long v) {
        org.lwjgl.opengl.GL13.nglMultiTexCoord4sv(texture, v);
    }

    @Override public void glMultiTexCoord4sv(int texture, ShortBuffer v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord4sv(texture, v);
    }

    @Override public void glMultiTexCoord4sv(int texture, short[] v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord4sv(texture, v);
    }

    @Override public void nglMultiTexCoord4iv(int texture, long v) {
        org.lwjgl.opengl.GL13.nglMultiTexCoord4iv(texture, v);
    }

    @Override public void glMultiTexCoord4iv(int texture, IntBuffer v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord4iv(texture, v);
    }

    @Override public void glMultiTexCoord4iv(int texture, int[] v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord4iv(texture, v);
    }

    @Override public void nglMultiTexCoord4dv(int texture, long v) {
        org.lwjgl.opengl.GL13.nglMultiTexCoord4dv(texture, v);
    }

    @Override public void glMultiTexCoord4dv(int texture, DoubleBuffer v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord4dv(texture, v);
    }

    @Override public void glMultiTexCoord4dv(int texture, double[] v) {
        org.lwjgl.opengl.GL13.glMultiTexCoord4dv(texture, v);
    }

    @Override public void nglLoadTransposeMatrixf(long m) {
        org.lwjgl.opengl.GL13.nglLoadTransposeMatrixf(m);
    }

    @Override public void glLoadTransposeMatrixf(FloatBuffer m) {
        org.lwjgl.opengl.GL13.glLoadTransposeMatrixf(m);
    }

    @Override public void glLoadTransposeMatrixf(float[] m) {
        org.lwjgl.opengl.GL13.glLoadTransposeMatrixf(m);
    }

    @Override public void nglLoadTransposeMatrixd(long m) {
        org.lwjgl.opengl.GL13.nglLoadTransposeMatrixd(m);
    }

    @Override public void glLoadTransposeMatrixd(DoubleBuffer m) {
        org.lwjgl.opengl.GL13.glLoadTransposeMatrixd(m);
    }

    @Override public void glLoadTransposeMatrixd(double[] m) {
        org.lwjgl.opengl.GL13.glLoadTransposeMatrixd(m);
    }

    @Override public void nglMultTransposeMatrixf(long m) {
        org.lwjgl.opengl.GL13.nglMultTransposeMatrixf(m);
    }

    @Override public void glMultTransposeMatrixf(FloatBuffer m) {
        org.lwjgl.opengl.GL13.glMultTransposeMatrixf(m);
    }

    @Override public void glMultTransposeMatrixf(float[] m) {
        org.lwjgl.opengl.GL13.glMultTransposeMatrixf(m);
    }

    @Override public void nglMultTransposeMatrixd(long m) {
        org.lwjgl.opengl.GL13.nglMultTransposeMatrixd(m);
    }

    @Override public void glMultTransposeMatrixd(DoubleBuffer m) {
        org.lwjgl.opengl.GL13.glMultTransposeMatrixd(m);
    }

    @Override public void glMultTransposeMatrixd(double[] m) {
        org.lwjgl.opengl.GL13.glMultTransposeMatrixd(m);
    }

}
