package com.blackhub.bronline.game.core.extension;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: LongExtension.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\u0002\"\u0017\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0017\u0010\u0004\u001a\u00020\u0002*\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"isIntegralNumber", "", "", "(Ljava/lang/Long;)Z", "orZero", "getOrZero", "(Ljava/lang/Long;)J", "parseTimeToStringWithFormat", "", "app_siteRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LongExtensionKt {
    public static final long getOrZero(@Nullable Long l) {
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public static final boolean isIntegralNumber(@Nullable Long l) {
        Boolean bool;
        if (l != null) {
            bool = Boolean.valueOf(l.longValue() % ((long) 100) == 0);
        } else {
            bool = null;
        }
        return BooleanExtensionKt.getOrFalse(bool);
    }

    @NotNull
    public static final String parseTimeToStringWithFormat(long j) {
        long j2 = j / 1000;
        long j3 = 60;
        long j4 = j2 / j3;
        long j5 = j2 % j3;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j4), Long.valueOf(j5)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
