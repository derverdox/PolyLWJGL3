# Code Patterns with PolyLWJGL3 Accessors

This document demonstrates **design patterns enabled by the Accessor-based API**.  
Because each OpenGL function is modeled as a Java interface, we can leverage **polymorphism** and **trait-style composition**.

---

## 1) Trait-Style APIs (Fine-Grained Requirements)

Require only the smallest functional traits instead of a whole GL version.

```java
public final class MeshUploader {
  private final glBindBuffer bindBuffer;
  private final glBufferData bufferData;

  public MeshUploader(glBindBuffer bindBuffer, glBufferData bufferData) {
    this.bindBuffer = bindBuffer;
    this.bufferData = bufferData;
  }

  public void upload(int target, long size, long data, int usage) {
    bindBuffer.glBindBuffer(target, 1);
    bufferData.glBufferData(target, size, data, usage);
  }
}
```

---

## 2) Generics with Intersection Types

Require multiple traits at once via generics.

```java
public final class InstancedDrawer {
  public <G extends glDrawArraysInstanced & glVertexAttribDivisor>
  void draw(G gl, int vao, int count, int instances) {
    gl.glVertexAttribDivisor(0, 1);
    gl.glDrawArraysInstanced(GL11.GL_TRIANGLES, 0, count, instances);
  }
}
```

---

## 3) Feature-Gated Overloads

Differentiate Core vs. ES variants, but expose a unified API.

```java
public final class DebugUtil {
  public void enable(glDebugMessageCallback base, glDebugMessageControl ctrl, long callbackPtr) {
    ctrl.glDebugMessageControl(GL11.GL_DONT_CARE, GL11.GL_DONT_CARE, GL11.GL_DONT_CARE, null, true);
    base.nglDebugMessageCallback(callbackPtr, 0L);
  }

  public void enable(glDebugMessageCallback_CORE core, glDebugMessageControl ctrl,
                     org.lwjgl.opengl.GLDebugMessageCallbackI cb) {
    core.glDebugMessageCallback(cb, 0L);
  }

  public void enable(glDebugMessageCallback_ES es, glDebugMessageControl ctrl,
                     org.lwjgl.opengles.GLDebugMessageCallbackI cb) {
    es.glDebugMessageCallback(cb, 0L);
  }
}
```

---

## 4) Bridge Pattern

Abstraction and implementation separated: same Scene works with GL or GLES.

```java
interface Scene {
  void render(GL30Accessor gl);
}

final class PbrScene implements Scene {
  public void render(GL30Accessor gl) {
    gl.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
  }
}
```

---

## 5) Dynamic Proxy for Cross-Cutting Concerns

Because everything is an interface, you can decorate with proxies.

```java
@SuppressWarnings("unchecked")
public static <T> T withLogging(T target, Class<T> api) {
  return (T) Proxy.newProxyInstance(
      api.getClassLoader(),
      new Class<?>[]{ api },
      (proxy, method, args) -> {
        System.out.println("Calling " + method.getName());
        return method.invoke(target, args);
      });
}

// Usage
GL30Accessor gl = withLogging(new GL30AccessorImpl(), GL30Accessor.class);
```

---

## 6) Interface Segregation

Group only the traits you need.

```java
interface UboCompatible extends glBindBuffer, glBufferData, glBindBufferBase {}

final class UboUploader {
  void upload(UboCompatible gl, int binding, long size, long ptr) {
    gl.glBindBuffer(GL31.GL_UNIFORM_BUFFER, 7);
    gl.glBufferData(GL31.GL_UNIFORM_BUFFER, size, ptr, GL15.GL_STATIC_DRAW);
    gl.glBindBufferBase(GL31.GL_UNIFORM_BUFFER, binding, 7);
  }
}
```

---

## 7) Strategy with Trait Interfaces

```java
interface BlitStrategy { void run(glBlitFramebuffer blit); }

final class MsaaResolve implements BlitStrategy {
  public void run(glBlitFramebuffer blit) {
    blit.glBlitFramebuffer(0,0,1920,1080,0,0,1920,1080, GL11.GL_COLOR_BUFFER_BIT, GL11.GL_NEAREST);
  }
}
```

---

## 8) Default-Method Extensions

Add convenience without touching generated code.

```java
public interface glBufferDataExt extends glBufferData {
  default void uploadData(int target, ByteBuffer data, int usage) {
    glBufferData(target, data, usage);
  }
}
```

---

## 9) Test Doubles / Mocks

Because functions are interfaces, fakes are trivial.

```java
final class RecordingGL15 implements glBindBuffer, glBufferData {
  final List<String> calls = new ArrayList<>();

  @Override
  public void glBindBuffer(int target, int buffer) {
    calls.add("bind " + target + ":" + buffer);
  }

  @Override
  public void glBufferData(int target, long size, long data, int usage) {
    calls.add("bufferData " + size);
  }
}
```

---

## 10) Capability-Gated APIs (Compile-Time Safety)

Require exactly the trait for a feature.

```java
public final class BaseVertexDraw {
  public void draw(glDrawElementsBaseVertex gl, int mode, int count, int type, long indices, int baseVertex) {
    gl.glDrawElementsBaseVertex(mode, count, type, indices, baseVertex);
  }
}
```

---

## ✅ Summary

- Each GL function is a **trait interface**.  
- You can **compose traits** at will via inheritance, intersection types, or grouping.  
- This makes your rendering code **modular, portable, testable, and polymorphic**.
