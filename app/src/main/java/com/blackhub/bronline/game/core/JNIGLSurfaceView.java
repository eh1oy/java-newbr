package com.blackhub.bronline.game.core;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.MotionEvent;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* loaded from: classes3.dex */
public class JNIGLSurfaceView extends GLSurfaceView {
    public static final boolean DEBUG = true;

    public JNIGLSurfaceView(Context context) {
        super(context);
        setEGLContextClientVersion(3);
        setEGLConfigChooser(new JNIConfigChooser(context));
        setRenderer(new JNIRenderer());
        setPreserveEGLContextOnPause(true);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        int pointerCount = event.getPointerCount();
        final int i = 0;
        final int i2 = 0;
        final int i3 = 0;
        final int i4 = 0;
        final int i5 = 0;
        final int i6 = 0;
        for (int i7 = 0; i7 < pointerCount; i7++) {
            int pointerId = event.getPointerId(i7);
            if (pointerId == 0) {
                i = (int) event.getX(i7);
                i2 = (int) event.getY(i7);
            } else if (pointerId == 1) {
                i3 = (int) event.getX(i7);
                i4 = (int) event.getY(i7);
            } else if (pointerId == 2) {
                i5 = (int) event.getX(i7);
                i6 = (int) event.getY(i7);
            }
        }
        final int pointerId2 = event.getPointerId(event.getActionIndex());
        final int actionMasked = event.getActionMasked();
        queueEvent(new Runnable() { // from class: com.blackhub.bronline.game.core.JNIGLSurfaceView.1
            @Override // java.lang.Runnable
            public void run() {
                JNILib.multiTouchEvent(actionMasked, pointerId2, i, i2, i3, i4, i5, i6);
            }
        });
        return true;
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        setRenderMode(1);
        queueEvent(new Runnable() { // from class: com.blackhub.bronline.game.core.JNIGLSurfaceView.2
            @Override // java.lang.Runnable
            public void run() {
                JNILib.resumeEvent();
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        queueEvent(new Runnable() { // from class: com.blackhub.bronline.game.core.JNIGLSurfaceView.3
            @Override // java.lang.Runnable
            public void run() {
                JNILib.pauseEvent();
            }
        });
        setRenderMode(0);
    }
}
