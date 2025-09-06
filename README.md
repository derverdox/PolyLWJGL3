# PolyLWJGL3 – Unified OpenGL & OpenGL ES Accessors

PolyLWJGL3 provides a **unified, auto-generated wrapper layer** around [LWJGL3](https://www.lwjgl.org/), exposing  
OpenGL (desktop) and OpenGL ES (embedded) APIs through a consistent set of *Accessor interfaces*.  
This enables writing rendering code against a single abstraction, while still targeting specific GL/GLES versions.

---

## ✨ Features

- ✅ **Covers all versions of OpenGL** from **GL11 → GL46**  
- ✅ **Covers all versions of OpenGL ES** from **GLES20 → GLES32**  
- ✅ **Unified Accessor Interfaces** per GL version  
- ✅ **Automatic wrapper generation** from LWJGL3 bindings  
- ✅ **Avoids duplicate or conflicting methods** via smart parent/child interface detection  
- ✅ **Cross-flavor special handling** (e.g. `glDebugMessageCallback` differences in core vs ES)  
- ✅ **Documentation headers** for each Accessor with method summaries

---

## 📚 Repository Structure

```
src/
 └─ main/
     └─ generated/
         ├─ de/verdox/polylwjgl3/gl/accessor/gl..    # OpenGL Accessors
         ├─ de/verdox/polylwjgl3/gl/accessor/gles..  # GLES Accessors
         └─ de/verdox/polylwjgl3/gl/functions/...    # Function interfaces
```

Each `Accessor` is an interface grouping all functions introduced in that version.  
Example:

```java
public interface GL20Accessor extends GL15Accessor,
    glCreateProgram, glDeleteProgram, glIsProgram, ...
{ }
```

---

## 📊 Statistics

- **~2,500+ function signatures** wrapped
- **36 Accessor interfaces** (`GL11 → GL46`, `GLES20 → GLES32`)
- **400+ function interfaces** (`glFoo`, `glFoo_CORE`, `glFoo_ES`)
- **100% parity with LWJGL3 OpenGL / OpenGL ES coverage**
- Generation process runs in **< 5s** via JavaParser + AST analysis

---

## 🔍 Function Adoption Matrix

To see **which OpenGL functions made it into which GLES version**, check the generated overview:

👉 [OpenGL → OpenGL ES Adoption Matrix](opengl_to_gles_adoption.md)

This matrix is especially useful to compare **desktop vs embedded feature sets** at a glance.

---

## ⚙️ Build & Usage

### Prerequisites
- Java 17+
- Gradle
- LWJGL3 dependencies on classpath

## Code Patterns & Usage

Because every OpenGL function is exposed as a **Java interface**, you can use them as **traits** in your own code.  
This enables clean polymorphic design patterns that are usually not possible with monolithic APIs.

Some examples:

- **Trait-style APIs**: depend only on the minimal set of functions (`glBindBuffer`, `glBufferData`, …) instead of the whole `GL30Accessor`.
- **Intersection types**: use generics like `<T extends glDrawArraysInstanced & glVertexAttribDivisor>` to require combined capabilities.
- **Dynamic Proxies / Decorators**: wrap Accessors for logging, error checking, or telemetry without touching the real implementation.
- **Capability-gated APIs**: functions that exist only in later GL/GLES versions can be enforced at compile-time by requiring the corresponding trait.
- **Test Doubles**: easily mock GL interfaces for headless unit testing.

We prepared a dedicated document with full code examples of these patterns:

➡️ [Code Patterns](./CODE_PATTERNS.md)

### Generate Wrappers
Keep in mind that some imports are not done automatically, and some functions may not have received a correct interface. When generating yourself, you will notice this.
```bash
./gradlew build
```

The generator scans LWJGL bindings and writes wrappers into `src/main/generated`.

### Use in Code
```java
GL20Accessor gl20 = new GL20AccessorImpl();
gl20.glCreateProgram();
```

---

## 🤝 Contributing

Contributions are welcome!  
If you want to improve docs, fix edge cases, or extend tooling, just open a PR.

---

## 📜 License

MIT License – feel free to use in commercial or open-source projects.

---

🚀 *PolyLWJGL3 makes modern and embedded OpenGL programming cleaner, more maintainable, and future-proof.*
