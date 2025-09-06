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

    @Override public void glGetBufferParameteri64v(int target, int pname, LongBuffer params) {
        org.lwjgl.opengl.GL32.glGetBufferParameteri64v(target, pname, params);
    }

    @Override public void glGetBufferParameteri64v(int target, int pname, long[] params) {
        org.lwjgl.opengl.GL32.glGetBufferParameteri64v(target, pname, params);
    }

    @Override public long glGetBufferParameteri64(int target, int pname) {
        return org.lwjgl.opengl.GL32.glGetBufferParameteri64(target, pname);
    }

    @Override public void nglDrawElementsBaseVertex(int mode, int count, int type, long indices, int basevertex) {
        org.lwjgl.opengl.GL32.nglDrawElementsBaseVertex(mode, count, type, indices, basevertex);
    }

    @Override public void glDrawElementsBaseVertex(int mode, int count, int type, long indices, int basevertex) {
        org.lwjgl.opengl.GL32.glDrawElementsBaseVertex(mode, count, type, indices, basevertex);
    }

    @Override public void glDrawElementsBaseVertex(int mode, int type, ByteBuffer indices, int basevertex) {
        org.lwjgl.opengl.GL32.glDrawElementsBaseVertex(mode, type, indices, basevertex);
    }

    @Override public void glDrawElementsBaseVertex(int mode, ByteBuffer indices, int basevertex) {
        org.lwjgl.opengl.GL32.glDrawElementsBaseVertex(mode, indices, basevertex);
    }

    @Override public void glDrawElementsBaseVertex(int mode, ShortBuffer indices, int basevertex) {
        org.lwjgl.opengl.GL32.glDrawElementsBaseVertex(mode, indices, basevertex);
    }

    @Override public void glDrawElementsBaseVertex(int mode, IntBuffer indices, int basevertex) {
        org.lwjgl.opengl.GL32.glDrawElementsBaseVertex(mode, indices, basevertex);
    }

    @Override public void nglDrawRangeElementsBaseVertex(int mode, int start, int end, int count, int type, long indices, int basevertex) {
        org.lwjgl.opengl.GL32.nglDrawRangeElementsBaseVertex(mode, start, end, count, type, indices, basevertex);
    }

    @Override public void glDrawRangeElementsBaseVertex(int mode, int start, int end, int count, int type, long indices, int basevertex) {
        org.lwjgl.opengl.GL32.glDrawRangeElementsBaseVertex(mode, start, end, count, type, indices, basevertex);
    }

    @Override public void glDrawRangeElementsBaseVertex(int mode, int start, int end, int type, ByteBuffer indices, int basevertex) {
        org.lwjgl.opengl.GL32.glDrawRangeElementsBaseVertex(mode, start, end, type, indices, basevertex);
    }

    @Override public void glDrawRangeElementsBaseVertex(int mode, int start, int end, ByteBuffer indices, int basevertex) {
        org.lwjgl.opengl.GL32.glDrawRangeElementsBaseVertex(mode, start, end, indices, basevertex);
    }

    @Override public void glDrawRangeElementsBaseVertex(int mode, int start, int end, ShortBuffer indices, int basevertex) {
        org.lwjgl.opengl.GL32.glDrawRangeElementsBaseVertex(mode, start, end, indices, basevertex);
    }

    @Override public void glDrawRangeElementsBaseVertex(int mode, int start, int end, IntBuffer indices, int basevertex) {
        org.lwjgl.opengl.GL32.glDrawRangeElementsBaseVertex(mode, start, end, indices, basevertex);
    }

    @Override public void nglDrawElementsInstancedBaseVertex(int mode, int count, int type, long indices, int primcount, int basevertex) {
        org.lwjgl.opengl.GL32.nglDrawElementsInstancedBaseVertex(mode, count, type, indices, primcount, basevertex);
    }

    @Override public void glDrawElementsInstancedBaseVertex(int mode, int count, int type, long indices, int primcount, int basevertex) {
        org.lwjgl.opengl.GL32.glDrawElementsInstancedBaseVertex(mode, count, type, indices, primcount, basevertex);
    }

    @Override public void glDrawElementsInstancedBaseVertex(int mode, int type, ByteBuffer indices, int primcount, int basevertex) {
        org.lwjgl.opengl.GL32.glDrawElementsInstancedBaseVertex(mode, type, indices, primcount, basevertex);
    }

    @Override public void glDrawElementsInstancedBaseVertex(int mode, ByteBuffer indices, int primcount, int basevertex) {
        org.lwjgl.opengl.GL32.glDrawElementsInstancedBaseVertex(mode, indices, primcount, basevertex);
    }

    @Override public void glDrawElementsInstancedBaseVertex(int mode, ShortBuffer indices, int primcount, int basevertex) {
        org.lwjgl.opengl.GL32.glDrawElementsInstancedBaseVertex(mode, indices, primcount, basevertex);
    }

    @Override public void glDrawElementsInstancedBaseVertex(int mode, IntBuffer indices, int primcount, int basevertex) {
        org.lwjgl.opengl.GL32.glDrawElementsInstancedBaseVertex(mode, indices, primcount, basevertex);
    }

    @Override public void nglMultiDrawElementsBaseVertex(int mode, long count, int type, long indices, int drawcount, long basevertex) {
        org.lwjgl.opengl.GL32.nglMultiDrawElementsBaseVertex(mode, count, type, indices, drawcount, basevertex);
    }

    @Override public void glMultiDrawElementsBaseVertex(int mode, IntBuffer count, int type, PointerBuffer indices, IntBuffer basevertex) {
        org.lwjgl.opengl.GL32.glMultiDrawElementsBaseVertex(mode, count, type, indices, basevertex);
    }

    @Override public void glMultiDrawElementsBaseVertex(int mode, int[] count, int type, PointerBuffer indices, int[] basevertex) {
        org.lwjgl.opengl.GL32.glMultiDrawElementsBaseVertex(mode, count, type, indices, basevertex);
    }

    @Override public void glProvokingVertex(int mode) {
        org.lwjgl.opengl.GL32.glProvokingVertex(mode);
    }

    @Override public void glTexImage2DMultisample(int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations) {
        org.lwjgl.opengl.GL32.glTexImage2DMultisample(target, samples, internalformat, width, height, fixedsamplelocations);
    }

    @Override public void glTexImage3DMultisample(int target, int samples, int internalformat, int width, int height, int depth, boolean fixedsamplelocations) {
        org.lwjgl.opengl.GL32.glTexImage3DMultisample(target, samples, internalformat, width, height, depth, fixedsamplelocations);
    }

    @Override public void nglGetMultisamplefv(int pname, int index, long val) {
        org.lwjgl.opengl.GL32.nglGetMultisamplefv(pname, index, val);
    }

    @Override public void glGetMultisamplefv(int pname, int index, FloatBuffer val) {
        org.lwjgl.opengl.GL32.glGetMultisamplefv(pname, index, val);
    }

    @Override public void glGetMultisamplefv(int pname, int index, float[] val) {
        org.lwjgl.opengl.GL32.glGetMultisamplefv(pname, index, val);
    }

    @Override public float glGetMultisamplef(int pname, int index) {
        return org.lwjgl.opengl.GL32.glGetMultisamplef(pname, index);
    }

    @Override public void glSampleMaski(int index, int mask) {
        org.lwjgl.opengl.GL32.glSampleMaski(index, mask);
    }

    @Override public void glFramebufferTexture(int target, int attachment, int texture, int level) {
        org.lwjgl.opengl.GL32.glFramebufferTexture(target, attachment, texture, level);
    }

    @Override public long glFenceSync(int condition, int flags) {
        return org.lwjgl.opengl.GL32.glFenceSync(condition, flags);
    }

    @Override public boolean nglIsSync(long sync) {
        return org.lwjgl.opengl.GL32.nglIsSync(sync);
    }

    @Override public boolean glIsSync(long sync) {
        return org.lwjgl.opengl.GL32.glIsSync(sync);
    }

    @Override public void nglDeleteSync(long sync) {
        org.lwjgl.opengl.GL32.nglDeleteSync(sync);
    }

    @Override public void glDeleteSync(long sync) {
        org.lwjgl.opengl.GL32.glDeleteSync(sync);
    }

    @Override public int nglClientWaitSync(long sync, int flags, long timeout) {
        return org.lwjgl.opengl.GL32.nglClientWaitSync(sync, flags, timeout);
    }

    @Override public int glClientWaitSync(long sync, int flags, long timeout) {
        return org.lwjgl.opengl.GL32.glClientWaitSync(sync, flags, timeout);
    }

    @Override public void nglWaitSync(long sync, int flags, long timeout) {
        org.lwjgl.opengl.GL32.nglWaitSync(sync, flags, timeout);
    }

    @Override public void glWaitSync(long sync, int flags, long timeout) {
        org.lwjgl.opengl.GL32.glWaitSync(sync, flags, timeout);
    }

    @Override public void nglGetInteger64v(int pname, long params) {
        org.lwjgl.opengl.GL32.nglGetInteger64v(pname, params);
    }

    @Override public void glGetInteger64v(int pname, LongBuffer params) {
        org.lwjgl.opengl.GL32.glGetInteger64v(pname, params);
    }

    @Override public void glGetInteger64v(int pname, long[] params) {
        org.lwjgl.opengl.GL32.glGetInteger64v(pname, params);
    }

    @Override public long glGetInteger64(int pname) {
        return org.lwjgl.opengl.GL32.glGetInteger64(pname);
    }

    @Override public void nglGetInteger64i_v(int pname, int index, long params) {
        org.lwjgl.opengl.GL32.nglGetInteger64i_v(pname, index, params);
    }

    @Override public void glGetInteger64i_v(int pname, int index, LongBuffer params) {
        org.lwjgl.opengl.GL32.glGetInteger64i_v(pname, index, params);
    }

    @Override public void glGetInteger64i_v(int pname, int index, long[] params) {
        org.lwjgl.opengl.GL32.glGetInteger64i_v(pname, index, params);
    }

    @Override public long glGetInteger64i(int pname, int index) {
        return org.lwjgl.opengl.GL32.glGetInteger64i(pname, index);
    }

    @Override public void nglGetSynciv(long sync, int pname, int bufSize, long length, long values) {
        org.lwjgl.opengl.GL32.nglGetSynciv(sync, pname, bufSize, length, values);
    }

    @Override public void glGetSynciv(long sync, int pname, @Nullable IntBuffer length, IntBuffer values) {
        org.lwjgl.opengl.GL32.glGetSynciv(sync, pname, length, values);
    }

    @Override public void glGetSynciv(long sync, int pname, @Nullable int[] length, int[] values) {
        org.lwjgl.opengl.GL32.glGetSynciv(sync, pname, length, values);
    }

    @Override public int glGetSynci(long sync, int pname, @Nullable IntBuffer length) {
        return org.lwjgl.opengl.GL32.glGetSynci(sync, pname, length);
    }

}
