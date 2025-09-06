package de.verdox.polylwjgl3.gl.accessor.gles31;

import de.verdox.polylwjgl3.gl.accessor.gles30.GLES30Accessor;
import de.verdox.polylwjgl3.gl.accessor.gles30.GLES30AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengles.GLES31;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

public class GLES31AccessorImpl extends GLES30AccessorImpl implements GLES31Accessor {

    @Override public void glDispatchCompute(@NativeType("GLuint") int num_groups_x, @NativeType("GLuint") int num_groups_y, @NativeType("GLuint") int num_groups_z) {
        org.lwjgl.opengles.GLES31.glDispatchCompute(num_groups_x, num_groups_y, num_groups_z);
    }

    @Override public void glDispatchComputeIndirect(@NativeType("GLintptr") long indirect) {
        org.lwjgl.opengles.GLES31.glDispatchComputeIndirect(indirect);
    }

    @Override public void nglDrawArraysIndirect(int mode, long indirect) {
        org.lwjgl.opengles.GLES31.nglDrawArraysIndirect(mode, indirect);
    }

    @Override public void glDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indirect) {
        org.lwjgl.opengles.GLES31.glDrawArraysIndirect(mode, indirect);
    }

    @Override public void glDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") long indirect) {
        org.lwjgl.opengles.GLES31.glDrawArraysIndirect(mode, indirect);
    }

    @Override public void glDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indirect) {
        org.lwjgl.opengles.GLES31.glDrawArraysIndirect(mode, indirect);
    }

    @Override public void glDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") int[] indirect) {
        org.lwjgl.opengles.GLES31.glDrawArraysIndirect(mode, indirect);
    }

    @Override public void nglDrawElementsIndirect(int mode, int type, long indirect) {
        org.lwjgl.opengles.GLES31.nglDrawElementsIndirect(mode, type, indirect);
    }

    @Override public void glDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indirect) {
        org.lwjgl.opengles.GLES31.glDrawElementsIndirect(mode, type, indirect);
    }

    @Override public void glDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") long indirect) {
        org.lwjgl.opengles.GLES31.glDrawElementsIndirect(mode, type, indirect);
    }

    @Override public void glDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer indirect) {
        org.lwjgl.opengles.GLES31.glDrawElementsIndirect(mode, type, indirect);
    }

    @Override public void glDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") int[] indirect) {
        org.lwjgl.opengles.GLES31.glDrawElementsIndirect(mode, type, indirect);
    }

    @Override public void glFramebufferParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        org.lwjgl.opengles.GLES31.glFramebufferParameteri(target, pname, param);
    }

    @Override public void nglGetFramebufferParameteriv(int target, int pname, long params) {
        org.lwjgl.opengles.GLES31.nglGetFramebufferParameteriv(target, pname, params);
    }

    @Override public void glGetFramebufferParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengles.GLES31.glGetFramebufferParameteriv(target, pname, params);
    }

    @Override public void glGetFramebufferParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengles.GLES31.glGetFramebufferParameteriv(target, pname, params);
    }

@NativeType("void")
    @Override public int glGetFramebufferParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengles.GLES31.glGetFramebufferParameteri(target, pname);
    }

    @Override public void nglGetProgramInterfaceiv(int program, int programInterface, int pname, long params) {
        org.lwjgl.opengles.GLES31.nglGetProgramInterfaceiv(program, programInterface, pname, params);
    }

    @Override public void glGetProgramInterfaceiv(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengles.GLES31.glGetProgramInterfaceiv(program, programInterface, pname, params);
    }

    @Override public void glGetProgramInterfaceiv(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengles.GLES31.glGetProgramInterfaceiv(program, programInterface, pname, params);
    }

@NativeType("void")
    @Override public int glGetProgramInterfacei(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengles.GLES31.glGetProgramInterfacei(program, programInterface, pname);
    }

    @Override public int nglGetProgramResourceIndex(int program, int programInterface, long name) {
        return org.lwjgl.opengles.GLES31.nglGetProgramResourceIndex(program, programInterface, name);
    }

@NativeType("GLuint")
    @Override public int glGetProgramResourceIndex(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") ByteBuffer name) {
        return org.lwjgl.opengles.GLES31.glGetProgramResourceIndex(program, programInterface, name);
    }

@NativeType("GLuint")
    @Override public int glGetProgramResourceIndex(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") CharSequence name) {
        return org.lwjgl.opengles.GLES31.glGetProgramResourceIndex(program, programInterface, name);
    }

    @Override public void nglGetProgramResourceName(int program, int programInterface, int index, int bufSize, long length, long name) {
        org.lwjgl.opengles.GLES31.nglGetProgramResourceName(program, programInterface, index, bufSize, length, name);
    }

    @Override public void glGetProgramResourceName(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLchar *") ByteBuffer name) {
        org.lwjgl.opengles.GLES31.glGetProgramResourceName(program, programInterface, index, length, name);
    }

@NativeType("void")
    @Override public String glGetProgramResourceName(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index, @NativeType("GLsizei") int bufSize) {
        return org.lwjgl.opengles.GLES31.glGetProgramResourceName(program, programInterface, index, bufSize);
    }

@NativeType("void")
    @Override public String glGetProgramResourceName(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index) {
        return org.lwjgl.opengles.GLES31.glGetProgramResourceName(program, programInterface, index);
    }

    @Override public void glGetProgramResourceName(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLchar *") ByteBuffer name) {
        org.lwjgl.opengles.GLES31.glGetProgramResourceName(program, programInterface, index, length, name);
    }

    @Override public void nglGetProgramResourceiv(int program, int programInterface, int index, int propCount, long props, int bufSize, long length, long params) {
        org.lwjgl.opengles.GLES31.nglGetProgramResourceiv(program, programInterface, index, propCount, props, bufSize, length, params);
    }

    @Override public void glGetProgramResourceiv(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index, @NativeType("GLenum const *") IntBuffer props, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengles.GLES31.glGetProgramResourceiv(program, programInterface, index, props, length, params);
    }

    @Override public void glGetProgramResourceiv(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index, @NativeType("GLenum const *") int[] props, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengles.GLES31.glGetProgramResourceiv(program, programInterface, index, props, length, params);
    }

    @Override public int nglGetProgramResourceLocation(int program, int programInterface, long name) {
        return org.lwjgl.opengles.GLES31.nglGetProgramResourceLocation(program, programInterface, name);
    }

@NativeType("GLint")
    @Override public int glGetProgramResourceLocation(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") ByteBuffer name) {
        return org.lwjgl.opengles.GLES31.glGetProgramResourceLocation(program, programInterface, name);
    }

@NativeType("GLint")
    @Override public int glGetProgramResourceLocation(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") CharSequence name) {
        return org.lwjgl.opengles.GLES31.glGetProgramResourceLocation(program, programInterface, name);
    }

    @Override public void glUseProgramStages(@NativeType("GLuint") int pipeline, @NativeType("GLbitfield") int stages, @NativeType("GLuint") int program) {
        org.lwjgl.opengles.GLES31.glUseProgramStages(pipeline, stages, program);
    }

    @Override public void glActiveShaderProgram(@NativeType("GLuint") int pipeline, @NativeType("GLuint") int program) {
        org.lwjgl.opengles.GLES31.glActiveShaderProgram(pipeline, program);
    }

    @Override public int nglCreateShaderProgramv(int type, int count, long strings) {
        return org.lwjgl.opengles.GLES31.nglCreateShaderProgramv(type, count, strings);
    }

@NativeType("GLuint")
    @Override public int glCreateShaderProgramv(@NativeType("GLenum") int type, @NativeType("GLchar const * const *") PointerBuffer strings) {
        return org.lwjgl.opengles.GLES31.glCreateShaderProgramv(type, strings);
    }

@NativeType("GLuint")
    @Override public int glCreateShaderProgramv(@NativeType("GLenum") int type, @NativeType("GLchar const * const *") CharSequence... strings) {
        return org.lwjgl.opengles.GLES31.glCreateShaderProgramv(type, strings);
    }

@NativeType("GLuint")
    @Override public int glCreateShaderProgramv(@NativeType("GLenum") int type, @NativeType("GLchar const * const *") CharSequence string) {
        return org.lwjgl.opengles.GLES31.glCreateShaderProgramv(type, string);
    }

    @Override public void glBindProgramPipeline(@NativeType("GLuint") int pipeline) {
        org.lwjgl.opengles.GLES31.glBindProgramPipeline(pipeline);
    }

    @Override public void nglDeleteProgramPipelines(int n, long pipelines) {
        org.lwjgl.opengles.GLES31.nglDeleteProgramPipelines(n, pipelines);
    }

    @Override public void glDeleteProgramPipelines(@NativeType("GLuint const *") IntBuffer pipelines) {
        org.lwjgl.opengles.GLES31.glDeleteProgramPipelines(pipelines);
    }

    @Override public void glDeleteProgramPipelines(@NativeType("GLuint const *") int pipeline) {
        org.lwjgl.opengles.GLES31.glDeleteProgramPipelines(pipeline);
    }

    @Override public void glDeleteProgramPipelines(@NativeType("GLuint const *") int[] pipelines) {
        org.lwjgl.opengles.GLES31.glDeleteProgramPipelines(pipelines);
    }

    @Override public void nglGenProgramPipelines(int n, long pipelines) {
        org.lwjgl.opengles.GLES31.nglGenProgramPipelines(n, pipelines);
    }

    @Override public void glGenProgramPipelines(@NativeType("GLuint *") IntBuffer pipelines) {
        org.lwjgl.opengles.GLES31.glGenProgramPipelines(pipelines);
    }

@NativeType("void")
    @Override public int glGenProgramPipelines() {
        return org.lwjgl.opengles.GLES31.glGenProgramPipelines();
    }

    @Override public void glGenProgramPipelines(@NativeType("GLuint *") int[] pipelines) {
        org.lwjgl.opengles.GLES31.glGenProgramPipelines(pipelines);
    }

@NativeType("GLboolean")
    @Override public boolean glIsProgramPipeline(@NativeType("GLuint") int pipeline) {
        return org.lwjgl.opengles.GLES31.glIsProgramPipeline(pipeline);
    }

    @Override public void nglGetProgramPipelineiv(int pipeline, int pname, long params) {
        org.lwjgl.opengles.GLES31.nglGetProgramPipelineiv(pipeline, pname, params);
    }

    @Override public void glGetProgramPipelineiv(@NativeType("GLuint") int pipeline, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengles.GLES31.glGetProgramPipelineiv(pipeline, pname, params);
    }

    @Override public void glGetProgramPipelineiv(@NativeType("GLuint") int pipeline, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengles.GLES31.glGetProgramPipelineiv(pipeline, pname, params);
    }

@NativeType("void")
    @Override public int glGetProgramPipelinei(@NativeType("GLuint") int pipeline, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengles.GLES31.glGetProgramPipelinei(pipeline, pname);
    }

    @Override public void glProgramUniform1i(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int v0) {
        org.lwjgl.opengles.GLES31.glProgramUniform1i(program, location, v0);
    }

    @Override public void glProgramUniform2i(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1) {
        org.lwjgl.opengles.GLES31.glProgramUniform2i(program, location, v0, v1);
    }

    @Override public void glProgramUniform3i(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1, @NativeType("GLint") int v2) {
        org.lwjgl.opengles.GLES31.glProgramUniform3i(program, location, v0, v1, v2);
    }

    @Override public void glProgramUniform4i(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1, @NativeType("GLint") int v2, @NativeType("GLint") int v3) {
        org.lwjgl.opengles.GLES31.glProgramUniform4i(program, location, v0, v1, v2, v3);
    }

    @Override public void glProgramUniform1ui(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int v0) {
        org.lwjgl.opengles.GLES31.glProgramUniform1ui(program, location, v0);
    }

    @Override public void glProgramUniform2ui(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1) {
        org.lwjgl.opengles.GLES31.glProgramUniform2ui(program, location, v0, v1);
    }

    @Override public void glProgramUniform3ui(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1, @NativeType("GLuint") int v2) {
        org.lwjgl.opengles.GLES31.glProgramUniform3ui(program, location, v0, v1, v2);
    }

    @Override public void glProgramUniform4ui(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1, @NativeType("GLuint") int v2, @NativeType("GLuint") int v3) {
        org.lwjgl.opengles.GLES31.glProgramUniform4ui(program, location, v0, v1, v2, v3);
    }

    @Override public void glProgramUniform1f(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float v0) {
        org.lwjgl.opengles.GLES31.glProgramUniform1f(program, location, v0);
    }

    @Override public void glProgramUniform2f(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1) {
        org.lwjgl.opengles.GLES31.glProgramUniform2f(program, location, v0, v1);
    }

    @Override public void glProgramUniform3f(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2) {
        org.lwjgl.opengles.GLES31.glProgramUniform3f(program, location, v0, v1, v2);
    }

    @Override public void glProgramUniform4f(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2, @NativeType("GLfloat") float v3) {
        org.lwjgl.opengles.GLES31.glProgramUniform4f(program, location, v0, v1, v2, v3);
    }

    @Override public void nglProgramUniform1iv(int program, int location, int count, long value) {
        org.lwjgl.opengles.GLES31.nglProgramUniform1iv(program, location, count, value);
    }

    @Override public void glProgramUniform1iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        org.lwjgl.opengles.GLES31.glProgramUniform1iv(program, location, value);
    }

    @Override public void glProgramUniform1iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        org.lwjgl.opengles.GLES31.glProgramUniform1iv(program, location, value);
    }

    @Override public void nglProgramUniform2iv(int program, int location, int count, long value) {
        org.lwjgl.opengles.GLES31.nglProgramUniform2iv(program, location, count, value);
    }

    @Override public void glProgramUniform2iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        org.lwjgl.opengles.GLES31.glProgramUniform2iv(program, location, value);
    }

    @Override public void glProgramUniform2iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        org.lwjgl.opengles.GLES31.glProgramUniform2iv(program, location, value);
    }

    @Override public void nglProgramUniform3iv(int program, int location, int count, long value) {
        org.lwjgl.opengles.GLES31.nglProgramUniform3iv(program, location, count, value);
    }

    @Override public void glProgramUniform3iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        org.lwjgl.opengles.GLES31.glProgramUniform3iv(program, location, value);
    }

    @Override public void glProgramUniform3iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        org.lwjgl.opengles.GLES31.glProgramUniform3iv(program, location, value);
    }

    @Override public void nglProgramUniform4iv(int program, int location, int count, long value) {
        org.lwjgl.opengles.GLES31.nglProgramUniform4iv(program, location, count, value);
    }

    @Override public void glProgramUniform4iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        org.lwjgl.opengles.GLES31.glProgramUniform4iv(program, location, value);
    }

    @Override public void glProgramUniform4iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        org.lwjgl.opengles.GLES31.glProgramUniform4iv(program, location, value);
    }

    @Override public void nglProgramUniform1uiv(int program, int location, int count, long value) {
        org.lwjgl.opengles.GLES31.nglProgramUniform1uiv(program, location, count, value);
    }

    @Override public void glProgramUniform1uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        org.lwjgl.opengles.GLES31.glProgramUniform1uiv(program, location, value);
    }

    @Override public void glProgramUniform1uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        org.lwjgl.opengles.GLES31.glProgramUniform1uiv(program, location, value);
    }

    @Override public void nglProgramUniform2uiv(int program, int location, int count, long value) {
        org.lwjgl.opengles.GLES31.nglProgramUniform2uiv(program, location, count, value);
    }

    @Override public void glProgramUniform2uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        org.lwjgl.opengles.GLES31.glProgramUniform2uiv(program, location, value);
    }

    @Override public void glProgramUniform2uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        org.lwjgl.opengles.GLES31.glProgramUniform2uiv(program, location, value);
    }

    @Override public void nglProgramUniform3uiv(int program, int location, int count, long value) {
        org.lwjgl.opengles.GLES31.nglProgramUniform3uiv(program, location, count, value);
    }

    @Override public void glProgramUniform3uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        org.lwjgl.opengles.GLES31.glProgramUniform3uiv(program, location, value);
    }

    @Override public void glProgramUniform3uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        org.lwjgl.opengles.GLES31.glProgramUniform3uiv(program, location, value);
    }

    @Override public void nglProgramUniform4uiv(int program, int location, int count, long value) {
        org.lwjgl.opengles.GLES31.nglProgramUniform4uiv(program, location, count, value);
    }

    @Override public void glProgramUniform4uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        org.lwjgl.opengles.GLES31.glProgramUniform4uiv(program, location, value);
    }

    @Override public void glProgramUniform4uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        org.lwjgl.opengles.GLES31.glProgramUniform4uiv(program, location, value);
    }

    @Override public void nglProgramUniform1fv(int program, int location, int count, long value) {
        org.lwjgl.opengles.GLES31.nglProgramUniform1fv(program, location, count, value);
    }

    @Override public void glProgramUniform1fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengles.GLES31.glProgramUniform1fv(program, location, value);
    }

    @Override public void glProgramUniform1fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengles.GLES31.glProgramUniform1fv(program, location, value);
    }

    @Override public void nglProgramUniform2fv(int program, int location, int count, long value) {
        org.lwjgl.opengles.GLES31.nglProgramUniform2fv(program, location, count, value);
    }

    @Override public void glProgramUniform2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengles.GLES31.glProgramUniform2fv(program, location, value);
    }

    @Override public void glProgramUniform2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengles.GLES31.glProgramUniform2fv(program, location, value);
    }

    @Override public void nglProgramUniform3fv(int program, int location, int count, long value) {
        org.lwjgl.opengles.GLES31.nglProgramUniform3fv(program, location, count, value);
    }

    @Override public void glProgramUniform3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengles.GLES31.glProgramUniform3fv(program, location, value);
    }

    @Override public void glProgramUniform3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengles.GLES31.glProgramUniform3fv(program, location, value);
    }

    @Override public void nglProgramUniform4fv(int program, int location, int count, long value) {
        org.lwjgl.opengles.GLES31.nglProgramUniform4fv(program, location, count, value);
    }

    @Override public void glProgramUniform4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengles.GLES31.glProgramUniform4fv(program, location, value);
    }

    @Override public void glProgramUniform4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengles.GLES31.glProgramUniform4fv(program, location, value);
    }

    @Override public void nglProgramUniformMatrix2fv(int program, int location, int count, boolean transpose, long value) {
        org.lwjgl.opengles.GLES31.nglProgramUniformMatrix2fv(program, location, count, transpose, value);
    }

    @Override public void glProgramUniformMatrix2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengles.GLES31.glProgramUniformMatrix2fv(program, location, transpose, value);
    }

    @Override public void glProgramUniformMatrix2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengles.GLES31.glProgramUniformMatrix2fv(program, location, transpose, value);
    }

    @Override public void nglProgramUniformMatrix3fv(int program, int location, int count, boolean transpose, long value) {
        org.lwjgl.opengles.GLES31.nglProgramUniformMatrix3fv(program, location, count, transpose, value);
    }

    @Override public void glProgramUniformMatrix3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengles.GLES31.glProgramUniformMatrix3fv(program, location, transpose, value);
    }

    @Override public void glProgramUniformMatrix3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengles.GLES31.glProgramUniformMatrix3fv(program, location, transpose, value);
    }

    @Override public void nglProgramUniformMatrix4fv(int program, int location, int count, boolean transpose, long value) {
        org.lwjgl.opengles.GLES31.nglProgramUniformMatrix4fv(program, location, count, transpose, value);
    }

    @Override public void glProgramUniformMatrix4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengles.GLES31.glProgramUniformMatrix4fv(program, location, transpose, value);
    }

    @Override public void glProgramUniformMatrix4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengles.GLES31.glProgramUniformMatrix4fv(program, location, transpose, value);
    }

    @Override public void nglProgramUniformMatrix2x3fv(int program, int location, int count, boolean transpose, long value) {
        org.lwjgl.opengles.GLES31.nglProgramUniformMatrix2x3fv(program, location, count, transpose, value);
    }

    @Override public void glProgramUniformMatrix2x3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengles.GLES31.glProgramUniformMatrix2x3fv(program, location, transpose, value);
    }

    @Override public void glProgramUniformMatrix2x3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengles.GLES31.glProgramUniformMatrix2x3fv(program, location, transpose, value);
    }

    @Override public void nglProgramUniformMatrix3x2fv(int program, int location, int count, boolean transpose, long value) {
        org.lwjgl.opengles.GLES31.nglProgramUniformMatrix3x2fv(program, location, count, transpose, value);
    }

    @Override public void glProgramUniformMatrix3x2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengles.GLES31.glProgramUniformMatrix3x2fv(program, location, transpose, value);
    }

    @Override public void glProgramUniformMatrix3x2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengles.GLES31.glProgramUniformMatrix3x2fv(program, location, transpose, value);
    }

    @Override public void nglProgramUniformMatrix2x4fv(int program, int location, int count, boolean transpose, long value) {
        org.lwjgl.opengles.GLES31.nglProgramUniformMatrix2x4fv(program, location, count, transpose, value);
    }

    @Override public void glProgramUniformMatrix2x4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengles.GLES31.glProgramUniformMatrix2x4fv(program, location, transpose, value);
    }

    @Override public void glProgramUniformMatrix2x4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengles.GLES31.glProgramUniformMatrix2x4fv(program, location, transpose, value);
    }

    @Override public void nglProgramUniformMatrix4x2fv(int program, int location, int count, boolean transpose, long value) {
        org.lwjgl.opengles.GLES31.nglProgramUniformMatrix4x2fv(program, location, count, transpose, value);
    }

    @Override public void glProgramUniformMatrix4x2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengles.GLES31.glProgramUniformMatrix4x2fv(program, location, transpose, value);
    }

    @Override public void glProgramUniformMatrix4x2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengles.GLES31.glProgramUniformMatrix4x2fv(program, location, transpose, value);
    }

    @Override public void nglProgramUniformMatrix3x4fv(int program, int location, int count, boolean transpose, long value) {
        org.lwjgl.opengles.GLES31.nglProgramUniformMatrix3x4fv(program, location, count, transpose, value);
    }

    @Override public void glProgramUniformMatrix3x4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengles.GLES31.glProgramUniformMatrix3x4fv(program, location, transpose, value);
    }

    @Override public void glProgramUniformMatrix3x4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengles.GLES31.glProgramUniformMatrix3x4fv(program, location, transpose, value);
    }

    @Override public void nglProgramUniformMatrix4x3fv(int program, int location, int count, boolean transpose, long value) {
        org.lwjgl.opengles.GLES31.nglProgramUniformMatrix4x3fv(program, location, count, transpose, value);
    }

    @Override public void glProgramUniformMatrix4x3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengles.GLES31.glProgramUniformMatrix4x3fv(program, location, transpose, value);
    }

    @Override public void glProgramUniformMatrix4x3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengles.GLES31.glProgramUniformMatrix4x3fv(program, location, transpose, value);
    }

    @Override public void glValidateProgramPipeline(@NativeType("GLuint") int pipeline) {
        org.lwjgl.opengles.GLES31.glValidateProgramPipeline(pipeline);
    }

    @Override public void nglGetProgramPipelineInfoLog(int pipeline, int bufSize, long length, long infoLog) {
        org.lwjgl.opengles.GLES31.nglGetProgramPipelineInfoLog(pipeline, bufSize, length, infoLog);
    }

    @Override public void glGetProgramPipelineInfoLog(@NativeType("GLuint") int pipeline, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLchar *") ByteBuffer infoLog) {
        org.lwjgl.opengles.GLES31.glGetProgramPipelineInfoLog(pipeline, length, infoLog);
    }

@NativeType("void")
    @Override public String glGetProgramPipelineInfoLog(@NativeType("GLuint") int pipeline, @NativeType("GLsizei") int bufSize) {
        return org.lwjgl.opengles.GLES31.glGetProgramPipelineInfoLog(pipeline, bufSize);
    }

@NativeType("void")
    @Override public String glGetProgramPipelineInfoLog(@NativeType("GLuint") int pipeline) {
        return org.lwjgl.opengles.GLES31.glGetProgramPipelineInfoLog(pipeline);
    }

    @Override public void glGetProgramPipelineInfoLog(@NativeType("GLuint") int pipeline, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLchar *") ByteBuffer infoLog) {
        org.lwjgl.opengles.GLES31.glGetProgramPipelineInfoLog(pipeline, length, infoLog);
    }

    @Override public void glBindImageTexture(@NativeType("GLuint") int unit, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLboolean") boolean layered, @NativeType("GLint") int layer, @NativeType("GLenum") int access, @NativeType("GLenum") int format) {
        org.lwjgl.opengles.GLES31.glBindImageTexture(unit, texture, level, layered, layer, access, format);
    }

    @Override public void nglGetBooleani_v(int target, int index, long data) {
        org.lwjgl.opengles.GLES31.nglGetBooleani_v(target, index, data);
    }

    @Override public void glGetBooleani_v(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLboolean *") ByteBuffer data) {
        org.lwjgl.opengles.GLES31.glGetBooleani_v(target, index, data);
    }

@NativeType("void")
    @Override public boolean glGetBooleani(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        return org.lwjgl.opengles.GLES31.glGetBooleani(target, index);
    }

    @Override public void glMemoryBarrier(@NativeType("GLbitfield") int barriers) {
        org.lwjgl.opengles.GLES31.glMemoryBarrier(barriers);
    }

    @Override public void glMemoryBarrierByRegion(@NativeType("GLbitfield") int barriers) {
        org.lwjgl.opengles.GLES31.glMemoryBarrierByRegion(barriers);
    }

    @Override public void glTexStorage2DMultisample(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLboolean") boolean fixedsamplelocations) {
        org.lwjgl.opengles.GLES31.glTexStorage2DMultisample(target, samples, internalformat, width, height, fixedsamplelocations);
    }

    @Override public void nglGetMultisamplefv(int pname, int index, long val) {
        org.lwjgl.opengles.GLES31.nglGetMultisamplefv(pname, index, val);
    }

    @Override public void glGetMultisamplefv(@NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLfloat *") FloatBuffer val) {
        org.lwjgl.opengles.GLES31.glGetMultisamplefv(pname, index, val);
    }

    @Override public void glGetMultisamplefv(@NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLfloat *") float[] val) {
        org.lwjgl.opengles.GLES31.glGetMultisamplefv(pname, index, val);
    }

@NativeType("void")
    @Override public float glGetMultisamplef(@NativeType("GLenum") int pname, @NativeType("GLuint") int index) {
        return org.lwjgl.opengles.GLES31.glGetMultisamplef(pname, index);
    }

    @Override public void glSampleMaski(@NativeType("GLuint") int maskNumber, @NativeType("GLbitfield") int mask) {
        org.lwjgl.opengles.GLES31.glSampleMaski(maskNumber, mask);
    }

    @Override public void nglGetTexLevelParameteriv(int target, int level, int pname, long params) {
        org.lwjgl.opengles.GLES31.nglGetTexLevelParameteriv(target, level, pname, params);
    }

    @Override public void glGetTexLevelParameteriv(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengles.GLES31.glGetTexLevelParameteriv(target, level, pname, params);
    }

    @Override public void glGetTexLevelParameteriv(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengles.GLES31.glGetTexLevelParameteriv(target, level, pname, params);
    }

@NativeType("void")
    @Override public int glGetTexLevelParameteri(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengles.GLES31.glGetTexLevelParameteri(target, level, pname);
    }

    @Override public void nglGetTexLevelParameterfv(int target, int level, int pname, long params) {
        org.lwjgl.opengles.GLES31.nglGetTexLevelParameterfv(target, level, pname, params);
    }

    @Override public void glGetTexLevelParameterfv(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        org.lwjgl.opengles.GLES31.glGetTexLevelParameterfv(target, level, pname, params);
    }

    @Override public void glGetTexLevelParameterfv(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        org.lwjgl.opengles.GLES31.glGetTexLevelParameterfv(target, level, pname, params);
    }

@NativeType("void")
    @Override public float glGetTexLevelParameterf(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengles.GLES31.glGetTexLevelParameterf(target, level, pname);
    }

    @Override public void glBindVertexBuffer(@NativeType("GLuint") int bindingindex, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizei") int stride) {
        org.lwjgl.opengles.GLES31.glBindVertexBuffer(bindingindex, buffer, offset, stride);
    }

    @Override public void glVertexAttribFormat(@NativeType("GLuint") int attribindex, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int relativeoffset) {
        org.lwjgl.opengles.GLES31.glVertexAttribFormat(attribindex, size, type, normalized, relativeoffset);
    }

    @Override public void glVertexAttribIFormat(@NativeType("GLuint") int attribindex, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLuint") int relativeoffset) {
        org.lwjgl.opengles.GLES31.glVertexAttribIFormat(attribindex, size, type, relativeoffset);
    }

    @Override public void glVertexAttribBinding(@NativeType("GLuint") int attribindex, @NativeType("GLuint") int bindingindex) {
        org.lwjgl.opengles.GLES31.glVertexAttribBinding(attribindex, bindingindex);
    }

    @Override public void glVertexBindingDivisor(@NativeType("GLuint") int bindingindex, @NativeType("GLuint") int divisor) {
        org.lwjgl.opengles.GLES31.glVertexBindingDivisor(bindingindex, divisor);
    }

}
