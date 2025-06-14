package com.blackhub.bronline.game.common;

import android.os.Build;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* loaded from: classes3.dex */
public class GUIPopupWindow extends PopupWindow {
    public GUIPopupWindow(View view, int width, int height, boolean focusable) {
        super(view, width, height, focusable);
    }

    public void setDimming(float value) {
        View view = (View) getContentView().getParent();
        if (getBackground() != null) {
            view = (View) view.getParent();
        }
        WindowManager windowManager = (WindowManager) getContentView().getContext().getSystemService("window");
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) view.getLayoutParams();
        layoutParams.flags |= 2;
        layoutParams.dimAmount = value;
        windowManager.updateViewLayout(view, layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r1.height == (-2)) goto L8;
     */
    @Override // android.widget.PopupWindow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void showAtLocation(android.view.View r6, int r7, int r8, int r9) {
        /*
            r5 = this;
            android.view.View r0 = r5.getContentView()
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            r2 = -1
            if (r1 == 0) goto L11
            int r1 = r1.height
            r3 = -2
            if (r1 != r3) goto L11
            goto L12
        L11:
            r3 = r2
        L12:
            com.blackhub.bronline.game.common.PopupViewContainer r1 = new com.blackhub.bronline.game.common.PopupViewContainer
            android.content.Context r4 = r0.getContext()
            r1.<init>(r4)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r4.<init>(r2, r3)
            r2 = 0
            r1.setBackground(r2)
            android.view.ViewParent r3 = r0.getParent()
            if (r3 == 0) goto L33
            android.view.ViewParent r3 = r0.getParent()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r3.removeView(r0)
        L33:
            r1.addView(r0, r4)
            r5.setContentView(r1)
            r5.setBackgroundDrawable(r2)
            android.view.View r0 = r5.getContentView()
            r1 = 1
            r0.setFocusableInTouchMode(r1)
            android.view.View r0 = r5.getContentView()
            r5.hideSystemUIver2(r0)
            android.view.View r0 = r5.getContentView()
            com.blackhub.bronline.game.common.GUIPopupWindow$$ExternalSyntheticLambda0 r1 = new com.blackhub.bronline.game.common.GUIPopupWindow$$ExternalSyntheticLambda0
            r1.<init>()
            r0.setOnSystemUiVisibilityChangeListener(r1)
            super.showAtLocation(r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.common.GUIPopupWindow.showAtLocation(android.view.View, int, int, int):void");
    }

    public final /* synthetic */ void lambda$showAtLocation$0(int i) {
        hideSystemUIver2(getContentView());
    }

    public final void hideSystemUIver2(View view) {
        if (Build.VERSION.SDK_INT > 29) {
            view.setSystemUiVisibility(6150);
        } else {
            view.setSystemUiVisibility(6662);
        }
    }
}
