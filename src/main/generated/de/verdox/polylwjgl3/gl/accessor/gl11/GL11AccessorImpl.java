package de.verdox.polylwjgl3.gl.accessor.gl11;

import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public class GL11AccessorImpl implements GL11Accessor {

    @Override public void glEnable(int target) {
        org.lwjgl.opengl.GL11.glEnable(target);
    }

    @Override public void glDisable(int target) {
        org.lwjgl.opengl.GL11.glDisable(target);
    }

    @Override public void glAccum(int op, float value) {
        org.lwjgl.opengl.GL11.glAccum(op, value);
    }

    @Override public void glAlphaFunc(int func, float ref) {
        org.lwjgl.opengl.GL11.glAlphaFunc(func, ref);
    }

    @Override public boolean nglAreTexturesResident(int n, long textures, long residences) {
        return org.lwjgl.opengl.GL11.nglAreTexturesResident(n, textures, residences);
    }

    @Override public boolean glAreTexturesResident(IntBuffer textures, ByteBuffer residences) {
        return org.lwjgl.opengl.GL11.glAreTexturesResident(textures, residences);
    }

    @Override public boolean glAreTexturesResident(int texture, ByteBuffer residences) {
        return org.lwjgl.opengl.GL11.glAreTexturesResident(texture, residences);
    }

    @Override public boolean glAreTexturesResident(int[] textures, ByteBuffer residences) {
        return org.lwjgl.opengl.GL11.glAreTexturesResident(textures, residences);
    }

    @Override public void glArrayElement(int i) {
        org.lwjgl.opengl.GL11.glArrayElement(i);
    }

    @Override public void glBegin(int mode) {
        org.lwjgl.opengl.GL11.glBegin(mode);
    }

    @Override public void glBindTexture(int target, int texture) {
        org.lwjgl.opengl.GL11.glBindTexture(target, texture);
    }

    @Override public void nglBitmap(int w, int h, float xOrig, float yOrig, float xInc, float yInc, long data) {
        org.lwjgl.opengl.GL11.nglBitmap(w, h, xOrig, yOrig, xInc, yInc, data);
    }

    @Override public void glBitmap(int w, int h, float xOrig, float yOrig, float xInc, float yInc, @Nullable ByteBuffer data) {
        org.lwjgl.opengl.GL11.glBitmap(w, h, xOrig, yOrig, xInc, yInc, data);
    }

    @Override public void glBitmap(int w, int h, float xOrig, float yOrig, float xInc, float yInc, long data) {
        org.lwjgl.opengl.GL11.glBitmap(w, h, xOrig, yOrig, xInc, yInc, data);
    }

    @Override public void glBlendFunc(int sfactor, int dfactor) {
        org.lwjgl.opengl.GL11.glBlendFunc(sfactor, dfactor);
    }

    @Override public void glCallList(int list) {
        org.lwjgl.opengl.GL11.glCallList(list);
    }

    @Override public void nglCallLists(int n, int type, long lists) {
        org.lwjgl.opengl.GL11.nglCallLists(n, type, lists);
    }

    @Override public void glCallLists(int type, ByteBuffer lists) {
        org.lwjgl.opengl.GL11.glCallLists(type, lists);
    }

    @Override public void glCallLists(ByteBuffer lists) {
        org.lwjgl.opengl.GL11.glCallLists(lists);
    }

    @Override public void glCallLists(ShortBuffer lists) {
        org.lwjgl.opengl.GL11.glCallLists(lists);
    }

    @Override public void glCallLists(IntBuffer lists) {
        org.lwjgl.opengl.GL11.glCallLists(lists);
    }

    @Override public void glClear(int mask) {
        org.lwjgl.opengl.GL11.glClear(mask);
    }

    @Override public void glClearAccum(float red, float green, float blue, float alpha) {
        org.lwjgl.opengl.GL11.glClearAccum(red, green, blue, alpha);
    }

    @Override public void glClearColor(float red, float green, float blue, float alpha) {
        org.lwjgl.opengl.GL11.glClearColor(red, green, blue, alpha);
    }

    @Override public void glClearDepth(double depth) {
        org.lwjgl.opengl.GL11.glClearDepth(depth);
    }

    @Override public void glClearIndex(float index) {
        org.lwjgl.opengl.GL11.glClearIndex(index);
    }

    @Override public void glClearStencil(int s) {
        org.lwjgl.opengl.GL11.glClearStencil(s);
    }

    @Override public void nglClipPlane(int plane, long equation) {
        org.lwjgl.opengl.GL11.nglClipPlane(plane, equation);
    }

    @Override public void glClipPlane(int plane, DoubleBuffer equation) {
        org.lwjgl.opengl.GL11.glClipPlane(plane, equation);
    }

    @Override public void glClipPlane(int plane, double[] equation) {
        org.lwjgl.opengl.GL11.glClipPlane(plane, equation);
    }

    @Override public void glColor3b(byte red, byte green, byte blue) {
        org.lwjgl.opengl.GL11.glColor3b(red, green, blue);
    }

    @Override public void glColor3s(short red, short green, short blue) {
        org.lwjgl.opengl.GL11.glColor3s(red, green, blue);
    }

    @Override public void glColor3i(int red, int green, int blue) {
        org.lwjgl.opengl.GL11.glColor3i(red, green, blue);
    }

    @Override public void glColor3f(float red, float green, float blue) {
        org.lwjgl.opengl.GL11.glColor3f(red, green, blue);
    }

    @Override public void glColor3d(double red, double green, double blue) {
        org.lwjgl.opengl.GL11.glColor3d(red, green, blue);
    }

    @Override public void glColor3ub(byte red, byte green, byte blue) {
        org.lwjgl.opengl.GL11.glColor3ub(red, green, blue);
    }

    @Override public void glColor3us(short red, short green, short blue) {
        org.lwjgl.opengl.GL11.glColor3us(red, green, blue);
    }

    @Override public void glColor3ui(int red, int green, int blue) {
        org.lwjgl.opengl.GL11.glColor3ui(red, green, blue);
    }

    @Override public void nglColor3bv(long v) {
        org.lwjgl.opengl.GL11.nglColor3bv(v);
    }

    @Override public void glColor3bv(ByteBuffer v) {
        org.lwjgl.opengl.GL11.glColor3bv(v);
    }

    @Override public void nglColor3sv(long v) {
        org.lwjgl.opengl.GL11.nglColor3sv(v);
    }

    @Override public void glColor3sv(ShortBuffer v) {
        org.lwjgl.opengl.GL11.glColor3sv(v);
    }

    @Override public void glColor3sv(short[] v) {
        org.lwjgl.opengl.GL11.glColor3sv(v);
    }

    @Override public void nglColor3iv(long v) {
        org.lwjgl.opengl.GL11.nglColor3iv(v);
    }

    @Override public void glColor3iv(IntBuffer v) {
        org.lwjgl.opengl.GL11.glColor3iv(v);
    }

    @Override public void glColor3iv(int[] v) {
        org.lwjgl.opengl.GL11.glColor3iv(v);
    }

    @Override public void nglColor3fv(long v) {
        org.lwjgl.opengl.GL11.nglColor3fv(v);
    }

    @Override public void glColor3fv(FloatBuffer v) {
        org.lwjgl.opengl.GL11.glColor3fv(v);
    }

    @Override public void glColor3fv(float[] v) {
        org.lwjgl.opengl.GL11.glColor3fv(v);
    }

    @Override public void nglColor3dv(long v) {
        org.lwjgl.opengl.GL11.nglColor3dv(v);
    }

    @Override public void glColor3dv(DoubleBuffer v) {
        org.lwjgl.opengl.GL11.glColor3dv(v);
    }

    @Override public void glColor3dv(double[] v) {
        org.lwjgl.opengl.GL11.glColor3dv(v);
    }

    @Override public void nglColor3ubv(long v) {
        org.lwjgl.opengl.GL11.nglColor3ubv(v);
    }

    @Override public void glColor3ubv(ByteBuffer v) {
        org.lwjgl.opengl.GL11.glColor3ubv(v);
    }

    @Override public void nglColor3usv(long v) {
        org.lwjgl.opengl.GL11.nglColor3usv(v);
    }

    @Override public void glColor3usv(ShortBuffer v) {
        org.lwjgl.opengl.GL11.glColor3usv(v);
    }

    @Override public void glColor3usv(short[] v) {
        org.lwjgl.opengl.GL11.glColor3usv(v);
    }

    @Override public void nglColor3uiv(long v) {
        org.lwjgl.opengl.GL11.nglColor3uiv(v);
    }

    @Override public void glColor3uiv(IntBuffer v) {
        org.lwjgl.opengl.GL11.glColor3uiv(v);
    }

    @Override public void glColor3uiv(int[] v) {
        org.lwjgl.opengl.GL11.glColor3uiv(v);
    }

    @Override public void glColor4b(byte red, byte green, byte blue, byte alpha) {
        org.lwjgl.opengl.GL11.glColor4b(red, green, blue, alpha);
    }

    @Override public void glColor4s(short red, short green, short blue, short alpha) {
        org.lwjgl.opengl.GL11.glColor4s(red, green, blue, alpha);
    }

    @Override public void glColor4i(int red, int green, int blue, int alpha) {
        org.lwjgl.opengl.GL11.glColor4i(red, green, blue, alpha);
    }

    @Override public void glColor4f(float red, float green, float blue, float alpha) {
        org.lwjgl.opengl.GL11.glColor4f(red, green, blue, alpha);
    }

    @Override public void glColor4d(double red, double green, double blue, double alpha) {
        org.lwjgl.opengl.GL11.glColor4d(red, green, blue, alpha);
    }

    @Override public void glColor4ub(byte red, byte green, byte blue, byte alpha) {
        org.lwjgl.opengl.GL11.glColor4ub(red, green, blue, alpha);
    }

    @Override public void glColor4us(short red, short green, short blue, short alpha) {
        org.lwjgl.opengl.GL11.glColor4us(red, green, blue, alpha);
    }

    @Override public void glColor4ui(int red, int green, int blue, int alpha) {
        org.lwjgl.opengl.GL11.glColor4ui(red, green, blue, alpha);
    }

    @Override public void nglColor4bv(long v) {
        org.lwjgl.opengl.GL11.nglColor4bv(v);
    }

    @Override public void glColor4bv(ByteBuffer v) {
        org.lwjgl.opengl.GL11.glColor4bv(v);
    }

    @Override public void nglColor4sv(long v) {
        org.lwjgl.opengl.GL11.nglColor4sv(v);
    }

    @Override public void glColor4sv(ShortBuffer v) {
        org.lwjgl.opengl.GL11.glColor4sv(v);
    }

    @Override public void glColor4sv(short[] v) {
        org.lwjgl.opengl.GL11.glColor4sv(v);
    }

    @Override public void nglColor4iv(long v) {
        org.lwjgl.opengl.GL11.nglColor4iv(v);
    }

    @Override public void glColor4iv(IntBuffer v) {
        org.lwjgl.opengl.GL11.glColor4iv(v);
    }

    @Override public void glColor4iv(int[] v) {
        org.lwjgl.opengl.GL11.glColor4iv(v);
    }

    @Override public void nglColor4fv(long v) {
        org.lwjgl.opengl.GL11.nglColor4fv(v);
    }

    @Override public void glColor4fv(FloatBuffer v) {
        org.lwjgl.opengl.GL11.glColor4fv(v);
    }

    @Override public void glColor4fv(float[] v) {
        org.lwjgl.opengl.GL11.glColor4fv(v);
    }

    @Override public void nglColor4dv(long v) {
        org.lwjgl.opengl.GL11.nglColor4dv(v);
    }

    @Override public void glColor4dv(DoubleBuffer v) {
        org.lwjgl.opengl.GL11.glColor4dv(v);
    }

    @Override public void glColor4dv(double[] v) {
        org.lwjgl.opengl.GL11.glColor4dv(v);
    }

    @Override public void nglColor4ubv(long v) {
        org.lwjgl.opengl.GL11.nglColor4ubv(v);
    }

    @Override public void glColor4ubv(ByteBuffer v) {
        org.lwjgl.opengl.GL11.glColor4ubv(v);
    }

    @Override public void nglColor4usv(long v) {
        org.lwjgl.opengl.GL11.nglColor4usv(v);
    }

    @Override public void glColor4usv(ShortBuffer v) {
        org.lwjgl.opengl.GL11.glColor4usv(v);
    }

    @Override public void glColor4usv(short[] v) {
        org.lwjgl.opengl.GL11.glColor4usv(v);
    }

    @Override public void nglColor4uiv(long v) {
        org.lwjgl.opengl.GL11.nglColor4uiv(v);
    }

    @Override public void glColor4uiv(IntBuffer v) {
        org.lwjgl.opengl.GL11.glColor4uiv(v);
    }

    @Override public void glColor4uiv(int[] v) {
        org.lwjgl.opengl.GL11.glColor4uiv(v);
    }

    @Override public void glColorMask(boolean red, boolean green, boolean blue, boolean alpha) {
        org.lwjgl.opengl.GL11.glColorMask(red, green, blue, alpha);
    }

    @Override public void glColorMaterial(int face, int mode) {
        org.lwjgl.opengl.GL11.glColorMaterial(face, mode);
    }

    @Override public void nglColorPointer(int size, int type, int stride, long pointer) {
        org.lwjgl.opengl.GL11.nglColorPointer(size, type, stride, pointer);
    }

    @Override public void glColorPointer(int size, int type, int stride, ByteBuffer pointer) {
        org.lwjgl.opengl.GL11.glColorPointer(size, type, stride, pointer);
    }

    @Override public void glColorPointer(int size, int type, int stride, long pointer) {
        org.lwjgl.opengl.GL11.glColorPointer(size, type, stride, pointer);
    }

    @Override public void glColorPointer(int size, int type, int stride, ShortBuffer pointer) {
        org.lwjgl.opengl.GL11.glColorPointer(size, type, stride, pointer);
    }

    @Override public void glColorPointer(int size, int type, int stride, IntBuffer pointer) {
        org.lwjgl.opengl.GL11.glColorPointer(size, type, stride, pointer);
    }

    @Override public void glColorPointer(int size, int type, int stride, FloatBuffer pointer) {
        org.lwjgl.opengl.GL11.glColorPointer(size, type, stride, pointer);
    }

    @Override public void glCopyPixels(int x, int y, int width, int height, int type) {
        org.lwjgl.opengl.GL11.glCopyPixels(x, y, width, height, type);
    }

    @Override public void glCullFace(int mode) {
        org.lwjgl.opengl.GL11.glCullFace(mode);
    }

    @Override public void glDeleteLists(int list, int range) {
        org.lwjgl.opengl.GL11.glDeleteLists(list, range);
    }

    @Override public void glDepthFunc(int func) {
        org.lwjgl.opengl.GL11.glDepthFunc(func);
    }

    @Override public void glDepthMask(boolean flag) {
        org.lwjgl.opengl.GL11.glDepthMask(flag);
    }

    @Override public void glDepthRange(double zNear, double zFar) {
        org.lwjgl.opengl.GL11.glDepthRange(zNear, zFar);
    }

    @Override public void glDisableClientState(int cap) {
        org.lwjgl.opengl.GL11.glDisableClientState(cap);
    }

    @Override public void glDrawArrays(int mode, int first, int count) {
        org.lwjgl.opengl.GL11.glDrawArrays(mode, first, count);
    }

    @Override public void glDrawBuffer(int buf) {
        org.lwjgl.opengl.GL11.glDrawBuffer(buf);
    }

    @Override public void nglDrawElements(int mode, int count, int type, long indices) {
        org.lwjgl.opengl.GL11.nglDrawElements(mode, count, type, indices);
    }

    @Override public void glDrawElements(int mode, int count, int type, long indices) {
        org.lwjgl.opengl.GL11.glDrawElements(mode, count, type, indices);
    }

    @Override public void glDrawElements(int mode, int type, ByteBuffer indices) {
        org.lwjgl.opengl.GL11.glDrawElements(mode, type, indices);
    }

    @Override public void glDrawElements(int mode, ByteBuffer indices) {
        org.lwjgl.opengl.GL11.glDrawElements(mode, indices);
    }

    @Override public void glDrawElements(int mode, ShortBuffer indices) {
        org.lwjgl.opengl.GL11.glDrawElements(mode, indices);
    }

    @Override public void glDrawElements(int mode, IntBuffer indices) {
        org.lwjgl.opengl.GL11.glDrawElements(mode, indices);
    }

    @Override public void nglDrawPixels(int width, int height, int format, int type, long pixels) {
        org.lwjgl.opengl.GL11.nglDrawPixels(width, height, format, type, pixels);
    }

    @Override public void glDrawPixels(int width, int height, int format, int type, ByteBuffer pixels) {
        org.lwjgl.opengl.GL11.glDrawPixels(width, height, format, type, pixels);
    }

    @Override public void glDrawPixels(int width, int height, int format, int type, long pixels) {
        org.lwjgl.opengl.GL11.glDrawPixels(width, height, format, type, pixels);
    }

    @Override public void glDrawPixels(int width, int height, int format, int type, ShortBuffer pixels) {
        org.lwjgl.opengl.GL11.glDrawPixels(width, height, format, type, pixels);
    }

    @Override public void glDrawPixels(int width, int height, int format, int type, IntBuffer pixels) {
        org.lwjgl.opengl.GL11.glDrawPixels(width, height, format, type, pixels);
    }

    @Override public void glDrawPixels(int width, int height, int format, int type, FloatBuffer pixels) {
        org.lwjgl.opengl.GL11.glDrawPixels(width, height, format, type, pixels);
    }

    @Override public void glDrawPixels(int width, int height, int format, int type, short[] pixels) {
        org.lwjgl.opengl.GL11.glDrawPixels(width, height, format, type, pixels);
    }

    @Override public void glDrawPixels(int width, int height, int format, int type, int[] pixels) {
        org.lwjgl.opengl.GL11.glDrawPixels(width, height, format, type, pixels);
    }

    @Override public void glDrawPixels(int width, int height, int format, int type, float[] pixels) {
        org.lwjgl.opengl.GL11.glDrawPixels(width, height, format, type, pixels);
    }

    @Override public void glEdgeFlag(boolean flag) {
        org.lwjgl.opengl.GL11.glEdgeFlag(flag);
    }

    @Override public void nglEdgeFlagv(long flag) {
        org.lwjgl.opengl.GL11.nglEdgeFlagv(flag);
    }

    @Override public void glEdgeFlagv(ByteBuffer flag) {
        org.lwjgl.opengl.GL11.glEdgeFlagv(flag);
    }

    @Override public void nglEdgeFlagPointer(int stride, long pointer) {
        org.lwjgl.opengl.GL11.nglEdgeFlagPointer(stride, pointer);
    }

    @Override public void glEdgeFlagPointer(int stride, ByteBuffer pointer) {
        org.lwjgl.opengl.GL11.glEdgeFlagPointer(stride, pointer);
    }

    @Override public void glEdgeFlagPointer(int stride, long pointer) {
        org.lwjgl.opengl.GL11.glEdgeFlagPointer(stride, pointer);
    }

    @Override public void glEnableClientState(int cap) {
        org.lwjgl.opengl.GL11.glEnableClientState(cap);
    }

    @Override public void glEnd() {
        org.lwjgl.opengl.GL11.glEnd();
    }

    @Override public void glEvalCoord1f(float u) {
        org.lwjgl.opengl.GL11.glEvalCoord1f(u);
    }

    @Override public void nglEvalCoord1fv(long u) {
        org.lwjgl.opengl.GL11.nglEvalCoord1fv(u);
    }

    @Override public void glEvalCoord1fv(FloatBuffer u) {
        org.lwjgl.opengl.GL11.glEvalCoord1fv(u);
    }

    @Override public void glEvalCoord1fv(float[] u) {
        org.lwjgl.opengl.GL11.glEvalCoord1fv(u);
    }

    @Override public void glEvalCoord1d(double u) {
        org.lwjgl.opengl.GL11.glEvalCoord1d(u);
    }

    @Override public void nglEvalCoord1dv(long u) {
        org.lwjgl.opengl.GL11.nglEvalCoord1dv(u);
    }

    @Override public void glEvalCoord1dv(DoubleBuffer u) {
        org.lwjgl.opengl.GL11.glEvalCoord1dv(u);
    }

    @Override public void glEvalCoord1dv(double[] u) {
        org.lwjgl.opengl.GL11.glEvalCoord1dv(u);
    }

    @Override public void glEvalCoord2f(float u, float v) {
        org.lwjgl.opengl.GL11.glEvalCoord2f(u, v);
    }

    @Override public void nglEvalCoord2fv(long u) {
        org.lwjgl.opengl.GL11.nglEvalCoord2fv(u);
    }

    @Override public void glEvalCoord2fv(FloatBuffer u) {
        org.lwjgl.opengl.GL11.glEvalCoord2fv(u);
    }

    @Override public void glEvalCoord2fv(float[] u) {
        org.lwjgl.opengl.GL11.glEvalCoord2fv(u);
    }

    @Override public void glEvalCoord2d(double u, double v) {
        org.lwjgl.opengl.GL11.glEvalCoord2d(u, v);
    }

    @Override public void nglEvalCoord2dv(long u) {
        org.lwjgl.opengl.GL11.nglEvalCoord2dv(u);
    }

    @Override public void glEvalCoord2dv(DoubleBuffer u) {
        org.lwjgl.opengl.GL11.glEvalCoord2dv(u);
    }

    @Override public void glEvalCoord2dv(double[] u) {
        org.lwjgl.opengl.GL11.glEvalCoord2dv(u);
    }

    @Override public void glEvalMesh1(int mode, int i1, int i2) {
        org.lwjgl.opengl.GL11.glEvalMesh1(mode, i1, i2);
    }

    @Override public void glEvalMesh2(int mode, int i1, int i2, int j1, int j2) {
        org.lwjgl.opengl.GL11.glEvalMesh2(mode, i1, i2, j1, j2);
    }

    @Override public void glEvalPoint1(int i) {
        org.lwjgl.opengl.GL11.glEvalPoint1(i);
    }

    @Override public void glEvalPoint2(int i, int j) {
        org.lwjgl.opengl.GL11.glEvalPoint2(i, j);
    }

    @Override public void nglFeedbackBuffer(int size, int type, long buffer) {
        org.lwjgl.opengl.GL11.nglFeedbackBuffer(size, type, buffer);
    }

    @Override public void glFeedbackBuffer(int type, FloatBuffer buffer) {
        org.lwjgl.opengl.GL11.glFeedbackBuffer(type, buffer);
    }

    @Override public void glFeedbackBuffer(int type, float[] buffer) {
        org.lwjgl.opengl.GL11.glFeedbackBuffer(type, buffer);
    }

    @Override public void glFinish() {
        org.lwjgl.opengl.GL11.glFinish();
    }

    @Override public void glFlush() {
        org.lwjgl.opengl.GL11.glFlush();
    }

    @Override public void glFogi(int pname, int param) {
        org.lwjgl.opengl.GL11.glFogi(pname, param);
    }

    @Override public void nglFogiv(int pname, long params) {
        org.lwjgl.opengl.GL11.nglFogiv(pname, params);
    }

    @Override public void glFogiv(int pname, IntBuffer params) {
        org.lwjgl.opengl.GL11.glFogiv(pname, params);
    }

    @Override public void glFogiv(int pname, int[] params) {
        org.lwjgl.opengl.GL11.glFogiv(pname, params);
    }

    @Override public void glFogf(int pname, float param) {
        org.lwjgl.opengl.GL11.glFogf(pname, param);
    }

    @Override public void nglFogfv(int pname, long params) {
        org.lwjgl.opengl.GL11.nglFogfv(pname, params);
    }

    @Override public void glFogfv(int pname, FloatBuffer params) {
        org.lwjgl.opengl.GL11.glFogfv(pname, params);
    }

    @Override public void glFogfv(int pname, float[] params) {
        org.lwjgl.opengl.GL11.glFogfv(pname, params);
    }

    @Override public void glFrontFace(int dir) {
        org.lwjgl.opengl.GL11.glFrontFace(dir);
    }

    @Override public int glGenLists(int s) {
        return org.lwjgl.opengl.GL11.glGenLists(s);
    }

    @Override public void nglGenTextures(int n, long textures) {
        org.lwjgl.opengl.GL11.nglGenTextures(n, textures);
    }

    @Override public void glGenTextures(IntBuffer textures) {
        org.lwjgl.opengl.GL11.glGenTextures(textures);
    }

    @Override public int glGenTextures() {
        return org.lwjgl.opengl.GL11.glGenTextures();
    }

    @Override public void glGenTextures(int[] textures) {
        org.lwjgl.opengl.GL11.glGenTextures(textures);
    }

    @Override public void nglDeleteTextures(int n, long textures) {
        org.lwjgl.opengl.GL11.nglDeleteTextures(n, textures);
    }

    @Override public void glDeleteTextures(IntBuffer textures) {
        org.lwjgl.opengl.GL11.glDeleteTextures(textures);
    }

    @Override public void glDeleteTextures(int texture) {
        org.lwjgl.opengl.GL11.glDeleteTextures(texture);
    }

    @Override public void glDeleteTextures(int[] textures) {
        org.lwjgl.opengl.GL11.glDeleteTextures(textures);
    }

    @Override public void nglGetClipPlane(int plane, long equation) {
        org.lwjgl.opengl.GL11.nglGetClipPlane(plane, equation);
    }

    @Override public void glGetClipPlane(int plane, DoubleBuffer equation) {
        org.lwjgl.opengl.GL11.glGetClipPlane(plane, equation);
    }

    @Override public void glGetClipPlane(int plane, double[] equation) {
        org.lwjgl.opengl.GL11.glGetClipPlane(plane, equation);
    }

    @Override public void nglGetBooleanv(int pname, long params) {
        org.lwjgl.opengl.GL11.nglGetBooleanv(pname, params);
    }

    @Override public void glGetBooleanv(int pname, ByteBuffer params) {
        org.lwjgl.opengl.GL11.glGetBooleanv(pname, params);
    }

    @Override public boolean glGetBoolean(int pname) {
        return org.lwjgl.opengl.GL11.glGetBoolean(pname);
    }

    @Override public void nglGetFloatv(int pname, long params) {
        org.lwjgl.opengl.GL11.nglGetFloatv(pname, params);
    }

    @Override public void glGetFloatv(int pname, FloatBuffer params) {
        org.lwjgl.opengl.GL11.glGetFloatv(pname, params);
    }

    @Override public void glGetFloatv(int pname, float[] params) {
        org.lwjgl.opengl.GL11.glGetFloatv(pname, params);
    }

    @Override public float glGetFloat(int pname) {
        return org.lwjgl.opengl.GL11.glGetFloat(pname);
    }

    @Override public void nglGetIntegerv(int pname, long params) {
        org.lwjgl.opengl.GL11.nglGetIntegerv(pname, params);
    }

    @Override public void glGetIntegerv(int pname, IntBuffer params) {
        org.lwjgl.opengl.GL11.glGetIntegerv(pname, params);
    }

    @Override public void glGetIntegerv(int pname, int[] params) {
        org.lwjgl.opengl.GL11.glGetIntegerv(pname, params);
    }

    @Override public int glGetInteger(int pname) {
        return org.lwjgl.opengl.GL11.glGetInteger(pname);
    }

    @Override public void nglGetDoublev(int pname, long params) {
        org.lwjgl.opengl.GL11.nglGetDoublev(pname, params);
    }

    @Override public void glGetDoublev(int pname, DoubleBuffer params) {
        org.lwjgl.opengl.GL11.glGetDoublev(pname, params);
    }

    @Override public void glGetDoublev(int pname, double[] params) {
        org.lwjgl.opengl.GL11.glGetDoublev(pname, params);
    }

    @Override public double glGetDouble(int pname) {
        return org.lwjgl.opengl.GL11.glGetDouble(pname);
    }

    @Override public int glGetError() {
        return org.lwjgl.opengl.GL11.glGetError();
    }

    @Override public void nglGetLightiv(int light, int pname, long data) {
        org.lwjgl.opengl.GL11.nglGetLightiv(light, pname, data);
    }

    @Override public void glGetLightiv(int light, int pname, IntBuffer data) {
        org.lwjgl.opengl.GL11.glGetLightiv(light, pname, data);
    }

    @Override public void glGetLightiv(int light, int pname, int[] data) {
        org.lwjgl.opengl.GL11.glGetLightiv(light, pname, data);
    }

    @Override public int glGetLighti(int light, int pname) {
        return org.lwjgl.opengl.GL11.glGetLighti(light, pname);
    }

    @Override public void nglGetLightfv(int light, int pname, long data) {
        org.lwjgl.opengl.GL11.nglGetLightfv(light, pname, data);
    }

    @Override public void glGetLightfv(int light, int pname, FloatBuffer data) {
        org.lwjgl.opengl.GL11.glGetLightfv(light, pname, data);
    }

    @Override public void glGetLightfv(int light, int pname, float[] data) {
        org.lwjgl.opengl.GL11.glGetLightfv(light, pname, data);
    }

    @Override public float glGetLightf(int light, int pname) {
        return org.lwjgl.opengl.GL11.glGetLightf(light, pname);
    }

    @Override public void nglGetMapiv(int target, int query, long data) {
        org.lwjgl.opengl.GL11.nglGetMapiv(target, query, data);
    }

    @Override public void glGetMapiv(int target, int query, IntBuffer data) {
        org.lwjgl.opengl.GL11.glGetMapiv(target, query, data);
    }

    @Override public void glGetMapiv(int target, int query, int[] data) {
        org.lwjgl.opengl.GL11.glGetMapiv(target, query, data);
    }

    @Override public int glGetMapi(int target, int query) {
        return org.lwjgl.opengl.GL11.glGetMapi(target, query);
    }

    @Override public void nglGetMapfv(int target, int query, long data) {
        org.lwjgl.opengl.GL11.nglGetMapfv(target, query, data);
    }

    @Override public void glGetMapfv(int target, int query, FloatBuffer data) {
        org.lwjgl.opengl.GL11.glGetMapfv(target, query, data);
    }

    @Override public void glGetMapfv(int target, int query, float[] data) {
        org.lwjgl.opengl.GL11.glGetMapfv(target, query, data);
    }

    @Override public float glGetMapf(int target, int query) {
        return org.lwjgl.opengl.GL11.glGetMapf(target, query);
    }

    @Override public void nglGetMapdv(int target, int query, long data) {
        org.lwjgl.opengl.GL11.nglGetMapdv(target, query, data);
    }

    @Override public void glGetMapdv(int target, int query, DoubleBuffer data) {
        org.lwjgl.opengl.GL11.glGetMapdv(target, query, data);
    }

    @Override public void glGetMapdv(int target, int query, double[] data) {
        org.lwjgl.opengl.GL11.glGetMapdv(target, query, data);
    }

    @Override public double glGetMapd(int target, int query) {
        return org.lwjgl.opengl.GL11.glGetMapd(target, query);
    }

    @Override public void nglGetMaterialiv(int face, int pname, long data) {
        org.lwjgl.opengl.GL11.nglGetMaterialiv(face, pname, data);
    }

    @Override public void glGetMaterialiv(int face, int pname, IntBuffer data) {
        org.lwjgl.opengl.GL11.glGetMaterialiv(face, pname, data);
    }

    @Override public void glGetMaterialiv(int face, int pname, int[] data) {
        org.lwjgl.opengl.GL11.glGetMaterialiv(face, pname, data);
    }

    @Override public void nglGetMaterialfv(int face, int pname, long data) {
        org.lwjgl.opengl.GL11.nglGetMaterialfv(face, pname, data);
    }

    @Override public void glGetMaterialfv(int face, int pname, FloatBuffer data) {
        org.lwjgl.opengl.GL11.glGetMaterialfv(face, pname, data);
    }

    @Override public void glGetMaterialfv(int face, int pname, float[] data) {
        org.lwjgl.opengl.GL11.glGetMaterialfv(face, pname, data);
    }

    @Override public void nglGetPixelMapfv(int map, long data) {
        org.lwjgl.opengl.GL11.nglGetPixelMapfv(map, data);
    }

    @Override public void glGetPixelMapfv(int map, FloatBuffer data) {
        org.lwjgl.opengl.GL11.glGetPixelMapfv(map, data);
    }

    @Override public void glGetPixelMapfv(int map, long data) {
        org.lwjgl.opengl.GL11.glGetPixelMapfv(map, data);
    }

    @Override public void glGetPixelMapfv(int map, float[] data) {
        org.lwjgl.opengl.GL11.glGetPixelMapfv(map, data);
    }

    @Override public void nglGetPixelMapusv(int map, long data) {
        org.lwjgl.opengl.GL11.nglGetPixelMapusv(map, data);
    }

    @Override public void glGetPixelMapusv(int map, ShortBuffer data) {
        org.lwjgl.opengl.GL11.glGetPixelMapusv(map, data);
    }

    @Override public void glGetPixelMapusv(int map, long data) {
        org.lwjgl.opengl.GL11.glGetPixelMapusv(map, data);
    }

    @Override public void glGetPixelMapusv(int map, short[] data) {
        org.lwjgl.opengl.GL11.glGetPixelMapusv(map, data);
    }

    @Override public void nglGetPixelMapuiv(int map, long data) {
        org.lwjgl.opengl.GL11.nglGetPixelMapuiv(map, data);
    }

    @Override public void glGetPixelMapuiv(int map, IntBuffer data) {
        org.lwjgl.opengl.GL11.glGetPixelMapuiv(map, data);
    }

    @Override public void glGetPixelMapuiv(int map, long data) {
        org.lwjgl.opengl.GL11.glGetPixelMapuiv(map, data);
    }

    @Override public void glGetPixelMapuiv(int map, int[] data) {
        org.lwjgl.opengl.GL11.glGetPixelMapuiv(map, data);
    }

    @Override public void nglGetPointerv(int pname, long params) {
        org.lwjgl.opengl.GL11.nglGetPointerv(pname, params);
    }

    @Override public void glGetPointerv(int pname, PointerBuffer params) {
        org.lwjgl.opengl.GL11.glGetPointerv(pname, params);
    }

    @Override public long glGetPointer(int pname) {
        return org.lwjgl.opengl.GL11.glGetPointer(pname);
    }

    @Override public void nglGetPolygonStipple(long pattern) {
        org.lwjgl.opengl.GL11.nglGetPolygonStipple(pattern);
    }

    @Override public void glGetPolygonStipple(ByteBuffer pattern) {
        org.lwjgl.opengl.GL11.glGetPolygonStipple(pattern);
    }

    @Override public void glGetPolygonStipple(long pattern) {
        org.lwjgl.opengl.GL11.glGetPolygonStipple(pattern);
    }

    @Override public long nglGetString(int name) {
        return org.lwjgl.opengl.GL11.nglGetString(name);
    }

@Nullable
    @Override public String glGetString(int name) {
        return org.lwjgl.opengl.GL11.glGetString(name);
    }

    @Override public void nglGetTexEnviv(int env, int pname, long data) {
        org.lwjgl.opengl.GL11.nglGetTexEnviv(env, pname, data);
    }

    @Override public void glGetTexEnviv(int env, int pname, IntBuffer data) {
        org.lwjgl.opengl.GL11.glGetTexEnviv(env, pname, data);
    }

    @Override public void glGetTexEnviv(int env, int pname, int[] data) {
        org.lwjgl.opengl.GL11.glGetTexEnviv(env, pname, data);
    }

    @Override public int glGetTexEnvi(int env, int pname) {
        return org.lwjgl.opengl.GL11.glGetTexEnvi(env, pname);
    }

    @Override public void nglGetTexEnvfv(int env, int pname, long data) {
        org.lwjgl.opengl.GL11.nglGetTexEnvfv(env, pname, data);
    }

    @Override public void glGetTexEnvfv(int env, int pname, FloatBuffer data) {
        org.lwjgl.opengl.GL11.glGetTexEnvfv(env, pname, data);
    }

    @Override public void glGetTexEnvfv(int env, int pname, float[] data) {
        org.lwjgl.opengl.GL11.glGetTexEnvfv(env, pname, data);
    }

    @Override public float glGetTexEnvf(int env, int pname) {
        return org.lwjgl.opengl.GL11.glGetTexEnvf(env, pname);
    }

    @Override public void nglGetTexGeniv(int coord, int pname, long data) {
        org.lwjgl.opengl.GL11.nglGetTexGeniv(coord, pname, data);
    }

    @Override public void glGetTexGeniv(int coord, int pname, IntBuffer data) {
        org.lwjgl.opengl.GL11.glGetTexGeniv(coord, pname, data);
    }

    @Override public void glGetTexGeniv(int coord, int pname, int[] data) {
        org.lwjgl.opengl.GL11.glGetTexGeniv(coord, pname, data);
    }

    @Override public int glGetTexGeni(int coord, int pname) {
        return org.lwjgl.opengl.GL11.glGetTexGeni(coord, pname);
    }

    @Override public void nglGetTexGenfv(int coord, int pname, long data) {
        org.lwjgl.opengl.GL11.nglGetTexGenfv(coord, pname, data);
    }

    @Override public void glGetTexGenfv(int coord, int pname, FloatBuffer data) {
        org.lwjgl.opengl.GL11.glGetTexGenfv(coord, pname, data);
    }

    @Override public void glGetTexGenfv(int coord, int pname, float[] data) {
        org.lwjgl.opengl.GL11.glGetTexGenfv(coord, pname, data);
    }

    @Override public float glGetTexGenf(int coord, int pname) {
        return org.lwjgl.opengl.GL11.glGetTexGenf(coord, pname);
    }

    @Override public void nglGetTexGendv(int coord, int pname, long data) {
        org.lwjgl.opengl.GL11.nglGetTexGendv(coord, pname, data);
    }

    @Override public void glGetTexGendv(int coord, int pname, DoubleBuffer data) {
        org.lwjgl.opengl.GL11.glGetTexGendv(coord, pname, data);
    }

    @Override public void glGetTexGendv(int coord, int pname, double[] data) {
        org.lwjgl.opengl.GL11.glGetTexGendv(coord, pname, data);
    }

    @Override public double glGetTexGend(int coord, int pname) {
        return org.lwjgl.opengl.GL11.glGetTexGend(coord, pname);
    }

    @Override public void nglGetTexImage(int tex, int level, int format, int type, long pixels) {
        org.lwjgl.opengl.GL11.nglGetTexImage(tex, level, format, type, pixels);
    }

    @Override public void glGetTexImage(int tex, int level, int format, int type, ByteBuffer pixels) {
        org.lwjgl.opengl.GL11.glGetTexImage(tex, level, format, type, pixels);
    }

    @Override public void glGetTexImage(int tex, int level, int format, int type, long pixels) {
        org.lwjgl.opengl.GL11.glGetTexImage(tex, level, format, type, pixels);
    }

    @Override public void glGetTexImage(int tex, int level, int format, int type, ShortBuffer pixels) {
        org.lwjgl.opengl.GL11.glGetTexImage(tex, level, format, type, pixels);
    }

    @Override public void glGetTexImage(int tex, int level, int format, int type, IntBuffer pixels) {
        org.lwjgl.opengl.GL11.glGetTexImage(tex, level, format, type, pixels);
    }

    @Override public void glGetTexImage(int tex, int level, int format, int type, FloatBuffer pixels) {
        org.lwjgl.opengl.GL11.glGetTexImage(tex, level, format, type, pixels);
    }

    @Override public void glGetTexImage(int tex, int level, int format, int type, DoubleBuffer pixels) {
        org.lwjgl.opengl.GL11.glGetTexImage(tex, level, format, type, pixels);
    }

    @Override public void glGetTexImage(int tex, int level, int format, int type, short[] pixels) {
        org.lwjgl.opengl.GL11.glGetTexImage(tex, level, format, type, pixels);
    }

    @Override public void glGetTexImage(int tex, int level, int format, int type, int[] pixels) {
        org.lwjgl.opengl.GL11.glGetTexImage(tex, level, format, type, pixels);
    }

    @Override public void glGetTexImage(int tex, int level, int format, int type, float[] pixels) {
        org.lwjgl.opengl.GL11.glGetTexImage(tex, level, format, type, pixels);
    }

    @Override public void glGetTexImage(int tex, int level, int format, int type, double[] pixels) {
        org.lwjgl.opengl.GL11.glGetTexImage(tex, level, format, type, pixels);
    }

    @Override public void nglGetTexLevelParameteriv(int target, int level, int pname, long params) {
        org.lwjgl.opengl.GL11.nglGetTexLevelParameteriv(target, level, pname, params);
    }

    @Override public void glGetTexLevelParameteriv(int target, int level, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL11.glGetTexLevelParameteriv(target, level, pname, params);
    }

    @Override public void glGetTexLevelParameteriv(int target, int level, int pname, int[] params) {
        org.lwjgl.opengl.GL11.glGetTexLevelParameteriv(target, level, pname, params);
    }

    @Override public int glGetTexLevelParameteri(int target, int level, int pname) {
        return org.lwjgl.opengl.GL11.glGetTexLevelParameteri(target, level, pname);
    }

    @Override public void nglGetTexLevelParameterfv(int target, int level, int pname, long params) {
        org.lwjgl.opengl.GL11.nglGetTexLevelParameterfv(target, level, pname, params);
    }

    @Override public void glGetTexLevelParameterfv(int target, int level, int pname, FloatBuffer params) {
        org.lwjgl.opengl.GL11.glGetTexLevelParameterfv(target, level, pname, params);
    }

    @Override public void glGetTexLevelParameterfv(int target, int level, int pname, float[] params) {
        org.lwjgl.opengl.GL11.glGetTexLevelParameterfv(target, level, pname, params);
    }

    @Override public float glGetTexLevelParameterf(int target, int level, int pname) {
        return org.lwjgl.opengl.GL11.glGetTexLevelParameterf(target, level, pname);
    }

    @Override public void nglGetTexParameteriv(int target, int pname, long params) {
        org.lwjgl.opengl.GL11.nglGetTexParameteriv(target, pname, params);
    }

    @Override public void glGetTexParameteriv(int target, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL11.glGetTexParameteriv(target, pname, params);
    }

    @Override public void glGetTexParameteriv(int target, int pname, int[] params) {
        org.lwjgl.opengl.GL11.glGetTexParameteriv(target, pname, params);
    }

    @Override public int glGetTexParameteri(int target, int pname) {
        return org.lwjgl.opengl.GL11.glGetTexParameteri(target, pname);
    }

    @Override public void nglGetTexParameterfv(int target, int pname, long params) {
        org.lwjgl.opengl.GL11.nglGetTexParameterfv(target, pname, params);
    }

    @Override public void glGetTexParameterfv(int target, int pname, FloatBuffer params) {
        org.lwjgl.opengl.GL11.glGetTexParameterfv(target, pname, params);
    }

    @Override public void glGetTexParameterfv(int target, int pname, float[] params) {
        org.lwjgl.opengl.GL11.glGetTexParameterfv(target, pname, params);
    }

    @Override public float glGetTexParameterf(int target, int pname) {
        return org.lwjgl.opengl.GL11.glGetTexParameterf(target, pname);
    }

    @Override public void glHint(int target, int hint) {
        org.lwjgl.opengl.GL11.glHint(target, hint);
    }

    @Override public void glIndexi(int index) {
        org.lwjgl.opengl.GL11.glIndexi(index);
    }

    @Override public void glIndexub(byte index) {
        org.lwjgl.opengl.GL11.glIndexub(index);
    }

    @Override public void glIndexs(short index) {
        org.lwjgl.opengl.GL11.glIndexs(index);
    }

    @Override public void glIndexf(float index) {
        org.lwjgl.opengl.GL11.glIndexf(index);
    }

    @Override public void glIndexd(double index) {
        org.lwjgl.opengl.GL11.glIndexd(index);
    }

    @Override public void nglIndexiv(long index) {
        org.lwjgl.opengl.GL11.nglIndexiv(index);
    }

    @Override public void glIndexiv(IntBuffer index) {
        org.lwjgl.opengl.GL11.glIndexiv(index);
    }

    @Override public void glIndexiv(int[] index) {
        org.lwjgl.opengl.GL11.glIndexiv(index);
    }

    @Override public void nglIndexubv(long index) {
        org.lwjgl.opengl.GL11.nglIndexubv(index);
    }

    @Override public void glIndexubv(ByteBuffer index) {
        org.lwjgl.opengl.GL11.glIndexubv(index);
    }

    @Override public void nglIndexsv(long index) {
        org.lwjgl.opengl.GL11.nglIndexsv(index);
    }

    @Override public void glIndexsv(ShortBuffer index) {
        org.lwjgl.opengl.GL11.glIndexsv(index);
    }

    @Override public void glIndexsv(short[] index) {
        org.lwjgl.opengl.GL11.glIndexsv(index);
    }

    @Override public void nglIndexfv(long index) {
        org.lwjgl.opengl.GL11.nglIndexfv(index);
    }

    @Override public void glIndexfv(FloatBuffer index) {
        org.lwjgl.opengl.GL11.glIndexfv(index);
    }

    @Override public void glIndexfv(float[] index) {
        org.lwjgl.opengl.GL11.glIndexfv(index);
    }

    @Override public void nglIndexdv(long index) {
        org.lwjgl.opengl.GL11.nglIndexdv(index);
    }

    @Override public void glIndexdv(DoubleBuffer index) {
        org.lwjgl.opengl.GL11.glIndexdv(index);
    }

    @Override public void glIndexdv(double[] index) {
        org.lwjgl.opengl.GL11.glIndexdv(index);
    }

    @Override public void glIndexMask(int mask) {
        org.lwjgl.opengl.GL11.glIndexMask(mask);
    }

    @Override public void nglIndexPointer(int type, int stride, long pointer) {
        org.lwjgl.opengl.GL11.nglIndexPointer(type, stride, pointer);
    }

    @Override public void glIndexPointer(int type, int stride, ByteBuffer pointer) {
        org.lwjgl.opengl.GL11.glIndexPointer(type, stride, pointer);
    }

    @Override public void glIndexPointer(int type, int stride, long pointer) {
        org.lwjgl.opengl.GL11.glIndexPointer(type, stride, pointer);
    }

    @Override public void glIndexPointer(int stride, ByteBuffer pointer) {
        org.lwjgl.opengl.GL11.glIndexPointer(stride, pointer);
    }

    @Override public void glIndexPointer(int stride, ShortBuffer pointer) {
        org.lwjgl.opengl.GL11.glIndexPointer(stride, pointer);
    }

    @Override public void glIndexPointer(int stride, IntBuffer pointer) {
        org.lwjgl.opengl.GL11.glIndexPointer(stride, pointer);
    }

    @Override public void glInitNames() {
        org.lwjgl.opengl.GL11.glInitNames();
    }

    @Override public void nglInterleavedArrays(int format, int stride, long pointer) {
        org.lwjgl.opengl.GL11.nglInterleavedArrays(format, stride, pointer);
    }

    @Override public void glInterleavedArrays(int format, int stride, ByteBuffer pointer) {
        org.lwjgl.opengl.GL11.glInterleavedArrays(format, stride, pointer);
    }

    @Override public void glInterleavedArrays(int format, int stride, long pointer) {
        org.lwjgl.opengl.GL11.glInterleavedArrays(format, stride, pointer);
    }

    @Override public void glInterleavedArrays(int format, int stride, ShortBuffer pointer) {
        org.lwjgl.opengl.GL11.glInterleavedArrays(format, stride, pointer);
    }

    @Override public void glInterleavedArrays(int format, int stride, IntBuffer pointer) {
        org.lwjgl.opengl.GL11.glInterleavedArrays(format, stride, pointer);
    }

    @Override public void glInterleavedArrays(int format, int stride, FloatBuffer pointer) {
        org.lwjgl.opengl.GL11.glInterleavedArrays(format, stride, pointer);
    }

    @Override public void glInterleavedArrays(int format, int stride, DoubleBuffer pointer) {
        org.lwjgl.opengl.GL11.glInterleavedArrays(format, stride, pointer);
    }

    @Override public void glInterleavedArrays(int format, int stride, short[] pointer) {
        org.lwjgl.opengl.GL11.glInterleavedArrays(format, stride, pointer);
    }

    @Override public void glInterleavedArrays(int format, int stride, int[] pointer) {
        org.lwjgl.opengl.GL11.glInterleavedArrays(format, stride, pointer);
    }

    @Override public void glInterleavedArrays(int format, int stride, float[] pointer) {
        org.lwjgl.opengl.GL11.glInterleavedArrays(format, stride, pointer);
    }

    @Override public void glInterleavedArrays(int format, int stride, double[] pointer) {
        org.lwjgl.opengl.GL11.glInterleavedArrays(format, stride, pointer);
    }

    @Override public boolean glIsEnabled(int cap) {
        return org.lwjgl.opengl.GL11.glIsEnabled(cap);
    }

    @Override public boolean glIsList(int list) {
        return org.lwjgl.opengl.GL11.glIsList(list);
    }

    @Override public boolean glIsTexture(int texture) {
        return org.lwjgl.opengl.GL11.glIsTexture(texture);
    }

    @Override public void glLightModeli(int pname, int param) {
        org.lwjgl.opengl.GL11.glLightModeli(pname, param);
    }

    @Override public void glLightModelf(int pname, float param) {
        org.lwjgl.opengl.GL11.glLightModelf(pname, param);
    }

    @Override public void nglLightModeliv(int pname, long params) {
        org.lwjgl.opengl.GL11.nglLightModeliv(pname, params);
    }

    @Override public void glLightModeliv(int pname, IntBuffer params) {
        org.lwjgl.opengl.GL11.glLightModeliv(pname, params);
    }

    @Override public void glLightModeliv(int pname, int[] params) {
        org.lwjgl.opengl.GL11.glLightModeliv(pname, params);
    }

    @Override public void nglLightModelfv(int pname, long params) {
        org.lwjgl.opengl.GL11.nglLightModelfv(pname, params);
    }

    @Override public void glLightModelfv(int pname, FloatBuffer params) {
        org.lwjgl.opengl.GL11.glLightModelfv(pname, params);
    }

    @Override public void glLightModelfv(int pname, float[] params) {
        org.lwjgl.opengl.GL11.glLightModelfv(pname, params);
    }

    @Override public void glLighti(int light, int pname, int param) {
        org.lwjgl.opengl.GL11.glLighti(light, pname, param);
    }

    @Override public void glLightf(int light, int pname, float param) {
        org.lwjgl.opengl.GL11.glLightf(light, pname, param);
    }

    @Override public void nglLightiv(int light, int pname, long params) {
        org.lwjgl.opengl.GL11.nglLightiv(light, pname, params);
    }

    @Override public void glLightiv(int light, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL11.glLightiv(light, pname, params);
    }

    @Override public void glLightiv(int light, int pname, int[] params) {
        org.lwjgl.opengl.GL11.glLightiv(light, pname, params);
    }

    @Override public void nglLightfv(int light, int pname, long params) {
        org.lwjgl.opengl.GL11.nglLightfv(light, pname, params);
    }

    @Override public void glLightfv(int light, int pname, FloatBuffer params) {
        org.lwjgl.opengl.GL11.glLightfv(light, pname, params);
    }

    @Override public void glLightfv(int light, int pname, float[] params) {
        org.lwjgl.opengl.GL11.glLightfv(light, pname, params);
    }

    @Override public void glLineStipple(int factor, short pattern) {
        org.lwjgl.opengl.GL11.glLineStipple(factor, pattern);
    }

    @Override public void glLineWidth(float width) {
        org.lwjgl.opengl.GL11.glLineWidth(width);
    }

    @Override public void glListBase(int base) {
        org.lwjgl.opengl.GL11.glListBase(base);
    }

    @Override public void nglLoadMatrixf(long m) {
        org.lwjgl.opengl.GL11.nglLoadMatrixf(m);
    }

    @Override public void glLoadMatrixf(FloatBuffer m) {
        org.lwjgl.opengl.GL11.glLoadMatrixf(m);
    }

    @Override public void glLoadMatrixf(float[] m) {
        org.lwjgl.opengl.GL11.glLoadMatrixf(m);
    }

    @Override public void nglLoadMatrixd(long m) {
        org.lwjgl.opengl.GL11.nglLoadMatrixd(m);
    }

    @Override public void glLoadMatrixd(DoubleBuffer m) {
        org.lwjgl.opengl.GL11.glLoadMatrixd(m);
    }

    @Override public void glLoadMatrixd(double[] m) {
        org.lwjgl.opengl.GL11.glLoadMatrixd(m);
    }

    @Override public void glLoadIdentity() {
        org.lwjgl.opengl.GL11.glLoadIdentity();
    }

    @Override public void glLoadName(int name) {
        org.lwjgl.opengl.GL11.glLoadName(name);
    }

    @Override public void glLogicOp(int op) {
        org.lwjgl.opengl.GL11.glLogicOp(op);
    }

    @Override public void nglMap1f(int target, float u1, float u2, int stride, int order, long points) {
        org.lwjgl.opengl.GL11.nglMap1f(target, u1, u2, stride, order, points);
    }

    @Override public void glMap1f(int target, float u1, float u2, int stride, int order, FloatBuffer points) {
        org.lwjgl.opengl.GL11.glMap1f(target, u1, u2, stride, order, points);
    }

    @Override public void glMap1f(int target, float u1, float u2, int stride, int order, float[] points) {
        org.lwjgl.opengl.GL11.glMap1f(target, u1, u2, stride, order, points);
    }

    @Override public void nglMap1d(int target, double u1, double u2, int stride, int order, long points) {
        org.lwjgl.opengl.GL11.nglMap1d(target, u1, u2, stride, order, points);
    }

    @Override public void glMap1d(int target, double u1, double u2, int stride, int order, DoubleBuffer points) {
        org.lwjgl.opengl.GL11.glMap1d(target, u1, u2, stride, order, points);
    }

    @Override public void glMap1d(int target, double u1, double u2, int stride, int order, double[] points) {
        org.lwjgl.opengl.GL11.glMap1d(target, u1, u2, stride, order, points);
    }

    @Override public void nglMap2f(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, long points) {
        org.lwjgl.opengl.GL11.nglMap2f(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
    }

    @Override public void glMap2f(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, FloatBuffer points) {
        org.lwjgl.opengl.GL11.glMap2f(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
    }

    @Override public void glMap2f(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, float[] points) {
        org.lwjgl.opengl.GL11.glMap2f(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
    }

    @Override public void nglMap2d(int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, long points) {
        org.lwjgl.opengl.GL11.nglMap2d(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
    }

    @Override public void glMap2d(int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, DoubleBuffer points) {
        org.lwjgl.opengl.GL11.glMap2d(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
    }

    @Override public void glMap2d(int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, double[] points) {
        org.lwjgl.opengl.GL11.glMap2d(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
    }

    @Override public void glMapGrid1f(int n, float u1, float u2) {
        org.lwjgl.opengl.GL11.glMapGrid1f(n, u1, u2);
    }

    @Override public void glMapGrid1d(int n, double u1, double u2) {
        org.lwjgl.opengl.GL11.glMapGrid1d(n, u1, u2);
    }

    @Override public void glMapGrid2f(int un, float u1, float u2, int vn, float v1, float v2) {
        org.lwjgl.opengl.GL11.glMapGrid2f(un, u1, u2, vn, v1, v2);
    }

    @Override public void glMapGrid2d(int un, double u1, double u2, int vn, double v1, double v2) {
        org.lwjgl.opengl.GL11.glMapGrid2d(un, u1, u2, vn, v1, v2);
    }

    @Override public void glMateriali(int face, int pname, int param) {
        org.lwjgl.opengl.GL11.glMateriali(face, pname, param);
    }

    @Override public void glMaterialf(int face, int pname, float param) {
        org.lwjgl.opengl.GL11.glMaterialf(face, pname, param);
    }

    @Override public void nglMaterialiv(int face, int pname, long params) {
        org.lwjgl.opengl.GL11.nglMaterialiv(face, pname, params);
    }

    @Override public void glMaterialiv(int face, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL11.glMaterialiv(face, pname, params);
    }

    @Override public void glMaterialiv(int face, int pname, int[] params) {
        org.lwjgl.opengl.GL11.glMaterialiv(face, pname, params);
    }

    @Override public void nglMaterialfv(int face, int pname, long params) {
        org.lwjgl.opengl.GL11.nglMaterialfv(face, pname, params);
    }

    @Override public void glMaterialfv(int face, int pname, FloatBuffer params) {
        org.lwjgl.opengl.GL11.glMaterialfv(face, pname, params);
    }

    @Override public void glMaterialfv(int face, int pname, float[] params) {
        org.lwjgl.opengl.GL11.glMaterialfv(face, pname, params);
    }

    @Override public void glMatrixMode(int mode) {
        org.lwjgl.opengl.GL11.glMatrixMode(mode);
    }

    @Override public void nglMultMatrixf(long m) {
        org.lwjgl.opengl.GL11.nglMultMatrixf(m);
    }

    @Override public void glMultMatrixf(FloatBuffer m) {
        org.lwjgl.opengl.GL11.glMultMatrixf(m);
    }

    @Override public void glMultMatrixf(float[] m) {
        org.lwjgl.opengl.GL11.glMultMatrixf(m);
    }

    @Override public void nglMultMatrixd(long m) {
        org.lwjgl.opengl.GL11.nglMultMatrixd(m);
    }

    @Override public void glMultMatrixd(DoubleBuffer m) {
        org.lwjgl.opengl.GL11.glMultMatrixd(m);
    }

    @Override public void glMultMatrixd(double[] m) {
        org.lwjgl.opengl.GL11.glMultMatrixd(m);
    }

    @Override public void glFrustum(double l, double r, double b, double t, double n, double f) {
        org.lwjgl.opengl.GL11.glFrustum(l, r, b, t, n, f);
    }

    @Override public void glNewList(int n, int mode) {
        org.lwjgl.opengl.GL11.glNewList(n, mode);
    }

    @Override public void glEndList() {
        org.lwjgl.opengl.GL11.glEndList();
    }

    @Override public void glNormal3f(float nx, float ny, float nz) {
        org.lwjgl.opengl.GL11.glNormal3f(nx, ny, nz);
    }

    @Override public void glNormal3b(byte nx, byte ny, byte nz) {
        org.lwjgl.opengl.GL11.glNormal3b(nx, ny, nz);
    }

    @Override public void glNormal3s(short nx, short ny, short nz) {
        org.lwjgl.opengl.GL11.glNormal3s(nx, ny, nz);
    }

    @Override public void glNormal3i(int nx, int ny, int nz) {
        org.lwjgl.opengl.GL11.glNormal3i(nx, ny, nz);
    }

    @Override public void glNormal3d(double nx, double ny, double nz) {
        org.lwjgl.opengl.GL11.glNormal3d(nx, ny, nz);
    }

    @Override public void nglNormal3fv(long v) {
        org.lwjgl.opengl.GL11.nglNormal3fv(v);
    }

    @Override public void glNormal3fv(FloatBuffer v) {
        org.lwjgl.opengl.GL11.glNormal3fv(v);
    }

    @Override public void glNormal3fv(float[] v) {
        org.lwjgl.opengl.GL11.glNormal3fv(v);
    }

    @Override public void nglNormal3bv(long v) {
        org.lwjgl.opengl.GL11.nglNormal3bv(v);
    }

    @Override public void glNormal3bv(ByteBuffer v) {
        org.lwjgl.opengl.GL11.glNormal3bv(v);
    }

    @Override public void nglNormal3sv(long v) {
        org.lwjgl.opengl.GL11.nglNormal3sv(v);
    }

    @Override public void glNormal3sv(ShortBuffer v) {
        org.lwjgl.opengl.GL11.glNormal3sv(v);
    }

    @Override public void glNormal3sv(short[] v) {
        org.lwjgl.opengl.GL11.glNormal3sv(v);
    }

    @Override public void nglNormal3iv(long v) {
        org.lwjgl.opengl.GL11.nglNormal3iv(v);
    }

    @Override public void glNormal3iv(IntBuffer v) {
        org.lwjgl.opengl.GL11.glNormal3iv(v);
    }

    @Override public void glNormal3iv(int[] v) {
        org.lwjgl.opengl.GL11.glNormal3iv(v);
    }

    @Override public void nglNormal3dv(long v) {
        org.lwjgl.opengl.GL11.nglNormal3dv(v);
    }

    @Override public void glNormal3dv(DoubleBuffer v) {
        org.lwjgl.opengl.GL11.glNormal3dv(v);
    }

    @Override public void glNormal3dv(double[] v) {
        org.lwjgl.opengl.GL11.glNormal3dv(v);
    }

    @Override public void nglNormalPointer(int type, int stride, long pointer) {
        org.lwjgl.opengl.GL11.nglNormalPointer(type, stride, pointer);
    }

    @Override public void glNormalPointer(int type, int stride, ByteBuffer pointer) {
        org.lwjgl.opengl.GL11.glNormalPointer(type, stride, pointer);
    }

    @Override public void glNormalPointer(int type, int stride, long pointer) {
        org.lwjgl.opengl.GL11.glNormalPointer(type, stride, pointer);
    }

    @Override public void glNormalPointer(int type, int stride, ShortBuffer pointer) {
        org.lwjgl.opengl.GL11.glNormalPointer(type, stride, pointer);
    }

    @Override public void glNormalPointer(int type, int stride, IntBuffer pointer) {
        org.lwjgl.opengl.GL11.glNormalPointer(type, stride, pointer);
    }

    @Override public void glNormalPointer(int type, int stride, FloatBuffer pointer) {
        org.lwjgl.opengl.GL11.glNormalPointer(type, stride, pointer);
    }

    @Override public void glOrtho(double l, double r, double b, double t, double n, double f) {
        org.lwjgl.opengl.GL11.glOrtho(l, r, b, t, n, f);
    }

    @Override public void glPassThrough(float token) {
        org.lwjgl.opengl.GL11.glPassThrough(token);
    }

    @Override public void nglPixelMapfv(int map, int size, long values) {
        org.lwjgl.opengl.GL11.nglPixelMapfv(map, size, values);
    }

    @Override public void glPixelMapfv(int map, int size, long values) {
        org.lwjgl.opengl.GL11.glPixelMapfv(map, size, values);
    }

    @Override public void glPixelMapfv(int map, FloatBuffer values) {
        org.lwjgl.opengl.GL11.glPixelMapfv(map, values);
    }

    @Override public void glPixelMapfv(int map, float[] values) {
        org.lwjgl.opengl.GL11.glPixelMapfv(map, values);
    }

    @Override public void nglPixelMapusv(int map, int size, long values) {
        org.lwjgl.opengl.GL11.nglPixelMapusv(map, size, values);
    }

    @Override public void glPixelMapusv(int map, int size, long values) {
        org.lwjgl.opengl.GL11.glPixelMapusv(map, size, values);
    }

    @Override public void glPixelMapusv(int map, ShortBuffer values) {
        org.lwjgl.opengl.GL11.glPixelMapusv(map, values);
    }

    @Override public void glPixelMapusv(int map, short[] values) {
        org.lwjgl.opengl.GL11.glPixelMapusv(map, values);
    }

    @Override public void nglPixelMapuiv(int map, int size, long values) {
        org.lwjgl.opengl.GL11.nglPixelMapuiv(map, size, values);
    }

    @Override public void glPixelMapuiv(int map, int size, long values) {
        org.lwjgl.opengl.GL11.glPixelMapuiv(map, size, values);
    }

    @Override public void glPixelMapuiv(int map, IntBuffer values) {
        org.lwjgl.opengl.GL11.glPixelMapuiv(map, values);
    }

    @Override public void glPixelMapuiv(int map, int[] values) {
        org.lwjgl.opengl.GL11.glPixelMapuiv(map, values);
    }

    @Override public void glPixelStorei(int pname, int param) {
        org.lwjgl.opengl.GL11.glPixelStorei(pname, param);
    }

    @Override public void glPixelStoref(int pname, float param) {
        org.lwjgl.opengl.GL11.glPixelStoref(pname, param);
    }

    @Override public void glPixelTransferi(int pname, int param) {
        org.lwjgl.opengl.GL11.glPixelTransferi(pname, param);
    }

    @Override public void glPixelTransferf(int pname, float param) {
        org.lwjgl.opengl.GL11.glPixelTransferf(pname, param);
    }

    @Override public void glPixelZoom(float xfactor, float yfactor) {
        org.lwjgl.opengl.GL11.glPixelZoom(xfactor, yfactor);
    }

    @Override public void glPointSize(float size) {
        org.lwjgl.opengl.GL11.glPointSize(size);
    }

    @Override public void glPolygonMode(int face, int mode) {
        org.lwjgl.opengl.GL11.glPolygonMode(face, mode);
    }

    @Override public void glPolygonOffset(float factor, float units) {
        org.lwjgl.opengl.GL11.glPolygonOffset(factor, units);
    }

    @Override public void nglPolygonStipple(long pattern) {
        org.lwjgl.opengl.GL11.nglPolygonStipple(pattern);
    }

    @Override public void glPolygonStipple(ByteBuffer pattern) {
        org.lwjgl.opengl.GL11.glPolygonStipple(pattern);
    }

    @Override public void glPolygonStipple(long pattern) {
        org.lwjgl.opengl.GL11.glPolygonStipple(pattern);
    }

    @Override public void glPushAttrib(int mask) {
        org.lwjgl.opengl.GL11.glPushAttrib(mask);
    }

    @Override public void glPushClientAttrib(int mask) {
        org.lwjgl.opengl.GL11.glPushClientAttrib(mask);
    }

    @Override public void glPopAttrib() {
        org.lwjgl.opengl.GL11.glPopAttrib();
    }

    @Override public void glPopClientAttrib() {
        org.lwjgl.opengl.GL11.glPopClientAttrib();
    }

    @Override public void glPopMatrix() {
        org.lwjgl.opengl.GL11.glPopMatrix();
    }

    @Override public void glPopName() {
        org.lwjgl.opengl.GL11.glPopName();
    }

    @Override public void nglPrioritizeTextures(int n, long textures, long priorities) {
        org.lwjgl.opengl.GL11.nglPrioritizeTextures(n, textures, priorities);
    }

    @Override public void glPrioritizeTextures(IntBuffer textures, FloatBuffer priorities) {
        org.lwjgl.opengl.GL11.glPrioritizeTextures(textures, priorities);
    }

    @Override public void glPrioritizeTextures(int[] textures, float[] priorities) {
        org.lwjgl.opengl.GL11.glPrioritizeTextures(textures, priorities);
    }

    @Override public void glPushMatrix() {
        org.lwjgl.opengl.GL11.glPushMatrix();
    }

    @Override public void glPushName(int name) {
        org.lwjgl.opengl.GL11.glPushName(name);
    }

    @Override public void glRasterPos2i(int x, int y) {
        org.lwjgl.opengl.GL11.glRasterPos2i(x, y);
    }

    @Override public void glRasterPos2s(short x, short y) {
        org.lwjgl.opengl.GL11.glRasterPos2s(x, y);
    }

    @Override public void glRasterPos2f(float x, float y) {
        org.lwjgl.opengl.GL11.glRasterPos2f(x, y);
    }

    @Override public void glRasterPos2d(double x, double y) {
        org.lwjgl.opengl.GL11.glRasterPos2d(x, y);
    }

    @Override public void nglRasterPos2iv(long coords) {
        org.lwjgl.opengl.GL11.nglRasterPos2iv(coords);
    }

    @Override public void glRasterPos2iv(IntBuffer coords) {
        org.lwjgl.opengl.GL11.glRasterPos2iv(coords);
    }

    @Override public void glRasterPos2iv(int[] coords) {
        org.lwjgl.opengl.GL11.glRasterPos2iv(coords);
    }

    @Override public void nglRasterPos2sv(long coords) {
        org.lwjgl.opengl.GL11.nglRasterPos2sv(coords);
    }

    @Override public void glRasterPos2sv(ShortBuffer coords) {
        org.lwjgl.opengl.GL11.glRasterPos2sv(coords);
    }

    @Override public void glRasterPos2sv(short[] coords) {
        org.lwjgl.opengl.GL11.glRasterPos2sv(coords);
    }

    @Override public void nglRasterPos2fv(long coords) {
        org.lwjgl.opengl.GL11.nglRasterPos2fv(coords);
    }

    @Override public void glRasterPos2fv(FloatBuffer coords) {
        org.lwjgl.opengl.GL11.glRasterPos2fv(coords);
    }

    @Override public void glRasterPos2fv(float[] coords) {
        org.lwjgl.opengl.GL11.glRasterPos2fv(coords);
    }

    @Override public void nglRasterPos2dv(long coords) {
        org.lwjgl.opengl.GL11.nglRasterPos2dv(coords);
    }

    @Override public void glRasterPos2dv(DoubleBuffer coords) {
        org.lwjgl.opengl.GL11.glRasterPos2dv(coords);
    }

    @Override public void glRasterPos2dv(double[] coords) {
        org.lwjgl.opengl.GL11.glRasterPos2dv(coords);
    }

    @Override public void glRasterPos3i(int x, int y, int z) {
        org.lwjgl.opengl.GL11.glRasterPos3i(x, y, z);
    }

    @Override public void glRasterPos3s(short x, short y, short z) {
        org.lwjgl.opengl.GL11.glRasterPos3s(x, y, z);
    }

    @Override public void glRasterPos3f(float x, float y, float z) {
        org.lwjgl.opengl.GL11.glRasterPos3f(x, y, z);
    }

    @Override public void glRasterPos3d(double x, double y, double z) {
        org.lwjgl.opengl.GL11.glRasterPos3d(x, y, z);
    }

    @Override public void nglRasterPos3iv(long coords) {
        org.lwjgl.opengl.GL11.nglRasterPos3iv(coords);
    }

    @Override public void glRasterPos3iv(IntBuffer coords) {
        org.lwjgl.opengl.GL11.glRasterPos3iv(coords);
    }

    @Override public void glRasterPos3iv(int[] coords) {
        org.lwjgl.opengl.GL11.glRasterPos3iv(coords);
    }

    @Override public void nglRasterPos3sv(long coords) {
        org.lwjgl.opengl.GL11.nglRasterPos3sv(coords);
    }

    @Override public void glRasterPos3sv(ShortBuffer coords) {
        org.lwjgl.opengl.GL11.glRasterPos3sv(coords);
    }

    @Override public void glRasterPos3sv(short[] coords) {
        org.lwjgl.opengl.GL11.glRasterPos3sv(coords);
    }

    @Override public void nglRasterPos3fv(long coords) {
        org.lwjgl.opengl.GL11.nglRasterPos3fv(coords);
    }

    @Override public void glRasterPos3fv(FloatBuffer coords) {
        org.lwjgl.opengl.GL11.glRasterPos3fv(coords);
    }

    @Override public void glRasterPos3fv(float[] coords) {
        org.lwjgl.opengl.GL11.glRasterPos3fv(coords);
    }

    @Override public void nglRasterPos3dv(long coords) {
        org.lwjgl.opengl.GL11.nglRasterPos3dv(coords);
    }

    @Override public void glRasterPos3dv(DoubleBuffer coords) {
        org.lwjgl.opengl.GL11.glRasterPos3dv(coords);
    }

    @Override public void glRasterPos3dv(double[] coords) {
        org.lwjgl.opengl.GL11.glRasterPos3dv(coords);
    }

    @Override public void glRasterPos4i(int x, int y, int z, int w) {
        org.lwjgl.opengl.GL11.glRasterPos4i(x, y, z, w);
    }

    @Override public void glRasterPos4s(short x, short y, short z, short w) {
        org.lwjgl.opengl.GL11.glRasterPos4s(x, y, z, w);
    }

    @Override public void glRasterPos4f(float x, float y, float z, float w) {
        org.lwjgl.opengl.GL11.glRasterPos4f(x, y, z, w);
    }

    @Override public void glRasterPos4d(double x, double y, double z, double w) {
        org.lwjgl.opengl.GL11.glRasterPos4d(x, y, z, w);
    }

    @Override public void nglRasterPos4iv(long coords) {
        org.lwjgl.opengl.GL11.nglRasterPos4iv(coords);
    }

    @Override public void glRasterPos4iv(IntBuffer coords) {
        org.lwjgl.opengl.GL11.glRasterPos4iv(coords);
    }

    @Override public void glRasterPos4iv(int[] coords) {
        org.lwjgl.opengl.GL11.glRasterPos4iv(coords);
    }

    @Override public void nglRasterPos4sv(long coords) {
        org.lwjgl.opengl.GL11.nglRasterPos4sv(coords);
    }

    @Override public void glRasterPos4sv(ShortBuffer coords) {
        org.lwjgl.opengl.GL11.glRasterPos4sv(coords);
    }

    @Override public void glRasterPos4sv(short[] coords) {
        org.lwjgl.opengl.GL11.glRasterPos4sv(coords);
    }

    @Override public void nglRasterPos4fv(long coords) {
        org.lwjgl.opengl.GL11.nglRasterPos4fv(coords);
    }

    @Override public void glRasterPos4fv(FloatBuffer coords) {
        org.lwjgl.opengl.GL11.glRasterPos4fv(coords);
    }

    @Override public void glRasterPos4fv(float[] coords) {
        org.lwjgl.opengl.GL11.glRasterPos4fv(coords);
    }

    @Override public void nglRasterPos4dv(long coords) {
        org.lwjgl.opengl.GL11.nglRasterPos4dv(coords);
    }

    @Override public void glRasterPos4dv(DoubleBuffer coords) {
        org.lwjgl.opengl.GL11.glRasterPos4dv(coords);
    }

    @Override public void glRasterPos4dv(double[] coords) {
        org.lwjgl.opengl.GL11.glRasterPos4dv(coords);
    }

    @Override public void glReadBuffer(int src) {
        org.lwjgl.opengl.GL11.glReadBuffer(src);
    }

    @Override public void nglReadPixels(int x, int y, int width, int height, int format, int type, long pixels) {
        org.lwjgl.opengl.GL11.nglReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadPixels(int x, int y, int width, int height, int format, int type, ByteBuffer pixels) {
        org.lwjgl.opengl.GL11.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadPixels(int x, int y, int width, int height, int format, int type, long pixels) {
        org.lwjgl.opengl.GL11.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadPixels(int x, int y, int width, int height, int format, int type, ShortBuffer pixels) {
        org.lwjgl.opengl.GL11.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadPixels(int x, int y, int width, int height, int format, int type, IntBuffer pixels) {
        org.lwjgl.opengl.GL11.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadPixels(int x, int y, int width, int height, int format, int type, FloatBuffer pixels) {
        org.lwjgl.opengl.GL11.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadPixels(int x, int y, int width, int height, int format, int type, short[] pixels) {
        org.lwjgl.opengl.GL11.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadPixels(int x, int y, int width, int height, int format, int type, int[] pixels) {
        org.lwjgl.opengl.GL11.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadPixels(int x, int y, int width, int height, int format, int type, float[] pixels) {
        org.lwjgl.opengl.GL11.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glRecti(int x1, int y1, int x2, int y2) {
        org.lwjgl.opengl.GL11.glRecti(x1, y1, x2, y2);
    }

    @Override public void glRects(short x1, short y1, short x2, short y2) {
        org.lwjgl.opengl.GL11.glRects(x1, y1, x2, y2);
    }

    @Override public void glRectf(float x1, float y1, float x2, float y2) {
        org.lwjgl.opengl.GL11.glRectf(x1, y1, x2, y2);
    }

    @Override public void glRectd(double x1, double y1, double x2, double y2) {
        org.lwjgl.opengl.GL11.glRectd(x1, y1, x2, y2);
    }

    @Override public void nglRectiv(long v1, long v2) {
        org.lwjgl.opengl.GL11.nglRectiv(v1, v2);
    }

    @Override public void glRectiv(IntBuffer v1, IntBuffer v2) {
        org.lwjgl.opengl.GL11.glRectiv(v1, v2);
    }

    @Override public void glRectiv(int[] v1, int[] v2) {
        org.lwjgl.opengl.GL11.glRectiv(v1, v2);
    }

    @Override public void nglRectsv(long v1, long v2) {
        org.lwjgl.opengl.GL11.nglRectsv(v1, v2);
    }

    @Override public void glRectsv(ShortBuffer v1, ShortBuffer v2) {
        org.lwjgl.opengl.GL11.glRectsv(v1, v2);
    }

    @Override public void glRectsv(short[] v1, short[] v2) {
        org.lwjgl.opengl.GL11.glRectsv(v1, v2);
    }

    @Override public void nglRectfv(long v1, long v2) {
        org.lwjgl.opengl.GL11.nglRectfv(v1, v2);
    }

    @Override public void glRectfv(FloatBuffer v1, FloatBuffer v2) {
        org.lwjgl.opengl.GL11.glRectfv(v1, v2);
    }

    @Override public void glRectfv(float[] v1, float[] v2) {
        org.lwjgl.opengl.GL11.glRectfv(v1, v2);
    }

    @Override public void nglRectdv(long v1, long v2) {
        org.lwjgl.opengl.GL11.nglRectdv(v1, v2);
    }

    @Override public void glRectdv(DoubleBuffer v1, DoubleBuffer v2) {
        org.lwjgl.opengl.GL11.glRectdv(v1, v2);
    }

    @Override public void glRectdv(double[] v1, double[] v2) {
        org.lwjgl.opengl.GL11.glRectdv(v1, v2);
    }

    @Override public int glRenderMode(int mode) {
        return org.lwjgl.opengl.GL11.glRenderMode(mode);
    }

    @Override public void glRotatef(float angle, float x, float y, float z) {
        org.lwjgl.opengl.GL11.glRotatef(angle, x, y, z);
    }

    @Override public void glRotated(double angle, double x, double y, double z) {
        org.lwjgl.opengl.GL11.glRotated(angle, x, y, z);
    }

    @Override public void glScalef(float x, float y, float z) {
        org.lwjgl.opengl.GL11.glScalef(x, y, z);
    }

    @Override public void glScaled(double x, double y, double z) {
        org.lwjgl.opengl.GL11.glScaled(x, y, z);
    }

    @Override public void glScissor(int x, int y, int width, int height) {
        org.lwjgl.opengl.GL11.glScissor(x, y, width, height);
    }

    @Override public void nglSelectBuffer(int size, long buffer) {
        org.lwjgl.opengl.GL11.nglSelectBuffer(size, buffer);
    }

    @Override public void glSelectBuffer(IntBuffer buffer) {
        org.lwjgl.opengl.GL11.glSelectBuffer(buffer);
    }

    @Override public void glSelectBuffer(int[] buffer) {
        org.lwjgl.opengl.GL11.glSelectBuffer(buffer);
    }

    @Override public void glShadeModel(int mode) {
        org.lwjgl.opengl.GL11.glShadeModel(mode);
    }

    @Override public void glStencilFunc(int func, int ref, int mask) {
        org.lwjgl.opengl.GL11.glStencilFunc(func, ref, mask);
    }

    @Override public void glStencilMask(int mask) {
        org.lwjgl.opengl.GL11.glStencilMask(mask);
    }

    @Override public void glStencilOp(int sfail, int dpfail, int dppass) {
        org.lwjgl.opengl.GL11.glStencilOp(sfail, dpfail, dppass);
    }

    @Override public void glTexCoord1f(float s) {
        org.lwjgl.opengl.GL11.glTexCoord1f(s);
    }

    @Override public void glTexCoord1s(short s) {
        org.lwjgl.opengl.GL11.glTexCoord1s(s);
    }

    @Override public void glTexCoord1i(int s) {
        org.lwjgl.opengl.GL11.glTexCoord1i(s);
    }

    @Override public void glTexCoord1d(double s) {
        org.lwjgl.opengl.GL11.glTexCoord1d(s);
    }

    @Override public void nglTexCoord1fv(long v) {
        org.lwjgl.opengl.GL11.nglTexCoord1fv(v);
    }

    @Override public void glTexCoord1fv(FloatBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord1fv(v);
    }

    @Override public void glTexCoord1fv(float[] v) {
        org.lwjgl.opengl.GL11.glTexCoord1fv(v);
    }

    @Override public void nglTexCoord1sv(long v) {
        org.lwjgl.opengl.GL11.nglTexCoord1sv(v);
    }

    @Override public void glTexCoord1sv(ShortBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord1sv(v);
    }

    @Override public void glTexCoord1sv(short[] v) {
        org.lwjgl.opengl.GL11.glTexCoord1sv(v);
    }

    @Override public void nglTexCoord1iv(long v) {
        org.lwjgl.opengl.GL11.nglTexCoord1iv(v);
    }

    @Override public void glTexCoord1iv(IntBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord1iv(v);
    }

    @Override public void glTexCoord1iv(int[] v) {
        org.lwjgl.opengl.GL11.glTexCoord1iv(v);
    }

    @Override public void nglTexCoord1dv(long v) {
        org.lwjgl.opengl.GL11.nglTexCoord1dv(v);
    }

    @Override public void glTexCoord1dv(DoubleBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord1dv(v);
    }

    @Override public void glTexCoord1dv(double[] v) {
        org.lwjgl.opengl.GL11.glTexCoord1dv(v);
    }

    @Override public void glTexCoord2f(float s, float t) {
        org.lwjgl.opengl.GL11.glTexCoord2f(s, t);
    }

    @Override public void glTexCoord2s(short s, short t) {
        org.lwjgl.opengl.GL11.glTexCoord2s(s, t);
    }

    @Override public void glTexCoord2i(int s, int t) {
        org.lwjgl.opengl.GL11.glTexCoord2i(s, t);
    }

    @Override public void glTexCoord2d(double s, double t) {
        org.lwjgl.opengl.GL11.glTexCoord2d(s, t);
    }

    @Override public void nglTexCoord2fv(long v) {
        org.lwjgl.opengl.GL11.nglTexCoord2fv(v);
    }

    @Override public void glTexCoord2fv(FloatBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord2fv(v);
    }

    @Override public void glTexCoord2fv(float[] v) {
        org.lwjgl.opengl.GL11.glTexCoord2fv(v);
    }

    @Override public void nglTexCoord2sv(long v) {
        org.lwjgl.opengl.GL11.nglTexCoord2sv(v);
    }

    @Override public void glTexCoord2sv(ShortBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord2sv(v);
    }

    @Override public void glTexCoord2sv(short[] v) {
        org.lwjgl.opengl.GL11.glTexCoord2sv(v);
    }

    @Override public void nglTexCoord2iv(long v) {
        org.lwjgl.opengl.GL11.nglTexCoord2iv(v);
    }

    @Override public void glTexCoord2iv(IntBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord2iv(v);
    }

    @Override public void glTexCoord2iv(int[] v) {
        org.lwjgl.opengl.GL11.glTexCoord2iv(v);
    }

    @Override public void nglTexCoord2dv(long v) {
        org.lwjgl.opengl.GL11.nglTexCoord2dv(v);
    }

    @Override public void glTexCoord2dv(DoubleBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord2dv(v);
    }

    @Override public void glTexCoord2dv(double[] v) {
        org.lwjgl.opengl.GL11.glTexCoord2dv(v);
    }

    @Override public void glTexCoord3f(float s, float t, float r) {
        org.lwjgl.opengl.GL11.glTexCoord3f(s, t, r);
    }

    @Override public void glTexCoord3s(short s, short t, short r) {
        org.lwjgl.opengl.GL11.glTexCoord3s(s, t, r);
    }

    @Override public void glTexCoord3i(int s, int t, int r) {
        org.lwjgl.opengl.GL11.glTexCoord3i(s, t, r);
    }

    @Override public void glTexCoord3d(double s, double t, double r) {
        org.lwjgl.opengl.GL11.glTexCoord3d(s, t, r);
    }

    @Override public void nglTexCoord3fv(long v) {
        org.lwjgl.opengl.GL11.nglTexCoord3fv(v);
    }

    @Override public void glTexCoord3fv(FloatBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord3fv(v);
    }

    @Override public void glTexCoord3fv(float[] v) {
        org.lwjgl.opengl.GL11.glTexCoord3fv(v);
    }

    @Override public void nglTexCoord3sv(long v) {
        org.lwjgl.opengl.GL11.nglTexCoord3sv(v);
    }

    @Override public void glTexCoord3sv(ShortBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord3sv(v);
    }

    @Override public void glTexCoord3sv(short[] v) {
        org.lwjgl.opengl.GL11.glTexCoord3sv(v);
    }

    @Override public void nglTexCoord3iv(long v) {
        org.lwjgl.opengl.GL11.nglTexCoord3iv(v);
    }

    @Override public void glTexCoord3iv(IntBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord3iv(v);
    }

    @Override public void glTexCoord3iv(int[] v) {
        org.lwjgl.opengl.GL11.glTexCoord3iv(v);
    }

    @Override public void nglTexCoord3dv(long v) {
        org.lwjgl.opengl.GL11.nglTexCoord3dv(v);
    }

    @Override public void glTexCoord3dv(DoubleBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord3dv(v);
    }

    @Override public void glTexCoord3dv(double[] v) {
        org.lwjgl.opengl.GL11.glTexCoord3dv(v);
    }

    @Override public void glTexCoord4f(float s, float t, float r, float q) {
        org.lwjgl.opengl.GL11.glTexCoord4f(s, t, r, q);
    }

    @Override public void glTexCoord4s(short s, short t, short r, short q) {
        org.lwjgl.opengl.GL11.glTexCoord4s(s, t, r, q);
    }

    @Override public void glTexCoord4i(int s, int t, int r, int q) {
        org.lwjgl.opengl.GL11.glTexCoord4i(s, t, r, q);
    }

    @Override public void glTexCoord4d(double s, double t, double r, double q) {
        org.lwjgl.opengl.GL11.glTexCoord4d(s, t, r, q);
    }

    @Override public void nglTexCoord4fv(long v) {
        org.lwjgl.opengl.GL11.nglTexCoord4fv(v);
    }

    @Override public void glTexCoord4fv(FloatBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord4fv(v);
    }

    @Override public void glTexCoord4fv(float[] v) {
        org.lwjgl.opengl.GL11.glTexCoord4fv(v);
    }

    @Override public void nglTexCoord4sv(long v) {
        org.lwjgl.opengl.GL11.nglTexCoord4sv(v);
    }

    @Override public void glTexCoord4sv(ShortBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord4sv(v);
    }

    @Override public void glTexCoord4sv(short[] v) {
        org.lwjgl.opengl.GL11.glTexCoord4sv(v);
    }

    @Override public void nglTexCoord4iv(long v) {
        org.lwjgl.opengl.GL11.nglTexCoord4iv(v);
    }

    @Override public void glTexCoord4iv(IntBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord4iv(v);
    }

    @Override public void glTexCoord4iv(int[] v) {
        org.lwjgl.opengl.GL11.glTexCoord4iv(v);
    }

    @Override public void nglTexCoord4dv(long v) {
        org.lwjgl.opengl.GL11.nglTexCoord4dv(v);
    }

    @Override public void glTexCoord4dv(DoubleBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord4dv(v);
    }

    @Override public void glTexCoord4dv(double[] v) {
        org.lwjgl.opengl.GL11.glTexCoord4dv(v);
    }

    @Override public void nglTexCoordPointer(int size, int type, int stride, long pointer) {
        org.lwjgl.opengl.GL11.nglTexCoordPointer(size, type, stride, pointer);
    }

    @Override public void glTexCoordPointer(int size, int type, int stride, ByteBuffer pointer) {
        org.lwjgl.opengl.GL11.glTexCoordPointer(size, type, stride, pointer);
    }

    @Override public void glTexCoordPointer(int size, int type, int stride, long pointer) {
        org.lwjgl.opengl.GL11.glTexCoordPointer(size, type, stride, pointer);
    }

    @Override public void glTexCoordPointer(int size, int type, int stride, ShortBuffer pointer) {
        org.lwjgl.opengl.GL11.glTexCoordPointer(size, type, stride, pointer);
    }

    @Override public void glTexCoordPointer(int size, int type, int stride, IntBuffer pointer) {
        org.lwjgl.opengl.GL11.glTexCoordPointer(size, type, stride, pointer);
    }

    @Override public void glTexCoordPointer(int size, int type, int stride, FloatBuffer pointer) {
        org.lwjgl.opengl.GL11.glTexCoordPointer(size, type, stride, pointer);
    }

    @Override public void glTexEnvi(int target, int pname, int param) {
        org.lwjgl.opengl.GL11.glTexEnvi(target, pname, param);
    }

    @Override public void nglTexEnviv(int target, int pname, long params) {
        org.lwjgl.opengl.GL11.nglTexEnviv(target, pname, params);
    }

    @Override public void glTexEnviv(int target, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL11.glTexEnviv(target, pname, params);
    }

    @Override public void glTexEnviv(int target, int pname, int[] params) {
        org.lwjgl.opengl.GL11.glTexEnviv(target, pname, params);
    }

    @Override public void glTexEnvf(int target, int pname, float param) {
        org.lwjgl.opengl.GL11.glTexEnvf(target, pname, param);
    }

    @Override public void nglTexEnvfv(int target, int pname, long params) {
        org.lwjgl.opengl.GL11.nglTexEnvfv(target, pname, params);
    }

    @Override public void glTexEnvfv(int target, int pname, FloatBuffer params) {
        org.lwjgl.opengl.GL11.glTexEnvfv(target, pname, params);
    }

    @Override public void glTexEnvfv(int target, int pname, float[] params) {
        org.lwjgl.opengl.GL11.glTexEnvfv(target, pname, params);
    }

    @Override public void glTexGeni(int coord, int pname, int param) {
        org.lwjgl.opengl.GL11.glTexGeni(coord, pname, param);
    }

    @Override public void nglTexGeniv(int coord, int pname, long params) {
        org.lwjgl.opengl.GL11.nglTexGeniv(coord, pname, params);
    }

    @Override public void glTexGeniv(int coord, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL11.glTexGeniv(coord, pname, params);
    }

    @Override public void glTexGeniv(int coord, int pname, int[] params) {
        org.lwjgl.opengl.GL11.glTexGeniv(coord, pname, params);
    }

    @Override public void glTexGenf(int coord, int pname, float param) {
        org.lwjgl.opengl.GL11.glTexGenf(coord, pname, param);
    }

    @Override public void nglTexGenfv(int coord, int pname, long params) {
        org.lwjgl.opengl.GL11.nglTexGenfv(coord, pname, params);
    }

    @Override public void glTexGenfv(int coord, int pname, FloatBuffer params) {
        org.lwjgl.opengl.GL11.glTexGenfv(coord, pname, params);
    }

    @Override public void glTexGenfv(int coord, int pname, float[] params) {
        org.lwjgl.opengl.GL11.glTexGenfv(coord, pname, params);
    }

    @Override public void glTexGend(int coord, int pname, double param) {
        org.lwjgl.opengl.GL11.glTexGend(coord, pname, param);
    }

    @Override public void nglTexGendv(int coord, int pname, long params) {
        org.lwjgl.opengl.GL11.nglTexGendv(coord, pname, params);
    }

    @Override public void glTexGendv(int coord, int pname, DoubleBuffer params) {
        org.lwjgl.opengl.GL11.glTexGendv(coord, pname, params);
    }

    @Override public void glTexGendv(int coord, int pname, double[] params) {
        org.lwjgl.opengl.GL11.glTexGendv(coord, pname, params);
    }

    @Override public void nglTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, long pixels) {
        org.lwjgl.opengl.GL11.nglTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    @Override public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, @Nullable ByteBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    @Override public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, long pixels) {
        org.lwjgl.opengl.GL11.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    @Override public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, @Nullable ShortBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    @Override public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, @Nullable IntBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    @Override public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, @Nullable FloatBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    @Override public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, @Nullable DoubleBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    @Override public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, @Nullable short[] pixels) {
        org.lwjgl.opengl.GL11.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    @Override public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, @Nullable int[] pixels) {
        org.lwjgl.opengl.GL11.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    @Override public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, @Nullable float[] pixels) {
        org.lwjgl.opengl.GL11.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    @Override public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, @Nullable double[] pixels) {
        org.lwjgl.opengl.GL11.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    @Override public void nglTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels) {
        org.lwjgl.opengl.GL11.nglTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, @Nullable ByteBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels) {
        org.lwjgl.opengl.GL11.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, @Nullable ShortBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, @Nullable IntBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, @Nullable FloatBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, @Nullable DoubleBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, @Nullable short[] pixels) {
        org.lwjgl.opengl.GL11.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, @Nullable int[] pixels) {
        org.lwjgl.opengl.GL11.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, @Nullable float[] pixels) {
        org.lwjgl.opengl.GL11.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, @Nullable double[] pixels) {
        org.lwjgl.opengl.GL11.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override public void glCopyTexImage1D(int target, int level, int internalFormat, int x, int y, int width, int border) {
        org.lwjgl.opengl.GL11.glCopyTexImage1D(target, level, internalFormat, x, y, width, border);
    }

    @Override public void glCopyTexImage2D(int target, int level, int internalFormat, int x, int y, int width, int height, int border) {
        org.lwjgl.opengl.GL11.glCopyTexImage2D(target, level, internalFormat, x, y, width, height, border);
    }

    @Override public void glCopyTexSubImage1D(int target, int level, int xoffset, int x, int y, int width) {
        org.lwjgl.opengl.GL11.glCopyTexSubImage1D(target, level, xoffset, x, y, width);
    }

    @Override public void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
        org.lwjgl.opengl.GL11.glCopyTexSubImage2D(target, level, xoffset, yoffset, x, y, width, height);
    }

    @Override public void glTexParameteri(int target, int pname, int param) {
        org.lwjgl.opengl.GL11.glTexParameteri(target, pname, param);
    }

    @Override public void nglTexParameteriv(int target, int pname, long params) {
        org.lwjgl.opengl.GL11.nglTexParameteriv(target, pname, params);
    }

    @Override public void glTexParameteriv(int target, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL11.glTexParameteriv(target, pname, params);
    }

    @Override public void glTexParameteriv(int target, int pname, int[] params) {
        org.lwjgl.opengl.GL11.glTexParameteriv(target, pname, params);
    }

    @Override public void glTexParameterf(int target, int pname, float param) {
        org.lwjgl.opengl.GL11.glTexParameterf(target, pname, param);
    }

    @Override public void nglTexParameterfv(int target, int pname, long params) {
        org.lwjgl.opengl.GL11.nglTexParameterfv(target, pname, params);
    }

    @Override public void glTexParameterfv(int target, int pname, FloatBuffer params) {
        org.lwjgl.opengl.GL11.glTexParameterfv(target, pname, params);
    }

    @Override public void glTexParameterfv(int target, int pname, float[] params) {
        org.lwjgl.opengl.GL11.glTexParameterfv(target, pname, params);
    }

    @Override public void nglTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, long pixels) {
        org.lwjgl.opengl.GL11.nglTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    @Override public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, ByteBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    @Override public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, long pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    @Override public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, ShortBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    @Override public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, IntBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    @Override public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, FloatBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    @Override public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, DoubleBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    @Override public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, short[] pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    @Override public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, int[] pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    @Override public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, float[] pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    @Override public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, double[] pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    @Override public void nglTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels) {
        org.lwjgl.opengl.GL11.nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ByteBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ShortBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, IntBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, FloatBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, DoubleBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, short[] pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, int[] pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, float[] pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, double[] pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTranslatef(float x, float y, float z) {
        org.lwjgl.opengl.GL11.glTranslatef(x, y, z);
    }

    @Override public void glTranslated(double x, double y, double z) {
        org.lwjgl.opengl.GL11.glTranslated(x, y, z);
    }

    @Override public void glVertex2f(float x, float y) {
        org.lwjgl.opengl.GL11.glVertex2f(x, y);
    }

    @Override public void glVertex2s(short x, short y) {
        org.lwjgl.opengl.GL11.glVertex2s(x, y);
    }

    @Override public void glVertex2i(int x, int y) {
        org.lwjgl.opengl.GL11.glVertex2i(x, y);
    }

    @Override public void glVertex2d(double x, double y) {
        org.lwjgl.opengl.GL11.glVertex2d(x, y);
    }

    @Override public void nglVertex2fv(long coords) {
        org.lwjgl.opengl.GL11.nglVertex2fv(coords);
    }

    @Override public void glVertex2fv(FloatBuffer coords) {
        org.lwjgl.opengl.GL11.glVertex2fv(coords);
    }

    @Override public void glVertex2fv(float[] coords) {
        org.lwjgl.opengl.GL11.glVertex2fv(coords);
    }

    @Override public void nglVertex2sv(long coords) {
        org.lwjgl.opengl.GL11.nglVertex2sv(coords);
    }

    @Override public void glVertex2sv(ShortBuffer coords) {
        org.lwjgl.opengl.GL11.glVertex2sv(coords);
    }

    @Override public void glVertex2sv(short[] coords) {
        org.lwjgl.opengl.GL11.glVertex2sv(coords);
    }

    @Override public void nglVertex2iv(long coords) {
        org.lwjgl.opengl.GL11.nglVertex2iv(coords);
    }

    @Override public void glVertex2iv(IntBuffer coords) {
        org.lwjgl.opengl.GL11.glVertex2iv(coords);
    }

    @Override public void glVertex2iv(int[] coords) {
        org.lwjgl.opengl.GL11.glVertex2iv(coords);
    }

    @Override public void nglVertex2dv(long coords) {
        org.lwjgl.opengl.GL11.nglVertex2dv(coords);
    }

    @Override public void glVertex2dv(DoubleBuffer coords) {
        org.lwjgl.opengl.GL11.glVertex2dv(coords);
    }

    @Override public void glVertex2dv(double[] coords) {
        org.lwjgl.opengl.GL11.glVertex2dv(coords);
    }

    @Override public void glVertex3f(float x, float y, float z) {
        org.lwjgl.opengl.GL11.glVertex3f(x, y, z);
    }

    @Override public void glVertex3s(short x, short y, short z) {
        org.lwjgl.opengl.GL11.glVertex3s(x, y, z);
    }

    @Override public void glVertex3i(int x, int y, int z) {
        org.lwjgl.opengl.GL11.glVertex3i(x, y, z);
    }

    @Override public void glVertex3d(double x, double y, double z) {
        org.lwjgl.opengl.GL11.glVertex3d(x, y, z);
    }

    @Override public void nglVertex3fv(long coords) {
        org.lwjgl.opengl.GL11.nglVertex3fv(coords);
    }

    @Override public void glVertex3fv(FloatBuffer coords) {
        org.lwjgl.opengl.GL11.glVertex3fv(coords);
    }

    @Override public void glVertex3fv(float[] coords) {
        org.lwjgl.opengl.GL11.glVertex3fv(coords);
    }

    @Override public void nglVertex3sv(long coords) {
        org.lwjgl.opengl.GL11.nglVertex3sv(coords);
    }

    @Override public void glVertex3sv(ShortBuffer coords) {
        org.lwjgl.opengl.GL11.glVertex3sv(coords);
    }

    @Override public void glVertex3sv(short[] coords) {
        org.lwjgl.opengl.GL11.glVertex3sv(coords);
    }

    @Override public void nglVertex3iv(long coords) {
        org.lwjgl.opengl.GL11.nglVertex3iv(coords);
    }

    @Override public void glVertex3iv(IntBuffer coords) {
        org.lwjgl.opengl.GL11.glVertex3iv(coords);
    }

    @Override public void glVertex3iv(int[] coords) {
        org.lwjgl.opengl.GL11.glVertex3iv(coords);
    }

    @Override public void nglVertex3dv(long coords) {
        org.lwjgl.opengl.GL11.nglVertex3dv(coords);
    }

    @Override public void glVertex3dv(DoubleBuffer coords) {
        org.lwjgl.opengl.GL11.glVertex3dv(coords);
    }

    @Override public void glVertex3dv(double[] coords) {
        org.lwjgl.opengl.GL11.glVertex3dv(coords);
    }

    @Override public void glVertex4f(float x, float y, float z, float w) {
        org.lwjgl.opengl.GL11.glVertex4f(x, y, z, w);
    }

    @Override public void glVertex4s(short x, short y, short z, short w) {
        org.lwjgl.opengl.GL11.glVertex4s(x, y, z, w);
    }

    @Override public void glVertex4i(int x, int y, int z, int w) {
        org.lwjgl.opengl.GL11.glVertex4i(x, y, z, w);
    }

    @Override public void glVertex4d(double x, double y, double z, double w) {
        org.lwjgl.opengl.GL11.glVertex4d(x, y, z, w);
    }

    @Override public void nglVertex4fv(long coords) {
        org.lwjgl.opengl.GL11.nglVertex4fv(coords);
    }

    @Override public void glVertex4fv(FloatBuffer coords) {
        org.lwjgl.opengl.GL11.glVertex4fv(coords);
    }

    @Override public void glVertex4fv(float[] coords) {
        org.lwjgl.opengl.GL11.glVertex4fv(coords);
    }

    @Override public void nglVertex4sv(long coords) {
        org.lwjgl.opengl.GL11.nglVertex4sv(coords);
    }

    @Override public void glVertex4sv(ShortBuffer coords) {
        org.lwjgl.opengl.GL11.glVertex4sv(coords);
    }

    @Override public void glVertex4sv(short[] coords) {
        org.lwjgl.opengl.GL11.glVertex4sv(coords);
    }

    @Override public void nglVertex4iv(long coords) {
        org.lwjgl.opengl.GL11.nglVertex4iv(coords);
    }

    @Override public void glVertex4iv(IntBuffer coords) {
        org.lwjgl.opengl.GL11.glVertex4iv(coords);
    }

    @Override public void glVertex4iv(int[] coords) {
        org.lwjgl.opengl.GL11.glVertex4iv(coords);
    }

    @Override public void nglVertex4dv(long coords) {
        org.lwjgl.opengl.GL11.nglVertex4dv(coords);
    }

    @Override public void glVertex4dv(DoubleBuffer coords) {
        org.lwjgl.opengl.GL11.glVertex4dv(coords);
    }

    @Override public void glVertex4dv(double[] coords) {
        org.lwjgl.opengl.GL11.glVertex4dv(coords);
    }

    @Override public void nglVertexPointer(int size, int type, int stride, long pointer) {
        org.lwjgl.opengl.GL11.nglVertexPointer(size, type, stride, pointer);
    }

    @Override public void glVertexPointer(int size, int type, int stride, ByteBuffer pointer) {
        org.lwjgl.opengl.GL11.glVertexPointer(size, type, stride, pointer);
    }

    @Override public void glVertexPointer(int size, int type, int stride, long pointer) {
        org.lwjgl.opengl.GL11.glVertexPointer(size, type, stride, pointer);
    }

    @Override public void glVertexPointer(int size, int type, int stride, ShortBuffer pointer) {
        org.lwjgl.opengl.GL11.glVertexPointer(size, type, stride, pointer);
    }

    @Override public void glVertexPointer(int size, int type, int stride, IntBuffer pointer) {
        org.lwjgl.opengl.GL11.glVertexPointer(size, type, stride, pointer);
    }

    @Override public void glVertexPointer(int size, int type, int stride, FloatBuffer pointer) {
        org.lwjgl.opengl.GL11.glVertexPointer(size, type, stride, pointer);
    }

    @Override public void glViewport(int x, int y, int w, int h) {
        org.lwjgl.opengl.GL11.glViewport(x, y, w, h);
    }

}
