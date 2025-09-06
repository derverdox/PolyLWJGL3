package de.verdox.polylwjgl3.gl.functions.gl;

import de.verdox.polylwjgl3.gl.accessor.gl14.GL14Accessor;
import de.verdox.polylwjgl3.gl.accessor.gl14.GL14AccessorImpl;
import de.verdox.polylwjgl3.gl.functions.glBufferData;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL15;
import org.lwjgl.system.*;

public interface glBufferData_CORE extends glBufferData {

/**
 * Creates and initializes a buffer object's data store.
 *
 * <p>{@code usage} is a hint to the GL implementation as to how a buffer object's data store will be accessed. This enables the GL implementation to make
 * more intelligent decisions that may significantly impact buffer object performance. It does not, however, constrain the actual usage of the data store.
 * {@code usage} can be broken down into two parts: first, the frequency of access (modification and usage), and second, the nature of that access. The
 * frequency of access may be one of these:</p>
 *
 * <ul>
 * <li><em>STREAM</em> - The data store contents will be modified once and used at most a few times.</li>
 * <li><em>STATIC</em> - The data store contents will be modified once and used many times.</li>
 * <li><em>DYNAMIC</em> - The data store contents will be modified repeatedly and used many times.</li>
 * </ul>
 *
 * <p>The nature of access may be one of these:</p>
 *
 * <ul>
 * <li><em>DRAW</em> - The data store contents are modified by the application, and used as the source for GL drawing and image specification commands.</li>
 * <li><em>READ</em> - The data store contents are modified by reading data from the GL, and used to return that data when queried by the application.</li>
 * <li><em>COPY</em> - The data store contents are modified by reading data from the GL, and used as the source for GL drawing and image specification commands.</li>
 * </ul>
 *
 * @param target the target buffer object. One of:<br><table><tr><td>{@link GL15C#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15C#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
 * @param data   a pointer to data that will be copied into the data store for initialization, or {@code NULL} if no data is to be copied
 * @param usage  the expected usage pattern of the data store. One of:<br><table><tr><td>{@link GL15C#GL_STREAM_DRAW STREAM_DRAW}</td><td>{@link GL15C#GL_STREAM_READ STREAM_READ}</td><td>{@link GL15C#GL_STREAM_COPY STREAM_COPY}</td><td>{@link GL15C#GL_STATIC_DRAW STATIC_DRAW}</td><td>{@link GL15C#GL_STATIC_READ STATIC_READ}</td><td>{@link GL15C#GL_STATIC_COPY STATIC_COPY}</td><td>{@link GL15C#GL_DYNAMIC_DRAW DYNAMIC_DRAW}</td></tr><tr><td>{@link GL15C#GL_DYNAMIC_READ DYNAMIC_READ}</td><td>{@link GL15C#GL_DYNAMIC_COPY DYNAMIC_COPY}</td></tr></table>
 *
 * @see <a href="https://docs.gl/gl4/glBufferData">Reference Page</a>
 */
    public void glBufferData(int target, LongBuffer data, int usage);

/**
 * Creates and initializes a buffer object's data store.
 *
 * <p>{@code usage} is a hint to the GL implementation as to how a buffer object's data store will be accessed. This enables the GL implementation to make
 * more intelligent decisions that may significantly impact buffer object performance. It does not, however, constrain the actual usage of the data store.
 * {@code usage} can be broken down into two parts: first, the frequency of access (modification and usage), and second, the nature of that access. The
 * frequency of access may be one of these:</p>
 *
 * <ul>
 * <li><em>STREAM</em> - The data store contents will be modified once and used at most a few times.</li>
 * <li><em>STATIC</em> - The data store contents will be modified once and used many times.</li>
 * <li><em>DYNAMIC</em> - The data store contents will be modified repeatedly and used many times.</li>
 * </ul>
 *
 * <p>The nature of access may be one of these:</p>
 *
 * <ul>
 * <li><em>DRAW</em> - The data store contents are modified by the application, and used as the source for GL drawing and image specification commands.</li>
 * <li><em>READ</em> - The data store contents are modified by reading data from the GL, and used to return that data when queried by the application.</li>
 * <li><em>COPY</em> - The data store contents are modified by reading data from the GL, and used as the source for GL drawing and image specification commands.</li>
 * </ul>
 *
 * @param target the target buffer object. One of:<br><table><tr><td>{@link GL15C#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15C#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
 * @param data   a pointer to data that will be copied into the data store for initialization, or {@code NULL} if no data is to be copied
 * @param usage  the expected usage pattern of the data store. One of:<br><table><tr><td>{@link GL15C#GL_STREAM_DRAW STREAM_DRAW}</td><td>{@link GL15C#GL_STREAM_READ STREAM_READ}</td><td>{@link GL15C#GL_STREAM_COPY STREAM_COPY}</td><td>{@link GL15C#GL_STATIC_DRAW STATIC_DRAW}</td><td>{@link GL15C#GL_STATIC_READ STATIC_READ}</td><td>{@link GL15C#GL_STATIC_COPY STATIC_COPY}</td><td>{@link GL15C#GL_DYNAMIC_DRAW DYNAMIC_DRAW}</td></tr><tr><td>{@link GL15C#GL_DYNAMIC_READ DYNAMIC_READ}</td><td>{@link GL15C#GL_DYNAMIC_COPY DYNAMIC_COPY}</td></tr></table>
 *
 * @see <a href="https://docs.gl/gl4/glBufferData">Reference Page</a>
 */
    public void glBufferData(int target, DoubleBuffer data, int usage);

/**
 * Array version of: {@link #glBufferData BufferData}
 *
 * @see <a href="https://docs.gl/gl4/glBufferData">Reference Page</a>
 */
    public void glBufferData(int target, long[] data, int usage);

/**
 * Array version of: {@link #glBufferData BufferData}
 *
 * @see <a href="https://docs.gl/gl4/glBufferData">Reference Page</a>
 */
    public void glBufferData(int target, double[] data, int usage);

}
