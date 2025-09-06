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

    @Override public void glDispatchCompute(int num_groups_x, int num_groups_y, int num_groups_z) {
        org.lwjgl.opengles.GLES31.glDispatchCompute(num_groups_x, num_groups_y, num_groups_z);
    }

    @Override public void glDispatchComputeIndirect(long indirect) {
        org.lwjgl.opengles.GLES31.glDispatchComputeIndirect(indirect);
    }

    @Override public void nglDrawArraysIndirect(int mode, long indirect) {
        org.lwjgl.opengles.GLES31.nglDrawArraysIndirect(mode, indirect);
    }

    @Override public void glDrawArraysIndirect(int mode, ByteBuffer indirect) {
        org.lwjgl.opengles.GLES31.glDrawArraysIndirect(mode, indirect);
    }

    @Override public void glDrawArraysIndirect(int mode, long indirect) {
        org.lwjgl.opengles.GLES31.glDrawArraysIndirect(mode, indirect);
    }

    @Override public void glDrawArraysIndirect(int mode, IntBuffer indirect) {
        org.lwjgl.opengles.GLES31.glDrawArraysIndirect(mode, indirect);
    }

    @Override public void glDrawArraysIndirect(int mode, int[] indirect) {
        org.lwjgl.opengles.GLES31.glDrawArraysIndirect(mode, indirect);
    }

    @Override public void nglDrawElementsIndirect(int mode, int type, long indirect) {
        org.lwjgl.opengles.GLES31.nglDrawElementsIndirect(mode, type, indirect);
    }

    @Override public void glDrawElementsIndirect(int mode, int type, ByteBuffer indirect) {
        org.lwjgl.opengles.GLES31.glDrawElementsIndirect(mode, type, indirect);
    }

    @Override public void glDrawElementsIndirect(int mode, int type, long indirect) {
        org.lwjgl.opengles.GLES31.glDrawElementsIndirect(mode, type, indirect);
    }

    @Override public void glDrawElementsIndirect(int mode, int type, IntBuffer indirect) {
        org.lwjgl.opengles.GLES31.glDrawElementsIndirect(mode, type, indirect);
    }

    @Override public void glDrawElementsIndirect(int mode, int type, int[] indirect) {
        org.lwjgl.opengles.GLES31.glDrawElementsIndirect(mode, type, indirect);
    }

    @Override public void glFramebufferParameteri(int target, int pname, int param) {
        org.lwjgl.opengles.GLES31.glFramebufferParameteri(target, pname, param);
    }

    @Override public void nglGetFramebufferParameteriv(int target, int pname, long params) {
        org.lwjgl.opengles.GLES31.nglGetFramebufferParameteriv(target, pname, params);
    }

    @Override public void glGetFramebufferParameteriv(int target, int pname, IntBuffer params) {
        org.lwjgl.opengles.GLES31.glGetFramebufferParameteriv(target, pname, params);
    }

    @Override public void glGetFramebufferParameteriv(int target, int pname, int[] params) {
        org.lwjgl.opengles.GLES31.glGetFramebufferParameteriv(target, pname, params);
    }

    @Override public int glGetFramebufferParameteri(int target, int pname) {
        return org.lwjgl.opengles.GLES31.glGetFramebufferParameteri(target, pname);
    }

    @Override public void nglGetProgramInterfaceiv(int program, int programInterface, int pname, long params) {
        org.lwjgl.opengles.GLES31.nglGetProgramInterfaceiv(program, programInterface, pname, params);
    }

    @Override public void glGetProgramInterfaceiv(int program, int programInterface, int pname, IntBuffer params) {
        org.lwjgl.opengles.GLES31.glGetProgramInterfaceiv(program, programInterface, pname, params);
    }

    @Override public void glGetProgramInterfaceiv(int program, int programInterface, int pname, int[] params) {
        org.lwjgl.opengles.GLES31.glGetProgramInterfaceiv(program, programInterface, pname, params);
    }

    @Override public int glGetProgramInterfacei(int program, int programInterface, int pname) {
        return org.lwjgl.opengles.GLES31.glGetProgramInterfacei(program, programInterface, pname);
    }

    @Override public int nglGetProgramResourceIndex(int program, int programInterface, long name) {
        return org.lwjgl.opengles.GLES31.nglGetProgramResourceIndex(program, programInterface, name);
    }

    @Override public int glGetProgramResourceIndex(int program, int programInterface, ByteBuffer name) {
        return org.lwjgl.opengles.GLES31.glGetProgramResourceIndex(program, programInterface, name);
    }

    @Override public int glGetProgramResourceIndex(int program, int programInterface, CharSequence name) {
        return org.lwjgl.opengles.GLES31.glGetProgramResourceIndex(program, programInterface, name);
    }

    @Override public void nglGetProgramResourceName(int program, int programInterface, int index, int bufSize, long length, long name) {
        org.lwjgl.opengles.GLES31.nglGetProgramResourceName(program, programInterface, index, bufSize, length, name);
    }

    @Override public void glGetProgramResourceName(int program, int programInterface, int index, @Nullable IntBuffer length, ByteBuffer name) {
        org.lwjgl.opengles.GLES31.glGetProgramResourceName(program, programInterface, index, length, name);
    }

    @Override public String glGetProgramResourceName(int program, int programInterface, int index, int bufSize) {
        return org.lwjgl.opengles.GLES31.glGetProgramResourceName(program, programInterface, index, bufSize);
    }

    @Override public String glGetProgramResourceName(int program, int programInterface, int index) {
        return org.lwjgl.opengles.GLES31.glGetProgramResourceName(program, programInterface, index);
    }

    @Override public void glGetProgramResourceName(int program, int programInterface, int index, @Nullable int[] length, ByteBuffer name) {
        org.lwjgl.opengles.GLES31.glGetProgramResourceName(program, programInterface, index, length, name);
    }

    @Override public void nglGetProgramResourceiv(int program, int programInterface, int index, int propCount, long props, int bufSize, long length, long params) {
        org.lwjgl.opengles.GLES31.nglGetProgramResourceiv(program, programInterface, index, propCount, props, bufSize, length, params);
    }

    @Override public void glGetProgramResourceiv(int program, int programInterface, int index, IntBuffer props, @Nullable IntBuffer length, IntBuffer params) {
        org.lwjgl.opengles.GLES31.glGetProgramResourceiv(program, programInterface, index, props, length, params);
    }

    @Override public void glGetProgramResourceiv(int program, int programInterface, int index, int[] props, @Nullable int[] length, int[] params) {
        org.lwjgl.opengles.GLES31.glGetProgramResourceiv(program, programInterface, index, props, length, params);
    }

    @Override public int nglGetProgramResourceLocation(int program, int programInterface, long name) {
        return org.lwjgl.opengles.GLES31.nglGetProgramResourceLocation(program, programInterface, name);
    }

    @Override public int glGetProgramResourceLocation(int program, int programInterface, ByteBuffer name) {
        return org.lwjgl.opengles.GLES31.glGetProgramResourceLocation(program, programInterface, name);
    }

    @Override public int glGetProgramResourceLocation(int program, int programInterface, CharSequence name) {
        return org.lwjgl.opengles.GLES31.glGetProgramResourceLocation(program, programInterface, name);
    }

    @Override public void glUseProgramStages(int pipeline, int stages, int program) {
        org.lwjgl.opengles.GLES31.glUseProgramStages(pipeline, stages, program);
    }

    @Override public void glActiveShaderProgram(int pipeline, int program) {
        org.lwjgl.opengles.GLES31.glActiveShaderProgram(pipeline, program);
    }

    @Override public int nglCreateShaderProgramv(int type, int count, long strings) {
        return org.lwjgl.opengles.GLES31.nglCreateShaderProgramv(type, count, strings);
    }

    @Override public int glCreateShaderProgramv(int type, PointerBuffer strings) {
        return org.lwjgl.opengles.GLES31.glCreateShaderProgramv(type, strings);
    }

    @Override public int glCreateShaderProgramv(int type, CharSequence... strings) {
        return org.lwjgl.opengles.GLES31.glCreateShaderProgramv(type, strings);
    }

    @Override public int glCreateShaderProgramv(int type, CharSequence string) {
        return org.lwjgl.opengles.GLES31.glCreateShaderProgramv(type, string);
    }

    @Override public void glBindProgramPipeline(int pipeline) {
        org.lwjgl.opengles.GLES31.glBindProgramPipeline(pipeline);
    }

    @Override public void nglDeleteProgramPipelines(int n, long pipelines) {
        org.lwjgl.opengles.GLES31.nglDeleteProgramPipelines(n, pipelines);
    }

    @Override public void glDeleteProgramPipelines(IntBuffer pipelines) {
        org.lwjgl.opengles.GLES31.glDeleteProgramPipelines(pipelines);
    }

    @Override public void glDeleteProgramPipelines(int pipeline) {
        org.lwjgl.opengles.GLES31.glDeleteProgramPipelines(pipeline);
    }

    @Override public void glDeleteProgramPipelines(int[] pipelines) {
        org.lwjgl.opengles.GLES31.glDeleteProgramPipelines(pipelines);
    }

    @Override public void nglGenProgramPipelines(int n, long pipelines) {
        org.lwjgl.opengles.GLES31.nglGenProgramPipelines(n, pipelines);
    }

    @Override public void glGenProgramPipelines(IntBuffer pipelines) {
        org.lwjgl.opengles.GLES31.glGenProgramPipelines(pipelines);
    }

    @Override public int glGenProgramPipelines() {
        return org.lwjgl.opengles.GLES31.glGenProgramPipelines();
    }

    @Override public void glGenProgramPipelines(int[] pipelines) {
        org.lwjgl.opengles.GLES31.glGenProgramPipelines(pipelines);
    }

    @Override public boolean glIsProgramPipeline(int pipeline) {
        return org.lwjgl.opengles.GLES31.glIsProgramPipeline(pipeline);
    }

    @Override public void nglGetProgramPipelineiv(int pipeline, int pname, long params) {
        org.lwjgl.opengles.GLES31.nglGetProgramPipelineiv(pipeline, pname, params);
    }

    @Override public void glGetProgramPipelineiv(int pipeline, int pname, IntBuffer params) {
        org.lwjgl.opengles.GLES31.glGetProgramPipelineiv(pipeline, pname, params);
    }

    @Override public void glGetProgramPipelineiv(int pipeline, int pname, int[] params) {
        org.lwjgl.opengles.GLES31.glGetProgramPipelineiv(pipeline, pname, params);
    }

    @Override public int glGetProgramPipelinei(int pipeline, int pname) {
        return org.lwjgl.opengles.GLES31.glGetProgramPipelinei(pipeline, pname);
    }

    @Override public void glProgramUniform1i(int program, int location, int v0) {
        org.lwjgl.opengles.GLES31.glProgramUniform1i(program, location, v0);
    }

    @Override public void glProgramUniform2i(int program, int location, int v0, int v1) {
        org.lwjgl.opengles.GLES31.glProgramUniform2i(program, location, v0, v1);
    }

    @Override public void glProgramUniform3i(int program, int location, int v0, int v1, int v2) {
        org.lwjgl.opengles.GLES31.glProgramUniform3i(program, location, v0, v1, v2);
    }

    @Override public void glProgramUniform4i(int program, int location, int v0, int v1, int v2, int v3) {
        org.lwjgl.opengles.GLES31.glProgramUniform4i(program, location, v0, v1, v2, v3);
    }

    @Override public void glProgramUniform1ui(int program, int location, int v0) {
        org.lwjgl.opengles.GLES31.glProgramUniform1ui(program, location, v0);
    }

    @Override public void glProgramUniform2ui(int program, int location, int v0, int v1) {
        org.lwjgl.opengles.GLES31.glProgramUniform2ui(program, location, v0, v1);
    }

    @Override public void glProgramUniform3ui(int program, int location, int v0, int v1, int v2) {
        org.lwjgl.opengles.GLES31.glProgramUniform3ui(program, location, v0, v1, v2);
    }

    @Override public void glProgramUniform4ui(int program, int location, int v0, int v1, int v2, int v3) {
        org.lwjgl.opengles.GLES31.glProgramUniform4ui(program, location, v0, v1, v2, v3);
    }

    @Override public void glProgramUniform1f(int program, int location, float v0) {
        org.lwjgl.opengles.GLES31.glProgramUniform1f(program, location, v0);
    }

    @Override public void glProgramUniform2f(int program, int location, float v0, float v1) {
        org.lwjgl.opengles.GLES31.glProgramUniform2f(program, location, v0, v1);
    }

    @Override public void glProgramUniform3f(int program, int location, float v0, float v1, float v2) {
        org.lwjgl.opengles.GLES31.glProgramUniform3f(program, location, v0, v1, v2);
    }

    @Override public void glProgramUniform4f(int program, int location, float v0, float v1, float v2, float v3) {
        org.lwjgl.opengles.GLES31.glProgramUniform4f(program, location, v0, v1, v2, v3);
    }

    @Override public void nglProgramUniform1iv(int program, int location, int count, long value) {
        org.lwjgl.opengles.GLES31.nglProgramUniform1iv(program, location, count, value);
    }

    @Override public void glProgramUniform1iv(int program, int location, IntBuffer value) {
        org.lwjgl.opengles.GLES31.glProgramUniform1iv(program, location, value);
    }

    @Override public void glProgramUniform1iv(int program, int location, int[] value) {
        org.lwjgl.opengles.GLES31.glProgramUniform1iv(program, location, value);
    }

    @Override public void nglProgramUniform2iv(int program, int location, int count, long value) {
        org.lwjgl.opengles.GLES31.nglProgramUniform2iv(program, location, count, value);
    }

    @Override public void glProgramUniform2iv(int program, int location, IntBuffer value) {
        org.lwjgl.opengles.GLES31.glProgramUniform2iv(program, location, value);
    }

    @Override public void glProgramUniform2iv(int program, int location, int[] value) {
        org.lwjgl.opengles.GLES31.glProgramUniform2iv(program, location, value);
    }

    @Override public void nglProgramUniform3iv(int program, int location, int count, long value) {
        org.lwjgl.opengles.GLES31.nglProgramUniform3iv(program, location, count, value);
    }

    @Override public void glProgramUniform3iv(int program, int location, IntBuffer value) {
        org.lwjgl.opengles.GLES31.glProgramUniform3iv(program, location, value);
    }

    @Override public void glProgramUniform3iv(int program, int location, int[] value) {
        org.lwjgl.opengles.GLES31.glProgramUniform3iv(program, location, value);
    }

    @Override public void nglProgramUniform4iv(int program, int location, int count, long value) {
        org.lwjgl.opengles.GLES31.nglProgramUniform4iv(program, location, count, value);
    }

    @Override public void glProgramUniform4iv(int program, int location, IntBuffer value) {
        org.lwjgl.opengles.GLES31.glProgramUniform4iv(program, location, value);
    }

    @Override public void glProgramUniform4iv(int program, int location, int[] value) {
        org.lwjgl.opengles.GLES31.glProgramUniform4iv(program, location, value);
    }

    @Override public void nglProgramUniform1uiv(int program, int location, int count, long value) {
        org.lwjgl.opengles.GLES31.nglProgramUniform1uiv(program, location, count, value);
    }

    @Override public void glProgramUniform1uiv(int program, int location, IntBuffer value) {
        org.lwjgl.opengles.GLES31.glProgramUniform1uiv(program, location, value);
    }

    @Override public void glProgramUniform1uiv(int program, int location, int[] value) {
        org.lwjgl.opengles.GLES31.glProgramUniform1uiv(program, location, value);
    }

    @Override public void nglProgramUniform2uiv(int program, int location, int count, long value) {
        org.lwjgl.opengles.GLES31.nglProgramUniform2uiv(program, location, count, value);
    }

    @Override public void glProgramUniform2uiv(int program, int location, IntBuffer value) {
        org.lwjgl.opengles.GLES31.glProgramUniform2uiv(program, location, value);
    }

    @Override public void glProgramUniform2uiv(int program, int location, int[] value) {
        org.lwjgl.opengles.GLES31.glProgramUniform2uiv(program, location, value);
    }

    @Override public void nglProgramUniform3uiv(int program, int location, int count, long value) {
        org.lwjgl.opengles.GLES31.nglProgramUniform3uiv(program, location, count, value);
    }

    @Override public void glProgramUniform3uiv(int program, int location, IntBuffer value) {
        org.lwjgl.opengles.GLES31.glProgramUniform3uiv(program, location, value);
    }

    @Override public void glProgramUniform3uiv(int program, int location, int[] value) {
        org.lwjgl.opengles.GLES31.glProgramUniform3uiv(program, location, value);
    }

    @Override public void nglProgramUniform4uiv(int program, int location, int count, long value) {
        org.lwjgl.opengles.GLES31.nglProgramUniform4uiv(program, location, count, value);
    }

    @Override public void glProgramUniform4uiv(int program, int location, IntBuffer value) {
        org.lwjgl.opengles.GLES31.glProgramUniform4uiv(program, location, value);
    }

    @Override public void glProgramUniform4uiv(int program, int location, int[] value) {
        org.lwjgl.opengles.GLES31.glProgramUniform4uiv(program, location, value);
    }

    @Override public void nglProgramUniform1fv(int program, int location, int count, long value) {
        org.lwjgl.opengles.GLES31.nglProgramUniform1fv(program, location, count, value);
    }

    @Override public void glProgramUniform1fv(int program, int location, FloatBuffer value) {
        org.lwjgl.opengles.GLES31.glProgramUniform1fv(program, location, value);
    }

    @Override public void glProgramUniform1fv(int program, int location, float[] value) {
        org.lwjgl.opengles.GLES31.glProgramUniform1fv(program, location, value);
    }

    @Override public void nglProgramUniform2fv(int program, int location, int count, long value) {
        org.lwjgl.opengles.GLES31.nglProgramUniform2fv(program, location, count, value);
    }

    @Override public void glProgramUniform2fv(int program, int location, FloatBuffer value) {
        org.lwjgl.opengles.GLES31.glProgramUniform2fv(program, location, value);
    }

    @Override public void glProgramUniform2fv(int program, int location, float[] value) {
        org.lwjgl.opengles.GLES31.glProgramUniform2fv(program, location, value);
    }

    @Override public void nglProgramUniform3fv(int program, int location, int count, long value) {
        org.lwjgl.opengles.GLES31.nglProgramUniform3fv(program, location, count, value);
    }

    @Override public void glProgramUniform3fv(int program, int location, FloatBuffer value) {
        org.lwjgl.opengles.GLES31.glProgramUniform3fv(program, location, value);
    }

    @Override public void glProgramUniform3fv(int program, int location, float[] value) {
        org.lwjgl.opengles.GLES31.glProgramUniform3fv(program, location, value);
    }

    @Override public void nglProgramUniform4fv(int program, int location, int count, long value) {
        org.lwjgl.opengles.GLES31.nglProgramUniform4fv(program, location, count, value);
    }

    @Override public void glProgramUniform4fv(int program, int location, FloatBuffer value) {
        org.lwjgl.opengles.GLES31.glProgramUniform4fv(program, location, value);
    }

    @Override public void glProgramUniform4fv(int program, int location, float[] value) {
        org.lwjgl.opengles.GLES31.glProgramUniform4fv(program, location, value);
    }

    @Override public void nglProgramUniformMatrix2fv(int program, int location, int count, boolean transpose, long value) {
        org.lwjgl.opengles.GLES31.nglProgramUniformMatrix2fv(program, location, count, transpose, value);
    }

    @Override public void glProgramUniformMatrix2fv(int program, int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengles.GLES31.glProgramUniformMatrix2fv(program, location, transpose, value);
    }

    @Override public void glProgramUniformMatrix2fv(int program, int location, boolean transpose, float[] value) {
        org.lwjgl.opengles.GLES31.glProgramUniformMatrix2fv(program, location, transpose, value);
    }

    @Override public void nglProgramUniformMatrix3fv(int program, int location, int count, boolean transpose, long value) {
        org.lwjgl.opengles.GLES31.nglProgramUniformMatrix3fv(program, location, count, transpose, value);
    }

    @Override public void glProgramUniformMatrix3fv(int program, int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengles.GLES31.glProgramUniformMatrix3fv(program, location, transpose, value);
    }

    @Override public void glProgramUniformMatrix3fv(int program, int location, boolean transpose, float[] value) {
        org.lwjgl.opengles.GLES31.glProgramUniformMatrix3fv(program, location, transpose, value);
    }

    @Override public void nglProgramUniformMatrix4fv(int program, int location, int count, boolean transpose, long value) {
        org.lwjgl.opengles.GLES31.nglProgramUniformMatrix4fv(program, location, count, transpose, value);
    }

    @Override public void glProgramUniformMatrix4fv(int program, int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengles.GLES31.glProgramUniformMatrix4fv(program, location, transpose, value);
    }

    @Override public void glProgramUniformMatrix4fv(int program, int location, boolean transpose, float[] value) {
        org.lwjgl.opengles.GLES31.glProgramUniformMatrix4fv(program, location, transpose, value);
    }

    @Override public void nglProgramUniformMatrix2x3fv(int program, int location, int count, boolean transpose, long value) {
        org.lwjgl.opengles.GLES31.nglProgramUniformMatrix2x3fv(program, location, count, transpose, value);
    }

    @Override public void glProgramUniformMatrix2x3fv(int program, int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengles.GLES31.glProgramUniformMatrix2x3fv(program, location, transpose, value);
    }

    @Override public void glProgramUniformMatrix2x3fv(int program, int location, boolean transpose, float[] value) {
        org.lwjgl.opengles.GLES31.glProgramUniformMatrix2x3fv(program, location, transpose, value);
    }

    @Override public void nglProgramUniformMatrix3x2fv(int program, int location, int count, boolean transpose, long value) {
        org.lwjgl.opengles.GLES31.nglProgramUniformMatrix3x2fv(program, location, count, transpose, value);
    }

    @Override public void glProgramUniformMatrix3x2fv(int program, int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengles.GLES31.glProgramUniformMatrix3x2fv(program, location, transpose, value);
    }

    @Override public void glProgramUniformMatrix3x2fv(int program, int location, boolean transpose, float[] value) {
        org.lwjgl.opengles.GLES31.glProgramUniformMatrix3x2fv(program, location, transpose, value);
    }

    @Override public void nglProgramUniformMatrix2x4fv(int program, int location, int count, boolean transpose, long value) {
        org.lwjgl.opengles.GLES31.nglProgramUniformMatrix2x4fv(program, location, count, transpose, value);
    }

    @Override public void glProgramUniformMatrix2x4fv(int program, int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengles.GLES31.glProgramUniformMatrix2x4fv(program, location, transpose, value);
    }

    @Override public void glProgramUniformMatrix2x4fv(int program, int location, boolean transpose, float[] value) {
        org.lwjgl.opengles.GLES31.glProgramUniformMatrix2x4fv(program, location, transpose, value);
    }

    @Override public void nglProgramUniformMatrix4x2fv(int program, int location, int count, boolean transpose, long value) {
        org.lwjgl.opengles.GLES31.nglProgramUniformMatrix4x2fv(program, location, count, transpose, value);
    }

    @Override public void glProgramUniformMatrix4x2fv(int program, int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengles.GLES31.glProgramUniformMatrix4x2fv(program, location, transpose, value);
    }

    @Override public void glProgramUniformMatrix4x2fv(int program, int location, boolean transpose, float[] value) {
        org.lwjgl.opengles.GLES31.glProgramUniformMatrix4x2fv(program, location, transpose, value);
    }

    @Override public void nglProgramUniformMatrix3x4fv(int program, int location, int count, boolean transpose, long value) {
        org.lwjgl.opengles.GLES31.nglProgramUniformMatrix3x4fv(program, location, count, transpose, value);
    }

    @Override public void glProgramUniformMatrix3x4fv(int program, int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengles.GLES31.glProgramUniformMatrix3x4fv(program, location, transpose, value);
    }

    @Override public void glProgramUniformMatrix3x4fv(int program, int location, boolean transpose, float[] value) {
        org.lwjgl.opengles.GLES31.glProgramUniformMatrix3x4fv(program, location, transpose, value);
    }

    @Override public void nglProgramUniformMatrix4x3fv(int program, int location, int count, boolean transpose, long value) {
        org.lwjgl.opengles.GLES31.nglProgramUniformMatrix4x3fv(program, location, count, transpose, value);
    }

    @Override public void glProgramUniformMatrix4x3fv(int program, int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengles.GLES31.glProgramUniformMatrix4x3fv(program, location, transpose, value);
    }

    @Override public void glProgramUniformMatrix4x3fv(int program, int location, boolean transpose, float[] value) {
        org.lwjgl.opengles.GLES31.glProgramUniformMatrix4x3fv(program, location, transpose, value);
    }

    @Override public void glValidateProgramPipeline(int pipeline) {
        org.lwjgl.opengles.GLES31.glValidateProgramPipeline(pipeline);
    }

    @Override public void nglGetProgramPipelineInfoLog(int pipeline, int bufSize, long length, long infoLog) {
        org.lwjgl.opengles.GLES31.nglGetProgramPipelineInfoLog(pipeline, bufSize, length, infoLog);
    }

    @Override public void glGetProgramPipelineInfoLog(int pipeline, @Nullable IntBuffer length, ByteBuffer infoLog) {
        org.lwjgl.opengles.GLES31.glGetProgramPipelineInfoLog(pipeline, length, infoLog);
    }

    @Override public String glGetProgramPipelineInfoLog(int pipeline, int bufSize) {
        return org.lwjgl.opengles.GLES31.glGetProgramPipelineInfoLog(pipeline, bufSize);
    }

    @Override public String glGetProgramPipelineInfoLog(int pipeline) {
        return org.lwjgl.opengles.GLES31.glGetProgramPipelineInfoLog(pipeline);
    }

    @Override public void glGetProgramPipelineInfoLog(int pipeline, @Nullable int[] length, ByteBuffer infoLog) {
        org.lwjgl.opengles.GLES31.glGetProgramPipelineInfoLog(pipeline, length, infoLog);
    }

    @Override public void glBindImageTexture(int unit, int texture, int level, boolean layered, int layer, int access, int format) {
        org.lwjgl.opengles.GLES31.glBindImageTexture(unit, texture, level, layered, layer, access, format);
    }

    @Override public void nglGetBooleani_v(int target, int index, long data) {
        org.lwjgl.opengles.GLES31.nglGetBooleani_v(target, index, data);
    }

    @Override public void glGetBooleani_v(int target, int index, ByteBuffer data) {
        org.lwjgl.opengles.GLES31.glGetBooleani_v(target, index, data);
    }

    @Override public boolean glGetBooleani(int target, int index) {
        return org.lwjgl.opengles.GLES31.glGetBooleani(target, index);
    }

    @Override public void glMemoryBarrier(int barriers) {
        org.lwjgl.opengles.GLES31.glMemoryBarrier(barriers);
    }

    @Override public void glMemoryBarrierByRegion(int barriers) {
        org.lwjgl.opengles.GLES31.glMemoryBarrierByRegion(barriers);
    }

    @Override public void glTexStorage2DMultisample(int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations) {
        org.lwjgl.opengles.GLES31.glTexStorage2DMultisample(target, samples, internalformat, width, height, fixedsamplelocations);
    }

    @Override public void nglGetMultisamplefv(int pname, int index, long val) {
        org.lwjgl.opengles.GLES31.nglGetMultisamplefv(pname, index, val);
    }

    @Override public void glGetMultisamplefv(int pname, int index, FloatBuffer val) {
        org.lwjgl.opengles.GLES31.glGetMultisamplefv(pname, index, val);
    }

    @Override public void glGetMultisamplefv(int pname, int index, float[] val) {
        org.lwjgl.opengles.GLES31.glGetMultisamplefv(pname, index, val);
    }

    @Override public float glGetMultisamplef(int pname, int index) {
        return org.lwjgl.opengles.GLES31.glGetMultisamplef(pname, index);
    }

    @Override public void glSampleMaski(int maskNumber, int mask) {
        org.lwjgl.opengles.GLES31.glSampleMaski(maskNumber, mask);
    }

    @Override public void nglGetTexLevelParameteriv(int target, int level, int pname, long params) {
        org.lwjgl.opengles.GLES31.nglGetTexLevelParameteriv(target, level, pname, params);
    }

    @Override public void glGetTexLevelParameteriv(int target, int level, int pname, IntBuffer params) {
        org.lwjgl.opengles.GLES31.glGetTexLevelParameteriv(target, level, pname, params);
    }

    @Override public void glGetTexLevelParameteriv(int target, int level, int pname, int[] params) {
        org.lwjgl.opengles.GLES31.glGetTexLevelParameteriv(target, level, pname, params);
    }

    @Override public int glGetTexLevelParameteri(int target, int level, int pname) {
        return org.lwjgl.opengles.GLES31.glGetTexLevelParameteri(target, level, pname);
    }

    @Override public void nglGetTexLevelParameterfv(int target, int level, int pname, long params) {
        org.lwjgl.opengles.GLES31.nglGetTexLevelParameterfv(target, level, pname, params);
    }

    @Override public void glGetTexLevelParameterfv(int target, int level, int pname, FloatBuffer params) {
        org.lwjgl.opengles.GLES31.glGetTexLevelParameterfv(target, level, pname, params);
    }

    @Override public void glGetTexLevelParameterfv(int target, int level, int pname, float[] params) {
        org.lwjgl.opengles.GLES31.glGetTexLevelParameterfv(target, level, pname, params);
    }

    @Override public float glGetTexLevelParameterf(int target, int level, int pname) {
        return org.lwjgl.opengles.GLES31.glGetTexLevelParameterf(target, level, pname);
    }

    @Override public void glBindVertexBuffer(int bindingindex, int buffer, long offset, int stride) {
        org.lwjgl.opengles.GLES31.glBindVertexBuffer(bindingindex, buffer, offset, stride);
    }

    @Override public void glVertexAttribFormat(int attribindex, int size, int type, boolean normalized, int relativeoffset) {
        org.lwjgl.opengles.GLES31.glVertexAttribFormat(attribindex, size, type, normalized, relativeoffset);
    }

    @Override public void glVertexAttribIFormat(int attribindex, int size, int type, int relativeoffset) {
        org.lwjgl.opengles.GLES31.glVertexAttribIFormat(attribindex, size, type, relativeoffset);
    }

    @Override public void glVertexAttribBinding(int attribindex, int bindingindex) {
        org.lwjgl.opengles.GLES31.glVertexAttribBinding(attribindex, bindingindex);
    }

    @Override public void glVertexBindingDivisor(int bindingindex, int divisor) {
        org.lwjgl.opengles.GLES31.glVertexBindingDivisor(bindingindex, divisor);
    }

}
