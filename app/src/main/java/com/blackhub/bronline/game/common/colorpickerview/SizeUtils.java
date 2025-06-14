package com.blackhub.bronline.game.common.colorpickerview;

import android.content.Context;
import androidx.annotation.RestrictTo;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class SizeUtils {
    public static int dp2Px(Context context, int dp) {
        return (int) ((dp * context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
