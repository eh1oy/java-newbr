package com.blackhub.bronline.game.core.extension;

import android.content.res.Resources;
import kotlin.Metadata;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: DisplayDensityExtensions.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"toDp", "", "getToDp", "(I)I", "toSp", "getToSp", "app_siteRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DisplayDensityExtensionsKt {
    public static final int getToDp(int i) {
        return (int) (i * Resources.getSystem().getDisplayMetrics().density);
    }

    public static final int getToSp(int i) {
        return (int) (i * Resources.getSystem().getDisplayMetrics().scaledDensity);
    }
}
