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

    @Override public void glCopyImageSubData(int srcName, int srcTarget, int srcLevel, int srcX, int srcY, int srcZ, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int srcWidth, int srcHeight, int srcDepth) {
        org.lwjgl.opengles.GLES32.glCopyImageSubData(srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, srcWidth, srcHeight, srcDepth);
    }

    @Override public void nglDebugMessageControl(int source, int type, int severity, int count, long ids, boolean enabled) {
        org.lwjgl.opengles.GLES32.nglDebugMessageControl(source, type, severity, count, ids, enabled);
    }

    @Override public void glDebugMessageControl(int source, int type, int severity, IntBuffer ids, boolean enabled) {
        org.lwjgl.opengles.GLES32.glDebugMessageControl(source, type, severity, ids, enabled);
    }

    @Override public void glDebugMessageControl(int source, int type, int severity, int id, boolean enabled) {
        org.lwjgl.opengles.GLES32.glDebugMessageControl(source, type, severity, id, enabled);
    }

    @Override public void glDebugMessageControl(int source, int type, int severity, int[] ids, boolean enabled) {
        org.lwjgl.opengles.GLES32.glDebugMessageControl(source, type, severity, ids, enabled);
    }

    @Override public void nglDebugMessageInsert(int source, int type, int id, int severity, int length, long message) {
        org.lwjgl.opengles.GLES32.nglDebugMessageInsert(source, type, id, severity, length, message);
    }

    @Override public void glDebugMessageInsert(int source, int type, int id, int severity, ByteBuffer message) {
        org.lwjgl.opengles.GLES32.glDebugMessageInsert(source, type, id, severity, message);
    }

    @Override public void glDebugMessageInsert(int source, int type, int id, int severity, CharSequence message) {
        org.lwjgl.opengles.GLES32.glDebugMessageInsert(source, type, id, severity, message);
    }

    @Override public void nglDebugMessageCallback(long callback, long userParam) {
        org.lwjgl.opengles.GLES32.nglDebugMessageCallback(callback, userParam);
    }

    @Override public void glDebugMessageCallback(@Nullable GLDebugMessageCallbackI callback, long userParam) {
        org.lwjgl.opengles.GLES32.glDebugMessageCallback(callback, userParam);
    }

    @Override public int nglGetDebugMessageLog(int count, int bufsize, long sources, long types, long ids, long severities, long lengths, long messageLog) {
        return org.lwjgl.opengles.GLES32.nglGetDebugMessageLog(count, bufsize, sources, types, ids, severities, lengths, messageLog);
    }

    @Override public int glGetDebugMessageLog(int count, @Nullable IntBuffer sources, @Nullable IntBuffer types, @Nullable IntBuffer ids, @Nullable IntBuffer severities, @Nullable IntBuffer lengths, @Nullable ByteBuffer messageLog) {
        return org.lwjgl.opengles.GLES32.glGetDebugMessageLog(count, sources, types, ids, severities, lengths, messageLog);
    }

    @Override public int glGetDebugMessageLog(int count, @Nullable int[] sources, @Nullable int[] types, @Nullable int[] ids, @Nullable int[] severities, @Nullable int[] lengths, @Nullable ByteBuffer messageLog) {
        return org.lwjgl.opengles.GLES32.glGetDebugMessageLog(count, sources, types, ids, severities, lengths, messageLog);
    }

    @Override public void nglGetPointerv(int pname, long params) {
        org.lwjgl.opengles.GLES32.nglGetPointerv(pname, params);
    }

    @Override public void glGetPointerv(int pname, PointerBuffer params) {
        org.lwjgl.opengles.GLES32.glGetPointerv(pname, params);
    }

    @Override public long glGetPointer(int pname) {
        return org.lwjgl.opengles.GLES32.glGetPointer(pname);
    }

    @Override public void nglPushDebugGroup(int source, int id, int length, long message) {
        org.lwjgl.opengles.GLES32.nglPushDebugGroup(source, id, length, message);
    }

    @Override public void glPushDebugGroup(int source, int id, ByteBuffer message) {
        org.lwjgl.opengles.GLES32.glPushDebugGroup(source, id, message);
    }

    @Override public void glPushDebugGroup(int source, int id, CharSequence message) {
        org.lwjgl.opengles.GLES32.glPushDebugGroup(source, id, message);
    }

    @Override public void glPopDebugGroup() {
        org.lwjgl.opengles.GLES32.glPopDebugGroup();
    }

    @Override public void nglObjectLabel(int identifier, int name, int length, long label) {
        org.lwjgl.opengles.GLES32.nglObjectLabel(identifier, name, length, label);
    }

    @Override public void glObjectLabel(int identifier, int name, ByteBuffer label) {
        org.lwjgl.opengles.GLES32.glObjectLabel(identifier, name, label);
    }

    @Override public void glObjectLabel(int identifier, int name, CharSequence label) {
        org.lwjgl.opengles.GLES32.glObjectLabel(identifier, name, label);
    }

    @Override public void nglGetObjectLabel(int identifier, int name, int bufSize, long length, long label) {
        org.lwjgl.opengles.GLES32.nglGetObjectLabel(identifier, name, bufSize, length, label);
    }

    @Override public void glGetObjectLabel(int identifier, int name, @Nullable IntBuffer length, ByteBuffer label) {
        org.lwjgl.opengles.GLES32.glGetObjectLabel(identifier, name, length, label);
    }

    @Override public String glGetObjectLabel(int identifier, int name, int bufSize) {
        return org.lwjgl.opengles.GLES32.glGetObjectLabel(identifier, name, bufSize);
    }

    @Override public String glGetObjectLabel(int identifier, int name) {
        return org.lwjgl.opengles.GLES32.glGetObjectLabel(identifier, name);
    }

    @Override public void glGetObjectLabel(int identifier, int name, @Nullable int[] length, ByteBuffer label) {
        org.lwjgl.opengles.GLES32.glGetObjectLabel(identifier, name, length, label);
    }

    @Override public void nglObjectPtrLabel(long ptr, int length, long label) {
        org.lwjgl.opengles.GLES32.nglObjectPtrLabel(ptr, length, label);
    }

    @Override public void glObjectPtrLabel(long ptr, ByteBuffer label) {
        org.lwjgl.opengles.GLES32.glObjectPtrLabel(ptr, label);
    }

    @Override public void glObjectPtrLabel(long ptr, CharSequence label) {
        org.lwjgl.opengles.GLES32.glObjectPtrLabel(ptr, label);
    }

    @Override public void nglGetObjectPtrLabel(long ptr, int bufSize, long length, long label) {
        org.lwjgl.opengles.GLES32.nglGetObjectPtrLabel(ptr, bufSize, length, label);
    }

    @Override public void glGetObjectPtrLabel(long ptr, @Nullable IntBuffer length, ByteBuffer label) {
        org.lwjgl.opengles.GLES32.glGetObjectPtrLabel(ptr, length, label);
    }

    @Override public String glGetObjectPtrLabel(long ptr, int bufSize) {
        return org.lwjgl.opengles.GLES32.glGetObjectPtrLabel(ptr, bufSize);
    }

    @Override public String glGetObjectPtrLabel(long ptr) {
        return org.lwjgl.opengles.GLES32.glGetObjectPtrLabel(ptr);
    }

    @Override public void glGetObjectPtrLabel(long ptr, @Nullable int[] length, ByteBuffer label) {
        org.lwjgl.opengles.GLES32.glGetObjectPtrLabel(ptr, length, label);
    }

    @Override public void glEnablei(int target, int index) {
        org.lwjgl.opengles.GLES32.glEnablei(target, index);
    }

    @Override public void glDisablei(int target, int index) {
        org.lwjgl.opengles.GLES32.glDisablei(target, index);
    }

    @Override public void glBlendEquationi(int buf, int mode) {
        org.lwjgl.opengles.GLES32.glBlendEquationi(buf, mode);
    }

    @Override public void glBlendEquationSeparatei(int buf, int modeRGB, int modeAlpha) {
        org.lwjgl.opengles.GLES32.glBlendEquationSeparatei(buf, modeRGB, modeAlpha);
    }

    @Override public void glBlendFunci(int buf, int src, int dst) {
        org.lwjgl.opengles.GLES32.glBlendFunci(buf, src, dst);
    }

    @Override public void glBlendFuncSeparatei(int buf, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha) {
        org.lwjgl.opengles.GLES32.glBlendFuncSeparatei(buf, srcRGB, dstRGB, srcAlpha, dstAlpha);
    }

    @Override public void glColorMaski(int index, boolean r, boolean g, boolean b, boolean a) {
        org.lwjgl.opengles.GLES32.glColorMaski(index, r, g, b, a);
    }

    @Override public boolean glIsEnabledi(int target, int index) {
        return org.lwjgl.opengles.GLES32.glIsEnabledi(target, index);
    }

    @Override public void nglDrawElementsBaseVertex(int mode, int count, int type, long indices, int basevertex) {
        org.lwjgl.opengles.GLES32.nglDrawElementsBaseVertex(mode, count, type, indices, basevertex);
    }

    @Override public void glDrawElementsBaseVertex(int mode, int count, int type, long indices, int basevertex) {
        org.lwjgl.opengles.GLES32.glDrawElementsBaseVertex(mode, count, type, indices, basevertex);
    }

    @Override public void glDrawElementsBaseVertex(int mode, int type, ByteBuffer indices, int basevertex) {
        org.lwjgl.opengles.GLES32.glDrawElementsBaseVertex(mode, type, indices, basevertex);
    }

    @Override public void glDrawElementsBaseVertex(int mode, ByteBuffer indices, int basevertex) {
        org.lwjgl.opengles.GLES32.glDrawElementsBaseVertex(mode, indices, basevertex);
    }

    @Override public void glDrawElementsBaseVertex(int mode, ShortBuffer indices, int basevertex) {
        org.lwjgl.opengles.GLES32.glDrawElementsBaseVertex(mode, indices, basevertex);
    }

    @Override public void glDrawElementsBaseVertex(int mode, IntBuffer indices, int basevertex) {
        org.lwjgl.opengles.GLES32.glDrawElementsBaseVertex(mode, indices, basevertex);
    }

    @Override public void nglDrawRangeElementsBaseVertex(int mode, int start, int end, int count, int type, long indices, int basevertex) {
        org.lwjgl.opengles.GLES32.nglDrawRangeElementsBaseVertex(mode, start, end, count, type, indices, basevertex);
    }

    @Override public void glDrawRangeElementsBaseVertex(int mode, int start, int end, int count, int type, long indices, int basevertex) {
        org.lwjgl.opengles.GLES32.glDrawRangeElementsBaseVertex(mode, start, end, count, type, indices, basevertex);
    }

    @Override public void glDrawRangeElementsBaseVertex(int mode, int start, int end, int type, ByteBuffer indices, int basevertex) {
        org.lwjgl.opengles.GLES32.glDrawRangeElementsBaseVertex(mode, start, end, type, indices, basevertex);
    }

    @Override public void glDrawRangeElementsBaseVertex(int mode, int start, int end, ByteBuffer indices, int basevertex) {
        org.lwjgl.opengles.GLES32.glDrawRangeElementsBaseVertex(mode, start, end, indices, basevertex);
    }

    @Override public void glDrawRangeElementsBaseVertex(int mode, int start, int end, ShortBuffer indices, int basevertex) {
        org.lwjgl.opengles.GLES32.glDrawRangeElementsBaseVertex(mode, start, end, indices, basevertex);
    }

    @Override public void glDrawRangeElementsBaseVertex(int mode, int start, int end, IntBuffer indices, int basevertex) {
        org.lwjgl.opengles.GLES32.glDrawRangeElementsBaseVertex(mode, start, end, indices, basevertex);
    }

    @Override public void nglDrawElementsInstancedBaseVertex(int mode, int count, int type, long indices, int instancecount, int basevertex) {
        org.lwjgl.opengles.GLES32.nglDrawElementsInstancedBaseVertex(mode, count, type, indices, instancecount, basevertex);
    }

    @Override public void glDrawElementsInstancedBaseVertex(int mode, int count, int type, long indices, int instancecount, int basevertex) {
        org.lwjgl.opengles.GLES32.glDrawElementsInstancedBaseVertex(mode, count, type, indices, instancecount, basevertex);
    }

    @Override public void glDrawElementsInstancedBaseVertex(int mode, int type, ByteBuffer indices, int instancecount, int basevertex) {
        org.lwjgl.opengles.GLES32.glDrawElementsInstancedBaseVertex(mode, type, indices, instancecount, basevertex);
    }

    @Override public void glDrawElementsInstancedBaseVertex(int mode, ByteBuffer indices, int instancecount, int basevertex) {
        org.lwjgl.opengles.GLES32.glDrawElementsInstancedBaseVertex(mode, indices, instancecount, basevertex);
    }

    @Override public void glDrawElementsInstancedBaseVertex(int mode, ShortBuffer indices, int instancecount, int basevertex) {
        org.lwjgl.opengles.GLES32.glDrawElementsInstancedBaseVertex(mode, indices, instancecount, basevertex);
    }

    @Override public void glDrawElementsInstancedBaseVertex(int mode, IntBuffer indices, int instancecount, int basevertex) {
        org.lwjgl.opengles.GLES32.glDrawElementsInstancedBaseVertex(mode, indices, instancecount, basevertex);
    }

    @Override public void glFramebufferTexture(int target, int attachment, int texture, int level) {
        org.lwjgl.opengles.GLES32.glFramebufferTexture(target, attachment, texture, level);
    }

    @Override public void glPrimitiveBoundingBox(float minX, float minY, float minZ, float minW, float maxX, float maxY, float maxZ, float maxW) {
        org.lwjgl.opengles.GLES32.glPrimitiveBoundingBox(minX, minY, minZ, minW, maxX, maxY, maxZ, maxW);
    }

    @Override public int glGetGraphicsResetStatus() {
        return org.lwjgl.opengles.GLES32.glGetGraphicsResetStatus();
    }

    @Override public void nglReadnPixels(int x, int y, int width, int height, int format, int type, int bufSize, long pixels) {
        org.lwjgl.opengles.GLES32.nglReadnPixels(x, y, width, height, format, type, bufSize, pixels);
    }

    @Override public void glReadnPixels(int x, int y, int width, int height, int format, int type, int bufSize, long pixels) {
        org.lwjgl.opengles.GLES32.glReadnPixels(x, y, width, height, format, type, bufSize, pixels);
    }

    @Override public void glReadnPixels(int x, int y, int width, int height, int format, int type, ByteBuffer pixels) {
        org.lwjgl.opengles.GLES32.glReadnPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadnPixels(int x, int y, int width, int height, int format, int type, ShortBuffer pixels) {
        org.lwjgl.opengles.GLES32.glReadnPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadnPixels(int x, int y, int width, int height, int format, int type, IntBuffer pixels) {
        org.lwjgl.opengles.GLES32.glReadnPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadnPixels(int x, int y, int width, int height, int format, int type, FloatBuffer pixels) {
        org.lwjgl.opengles.GLES32.glReadnPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadnPixels(int x, int y, int width, int height, int format, int type, short[] pixels) {
        org.lwjgl.opengles.GLES32.glReadnPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadnPixels(int x, int y, int width, int height, int format, int type, int[] pixels) {
        org.lwjgl.opengles.GLES32.glReadnPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void glReadnPixels(int x, int y, int width, int height, int format, int type, float[] pixels) {
        org.lwjgl.opengles.GLES32.glReadnPixels(x, y, width, height, format, type, pixels);
    }

    @Override public void nglGetnUniformfv(int program, int location, int bufSize, long params) {
        org.lwjgl.opengles.GLES32.nglGetnUniformfv(program, location, bufSize, params);
    }

    @Override public void glGetnUniformfv(int program, int location, FloatBuffer params) {
        org.lwjgl.opengles.GLES32.glGetnUniformfv(program, location, params);
    }

    @Override public void glGetnUniformfv(int program, int location, float[] params) {
        org.lwjgl.opengles.GLES32.glGetnUniformfv(program, location, params);
    }

    @Override public float glGetnUniformf(int program, int location) {
        return org.lwjgl.opengles.GLES32.glGetnUniformf(program, location);
    }

    @Override public void nglGetnUniformiv(int program, int location, int bufSize, long params) {
        org.lwjgl.opengles.GLES32.nglGetnUniformiv(program, location, bufSize, params);
    }

    @Override public void glGetnUniformiv(int program, int location, FloatBuffer params) {
        org.lwjgl.opengles.GLES32.glGetnUniformiv(program, location, params);
    }

    @Override public void glGetnUniformiv(int program, int location, float[] params) {
        org.lwjgl.opengles.GLES32.glGetnUniformiv(program, location, params);
    }

    @Override public float glGetnUniformi(int program, int location) {
        return org.lwjgl.opengles.GLES32.glGetnUniformi(program, location);
    }

    @Override public void nglGetnUniformuiv(int program, int location, int bufSize, long params) {
        org.lwjgl.opengles.GLES32.nglGetnUniformuiv(program, location, bufSize, params);
    }

    @Override public void glGetnUniformuiv(int program, int location, FloatBuffer params) {
        org.lwjgl.opengles.GLES32.glGetnUniformuiv(program, location, params);
    }

    @Override public void glGetnUniformuiv(int program, int location, float[] params) {
        org.lwjgl.opengles.GLES32.glGetnUniformuiv(program, location, params);
    }

    @Override public float glGetnUniformui(int program, int location) {
        return org.lwjgl.opengles.GLES32.glGetnUniformui(program, location);
    }

    @Override public void glMinSampleShading(float value) {
        org.lwjgl.opengles.GLES32.glMinSampleShading(value);
    }

    @Override public void glPatchParameteri(int pname, int value) {
        org.lwjgl.opengles.GLES32.glPatchParameteri(pname, value);
    }

    @Override public void nglTexParameterIiv(int target, int pname, long params) {
        org.lwjgl.opengles.GLES32.nglTexParameterIiv(target, pname, params);
    }

    @Override public void glTexParameterIiv(int target, int pname, IntBuffer params) {
        org.lwjgl.opengles.GLES32.glTexParameterIiv(target, pname, params);
    }

    @Override public void glTexParameterIiv(int target, int pname, int[] params) {
        org.lwjgl.opengles.GLES32.glTexParameterIiv(target, pname, params);
    }

    @Override public void glTexParameterIi(int target, int pname, int param) {
        org.lwjgl.opengles.GLES32.glTexParameterIi(target, pname, param);
    }

    @Override public void nglTexParameterIuiv(int target, int pname, long params) {
        org.lwjgl.opengles.GLES32.nglTexParameterIuiv(target, pname, params);
    }

    @Override public void glTexParameterIuiv(int target, int pname, IntBuffer params) {
        org.lwjgl.opengles.GLES32.glTexParameterIuiv(target, pname, params);
    }

    @Override public void glTexParameterIuiv(int target, int pname, int[] params) {
        org.lwjgl.opengles.GLES32.glTexParameterIuiv(target, pname, params);
    }

    @Override public void glTexParameterIui(int target, int pname, int param) {
        org.lwjgl.opengles.GLES32.glTexParameterIui(target, pname, param);
    }

    @Override public void nglGetTexParameterIiv(int target, int pname, long params) {
        org.lwjgl.opengles.GLES32.nglGetTexParameterIiv(target, pname, params);
    }

    @Override public void glGetTexParameterIiv(int target, int pname, IntBuffer params) {
        org.lwjgl.opengles.GLES32.glGetTexParameterIiv(target, pname, params);
    }

    @Override public void glGetTexParameterIiv(int target, int pname, int[] params) {
        org.lwjgl.opengles.GLES32.glGetTexParameterIiv(target, pname, params);
    }

    @Override public int glGetTexParameterIi(int target, int pname) {
        return org.lwjgl.opengles.GLES32.glGetTexParameterIi(target, pname);
    }

    @Override public void nglGetTexParameterIuiv(int target, int pname, long params) {
        org.lwjgl.opengles.GLES32.nglGetTexParameterIuiv(target, pname, params);
    }

    @Override public void glGetTexParameterIuiv(int target, int pname, IntBuffer params) {
        org.lwjgl.opengles.GLES32.glGetTexParameterIuiv(target, pname, params);
    }

    @Override public void glGetTexParameterIuiv(int target, int pname, int[] params) {
        org.lwjgl.opengles.GLES32.glGetTexParameterIuiv(target, pname, params);
    }

    @Override public int glGetTexParameterIui(int target, int pname) {
        return org.lwjgl.opengles.GLES32.glGetTexParameterIui(target, pname);
    }

    @Override public void nglSamplerParameterIiv(int sampler, int pname, long params) {
        org.lwjgl.opengles.GLES32.nglSamplerParameterIiv(sampler, pname, params);
    }

    @Override public void glSamplerParameterIiv(int sampler, int pname, IntBuffer params) {
        org.lwjgl.opengles.GLES32.glSamplerParameterIiv(sampler, pname, params);
    }

    @Override public void glSamplerParameterIiv(int sampler, int pname, int[] params) {
        org.lwjgl.opengles.GLES32.glSamplerParameterIiv(sampler, pname, params);
    }

    @Override public void glSamplerParameterIi(int sampler, int pname, int param) {
        org.lwjgl.opengles.GLES32.glSamplerParameterIi(sampler, pname, param);
    }

    @Override public void nglSamplerParameterIuiv(int sampler, int pname, long params) {
        org.lwjgl.opengles.GLES32.nglSamplerParameterIuiv(sampler, pname, params);
    }

    @Override public void glSamplerParameterIuiv(int sampler, int pname, IntBuffer params) {
        org.lwjgl.opengles.GLES32.glSamplerParameterIuiv(sampler, pname, params);
    }

    @Override public void glSamplerParameterIuiv(int sampler, int pname, int[] params) {
        org.lwjgl.opengles.GLES32.glSamplerParameterIuiv(sampler, pname, params);
    }

    @Override public void glSamplerParameterIui(int sampler, int pname, int param) {
        org.lwjgl.opengles.GLES32.glSamplerParameterIui(sampler, pname, param);
    }

    @Override public void nglGetSamplerParameterIiv(int sampler, int pname, long params) {
        org.lwjgl.opengles.GLES32.nglGetSamplerParameterIiv(sampler, pname, params);
    }

    @Override public void glGetSamplerParameterIiv(int sampler, int pname, IntBuffer params) {
        org.lwjgl.opengles.GLES32.glGetSamplerParameterIiv(sampler, pname, params);
    }

    @Override public void glGetSamplerParameterIiv(int sampler, int pname, int[] params) {
        org.lwjgl.opengles.GLES32.glGetSamplerParameterIiv(sampler, pname, params);
    }

    @Override public int glGetSamplerParameterIi(int sampler, int pname) {
        return org.lwjgl.opengles.GLES32.glGetSamplerParameterIi(sampler, pname);
    }

    @Override public void nglGetSamplerParameterIuiv(int sampler, int pname, long params) {
        org.lwjgl.opengles.GLES32.nglGetSamplerParameterIuiv(sampler, pname, params);
    }

    @Override public void glGetSamplerParameterIuiv(int sampler, int pname, IntBuffer params) {
        org.lwjgl.opengles.GLES32.glGetSamplerParameterIuiv(sampler, pname, params);
    }

    @Override public void glGetSamplerParameterIuiv(int sampler, int pname, int[] params) {
        org.lwjgl.opengles.GLES32.glGetSamplerParameterIuiv(sampler, pname, params);
    }

    @Override public int glGetSamplerParameterIui(int sampler, int pname) {
        return org.lwjgl.opengles.GLES32.glGetSamplerParameterIui(sampler, pname);
    }

    @Override public void glTexBuffer(int target, int internalformat, int buffer) {
        org.lwjgl.opengles.GLES32.glTexBuffer(target, internalformat, buffer);
    }

    @Override public void glTexBufferRange(int target, int internalformat, int buffer, long offset, long size) {
        org.lwjgl.opengles.GLES32.glTexBufferRange(target, internalformat, buffer, offset, size);
    }

    @Override public void glTexStorage3DMultisample(int target, int samples, int internalformat, int width, int height, int depth, boolean fixedsamplelocations) {
        org.lwjgl.opengles.GLES32.glTexStorage3DMultisample(target, samples, internalformat, width, height, depth, fixedsamplelocations);
    }

}
