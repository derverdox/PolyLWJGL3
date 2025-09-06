package de.verdox.polylwjgl3.gl.accessor.gl32;

import de.verdox.polylwjgl3.gl.accessor.gl31.GL31Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl31.GL31AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL32;
import org.lwjgl.system.*;

public class GL32AccessorImpl extends GL31AccessorImpl implements GL32Accessor {

    @Override public void nglGetBufferParameteri64v(int target, int pname, long params) {
        org.lwjgl.opengl.GL32.nglGetBufferParameteri64v(target, pname, params);
    }

    @Override public void glGetBufferParameteri64v(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint64 *") LongBuffer params) {
        org.lwjgl.opengl.GL32.glGetBufferParameteri64v(target, pname, params);
    }

    @Override public void glGetBufferParameteri64v(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint64 *") long[] params) {
        org.lwjgl.opengl.GL32.glGetBufferParameteri64v(target, pname, params);
    }

@NativeType("void")
    @Override public long glGetBufferParameteri64(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL32.glGetBufferParameteri64(target, pname);
    }

    @Override public void nglDrawElementsBaseVertex(int mode, int count, int type, long indices, int basevertex) {
        org.lwjgl.opengl.GL32.nglDrawElementsBaseVertex(mode, count, type, indices, basevertex);
    }

    @Override public void glDrawElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLint") int basevertex) {
        org.lwjgl.opengl.GL32.glDrawElementsBaseVertex(mode, count, type, indices, basevertex);
    }

    @Override public void glDrawElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLint") int basevertex) {
        org.lwjgl.opengl.GL32.glDrawElementsBaseVertex(mode, type, indices, basevertex);
    }

    @Override public void glDrawElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices, @NativeType("GLint") int basevertex) {
        org.lwjgl.opengl.GL32.glDrawElementsBaseVertex(mode, indices, basevertex);
    }

    @Override public void glDrawElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices, @NativeType("GLint") int basevertex) {
        org.lwjgl.opengl.GL32.glDrawElementsBaseVertex(mode, indices, basevertex);
    }

    @Override public void glDrawElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices, @NativeType("GLint") int basevertex) {
        org.lwjgl.opengl.GL32.glDrawElementsBaseVertex(mode, indices, basevertex);
    }

    @Override public void nglDrawRangeElementsBaseVertex(int mode, int start, int end, int count, int type, long indices, int basevertex) {
        org.lwjgl.opengl.GL32.nglDrawRangeElementsBaseVertex(mode, start, end, count, type, indices, basevertex);
    }

    @Override public void glDrawRangeElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLint") int basevertex) {
        org.lwjgl.opengl.GL32.glDrawRangeElementsBaseVertex(mode, start, end, count, type, indices, basevertex);
    }

    @Override public void glDrawRangeElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLint") int basevertex) {
        org.lwjgl.opengl.GL32.glDrawRangeElementsBaseVertex(mode, start, end, type, indices, basevertex);
    }

    @Override public void glDrawRangeElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("void const *") ByteBuffer indices, @NativeType("GLint") int basevertex) {
        org.lwjgl.opengl.GL32.glDrawRangeElementsBaseVertex(mode, start, end, indices, basevertex);
    }

    @Override public void glDrawRangeElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("void const *") ShortBuffer indices, @NativeType("GLint") int basevertex) {
        org.lwjgl.opengl.GL32.glDrawRangeElementsBaseVertex(mode, start, end, indices, basevertex);
    }

    @Override public void glDrawRangeElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("void const *") IntBuffer indices, @NativeType("GLint") int basevertex) {
        org.lwjgl.opengl.GL32.glDrawRangeElementsBaseVertex(mode, start, end, indices, basevertex);
    }

    @Override public void nglDrawElementsInstancedBaseVertex(int mode, int count, int type, long indices, int primcount, int basevertex) {
        org.lwjgl.opengl.GL32.nglDrawElementsInstancedBaseVertex(mode, count, type, indices, primcount, basevertex);
    }

    @Override public void glDrawElementsInstancedBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLsizei") int primcount, @NativeType("GLint") int basevertex) {
        org.lwjgl.opengl.GL32.glDrawElementsInstancedBaseVertex(mode, count, type, indices, primcount, basevertex);
    }

    @Override public void glDrawElementsInstancedBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLint") int basevertex) {
        org.lwjgl.opengl.GL32.glDrawElementsInstancedBaseVertex(mode, type, indices, primcount, basevertex);
    }

    @Override public void glDrawElementsInstancedBaseVertex(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLint") int basevertex) {
        org.lwjgl.opengl.GL32.glDrawElementsInstancedBaseVertex(mode, indices, primcount, basevertex);
    }

    @Override public void glDrawElementsInstancedBaseVertex(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLint") int basevertex) {
        org.lwjgl.opengl.GL32.glDrawElementsInstancedBaseVertex(mode, indices, primcount, basevertex);
    }

    @Override public void glDrawElementsInstancedBaseVertex(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLint") int basevertex) {
        org.lwjgl.opengl.GL32.glDrawElementsInstancedBaseVertex(mode, indices, primcount, basevertex);
    }

    @Override public void nglMultiDrawElementsBaseVertex(int mode, long count, int type, long indices, int drawcount, long basevertex) {
        org.lwjgl.opengl.GL32.nglMultiDrawElementsBaseVertex(mode, count, type, indices, drawcount, basevertex);
    }

    @Override public void glMultiDrawElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLsizei const *") IntBuffer count, @NativeType("GLenum") int type, @NativeType("void const * const *") PointerBuffer indices, @NativeType("GLint *") IntBuffer basevertex) {
        org.lwjgl.opengl.GL32.glMultiDrawElementsBaseVertex(mode, count, type, indices, basevertex);
    }

    @Override public void glMultiDrawElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLsizei const *") int[] count, @NativeType("GLenum") int type, @NativeType("void const * const *") PointerBuffer indices, @NativeType("GLint *") int[] basevertex) {
        org.lwjgl.opengl.GL32.glMultiDrawElementsBaseVertex(mode, count, type, indices, basevertex);
    }

    @Override public void glProvokingVertex(@NativeType("GLenum") int mode) {
        org.lwjgl.opengl.GL32.glProvokingVertex(mode);
    }

    @Override public void glTexImage2DMultisample(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLboolean") boolean fixedsamplelocations) {
        org.lwjgl.opengl.GL32.glTexImage2DMultisample(target, samples, internalformat, width, height, fixedsamplelocations);
    }

    @Override public void glTexImage3DMultisample(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLboolean") boolean fixedsamplelocations) {
        org.lwjgl.opengl.GL32.glTexImage3DMultisample(target, samples, internalformat, width, height, depth, fixedsamplelocations);
    }

    @Override public void nglGetMultisamplefv(int pname, int index, long val) {
        org.lwjgl.opengl.GL32.nglGetMultisamplefv(pname, index, val);
    }

    @Override public void glGetMultisamplefv(@NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLfloat *") FloatBuffer val) {
        org.lwjgl.opengl.GL32.glGetMultisamplefv(pname, index, val);
    }

    @Override public void glGetMultisamplefv(@NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLfloat *") float[] val) {
        org.lwjgl.opengl.GL32.glGetMultisamplefv(pname, index, val);
    }

@NativeType("void")
    @Override public float glGetMultisamplef(@NativeType("GLenum") int pname, @NativeType("GLuint") int index) {
        return org.lwjgl.opengl.GL32.glGetMultisamplef(pname, index);
    }

    @Override public void glSampleMaski(@NativeType("GLuint") int index, @NativeType("GLbitfield") int mask) {
        org.lwjgl.opengl.GL32.glSampleMaski(index, mask);
    }

    @Override public void glFramebufferTexture(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level) {
        org.lwjgl.opengl.GL32.glFramebufferTexture(target, attachment, texture, level);
    }

@NativeType("GLsync")
    @Override public long glFenceSync(@NativeType("GLenum") int condition, @NativeType("GLbitfield") int flags) {
        return org.lwjgl.opengl.GL32.glFenceSync(condition, flags);
    }

    @Override public boolean nglIsSync(long sync) {
        return org.lwjgl.opengl.GL32.nglIsSync(sync);
    }

@NativeType("GLboolean")
    @Override public boolean glIsSync(@NativeType("GLsync") long sync) {
        return org.lwjgl.opengl.GL32.glIsSync(sync);
    }

    @Override public void nglDeleteSync(long sync) {
        org.lwjgl.opengl.GL32.nglDeleteSync(sync);
    }

    @Override public void glDeleteSync(@NativeType("GLsync") long sync) {
        org.lwjgl.opengl.GL32.glDeleteSync(sync);
    }

    @Override public int nglClientWaitSync(long sync, int flags, long timeout) {
        return org.lwjgl.opengl.GL32.nglClientWaitSync(sync, flags, timeout);
    }

@NativeType("GLenum")
    @Override public int glClientWaitSync(@NativeType("GLsync") long sync, @NativeType("GLbitfield") int flags, @NativeType("GLuint64") long timeout) {
        return org.lwjgl.opengl.GL32.glClientWaitSync(sync, flags, timeout);
    }

    @Override public void nglWaitSync(long sync, int flags, long timeout) {
        org.lwjgl.opengl.GL32.nglWaitSync(sync, flags, timeout);
    }

    @Override public void glWaitSync(@NativeType("GLsync") long sync, @NativeType("GLbitfield") int flags, @NativeType("GLuint64") long timeout) {
        org.lwjgl.opengl.GL32.glWaitSync(sync, flags, timeout);
    }

    @Override public void nglGetInteger64v(int pname, long params) {
        org.lwjgl.opengl.GL32.nglGetInteger64v(pname, params);
    }

    @Override public void glGetInteger64v(@NativeType("GLenum") int pname, @NativeType("GLint64 *") LongBuffer params) {
        org.lwjgl.opengl.GL32.glGetInteger64v(pname, params);
    }

    @Override public void glGetInteger64v(@NativeType("GLenum") int pname, @NativeType("GLint64 *") long[] params) {
        org.lwjgl.opengl.GL32.glGetInteger64v(pname, params);
    }

@NativeType("void")
    @Override public long glGetInteger64(@NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL32.glGetInteger64(pname);
    }

    @Override public void nglGetInteger64i_v(int pname, int index, long params) {
        org.lwjgl.opengl.GL32.nglGetInteger64i_v(pname, index, params);
    }

    @Override public void glGetInteger64i_v(@NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLint64 *") LongBuffer params) {
        org.lwjgl.opengl.GL32.glGetInteger64i_v(pname, index, params);
    }

    @Override public void glGetInteger64i_v(@NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLint64 *") long[] params) {
        org.lwjgl.opengl.GL32.glGetInteger64i_v(pname, index, params);
    }

@NativeType("void")
    @Override public long glGetInteger64i(@NativeType("GLenum") int pname, @NativeType("GLuint") int index) {
        return org.lwjgl.opengl.GL32.glGetInteger64i(pname, index);
    }

    @Override public void nglGetSynciv(long sync, int pname, int bufSize, long length, long values) {
        org.lwjgl.opengl.GL32.nglGetSynciv(sync, pname, bufSize, length, values);
    }

    @Override public void glGetSynciv(@NativeType("GLsync") long sync, @NativeType("GLenum") int pname, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLint *") IntBuffer values) {
        org.lwjgl.opengl.GL32.glGetSynciv(sync, pname, length, values);
    }

    @Override public void glGetSynciv(@NativeType("GLsync") long sync, @NativeType("GLenum") int pname, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLint *") int[] values) {
        org.lwjgl.opengl.GL32.glGetSynciv(sync, pname, length, values);
    }

@NativeType("void")
    @Override public int glGetSynci(@NativeType("GLsync") long sync, @NativeType("GLenum") int pname, @Nullable @NativeType("GLsizei *") IntBuffer length) {
        return org.lwjgl.opengl.GL32.glGetSynci(sync, pname, length);
    }

}
