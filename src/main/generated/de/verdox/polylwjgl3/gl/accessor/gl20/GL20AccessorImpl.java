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

@NativeType("GLuint")
    @Override public int glCreateProgram() {
        return org.lwjgl.opengl.GL20.glCreateProgram();
    }

    @Override public void glDeleteProgram(@NativeType("GLuint") int program) {
        org.lwjgl.opengl.GL20.glDeleteProgram(program);
    }

@NativeType("GLboolean")
    @Override public boolean glIsProgram(@NativeType("GLuint") int program) {
        return org.lwjgl.opengl.GL20.glIsProgram(program);
    }

@NativeType("GLuint")
    @Override public int glCreateShader(@NativeType("GLenum") int type) {
        return org.lwjgl.opengl.GL20.glCreateShader(type);
    }

    @Override public void glDeleteShader(@NativeType("GLuint") int shader) {
        org.lwjgl.opengl.GL20.glDeleteShader(shader);
    }

@NativeType("GLboolean")
    @Override public boolean glIsShader(@NativeType("GLuint") int shader) {
        return org.lwjgl.opengl.GL20.glIsShader(shader);
    }

    @Override public void glAttachShader(@NativeType("GLuint") int program, @NativeType("GLuint") int shader) {
        org.lwjgl.opengl.GL20.glAttachShader(program, shader);
    }

    @Override public void glDetachShader(@NativeType("GLuint") int program, @NativeType("GLuint") int shader) {
        org.lwjgl.opengl.GL20.glDetachShader(program, shader);
    }

    @Override public void nglShaderSource(int shader, int count, long strings, long length) {
        org.lwjgl.opengl.GL20.nglShaderSource(shader, count, strings, length);
    }

    @Override public void glShaderSource(@NativeType("GLuint") int shader, @NativeType("GLchar const * const *") PointerBuffer strings, @Nullable @NativeType("GLint const *") IntBuffer length) {
        org.lwjgl.opengl.GL20.glShaderSource(shader, strings, length);
    }

    @Override public void glShaderSource(@NativeType("GLuint") int shader, @NativeType("GLchar const * const *") CharSequence... strings) {
        org.lwjgl.opengl.GL20.glShaderSource(shader, strings);
    }

    @Override public void glShaderSource(@NativeType("GLuint") int shader, @NativeType("GLchar const * const *") CharSequence string) {
        org.lwjgl.opengl.GL20.glShaderSource(shader, string);
    }

    @Override public void glShaderSource(@NativeType("GLuint") int shader, @NativeType("GLchar const * const *") PointerBuffer strings, @Nullable @NativeType("GLint const *") int[] length) {
        org.lwjgl.opengl.GL20.glShaderSource(shader, strings, length);
    }

    @Override public void glCompileShader(@NativeType("GLuint") int shader) {
        org.lwjgl.opengl.GL20.glCompileShader(shader);
    }

    @Override public void glLinkProgram(@NativeType("GLuint") int program) {
        org.lwjgl.opengl.GL20.glLinkProgram(program);
    }

    @Override public void glUseProgram(@NativeType("GLuint") int program) {
        org.lwjgl.opengl.GL20.glUseProgram(program);
    }

    @Override public void glValidateProgram(@NativeType("GLuint") int program) {
        org.lwjgl.opengl.GL20.glValidateProgram(program);
    }

    @Override public void glUniform1f(@NativeType("GLint") int location, @NativeType("GLfloat") float v0) {
        org.lwjgl.opengl.GL20.glUniform1f(location, v0);
    }

    @Override public void glUniform2f(@NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1) {
        org.lwjgl.opengl.GL20.glUniform2f(location, v0, v1);
    }

    @Override public void glUniform3f(@NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2) {
        org.lwjgl.opengl.GL20.glUniform3f(location, v0, v1, v2);
    }

    @Override public void glUniform4f(@NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2, @NativeType("GLfloat") float v3) {
        org.lwjgl.opengl.GL20.glUniform4f(location, v0, v1, v2, v3);
    }

    @Override public void glUniform1i(@NativeType("GLint") int location, @NativeType("GLint") int v0) {
        org.lwjgl.opengl.GL20.glUniform1i(location, v0);
    }

    @Override public void glUniform2i(@NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1) {
        org.lwjgl.opengl.GL20.glUniform2i(location, v0, v1);
    }

    @Override public void glUniform3i(@NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1, @NativeType("GLint") int v2) {
        org.lwjgl.opengl.GL20.glUniform3i(location, v0, v1, v2);
    }

    @Override public void glUniform4i(@NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1, @NativeType("GLint") int v2, @NativeType("GLint") int v3) {
        org.lwjgl.opengl.GL20.glUniform4i(location, v0, v1, v2, v3);
    }

    @Override public void nglUniform1fv(int location, int count, long value) {
        org.lwjgl.opengl.GL20.nglUniform1fv(location, count, value);
    }

    @Override public void glUniform1fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengl.GL20.glUniform1fv(location, value);
    }

    @Override public void glUniform1fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengl.GL20.glUniform1fv(location, value);
    }

    @Override public void nglUniform2fv(int location, int count, long value) {
        org.lwjgl.opengl.GL20.nglUniform2fv(location, count, value);
    }

    @Override public void glUniform2fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengl.GL20.glUniform2fv(location, value);
    }

    @Override public void glUniform2fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengl.GL20.glUniform2fv(location, value);
    }

    @Override public void nglUniform3fv(int location, int count, long value) {
        org.lwjgl.opengl.GL20.nglUniform3fv(location, count, value);
    }

    @Override public void glUniform3fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengl.GL20.glUniform3fv(location, value);
    }

    @Override public void glUniform3fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengl.GL20.glUniform3fv(location, value);
    }

    @Override public void nglUniform4fv(int location, int count, long value) {
        org.lwjgl.opengl.GL20.nglUniform4fv(location, count, value);
    }

    @Override public void glUniform4fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengl.GL20.glUniform4fv(location, value);
    }

    @Override public void glUniform4fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengl.GL20.glUniform4fv(location, value);
    }

    @Override public void nglUniform1iv(int location, int count, long value) {
        org.lwjgl.opengl.GL20.nglUniform1iv(location, count, value);
    }

    @Override public void glUniform1iv(@NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        org.lwjgl.opengl.GL20.glUniform1iv(location, value);
    }

    @Override public void glUniform1iv(@NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        org.lwjgl.opengl.GL20.glUniform1iv(location, value);
    }

    @Override public void nglUniform2iv(int location, int count, long value) {
        org.lwjgl.opengl.GL20.nglUniform2iv(location, count, value);
    }

    @Override public void glUniform2iv(@NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        org.lwjgl.opengl.GL20.glUniform2iv(location, value);
    }

    @Override public void glUniform2iv(@NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        org.lwjgl.opengl.GL20.glUniform2iv(location, value);
    }

    @Override public void nglUniform3iv(int location, int count, long value) {
        org.lwjgl.opengl.GL20.nglUniform3iv(location, count, value);
    }

    @Override public void glUniform3iv(@NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        org.lwjgl.opengl.GL20.glUniform3iv(location, value);
    }

    @Override public void glUniform3iv(@NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        org.lwjgl.opengl.GL20.glUniform3iv(location, value);
    }

    @Override public void nglUniform4iv(int location, int count, long value) {
        org.lwjgl.opengl.GL20.nglUniform4iv(location, count, value);
    }

    @Override public void glUniform4iv(@NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        org.lwjgl.opengl.GL20.glUniform4iv(location, value);
    }

    @Override public void glUniform4iv(@NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        org.lwjgl.opengl.GL20.glUniform4iv(location, value);
    }

    @Override public void nglUniformMatrix2fv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL20.nglUniformMatrix2fv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix2fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengl.GL20.glUniformMatrix2fv(location, transpose, value);
    }

    @Override public void glUniformMatrix2fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengl.GL20.glUniformMatrix2fv(location, transpose, value);
    }

    @Override public void nglUniformMatrix3fv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL20.nglUniformMatrix3fv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix3fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengl.GL20.glUniformMatrix3fv(location, transpose, value);
    }

    @Override public void glUniformMatrix3fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengl.GL20.glUniformMatrix3fv(location, transpose, value);
    }

    @Override public void nglUniformMatrix4fv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL20.nglUniformMatrix4fv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix4fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        org.lwjgl.opengl.GL20.glUniformMatrix4fv(location, transpose, value);
    }

    @Override public void glUniformMatrix4fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        org.lwjgl.opengl.GL20.glUniformMatrix4fv(location, transpose, value);
    }

    @Override public void nglGetShaderiv(int shader, int pname, long params) {
        org.lwjgl.opengl.GL20.nglGetShaderiv(shader, pname, params);
    }

    @Override public void glGetShaderiv(@NativeType("GLuint") int shader, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengl.GL20.glGetShaderiv(shader, pname, params);
    }

    @Override public void glGetShaderiv(@NativeType("GLuint") int shader, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengl.GL20.glGetShaderiv(shader, pname, params);
    }

@NativeType("void")
    @Override public int glGetShaderi(@NativeType("GLuint") int shader, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL20.glGetShaderi(shader, pname);
    }

    @Override public void nglGetProgramiv(int program, int pname, long params) {
        org.lwjgl.opengl.GL20.nglGetProgramiv(program, pname, params);
    }

    @Override public void glGetProgramiv(@NativeType("GLuint") int program, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengl.GL20.glGetProgramiv(program, pname, params);
    }

    @Override public void glGetProgramiv(@NativeType("GLuint") int program, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengl.GL20.glGetProgramiv(program, pname, params);
    }

@NativeType("void")
    @Override public int glGetProgrami(@NativeType("GLuint") int program, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL20.glGetProgrami(program, pname);
    }

    @Override public void nglGetShaderInfoLog(int shader, int maxLength, long length, long infoLog) {
        org.lwjgl.opengl.GL20.nglGetShaderInfoLog(shader, maxLength, length, infoLog);
    }

    @Override public void glGetShaderInfoLog(@NativeType("GLuint") int shader, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLchar *") ByteBuffer infoLog) {
        org.lwjgl.opengl.GL20.glGetShaderInfoLog(shader, length, infoLog);
    }

@NativeType("void")
    @Override public String glGetShaderInfoLog(@NativeType("GLuint") int shader, @NativeType("GLsizei") int maxLength) {
        return org.lwjgl.opengl.GL20.glGetShaderInfoLog(shader, maxLength);
    }

@NativeType("void")
    @Override public String glGetShaderInfoLog(@NativeType("GLuint") int shader) {
        return org.lwjgl.opengl.GL20.glGetShaderInfoLog(shader);
    }

    @Override public void glGetShaderInfoLog(@NativeType("GLuint") int shader, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLchar *") ByteBuffer infoLog) {
        org.lwjgl.opengl.GL20.glGetShaderInfoLog(shader, length, infoLog);
    }

    @Override public void nglGetProgramInfoLog(int program, int maxLength, long length, long infoLog) {
        org.lwjgl.opengl.GL20.nglGetProgramInfoLog(program, maxLength, length, infoLog);
    }

    @Override public void glGetProgramInfoLog(@NativeType("GLuint") int program, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLchar *") ByteBuffer infoLog) {
        org.lwjgl.opengl.GL20.glGetProgramInfoLog(program, length, infoLog);
    }

@NativeType("void")
    @Override public String glGetProgramInfoLog(@NativeType("GLuint") int program, @NativeType("GLsizei") int maxLength) {
        return org.lwjgl.opengl.GL20.glGetProgramInfoLog(program, maxLength);
    }

@NativeType("void")
    @Override public String glGetProgramInfoLog(@NativeType("GLuint") int program) {
        return org.lwjgl.opengl.GL20.glGetProgramInfoLog(program);
    }

    @Override public void glGetProgramInfoLog(@NativeType("GLuint") int program, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLchar *") ByteBuffer infoLog) {
        org.lwjgl.opengl.GL20.glGetProgramInfoLog(program, length, infoLog);
    }

    @Override public void nglGetAttachedShaders(int program, int maxCount, long count, long shaders) {
        org.lwjgl.opengl.GL20.nglGetAttachedShaders(program, maxCount, count, shaders);
    }

    @Override public void glGetAttachedShaders(@NativeType("GLuint") int program, @Nullable @NativeType("GLsizei *") IntBuffer count, @NativeType("GLuint *") IntBuffer shaders) {
        org.lwjgl.opengl.GL20.glGetAttachedShaders(program, count, shaders);
    }

    @Override public void glGetAttachedShaders(@NativeType("GLuint") int program, @Nullable @NativeType("GLsizei *") int[] count, @NativeType("GLuint *") int[] shaders) {
        org.lwjgl.opengl.GL20.glGetAttachedShaders(program, count, shaders);
    }

    @Override public int nglGetUniformLocation(int program, long name) {
        return org.lwjgl.opengl.GL20.nglGetUniformLocation(program, name);
    }

@NativeType("GLint")
    @Override public int glGetUniformLocation(@NativeType("GLuint") int program, @NativeType("GLchar const *") ByteBuffer name) {
        return org.lwjgl.opengl.GL20.glGetUniformLocation(program, name);
    }

@NativeType("GLint")
    @Override public int glGetUniformLocation(@NativeType("GLuint") int program, @NativeType("GLchar const *") CharSequence name) {
        return org.lwjgl.opengl.GL20.glGetUniformLocation(program, name);
    }

    @Override public void nglGetActiveUniform(int program, int index, int maxLength, long length, long size, long type, long name) {
        org.lwjgl.opengl.GL20.nglGetActiveUniform(program, index, maxLength, length, size, type, name);
    }

    @Override public void glGetActiveUniform(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type, @NativeType("GLchar *") ByteBuffer name) {
        org.lwjgl.opengl.GL20.glGetActiveUniform(program, index, length, size, type, name);
    }

@NativeType("void")
    @Override public String glGetActiveUniform(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei") int maxLength, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type) {
        return org.lwjgl.opengl.GL20.glGetActiveUniform(program, index, maxLength, size, type);
    }

@NativeType("void")
    @Override public String glGetActiveUniform(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type) {
        return org.lwjgl.opengl.GL20.glGetActiveUniform(program, index, size, type);
    }

    @Override public void glGetActiveUniform(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLint *") int[] size, @NativeType("GLenum *") int[] type, @NativeType("GLchar *") ByteBuffer name) {
        org.lwjgl.opengl.GL20.glGetActiveUniform(program, index, length, size, type, name);
    }

    @Override public void nglGetUniformfv(int program, int location, long params) {
        org.lwjgl.opengl.GL20.nglGetUniformfv(program, location, params);
    }

    @Override public void glGetUniformfv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") FloatBuffer params) {
        org.lwjgl.opengl.GL20.glGetUniformfv(program, location, params);
    }

    @Override public void glGetUniformfv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") float[] params) {
        org.lwjgl.opengl.GL20.glGetUniformfv(program, location, params);
    }

@NativeType("void")
    @Override public float glGetUniformf(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        return org.lwjgl.opengl.GL20.glGetUniformf(program, location);
    }

    @Override public void nglGetUniformiv(int program, int location, long params) {
        org.lwjgl.opengl.GL20.nglGetUniformiv(program, location, params);
    }

    @Override public void glGetUniformiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengl.GL20.glGetUniformiv(program, location, params);
    }

    @Override public void glGetUniformiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengl.GL20.glGetUniformiv(program, location, params);
    }

@NativeType("void")
    @Override public int glGetUniformi(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        return org.lwjgl.opengl.GL20.glGetUniformi(program, location);
    }

    @Override public void nglGetShaderSource(int shader, int maxLength, long length, long source) {
        org.lwjgl.opengl.GL20.nglGetShaderSource(shader, maxLength, length, source);
    }

    @Override public void glGetShaderSource(@NativeType("GLuint") int shader, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLchar *") ByteBuffer source) {
        org.lwjgl.opengl.GL20.glGetShaderSource(shader, length, source);
    }

@NativeType("void")
    @Override public String glGetShaderSource(@NativeType("GLuint") int shader, @NativeType("GLsizei") int maxLength) {
        return org.lwjgl.opengl.GL20.glGetShaderSource(shader, maxLength);
    }

@NativeType("void")
    @Override public String glGetShaderSource(@NativeType("GLuint") int shader) {
        return org.lwjgl.opengl.GL20.glGetShaderSource(shader);
    }

    @Override public void glGetShaderSource(@NativeType("GLuint") int shader, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLchar *") ByteBuffer source) {
        org.lwjgl.opengl.GL20.glGetShaderSource(shader, length, source);
    }

    @Override public void glVertexAttrib1f(@NativeType("GLuint") int index, @NativeType("GLfloat") float v0) {
        org.lwjgl.opengl.GL20.glVertexAttrib1f(index, v0);
    }

    @Override public void glVertexAttrib1s(@NativeType("GLuint") int index, @NativeType("GLshort") short v0) {
        org.lwjgl.opengl.GL20.glVertexAttrib1s(index, v0);
    }

    @Override public void glVertexAttrib1d(@NativeType("GLuint") int index, @NativeType("GLdouble") double v0) {
        org.lwjgl.opengl.GL20.glVertexAttrib1d(index, v0);
    }

    @Override public void glVertexAttrib2f(@NativeType("GLuint") int index, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1) {
        org.lwjgl.opengl.GL20.glVertexAttrib2f(index, v0, v1);
    }

    @Override public void glVertexAttrib2s(@NativeType("GLuint") int index, @NativeType("GLshort") short v0, @NativeType("GLshort") short v1) {
        org.lwjgl.opengl.GL20.glVertexAttrib2s(index, v0, v1);
    }

    @Override public void glVertexAttrib2d(@NativeType("GLuint") int index, @NativeType("GLdouble") double v0, @NativeType("GLdouble") double v1) {
        org.lwjgl.opengl.GL20.glVertexAttrib2d(index, v0, v1);
    }

    @Override public void glVertexAttrib3f(@NativeType("GLuint") int index, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2) {
        org.lwjgl.opengl.GL20.glVertexAttrib3f(index, v0, v1, v2);
    }

    @Override public void glVertexAttrib3s(@NativeType("GLuint") int index, @NativeType("GLshort") short v0, @NativeType("GLshort") short v1, @NativeType("GLshort") short v2) {
        org.lwjgl.opengl.GL20.glVertexAttrib3s(index, v0, v1, v2);
    }

    @Override public void glVertexAttrib3d(@NativeType("GLuint") int index, @NativeType("GLdouble") double v0, @NativeType("GLdouble") double v1, @NativeType("GLdouble") double v2) {
        org.lwjgl.opengl.GL20.glVertexAttrib3d(index, v0, v1, v2);
    }

    @Override public void glVertexAttrib4f(@NativeType("GLuint") int index, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2, @NativeType("GLfloat") float v3) {
        org.lwjgl.opengl.GL20.glVertexAttrib4f(index, v0, v1, v2, v3);
    }

    @Override public void glVertexAttrib4s(@NativeType("GLuint") int index, @NativeType("GLshort") short v0, @NativeType("GLshort") short v1, @NativeType("GLshort") short v2, @NativeType("GLshort") short v3) {
        org.lwjgl.opengl.GL20.glVertexAttrib4s(index, v0, v1, v2, v3);
    }

    @Override public void glVertexAttrib4d(@NativeType("GLuint") int index, @NativeType("GLdouble") double v0, @NativeType("GLdouble") double v1, @NativeType("GLdouble") double v2, @NativeType("GLdouble") double v3) {
        org.lwjgl.opengl.GL20.glVertexAttrib4d(index, v0, v1, v2, v3);
    }

    @Override public void glVertexAttrib4Nub(@NativeType("GLuint") int index, @NativeType("GLubyte") byte x, @NativeType("GLubyte") byte y, @NativeType("GLubyte") byte z, @NativeType("GLubyte") byte w) {
        org.lwjgl.opengl.GL20.glVertexAttrib4Nub(index, x, y, z, w);
    }

    @Override public void nglVertexAttrib1fv(int index, long v) {
        org.lwjgl.opengl.GL20.nglVertexAttrib1fv(index, v);
    }

    @Override public void glVertexAttrib1fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib1fv(index, v);
    }

    @Override public void glVertexAttrib1fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib1fv(index, v);
    }

    @Override public void nglVertexAttrib1sv(int index, long v) {
        org.lwjgl.opengl.GL20.nglVertexAttrib1sv(index, v);
    }

    @Override public void glVertexAttrib1sv(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib1sv(index, v);
    }

    @Override public void glVertexAttrib1sv(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib1sv(index, v);
    }

    @Override public void nglVertexAttrib1dv(int index, long v) {
        org.lwjgl.opengl.GL20.nglVertexAttrib1dv(index, v);
    }

    @Override public void glVertexAttrib1dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib1dv(index, v);
    }

    @Override public void glVertexAttrib1dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib1dv(index, v);
    }

    @Override public void nglVertexAttrib2fv(int index, long v) {
        org.lwjgl.opengl.GL20.nglVertexAttrib2fv(index, v);
    }

    @Override public void glVertexAttrib2fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib2fv(index, v);
    }

    @Override public void glVertexAttrib2fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib2fv(index, v);
    }

    @Override public void nglVertexAttrib2sv(int index, long v) {
        org.lwjgl.opengl.GL20.nglVertexAttrib2sv(index, v);
    }

    @Override public void glVertexAttrib2sv(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib2sv(index, v);
    }

    @Override public void glVertexAttrib2sv(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib2sv(index, v);
    }

    @Override public void nglVertexAttrib2dv(int index, long v) {
        org.lwjgl.opengl.GL20.nglVertexAttrib2dv(index, v);
    }

    @Override public void glVertexAttrib2dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib2dv(index, v);
    }

    @Override public void glVertexAttrib2dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib2dv(index, v);
    }

    @Override public void nglVertexAttrib3fv(int index, long v) {
        org.lwjgl.opengl.GL20.nglVertexAttrib3fv(index, v);
    }

    @Override public void glVertexAttrib3fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib3fv(index, v);
    }

    @Override public void glVertexAttrib3fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib3fv(index, v);
    }

    @Override public void nglVertexAttrib3sv(int index, long v) {
        org.lwjgl.opengl.GL20.nglVertexAttrib3sv(index, v);
    }

    @Override public void glVertexAttrib3sv(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib3sv(index, v);
    }

    @Override public void glVertexAttrib3sv(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib3sv(index, v);
    }

    @Override public void nglVertexAttrib3dv(int index, long v) {
        org.lwjgl.opengl.GL20.nglVertexAttrib3dv(index, v);
    }

    @Override public void glVertexAttrib3dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib3dv(index, v);
    }

    @Override public void glVertexAttrib3dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib3dv(index, v);
    }

    @Override public void nglVertexAttrib4fv(int index, long v) {
        org.lwjgl.opengl.GL20.nglVertexAttrib4fv(index, v);
    }

    @Override public void glVertexAttrib4fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4fv(index, v);
    }

    @Override public void glVertexAttrib4fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4fv(index, v);
    }

    @Override public void nglVertexAttrib4sv(int index, long v) {
        org.lwjgl.opengl.GL20.nglVertexAttrib4sv(index, v);
    }

    @Override public void glVertexAttrib4sv(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4sv(index, v);
    }

    @Override public void glVertexAttrib4sv(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4sv(index, v);
    }

    @Override public void nglVertexAttrib4dv(int index, long v) {
        org.lwjgl.opengl.GL20.nglVertexAttrib4dv(index, v);
    }

    @Override public void glVertexAttrib4dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4dv(index, v);
    }

    @Override public void glVertexAttrib4dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4dv(index, v);
    }

    @Override public void nglVertexAttrib4iv(int index, long v) {
        org.lwjgl.opengl.GL20.nglVertexAttrib4iv(index, v);
    }

    @Override public void glVertexAttrib4iv(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4iv(index, v);
    }

    @Override public void glVertexAttrib4iv(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4iv(index, v);
    }

    @Override public void nglVertexAttrib4bv(int index, long v) {
        org.lwjgl.opengl.GL20.nglVertexAttrib4bv(index, v);
    }

    @Override public void glVertexAttrib4bv(@NativeType("GLuint") int index, @NativeType("GLbyte const *") ByteBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4bv(index, v);
    }

    @Override public void nglVertexAttrib4ubv(int index, long v) {
        org.lwjgl.opengl.GL20.nglVertexAttrib4ubv(index, v);
    }

    @Override public void glVertexAttrib4ubv(@NativeType("GLuint") int index, @NativeType("GLubyte const *") ByteBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4ubv(index, v);
    }

    @Override public void nglVertexAttrib4usv(int index, long v) {
        org.lwjgl.opengl.GL20.nglVertexAttrib4usv(index, v);
    }

    @Override public void glVertexAttrib4usv(@NativeType("GLuint") int index, @NativeType("GLushort const *") ShortBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4usv(index, v);
    }

    @Override public void glVertexAttrib4usv(@NativeType("GLuint") int index, @NativeType("GLushort const *") short[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4usv(index, v);
    }

    @Override public void nglVertexAttrib4uiv(int index, long v) {
        org.lwjgl.opengl.GL20.nglVertexAttrib4uiv(index, v);
    }

    @Override public void glVertexAttrib4uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4uiv(index, v);
    }

    @Override public void glVertexAttrib4uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4uiv(index, v);
    }

    @Override public void nglVertexAttrib4Nbv(int index, long v) {
        org.lwjgl.opengl.GL20.nglVertexAttrib4Nbv(index, v);
    }

    @Override public void glVertexAttrib4Nbv(@NativeType("GLuint") int index, @NativeType("GLbyte const *") ByteBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4Nbv(index, v);
    }

    @Override public void nglVertexAttrib4Nsv(int index, long v) {
        org.lwjgl.opengl.GL20.nglVertexAttrib4Nsv(index, v);
    }

    @Override public void glVertexAttrib4Nsv(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4Nsv(index, v);
    }

    @Override public void glVertexAttrib4Nsv(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4Nsv(index, v);
    }

    @Override public void nglVertexAttrib4Niv(int index, long v) {
        org.lwjgl.opengl.GL20.nglVertexAttrib4Niv(index, v);
    }

    @Override public void glVertexAttrib4Niv(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4Niv(index, v);
    }

    @Override public void glVertexAttrib4Niv(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4Niv(index, v);
    }

    @Override public void nglVertexAttrib4Nubv(int index, long v) {
        org.lwjgl.opengl.GL20.nglVertexAttrib4Nubv(index, v);
    }

    @Override public void glVertexAttrib4Nubv(@NativeType("GLuint") int index, @NativeType("GLubyte const *") ByteBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4Nubv(index, v);
    }

    @Override public void nglVertexAttrib4Nusv(int index, long v) {
        org.lwjgl.opengl.GL20.nglVertexAttrib4Nusv(index, v);
    }

    @Override public void glVertexAttrib4Nusv(@NativeType("GLuint") int index, @NativeType("GLushort const *") ShortBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4Nusv(index, v);
    }

    @Override public void glVertexAttrib4Nusv(@NativeType("GLuint") int index, @NativeType("GLushort const *") short[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4Nusv(index, v);
    }

    @Override public void nglVertexAttrib4Nuiv(int index, long v) {
        org.lwjgl.opengl.GL20.nglVertexAttrib4Nuiv(index, v);
    }

    @Override public void glVertexAttrib4Nuiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4Nuiv(index, v);
    }

    @Override public void glVertexAttrib4Nuiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        org.lwjgl.opengl.GL20.glVertexAttrib4Nuiv(index, v);
    }

    @Override public void nglVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, long pointer) {
        org.lwjgl.opengl.GL20.nglVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    @Override public void glVertexAttribPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        org.lwjgl.opengl.GL20.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    @Override public void glVertexAttribPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        org.lwjgl.opengl.GL20.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    @Override public void glVertexAttribPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer) {
        org.lwjgl.opengl.GL20.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    @Override public void glVertexAttribPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") IntBuffer pointer) {
        org.lwjgl.opengl.GL20.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    @Override public void glVertexAttribPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") FloatBuffer pointer) {
        org.lwjgl.opengl.GL20.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    @Override public void glEnableVertexAttribArray(@NativeType("GLuint") int index) {
        org.lwjgl.opengl.GL20.glEnableVertexAttribArray(index);
    }

    @Override public void glDisableVertexAttribArray(@NativeType("GLuint") int index) {
        org.lwjgl.opengl.GL20.glDisableVertexAttribArray(index);
    }

    @Override public void nglBindAttribLocation(int program, int index, long name) {
        org.lwjgl.opengl.GL20.nglBindAttribLocation(program, index, name);
    }

    @Override public void glBindAttribLocation(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLchar const *") ByteBuffer name) {
        org.lwjgl.opengl.GL20.glBindAttribLocation(program, index, name);
    }

    @Override public void glBindAttribLocation(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLchar const *") CharSequence name) {
        org.lwjgl.opengl.GL20.glBindAttribLocation(program, index, name);
    }

    @Override public void nglGetActiveAttrib(int program, int index, int maxLength, long length, long size, long type, long name) {
        org.lwjgl.opengl.GL20.nglGetActiveAttrib(program, index, maxLength, length, size, type, name);
    }

    @Override public void glGetActiveAttrib(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type, @NativeType("GLchar *") ByteBuffer name) {
        org.lwjgl.opengl.GL20.glGetActiveAttrib(program, index, length, size, type, name);
    }

@NativeType("void")
    @Override public String glGetActiveAttrib(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei") int maxLength, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type) {
        return org.lwjgl.opengl.GL20.glGetActiveAttrib(program, index, maxLength, size, type);
    }

@NativeType("void")
    @Override public String glGetActiveAttrib(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type) {
        return org.lwjgl.opengl.GL20.glGetActiveAttrib(program, index, size, type);
    }

    @Override public void glGetActiveAttrib(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLint *") int[] size, @NativeType("GLenum *") int[] type, @NativeType("GLchar *") ByteBuffer name) {
        org.lwjgl.opengl.GL20.glGetActiveAttrib(program, index, length, size, type, name);
    }

    @Override public int nglGetAttribLocation(int program, long name) {
        return org.lwjgl.opengl.GL20.nglGetAttribLocation(program, name);
    }

@NativeType("GLint")
    @Override public int glGetAttribLocation(@NativeType("GLuint") int program, @NativeType("GLchar const *") ByteBuffer name) {
        return org.lwjgl.opengl.GL20.glGetAttribLocation(program, name);
    }

@NativeType("GLint")
    @Override public int glGetAttribLocation(@NativeType("GLuint") int program, @NativeType("GLchar const *") CharSequence name) {
        return org.lwjgl.opengl.GL20.glGetAttribLocation(program, name);
    }

    @Override public void nglGetVertexAttribiv(int index, int pname, long params) {
        org.lwjgl.opengl.GL20.nglGetVertexAttribiv(index, pname, params);
    }

    @Override public void glGetVertexAttribiv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        org.lwjgl.opengl.GL20.glGetVertexAttribiv(index, pname, params);
    }

    @Override public void glGetVertexAttribiv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        org.lwjgl.opengl.GL20.glGetVertexAttribiv(index, pname, params);
    }

@NativeType("void")
    @Override public int glGetVertexAttribi(@NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL20.glGetVertexAttribi(index, pname);
    }

    @Override public void nglGetVertexAttribfv(int index, int pname, long params) {
        org.lwjgl.opengl.GL20.nglGetVertexAttribfv(index, pname, params);
    }

    @Override public void glGetVertexAttribfv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        org.lwjgl.opengl.GL20.glGetVertexAttribfv(index, pname, params);
    }

    @Override public void glGetVertexAttribfv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        org.lwjgl.opengl.GL20.glGetVertexAttribfv(index, pname, params);
    }

    @Override public void nglGetVertexAttribdv(int index, int pname, long params) {
        org.lwjgl.opengl.GL20.nglGetVertexAttribdv(index, pname, params);
    }

    @Override public void glGetVertexAttribdv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLdouble *") DoubleBuffer params) {
        org.lwjgl.opengl.GL20.glGetVertexAttribdv(index, pname, params);
    }

    @Override public void glGetVertexAttribdv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLdouble *") double[] params) {
        org.lwjgl.opengl.GL20.glGetVertexAttribdv(index, pname, params);
    }

    @Override public void nglGetVertexAttribPointerv(int index, int pname, long pointer) {
        org.lwjgl.opengl.GL20.nglGetVertexAttribPointerv(index, pname, pointer);
    }

    @Override public void glGetVertexAttribPointerv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("void **") PointerBuffer pointer) {
        org.lwjgl.opengl.GL20.glGetVertexAttribPointerv(index, pname, pointer);
    }

@NativeType("void")
    @Override public long glGetVertexAttribPointer(@NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        return org.lwjgl.opengl.GL20.glGetVertexAttribPointer(index, pname);
    }

    @Override public void nglDrawBuffers(int n, long bufs) {
        org.lwjgl.opengl.GL20.nglDrawBuffers(n, bufs);
    }

    @Override public void glDrawBuffers(@NativeType("GLenum const *") IntBuffer bufs) {
        org.lwjgl.opengl.GL20.glDrawBuffers(bufs);
    }

    @Override public void glDrawBuffers(@NativeType("GLenum const *") int buf) {
        org.lwjgl.opengl.GL20.glDrawBuffers(buf);
    }

    @Override public void glDrawBuffers(@NativeType("GLenum const *") int[] bufs) {
        org.lwjgl.opengl.GL20.glDrawBuffers(bufs);
    }

    @Override public void glBlendEquationSeparate(@NativeType("GLenum") int modeRGB, @NativeType("GLenum") int modeAlpha) {
        org.lwjgl.opengl.GL20.glBlendEquationSeparate(modeRGB, modeAlpha);
    }

    @Override public void glStencilOpSeparate(@NativeType("GLenum") int face, @NativeType("GLenum") int sfail, @NativeType("GLenum") int dpfail, @NativeType("GLenum") int dppass) {
        org.lwjgl.opengl.GL20.glStencilOpSeparate(face, sfail, dpfail, dppass);
    }

    @Override public void glStencilFuncSeparate(@NativeType("GLenum") int face, @NativeType("GLenum") int func, @NativeType("GLint") int ref, @NativeType("GLuint") int mask) {
        org.lwjgl.opengl.GL20.glStencilFuncSeparate(face, func, ref, mask);
    }

    @Override public void glStencilMaskSeparate(@NativeType("GLenum") int face, @NativeType("GLuint") int mask) {
        org.lwjgl.opengl.GL20.glStencilMaskSeparate(face, mask);
    }

}
