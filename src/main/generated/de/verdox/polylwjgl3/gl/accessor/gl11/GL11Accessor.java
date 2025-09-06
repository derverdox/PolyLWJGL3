package de.verdox.polylwjgl3.gl.accessor.gl11;

import de.verdox.polylwjgl3.gl.functions.gl.glAccum;
import de.verdox.polylwjgl3.gl.functions.gl.glAlphaFunc;
import de.verdox.polylwjgl3.gl.functions.gl.glAreTexturesResident;
import de.verdox.polylwjgl3.gl.functions.gl.glArrayElement;
import de.verdox.polylwjgl3.gl.functions.gl.glBegin;
import de.verdox.polylwjgl3.gl.functions.gl.glBitmap;
import de.verdox.polylwjgl3.gl.functions.gl.glCallList;
import de.verdox.polylwjgl3.gl.functions.gl.glCallLists;
import de.verdox.polylwjgl3.gl.functions.gl.glClearAccum;
import de.verdox.polylwjgl3.gl.functions.gl.glClearDepth;
import de.verdox.polylwjgl3.gl.functions.gl.glClearIndex;
import de.verdox.polylwjgl3.gl.functions.gl.glClipPlane;
import de.verdox.polylwjgl3.gl.functions.gl.glColor3b;
import de.verdox.polylwjgl3.gl.functions.gl.glColor3bv;
import de.verdox.polylwjgl3.gl.functions.gl.glColor3d;
import de.verdox.polylwjgl3.gl.functions.gl.glColor3dv;
import de.verdox.polylwjgl3.gl.functions.gl.glColor3f;
import de.verdox.polylwjgl3.gl.functions.gl.glColor3fv;
import de.verdox.polylwjgl3.gl.functions.gl.glColor3i;
import de.verdox.polylwjgl3.gl.functions.gl.glColor3iv;
import de.verdox.polylwjgl3.gl.functions.gl.glColor3s;
import de.verdox.polylwjgl3.gl.functions.gl.glColor3sv;
import de.verdox.polylwjgl3.gl.functions.gl.glColor3ub;
import de.verdox.polylwjgl3.gl.functions.gl.glColor3ubv;
import de.verdox.polylwjgl3.gl.functions.gl.glColor3ui;
import de.verdox.polylwjgl3.gl.functions.gl.glColor3uiv;
import de.verdox.polylwjgl3.gl.functions.gl.glColor3us;
import de.verdox.polylwjgl3.gl.functions.gl.glColor3usv;
import de.verdox.polylwjgl3.gl.functions.gl.glColor4b;
import de.verdox.polylwjgl3.gl.functions.gl.glColor4bv;
import de.verdox.polylwjgl3.gl.functions.gl.glColor4d;
import de.verdox.polylwjgl3.gl.functions.gl.glColor4dv;
import de.verdox.polylwjgl3.gl.functions.gl.glColor4f;
import de.verdox.polylwjgl3.gl.functions.gl.glColor4fv;
import de.verdox.polylwjgl3.gl.functions.gl.glColor4i;
import de.verdox.polylwjgl3.gl.functions.gl.glColor4iv;
import de.verdox.polylwjgl3.gl.functions.gl.glColor4s;
import de.verdox.polylwjgl3.gl.functions.gl.glColor4sv;
import de.verdox.polylwjgl3.gl.functions.gl.glColor4ub;
import de.verdox.polylwjgl3.gl.functions.gl.glColor4ubv;
import de.verdox.polylwjgl3.gl.functions.gl.glColor4ui;
import de.verdox.polylwjgl3.gl.functions.gl.glColor4uiv;
import de.verdox.polylwjgl3.gl.functions.gl.glColor4us;
import de.verdox.polylwjgl3.gl.functions.gl.glColor4usv;
import de.verdox.polylwjgl3.gl.functions.gl.glColorMaterial;
import de.verdox.polylwjgl3.gl.functions.gl.glColorPointer;
import de.verdox.polylwjgl3.gl.functions.gl.glCopyPixels;
import de.verdox.polylwjgl3.gl.functions.gl.glCopyTexImage1D;
import de.verdox.polylwjgl3.gl.functions.gl.glCopyTexSubImage1D;
import de.verdox.polylwjgl3.gl.functions.gl.glDeleteLists;
import de.verdox.polylwjgl3.gl.functions.gl.glDepthRange;
import de.verdox.polylwjgl3.gl.functions.gl.glDisableClientState;
import de.verdox.polylwjgl3.gl.functions.gl.glDrawBuffer;
import de.verdox.polylwjgl3.gl.functions.gl.glDrawPixels;
import de.verdox.polylwjgl3.gl.functions.gl.glEdgeFlag;
import de.verdox.polylwjgl3.gl.functions.gl.glEdgeFlagPointer;
import de.verdox.polylwjgl3.gl.functions.gl.glEdgeFlagv;
import de.verdox.polylwjgl3.gl.functions.gl.glEnableClientState;
import de.verdox.polylwjgl3.gl.functions.gl.glEnd;
import de.verdox.polylwjgl3.gl.functions.gl.glEndList;
import de.verdox.polylwjgl3.gl.functions.gl.glEvalCoord1d;
import de.verdox.polylwjgl3.gl.functions.gl.glEvalCoord1dv;
import de.verdox.polylwjgl3.gl.functions.gl.glEvalCoord1f;
import de.verdox.polylwjgl3.gl.functions.gl.glEvalCoord1fv;
import de.verdox.polylwjgl3.gl.functions.gl.glEvalCoord2d;
import de.verdox.polylwjgl3.gl.functions.gl.glEvalCoord2dv;
import de.verdox.polylwjgl3.gl.functions.gl.glEvalCoord2f;
import de.verdox.polylwjgl3.gl.functions.gl.glEvalCoord2fv;
import de.verdox.polylwjgl3.gl.functions.gl.glEvalMesh1;
import de.verdox.polylwjgl3.gl.functions.gl.glEvalMesh2;
import de.verdox.polylwjgl3.gl.functions.gl.glEvalPoint1;
import de.verdox.polylwjgl3.gl.functions.gl.glEvalPoint2;
import de.verdox.polylwjgl3.gl.functions.gl.glFeedbackBuffer;
import de.verdox.polylwjgl3.gl.functions.gl.glFogf;
import de.verdox.polylwjgl3.gl.functions.gl.glFogfv;
import de.verdox.polylwjgl3.gl.functions.gl.glFogi;
import de.verdox.polylwjgl3.gl.functions.gl.glFogiv;
import de.verdox.polylwjgl3.gl.functions.gl.glFrustum;
import de.verdox.polylwjgl3.gl.functions.gl.glGenLists;
import de.verdox.polylwjgl3.gl.functions.gl.glGetClipPlane;
import de.verdox.polylwjgl3.gl.functions.gl.glGetDouble;
import de.verdox.polylwjgl3.gl.functions.gl.glGetDoublev;
import de.verdox.polylwjgl3.gl.functions.gl.glGetLightf;
import de.verdox.polylwjgl3.gl.functions.gl.glGetLightfv;
import de.verdox.polylwjgl3.gl.functions.gl.glGetLighti;
import de.verdox.polylwjgl3.gl.functions.gl.glGetLightiv;
import de.verdox.polylwjgl3.gl.functions.gl.glGetMapd;
import de.verdox.polylwjgl3.gl.functions.gl.glGetMapdv;
import de.verdox.polylwjgl3.gl.functions.gl.glGetMapf;
import de.verdox.polylwjgl3.gl.functions.gl.glGetMapfv;
import de.verdox.polylwjgl3.gl.functions.gl.glGetMapi;
import de.verdox.polylwjgl3.gl.functions.gl.glGetMapiv;
import de.verdox.polylwjgl3.gl.functions.gl.glGetMaterialfv;
import de.verdox.polylwjgl3.gl.functions.gl.glGetMaterialiv;
import de.verdox.polylwjgl3.gl.functions.gl.glGetPixelMapfv;
import de.verdox.polylwjgl3.gl.functions.gl.glGetPixelMapuiv;
import de.verdox.polylwjgl3.gl.functions.gl.glGetPixelMapusv;
import de.verdox.polylwjgl3.gl.functions.gl.glGetPolygonStipple;
import de.verdox.polylwjgl3.gl.functions.gl.glGetTexEnvf;
import de.verdox.polylwjgl3.gl.functions.gl.glGetTexEnvfv;
import de.verdox.polylwjgl3.gl.functions.gl.glGetTexEnvi;
import de.verdox.polylwjgl3.gl.functions.gl.glGetTexEnviv;
import de.verdox.polylwjgl3.gl.functions.gl.glGetTexGend;
import de.verdox.polylwjgl3.gl.functions.gl.glGetTexGendv;
import de.verdox.polylwjgl3.gl.functions.gl.glGetTexGenf;
import de.verdox.polylwjgl3.gl.functions.gl.glGetTexGenfv;
import de.verdox.polylwjgl3.gl.functions.gl.glGetTexGeni;
import de.verdox.polylwjgl3.gl.functions.gl.glGetTexGeniv;
import de.verdox.polylwjgl3.gl.functions.gl.glGetTexImage;
import de.verdox.polylwjgl3.gl.functions.gl.glIndexMask;
import de.verdox.polylwjgl3.gl.functions.gl.glIndexPointer;
import de.verdox.polylwjgl3.gl.functions.gl.glIndexd;
import de.verdox.polylwjgl3.gl.functions.gl.glIndexdv;
import de.verdox.polylwjgl3.gl.functions.gl.glIndexf;
import de.verdox.polylwjgl3.gl.functions.gl.glIndexfv;
import de.verdox.polylwjgl3.gl.functions.gl.glIndexi;
import de.verdox.polylwjgl3.gl.functions.gl.glIndexiv;
import de.verdox.polylwjgl3.gl.functions.gl.glIndexs;
import de.verdox.polylwjgl3.gl.functions.gl.glIndexsv;
import de.verdox.polylwjgl3.gl.functions.gl.glIndexub;
import de.verdox.polylwjgl3.gl.functions.gl.glIndexubv;
import de.verdox.polylwjgl3.gl.functions.gl.glInitNames;
import de.verdox.polylwjgl3.gl.functions.gl.glInterleavedArrays;
import de.verdox.polylwjgl3.gl.functions.gl.glIsList;
import de.verdox.polylwjgl3.gl.functions.gl.glLightModelf;
import de.verdox.polylwjgl3.gl.functions.gl.glLightModelfv;
import de.verdox.polylwjgl3.gl.functions.gl.glLightModeli;
import de.verdox.polylwjgl3.gl.functions.gl.glLightModeliv;
import de.verdox.polylwjgl3.gl.functions.gl.glLightf;
import de.verdox.polylwjgl3.gl.functions.gl.glLightfv;
import de.verdox.polylwjgl3.gl.functions.gl.glLighti;
import de.verdox.polylwjgl3.gl.functions.gl.glLightiv;
import de.verdox.polylwjgl3.gl.functions.gl.glLineStipple;
import de.verdox.polylwjgl3.gl.functions.gl.glListBase;
import de.verdox.polylwjgl3.gl.functions.gl.glLoadIdentity;
import de.verdox.polylwjgl3.gl.functions.gl.glLoadMatrixd;
import de.verdox.polylwjgl3.gl.functions.gl.glLoadMatrixf;
import de.verdox.polylwjgl3.gl.functions.gl.glLoadName;
import de.verdox.polylwjgl3.gl.functions.gl.glLogicOp;
import de.verdox.polylwjgl3.gl.functions.gl.glMap1d;
import de.verdox.polylwjgl3.gl.functions.gl.glMap1f;
import de.verdox.polylwjgl3.gl.functions.gl.glMap2d;
import de.verdox.polylwjgl3.gl.functions.gl.glMap2f;
import de.verdox.polylwjgl3.gl.functions.gl.glMapGrid1d;
import de.verdox.polylwjgl3.gl.functions.gl.glMapGrid1f;
import de.verdox.polylwjgl3.gl.functions.gl.glMapGrid2d;
import de.verdox.polylwjgl3.gl.functions.gl.glMapGrid2f;
import de.verdox.polylwjgl3.gl.functions.gl.glMaterialf;
import de.verdox.polylwjgl3.gl.functions.gl.glMaterialfv;
import de.verdox.polylwjgl3.gl.functions.gl.glMateriali;
import de.verdox.polylwjgl3.gl.functions.gl.glMaterialiv;
import de.verdox.polylwjgl3.gl.functions.gl.glMatrixMode;
import de.verdox.polylwjgl3.gl.functions.gl.glMultMatrixd;
import de.verdox.polylwjgl3.gl.functions.gl.glMultMatrixf;
import de.verdox.polylwjgl3.gl.functions.gl.glNewList;
import de.verdox.polylwjgl3.gl.functions.gl.glNormal3b;
import de.verdox.polylwjgl3.gl.functions.gl.glNormal3bv;
import de.verdox.polylwjgl3.gl.functions.gl.glNormal3d;
import de.verdox.polylwjgl3.gl.functions.gl.glNormal3dv;
import de.verdox.polylwjgl3.gl.functions.gl.glNormal3f;
import de.verdox.polylwjgl3.gl.functions.gl.glNormal3fv;
import de.verdox.polylwjgl3.gl.functions.gl.glNormal3i;
import de.verdox.polylwjgl3.gl.functions.gl.glNormal3iv;
import de.verdox.polylwjgl3.gl.functions.gl.glNormal3s;
import de.verdox.polylwjgl3.gl.functions.gl.glNormal3sv;
import de.verdox.polylwjgl3.gl.functions.gl.glNormalPointer;
import de.verdox.polylwjgl3.gl.functions.gl.glOrtho;
import de.verdox.polylwjgl3.gl.functions.gl.glPassThrough;
import de.verdox.polylwjgl3.gl.functions.gl.glPixelMapfv;
import de.verdox.polylwjgl3.gl.functions.gl.glPixelMapuiv;
import de.verdox.polylwjgl3.gl.functions.gl.glPixelMapusv;
import de.verdox.polylwjgl3.gl.functions.gl.glPixelStoref;
import de.verdox.polylwjgl3.gl.functions.gl.glPixelTransferf;
import de.verdox.polylwjgl3.gl.functions.gl.glPixelTransferi;
import de.verdox.polylwjgl3.gl.functions.gl.glPixelZoom;
import de.verdox.polylwjgl3.gl.functions.gl.glPointSize;
import de.verdox.polylwjgl3.gl.functions.gl.glPolygonMode;
import de.verdox.polylwjgl3.gl.functions.gl.glPolygonStipple;
import de.verdox.polylwjgl3.gl.functions.gl.glPopAttrib;
import de.verdox.polylwjgl3.gl.functions.gl.glPopClientAttrib;
import de.verdox.polylwjgl3.gl.functions.gl.glPopMatrix;
import de.verdox.polylwjgl3.gl.functions.gl.glPopName;
import de.verdox.polylwjgl3.gl.functions.gl.glPrioritizeTextures;
import de.verdox.polylwjgl3.gl.functions.gl.glPushAttrib;
import de.verdox.polylwjgl3.gl.functions.gl.glPushClientAttrib;
import de.verdox.polylwjgl3.gl.functions.gl.glPushMatrix;
import de.verdox.polylwjgl3.gl.functions.gl.glPushName;
import de.verdox.polylwjgl3.gl.functions.gl.glRasterPos2d;
import de.verdox.polylwjgl3.gl.functions.gl.glRasterPos2dv;
import de.verdox.polylwjgl3.gl.functions.gl.glRasterPos2f;
import de.verdox.polylwjgl3.gl.functions.gl.glRasterPos2fv;
import de.verdox.polylwjgl3.gl.functions.gl.glRasterPos2i;
import de.verdox.polylwjgl3.gl.functions.gl.glRasterPos2iv;
import de.verdox.polylwjgl3.gl.functions.gl.glRasterPos2s;
import de.verdox.polylwjgl3.gl.functions.gl.glRasterPos2sv;
import de.verdox.polylwjgl3.gl.functions.gl.glRasterPos3d;
import de.verdox.polylwjgl3.gl.functions.gl.glRasterPos3dv;
import de.verdox.polylwjgl3.gl.functions.gl.glRasterPos3f;
import de.verdox.polylwjgl3.gl.functions.gl.glRasterPos3fv;
import de.verdox.polylwjgl3.gl.functions.gl.glRasterPos3i;
import de.verdox.polylwjgl3.gl.functions.gl.glRasterPos3iv;
import de.verdox.polylwjgl3.gl.functions.gl.glRasterPos3s;
import de.verdox.polylwjgl3.gl.functions.gl.glRasterPos3sv;
import de.verdox.polylwjgl3.gl.functions.gl.glRasterPos4d;
import de.verdox.polylwjgl3.gl.functions.gl.glRasterPos4dv;
import de.verdox.polylwjgl3.gl.functions.gl.glRasterPos4f;
import de.verdox.polylwjgl3.gl.functions.gl.glRasterPos4fv;
import de.verdox.polylwjgl3.gl.functions.gl.glRasterPos4i;
import de.verdox.polylwjgl3.gl.functions.gl.glRasterPos4iv;
import de.verdox.polylwjgl3.gl.functions.gl.glRasterPos4s;
import de.verdox.polylwjgl3.gl.functions.gl.glRasterPos4sv;
import de.verdox.polylwjgl3.gl.functions.gl.glRectd;
import de.verdox.polylwjgl3.gl.functions.gl.glRectdv;
import de.verdox.polylwjgl3.gl.functions.gl.glRectf;
import de.verdox.polylwjgl3.gl.functions.gl.glRectfv;
import de.verdox.polylwjgl3.gl.functions.gl.glRecti;
import de.verdox.polylwjgl3.gl.functions.gl.glRectiv;
import de.verdox.polylwjgl3.gl.functions.gl.glRects;
import de.verdox.polylwjgl3.gl.functions.gl.glRectsv;
import de.verdox.polylwjgl3.gl.functions.gl.glRenderMode;
import de.verdox.polylwjgl3.gl.functions.gl.glRotated;
import de.verdox.polylwjgl3.gl.functions.gl.glRotatef;
import de.verdox.polylwjgl3.gl.functions.gl.glScaled;
import de.verdox.polylwjgl3.gl.functions.gl.glScalef;
import de.verdox.polylwjgl3.gl.functions.gl.glSelectBuffer;
import de.verdox.polylwjgl3.gl.functions.gl.glShadeModel;
import de.verdox.polylwjgl3.gl.functions.gl.glTexCoord1d;
import de.verdox.polylwjgl3.gl.functions.gl.glTexCoord1dv;
import de.verdox.polylwjgl3.gl.functions.gl.glTexCoord1f;
import de.verdox.polylwjgl3.gl.functions.gl.glTexCoord1fv;
import de.verdox.polylwjgl3.gl.functions.gl.glTexCoord1i;
import de.verdox.polylwjgl3.gl.functions.gl.glTexCoord1iv;
import de.verdox.polylwjgl3.gl.functions.gl.glTexCoord1s;
import de.verdox.polylwjgl3.gl.functions.gl.glTexCoord1sv;
import de.verdox.polylwjgl3.gl.functions.gl.glTexCoord2d;
import de.verdox.polylwjgl3.gl.functions.gl.glTexCoord2dv;
import de.verdox.polylwjgl3.gl.functions.gl.glTexCoord2f;
import de.verdox.polylwjgl3.gl.functions.gl.glTexCoord2fv;
import de.verdox.polylwjgl3.gl.functions.gl.glTexCoord2i;
import de.verdox.polylwjgl3.gl.functions.gl.glTexCoord2iv;
import de.verdox.polylwjgl3.gl.functions.gl.glTexCoord2s;
import de.verdox.polylwjgl3.gl.functions.gl.glTexCoord2sv;
import de.verdox.polylwjgl3.gl.functions.gl.glTexCoord3d;
import de.verdox.polylwjgl3.gl.functions.gl.glTexCoord3dv;
import de.verdox.polylwjgl3.gl.functions.gl.glTexCoord3f;
import de.verdox.polylwjgl3.gl.functions.gl.glTexCoord3fv;
import de.verdox.polylwjgl3.gl.functions.gl.glTexCoord3i;
import de.verdox.polylwjgl3.gl.functions.gl.glTexCoord3iv;
import de.verdox.polylwjgl3.gl.functions.gl.glTexCoord3s;
import de.verdox.polylwjgl3.gl.functions.gl.glTexCoord3sv;
import de.verdox.polylwjgl3.gl.functions.gl.glTexCoord4d;
import de.verdox.polylwjgl3.gl.functions.gl.glTexCoord4dv;
import de.verdox.polylwjgl3.gl.functions.gl.glTexCoord4f;
import de.verdox.polylwjgl3.gl.functions.gl.glTexCoord4fv;
import de.verdox.polylwjgl3.gl.functions.gl.glTexCoord4i;
import de.verdox.polylwjgl3.gl.functions.gl.glTexCoord4iv;
import de.verdox.polylwjgl3.gl.functions.gl.glTexCoord4s;
import de.verdox.polylwjgl3.gl.functions.gl.glTexCoord4sv;
import de.verdox.polylwjgl3.gl.functions.gl.glTexCoordPointer;
import de.verdox.polylwjgl3.gl.functions.gl.glTexEnvf;
import de.verdox.polylwjgl3.gl.functions.gl.glTexEnvfv;
import de.verdox.polylwjgl3.gl.functions.gl.glTexEnvi;
import de.verdox.polylwjgl3.gl.functions.gl.glTexEnviv;
import de.verdox.polylwjgl3.gl.functions.gl.glTexGend;
import de.verdox.polylwjgl3.gl.functions.gl.glTexGendv;
import de.verdox.polylwjgl3.gl.functions.gl.glTexGenf;
import de.verdox.polylwjgl3.gl.functions.gl.glTexGenfv;
import de.verdox.polylwjgl3.gl.functions.gl.glTexGeni;
import de.verdox.polylwjgl3.gl.functions.gl.glTexGeniv;
import de.verdox.polylwjgl3.gl.functions.gl.glTexImage1D;
import de.verdox.polylwjgl3.gl.functions.gl.glTexImage2D_CORE;
import de.verdox.polylwjgl3.gl.functions.gl.glTexSubImage1D;
import de.verdox.polylwjgl3.gl.functions.gl.glTexSubImage2D_CORE;
import de.verdox.polylwjgl3.gl.functions.gl.glTranslated;
import de.verdox.polylwjgl3.gl.functions.gl.glTranslatef;
import de.verdox.polylwjgl3.gl.functions.gl.glVertex2d;
import de.verdox.polylwjgl3.gl.functions.gl.glVertex2dv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertex2f;
import de.verdox.polylwjgl3.gl.functions.gl.glVertex2fv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertex2i;
import de.verdox.polylwjgl3.gl.functions.gl.glVertex2iv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertex2s;
import de.verdox.polylwjgl3.gl.functions.gl.glVertex2sv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertex3d;
import de.verdox.polylwjgl3.gl.functions.gl.glVertex3dv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertex3f;
import de.verdox.polylwjgl3.gl.functions.gl.glVertex3fv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertex3i;
import de.verdox.polylwjgl3.gl.functions.gl.glVertex3iv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertex3s;
import de.verdox.polylwjgl3.gl.functions.gl.glVertex3sv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertex4d;
import de.verdox.polylwjgl3.gl.functions.gl.glVertex4dv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertex4f;
import de.verdox.polylwjgl3.gl.functions.gl.glVertex4fv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertex4i;
import de.verdox.polylwjgl3.gl.functions.gl.glVertex4iv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertex4s;
import de.verdox.polylwjgl3.gl.functions.gl.glVertex4sv;
import de.verdox.polylwjgl3.gl.functions.gl.glVertexPointer;
import de.verdox.polylwjgl3.gl.functions.glBindTexture;
import de.verdox.polylwjgl3.gl.functions.glBlendFunc;
import de.verdox.polylwjgl3.gl.functions.glClear;
import de.verdox.polylwjgl3.gl.functions.glClearColor;
import de.verdox.polylwjgl3.gl.functions.glClearStencil;
import de.verdox.polylwjgl3.gl.functions.glColorMask;
import de.verdox.polylwjgl3.gl.functions.glCopyTexImage2D;
import de.verdox.polylwjgl3.gl.functions.glCopyTexSubImage2D;
import de.verdox.polylwjgl3.gl.functions.glCullFace;
import de.verdox.polylwjgl3.gl.functions.glDeleteTextures;
import de.verdox.polylwjgl3.gl.functions.glDepthFunc;
import de.verdox.polylwjgl3.gl.functions.glDepthMask;
import de.verdox.polylwjgl3.gl.functions.glDisable;
import de.verdox.polylwjgl3.gl.functions.glDrawArrays;
import de.verdox.polylwjgl3.gl.functions.glDrawElements;
import de.verdox.polylwjgl3.gl.functions.glEnable;
import de.verdox.polylwjgl3.gl.functions.glFinish;
import de.verdox.polylwjgl3.gl.functions.glFlush;
import de.verdox.polylwjgl3.gl.functions.glFrontFace;
import de.verdox.polylwjgl3.gl.functions.glGenTextures;
import de.verdox.polylwjgl3.gl.functions.glGetBoolean;
import de.verdox.polylwjgl3.gl.functions.glGetBooleanv;
import de.verdox.polylwjgl3.gl.functions.glGetError;
import de.verdox.polylwjgl3.gl.functions.glGetFloat;
import de.verdox.polylwjgl3.gl.functions.glGetFloatv;
import de.verdox.polylwjgl3.gl.functions.glGetInteger;
import de.verdox.polylwjgl3.gl.functions.glGetIntegerv;
import de.verdox.polylwjgl3.gl.functions.glGetPointer;
import de.verdox.polylwjgl3.gl.functions.glGetPointerv;
import de.verdox.polylwjgl3.gl.functions.glGetString;
import de.verdox.polylwjgl3.gl.functions.glGetTexLevelParameterf;
import de.verdox.polylwjgl3.gl.functions.glGetTexLevelParameterfv;
import de.verdox.polylwjgl3.gl.functions.glGetTexLevelParameteri;
import de.verdox.polylwjgl3.gl.functions.glGetTexLevelParameteriv;
import de.verdox.polylwjgl3.gl.functions.glGetTexParameterf;
import de.verdox.polylwjgl3.gl.functions.glGetTexParameterfv;
import de.verdox.polylwjgl3.gl.functions.glGetTexParameteri;
import de.verdox.polylwjgl3.gl.functions.glGetTexParameteriv;
import de.verdox.polylwjgl3.gl.functions.glHint;
import de.verdox.polylwjgl3.gl.functions.glIsEnabled;
import de.verdox.polylwjgl3.gl.functions.glIsTexture;
import de.verdox.polylwjgl3.gl.functions.glLineWidth;
import de.verdox.polylwjgl3.gl.functions.glPixelStorei;
import de.verdox.polylwjgl3.gl.functions.glPolygonOffset;
import de.verdox.polylwjgl3.gl.functions.glReadBuffer;
import de.verdox.polylwjgl3.gl.functions.glReadPixels;
import de.verdox.polylwjgl3.gl.functions.glScissor;
import de.verdox.polylwjgl3.gl.functions.glStencilFunc;
import de.verdox.polylwjgl3.gl.functions.glStencilMask;
import de.verdox.polylwjgl3.gl.functions.glStencilOp;
import de.verdox.polylwjgl3.gl.functions.glTexImage2D;
import de.verdox.polylwjgl3.gl.functions.glTexParameterf;
import de.verdox.polylwjgl3.gl.functions.glTexParameterfv;
import de.verdox.polylwjgl3.gl.functions.glTexParameteri;
import de.verdox.polylwjgl3.gl.functions.glTexParameteriv;
import de.verdox.polylwjgl3.gl.functions.glTexSubImage2D;
import de.verdox.polylwjgl3.gl.functions.glViewport;
import java.nio.*;
import javax.annotation.*;
import org.jetbrains.annotations.*;
import org.lwjgl.*;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.*;
import org.lwjgl.system.Checks.*;
import org.lwjgl.system.JNI.*;
import org.lwjgl.system.MemoryStack.*;
import org.lwjgl.system.MemoryUtil.*;

/**
 * OpenGL 1.1 Accessor — Fixed-Function Pipeline overview.
 *
 * <p>This accessor aggregates the classic GL 1.1 entry points covering fixed-function state,
 * transformation, rasterization, texturing, lighting/materials, client arrays, selections/feedback,
 * pixel transfer, and queries. Below is a quick index of method families with a short description
 * of what they do. Overloads (e.g., numeric arities and vector forms) are omitted for brevity.</p>
 *
 * <h2>Global state & pipeline control</h2>
 * <ul>
 *   <li>{@code glEnable} / {@code glDisable} — Turn specific capabilities on/off (e.g., GL_BLEND, GL_DEPTH_TEST).</li>
 *   <li>{@code glIsEnabled} — Query whether a capability is enabled.</li>
 *   <li>{@code glHint} — Provide implementation hints (quality vs. performance).</li>
 *   <li>{@code glFrontFace}, {@code glCullFace} — Define front-face winding and back/face culling mode.</li>
 *   <li>{@code glShadeModel} — Select flat/smooth shading.</li>
 *   <li>{@code glLogicOp} — Enable logical pixel operations for color buffer.</li>
 *   <li>{@code glPolygonMode}, {@code glPolygonOffset}, {@code glLineWidth}, {@code glLineStipple},
 *       {@code glPointSize} — Rasterizer fill/offset/line/point controls.</li>
 *   <li>{@code glScissor} — Restrict drawing to a rectangular region.</li>
 *   <li>{@code glBlendFunc}, {@code glAlphaFunc} — Blending and alpha-test configuration.</li>
 *   <li>{@code glDepthFunc}, {@code glDepthMask}, {@code glDepthRange} — Depth testing configuration.</li>
 *   <li>{@code glStencilFunc}, {@code glStencilOp}, {@code glStencilMask} — Stencil testing configuration.</li>
 *   <li>{@code glClear}, {@code glClearColor}, {@code glClearDepth}, {@code glClearStencil}, {@code glClearIndex},
 *       {@code glClearAccum} — Clear buffers and set their clear values.</li>
 *   <li>{@code glAccum} — Operate on the accumulation buffer.</li>
 *   <li>{@code glDrawBuffer}, {@code glReadBuffer} — Select draw/read color buffer.</li>
 *   <li>{@code glFinish}, {@code glFlush} — Synchronize or flush GL command stream.</li>
 *   <li>{@code glGetError}, {@code glGetString} — Error/status and implementation strings.</li>
 * </ul>
 *
 * <h2>Matrices & transformations</h2>
 * <ul>
 *   <li>{@code glMatrixMode} — Select current matrix stack (MODELVIEW, PROJECTION, TEXTURE).</li>
 *   <li>{@code glLoadIdentity}, {@code glLoadMatrix*}, {@code glMultMatrix*} — Load/multiply current matrix.</li>
 *   <li>{@code glTranslate*}, {@code glRotate*}, {@code glScale*} — Apply model transforms.</li>
 *   <li>{@code glFrustum}, {@code glOrtho} — Set projection matrices.</li>
 *   <li>{@code glPushMatrix}, {@code glPopMatrix} — Save/restore current matrix.</li>
 * </ul>
 *
 * <h2>Drawing primitives & client arrays</h2>
 * <ul>
 *   <li>{@code glBegin} / {@code glEnd} — Immediate-mode drawing of primitives.</li>
 *   <li>{@code glVertex*}, {@code glNormal*}, {@code glColor*}, {@code glTexCoord*}, {@code glEdgeFlag*} —
 *       Per-vertex attribute specification (immediate-mode).</li>
 *   <li>{@code glDrawArrays}, {@code glDrawElements}, {@code glArrayElement} — Draw from enabled client arrays.</li>
 *   <li>{@code glEnableClientState}, {@code glDisableClientState} — Enable/disable array clients
 *       (VERTEX_ARRAY, COLOR_ARRAY, etc.).</li>
 *   <li>{@code glVertexPointer}, {@code glNormalPointer}, {@code glColorPointer}, {@code glIndexPointer},
 *       {@code glTexCoordPointer}, {@code glEdgeFlagPointer}, {@code glInterleavedArrays} — Bind array data.</li>
 *   <li>{@code glIsList}, {@code glNewList}, {@code glEndList}, {@code glCallList(s)}, {@code glGenLists},
 *       {@code glDeleteLists}, {@code glListBase} — Display list management.</li>
 * </ul>
 *
 * <h2>Viewport, selection & feedback</h2>
 * <ul>
 *   <li>{@code glViewport} — Set viewport rectangle.</li>
 *   <li>{@code glSelectBuffer}, {@code glRenderMode} — Selection rendering mode and hit-record buffer.</li>
 *   <li>{@code glInitNames}, {@code glLoadName}, {@code glPushName}, {@code glPopName} — Name stack for selection.</li>
 *   <li>{@code glFeedbackBuffer}, {@code glPassThrough} — Feedback mode and user markers.</li>
 * </ul>
 *
 * <h2>Raster positions & rectangle helpers</h2>
 * <ul>
 *   <li>{@code glRasterPos*} — Set the current raster position for pixel transfers.</li>
 *   <li>{@code glRect*} — Convenience helpers to draw axis-aligned rectangles.</li>
 * </ul>
 *
 * <h2>Pixel transfer, storage & operations</h2>
 * <ul>
 *   <li>{@code glPixelStorei/f} — Pixel unpack/pack alignment and row length controls.</li>
 *   <li>{@code glPixelTransferi/f}, {@code glPixelZoom} — Pixel transfer scales/bias and zoom.</li>
 *   <li>{@code glDrawPixels}, {@code glReadPixels}, {@code glCopyPixels} — Image I/O to/from the framebuffer.</li>
 *   <li>{@code glGetPixelMap*} — Retrieve pixel transfer maps.</li>
 * </ul>
 *
 * <h2>Texturing</h2>
 * <ul>
 *   <li>{@code glBindTexture}, {@code glGenTextures}, {@code glDeleteTextures}, {@code glIsTexture} — Texture object management.</li>
 *   <li>{@code glAreTexturesResident}, {@code glPrioritizeTextures} — Residency hints and priorities.</li>
 *   <li>{@code glTexImage1D/2D}, {@code glTexSubImage1D/2D} — Define/replace texture images.</li>
 *   <li>{@code glCopyTexImage1D/2D}, {@code glCopyTexSubImage1D/2D} — Define/replace textures from framebuffer.</li>
 *   <li>{@code glTexParameter*i/f/v} — Set texture parameters (wrap, filter, border color, etc.).</li>
 *   <li>{@code glTexEnv*i/f/v} — Fixed-function texture environment/combiner setup.</li>
 *   <li>{@code glTexGen*i/f/d/v} — Texture coordinate generation modes/planes.</li>
 *   <li>{@code glGetTexImage}, {@code glGetTexLevelParameter*i/f}, {@code glGetTexParameter*i/f} — Texture queries.</li>
 * </ul>
 *
 * <h2>Lighting & materials</h2>
 * <ul>
 *   <li>{@code glLight*i/f/v}, {@code glLightModel*i/f/v} — Light source and global lighting parameters.</li>
 *   <li>{@code glMaterial*i/f/v}, {@code glColorMaterial} — Per-material appearance and color-material binding.</li>
 *   <li>{@code glGetLight*i/f/v}, {@code glGetMaterial*i/f/v} — Lighting/material queries.</li>
 * </ul>
 *
 * <h2>Colors & indices</h2>
 * <ul>
 *   <li>{@code glColor3*}, {@code glColor4*}, {@code glColorMask} — Set current color, enable/disable color channels.</li>
 *   <li>{@code glIndex*}, {@code glIndexMask} — Color index mode support.</li>
 * </ul>
 *
 * <h2>Evaluators (curves & surfaces)</h2>
 * <ul>
 *   <li>{@code glMap1*}, {@code glMap2*} — Define 1D/2D evaluators for vertices, normals, colors, texcoords.</li>
 *   <li>{@code glMapGrid1*}, {@code glMapGrid2*} — Define evaluation grids.</li>
 *   <li>{@code glEvalCoord*}, {@code glEvalPoint*}, {@code glEvalMesh*} — Evaluate and render from maps.</li>
 *   <li>{@code glGetMap*} — Query evaluator definitions.</li>
 * </ul>
 *
 * <h2>Queries & information</h2>
 * <ul>
 *   <li>{@code glGetBoolean*v}, {@code glGetInteger*v}, {@code glGetFloat*v}, {@code glGetDouble*v} — Generic state queries.</li>
 *   <li>{@code glGetPointerv} / {@code glGetPointer} — Retrieve current array pointers.</li>
 *   <li>{@code glGetClipPlane} — Retrieve user clip plane equations.</li>
 *   <li>{@code glGetTexEnv*}, {@code glGetTexGen*}, {@code glGetTexParameter*}, {@code glGetTexLevelParameter*} — Texture state queries.</li>
 *   <li>{@code glGetPixelMap*}, {@code glGetPolygonStipple} — Pixel/polygon stipple queries.</li>
 *   <li>{@code glIsList}, {@code glIsTexture} — Object existence tests.</li>
 * </ul>
 *
 * <p><b>Notes:</b> Methods listed with a trailing {@code *} denote families with multiple numeric or vector
 * overloads (e.g., {@code glColor3f}, {@code glColor3fv}, {@code glColor3ub}, etc.). Where both “core”
 * and sub-package variants exist (e.g., {@code glTexImage2D} and {@code glTexImage2D_CORE}), the accessor
 * exposes the flavor-appropriate interfaces as part of its extends list.</p>
 */
public interface GL11Accessor extends glEnable, glDisable, glAccum, glAlphaFunc, glAreTexturesResident, glArrayElement, glBegin, glBindTexture, glBitmap, glBlendFunc, glCallList, glCallLists, glClear, glClearAccum, glClearColor, glClearDepth, glClearIndex, glClearStencil, glClipPlane, glColor3b, glColor3s, glColor3i, glColor3f, glColor3d, glColor3ub, glColor3us, glColor3ui, glColor3bv, glColor3sv, glColor3iv, glColor3fv, glColor3dv, glColor3ubv, glColor3usv, glColor3uiv, glColor4b, glColor4s, glColor4i, glColor4f, glColor4d, glColor4ub, glColor4us, glColor4ui, glColor4bv, glColor4sv, glColor4iv, glColor4fv, glColor4dv, glColor4ubv, glColor4usv, glColor4uiv, glColorMask, glColorMaterial, glColorPointer, glCopyPixels, glCullFace, glDeleteLists, glDepthFunc, glDepthMask, glDepthRange, glDisableClientState, glDrawArrays, glDrawBuffer, glDrawElements, glDrawPixels, glEdgeFlag, glEdgeFlagv, glEdgeFlagPointer, glEnableClientState, glEnd, glEvalCoord1f, glEvalCoord1fv, glEvalCoord1d, glEvalCoord1dv, glEvalCoord2f, glEvalCoord2fv, glEvalCoord2d, glEvalCoord2dv, glEvalMesh1, glEvalMesh2, glEvalPoint1, glEvalPoint2, glFeedbackBuffer, glFinish, glFlush, glFogi, glFogiv, glFogf, glFogfv, glFrontFace, glGenLists, glGenTextures, glDeleteTextures, glGetClipPlane, glGetBooleanv, glGetBoolean, glGetFloatv, glGetFloat, glGetIntegerv, glGetInteger, glGetDoublev, glGetDouble, glGetError, glGetLightiv, glGetLighti, glGetLightfv, glGetLightf, glGetMapiv, glGetMapi, glGetMapfv, glGetMapf, glGetMapdv, glGetMapd, glGetMaterialiv, glGetMaterialfv, glGetPixelMapfv, glGetPixelMapusv, glGetPixelMapuiv, glGetPointerv, glGetPointer, glGetPolygonStipple, glGetString, glGetTexEnviv, glGetTexEnvi, glGetTexEnvfv, glGetTexEnvf, glGetTexGeniv, glGetTexGeni, glGetTexGenfv, glGetTexGenf, glGetTexGendv, glGetTexGend, glGetTexImage, glGetTexLevelParameteriv, glGetTexLevelParameteri, glGetTexLevelParameterfv, glGetTexLevelParameterf, glGetTexParameteriv, glGetTexParameteri, glGetTexParameterfv, glGetTexParameterf, glHint, glIndexi, glIndexub, glIndexs, glIndexf, glIndexd, glIndexiv, glIndexubv, glIndexsv, glIndexfv, glIndexdv, glIndexMask, glIndexPointer, glInitNames, glInterleavedArrays, glIsEnabled, glIsList, glIsTexture, glLightModeli, glLightModelf, glLightModeliv, glLightModelfv, glLighti, glLightf, glLightiv, glLightfv, glLineStipple, glLineWidth, glListBase, glLoadMatrixf, glLoadMatrixd, glLoadIdentity, glLoadName, glLogicOp, glMap1f, glMap1d, glMap2f, glMap2d, glMapGrid1f, glMapGrid1d, glMapGrid2f, glMapGrid2d, glMateriali, glMaterialf, glMaterialiv, glMaterialfv, glMatrixMode, glMultMatrixf, glMultMatrixd, glFrustum, glNewList, glEndList, glNormal3f, glNormal3b, glNormal3s, glNormal3i, glNormal3d, glNormal3fv, glNormal3bv, glNormal3sv, glNormal3iv, glNormal3dv, glNormalPointer, glOrtho, glPassThrough, glPixelMapfv, glPixelMapusv, glPixelMapuiv, glPixelStorei, glPixelStoref, glPixelTransferi, glPixelTransferf, glPixelZoom, glPointSize, glPolygonMode, glPolygonOffset, glPolygonStipple, glPushAttrib, glPushClientAttrib, glPopAttrib, glPopClientAttrib, glPopMatrix, glPopName, glPrioritizeTextures, glPushMatrix, glPushName, glRasterPos2i, glRasterPos2s, glRasterPos2f, glRasterPos2d, glRasterPos2iv, glRasterPos2sv, glRasterPos2fv, glRasterPos2dv, glRasterPos3i, glRasterPos3s, glRasterPos3f, glRasterPos3d, glRasterPos3iv, glRasterPos3sv, glRasterPos3fv, glRasterPos3dv, glRasterPos4i, glRasterPos4s, glRasterPos4f, glRasterPos4d, glRasterPos4iv, glRasterPos4sv, glRasterPos4fv, glRasterPos4dv, glReadBuffer, glReadPixels, glRecti, glRects, glRectf, glRectd, glRectiv, glRectsv, glRectfv, glRectdv, glRenderMode, glRotatef, glRotated, glScalef, glScaled, glScissor, glSelectBuffer, glShadeModel, glStencilFunc, glStencilMask, glStencilOp, glTexCoord1f, glTexCoord1s, glTexCoord1i, glTexCoord1d, glTexCoord1fv, glTexCoord1sv, glTexCoord1iv, glTexCoord1dv, glTexCoord2f, glTexCoord2s, glTexCoord2i, glTexCoord2d, glTexCoord2fv, glTexCoord2sv, glTexCoord2iv, glTexCoord2dv, glTexCoord3f, glTexCoord3s, glTexCoord3i, glTexCoord3d, glTexCoord3fv, glTexCoord3sv, glTexCoord3iv, glTexCoord3dv, glTexCoord4f, glTexCoord4s, glTexCoord4i, glTexCoord4d, glTexCoord4fv, glTexCoord4sv, glTexCoord4iv, glTexCoord4dv, glTexCoordPointer, glTexEnvi, glTexEnviv, glTexEnvf, glTexEnvfv, glTexGeni, glTexGeniv, glTexGenf, glTexGenfv, glTexGend, glTexGendv, glTexImage1D, glTexImage2D, glTexImage2D_CORE, glCopyTexImage1D, glCopyTexImage2D, glCopyTexSubImage1D, glCopyTexSubImage2D, glTexParameteri, glTexParameteriv, glTexParameterf, glTexParameterfv, glTexSubImage1D, glTexSubImage2D, glTexSubImage2D_CORE, glTranslatef, glTranslated, glVertex2f, glVertex2s, glVertex2i, glVertex2d, glVertex2fv, glVertex2sv, glVertex2iv, glVertex2dv, glVertex3f, glVertex3s, glVertex3i, glVertex3d, glVertex3fv, glVertex3sv, glVertex3iv, glVertex3dv, glVertex4f, glVertex4s, glVertex4i, glVertex4d, glVertex4fv, glVertex4sv, glVertex4iv, glVertex4dv, glVertexPointer, glViewport {

}
