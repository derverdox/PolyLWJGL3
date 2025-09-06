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

### Generate Wrappers
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


# OpenGL → OpenGL ES Adoption Matrix

This table focuses on **which desktop OpenGL functions made it into OpenGL ES**, and when.
Rows are ordered by the OpenGL version where the function first appeared. Columns show the first ES version that adopted it and presence across ES versions.

| Function | Introduced (GL) | Adopted in ES | GLES20 | GLES30 | GLES31 | GLES32 |
|---|---|---|---|---|---|---|
| glAccum | GL11 | — |  |  |  |  |
| glAlphaFunc | GL11 | — |  |  |  |  |
| glAreTexturesResident | GL11 | — |  |  |  |  |
| glArrayElement | GL11 | — |  |  |  |  |
| glBegin | GL11 | — |  |  |  |  |
| glBindTexture | GL11 | GLES20 | ✔ |  |  |  |
| glBitmap | GL11 | — |  |  |  |  |
| glBlendFunc | GL11 | GLES20 | ✔ |  |  |  |
| glCallList | GL11 | — |  |  |  |  |
| glCallLists | GL11 | — |  |  |  |  |
| glClear | GL11 | GLES20 | ✔ |  |  |  |
| glClearAccum | GL11 | — |  |  |  |  |
| glClearColor | GL11 | GLES20 | ✔ |  |  |  |
| glClearDepth | GL11 | — |  |  |  |  |
| glClearIndex | GL11 | — |  |  |  |  |
| glClearStencil | GL11 | GLES20 | ✔ |  |  |  |
| glClipPlane | GL11 | — |  |  |  |  |
| glColor3b | GL11 | — |  |  |  |  |
| glColor3bv | GL11 | — |  |  |  |  |
| glColor3d | GL11 | — |  |  |  |  |
| glColor3dv | GL11 | — |  |  |  |  |
| glColor3f | GL11 | — |  |  |  |  |
| glColor3fv | GL11 | — |  |  |  |  |
| glColor3i | GL11 | — |  |  |  |  |
| glColor3iv | GL11 | — |  |  |  |  |
| glColor3s | GL11 | — |  |  |  |  |
| glColor3sv | GL11 | — |  |  |  |  |
| glColor3ub | GL11 | — |  |  |  |  |
| glColor3ubv | GL11 | — |  |  |  |  |
| glColor3ui | GL11 | — |  |  |  |  |
| glColor3uiv | GL11 | — |  |  |  |  |
| glColor3us | GL11 | — |  |  |  |  |
| glColor3usv | GL11 | — |  |  |  |  |
| glColor4b | GL11 | — |  |  |  |  |
| glColor4bv | GL11 | — |  |  |  |  |
| glColor4d | GL11 | — |  |  |  |  |
| glColor4dv | GL11 | — |  |  |  |  |
| glColor4f | GL11 | — |  |  |  |  |
| glColor4fv | GL11 | — |  |  |  |  |
| glColor4i | GL11 | — |  |  |  |  |
| glColor4iv | GL11 | — |  |  |  |  |
| glColor4s | GL11 | — |  |  |  |  |
| glColor4sv | GL11 | — |  |  |  |  |
| glColor4ub | GL11 | — |  |  |  |  |
| glColor4ubv | GL11 | — |  |  |  |  |
| glColor4ui | GL11 | — |  |  |  |  |
| glColor4uiv | GL11 | — |  |  |  |  |
| glColor4us | GL11 | — |  |  |  |  |
| glColor4usv | GL11 | — |  |  |  |  |
| glColorMask | GL11 | GLES20 | ✔ |  |  |  |
| glColorMaterial | GL11 | — |  |  |  |  |
| glColorPointer | GL11 | — |  |  |  |  |
| glCopyPixels | GL11 | — |  |  |  |  |
| glCopyTexImage1D | GL11 | — |  |  |  |  |
| glCopyTexImage2D | GL11 | GLES20 | ✔ |  |  |  |
| glCopyTexSubImage1D | GL11 | — |  |  |  |  |
| glCopyTexSubImage2D | GL11 | GLES20 | ✔ |  |  |  |
| glCullFace | GL11 | GLES20 | ✔ |  |  |  |
| glDeleteLists | GL11 | — |  |  |  |  |
| glDeleteTextures | GL11 | GLES20 | ✔ |  |  |  |
| glDepthFunc | GL11 | GLES20 | ✔ |  |  |  |
| glDepthMask | GL11 | GLES20 | ✔ |  |  |  |
| glDepthRange | GL11 | — |  |  |  |  |
| glDisable | GL11 | GLES20 | ✔ |  |  |  |
| glDisableClientState | GL11 | — |  |  |  |  |
| glDrawArrays | GL11 | GLES20 | ✔ |  |  |  |
| glDrawBuffer | GL11 | — |  |  |  |  |
| glDrawElements | GL11 | GLES20 | ✔ |  |  |  |
| glDrawPixels | GL11 | — |  |  |  |  |
| glEdgeFlag | GL11 | — |  |  |  |  |
| glEdgeFlagPointer | GL11 | — |  |  |  |  |
| glEdgeFlagv | GL11 | — |  |  |  |  |
| glEnable | GL11 | GLES20 | ✔ |  |  |  |
| glEnableClientState | GL11 | — |  |  |  |  |
| glEnd | GL11 | — |  |  |  |  |
| glEndList | GL11 | — |  |  |  |  |
| glEvalCoord1d | GL11 | — |  |  |  |  |
| glEvalCoord1dv | GL11 | — |  |  |  |  |
| glEvalCoord1f | GL11 | — |  |  |  |  |
| glEvalCoord1fv | GL11 | — |  |  |  |  |
| glEvalCoord2d | GL11 | — |  |  |  |  |
| glEvalCoord2dv | GL11 | — |  |  |  |  |
| glEvalCoord2f | GL11 | — |  |  |  |  |
| glEvalCoord2fv | GL11 | — |  |  |  |  |
| glEvalMesh1 | GL11 | — |  |  |  |  |
| glEvalMesh2 | GL11 | — |  |  |  |  |
| glEvalPoint1 | GL11 | — |  |  |  |  |
| glEvalPoint2 | GL11 | — |  |  |  |  |
| glFeedbackBuffer | GL11 | — |  |  |  |  |
| glFinish | GL11 | GLES20 | ✔ |  |  |  |
| glFlush | GL11 | GLES20 | ✔ |  |  |  |
| glFogf | GL11 | — |  |  |  |  |
| glFogfv | GL11 | — |  |  |  |  |
| glFogi | GL11 | — |  |  |  |  |
| glFogiv | GL11 | — |  |  |  |  |
| glFrontFace | GL11 | GLES20 | ✔ |  |  |  |
| glFrustum | GL11 | — |  |  |  |  |
| glGenLists | GL11 | — |  |  |  |  |
| glGenTextures | GL11 | GLES20 | ✔ |  |  |  |
| glGetBoolean | GL11 | GLES20 | ✔ |  |  |  |
| glGetBooleanv | GL11 | GLES20 | ✔ |  |  |  |
| glGetClipPlane | GL11 | — |  |  |  |  |
| glGetDouble | GL11 | — |  |  |  |  |
| glGetDoublev | GL11 | — |  |  |  |  |
| glGetError | GL11 | GLES20 | ✔ |  |  |  |
| glGetFloat | GL11 | GLES20 | ✔ |  |  |  |
| glGetFloatv | GL11 | GLES20 | ✔ |  |  |  |
| glGetInteger | GL11 | GLES20 | ✔ |  |  |  |
| glGetIntegerv | GL11 | GLES20 | ✔ |  |  |  |
| glGetLightf | GL11 | — |  |  |  |  |
| glGetLightfv | GL11 | — |  |  |  |  |
| glGetLighti | GL11 | — |  |  |  |  |
| glGetLightiv | GL11 | — |  |  |  |  |
| glGetMapd | GL11 | — |  |  |  |  |
| glGetMapdv | GL11 | — |  |  |  |  |
| glGetMapf | GL11 | — |  |  |  |  |
| glGetMapfv | GL11 | — |  |  |  |  |
| glGetMapi | GL11 | — |  |  |  |  |
| glGetMapiv | GL11 | — |  |  |  |  |
| glGetMaterialfv | GL11 | — |  |  |  |  |
| glGetMaterialiv | GL11 | — |  |  |  |  |
| glGetPixelMapfv | GL11 | — |  |  |  |  |
| glGetPixelMapuiv | GL11 | — |  |  |  |  |
| glGetPixelMapusv | GL11 | — |  |  |  |  |
| glGetPointer | GL11 | GLES32 |  |  |  | ✔ |
| glGetPointerv | GL11 | GLES32 |  |  |  | ✔ |
| glGetPolygonStipple | GL11 | — |  |  |  |  |
| glGetString | GL11 | GLES20 | ✔ |  |  |  |
| glGetTexEnvf | GL11 | — |  |  |  |  |
| glGetTexEnvfv | GL11 | — |  |  |  |  |
| glGetTexEnvi | GL11 | — |  |  |  |  |
| glGetTexEnviv | GL11 | — |  |  |  |  |
| glGetTexGend | GL11 | — |  |  |  |  |
| glGetTexGendv | GL11 | — |  |  |  |  |
| glGetTexGenf | GL11 | — |  |  |  |  |
| glGetTexGenfv | GL11 | — |  |  |  |  |
| glGetTexGeni | GL11 | — |  |  |  |  |
| glGetTexGeniv | GL11 | — |  |  |  |  |
| glGetTexImage | GL11 | — |  |  |  |  |
| glGetTexLevelParameterf | GL11 | GLES31 |  |  | ✔ |  |
| glGetTexLevelParameterfv | GL11 | GLES31 |  |  | ✔ |  |
| glGetTexLevelParameteri | GL11 | GLES31 |  |  | ✔ |  |
| glGetTexLevelParameteriv | GL11 | GLES31 |  |  | ✔ |  |
| glGetTexParameterf | GL11 | GLES20 | ✔ |  |  |  |
| glGetTexParameterfv | GL11 | GLES20 | ✔ |  |  |  |
| glGetTexParameteri | GL11 | GLES20 | ✔ |  |  |  |
| glGetTexParameteriv | GL11 | GLES20 | ✔ |  |  |  |
| glHint | GL11 | GLES20 | ✔ |  |  |  |
| glIndexd | GL11 | — |  |  |  |  |
| glIndexdv | GL11 | — |  |  |  |  |
| glIndexf | GL11 | — |  |  |  |  |
| glIndexfv | GL11 | — |  |  |  |  |
| glIndexi | GL11 | — |  |  |  |  |
| glIndexiv | GL11 | — |  |  |  |  |
| glIndexMask | GL11 | — |  |  |  |  |
| glIndexPointer | GL11 | — |  |  |  |  |
| glIndexs | GL11 | — |  |  |  |  |
| glIndexsv | GL11 | — |  |  |  |  |
| glIndexub | GL11 | — |  |  |  |  |
| glIndexubv | GL11 | — |  |  |  |  |
| glInitNames | GL11 | — |  |  |  |  |
| glInterleavedArrays | GL11 | — |  |  |  |  |
| glIsEnabled | GL11 | GLES20 | ✔ |  |  |  |
| glIsList | GL11 | — |  |  |  |  |
| glIsTexture | GL11 | GLES20 | ✔ |  |  |  |
| glLightf | GL11 | — |  |  |  |  |
| glLightfv | GL11 | — |  |  |  |  |
| glLighti | GL11 | — |  |  |  |  |
| glLightiv | GL11 | — |  |  |  |  |
| glLightModelf | GL11 | — |  |  |  |  |
| glLightModelfv | GL11 | — |  |  |  |  |
| glLightModeli | GL11 | — |  |  |  |  |
| glLightModeliv | GL11 | — |  |  |  |  |
| glLineStipple | GL11 | — |  |  |  |  |
| glLineWidth | GL11 | GLES20 | ✔ |  |  |  |
| glListBase | GL11 | — |  |  |  |  |
| glLoadIdentity | GL11 | — |  |  |  |  |
| glLoadMatrixd | GL11 | — |  |  |  |  |
| glLoadMatrixf | GL11 | — |  |  |  |  |
| glLoadName | GL11 | — |  |  |  |  |
| glLogicOp | GL11 | — |  |  |  |  |
| glMap1d | GL11 | — |  |  |  |  |
| glMap1f | GL11 | — |  |  |  |  |
| glMap2d | GL11 | — |  |  |  |  |
| glMap2f | GL11 | — |  |  |  |  |
| glMapGrid1d | GL11 | — |  |  |  |  |
| glMapGrid1f | GL11 | — |  |  |  |  |
| glMapGrid2d | GL11 | — |  |  |  |  |
| glMapGrid2f | GL11 | — |  |  |  |  |
| glMaterialf | GL11 | — |  |  |  |  |
| glMaterialfv | GL11 | — |  |  |  |  |
| glMateriali | GL11 | — |  |  |  |  |
| glMaterialiv | GL11 | — |  |  |  |  |
| glMatrixMode | GL11 | — |  |  |  |  |
| glMultMatrixd | GL11 | — |  |  |  |  |
| glMultMatrixf | GL11 | — |  |  |  |  |
| glNewList | GL11 | — |  |  |  |  |
| glNormal3b | GL11 | — |  |  |  |  |
| glNormal3bv | GL11 | — |  |  |  |  |
| glNormal3d | GL11 | — |  |  |  |  |
| glNormal3dv | GL11 | — |  |  |  |  |
| glNormal3f | GL11 | — |  |  |  |  |
| glNormal3fv | GL11 | — |  |  |  |  |
| glNormal3i | GL11 | — |  |  |  |  |
| glNormal3iv | GL11 | — |  |  |  |  |
| glNormal3s | GL11 | — |  |  |  |  |
| glNormal3sv | GL11 | — |  |  |  |  |
| glNormalPointer | GL11 | — |  |  |  |  |
| glOrtho | GL11 | — |  |  |  |  |
| glPassThrough | GL11 | — |  |  |  |  |
| glPixelMapfv | GL11 | — |  |  |  |  |
| glPixelMapuiv | GL11 | — |  |  |  |  |
| glPixelMapusv | GL11 | — |  |  |  |  |
| glPixelStoref | GL11 | — |  |  |  |  |
| glPixelStorei | GL11 | GLES20 | ✔ |  |  |  |
| glPixelTransferf | GL11 | — |  |  |  |  |
| glPixelTransferi | GL11 | — |  |  |  |  |
| glPixelZoom | GL11 | — |  |  |  |  |
| glPointSize | GL11 | — |  |  |  |  |
| glPolygonMode | GL11 | — |  |  |  |  |
| glPolygonOffset | GL11 | GLES20 | ✔ |  |  |  |
| glPolygonStipple | GL11 | — |  |  |  |  |
| glPopAttrib | GL11 | — |  |  |  |  |
| glPopClientAttrib | GL11 | — |  |  |  |  |
| glPopMatrix | GL11 | — |  |  |  |  |
| glPopName | GL11 | — |  |  |  |  |
| glPrioritizeTextures | GL11 | — |  |  |  |  |
| glPushAttrib | GL11 | — |  |  |  |  |
| glPushClientAttrib | GL11 | — |  |  |  |  |
| glPushMatrix | GL11 | — |  |  |  |  |
| glPushName | GL11 | — |  |  |  |  |
| glRasterPos2d | GL11 | — |  |  |  |  |
| glRasterPos2dv | GL11 | — |  |  |  |  |
| glRasterPos2f | GL11 | — |  |  |  |  |
| glRasterPos2fv | GL11 | — |  |  |  |  |
| glRasterPos2i | GL11 | — |  |  |  |  |
| glRasterPos2iv | GL11 | — |  |  |  |  |
| glRasterPos2s | GL11 | — |  |  |  |  |
| glRasterPos2sv | GL11 | — |  |  |  |  |
| glRasterPos3d | GL11 | — |  |  |  |  |
| glRasterPos3dv | GL11 | — |  |  |  |  |
| glRasterPos3f | GL11 | — |  |  |  |  |
| glRasterPos3fv | GL11 | — |  |  |  |  |
| glRasterPos3i | GL11 | — |  |  |  |  |
| glRasterPos3iv | GL11 | — |  |  |  |  |
| glRasterPos3s | GL11 | — |  |  |  |  |
| glRasterPos3sv | GL11 | — |  |  |  |  |
| glRasterPos4d | GL11 | — |  |  |  |  |
| glRasterPos4dv | GL11 | — |  |  |  |  |
| glRasterPos4f | GL11 | — |  |  |  |  |
| glRasterPos4fv | GL11 | — |  |  |  |  |
| glRasterPos4i | GL11 | — |  |  |  |  |
| glRasterPos4iv | GL11 | — |  |  |  |  |
| glRasterPos4s | GL11 | — |  |  |  |  |
| glRasterPos4sv | GL11 | — |  |  |  |  |
| glReadBuffer | GL11 | GLES30 |  | ✔ |  |  |
| glReadPixels | GL11 | GLES20 | ✔ |  |  |  |
| glRectd | GL11 | — |  |  |  |  |
| glRectdv | GL11 | — |  |  |  |  |
| glRectf | GL11 | — |  |  |  |  |
| glRectfv | GL11 | — |  |  |  |  |
| glRecti | GL11 | — |  |  |  |  |
| glRectiv | GL11 | — |  |  |  |  |
| glRects | GL11 | — |  |  |  |  |
| glRectsv | GL11 | — |  |  |  |  |
| glRenderMode | GL11 | — |  |  |  |  |
| glRotated | GL11 | — |  |  |  |  |
| glRotatef | GL11 | — |  |  |  |  |
| glScaled | GL11 | — |  |  |  |  |
| glScalef | GL11 | — |  |  |  |  |
| glScissor | GL11 | GLES20 | ✔ |  |  |  |
| glSelectBuffer | GL11 | — |  |  |  |  |
| glShadeModel | GL11 | — |  |  |  |  |
| glStencilFunc | GL11 | GLES20 | ✔ |  |  |  |
| glStencilMask | GL11 | GLES20 | ✔ |  |  |  |
| glStencilOp | GL11 | GLES20 | ✔ |  |  |  |
| glTexCoord1d | GL11 | — |  |  |  |  |
| glTexCoord1dv | GL11 | — |  |  |  |  |
| glTexCoord1f | GL11 | — |  |  |  |  |
| glTexCoord1fv | GL11 | — |  |  |  |  |
| glTexCoord1i | GL11 | — |  |  |  |  |
| glTexCoord1iv | GL11 | — |  |  |  |  |
| glTexCoord1s | GL11 | — |  |  |  |  |
| glTexCoord1sv | GL11 | — |  |  |  |  |
| glTexCoord2d | GL11 | — |  |  |  |  |
| glTexCoord2dv | GL11 | — |  |  |  |  |
| glTexCoord2f | GL11 | — |  |  |  |  |
| glTexCoord2fv | GL11 | — |  |  |  |  |
| glTexCoord2i | GL11 | — |  |  |  |  |
| glTexCoord2iv | GL11 | — |  |  |  |  |
| glTexCoord2s | GL11 | — |  |  |  |  |
| glTexCoord2sv | GL11 | — |  |  |  |  |
| glTexCoord3d | GL11 | — |  |  |  |  |
| glTexCoord3dv | GL11 | — |  |  |  |  |
| glTexCoord3f | GL11 | — |  |  |  |  |
| glTexCoord3fv | GL11 | — |  |  |  |  |
| glTexCoord3i | GL11 | — |  |  |  |  |
| glTexCoord3iv | GL11 | — |  |  |  |  |
| glTexCoord3s | GL11 | — |  |  |  |  |
| glTexCoord3sv | GL11 | — |  |  |  |  |
| glTexCoord4d | GL11 | — |  |  |  |  |
| glTexCoord4dv | GL11 | — |  |  |  |  |
| glTexCoord4f | GL11 | — |  |  |  |  |
| glTexCoord4fv | GL11 | — |  |  |  |  |
| glTexCoord4i | GL11 | — |  |  |  |  |
| glTexCoord4iv | GL11 | — |  |  |  |  |
| glTexCoord4s | GL11 | — |  |  |  |  |
| glTexCoord4sv | GL11 | — |  |  |  |  |
| glTexCoordPointer | GL11 | — |  |  |  |  |
| glTexEnvf | GL11 | — |  |  |  |  |
| glTexEnvfv | GL11 | — |  |  |  |  |
| glTexEnvi | GL11 | — |  |  |  |  |
| glTexEnviv | GL11 | — |  |  |  |  |
| glTexGend | GL11 | — |  |  |  |  |
| glTexGendv | GL11 | — |  |  |  |  |
| glTexGenf | GL11 | — |  |  |  |  |
| glTexGenfv | GL11 | — |  |  |  |  |
| glTexGeni | GL11 | — |  |  |  |  |
| glTexGeniv | GL11 | — |  |  |  |  |
| glTexImage1D | GL11 | — |  |  |  |  |
| glTexImage2D | GL11 | GLES20 | ✔ |  |  |  |
| glTexParameterf | GL11 | GLES20 | ✔ |  |  |  |
| glTexParameterfv | GL11 | GLES20 | ✔ |  |  |  |
| glTexParameteri | GL11 | GLES20 | ✔ |  |  |  |
| glTexParameteriv | GL11 | GLES20 | ✔ |  |  |  |
| glTexSubImage1D | GL11 | — |  |  |  |  |
| glTexSubImage2D | GL11 | GLES20 | ✔ |  |  |  |
| glTranslated | GL11 | — |  |  |  |  |
| glTranslatef | GL11 | — |  |  |  |  |
| glVertex2d | GL11 | — |  |  |  |  |
| glVertex2dv | GL11 | — |  |  |  |  |
| glVertex2f | GL11 | — |  |  |  |  |
| glVertex2fv | GL11 | — |  |  |  |  |
| glVertex2i | GL11 | — |  |  |  |  |
| glVertex2iv | GL11 | — |  |  |  |  |
| glVertex2s | GL11 | — |  |  |  |  |
| glVertex2sv | GL11 | — |  |  |  |  |
| glVertex3d | GL11 | — |  |  |  |  |
| glVertex3dv | GL11 | — |  |  |  |  |
| glVertex3f | GL11 | — |  |  |  |  |
| glVertex3fv | GL11 | — |  |  |  |  |
| glVertex3i | GL11 | — |  |  |  |  |
| glVertex3iv | GL11 | — |  |  |  |  |
| glVertex3s | GL11 | — |  |  |  |  |
| glVertex3sv | GL11 | — |  |  |  |  |
| glVertex4d | GL11 | — |  |  |  |  |
| glVertex4dv | GL11 | — |  |  |  |  |
| glVertex4f | GL11 | — |  |  |  |  |
| glVertex4fv | GL11 | — |  |  |  |  |
| glVertex4i | GL11 | — |  |  |  |  |
| glVertex4iv | GL11 | — |  |  |  |  |
| glVertex4s | GL11 | — |  |  |  |  |
| glVertex4sv | GL11 | — |  |  |  |  |
| glVertexPointer | GL11 | — |  |  |  |  |
| glViewport | GL11 | GLES20 | ✔ |  |  |  |
| glCopyTexSubImage3D | GL12 | GLES30 |  | ✔ |  |  |
| glDrawRangeElements | GL12 | GLES30 |  | ✔ |  |  |
| glTexImage3D | GL12 | GLES30 |  | ✔ |  |  |
| glTexSubImage3D | GL12 | GLES30 |  | ✔ |  |  |
| glActiveTexture | GL13 | GLES20 | ✔ |  |  |  |
| glClientActiveTexture | GL13 | — |  |  |  |  |
| glCompressedTexImage1D | GL13 | — |  |  |  |  |
| glCompressedTexImage2D | GL13 | GLES20 | ✔ |  |  |  |
| glCompressedTexImage3D | GL13 | GLES30 |  | ✔ |  |  |
| glCompressedTexSubImage1D | GL13 | — |  |  |  |  |
| glCompressedTexSubImage2D | GL13 | GLES20 | ✔ |  |  |  |
| glCompressedTexSubImage3D | GL13 | GLES30 |  | ✔ |  |  |
| glGetCompressedTexImage | GL13 | — |  |  |  |  |
| glLoadTransposeMatrixd | GL13 | — |  |  |  |  |
| glLoadTransposeMatrixf | GL13 | — |  |  |  |  |
| glMultiTexCoord1d | GL13 | — |  |  |  |  |
| glMultiTexCoord1dv | GL13 | — |  |  |  |  |
| glMultiTexCoord1f | GL13 | — |  |  |  |  |
| glMultiTexCoord1fv | GL13 | — |  |  |  |  |
| glMultiTexCoord1i | GL13 | — |  |  |  |  |
| glMultiTexCoord1iv | GL13 | — |  |  |  |  |
| glMultiTexCoord1s | GL13 | — |  |  |  |  |
| glMultiTexCoord1sv | GL13 | — |  |  |  |  |
| glMultiTexCoord2d | GL13 | — |  |  |  |  |
| glMultiTexCoord2dv | GL13 | — |  |  |  |  |
| glMultiTexCoord2f | GL13 | — |  |  |  |  |
| glMultiTexCoord2fv | GL13 | — |  |  |  |  |
| glMultiTexCoord2i | GL13 | — |  |  |  |  |
| glMultiTexCoord2iv | GL13 | — |  |  |  |  |
| glMultiTexCoord2s | GL13 | — |  |  |  |  |
| glMultiTexCoord2sv | GL13 | — |  |  |  |  |
| glMultiTexCoord3d | GL13 | — |  |  |  |  |
| glMultiTexCoord3dv | GL13 | — |  |  |  |  |
| glMultiTexCoord3f | GL13 | — |  |  |  |  |
| glMultiTexCoord3fv | GL13 | — |  |  |  |  |
| glMultiTexCoord3i | GL13 | — |  |  |  |  |
| glMultiTexCoord3iv | GL13 | — |  |  |  |  |
| glMultiTexCoord3s | GL13 | — |  |  |  |  |
| glMultiTexCoord3sv | GL13 | — |  |  |  |  |
| glMultiTexCoord4d | GL13 | — |  |  |  |  |
| glMultiTexCoord4dv | GL13 | — |  |  |  |  |
| glMultiTexCoord4f | GL13 | — |  |  |  |  |
| glMultiTexCoord4fv | GL13 | — |  |  |  |  |
| glMultiTexCoord4i | GL13 | — |  |  |  |  |
| glMultiTexCoord4iv | GL13 | — |  |  |  |  |
| glMultiTexCoord4s | GL13 | — |  |  |  |  |
| glMultiTexCoord4sv | GL13 | — |  |  |  |  |
| glMultTransposeMatrixd | GL13 | — |  |  |  |  |
| glMultTransposeMatrixf | GL13 | — |  |  |  |  |
| glSampleCoverage | GL13 | GLES20 | ✔ |  |  |  |
| glBlendColor | GL14 | GLES20 | ✔ |  |  |  |
| glBlendEquation | GL14 | GLES20 | ✔ |  |  |  |
| glBlendFuncSeparate | GL14 | GLES20 | ✔ |  |  |  |
| glFogCoordd | GL14 | — |  |  |  |  |
| glFogCoorddv | GL14 | — |  |  |  |  |
| glFogCoordf | GL14 | — |  |  |  |  |
| glFogCoordfv | GL14 | — |  |  |  |  |
| glFogCoordPointer | GL14 | — |  |  |  |  |
| glMultiDrawArrays | GL14 | — |  |  |  |  |
| glMultiDrawElements | GL14 | — |  |  |  |  |
| glPointParameterf | GL14 | — |  |  |  |  |
| glPointParameterfv | GL14 | — |  |  |  |  |
| glPointParameteri | GL14 | — |  |  |  |  |
| glPointParameteriv | GL14 | — |  |  |  |  |
| glSecondaryColor3b | GL14 | — |  |  |  |  |
| glSecondaryColor3bv | GL14 | — |  |  |  |  |
| glSecondaryColor3d | GL14 | — |  |  |  |  |
| glSecondaryColor3dv | GL14 | — |  |  |  |  |
| glSecondaryColor3f | GL14 | — |  |  |  |  |
| glSecondaryColor3fv | GL14 | — |  |  |  |  |
| glSecondaryColor3i | GL14 | — |  |  |  |  |
| glSecondaryColor3iv | GL14 | — |  |  |  |  |
| glSecondaryColor3s | GL14 | — |  |  |  |  |
| glSecondaryColor3sv | GL14 | — |  |  |  |  |
| glSecondaryColor3ub | GL14 | — |  |  |  |  |
| glSecondaryColor3ubv | GL14 | — |  |  |  |  |
| glSecondaryColor3ui | GL14 | — |  |  |  |  |
| glSecondaryColor3uiv | GL14 | — |  |  |  |  |
| glSecondaryColor3us | GL14 | — |  |  |  |  |
| glSecondaryColor3usv | GL14 | — |  |  |  |  |
| glSecondaryColorPointer | GL14 | — |  |  |  |  |
| glWindowPos2d | GL14 | — |  |  |  |  |
| glWindowPos2dv | GL14 | — |  |  |  |  |
| glWindowPos2f | GL14 | — |  |  |  |  |
| glWindowPos2fv | GL14 | — |  |  |  |  |
| glWindowPos2i | GL14 | — |  |  |  |  |
| glWindowPos2iv | GL14 | — |  |  |  |  |
| glWindowPos2s | GL14 | — |  |  |  |  |
| glWindowPos2sv | GL14 | — |  |  |  |  |
| glWindowPos3d | GL14 | — |  |  |  |  |
| glWindowPos3dv | GL14 | — |  |  |  |  |
| glWindowPos3f | GL14 | — |  |  |  |  |
| glWindowPos3fv | GL14 | — |  |  |  |  |
| glWindowPos3i | GL14 | — |  |  |  |  |
| glWindowPos3iv | GL14 | — |  |  |  |  |
| glWindowPos3s | GL14 | — |  |  |  |  |
| glWindowPos3sv | GL14 | — |  |  |  |  |
| glBeginQuery | GL15 | GLES30 |  | ✔ |  |  |
| glBindBuffer | GL15 | GLES20 | ✔ |  |  |  |
| glBufferData | GL15 | GLES20 | ✔ |  |  |  |
| glBufferSubData | GL15 | GLES20 | ✔ |  |  |  |
| glDeleteBuffers | GL15 | GLES20 | ✔ |  |  |  |
| glDeleteQueries | GL15 | GLES30 |  | ✔ |  |  |
| glEndQuery | GL15 | GLES30 |  | ✔ |  |  |
| glGenBuffers | GL15 | GLES20 | ✔ |  |  |  |
| glGenQueries | GL15 | GLES30 |  | ✔ |  |  |
| glGetBufferParameteri | GL15 | GLES20 | ✔ |  |  |  |
| glGetBufferParameteriv | GL15 | GLES20 | ✔ |  |  |  |
| glGetBufferPointer | GL15 | GLES30 |  | ✔ |  |  |
| glGetBufferPointerv | GL15 | GLES30 |  | ✔ |  |  |
| glGetBufferSubData | GL15 | — |  |  |  |  |
| glGetQueryi | GL15 | GLES30 |  | ✔ |  |  |
| glGetQueryiv | GL15 | GLES30 |  | ✔ |  |  |
| glGetQueryObjecti | GL15 | — |  |  |  |  |
| glGetQueryObjectiv | GL15 | — |  |  |  |  |
| glGetQueryObjectui | GL15 | GLES30 |  | ✔ |  |  |
| glGetQueryObjectuiv | GL15 | GLES30 |  | ✔ |  |  |
| glIsBuffer | GL15 | GLES20 | ✔ |  |  |  |
| glIsQuery | GL15 | GLES30 |  | ✔ |  |  |
| glMapBuffer | GL15 | — |  |  |  |  |
| glUnmapBuffer | GL15 | GLES30 |  | ✔ |  |  |
| glAttachShader | GL20 | GLES20 | ✔ |  |  |  |
| glBindAttribLocation | GL20 | GLES20 | ✔ |  |  |  |
| glBlendEquationSeparate | GL20 | GLES20 | ✔ |  |  |  |
| glCompileShader | GL20 | GLES20 | ✔ |  |  |  |
| glCreateProgram | GL20 | GLES20 | ✔ |  |  |  |
| glCreateShader | GL20 | GLES20 | ✔ |  |  |  |
| glDeleteProgram | GL20 | GLES20 | ✔ |  |  |  |
| glDeleteShader | GL20 | GLES20 | ✔ |  |  |  |
| glDetachShader | GL20 | GLES20 | ✔ |  |  |  |
| glDisableVertexAttribArray | GL20 | GLES20 | ✔ |  |  |  |
| glDrawBuffers | GL20 | GLES30 |  | ✔ |  |  |
| glEnableVertexAttribArray | GL20 | GLES20 | ✔ |  |  |  |
| glGetActiveAttrib | GL20 | GLES20 | ✔ |  |  |  |
| glGetActiveUniform | GL20 | GLES20 | ✔ |  |  |  |
| glGetAttachedShaders | GL20 | GLES20 | ✔ |  |  |  |
| glGetAttribLocation | GL20 | GLES20 | ✔ |  |  |  |
| glGetProgrami | GL20 | GLES20 | ✔ |  |  |  |
| glGetProgramInfoLog | GL20 | GLES20 | ✔ |  |  |  |
| glGetProgramiv | GL20 | GLES20 | ✔ |  |  |  |
| glGetShaderi | GL20 | GLES20 | ✔ |  |  |  |
| glGetShaderInfoLog | GL20 | GLES20 | ✔ |  |  |  |
| glGetShaderiv | GL20 | GLES20 | ✔ |  |  |  |
| glGetShaderSource | GL20 | GLES20 | ✔ |  |  |  |
| glGetUniformf | GL20 | GLES20 | ✔ |  |  |  |
| glGetUniformfv | GL20 | GLES20 | ✔ |  |  |  |
| glGetUniformi | GL20 | GLES20 | ✔ |  |  |  |
| glGetUniformiv | GL20 | GLES20 | ✔ |  |  |  |
| glGetUniformLocation | GL20 | GLES20 | ✔ |  |  |  |
| glGetVertexAttribdv | GL20 | — |  |  |  |  |
| glGetVertexAttribfv | GL20 | GLES20 | ✔ |  |  |  |
| glGetVertexAttribi | GL20 | — |  |  |  |  |
| glGetVertexAttribiv | GL20 | GLES20 | ✔ |  |  |  |
| glGetVertexAttribPointer | GL20 | GLES20 | ✔ |  |  |  |
| glGetVertexAttribPointerv | GL20 | GLES20 | ✔ |  |  |  |
| glIsProgram | GL20 | GLES20 | ✔ |  |  |  |
| glIsShader | GL20 | GLES20 | ✔ |  |  |  |
| glLinkProgram | GL20 | GLES20 | ✔ |  |  |  |
| glShaderSource | GL20 | GLES20 | ✔ |  |  |  |
| glStencilFuncSeparate | GL20 | GLES20 | ✔ |  |  |  |
| glStencilMaskSeparate | GL20 | GLES20 | ✔ |  |  |  |
| glStencilOpSeparate | GL20 | GLES20 | ✔ |  |  |  |
| glUniform1f | GL20 | GLES20 | ✔ |  |  |  |
| glUniform1fv | GL20 | GLES20 | ✔ |  |  |  |
| glUniform1i | GL20 | GLES20 | ✔ |  |  |  |
| glUniform1iv | GL20 | GLES20 | ✔ |  |  |  |
| glUniform2f | GL20 | GLES20 | ✔ |  |  |  |
| glUniform2fv | GL20 | GLES20 | ✔ |  |  |  |
| glUniform2i | GL20 | GLES20 | ✔ |  |  |  |
| glUniform2iv | GL20 | GLES20 | ✔ |  |  |  |
| glUniform3f | GL20 | GLES20 | ✔ |  |  |  |
| glUniform3fv | GL20 | GLES20 | ✔ |  |  |  |
| glUniform3i | GL20 | GLES20 | ✔ |  |  |  |
| glUniform3iv | GL20 | GLES20 | ✔ |  |  |  |
| glUniform4f | GL20 | GLES20 | ✔ |  |  |  |
| glUniform4fv | GL20 | GLES20 | ✔ |  |  |  |
| glUniform4i | GL20 | GLES20 | ✔ |  |  |  |
| glUniform4iv | GL20 | GLES20 | ✔ |  |  |  |
| glUniformMatrix2fv | GL20 | GLES20 | ✔ |  |  |  |
| glUniformMatrix3fv | GL20 | GLES20 | ✔ |  |  |  |
| glUniformMatrix4fv | GL20 | GLES20 | ✔ |  |  |  |
| glUseProgram | GL20 | GLES20 | ✔ |  |  |  |
| glValidateProgram | GL20 | GLES20 | ✔ |  |  |  |
| glVertexAttrib1d | GL20 | — |  |  |  |  |
| glVertexAttrib1dv | GL20 | — |  |  |  |  |
| glVertexAttrib1f | GL20 | GLES20 | ✔ |  |  |  |
| glVertexAttrib1fv | GL20 | GLES20 | ✔ |  |  |  |
| glVertexAttrib1s | GL20 | — |  |  |  |  |
| glVertexAttrib1sv | GL20 | — |  |  |  |  |
| glVertexAttrib2d | GL20 | — |  |  |  |  |
| glVertexAttrib2dv | GL20 | — |  |  |  |  |
| glVertexAttrib2f | GL20 | GLES20 | ✔ |  |  |  |
| glVertexAttrib2fv | GL20 | GLES20 | ✔ |  |  |  |
| glVertexAttrib2s | GL20 | — |  |  |  |  |
| glVertexAttrib2sv | GL20 | — |  |  |  |  |
| glVertexAttrib3d | GL20 | — |  |  |  |  |
| glVertexAttrib3dv | GL20 | — |  |  |  |  |
| glVertexAttrib3f | GL20 | GLES20 | ✔ |  |  |  |
| glVertexAttrib3fv | GL20 | GLES20 | ✔ |  |  |  |
| glVertexAttrib3s | GL20 | — |  |  |  |  |
| glVertexAttrib3sv | GL20 | — |  |  |  |  |
| glVertexAttrib4bv | GL20 | — |  |  |  |  |
| glVertexAttrib4d | GL20 | — |  |  |  |  |
| glVertexAttrib4dv | GL20 | — |  |  |  |  |
| glVertexAttrib4f | GL20 | GLES20 | ✔ |  |  |  |
| glVertexAttrib4fv | GL20 | GLES20 | ✔ |  |  |  |
| glVertexAttrib4iv | GL20 | — |  |  |  |  |
| glVertexAttrib4Nbv | GL20 | — |  |  |  |  |
| glVertexAttrib4Niv | GL20 | — |  |  |  |  |
| glVertexAttrib4Nsv | GL20 | — |  |  |  |  |
| glVertexAttrib4Nub | GL20 | — |  |  |  |  |
| glVertexAttrib4Nubv | GL20 | — |  |  |  |  |
| glVertexAttrib4Nuiv | GL20 | — |  |  |  |  |
| glVertexAttrib4Nusv | GL20 | — |  |  |  |  |
| glVertexAttrib4s | GL20 | — |  |  |  |  |
| glVertexAttrib4sv | GL20 | — |  |  |  |  |
| glVertexAttrib4ubv | GL20 | — |  |  |  |  |
| glVertexAttrib4uiv | GL20 | — |  |  |  |  |
| glVertexAttrib4usv | GL20 | — |  |  |  |  |
| glVertexAttribPointer | GL20 | GLES20 | ✔ |  |  |  |
| glUniformMatrix2x3fv | GL21 | GLES30 |  | ✔ |  |  |
| glUniformMatrix2x4fv | GL21 | GLES30 |  | ✔ |  |  |
| glUniformMatrix3x2fv | GL21 | GLES30 |  | ✔ |  |  |
| glUniformMatrix3x4fv | GL21 | GLES30 |  | ✔ |  |  |
| glUniformMatrix4x2fv | GL21 | GLES30 |  | ✔ |  |  |
| glUniformMatrix4x3fv | GL21 | GLES30 |  | ✔ |  |  |
| glBeginConditionalRender | GL30 | — |  |  |  |  |
| glBeginTransformFeedback | GL30 | GLES30 |  | ✔ |  |  |
| glBindBufferBase | GL30 | GLES30 |  | ✔ |  |  |
| glBindBufferRange | GL30 | GLES30 |  | ✔ |  |  |
| glBindFragDataLocation | GL30 | — |  |  |  |  |
| glBindFramebuffer | GL30 | GLES20 | ✔ |  |  |  |
| glBindRenderbuffer | GL30 | GLES20 | ✔ |  |  |  |
| glBindVertexArray | GL30 | GLES30 |  | ✔ |  |  |
| glBlitFramebuffer | GL30 | GLES30 |  | ✔ |  |  |
| glCheckFramebufferStatus | GL30 | GLES20 | ✔ |  |  |  |
| glClampColor | GL30 | — |  |  |  |  |
| glClearBufferfi | GL30 | GLES30 |  | ✔ |  |  |
| glClearBufferfv | GL30 | GLES30 |  | ✔ |  |  |
| glClearBufferiv | GL30 | GLES30 |  | ✔ |  |  |
| glClearBufferuiv | GL30 | GLES30 |  | ✔ |  |  |
| glColorMaski | GL30 | GLES32 |  |  |  | ✔ |
| glDeleteFramebuffers | GL30 | GLES20 | ✔ |  |  |  |
| glDeleteRenderbuffers | GL30 | GLES20 | ✔ |  |  |  |
| glDeleteVertexArrays | GL30 | GLES30 |  | ✔ |  |  |
| glDisablei | GL30 | GLES32 |  |  |  | ✔ |
| glEnablei | GL30 | GLES32 |  |  |  | ✔ |
| glEndConditionalRender | GL30 | — |  |  |  |  |
| glEndTransformFeedback | GL30 | GLES30 |  | ✔ |  |  |
| glFlushMappedBufferRange | GL30 | GLES30 |  | ✔ |  |  |
| glFramebufferRenderbuffer | GL30 | GLES20 | ✔ |  |  |  |
| glFramebufferTexture1D | GL30 | — |  |  |  |  |
| glFramebufferTexture2D | GL30 | GLES20 | ✔ |  |  |  |
| glFramebufferTexture3D | GL30 | — |  |  |  |  |
| glFramebufferTextureLayer | GL30 | GLES30 |  | ✔ |  |  |
| glGenerateMipmap | GL30 | GLES20 | ✔ |  |  |  |
| glGenFramebuffers | GL30 | GLES20 | ✔ |  |  |  |
| glGenRenderbuffers | GL30 | GLES20 | ✔ |  |  |  |
| glGenVertexArrays | GL30 | GLES30 |  | ✔ |  |  |
| glGetBooleani | GL30 | GLES31 |  |  | ✔ |  |
| glGetBooleani_v | GL30 | GLES31 |  |  | ✔ |  |
| glGetFragDataLocation | GL30 | GLES30 |  | ✔ |  |  |
| glGetFramebufferAttachmentParameteri | GL30 | GLES20 | ✔ |  |  |  |
| glGetFramebufferAttachmentParameteriv | GL30 | GLES20 | ✔ |  |  |  |
| glGetIntegeri | GL30 | GLES30 |  | ✔ |  |  |
| glGetIntegeri_v | GL30 | GLES30 |  | ✔ |  |  |
| glGetRenderbufferParameteri | GL30 | GLES20 | ✔ |  |  |  |
| glGetRenderbufferParameteriv | GL30 | GLES20 | ✔ |  |  |  |
| glGetStringi | GL30 | GLES30 |  | ✔ |  |  |
| glGetTexParameterIi | GL30 | GLES32 |  |  |  | ✔ |
| glGetTexParameterIiv | GL30 | GLES32 |  |  |  | ✔ |
| glGetTexParameterIui | GL30 | GLES32 |  |  |  | ✔ |
| glGetTexParameterIuiv | GL30 | GLES32 |  |  |  | ✔ |
| glGetTransformFeedbackVarying | GL30 | GLES30 |  | ✔ |  |  |
| glGetUniformui | GL30 | GLES30 |  | ✔ |  |  |
| glGetUniformuiv | GL30 | GLES30 |  | ✔ |  |  |
| glGetVertexAttribIi | GL30 | GLES30 |  | ✔ |  |  |
| glGetVertexAttribIiv | GL30 | GLES30 |  | ✔ |  |  |
| glGetVertexAttribIui | GL30 | GLES30 |  | ✔ |  |  |
| glGetVertexAttribIuiv | GL30 | GLES30 |  | ✔ |  |  |
| glIsEnabledi | GL30 | GLES32 |  |  |  | ✔ |
| glIsFramebuffer | GL30 | GLES20 | ✔ |  |  |  |
| glIsRenderbuffer | GL30 | GLES20 | ✔ |  |  |  |
| glIsVertexArray | GL30 | GLES30 |  | ✔ |  |  |
| glMapBufferRange | GL30 | GLES30 |  | ✔ |  |  |
| glRenderbufferStorage | GL30 | GLES20 | ✔ |  |  |  |
| glRenderbufferStorageMultisample | GL30 | GLES30 |  | ✔ |  |  |
| glTexParameterIi | GL30 | GLES32 |  |  |  | ✔ |
| glTexParameterIiv | GL30 | GLES32 |  |  |  | ✔ |
| glTexParameterIui | GL30 | GLES32 |  |  |  | ✔ |
| glTexParameterIuiv | GL30 | GLES32 |  |  |  | ✔ |
| glTransformFeedbackVaryings | GL30 | GLES30 |  | ✔ |  |  |
| glUniform1ui | GL30 | GLES30 |  | ✔ |  |  |
| glUniform1uiv | GL30 | GLES30 |  | ✔ |  |  |
| glUniform2ui | GL30 | GLES30 |  | ✔ |  |  |
| glUniform2uiv | GL30 | GLES30 |  | ✔ |  |  |
| glUniform3ui | GL30 | GLES30 |  | ✔ |  |  |
| glUniform3uiv | GL30 | GLES30 |  | ✔ |  |  |
| glUniform4ui | GL30 | GLES30 |  | ✔ |  |  |
| glUniform4uiv | GL30 | GLES30 |  | ✔ |  |  |
| glVertexAttribI1i | GL30 | — |  |  |  |  |
| glVertexAttribI1iv | GL30 | — |  |  |  |  |
| glVertexAttribI1ui | GL30 | — |  |  |  |  |
| glVertexAttribI1uiv | GL30 | — |  |  |  |  |
| glVertexAttribI2i | GL30 | — |  |  |  |  |
| glVertexAttribI2iv | GL30 | — |  |  |  |  |
| glVertexAttribI2ui | GL30 | — |  |  |  |  |
| glVertexAttribI2uiv | GL30 | — |  |  |  |  |
| glVertexAttribI3i | GL30 | — |  |  |  |  |
| glVertexAttribI3iv | GL30 | — |  |  |  |  |
| glVertexAttribI3ui | GL30 | — |  |  |  |  |
| glVertexAttribI3uiv | GL30 | — |  |  |  |  |
| glVertexAttribI4bv | GL30 | — |  |  |  |  |
| glVertexAttribI4i | GL30 | GLES30 |  | ✔ |  |  |
| glVertexAttribI4iv | GL30 | GLES30 |  | ✔ |  |  |
| glVertexAttribI4sv | GL30 | — |  |  |  |  |
| glVertexAttribI4ubv | GL30 | — |  |  |  |  |
| glVertexAttribI4ui | GL30 | GLES30 |  | ✔ |  |  |
| glVertexAttribI4uiv | GL30 | GLES30 |  | ✔ |  |  |
| glVertexAttribI4usv | GL30 | — |  |  |  |  |
| glVertexAttribIPointer | GL30 | GLES30 |  | ✔ |  |  |
| glCopyBufferSubData | GL31 | GLES30 |  | ✔ |  |  |
| glDrawArraysInstanced | GL31 | GLES30 |  | ✔ |  |  |
| glDrawElementsInstanced | GL31 | GLES30 |  | ✔ |  |  |
| glGetActiveUniformBlocki | GL31 | GLES30 |  | ✔ |  |  |
| glGetActiveUniformBlockiv | GL31 | GLES30 |  | ✔ |  |  |
| glGetActiveUniformBlockName | GL31 | GLES30 |  | ✔ |  |  |
| glGetActiveUniformName | GL31 | — |  |  |  |  |
| glGetActiveUniformsi | GL31 | — |  |  |  |  |
| glGetActiveUniformsiv | GL31 | GLES30 |  | ✔ |  |  |
| glGetUniformBlockIndex | GL31 | GLES30 |  | ✔ |  |  |
| glGetUniformIndices | GL31 | GLES30 |  | ✔ |  |  |
| glPrimitiveRestartIndex | GL31 | — |  |  |  |  |
| glTexBuffer | GL31 | GLES32 |  |  |  | ✔ |
| glUniformBlockBinding | GL31 | GLES30 |  | ✔ |  |  |
| glClientWaitSync | GL32 | GLES30 |  | ✔ |  |  |
| glDeleteSync | GL32 | GLES30 |  | ✔ |  |  |
| glDrawElementsBaseVertex | GL32 | GLES32 |  |  |  | ✔ |
| glDrawElementsInstancedBaseVertex | GL32 | GLES32 |  |  |  | ✔ |
| glDrawRangeElementsBaseVertex | GL32 | GLES32 |  |  |  | ✔ |
| glFenceSync | GL32 | GLES30 |  | ✔ |  |  |
| glFramebufferTexture | GL32 | GLES32 |  |  |  | ✔ |
| glGetBufferParameteri64 | GL32 | GLES30 |  | ✔ |  |  |
| glGetBufferParameteri64v | GL32 | GLES30 |  | ✔ |  |  |
| glGetInteger64 | GL32 | GLES30 |  | ✔ |  |  |
| glGetInteger64i | GL32 | GLES30 |  | ✔ |  |  |
| glGetInteger64i_v | GL32 | GLES30 |  | ✔ |  |  |
| glGetInteger64v | GL32 | GLES30 |  | ✔ |  |  |
| glGetMultisamplef | GL32 | GLES31 |  |  | ✔ |  |
| glGetMultisamplefv | GL32 | GLES31 |  |  | ✔ |  |
| glGetSynci | GL32 | GLES30 |  | ✔ |  |  |
| glGetSynciv | GL32 | GLES30 |  | ✔ |  |  |
| glIsSync | GL32 | GLES30 |  | ✔ |  |  |
| glMultiDrawElementsBaseVertex | GL32 | — |  |  |  |  |
| glProvokingVertex | GL32 | — |  |  |  |  |
| glSampleMaski | GL32 | GLES31 |  |  | ✔ |  |
| glTexImage2DMultisample | GL32 | — |  |  |  |  |
| glTexImage3DMultisample | GL32 | — |  |  |  |  |
| glWaitSync | GL32 | GLES30 |  | ✔ |  |  |
| glBindFragDataLocationIndexed | GL33 | — |  |  |  |  |
| glBindSampler | GL33 | GLES30 |  | ✔ |  |  |
| glColorP3ui | GL33 | — |  |  |  |  |
| glColorP3uiv | GL33 | — |  |  |  |  |
| glColorP4ui | GL33 | — |  |  |  |  |
| glColorP4uiv | GL33 | — |  |  |  |  |
| glDeleteSamplers | GL33 | GLES30 |  | ✔ |  |  |
| glGenSamplers | GL33 | GLES30 |  | ✔ |  |  |
| glGetFragDataIndex | GL33 | — |  |  |  |  |
| glGetQueryObjecti64 | GL33 | — |  |  |  |  |
| glGetQueryObjecti64v | GL33 | — |  |  |  |  |
| glGetQueryObjectui64 | GL33 | — |  |  |  |  |
| glGetQueryObjectui64v | GL33 | — |  |  |  |  |
| glGetSamplerParameterf | GL33 | GLES30 |  | ✔ |  |  |
| glGetSamplerParameterfv | GL33 | GLES30 |  | ✔ |  |  |
| glGetSamplerParameteri | GL33 | GLES30 |  | ✔ |  |  |
| glGetSamplerParameterIi | GL33 | GLES32 |  |  |  | ✔ |
| glGetSamplerParameterIiv | GL33 | GLES32 |  |  |  | ✔ |
| glGetSamplerParameterIui | GL33 | GLES32 |  |  |  | ✔ |
| glGetSamplerParameterIuiv | GL33 | GLES32 |  |  |  | ✔ |
| glGetSamplerParameteriv | GL33 | GLES30 |  | ✔ |  |  |
| glIsSampler | GL33 | GLES30 |  | ✔ |  |  |
| glMultiTexCoordP1ui | GL33 | — |  |  |  |  |
| glMultiTexCoordP1uiv | GL33 | — |  |  |  |  |
| glMultiTexCoordP2ui | GL33 | — |  |  |  |  |
| glMultiTexCoordP2uiv | GL33 | — |  |  |  |  |
| glMultiTexCoordP3ui | GL33 | — |  |  |  |  |
| glMultiTexCoordP3uiv | GL33 | — |  |  |  |  |
| glMultiTexCoordP4ui | GL33 | — |  |  |  |  |
| glMultiTexCoordP4uiv | GL33 | — |  |  |  |  |
| glNormalP3ui | GL33 | — |  |  |  |  |
| glNormalP3uiv | GL33 | — |  |  |  |  |
| glQueryCounter | GL33 | — |  |  |  |  |
| glSamplerParameterf | GL33 | GLES30 |  | ✔ |  |  |
| glSamplerParameterfv | GL33 | GLES30 |  | ✔ |  |  |
| glSamplerParameteri | GL33 | GLES30 |  | ✔ |  |  |
| glSamplerParameterIiv | GL33 | GLES32 |  |  |  | ✔ |
| glSamplerParameterIuiv | GL33 | GLES32 |  |  |  | ✔ |
| glSamplerParameteriv | GL33 | GLES30 |  | ✔ |  |  |
| glSecondaryColorP3ui | GL33 | — |  |  |  |  |
| glSecondaryColorP3uiv | GL33 | — |  |  |  |  |
| glTexCoordP1ui | GL33 | — |  |  |  |  |
| glTexCoordP1uiv | GL33 | — |  |  |  |  |
| glTexCoordP2ui | GL33 | — |  |  |  |  |
| glTexCoordP2uiv | GL33 | — |  |  |  |  |
| glTexCoordP3ui | GL33 | — |  |  |  |  |
| glTexCoordP3uiv | GL33 | — |  |  |  |  |
| glTexCoordP4ui | GL33 | — |  |  |  |  |
| glTexCoordP4uiv | GL33 | — |  |  |  |  |
| glVertexAttribDivisor | GL33 | GLES30 |  | ✔ |  |  |
| glVertexAttribP1ui | GL33 | — |  |  |  |  |
| glVertexAttribP1uiv | GL33 | — |  |  |  |  |
| glVertexAttribP2ui | GL33 | — |  |  |  |  |
| glVertexAttribP2uiv | GL33 | — |  |  |  |  |
| glVertexAttribP3ui | GL33 | — |  |  |  |  |
| glVertexAttribP3uiv | GL33 | — |  |  |  |  |
| glVertexAttribP4ui | GL33 | — |  |  |  |  |
| glVertexAttribP4uiv | GL33 | — |  |  |  |  |
| glVertexP2ui | GL33 | — |  |  |  |  |
| glVertexP2uiv | GL33 | — |  |  |  |  |
| glVertexP3ui | GL33 | — |  |  |  |  |
| glVertexP3uiv | GL33 | — |  |  |  |  |
| glVertexP4ui | GL33 | — |  |  |  |  |
| glVertexP4uiv | GL33 | — |  |  |  |  |
| glBeginQueryIndexed | GL40 | — |  |  |  |  |
| glBindTransformFeedback | GL40 | GLES30 |  | ✔ |  |  |
| glBlendEquationi | GL40 | GLES32 |  |  |  | ✔ |
| glBlendEquationSeparatei | GL40 | GLES32 |  |  |  | ✔ |
| glBlendFunci | GL40 | GLES32 |  |  |  | ✔ |
| glBlendFuncSeparatei | GL40 | GLES32 |  |  |  | ✔ |
| glDeleteTransformFeedbacks | GL40 | GLES30 |  | ✔ |  |  |
| glDrawArraysIndirect | GL40 | GLES31 |  |  | ✔ |  |
| glDrawElementsIndirect | GL40 | GLES31 |  |  | ✔ |  |
| glDrawTransformFeedback | GL40 | — |  |  |  |  |
| glDrawTransformFeedbackStream | GL40 | — |  |  |  |  |
| glEndQueryIndexed | GL40 | — |  |  |  |  |
| glGenTransformFeedbacks | GL40 | GLES30 |  | ✔ |  |  |
| glGetActiveSubroutineName | GL40 | — |  |  |  |  |
| glGetActiveSubroutineUniformi | GL40 | — |  |  |  |  |
| glGetActiveSubroutineUniformiv | GL40 | — |  |  |  |  |
| glGetActiveSubroutineUniformName | GL40 | — |  |  |  |  |
| glGetProgramStagei | GL40 | — |  |  |  |  |
| glGetProgramStageiv | GL40 | — |  |  |  |  |
| glGetQueryIndexedi | GL40 | — |  |  |  |  |
| glGetQueryIndexediv | GL40 | — |  |  |  |  |
| glGetSubroutineIndex | GL40 | — |  |  |  |  |
| glGetSubroutineUniformLocation | GL40 | — |  |  |  |  |
| glGetUniformd | GL40 | — |  |  |  |  |
| glGetUniformdv | GL40 | — |  |  |  |  |
| glGetUniformSubroutineui | GL40 | — |  |  |  |  |
| glGetUniformSubroutineuiv | GL40 | — |  |  |  |  |
| glIsTransformFeedback | GL40 | GLES30 |  | ✔ |  |  |
| glMinSampleShading | GL40 | GLES32 |  |  |  | ✔ |
| glPatchParameterfv | GL40 | — |  |  |  |  |
| glPatchParameteri | GL40 | GLES32 |  |  |  | ✔ |
| glPauseTransformFeedback | GL40 | GLES30 |  | ✔ |  |  |
| glResumeTransformFeedback | GL40 | GLES30 |  | ✔ |  |  |
| glUniform1d | GL40 | — |  |  |  |  |
| glUniform1dv | GL40 | — |  |  |  |  |
| glUniform2d | GL40 | — |  |  |  |  |
| glUniform2dv | GL40 | — |  |  |  |  |
| glUniform3d | GL40 | — |  |  |  |  |
| glUniform3dv | GL40 | — |  |  |  |  |
| glUniform4d | GL40 | — |  |  |  |  |
| glUniform4dv | GL40 | — |  |  |  |  |
| glUniformMatrix2dv | GL40 | — |  |  |  |  |
| glUniformMatrix2x3dv | GL40 | — |  |  |  |  |
| glUniformMatrix2x4dv | GL40 | — |  |  |  |  |
| glUniformMatrix3dv | GL40 | — |  |  |  |  |
| glUniformMatrix3x2dv | GL40 | — |  |  |  |  |
| glUniformMatrix3x4dv | GL40 | — |  |  |  |  |
| glUniformMatrix4dv | GL40 | — |  |  |  |  |
| glUniformMatrix4x2dv | GL40 | — |  |  |  |  |
| glUniformMatrix4x3dv | GL40 | — |  |  |  |  |
| glUniformSubroutinesui | GL40 | — |  |  |  |  |
| glUniformSubroutinesuiv | GL40 | — |  |  |  |  |
| glActiveShaderProgram | GL41 | GLES31 |  |  | ✔ |  |
| glBindProgramPipeline | GL41 | GLES31 |  |  | ✔ |  |
| glClearDepthf | GL41 | GLES20 | ✔ |  |  |  |
| glCreateShaderProgramv | GL41 | GLES31 |  |  | ✔ |  |
| glDeleteProgramPipelines | GL41 | GLES31 |  |  | ✔ |  |
| glDepthRangeArrayv | GL41 | — |  |  |  |  |
| glDepthRangef | GL41 | GLES20 | ✔ |  |  |  |
| glDepthRangeIndexed | GL41 | — |  |  |  |  |
| glGenProgramPipelines | GL41 | GLES31 |  |  | ✔ |  |
| glGetDoublei | GL41 | — |  |  |  |  |
| glGetDoublei_v | GL41 | — |  |  |  |  |
| glGetFloati | GL41 | — |  |  |  |  |
| glGetFloati_v | GL41 | — |  |  |  |  |
| glGetProgramBinary | GL41 | GLES30 |  | ✔ |  |  |
| glGetProgramPipelinei | GL41 | GLES31 |  |  | ✔ |  |
| glGetProgramPipelineInfoLog | GL41 | GLES31 |  |  | ✔ |  |
| glGetProgramPipelineiv | GL41 | GLES31 |  |  | ✔ |  |
| glGetShaderPrecisionFormat | GL41 | GLES20 | ✔ |  |  |  |
| glGetVertexAttribLdv | GL41 | — |  |  |  |  |
| glIsProgramPipeline | GL41 | GLES31 |  |  | ✔ |  |
| glProgramBinary | GL41 | GLES30 |  | ✔ |  |  |
| glProgramParameteri | GL41 | GLES30 |  | ✔ |  |  |
| glProgramUniform1d | GL41 | — |  |  |  |  |
| glProgramUniform1dv | GL41 | — |  |  |  |  |
| glProgramUniform1f | GL41 | GLES31 |  |  | ✔ |  |
| glProgramUniform1fv | GL41 | GLES31 |  |  | ✔ |  |
| glProgramUniform1i | GL41 | GLES31 |  |  | ✔ |  |
| glProgramUniform1iv | GL41 | GLES31 |  |  | ✔ |  |
| glProgramUniform1ui | GL41 | GLES31 |  |  | ✔ |  |
| glProgramUniform1uiv | GL41 | GLES31 |  |  | ✔ |  |
| glProgramUniform2d | GL41 | — |  |  |  |  |
| glProgramUniform2dv | GL41 | — |  |  |  |  |
| glProgramUniform2f | GL41 | GLES31 |  |  | ✔ |  |
| glProgramUniform2fv | GL41 | GLES31 |  |  | ✔ |  |
| glProgramUniform2i | GL41 | GLES31 |  |  | ✔ |  |
| glProgramUniform2iv | GL41 | GLES31 |  |  | ✔ |  |
| glProgramUniform2ui | GL41 | GLES31 |  |  | ✔ |  |
| glProgramUniform2uiv | GL41 | GLES31 |  |  | ✔ |  |
| glProgramUniform3d | GL41 | — |  |  |  |  |
| glProgramUniform3dv | GL41 | — |  |  |  |  |
| glProgramUniform3f | GL41 | GLES31 |  |  | ✔ |  |
| glProgramUniform3fv | GL41 | GLES31 |  |  | ✔ |  |
| glProgramUniform3i | GL41 | GLES31 |  |  | ✔ |  |
| glProgramUniform3iv | GL41 | GLES31 |  |  | ✔ |  |
| glProgramUniform3ui | GL41 | GLES31 |  |  | ✔ |  |
| glProgramUniform3uiv | GL41 | GLES31 |  |  | ✔ |  |
| glProgramUniform4d | GL41 | — |  |  |  |  |
| glProgramUniform4dv | GL41 | — |  |  |  |  |
| glProgramUniform4f | GL41 | GLES31 |  |  | ✔ |  |
| glProgramUniform4fv | GL41 | GLES31 |  |  | ✔ |  |
| glProgramUniform4i | GL41 | GLES31 |  |  | ✔ |  |
| glProgramUniform4iv | GL41 | GLES31 |  |  | ✔ |  |
| glProgramUniform4ui | GL41 | GLES31 |  |  | ✔ |  |
| glProgramUniform4uiv | GL41 | GLES31 |  |  | ✔ |  |
| glProgramUniformMatrix2dv | GL41 | — |  |  |  |  |
| glProgramUniformMatrix2fv | GL41 | GLES31 |  |  | ✔ |  |
| glProgramUniformMatrix2x3dv | GL41 | — |  |  |  |  |
| glProgramUniformMatrix2x3fv | GL41 | GLES31 |  |  | ✔ |  |
| glProgramUniformMatrix2x4dv | GL41 | — |  |  |  |  |
| glProgramUniformMatrix2x4fv | GL41 | GLES31 |  |  | ✔ |  |
| glProgramUniformMatrix3dv | GL41 | — |  |  |  |  |
| glProgramUniformMatrix3fv | GL41 | GLES31 |  |  | ✔ |  |
| glProgramUniformMatrix3x2dv | GL41 | — |  |  |  |  |
| glProgramUniformMatrix3x2fv | GL41 | GLES31 |  |  | ✔ |  |
| glProgramUniformMatrix3x4dv | GL41 | — |  |  |  |  |
| glProgramUniformMatrix3x4fv | GL41 | GLES31 |  |  | ✔ |  |
| glProgramUniformMatrix4dv | GL41 | — |  |  |  |  |
| glProgramUniformMatrix4fv | GL41 | GLES31 |  |  | ✔ |  |
| glProgramUniformMatrix4x2dv | GL41 | — |  |  |  |  |
| glProgramUniformMatrix4x2fv | GL41 | GLES31 |  |  | ✔ |  |
| glProgramUniformMatrix4x3dv | GL41 | — |  |  |  |  |
| glProgramUniformMatrix4x3fv | GL41 | GLES31 |  |  | ✔ |  |
| glReleaseShaderCompiler | GL41 | GLES20 | ✔ |  |  |  |
| glScissorArrayv | GL41 | — |  |  |  |  |
| glScissorIndexed | GL41 | — |  |  |  |  |
| glScissorIndexedv | GL41 | — |  |  |  |  |
| glShaderBinary | GL41 | GLES20 | ✔ |  |  |  |
| glUseProgramStages | GL41 | GLES31 |  |  | ✔ |  |
| glValidateProgramPipeline | GL41 | GLES31 |  |  | ✔ |  |
| glVertexAttribL1d | GL41 | — |  |  |  |  |
| glVertexAttribL1dv | GL41 | — |  |  |  |  |
| glVertexAttribL2d | GL41 | — |  |  |  |  |
| glVertexAttribL2dv | GL41 | — |  |  |  |  |
| glVertexAttribL3d | GL41 | — |  |  |  |  |
| glVertexAttribL3dv | GL41 | — |  |  |  |  |
| glVertexAttribL4d | GL41 | — |  |  |  |  |
| glVertexAttribL4dv | GL41 | — |  |  |  |  |
| glVertexAttribLPointer | GL41 | — |  |  |  |  |
| glViewportArrayv | GL41 | — |  |  |  |  |
| glViewportIndexedf | GL41 | — |  |  |  |  |
| glViewportIndexedfv | GL41 | — |  |  |  |  |
| glBindImageTexture | GL42 | GLES31 |  |  | ✔ |  |
| glDrawArraysInstancedBaseInstance | GL42 | — |  |  |  |  |
| glDrawElementsInstancedBaseInstance | GL42 | — |  |  |  |  |
| glDrawElementsInstancedBaseVertexBaseInstance | GL42 | — |  |  |  |  |
| glDrawTransformFeedbackInstanced | GL42 | — |  |  |  |  |
| glDrawTransformFeedbackStreamInstanced | GL42 | — |  |  |  |  |
| glGetActiveAtomicCounterBufferi | GL42 | — |  |  |  |  |
| glGetActiveAtomicCounterBufferiv | GL42 | — |  |  |  |  |
| glGetInternalformati | GL42 | GLES30 |  | ✔ |  |  |
| glGetInternalformativ | GL42 | GLES30 |  | ✔ |  |  |
| glMemoryBarrier | GL42 | GLES31 |  |  | ✔ |  |
| glTexStorage1D | GL42 | — |  |  |  |  |
| glTexStorage2D | GL42 | GLES30 |  | ✔ |  |  |
| glTexStorage3D | GL42 | GLES30 |  | ✔ |  |  |
| glBindVertexBuffer | GL43 | GLES31 |  |  | ✔ |  |
| glClearBufferData | GL43 | — |  |  |  |  |
| glClearBufferSubData | GL43 | — |  |  |  |  |
| glCopyImageSubData | GL43 | GLES32 |  |  |  | ✔ |
| glDebugMessageCallback | GL43 | GLES32 |  |  |  | ✔ |
| glDebugMessageControl | GL43 | GLES32 |  |  |  | ✔ |
| glDebugMessageInsert | GL43 | GLES32 |  |  |  | ✔ |
| glDispatchCompute | GL43 | GLES31 |  |  | ✔ |  |
| glDispatchComputeIndirect | GL43 | GLES31 |  |  | ✔ |  |
| glFramebufferParameteri | GL43 | GLES31 |  |  | ✔ |  |
| glGetDebugMessageLog | GL43 | GLES32 |  |  |  | ✔ |
| glGetFramebufferParameteri | GL43 | GLES31 |  |  | ✔ |  |
| glGetFramebufferParameteriv | GL43 | GLES31 |  |  | ✔ |  |
| glGetInternalformati64 | GL43 | — |  |  |  |  |
| glGetInternalformati64v | GL43 | — |  |  |  |  |
| glGetObjectLabel | GL43 | GLES32 |  |  |  | ✔ |
| glGetObjectPtrLabel | GL43 | GLES32 |  |  |  | ✔ |
| glGetProgramInterfacei | GL43 | GLES31 |  |  | ✔ |  |
| glGetProgramInterfaceiv | GL43 | GLES31 |  |  | ✔ |  |
| glGetProgramResourceIndex | GL43 | GLES31 |  |  | ✔ |  |
| glGetProgramResourceiv | GL43 | GLES31 |  |  | ✔ |  |
| glGetProgramResourceLocation | GL43 | GLES31 |  |  | ✔ |  |
| glGetProgramResourceLocationIndex | GL43 | — |  |  |  |  |
| glGetProgramResourceName | GL43 | GLES31 |  |  | ✔ |  |
| glInvalidateBufferData | GL43 | — |  |  |  |  |
| glInvalidateBufferSubData | GL43 | — |  |  |  |  |
| glInvalidateFramebuffer | GL43 | GLES30 |  | ✔ |  |  |
| glInvalidateSubFramebuffer | GL43 | GLES30 |  | ✔ |  |  |
| glInvalidateTexImage | GL43 | — |  |  |  |  |
| glInvalidateTexSubImage | GL43 | — |  |  |  |  |
| glMultiDrawArraysIndirect | GL43 | — |  |  |  |  |
| glMultiDrawElementsIndirect | GL43 | — |  |  |  |  |
| glObjectLabel | GL43 | GLES32 |  |  |  | ✔ |
| glObjectPtrLabel | GL43 | GLES32 |  |  |  | ✔ |
| glPopDebugGroup | GL43 | GLES32 |  |  |  | ✔ |
| glPushDebugGroup | GL43 | GLES32 |  |  |  | ✔ |
| glShaderStorageBlockBinding | GL43 | — |  |  |  |  |
| glTexBufferRange | GL43 | GLES32 |  |  |  | ✔ |
| glTexStorage2DMultisample | GL43 | GLES31 |  |  | ✔ |  |
| glTexStorage3DMultisample | GL43 | GLES32 |  |  |  | ✔ |
| glTextureView | GL43 | — |  |  |  |  |
| glVertexAttribBinding | GL43 | GLES31 |  |  | ✔ |  |
| glVertexAttribFormat | GL43 | GLES31 |  |  | ✔ |  |
| glVertexAttribIFormat | GL43 | GLES31 |  |  | ✔ |  |
| glVertexAttribLFormat | GL43 | — |  |  |  |  |
| glVertexBindingDivisor | GL43 | GLES31 |  |  | ✔ |  |
| glBindBuffersBase | GL44 | — |  |  |  |  |
| glBindBuffersRange | GL44 | — |  |  |  |  |
| glBindImageTextures | GL44 | — |  |  |  |  |
| glBindSamplers | GL44 | — |  |  |  |  |
| glBindTextures | GL44 | — |  |  |  |  |
| glBindVertexBuffers | GL44 | — |  |  |  |  |
| glBufferStorage | GL44 | — |  |  |  |  |
| glClearTexImage | GL44 | — |  |  |  |  |
| glClearTexSubImage | GL44 | — |  |  |  |  |
| glBindTextureUnit | GL45 | — |  |  |  |  |
| glBlitNamedFramebuffer | GL45 | — |  |  |  |  |
| glCheckNamedFramebufferStatus | GL45 | — |  |  |  |  |
| glClearNamedBufferData | GL45 | — |  |  |  |  |
| glClearNamedBufferSubData | GL45 | — |  |  |  |  |
| glClearNamedFramebufferfi | GL45 | — |  |  |  |  |
| glClearNamedFramebufferfv | GL45 | — |  |  |  |  |
| glClearNamedFramebufferiv | GL45 | — |  |  |  |  |
| glClearNamedFramebufferuiv | GL45 | — |  |  |  |  |
| glClipControl | GL45 | — |  |  |  |  |
| glCompressedTextureSubImage1D | GL45 | — |  |  |  |  |
| glCompressedTextureSubImage2D | GL45 | — |  |  |  |  |
| glCompressedTextureSubImage3D | GL45 | — |  |  |  |  |
| glCopyNamedBufferSubData | GL45 | — |  |  |  |  |
| glCopyTextureSubImage1D | GL45 | — |  |  |  |  |
| glCopyTextureSubImage2D | GL45 | — |  |  |  |  |
| glCopyTextureSubImage3D | GL45 | — |  |  |  |  |
| glCreateBuffers | GL45 | — |  |  |  |  |
| glCreateFramebuffers | GL45 | — |  |  |  |  |
| glCreateProgramPipelines | GL45 | — |  |  |  |  |
| glCreateQueries | GL45 | — |  |  |  |  |
| glCreateRenderbuffers | GL45 | — |  |  |  |  |
| glCreateSamplers | GL45 | — |  |  |  |  |
| glCreateTextures | GL45 | — |  |  |  |  |
| glCreateTransformFeedbacks | GL45 | — |  |  |  |  |
| glCreateVertexArrays | GL45 | — |  |  |  |  |
| glDisableVertexArrayAttrib | GL45 | — |  |  |  |  |
| glEnableVertexArrayAttrib | GL45 | — |  |  |  |  |
| glFlushMappedNamedBufferRange | GL45 | — |  |  |  |  |
| glGenerateTextureMipmap | GL45 | — |  |  |  |  |
| glGetCompressedTextureImage | GL45 | — |  |  |  |  |
| glGetCompressedTextureSubImage | GL45 | — |  |  |  |  |
| glGetGraphicsResetStatus | GL45 | GLES32 |  |  |  | ✔ |
| glGetNamedBufferParameteri | GL45 | — |  |  |  |  |
| glGetNamedBufferParameteri64 | GL45 | — |  |  |  |  |
| glGetNamedBufferParameteri64v | GL45 | — |  |  |  |  |
| glGetNamedBufferParameteriv | GL45 | — |  |  |  |  |
| glGetNamedBufferPointer | GL45 | — |  |  |  |  |
| glGetNamedBufferPointerv | GL45 | — |  |  |  |  |
| glGetNamedBufferSubData | GL45 | — |  |  |  |  |
| glGetNamedFramebufferAttachmentParameteri | GL45 | — |  |  |  |  |
| glGetNamedFramebufferAttachmentParameteriv | GL45 | — |  |  |  |  |
| glGetNamedFramebufferParameteri | GL45 | — |  |  |  |  |
| glGetNamedFramebufferParameteriv | GL45 | — |  |  |  |  |
| glGetNamedRenderbufferParameteri | GL45 | — |  |  |  |  |
| glGetNamedRenderbufferParameteriv | GL45 | — |  |  |  |  |
| glGetnColorTable | GL45 | — |  |  |  |  |
| glGetnCompressedTexImage | GL45 | — |  |  |  |  |
| glGetnConvolutionFilter | GL45 | — |  |  |  |  |
| glGetnHistogram | GL45 | — |  |  |  |  |
| glGetnMapd | GL45 | — |  |  |  |  |
| glGetnMapdv | GL45 | — |  |  |  |  |
| glGetnMapf | GL45 | — |  |  |  |  |
| glGetnMapfv | GL45 | — |  |  |  |  |
| glGetnMapi | GL45 | — |  |  |  |  |
| glGetnMapiv | GL45 | — |  |  |  |  |
| glGetnMinmax | GL45 | — |  |  |  |  |
| glGetnPixelMapfv | GL45 | — |  |  |  |  |
| glGetnPixelMapuiv | GL45 | — |  |  |  |  |
| glGetnPixelMapusv | GL45 | — |  |  |  |  |
| glGetnPolygonStipple | GL45 | — |  |  |  |  |
| glGetnSeparableFilter | GL45 | — |  |  |  |  |
| glGetnTexImage | GL45 | — |  |  |  |  |
| glGetnUniformd | GL45 | — |  |  |  |  |
| glGetnUniformdv | GL45 | — |  |  |  |  |
| glGetnUniformf | GL45 | GLES32 |  |  |  | ✔ |
| glGetnUniformfv | GL45 | GLES32 |  |  |  | ✔ |
| glGetnUniformi | GL45 | GLES32 |  |  |  | ✔ |
| glGetnUniformiv | GL45 | GLES32 |  |  |  | ✔ |
| glGetnUniformui | GL45 | GLES32 |  |  |  | ✔ |
| glGetnUniformuiv | GL45 | GLES32 |  |  |  | ✔ |
| glGetQueryBufferObjecti64v | GL45 | — |  |  |  |  |
| glGetQueryBufferObjectiv | GL45 | — |  |  |  |  |
| glGetQueryBufferObjectui64v | GL45 | — |  |  |  |  |
| glGetQueryBufferObjectuiv | GL45 | — |  |  |  |  |
| glGetTextureImage | GL45 | — |  |  |  |  |
| glGetTextureLevelParameterf | GL45 | — |  |  |  |  |
| glGetTextureLevelParameterfv | GL45 | — |  |  |  |  |
| glGetTextureLevelParameteri | GL45 | — |  |  |  |  |
| glGetTextureLevelParameteriv | GL45 | — |  |  |  |  |
| glGetTextureParameterf | GL45 | — |  |  |  |  |
| glGetTextureParameterfv | GL45 | — |  |  |  |  |
| glGetTextureParameteri | GL45 | — |  |  |  |  |
| glGetTextureParameterIi | GL45 | — |  |  |  |  |
| glGetTextureParameterIiv | GL45 | — |  |  |  |  |
| glGetTextureParameterIui | GL45 | — |  |  |  |  |
| glGetTextureParameterIuiv | GL45 | — |  |  |  |  |
| glGetTextureParameteriv | GL45 | — |  |  |  |  |
| glGetTextureSubImage | GL45 | — |  |  |  |  |
| glGetTransformFeedbacki | GL45 | — |  |  |  |  |
| glGetTransformFeedbacki64 | GL45 | — |  |  |  |  |
| glGetTransformFeedbacki64_v | GL45 | — |  |  |  |  |
| glGetTransformFeedbacki_v | GL45 | — |  |  |  |  |
| glGetTransformFeedbackiv | GL45 | — |  |  |  |  |
| glGetVertexArrayi | GL45 | — |  |  |  |  |
| glGetVertexArrayIndexed64i | GL45 | — |  |  |  |  |
| glGetVertexArrayIndexed64iv | GL45 | — |  |  |  |  |
| glGetVertexArrayIndexedi | GL45 | — |  |  |  |  |
| glGetVertexArrayIndexediv | GL45 | — |  |  |  |  |
| glGetVertexArrayiv | GL45 | — |  |  |  |  |
| glInvalidateNamedFramebufferData | GL45 | — |  |  |  |  |
| glInvalidateNamedFramebufferSubData | GL45 | — |  |  |  |  |
| glMapNamedBuffer | GL45 | — |  |  |  |  |
| glMapNamedBufferRange | GL45 | — |  |  |  |  |
| glMemoryBarrierByRegion | GL45 | GLES31 |  |  | ✔ |  |
| glNamedBufferData | GL45 | — |  |  |  |  |
| glNamedBufferStorage | GL45 | — |  |  |  |  |
| glNamedBufferSubData | GL45 | — |  |  |  |  |
| glNamedFramebufferDrawBuffer | GL45 | — |  |  |  |  |
| glNamedFramebufferDrawBuffers | GL45 | — |  |  |  |  |
| glNamedFramebufferParameteri | GL45 | — |  |  |  |  |
| glNamedFramebufferReadBuffer | GL45 | — |  |  |  |  |
| glNamedFramebufferRenderbuffer | GL45 | — |  |  |  |  |
| glNamedFramebufferTexture | GL45 | — |  |  |  |  |
| glNamedFramebufferTextureLayer | GL45 | — |  |  |  |  |
| glNamedRenderbufferStorage | GL45 | — |  |  |  |  |
| glNamedRenderbufferStorageMultisample | GL45 | — |  |  |  |  |
| glReadnPixels | GL45 | GLES32 |  |  |  | ✔ |
| glTextureBarrier | GL45 | — |  |  |  |  |
| glTextureBuffer | GL45 | — |  |  |  |  |
| glTextureBufferRange | GL45 | — |  |  |  |  |
| glTextureParameterf | GL45 | — |  |  |  |  |
| glTextureParameterfv | GL45 | — |  |  |  |  |
| glTextureParameteri | GL45 | — |  |  |  |  |
| glTextureParameterIi | GL45 | — |  |  |  |  |
| glTextureParameterIiv | GL45 | — |  |  |  |  |
| glTextureParameterIui | GL45 | — |  |  |  |  |
| glTextureParameterIuiv | GL45 | — |  |  |  |  |
| glTextureParameteriv | GL45 | — |  |  |  |  |
| glTextureStorage1D | GL45 | — |  |  |  |  |
| glTextureStorage2D | GL45 | — |  |  |  |  |
| glTextureStorage2DMultisample | GL45 | — |  |  |  |  |
| glTextureStorage3D | GL45 | — |  |  |  |  |
| glTextureStorage3DMultisample | GL45 | — |  |  |  |  |
| glTextureSubImage1D | GL45 | — |  |  |  |  |
| glTextureSubImage2D | GL45 | — |  |  |  |  |
| glTextureSubImage3D | GL45 | — |  |  |  |  |
| glTransformFeedbackBufferBase | GL45 | — |  |  |  |  |
| glTransformFeedbackBufferRange | GL45 | — |  |  |  |  |
| glUnmapNamedBuffer | GL45 | — |  |  |  |  |
| glVertexArrayAttribBinding | GL45 | — |  |  |  |  |
| glVertexArrayAttribFormat | GL45 | — |  |  |  |  |
| glVertexArrayAttribIFormat | GL45 | — |  |  |  |  |
| glVertexArrayAttribLFormat | GL45 | — |  |  |  |  |
| glVertexArrayBindingDivisor | GL45 | — |  |  |  |  |
| glVertexArrayElementBuffer | GL45 | — |  |  |  |  |
| glVertexArrayVertexBuffer | GL45 | — |  |  |  |  |
| glVertexArrayVertexBuffers | GL45 | — |  |  |  |  |
| glMultiDrawArraysIndirectCount | GL46 | — |  |  |  |  |
| glMultiDrawElementsIndirectCount | GL46 | — |  |  |  |  |
| glPolygonOffsetClamp | GL46 | — |  |  |  |  |
| glSpecializeShader | GL46 | — |  |  |  |  |


# OpenGL / OpenGL ES Function Introduction Matrix

This table lists each function and marks in which desktop **OpenGL (Core)** or **OpenGL ES** version(s) it is present. Rows are ordered by the OpenGL version in which the function first appeared (OpenGL-first timeline). Functions that exist only in ES (no Core counterpart) are listed at the end and show their ES introduction.

| Function | Introduced | GL11 | GL12 | GL13 | GL14 | GL15 | GL20 | GL21 | GL30 | GL31 | GL32 | GL33 | GL40 | GL41 | GL42 | GL43 | GL44 | GL45 | GL46 | GLES20 | GLES30 | GLES31 | GLES32 |
|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|
| glAccum | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glAlphaFunc | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glAreTexturesResident | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glArrayElement | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glBegin | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glBindTexture | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glBitmap | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glBlendFunc | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glCallList | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glCallLists | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glClear | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glClearAccum | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glClearColor | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glClearDepth | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glClearIndex | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glClearStencil | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glClipPlane | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glColor3b | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glColor3bv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glColor3d | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glColor3dv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glColor3f | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glColor3fv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glColor3i | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glColor3iv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glColor3s | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glColor3sv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glColor3ub | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glColor3ubv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glColor3ui | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glColor3uiv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glColor3us | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glColor3usv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glColor4b | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glColor4bv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glColor4d | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glColor4dv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glColor4f | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glColor4fv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glColor4i | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glColor4iv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glColor4s | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glColor4sv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glColor4ub | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glColor4ubv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glColor4ui | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glColor4uiv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glColor4us | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glColor4usv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glColorMask | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glColorMaterial | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glColorPointer | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glCopyPixels | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glCopyTexImage1D | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glCopyTexImage2D | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glCopyTexSubImage1D | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glCopyTexSubImage2D | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glCullFace | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glDeleteLists | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glDeleteTextures | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glDepthFunc | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glDepthMask | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glDepthRange | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glDisable | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glDisableClientState | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glDrawArrays | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glDrawBuffer | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glDrawElements | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glDrawPixels | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glEdgeFlag | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glEdgeFlagPointer | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glEdgeFlagv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glEnable | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glEnableClientState | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glEnd | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glEndList | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glEvalCoord1d | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glEvalCoord1dv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glEvalCoord1f | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glEvalCoord1fv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glEvalCoord2d | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glEvalCoord2dv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glEvalCoord2f | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glEvalCoord2fv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glEvalMesh1 | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glEvalMesh2 | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glEvalPoint1 | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glEvalPoint2 | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glFeedbackBuffer | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glFinish | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glFlush | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glFogf | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glFogfv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glFogi | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glFogiv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glFrontFace | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glFrustum | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glGenLists | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glGenTextures | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glGetBoolean | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glGetBooleanv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glGetClipPlane | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glGetDouble | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glGetDoublev | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glGetError | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glGetFloat | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glGetFloatv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glGetInteger | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glGetIntegerv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glGetLightf | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glGetLightfv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glGetLighti | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glGetLightiv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glGetMapd | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glGetMapdv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glGetMapf | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glGetMapfv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glGetMapi | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glGetMapiv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glGetMaterialfv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glGetMaterialiv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glGetPixelMapfv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glGetPixelMapuiv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glGetPixelMapusv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glGetPointer | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |
| glGetPointerv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |
| glGetPolygonStipple | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glGetString | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glGetTexEnvf | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glGetTexEnvfv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glGetTexEnvi | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glGetTexEnviv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glGetTexGend | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glGetTexGendv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glGetTexGenf | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glGetTexGenfv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glGetTexGeni | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glGetTexGeniv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glGetTexImage | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glGetTexLevelParameterf | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |
| glGetTexLevelParameterfv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |
| glGetTexLevelParameteri | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |
| glGetTexLevelParameteriv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |
| glGetTexParameterf | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glGetTexParameterfv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glGetTexParameteri | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glGetTexParameteriv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glHint | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glIndexd | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glIndexdv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glIndexf | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glIndexfv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glIndexi | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glIndexiv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glIndexMask | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glIndexPointer | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glIndexs | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glIndexsv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glIndexub | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glIndexubv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glInitNames | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glInterleavedArrays | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glIsEnabled | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glIsList | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glIsTexture | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glLightf | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glLightfv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glLighti | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glLightiv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glLightModelf | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glLightModelfv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glLightModeli | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glLightModeliv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glLineStipple | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glLineWidth | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glListBase | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glLoadIdentity | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glLoadMatrixd | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glLoadMatrixf | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glLoadName | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glLogicOp | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMap1d | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMap1f | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMap2d | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMap2f | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMapGrid1d | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMapGrid1f | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMapGrid2d | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMapGrid2f | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMaterialf | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMaterialfv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMateriali | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMaterialiv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMatrixMode | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMultMatrixd | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMultMatrixf | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glNewList | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glNormal3b | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glNormal3bv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glNormal3d | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glNormal3dv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glNormal3f | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glNormal3fv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glNormal3i | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glNormal3iv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glNormal3s | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glNormal3sv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glNormalPointer | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glOrtho | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glPassThrough | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glPixelMapfv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glPixelMapuiv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glPixelMapusv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glPixelStoref | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glPixelStorei | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glPixelTransferf | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glPixelTransferi | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glPixelZoom | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glPointSize | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glPolygonMode | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glPolygonOffset | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glPolygonStipple | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glPopAttrib | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glPopClientAttrib | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glPopMatrix | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glPopName | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glPrioritizeTextures | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glPushAttrib | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glPushClientAttrib | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glPushMatrix | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glPushName | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glRasterPos2d | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glRasterPos2dv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glRasterPos2f | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glRasterPos2fv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glRasterPos2i | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glRasterPos2iv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glRasterPos2s | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glRasterPos2sv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glRasterPos3d | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glRasterPos3dv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glRasterPos3f | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glRasterPos3fv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glRasterPos3i | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glRasterPos3iv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glRasterPos3s | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glRasterPos3sv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glRasterPos4d | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glRasterPos4dv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glRasterPos4f | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glRasterPos4fv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glRasterPos4i | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glRasterPos4iv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glRasterPos4s | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glRasterPos4sv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glReadBuffer | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glReadPixels | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glRectd | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glRectdv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glRectf | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glRectfv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glRecti | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glRectiv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glRects | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glRectsv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glRenderMode | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glRotated | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glRotatef | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glScaled | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glScalef | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glScissor | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glSelectBuffer | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glShadeModel | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glStencilFunc | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glStencilMask | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glStencilOp | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glTexCoord1d | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glTexCoord1dv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glTexCoord1f | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glTexCoord1fv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glTexCoord1i | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glTexCoord1iv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glTexCoord1s | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glTexCoord1sv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glTexCoord2d | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glTexCoord2dv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glTexCoord2f | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glTexCoord2fv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glTexCoord2i | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glTexCoord2iv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glTexCoord2s | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glTexCoord2sv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glTexCoord3d | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glTexCoord3dv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glTexCoord3f | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glTexCoord3fv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glTexCoord3i | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glTexCoord3iv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glTexCoord3s | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glTexCoord3sv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glTexCoord4d | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glTexCoord4dv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glTexCoord4f | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glTexCoord4fv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glTexCoord4i | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glTexCoord4iv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glTexCoord4s | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glTexCoord4sv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glTexCoordPointer | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glTexEnvf | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glTexEnvfv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glTexEnvi | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glTexEnviv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glTexGend | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glTexGendv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glTexGenf | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glTexGenfv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glTexGeni | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glTexGeniv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glTexImage1D | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glTexImage2D | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glTexParameterf | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glTexParameterfv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glTexParameteri | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glTexParameteriv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glTexSubImage1D | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glTexSubImage2D | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glTranslated | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glTranslatef | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertex2d | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertex2dv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertex2f | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertex2fv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertex2i | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertex2iv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertex2s | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertex2sv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertex3d | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertex3dv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertex3f | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertex3fv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertex3i | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertex3iv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertex3s | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertex3sv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertex4d | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertex4dv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertex4f | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertex4fv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertex4i | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertex4iv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertex4s | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertex4sv | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertexPointer | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glViewport | GL11 | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glCopyTexSubImage3D | GL12 |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glDrawRangeElements | GL12 |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glTexImage3D | GL12 |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glTexSubImage3D | GL12 |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glActiveTexture | GL13 |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glClientActiveTexture | GL13 |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glCompressedTexImage1D | GL13 |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glCompressedTexImage2D | GL13 |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glCompressedTexImage3D | GL13 |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glCompressedTexSubImage1D | GL13 |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glCompressedTexSubImage2D | GL13 |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glCompressedTexSubImage3D | GL13 |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glGetCompressedTexImage | GL13 |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glLoadTransposeMatrixd | GL13 |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glLoadTransposeMatrixf | GL13 |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMultiTexCoord1d | GL13 |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMultiTexCoord1dv | GL13 |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMultiTexCoord1f | GL13 |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMultiTexCoord1fv | GL13 |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMultiTexCoord1i | GL13 |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMultiTexCoord1iv | GL13 |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMultiTexCoord1s | GL13 |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMultiTexCoord1sv | GL13 |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMultiTexCoord2d | GL13 |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMultiTexCoord2dv | GL13 |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMultiTexCoord2f | GL13 |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMultiTexCoord2fv | GL13 |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMultiTexCoord2i | GL13 |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMultiTexCoord2iv | GL13 |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMultiTexCoord2s | GL13 |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMultiTexCoord2sv | GL13 |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMultiTexCoord3d | GL13 |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMultiTexCoord3dv | GL13 |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMultiTexCoord3f | GL13 |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMultiTexCoord3fv | GL13 |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMultiTexCoord3i | GL13 |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMultiTexCoord3iv | GL13 |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMultiTexCoord3s | GL13 |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMultiTexCoord3sv | GL13 |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMultiTexCoord4d | GL13 |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMultiTexCoord4dv | GL13 |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMultiTexCoord4f | GL13 |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMultiTexCoord4fv | GL13 |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMultiTexCoord4i | GL13 |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMultiTexCoord4iv | GL13 |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMultiTexCoord4s | GL13 |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMultiTexCoord4sv | GL13 |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMultTransposeMatrixd | GL13 |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMultTransposeMatrixf | GL13 |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glSampleCoverage | GL13 |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glBlendColor | GL14 |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glBlendEquation | GL14 |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glBlendFuncSeparate | GL14 |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glFogCoordd | GL14 |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glFogCoorddv | GL14 |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glFogCoordf | GL14 |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glFogCoordfv | GL14 |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glFogCoordPointer | GL14 |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMultiDrawArrays | GL14 |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glMultiDrawElements | GL14 |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glPointParameterf | GL14 |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glPointParameterfv | GL14 |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glPointParameteri | GL14 |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glPointParameteriv | GL14 |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glSecondaryColor3b | GL14 |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glSecondaryColor3bv | GL14 |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glSecondaryColor3d | GL14 |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glSecondaryColor3dv | GL14 |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glSecondaryColor3f | GL14 |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glSecondaryColor3fv | GL14 |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glSecondaryColor3i | GL14 |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glSecondaryColor3iv | GL14 |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glSecondaryColor3s | GL14 |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glSecondaryColor3sv | GL14 |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glSecondaryColor3ub | GL14 |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glSecondaryColor3ubv | GL14 |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glSecondaryColor3ui | GL14 |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glSecondaryColor3uiv | GL14 |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glSecondaryColor3us | GL14 |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glSecondaryColor3usv | GL14 |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glSecondaryColorPointer | GL14 |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glWindowPos2d | GL14 |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glWindowPos2dv | GL14 |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glWindowPos2f | GL14 |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glWindowPos2fv | GL14 |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glWindowPos2i | GL14 |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glWindowPos2iv | GL14 |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glWindowPos2s | GL14 |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glWindowPos2sv | GL14 |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glWindowPos3d | GL14 |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glWindowPos3dv | GL14 |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glWindowPos3f | GL14 |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glWindowPos3fv | GL14 |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glWindowPos3i | GL14 |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glWindowPos3iv | GL14 |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glWindowPos3s | GL14 |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glWindowPos3sv | GL14 |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glBeginQuery | GL15 |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glBindBuffer | GL15 |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glBufferData | GL15 |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glBufferSubData | GL15 |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glDeleteBuffers | GL15 |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glDeleteQueries | GL15 |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glEndQuery | GL15 |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glGenBuffers | GL15 |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glGenQueries | GL15 |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glGetBufferParameteri | GL15 |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glGetBufferParameteriv | GL15 |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glGetBufferPointer | GL15 |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glGetBufferPointerv | GL15 |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glGetBufferSubData | GL15 |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glGetQueryi | GL15 |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glGetQueryiv | GL15 |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glGetQueryObjecti | GL15 |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glGetQueryObjectiv | GL15 |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glGetQueryObjectui | GL15 |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glGetQueryObjectuiv | GL15 |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glIsBuffer | GL15 |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glIsQuery | GL15 |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glMapBuffer | GL15 |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glUnmapBuffer | GL15 |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glAttachShader | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glBindAttribLocation | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glBlendEquationSeparate | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glCompileShader | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glCreateProgram | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glCreateShader | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glDeleteProgram | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glDeleteShader | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glDetachShader | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glDisableVertexAttribArray | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glDrawBuffers | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glEnableVertexAttribArray | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glGetActiveAttrib | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glGetActiveUniform | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glGetAttachedShaders | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glGetAttribLocation | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glGetProgrami | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glGetProgramInfoLog | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glGetProgramiv | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glGetShaderi | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glGetShaderInfoLog | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glGetShaderiv | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glGetShaderSource | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glGetUniformf | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glGetUniformfv | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glGetUniformi | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glGetUniformiv | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glGetUniformLocation | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glGetVertexAttribdv | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glGetVertexAttribfv | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glGetVertexAttribi | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glGetVertexAttribiv | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glGetVertexAttribPointer | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glGetVertexAttribPointerv | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glIsProgram | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glIsShader | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glLinkProgram | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glShaderSource | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glStencilFuncSeparate | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glStencilMaskSeparate | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glStencilOpSeparate | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glUniform1f | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glUniform1fv | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glUniform1i | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glUniform1iv | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glUniform2f | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glUniform2fv | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glUniform2i | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glUniform2iv | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glUniform3f | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glUniform3fv | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glUniform3i | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glUniform3iv | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glUniform4f | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glUniform4fv | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glUniform4i | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glUniform4iv | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glUniformMatrix2fv | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glUniformMatrix3fv | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glUniformMatrix4fv | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glUseProgram | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glValidateProgram | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glVertexAttrib1d | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttrib1dv | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttrib1f | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glVertexAttrib1fv | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glVertexAttrib1s | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttrib1sv | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttrib2d | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttrib2dv | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttrib2f | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glVertexAttrib2fv | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glVertexAttrib2s | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttrib2sv | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttrib3d | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttrib3dv | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttrib3f | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glVertexAttrib3fv | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glVertexAttrib3s | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttrib3sv | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttrib4bv | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttrib4d | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttrib4dv | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttrib4f | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glVertexAttrib4fv | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glVertexAttrib4iv | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttrib4Nbv | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttrib4Niv | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttrib4Nsv | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttrib4Nub | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttrib4Nubv | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttrib4Nuiv | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttrib4Nusv | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttrib4s | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttrib4sv | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttrib4ubv | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttrib4uiv | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttrib4usv | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttribPointer | GL20 |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glUniformMatrix2x3fv | GL21 |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glUniformMatrix2x4fv | GL21 |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glUniformMatrix3x2fv | GL21 |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glUniformMatrix3x4fv | GL21 |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glUniformMatrix4x2fv | GL21 |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glUniformMatrix4x3fv | GL21 |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glBeginConditionalRender | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glBeginTransformFeedback | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glBindBufferBase | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glBindBufferRange | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glBindFragDataLocation | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glBindFramebuffer | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glBindRenderbuffer | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glBindVertexArray | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glBlitFramebuffer | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glCheckFramebufferStatus | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glClampColor | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glClearBufferfi | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glClearBufferfv | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glClearBufferiv | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glClearBufferuiv | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glColorMaski | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |
| glDeleteFramebuffers | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glDeleteRenderbuffers | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glDeleteVertexArrays | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glDisablei | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |
| glEnablei | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |
| glEndConditionalRender | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glEndTransformFeedback | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glFlushMappedBufferRange | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glFramebufferRenderbuffer | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glFramebufferTexture1D | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glFramebufferTexture2D | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glFramebufferTexture3D | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glFramebufferTextureLayer | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glGenerateMipmap | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glGenFramebuffers | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glGenRenderbuffers | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glGenVertexArrays | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glGetBooleani | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |
| glGetBooleani_v | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |
| glGetFragDataLocation | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glGetFramebufferAttachmentParameteri | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glGetFramebufferAttachmentParameteriv | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glGetIntegeri | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glGetIntegeri_v | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glGetRenderbufferParameteri | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glGetRenderbufferParameteriv | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glGetStringi | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glGetTexParameterIi | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |
| glGetTexParameterIiv | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |
| glGetTexParameterIui | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |
| glGetTexParameterIuiv | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |
| glGetTransformFeedbackVarying | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glGetUniformui | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glGetUniformuiv | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glGetVertexAttribIi | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glGetVertexAttribIiv | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glGetVertexAttribIui | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glGetVertexAttribIuiv | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glIsEnabledi | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |
| glIsFramebuffer | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glIsRenderbuffer | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glIsVertexArray | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glMapBufferRange | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glRenderbufferStorage | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |
| glRenderbufferStorageMultisample | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glTexParameterIi | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |
| glTexParameterIiv | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |
| glTexParameterIui | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |
| glTexParameterIuiv | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |
| glTransformFeedbackVaryings | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glUniform1ui | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glUniform1uiv | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glUniform2ui | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glUniform2uiv | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glUniform3ui | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glUniform3uiv | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glUniform4ui | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glUniform4uiv | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glVertexAttribI1i | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttribI1iv | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttribI1ui | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttribI1uiv | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttribI2i | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttribI2iv | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttribI2ui | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttribI2uiv | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttribI3i | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttribI3iv | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttribI3ui | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttribI3uiv | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttribI4bv | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttribI4i | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glVertexAttribI4iv | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glVertexAttribI4sv | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttribI4ubv | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttribI4ui | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glVertexAttribI4uiv | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glVertexAttribI4usv | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttribIPointer | GL30 |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glCopyBufferSubData | GL31 |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glDrawArraysInstanced | GL31 |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glDrawElementsInstanced | GL31 |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glGetActiveUniformBlocki | GL31 |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glGetActiveUniformBlockiv | GL31 |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glGetActiveUniformBlockName | GL31 |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glGetActiveUniformName | GL31 |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glGetActiveUniformsi | GL31 |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glGetActiveUniformsiv | GL31 |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glGetUniformBlockIndex | GL31 |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glGetUniformIndices | GL31 |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glPrimitiveRestartIndex | GL31 |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |  |
| glTexBuffer | GL31 |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |
| glUniformBlockBinding | GL31 |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glClientWaitSync | GL32 |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glDeleteSync | GL32 |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glDrawElementsBaseVertex | GL32 |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  | ✔ |
| glDrawElementsInstancedBaseVertex | GL32 |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  | ✔ |
| glDrawRangeElementsBaseVertex | GL32 |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  | ✔ |
| glFenceSync | GL32 |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glFramebufferTexture | GL32 |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  | ✔ |
| glGetBufferParameteri64 | GL32 |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glGetBufferParameteri64v | GL32 |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glGetInteger64 | GL32 |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glGetInteger64i | GL32 |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glGetInteger64i_v | GL32 |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glGetInteger64v | GL32 |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glGetMultisamplef | GL32 |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  | ✔ |  |
| glGetMultisamplefv | GL32 |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  | ✔ |  |
| glGetSynci | GL32 |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glGetSynciv | GL32 |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glIsSync | GL32 |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glMultiDrawElementsBaseVertex | GL32 |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |
| glProvokingVertex | GL32 |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |
| glSampleMaski | GL32 |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  | ✔ |  |
| glTexImage2DMultisample | GL32 |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |
| glTexImage3DMultisample | GL32 |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |  |
| glWaitSync | GL32 |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  | ✔ |  |  |
| glBindFragDataLocationIndexed | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |
| glBindSampler | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  | ✔ |  |  |
| glColorP3ui | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |
| glColorP3uiv | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |
| glColorP4ui | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |
| glColorP4uiv | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |
| glDeleteSamplers | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  | ✔ |  |  |
| glGenSamplers | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  | ✔ |  |  |
| glGetFragDataIndex | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |
| glGetQueryObjecti64 | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |
| glGetQueryObjecti64v | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |
| glGetQueryObjectui64 | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |
| glGetQueryObjectui64v | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |
| glGetSamplerParameterf | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  | ✔ |  |  |
| glGetSamplerParameterfv | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  | ✔ |  |  |
| glGetSamplerParameteri | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  | ✔ |  |  |
| glGetSamplerParameterIi | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  | ✔ |
| glGetSamplerParameterIiv | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  | ✔ |
| glGetSamplerParameterIui | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  | ✔ |
| glGetSamplerParameterIuiv | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  | ✔ |
| glGetSamplerParameteriv | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  | ✔ |  |  |
| glIsSampler | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  | ✔ |  |  |
| glMultiTexCoordP1ui | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |
| glMultiTexCoordP1uiv | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |
| glMultiTexCoordP2ui | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |
| glMultiTexCoordP2uiv | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |
| glMultiTexCoordP3ui | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |
| glMultiTexCoordP3uiv | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |
| glMultiTexCoordP4ui | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |
| glMultiTexCoordP4uiv | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |
| glNormalP3ui | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |
| glNormalP3uiv | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |
| glQueryCounter | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |
| glSamplerParameterf | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  | ✔ |  |  |
| glSamplerParameterfv | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  | ✔ |  |  |
| glSamplerParameteri | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  | ✔ |  |  |
| glSamplerParameterIiv | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  | ✔ |
| glSamplerParameterIuiv | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  | ✔ |
| glSamplerParameteriv | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  | ✔ |  |  |
| glSecondaryColorP3ui | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |
| glSecondaryColorP3uiv | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |
| glTexCoordP1ui | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |
| glTexCoordP1uiv | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |
| glTexCoordP2ui | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |
| glTexCoordP2uiv | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |
| glTexCoordP3ui | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |
| glTexCoordP3uiv | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |
| glTexCoordP4ui | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |
| glTexCoordP4uiv | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttribDivisor | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  | ✔ |  |  |
| glVertexAttribP1ui | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttribP1uiv | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttribP2ui | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttribP2uiv | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttribP3ui | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttribP3uiv | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttribP4ui | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |
| glVertexAttribP4uiv | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |
| glVertexP2ui | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |
| glVertexP2uiv | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |
| glVertexP3ui | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |
| glVertexP3uiv | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |
| glVertexP4ui | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |
| glVertexP4uiv | GL33 |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |  |
| glBeginQueryIndexed | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |
| glBindTransformFeedback | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |  |
| glBlendEquationi | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  | ✔ |
| glBlendEquationSeparatei | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  | ✔ |
| glBlendFunci | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  | ✔ |
| glBlendFuncSeparatei | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  | ✔ |
| glDeleteTransformFeedbacks | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |  |
| glDrawArraysIndirect | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  | ✔ |  |
| glDrawElementsIndirect | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  | ✔ |  |
| glDrawTransformFeedback | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |
| glDrawTransformFeedbackStream | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |
| glEndQueryIndexed | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |
| glGenTransformFeedbacks | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |  |
| glGetActiveSubroutineName | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |
| glGetActiveSubroutineUniformi | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |
| glGetActiveSubroutineUniformiv | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |
| glGetActiveSubroutineUniformName | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |
| glGetProgramStagei | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |
| glGetProgramStageiv | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |
| glGetQueryIndexedi | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |
| glGetQueryIndexediv | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |
| glGetSubroutineIndex | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |
| glGetSubroutineUniformLocation | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |
| glGetUniformd | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |
| glGetUniformdv | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |
| glGetUniformSubroutineui | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |
| glGetUniformSubroutineuiv | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |
| glIsTransformFeedback | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |  |
| glMinSampleShading | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  | ✔ |
| glPatchParameterfv | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |
| glPatchParameteri | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  | ✔ |
| glPauseTransformFeedback | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |  |
| glResumeTransformFeedback | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |  |
| glUniform1d | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |
| glUniform1dv | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |
| glUniform2d | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |
| glUniform2dv | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |
| glUniform3d | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |
| glUniform3dv | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |
| glUniform4d | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |
| glUniform4dv | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |
| glUniformMatrix2dv | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |
| glUniformMatrix2x3dv | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |
| glUniformMatrix2x4dv | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |
| glUniformMatrix3dv | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |
| glUniformMatrix3x2dv | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |
| glUniformMatrix3x4dv | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |
| glUniformMatrix4dv | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |
| glUniformMatrix4x2dv | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |
| glUniformMatrix4x3dv | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |
| glUniformSubroutinesui | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |
| glUniformSubroutinesuiv | GL40 |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |  |
| glActiveShaderProgram | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |
| glBindProgramPipeline | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |
| glClearDepthf | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  | ✔ |  |  |  |
| glCreateShaderProgramv | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |
| glDeleteProgramPipelines | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |
| glDepthRangeArrayv | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |
| glDepthRangef | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  | ✔ |  |  |  |
| glDepthRangeIndexed | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |
| glGenProgramPipelines | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |
| glGetDoublei | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |
| glGetDoublei_v | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |
| glGetFloati | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |
| glGetFloati_v | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |
| glGetProgramBinary | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  | ✔ |  |  |
| glGetProgramPipelinei | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |
| glGetProgramPipelineInfoLog | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |
| glGetProgramPipelineiv | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |
| glGetShaderPrecisionFormat | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  | ✔ |  |  |  |
| glGetVertexAttribLdv | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |
| glIsProgramPipeline | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |
| glProgramBinary | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  | ✔ |  |  |
| glProgramParameteri | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  | ✔ |  |  |
| glProgramUniform1d | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |
| glProgramUniform1dv | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |
| glProgramUniform1f | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |
| glProgramUniform1fv | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |
| glProgramUniform1i | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |
| glProgramUniform1iv | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |
| glProgramUniform1ui | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |
| glProgramUniform1uiv | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |
| glProgramUniform2d | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |
| glProgramUniform2dv | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |
| glProgramUniform2f | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |
| glProgramUniform2fv | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |
| glProgramUniform2i | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |
| glProgramUniform2iv | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |
| glProgramUniform2ui | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |
| glProgramUniform2uiv | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |
| glProgramUniform3d | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |
| glProgramUniform3dv | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |
| glProgramUniform3f | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |
| glProgramUniform3fv | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |
| glProgramUniform3i | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |
| glProgramUniform3iv | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |
| glProgramUniform3ui | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |
| glProgramUniform3uiv | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |
| glProgramUniform4d | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |
| glProgramUniform4dv | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |
| glProgramUniform4f | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |
| glProgramUniform4fv | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |
| glProgramUniform4i | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |
| glProgramUniform4iv | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |
| glProgramUniform4ui | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |
| glProgramUniform4uiv | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |
| glProgramUniformMatrix2dv | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |
| glProgramUniformMatrix2fv | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |
| glProgramUniformMatrix2x3dv | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |
| glProgramUniformMatrix2x3fv | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |
| glProgramUniformMatrix2x4dv | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |
| glProgramUniformMatrix2x4fv | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |
| glProgramUniformMatrix3dv | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |
| glProgramUniformMatrix3fv | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |
| glProgramUniformMatrix3x2dv | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |
| glProgramUniformMatrix3x2fv | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |
| glProgramUniformMatrix3x4dv | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |
| glProgramUniformMatrix3x4fv | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |
| glProgramUniformMatrix4dv | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |
| glProgramUniformMatrix4fv | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |
| glProgramUniformMatrix4x2dv | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |
| glProgramUniformMatrix4x2fv | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |
| glProgramUniformMatrix4x3dv | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |
| glProgramUniformMatrix4x3fv | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |
| glReleaseShaderCompiler | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  | ✔ |  |  |  |
| glScissorArrayv | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |
| glScissorIndexed | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |
| glScissorIndexedv | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |
| glShaderBinary | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  | ✔ |  |  |  |
| glUseProgramStages | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |
| glValidateProgramPipeline | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  | ✔ |  |
| glVertexAttribL1d | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |
| glVertexAttribL1dv | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |
| glVertexAttribL2d | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |
| glVertexAttribL2dv | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |
| glVertexAttribL3d | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |
| glVertexAttribL3dv | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |
| glVertexAttribL4d | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |
| glVertexAttribL4dv | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |
| glVertexAttribLPointer | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |
| glViewportArrayv | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |
| glViewportIndexedf | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |
| glViewportIndexedfv | GL41 |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |  |
| glBindImageTexture | GL42 |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  | ✔ |  |
| glDrawArraysInstancedBaseInstance | GL42 |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |
| glDrawElementsInstancedBaseInstance | GL42 |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |
| glDrawElementsInstancedBaseVertexBaseInstance | GL42 |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |
| glDrawTransformFeedbackInstanced | GL42 |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |
| glDrawTransformFeedbackStreamInstanced | GL42 |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |
| glGetActiveAtomicCounterBufferi | GL42 |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |
| glGetActiveAtomicCounterBufferiv | GL42 |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |
| glGetInternalformati | GL42 |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  | ✔ |  |  |
| glGetInternalformativ | GL42 |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  | ✔ |  |  |
| glMemoryBarrier | GL42 |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  | ✔ |  |
| glTexStorage1D | GL42 |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |  |
| glTexStorage2D | GL42 |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  | ✔ |  |  |
| glTexStorage3D | GL42 |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  | ✔ |  |  |
| glBindVertexBuffer | GL43 |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  | ✔ |  |
| glClearBufferData | GL43 |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |
| glClearBufferSubData | GL43 |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |
| glCopyImageSubData | GL43 |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  | ✔ |
| glDebugMessageCallback | GL43 |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  | ✔ |
| glDebugMessageControl | GL43 |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  | ✔ |
| glDebugMessageInsert | GL43 |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  | ✔ |
| glDispatchCompute | GL43 |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  | ✔ |  |
| glDispatchComputeIndirect | GL43 |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  | ✔ |  |
| glFramebufferParameteri | GL43 |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  | ✔ |  |
| glGetDebugMessageLog | GL43 |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  | ✔ |
| glGetFramebufferParameteri | GL43 |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  | ✔ |  |
| glGetFramebufferParameteriv | GL43 |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  | ✔ |  |
| glGetInternalformati64 | GL43 |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |
| glGetInternalformati64v | GL43 |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |
| glGetObjectLabel | GL43 |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  | ✔ |
| glGetObjectPtrLabel | GL43 |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  | ✔ |
| glGetProgramInterfacei | GL43 |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  | ✔ |  |
| glGetProgramInterfaceiv | GL43 |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  | ✔ |  |
| glGetProgramResourceIndex | GL43 |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  | ✔ |  |
| glGetProgramResourceiv | GL43 |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  | ✔ |  |
| glGetProgramResourceLocation | GL43 |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  | ✔ |  |
| glGetProgramResourceLocationIndex | GL43 |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |
| glGetProgramResourceName | GL43 |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  | ✔ |  |
| glInvalidateBufferData | GL43 |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |
| glInvalidateBufferSubData | GL43 |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |
| glInvalidateFramebuffer | GL43 |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  | ✔ |  |  |
| glInvalidateSubFramebuffer | GL43 |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  | ✔ |  |  |
| glInvalidateTexImage | GL43 |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |
| glInvalidateTexSubImage | GL43 |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |
| glMultiDrawArraysIndirect | GL43 |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |
| glMultiDrawElementsIndirect | GL43 |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |
| glObjectLabel | GL43 |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  | ✔ |
| glObjectPtrLabel | GL43 |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  | ✔ |
| glPopDebugGroup | GL43 |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  | ✔ |
| glPushDebugGroup | GL43 |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  | ✔ |
| glShaderStorageBlockBinding | GL43 |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |
| glTexBufferRange | GL43 |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  | ✔ |
| glTexStorage2DMultisample | GL43 |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  | ✔ |  |
| glTexStorage3DMultisample | GL43 |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  | ✔ |
| glTextureView | GL43 |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |
| glVertexAttribBinding | GL43 |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  | ✔ |  |
| glVertexAttribFormat | GL43 |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  | ✔ |  |
| glVertexAttribIFormat | GL43 |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  | ✔ |  |
| glVertexAttribLFormat | GL43 |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |  |
| glVertexBindingDivisor | GL43 |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  | ✔ |  |
| glBindBuffersBase | GL44 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |
| glBindBuffersRange | GL44 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |
| glBindImageTextures | GL44 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |
| glBindSamplers | GL44 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |
| glBindTextures | GL44 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |
| glBindVertexBuffers | GL44 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |
| glBufferStorage | GL44 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |
| glClearTexImage | GL44 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |
| glClearTexSubImage | GL44 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |  |
| glBindTextureUnit | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glBlitNamedFramebuffer | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glCheckNamedFramebufferStatus | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glClearNamedBufferData | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glClearNamedBufferSubData | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glClearNamedFramebufferfi | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glClearNamedFramebufferfv | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glClearNamedFramebufferiv | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glClearNamedFramebufferuiv | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glClipControl | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glCompressedTextureSubImage1D | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glCompressedTextureSubImage2D | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glCompressedTextureSubImage3D | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glCopyNamedBufferSubData | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glCopyTextureSubImage1D | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glCopyTextureSubImage2D | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glCopyTextureSubImage3D | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glCreateBuffers | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glCreateFramebuffers | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glCreateProgramPipelines | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glCreateQueries | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glCreateRenderbuffers | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glCreateSamplers | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glCreateTextures | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glCreateTransformFeedbacks | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glCreateVertexArrays | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glDisableVertexArrayAttrib | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glEnableVertexArrayAttrib | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glFlushMappedNamedBufferRange | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGenerateTextureMipmap | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetCompressedTextureImage | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetCompressedTextureSubImage | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetGraphicsResetStatus | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  | ✔ |
| glGetNamedBufferParameteri | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetNamedBufferParameteri64 | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetNamedBufferParameteri64v | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetNamedBufferParameteriv | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetNamedBufferPointer | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetNamedBufferPointerv | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetNamedBufferSubData | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetNamedFramebufferAttachmentParameteri | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetNamedFramebufferAttachmentParameteriv | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetNamedFramebufferParameteri | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetNamedFramebufferParameteriv | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetNamedRenderbufferParameteri | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetNamedRenderbufferParameteriv | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetnColorTable | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetnCompressedTexImage | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetnConvolutionFilter | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetnHistogram | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetnMapd | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetnMapdv | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetnMapf | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetnMapfv | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetnMapi | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetnMapiv | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetnMinmax | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetnPixelMapfv | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetnPixelMapuiv | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetnPixelMapusv | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetnPolygonStipple | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetnSeparableFilter | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetnTexImage | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetnUniformd | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetnUniformdv | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetnUniformf | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  | ✔ |
| glGetnUniformfv | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  | ✔ |
| glGetnUniformi | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  | ✔ |
| glGetnUniformiv | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  | ✔ |
| glGetnUniformui | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  | ✔ |
| glGetnUniformuiv | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  | ✔ |
| glGetQueryBufferObjecti64v | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetQueryBufferObjectiv | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetQueryBufferObjectui64v | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetQueryBufferObjectuiv | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetTextureImage | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetTextureLevelParameterf | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetTextureLevelParameterfv | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetTextureLevelParameteri | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetTextureLevelParameteriv | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetTextureParameterf | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetTextureParameterfv | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetTextureParameteri | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetTextureParameterIi | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetTextureParameterIiv | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetTextureParameterIui | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetTextureParameterIuiv | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetTextureParameteriv | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetTextureSubImage | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetTransformFeedbacki | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetTransformFeedbacki64 | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetTransformFeedbacki64_v | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetTransformFeedbacki_v | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetTransformFeedbackiv | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetVertexArrayi | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetVertexArrayIndexed64i | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetVertexArrayIndexed64iv | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetVertexArrayIndexedi | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetVertexArrayIndexediv | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glGetVertexArrayiv | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glInvalidateNamedFramebufferData | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glInvalidateNamedFramebufferSubData | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glMapNamedBuffer | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glMapNamedBufferRange | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glMemoryBarrierByRegion | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  | ✔ |  |
| glNamedBufferData | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glNamedBufferStorage | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glNamedBufferSubData | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glNamedFramebufferDrawBuffer | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glNamedFramebufferDrawBuffers | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glNamedFramebufferParameteri | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glNamedFramebufferReadBuffer | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glNamedFramebufferRenderbuffer | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glNamedFramebufferTexture | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glNamedFramebufferTextureLayer | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glNamedRenderbufferStorage | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glNamedRenderbufferStorageMultisample | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glReadnPixels | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  | ✔ |
| glTextureBarrier | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glTextureBuffer | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glTextureBufferRange | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glTextureParameterf | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glTextureParameterfv | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glTextureParameteri | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glTextureParameterIi | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glTextureParameterIiv | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glTextureParameterIui | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glTextureParameterIuiv | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glTextureParameteriv | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glTextureStorage1D | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glTextureStorage2D | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glTextureStorage2DMultisample | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glTextureStorage3D | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glTextureStorage3DMultisample | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glTextureSubImage1D | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glTextureSubImage2D | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glTextureSubImage3D | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glTransformFeedbackBufferBase | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glTransformFeedbackBufferRange | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glUnmapNamedBuffer | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glVertexArrayAttribBinding | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glVertexArrayAttribFormat | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glVertexArrayAttribIFormat | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glVertexArrayAttribLFormat | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glVertexArrayBindingDivisor | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glVertexArrayElementBuffer | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glVertexArrayVertexBuffer | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glVertexArrayVertexBuffers | GL45 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |  |
| glMultiDrawArraysIndirectCount | GL46 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |
| glMultiDrawElementsIndirectCount | GL46 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |
| glPolygonOffsetClamp | GL46 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |
| glSpecializeShader | GL46 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |  |  |  |  |
| glBlendBarrier | GLES32 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |
| glPrimitiveBoundingBox | GLES32 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |
| glSamplerParameterIi | GLES32 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |
| glSamplerParameterIui | GLES32 |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | ✔ |
