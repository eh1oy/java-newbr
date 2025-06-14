package com.blackhub.bronline.game.core.extension;

import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.google.android.material.timepicker.TimeModel;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt__MathJVMKt;
import org.apache.commons.lang3.text.FormattableUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: DoubleExtension.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0011\u0010\u0007\u001a\u00020\b*\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\t\u001a\u0011\u0010\n\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\u0003\u001a\u0011\u0010\u000b\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\u0003\u001a\u001c\u0010\f\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u001a\n\u0010\u0010\u001a\u00020\u0011*\u00020\u0002\"\u0017\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0017\u0010\u0004\u001a\u00020\u0002*\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"isZero", "", "", "(Ljava/lang/Double;)Z", "orZero", "getOrZero", "(Ljava/lang/Double;)D", "dropZeros", "", "(Ljava/lang/Double;)Ljava/lang/String;", "isDecimal", "isInt", "roundOffDecimal", "pattern", "roundingMode", "Ljava/math/RoundingMode;", "roundToIntSafely", "", "app_siteRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDoubleExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DoubleExtension.kt\ncom/blackhub/bronline/game/core/extension/DoubleExtensionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,54:1\n1#2:55\n*E\n"})
/* loaded from: classes3.dex */
public final class DoubleExtensionKt {
    public static final double getOrZero(@Nullable Double d) {
        if (d != null) {
            return d.doubleValue();
        }
        return 0.0d;
    }

    public static final boolean isZero(@Nullable Double d) {
        Boolean bool;
        if (d != null) {
            bool = Boolean.valueOf(d.doubleValue() == 0.0d);
        } else {
            bool = null;
        }
        return BooleanExtensionKt.getOrFalse(bool);
    }

    public static /* synthetic */ double roundOffDecimal$default(double d, String str, RoundingMode roundingMode, int i, Object obj) {
        if ((i & 2) != 0) {
            roundingMode = RoundingMode.UP;
        }
        return roundOffDecimal(d, str, roundingMode);
    }

    public static final double roundOffDecimal(double d, @NotNull String pattern, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        decimalFormat.setRoundingMode(roundingMode);
        Number parse = NumberFormat.getNumberInstance(Locale.getDefault()).parse(decimalFormat.format(d));
        return getOrZero(parse != null ? Double.valueOf(parse.doubleValue()) : null);
    }

    @NotNull
    public static final String dropZeros(@Nullable Double d) {
        if (d == null) {
            return "0";
        }
        if (Intrinsics.areEqual(d, (long) d.doubleValue())) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf((long) d.doubleValue())}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return format;
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String format2 = String.format(FormattableUtils.SIMPLEST_FORMAT, Arrays.copyOf(new Object[]{d}, 1));
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        return format2;
    }

    public static final boolean isDecimal(@Nullable Double d) {
        Boolean bool;
        if (d != null) {
            double doubleValue = d.doubleValue();
            bool = Boolean.valueOf(doubleValue == ((double) ((long) doubleValue)));
        } else {
            bool = null;
        }
        return BooleanExtensionKt.getOrFalse(bool);
    }

    public static final boolean isInt(@Nullable Double d) {
        Boolean bool;
        if (d != null) {
            bool = Boolean.valueOf(d.doubleValue() % ((double) 1) == 0.0d);
        } else {
            bool = null;
        }
        return BooleanExtensionKt.getOrFalse(bool);
    }

    public static final int roundToIntSafely(double d) {
        try {
            return MathKt__MathJVMKt.roundToInt(d);
        } catch (Exception e) {
            UtilsKt.crashlyticsLog("Double.roundToIntSafely exception: " + e);
            return 0;
        }
    }
}
