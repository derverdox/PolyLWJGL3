package de.verdox.polylwjgl3.gl.accessor.gl41;

import de.verdox.polylwjgl3.gl.accessor.gl40.GL40Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl40.GL40AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL41;
import org.lwjgl.system.*;

public class GL41AccessorImpl extends GL40AccessorImpl implements GL41Accessor {

    @Override public void glReleaseShaderCompiler() {
        org.lwjgl.opengl.GL41.glReleaseShaderCompiler();
    }

    @Override public void nglShaderBinary(int count, long shaders, int binaryformat, long binary, int length) {
        org.lwjgl.opengl.GL41.nglShaderBinary(count, shaders, binaryformat, binary, length);
    }

    @Override public void glShaderBinary(@NativeType("GLuint const *") IntBuffer shaders, @NativeType("GLenum") int binaryformat, @NativeType("void const *") ByteBuffer binary) {
        org.lwjgl.opengl.GL41.glShaderBinary(shaders, binaryformat, binary);
    }

    @Override public void glShaderBinary(@NativeType("GLuint const *") int[] shaders, @NativeType("GLenum") int binaryformat, @NativeType("void const *") ByteBuffer binary) {
        org.lwjgl.opengl.GL41.glShaderBinary(shaders, binaryformat, binary);
    }

    @Override public void nglGetShaderPrecisionFormat(int shadertype, int precisiontype, long range, long precision) {
        org.lwjgl.opengl.GL41.nglGetShaderPrecisionFormat(shadertype, precisiontype, range, precision);
    }

    @Override public void glGetShaderPrecisionFormat(@NativeType("GLenum") int shadertype, @NativeType("GLenum") int precisiontype, @NativeType("GLint *") IntBuffer range, @NativeType("GLint *") IntBuffer precision) {
        org.lwjgl.opengl.GL41.glGetShaderPrecisionFormat(shadertype, precisiontype, range, precision);
    }

@NativeType("void")
    @Override public int glGetShaderPrecisionFormat(@NativeType("GLenum") int shadertype, @NativeType("GLenum") int precisiontype, @NativeType("GLint *") IntBuffer range) {
        return org.lwjgl.opengl.GL41.glGetShaderPrecisionFormat(shadertype, precisiontype, range);
    }

    @Override public void glGetShaderPrecisionFormat(@NativeType("GLenum") int shadertype, @NativeType("GLenum") int precisiontype, @NativeType("GLint *") int[] range, @NativeType("GLint *") int[] precision) {
        org.lwjgl.opengl.GL41.glGetShaderPrecisionFormat(shadertype, precisiontype, range, precision);
    }

    @Override public void glDepthRangef(@NativeType("GLfloat") float zNear, @NativeType("GLfloat") float zFar) {
        org.lwjgl.opengl.GL41.glDepthRangef(zNear, zFar);
    }

    @Override public void glClearDepthf(@NativeType("GLfloat") float depth) {
        org.lwjgl.opengl.GL41.glClearDepthf(depth);
    }

    @Override public void nglGetProgramBinary(int program, int bufSize, long length, long binaryFormat, long binary) {
        org.lwjgl.opengl.GL41.nglGetProgramBinary(program, bufSize, length, binaryFormat, binary);
    }

    @Override public void glGetProgramBinary(@NativeType("GLuint") int program, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLenum *") IntBuffer binaryFormat, @NativeType("void *") ByteBuffer binary) {
        org.lwjgl.opengl.GL41.glGetProgramBinary(program, length, binaryFormat, binary);
    }

    @Override public void glGetProgramBinary(@NativeType("GLuint") int program, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLenum *") int[] binaryFormat, @NativeType("void *") ByteBuffer binary) {
        org.lwjgl.opengl.GL41.glGetProgramBinary(program, length, binaryFormat, binary);
    }

    @Override public void nglProgramBinary(int program, int binaryFormat, long binary, int length) {
        org.lwjgl.opengl.GL41.nglProgramBinary(program, binaryFormat, binary, length);
    }

    @Override public void glProgramBinary(@NativeType("GLuint") int program, @NativeType("GLenum") int binaryFormat, @NativeType("void const *") ByteBuffer binary) {
        org.lwjgl.opengl.GL41.glProgramBinary(program, binaryFormat, binary);
    }

    @Override public void glProgramParameteri(@NativeType("GLuint") int program, @NativeType("GLenum") int pname, @NativeType("GLint") int value) {
        org.lwjgl.opengl.GL41.glProgramParameteri(program, pname, value);
    }

    @Override public void glUseProgramStages(@NativeType("GLuint") int pipeline, @NativeType("GLbitfield") int stages, @NativeType("GLuint") int program) {
        org.lwjgl.opengl.GL41.glUseProgramStages(pipeline, stages, program);
    }

    @Override public void glActiveShaderProgram(@NativeType("GLuint") int pipeline, @NativeType("GLuint") int program) {
        org.lwjgl.opengl.GL41.glActiveShaderProgram(pipeline, program);
    }

    @Override public int nglCreateShaderProgramv(int type, int count, long strings) {
        return org.lwjgl.opengl.GL41.nglCreateShaderProgramv(type, count, strings);
    }

@NativeType("GLuint")
    @Override public int glCreateShaderProgramv(@NativeType("GLenum") int type, @NativeType("GLchar const * const *") PointerBuffer strings) {
        return org.lwjgl.opengl.GL41.glCreateShaderProgramv(type, strings);
    }

@NativeType("GLuint")
    @Override public int glCreateShaderProgramv(@NativeType("GLenum") int type, @NativeType("GLchar const * const *") CharSequence... strings) {
        return org.lwjgl.opengl.GL41.glCreateShaderProgramv(type, strings);
    }

@NativeType("GLuint")
    @Override public int glCreateShaderProgramv(@NativeType("GLenum") int type, @NativeType("GLchar const * const *") CharSequence string) {
        return org.lwjgl.opengl.GL41.glCreateShaderProgramv(type, string);
    }

    @Override public void glBindProgramPipeline(@NativeType("GLuint") int pipeline) {
        org.lwjgl.opengl.GL41.glBindProgramPipeline(pipeline);
    }

    @Override public void nglDeleteProgramPipelines(int n, long pipelines) {
        org.lwjgl.opengl.GL41.nglDeleteProgramPipelines(n, pipelines);
    }

    @Override public void glDeleteProgramPipelines(@NativeType("GLuint const *") IntBuffer pipelines) {
        org.lwjgl.opengl.GL41.glDeleteProgramPipelines(pipelines);
    }

    @Override public void glDeleteProgramPipelines(@NativeType("GLuint const *") int pipeline) {
        org.lwjgl.opengl.GL41.glDeleteProgramPipelines(pipeline);
    }

    @Override public void glDeleteProgramPipelines(@NativeType("GLuint const *") int[] pipelines) {
        org.lwjgl.opengl.GL41.glDeleteProgramPipelines(pipelines);
    }

    @Override public void nglGenProgramPipelines(int n, long pipelines) {
        org.lwjgl.opengl.GL41.nglGenProgramPipelines(n, pipelines);
    }

    @Override public void glGenProgramPipelines(@NativeType("GLuint *") IntBuffer pipelines) {
        org.lwjgl.opengl.GL41.glGenProgramPipelines(pipelines);
    }

@NativeType("void")
    @Override public int glGenProgramPipelines() {
        return org.lwjgl.opengl.GL41.glGenProgramPipelines();
    }

    @Override public void glGenProgramPipelines(@NativeType("GLuint *") int[] pipelines) {
        org.lwjgl.opengl.GL41.glGenProgramPipelines(pipelines);
    }

@NativeType("GLboolean")
    @Override public boolean glIsProgramPipeline(@NativeType("GLuint") int pipeline) {
        return org.lwjgl.opengl.GL41.glIsProgramPipeline(pipeline);
    }

    @Override public void nglGetProgramPipelineiv(int pipeline, int pname, long params) {
        org.lwjgl.opengl.GL41.nglGetProgramPipelineiv(pipeline, pname, params);
    }

    @Override public void glGetProgramPipelineiv(@NativeType("GLuint") int pipeline, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengl.GL41.glGetProgramPipelineiv(pipeline, pname, params);
    }

    @Override public void glGetProgramPipelineiv(@NativeType("GLuint") int pipeline, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengl.GL41.glGetProgramPipelineiv(pipeline, pname, params);
    }

@NativeType("void")
    @Override public int glGetProgramPipelinei(@NativeType("GLuint") int pipeline, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL41.glGetProgramPipelinei(pipeline, pname);
    }

    @Override public void glProgramUniform1i(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int x) {
        org.lwjgl.opengl.GL41.glProgramUniform1i(program, location, x);
    }

    @Override public void glProgramUniform2i(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int x, @NativeType("GLint") int y) {
        org.lwjgl.opengl.GL41.glProgramUniform2i(program, location, x, y);
    }

    @Override public void glProgramUniform3i(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z) {
        org.lwjgl.opengl.GL41.glProgramUniform3i(program, location, x, y, z);
    }

    @Override public void glProgramUniform4i(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z, @NativeType("GLint") int w) {
        org.lwjgl.opengl.GL41.glProgramUniform4i(program, location, x, y, z, w);
    }

    @Override public void glProgramUniform1ui(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int x) {
        org.lwjgl.opengl.GL41.glProgramUniform1ui(program, location, x);
    }

    @Override public void glProgramUniform2ui(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int x, @NativeType("GLuint") int y) {
        org.lwjgl.opengl.GL41.glProgramUniform2ui(program, location, x, y);
    }

    @Override public void glProgramUniform3ui(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int x, @NativeType("GLuint") int y, @NativeType("GLuint") int z) {
        org.lwjgl.opengl.GL41.glProgramUniform3ui(program, location, x, y, z);
    }

    @Override public void glProgramUniform4ui(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int x, @NativeType("GLuint") int y, @NativeType("GLuint") int z, @NativeType("GLuint") int w) {
        org.lwjgl.opengl.GL41.glProgramUniform4ui(program, location, x, y, z, w);
    }

    @Override public void glProgramUniform1f(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float x) {
        org.lwjgl.opengl.GL41.glProgramUniform1f(program, location, x);
    }

    @Override public void glProgramUniform2f(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y) {
        org.lwjgl.opengl.GL41.glProgramUniform2f(program, location, x, y);
    }

    @Override public void glProgramUniform3f(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z) {
        org.lwjgl.opengl.GL41.glProgramUniform3f(program, location, x, y, z);
    }

    @Override public void glProgramUniform4f(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z, @NativeType("GLfloat") float w) {
        org.lwjgl.opengl.GL41.glProgramUniform4f(program, location, x, y, z, w);
    }

    @Override public void glProgramUniform1d(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble") double x) {
        org.lwjgl.opengl.GL41.glProgramUniform1d(program, location, x);
    }

    @Override public void glProgramUniform2d(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y) {
        org.lwjgl.opengl.GL41.glProgramUniform2d(program, location, x, y);
    }

    @Override public void glProgramUniform3d(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z) {
        org.lwjgl.opengl.GL41.glProgramUniform3d(program, location, x, y, z);
    }

    @Override public void glProgramUniform4d(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z, @NativeType("GLdouble") double w) {
        org.lwjgl.opengl.GL41.glProgramUniform4d(program, location, x, y, z, w);
    }

    @Override public void nglProgramUniform1iv(int program, int location, int count, long value) {
        org.lwjgl.opengl.GL41.nglProgramUniform1iv(program, location, count, value);
    }

    @Override public void glProgramUniform1iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniform1iv(program, location, value);
    }

    @Override public void glProgramUniform1iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        org.lwjgl.opengl.GL41.glProgramUniform1iv(program, location, value);
    }

    @Override public void nglProgramUniform2iv(int program, int location, int count, long value) {
        org.lwjgl.opengl.GL41.nglProgramUniform2iv(program, location, count, value);
    }

    @Override public void glProgramUniform2iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniform2iv(program, location, value);
    }

    @Override public void glProgramUniform2iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        org.lwjgl.opengl.GL41.glProgramUniform2iv(program, location, value);
    }

    @Override public void nglProgramUniform3iv(int program, int location, int count, long value) {
        org.lwjgl.opengl.GL41.nglProgramUniform3iv(program, location, count, value);
    }

    @Override public void glProgramUniform3iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniform3iv(program, location, value);
    }

    @Override public void glProgramUniform3iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        org.lwjgl.opengl.GL41.glProgramUniform3iv(program, location, value);
    }

    @Override public void nglProgramUniform4iv(int program, int location, int count, long value) {
        org.lwjgl.opengl.GL41.nglProgramUniform4iv(program, location, count, value);
    }

    @Override public void glProgramUniform4iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniform4iv(program, location, value);
    }

    @Override public void glProgramUniform4iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        org.lwjgl.opengl.GL41.glProgramUniform4iv(program, location, value);
    }

    @Override public void nglProgramUniform1uiv(int program, int location, int count, long value) {
        org.lwjgl.opengl.GL41.nglProgramUniform1uiv(program, location, count, value);
    }

    @Override public void glProgramUniform1uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniform1uiv(program, location, value);
    }

    @Override public void glProgramUniform1uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        org.lwjgl.opengl.GL41.glProgramUniform1uiv(program, location, value);
    }

    @Override public void nglProgramUniform2uiv(int program, int location, int count, long value) {
        org.lwjgl.opengl.GL41.nglProgramUniform2uiv(program, location, count, value);
    }

    @Override public void glProgramUniform2uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniform2uiv(program, location, value);
    }

    @Override public void glProgramUniform2uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        org.lwjgl.opengl.GL41.glProgramUniform2uiv(program, location, value);
    }

    @Override public void nglProgramUniform3uiv(int program, int location, int count, long value) {
        org.lwjgl.opengl.GL41.nglProgramUniform3uiv(program, location, count, value);
    }

    @Override public void glProgramUniform3uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniform3uiv(program, location, value);
    }

    @Override public void glProgramUniform3uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        org.lwjgl.opengl.GL41.glProgramUniform3uiv(program, location, value);
    }

    @Override public void nglProgramUniform4uiv(int program, int location, int count, long value) {
        org.lwjgl.opengl.GL41.nglProgramUniform4uiv(program, location, count, value);
    }

    @Override public void glProgramUniform4uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniform4uiv(program, location, value);
    }

    @Override public void glProgramUniform4uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        org.lwjgl.opengl.GL41.glProgramUniform4uiv(program, location, value);
    }

    @Override public void nglProgramUniform1fv(int program, int location, int count, long value) {
        org.lwjgl.opengl.GL41.nglProgramUniform1fv(program, location, count, value);
    }

    @Override public void glProgramUniform1fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniform1fv(program, location, value);
    }

    @Override public void glProgramUniform1fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengl.GL41.glProgramUniform1fv(program, location, value);
    }

    @Override public void nglProgramUniform2fv(int program, int location, int count, long value) {
        org.lwjgl.opengl.GL41.nglProgramUniform2fv(program, location, count, value);
    }

    @Override public void glProgramUniform2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniform2fv(program, location, value);
    }

    @Override public void glProgramUniform2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengl.GL41.glProgramUniform2fv(program, location, value);
    }

    @Override public void nglProgramUniform3fv(int program, int location, int count, long value) {
        org.lwjgl.opengl.GL41.nglProgramUniform3fv(program, location, count, value);
    }

    @Override public void glProgramUniform3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniform3fv(program, location, value);
    }

    @Override public void glProgramUniform3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengl.GL41.glProgramUniform3fv(program, location, value);
    }

    @Override public void nglProgramUniform4fv(int program, int location, int count, long value) {
        org.lwjgl.opengl.GL41.nglProgramUniform4fv(program, location, count, value);
    }

    @Override public void glProgramUniform4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniform4fv(program, location, value);
    }

    @Override public void glProgramUniform4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengl.GL41.glProgramUniform4fv(program, location, value);
    }

    @Override public void nglProgramUniform1dv(int program, int location, int count, long value) {
        org.lwjgl.opengl.GL41.nglProgramUniform1dv(program, location, count, value);
    }

    @Override public void glProgramUniform1dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble const *") DoubleBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniform1dv(program, location, value);
    }

    @Override public void glProgramUniform1dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble const *") double[] value) {
        org.lwjgl.opengl.GL41.glProgramUniform1dv(program, location, value);
    }

    @Override public void nglProgramUniform2dv(int program, int location, int count, long value) {
        org.lwjgl.opengl.GL41.nglProgramUniform2dv(program, location, count, value);
    }

    @Override public void glProgramUniform2dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble const *") DoubleBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniform2dv(program, location, value);
    }

    @Override public void glProgramUniform2dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble const *") double[] value) {
        org.lwjgl.opengl.GL41.glProgramUniform2dv(program, location, value);
    }

    @Override public void nglProgramUniform3dv(int program, int location, int count, long value) {
        org.lwjgl.opengl.GL41.nglProgramUniform3dv(program, location, count, value);
    }

    @Override public void glProgramUniform3dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble const *") DoubleBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniform3dv(program, location, value);
    }

    @Override public void glProgramUniform3dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble const *") double[] value) {
        org.lwjgl.opengl.GL41.glProgramUniform3dv(program, location, value);
    }

    @Override public void nglProgramUniform4dv(int program, int location, int count, long value) {
        org.lwjgl.opengl.GL41.nglProgramUniform4dv(program, location, count, value);
    }

    @Override public void glProgramUniform4dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble const *") DoubleBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniform4dv(program, location, value);
    }

    @Override public void glProgramUniform4dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble const *") double[] value) {
        org.lwjgl.opengl.GL41.glProgramUniform4dv(program, location, value);
    }

    @Override public void nglProgramUniformMatrix2fv(int program, int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL41.nglProgramUniformMatrix2fv(program, location, count, transpose, value);
    }

    @Override public void glProgramUniformMatrix2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix2fv(program, location, transpose, value);
    }

    @Override public void glProgramUniformMatrix2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix2fv(program, location, transpose, value);
    }

    @Override public void nglProgramUniformMatrix3fv(int program, int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL41.nglProgramUniformMatrix3fv(program, location, count, transpose, value);
    }

    @Override public void glProgramUniformMatrix3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix3fv(program, location, transpose, value);
    }

    @Override public void glProgramUniformMatrix3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix3fv(program, location, transpose, value);
    }

    @Override public void nglProgramUniformMatrix4fv(int program, int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL41.nglProgramUniformMatrix4fv(program, location, count, transpose, value);
    }

    @Override public void glProgramUniformMatrix4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix4fv(program, location, transpose, value);
    }

    @Override public void glProgramUniformMatrix4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix4fv(program, location, transpose, value);
    }

    @Override public void nglProgramUniformMatrix2dv(int program, int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL41.nglProgramUniformMatrix2dv(program, location, count, transpose, value);
    }

    @Override public void glProgramUniformMatrix2dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix2dv(program, location, transpose, value);
    }

    @Override public void glProgramUniformMatrix2dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix2dv(program, location, transpose, value);
    }

    @Override public void nglProgramUniformMatrix3dv(int program, int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL41.nglProgramUniformMatrix3dv(program, location, count, transpose, value);
    }

    @Override public void glProgramUniformMatrix3dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix3dv(program, location, transpose, value);
    }

    @Override public void glProgramUniformMatrix3dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix3dv(program, location, transpose, value);
    }

    @Override public void nglProgramUniformMatrix4dv(int program, int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL41.nglProgramUniformMatrix4dv(program, location, count, transpose, value);
    }

    @Override public void glProgramUniformMatrix4dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix4dv(program, location, transpose, value);
    }

    @Override public void glProgramUniformMatrix4dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix4dv(program, location, transpose, value);
    }

    @Override public void nglProgramUniformMatrix2x3fv(int program, int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL41.nglProgramUniformMatrix2x3fv(program, location, count, transpose, value);
    }

    @Override public void glProgramUniformMatrix2x3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix2x3fv(program, location, transpose, value);
    }

    @Override public void glProgramUniformMatrix2x3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix2x3fv(program, location, transpose, value);
    }

    @Override public void nglProgramUniformMatrix3x2fv(int program, int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL41.nglProgramUniformMatrix3x2fv(program, location, count, transpose, value);
    }

    @Override public void glProgramUniformMatrix3x2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix3x2fv(program, location, transpose, value);
    }

    @Override public void glProgramUniformMatrix3x2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix3x2fv(program, location, transpose, value);
    }

    @Override public void nglProgramUniformMatrix2x4fv(int program, int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL41.nglProgramUniformMatrix2x4fv(program, location, count, transpose, value);
    }

    @Override public void glProgramUniformMatrix2x4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix2x4fv(program, location, transpose, value);
    }

    @Override public void glProgramUniformMatrix2x4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix2x4fv(program, location, transpose, value);
    }

    @Override public void nglProgramUniformMatrix4x2fv(int program, int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL41.nglProgramUniformMatrix4x2fv(program, location, count, transpose, value);
    }

    @Override public void glProgramUniformMatrix4x2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix4x2fv(program, location, transpose, value);
    }

    @Override public void glProgramUniformMatrix4x2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix4x2fv(program, location, transpose, value);
    }

    @Override public void nglProgramUniformMatrix3x4fv(int program, int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL41.nglProgramUniformMatrix3x4fv(program, location, count, transpose, value);
    }

    @Override public void glProgramUniformMatrix3x4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix3x4fv(program, location, transpose, value);
    }

    @Override public void glProgramUniformMatrix3x4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix3x4fv(program, location, transpose, value);
    }

    @Override public void nglProgramUniformMatrix4x3fv(int program, int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL41.nglProgramUniformMatrix4x3fv(program, location, count, transpose, value);
    }

    @Override public void glProgramUniformMatrix4x3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix4x3fv(program, location, transpose, value);
    }

    @Override public void glProgramUniformMatrix4x3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix4x3fv(program, location, transpose, value);
    }

    @Override public void nglProgramUniformMatrix2x3dv(int program, int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL41.nglProgramUniformMatrix2x3dv(program, location, count, transpose, value);
    }

    @Override public void glProgramUniformMatrix2x3dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix2x3dv(program, location, transpose, value);
    }

    @Override public void glProgramUniformMatrix2x3dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix2x3dv(program, location, transpose, value);
    }

    @Override public void nglProgramUniformMatrix3x2dv(int program, int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL41.nglProgramUniformMatrix3x2dv(program, location, count, transpose, value);
    }

    @Override public void glProgramUniformMatrix3x2dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix3x2dv(program, location, transpose, value);
    }

    @Override public void glProgramUniformMatrix3x2dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix3x2dv(program, location, transpose, value);
    }

    @Override public void nglProgramUniformMatrix2x4dv(int program, int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL41.nglProgramUniformMatrix2x4dv(program, location, count, transpose, value);
    }

    @Override public void glProgramUniformMatrix2x4dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix2x4dv(program, location, transpose, value);
    }

    @Override public void glProgramUniformMatrix2x4dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix2x4dv(program, location, transpose, value);
    }

    @Override public void nglProgramUniformMatrix4x2dv(int program, int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL41.nglProgramUniformMatrix4x2dv(program, location, count, transpose, value);
    }

    @Override public void glProgramUniformMatrix4x2dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix4x2dv(program, location, transpose, value);
    }

    @Override public void glProgramUniformMatrix4x2dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix4x2dv(program, location, transpose, value);
    }

    @Override public void nglProgramUniformMatrix3x4dv(int program, int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL41.nglProgramUniformMatrix3x4dv(program, location, count, transpose, value);
    }

    @Override public void glProgramUniformMatrix3x4dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix3x4dv(program, location, transpose, value);
    }

    @Override public void glProgramUniformMatrix3x4dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix3x4dv(program, location, transpose, value);
    }

    @Override public void nglProgramUniformMatrix4x3dv(int program, int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL41.nglProgramUniformMatrix4x3dv(program, location, count, transpose, value);
    }

    @Override public void glProgramUniformMatrix4x3dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix4x3dv(program, location, transpose, value);
    }

    @Override public void glProgramUniformMatrix4x3dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        org.lwjgl.opengl.GL41.glProgramUniformMatrix4x3dv(program, location, transpose, value);
    }

    @Override public void glValidateProgramPipeline(@NativeType("GLuint") int pipeline) {
        org.lwjgl.opengl.GL41.glValidateProgramPipeline(pipeline);
    }

    @Override public void nglGetProgramPipelineInfoLog(int pipeline, int bufSize, long length, long infoLog) {
        org.lwjgl.opengl.GL41.nglGetProgramPipelineInfoLog(pipeline, bufSize, length, infoLog);
    }

    @Override public void glGetProgramPipelineInfoLog(@NativeType("GLuint") int pipeline, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLchar *") ByteBuffer infoLog) {
        org.lwjgl.opengl.GL41.glGetProgramPipelineInfoLog(pipeline, length, infoLog);
    }

@NativeType("void")
    @Override public String glGetProgramPipelineInfoLog(@NativeType("GLuint") int pipeline, @NativeType("GLsizei") int bufSize) {
        return org.lwjgl.opengl.GL41.glGetProgramPipelineInfoLog(pipeline, bufSize);
    }

@NativeType("void")
    @Override public String glGetProgramPipelineInfoLog(@NativeType("GLuint") int pipeline) {
        return org.lwjgl.opengl.GL41.glGetProgramPipelineInfoLog(pipeline);
    }

    @Override public void glGetProgramPipelineInfoLog(@NativeType("GLuint") int pipeline, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLchar *") ByteBuffer infoLog) {
        org.lwjgl.opengl.GL41.glGetProgramPipelineInfoLog(pipeline, length, infoLog);
    }

    @Override public void glVertexAttribL1d(@NativeType("GLuint") int index, @NativeType("GLdouble") double x) {
        org.lwjgl.opengl.GL41.glVertexAttribL1d(index, x);
    }

    @Override public void glVertexAttribL2d(@NativeType("GLuint") int index, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y) {
        org.lwjgl.opengl.GL41.glVertexAttribL2d(index, x, y);
    }

    @Override public void glVertexAttribL3d(@NativeType("GLuint") int index, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z) {
        org.lwjgl.opengl.GL41.glVertexAttribL3d(index, x, y, z);
    }

    @Override public void glVertexAttribL4d(@NativeType("GLuint") int index, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z, @NativeType("GLdouble") double w) {
        org.lwjgl.opengl.GL41.glVertexAttribL4d(index, x, y, z, w);
    }

    @Override public void nglVertexAttribL1dv(int index, long v) {
        org.lwjgl.opengl.GL41.nglVertexAttribL1dv(index, v);
    }

    @Override public void glVertexAttribL1dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        org.lwjgl.opengl.GL41.glVertexAttribL1dv(index, v);
    }

    @Override public void glVertexAttribL1dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        org.lwjgl.opengl.GL41.glVertexAttribL1dv(index, v);
    }

    @Override public void nglVertexAttribL2dv(int index, long v) {
        org.lwjgl.opengl.GL41.nglVertexAttribL2dv(index, v);
    }

    @Override public void glVertexAttribL2dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        org.lwjgl.opengl.GL41.glVertexAttribL2dv(index, v);
    }

    @Override public void glVertexAttribL2dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        org.lwjgl.opengl.GL41.glVertexAttribL2dv(index, v);
    }

    @Override public void nglVertexAttribL3dv(int index, long v) {
        org.lwjgl.opengl.GL41.nglVertexAttribL3dv(index, v);
    }

    @Override public void glVertexAttribL3dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        org.lwjgl.opengl.GL41.glVertexAttribL3dv(index, v);
    }

    @Override public void glVertexAttribL3dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        org.lwjgl.opengl.GL41.glVertexAttribL3dv(index, v);
    }

    @Override public void nglVertexAttribL4dv(int index, long v) {
        org.lwjgl.opengl.GL41.nglVertexAttribL4dv(index, v);
    }

    @Override public void glVertexAttribL4dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        org.lwjgl.opengl.GL41.glVertexAttribL4dv(index, v);
    }

    @Override public void glVertexAttribL4dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        org.lwjgl.opengl.GL41.glVertexAttribL4dv(index, v);
    }

    @Override public void nglVertexAttribLPointer(int index, int size, int type, int stride, long pointer) {
        org.lwjgl.opengl.GL41.nglVertexAttribLPointer(index, size, type, stride, pointer);
    }

    @Override public void glVertexAttribLPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        org.lwjgl.opengl.GL41.glVertexAttribLPointer(index, size, type, stride, pointer);
    }

    @Override public void glVertexAttribLPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        org.lwjgl.opengl.GL41.glVertexAttribLPointer(index, size, type, stride, pointer);
    }

    @Override public void glVertexAttribLPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLsizei") int stride, @NativeType("void const *") DoubleBuffer pointer) {
        org.lwjgl.opengl.GL41.glVertexAttribLPointer(index, size, stride, pointer);
    }

    @Override public void nglGetVertexAttribLdv(int index, int pname, long params) {
        org.lwjgl.opengl.GL41.nglGetVertexAttribLdv(index, pname, params);
    }

    @Override public void glGetVertexAttribLdv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLdouble *") DoubleBuffer params) {
        org.lwjgl.opengl.GL41.glGetVertexAttribLdv(index, pname, params);
    }

    @Override public void glGetVertexAttribLdv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLdouble *") double[] params) {
        org.lwjgl.opengl.GL41.glGetVertexAttribLdv(index, pname, params);
    }

    @Override public void nglViewportArrayv(int first, int count, long v) {
        org.lwjgl.opengl.GL41.nglViewportArrayv(first, count, v);
    }

    @Override public void glViewportArrayv(@NativeType("GLuint") int first, @NativeType("GLfloat const *") FloatBuffer v) {
        org.lwjgl.opengl.GL41.glViewportArrayv(first, v);
    }

    @Override public void glViewportArrayv(@NativeType("GLuint") int first, @NativeType("GLfloat const *") float[] v) {
        org.lwjgl.opengl.GL41.glViewportArrayv(first, v);
    }

    @Override public void glViewportIndexedf(@NativeType("GLuint") int index, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float w, @NativeType("GLfloat") float h) {
        org.lwjgl.opengl.GL41.glViewportIndexedf(index, x, y, w, h);
    }

    @Override public void nglViewportIndexedfv(int index, long v) {
        org.lwjgl.opengl.GL41.nglViewportIndexedfv(index, v);
    }

    @Override public void glViewportIndexedfv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer v) {
        org.lwjgl.opengl.GL41.glViewportIndexedfv(index, v);
    }

    @Override public void glViewportIndexedfv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] v) {
        org.lwjgl.opengl.GL41.glViewportIndexedfv(index, v);
    }

    @Override public void nglScissorArrayv(int first, int count, long v) {
        org.lwjgl.opengl.GL41.nglScissorArrayv(first, count, v);
    }

    @Override public void glScissorArrayv(@NativeType("GLuint") int first, @NativeType("GLint const *") IntBuffer v) {
        org.lwjgl.opengl.GL41.glScissorArrayv(first, v);
    }

    @Override public void glScissorArrayv(@NativeType("GLuint") int first, @NativeType("GLint const *") int[] v) {
        org.lwjgl.opengl.GL41.glScissorArrayv(first, v);
    }

    @Override public void glScissorIndexed(@NativeType("GLuint") int index, @NativeType("GLint") int left, @NativeType("GLint") int bottom, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        org.lwjgl.opengl.GL41.glScissorIndexed(index, left, bottom, width, height);
    }

    @Override public void nglScissorIndexedv(int index, long v) {
        org.lwjgl.opengl.GL41.nglScissorIndexedv(index, v);
    }

    @Override public void glScissorIndexedv(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        org.lwjgl.opengl.GL41.glScissorIndexedv(index, v);
    }

    @Override public void glScissorIndexedv(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        org.lwjgl.opengl.GL41.glScissorIndexedv(index, v);
    }

    @Override public void nglDepthRangeArrayv(int first, int count, long v) {
        org.lwjgl.opengl.GL41.nglDepthRangeArrayv(first, count, v);
    }

    @Override public void glDepthRangeArrayv(@NativeType("GLuint") int first, @NativeType("GLdouble const *") DoubleBuffer v) {
        org.lwjgl.opengl.GL41.glDepthRangeArrayv(first, v);
    }

    @Override public void glDepthRangeArrayv(@NativeType("GLuint") int first, @NativeType("GLdouble const *") double[] v) {
        org.lwjgl.opengl.GL41.glDepthRangeArrayv(first, v);
    }

    @Override public void glDepthRangeIndexed(@NativeType("GLuint") int index, @NativeType("GLdouble") double zNear, @NativeType("GLdouble") double zFar) {
        org.lwjgl.opengl.GL41.glDepthRangeIndexed(index, zNear, zFar);
    }

    @Override public void nglGetFloati_v(int target, int index, long data) {
        org.lwjgl.opengl.GL41.nglGetFloati_v(target, index, data);
    }

    @Override public void glGetFloati_v(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat *") FloatBuffer data) {
        org.lwjgl.opengl.GL41.glGetFloati_v(target, index, data);
    }

    @Override public void glGetFloati_v(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat *") float[] data) {
        org.lwjgl.opengl.GL41.glGetFloati_v(target, index, data);
    }

@NativeType("void")
    @Override public float glGetFloati(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        return org.lwjgl.opengl.GL41.glGetFloati(target, index);
    }

    @Override public void nglGetDoublei_v(int target, int index, long data) {
        org.lwjgl.opengl.GL41.nglGetDoublei_v(target, index, data);
    }

    @Override public void glGetDoublei_v(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLdouble *") DoubleBuffer data) {
        org.lwjgl.opengl.GL41.glGetDoublei_v(target, index, data);
    }

    @Override public void glGetDoublei_v(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLdouble *") double[] data) {
        org.lwjgl.opengl.GL41.glGetDoublei_v(target, index, data);
    }

@NativeType("void")
    @Override public double glGetDoublei(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        return org.lwjgl.opengl.GL41.glGetDoublei(target, index);
    }

}
