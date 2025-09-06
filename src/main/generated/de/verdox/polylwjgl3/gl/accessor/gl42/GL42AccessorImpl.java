package de.verdox.polylwjgl3.gl.accessor.gl42;

import de.verdox.polylwjgl3.gl.accessor.gl41.GL41Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl41.GL41AccessorImpl;
import java.nio.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL42;
import org.lwjgl.system.*;

public class GL42AccessorImpl extends GL41AccessorImpl implements GL42Accessor {

    @Override public void nglGetActiveAtomicCounterBufferiv(int program, int bufferIndex, int pname, long params) {
        org.lwjgl.opengl.GL42.nglGetActiveAtomicCounterBufferiv(program, bufferIndex, pname, params);
    }

    @Override public void glGetActiveAtomicCounterBufferiv(int program, int bufferIndex, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL42.glGetActiveAtomicCounterBufferiv(program, bufferIndex, pname, params);
    }

    @Override public void glGetActiveAtomicCounterBufferiv(int program, int bufferIndex, int pname, int[] params) {
        org.lwjgl.opengl.GL42.glGetActiveAtomicCounterBufferiv(program, bufferIndex, pname, params);
    }

    @Override public int glGetActiveAtomicCounterBufferi(int program, int bufferIndex, int pname) {
        return org.lwjgl.opengl.GL42.glGetActiveAtomicCounterBufferi(program, bufferIndex, pname);
    }

    @Override public void glTexStorage1D(int target, int levels, int internalformat, int width) {
        org.lwjgl.opengl.GL42.glTexStorage1D(target, levels, internalformat, width);
    }

    @Override public void glTexStorage2D(int target, int levels, int internalformat, int width, int height) {
        org.lwjgl.opengl.GL42.glTexStorage2D(target, levels, internalformat, width, height);
    }

    @Override public void glTexStorage3D(int target, int levels, int internalformat, int width, int height, int depth) {
        org.lwjgl.opengl.GL42.glTexStorage3D(target, levels, internalformat, width, height, depth);
    }

    @Override public void glDrawTransformFeedbackInstanced(int mode, int id, int primcount) {
        org.lwjgl.opengl.GL42.glDrawTransformFeedbackInstanced(mode, id, primcount);
    }

    @Override public void glDrawTransformFeedbackStreamInstanced(int mode, int id, int stream, int primcount) {
        org.lwjgl.opengl.GL42.glDrawTransformFeedbackStreamInstanced(mode, id, stream, primcount);
    }

    @Override public void glDrawArraysInstancedBaseInstance(int mode, int first, int count, int primcount, int baseinstance) {
        org.lwjgl.opengl.GL42.glDrawArraysInstancedBaseInstance(mode, first, count, primcount, baseinstance);
    }

    @Override public void nglDrawElementsInstancedBaseInstance(int mode, int count, int type, long indices, int primcount, int baseinstance) {
        org.lwjgl.opengl.GL42.nglDrawElementsInstancedBaseInstance(mode, count, type, indices, primcount, baseinstance);
    }

    @Override public void glDrawElementsInstancedBaseInstance(int mode, int count, int type, long indices, int primcount, int baseinstance) {
        org.lwjgl.opengl.GL42.glDrawElementsInstancedBaseInstance(mode, count, type, indices, primcount, baseinstance);
    }

    @Override public void glDrawElementsInstancedBaseInstance(int mode, int type, ByteBuffer indices, int primcount, int baseinstance) {
        org.lwjgl.opengl.GL42.glDrawElementsInstancedBaseInstance(mode, type, indices, primcount, baseinstance);
    }

    @Override public void glDrawElementsInstancedBaseInstance(int mode, ByteBuffer indices, int primcount, int baseinstance) {
        org.lwjgl.opengl.GL42.glDrawElementsInstancedBaseInstance(mode, indices, primcount, baseinstance);
    }

    @Override public void glDrawElementsInstancedBaseInstance(int mode, ShortBuffer indices, int primcount, int baseinstance) {
        org.lwjgl.opengl.GL42.glDrawElementsInstancedBaseInstance(mode, indices, primcount, baseinstance);
    }

    @Override public void glDrawElementsInstancedBaseInstance(int mode, IntBuffer indices, int primcount, int baseinstance) {
        org.lwjgl.opengl.GL42.glDrawElementsInstancedBaseInstance(mode, indices, primcount, baseinstance);
    }

    @Override public void nglDrawElementsInstancedBaseVertexBaseInstance(int mode, int count, int type, long indices, int primcount, int basevertex, int baseinstance) {
        org.lwjgl.opengl.GL42.nglDrawElementsInstancedBaseVertexBaseInstance(mode, count, type, indices, primcount, basevertex, baseinstance);
    }

    @Override public void glDrawElementsInstancedBaseVertexBaseInstance(int mode, int count, int type, long indices, int primcount, int basevertex, int baseinstance) {
        org.lwjgl.opengl.GL42.glDrawElementsInstancedBaseVertexBaseInstance(mode, count, type, indices, primcount, basevertex, baseinstance);
    }

    @Override public void glDrawElementsInstancedBaseVertexBaseInstance(int mode, int type, ByteBuffer indices, int primcount, int basevertex, int baseinstance) {
        org.lwjgl.opengl.GL42.glDrawElementsInstancedBaseVertexBaseInstance(mode, type, indices, primcount, basevertex, baseinstance);
    }

    @Override public void glDrawElementsInstancedBaseVertexBaseInstance(int mode, ByteBuffer indices, int primcount, int basevertex, int baseinstance) {
        org.lwjgl.opengl.GL42.glDrawElementsInstancedBaseVertexBaseInstance(mode, indices, primcount, basevertex, baseinstance);
    }

    @Override public void glDrawElementsInstancedBaseVertexBaseInstance(int mode, ShortBuffer indices, int primcount, int basevertex, int baseinstance) {
        org.lwjgl.opengl.GL42.glDrawElementsInstancedBaseVertexBaseInstance(mode, indices, primcount, basevertex, baseinstance);
    }

    @Override public void glDrawElementsInstancedBaseVertexBaseInstance(int mode, IntBuffer indices, int primcount, int basevertex, int baseinstance) {
        org.lwjgl.opengl.GL42.glDrawElementsInstancedBaseVertexBaseInstance(mode, indices, primcount, basevertex, baseinstance);
    }

    @Override public void glBindImageTexture(int unit, int texture, int level, boolean layered, int layer, int access, int format) {
        org.lwjgl.opengl.GL42.glBindImageTexture(unit, texture, level, layered, layer, access, format);
    }

    @Override public void glMemoryBarrier(int barriers) {
        org.lwjgl.opengl.GL42.glMemoryBarrier(barriers);
    }

    @Override public void nglGetInternalformativ(int target, int internalformat, int pname, int bufSize, long params) {
        org.lwjgl.opengl.GL42.nglGetInternalformativ(target, internalformat, pname, bufSize, params);
    }

    @Override public void glGetInternalformativ(int target, int internalformat, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL42.glGetInternalformativ(target, internalformat, pname, params);
    }

    @Override public void glGetInternalformativ(int target, int internalformat, int pname, int[] params) {
        org.lwjgl.opengl.GL42.glGetInternalformativ(target, internalformat, pname, params);
    }

    @Override public int glGetInternalformati(int target, int internalformat, int pname) {
        return org.lwjgl.opengl.GL42.glGetInternalformati(target, internalformat, pname);
    }

}
