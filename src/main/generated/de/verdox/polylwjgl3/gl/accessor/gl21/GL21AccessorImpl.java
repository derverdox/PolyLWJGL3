package de.verdox.polylwjgl3.gl.accessor.gl21;

import de.verdox.polylwjgl3.gl.accessor.gl20.GL20Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl20.GL20AccessorImpl;
import java.nio.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL21;
import org.lwjgl.system.*;

public class GL21AccessorImpl extends GL20AccessorImpl implements GL21Accessor {

    @Override public void nglUniformMatrix2x3fv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL21.nglUniformMatrix2x3fv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix2x3fv(int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengl.GL21.glUniformMatrix2x3fv(location, transpose, value);
    }

    @Override public void glUniformMatrix2x3fv(int location, boolean transpose, float[] value) {
        org.lwjgl.opengl.GL21.glUniformMatrix2x3fv(location, transpose, value);
    }

    @Override public void nglUniformMatrix3x2fv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL21.nglUniformMatrix3x2fv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix3x2fv(int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengl.GL21.glUniformMatrix3x2fv(location, transpose, value);
    }

    @Override public void glUniformMatrix3x2fv(int location, boolean transpose, float[] value) {
        org.lwjgl.opengl.GL21.glUniformMatrix3x2fv(location, transpose, value);
    }

    @Override public void nglUniformMatrix2x4fv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL21.nglUniformMatrix2x4fv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix2x4fv(int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengl.GL21.glUniformMatrix2x4fv(location, transpose, value);
    }

    @Override public void glUniformMatrix2x4fv(int location, boolean transpose, float[] value) {
        org.lwjgl.opengl.GL21.glUniformMatrix2x4fv(location, transpose, value);
    }

    @Override public void nglUniformMatrix4x2fv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL21.nglUniformMatrix4x2fv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix4x2fv(int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengl.GL21.glUniformMatrix4x2fv(location, transpose, value);
    }

    @Override public void glUniformMatrix4x2fv(int location, boolean transpose, float[] value) {
        org.lwjgl.opengl.GL21.glUniformMatrix4x2fv(location, transpose, value);
    }

    @Override public void nglUniformMatrix3x4fv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL21.nglUniformMatrix3x4fv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix3x4fv(int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengl.GL21.glUniformMatrix3x4fv(location, transpose, value);
    }

    @Override public void glUniformMatrix3x4fv(int location, boolean transpose, float[] value) {
        org.lwjgl.opengl.GL21.glUniformMatrix3x4fv(location, transpose, value);
    }

    @Override public void nglUniformMatrix4x3fv(int location, int count, boolean transpose, long value) {
        org.lwjgl.opengl.GL21.nglUniformMatrix4x3fv(location, count, transpose, value);
    }

    @Override public void glUniformMatrix4x3fv(int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengl.GL21.glUniformMatrix4x3fv(location, transpose, value);
    }

    @Override public void glUniformMatrix4x3fv(int location, boolean transpose, float[] value) {
        org.lwjgl.opengl.GL21.glUniformMatrix4x3fv(location, transpose, value);
    }

}
