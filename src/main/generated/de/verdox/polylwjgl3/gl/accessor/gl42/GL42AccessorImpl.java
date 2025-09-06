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

    @Override public void glGetActiveAtomicCounterBufferiv(@NativeType("GLuint") int program, @NativeType("GLuint") int bufferIndex, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengl.GL42.glGetActiveAtomicCounterBufferiv(program, bufferIndex, pname, params);
    }

    @Override public void glGetActiveAtomicCounterBufferiv(@NativeType("GLuint") int program, @NativeType("GLuint") int bufferIndex, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengl.GL42.glGetActiveAtomicCounterBufferiv(program, bufferIndex, pname, params);
    }

@NativeType("void")
    @Override public int glGetActiveAtomicCounterBufferi(@NativeType("GLuint") int program, @NativeType("GLuint") int bufferIndex, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL42.glGetActiveAtomicCounterBufferi(program, bufferIndex, pname);
    }

    @Override public void glTexStorage1D(@NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width) {
        org.lwjgl.opengl.GL42.glTexStorage1D(target, levels, internalformat, width);
    }

    @Override public void glTexStorage2D(@NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        org.lwjgl.opengl.GL42.glTexStorage2D(target, levels, internalformat, width, height);
    }

    @Override public void glTexStorage3D(@NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth) {
        org.lwjgl.opengl.GL42.glTexStorage3D(target, levels, internalformat, width, height, depth);
    }

    @Override public void glDrawTransformFeedbackInstanced(@NativeType("GLenum") int mode, @NativeType("GLuint") int id, @NativeType("GLsizei") int primcount) {
        org.lwjgl.opengl.GL42.glDrawTransformFeedbackInstanced(mode, id, primcount);
    }

    @Override public void glDrawTransformFeedbackStreamInstanced(@NativeType("GLenum") int mode, @NativeType("GLuint") int id, @NativeType("GLuint") int stream, @NativeType("GLsizei") int primcount) {
        org.lwjgl.opengl.GL42.glDrawTransformFeedbackStreamInstanced(mode, id, stream, primcount);
    }

    @Override public void glDrawArraysInstancedBaseInstance(@NativeType("GLenum") int mode, @NativeType("GLint") int first, @NativeType("GLsizei") int count, @NativeType("GLsizei") int primcount, @NativeType("GLuint") int baseinstance) {
        org.lwjgl.opengl.GL42.glDrawArraysInstancedBaseInstance(mode, first, count, primcount, baseinstance);
    }

    @Override public void nglDrawElementsInstancedBaseInstance(int mode, int count, int type, long indices, int primcount, int baseinstance) {
        org.lwjgl.opengl.GL42.nglDrawElementsInstancedBaseInstance(mode, count, type, indices, primcount, baseinstance);
    }

    @Override public void glDrawElementsInstancedBaseInstance(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLsizei") int primcount, @NativeType("GLuint") int baseinstance) {
        org.lwjgl.opengl.GL42.glDrawElementsInstancedBaseInstance(mode, count, type, indices, primcount, baseinstance);
    }

    @Override public void glDrawElementsInstancedBaseInstance(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLuint") int baseinstance) {
        org.lwjgl.opengl.GL42.glDrawElementsInstancedBaseInstance(mode, type, indices, primcount, baseinstance);
    }

    @Override public void glDrawElementsInstancedBaseInstance(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLuint") int baseinstance) {
        org.lwjgl.opengl.GL42.glDrawElementsInstancedBaseInstance(mode, indices, primcount, baseinstance);
    }

    @Override public void glDrawElementsInstancedBaseInstance(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLuint") int baseinstance) {
        org.lwjgl.opengl.GL42.glDrawElementsInstancedBaseInstance(mode, indices, primcount, baseinstance);
    }

    @Override public void glDrawElementsInstancedBaseInstance(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLuint") int baseinstance) {
        org.lwjgl.opengl.GL42.glDrawElementsInstancedBaseInstance(mode, indices, primcount, baseinstance);
    }

    @Override public void nglDrawElementsInstancedBaseVertexBaseInstance(int mode, int count, int type, long indices, int primcount, int basevertex, int baseinstance) {
        org.lwjgl.opengl.GL42.nglDrawElementsInstancedBaseVertexBaseInstance(mode, count, type, indices, primcount, basevertex, baseinstance);
    }

    @Override public void glDrawElementsInstancedBaseVertexBaseInstance(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLsizei") int primcount, @NativeType("GLint") int basevertex, @NativeType("GLuint") int baseinstance) {
        org.lwjgl.opengl.GL42.glDrawElementsInstancedBaseVertexBaseInstance(mode, count, type, indices, primcount, basevertex, baseinstance);
    }

    @Override public void glDrawElementsInstancedBaseVertexBaseInstance(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLint") int basevertex, @NativeType("GLuint") int baseinstance) {
        org.lwjgl.opengl.GL42.glDrawElementsInstancedBaseVertexBaseInstance(mode, type, indices, primcount, basevertex, baseinstance);
    }

    @Override public void glDrawElementsInstancedBaseVertexBaseInstance(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLint") int basevertex, @NativeType("GLuint") int baseinstance) {
        org.lwjgl.opengl.GL42.glDrawElementsInstancedBaseVertexBaseInstance(mode, indices, primcount, basevertex, baseinstance);
    }

    @Override public void glDrawElementsInstancedBaseVertexBaseInstance(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLint") int basevertex, @NativeType("GLuint") int baseinstance) {
        org.lwjgl.opengl.GL42.glDrawElementsInstancedBaseVertexBaseInstance(mode, indices, primcount, basevertex, baseinstance);
    }

    @Override public void glDrawElementsInstancedBaseVertexBaseInstance(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLint") int basevertex, @NativeType("GLuint") int baseinstance) {
        org.lwjgl.opengl.GL42.glDrawElementsInstancedBaseVertexBaseInstance(mode, indices, primcount, basevertex, baseinstance);
    }

    @Override public void glBindImageTexture(@NativeType("GLuint") int unit, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLboolean") boolean layered, @NativeType("GLint") int layer, @NativeType("GLenum") int access, @NativeType("GLenum") int format) {
        org.lwjgl.opengl.GL42.glBindImageTexture(unit, texture, level, layered, layer, access, format);
    }

    @Override public void glMemoryBarrier(@NativeType("GLbitfield") int barriers) {
        org.lwjgl.opengl.GL42.glMemoryBarrier(barriers);
    }

    @Override public void nglGetInternalformativ(int target, int internalformat, int pname, int bufSize, long params) {
        org.lwjgl.opengl.GL42.nglGetInternalformativ(target, internalformat, pname, bufSize, params);
    }

    @Override public void glGetInternalformativ(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengl.GL42.glGetInternalformativ(target, internalformat, pname, params);
    }

    @Override public void glGetInternalformativ(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengl.GL42.glGetInternalformativ(target, internalformat, pname, params);
    }

@NativeType("void")
    @Override public int glGetInternalformati(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL42.glGetInternalformati(target, internalformat, pname);
    }

}
