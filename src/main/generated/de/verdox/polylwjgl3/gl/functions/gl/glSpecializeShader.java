package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl45.GL45Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl45.GL45AccessorImpl;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.GL46;
import org.lwjgl.system.*;

public interface glSpecializeShader {

/**
 * Unsafe version of: {@link #glSpecializeShader SpecializeShader}
 *
 * @param numSpecializationConstants the number of specialization constants whose values to set in this call
 */
    public void nglSpecializeShader(int shader, long pEntryPoint, int numSpecializationConstants, long pConstantIndex, long pConstantValue);

/**
 * Specializes a shader created from a SPIR-V module.
 *
 * <p>Shaders associated with SPIR-V modules must be specialized before they can be linked into a program object. It is not necessary to specialize the
 * shader before it is attached to a program object. Once specialized, a shader may not be specialized again without first re-associating the original
 * SPIR-V module with it, through {@link GL41C#glShaderBinary ShaderBinary}.</p>
 *
 * <p>Specialization does two things:</p>
 *
 * <ul>
 * <li>Selects the name of the entry point, for that shader’s stage, from the SPIR-V module.</li>
 * <li>Sets the values of all, or a subset of, the specialization constants in the SPIRV module.</li>
 * </ul>
 *
 * <p>On successful shader specialization, the compile status for shader is set to {@link GL11#GL_TRUE TRUE}. On failure, the compile status for shader is set to {@link GL11#GL_FALSE FALSE} and
 * additional information about the cause of the failure may be available in the shader compilation log.</p>
 *
 * @param shader         the name of a shader object containing unspecialized SPIR-V as created from a successful call to {@link GL41C#glShaderBinary ShaderBinary} to which a SPIR-V module was
 *                       passed
 * @param pEntryPoint    a pointer to a null-terminated UTF-8 string specifying the name of the entry point in the SPIR-V module to use for this shader
 * @param pConstantIndex is a pointer to an array of {@code numSpecializationConstants} unsigned integers, each holding the index of a specialization constant in the SPIR-V
 *                       module whose value to set.
 *
 *                       <p>Specialization constants not referenced by {@code pConstantIndex} retain their default values as specified in the SPIR-V module.</p>
 * @param pConstantValue an entry in {@code pConstantValue} is used to set the value of the specialization constant indexed by the corresponding entry in
 *                       {@code pConstantIndex}.
 *
 *                       <p>Although this array is of unsigned integer, each entry is bitcast to the appropriate type for the module, and therefore, floating-point constants
 *                       may be set by including their IEEE-754 bit representation in the {@code pConstantValue} array.</p>
 *
 * @see <a href="https://docs.gl/gl4/glSpecializeShader">Reference Page</a>
 */
    public void glSpecializeShader(@NativeType("GLuint") int shader, @NativeType("GLchar const *") ByteBuffer pEntryPoint, @Nullable @NativeType("GLuint const *") IntBuffer pConstantIndex, @Nullable @NativeType("GLuint const *") IntBuffer pConstantValue);

/**
 * Specializes a shader created from a SPIR-V module.
 *
 * <p>Shaders associated with SPIR-V modules must be specialized before they can be linked into a program object. It is not necessary to specialize the
 * shader before it is attached to a program object. Once specialized, a shader may not be specialized again without first re-associating the original
 * SPIR-V module with it, through {@link GL41C#glShaderBinary ShaderBinary}.</p>
 *
 * <p>Specialization does two things:</p>
 *
 * <ul>
 * <li>Selects the name of the entry point, for that shader’s stage, from the SPIR-V module.</li>
 * <li>Sets the values of all, or a subset of, the specialization constants in the SPIRV module.</li>
 * </ul>
 *
 * <p>On successful shader specialization, the compile status for shader is set to {@link GL11#GL_TRUE TRUE}. On failure, the compile status for shader is set to {@link GL11#GL_FALSE FALSE} and
 * additional information about the cause of the failure may be available in the shader compilation log.</p>
 *
 * @param shader         the name of a shader object containing unspecialized SPIR-V as created from a successful call to {@link GL41C#glShaderBinary ShaderBinary} to which a SPIR-V module was
 *                       passed
 * @param pEntryPoint    a pointer to a null-terminated UTF-8 string specifying the name of the entry point in the SPIR-V module to use for this shader
 * @param pConstantIndex is a pointer to an array of {@code numSpecializationConstants} unsigned integers, each holding the index of a specialization constant in the SPIR-V
 *                       module whose value to set.
 *
 *                       <p>Specialization constants not referenced by {@code pConstantIndex} retain their default values as specified in the SPIR-V module.</p>
 * @param pConstantValue an entry in {@code pConstantValue} is used to set the value of the specialization constant indexed by the corresponding entry in
 *                       {@code pConstantIndex}.
 *
 *                       <p>Although this array is of unsigned integer, each entry is bitcast to the appropriate type for the module, and therefore, floating-point constants
 *                       may be set by including their IEEE-754 bit representation in the {@code pConstantValue} array.</p>
 *
 * @see <a href="https://docs.gl/gl4/glSpecializeShader">Reference Page</a>
 */
    public void glSpecializeShader(@NativeType("GLuint") int shader, @NativeType("GLchar const *") CharSequence pEntryPoint, @Nullable @NativeType("GLuint const *") IntBuffer pConstantIndex, @Nullable @NativeType("GLuint const *") IntBuffer pConstantValue);

/**
 * Array version of: {@link #glSpecializeShader SpecializeShader}
 *
 * @see <a href="https://docs.gl/gl4/glSpecializeShader">Reference Page</a>
 */
    public void glSpecializeShader(@NativeType("GLuint") int shader, @NativeType("GLchar const *") ByteBuffer pEntryPoint, @Nullable @NativeType("GLuint const *") int[] pConstantIndex, @Nullable @NativeType("GLuint const *") int[] pConstantValue);

/**
 * Array version of: {@link #glSpecializeShader SpecializeShader}
 *
 * @see <a href="https://docs.gl/gl4/glSpecializeShader">Reference Page</a>
 */
    public void glSpecializeShader(@NativeType("GLuint") int shader, @NativeType("GLchar const *") CharSequence pEntryPoint, @Nullable @NativeType("GLuint const *") int[] pConstantIndex, @Nullable @NativeType("GLuint const *") int[] pConstantValue);

}
