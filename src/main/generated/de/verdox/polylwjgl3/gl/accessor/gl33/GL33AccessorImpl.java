package de.verdox.polylwjgl3.gl.accessor.gl33;

import de.verdox.polylwjgl3.gl.accessor.gl32.GL32Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl32.GL32AccessorImpl;
import java.nio.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL33;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryUtil.*;

public class GL33AccessorImpl extends GL32AccessorImpl implements GL33Accessor {

    @Override public void nglBindFragDataLocationIndexed(int program, int colorNumber, int index, long name) {
        org.lwjgl.opengl.GL33.nglBindFragDataLocationIndexed(program, colorNumber, index, name);
    }

    @Override public void glBindFragDataLocationIndexed(@NativeType("GLuint") int program, @NativeType("GLuint") int colorNumber, @NativeType("GLuint") int index, @NativeType("GLchar const *") ByteBuffer name) {
        org.lwjgl.opengl.GL33.glBindFragDataLocationIndexed(program, colorNumber, index, name);
    }

    @Override public void glBindFragDataLocationIndexed(@NativeType("GLuint") int program, @NativeType("GLuint") int colorNumber, @NativeType("GLuint") int index, @NativeType("GLchar const *") CharSequence name) {
        org.lwjgl.opengl.GL33.glBindFragDataLocationIndexed(program, colorNumber, index, name);
    }

    @Override public int nglGetFragDataIndex(int program, long name) {
        return org.lwjgl.opengl.GL33.nglGetFragDataIndex(program, name);
    }

@NativeType("GLint")
    @Override public int glGetFragDataIndex(@NativeType("GLuint") int program, @NativeType("GLchar const *") ByteBuffer name) {
        return org.lwjgl.opengl.GL33.glGetFragDataIndex(program, name);
    }

@NativeType("GLint")
    @Override public int glGetFragDataIndex(@NativeType("GLuint") int program, @NativeType("GLchar const *") CharSequence name) {
        return org.lwjgl.opengl.GL33.glGetFragDataIndex(program, name);
    }

    @Override public void nglGenSamplers(int count, long samplers) {
        org.lwjgl.opengl.GL33.nglGenSamplers(count, samplers);
    }

    @Override public void glGenSamplers(@NativeType("GLuint *") IntBuffer samplers) {
        org.lwjgl.opengl.GL33.glGenSamplers(samplers);
    }

@NativeType("void")
    @Override public int glGenSamplers() {
        return org.lwjgl.opengl.GL33.glGenSamplers();
    }

    @Override public void glGenSamplers(@NativeType("GLuint *") int[] samplers) {
        org.lwjgl.opengl.GL33.glGenSamplers(samplers);
    }

    @Override public void nglDeleteSamplers(int count, long samplers) {
        org.lwjgl.opengl.GL33.nglDeleteSamplers(count, samplers);
    }

    @Override public void glDeleteSamplers(@NativeType("GLuint const *") IntBuffer samplers) {
        org.lwjgl.opengl.GL33.glDeleteSamplers(samplers);
    }

    @Override public void glDeleteSamplers(@NativeType("GLuint const *") int sampler) {
        org.lwjgl.opengl.GL33.glDeleteSamplers(sampler);
    }

    @Override public void glDeleteSamplers(@NativeType("GLuint const *") int[] samplers) {
        org.lwjgl.opengl.GL33.glDeleteSamplers(samplers);
    }

@NativeType("GLboolean")
    @Override public boolean glIsSampler(@NativeType("GLuint") int sampler) {
        return org.lwjgl.opengl.GL33.glIsSampler(sampler);
    }

    @Override public void glBindSampler(@NativeType("GLuint") int unit, @NativeType("GLuint") int sampler) {
        org.lwjgl.opengl.GL33.glBindSampler(unit, sampler);
    }

    @Override public void glSamplerParameteri(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        org.lwjgl.opengl.GL33.glSamplerParameteri(sampler, pname, param);
    }

    @Override public void glSamplerParameterf(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param) {
        org.lwjgl.opengl.GL33.glSamplerParameterf(sampler, pname, param);
    }

    @Override public void nglSamplerParameteriv(int sampler, int pname, long params) {
        org.lwjgl.opengl.GL33.nglSamplerParameteriv(sampler, pname, params);
    }

    @Override public void glSamplerParameteriv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        org.lwjgl.opengl.GL33.glSamplerParameteriv(sampler, pname, params);
    }

    @Override public void glSamplerParameteriv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        org.lwjgl.opengl.GL33.glSamplerParameteriv(sampler, pname, params);
    }

    @Override public void nglSamplerParameterfv(int sampler, int pname, long params) {
        org.lwjgl.opengl.GL33.nglSamplerParameterfv(sampler, pname, params);
    }

    @Override public void glSamplerParameterfv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params) {
        org.lwjgl.opengl.GL33.glSamplerParameterfv(sampler, pname, params);
    }

    @Override public void glSamplerParameterfv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] params) {
        org.lwjgl.opengl.GL33.glSamplerParameterfv(sampler, pname, params);
    }

    @Override public void nglSamplerParameterIiv(int sampler, int pname, long params) {
        org.lwjgl.opengl.GL33.nglSamplerParameterIiv(sampler, pname, params);
    }

    @Override public void glSamplerParameterIiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        org.lwjgl.opengl.GL33.glSamplerParameterIiv(sampler, pname, params);
    }

    @Override public void glSamplerParameterIiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        org.lwjgl.opengl.GL33.glSamplerParameterIiv(sampler, pname, params);
    }

    @Override public void nglSamplerParameterIuiv(int sampler, int pname, long params) {
        org.lwjgl.opengl.GL33.nglSamplerParameterIuiv(sampler, pname, params);
    }

    @Override public void glSamplerParameterIuiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint const *") IntBuffer params) {
        org.lwjgl.opengl.GL33.glSamplerParameterIuiv(sampler, pname, params);
    }

    @Override public void glSamplerParameterIuiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint const *") int[] params) {
        org.lwjgl.opengl.GL33.glSamplerParameterIuiv(sampler, pname, params);
    }

    @Override public void nglGetSamplerParameteriv(int sampler, int pname, long params) {
        org.lwjgl.opengl.GL33.nglGetSamplerParameteriv(sampler, pname, params);
    }

    @Override public void glGetSamplerParameteriv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengl.GL33.glGetSamplerParameteriv(sampler, pname, params);
    }

    @Override public void glGetSamplerParameteriv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengl.GL33.glGetSamplerParameteriv(sampler, pname, params);
    }

@NativeType("void")
    @Override public int glGetSamplerParameteri(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL33.glGetSamplerParameteri(sampler, pname);
    }

    @Override public void nglGetSamplerParameterfv(int sampler, int pname, long params) {
        org.lwjgl.opengl.GL33.nglGetSamplerParameterfv(sampler, pname, params);
    }

    @Override public void glGetSamplerParameterfv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        org.lwjgl.opengl.GL33.glGetSamplerParameterfv(sampler, pname, params);
    }

    @Override public void glGetSamplerParameterfv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        org.lwjgl.opengl.GL33.glGetSamplerParameterfv(sampler, pname, params);
    }

@NativeType("void")
    @Override public float glGetSamplerParameterf(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL33.glGetSamplerParameterf(sampler, pname);
    }

    @Override public void nglGetSamplerParameterIiv(int sampler, int pname, long params) {
        org.lwjgl.opengl.GL33.nglGetSamplerParameterIiv(sampler, pname, params);
    }

    @Override public void glGetSamplerParameterIiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengl.GL33.glGetSamplerParameterIiv(sampler, pname, params);
    }

    @Override public void glGetSamplerParameterIiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengl.GL33.glGetSamplerParameterIiv(sampler, pname, params);
    }

@NativeType("void")
    @Override public int glGetSamplerParameterIi(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL33.glGetSamplerParameterIi(sampler, pname);
    }

    @Override public void nglGetSamplerParameterIuiv(int sampler, int pname, long params) {
        org.lwjgl.opengl.GL33.nglGetSamplerParameterIuiv(sampler, pname, params);
    }

    @Override public void glGetSamplerParameterIuiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        org.lwjgl.opengl.GL33.glGetSamplerParameterIuiv(sampler, pname, params);
    }

    @Override public void glGetSamplerParameterIuiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        org.lwjgl.opengl.GL33.glGetSamplerParameterIuiv(sampler, pname, params);
    }

@NativeType("void")
    @Override public int glGetSamplerParameterIui(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL33.glGetSamplerParameterIui(sampler, pname);
    }

    @Override public void glQueryCounter(@NativeType("GLuint") int id, @NativeType("GLenum") int target) {
        org.lwjgl.opengl.GL33.glQueryCounter(id, target);
    }

    @Override public void nglGetQueryObjecti64v(int id, int pname, long params) {
        org.lwjgl.opengl.GL33.nglGetQueryObjecti64v(id, pname, params);
    }

    @Override public void glGetQueryObjecti64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint64 *") LongBuffer params) {
        org.lwjgl.opengl.GL33.glGetQueryObjecti64v(id, pname, params);
    }

    @Override public void glGetQueryObjecti64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint64 *") long params) {
        org.lwjgl.opengl.GL33.glGetQueryObjecti64v(id, pname, params);
    }

    @Override public void glGetQueryObjecti64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint64 *") long[] params) {
        org.lwjgl.opengl.GL33.glGetQueryObjecti64v(id, pname, params);
    }

@NativeType("void")
    @Override public long glGetQueryObjecti64(@NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL33.glGetQueryObjecti64(id, pname);
    }

    @Override public void nglGetQueryObjectui64v(int id, int pname, long params) {
        org.lwjgl.opengl.GL33.nglGetQueryObjectui64v(id, pname, params);
    }

    @Override public void glGetQueryObjectui64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") LongBuffer params) {
        org.lwjgl.opengl.GL33.glGetQueryObjectui64v(id, pname, params);
    }

    @Override public void glGetQueryObjectui64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") long params) {
        org.lwjgl.opengl.GL33.glGetQueryObjectui64v(id, pname, params);
    }

    @Override public void glGetQueryObjectui64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") long[] params) {
        org.lwjgl.opengl.GL33.glGetQueryObjectui64v(id, pname, params);
    }

@NativeType("void")
    @Override public long glGetQueryObjectui64(@NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL33.glGetQueryObjectui64(id, pname);
    }

    @Override public void glVertexAttribDivisor(@NativeType("GLuint") int index, @NativeType("GLuint") int divisor) {
        org.lwjgl.opengl.GL33.glVertexAttribDivisor(index, divisor);
    }

    @Override public void glVertexP2ui(@NativeType("GLenum") int type, @NativeType("GLuint") int value) {
        org.lwjgl.opengl.GL33.glVertexP2ui(type, value);
    }

    @Override public void glVertexP3ui(@NativeType("GLenum") int type, @NativeType("GLuint") int value) {
        org.lwjgl.opengl.GL33.glVertexP3ui(type, value);
    }

    @Override public void glVertexP4ui(@NativeType("GLenum") int type, @NativeType("GLuint") int value) {
        org.lwjgl.opengl.GL33.glVertexP4ui(type, value);
    }

    @Override public void nglVertexP2uiv(int type, long value) {
        org.lwjgl.opengl.GL33.nglVertexP2uiv(type, value);
    }

    @Override public void glVertexP2uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer value) {
        org.lwjgl.opengl.GL33.glVertexP2uiv(type, value);
    }

    @Override public void glVertexP2uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") int[] value) {
        org.lwjgl.opengl.GL33.glVertexP2uiv(type, value);
    }

    @Override public void nglVertexP3uiv(int type, long value) {
        org.lwjgl.opengl.GL33.nglVertexP3uiv(type, value);
    }

    @Override public void glVertexP3uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer value) {
        org.lwjgl.opengl.GL33.glVertexP3uiv(type, value);
    }

    @Override public void glVertexP3uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") int[] value) {
        org.lwjgl.opengl.GL33.glVertexP3uiv(type, value);
    }

    @Override public void nglVertexP4uiv(int type, long value) {
        org.lwjgl.opengl.GL33.nglVertexP4uiv(type, value);
    }

    @Override public void glVertexP4uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer value) {
        org.lwjgl.opengl.GL33.glVertexP4uiv(type, value);
    }

    @Override public void glVertexP4uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") int[] value) {
        org.lwjgl.opengl.GL33.glVertexP4uiv(type, value);
    }

    @Override public void glTexCoordP1ui(@NativeType("GLenum") int type, @NativeType("GLuint") int coords) {
        org.lwjgl.opengl.GL33.glTexCoordP1ui(type, coords);
    }

    @Override public void glTexCoordP2ui(@NativeType("GLenum") int type, @NativeType("GLuint") int coords) {
        org.lwjgl.opengl.GL33.glTexCoordP2ui(type, coords);
    }

    @Override public void glTexCoordP3ui(@NativeType("GLenum") int type, @NativeType("GLuint") int coords) {
        org.lwjgl.opengl.GL33.glTexCoordP3ui(type, coords);
    }

    @Override public void glTexCoordP4ui(@NativeType("GLenum") int type, @NativeType("GLuint") int coords) {
        org.lwjgl.opengl.GL33.glTexCoordP4ui(type, coords);
    }

    @Override public void nglTexCoordP1uiv(int type, long coords) {
        org.lwjgl.opengl.GL33.nglTexCoordP1uiv(type, coords);
    }

    @Override public void glTexCoordP1uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer coords) {
        org.lwjgl.opengl.GL33.glTexCoordP1uiv(type, coords);
    }

    @Override public void glTexCoordP1uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") int[] coords) {
        org.lwjgl.opengl.GL33.glTexCoordP1uiv(type, coords);
    }

    @Override public void nglTexCoordP2uiv(int type, long coords) {
        org.lwjgl.opengl.GL33.nglTexCoordP2uiv(type, coords);
    }

    @Override public void glTexCoordP2uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer coords) {
        org.lwjgl.opengl.GL33.glTexCoordP2uiv(type, coords);
    }

    @Override public void glTexCoordP2uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") int[] coords) {
        org.lwjgl.opengl.GL33.glTexCoordP2uiv(type, coords);
    }

    @Override public void nglTexCoordP3uiv(int type, long coords) {
        org.lwjgl.opengl.GL33.nglTexCoordP3uiv(type, coords);
    }

    @Override public void glTexCoordP3uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer coords) {
        org.lwjgl.opengl.GL33.glTexCoordP3uiv(type, coords);
    }

    @Override public void glTexCoordP3uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") int[] coords) {
        org.lwjgl.opengl.GL33.glTexCoordP3uiv(type, coords);
    }

    @Override public void nglTexCoordP4uiv(int type, long coords) {
        org.lwjgl.opengl.GL33.nglTexCoordP4uiv(type, coords);
    }

    @Override public void glTexCoordP4uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer coords) {
        org.lwjgl.opengl.GL33.glTexCoordP4uiv(type, coords);
    }

    @Override public void glTexCoordP4uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") int[] coords) {
        org.lwjgl.opengl.GL33.glTexCoordP4uiv(type, coords);
    }

    @Override public void glMultiTexCoordP1ui(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint") int coords) {
        org.lwjgl.opengl.GL33.glMultiTexCoordP1ui(texture, type, coords);
    }

    @Override public void glMultiTexCoordP2ui(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint") int coords) {
        org.lwjgl.opengl.GL33.glMultiTexCoordP2ui(texture, type, coords);
    }

    @Override public void glMultiTexCoordP3ui(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint") int coords) {
        org.lwjgl.opengl.GL33.glMultiTexCoordP3ui(texture, type, coords);
    }

    @Override public void glMultiTexCoordP4ui(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint") int coords) {
        org.lwjgl.opengl.GL33.glMultiTexCoordP4ui(texture, type, coords);
    }

    @Override public void nglMultiTexCoordP1uiv(int texture, int type, long coords) {
        org.lwjgl.opengl.GL33.nglMultiTexCoordP1uiv(texture, type, coords);
    }

    @Override public void glMultiTexCoordP1uiv(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer coords) {
        org.lwjgl.opengl.GL33.glMultiTexCoordP1uiv(texture, type, coords);
    }

    @Override public void glMultiTexCoordP1uiv(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint const *") int[] coords) {
        org.lwjgl.opengl.GL33.glMultiTexCoordP1uiv(texture, type, coords);
    }

    @Override public void nglMultiTexCoordP2uiv(int texture, int type, long coords) {
        org.lwjgl.opengl.GL33.nglMultiTexCoordP2uiv(texture, type, coords);
    }

    @Override public void glMultiTexCoordP2uiv(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer coords) {
        org.lwjgl.opengl.GL33.glMultiTexCoordP2uiv(texture, type, coords);
    }

    @Override public void glMultiTexCoordP2uiv(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint const *") int[] coords) {
        org.lwjgl.opengl.GL33.glMultiTexCoordP2uiv(texture, type, coords);
    }

    @Override public void nglMultiTexCoordP3uiv(int texture, int type, long coords) {
        org.lwjgl.opengl.GL33.nglMultiTexCoordP3uiv(texture, type, coords);
    }

    @Override public void glMultiTexCoordP3uiv(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer coords) {
        org.lwjgl.opengl.GL33.glMultiTexCoordP3uiv(texture, type, coords);
    }

    @Override public void glMultiTexCoordP3uiv(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint const *") int[] coords) {
        org.lwjgl.opengl.GL33.glMultiTexCoordP3uiv(texture, type, coords);
    }

    @Override public void nglMultiTexCoordP4uiv(int texture, int type, long coords) {
        org.lwjgl.opengl.GL33.nglMultiTexCoordP4uiv(texture, type, coords);
    }

    @Override public void glMultiTexCoordP4uiv(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer coords) {
        org.lwjgl.opengl.GL33.glMultiTexCoordP4uiv(texture, type, coords);
    }

    @Override public void glMultiTexCoordP4uiv(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint const *") int[] coords) {
        org.lwjgl.opengl.GL33.glMultiTexCoordP4uiv(texture, type, coords);
    }

    @Override public void glNormalP3ui(@NativeType("GLenum") int type, @NativeType("GLuint") int coords) {
        org.lwjgl.opengl.GL33.glNormalP3ui(type, coords);
    }

    @Override public void nglNormalP3uiv(int type, long coords) {
        org.lwjgl.opengl.GL33.nglNormalP3uiv(type, coords);
    }

    @Override public void glNormalP3uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer coords) {
        org.lwjgl.opengl.GL33.glNormalP3uiv(type, coords);
    }

    @Override public void glNormalP3uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") int[] coords) {
        org.lwjgl.opengl.GL33.glNormalP3uiv(type, coords);
    }

    @Override public void glColorP3ui(@NativeType("GLenum") int type, @NativeType("GLuint") int color) {
        org.lwjgl.opengl.GL33.glColorP3ui(type, color);
    }

    @Override public void glColorP4ui(@NativeType("GLenum") int type, @NativeType("GLuint") int color) {
        org.lwjgl.opengl.GL33.glColorP4ui(type, color);
    }

    @Override public void nglColorP3uiv(int type, long color) {
        org.lwjgl.opengl.GL33.nglColorP3uiv(type, color);
    }

    @Override public void glColorP3uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer color) {
        org.lwjgl.opengl.GL33.glColorP3uiv(type, color);
    }

    @Override public void glColorP3uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") int[] color) {
        org.lwjgl.opengl.GL33.glColorP3uiv(type, color);
    }

    @Override public void nglColorP4uiv(int type, long color) {
        org.lwjgl.opengl.GL33.nglColorP4uiv(type, color);
    }

    @Override public void glColorP4uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer color) {
        org.lwjgl.opengl.GL33.glColorP4uiv(type, color);
    }

    @Override public void glColorP4uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") int[] color) {
        org.lwjgl.opengl.GL33.glColorP4uiv(type, color);
    }

    @Override public void glSecondaryColorP3ui(@NativeType("GLenum") int type, @NativeType("GLuint") int color) {
        org.lwjgl.opengl.GL33.glSecondaryColorP3ui(type, color);
    }

    @Override public void nglSecondaryColorP3uiv(int type, long color) {
        org.lwjgl.opengl.GL33.nglSecondaryColorP3uiv(type, color);
    }

    @Override public void glSecondaryColorP3uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer color) {
        org.lwjgl.opengl.GL33.glSecondaryColorP3uiv(type, color);
    }

    @Override public void glSecondaryColorP3uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") int[] color) {
        org.lwjgl.opengl.GL33.glSecondaryColorP3uiv(type, color);
    }

    @Override public void glVertexAttribP1ui(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int value) {
        org.lwjgl.opengl.GL33.glVertexAttribP1ui(index, type, normalized, value);
    }

    @Override public void glVertexAttribP2ui(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int value) {
        org.lwjgl.opengl.GL33.glVertexAttribP2ui(index, type, normalized, value);
    }

    @Override public void glVertexAttribP3ui(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int value) {
        org.lwjgl.opengl.GL33.glVertexAttribP3ui(index, type, normalized, value);
    }

    @Override public void glVertexAttribP4ui(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int value) {
        org.lwjgl.opengl.GL33.glVertexAttribP4ui(index, type, normalized, value);
    }

    @Override public void nglVertexAttribP1uiv(int index, int type, boolean normalized, long value) {
        org.lwjgl.opengl.GL33.nglVertexAttribP1uiv(index, type, normalized, value);
    }

    @Override public void glVertexAttribP1uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") IntBuffer value) {
        org.lwjgl.opengl.GL33.glVertexAttribP1uiv(index, type, normalized, value);
    }

    @Override public void glVertexAttribP1uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") int[] value) {
        org.lwjgl.opengl.GL33.glVertexAttribP1uiv(index, type, normalized, value);
    }

    @Override public void nglVertexAttribP2uiv(int index, int type, boolean normalized, long value) {
        org.lwjgl.opengl.GL33.nglVertexAttribP2uiv(index, type, normalized, value);
    }

    @Override public void glVertexAttribP2uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") IntBuffer value) {
        org.lwjgl.opengl.GL33.glVertexAttribP2uiv(index, type, normalized, value);
    }

    @Override public void glVertexAttribP2uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") int[] value) {
        org.lwjgl.opengl.GL33.glVertexAttribP2uiv(index, type, normalized, value);
    }

    @Override public void nglVertexAttribP3uiv(int index, int type, boolean normalized, long value) {
        org.lwjgl.opengl.GL33.nglVertexAttribP3uiv(index, type, normalized, value);
    }

    @Override public void glVertexAttribP3uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") IntBuffer value) {
        org.lwjgl.opengl.GL33.glVertexAttribP3uiv(index, type, normalized, value);
    }

    @Override public void glVertexAttribP3uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") int[] value) {
        org.lwjgl.opengl.GL33.glVertexAttribP3uiv(index, type, normalized, value);
    }

    @Override public void nglVertexAttribP4uiv(int index, int type, boolean normalized, long value) {
        org.lwjgl.opengl.GL33.nglVertexAttribP4uiv(index, type, normalized, value);
    }

    @Override public void glVertexAttribP4uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") IntBuffer value) {
        org.lwjgl.opengl.GL33.glVertexAttribP4uiv(index, type, normalized, value);
    }

    @Override public void glVertexAttribP4uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") int[] value) {
        org.lwjgl.opengl.GL33.glVertexAttribP4uiv(index, type, normalized, value);
    }

}
