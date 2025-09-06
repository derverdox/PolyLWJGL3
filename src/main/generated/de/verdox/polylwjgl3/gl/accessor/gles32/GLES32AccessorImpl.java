package de.verdox.polylwjgl3.gl.accessor.gles32;

import de.verdox.polylwjgl3.gl.accessor.gles31.GLES31Accessor;
import de.verdox.polylwjgl3.gl.accessor.gles31.GLES31AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengles.GLDebugMessageCallbackI;
import org.lwjgl.opengles.GLES32;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public class GLES32AccessorImpl extends GLES31AccessorImpl implements GLES32Accessor {

    @Override public void glBlendBarrier() {
        org.lwjgl.opengles.GLES32.glBlendBarrier();
    }

    @Override public void glCopyImageSubData(@NativeType("GLuint") int srcName, @NativeType("GLenum") int srcTarget, @NativeType("GLint") int srcLevel, @NativeType("GLint") int srcX, @NativeType("GLint") int srcY, @NativeType("GLint") int srcZ, @NativeType("GLuint") int dstName, @NativeType("GLenum") int dstTarget, @NativeType("GLint") int dstLevel, @NativeType("GLint") int dstX, @NativeType("GLint") int dstY, @NativeType("GLint") int dstZ, @NativeType("GLsizei") int srcWidth, @NativeType("GLsizei") int srcHeight, @NativeType("GLsizei") int srcDepth) {
        org.lwjgl.opengles.GLES32.glCopyImageSubData(srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, srcWidth, srcHeight, srcDepth);
    }

    @Override public void nglDebugMessageControl(int source, int type, int severity, int count, long ids, boolean enabled) {
        org.lwjgl.opengles.GLES32.nglDebugMessageControl(source, type, severity, count, ids, enabled);
    }

    @Override public void glDebugMessageControl(@NativeType("GLenum") int source, @NativeType("GLenum") int type, @NativeType("GLenum") int severity, @NativeType("GLuint const *") IntBuffer ids, @NativeType("GLboolean") boolean enabled) {
        org.lwjgl.opengles.GLES32.glDebugMessageControl(source, type, severity, ids, enabled);
    }

    @Override public void glDebugMessageControl(@NativeType("GLenum") int source, @NativeType("GLenum") int type, @NativeType("GLenum") int severity, @NativeType("GLuint const *") int id, @NativeType("GLboolean") boolean enabled) {
        org.lwjgl.opengles.GLES32.glDebugMessageControl(source, type, severity, id, enabled);
    }

    @Override public void glDebugMessageControl(@NativeType("GLenum") int source, @NativeType("GLenum") int type, @NativeType("GLenum") int severity, @NativeType("GLuint const *") int[] ids, @NativeType("GLboolean") boolean enabled) {
        org.lwjgl.opengles.GLES32.glDebugMessageControl(source, type, severity, ids, enabled);
    }

    @Override public void nglDebugMessageInsert(int source, int type, int id, int severity, int length, long message) {
        org.lwjgl.opengles.GLES32.nglDebugMessageInsert(source, type, id, severity, length, message);
    }

    @Override public void glDebugMessageInsert(@NativeType("GLenum") int source, @NativeType("GLenum") int type, @NativeType("GLuint") int id, @NativeType("GLenum") int severity, @NativeType("GLchar const *") ByteBuffer message) {
        org.lwjgl.opengles.GLES32.glDebugMessageInsert(source, type, id, severity, message);
    }

    @Override public void glDebugMessageInsert(@NativeType("GLenum") int source, @NativeType("GLenum") int type, @NativeType("GLuint") int id, @NativeType("GLenum") int severity, @NativeType("GLchar const *") CharSequence message) {
        org.lwjgl.opengles.GLES32.glDebugMessageInsert(source, type, id, severity, message);
    }

    @Override public void nglDebugMessageCallback(long callback, long userParam) {
        org.lwjgl.opengles.GLES32.nglDebugMessageCallback(callback, userParam);
    }

    @Override public void glDebugMessageCallback(@Nullable @NativeType("GLDEBUGPROC") GLDebugMessageCallbackI callback, @NativeType("void const *") long userParam) {
        org.lwjgl.opengles.GLES32.glDebugMessageCallback(callback, userParam);
    }

    @Override public int nglGetDebugMessageLog(int count, int bufsize, long sources, long types, long ids, long severities, long lengths, long messageLog) {
        return org.lwjgl.opengles.GLES32.nglGetDebugMessageLog(count, bufsize, sources, types, ids, severities, lengths, messageLog);
    }

@NativeType("GLuint")
    @Override public int glGetDebugMessageLog(@NativeType("GLuint") int count, @Nullable @NativeType("GLenum *") IntBuffer sources, @Nullable @NativeType("GLenum *") IntBuffer types, @Nullable @NativeType("GLuint *") IntBuffer ids, @Nullable @NativeType("GLenum *") IntBuffer severities, @Nullable @NativeType("GLsizei *") IntBuffer lengths, @Nullable @NativeType("GLchar *") ByteBuffer messageLog) {
        return org.lwjgl.opengles.GLES32.glGetDebugMessageLog(count, sources, types, ids, severities, lengths, messageLog);
    }

@NativeType("GLuint")
    @Override public int glGetDebugMessageLog(@NativeType("GLuint") int count, @Nullable @NativeType("GLenum *") int[] sources, @Nullable @NativeType("GLenum *") int[] types, @Nullable @NativeType("GLuint *") int[] ids, @Nullable @NativeType("GLenum *") int[] severities, @Nullable @NativeType("GLsizei *") int[] lengths, @Nullable @NativeType("GLchar *") ByteBuffer messageLog) {
        return org.lwjgl.opengles.GLES32.glGetDebugMessageLog(count, sources, types, ids, severities, lengths, messageLog);
    }

    @Override public void nglGetPointerv(int pname, long params) {
        org.lwjgl.opengles.GLES32.nglGetPointerv(pname, params);
    }

    @Override public void glGetPointerv(@NativeType("GLenum") int pname, @NativeType("void **") PointerBuffer params) {
        org.lwjgl.opengles.GLES32.glGetPointerv(pname, params);
    }

@NativeType("void")
    @Override public long glGetPointer(@NativeType("GLenum") int pname) {
        return org.lwjgl.opengles.GLES32.glGetPointer(pname);
    }

    @Override public void nglPushDebugGroup(int source, int id, int length, long message) {
        org.lwjgl.opengles.GLES32.nglPushDebugGroup(source, id, length, message);
    }

    @Override public void glPushDebugGroup(@NativeType("GLenum") int source, @NativeType("GLuint") int id, @NativeType("GLchar const *") ByteBuffer message) {
        org.lwjgl.opengles.GLES32.glPushDebugGroup(source, id, message);
    }

    @Override public void glPushDebugGroup(@NativeType("GLenum") int source, @NativeType("GLuint") int id, @NativeType("GLchar const *") CharSequence message) {
        org.lwjgl.opengles.GLES32.glPushDebugGroup(source, id, message);
    }

    @Override public void glPopDebugGroup() {
        org.lwjgl.opengles.GLES32.glPopDebugGroup();
    }

    @Override public void nglObjectLabel(int identifier, int name, int length, long label) {
        org.lwjgl.opengles.GLES32.nglObjectLabel(identifier, name, length, label);
    }

    @Override public void glObjectLabel(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name, @NativeType("GLchar const *") ByteBuffer label) {
        org.lwjgl.opengles.GLES32.glObjectLabel(identifier, name, label);
    }

    @Override public void glObjectLabel(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name, @NativeType("GLchar const *") CharSequence label) {
        org.lwjgl.opengles.GLES32.glObjectLabel(identifier, name, label);
    }

    @Override public void nglGetObjectLabel(int identifier, int name, int bufSize, long length, long label) {
        org.lwjgl.opengles.GLES32.nglGetObjectLabel(identifier, name, bufSize, length, label);
    }

    @Override public void glGetObjectLabel(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLchar *") ByteBuffer label) {
        org.lwjgl.opengles.GLES32.glGetObjectLabel(identifier, name, length, label);
    }

@NativeType("void")
    @Override public String glGetObjectLabel(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name, @NativeType("GLsizei") int bufSize) {
        return org.lwjgl.opengles.GLES32.glGetObjectLabel(identifier, name, bufSize);
    }

@NativeType("void")
    @Override public String glGetObjectLabel(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name) {
        return org.lwjgl.opengles.GLES32.glGetObjectLabel(identifier, name);
    }

    @Override public void glGetObjectLabel(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLchar *") ByteBuffer label) {
        org.lwjgl.opengles.GLES32.glGetObjectLabel(identifier, name, length, label);
    }

    @Override public void nglObjectPtrLabel(long ptr, int length, long label) {
        org.lwjgl.opengles.GLES32.nglObjectPtrLabel(ptr, length, label);
    }

    @Override public void glObjectPtrLabel(@NativeType("void *") long ptr, @NativeType("GLchar const *") ByteBuffer label) {
        org.lwjgl.opengles.GLES32.glObjectPtrLabel(ptr, label);
    }

    @Override public void glObjectPtrLabel(@NativeType("void *") long ptr, @NativeType("GLchar const *") CharSequence label) {
        org.lwjgl.opengles.GLES32.glObjectPtrLabel(ptr, label);
    }

    @Override public void nglGetObjectPtrLabel(long ptr, int bufSize, long length, long label) {
        org.lwjgl.opengles.GLES32.nglGetObjectPtrLabel(ptr, bufSize, length, label);
    }

    @Override public void glGetObjectPtrLabel(@NativeType("void *") long ptr, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLchar *") ByteBuffer label) {
        org.lwjgl.opengles.GLES32.glGetObjectPtrLabel(ptr, length, label);
    }

@NativeType("void")
    @Override public String glGetObjectPtrLabel(@NativeType("void *") long ptr, @NativeType("GLsizei") int bufSize) {
        return org.lwjgl.opengles.GLES32.glGetObjectPtrLabel(ptr, bufSize);
    }

@NativeType("void")
    @Override public String glGetObjectPtrLabel(@NativeType("void *") long ptr) {
        return org.lwjgl.opengles.GLES32.glGetObjectPtrLabel(ptr);
    }

    @Override public void glGetObjectPtrLabel(@NativeType("void *") long ptr, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLchar *") ByteBuffer label) {
        org.lwjgl.opengles.GLES32.glGetObjectPtrLabel(ptr, length, label);
    }

    @Override public void glEnablei(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        org.lwjgl.opengles.GLES32.glEnablei(target, index);
    }

    @Override public void glDisablei(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        org.lwjgl.opengles.GLES32.glDisablei(target, index);
    }

    @Override public void glBlendEquationi(@NativeType("GLuint") int buf, @NativeType("GLenum") int mode) {
        org.lwjgl.opengles.GLES32.glBlendEquationi(buf, mode);
    }

    @Override public void glBlendEquationSeparatei(@NativeType("GLuint") int buf, @NativeType("GLenum") int modeRGB, @NativeType("GLenum") int modeAlpha) {
        org.lwjgl.opengles.GLES32.glBlendEquationSeparatei(buf, modeRGB, modeAlpha);
    }

    @Override public void glBlendFunci(@NativeType("GLuint") int buf, @NativeType("GLenum") int src, @NativeType("GLenum") int dst) {
        org.lwjgl.opengles.GLES32.glBlendFunci(buf, src, dst);
    }

    @Override public void glBlendFuncSeparatei(@NativeType("GLuint") int buf, @NativeType("GLenum") int srcRGB, @NativeType("GLenum") int dstRGB, @NativeType("GLenum") int srcAlpha, @NativeType("GLenum") int dstAlpha) {
        org.lwjgl.opengles.GLES32.glBlendFuncSeparatei(buf, srcRGB, dstRGB, srcAlpha, dstAlpha);
    }

    @Override public void glColorMaski(@NativeType("GLuint") int index, @NativeType("GLboolean") boolean r, @NativeType("GLboolean") boolean g, @NativeType("GLboolean") boolean b, @NativeType("GLboolean") boolean a) {
        org.lwjgl.opengles.GLES32.glColorMaski(index, r, g, b, a);
    }

@NativeType("GLboolean")
    @Override public boolean glIsEnabledi(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        return org.lwjgl.opengles.GLES32.glIsEnabledi(target, index);
    }

    @Override public void nglDrawElementsBaseVertex(int mode, int count, int type, long indices, int basevertex) {
        org.lwjgl.opengles.GLES32.nglDrawElementsBaseVertex(mode, count, type, indices, basevertex);
    }

    @Override public void glDrawElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLint") int basevertex) {
        org.lwjgl.opengles.GLES32.glDrawElementsBaseVertex(mode, count, type, indices, basevertex);
    }

    @Override public void glDrawElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLint") int basevertex) {
        org.lwjgl.opengles.GLES32.glDrawElementsBaseVertex(mode, type, indices, basevertex);
    }

    @Override public void glDrawElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices, @NativeType("GLint") int basevertex) {
        org.lwjgl.opengles.GLES32.glDrawElementsBaseVertex(mode, indices, basevertex);
    }

    @Override public void glDrawElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices, @NativeType("GLint") int basevertex) {
        org.lwjgl.opengles.GLES32.glDrawElementsBaseVertex(mode, indices, basevertex);
    }

    @Override public void glDrawElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices, @NativeType("GLint") int basevertex) {
        org.lwjgl.opengles.GLES32.glDrawElementsBaseVertex(mode, indices, basevertex);
    }

    @Override public void nglDrawRangeElementsBaseVertex(int mode, int start, int end, int count, int type, long indices, int basevertex) {
        org.lwjgl.opengles.GLES32.nglDrawRangeElementsBaseVertex(mode, start, end, count, type, indices, basevertex);
    }

    @Override public void glDrawRangeElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLint") int basevertex) {
        org.lwjgl.opengles.GLES32.glDrawRangeElementsBaseVertex(mode, start, end, count, type, indices, basevertex);
    }

    @Override public void glDrawRangeElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLint") int basevertex) {
        org.lwjgl.opengles.GLES32.glDrawRangeElementsBaseVertex(mode, start, end, type, indices, basevertex);
    }

    @Override public void glDrawRangeElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("void const *") ByteBuffer indices, @NativeType("GLint") int basevertex) {
        org.lwjgl.opengles.GLES32.glDrawRangeElementsBaseVertex(mode, start, end, indices, basevertex);
    }

    @Override public void glDrawRangeElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("void const *") ShortBuffer indices, @NativeType("GLint") int basevertex) {
        org.lwjgl.opengles.GLES32.glDrawRangeElementsBaseVertex(mode, start, end, indices, basevertex);
    }

    @Override public void glDrawRangeElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("void const *") IntBuffer indices, @NativeType("GLint") int basevertex) {
        org.lwjgl.opengles.GLES32.glDrawRangeElementsBaseVertex(mode, start, end, indices, basevertex);
    }

    @Override public void nglDrawElementsInstancedBaseVertex(int mode, int count, int type, long indices, int instancecount, int basevertex) {
        org.lwjgl.opengles.GLES32.nglDrawElementsInstancedBaseVertex(mode, count, type, indices, instancecount, basevertex);
    }

    @Override public void glDrawElementsInstancedBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLsizei") int instancecount, @NativeType("GLint") int basevertex) {
        org.lwjgl.opengles.GLES32.glDrawElementsInstancedBaseVertex(mode, count, type, indices, instancecount, basevertex);
    }

    @Override public void glDrawElementsInstancedBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int instancecount, @NativeType("GLint") int basevertex) {
        org.lwjgl.opengles.GLES32.glDrawElementsInstancedBaseVertex(mode, type, indices, instancecount, basevertex);
    }

    @Override public void glDrawElementsInstancedBaseVertex(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int instancecount, @NativeType("GLint") int basevertex) {
        org.lwjgl.opengles.GLES32.glDrawElementsInstancedBaseVertex(mode, indices, instancecount, basevertex);
    }

    @Override public void glDrawElementsInstancedBaseVertex(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices, @NativeType("GLsizei") int instancecount, @NativeType("GLint") int basevertex) {
        org.lwjgl.opengles.GLES32.glDrawElementsInstancedBaseVertex(mode, indices, instancecount, basevertex);
    }

    @Override public void glDrawElementsInstancedBaseVertex(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices, @NativeType("GLsizei") int instancecount, @NativeType("GLint") int basevertex) {
        org.lwjgl.opengles.GLES32.glDrawElementsInstancedBaseVertex(mode, indices, instancecount, basevertex);
    }

    @Override public void glFramebufferTexture(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level) {
        org.lwjgl.opengles.GLES32.glFramebufferTexture(target, attachment, texture, level);
    }

    @Override public void glPrimitiveBoundingBox(@NativeType("GLfloat") float minX, @NativeType("GLfloat") float minY, @NativeType("GLfloat") float minZ, @NativeType("GLfloat") float minW, @NativeType("GLfloat") float maxX, @NativeType("GLfloat") float maxY, @NativeType("GLfloat") float maxZ, @NativeType("GLfloat") float maxW) {
        org.lwjgl.opengles.GLES32.glPrimitiveBoundingBox(minX, minY, minZ, minW, maxX, maxY, maxZ, maxW);
    }

@NativeType("GLenum")
    @Override public int glGetGraphicsResetStatus() {
        return org.lwjgl.opengles.GLES32.glGetGraphicsResetStatus();
    }

    @Override public void nglReadnPixels(int x, int y, int width, int height, int format, int type, int bufSize, long pixels) {
        org.lwjgl.opengles.GLES32.nglReadnPixels(x, y, width, height, format, type, bufSize, pixels);
    }

    @Override public void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int bufSize, @NativeType("void *") long pixels) {
        org.lwjgl.opengles.GLES32.glReadnPixels(x, y, width, height, format, type, bufSize, pixels);
    }

    @Override public void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer pixels) {
        org.lwjgl.opengles.GLES32.glReadnPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ShortBuffer pixels) {
        org.lwjgl.opengles.GLES32.glReadnPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") IntBuffer pixels) {
        org.lwjgl.opengles.GLES32.glReadnPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") FloatBuffer pixels) {
        org.lwjgl.opengles.GLES32.glReadnPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") short[] pixels) {
        org.lwjgl.opengles.GLES32.glReadnPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") int[] pixels) {
        org.lwjgl.opengles.GLES32.glReadnPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") float[] pixels) {
        org.lwjgl.opengles.GLES32.glReadnPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void nglGetnUniformfv(int program, int location, int bufSize, long params) {
        org.lwjgl.opengles.GLES32.nglGetnUniformfv(program, location, bufSize, params);
    }

    @Override public void glGetnUniformfv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") FloatBuffer params) {
        org.lwjgl.opengles.GLES32.glGetnUniformfv(program, location, params);
    }

    @Override public void glGetnUniformfv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") float[] params) {
        org.lwjgl.opengles.GLES32.glGetnUniformfv(program, location, params);
    }

@NativeType("void")
    @Override public float glGetnUniformf(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        return org.lwjgl.opengles.GLES32.glGetnUniformf(program, location);
    }

    @Override public void nglGetnUniformiv(int program, int location, int bufSize, long params) {
        org.lwjgl.opengles.GLES32.nglGetnUniformiv(program, location, bufSize, params);
    }

    @Override public void glGetnUniformiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") FloatBuffer params) {
        org.lwjgl.opengles.GLES32.glGetnUniformiv(program, location, params);
    }

    @Override public void glGetnUniformiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") float[] params) {
        org.lwjgl.opengles.GLES32.glGetnUniformiv(program, location, params);
    }

@NativeType("void")
    @Override public float glGetnUniformi(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        return org.lwjgl.opengles.GLES32.glGetnUniformi(program, location);
    }

    @Override public void nglGetnUniformuiv(int program, int location, int bufSize, long params) {
        org.lwjgl.opengles.GLES32.nglGetnUniformuiv(program, location, bufSize, params);
    }

    @Override public void glGetnUniformuiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") FloatBuffer params) {
        org.lwjgl.opengles.GLES32.glGetnUniformuiv(program, location, params);
    }

    @Override public void glGetnUniformuiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") float[] params) {
        org.lwjgl.opengles.GLES32.glGetnUniformuiv(program, location, params);
    }

@NativeType("void")
    @Override public float glGetnUniformui(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        return org.lwjgl.opengles.GLES32.glGetnUniformui(program, location);
    }

    @Override public void glMinSampleShading(@NativeType("GLfloat") float value) {
        org.lwjgl.opengles.GLES32.glMinSampleShading(value);
    }

    @Override public void glPatchParameteri(@NativeType("GLenum") int pname, @NativeType("GLint") int value) {
        org.lwjgl.opengles.GLES32.glPatchParameteri(pname, value);
    }

    @Override public void nglTexParameterIiv(int target, int pname, long params) {
        org.lwjgl.opengles.GLES32.nglTexParameterIiv(target, pname, params);
    }

    @Override public void glTexParameterIiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        org.lwjgl.opengles.GLES32.glTexParameterIiv(target, pname, params);
    }

    @Override public void glTexParameterIiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        org.lwjgl.opengles.GLES32.glTexParameterIiv(target, pname, params);
    }

    @Override public void glTexParameterIi(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") int param) {
        org.lwjgl.opengles.GLES32.glTexParameterIi(target, pname, param);
    }

    @Override public void nglTexParameterIuiv(int target, int pname, long params) {
        org.lwjgl.opengles.GLES32.nglTexParameterIuiv(target, pname, params);
    }

    @Override public void glTexParameterIuiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint const *") IntBuffer params) {
        org.lwjgl.opengles.GLES32.glTexParameterIuiv(target, pname, params);
    }

    @Override public void glTexParameterIuiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint const *") int[] params) {
        org.lwjgl.opengles.GLES32.glTexParameterIuiv(target, pname, params);
    }

    @Override public void glTexParameterIui(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint const *") int param) {
        org.lwjgl.opengles.GLES32.glTexParameterIui(target, pname, param);
    }

    @Override public void nglGetTexParameterIiv(int target, int pname, long params) {
        org.lwjgl.opengles.GLES32.nglGetTexParameterIiv(target, pname, params);
    }

    @Override public void glGetTexParameterIiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengles.GLES32.glGetTexParameterIiv(target, pname, params);
    }

    @Override public void glGetTexParameterIiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengles.GLES32.glGetTexParameterIiv(target, pname, params);
    }

@NativeType("void")
    @Override public int glGetTexParameterIi(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengles.GLES32.glGetTexParameterIi(target, pname);
    }

    @Override public void nglGetTexParameterIuiv(int target, int pname, long params) {
        org.lwjgl.opengles.GLES32.nglGetTexParameterIuiv(target, pname, params);
    }

    @Override public void glGetTexParameterIuiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        org.lwjgl.opengles.GLES32.glGetTexParameterIuiv(target, pname, params);
    }

    @Override public void glGetTexParameterIuiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        org.lwjgl.opengles.GLES32.glGetTexParameterIuiv(target, pname, params);
    }

@NativeType("void")
    @Override public int glGetTexParameterIui(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengles.GLES32.glGetTexParameterIui(target, pname);
    }

    @Override public void nglSamplerParameterIiv(int sampler, int pname, long params) {
        org.lwjgl.opengles.GLES32.nglSamplerParameterIiv(sampler, pname, params);
    }

    @Override public void glSamplerParameterIiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        org.lwjgl.opengles.GLES32.glSamplerParameterIiv(sampler, pname, params);
    }

    @Override public void glSamplerParameterIiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        org.lwjgl.opengles.GLES32.glSamplerParameterIiv(sampler, pname, params);
    }

    @Override public void glSamplerParameterIi(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint const *") int param) {
        org.lwjgl.opengles.GLES32.glSamplerParameterIi(sampler, pname, param);
    }

    @Override public void nglSamplerParameterIuiv(int sampler, int pname, long params) {
        org.lwjgl.opengles.GLES32.nglSamplerParameterIuiv(sampler, pname, params);
    }

    @Override public void glSamplerParameterIuiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint const *") IntBuffer params) {
        org.lwjgl.opengles.GLES32.glSamplerParameterIuiv(sampler, pname, params);
    }

    @Override public void glSamplerParameterIuiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint const *") int[] params) {
        org.lwjgl.opengles.GLES32.glSamplerParameterIuiv(sampler, pname, params);
    }

    @Override public void glSamplerParameterIui(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint const *") int param) {
        org.lwjgl.opengles.GLES32.glSamplerParameterIui(sampler, pname, param);
    }

    @Override public void nglGetSamplerParameterIiv(int sampler, int pname, long params) {
        org.lwjgl.opengles.GLES32.nglGetSamplerParameterIiv(sampler, pname, params);
    }

    @Override public void glGetSamplerParameterIiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengles.GLES32.glGetSamplerParameterIiv(sampler, pname, params);
    }

    @Override public void glGetSamplerParameterIiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengles.GLES32.glGetSamplerParameterIiv(sampler, pname, params);
    }

@NativeType("void")
    @Override public int glGetSamplerParameterIi(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengles.GLES32.glGetSamplerParameterIi(sampler, pname);
    }

    @Override public void nglGetSamplerParameterIuiv(int sampler, int pname, long params) {
        org.lwjgl.opengles.GLES32.nglGetSamplerParameterIuiv(sampler, pname, params);
    }

    @Override public void glGetSamplerParameterIuiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        org.lwjgl.opengles.GLES32.glGetSamplerParameterIuiv(sampler, pname, params);
    }

    @Override public void glGetSamplerParameterIuiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        org.lwjgl.opengles.GLES32.glGetSamplerParameterIuiv(sampler, pname, params);
    }

@NativeType("void")
    @Override public int glGetSamplerParameterIui(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengles.GLES32.glGetSamplerParameterIui(sampler, pname);
    }

    @Override public void glTexBuffer(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int buffer) {
        org.lwjgl.opengles.GLES32.glTexBuffer(target, internalformat, buffer);
    }

    @Override public void glTexBufferRange(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size) {
        org.lwjgl.opengles.GLES32.glTexBufferRange(target, internalformat, buffer, offset, size);
    }

    @Override public void glTexStorage3DMultisample(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLboolean") boolean fixedsamplelocations) {
        org.lwjgl.opengles.GLES32.glTexStorage3DMultisample(target, samples, internalformat, width, height, depth, fixedsamplelocations);
    }

}
