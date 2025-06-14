package com.blackhub.bronline.game.common.colorpickerview;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import java.util.Locale;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* loaded from: classes3.dex */
public class ColorUtils {
    public static String getHexCode(@ColorInt int color) {
        return String.format(Locale.getDefault(), "%02X%02X%02X%02X", Integer.valueOf(Color.alpha(color)), Integer.valueOf(Color.red(color)), Integer.valueOf(Color.green(color)), Integer.valueOf(Color.blue(color)));
    }

    public static int[] getColorARGB(@ColorInt int color) {
        return new int[]{Color.alpha(color), Color.red(color), Color.green(color), Color.blue(color)};
    }
}
