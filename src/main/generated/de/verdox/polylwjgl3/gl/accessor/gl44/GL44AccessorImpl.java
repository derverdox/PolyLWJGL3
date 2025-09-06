package de.verdox.polylwjgl3.gl.accessor.gl44;

import de.verdox.polylwjgl3.gl.accessor.gl43.GL43Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl43.GL43AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL44;
import org.lwjgl.system.*;

public class GL44AccessorImpl extends GL43AccessorImpl implements GL44Accessor {

    @Override public void nglBufferStorage(int target, long size, long data, int flags) {
        org.lwjgl.opengl.GL44.nglBufferStorage(target, size, data, flags);
    }

    @Override public void glBufferStorage(@NativeType("GLenum") int target, @NativeType("GLsizeiptr") long size, @NativeType("GLbitfield") int flags) {
        org.lwjgl.opengl.GL44.glBufferStorage(target, size, flags);
    }

    @Override public void glBufferStorage(@NativeType("GLenum") int target, @NativeType("void const *") ByteBuffer data, @NativeType("GLbitfield") int flags) {
        org.lwjgl.opengl.GL44.glBufferStorage(target, data, flags);
    }

    @Override public void glBufferStorage(@NativeType("GLenum") int target, @NativeType("void const *") ShortBuffer data, @NativeType("GLbitfield") int flags) {
        org.lwjgl.opengl.GL44.glBufferStorage(target, data, flags);
    }

    @Override public void glBufferStorage(@NativeType("GLenum") int target, @NativeType("void const *") IntBuffer data, @NativeType("GLbitfield") int flags) {
        org.lwjgl.opengl.GL44.glBufferStorage(target, data, flags);
    }

    @Override public void glBufferStorage(@NativeType("GLenum") int target, @NativeType("void const *") FloatBuffer data, @NativeType("GLbitfield") int flags) {
        org.lwjgl.opengl.GL44.glBufferStorage(target, data, flags);
    }

    @Override public void glBufferStorage(@NativeType("GLenum") int target, @NativeType("void const *") DoubleBuffer data, @NativeType("GLbitfield") int flags) {
        org.lwjgl.opengl.GL44.glBufferStorage(target, data, flags);
    }

    @Override public void glBufferStorage(@NativeType("GLenum") int target, @NativeType("void const *") short[] data, @NativeType("GLbitfield") int flags) {
        org.lwjgl.opengl.GL44.glBufferStorage(target, data, flags);
    }

    @Override public void glBufferStorage(@NativeType("GLenum") int target, @NativeType("void const *") int[] data, @NativeType("GLbitfield") int flags) {
        org.lwjgl.opengl.GL44.glBufferStorage(target, data, flags);
    }

    @Override public void glBufferStorage(@NativeType("GLenum") int target, @NativeType("void const *") float[] data, @NativeType("GLbitfield") int flags) {
        org.lwjgl.opengl.GL44.glBufferStorage(target, data, flags);
    }

    @Override public void glBufferStorage(@NativeType("GLenum") int target, @NativeType("void const *") double[] data, @NativeType("GLbitfield") int flags) {
        org.lwjgl.opengl.GL44.glBufferStorage(target, data, flags);
    }

    @Override public void nglClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long data) {
        org.lwjgl.opengl.GL44.nglClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    @Override public void glClearTexSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ByteBuffer data) {
        org.lwjgl.opengl.GL44.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    @Override public void glClearTexSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ShortBuffer data) {
        org.lwjgl.opengl.GL44.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    @Override public void glClearTexSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") IntBuffer data) {
        org.lwjgl.opengl.GL44.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    @Override public void glClearTexSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") FloatBuffer data) {
        org.lwjgl.opengl.GL44.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    @Override public void glClearTexSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") DoubleBuffer data) {
        org.lwjgl.opengl.GL44.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    @Override public void glClearTexSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") short[] data) {
        org.lwjgl.opengl.GL44.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    @Override public void glClearTexSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") int[] data) {
        org.lwjgl.opengl.GL44.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    @Override public void glClearTexSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") float[] data) {
        org.lwjgl.opengl.GL44.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    @Override public void glClearTexSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") double[] data) {
        org.lwjgl.opengl.GL44.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    @Override public void nglClearTexImage(int texture, int level, int format, int type, long data) {
        org.lwjgl.opengl.GL44.nglClearTexImage(texture, level, format, type, data);
    }

    @Override public void glClearTexImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ByteBuffer data) {
        org.lwjgl.opengl.GL44.glClearTexImage(texture, level, format, type, data);
    }

    @Override public void glClearTexImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ShortBuffer data) {
        org.lwjgl.opengl.GL44.glClearTexImage(texture, level, format, type, data);
    }

    @Override public void glClearTexImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") IntBuffer data) {
        org.lwjgl.opengl.GL44.glClearTexImage(texture, level, format, type, data);
    }

    @Override public void glClearTexImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") FloatBuffer data) {
        org.lwjgl.opengl.GL44.glClearTexImage(texture, level, format, type, data);
    }

    @Override public void glClearTexImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") DoubleBuffer data) {
        org.lwjgl.opengl.GL44.glClearTexImage(texture, level, format, type, data);
    }

    @Override public void glClearTexImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") short[] data) {
        org.lwjgl.opengl.GL44.glClearTexImage(texture, level, format, type, data);
    }

    @Override public void glClearTexImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") int[] data) {
        org.lwjgl.opengl.GL44.glClearTexImage(texture, level, format, type, data);
    }

    @Override public void glClearTexImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") float[] data) {
        org.lwjgl.opengl.GL44.glClearTexImage(texture, level, format, type, data);
    }

    @Override public void glClearTexImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") double[] data) {
        org.lwjgl.opengl.GL44.glClearTexImage(texture, level, format, type, data);
    }

    @Override public void nglBindBuffersBase(int target, int first, int count, long buffers) {
        org.lwjgl.opengl.GL44.nglBindBuffersBase(target, first, count, buffers);
    }

    @Override public void glBindBuffersBase(@NativeType("GLenum") int target, @NativeType("GLuint") int first, @Nullable @NativeType("GLuint const *") IntBuffer buffers) {
        org.lwjgl.opengl.GL44.glBindBuffersBase(target, first, buffers);
    }

    @Override public void glBindBuffersBase(@NativeType("GLenum") int target, @NativeType("GLuint") int first, @Nullable @NativeType("GLuint const *") int[] buffers) {
        org.lwjgl.opengl.GL44.glBindBuffersBase(target, first, buffers);
    }

    @Override public void nglBindBuffersRange(int target, int first, int count, long buffers, long offsets, long sizes) {
        org.lwjgl.opengl.GL44.nglBindBuffersRange(target, first, count, buffers, offsets, sizes);
    }

    @Override public void glBindBuffersRange(@NativeType("GLenum") int target, @NativeType("GLuint") int first, @Nullable @NativeType("GLuint const *") IntBuffer buffers, @Nullable @NativeType("GLintptr const *") PointerBuffer offsets, @Nullable @NativeType("GLsizeiptr const *") PointerBuffer sizes) {
        org.lwjgl.opengl.GL44.glBindBuffersRange(target, first, buffers, offsets, sizes);
    }

    @Override public void glBindBuffersRange(@NativeType("GLenum") int target, @NativeType("GLuint") int first, @Nullable @NativeType("GLuint const *") int[] buffers, @Nullable @NativeType("GLintptr const *") PointerBuffer offsets, @Nullable @NativeType("GLsizeiptr const *") PointerBuffer sizes) {
        org.lwjgl.opengl.GL44.glBindBuffersRange(target, first, buffers, offsets, sizes);
    }

    @Override public void nglBindTextures(int first, int count, long textures) {
        org.lwjgl.opengl.GL44.nglBindTextures(first, count, textures);
    }

    @Override public void glBindTextures(@NativeType("GLuint") int first, @Nullable @NativeType("GLuint const *") IntBuffer textures) {
        org.lwjgl.opengl.GL44.glBindTextures(first, textures);
    }

    @Override public void glBindTextures(@NativeType("GLuint") int first, @Nullable @NativeType("GLuint const *") int[] textures) {
        org.lwjgl.opengl.GL44.glBindTextures(first, textures);
    }

    @Override public void nglBindSamplers(int first, int count, long samplers) {
        org.lwjgl.opengl.GL44.nglBindSamplers(first, count, samplers);
    }

    @Override public void glBindSamplers(@NativeType("GLuint") int first, @Nullable @NativeType("GLuint const *") IntBuffer samplers) {
        org.lwjgl.opengl.GL44.glBindSamplers(first, samplers);
    }

    @Override public void glBindSamplers(@NativeType("GLuint") int first, @Nullable @NativeType("GLuint const *") int[] samplers) {
        org.lwjgl.opengl.GL44.glBindSamplers(first, samplers);
    }

    @Override public void nglBindImageTextures(int first, int count, long textures) {
        org.lwjgl.opengl.GL44.nglBindImageTextures(first, count, textures);
    }

    @Override public void glBindImageTextures(@NativeType("GLuint") int first, @Nullable @NativeType("GLuint const *") IntBuffer textures) {
        org.lwjgl.opengl.GL44.glBindImageTextures(first, textures);
    }

    @Override public void glBindImageTextures(@NativeType("GLuint") int first, @Nullable @NativeType("GLuint const *") int[] textures) {
        org.lwjgl.opengl.GL44.glBindImageTextures(first, textures);
    }

    @Override public void nglBindVertexBuffers(int first, int count, long buffers, long offsets, long strides) {
        org.lwjgl.opengl.GL44.nglBindVertexBuffers(first, count, buffers, offsets, strides);
    }

    @Override public void glBindVertexBuffers(@NativeType("GLuint") int first, @Nullable @NativeType("GLuint const *") IntBuffer buffers, @Nullable @NativeType("GLintptr const *") PointerBuffer offsets, @Nullable @NativeType("GLsizei const *") IntBuffer strides) {
        org.lwjgl.opengl.GL44.glBindVertexBuffers(first, buffers, offsets, strides);
    }

    @Override public void glBindVertexBuffers(@NativeType("GLuint") int first, @Nullable @NativeType("GLuint const *") int[] buffers, @Nullable @NativeType("GLintptr const *") PointerBuffer offsets, @Nullable @NativeType("GLsizei const *") int[] strides) {
        org.lwjgl.opengl.GL44.glBindVertexBuffers(first, buffers, offsets, strides);
    }

}
