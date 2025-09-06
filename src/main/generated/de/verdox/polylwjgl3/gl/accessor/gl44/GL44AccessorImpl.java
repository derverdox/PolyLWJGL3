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

    @Override public void glBufferStorage(int target, long size, int flags) {
        org.lwjgl.opengl.GL44.glBufferStorage(target, size, flags);
    }

    @Override public void glBufferStorage(int target, ByteBuffer data, int flags) {
        org.lwjgl.opengl.GL44.glBufferStorage(target, data, flags);
    }

    @Override public void glBufferStorage(int target, ShortBuffer data, int flags) {
        org.lwjgl.opengl.GL44.glBufferStorage(target, data, flags);
    }

    @Override public void glBufferStorage(int target, IntBuffer data, int flags) {
        org.lwjgl.opengl.GL44.glBufferStorage(target, data, flags);
    }

    @Override public void glBufferStorage(int target, FloatBuffer data, int flags) {
        org.lwjgl.opengl.GL44.glBufferStorage(target, data, flags);
    }

    @Override public void glBufferStorage(int target, DoubleBuffer data, int flags) {
        org.lwjgl.opengl.GL44.glBufferStorage(target, data, flags);
    }

    @Override public void glBufferStorage(int target, short[] data, int flags) {
        org.lwjgl.opengl.GL44.glBufferStorage(target, data, flags);
    }

    @Override public void glBufferStorage(int target, int[] data, int flags) {
        org.lwjgl.opengl.GL44.glBufferStorage(target, data, flags);
    }

    @Override public void glBufferStorage(int target, float[] data, int flags) {
        org.lwjgl.opengl.GL44.glBufferStorage(target, data, flags);
    }

    @Override public void glBufferStorage(int target, double[] data, int flags) {
        org.lwjgl.opengl.GL44.glBufferStorage(target, data, flags);
    }

    @Override public void nglClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long data) {
        org.lwjgl.opengl.GL44.nglClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    @Override public void glClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, @Nullable ByteBuffer data) {
        org.lwjgl.opengl.GL44.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    @Override public void glClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, @Nullable ShortBuffer data) {
        org.lwjgl.opengl.GL44.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    @Override public void glClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, @Nullable IntBuffer data) {
        org.lwjgl.opengl.GL44.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    @Override public void glClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, @Nullable FloatBuffer data) {
        org.lwjgl.opengl.GL44.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    @Override public void glClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, @Nullable DoubleBuffer data) {
        org.lwjgl.opengl.GL44.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    @Override public void glClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, @Nullable short[] data) {
        org.lwjgl.opengl.GL44.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    @Override public void glClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, @Nullable int[] data) {
        org.lwjgl.opengl.GL44.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    @Override public void glClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, @Nullable float[] data) {
        org.lwjgl.opengl.GL44.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    @Override public void glClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, @Nullable double[] data) {
        org.lwjgl.opengl.GL44.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    @Override public void nglClearTexImage(int texture, int level, int format, int type, long data) {
        org.lwjgl.opengl.GL44.nglClearTexImage(texture, level, format, type, data);
    }

    @Override public void glClearTexImage(int texture, int level, int format, int type, @Nullable ByteBuffer data) {
        org.lwjgl.opengl.GL44.glClearTexImage(texture, level, format, type, data);
    }

    @Override public void glClearTexImage(int texture, int level, int format, int type, @Nullable ShortBuffer data) {
        org.lwjgl.opengl.GL44.glClearTexImage(texture, level, format, type, data);
    }

    @Override public void glClearTexImage(int texture, int level, int format, int type, @Nullable IntBuffer data) {
        org.lwjgl.opengl.GL44.glClearTexImage(texture, level, format, type, data);
    }

    @Override public void glClearTexImage(int texture, int level, int format, int type, @Nullable FloatBuffer data) {
        org.lwjgl.opengl.GL44.glClearTexImage(texture, level, format, type, data);
    }

    @Override public void glClearTexImage(int texture, int level, int format, int type, @Nullable DoubleBuffer data) {
        org.lwjgl.opengl.GL44.glClearTexImage(texture, level, format, type, data);
    }

    @Override public void glClearTexImage(int texture, int level, int format, int type, @Nullable short[] data) {
        org.lwjgl.opengl.GL44.glClearTexImage(texture, level, format, type, data);
    }

    @Override public void glClearTexImage(int texture, int level, int format, int type, @Nullable int[] data) {
        org.lwjgl.opengl.GL44.glClearTexImage(texture, level, format, type, data);
    }

    @Override public void glClearTexImage(int texture, int level, int format, int type, @Nullable float[] data) {
        org.lwjgl.opengl.GL44.glClearTexImage(texture, level, format, type, data);
    }

    @Override public void glClearTexImage(int texture, int level, int format, int type, @Nullable double[] data) {
        org.lwjgl.opengl.GL44.glClearTexImage(texture, level, format, type, data);
    }

    @Override public void nglBindBuffersBase(int target, int first, int count, long buffers) {
        org.lwjgl.opengl.GL44.nglBindBuffersBase(target, first, count, buffers);
    }

    @Override public void glBindBuffersBase(int target, int first, @Nullable IntBuffer buffers) {
        org.lwjgl.opengl.GL44.glBindBuffersBase(target, first, buffers);
    }

    @Override public void glBindBuffersBase(int target, int first, @Nullable int[] buffers) {
        org.lwjgl.opengl.GL44.glBindBuffersBase(target, first, buffers);
    }

    @Override public void nglBindBuffersRange(int target, int first, int count, long buffers, long offsets, long sizes) {
        org.lwjgl.opengl.GL44.nglBindBuffersRange(target, first, count, buffers, offsets, sizes);
    }

    @Override public void glBindBuffersRange(int target, int first, @Nullable IntBuffer buffers, @Nullable PointerBuffer offsets, @Nullable PointerBuffer sizes) {
        org.lwjgl.opengl.GL44.glBindBuffersRange(target, first, buffers, offsets, sizes);
    }

    @Override public void glBindBuffersRange(int target, int first, @Nullable int[] buffers, @Nullable PointerBuffer offsets, @Nullable PointerBuffer sizes) {
        org.lwjgl.opengl.GL44.glBindBuffersRange(target, first, buffers, offsets, sizes);
    }

    @Override public void nglBindTextures(int first, int count, long textures) {
        org.lwjgl.opengl.GL44.nglBindTextures(first, count, textures);
    }

    @Override public void glBindTextures(int first, @Nullable IntBuffer textures) {
        org.lwjgl.opengl.GL44.glBindTextures(first, textures);
    }

    @Override public void glBindTextures(int first, @Nullable int[] textures) {
        org.lwjgl.opengl.GL44.glBindTextures(first, textures);
    }

    @Override public void nglBindSamplers(int first, int count, long samplers) {
        org.lwjgl.opengl.GL44.nglBindSamplers(first, count, samplers);
    }

    @Override public void glBindSamplers(int first, @Nullable IntBuffer samplers) {
        org.lwjgl.opengl.GL44.glBindSamplers(first, samplers);
    }

    @Override public void glBindSamplers(int first, @Nullable int[] samplers) {
        org.lwjgl.opengl.GL44.glBindSamplers(first, samplers);
    }

    @Override public void nglBindImageTextures(int first, int count, long textures) {
        org.lwjgl.opengl.GL44.nglBindImageTextures(first, count, textures);
    }

    @Override public void glBindImageTextures(int first, @Nullable IntBuffer textures) {
        org.lwjgl.opengl.GL44.glBindImageTextures(first, textures);
    }

    @Override public void glBindImageTextures(int first, @Nullable int[] textures) {
        org.lwjgl.opengl.GL44.glBindImageTextures(first, textures);
    }

    @Override public void nglBindVertexBuffers(int first, int count, long buffers, long offsets, long strides) {
        org.lwjgl.opengl.GL44.nglBindVertexBuffers(first, count, buffers, offsets, strides);
    }

    @Override public void glBindVertexBuffers(int first, @Nullable IntBuffer buffers, @Nullable PointerBuffer offsets, @Nullable IntBuffer strides) {
        org.lwjgl.opengl.GL44.glBindVertexBuffers(first, buffers, offsets, strides);
    }

    @Override public void glBindVertexBuffers(int first, @Nullable int[] buffers, @Nullable PointerBuffer offsets, @Nullable int[] strides) {
        org.lwjgl.opengl.GL44.glBindVertexBuffers(first, buffers, offsets, strides);
    }

}
