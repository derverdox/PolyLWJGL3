package de.verdox.polylwjgl3.gl.accessor.gl14;

import de.verdox.polylwjgl3.gl.accessor.gl13.GL13Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl13.GL13AccessorImpl;
import java.nio.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL14;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryUtil.*;

public class GL14AccessorImpl extends GL13AccessorImpl implements GL14Accessor {

    @Override public void glBlendColor(float red, float green, float blue, float alpha) {
        org.lwjgl.opengl.GL14.glBlendColor(red, green, blue, alpha);
    }

    @Override public void glBlendEquation(int mode) {
        org.lwjgl.opengl.GL14.glBlendEquation(mode);
    }

    @Override public void glFogCoordf(float coord) {
        org.lwjgl.opengl.GL14.glFogCoordf(coord);
    }

    @Override public void glFogCoordd(double coord) {
        org.lwjgl.opengl.GL14.glFogCoordd(coord);
    }

    @Override public void nglFogCoordfv(long coord) {
        org.lwjgl.opengl.GL14.nglFogCoordfv(coord);
    }

    @Override public void glFogCoordfv(FloatBuffer coord) {
        org.lwjgl.opengl.GL14.glFogCoordfv(coord);
    }

    @Override public void glFogCoordfv(float[] coord) {
        org.lwjgl.opengl.GL14.glFogCoordfv(coord);
    }

    @Override public void nglFogCoorddv(long coord) {
        org.lwjgl.opengl.GL14.nglFogCoorddv(coord);
    }

    @Override public void glFogCoorddv(DoubleBuffer coord) {
        org.lwjgl.opengl.GL14.glFogCoorddv(coord);
    }

    @Override public void glFogCoorddv(double[] coord) {
        org.lwjgl.opengl.GL14.glFogCoorddv(coord);
    }

    @Override public void nglFogCoordPointer(int type, int stride, long pointer) {
        org.lwjgl.opengl.GL14.nglFogCoordPointer(type, stride, pointer);
    }

    @Override public void glFogCoordPointer(int type, int stride, ByteBuffer pointer) {
        org.lwjgl.opengl.GL14.glFogCoordPointer(type, stride, pointer);
    }

    @Override public void glFogCoordPointer(int type, int stride, long pointer) {
        org.lwjgl.opengl.GL14.glFogCoordPointer(type, stride, pointer);
    }

    @Override public void glFogCoordPointer(int type, int stride, ShortBuffer pointer) {
        org.lwjgl.opengl.GL14.glFogCoordPointer(type, stride, pointer);
    }

    @Override public void glFogCoordPointer(int type, int stride, FloatBuffer pointer) {
        org.lwjgl.opengl.GL14.glFogCoordPointer(type, stride, pointer);
    }

    @Override public void nglMultiDrawArrays(int mode, long first, long count, int drawcount) {
        org.lwjgl.opengl.GL14.nglMultiDrawArrays(mode, first, count, drawcount);
    }

    @Override public void glMultiDrawArrays(int mode, IntBuffer first, IntBuffer count) {
        org.lwjgl.opengl.GL14.glMultiDrawArrays(mode, first, count);
    }

    @Override public void glMultiDrawArrays(int mode, int[] first, int[] count) {
        org.lwjgl.opengl.GL14.glMultiDrawArrays(mode, first, count);
    }

    @Override public void nglMultiDrawElements(int mode, long count, int type, long indices, int drawcount) {
        org.lwjgl.opengl.GL14.nglMultiDrawElements(mode, count, type, indices, drawcount);
    }

    @Override public void glMultiDrawElements(int mode, IntBuffer count, int type, PointerBuffer indices) {
        org.lwjgl.opengl.GL14.glMultiDrawElements(mode, count, type, indices);
    }

    @Override public void glMultiDrawElements(int mode, int[] count, int type, PointerBuffer indices) {
        org.lwjgl.opengl.GL14.glMultiDrawElements(mode, count, type, indices);
    }

    @Override public void glPointParameterf(int pname, float param) {
        org.lwjgl.opengl.GL14.glPointParameterf(pname, param);
    }

    @Override public void glPointParameteri(int pname, int param) {
        org.lwjgl.opengl.GL14.glPointParameteri(pname, param);
    }

    @Override public void nglPointParameterfv(int pname, long params) {
        org.lwjgl.opengl.GL14.nglPointParameterfv(pname, params);
    }

    @Override public void glPointParameterfv(int pname, FloatBuffer params) {
        org.lwjgl.opengl.GL14.glPointParameterfv(pname, params);
    }

    @Override public void glPointParameterfv(int pname, float[] params) {
        org.lwjgl.opengl.GL14.glPointParameterfv(pname, params);
    }

    @Override public void nglPointParameteriv(int pname, long params) {
        org.lwjgl.opengl.GL14.nglPointParameteriv(pname, params);
    }

    @Override public void glPointParameteriv(int pname, IntBuffer params) {
        org.lwjgl.opengl.GL14.glPointParameteriv(pname, params);
    }

    @Override public void glPointParameteriv(int pname, int[] params) {
        org.lwjgl.opengl.GL14.glPointParameteriv(pname, params);
    }

    @Override public void glSecondaryColor3b(byte red, byte green, byte blue) {
        org.lwjgl.opengl.GL14.glSecondaryColor3b(red, green, blue);
    }

    @Override public void glSecondaryColor3s(short red, short green, short blue) {
        org.lwjgl.opengl.GL14.glSecondaryColor3s(red, green, blue);
    }

    @Override public void glSecondaryColor3i(int red, int green, int blue) {
        org.lwjgl.opengl.GL14.glSecondaryColor3i(red, green, blue);
    }

    @Override public void glSecondaryColor3f(float red, float green, float blue) {
        org.lwjgl.opengl.GL14.glSecondaryColor3f(red, green, blue);
    }

    @Override public void glSecondaryColor3d(double red, double green, double blue) {
        org.lwjgl.opengl.GL14.glSecondaryColor3d(red, green, blue);
    }

    @Override public void glSecondaryColor3ub(byte red, byte green, byte blue) {
        org.lwjgl.opengl.GL14.glSecondaryColor3ub(red, green, blue);
    }

    @Override public void glSecondaryColor3us(short red, short green, short blue) {
        org.lwjgl.opengl.GL14.glSecondaryColor3us(red, green, blue);
    }

    @Override public void glSecondaryColor3ui(int red, int green, int blue) {
        org.lwjgl.opengl.GL14.glSecondaryColor3ui(red, green, blue);
    }

    @Override public void nglSecondaryColor3bv(long v) {
        org.lwjgl.opengl.GL14.nglSecondaryColor3bv(v);
    }

    @Override public void glSecondaryColor3bv(ByteBuffer v) {
        org.lwjgl.opengl.GL14.glSecondaryColor3bv(v);
    }

    @Override public void nglSecondaryColor3sv(long v) {
        org.lwjgl.opengl.GL14.nglSecondaryColor3sv(v);
    }

    @Override public void glSecondaryColor3sv(ShortBuffer v) {
        org.lwjgl.opengl.GL14.glSecondaryColor3sv(v);
    }

    @Override public void glSecondaryColor3sv(short[] v) {
        org.lwjgl.opengl.GL14.glSecondaryColor3sv(v);
    }

    @Override public void nglSecondaryColor3iv(long v) {
        org.lwjgl.opengl.GL14.nglSecondaryColor3iv(v);
    }

    @Override public void glSecondaryColor3iv(IntBuffer v) {
        org.lwjgl.opengl.GL14.glSecondaryColor3iv(v);
    }

    @Override public void glSecondaryColor3iv(int[] v) {
        org.lwjgl.opengl.GL14.glSecondaryColor3iv(v);
    }

    @Override public void nglSecondaryColor3fv(long v) {
        org.lwjgl.opengl.GL14.nglSecondaryColor3fv(v);
    }

    @Override public void glSecondaryColor3fv(FloatBuffer v) {
        org.lwjgl.opengl.GL14.glSecondaryColor3fv(v);
    }

    @Override public void glSecondaryColor3fv(float[] v) {
        org.lwjgl.opengl.GL14.glSecondaryColor3fv(v);
    }

    @Override public void nglSecondaryColor3dv(long v) {
        org.lwjgl.opengl.GL14.nglSecondaryColor3dv(v);
    }

    @Override public void glSecondaryColor3dv(DoubleBuffer v) {
        org.lwjgl.opengl.GL14.glSecondaryColor3dv(v);
    }

    @Override public void glSecondaryColor3dv(double[] v) {
        org.lwjgl.opengl.GL14.glSecondaryColor3dv(v);
    }

    @Override public void nglSecondaryColor3ubv(long v) {
        org.lwjgl.opengl.GL14.nglSecondaryColor3ubv(v);
    }

    @Override public void glSecondaryColor3ubv(ByteBuffer v) {
        org.lwjgl.opengl.GL14.glSecondaryColor3ubv(v);
    }

    @Override public void nglSecondaryColor3usv(long v) {
        org.lwjgl.opengl.GL14.nglSecondaryColor3usv(v);
    }

    @Override public void glSecondaryColor3usv(ShortBuffer v) {
        org.lwjgl.opengl.GL14.glSecondaryColor3usv(v);
    }

    @Override public void glSecondaryColor3usv(short[] v) {
        org.lwjgl.opengl.GL14.glSecondaryColor3usv(v);
    }

    @Override public void nglSecondaryColor3uiv(long v) {
        org.lwjgl.opengl.GL14.nglSecondaryColor3uiv(v);
    }

    @Override public void glSecondaryColor3uiv(IntBuffer v) {
        org.lwjgl.opengl.GL14.glSecondaryColor3uiv(v);
    }

    @Override public void glSecondaryColor3uiv(int[] v) {
        org.lwjgl.opengl.GL14.glSecondaryColor3uiv(v);
    }

    @Override public void nglSecondaryColorPointer(int size, int type, int stride, long pointer) {
        org.lwjgl.opengl.GL14.nglSecondaryColorPointer(size, type, stride, pointer);
    }

    @Override public void glSecondaryColorPointer(int size, int type, int stride, ByteBuffer pointer) {
        org.lwjgl.opengl.GL14.glSecondaryColorPointer(size, type, stride, pointer);
    }

    @Override public void glSecondaryColorPointer(int size, int type, int stride, long pointer) {
        org.lwjgl.opengl.GL14.glSecondaryColorPointer(size, type, stride, pointer);
    }

    @Override public void glSecondaryColorPointer(int size, int type, int stride, ShortBuffer pointer) {
        org.lwjgl.opengl.GL14.glSecondaryColorPointer(size, type, stride, pointer);
    }

    @Override public void glSecondaryColorPointer(int size, int type, int stride, IntBuffer pointer) {
        org.lwjgl.opengl.GL14.glSecondaryColorPointer(size, type, stride, pointer);
    }

    @Override public void glSecondaryColorPointer(int size, int type, int stride, FloatBuffer pointer) {
        org.lwjgl.opengl.GL14.glSecondaryColorPointer(size, type, stride, pointer);
    }

    @Override public void glBlendFuncSeparate(int sfactorRGB, int dfactorRGB, int sfactorAlpha, int dfactorAlpha) {
        org.lwjgl.opengl.GL14.glBlendFuncSeparate(sfactorRGB, dfactorRGB, sfactorAlpha, dfactorAlpha);
    }

    @Override public void glWindowPos2i(int x, int y) {
        org.lwjgl.opengl.GL14.glWindowPos2i(x, y);
    }

    @Override public void glWindowPos2s(short x, short y) {
        org.lwjgl.opengl.GL14.glWindowPos2s(x, y);
    }

    @Override public void glWindowPos2f(float x, float y) {
        org.lwjgl.opengl.GL14.glWindowPos2f(x, y);
    }

    @Override public void glWindowPos2d(double x, double y) {
        org.lwjgl.opengl.GL14.glWindowPos2d(x, y);
    }

    @Override public void nglWindowPos2iv(long p) {
        org.lwjgl.opengl.GL14.nglWindowPos2iv(p);
    }

    @Override public void glWindowPos2iv(IntBuffer p) {
        org.lwjgl.opengl.GL14.glWindowPos2iv(p);
    }

    @Override public void glWindowPos2iv(int[] p) {
        org.lwjgl.opengl.GL14.glWindowPos2iv(p);
    }

    @Override public void nglWindowPos2sv(long p) {
        org.lwjgl.opengl.GL14.nglWindowPos2sv(p);
    }

    @Override public void glWindowPos2sv(ShortBuffer p) {
        org.lwjgl.opengl.GL14.glWindowPos2sv(p);
    }

    @Override public void glWindowPos2sv(short[] p) {
        org.lwjgl.opengl.GL14.glWindowPos2sv(p);
    }

    @Override public void nglWindowPos2fv(long p) {
        org.lwjgl.opengl.GL14.nglWindowPos2fv(p);
    }

    @Override public void glWindowPos2fv(FloatBuffer p) {
        org.lwjgl.opengl.GL14.glWindowPos2fv(p);
    }

    @Override public void glWindowPos2fv(float[] p) {
        org.lwjgl.opengl.GL14.glWindowPos2fv(p);
    }

    @Override public void nglWindowPos2dv(long p) {
        org.lwjgl.opengl.GL14.nglWindowPos2dv(p);
    }

    @Override public void glWindowPos2dv(DoubleBuffer p) {
        org.lwjgl.opengl.GL14.glWindowPos2dv(p);
    }

    @Override public void glWindowPos2dv(double[] p) {
        org.lwjgl.opengl.GL14.glWindowPos2dv(p);
    }

    @Override public void glWindowPos3i(int x, int y, int z) {
        org.lwjgl.opengl.GL14.glWindowPos3i(x, y, z);
    }

    @Override public void glWindowPos3s(short x, short y, short z) {
        org.lwjgl.opengl.GL14.glWindowPos3s(x, y, z);
    }

    @Override public void glWindowPos3f(float x, float y, float z) {
        org.lwjgl.opengl.GL14.glWindowPos3f(x, y, z);
    }

    @Override public void glWindowPos3d(double x, double y, double z) {
        org.lwjgl.opengl.GL14.glWindowPos3d(x, y, z);
    }

    @Override public void nglWindowPos3iv(long p) {
        org.lwjgl.opengl.GL14.nglWindowPos3iv(p);
    }

    @Override public void glWindowPos3iv(IntBuffer p) {
        org.lwjgl.opengl.GL14.glWindowPos3iv(p);
    }

    @Override public void glWindowPos3iv(int[] p) {
        org.lwjgl.opengl.GL14.glWindowPos3iv(p);
    }

    @Override public void nglWindowPos3sv(long p) {
        org.lwjgl.opengl.GL14.nglWindowPos3sv(p);
    }

    @Override public void glWindowPos3sv(ShortBuffer p) {
        org.lwjgl.opengl.GL14.glWindowPos3sv(p);
    }

    @Override public void glWindowPos3sv(short[] p) {
        org.lwjgl.opengl.GL14.glWindowPos3sv(p);
    }

    @Override public void nglWindowPos3fv(long p) {
        org.lwjgl.opengl.GL14.nglWindowPos3fv(p);
    }

    @Override public void glWindowPos3fv(FloatBuffer p) {
        org.lwjgl.opengl.GL14.glWindowPos3fv(p);
    }

    @Override public void glWindowPos3fv(float[] p) {
        org.lwjgl.opengl.GL14.glWindowPos3fv(p);
    }

    @Override public void nglWindowPos3dv(long p) {
        org.lwjgl.opengl.GL14.nglWindowPos3dv(p);
    }

    @Override public void glWindowPos3dv(DoubleBuffer p) {
        org.lwjgl.opengl.GL14.glWindowPos3dv(p);
    }

    @Override public void glWindowPos3dv(double[] p) {
        org.lwjgl.opengl.GL14.glWindowPos3dv(p);
    }

}
