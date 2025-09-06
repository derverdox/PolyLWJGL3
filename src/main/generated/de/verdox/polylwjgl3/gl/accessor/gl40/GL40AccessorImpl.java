package de.verdox.polylwjgl3.gl.accessor.gl40;

import de.verdox.polylwjgl3.gl.accessor.gl33.GL33Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl33.GL33AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL40;
import org.lwjgl.system.*;

public class GL40AccessorImpl extends GL33AccessorImpl implements GL40Accessor {

    @Override public void glBlendEquationi(@NativeType("GLuint") int buf, @NativeType("GLenum") int mode) {
        org.lwjgl.opengl.GL40.glBlendEquationi(buf, mode);
    }

    @Override public void glBlendEquationSeparatei(@NativeType("GLuint") int buf, @NativeType("GLenum") int modeRGB, @NativeType("GLenum") int modeAlpha) {
        org.lwjgl.opengl.GL40.glBlendEquationSeparatei(buf, modeRGB, modeAlpha);
    }

    @Override public void glBlendFunci(@NativeType("GLuint") int buf, @NativeType("GLenum") int sfactor, @NativeType("GLenum") int dfactor) {
        org.lwjgl.opengl.GL40.glBlendFunci(buf, sfactor, dfactor);
    }

    @Override public void glBlendFuncSeparatei(@NativeType("GLuint") int buf, @NativeType("GLenum") int srcRGB, @NativeType("GLenum") int dstRGB, @NativeType("GLenum") int srcAlpha, @NativeType("GLenum") int dstAlpha) {
        org.lwjgl.opengl.GL40.glBlendFuncSeparatei(buf, srcRGB, dstRGB, srcAlpha, dstAlpha);
    }

    @Override public void nglDrawArraysIndirect(int mode, long indirect) {
        org.lwjgl.opengl.GL40.nglDrawArraysIndirect(mode, indirect);
    }

    @Override public void glDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indirect) {
        org.lwjgl.opengl.GL40.glDrawArraysIndirect(mode, indirect);
    }

    @Override public void glDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") long indirect) {
        org.lwjgl.opengl.GL40.glDrawArraysIndirect(mode, indirect);
    }

    @Override public void glDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indirect) {
        org.lwjgl.opengl.GL40.glDrawArraysIndirect(mode, indirect);
    }

    @Override public void glDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") int[] indirect) {
        org.lwjgl.opengl.GL40.glDrawArraysIndirect(mode, indirect);
    }

    @Override public void nglDrawElementsIndirect(int mode, int type, long indirect) {
        org.lwjgl.opengl.GL40.nglDrawElementsIndirect(mode, type, indirect);
    }

    @Override public void glDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indirect) {
        org.lwjgl.opengl.GL40.glDrawElementsIndirect(mode, type, indirect);
    }

    @Override public void glDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") long indirect) {
        org.lwjgl.opengl.GL40.glDrawElementsIndirect(mode, type, indirect);
    }

    @Override public void glDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer indirect) {
        org.lwjgl.opengl.GL40.glDrawElementsIndirect(mode, type, indirect);
    }

    @Override public void glDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") int[] indirect) {
        org.lwjgl.opengl.GL40.glDrawElementsIndirect(mode, type, indirect);
    }

    @Override public void glUniform1d(@NativeType("GLint") int location, @NativeType("GLdouble") double x) {
        org.lwjgl.opengl.GL40.glUniform1d(location, x);
    }

    @Override public void glUniform2d(@NativeType("GLint") int location, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y) {
        org.lwjgl.opengl.GL40.glUniform2d(location, x, y);
    }

    @Override public void glUniform3d(@NativeType("GLint") int location, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z) {
        org.lwjgl.opengl.GL40.glUniform3d(location, x, y, z);
    }

    @Override public void glUniform4d(@NativeType("GLint") int location, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z, @NativeType("GLdouble") double w) {
        org.lwjgl.opengl.GL40.glUniform4d(location, x, y, z, w);
    }

    @Override public void nglUniform1dv(int location, int count, long value) {
        org.lwjgl.opengl.GL40.nglUniform1dv(location, count, value);
    }

    @Override public void glUniform1dv(@NativeType("GLint") int location, @NativeType("GLdouble const *") DoubleBuffer value) {
        org.lwjgl.opengl.GL40.glUniform1dv(location, value);
    }

    @Override public void glUniform1dv(@NativeType("GLint") int location, @NativeType("GLdouble const *") double[] value) {
        org.lwjgl.opengl.GL40.glUniform1dv(location, value);
    }

    @Override public void nglUniform2dv(int location, int count, long value) {
        org.lwjgl.opengl.GL40.nglUniform2dv(location, count, value);
    }

    @Override public void glUniform2dv(@NativeType("GLint") int location, @NativeType("GLdouble const *") DoubleBuffer value) {
        org.lwjgl.opengl.GL40.glUniform2dv(location, value);
    }

    @Override public void glUniform2dv(@NativeType("GLint") int location, @NativeType("GLdouble const *") double[] value) {
        org.lwjgl.opengl.GL40.glUniform2dv(location, value);
    }

    @Override public void nglUniform3dv(int location, int count, long value) {
        org.lwjgl.opengl.GL40.nglUniform3dv(location, count, value);
    }

    @Override public void glUniform3dv(@NativeType("GLint") int location, @NativeType("GLdouble const *") DoubleBuffer value) {
        org.lwjgl.opengl.GL40.glUniform3dv(location, value);
    }

    @Override public void glUniform3dv(@NativeType("GLint") int location, @NativeType("GLdouble const *") double[] value) {
        org.lwjgl.opengl.GL40.glUniform3dv(location, value);
    }

    @Override public void nglUniform4dv(int location, int count, long value) {
        org.lwjgl.opengl.GL40.nglUniform4dv(location, count, value);
    }

    @Override public void glUniform4dv(@NativeType("GLint") int location, @NativeType("GLdouble const *") DoubleBuffer value) {
        org.lwjgl.opengl.GL40.glUniform4dv(location, value);
    }

    @Override public void glUniform4dv(@NativeType("GLint") int location, @NativeType("GLdouble const *") double[] value) {
        org.lwjgl.opengl.GL40.glUniform4dv(location, value);
    }

    @Override public void nglUniformMatrix2dv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL40.nglUniformMatrix2dv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix2dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        org.lwjgl.opengl.GL40.glUniformMatrix2dv(location, transpose, value);
    }

    @Override public void glUniformMatrix2dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        org.lwjgl.opengl.GL40.glUniformMatrix2dv(location, transpose, value);
    }

    @Override public void nglUniformMatrix3dv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL40.nglUniformMatrix3dv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix3dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        org.lwjgl.opengl.GL40.glUniformMatrix3dv(location, transpose, value);
    }

    @Override public void glUniformMatrix3dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        org.lwjgl.opengl.GL40.glUniformMatrix3dv(location, transpose, value);
    }

    @Override public void nglUniformMatrix4dv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL40.nglUniformMatrix4dv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix4dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        org.lwjgl.opengl.GL40.glUniformMatrix4dv(location, transpose, value);
    }

    @Override public void glUniformMatrix4dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        org.lwjgl.opengl.GL40.glUniformMatrix4dv(location, transpose, value);
    }

    @Override public void nglUniformMatrix2x3dv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL40.nglUniformMatrix2x3dv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix2x3dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        org.lwjgl.opengl.GL40.glUniformMatrix2x3dv(location, transpose, value);
    }

    @Override public void glUniformMatrix2x3dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        org.lwjgl.opengl.GL40.glUniformMatrix2x3dv(location, transpose, value);
    }

    @Override public void nglUniformMatrix2x4dv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL40.nglUniformMatrix2x4dv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix2x4dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        org.lwjgl.opengl.GL40.glUniformMatrix2x4dv(location, transpose, value);
    }

    @Override public void glUniformMatrix2x4dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        org.lwjgl.opengl.GL40.glUniformMatrix2x4dv(location, transpose, value);
    }

    @Override public void nglUniformMatrix3x2dv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL40.nglUniformMatrix3x2dv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix3x2dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        org.lwjgl.opengl.GL40.glUniformMatrix3x2dv(location, transpose, value);
    }

    @Override public void glUniformMatrix3x2dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        org.lwjgl.opengl.GL40.glUniformMatrix3x2dv(location, transpose, value);
    }

    @Override public void nglUniformMatrix3x4dv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL40.nglUniformMatrix3x4dv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix3x4dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        org.lwjgl.opengl.GL40.glUniformMatrix3x4dv(location, transpose, value);
    }

    @Override public void glUniformMatrix3x4dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        org.lwjgl.opengl.GL40.glUniformMatrix3x4dv(location, transpose, value);
    }

    @Override public void nglUniformMatrix4x2dv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL40.nglUniformMatrix4x2dv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix4x2dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        org.lwjgl.opengl.GL40.glUniformMatrix4x2dv(location, transpose, value);
    }

    @Override public void glUniformMatrix4x2dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        org.lwjgl.opengl.GL40.glUniformMatrix4x2dv(location, transpose, value);
    }

    @Override public void nglUniformMatrix4x3dv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL40.nglUniformMatrix4x3dv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix4x3dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        org.lwjgl.opengl.GL40.glUniformMatrix4x3dv(location, transpose, value);
    }

    @Override public void glUniformMatrix4x3dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        org.lwjgl.opengl.GL40.glUniformMatrix4x3dv(location, transpose, value);
    }

    @Override public void nglGetUniformdv(int program, int location, long params) {
        org.lwjgl.opengl.GL40.nglGetUniformdv(program, location, params);
    }

    @Override public void glGetUniformdv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble *") DoubleBuffer params) {
        org.lwjgl.opengl.GL40.glGetUniformdv(program, location, params);
    }

    @Override public void glGetUniformdv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble *") double[] params) {
        org.lwjgl.opengl.GL40.glGetUniformdv(program, location, params);
    }

@NativeType("void")
    @Override public double glGetUniformd(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        return org.lwjgl.opengl.GL40.glGetUniformd(program, location);
    }

    @Override public void glMinSampleShading(@NativeType("GLfloat") float value) {
        org.lwjgl.opengl.GL40.glMinSampleShading(value);
    }

    @Override public int nglGetSubroutineUniformLocation(int program, int shadertype, long name) {
        return org.lwjgl.opengl.GL40.nglGetSubroutineUniformLocation(program, shadertype, name);
    }

@NativeType("GLint")
    @Override public int glGetSubroutineUniformLocation(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLchar const *") ByteBuffer name) {
        return org.lwjgl.opengl.GL40.glGetSubroutineUniformLocation(program, shadertype, name);
    }

@NativeType("GLint")
    @Override public int glGetSubroutineUniformLocation(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLchar const *") CharSequence name) {
        return org.lwjgl.opengl.GL40.glGetSubroutineUniformLocation(program, shadertype, name);
    }

    @Override public int nglGetSubroutineIndex(int program, int shadertype, long name) {
        return org.lwjgl.opengl.GL40.nglGetSubroutineIndex(program, shadertype, name);
    }

@NativeType("GLuint")
    @Override public int glGetSubroutineIndex(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLchar const *") ByteBuffer name) {
        return org.lwjgl.opengl.GL40.glGetSubroutineIndex(program, shadertype, name);
    }

@NativeType("GLuint")
    @Override public int glGetSubroutineIndex(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLchar const *") CharSequence name) {
        return org.lwjgl.opengl.GL40.glGetSubroutineIndex(program, shadertype, name);
    }

    @Override public void nglGetActiveSubroutineUniformiv(int program, int shadertype, int index, int pname, long values) {
        org.lwjgl.opengl.GL40.nglGetActiveSubroutineUniformiv(program, shadertype, index, pname, values);
    }

    @Override public void glGetActiveSubroutineUniformiv(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer values) {
        org.lwjgl.opengl.GL40.glGetActiveSubroutineUniformiv(program, shadertype, index, pname, values);
    }

    @Override public void glGetActiveSubroutineUniformiv(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] values) {
        org.lwjgl.opengl.GL40.glGetActiveSubroutineUniformiv(program, shadertype, index, pname, values);
    }

@NativeType("void")
    @Override public int glGetActiveSubroutineUniformi(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL40.glGetActiveSubroutineUniformi(program, shadertype, index, pname);
    }

    @Override public void nglGetActiveSubroutineUniformName(int program, int shadertype, int index, int bufsize, long length, long name) {
        org.lwjgl.opengl.GL40.nglGetActiveSubroutineUniformName(program, shadertype, index, bufsize, length, name);
    }

    @Override public void glGetActiveSubroutineUniformName(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLchar *") ByteBuffer name) {
        org.lwjgl.opengl.GL40.glGetActiveSubroutineUniformName(program, shadertype, index, length, name);
    }

@NativeType("void")
    @Override public String glGetActiveSubroutineUniformName(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @NativeType("GLsizei") int bufsize) {
        return org.lwjgl.opengl.GL40.glGetActiveSubroutineUniformName(program, shadertype, index, bufsize);
    }

@NativeType("void")
    @Override public String glGetActiveSubroutineUniformName(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index) {
        return org.lwjgl.opengl.GL40.glGetActiveSubroutineUniformName(program, shadertype, index);
    }

    @Override public void glGetActiveSubroutineUniformName(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLchar *") ByteBuffer name) {
        org.lwjgl.opengl.GL40.glGetActiveSubroutineUniformName(program, shadertype, index, length, name);
    }

    @Override public void nglGetActiveSubroutineName(int program, int shadertype, int index, int bufsize, long length, long name) {
        org.lwjgl.opengl.GL40.nglGetActiveSubroutineName(program, shadertype, index, bufsize, length, name);
    }

    @Override public void glGetActiveSubroutineName(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLchar *") ByteBuffer name) {
        org.lwjgl.opengl.GL40.glGetActiveSubroutineName(program, shadertype, index, length, name);
    }

@NativeType("void")
    @Override public String glGetActiveSubroutineName(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @NativeType("GLsizei") int bufsize) {
        return org.lwjgl.opengl.GL40.glGetActiveSubroutineName(program, shadertype, index, bufsize);
    }

@NativeType("void")
    @Override public String glGetActiveSubroutineName(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index) {
        return org.lwjgl.opengl.GL40.glGetActiveSubroutineName(program, shadertype, index);
    }

    @Override public void glGetActiveSubroutineName(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLchar *") ByteBuffer name) {
        org.lwjgl.opengl.GL40.glGetActiveSubroutineName(program, shadertype, index, length, name);
    }

    @Override public void nglUniformSubroutinesuiv(int shadertype, int count, long indices) {
        org.lwjgl.opengl.GL40.nglUniformSubroutinesuiv(shadertype, count, indices);
    }

    @Override public void glUniformSubroutinesuiv(@NativeType("GLenum") int shadertype, @NativeType("GLuint const *") IntBuffer indices) {
        org.lwjgl.opengl.GL40.glUniformSubroutinesuiv(shadertype, indices);
    }

    @Override public void glUniformSubroutinesuiv(@NativeType("GLenum") int shadertype, @NativeType("GLuint const *") int[] indices) {
        org.lwjgl.opengl.GL40.glUniformSubroutinesuiv(shadertype, indices);
    }

    @Override public void glUniformSubroutinesui(@NativeType("GLenum") int shadertype, @NativeType("GLuint const *") int index) {
        org.lwjgl.opengl.GL40.glUniformSubroutinesui(shadertype, index);
    }

    @Override public void nglGetUniformSubroutineuiv(int shadertype, int location, long params) {
        org.lwjgl.opengl.GL40.nglGetUniformSubroutineuiv(shadertype, location, params);
    }

    @Override public void glGetUniformSubroutineuiv(@NativeType("GLenum") int shadertype, @NativeType("GLint") int location, @NativeType("GLuint *") IntBuffer params) {
        org.lwjgl.opengl.GL40.glGetUniformSubroutineuiv(shadertype, location, params);
    }

    @Override public void glGetUniformSubroutineuiv(@NativeType("GLenum") int shadertype, @NativeType("GLint") int location, @NativeType("GLuint *") int[] params) {
        org.lwjgl.opengl.GL40.glGetUniformSubroutineuiv(shadertype, location, params);
    }

@NativeType("void")
    @Override public int glGetUniformSubroutineui(@NativeType("GLenum") int shadertype, @NativeType("GLint") int location) {
        return org.lwjgl.opengl.GL40.glGetUniformSubroutineui(shadertype, location);
    }

    @Override public void nglGetProgramStageiv(int program, int shadertype, int pname, long values) {
        org.lwjgl.opengl.GL40.nglGetProgramStageiv(program, shadertype, pname, values);
    }

    @Override public void glGetProgramStageiv(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer values) {
        org.lwjgl.opengl.GL40.glGetProgramStageiv(program, shadertype, pname, values);
    }

    @Override public void glGetProgramStageiv(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] values) {
        org.lwjgl.opengl.GL40.glGetProgramStageiv(program, shadertype, pname, values);
    }

@NativeType("void")
    @Override public int glGetProgramStagei(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL40.glGetProgramStagei(program, shadertype, pname);
    }

    @Override public void glPatchParameteri(@NativeType("GLenum") int pname, @NativeType("GLint") int value) {
        org.lwjgl.opengl.GL40.glPatchParameteri(pname, value);
    }

    @Override public void nglPatchParameterfv(int pname, long values) {
        org.lwjgl.opengl.GL40.nglPatchParameterfv(pname, values);
    }

    @Override public void glPatchParameterfv(@NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer values) {
        org.lwjgl.opengl.GL40.glPatchParameterfv(pname, values);
    }

    @Override public void glPatchParameterfv(@NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] values) {
        org.lwjgl.opengl.GL40.glPatchParameterfv(pname, values);
    }

    @Override public void glBindTransformFeedback(@NativeType("GLenum") int target, @NativeType("GLuint") int id) {
        org.lwjgl.opengl.GL40.glBindTransformFeedback(target, id);
    }

    @Override public void nglDeleteTransformFeedbacks(int n, long ids) {
        org.lwjgl.opengl.GL40.nglDeleteTransformFeedbacks(n, ids);
    }

    @Override public void glDeleteTransformFeedbacks(@NativeType("GLuint const *") IntBuffer ids) {
        org.lwjgl.opengl.GL40.glDeleteTransformFeedbacks(ids);
    }

    @Override public void glDeleteTransformFeedbacks(@NativeType("GLuint const *") int id) {
        org.lwjgl.opengl.GL40.glDeleteTransformFeedbacks(id);
    }

    @Override public void glDeleteTransformFeedbacks(@NativeType("GLuint const *") int[] ids) {
        org.lwjgl.opengl.GL40.glDeleteTransformFeedbacks(ids);
    }

    @Override public void nglGenTransformFeedbacks(int n, long ids) {
        org.lwjgl.opengl.GL40.nglGenTransformFeedbacks(n, ids);
    }

    @Override public void glGenTransformFeedbacks(@NativeType("GLuint *") IntBuffer ids) {
        org.lwjgl.opengl.GL40.glGenTransformFeedbacks(ids);
    }

@NativeType("void")
    @Override public int glGenTransformFeedbacks() {
        return org.lwjgl.opengl.GL40.glGenTransformFeedbacks();
    }

    @Override public void glGenTransformFeedbacks(@NativeType("GLuint *") int[] ids) {
        org.lwjgl.opengl.GL40.glGenTransformFeedbacks(ids);
    }

@NativeType("GLboolean")
    @Override public boolean glIsTransformFeedback(@NativeType("GLuint") int id) {
        return org.lwjgl.opengl.GL40.glIsTransformFeedback(id);
    }

    @Override public void glPauseTransformFeedback() {
        org.lwjgl.opengl.GL40.glPauseTransformFeedback();
    }

    @Override public void glResumeTransformFeedback() {
        org.lwjgl.opengl.GL40.glResumeTransformFeedback();
    }

    @Override public void glDrawTransformFeedback(@NativeType("GLenum") int mode, @NativeType("GLuint") int id) {
        org.lwjgl.opengl.GL40.glDrawTransformFeedback(mode, id);
    }

    @Override public void glDrawTransformFeedbackStream(@NativeType("GLenum") int mode, @NativeType("GLuint") int id, @NativeType("GLuint") int stream) {
        org.lwjgl.opengl.GL40.glDrawTransformFeedbackStream(mode, id, stream);
    }

    @Override public void glBeginQueryIndexed(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint") int id) {
        org.lwjgl.opengl.GL40.glBeginQueryIndexed(target, index, id);
    }

    @Override public void glEndQueryIndexed(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        org.lwjgl.opengl.GL40.glEndQueryIndexed(target, index);
    }

    @Override public void nglGetQueryIndexediv(int target, int index, int pname, long params) {
        org.lwjgl.opengl.GL40.nglGetQueryIndexediv(target, index, pname, params);
    }

    @Override public void glGetQueryIndexediv(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengl.GL40.glGetQueryIndexediv(target, index, pname, params);
    }

    @Override public void glGetQueryIndexediv(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengl.GL40.glGetQueryIndexediv(target, index, pname, params);
    }

@NativeType("void")
    @Override public int glGetQueryIndexedi(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL40.glGetQueryIndexedi(target, index, pname);
    }

}
