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

    @Override public void glEnable(@NativeType("GLenum") int target) {
        org.lwjgl.opengl.GL11.glEnable(target);
    }

    @Override public void glDisable(@NativeType("GLenum") int target) {
        org.lwjgl.opengl.GL11.glDisable(target);
    }

    @Override public void glAccum(@NativeType("GLenum") int op, @NativeType("GLfloat") float value) {
        org.lwjgl.opengl.GL11.glAccum(op, value);
    }

    @Override public void glAlphaFunc(@NativeType("GLenum") int func, @NativeType("GLfloat") float ref) {
        org.lwjgl.opengl.GL11.glAlphaFunc(func, ref);
    }

    @Override public boolean nglAreTexturesResident(int n, long textures, long residences) {
        return org.lwjgl.opengl.GL11.nglAreTexturesResident(n, textures, residences);
    }

@NativeType("GLboolean")
    @Override public boolean glAreTexturesResident(@NativeType("GLuint const *") IntBuffer textures, @NativeType("GLboolean *") ByteBuffer residences) {
        return org.lwjgl.opengl.GL11.glAreTexturesResident(textures, residences);
    }

@NativeType("GLboolean")
    @Override public boolean glAreTexturesResident(@NativeType("GLuint const *") int texture, @NativeType("GLboolean *") ByteBuffer residences) {
        return org.lwjgl.opengl.GL11.glAreTexturesResident(texture, residences);
    }

@NativeType("GLboolean")
    @Override public boolean glAreTexturesResident(@NativeType("GLuint const *") int[] textures, @NativeType("GLboolean *") ByteBuffer residences) {
        return org.lwjgl.opengl.GL11.glAreTexturesResident(textures, residences);
    }

    @Override public void glArrayElement(@NativeType("GLint") int i) {
        org.lwjgl.opengl.GL11.glArrayElement(i);
    }

    @Override public void glBegin(@NativeType("GLenum") int mode) {
        org.lwjgl.opengl.GL11.glBegin(mode);
    }

    @Override public void glBindTexture(@NativeType("GLenum") int target, @NativeType("GLuint") int texture) {
        org.lwjgl.opengl.GL11.glBindTexture(target, texture);
    }

    @Override public void nglBitmap(int w, int h, float xOrig, float yOrig, float xInc, float yInc, long data) {
        org.lwjgl.opengl.GL11.nglBitmap(w, h, xOrig, yOrig, xInc, yInc, data);
    }

    @Override public void glBitmap(@NativeType("GLsizei") int w, @NativeType("GLsizei") int h, @NativeType("GLfloat") float xOrig, @NativeType("GLfloat") float yOrig, @NativeType("GLfloat") float xInc, @NativeType("GLfloat") float yInc, @Nullable @NativeType("GLubyte const *") ByteBuffer data) {
        org.lwjgl.opengl.GL11.glBitmap(w, h, xOrig, yOrig, xInc, yInc, data);
    }

    @Override public void glBitmap(@NativeType("GLsizei") int w, @NativeType("GLsizei") int h, @NativeType("GLfloat") float xOrig, @NativeType("GLfloat") float yOrig, @NativeType("GLfloat") float xInc, @NativeType("GLfloat") float yInc, @NativeType("GLubyte const *") long data) {
        org.lwjgl.opengl.GL11.glBitmap(w, h, xOrig, yOrig, xInc, yInc, data);
    }

    @Override public void glBlendFunc(@NativeType("GLenum") int sfactor, @NativeType("GLenum") int dfactor) {
        org.lwjgl.opengl.GL11.glBlendFunc(sfactor, dfactor);
    }

    @Override public void glCallList(@NativeType("GLuint") int list) {
        org.lwjgl.opengl.GL11.glCallList(list);
    }

    @Override public void nglCallLists(int n, int type, long lists) {
        org.lwjgl.opengl.GL11.nglCallLists(n, type, lists);
    }

    @Override public void glCallLists(@NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer lists) {
        org.lwjgl.opengl.GL11.glCallLists(type, lists);
    }

    @Override public void glCallLists(@NativeType("void const *") ByteBuffer lists) {
        org.lwjgl.opengl.GL11.glCallLists(lists);
    }

    @Override public void glCallLists(@NativeType("void const *") ShortBuffer lists) {
        org.lwjgl.opengl.GL11.glCallLists(lists);
    }

    @Override public void glCallLists(@NativeType("void const *") IntBuffer lists) {
        org.lwjgl.opengl.GL11.glCallLists(lists);
    }

    @Override public void glClear(@NativeType("GLbitfield") int mask) {
        org.lwjgl.opengl.GL11.glClear(mask);
    }

    @Override public void glClearAccum(@NativeType("GLfloat") float red, @NativeType("GLfloat") float green, @NativeType("GLfloat") float blue, @NativeType("GLfloat") float alpha) {
        org.lwjgl.opengl.GL11.glClearAccum(red, green, blue, alpha);
    }

    @Override public void glClearColor(@NativeType("GLfloat") float red, @NativeType("GLfloat") float green, @NativeType("GLfloat") float blue, @NativeType("GLfloat") float alpha) {
        org.lwjgl.opengl.GL11.glClearColor(red, green, blue, alpha);
    }

    @Override public void glClearDepth(@NativeType("GLdouble") double depth) {
        org.lwjgl.opengl.GL11.glClearDepth(depth);
    }

    @Override public void glClearIndex(@NativeType("GLfloat") float index) {
        org.lwjgl.opengl.GL11.glClearIndex(index);
    }

    @Override public void glClearStencil(@NativeType("GLint") int s) {
        org.lwjgl.opengl.GL11.glClearStencil(s);
    }

    @Override public void nglClipPlane(int plane, long equation) {
        org.lwjgl.opengl.GL11.nglClipPlane(plane, equation);
    }

    @Override public void glClipPlane(@NativeType("GLenum") int plane, @NativeType("GLdouble const *") DoubleBuffer equation) {
        org.lwjgl.opengl.GL11.glClipPlane(plane, equation);
    }

    @Override public void glClipPlane(@NativeType("GLenum") int plane, @NativeType("GLdouble const *") double[] equation) {
        org.lwjgl.opengl.GL11.glClipPlane(plane, equation);
    }

    @Override public void glColor3b(@NativeType("GLbyte") byte red, @NativeType("GLbyte") byte green, @NativeType("GLbyte") byte blue) {
        org.lwjgl.opengl.GL11.glColor3b(red, green, blue);
    }

    @Override public void glColor3s(@NativeType("GLshort") short red, @NativeType("GLshort") short green, @NativeType("GLshort") short blue) {
        org.lwjgl.opengl.GL11.glColor3s(red, green, blue);
    }

    @Override public void glColor3i(@NativeType("GLint") int red, @NativeType("GLint") int green, @NativeType("GLint") int blue) {
        org.lwjgl.opengl.GL11.glColor3i(red, green, blue);
    }

    @Override public void glColor3f(@NativeType("GLfloat") float red, @NativeType("GLfloat") float green, @NativeType("GLfloat") float blue) {
        org.lwjgl.opengl.GL11.glColor3f(red, green, blue);
    }

    @Override public void glColor3d(@NativeType("GLdouble") double red, @NativeType("GLdouble") double green, @NativeType("GLdouble") double blue) {
        org.lwjgl.opengl.GL11.glColor3d(red, green, blue);
    }

    @Override public void glColor3ub(@NativeType("GLubyte") byte red, @NativeType("GLubyte") byte green, @NativeType("GLubyte") byte blue) {
        org.lwjgl.opengl.GL11.glColor3ub(red, green, blue);
    }

    @Override public void glColor3us(@NativeType("GLushort") short red, @NativeType("GLushort") short green, @NativeType("GLushort") short blue) {
        org.lwjgl.opengl.GL11.glColor3us(red, green, blue);
    }

    @Override public void glColor3ui(@NativeType("GLint") int red, @NativeType("GLint") int green, @NativeType("GLint") int blue) {
        org.lwjgl.opengl.GL11.glColor3ui(red, green, blue);
    }

    @Override public void nglColor3bv(long v) {
        org.lwjgl.opengl.GL11.nglColor3bv(v);
    }

    @Override public void glColor3bv(@NativeType("GLbyte const *") ByteBuffer v) {
        org.lwjgl.opengl.GL11.glColor3bv(v);
    }

    @Override public void nglColor3sv(long v) {
        org.lwjgl.opengl.GL11.nglColor3sv(v);
    }

    @Override public void glColor3sv(@NativeType("GLshort const *") ShortBuffer v) {
        org.lwjgl.opengl.GL11.glColor3sv(v);
    }

    @Override public void glColor3sv(@NativeType("GLshort const *") short[] v) {
        org.lwjgl.opengl.GL11.glColor3sv(v);
    }

    @Override public void nglColor3iv(long v) {
        org.lwjgl.opengl.GL11.nglColor3iv(v);
    }

    @Override public void glColor3iv(@NativeType("GLint const *") IntBuffer v) {
        org.lwjgl.opengl.GL11.glColor3iv(v);
    }

    @Override public void glColor3iv(@NativeType("GLint const *") int[] v) {
        org.lwjgl.opengl.GL11.glColor3iv(v);
    }

    @Override public void nglColor3fv(long v) {
        org.lwjgl.opengl.GL11.nglColor3fv(v);
    }

    @Override public void glColor3fv(@NativeType("GLfloat const *") FloatBuffer v) {
        org.lwjgl.opengl.GL11.glColor3fv(v);
    }

    @Override public void glColor3fv(@NativeType("GLfloat const *") float[] v) {
        org.lwjgl.opengl.GL11.glColor3fv(v);
    }

    @Override public void nglColor3dv(long v) {
        org.lwjgl.opengl.GL11.nglColor3dv(v);
    }

    @Override public void glColor3dv(@NativeType("GLdouble const *") DoubleBuffer v) {
        org.lwjgl.opengl.GL11.glColor3dv(v);
    }

    @Override public void glColor3dv(@NativeType("GLdouble const *") double[] v) {
        org.lwjgl.opengl.GL11.glColor3dv(v);
    }

    @Override public void nglColor3ubv(long v) {
        org.lwjgl.opengl.GL11.nglColor3ubv(v);
    }

    @Override public void glColor3ubv(@NativeType("GLubyte const *") ByteBuffer v) {
        org.lwjgl.opengl.GL11.glColor3ubv(v);
    }

    @Override public void nglColor3usv(long v) {
        org.lwjgl.opengl.GL11.nglColor3usv(v);
    }

    @Override public void glColor3usv(@NativeType("GLushort const *") ShortBuffer v) {
        org.lwjgl.opengl.GL11.glColor3usv(v);
    }

    @Override public void glColor3usv(@NativeType("GLushort const *") short[] v) {
        org.lwjgl.opengl.GL11.glColor3usv(v);
    }

    @Override public void nglColor3uiv(long v) {
        org.lwjgl.opengl.GL11.nglColor3uiv(v);
    }

    @Override public void glColor3uiv(@NativeType("GLuint const *") IntBuffer v) {
        org.lwjgl.opengl.GL11.glColor3uiv(v);
    }

    @Override public void glColor3uiv(@NativeType("GLuint const *") int[] v) {
        org.lwjgl.opengl.GL11.glColor3uiv(v);
    }

    @Override public void glColor4b(@NativeType("GLbyte") byte red, @NativeType("GLbyte") byte green, @NativeType("GLbyte") byte blue, @NativeType("GLbyte") byte alpha) {
        org.lwjgl.opengl.GL11.glColor4b(red, green, blue, alpha);
    }

    @Override public void glColor4s(@NativeType("GLshort") short red, @NativeType("GLshort") short green, @NativeType("GLshort") short blue, @NativeType("GLshort") short alpha) {
        org.lwjgl.opengl.GL11.glColor4s(red, green, blue, alpha);
    }

    @Override public void glColor4i(@NativeType("GLint") int red, @NativeType("GLint") int green, @NativeType("GLint") int blue, @NativeType("GLint") int alpha) {
        org.lwjgl.opengl.GL11.glColor4i(red, green, blue, alpha);
    }

    @Override public void glColor4f(@NativeType("GLfloat") float red, @NativeType("GLfloat") float green, @NativeType("GLfloat") float blue, @NativeType("GLfloat") float alpha) {
        org.lwjgl.opengl.GL11.glColor4f(red, green, blue, alpha);
    }

    @Override public void glColor4d(@NativeType("GLdouble") double red, @NativeType("GLdouble") double green, @NativeType("GLdouble") double blue, @NativeType("GLdouble") double alpha) {
        org.lwjgl.opengl.GL11.glColor4d(red, green, blue, alpha);
    }

    @Override public void glColor4ub(@NativeType("GLubyte") byte red, @NativeType("GLubyte") byte green, @NativeType("GLubyte") byte blue, @NativeType("GLubyte") byte alpha) {
        org.lwjgl.opengl.GL11.glColor4ub(red, green, blue, alpha);
    }

    @Override public void glColor4us(@NativeType("GLushort") short red, @NativeType("GLushort") short green, @NativeType("GLushort") short blue, @NativeType("GLushort") short alpha) {
        org.lwjgl.opengl.GL11.glColor4us(red, green, blue, alpha);
    }

    @Override public void glColor4ui(@NativeType("GLint") int red, @NativeType("GLint") int green, @NativeType("GLint") int blue, @NativeType("GLint") int alpha) {
        org.lwjgl.opengl.GL11.glColor4ui(red, green, blue, alpha);
    }

    @Override public void nglColor4bv(long v) {
        org.lwjgl.opengl.GL11.nglColor4bv(v);
    }

    @Override public void glColor4bv(@NativeType("GLbyte const *") ByteBuffer v) {
        org.lwjgl.opengl.GL11.glColor4bv(v);
    }

    @Override public void nglColor4sv(long v) {
        org.lwjgl.opengl.GL11.nglColor4sv(v);
    }

    @Override public void glColor4sv(@NativeType("GLshort const *") ShortBuffer v) {
        org.lwjgl.opengl.GL11.glColor4sv(v);
    }

    @Override public void glColor4sv(@NativeType("GLshort const *") short[] v) {
        org.lwjgl.opengl.GL11.glColor4sv(v);
    }

    @Override public void nglColor4iv(long v) {
        org.lwjgl.opengl.GL11.nglColor4iv(v);
    }

    @Override public void glColor4iv(@NativeType("GLint const *") IntBuffer v) {
        org.lwjgl.opengl.GL11.glColor4iv(v);
    }

    @Override public void glColor4iv(@NativeType("GLint const *") int[] v) {
        org.lwjgl.opengl.GL11.glColor4iv(v);
    }

    @Override public void nglColor4fv(long v) {
        org.lwjgl.opengl.GL11.nglColor4fv(v);
    }

    @Override public void glColor4fv(@NativeType("GLfloat const *") FloatBuffer v) {
        org.lwjgl.opengl.GL11.glColor4fv(v);
    }

    @Override public void glColor4fv(@NativeType("GLfloat const *") float[] v) {
        org.lwjgl.opengl.GL11.glColor4fv(v);
    }

    @Override public void nglColor4dv(long v) {
        org.lwjgl.opengl.GL11.nglColor4dv(v);
    }

    @Override public void glColor4dv(@NativeType("GLdouble const *") DoubleBuffer v) {
        org.lwjgl.opengl.GL11.glColor4dv(v);
    }

    @Override public void glColor4dv(@NativeType("GLdouble const *") double[] v) {
        org.lwjgl.opengl.GL11.glColor4dv(v);
    }

    @Override public void nglColor4ubv(long v) {
        org.lwjgl.opengl.GL11.nglColor4ubv(v);
    }

    @Override public void glColor4ubv(@NativeType("GLubyte const *") ByteBuffer v) {
        org.lwjgl.opengl.GL11.glColor4ubv(v);
    }

    @Override public void nglColor4usv(long v) {
        org.lwjgl.opengl.GL11.nglColor4usv(v);
    }

    @Override public void glColor4usv(@NativeType("GLushort const *") ShortBuffer v) {
        org.lwjgl.opengl.GL11.glColor4usv(v);
    }

    @Override public void glColor4usv(@NativeType("GLushort const *") short[] v) {
        org.lwjgl.opengl.GL11.glColor4usv(v);
    }

    @Override public void nglColor4uiv(long v) {
        org.lwjgl.opengl.GL11.nglColor4uiv(v);
    }

    @Override public void glColor4uiv(@NativeType("GLuint const *") IntBuffer v) {
        org.lwjgl.opengl.GL11.glColor4uiv(v);
    }

    @Override public void glColor4uiv(@NativeType("GLuint const *") int[] v) {
        org.lwjgl.opengl.GL11.glColor4uiv(v);
    }

    @Override public void glColorMask(@NativeType("GLboolean") boolean red, @NativeType("GLboolean") boolean green, @NativeType("GLboolean") boolean blue, @NativeType("GLboolean") boolean alpha) {
        org.lwjgl.opengl.GL11.glColorMask(red, green, blue, alpha);
    }

    @Override public void glColorMaterial(@NativeType("GLenum") int face, @NativeType("GLenum") int mode) {
        org.lwjgl.opengl.GL11.glColorMaterial(face, mode);
    }

    @Override public void nglColorPointer(int size, int type, int stride, long pointer) {
        org.lwjgl.opengl.GL11.nglColorPointer(size, type, stride, pointer);
    }

    @Override public void glColorPointer(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        org.lwjgl.opengl.GL11.glColorPointer(size, type, stride, pointer);
    }

    @Override public void glColorPointer(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        org.lwjgl.opengl.GL11.glColorPointer(size, type, stride, pointer);
    }

    @Override public void glColorPointer(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer) {
        org.lwjgl.opengl.GL11.glColorPointer(size, type, stride, pointer);
    }

    @Override public void glColorPointer(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") IntBuffer pointer) {
        org.lwjgl.opengl.GL11.glColorPointer(size, type, stride, pointer);
    }

    @Override public void glColorPointer(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") FloatBuffer pointer) {
        org.lwjgl.opengl.GL11.glColorPointer(size, type, stride, pointer);
    }

    @Override public void glCopyPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int type) {
        org.lwjgl.opengl.GL11.glCopyPixels(x, y, width, height, type);
    }

    @Override public void glCullFace(@NativeType("GLenum") int mode) {
        org.lwjgl.opengl.GL11.glCullFace(mode);
    }

    @Override public void glDeleteLists(@NativeType("GLuint") int list, @NativeType("GLsizei") int range) {
        org.lwjgl.opengl.GL11.glDeleteLists(list, range);
    }

    @Override public void glDepthFunc(@NativeType("GLenum") int func) {
        org.lwjgl.opengl.GL11.glDepthFunc(func);
    }

    @Override public void glDepthMask(@NativeType("GLboolean") boolean flag) {
        org.lwjgl.opengl.GL11.glDepthMask(flag);
    }

    @Override public void glDepthRange(@NativeType("GLdouble") double zNear, @NativeType("GLdouble") double zFar) {
        org.lwjgl.opengl.GL11.glDepthRange(zNear, zFar);
    }

    @Override public void glDisableClientState(@NativeType("GLenum") int cap) {
        org.lwjgl.opengl.GL11.glDisableClientState(cap);
    }

    @Override public void glDrawArrays(@NativeType("GLenum") int mode, @NativeType("GLint") int first, @NativeType("GLsizei") int count) {
        org.lwjgl.opengl.GL11.glDrawArrays(mode, first, count);
    }

    @Override public void glDrawBuffer(@NativeType("GLenum") int buf) {
        org.lwjgl.opengl.GL11.glDrawBuffer(buf);
    }

    @Override public void nglDrawElements(int mode, int count, int type, long indices) {
        org.lwjgl.opengl.GL11.nglDrawElements(mode, count, type, indices);
    }

    @Override public void glDrawElements(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices) {
        org.lwjgl.opengl.GL11.glDrawElements(mode, count, type, indices);
    }

    @Override public void glDrawElements(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices) {
        org.lwjgl.opengl.GL11.glDrawElements(mode, type, indices);
    }

    @Override public void glDrawElements(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices) {
        org.lwjgl.opengl.GL11.glDrawElements(mode, indices);
    }

    @Override public void glDrawElements(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices) {
        org.lwjgl.opengl.GL11.glDrawElements(mode, indices);
    }

    @Override public void glDrawElements(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices) {
        org.lwjgl.opengl.GL11.glDrawElements(mode, indices);
    }

    @Override public void nglDrawPixels(int width, int height, int format, int type, long pixels) {
        org.lwjgl.opengl.GL11.nglDrawPixels(width, height, format, type, pixels);
    }

    @Override public void glDrawPixels(@NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer pixels) {
        org.lwjgl.opengl.GL11.glDrawPixels(width, height, format, type, pixels);
    }

    @Override public void glDrawPixels(@NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        org.lwjgl.opengl.GL11.glDrawPixels(width, height, format, type, pixels);
    }

    @Override public void glDrawPixels(@NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer pixels) {
        org.lwjgl.opengl.GL11.glDrawPixels(width, height, format, type, pixels);
    }

    @Override public void glDrawPixels(@NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer pixels) {
        org.lwjgl.opengl.GL11.glDrawPixels(width, height, format, type, pixels);
    }

    @Override public void glDrawPixels(@NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer pixels) {
        org.lwjgl.opengl.GL11.glDrawPixels(width, height, format, type, pixels);
    }

    @Override public void glDrawPixels(@NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] pixels) {
        org.lwjgl.opengl.GL11.glDrawPixels(width, height, format, type, pixels);
    }

    @Override public void glDrawPixels(@NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] pixels) {
        org.lwjgl.opengl.GL11.glDrawPixels(width, height, format, type, pixels);
    }

    @Override public void glDrawPixels(@NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] pixels) {
        org.lwjgl.opengl.GL11.glDrawPixels(width, height, format, type, pixels);
    }

    @Override public void glEdgeFlag(@NativeType("GLboolean") boolean flag) {
        org.lwjgl.opengl.GL11.glEdgeFlag(flag);
    }

    @Override public void nglEdgeFlagv(long flag) {
        org.lwjgl.opengl.GL11.nglEdgeFlagv(flag);
    }

    @Override public void glEdgeFlagv(@NativeType("GLboolean const *") ByteBuffer flag) {
        org.lwjgl.opengl.GL11.glEdgeFlagv(flag);
    }

    @Override public void nglEdgeFlagPointer(int stride, long pointer) {
        org.lwjgl.opengl.GL11.nglEdgeFlagPointer(stride, pointer);
    }

    @Override public void glEdgeFlagPointer(@NativeType("GLsizei") int stride, @NativeType("GLboolean const *") ByteBuffer pointer) {
        org.lwjgl.opengl.GL11.glEdgeFlagPointer(stride, pointer);
    }

    @Override public void glEdgeFlagPointer(@NativeType("GLsizei") int stride, @NativeType("GLboolean const *") long pointer) {
        org.lwjgl.opengl.GL11.glEdgeFlagPointer(stride, pointer);
    }

    @Override public void glEnableClientState(@NativeType("GLenum") int cap) {
        org.lwjgl.opengl.GL11.glEnableClientState(cap);
    }

    @Override public void glEnd() {
        org.lwjgl.opengl.GL11.glEnd();
    }

    @Override public void glEvalCoord1f(@NativeType("GLfloat") float u) {
        org.lwjgl.opengl.GL11.glEvalCoord1f(u);
    }

    @Override public void nglEvalCoord1fv(long u) {
        org.lwjgl.opengl.GL11.nglEvalCoord1fv(u);
    }

    @Override public void glEvalCoord1fv(@NativeType("GLfloat const *") FloatBuffer u) {
        org.lwjgl.opengl.GL11.glEvalCoord1fv(u);
    }

    @Override public void glEvalCoord1fv(@NativeType("GLfloat const *") float[] u) {
        org.lwjgl.opengl.GL11.glEvalCoord1fv(u);
    }

    @Override public void glEvalCoord1d(@NativeType("GLdouble") double u) {
        org.lwjgl.opengl.GL11.glEvalCoord1d(u);
    }

    @Override public void nglEvalCoord1dv(long u) {
        org.lwjgl.opengl.GL11.nglEvalCoord1dv(u);
    }

    @Override public void glEvalCoord1dv(@NativeType("GLdouble const *") DoubleBuffer u) {
        org.lwjgl.opengl.GL11.glEvalCoord1dv(u);
    }

    @Override public void glEvalCoord1dv(@NativeType("GLdouble const *") double[] u) {
        org.lwjgl.opengl.GL11.glEvalCoord1dv(u);
    }

    @Override public void glEvalCoord2f(@NativeType("GLfloat") float u, @NativeType("GLfloat") float v) {
        org.lwjgl.opengl.GL11.glEvalCoord2f(u, v);
    }

    @Override public void nglEvalCoord2fv(long u) {
        org.lwjgl.opengl.GL11.nglEvalCoord2fv(u);
    }

    @Override public void glEvalCoord2fv(@NativeType("GLfloat const *") FloatBuffer u) {
        org.lwjgl.opengl.GL11.glEvalCoord2fv(u);
    }

    @Override public void glEvalCoord2fv(@NativeType("GLfloat const *") float[] u) {
        org.lwjgl.opengl.GL11.glEvalCoord2fv(u);
    }

    @Override public void glEvalCoord2d(@NativeType("GLdouble") double u, @NativeType("GLdouble") double v) {
        org.lwjgl.opengl.GL11.glEvalCoord2d(u, v);
    }

    @Override public void nglEvalCoord2dv(long u) {
        org.lwjgl.opengl.GL11.nglEvalCoord2dv(u);
    }

    @Override public void glEvalCoord2dv(@NativeType("GLdouble const *") DoubleBuffer u) {
        org.lwjgl.opengl.GL11.glEvalCoord2dv(u);
    }

    @Override public void glEvalCoord2dv(@NativeType("GLdouble const *") double[] u) {
        org.lwjgl.opengl.GL11.glEvalCoord2dv(u);
    }

    @Override public void glEvalMesh1(@NativeType("GLenum") int mode, @NativeType("GLint") int i1, @NativeType("GLint") int i2) {
        org.lwjgl.opengl.GL11.glEvalMesh1(mode, i1, i2);
    }

    @Override public void glEvalMesh2(@NativeType("GLenum") int mode, @NativeType("GLint") int i1, @NativeType("GLint") int i2, @NativeType("GLint") int j1, @NativeType("GLint") int j2) {
        org.lwjgl.opengl.GL11.glEvalMesh2(mode, i1, i2, j1, j2);
    }

    @Override public void glEvalPoint1(@NativeType("GLint") int i) {
        org.lwjgl.opengl.GL11.glEvalPoint1(i);
    }

    @Override public void glEvalPoint2(@NativeType("GLint") int i, @NativeType("GLint") int j) {
        org.lwjgl.opengl.GL11.glEvalPoint2(i, j);
    }

    @Override public void nglFeedbackBuffer(int size, int type, long buffer) {
        org.lwjgl.opengl.GL11.nglFeedbackBuffer(size, type, buffer);
    }

    @Override public void glFeedbackBuffer(@NativeType("GLenum") int type, @NativeType("GLfloat *") FloatBuffer buffer) {
        org.lwjgl.opengl.GL11.glFeedbackBuffer(type, buffer);
    }

    @Override public void glFeedbackBuffer(@NativeType("GLenum") int type, @NativeType("GLfloat *") float[] buffer) {
        org.lwjgl.opengl.GL11.glFeedbackBuffer(type, buffer);
    }

    @Override public void glFinish() {
        org.lwjgl.opengl.GL11.glFinish();
    }

    @Override public void glFlush() {
        org.lwjgl.opengl.GL11.glFlush();
    }

    @Override public void glFogi(@NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        org.lwjgl.opengl.GL11.glFogi(pname, param);
    }

    @Override public void nglFogiv(int pname, long params) {
        org.lwjgl.opengl.GL11.nglFogiv(pname, params);
    }

    @Override public void glFogiv(@NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        org.lwjgl.opengl.GL11.glFogiv(pname, params);
    }

    @Override public void glFogiv(@NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        org.lwjgl.opengl.GL11.glFogiv(pname, params);
    }

    @Override public void glFogf(@NativeType("GLenum") int pname, @NativeType("GLfloat") float param) {
        org.lwjgl.opengl.GL11.glFogf(pname, param);
    }

    @Override public void nglFogfv(int pname, long params) {
        org.lwjgl.opengl.GL11.nglFogfv(pname, params);
    }

    @Override public void glFogfv(@NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params) {
        org.lwjgl.opengl.GL11.glFogfv(pname, params);
    }

    @Override public void glFogfv(@NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] params) {
        org.lwjgl.opengl.GL11.glFogfv(pname, params);
    }

    @Override public void glFrontFace(@NativeType("GLenum") int dir) {
        org.lwjgl.opengl.GL11.glFrontFace(dir);
    }

@NativeType("GLuint")
    @Override public int glGenLists(@NativeType("GLsizei") int s) {
        return org.lwjgl.opengl.GL11.glGenLists(s);
    }

    @Override public void nglGenTextures(int n, long textures) {
        org.lwjgl.opengl.GL11.nglGenTextures(n, textures);
    }

    @Override public void glGenTextures(@NativeType("GLuint *") IntBuffer textures) {
        org.lwjgl.opengl.GL11.glGenTextures(textures);
    }

@NativeType("void")
    @Override public int glGenTextures() {
        return org.lwjgl.opengl.GL11.glGenTextures();
    }

    @Override public void glGenTextures(@NativeType("GLuint *") int[] textures) {
        org.lwjgl.opengl.GL11.glGenTextures(textures);
    }

    @Override public void nglDeleteTextures(int n, long textures) {
        org.lwjgl.opengl.GL11.nglDeleteTextures(n, textures);
    }

    @Override public void glDeleteTextures(@NativeType("GLuint const *") IntBuffer textures) {
        org.lwjgl.opengl.GL11.glDeleteTextures(textures);
    }

    @Override public void glDeleteTextures(@NativeType("GLuint const *") int texture) {
        org.lwjgl.opengl.GL11.glDeleteTextures(texture);
    }

    @Override public void glDeleteTextures(@NativeType("GLuint const *") int[] textures) {
        org.lwjgl.opengl.GL11.glDeleteTextures(textures);
    }

    @Override public void nglGetClipPlane(int plane, long equation) {
        org.lwjgl.opengl.GL11.nglGetClipPlane(plane, equation);
    }

    @Override public void glGetClipPlane(@NativeType("GLenum") int plane, @NativeType("GLdouble *") DoubleBuffer equation) {
        org.lwjgl.opengl.GL11.glGetClipPlane(plane, equation);
    }

    @Override public void glGetClipPlane(@NativeType("GLenum") int plane, @NativeType("GLdouble *") double[] equation) {
        org.lwjgl.opengl.GL11.glGetClipPlane(plane, equation);
    }

    @Override public void nglGetBooleanv(int pname, long params) {
        org.lwjgl.opengl.GL11.nglGetBooleanv(pname, params);
    }

    @Override public void glGetBooleanv(@NativeType("GLenum") int pname, @NativeType("GLboolean *") ByteBuffer params) {
        org.lwjgl.opengl.GL11.glGetBooleanv(pname, params);
    }

@NativeType("void")
    @Override public boolean glGetBoolean(@NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL11.glGetBoolean(pname);
    }

    @Override public void nglGetFloatv(int pname, long params) {
        org.lwjgl.opengl.GL11.nglGetFloatv(pname, params);
    }

    @Override public void glGetFloatv(@NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        org.lwjgl.opengl.GL11.glGetFloatv(pname, params);
    }

    @Override public void glGetFloatv(@NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        org.lwjgl.opengl.GL11.glGetFloatv(pname, params);
    }

@NativeType("void")
    @Override public float glGetFloat(@NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL11.glGetFloat(pname);
    }

    @Override public void nglGetIntegerv(int pname, long params) {
        org.lwjgl.opengl.GL11.nglGetIntegerv(pname, params);
    }

    @Override public void glGetIntegerv(@NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengl.GL11.glGetIntegerv(pname, params);
    }

    @Override public void glGetIntegerv(@NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengl.GL11.glGetIntegerv(pname, params);
    }

@NativeType("void")
    @Override public int glGetInteger(@NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL11.glGetInteger(pname);
    }

    @Override public void nglGetDoublev(int pname, long params) {
        org.lwjgl.opengl.GL11.nglGetDoublev(pname, params);
    }

    @Override public void glGetDoublev(@NativeType("GLenum") int pname, @NativeType("GLdouble *") DoubleBuffer params) {
        org.lwjgl.opengl.GL11.glGetDoublev(pname, params);
    }

    @Override public void glGetDoublev(@NativeType("GLenum") int pname, @NativeType("GLdouble *") double[] params) {
        org.lwjgl.opengl.GL11.glGetDoublev(pname, params);
    }

@NativeType("void")
    @Override public double glGetDouble(@NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL11.glGetDouble(pname);
    }

@NativeType("GLenum")
    @Override public int glGetError() {
        return org.lwjgl.opengl.GL11.glGetError();
    }

    @Override public void nglGetLightiv(int light, int pname, long data) {
        org.lwjgl.opengl.GL11.nglGetLightiv(light, pname, data);
    }

    @Override public void glGetLightiv(@NativeType("GLenum") int light, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer data) {
        org.lwjgl.opengl.GL11.glGetLightiv(light, pname, data);
    }

    @Override public void glGetLightiv(@NativeType("GLenum") int light, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] data) {
        org.lwjgl.opengl.GL11.glGetLightiv(light, pname, data);
    }

@NativeType("void")
    @Override public int glGetLighti(@NativeType("GLenum") int light, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL11.glGetLighti(light, pname);
    }

    @Override public void nglGetLightfv(int light, int pname, long data) {
        org.lwjgl.opengl.GL11.nglGetLightfv(light, pname, data);
    }

    @Override public void glGetLightfv(@NativeType("GLenum") int light, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer data) {
        org.lwjgl.opengl.GL11.glGetLightfv(light, pname, data);
    }

    @Override public void glGetLightfv(@NativeType("GLenum") int light, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] data) {
        org.lwjgl.opengl.GL11.glGetLightfv(light, pname, data);
    }

@NativeType("void")
    @Override public float glGetLightf(@NativeType("GLenum") int light, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL11.glGetLightf(light, pname);
    }

    @Override public void nglGetMapiv(int target, int query, long data) {
        org.lwjgl.opengl.GL11.nglGetMapiv(target, query, data);
    }

    @Override public void glGetMapiv(@NativeType("GLenum") int target, @NativeType("GLenum") int query, @NativeType("GLint *") IntBuffer data) {
        org.lwjgl.opengl.GL11.glGetMapiv(target, query, data);
    }

    @Override public void glGetMapiv(@NativeType("GLenum") int target, @NativeType("GLenum") int query, @NativeType("GLint *") int[] data) {
        org.lwjgl.opengl.GL11.glGetMapiv(target, query, data);
    }

@NativeType("void")
    @Override public int glGetMapi(@NativeType("GLenum") int target, @NativeType("GLenum") int query) {
        return org.lwjgl.opengl.GL11.glGetMapi(target, query);
    }

    @Override public void nglGetMapfv(int target, int query, long data) {
        org.lwjgl.opengl.GL11.nglGetMapfv(target, query, data);
    }

    @Override public void glGetMapfv(@NativeType("GLenum") int target, @NativeType("GLenum") int query, @NativeType("GLfloat *") FloatBuffer data) {
        org.lwjgl.opengl.GL11.glGetMapfv(target, query, data);
    }

    @Override public void glGetMapfv(@NativeType("GLenum") int target, @NativeType("GLenum") int query, @NativeType("GLfloat *") float[] data) {
        org.lwjgl.opengl.GL11.glGetMapfv(target, query, data);
    }

@NativeType("void")
    @Override public float glGetMapf(@NativeType("GLenum") int target, @NativeType("GLenum") int query) {
        return org.lwjgl.opengl.GL11.glGetMapf(target, query);
    }

    @Override public void nglGetMapdv(int target, int query, long data) {
        org.lwjgl.opengl.GL11.nglGetMapdv(target, query, data);
    }

    @Override public void glGetMapdv(@NativeType("GLenum") int target, @NativeType("GLenum") int query, @NativeType("GLdouble *") DoubleBuffer data) {
        org.lwjgl.opengl.GL11.glGetMapdv(target, query, data);
    }

    @Override public void glGetMapdv(@NativeType("GLenum") int target, @NativeType("GLenum") int query, @NativeType("GLdouble *") double[] data) {
        org.lwjgl.opengl.GL11.glGetMapdv(target, query, data);
    }

@NativeType("void")
    @Override public double glGetMapd(@NativeType("GLenum") int target, @NativeType("GLenum") int query) {
        return org.lwjgl.opengl.GL11.glGetMapd(target, query);
    }

    @Override public void nglGetMaterialiv(int face, int pname, long data) {
        org.lwjgl.opengl.GL11.nglGetMaterialiv(face, pname, data);
    }

    @Override public void glGetMaterialiv(@NativeType("GLenum") int face, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer data) {
        org.lwjgl.opengl.GL11.glGetMaterialiv(face, pname, data);
    }

    @Override public void glGetMaterialiv(@NativeType("GLenum") int face, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] data) {
        org.lwjgl.opengl.GL11.glGetMaterialiv(face, pname, data);
    }

    @Override public void nglGetMaterialfv(int face, int pname, long data) {
        org.lwjgl.opengl.GL11.nglGetMaterialfv(face, pname, data);
    }

    @Override public void glGetMaterialfv(@NativeType("GLenum") int face, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer data) {
        org.lwjgl.opengl.GL11.glGetMaterialfv(face, pname, data);
    }

    @Override public void glGetMaterialfv(@NativeType("GLenum") int face, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] data) {
        org.lwjgl.opengl.GL11.glGetMaterialfv(face, pname, data);
    }

    @Override public void nglGetPixelMapfv(int map, long data) {
        org.lwjgl.opengl.GL11.nglGetPixelMapfv(map, data);
    }

    @Override public void glGetPixelMapfv(@NativeType("GLenum") int map, @NativeType("GLfloat *") FloatBuffer data) {
        org.lwjgl.opengl.GL11.glGetPixelMapfv(map, data);
    }

    @Override public void glGetPixelMapfv(@NativeType("GLenum") int map, @NativeType("GLfloat *") long data) {
        org.lwjgl.opengl.GL11.glGetPixelMapfv(map, data);
    }

    @Override public void glGetPixelMapfv(@NativeType("GLenum") int map, @NativeType("GLfloat *") float[] data) {
        org.lwjgl.opengl.GL11.glGetPixelMapfv(map, data);
    }

    @Override public void nglGetPixelMapusv(int map, long data) {
        org.lwjgl.opengl.GL11.nglGetPixelMapusv(map, data);
    }

    @Override public void glGetPixelMapusv(@NativeType("GLenum") int map, @NativeType("GLushort *") ShortBuffer data) {
        org.lwjgl.opengl.GL11.glGetPixelMapusv(map, data);
    }

    @Override public void glGetPixelMapusv(@NativeType("GLenum") int map, @NativeType("GLushort *") long data) {
        org.lwjgl.opengl.GL11.glGetPixelMapusv(map, data);
    }

    @Override public void glGetPixelMapusv(@NativeType("GLenum") int map, @NativeType("GLushort *") short[] data) {
        org.lwjgl.opengl.GL11.glGetPixelMapusv(map, data);
    }

    @Override public void nglGetPixelMapuiv(int map, long data) {
        org.lwjgl.opengl.GL11.nglGetPixelMapuiv(map, data);
    }

    @Override public void glGetPixelMapuiv(@NativeType("GLenum") int map, @NativeType("GLuint *") IntBuffer data) {
        org.lwjgl.opengl.GL11.glGetPixelMapuiv(map, data);
    }

    @Override public void glGetPixelMapuiv(@NativeType("GLenum") int map, @NativeType("GLuint *") long data) {
        org.lwjgl.opengl.GL11.glGetPixelMapuiv(map, data);
    }

    @Override public void glGetPixelMapuiv(@NativeType("GLenum") int map, @NativeType("GLuint *") int[] data) {
        org.lwjgl.opengl.GL11.glGetPixelMapuiv(map, data);
    }

    @Override public void nglGetPointerv(int pname, long params) {
        org.lwjgl.opengl.GL11.nglGetPointerv(pname, params);
    }

    @Override public void glGetPointerv(@NativeType("GLenum") int pname, @NativeType("void **") PointerBuffer params) {
        org.lwjgl.opengl.GL11.glGetPointerv(pname, params);
    }

@NativeType("void")
    @Override public long glGetPointer(@NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL11.glGetPointer(pname);
    }

    @Override public void nglGetPolygonStipple(long pattern) {
        org.lwjgl.opengl.GL11.nglGetPolygonStipple(pattern);
    }

    @Override public void glGetPolygonStipple(@NativeType("void *") ByteBuffer pattern) {
        org.lwjgl.opengl.GL11.glGetPolygonStipple(pattern);
    }

    @Override public void glGetPolygonStipple(@NativeType("void *") long pattern) {
        org.lwjgl.opengl.GL11.glGetPolygonStipple(pattern);
    }

    @Override public long nglGetString(int name) {
        return org.lwjgl.opengl.GL11.nglGetString(name);
    }

@Nullable
@NativeType("GLubyte const *")
    @Override public String glGetString(@NativeType("GLenum") int name) {
        return org.lwjgl.opengl.GL11.glGetString(name);
    }

    @Override public void nglGetTexEnviv(int env, int pname, long data) {
        org.lwjgl.opengl.GL11.nglGetTexEnviv(env, pname, data);
    }

    @Override public void glGetTexEnviv(@NativeType("GLenum") int env, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer data) {
        org.lwjgl.opengl.GL11.glGetTexEnviv(env, pname, data);
    }

    @Override public void glGetTexEnviv(@NativeType("GLenum") int env, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] data) {
        org.lwjgl.opengl.GL11.glGetTexEnviv(env, pname, data);
    }

@NativeType("void")
    @Override public int glGetTexEnvi(@NativeType("GLenum") int env, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL11.glGetTexEnvi(env, pname);
    }

    @Override public void nglGetTexEnvfv(int env, int pname, long data) {
        org.lwjgl.opengl.GL11.nglGetTexEnvfv(env, pname, data);
    }

    @Override public void glGetTexEnvfv(@NativeType("GLenum") int env, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer data) {
        org.lwjgl.opengl.GL11.glGetTexEnvfv(env, pname, data);
    }

    @Override public void glGetTexEnvfv(@NativeType("GLenum") int env, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] data) {
        org.lwjgl.opengl.GL11.glGetTexEnvfv(env, pname, data);
    }

@NativeType("void")
    @Override public float glGetTexEnvf(@NativeType("GLenum") int env, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL11.glGetTexEnvf(env, pname);
    }

    @Override public void nglGetTexGeniv(int coord, int pname, long data) {
        org.lwjgl.opengl.GL11.nglGetTexGeniv(coord, pname, data);
    }

    @Override public void glGetTexGeniv(@NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer data) {
        org.lwjgl.opengl.GL11.glGetTexGeniv(coord, pname, data);
    }

    @Override public void glGetTexGeniv(@NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] data) {
        org.lwjgl.opengl.GL11.glGetTexGeniv(coord, pname, data);
    }

@NativeType("void")
    @Override public int glGetTexGeni(@NativeType("GLenum") int coord, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL11.glGetTexGeni(coord, pname);
    }

    @Override public void nglGetTexGenfv(int coord, int pname, long data) {
        org.lwjgl.opengl.GL11.nglGetTexGenfv(coord, pname, data);
    }

    @Override public void glGetTexGenfv(@NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer data) {
        org.lwjgl.opengl.GL11.glGetTexGenfv(coord, pname, data);
    }

    @Override public void glGetTexGenfv(@NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] data) {
        org.lwjgl.opengl.GL11.glGetTexGenfv(coord, pname, data);
    }

@NativeType("void")
    @Override public float glGetTexGenf(@NativeType("GLenum") int coord, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL11.glGetTexGenf(coord, pname);
    }

    @Override public void nglGetTexGendv(int coord, int pname, long data) {
        org.lwjgl.opengl.GL11.nglGetTexGendv(coord, pname, data);
    }

    @Override public void glGetTexGendv(@NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLdouble *") DoubleBuffer data) {
        org.lwjgl.opengl.GL11.glGetTexGendv(coord, pname, data);
    }

    @Override public void glGetTexGendv(@NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLdouble *") double[] data) {
        org.lwjgl.opengl.GL11.glGetTexGendv(coord, pname, data);
    }

@NativeType("void")
    @Override public double glGetTexGend(@NativeType("GLenum") int coord, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL11.glGetTexGend(coord, pname);
    }

    @Override public void nglGetTexImage(int tex, int level, int format, int type, long pixels) {
        org.lwjgl.opengl.GL11.nglGetTexImage(tex, level, format, type, pixels);
    }

    @Override public void glGetTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer pixels) {
        org.lwjgl.opengl.GL11.glGetTexImage(tex, level, format, type, pixels);
    }

    @Override public void glGetTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") long pixels) {
        org.lwjgl.opengl.GL11.glGetTexImage(tex, level, format, type, pixels);
    }

    @Override public void glGetTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ShortBuffer pixels) {
        org.lwjgl.opengl.GL11.glGetTexImage(tex, level, format, type, pixels);
    }

    @Override public void glGetTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") IntBuffer pixels) {
        org.lwjgl.opengl.GL11.glGetTexImage(tex, level, format, type, pixels);
    }

    @Override public void glGetTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") FloatBuffer pixels) {
        org.lwjgl.opengl.GL11.glGetTexImage(tex, level, format, type, pixels);
    }

    @Override public void glGetTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") DoubleBuffer pixels) {
        org.lwjgl.opengl.GL11.glGetTexImage(tex, level, format, type, pixels);
    }

    @Override public void glGetTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") short[] pixels) {
        org.lwjgl.opengl.GL11.glGetTexImage(tex, level, format, type, pixels);
    }

    @Override public void glGetTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") int[] pixels) {
        org.lwjgl.opengl.GL11.glGetTexImage(tex, level, format, type, pixels);
    }

    @Override public void glGetTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") float[] pixels) {
        org.lwjgl.opengl.GL11.glGetTexImage(tex, level, format, type, pixels);
    }

    @Override public void glGetTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") double[] pixels) {
        org.lwjgl.opengl.GL11.glGetTexImage(tex, level, format, type, pixels);
    }

    @Override public void nglGetTexLevelParameteriv(int target, int level, int pname, long params) {
        org.lwjgl.opengl.GL11.nglGetTexLevelParameteriv(target, level, pname, params);
    }

    @Override public void glGetTexLevelParameteriv(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengl.GL11.glGetTexLevelParameteriv(target, level, pname, params);
    }

    @Override public void glGetTexLevelParameteriv(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengl.GL11.glGetTexLevelParameteriv(target, level, pname, params);
    }

@NativeType("void")
    @Override public int glGetTexLevelParameteri(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL11.glGetTexLevelParameteri(target, level, pname);
    }

    @Override public void nglGetTexLevelParameterfv(int target, int level, int pname, long params) {
        org.lwjgl.opengl.GL11.nglGetTexLevelParameterfv(target, level, pname, params);
    }

    @Override public void glGetTexLevelParameterfv(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        org.lwjgl.opengl.GL11.glGetTexLevelParameterfv(target, level, pname, params);
    }

    @Override public void glGetTexLevelParameterfv(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        org.lwjgl.opengl.GL11.glGetTexLevelParameterfv(target, level, pname, params);
    }

@NativeType("void")
    @Override public float glGetTexLevelParameterf(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL11.glGetTexLevelParameterf(target, level, pname);
    }

    @Override public void nglGetTexParameteriv(int target, int pname, long params) {
        org.lwjgl.opengl.GL11.nglGetTexParameteriv(target, pname, params);
    }

    @Override public void glGetTexParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengl.GL11.glGetTexParameteriv(target, pname, params);
    }

    @Override public void glGetTexParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengl.GL11.glGetTexParameteriv(target, pname, params);
    }

@NativeType("void")
    @Override public int glGetTexParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL11.glGetTexParameteri(target, pname);
    }

    @Override public void nglGetTexParameterfv(int target, int pname, long params) {
        org.lwjgl.opengl.GL11.nglGetTexParameterfv(target, pname, params);
    }

    @Override public void glGetTexParameterfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        org.lwjgl.opengl.GL11.glGetTexParameterfv(target, pname, params);
    }

    @Override public void glGetTexParameterfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        org.lwjgl.opengl.GL11.glGetTexParameterfv(target, pname, params);
    }

@NativeType("void")
    @Override public float glGetTexParameterf(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL11.glGetTexParameterf(target, pname);
    }

    @Override public void glHint(@NativeType("GLenum") int target, @NativeType("GLenum") int hint) {
        org.lwjgl.opengl.GL11.glHint(target, hint);
    }

    @Override public void glIndexi(@NativeType("GLint") int index) {
        org.lwjgl.opengl.GL11.glIndexi(index);
    }

    @Override public void glIndexub(@NativeType("GLubyte") byte index) {
        org.lwjgl.opengl.GL11.glIndexub(index);
    }

    @Override public void glIndexs(@NativeType("GLshort") short index) {
        org.lwjgl.opengl.GL11.glIndexs(index);
    }

    @Override public void glIndexf(@NativeType("GLfloat") float index) {
        org.lwjgl.opengl.GL11.glIndexf(index);
    }

    @Override public void glIndexd(@NativeType("GLdouble") double index) {
        org.lwjgl.opengl.GL11.glIndexd(index);
    }

    @Override public void nglIndexiv(long index) {
        org.lwjgl.opengl.GL11.nglIndexiv(index);
    }

    @Override public void glIndexiv(@NativeType("GLint const *") IntBuffer index) {
        org.lwjgl.opengl.GL11.glIndexiv(index);
    }

    @Override public void glIndexiv(@NativeType("GLint const *") int[] index) {
        org.lwjgl.opengl.GL11.glIndexiv(index);
    }

    @Override public void nglIndexubv(long index) {
        org.lwjgl.opengl.GL11.nglIndexubv(index);
    }

    @Override public void glIndexubv(@NativeType("GLubyte const *") ByteBuffer index) {
        org.lwjgl.opengl.GL11.glIndexubv(index);
    }

    @Override public void nglIndexsv(long index) {
        org.lwjgl.opengl.GL11.nglIndexsv(index);
    }

    @Override public void glIndexsv(@NativeType("GLshort const *") ShortBuffer index) {
        org.lwjgl.opengl.GL11.glIndexsv(index);
    }

    @Override public void glIndexsv(@NativeType("GLshort const *") short[] index) {
        org.lwjgl.opengl.GL11.glIndexsv(index);
    }

    @Override public void nglIndexfv(long index) {
        org.lwjgl.opengl.GL11.nglIndexfv(index);
    }

    @Override public void glIndexfv(@NativeType("GLfloat const *") FloatBuffer index) {
        org.lwjgl.opengl.GL11.glIndexfv(index);
    }

    @Override public void glIndexfv(@NativeType("GLfloat const *") float[] index) {
        org.lwjgl.opengl.GL11.glIndexfv(index);
    }

    @Override public void nglIndexdv(long index) {
        org.lwjgl.opengl.GL11.nglIndexdv(index);
    }

    @Override public void glIndexdv(@NativeType("GLdouble const *") DoubleBuffer index) {
        org.lwjgl.opengl.GL11.glIndexdv(index);
    }

    @Override public void glIndexdv(@NativeType("GLdouble const *") double[] index) {
        org.lwjgl.opengl.GL11.glIndexdv(index);
    }

    @Override public void glIndexMask(@NativeType("GLuint") int mask) {
        org.lwjgl.opengl.GL11.glIndexMask(mask);
    }

    @Override public void nglIndexPointer(int type, int stride, long pointer) {
        org.lwjgl.opengl.GL11.nglIndexPointer(type, stride, pointer);
    }

    @Override public void glIndexPointer(@NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        org.lwjgl.opengl.GL11.glIndexPointer(type, stride, pointer);
    }

    @Override public void glIndexPointer(@NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        org.lwjgl.opengl.GL11.glIndexPointer(type, stride, pointer);
    }

    @Override public void glIndexPointer(@NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        org.lwjgl.opengl.GL11.glIndexPointer(stride, pointer);
    }

    @Override public void glIndexPointer(@NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer) {
        org.lwjgl.opengl.GL11.glIndexPointer(stride, pointer);
    }

    @Override public void glIndexPointer(@NativeType("GLsizei") int stride, @NativeType("void const *") IntBuffer pointer) {
        org.lwjgl.opengl.GL11.glIndexPointer(stride, pointer);
    }

    @Override public void glInitNames() {
        org.lwjgl.opengl.GL11.glInitNames();
    }

    @Override public void nglInterleavedArrays(int format, int stride, long pointer) {
        org.lwjgl.opengl.GL11.nglInterleavedArrays(format, stride, pointer);
    }

    @Override public void glInterleavedArrays(@NativeType("GLenum") int format, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        org.lwjgl.opengl.GL11.glInterleavedArrays(format, stride, pointer);
    }

    @Override public void glInterleavedArrays(@NativeType("GLenum") int format, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        org.lwjgl.opengl.GL11.glInterleavedArrays(format, stride, pointer);
    }

    @Override public void glInterleavedArrays(@NativeType("GLenum") int format, @NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer) {
        org.lwjgl.opengl.GL11.glInterleavedArrays(format, stride, pointer);
    }

    @Override public void glInterleavedArrays(@NativeType("GLenum") int format, @NativeType("GLsizei") int stride, @NativeType("void const *") IntBuffer pointer) {
        org.lwjgl.opengl.GL11.glInterleavedArrays(format, stride, pointer);
    }

    @Override public void glInterleavedArrays(@NativeType("GLenum") int format, @NativeType("GLsizei") int stride, @NativeType("void const *") FloatBuffer pointer) {
        org.lwjgl.opengl.GL11.glInterleavedArrays(format, stride, pointer);
    }

    @Override public void glInterleavedArrays(@NativeType("GLenum") int format, @NativeType("GLsizei") int stride, @NativeType("void const *") DoubleBuffer pointer) {
        org.lwjgl.opengl.GL11.glInterleavedArrays(format, stride, pointer);
    }

    @Override public void glInterleavedArrays(@NativeType("GLenum") int format, @NativeType("GLsizei") int stride, @NativeType("void const *") short[] pointer) {
        org.lwjgl.opengl.GL11.glInterleavedArrays(format, stride, pointer);
    }

    @Override public void glInterleavedArrays(@NativeType("GLenum") int format, @NativeType("GLsizei") int stride, @NativeType("void const *") int[] pointer) {
        org.lwjgl.opengl.GL11.glInterleavedArrays(format, stride, pointer);
    }

    @Override public void glInterleavedArrays(@NativeType("GLenum") int format, @NativeType("GLsizei") int stride, @NativeType("void const *") float[] pointer) {
        org.lwjgl.opengl.GL11.glInterleavedArrays(format, stride, pointer);
    }

    @Override public void glInterleavedArrays(@NativeType("GLenum") int format, @NativeType("GLsizei") int stride, @NativeType("void const *") double[] pointer) {
        org.lwjgl.opengl.GL11.glInterleavedArrays(format, stride, pointer);
    }

@NativeType("GLboolean")
    @Override public boolean glIsEnabled(@NativeType("GLenum") int cap) {
        return org.lwjgl.opengl.GL11.glIsEnabled(cap);
    }

@NativeType("GLboolean")
    @Override public boolean glIsList(@NativeType("GLuint") int list) {
        return org.lwjgl.opengl.GL11.glIsList(list);
    }

@NativeType("GLboolean")
    @Override public boolean glIsTexture(@NativeType("GLuint") int texture) {
        return org.lwjgl.opengl.GL11.glIsTexture(texture);
    }

    @Override public void glLightModeli(@NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        org.lwjgl.opengl.GL11.glLightModeli(pname, param);
    }

    @Override public void glLightModelf(@NativeType("GLenum") int pname, @NativeType("GLfloat") float param) {
        org.lwjgl.opengl.GL11.glLightModelf(pname, param);
    }

    @Override public void nglLightModeliv(int pname, long params) {
        org.lwjgl.opengl.GL11.nglLightModeliv(pname, params);
    }

    @Override public void glLightModeliv(@NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        org.lwjgl.opengl.GL11.glLightModeliv(pname, params);
    }

    @Override public void glLightModeliv(@NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        org.lwjgl.opengl.GL11.glLightModeliv(pname, params);
    }

    @Override public void nglLightModelfv(int pname, long params) {
        org.lwjgl.opengl.GL11.nglLightModelfv(pname, params);
    }

    @Override public void glLightModelfv(@NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params) {
        org.lwjgl.opengl.GL11.glLightModelfv(pname, params);
    }

    @Override public void glLightModelfv(@NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] params) {
        org.lwjgl.opengl.GL11.glLightModelfv(pname, params);
    }

    @Override public void glLighti(@NativeType("GLenum") int light, @NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        org.lwjgl.opengl.GL11.glLighti(light, pname, param);
    }

    @Override public void glLightf(@NativeType("GLenum") int light, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param) {
        org.lwjgl.opengl.GL11.glLightf(light, pname, param);
    }

    @Override public void nglLightiv(int light, int pname, long params) {
        org.lwjgl.opengl.GL11.nglLightiv(light, pname, params);
    }

    @Override public void glLightiv(@NativeType("GLenum") int light, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        org.lwjgl.opengl.GL11.glLightiv(light, pname, params);
    }

    @Override public void glLightiv(@NativeType("GLenum") int light, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        org.lwjgl.opengl.GL11.glLightiv(light, pname, params);
    }

    @Override public void nglLightfv(int light, int pname, long params) {
        org.lwjgl.opengl.GL11.nglLightfv(light, pname, params);
    }

    @Override public void glLightfv(@NativeType("GLenum") int light, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params) {
        org.lwjgl.opengl.GL11.glLightfv(light, pname, params);
    }

    @Override public void glLightfv(@NativeType("GLenum") int light, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] params) {
        org.lwjgl.opengl.GL11.glLightfv(light, pname, params);
    }

    @Override public void glLineStipple(@NativeType("GLint") int factor, @NativeType("GLushort") short pattern) {
        org.lwjgl.opengl.GL11.glLineStipple(factor, pattern);
    }

    @Override public void glLineWidth(@NativeType("GLfloat") float width) {
        org.lwjgl.opengl.GL11.glLineWidth(width);
    }

    @Override public void glListBase(@NativeType("GLuint") int base) {
        org.lwjgl.opengl.GL11.glListBase(base);
    }

    @Override public void nglLoadMatrixf(long m) {
        org.lwjgl.opengl.GL11.nglLoadMatrixf(m);
    }

    @Override public void glLoadMatrixf(@NativeType("GLfloat const *") FloatBuffer m) {
        org.lwjgl.opengl.GL11.glLoadMatrixf(m);
    }

    @Override public void glLoadMatrixf(@NativeType("GLfloat const *") float[] m) {
        org.lwjgl.opengl.GL11.glLoadMatrixf(m);
    }

    @Override public void nglLoadMatrixd(long m) {
        org.lwjgl.opengl.GL11.nglLoadMatrixd(m);
    }

    @Override public void glLoadMatrixd(@NativeType("GLdouble const *") DoubleBuffer m) {
        org.lwjgl.opengl.GL11.glLoadMatrixd(m);
    }

    @Override public void glLoadMatrixd(@NativeType("GLdouble const *") double[] m) {
        org.lwjgl.opengl.GL11.glLoadMatrixd(m);
    }

    @Override public void glLoadIdentity() {
        org.lwjgl.opengl.GL11.glLoadIdentity();
    }

    @Override public void glLoadName(@NativeType("GLuint") int name) {
        org.lwjgl.opengl.GL11.glLoadName(name);
    }

    @Override public void glLogicOp(@NativeType("GLenum") int op) {
        org.lwjgl.opengl.GL11.glLogicOp(op);
    }

    @Override public void nglMap1f(int target, float u1, float u2, int stride, int order, long points) {
        org.lwjgl.opengl.GL11.nglMap1f(target, u1, u2, stride, order, points);
    }

    @Override public void glMap1f(@NativeType("GLenum") int target, @NativeType("GLfloat") float u1, @NativeType("GLfloat") float u2, @NativeType("GLint") int stride, @NativeType("GLint") int order, @NativeType("GLfloat const *") FloatBuffer points) {
        org.lwjgl.opengl.GL11.glMap1f(target, u1, u2, stride, order, points);
    }

    @Override public void glMap1f(@NativeType("GLenum") int target, @NativeType("GLfloat") float u1, @NativeType("GLfloat") float u2, @NativeType("GLint") int stride, @NativeType("GLint") int order, @NativeType("GLfloat const *") float[] points) {
        org.lwjgl.opengl.GL11.glMap1f(target, u1, u2, stride, order, points);
    }

    @Override public void nglMap1d(int target, double u1, double u2, int stride, int order, long points) {
        org.lwjgl.opengl.GL11.nglMap1d(target, u1, u2, stride, order, points);
    }

    @Override public void glMap1d(@NativeType("GLenum") int target, @NativeType("GLdouble") double u1, @NativeType("GLdouble") double u2, @NativeType("GLint") int stride, @NativeType("GLint") int order, @NativeType("GLdouble const *") DoubleBuffer points) {
        org.lwjgl.opengl.GL11.glMap1d(target, u1, u2, stride, order, points);
    }

    @Override public void glMap1d(@NativeType("GLenum") int target, @NativeType("GLdouble") double u1, @NativeType("GLdouble") double u2, @NativeType("GLint") int stride, @NativeType("GLint") int order, @NativeType("GLdouble const *") double[] points) {
        org.lwjgl.opengl.GL11.glMap1d(target, u1, u2, stride, order, points);
    }

    @Override public void nglMap2f(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, long points) {
        org.lwjgl.opengl.GL11.nglMap2f(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
    }

    @Override public void glMap2f(@NativeType("GLenum") int target, @NativeType("GLfloat") float u1, @NativeType("GLfloat") float u2, @NativeType("GLint") int ustride, @NativeType("GLint") int uorder, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2, @NativeType("GLint") int vstride, @NativeType("GLint") int vorder, @NativeType("GLfloat const *") FloatBuffer points) {
        org.lwjgl.opengl.GL11.glMap2f(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
    }

    @Override public void glMap2f(@NativeType("GLenum") int target, @NativeType("GLfloat") float u1, @NativeType("GLfloat") float u2, @NativeType("GLint") int ustride, @NativeType("GLint") int uorder, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2, @NativeType("GLint") int vstride, @NativeType("GLint") int vorder, @NativeType("GLfloat const *") float[] points) {
        org.lwjgl.opengl.GL11.glMap2f(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
    }

    @Override public void nglMap2d(int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, long points) {
        org.lwjgl.opengl.GL11.nglMap2d(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
    }

    @Override public void glMap2d(@NativeType("GLenum") int target, @NativeType("GLdouble") double u1, @NativeType("GLdouble") double u2, @NativeType("GLint") int ustride, @NativeType("GLint") int uorder, @NativeType("GLdouble") double v1, @NativeType("GLdouble") double v2, @NativeType("GLint") int vstride, @NativeType("GLint") int vorder, @NativeType("GLdouble const *") DoubleBuffer points) {
        org.lwjgl.opengl.GL11.glMap2d(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
    }

    @Override public void glMap2d(@NativeType("GLenum") int target, @NativeType("GLdouble") double u1, @NativeType("GLdouble") double u2, @NativeType("GLint") int ustride, @NativeType("GLint") int uorder, @NativeType("GLdouble") double v1, @NativeType("GLdouble") double v2, @NativeType("GLint") int vstride, @NativeType("GLint") int vorder, @NativeType("GLdouble const *") double[] points) {
        org.lwjgl.opengl.GL11.glMap2d(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
    }

    @Override public void glMapGrid1f(@NativeType("GLint") int n, @NativeType("GLfloat") float u1, @NativeType("GLfloat") float u2) {
        org.lwjgl.opengl.GL11.glMapGrid1f(n, u1, u2);
    }

    @Override public void glMapGrid1d(@NativeType("GLint") int n, @NativeType("GLdouble") double u1, @NativeType("GLdouble") double u2) {
        org.lwjgl.opengl.GL11.glMapGrid1d(n, u1, u2);
    }

    @Override public void glMapGrid2f(@NativeType("GLint") int un, @NativeType("GLfloat") float u1, @NativeType("GLfloat") float u2, @NativeType("GLint") int vn, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2) {
        org.lwjgl.opengl.GL11.glMapGrid2f(un, u1, u2, vn, v1, v2);
    }

    @Override public void glMapGrid2d(@NativeType("GLint") int un, @NativeType("GLdouble") double u1, @NativeType("GLdouble") double u2, @NativeType("GLint") int vn, @NativeType("GLdouble") double v1, @NativeType("GLdouble") double v2) {
        org.lwjgl.opengl.GL11.glMapGrid2d(un, u1, u2, vn, v1, v2);
    }

    @Override public void glMateriali(@NativeType("GLenum") int face, @NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        org.lwjgl.opengl.GL11.glMateriali(face, pname, param);
    }

    @Override public void glMaterialf(@NativeType("GLenum") int face, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param) {
        org.lwjgl.opengl.GL11.glMaterialf(face, pname, param);
    }

    @Override public void nglMaterialiv(int face, int pname, long params) {
        org.lwjgl.opengl.GL11.nglMaterialiv(face, pname, params);
    }

    @Override public void glMaterialiv(@NativeType("GLenum") int face, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        org.lwjgl.opengl.GL11.glMaterialiv(face, pname, params);
    }

    @Override public void glMaterialiv(@NativeType("GLenum") int face, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        org.lwjgl.opengl.GL11.glMaterialiv(face, pname, params);
    }

    @Override public void nglMaterialfv(int face, int pname, long params) {
        org.lwjgl.opengl.GL11.nglMaterialfv(face, pname, params);
    }

    @Override public void glMaterialfv(@NativeType("GLenum") int face, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params) {
        org.lwjgl.opengl.GL11.glMaterialfv(face, pname, params);
    }

    @Override public void glMaterialfv(@NativeType("GLenum") int face, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] params) {
        org.lwjgl.opengl.GL11.glMaterialfv(face, pname, params);
    }

    @Override public void glMatrixMode(@NativeType("GLenum") int mode) {
        org.lwjgl.opengl.GL11.glMatrixMode(mode);
    }

    @Override public void nglMultMatrixf(long m) {
        org.lwjgl.opengl.GL11.nglMultMatrixf(m);
    }

    @Override public void glMultMatrixf(@NativeType("GLfloat const *") FloatBuffer m) {
        org.lwjgl.opengl.GL11.glMultMatrixf(m);
    }

    @Override public void glMultMatrixf(@NativeType("GLfloat const *") float[] m) {
        org.lwjgl.opengl.GL11.glMultMatrixf(m);
    }

    @Override public void nglMultMatrixd(long m) {
        org.lwjgl.opengl.GL11.nglMultMatrixd(m);
    }

    @Override public void glMultMatrixd(@NativeType("GLdouble const *") DoubleBuffer m) {
        org.lwjgl.opengl.GL11.glMultMatrixd(m);
    }

    @Override public void glMultMatrixd(@NativeType("GLdouble const *") double[] m) {
        org.lwjgl.opengl.GL11.glMultMatrixd(m);
    }

    @Override public void glFrustum(@NativeType("GLdouble") double l, @NativeType("GLdouble") double r, @NativeType("GLdouble") double b, @NativeType("GLdouble") double t, @NativeType("GLdouble") double n, @NativeType("GLdouble") double f) {
        org.lwjgl.opengl.GL11.glFrustum(l, r, b, t, n, f);
    }

    @Override public void glNewList(@NativeType("GLuint") int n, @NativeType("GLenum") int mode) {
        org.lwjgl.opengl.GL11.glNewList(n, mode);
    }

    @Override public void glEndList() {
        org.lwjgl.opengl.GL11.glEndList();
    }

    @Override public void glNormal3f(@NativeType("GLfloat") float nx, @NativeType("GLfloat") float ny, @NativeType("GLfloat") float nz) {
        org.lwjgl.opengl.GL11.glNormal3f(nx, ny, nz);
    }

    @Override public void glNormal3b(@NativeType("GLbyte") byte nx, @NativeType("GLbyte") byte ny, @NativeType("GLbyte") byte nz) {
        org.lwjgl.opengl.GL11.glNormal3b(nx, ny, nz);
    }

    @Override public void glNormal3s(@NativeType("GLshort") short nx, @NativeType("GLshort") short ny, @NativeType("GLshort") short nz) {
        org.lwjgl.opengl.GL11.glNormal3s(nx, ny, nz);
    }

    @Override public void glNormal3i(@NativeType("GLint") int nx, @NativeType("GLint") int ny, @NativeType("GLint") int nz) {
        org.lwjgl.opengl.GL11.glNormal3i(nx, ny, nz);
    }

    @Override public void glNormal3d(@NativeType("GLdouble") double nx, @NativeType("GLdouble") double ny, @NativeType("GLdouble") double nz) {
        org.lwjgl.opengl.GL11.glNormal3d(nx, ny, nz);
    }

    @Override public void nglNormal3fv(long v) {
        org.lwjgl.opengl.GL11.nglNormal3fv(v);
    }

    @Override public void glNormal3fv(@NativeType("GLfloat const *") FloatBuffer v) {
        org.lwjgl.opengl.GL11.glNormal3fv(v);
    }

    @Override public void glNormal3fv(@NativeType("GLfloat const *") float[] v) {
        org.lwjgl.opengl.GL11.glNormal3fv(v);
    }

    @Override public void nglNormal3bv(long v) {
        org.lwjgl.opengl.GL11.nglNormal3bv(v);
    }

    @Override public void glNormal3bv(@NativeType("GLbyte const *") ByteBuffer v) {
        org.lwjgl.opengl.GL11.glNormal3bv(v);
    }

    @Override public void nglNormal3sv(long v) {
        org.lwjgl.opengl.GL11.nglNormal3sv(v);
    }

    @Override public void glNormal3sv(@NativeType("GLshort const *") ShortBuffer v) {
        org.lwjgl.opengl.GL11.glNormal3sv(v);
    }

    @Override public void glNormal3sv(@NativeType("GLshort const *") short[] v) {
        org.lwjgl.opengl.GL11.glNormal3sv(v);
    }

    @Override public void nglNormal3iv(long v) {
        org.lwjgl.opengl.GL11.nglNormal3iv(v);
    }

    @Override public void glNormal3iv(@NativeType("GLint const *") IntBuffer v) {
        org.lwjgl.opengl.GL11.glNormal3iv(v);
    }

    @Override public void glNormal3iv(@NativeType("GLint const *") int[] v) {
        org.lwjgl.opengl.GL11.glNormal3iv(v);
    }

    @Override public void nglNormal3dv(long v) {
        org.lwjgl.opengl.GL11.nglNormal3dv(v);
    }

    @Override public void glNormal3dv(@NativeType("GLdouble const *") DoubleBuffer v) {
        org.lwjgl.opengl.GL11.glNormal3dv(v);
    }

    @Override public void glNormal3dv(@NativeType("GLdouble const *") double[] v) {
        org.lwjgl.opengl.GL11.glNormal3dv(v);
    }

    @Override public void nglNormalPointer(int type, int stride, long pointer) {
        org.lwjgl.opengl.GL11.nglNormalPointer(type, stride, pointer);
    }

    @Override public void glNormalPointer(@NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        org.lwjgl.opengl.GL11.glNormalPointer(type, stride, pointer);
    }

    @Override public void glNormalPointer(@NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        org.lwjgl.opengl.GL11.glNormalPointer(type, stride, pointer);
    }

    @Override public void glNormalPointer(@NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer) {
        org.lwjgl.opengl.GL11.glNormalPointer(type, stride, pointer);
    }

    @Override public void glNormalPointer(@NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") IntBuffer pointer) {
        org.lwjgl.opengl.GL11.glNormalPointer(type, stride, pointer);
    }

    @Override public void glNormalPointer(@NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") FloatBuffer pointer) {
        org.lwjgl.opengl.GL11.glNormalPointer(type, stride, pointer);
    }

    @Override public void glOrtho(@NativeType("GLdouble") double l, @NativeType("GLdouble") double r, @NativeType("GLdouble") double b, @NativeType("GLdouble") double t, @NativeType("GLdouble") double n, @NativeType("GLdouble") double f) {
        org.lwjgl.opengl.GL11.glOrtho(l, r, b, t, n, f);
    }

    @Override public void glPassThrough(@NativeType("GLfloat") float token) {
        org.lwjgl.opengl.GL11.glPassThrough(token);
    }

    @Override public void nglPixelMapfv(int map, int size, long values) {
        org.lwjgl.opengl.GL11.nglPixelMapfv(map, size, values);
    }

    @Override public void glPixelMapfv(@NativeType("GLenum") int map, @NativeType("GLsizei") int size, @NativeType("GLfloat const *") long values) {
        org.lwjgl.opengl.GL11.glPixelMapfv(map, size, values);
    }

    @Override public void glPixelMapfv(@NativeType("GLenum") int map, @NativeType("GLfloat const *") FloatBuffer values) {
        org.lwjgl.opengl.GL11.glPixelMapfv(map, values);
    }

    @Override public void glPixelMapfv(@NativeType("GLenum") int map, @NativeType("GLfloat const *") float[] values) {
        org.lwjgl.opengl.GL11.glPixelMapfv(map, values);
    }

    @Override public void nglPixelMapusv(int map, int size, long values) {
        org.lwjgl.opengl.GL11.nglPixelMapusv(map, size, values);
    }

    @Override public void glPixelMapusv(@NativeType("GLenum") int map, @NativeType("GLsizei") int size, @NativeType("GLushort const *") long values) {
        org.lwjgl.opengl.GL11.glPixelMapusv(map, size, values);
    }

    @Override public void glPixelMapusv(@NativeType("GLenum") int map, @NativeType("GLushort const *") ShortBuffer values) {
        org.lwjgl.opengl.GL11.glPixelMapusv(map, values);
    }

    @Override public void glPixelMapusv(@NativeType("GLenum") int map, @NativeType("GLushort const *") short[] values) {
        org.lwjgl.opengl.GL11.glPixelMapusv(map, values);
    }

    @Override public void nglPixelMapuiv(int map, int size, long values) {
        org.lwjgl.opengl.GL11.nglPixelMapuiv(map, size, values);
    }

    @Override public void glPixelMapuiv(@NativeType("GLenum") int map, @NativeType("GLsizei") int size, @NativeType("GLuint const *") long values) {
        org.lwjgl.opengl.GL11.glPixelMapuiv(map, size, values);
    }

    @Override public void glPixelMapuiv(@NativeType("GLenum") int map, @NativeType("GLuint const *") IntBuffer values) {
        org.lwjgl.opengl.GL11.glPixelMapuiv(map, values);
    }

    @Override public void glPixelMapuiv(@NativeType("GLenum") int map, @NativeType("GLuint const *") int[] values) {
        org.lwjgl.opengl.GL11.glPixelMapuiv(map, values);
    }

    @Override public void glPixelStorei(@NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        org.lwjgl.opengl.GL11.glPixelStorei(pname, param);
    }

    @Override public void glPixelStoref(@NativeType("GLenum") int pname, @NativeType("GLfloat") float param) {
        org.lwjgl.opengl.GL11.glPixelStoref(pname, param);
    }

    @Override public void glPixelTransferi(@NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        org.lwjgl.opengl.GL11.glPixelTransferi(pname, param);
    }

    @Override public void glPixelTransferf(@NativeType("GLenum") int pname, @NativeType("GLfloat") float param) {
        org.lwjgl.opengl.GL11.glPixelTransferf(pname, param);
    }

    @Override public void glPixelZoom(@NativeType("GLfloat") float xfactor, @NativeType("GLfloat") float yfactor) {
        org.lwjgl.opengl.GL11.glPixelZoom(xfactor, yfactor);
    }

    @Override public void glPointSize(@NativeType("GLfloat") float size) {
        org.lwjgl.opengl.GL11.glPointSize(size);
    }

    @Override public void glPolygonMode(@NativeType("GLenum") int face, @NativeType("GLenum") int mode) {
        org.lwjgl.opengl.GL11.glPolygonMode(face, mode);
    }

    @Override public void glPolygonOffset(@NativeType("GLfloat") float factor, @NativeType("GLfloat") float units) {
        org.lwjgl.opengl.GL11.glPolygonOffset(factor, units);
    }

    @Override public void nglPolygonStipple(long pattern) {
        org.lwjgl.opengl.GL11.nglPolygonStipple(pattern);
    }

    @Override public void glPolygonStipple(@NativeType("GLubyte const *") ByteBuffer pattern) {
        org.lwjgl.opengl.GL11.glPolygonStipple(pattern);
    }

    @Override public void glPolygonStipple(@NativeType("GLubyte const *") long pattern) {
        org.lwjgl.opengl.GL11.glPolygonStipple(pattern);
    }

    @Override public void glPushAttrib(@NativeType("GLbitfield") int mask) {
        org.lwjgl.opengl.GL11.glPushAttrib(mask);
    }

    @Override public void glPushClientAttrib(@NativeType("GLbitfield") int mask) {
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

    @Override public void glPrioritizeTextures(@NativeType("GLuint const *") IntBuffer textures, @NativeType("GLfloat const *") FloatBuffer priorities) {
        org.lwjgl.opengl.GL11.glPrioritizeTextures(textures, priorities);
    }

    @Override public void glPrioritizeTextures(@NativeType("GLuint const *") int[] textures, @NativeType("GLfloat const *") float[] priorities) {
        org.lwjgl.opengl.GL11.glPrioritizeTextures(textures, priorities);
    }

    @Override public void glPushMatrix() {
        org.lwjgl.opengl.GL11.glPushMatrix();
    }

    @Override public void glPushName(@NativeType("GLuint") int name) {
        org.lwjgl.opengl.GL11.glPushName(name);
    }

    @Override public void glRasterPos2i(@NativeType("GLint") int x, @NativeType("GLint") int y) {
        org.lwjgl.opengl.GL11.glRasterPos2i(x, y);
    }

    @Override public void glRasterPos2s(@NativeType("GLshort") short x, @NativeType("GLshort") short y) {
        org.lwjgl.opengl.GL11.glRasterPos2s(x, y);
    }

    @Override public void glRasterPos2f(@NativeType("GLfloat") float x, @NativeType("GLfloat") float y) {
        org.lwjgl.opengl.GL11.glRasterPos2f(x, y);
    }

    @Override public void glRasterPos2d(@NativeType("GLdouble") double x, @NativeType("GLdouble") double y) {
        org.lwjgl.opengl.GL11.glRasterPos2d(x, y);
    }

    @Override public void nglRasterPos2iv(long coords) {
        org.lwjgl.opengl.GL11.nglRasterPos2iv(coords);
    }

    @Override public void glRasterPos2iv(@NativeType("GLint const *") IntBuffer coords) {
        org.lwjgl.opengl.GL11.glRasterPos2iv(coords);
    }

    @Override public void glRasterPos2iv(@NativeType("GLint const *") int[] coords) {
        org.lwjgl.opengl.GL11.glRasterPos2iv(coords);
    }

    @Override public void nglRasterPos2sv(long coords) {
        org.lwjgl.opengl.GL11.nglRasterPos2sv(coords);
    }

    @Override public void glRasterPos2sv(@NativeType("GLshort const *") ShortBuffer coords) {
        org.lwjgl.opengl.GL11.glRasterPos2sv(coords);
    }

    @Override public void glRasterPos2sv(@NativeType("GLshort const *") short[] coords) {
        org.lwjgl.opengl.GL11.glRasterPos2sv(coords);
    }

    @Override public void nglRasterPos2fv(long coords) {
        org.lwjgl.opengl.GL11.nglRasterPos2fv(coords);
    }

    @Override public void glRasterPos2fv(@NativeType("GLfloat const *") FloatBuffer coords) {
        org.lwjgl.opengl.GL11.glRasterPos2fv(coords);
    }

    @Override public void glRasterPos2fv(@NativeType("GLfloat const *") float[] coords) {
        org.lwjgl.opengl.GL11.glRasterPos2fv(coords);
    }

    @Override public void nglRasterPos2dv(long coords) {
        org.lwjgl.opengl.GL11.nglRasterPos2dv(coords);
    }

    @Override public void glRasterPos2dv(@NativeType("GLdouble const *") DoubleBuffer coords) {
        org.lwjgl.opengl.GL11.glRasterPos2dv(coords);
    }

    @Override public void glRasterPos2dv(@NativeType("GLdouble const *") double[] coords) {
        org.lwjgl.opengl.GL11.glRasterPos2dv(coords);
    }

    @Override public void glRasterPos3i(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z) {
        org.lwjgl.opengl.GL11.glRasterPos3i(x, y, z);
    }

    @Override public void glRasterPos3s(@NativeType("GLshort") short x, @NativeType("GLshort") short y, @NativeType("GLshort") short z) {
        org.lwjgl.opengl.GL11.glRasterPos3s(x, y, z);
    }

    @Override public void glRasterPos3f(@NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z) {
        org.lwjgl.opengl.GL11.glRasterPos3f(x, y, z);
    }

    @Override public void glRasterPos3d(@NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z) {
        org.lwjgl.opengl.GL11.glRasterPos3d(x, y, z);
    }

    @Override public void nglRasterPos3iv(long coords) {
        org.lwjgl.opengl.GL11.nglRasterPos3iv(coords);
    }

    @Override public void glRasterPos3iv(@NativeType("GLint const *") IntBuffer coords) {
        org.lwjgl.opengl.GL11.glRasterPos3iv(coords);
    }

    @Override public void glRasterPos3iv(@NativeType("GLint const *") int[] coords) {
        org.lwjgl.opengl.GL11.glRasterPos3iv(coords);
    }

    @Override public void nglRasterPos3sv(long coords) {
        org.lwjgl.opengl.GL11.nglRasterPos3sv(coords);
    }

    @Override public void glRasterPos3sv(@NativeType("GLshort const *") ShortBuffer coords) {
        org.lwjgl.opengl.GL11.glRasterPos3sv(coords);
    }

    @Override public void glRasterPos3sv(@NativeType("GLshort const *") short[] coords) {
        org.lwjgl.opengl.GL11.glRasterPos3sv(coords);
    }

    @Override public void nglRasterPos3fv(long coords) {
        org.lwjgl.opengl.GL11.nglRasterPos3fv(coords);
    }

    @Override public void glRasterPos3fv(@NativeType("GLfloat const *") FloatBuffer coords) {
        org.lwjgl.opengl.GL11.glRasterPos3fv(coords);
    }

    @Override public void glRasterPos3fv(@NativeType("GLfloat const *") float[] coords) {
        org.lwjgl.opengl.GL11.glRasterPos3fv(coords);
    }

    @Override public void nglRasterPos3dv(long coords) {
        org.lwjgl.opengl.GL11.nglRasterPos3dv(coords);
    }

    @Override public void glRasterPos3dv(@NativeType("GLdouble const *") DoubleBuffer coords) {
        org.lwjgl.opengl.GL11.glRasterPos3dv(coords);
    }

    @Override public void glRasterPos3dv(@NativeType("GLdouble const *") double[] coords) {
        org.lwjgl.opengl.GL11.glRasterPos3dv(coords);
    }

    @Override public void glRasterPos4i(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z, @NativeType("GLint") int w) {
        org.lwjgl.opengl.GL11.glRasterPos4i(x, y, z, w);
    }

    @Override public void glRasterPos4s(@NativeType("GLshort") short x, @NativeType("GLshort") short y, @NativeType("GLshort") short z, @NativeType("GLshort") short w) {
        org.lwjgl.opengl.GL11.glRasterPos4s(x, y, z, w);
    }

    @Override public void glRasterPos4f(@NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z, @NativeType("GLfloat") float w) {
        org.lwjgl.opengl.GL11.glRasterPos4f(x, y, z, w);
    }

    @Override public void glRasterPos4d(@NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z, @NativeType("GLdouble") double w) {
        org.lwjgl.opengl.GL11.glRasterPos4d(x, y, z, w);
    }

    @Override public void nglRasterPos4iv(long coords) {
        org.lwjgl.opengl.GL11.nglRasterPos4iv(coords);
    }

    @Override public void glRasterPos4iv(@NativeType("GLint const *") IntBuffer coords) {
        org.lwjgl.opengl.GL11.glRasterPos4iv(coords);
    }

    @Override public void glRasterPos4iv(@NativeType("GLint const *") int[] coords) {
        org.lwjgl.opengl.GL11.glRasterPos4iv(coords);
    }

    @Override public void nglRasterPos4sv(long coords) {
        org.lwjgl.opengl.GL11.nglRasterPos4sv(coords);
    }

    @Override public void glRasterPos4sv(@NativeType("GLshort const *") ShortBuffer coords) {
        org.lwjgl.opengl.GL11.glRasterPos4sv(coords);
    }

    @Override public void glRasterPos4sv(@NativeType("GLshort const *") short[] coords) {
        org.lwjgl.opengl.GL11.glRasterPos4sv(coords);
    }

    @Override public void nglRasterPos4fv(long coords) {
        org.lwjgl.opengl.GL11.nglRasterPos4fv(coords);
    }

    @Override public void glRasterPos4fv(@NativeType("GLfloat const *") FloatBuffer coords) {
        org.lwjgl.opengl.GL11.glRasterPos4fv(coords);
    }

    @Override public void glRasterPos4fv(@NativeType("GLfloat const *") float[] coords) {
        org.lwjgl.opengl.GL11.glRasterPos4fv(coords);
    }

    @Override public void nglRasterPos4dv(long coords) {
        org.lwjgl.opengl.GL11.nglRasterPos4dv(coords);
    }

    @Override public void glRasterPos4dv(@NativeType("GLdouble const *") DoubleBuffer coords) {
        org.lwjgl.opengl.GL11.glRasterPos4dv(coords);
    }

    @Override public void glRasterPos4dv(@NativeType("GLdouble const *") double[] coords) {
        org.lwjgl.opengl.GL11.glRasterPos4dv(coords);
    }

    @Override public void glReadBuffer(@NativeType("GLenum") int src) {
        org.lwjgl.opengl.GL11.glReadBuffer(src);
    }

    @Override public void nglReadPixels(int x, int y, int width, int height, int format, int type, long pixels) {
        org.lwjgl.opengl.GL11.nglReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer pixels) {
        org.lwjgl.opengl.GL11.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") long pixels) {
        org.lwjgl.opengl.GL11.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ShortBuffer pixels) {
        org.lwjgl.opengl.GL11.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") IntBuffer pixels) {
        org.lwjgl.opengl.GL11.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") FloatBuffer pixels) {
        org.lwjgl.opengl.GL11.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") short[] pixels) {
        org.lwjgl.opengl.GL11.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") int[] pixels) {
        org.lwjgl.opengl.GL11.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") float[] pixels) {
        org.lwjgl.opengl.GL11.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glRecti(@NativeType("GLint") int x1, @NativeType("GLint") int y1, @NativeType("GLint") int x2, @NativeType("GLint") int y2) {
        org.lwjgl.opengl.GL11.glRecti(x1, y1, x2, y2);
    }

    @Override public void glRects(@NativeType("GLshort") short x1, @NativeType("GLshort") short y1, @NativeType("GLshort") short x2, @NativeType("GLshort") short y2) {
        org.lwjgl.opengl.GL11.glRects(x1, y1, x2, y2);
    }

    @Override public void glRectf(@NativeType("GLfloat") float x1, @NativeType("GLfloat") float y1, @NativeType("GLfloat") float x2, @NativeType("GLfloat") float y2) {
        org.lwjgl.opengl.GL11.glRectf(x1, y1, x2, y2);
    }

    @Override public void glRectd(@NativeType("GLdouble") double x1, @NativeType("GLdouble") double y1, @NativeType("GLdouble") double x2, @NativeType("GLdouble") double y2) {
        org.lwjgl.opengl.GL11.glRectd(x1, y1, x2, y2);
    }

    @Override public void nglRectiv(long v1, long v2) {
        org.lwjgl.opengl.GL11.nglRectiv(v1, v2);
    }

    @Override public void glRectiv(@NativeType("GLint const *") IntBuffer v1, @NativeType("GLint const *") IntBuffer v2) {
        org.lwjgl.opengl.GL11.glRectiv(v1, v2);
    }

    @Override public void glRectiv(@NativeType("GLint const *") int[] v1, @NativeType("GLint const *") int[] v2) {
        org.lwjgl.opengl.GL11.glRectiv(v1, v2);
    }

    @Override public void nglRectsv(long v1, long v2) {
        org.lwjgl.opengl.GL11.nglRectsv(v1, v2);
    }

    @Override public void glRectsv(@NativeType("GLshort const *") ShortBuffer v1, @NativeType("GLshort const *") ShortBuffer v2) {
        org.lwjgl.opengl.GL11.glRectsv(v1, v2);
    }

    @Override public void glRectsv(@NativeType("GLshort const *") short[] v1, @NativeType("GLshort const *") short[] v2) {
        org.lwjgl.opengl.GL11.glRectsv(v1, v2);
    }

    @Override public void nglRectfv(long v1, long v2) {
        org.lwjgl.opengl.GL11.nglRectfv(v1, v2);
    }

    @Override public void glRectfv(@NativeType("GLfloat const *") FloatBuffer v1, @NativeType("GLfloat const *") FloatBuffer v2) {
        org.lwjgl.opengl.GL11.glRectfv(v1, v2);
    }

    @Override public void glRectfv(@NativeType("GLfloat const *") float[] v1, @NativeType("GLfloat const *") float[] v2) {
        org.lwjgl.opengl.GL11.glRectfv(v1, v2);
    }

    @Override public void nglRectdv(long v1, long v2) {
        org.lwjgl.opengl.GL11.nglRectdv(v1, v2);
    }

    @Override public void glRectdv(@NativeType("GLdouble const *") DoubleBuffer v1, @NativeType("GLdouble const *") DoubleBuffer v2) {
        org.lwjgl.opengl.GL11.glRectdv(v1, v2);
    }

    @Override public void glRectdv(@NativeType("GLdouble const *") double[] v1, @NativeType("GLdouble const *") double[] v2) {
        org.lwjgl.opengl.GL11.glRectdv(v1, v2);
    }

@NativeType("GLint")
    @Override public int glRenderMode(@NativeType("GLenum") int mode) {
        return org.lwjgl.opengl.GL11.glRenderMode(mode);
    }

    @Override public void glRotatef(@NativeType("GLfloat") float angle, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z) {
        org.lwjgl.opengl.GL11.glRotatef(angle, x, y, z);
    }

    @Override public void glRotated(@NativeType("GLdouble") double angle, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z) {
        org.lwjgl.opengl.GL11.glRotated(angle, x, y, z);
    }

    @Override public void glScalef(@NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z) {
        org.lwjgl.opengl.GL11.glScalef(x, y, z);
    }

    @Override public void glScaled(@NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z) {
        org.lwjgl.opengl.GL11.glScaled(x, y, z);
    }

    @Override public void glScissor(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        org.lwjgl.opengl.GL11.glScissor(x, y, width, height);
    }

    @Override public void nglSelectBuffer(int size, long buffer) {
        org.lwjgl.opengl.GL11.nglSelectBuffer(size, buffer);
    }

    @Override public void glSelectBuffer(@NativeType("GLuint *") IntBuffer buffer) {
        org.lwjgl.opengl.GL11.glSelectBuffer(buffer);
    }

    @Override public void glSelectBuffer(@NativeType("GLuint *") int[] buffer) {
        org.lwjgl.opengl.GL11.glSelectBuffer(buffer);
    }

    @Override public void glShadeModel(@NativeType("GLenum") int mode) {
        org.lwjgl.opengl.GL11.glShadeModel(mode);
    }

    @Override public void glStencilFunc(@NativeType("GLenum") int func, @NativeType("GLint") int ref, @NativeType("GLuint") int mask) {
        org.lwjgl.opengl.GL11.glStencilFunc(func, ref, mask);
    }

    @Override public void glStencilMask(@NativeType("GLuint") int mask) {
        org.lwjgl.opengl.GL11.glStencilMask(mask);
    }

    @Override public void glStencilOp(@NativeType("GLenum") int sfail, @NativeType("GLenum") int dpfail, @NativeType("GLenum") int dppass) {
        org.lwjgl.opengl.GL11.glStencilOp(sfail, dpfail, dppass);
    }

    @Override public void glTexCoord1f(@NativeType("GLfloat") float s) {
        org.lwjgl.opengl.GL11.glTexCoord1f(s);
    }

    @Override public void glTexCoord1s(@NativeType("GLshort") short s) {
        org.lwjgl.opengl.GL11.glTexCoord1s(s);
    }

    @Override public void glTexCoord1i(@NativeType("GLint") int s) {
        org.lwjgl.opengl.GL11.glTexCoord1i(s);
    }

    @Override public void glTexCoord1d(@NativeType("GLdouble") double s) {
        org.lwjgl.opengl.GL11.glTexCoord1d(s);
    }

    @Override public void nglTexCoord1fv(long v) {
        org.lwjgl.opengl.GL11.nglTexCoord1fv(v);
    }

    @Override public void glTexCoord1fv(@NativeType("GLfloat const *") FloatBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord1fv(v);
    }

    @Override public void glTexCoord1fv(@NativeType("GLfloat const *") float[] v) {
        org.lwjgl.opengl.GL11.glTexCoord1fv(v);
    }

    @Override public void nglTexCoord1sv(long v) {
        org.lwjgl.opengl.GL11.nglTexCoord1sv(v);
    }

    @Override public void glTexCoord1sv(@NativeType("GLshort const *") ShortBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord1sv(v);
    }

    @Override public void glTexCoord1sv(@NativeType("GLshort const *") short[] v) {
        org.lwjgl.opengl.GL11.glTexCoord1sv(v);
    }

    @Override public void nglTexCoord1iv(long v) {
        org.lwjgl.opengl.GL11.nglTexCoord1iv(v);
    }

    @Override public void glTexCoord1iv(@NativeType("GLint const *") IntBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord1iv(v);
    }

    @Override public void glTexCoord1iv(@NativeType("GLint const *") int[] v) {
        org.lwjgl.opengl.GL11.glTexCoord1iv(v);
    }

    @Override public void nglTexCoord1dv(long v) {
        org.lwjgl.opengl.GL11.nglTexCoord1dv(v);
    }

    @Override public void glTexCoord1dv(@NativeType("GLdouble const *") DoubleBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord1dv(v);
    }

    @Override public void glTexCoord1dv(@NativeType("GLdouble const *") double[] v) {
        org.lwjgl.opengl.GL11.glTexCoord1dv(v);
    }

    @Override public void glTexCoord2f(@NativeType("GLfloat") float s, @NativeType("GLfloat") float t) {
        org.lwjgl.opengl.GL11.glTexCoord2f(s, t);
    }

    @Override public void glTexCoord2s(@NativeType("GLshort") short s, @NativeType("GLshort") short t) {
        org.lwjgl.opengl.GL11.glTexCoord2s(s, t);
    }

    @Override public void glTexCoord2i(@NativeType("GLint") int s, @NativeType("GLint") int t) {
        org.lwjgl.opengl.GL11.glTexCoord2i(s, t);
    }

    @Override public void glTexCoord2d(@NativeType("GLdouble") double s, @NativeType("GLdouble") double t) {
        org.lwjgl.opengl.GL11.glTexCoord2d(s, t);
    }

    @Override public void nglTexCoord2fv(long v) {
        org.lwjgl.opengl.GL11.nglTexCoord2fv(v);
    }

    @Override public void glTexCoord2fv(@NativeType("GLfloat const *") FloatBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord2fv(v);
    }

    @Override public void glTexCoord2fv(@NativeType("GLfloat const *") float[] v) {
        org.lwjgl.opengl.GL11.glTexCoord2fv(v);
    }

    @Override public void nglTexCoord2sv(long v) {
        org.lwjgl.opengl.GL11.nglTexCoord2sv(v);
    }

    @Override public void glTexCoord2sv(@NativeType("GLshort const *") ShortBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord2sv(v);
    }

    @Override public void glTexCoord2sv(@NativeType("GLshort const *") short[] v) {
        org.lwjgl.opengl.GL11.glTexCoord2sv(v);
    }

    @Override public void nglTexCoord2iv(long v) {
        org.lwjgl.opengl.GL11.nglTexCoord2iv(v);
    }

    @Override public void glTexCoord2iv(@NativeType("GLint const *") IntBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord2iv(v);
    }

    @Override public void glTexCoord2iv(@NativeType("GLint const *") int[] v) {
        org.lwjgl.opengl.GL11.glTexCoord2iv(v);
    }

    @Override public void nglTexCoord2dv(long v) {
        org.lwjgl.opengl.GL11.nglTexCoord2dv(v);
    }

    @Override public void glTexCoord2dv(@NativeType("GLdouble const *") DoubleBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord2dv(v);
    }

    @Override public void glTexCoord2dv(@NativeType("GLdouble const *") double[] v) {
        org.lwjgl.opengl.GL11.glTexCoord2dv(v);
    }

    @Override public void glTexCoord3f(@NativeType("GLfloat") float s, @NativeType("GLfloat") float t, @NativeType("GLfloat") float r) {
        org.lwjgl.opengl.GL11.glTexCoord3f(s, t, r);
    }

    @Override public void glTexCoord3s(@NativeType("GLshort") short s, @NativeType("GLshort") short t, @NativeType("GLshort") short r) {
        org.lwjgl.opengl.GL11.glTexCoord3s(s, t, r);
    }

    @Override public void glTexCoord3i(@NativeType("GLint") int s, @NativeType("GLint") int t, @NativeType("GLint") int r) {
        org.lwjgl.opengl.GL11.glTexCoord3i(s, t, r);
    }

    @Override public void glTexCoord3d(@NativeType("GLdouble") double s, @NativeType("GLdouble") double t, @NativeType("GLdouble") double r) {
        org.lwjgl.opengl.GL11.glTexCoord3d(s, t, r);
    }

    @Override public void nglTexCoord3fv(long v) {
        org.lwjgl.opengl.GL11.nglTexCoord3fv(v);
    }

    @Override public void glTexCoord3fv(@NativeType("GLfloat const *") FloatBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord3fv(v);
    }

    @Override public void glTexCoord3fv(@NativeType("GLfloat const *") float[] v) {
        org.lwjgl.opengl.GL11.glTexCoord3fv(v);
    }

    @Override public void nglTexCoord3sv(long v) {
        org.lwjgl.opengl.GL11.nglTexCoord3sv(v);
    }

    @Override public void glTexCoord3sv(@NativeType("GLshort const *") ShortBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord3sv(v);
    }

    @Override public void glTexCoord3sv(@NativeType("GLshort const *") short[] v) {
        org.lwjgl.opengl.GL11.glTexCoord3sv(v);
    }

    @Override public void nglTexCoord3iv(long v) {
        org.lwjgl.opengl.GL11.nglTexCoord3iv(v);
    }

    @Override public void glTexCoord3iv(@NativeType("GLint const *") IntBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord3iv(v);
    }

    @Override public void glTexCoord3iv(@NativeType("GLint const *") int[] v) {
        org.lwjgl.opengl.GL11.glTexCoord3iv(v);
    }

    @Override public void nglTexCoord3dv(long v) {
        org.lwjgl.opengl.GL11.nglTexCoord3dv(v);
    }

    @Override public void glTexCoord3dv(@NativeType("GLdouble const *") DoubleBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord3dv(v);
    }

    @Override public void glTexCoord3dv(@NativeType("GLdouble const *") double[] v) {
        org.lwjgl.opengl.GL11.glTexCoord3dv(v);
    }

    @Override public void glTexCoord4f(@NativeType("GLfloat") float s, @NativeType("GLfloat") float t, @NativeType("GLfloat") float r, @NativeType("GLfloat") float q) {
        org.lwjgl.opengl.GL11.glTexCoord4f(s, t, r, q);
    }

    @Override public void glTexCoord4s(@NativeType("GLshort") short s, @NativeType("GLshort") short t, @NativeType("GLshort") short r, @NativeType("GLshort") short q) {
        org.lwjgl.opengl.GL11.glTexCoord4s(s, t, r, q);
    }

    @Override public void glTexCoord4i(@NativeType("GLint") int s, @NativeType("GLint") int t, @NativeType("GLint") int r, @NativeType("GLint") int q) {
        org.lwjgl.opengl.GL11.glTexCoord4i(s, t, r, q);
    }

    @Override public void glTexCoord4d(@NativeType("GLdouble") double s, @NativeType("GLdouble") double t, @NativeType("GLdouble") double r, @NativeType("GLdouble") double q) {
        org.lwjgl.opengl.GL11.glTexCoord4d(s, t, r, q);
    }

    @Override public void nglTexCoord4fv(long v) {
        org.lwjgl.opengl.GL11.nglTexCoord4fv(v);
    }

    @Override public void glTexCoord4fv(@NativeType("GLfloat const *") FloatBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord4fv(v);
    }

    @Override public void glTexCoord4fv(@NativeType("GLfloat const *") float[] v) {
        org.lwjgl.opengl.GL11.glTexCoord4fv(v);
    }

    @Override public void nglTexCoord4sv(long v) {
        org.lwjgl.opengl.GL11.nglTexCoord4sv(v);
    }

    @Override public void glTexCoord4sv(@NativeType("GLshort const *") ShortBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord4sv(v);
    }

    @Override public void glTexCoord4sv(@NativeType("GLshort const *") short[] v) {
        org.lwjgl.opengl.GL11.glTexCoord4sv(v);
    }

    @Override public void nglTexCoord4iv(long v) {
        org.lwjgl.opengl.GL11.nglTexCoord4iv(v);
    }

    @Override public void glTexCoord4iv(@NativeType("GLint const *") IntBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord4iv(v);
    }

    @Override public void glTexCoord4iv(@NativeType("GLint const *") int[] v) {
        org.lwjgl.opengl.GL11.glTexCoord4iv(v);
    }

    @Override public void nglTexCoord4dv(long v) {
        org.lwjgl.opengl.GL11.nglTexCoord4dv(v);
    }

    @Override public void glTexCoord4dv(@NativeType("GLdouble const *") DoubleBuffer v) {
        org.lwjgl.opengl.GL11.glTexCoord4dv(v);
    }

    @Override public void glTexCoord4dv(@NativeType("GLdouble const *") double[] v) {
        org.lwjgl.opengl.GL11.glTexCoord4dv(v);
    }

    @Override public void nglTexCoordPointer(int size, int type, int stride, long pointer) {
        org.lwjgl.opengl.GL11.nglTexCoordPointer(size, type, stride, pointer);
    }

    @Override public void glTexCoordPointer(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        org.lwjgl.opengl.GL11.glTexCoordPointer(size, type, stride, pointer);
    }

    @Override public void glTexCoordPointer(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        org.lwjgl.opengl.GL11.glTexCoordPointer(size, type, stride, pointer);
    }

    @Override public void glTexCoordPointer(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer) {
        org.lwjgl.opengl.GL11.glTexCoordPointer(size, type, stride, pointer);
    }

    @Override public void glTexCoordPointer(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") IntBuffer pointer) {
        org.lwjgl.opengl.GL11.glTexCoordPointer(size, type, stride, pointer);
    }

    @Override public void glTexCoordPointer(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") FloatBuffer pointer) {
        org.lwjgl.opengl.GL11.glTexCoordPointer(size, type, stride, pointer);
    }

    @Override public void glTexEnvi(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        org.lwjgl.opengl.GL11.glTexEnvi(target, pname, param);
    }

    @Override public void nglTexEnviv(int target, int pname, long params) {
        org.lwjgl.opengl.GL11.nglTexEnviv(target, pname, params);
    }

    @Override public void glTexEnviv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        org.lwjgl.opengl.GL11.glTexEnviv(target, pname, params);
    }

    @Override public void glTexEnviv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        org.lwjgl.opengl.GL11.glTexEnviv(target, pname, params);
    }

    @Override public void glTexEnvf(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param) {
        org.lwjgl.opengl.GL11.glTexEnvf(target, pname, param);
    }

    @Override public void nglTexEnvfv(int target, int pname, long params) {
        org.lwjgl.opengl.GL11.nglTexEnvfv(target, pname, params);
    }

    @Override public void glTexEnvfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params) {
        org.lwjgl.opengl.GL11.glTexEnvfv(target, pname, params);
    }

    @Override public void glTexEnvfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] params) {
        org.lwjgl.opengl.GL11.glTexEnvfv(target, pname, params);
    }

    @Override public void glTexGeni(@NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        org.lwjgl.opengl.GL11.glTexGeni(coord, pname, param);
    }

    @Override public void nglTexGeniv(int coord, int pname, long params) {
        org.lwjgl.opengl.GL11.nglTexGeniv(coord, pname, params);
    }

    @Override public void glTexGeniv(@NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        org.lwjgl.opengl.GL11.glTexGeniv(coord, pname, params);
    }

    @Override public void glTexGeniv(@NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        org.lwjgl.opengl.GL11.glTexGeniv(coord, pname, params);
    }

    @Override public void glTexGenf(@NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param) {
        org.lwjgl.opengl.GL11.glTexGenf(coord, pname, param);
    }

    @Override public void nglTexGenfv(int coord, int pname, long params) {
        org.lwjgl.opengl.GL11.nglTexGenfv(coord, pname, params);
    }

    @Override public void glTexGenfv(@NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params) {
        org.lwjgl.opengl.GL11.glTexGenfv(coord, pname, params);
    }

    @Override public void glTexGenfv(@NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] params) {
        org.lwjgl.opengl.GL11.glTexGenfv(coord, pname, params);
    }

    @Override public void glTexGend(@NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLdouble") double param) {
        org.lwjgl.opengl.GL11.glTexGend(coord, pname, param);
    }

    @Override public void nglTexGendv(int coord, int pname, long params) {
        org.lwjgl.opengl.GL11.nglTexGendv(coord, pname, params);
    }

    @Override public void glTexGendv(@NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLdouble const *") DoubleBuffer params) {
        org.lwjgl.opengl.GL11.glTexGendv(coord, pname, params);
    }

    @Override public void glTexGendv(@NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLdouble const *") double[] params) {
        org.lwjgl.opengl.GL11.glTexGendv(coord, pname, params);
    }

    @Override public void nglTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, long pixels) {
        org.lwjgl.opengl.GL11.nglTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    @Override public void glTexImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ByteBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    @Override public void glTexImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        org.lwjgl.opengl.GL11.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    @Override public void glTexImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ShortBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    @Override public void glTexImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") IntBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    @Override public void glTexImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") FloatBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    @Override public void glTexImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") DoubleBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    @Override public void glTexImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") short[] pixels) {
        org.lwjgl.opengl.GL11.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    @Override public void glTexImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") int[] pixels) {
        org.lwjgl.opengl.GL11.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    @Override public void glTexImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") float[] pixels) {
        org.lwjgl.opengl.GL11.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    @Override public void glTexImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") double[] pixels) {
        org.lwjgl.opengl.GL11.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    @Override public void nglTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels) {
        org.lwjgl.opengl.GL11.nglTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override public void glTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ByteBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override public void glTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        org.lwjgl.opengl.GL11.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override public void glTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ShortBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override public void glTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") IntBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override public void glTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") FloatBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override public void glTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") DoubleBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override public void glTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") short[] pixels) {
        org.lwjgl.opengl.GL11.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override public void glTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") int[] pixels) {
        org.lwjgl.opengl.GL11.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override public void glTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") float[] pixels) {
        org.lwjgl.opengl.GL11.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override public void glTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") double[] pixels) {
        org.lwjgl.opengl.GL11.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override public void glCopyTexImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalFormat, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLint") int border) {
        org.lwjgl.opengl.GL11.glCopyTexImage1D(target, level, internalFormat, x, y, width, border);
    }

    @Override public void glCopyTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalFormat, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border) {
        org.lwjgl.opengl.GL11.glCopyTexImage2D(target, level, internalFormat, x, y, width, height, border);
    }

    @Override public void glCopyTexSubImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width) {
        org.lwjgl.opengl.GL11.glCopyTexSubImage1D(target, level, xoffset, x, y, width);
    }

    @Override public void glCopyTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        org.lwjgl.opengl.GL11.glCopyTexSubImage2D(target, level, xoffset, yoffset, x, y, width, height);
    }

    @Override public void glTexParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        org.lwjgl.opengl.GL11.glTexParameteri(target, pname, param);
    }

    @Override public void nglTexParameteriv(int target, int pname, long params) {
        org.lwjgl.opengl.GL11.nglTexParameteriv(target, pname, params);
    }

    @Override public void glTexParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        org.lwjgl.opengl.GL11.glTexParameteriv(target, pname, params);
    }

    @Override public void glTexParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        org.lwjgl.opengl.GL11.glTexParameteriv(target, pname, params);
    }

    @Override public void glTexParameterf(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param) {
        org.lwjgl.opengl.GL11.glTexParameterf(target, pname, param);
    }

    @Override public void nglTexParameterfv(int target, int pname, long params) {
        org.lwjgl.opengl.GL11.nglTexParameterfv(target, pname, params);
    }

    @Override public void glTexParameterfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params) {
        org.lwjgl.opengl.GL11.glTexParameterfv(target, pname, params);
    }

    @Override public void glTexParameterfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] params) {
        org.lwjgl.opengl.GL11.glTexParameterfv(target, pname, params);
    }

    @Override public void nglTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, long pixels) {
        org.lwjgl.opengl.GL11.nglTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    @Override public void glTexSubImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    @Override public void glTexSubImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    @Override public void glTexSubImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    @Override public void glTexSubImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    @Override public void glTexSubImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    @Override public void glTexSubImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") DoubleBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    @Override public void glTexSubImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    @Override public void glTexSubImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    @Override public void glTexSubImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    @Override public void glTexSubImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") double[] pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    @Override public void nglTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels) {
        org.lwjgl.opengl.GL11.nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") DoubleBuffer pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") double[] pixels) {
        org.lwjgl.opengl.GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override public void glTranslatef(@NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z) {
        org.lwjgl.opengl.GL11.glTranslatef(x, y, z);
    }

    @Override public void glTranslated(@NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z) {
        org.lwjgl.opengl.GL11.glTranslated(x, y, z);
    }

    @Override public void glVertex2f(@NativeType("GLfloat") float x, @NativeType("GLfloat") float y) {
        org.lwjgl.opengl.GL11.glVertex2f(x, y);
    }

    @Override public void glVertex2s(@NativeType("GLshort") short x, @NativeType("GLshort") short y) {
        org.lwjgl.opengl.GL11.glVertex2s(x, y);
    }

    @Override public void glVertex2i(@NativeType("GLint") int x, @NativeType("GLint") int y) {
        org.lwjgl.opengl.GL11.glVertex2i(x, y);
    }

    @Override public void glVertex2d(@NativeType("GLdouble") double x, @NativeType("GLdouble") double y) {
        org.lwjgl.opengl.GL11.glVertex2d(x, y);
    }

    @Override public void nglVertex2fv(long coords) {
        org.lwjgl.opengl.GL11.nglVertex2fv(coords);
    }

    @Override public void glVertex2fv(@NativeType("GLfloat const *") FloatBuffer coords) {
        org.lwjgl.opengl.GL11.glVertex2fv(coords);
    }

    @Override public void glVertex2fv(@NativeType("GLfloat const *") float[] coords) {
        org.lwjgl.opengl.GL11.glVertex2fv(coords);
    }

    @Override public void nglVertex2sv(long coords) {
        org.lwjgl.opengl.GL11.nglVertex2sv(coords);
    }

    @Override public void glVertex2sv(@NativeType("GLshort const *") ShortBuffer coords) {
        org.lwjgl.opengl.GL11.glVertex2sv(coords);
    }

    @Override public void glVertex2sv(@NativeType("GLshort const *") short[] coords) {
        org.lwjgl.opengl.GL11.glVertex2sv(coords);
    }

    @Override public void nglVertex2iv(long coords) {
        org.lwjgl.opengl.GL11.nglVertex2iv(coords);
    }

    @Override public void glVertex2iv(@NativeType("GLint const *") IntBuffer coords) {
        org.lwjgl.opengl.GL11.glVertex2iv(coords);
    }

    @Override public void glVertex2iv(@NativeType("GLint const *") int[] coords) {
        org.lwjgl.opengl.GL11.glVertex2iv(coords);
    }

    @Override public void nglVertex2dv(long coords) {
        org.lwjgl.opengl.GL11.nglVertex2dv(coords);
    }

    @Override public void glVertex2dv(@NativeType("GLdouble const *") DoubleBuffer coords) {
        org.lwjgl.opengl.GL11.glVertex2dv(coords);
    }

    @Override public void glVertex2dv(@NativeType("GLdouble const *") double[] coords) {
        org.lwjgl.opengl.GL11.glVertex2dv(coords);
    }

    @Override public void glVertex3f(@NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z) {
        org.lwjgl.opengl.GL11.glVertex3f(x, y, z);
    }

    @Override public void glVertex3s(@NativeType("GLshort") short x, @NativeType("GLshort") short y, @NativeType("GLshort") short z) {
        org.lwjgl.opengl.GL11.glVertex3s(x, y, z);
    }

    @Override public void glVertex3i(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z) {
        org.lwjgl.opengl.GL11.glVertex3i(x, y, z);
    }

    @Override public void glVertex3d(@NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z) {
        org.lwjgl.opengl.GL11.glVertex3d(x, y, z);
    }

    @Override public void nglVertex3fv(long coords) {
        org.lwjgl.opengl.GL11.nglVertex3fv(coords);
    }

    @Override public void glVertex3fv(@NativeType("GLfloat const *") FloatBuffer coords) {
        org.lwjgl.opengl.GL11.glVertex3fv(coords);
    }

    @Override public void glVertex3fv(@NativeType("GLfloat const *") float[] coords) {
        org.lwjgl.opengl.GL11.glVertex3fv(coords);
    }

    @Override public void nglVertex3sv(long coords) {
        org.lwjgl.opengl.GL11.nglVertex3sv(coords);
    }

    @Override public void glVertex3sv(@NativeType("GLshort const *") ShortBuffer coords) {
        org.lwjgl.opengl.GL11.glVertex3sv(coords);
    }

    @Override public void glVertex3sv(@NativeType("GLshort const *") short[] coords) {
        org.lwjgl.opengl.GL11.glVertex3sv(coords);
    }

    @Override public void nglVertex3iv(long coords) {
        org.lwjgl.opengl.GL11.nglVertex3iv(coords);
    }

    @Override public void glVertex3iv(@NativeType("GLint const *") IntBuffer coords) {
        org.lwjgl.opengl.GL11.glVertex3iv(coords);
    }

    @Override public void glVertex3iv(@NativeType("GLint const *") int[] coords) {
        org.lwjgl.opengl.GL11.glVertex3iv(coords);
    }

    @Override public void nglVertex3dv(long coords) {
        org.lwjgl.opengl.GL11.nglVertex3dv(coords);
    }

    @Override public void glVertex3dv(@NativeType("GLdouble const *") DoubleBuffer coords) {
        org.lwjgl.opengl.GL11.glVertex3dv(coords);
    }

    @Override public void glVertex3dv(@NativeType("GLdouble const *") double[] coords) {
        org.lwjgl.opengl.GL11.glVertex3dv(coords);
    }

    @Override public void glVertex4f(@NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z, @NativeType("GLfloat") float w) {
        org.lwjgl.opengl.GL11.glVertex4f(x, y, z, w);
    }

    @Override public void glVertex4s(@NativeType("GLshort") short x, @NativeType("GLshort") short y, @NativeType("GLshort") short z, @NativeType("GLshort") short w) {
        org.lwjgl.opengl.GL11.glVertex4s(x, y, z, w);
    }

    @Override public void glVertex4i(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z, @NativeType("GLint") int w) {
        org.lwjgl.opengl.GL11.glVertex4i(x, y, z, w);
    }

    @Override public void glVertex4d(@NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z, @NativeType("GLdouble") double w) {
        org.lwjgl.opengl.GL11.glVertex4d(x, y, z, w);
    }

    @Override public void nglVertex4fv(long coords) {
        org.lwjgl.opengl.GL11.nglVertex4fv(coords);
    }

    @Override public void glVertex4fv(@NativeType("GLfloat const *") FloatBuffer coords) {
        org.lwjgl.opengl.GL11.glVertex4fv(coords);
    }

    @Override public void glVertex4fv(@NativeType("GLfloat const *") float[] coords) {
        org.lwjgl.opengl.GL11.glVertex4fv(coords);
    }

    @Override public void nglVertex4sv(long coords) {
        org.lwjgl.opengl.GL11.nglVertex4sv(coords);
    }

    @Override public void glVertex4sv(@NativeType("GLshort const *") ShortBuffer coords) {
        org.lwjgl.opengl.GL11.glVertex4sv(coords);
    }

    @Override public void glVertex4sv(@NativeType("GLshort const *") short[] coords) {
        org.lwjgl.opengl.GL11.glVertex4sv(coords);
    }

    @Override public void nglVertex4iv(long coords) {
        org.lwjgl.opengl.GL11.nglVertex4iv(coords);
    }

    @Override public void glVertex4iv(@NativeType("GLint const *") IntBuffer coords) {
        org.lwjgl.opengl.GL11.glVertex4iv(coords);
    }

    @Override public void glVertex4iv(@NativeType("GLint const *") int[] coords) {
        org.lwjgl.opengl.GL11.glVertex4iv(coords);
    }

    @Override public void nglVertex4dv(long coords) {
        org.lwjgl.opengl.GL11.nglVertex4dv(coords);
    }

    @Override public void glVertex4dv(@NativeType("GLdouble const *") DoubleBuffer coords) {
        org.lwjgl.opengl.GL11.glVertex4dv(coords);
    }

    @Override public void glVertex4dv(@NativeType("GLdouble const *") double[] coords) {
        org.lwjgl.opengl.GL11.glVertex4dv(coords);
    }

    @Override public void nglVertexPointer(int size, int type, int stride, long pointer) {
        org.lwjgl.opengl.GL11.nglVertexPointer(size, type, stride, pointer);
    }

    @Override public void glVertexPointer(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        org.lwjgl.opengl.GL11.glVertexPointer(size, type, stride, pointer);
    }

    @Override public void glVertexPointer(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        org.lwjgl.opengl.GL11.glVertexPointer(size, type, stride, pointer);
    }

    @Override public void glVertexPointer(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer) {
        org.lwjgl.opengl.GL11.glVertexPointer(size, type, stride, pointer);
    }

    @Override public void glVertexPointer(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") IntBuffer pointer) {
        org.lwjgl.opengl.GL11.glVertexPointer(size, type, stride, pointer);
    }

    @Override public void glVertexPointer(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") FloatBuffer pointer) {
        org.lwjgl.opengl.GL11.glVertexPointer(size, type, stride, pointer);
    }

    @Override public void glViewport(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int w, @NativeType("GLsizei") int h) {
        org.lwjgl.opengl.GL11.glViewport(x, y, w, h);
    }

}
