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

    @Override public void glBlendColor(@NativeType("GLfloat") float red, @NativeType("GLfloat") float green, @NativeType("GLfloat") float blue, @NativeType("GLfloat") float alpha) {
        org.lwjgl.opengl.GL14.glBlendColor(red, green, blue, alpha);
    }

    @Override public void glBlendEquation(@NativeType("GLenum") int mode) {
        org.lwjgl.opengl.GL14.glBlendEquation(mode);
    }

    @Override public void glFogCoordf(@NativeType("GLfloat") float coord) {
        org.lwjgl.opengl.GL14.glFogCoordf(coord);
    }

    @Override public void glFogCoordd(@NativeType("GLdouble") double coord) {
        org.lwjgl.opengl.GL14.glFogCoordd(coord);
    }

    @Override public void nglFogCoordfv(long coord) {
        org.lwjgl.opengl.GL14.nglFogCoordfv(coord);
    }

    @Override public void glFogCoordfv(@NativeType("GLfloat const *") FloatBuffer coord) {
        org.lwjgl.opengl.GL14.glFogCoordfv(coord);
    }

    @Override public void glFogCoordfv(@NativeType("GLfloat const *") float[] coord) {
        org.lwjgl.opengl.GL14.glFogCoordfv(coord);
    }

    @Override public void nglFogCoorddv(long coord) {
        org.lwjgl.opengl.GL14.nglFogCoorddv(coord);
    }

    @Override public void glFogCoorddv(@NativeType("GLdouble const *") DoubleBuffer coord) {
        org.lwjgl.opengl.GL14.glFogCoorddv(coord);
    }

    @Override public void glFogCoorddv(@NativeType("GLdouble const *") double[] coord) {
        org.lwjgl.opengl.GL14.glFogCoorddv(coord);
    }

    @Override public void nglFogCoordPointer(int type, int stride, long pointer) {
        org.lwjgl.opengl.GL14.nglFogCoordPointer(type, stride, pointer);
    }

    @Override public void glFogCoordPointer(@NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        org.lwjgl.opengl.GL14.glFogCoordPointer(type, stride, pointer);
    }

    @Override public void glFogCoordPointer(@NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        org.lwjgl.opengl.GL14.glFogCoordPointer(type, stride, pointer);
    }

    @Override public void glFogCoordPointer(@NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer) {
        org.lwjgl.opengl.GL14.glFogCoordPointer(type, stride, pointer);
    }

    @Override public void glFogCoordPointer(@NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") FloatBuffer pointer) {
        org.lwjgl.opengl.GL14.glFogCoordPointer(type, stride, pointer);
    }

    @Override public void nglMultiDrawArrays(int mode, long first, long count, int drawcount) {
        org.lwjgl.opengl.GL14.nglMultiDrawArrays(mode, first, count, drawcount);
    }

    @Override public void glMultiDrawArrays(@NativeType("GLenum") int mode, @NativeType("GLint const *") IntBuffer first, @NativeType("GLsizei const *") IntBuffer count) {
        org.lwjgl.opengl.GL14.glMultiDrawArrays(mode, first, count);
    }

    @Override public void glMultiDrawArrays(@NativeType("GLenum") int mode, @NativeType("GLint const *") int[] first, @NativeType("GLsizei const *") int[] count) {
        org.lwjgl.opengl.GL14.glMultiDrawArrays(mode, first, count);
    }

    @Override public void nglMultiDrawElements(int mode, long count, int type, long indices, int drawcount) {
        org.lwjgl.opengl.GL14.nglMultiDrawElements(mode, count, type, indices, drawcount);
    }

    @Override public void glMultiDrawElements(@NativeType("GLenum") int mode, @NativeType("GLsizei *") IntBuffer count, @NativeType("GLenum") int type, @NativeType("void const **") PointerBuffer indices) {
        org.lwjgl.opengl.GL14.glMultiDrawElements(mode, count, type, indices);
    }

    @Override public void glMultiDrawElements(@NativeType("GLenum") int mode, @NativeType("GLsizei *") int[] count, @NativeType("GLenum") int type, @NativeType("void const **") PointerBuffer indices) {
        org.lwjgl.opengl.GL14.glMultiDrawElements(mode, count, type, indices);
    }

    @Override public void glPointParameterf(@NativeType("GLenum") int pname, @NativeType("GLfloat") float param) {
        org.lwjgl.opengl.GL14.glPointParameterf(pname, param);
    }

    @Override public void glPointParameteri(@NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        org.lwjgl.opengl.GL14.glPointParameteri(pname, param);
    }

    @Override public void nglPointParameterfv(int pname, long params) {
        org.lwjgl.opengl.GL14.nglPointParameterfv(pname, params);
    }

    @Override public void glPointParameterfv(@NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params) {
        org.lwjgl.opengl.GL14.glPointParameterfv(pname, params);
    }

    @Override public void glPointParameterfv(@NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] params) {
        org.lwjgl.opengl.GL14.glPointParameterfv(pname, params);
    }

    @Override public void nglPointParameteriv(int pname, long params) {
        org.lwjgl.opengl.GL14.nglPointParameteriv(pname, params);
    }

    @Override public void glPointParameteriv(@NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        org.lwjgl.opengl.GL14.glPointParameteriv(pname, params);
    }

    @Override public void glPointParameteriv(@NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        org.lwjgl.opengl.GL14.glPointParameteriv(pname, params);
    }

    @Override public void glSecondaryColor3b(@NativeType("GLbyte") byte red, @NativeType("GLbyte") byte green, @NativeType("GLbyte") byte blue) {
        org.lwjgl.opengl.GL14.glSecondaryColor3b(red, green, blue);
    }

    @Override public void glSecondaryColor3s(@NativeType("GLshort") short red, @NativeType("GLshort") short green, @NativeType("GLshort") short blue) {
        org.lwjgl.opengl.GL14.glSecondaryColor3s(red, green, blue);
    }

    @Override public void glSecondaryColor3i(@NativeType("GLint") int red, @NativeType("GLint") int green, @NativeType("GLint") int blue) {
        org.lwjgl.opengl.GL14.glSecondaryColor3i(red, green, blue);
    }

    @Override public void glSecondaryColor3f(@NativeType("GLfloat") float red, @NativeType("GLfloat") float green, @NativeType("GLfloat") float blue) {
        org.lwjgl.opengl.GL14.glSecondaryColor3f(red, green, blue);
    }

    @Override public void glSecondaryColor3d(@NativeType("GLdouble") double red, @NativeType("GLdouble") double green, @NativeType("GLdouble") double blue) {
        org.lwjgl.opengl.GL14.glSecondaryColor3d(red, green, blue);
    }

    @Override public void glSecondaryColor3ub(@NativeType("GLubyte") byte red, @NativeType("GLubyte") byte green, @NativeType("GLubyte") byte blue) {
        org.lwjgl.opengl.GL14.glSecondaryColor3ub(red, green, blue);
    }

    @Override public void glSecondaryColor3us(@NativeType("GLushort") short red, @NativeType("GLushort") short green, @NativeType("GLushort") short blue) {
        org.lwjgl.opengl.GL14.glSecondaryColor3us(red, green, blue);
    }

    @Override public void glSecondaryColor3ui(@NativeType("GLint") int red, @NativeType("GLint") int green, @NativeType("GLint") int blue) {
        org.lwjgl.opengl.GL14.glSecondaryColor3ui(red, green, blue);
    }

    @Override public void nglSecondaryColor3bv(long v) {
        org.lwjgl.opengl.GL14.nglSecondaryColor3bv(v);
    }

    @Override public void glSecondaryColor3bv(@NativeType("GLbyte const *") ByteBuffer v) {
        org.lwjgl.opengl.GL14.glSecondaryColor3bv(v);
    }

    @Override public void nglSecondaryColor3sv(long v) {
        org.lwjgl.opengl.GL14.nglSecondaryColor3sv(v);
    }

    @Override public void glSecondaryColor3sv(@NativeType("GLshort const *") ShortBuffer v) {
        org.lwjgl.opengl.GL14.glSecondaryColor3sv(v);
    }

    @Override public void glSecondaryColor3sv(@NativeType("GLshort const *") short[] v) {
        org.lwjgl.opengl.GL14.glSecondaryColor3sv(v);
    }

    @Override public void nglSecondaryColor3iv(long v) {
        org.lwjgl.opengl.GL14.nglSecondaryColor3iv(v);
    }

    @Override public void glSecondaryColor3iv(@NativeType("GLint const *") IntBuffer v) {
        org.lwjgl.opengl.GL14.glSecondaryColor3iv(v);
    }

    @Override public void glSecondaryColor3iv(@NativeType("GLint const *") int[] v) {
        org.lwjgl.opengl.GL14.glSecondaryColor3iv(v);
    }

    @Override public void nglSecondaryColor3fv(long v) {
        org.lwjgl.opengl.GL14.nglSecondaryColor3fv(v);
    }

    @Override public void glSecondaryColor3fv(@NativeType("GLfloat const *") FloatBuffer v) {
        org.lwjgl.opengl.GL14.glSecondaryColor3fv(v);
    }

    @Override public void glSecondaryColor3fv(@NativeType("GLfloat const *") float[] v) {
        org.lwjgl.opengl.GL14.glSecondaryColor3fv(v);
    }

    @Override public void nglSecondaryColor3dv(long v) {
        org.lwjgl.opengl.GL14.nglSecondaryColor3dv(v);
    }

    @Override public void glSecondaryColor3dv(@NativeType("GLdouble const *") DoubleBuffer v) {
        org.lwjgl.opengl.GL14.glSecondaryColor3dv(v);
    }

    @Override public void glSecondaryColor3dv(@NativeType("GLdouble const *") double[] v) {
        org.lwjgl.opengl.GL14.glSecondaryColor3dv(v);
    }

    @Override public void nglSecondaryColor3ubv(long v) {
        org.lwjgl.opengl.GL14.nglSecondaryColor3ubv(v);
    }

    @Override public void glSecondaryColor3ubv(@NativeType("GLubyte const *") ByteBuffer v) {
        org.lwjgl.opengl.GL14.glSecondaryColor3ubv(v);
    }

    @Override public void nglSecondaryColor3usv(long v) {
        org.lwjgl.opengl.GL14.nglSecondaryColor3usv(v);
    }

    @Override public void glSecondaryColor3usv(@NativeType("GLushort const *") ShortBuffer v) {
        org.lwjgl.opengl.GL14.glSecondaryColor3usv(v);
    }

    @Override public void glSecondaryColor3usv(@NativeType("GLushort const *") short[] v) {
        org.lwjgl.opengl.GL14.glSecondaryColor3usv(v);
    }

    @Override public void nglSecondaryColor3uiv(long v) {
        org.lwjgl.opengl.GL14.nglSecondaryColor3uiv(v);
    }

    @Override public void glSecondaryColor3uiv(@NativeType("GLuint const *") IntBuffer v) {
        org.lwjgl.opengl.GL14.glSecondaryColor3uiv(v);
    }

    @Override public void glSecondaryColor3uiv(@NativeType("GLuint const *") int[] v) {
        org.lwjgl.opengl.GL14.glSecondaryColor3uiv(v);
    }

    @Override public void nglSecondaryColorPointer(int size, int type, int stride, long pointer) {
        org.lwjgl.opengl.GL14.nglSecondaryColorPointer(size, type, stride, pointer);
    }

    @Override public void glSecondaryColorPointer(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        org.lwjgl.opengl.GL14.glSecondaryColorPointer(size, type, stride, pointer);
    }

    @Override public void glSecondaryColorPointer(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        org.lwjgl.opengl.GL14.glSecondaryColorPointer(size, type, stride, pointer);
    }

    @Override public void glSecondaryColorPointer(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer) {
        org.lwjgl.opengl.GL14.glSecondaryColorPointer(size, type, stride, pointer);
    }

    @Override public void glSecondaryColorPointer(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") IntBuffer pointer) {
        org.lwjgl.opengl.GL14.glSecondaryColorPointer(size, type, stride, pointer);
    }

    @Override public void glSecondaryColorPointer(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") FloatBuffer pointer) {
        org.lwjgl.opengl.GL14.glSecondaryColorPointer(size, type, stride, pointer);
    }

    @Override public void glBlendFuncSeparate(@NativeType("GLenum") int sfactorRGB, @NativeType("GLenum") int dfactorRGB, @NativeType("GLenum") int sfactorAlpha, @NativeType("GLenum") int dfactorAlpha) {
        org.lwjgl.opengl.GL14.glBlendFuncSeparate(sfactorRGB, dfactorRGB, sfactorAlpha, dfactorAlpha);
    }

    @Override public void glWindowPos2i(@NativeType("GLint") int x, @NativeType("GLint") int y) {
        org.lwjgl.opengl.GL14.glWindowPos2i(x, y);
    }

    @Override public void glWindowPos2s(@NativeType("GLshort") short x, @NativeType("GLshort") short y) {
        org.lwjgl.opengl.GL14.glWindowPos2s(x, y);
    }

    @Override public void glWindowPos2f(@NativeType("GLfloat") float x, @NativeType("GLfloat") float y) {
        org.lwjgl.opengl.GL14.glWindowPos2f(x, y);
    }

    @Override public void glWindowPos2d(@NativeType("GLdouble") double x, @NativeType("GLdouble") double y) {
        org.lwjgl.opengl.GL14.glWindowPos2d(x, y);
    }

    @Override public void nglWindowPos2iv(long p) {
        org.lwjgl.opengl.GL14.nglWindowPos2iv(p);
    }

    @Override public void glWindowPos2iv(@NativeType("GLint const *") IntBuffer p) {
        org.lwjgl.opengl.GL14.glWindowPos2iv(p);
    }

    @Override public void glWindowPos2iv(@NativeType("GLint const *") int[] p) {
        org.lwjgl.opengl.GL14.glWindowPos2iv(p);
    }

    @Override public void nglWindowPos2sv(long p) {
        org.lwjgl.opengl.GL14.nglWindowPos2sv(p);
    }

    @Override public void glWindowPos2sv(@NativeType("GLshort const *") ShortBuffer p) {
        org.lwjgl.opengl.GL14.glWindowPos2sv(p);
    }

    @Override public void glWindowPos2sv(@NativeType("GLshort const *") short[] p) {
        org.lwjgl.opengl.GL14.glWindowPos2sv(p);
    }

    @Override public void nglWindowPos2fv(long p) {
        org.lwjgl.opengl.GL14.nglWindowPos2fv(p);
    }

    @Override public void glWindowPos2fv(@NativeType("GLfloat const *") FloatBuffer p) {
        org.lwjgl.opengl.GL14.glWindowPos2fv(p);
    }

    @Override public void glWindowPos2fv(@NativeType("GLfloat const *") float[] p) {
        org.lwjgl.opengl.GL14.glWindowPos2fv(p);
    }

    @Override public void nglWindowPos2dv(long p) {
        org.lwjgl.opengl.GL14.nglWindowPos2dv(p);
    }

    @Override public void glWindowPos2dv(@NativeType("GLdouble const *") DoubleBuffer p) {
        org.lwjgl.opengl.GL14.glWindowPos2dv(p);
    }

    @Override public void glWindowPos2dv(@NativeType("GLdouble const *") double[] p) {
        org.lwjgl.opengl.GL14.glWindowPos2dv(p);
    }

    @Override public void glWindowPos3i(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z) {
        org.lwjgl.opengl.GL14.glWindowPos3i(x, y, z);
    }

    @Override public void glWindowPos3s(@NativeType("GLshort") short x, @NativeType("GLshort") short y, @NativeType("GLshort") short z) {
        org.lwjgl.opengl.GL14.glWindowPos3s(x, y, z);
    }

    @Override public void glWindowPos3f(@NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z) {
        org.lwjgl.opengl.GL14.glWindowPos3f(x, y, z);
    }

    @Override public void glWindowPos3d(@NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z) {
        org.lwjgl.opengl.GL14.glWindowPos3d(x, y, z);
    }

    @Override public void nglWindowPos3iv(long p) {
        org.lwjgl.opengl.GL14.nglWindowPos3iv(p);
    }

    @Override public void glWindowPos3iv(@NativeType("GLint const *") IntBuffer p) {
        org.lwjgl.opengl.GL14.glWindowPos3iv(p);
    }

    @Override public void glWindowPos3iv(@NativeType("GLint const *") int[] p) {
        org.lwjgl.opengl.GL14.glWindowPos3iv(p);
    }

    @Override public void nglWindowPos3sv(long p) {
        org.lwjgl.opengl.GL14.nglWindowPos3sv(p);
    }

    @Override public void glWindowPos3sv(@NativeType("GLshort const *") ShortBuffer p) {
        org.lwjgl.opengl.GL14.glWindowPos3sv(p);
    }

    @Override public void glWindowPos3sv(@NativeType("GLshort const *") short[] p) {
        org.lwjgl.opengl.GL14.glWindowPos3sv(p);
    }

    @Override public void nglWindowPos3fv(long p) {
        org.lwjgl.opengl.GL14.nglWindowPos3fv(p);
    }

    @Override public void glWindowPos3fv(@NativeType("GLfloat const *") FloatBuffer p) {
        org.lwjgl.opengl.GL14.glWindowPos3fv(p);
    }

    @Override public void glWindowPos3fv(@NativeType("GLfloat const *") float[] p) {
        org.lwjgl.opengl.GL14.glWindowPos3fv(p);
    }

    @Override public void nglWindowPos3dv(long p) {
        org.lwjgl.opengl.GL14.nglWindowPos3dv(p);
    }

    @Override public void glWindowPos3dv(@NativeType("GLdouble const *") DoubleBuffer p) {
        org.lwjgl.opengl.GL14.glWindowPos3dv(p);
    }

    @Override public void glWindowPos3dv(@NativeType("GLdouble const *") double[] p) {
        org.lwjgl.opengl.GL14.glWindowPos3dv(p);
    }

}
