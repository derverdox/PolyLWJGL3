package de.verdox.polylwjgl3.gl.accessor.gl40;

import de.verdox.polylwjgl3.gl.accessor.gl33.GL33Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl33.GL33AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL40;
import org.lwjgl.system.*;

public class GL40AccessorImpl extends GL33AccessorImpl implements GL40Accessor {

    @Override public void glBlendEquationi(int buf, int mode) {
        org.lwjgl.opengl.GL40.glBlendEquationi(buf, mode);
    }

    @Override public void glBlendEquationSeparatei(int buf, int modeRGB, int modeAlpha) {
        org.lwjgl.opengl.GL40.glBlendEquationSeparatei(buf, modeRGB, modeAlpha);
    }

    @Override public void glBlendFunci(int buf, int sfactor, int dfactor) {
        org.lwjgl.opengl.GL40.glBlendFunci(buf, sfactor, dfactor);
    }

    @Override public void glBlendFuncSeparatei(int buf, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha) {
        org.lwjgl.opengl.GL40.glBlendFuncSeparatei(buf, srcRGB, dstRGB, srcAlpha, dstAlpha);
    }

    @Override public void nglDrawArraysIndirect(int mode, long indirect) {
        org.lwjgl.opengl.GL40.nglDrawArraysIndirect(mode, indirect);
    }

    @Override public void glDrawArraysIndirect(int mode, ByteBuffer indirect) {
        org.lwjgl.opengl.GL40.glDrawArraysIndirect(mode, indirect);
    }

    @Override public void glDrawArraysIndirect(int mode, long indirect) {
        org.lwjgl.opengl.GL40.glDrawArraysIndirect(mode, indirect);
    }

    @Override public void glDrawArraysIndirect(int mode, IntBuffer indirect) {
        org.lwjgl.opengl.GL40.glDrawArraysIndirect(mode, indirect);
    }

    @Override public void glDrawArraysIndirect(int mode, int[] indirect) {
        org.lwjgl.opengl.GL40.glDrawArraysIndirect(mode, indirect);
    }

    @Override public void nglDrawElementsIndirect(int mode, int type, long indirect) {
        org.lwjgl.opengl.GL40.nglDrawElementsIndirect(mode, type, indirect);
    }

    @Override public void glDrawElementsIndirect(int mode, int type, ByteBuffer indirect) {
        org.lwjgl.opengl.GL40.glDrawElementsIndirect(mode, type, indirect);
    }

    @Override public void glDrawElementsIndirect(int mode, int type, long indirect) {
        org.lwjgl.opengl.GL40.glDrawElementsIndirect(mode, type, indirect);
    }

    @Override public void glDrawElementsIndirect(int mode, int type, IntBuffer indirect) {
        org.lwjgl.opengl.GL40.glDrawElementsIndirect(mode, type, indirect);
    }

    @Override public void glDrawElementsIndirect(int mode, int type, int[] indirect) {
        org.lwjgl.opengl.GL40.glDrawElementsIndirect(mode, type, indirect);
    }

    @Override public void glUniform1d(int location, double x) {
        org.lwjgl.opengl.GL40.glUniform1d(location, x);
    }

    @Override public void glUniform2d(int location, double x, double y) {
        org.lwjgl.opengl.GL40.glUniform2d(location, x, y);
    }

    @Override public void glUniform3d(int location, double x, double y, double z) {
        org.lwjgl.opengl.GL40.glUniform3d(location, x, y, z);
    }

    @Override public void glUniform4d(int location, double x, double y, double z, double w) {
        org.lwjgl.opengl.GL40.glUniform4d(location, x, y, z, w);
    }

    @Override public void nglUniform1dv(int location, int count, long value) {
        org.lwjgl.opengl.GL40.nglUniform1dv(location, count, value);
    }

    @Override public void glUniform1dv(int location, DoubleBuffer value) {
        org.lwjgl.opengl.GL40.glUniform1dv(location, value);
    }

    @Override public void glUniform1dv(int location, double[] value) {
        org.lwjgl.opengl.GL40.glUniform1dv(location, value);
    }

    @Override public void nglUniform2dv(int location, int count, long value) {
        org.lwjgl.opengl.GL40.nglUniform2dv(location, count, value);
    }

    @Override public void glUniform2dv(int location, DoubleBuffer value) {
        org.lwjgl.opengl.GL40.glUniform2dv(location, value);
    }

    @Override public void glUniform2dv(int location, double[] value) {
        org.lwjgl.opengl.GL40.glUniform2dv(location, value);
    }

    @Override public void nglUniform3dv(int location, int count, long value) {
        org.lwjgl.opengl.GL40.nglUniform3dv(location, count, value);
    }

    @Override public void glUniform3dv(int location, DoubleBuffer value) {
        org.lwjgl.opengl.GL40.glUniform3dv(location, value);
    }

    @Override public void glUniform3dv(int location, double[] value) {
        org.lwjgl.opengl.GL40.glUniform3dv(location, value);
    }

    @Override public void nglUniform4dv(int location, int count, long value) {
        org.lwjgl.opengl.GL40.nglUniform4dv(location, count, value);
    }

    @Override public void glUniform4dv(int location, DoubleBuffer value) {
        org.lwjgl.opengl.GL40.glUniform4dv(location, value);
    }

    @Override public void glUniform4dv(int location, double[] value) {
        org.lwjgl.opengl.GL40.glUniform4dv(location, value);
    }

    @Override public void nglUniformMatrix2dv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL40.nglUniformMatrix2dv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix2dv(int location, boolean transpose, DoubleBuffer value) {
        org.lwjgl.opengl.GL40.glUniformMatrix2dv(location, transpose, value);
    }

    @Override public void glUniformMatrix2dv(int location, boolean transpose, double[] value) {
        org.lwjgl.opengl.GL40.glUniformMatrix2dv(location, transpose, value);
    }

    @Override public void nglUniformMatrix3dv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL40.nglUniformMatrix3dv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix3dv(int location, boolean transpose, DoubleBuffer value) {
        org.lwjgl.opengl.GL40.glUniformMatrix3dv(location, transpose, value);
    }

    @Override public void glUniformMatrix3dv(int location, boolean transpose, double[] value) {
        org.lwjgl.opengl.GL40.glUniformMatrix3dv(location, transpose, value);
    }

    @Override public void nglUniformMatrix4dv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL40.nglUniformMatrix4dv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix4dv(int location, boolean transpose, DoubleBuffer value) {
        org.lwjgl.opengl.GL40.glUniformMatrix4dv(location, transpose, value);
    }

    @Override public void glUniformMatrix4dv(int location, boolean transpose, double[] value) {
        org.lwjgl.opengl.GL40.glUniformMatrix4dv(location, transpose, value);
    }

    @Override public void nglUniformMatrix2x3dv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL40.nglUniformMatrix2x3dv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix2x3dv(int location, boolean transpose, DoubleBuffer value) {
        org.lwjgl.opengl.GL40.glUniformMatrix2x3dv(location, transpose, value);
    }

    @Override public void glUniformMatrix2x3dv(int location, boolean transpose, double[] value) {
        org.lwjgl.opengl.GL40.glUniformMatrix2x3dv(location, transpose, value);
    }

    @Override public void nglUniformMatrix2x4dv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL40.nglUniformMatrix2x4dv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix2x4dv(int location, boolean transpose, DoubleBuffer value) {
        org.lwjgl.opengl.GL40.glUniformMatrix2x4dv(location, transpose, value);
    }

    @Override public void glUniformMatrix2x4dv(int location, boolean transpose, double[] value) {
        org.lwjgl.opengl.GL40.glUniformMatrix2x4dv(location, transpose, value);
    }

    @Override public void nglUniformMatrix3x2dv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL40.nglUniformMatrix3x2dv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix3x2dv(int location, boolean transpose, DoubleBuffer value) {
        org.lwjgl.opengl.GL40.glUniformMatrix3x2dv(location, transpose, value);
    }

    @Override public void glUniformMatrix3x2dv(int location, boolean transpose, double[] value) {
        org.lwjgl.opengl.GL40.glUniformMatrix3x2dv(location, transpose, value);
    }

    @Override public void nglUniformMatrix3x4dv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL40.nglUniformMatrix3x4dv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix3x4dv(int location, boolean transpose, DoubleBuffer value) {
        org.lwjgl.opengl.GL40.glUniformMatrix3x4dv(location, transpose, value);
    }

    @Override public void glUniformMatrix3x4dv(int location, boolean transpose, double[] value) {
        org.lwjgl.opengl.GL40.glUniformMatrix3x4dv(location, transpose, value);
    }

    @Override public void nglUniformMatrix4x2dv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL40.nglUniformMatrix4x2dv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix4x2dv(int location, boolean transpose, DoubleBuffer value) {
        org.lwjgl.opengl.GL40.glUniformMatrix4x2dv(location, transpose, value);
    }

    @Override public void glUniformMatrix4x2dv(int location, boolean transpose, double[] value) {
        org.lwjgl.opengl.GL40.glUniformMatrix4x2dv(location, transpose, value);
    }

    @Override public void nglUniformMatrix4x3dv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL40.nglUniformMatrix4x3dv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix4x3dv(int location, boolean transpose, DoubleBuffer value) {
        org.lwjgl.opengl.GL40.glUniformMatrix4x3dv(location, transpose, value);
    }

    @Override public void glUniformMatrix4x3dv(int location, boolean transpose, double[] value) {
        org.lwjgl.opengl.GL40.glUniformMatrix4x3dv(location, transpose, value);
    }

    @Override public void nglGetUniformdv(int program, int location, long params) {
        org.lwjgl.opengl.GL40.nglGetUniformdv(program, location, params);
    }

    @Override public void glGetUniformdv(int program, int location, DoubleBuffer params) {
        org.lwjgl.opengl.GL40.glGetUniformdv(program, location, params);
    }

    @Override public void glGetUniformdv(int program, int location, double[] params) {
        org.lwjgl.opengl.GL40.glGetUniformdv(program, location, params);
    }

    @Override public double glGetUniformd(int program, int location) {
        return org.lwjgl.opengl.GL40.glGetUniformd(program, location);
    }

    @Override public void glMinSampleShading(float value) {
        org.lwjgl.opengl.GL40.glMinSampleShading(value);
    }

    @Override public int nglGetSubroutineUniformLocation(int program, int shadertype, long name) {
        return org.lwjgl.opengl.GL40.nglGetSubroutineUniformLocation(program, shadertype, name);
    }

    @Override public int glGetSubroutineUniformLocation(int program, int shadertype, ByteBuffer name) {
        return org.lwjgl.opengl.GL40.glGetSubroutineUniformLocation(program, shadertype, name);
    }

    @Override public int glGetSubroutineUniformLocation(int program, int shadertype, CharSequence name) {
        return org.lwjgl.opengl.GL40.glGetSubroutineUniformLocation(program, shadertype, name);
    }

    @Override public int nglGetSubroutineIndex(int program, int shadertype, long name) {
        return org.lwjgl.opengl.GL40.nglGetSubroutineIndex(program, shadertype, name);
    }

    @Override public int glGetSubroutineIndex(int program, int shadertype, ByteBuffer name) {
        return org.lwjgl.opengl.GL40.glGetSubroutineIndex(program, shadertype, name);
    }

    @Override public int glGetSubroutineIndex(int program, int shadertype, CharSequence name) {
        return org.lwjgl.opengl.GL40.glGetSubroutineIndex(program, shadertype, name);
    }

    @Override public void nglGetActiveSubroutineUniformiv(int program, int shadertype, int index, int pname, long values) {
        org.lwjgl.opengl.GL40.nglGetActiveSubroutineUniformiv(program, shadertype, index, pname, values);
    }

    @Override public void glGetActiveSubroutineUniformiv(int program, int shadertype, int index, int pname, IntBuffer values) {
        org.lwjgl.opengl.GL40.glGetActiveSubroutineUniformiv(program, shadertype, index, pname, values);
    }

    @Override public void glGetActiveSubroutineUniformiv(int program, int shadertype, int index, int pname, int[] values) {
        org.lwjgl.opengl.GL40.glGetActiveSubroutineUniformiv(program, shadertype, index, pname, values);
    }

    @Override public int glGetActiveSubroutineUniformi(int program, int shadertype, int index, int pname) {
        return org.lwjgl.opengl.GL40.glGetActiveSubroutineUniformi(program, shadertype, index, pname);
    }

    @Override public void nglGetActiveSubroutineUniformName(int program, int shadertype, int index, int bufsize, long length, long name) {
        org.lwjgl.opengl.GL40.nglGetActiveSubroutineUniformName(program, shadertype, index, bufsize, length, name);
    }

    @Override public void glGetActiveSubroutineUniformName(int program, int shadertype, int index, @Nullable IntBuffer length, ByteBuffer name) {
        org.lwjgl.opengl.GL40.glGetActiveSubroutineUniformName(program, shadertype, index, length, name);
    }

    @Override public String glGetActiveSubroutineUniformName(int program, int shadertype, int index, int bufsize) {
        return org.lwjgl.opengl.GL40.glGetActiveSubroutineUniformName(program, shadertype, index, bufsize);
    }

    @Override public String glGetActiveSubroutineUniformName(int program, int shadertype, int index) {
        return org.lwjgl.opengl.GL40.glGetActiveSubroutineUniformName(program, shadertype, index);
    }

    @Override public void glGetActiveSubroutineUniformName(int program, int shadertype, int index, @Nullable int[] length, ByteBuffer name) {
        org.lwjgl.opengl.GL40.glGetActiveSubroutineUniformName(program, shadertype, index, length, name);
    }

    @Override public void nglGetActiveSubroutineName(int program, int shadertype, int index, int bufsize, long length, long name) {
        org.lwjgl.opengl.GL40.nglGetActiveSubroutineName(program, shadertype, index, bufsize, length, name);
    }

    @Override public void glGetActiveSubroutineName(int program, int shadertype, int index, @Nullable IntBuffer length, ByteBuffer name) {
        org.lwjgl.opengl.GL40.glGetActiveSubroutineName(program, shadertype, index, length, name);
    }

    @Override public String glGetActiveSubroutineName(int program, int shadertype, int index, int bufsize) {
        return org.lwjgl.opengl.GL40.glGetActiveSubroutineName(program, shadertype, index, bufsize);
    }

    @Override public String glGetActiveSubroutineName(int program, int shadertype, int index) {
        return org.lwjgl.opengl.GL40.glGetActiveSubroutineName(program, shadertype, index);
    }

    @Override public void glGetActiveSubroutineName(int program, int shadertype, int index, @Nullable int[] length, ByteBuffer name) {
        org.lwjgl.opengl.GL40.glGetActiveSubroutineName(program, shadertype, index, length, name);
    }

    @Override public void nglUniformSubroutinesuiv(int shadertype, int count, long indices) {
        org.lwjgl.opengl.GL40.nglUniformSubroutinesuiv(shadertype, count, indices);
    }

    @Override public void glUniformSubroutinesuiv(int shadertype, IntBuffer indices) {
        org.lwjgl.opengl.GL40.glUniformSubroutinesuiv(shadertype, indices);
    }

    @Override public void glUniformSubroutinesuiv(int shadertype, int[] indices) {
        org.lwjgl.opengl.GL40.glUniformSubroutinesuiv(shadertype, indices);
    }

    @Override public void glUniformSubroutinesui(int shadertype, int index) {
        org.lwjgl.opengl.GL40.glUniformSubroutinesui(shadertype, index);
    }

    @Override public void nglGetUniformSubroutineuiv(int shadertype, int location, long params) {
        org.lwjgl.opengl.GL40.nglGetUniformSubroutineuiv(shadertype, location, params);
    }

    @Override public void glGetUniformSubroutineuiv(int shadertype, int location, IntBuffer params) {
        org.lwjgl.opengl.GL40.glGetUniformSubroutineuiv(shadertype, location, params);
    }

    @Override public void glGetUniformSubroutineuiv(int shadertype, int location, int[] params) {
        org.lwjgl.opengl.GL40.glGetUniformSubroutineuiv(shadertype, location, params);
    }

    @Override public int glGetUniformSubroutineui(int shadertype, int location) {
        return org.lwjgl.opengl.GL40.glGetUniformSubroutineui(shadertype, location);
    }

    @Override public void nglGetProgramStageiv(int program, int shadertype, int pname, long values) {
        org.lwjgl.opengl.GL40.nglGetProgramStageiv(program, shadertype, pname, values);
    }

    @Override public void glGetProgramStageiv(int program, int shadertype, int pname, IntBuffer values) {
        org.lwjgl.opengl.GL40.glGetProgramStageiv(program, shadertype, pname, values);
    }

    @Override public void glGetProgramStageiv(int program, int shadertype, int pname, int[] values) {
        org.lwjgl.opengl.GL40.glGetProgramStageiv(program, shadertype, pname, values);
    }

    @Override public int glGetProgramStagei(int program, int shadertype, int pname) {
        return org.lwjgl.opengl.GL40.glGetProgramStagei(program, shadertype, pname);
    }

    @Override public void glPatchParameteri(int pname, int value) {
        org.lwjgl.opengl.GL40.glPatchParameteri(pname, value);
    }

    @Override public void nglPatchParameterfv(int pname, long values) {
        org.lwjgl.opengl.GL40.nglPatchParameterfv(pname, values);
    }

    @Override public void glPatchParameterfv(int pname, FloatBuffer values) {
        org.lwjgl.opengl.GL40.glPatchParameterfv(pname, values);
    }

    @Override public void glPatchParameterfv(int pname, float[] values) {
        org.lwjgl.opengl.GL40.glPatchParameterfv(pname, values);
    }

    @Override public void glBindTransformFeedback(int target, int id) {
        org.lwjgl.opengl.GL40.glBindTransformFeedback(target, id);
    }

    @Override public void nglDeleteTransformFeedbacks(int n, long ids) {
        org.lwjgl.opengl.GL40.nglDeleteTransformFeedbacks(n, ids);
    }

    @Override public void glDeleteTransformFeedbacks(IntBuffer ids) {
        org.lwjgl.opengl.GL40.glDeleteTransformFeedbacks(ids);
    }

    @Override public void glDeleteTransformFeedbacks(int id) {
        org.lwjgl.opengl.GL40.glDeleteTransformFeedbacks(id);
    }

    @Override public void glDeleteTransformFeedbacks(int[] ids) {
        org.lwjgl.opengl.GL40.glDeleteTransformFeedbacks(ids);
    }

    @Override public void nglGenTransformFeedbacks(int n, long ids) {
        org.lwjgl.opengl.GL40.nglGenTransformFeedbacks(n, ids);
    }

    @Override public void glGenTransformFeedbacks(IntBuffer ids) {
        org.lwjgl.opengl.GL40.glGenTransformFeedbacks(ids);
    }

    @Override public int glGenTransformFeedbacks() {
        return org.lwjgl.opengl.GL40.glGenTransformFeedbacks();
    }

    @Override public void glGenTransformFeedbacks(int[] ids) {
        org.lwjgl.opengl.GL40.glGenTransformFeedbacks(ids);
    }

    @Override public boolean glIsTransformFeedback(int id) {
        return org.lwjgl.opengl.GL40.glIsTransformFeedback(id);
    }

    @Override public void glPauseTransformFeedback() {
        org.lwjgl.opengl.GL40.glPauseTransformFeedback();
    }

    @Override public void glResumeTransformFeedback() {
        org.lwjgl.opengl.GL40.glResumeTransformFeedback();
    }

    @Override public void glDrawTransformFeedback(int mode, int id) {
        org.lwjgl.opengl.GL40.glDrawTransformFeedback(mode, id);
    }

    @Override public void glDrawTransformFeedbackStream(int mode, int id, int stream) {
        org.lwjgl.opengl.GL40.glDrawTransformFeedbackStream(mode, id, stream);
    }

    @Override public void glBeginQueryIndexed(int target, int index, int id) {
        org.lwjgl.opengl.GL40.glBeginQueryIndexed(target, index, id);
    }

    @Override public void glEndQueryIndexed(int target, int index) {
        org.lwjgl.opengl.GL40.glEndQueryIndexed(target, index);
    }

    @Override public void nglGetQueryIndexediv(int target, int index, int pname, long params) {
        org.lwjgl.opengl.GL40.nglGetQueryIndexediv(target, index, pname, params);
    }

    @Override public void glGetQueryIndexediv(int target, int index, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL40.glGetQueryIndexediv(target, index, pname, params);
    }

    @Override public void glGetQueryIndexediv(int target, int index, int pname, int[] params) {
        org.lwjgl.opengl.GL40.glGetQueryIndexediv(target, index, pname, params);
    }

    @Override public int glGetQueryIndexedi(int target, int index, int pname) {
        return org.lwjgl.opengl.GL40.glGetQueryIndexedi(target, index, pname);
    }

}
