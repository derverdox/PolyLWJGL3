package de.verdox.polylwjgl3.gl.accessor.gl20;

import de.verdox.polylwjgl3.gl.accessor.gl15.GL15Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl15.GL15AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL20;
import org.lwjgl.system.*;

public class GL20AccessorImpl extends GL15AccessorImpl implements GL20Accessor {

    @Override public int glCreateProgram() {
        return org.lwjgl.opengl.GL20.glCreateProgram();
    }

    @Override public void glDeleteProgram(int program) {
        org.lwjgl.opengl.GL20.glDeleteProgram(program);
    }

    @Override public boolean glIsProgram(int program) {
        return org.lwjgl.opengl.GL20.glIsProgram(program);
    }

    @Override public int glCreateShader(int type) {
        return org.lwjgl.opengl.GL20.glCreateShader(type);
    }

    @Override public void glDeleteShader(int shader) {
        org.lwjgl.opengl.GL20.glDeleteShader(shader);
    }

    @Override public boolean glIsShader(int shader) {
        return org.lwjgl.opengl.GL20.glIsShader(shader);
    }

    @Override public void glAttachShader(int program, int shader) {
        org.lwjgl.opengl.GL20.glAttachShader(program, shader);
    }

    @Override public void glDetachShader(int program, int shader) {
        org.lwjgl.opengl.GL20.glDetachShader(program, shader);
    }

    @Override public void nglShaderSource(int shader, int count, long strings, long length) {
        org.lwjgl.opengl.GL20.nglShaderSource(shader, count, strings, length);
    }

    @Override public void glShaderSource(int shader, PointerBuffer strings, @Nullable IntBuffer length) {
        org.lwjgl.opengl.GL20.glShaderSource(shader, strings, length);
    }

    @Override public void glShaderSource(int shader, CharSequence... strings) {
        org.lwjgl.opengl.GL20.glShaderSource(shader, strings);
    }

    @Override public void glShaderSource(int shader, CharSequence string) {
        org.lwjgl.opengl.GL20.glShaderSource(shader, string);
    }

    @Override public void glShaderSource(int shader, PointerBuffer strings, @Nullable int[] length) {
        org.lwjgl.opengl.GL20.glShaderSource(shader, strings, length);
    }

    @Override public void glCompileShader(int shader) {
        org.lwjgl.opengl.GL20.glCompileShader(shader);
    }

    @Override public void glLinkProgram(int program) {
        org.lwjgl.opengl.GL20.glLinkProgram(program);
    }

    @Override public void glUseProgram(int program) {
        org.lwjgl.opengl.GL20.glUseProgram(program);
    }

    @Override public void glValidateProgram(int program) {
        org.lwjgl.opengl.GL20.glValidateProgram(program);
    }

    @Override public void glUniform1f(int location, float v0) {
        org.lwjgl.opengl.GL20.glUniform1f(location, v0);
    }

    @Override public void glUniform2f(int location, float v0, float v1) {
        org.lwjgl.opengl.GL20.glUniform2f(location, v0, v1);
    }

    @Override public void glUniform3f(int location, float v0, float v1, float v2) {
        org.lwjgl.opengl.GL20.glUniform3f(location, v0, v1, v2);
    }

    @Override public void glUniform4f(int location, float v0, float v1, float v2, float v3) {
        org.lwjgl.opengl.GL20.glUniform4f(location, v0, v1, v2, v3);
    }

    @Override public void glUniform1i(int location, int v0) {
        org.lwjgl.opengl.GL20.glUniform1i(location, v0);
    }

    @Override public void glUniform2i(int location, int v0, int v1) {
        org.lwjgl.opengl.GL20.glUniform2i(location, v0, v1);
    }

    @Override public void glUniform3i(int location, int v0, int v1, int v2) {
        org.lwjgl.opengl.GL20.glUniform3i(location, v0, v1, v2);
    }

    @Override public void glUniform4i(int location, int v0, int v1, int v2, int v3) {
        org.lwjgl.opengl.GL20.glUniform4i(location, v0, v1, v2, v3);
    }

    @Override public void nglUniform1fv(int location, int count, long value) {
        org.lwjgl.opengl.GL20.nglUniform1fv(location, count, value);
    }

    @Override public void glUniform1fv(int location, FloatBuffer value) {
        org.lwjgl.opengl.GL20.glUniform1fv(location, value);
    }

    @Override public void glUniform1fv(int location, float[] value) {
        org.lwjgl.opengl.GL20.glUniform1fv(location, value);
    }

    @Override public void nglUniform2fv(int location, int count, long value) {
        org.lwjgl.opengl.GL20.nglUniform2fv(location, count, value);
    }

    @Override public void glUniform2fv(int location, FloatBuffer value) {
        org.lwjgl.opengl.GL20.glUniform2fv(location, value);
    }

    @Override public void glUniform2fv(int location, float[] value) {
        org.lwjgl.opengl.GL20.glUniform2fv(location, value);
    }

    @Override public void nglUniform3fv(int location, int count, long value) {
        org.lwjgl.opengl.GL20.nglUniform3fv(location, count, value);
    }

    @Override public void glUniform3fv(int location, FloatBuffer value) {
        org.lwjgl.opengl.GL20.glUniform3fv(location, value);
    }

    @Override public void glUniform3fv(int location, float[] value) {
        org.lwjgl.opengl.GL20.glUniform3fv(location, value);
    }

    @Override public void nglUniform4fv(int location, int count, long value) {
        org.lwjgl.opengl.GL20.nglUniform4fv(location, count, value);
    }

    @Override public void glUniform4fv(int location, FloatBuffer value) {
        org.lwjgl.opengl.GL20.glUniform4fv(location, value);
    }

    @Override public void glUniform4fv(int location, float[] value) {
        org.lwjgl.opengl.GL20.glUniform4fv(location, value);
    }

    @Override public void nglUniform1iv(int location, int count, long value) {
        org.lwjgl.opengl.GL20.nglUniform1iv(location, count, value);
    }

    @Override public void glUniform1iv(int location, IntBuffer value) {
        org.lwjgl.opengl.GL20.glUniform1iv(location, value);
    }

    @Override public void glUniform1iv(int location, int[] value) {
        org.lwjgl.opengl.GL20.glUniform1iv(location, value);
    }

    @Override public void nglUniform2iv(int location, int count, long value) {
        org.lwjgl.opengl.GL20.nglUniform2iv(location, count, value);
    }

    @Override public void glUniform2iv(int location, IntBuffer value) {
        org.lwjgl.opengl.GL20.glUniform2iv(location, value);
    }

    @Override public void glUniform2iv(int location, int[] value) {
        org.lwjgl.opengl.GL20.glUniform2iv(location, value);
    }

    @Override public void nglUniform3iv(int location, int count, long value) {
        org.lwjgl.opengl.GL20.nglUniform3iv(location, count, value);
    }

    @Override public void glUniform3iv(int location, IntBuffer value) {
        org.lwjgl.opengl.GL20.glUniform3iv(location, value);
    }

    @Override public void glUniform3iv(int location, int[] value) {
        org.lwjgl.opengl.GL20.glUniform3iv(location, value);
    }

    @Override public void nglUniform4iv(int location, int count, long value) {
        org.lwjgl.opengl.GL20.nglUniform4iv(location, count, value);
    }

    @Override public void glUniform4iv(int location, IntBuffer value) {
        org.lwjgl.opengl.GL20.glUniform4iv(location, value);
    }

    @Override public void glUniform4iv(int location, int[] value) {
        org.lwjgl.opengl.GL20.glUniform4iv(location, value);
    }

    @Override public void nglUniformMatrix2fv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL20.nglUniformMatrix2fv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix2fv(int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengl.GL20.glUniformMatrix2fv(location, transpose, value);
    }

    @Override public void glUniformMatrix2fv(int location, boolean transpose, float[] value) {
        org.lwjgl.opengl.GL20.glUniformMatrix2fv(location, transpose, value);
    }

    @Override public void nglUniformMatrix3fv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL20.nglUniformMatrix3fv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix3fv(int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengl.GL20.glUniformMatrix3fv(location, transpose, value);
    }

    @Override public void glUniformMatrix3fv(int location, boolean transpose, float[] value) {
        org.lwjgl.opengl.GL20.glUniformMatrix3fv(location, transpose, value);
    }

    @Override public void nglUniformMatrix4fv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL20.nglUniformMatrix4fv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix4fv(int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengl.GL20.glUniformMatrix4fv(location, transpose, value);
    }

    @Override public void glUniformMatrix4fv(int location, boolean transpose, float[] value) {
        org.lwjgl.opengl.GL20.glUniformMatrix4fv(location, transpose, value);
    }

    @Override public void nglGetShaderiv(int shader, int pname, long params) {
        org.lwjgl.opengl.GL20.nglGetShaderiv(shader, pname, params);
    }

    @Override public void glGetShaderiv(int shader, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL20.glGetShaderiv(shader, pname, params);
    }

    @Override public void glGetShaderiv(int shader, int pname, int[] params) {
        org.lwjgl.opengl.GL20.glGetShaderiv(shader, pname, params);
    }

    @Override public int glGetShaderi(int shader, int pname) {
        return org.lwjgl.opengl.GL20.glGetShaderi(shader, pname);
    }

    @Override public void nglGetProgramiv(int program, int pname, long params) {
        org.lwjgl.opengl.GL20.nglGetProgramiv(program, pname, params);
    }

    @Override public void glGetProgramiv(int program, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL20.glGetProgramiv(program, pname, params);
    }

    @Override public void glGetProgramiv(int program, int pname, int[] params) {
        org.lwjgl.opengl.GL20.glGetProgramiv(program, pname, params);
    }

    @Override public int glGetProgrami(int program, int pname) {
        return org.lwjgl.opengl.GL20.glGetProgrami(program, pname);
    }

    @Override public void nglGetShaderInfoLog(int shader, int maxLength, long length, long infoLog) {
        org.lwjgl.opengl.GL20.nglGetShaderInfoLog(shader, maxLength, length, infoLog);
    }

    @Override public void glGetShaderInfoLog(int shader, @Nullable IntBuffer length, ByteBuffer infoLog) {
        org.lwjgl.opengl.GL20.glGetShaderInfoLog(shader, length, infoLog);
    }

    @Override public String glGetShaderInfoLog(int shader, int maxLength) {
        return org.lwjgl.opengl.GL20.glGetShaderInfoLog(shader, maxLength);
    }

    @Override public String glGetShaderInfoLog(int shader) {
        return org.lwjgl.opengl.GL20.glGetShaderInfoLog(shader);
    }

    @Override public void glGetShaderInfoLog(int shader, @Nullable int[] length, ByteBuffer infoLog) {
        org.lwjgl.opengl.GL20.glGetShaderInfoLog(shader, length, infoLog);
    }

    @Override public void nglGetProgramInfoLog(int program, int maxLength, long length, long infoLog) {
        org.lwjgl.opengl.GL20.nglGetProgramInfoLog(program, maxLength, length, infoLog);
    }

    @Override public void glGetProgramInfoLog(int program, @Nullable IntBuffer length, ByteBuffer infoLog) {
        org.lwjgl.opengl.GL20.glGetProgramInfoLog(program, length, infoLog);
    }

    @Override public String glGetProgramInfoLog(int program, int maxLength) {
        return org.lwjgl.opengl.GL20.glGetProgramInfoLog(program, maxLength);
    }

    @Override public String glGetProgramInfoLog(int program) {
        return org.lwjgl.opengl.GL20.glGetProgramInfoLog(program);
    }

    @Override public void glGetProgramInfoLog(int program, @Nullable int[] length, ByteBuffer infoLog) {
        org.lwjgl.opengl.GL20.glGetProgramInfoLog(program, length, infoLog);
    }

    @Override public void nglGetAttachedShaders(int program, int maxCount, long count, long shaders) {
        org.lwjgl.opengl.GL20.nglGetAttachedShaders(program, maxCount, count, shaders);
    }

    @Override public void glGetAttachedShaders(int program, @Nullable IntBuffer count, IntBuffer shaders) {
        org.lwjgl.opengl.GL20.glGetAttachedShaders(program, count, shaders);
    }

    @Override public void glGetAttachedShaders(int program, @Nullable int[] count, int[] shaders) {
        org.lwjgl.opengl.GL20.glGetAttachedShaders(program, count, shaders);
    }

    @Override public int nglGetUniformLocation(int program, long name) {
        return org.lwjgl.opengl.GL20.nglGetUniformLocation(program, name);
    }

    @Override public int glGetUniformLocation(int program, ByteBuffer name) {
        return org.lwjgl.opengl.GL20.glGetUniformLocation(program, name);
    }

    @Override public int glGetUniformLocation(int program, CharSequence name) {
        return org.lwjgl.opengl.GL20.glGetUniformLocation(program, name);
    }

    @Override public void nglGetActiveUniform(int program, int index, int maxLength, long length, long size, long type, long name) {
        org.lwjgl.opengl.GL20.nglGetActiveUniform(program, index, maxLength, length, size, type, name);
    }

    @Override public void glGetActiveUniform(int program, int index, @Nullable IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
        org.lwjgl.opengl.GL20.glGetActiveUniform(program, index, length, size, type, name);
    }

    @Override public String glGetActiveUniform(int program, int index, int maxLength, IntBuffer size, IntBuffer type) {
        return org.lwjgl.opengl.GL20.glGetActiveUniform(program, index, maxLength, size, type);
    }

    @Override public String glGetActiveUniform(int program, int index, IntBuffer size, IntBuffer type) {
        return org.lwjgl.opengl.GL20.glGetActiveUniform(program, index, size, type);
    }

    @Override public void glGetActiveUniform(int program, int index, @Nullable int[] length, int[] size, int[] type, ByteBuffer name) {
        org.lwjgl.opengl.GL20.glGetActiveUniform(program, index, length, size, type, name);
    }

    @Override public void nglGetUniformfv(int program, int location, long params) {
        org.lwjgl.opengl.GL20.nglGetUniformfv(program, location, params);
    }

    @Override public void glGetUniformfv(int program, int location, FloatBuffer params) {
        org.lwjgl.opengl.GL20.glGetUniformfv(program, location, params);
    }

    @Override public void glGetUniformfv(int program, int location, float[] params) {
        org.lwjgl.opengl.GL20.glGetUniformfv(program, location, params);
    }

    @Override public float glGetUniformf(int program, int location) {
        return org.lwjgl.opengl.GL20.glGetUniformf(program, location);
    }

    @Override public void nglGetUniformiv(int program, int location, long params) {
        org.lwjgl.opengl.GL20.nglGetUniformiv(program, location, params);
    }

    @Override public void glGetUniformiv(int program, int location, IntBuffer params) {
        org.lwjgl.opengl.GL20.glGetUniformiv(program, location, params);
    }

    @Override public void glGetUniformiv(int program, int location, int[] params) {
        org.lwjgl.opengl.GL20.glGetUniformiv(program, location, params);
    }

    @Override public int glGetUniformi(int program, int location) {
        return org.lwjgl.opengl.GL20.glGetUniformi(program, location);
    }

    @Override public void nglGetShaderSource(int shader, int maxLength, long length, long source) {
        org.lwjgl.opengl.GL20.nglGetShaderSource(shader, maxLength, length, source);
    }

    @Override public void glGetShaderSource(int shader, @Nullable IntBuffer length, ByteBuffer source) {
        org.lwjgl.opengl.GL20.glGetShaderSource(shader, length, source);
    }

    @Override public String glGetShaderSource(int shader, int maxLength) {
        return org.lwjgl.opengl.GL20.glGetShaderSource(shader, maxLength);
    }

    @Override public String glGetShaderSource(int shader) {
        return org.lwjgl.opengl.GL20.glGetShaderSource(shader);
    }

    @Override public void glGetShaderSource(int shader, @Nullable int[] length, ByteBuffer source) {
        org.lwjgl.opengl.GL20.glGetShaderSource(shader, length, source);
    }

    @Override public void glVertexAttrib1f(int index, float v0) {
        org.lwjgl.opengl.GL20.glVertexAttrib1f(index, v0);
    }

    @Override public void glVertexAttrib1s(int index, short v0) {
        org.lwjgl.opengl.GL20.glVertexAttrib1s(index, v0);
    }

    @Override public void glVertexAttrib1d(int index, double v0) {
        org.lwjgl.opengl.GL20.glVertexAttrib1d(index, v0);
    }

    @Override public void glVertexAttrib2f(int index, float v0, float v1) {
        org.lwjgl.opengl.GL20.glVertexAttrib2f(index, v0, v1);
    }

    @Override public void glVertexAttrib2s(int index, short v0, short v1) {
        org.lwjgl.opengl.GL20.glVertexAttrib2s(index, v0, v1);
    }

    @Override public void glVertexAttrib2d(int index, double v0, double v1) {
        org.lwjgl.opengl.GL20.glVertexAttrib2d(index, v0, v1);
    }

    @Override public void glVertexAttrib3f(int index, float v0, float v1, float v2) {
        org.lwjgl.opengl.GL20.glVertexAttrib3f(index, v0, v1, v2);
    }

    @Override public void glVertexAttrib3s(int index, short v0, short v1, short v2) {
        org.lwjgl.opengl.GL20.glVertexAttrib3s(index, v0, v1, v2);
    }

    @Override public void glVertexAttrib3d(int index, double v0, double v1, double v2) {
        org.lwjgl.opengl.GL20.glVertexAttrib3d(index, v0, v1, v2);
    }

    @Override public void glVertexAttrib4f(int index, float v0, float v1, float v2, float v3) {
        org.lwjgl.opengl.GL20.glVertexAttrib4f(index, v0, v1, v2, v3);
    }

    @Override public void glVertexAttrib4s(int index, short v0, short v1, short v2, short v3) {
        org.lwjgl.opengl.GL20.glVertexAttrib4s(index, v0, v1, v2, v3);
    }

    @Override public void glVertexAttrib4d(int index, double v0, double v1, double v2, double v3) {
        org.lwjgl.opengl.GL20.glVertexAttrib4d(index, v0, v1, v2, v3);
    }

    @Override public void glVertexAttrib4Nub(int index, byte x, byte y, byte z, byte w) {
        org.lwjgl.opengl.GL20.glVertexAttrib4Nub(index, x, y, z, w);
    }

    @Override public void nglVertexAttrib1fv(int index, long v) {
        org.lwjgl.opengl.GL20.nglVertexAttrib1fv(index, v);
    }

    @Override public void glVertexAttrib1fv(int index, FloatBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib1fv(index, v);
    }

    @Override public void glVertexAttrib1fv(int index, float[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib1fv(index, v);
    }

    @Override public void nglVertexAttrib1sv(int index, long v) {
        org.lwjgl.opengl.GL20.nglVertexAttrib1sv(index, v);
    }

    @Override public void glVertexAttrib1sv(int index, ShortBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib1sv(index, v);
    }

    @Override public void glVertexAttrib1sv(int index, short[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib1sv(index, v);
    }

    @Override public void nglVertexAttrib1dv(int index, long v) {
        org.lwjgl.opengl.GL20.nglVertexAttrib1dv(index, v);
    }

    @Override public void glVertexAttrib1dv(int index, DoubleBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib1dv(index, v);
    }

    @Override public void glVertexAttrib1dv(int index, double[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib1dv(index, v);
    }

    @Override public void nglVertexAttrib2fv(int index, long v) {
        org.lwjgl.opengl.GL20.nglVertexAttrib2fv(index, v);
    }

    @Override public void glVertexAttrib2fv(int index, FloatBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib2fv(index, v);
    }

    @Override public void glVertexAttrib2fv(int index, float[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib2fv(index, v);
    }

    @Override public void nglVertexAttrib2sv(int index, long v) {
        org.lwjgl.opengl.GL20.nglVertexAttrib2sv(index, v);
    }

    @Override public void glVertexAttrib2sv(int index, ShortBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib2sv(index, v);
    }

    @Override public void glVertexAttrib2sv(int index, short[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib2sv(index, v);
    }

    @Override public void nglVertexAttrib2dv(int index, long v) {
        org.lwjgl.opengl.GL20.nglVertexAttrib2dv(index, v);
    }

    @Override public void glVertexAttrib2dv(int index, DoubleBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib2dv(index, v);
    }

    @Override public void glVertexAttrib2dv(int index, double[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib2dv(index, v);
    }

    @Override public void nglVertexAttrib3fv(int index, long v) {
        org.lwjgl.opengl.GL20.nglVertexAttrib3fv(index, v);
    }

    @Override public void glVertexAttrib3fv(int index, FloatBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib3fv(index, v);
    }

    @Override public void glVertexAttrib3fv(int index, float[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib3fv(index, v);
    }

    @Override public void nglVertexAttrib3sv(int index, long v) {
        org.lwjgl.opengl.GL20.nglVertexAttrib3sv(index, v);
    }

    @Override public void glVertexAttrib3sv(int index, ShortBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib3sv(index, v);
    }

    @Override public void glVertexAttrib3sv(int index, short[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib3sv(index, v);
    }

    @Override public void nglVertexAttrib3dv(int index, long v) {
        org.lwjgl.opengl.GL20.nglVertexAttrib3dv(index, v);
    }

    @Override public void glVertexAttrib3dv(int index, DoubleBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib3dv(index, v);
    }

    @Override public void glVertexAttrib3dv(int index, double[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib3dv(index, v);
    }

    @Override public void nglVertexAttrib4fv(int index, long v) {
        org.lwjgl.opengl.GL20.nglVertexAttrib4fv(index, v);
    }

    @Override public void glVertexAttrib4fv(int index, FloatBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4fv(index, v);
    }

    @Override public void glVertexAttrib4fv(int index, float[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4fv(index, v);
    }

    @Override public void nglVertexAttrib4sv(int index, long v) {
        org.lwjgl.opengl.GL20.nglVertexAttrib4sv(index, v);
    }

    @Override public void glVertexAttrib4sv(int index, ShortBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4sv(index, v);
    }

    @Override public void glVertexAttrib4sv(int index, short[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4sv(index, v);
    }

    @Override public void nglVertexAttrib4dv(int index, long v) {
        org.lwjgl.opengl.GL20.nglVertexAttrib4dv(index, v);
    }

    @Override public void glVertexAttrib4dv(int index, DoubleBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4dv(index, v);
    }

    @Override public void glVertexAttrib4dv(int index, double[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4dv(index, v);
    }

    @Override public void nglVertexAttrib4iv(int index, long v) {
        org.lwjgl.opengl.GL20.nglVertexAttrib4iv(index, v);
    }

    @Override public void glVertexAttrib4iv(int index, IntBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4iv(index, v);
    }

    @Override public void glVertexAttrib4iv(int index, int[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4iv(index, v);
    }

    @Override public void nglVertexAttrib4bv(int index, long v) {
        org.lwjgl.opengl.GL20.nglVertexAttrib4bv(index, v);
    }

    @Override public void glVertexAttrib4bv(int index, ByteBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4bv(index, v);
    }

    @Override public void nglVertexAttrib4ubv(int index, long v) {
        org.lwjgl.opengl.GL20.nglVertexAttrib4ubv(index, v);
    }

    @Override public void glVertexAttrib4ubv(int index, ByteBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4ubv(index, v);
    }

    @Override public void nglVertexAttrib4usv(int index, long v) {
        org.lwjgl.opengl.GL20.nglVertexAttrib4usv(index, v);
    }

    @Override public void glVertexAttrib4usv(int index, ShortBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4usv(index, v);
    }

    @Override public void glVertexAttrib4usv(int index, short[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4usv(index, v);
    }

    @Override public void nglVertexAttrib4uiv(int index, long v) {
        org.lwjgl.opengl.GL20.nglVertexAttrib4uiv(index, v);
    }

    @Override public void glVertexAttrib4uiv(int index, IntBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4uiv(index, v);
    }

    @Override public void glVertexAttrib4uiv(int index, int[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4uiv(index, v);
    }

    @Override public void nglVertexAttrib4Nbv(int index, long v) {
        org.lwjgl.opengl.GL20.nglVertexAttrib4Nbv(index, v);
    }

    @Override public void glVertexAttrib4Nbv(int index, ByteBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4Nbv(index, v);
    }

    @Override public void nglVertexAttrib4Nsv(int index, long v) {
        org.lwjgl.opengl.GL20.nglVertexAttrib4Nsv(index, v);
    }

    @Override public void glVertexAttrib4Nsv(int index, ShortBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4Nsv(index, v);
    }

    @Override public void glVertexAttrib4Nsv(int index, short[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4Nsv(index, v);
    }

    @Override public void nglVertexAttrib4Niv(int index, long v) {
        org.lwjgl.opengl.GL20.nglVertexAttrib4Niv(index, v);
    }

    @Override public void glVertexAttrib4Niv(int index, IntBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4Niv(index, v);
    }

    @Override public void glVertexAttrib4Niv(int index, int[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4Niv(index, v);
    }

    @Override public void nglVertexAttrib4Nubv(int index, long v) {
        org.lwjgl.opengl.GL20.nglVertexAttrib4Nubv(index, v);
    }

    @Override public void glVertexAttrib4Nubv(int index, ByteBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4Nubv(index, v);
    }

    @Override public void nglVertexAttrib4Nusv(int index, long v) {
        org.lwjgl.opengl.GL20.nglVertexAttrib4Nusv(index, v);
    }

    @Override public void glVertexAttrib4Nusv(int index, ShortBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4Nusv(index, v);
    }

    @Override public void glVertexAttrib4Nusv(int index, short[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4Nusv(index, v);
    }

    @Override public void nglVertexAttrib4Nuiv(int index, long v) {
        org.lwjgl.opengl.GL20.nglVertexAttrib4Nuiv(index, v);
    }

    @Override public void glVertexAttrib4Nuiv(int index, IntBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4Nuiv(index, v);
    }

    @Override public void glVertexAttrib4Nuiv(int index, int[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4Nuiv(index, v);
    }

    @Override public void nglVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, long pointer) {
        org.lwjgl.opengl.GL20.nglVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    @Override public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, ByteBuffer pointer) {
        org.lwjgl.opengl.GL20.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    @Override public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, long pointer) {
        org.lwjgl.opengl.GL20.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    @Override public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, ShortBuffer pointer) {
        org.lwjgl.opengl.GL20.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    @Override public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, IntBuffer pointer) {
        org.lwjgl.opengl.GL20.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    @Override public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, FloatBuffer pointer) {
        org.lwjgl.opengl.GL20.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    @Override public void glEnableVertexAttribArray(int index) {
        org.lwjgl.opengl.GL20.glEnableVertexAttribArray(index);
    }

    @Override public void glDisableVertexAttribArray(int index) {
        org.lwjgl.opengl.GL20.glDisableVertexAttribArray(index);
    }

    @Override public void nglBindAttribLocation(int program, int index, long name) {
        org.lwjgl.opengl.GL20.nglBindAttribLocation(program, index, name);
    }

    @Override public void glBindAttribLocation(int program, int index, ByteBuffer name) {
        org.lwjgl.opengl.GL20.glBindAttribLocation(program, index, name);
    }

    @Override public void glBindAttribLocation(int program, int index, CharSequence name) {
        org.lwjgl.opengl.GL20.glBindAttribLocation(program, index, name);
    }

    @Override public void nglGetActiveAttrib(int program, int index, int maxLength, long length, long size, long type, long name) {
        org.lwjgl.opengl.GL20.nglGetActiveAttrib(program, index, maxLength, length, size, type, name);
    }

    @Override public void glGetActiveAttrib(int program, int index, @Nullable IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
        org.lwjgl.opengl.GL20.glGetActiveAttrib(program, index, length, size, type, name);
    }

    @Override public String glGetActiveAttrib(int program, int index, int maxLength, IntBuffer size, IntBuffer type) {
        return org.lwjgl.opengl.GL20.glGetActiveAttrib(program, index, maxLength, size, type);
    }

    @Override public String glGetActiveAttrib(int program, int index, IntBuffer size, IntBuffer type) {
        return org.lwjgl.opengl.GL20.glGetActiveAttrib(program, index, size, type);
    }

    @Override public void glGetActiveAttrib(int program, int index, @Nullable int[] length, int[] size, int[] type, ByteBuffer name) {
        org.lwjgl.opengl.GL20.glGetActiveAttrib(program, index, length, size, type, name);
    }

    @Override public int nglGetAttribLocation(int program, long name) {
        return org.lwjgl.opengl.GL20.nglGetAttribLocation(program, name);
    }

    @Override public int glGetAttribLocation(int program, ByteBuffer name) {
        return org.lwjgl.opengl.GL20.glGetAttribLocation(program, name);
    }

    @Override public int glGetAttribLocation(int program, CharSequence name) {
        return org.lwjgl.opengl.GL20.glGetAttribLocation(program, name);
    }

    @Override public void nglGetVertexAttribiv(int index, int pname, long params) {
        org.lwjgl.opengl.GL20.nglGetVertexAttribiv(index, pname, params);
    }

    @Override public void glGetVertexAttribiv(int index, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL20.glGetVertexAttribiv(index, pname, params);
    }

    @Override public void glGetVertexAttribiv(int index, int pname, int[] params) {
        org.lwjgl.opengl.GL20.glGetVertexAttribiv(index, pname, params);
    }

    @Override public int glGetVertexAttribi(int index, int pname) {
        return org.lwjgl.opengl.GL20.glGetVertexAttribi(index, pname);
    }

    @Override public void nglGetVertexAttribfv(int index, int pname, long params) {
        org.lwjgl.opengl.GL20.nglGetVertexAttribfv(index, pname, params);
    }

    @Override public void glGetVertexAttribfv(int index, int pname, FloatBuffer params) {
        org.lwjgl.opengl.GL20.glGetVertexAttribfv(index, pname, params);
    }

    @Override public void glGetVertexAttribfv(int index, int pname, float[] params) {
        org.lwjgl.opengl.GL20.glGetVertexAttribfv(index, pname, params);
    }

    @Override public void nglGetVertexAttribdv(int index, int pname, long params) {
        org.lwjgl.opengl.GL20.nglGetVertexAttribdv(index, pname, params);
    }

    @Override public void glGetVertexAttribdv(int index, int pname, DoubleBuffer params) {
        org.lwjgl.opengl.GL20.glGetVertexAttribdv(index, pname, params);
    }

    @Override public void glGetVertexAttribdv(int index, int pname, double[] params) {
        org.lwjgl.opengl.GL20.glGetVertexAttribdv(index, pname, params);
    }

    @Override public void nglGetVertexAttribPointerv(int index, int pname, long pointer) {
        org.lwjgl.opengl.GL20.nglGetVertexAttribPointerv(index, pname, pointer);
    }

    @Override public void glGetVertexAttribPointerv(int index, int pname, PointerBuffer pointer) {
        org.lwjgl.opengl.GL20.glGetVertexAttribPointerv(index, pname, pointer);
    }

    @Override public long glGetVertexAttribPointer(int index, int pname) {
        return org.lwjgl.opengl.GL20.glGetVertexAttribPointer(index, pname);
    }

    @Override public void nglDrawBuffers(int n, long bufs) {
        org.lwjgl.opengl.GL20.nglDrawBuffers(n, bufs);
    }

    @Override public void glDrawBuffers(IntBuffer bufs) {
        org.lwjgl.opengl.GL20.glDrawBuffers(bufs);
    }

    @Override public void glDrawBuffers(int buf) {
        org.lwjgl.opengl.GL20.glDrawBuffers(buf);
    }

    @Override public void glDrawBuffers(int[] bufs) {
        org.lwjgl.opengl.GL20.glDrawBuffers(bufs);
    }

    @Override public void glBlendEquationSeparate(int modeRGB, int modeAlpha) {
        org.lwjgl.opengl.GL20.glBlendEquationSeparate(modeRGB, modeAlpha);
    }

    @Override public void glStencilOpSeparate(int face, int sfail, int dpfail, int dppass) {
        org.lwjgl.opengl.GL20.glStencilOpSeparate(face, sfail, dpfail, dppass);
    }

    @Override public void glStencilFuncSeparate(int face, int func, int ref, int mask) {
        org.lwjgl.opengl.GL20.glStencilFuncSeparate(face, func, ref, mask);
    }

    @Override public void glStencilMaskSeparate(int face, int mask) {
        org.lwjgl.opengl.GL20.glStencilMaskSeparate(face, mask);
    }

}
