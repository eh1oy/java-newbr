package com.blackhub.bronline.game.common.colorpickerview;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.annotation.RestrictTo;
import com.blackhub.bronline.R;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class FadeUtils {
    public static void fadeIn(View view) {
        Animation loadAnimation = AnimationUtils.loadAnimation(view.getContext(), R.anim.fade_in_colorpickerview_skydoves);
        loadAnimation.setFillAfter(true);
        view.startAnimation(loadAnimation);
    }

    public static void fadeOut(View view) {
        Animation loadAnimation = AnimationUtils.loadAnimation(view.getContext(), R.anim.fade_out_colorpickerview_skydoves);
        loadAnimation.setFillAfter(true);
        view.startAnimation(loadAnimation);
    }
}
