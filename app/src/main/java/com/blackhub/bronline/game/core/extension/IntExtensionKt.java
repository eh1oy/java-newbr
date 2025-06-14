package com.blackhub.bronline.game.core.extension;

import android.content.Context;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.unit.Dp;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: IntExtension.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\r\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u0012\u0010\u0010\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013\u001a\u0012\u0010\u0014\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013\u001a\u0012\u0010\u0015\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013\u001a\n\u0010\u0016\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0017\u001a\u00020\u0011*\u00020\u0002\u001a\n\u0010\u0018\u001a\u00020\u0011*\u00020\u0002\u001a\u0017\u0010\u0019\u001a\u00020\u001a*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u001b\"\u0017\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0017\u0010\u0004\u001a\u00020\u0001*\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0003\"\u0017\u0010\u0005\u001a\u00020\u0001*\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003\"\u0017\u0010\u0006\u001a\u00020\u0001*\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0003\"\u0017\u0010\u0007\u001a\u00020\u0001*\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0003\"\u0017\u0010\b\u001a\u00020\u0002*\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u0017\u0010\u000b\u001a\u00020\u0002*\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\f\u0010\n¨\u0006\u001c"}, d2 = {"isNegativeCommand", "", "", "(Ljava/lang/Integer;)Z", "isNotNegativeCommand", "isNotZero", "isOne", "isZero", "orOne", "getOrOne", "(Ljava/lang/Integer;)I", "orZero", "getOrZero", "dpToPx", "context", "Landroid/content/Context;", "formatDurationNoSecondsWithHoursWithLocale", "", "locale", "Landroidx/compose/ui/text/intl/Locale;", "formatDurationWithLocale", "formatDurationWithLocaleNoSecondsIfHoursMoreThanZero", "isEven", "parseTimeToStringHMS", "parseTimeToStringWithFormat", "pxToDp", "Landroidx/compose/ui/unit/Dp;", "(ILandroid/content/Context;)F", "app_siteRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIntExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntExtension.kt\ncom/blackhub/bronline/game/core/extension/IntExtensionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,153:1\n1#2:154\n154#3:155\n*S KotlinDebug\n*F\n+ 1 IntExtension.kt\ncom/blackhub/bronline/game/core/extension/IntExtensionKt\n*L\n145#1:155\n*E\n"})
/* loaded from: classes3.dex */
public final class IntExtensionKt {
    public static final boolean isEven(int i) {
        return (i & 1) == 0;
    }

    public static final int getOrZero(@Nullable Integer num) {
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final int getOrOne(@Nullable Integer num) {
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    public static final boolean isZero(@Nullable Integer num) {
        Boolean bool;
        if (num != null) {
            bool = Boolean.valueOf(num.intValue() == 0);
        } else {
            bool = null;
        }
        return BooleanExtensionKt.getOrFalse(bool);
    }

    public static final boolean isOne(@Nullable Integer num) {
        Boolean bool;
        if (num != null) {
            bool = Boolean.valueOf(num.intValue() == 1);
        } else {
            bool = null;
        }
        return BooleanExtensionKt.getOrFalse(bool);
    }

    public static final boolean isNotZero(@Nullable Integer num) {
        Boolean bool;
        if (num != null) {
            bool = Boolean.valueOf(num.intValue() != 0);
        } else {
            bool = null;
        }
        return BooleanExtensionKt.getOrFalse(bool);
    }

    public static final boolean isNegativeCommand(@Nullable Integer num) {
        Boolean bool;
        if (num != null) {
            bool = Boolean.valueOf(num.intValue() == -1);
        } else {
            bool = null;
        }
        return BooleanExtensionKt.getOrFalse(bool);
    }

    public static final boolean isNotNegativeCommand(@Nullable Integer num) {
        Boolean bool;
        if (num != null) {
            bool = Boolean.valueOf(num.intValue() != -1);
        } else {
            bool = null;
        }
        return BooleanExtensionKt.getOrFalse(bool);
    }

    @NotNull
    public static final String parseTimeToStringWithFormat(int i) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i / 60), Integer.valueOf(i % 60)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    @NotNull
    public static final String parseTimeToStringHMS(int i) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i / 3600), Integer.valueOf((i % 3600) / 60), Integer.valueOf(i % 60)}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    @NotNull
    public static final String formatDurationWithLocale(int i, @NotNull Locale locale) {
        String str;
        Intrinsics.checkNotNullParameter(locale, "locale");
        long duration = DurationKt.toDuration(i, DurationUnit.SECONDS);
        long m9478getInWholeHoursimpl = Duration.m9478getInWholeHoursimpl(duration);
        DurationUnit durationUnit = DurationUnit.HOURS;
        long m9481getInWholeMinutesimpl = Duration.m9481getInWholeMinutesimpl(Duration.m9497minusLRDsOJo(duration, DurationKt.toDuration(m9478getInWholeHoursimpl, durationUnit)));
        long m9483getInWholeSecondsimpl = Duration.m9483getInWholeSecondsimpl(Duration.m9497minusLRDsOJo(Duration.m9497minusLRDsOJo(duration, DurationKt.toDuration(m9478getInWholeHoursimpl, durationUnit)), DurationKt.toDuration(m9481getInWholeMinutesimpl, DurationUnit.MINUTES)));
        List listOf = Intrinsics.areEqual(locale.getLanguage(), "ru") ? CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{" ч ", " мин ", " сек"}) : CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{" h ", " min ", " sec"});
        Long valueOf = Long.valueOf(m9478getInWholeHoursimpl);
        String str2 = null;
        if (valueOf.longValue() <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            long longValue = valueOf.longValue();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = String.format("%02d%s", Arrays.copyOf(new Object[]{Long.valueOf(longValue), CollectionsKt___CollectionsKt.getOrNull(listOf, 0)}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        } else {
            str = null;
        }
        Long valueOf2 = Long.valueOf(m9481getInWholeMinutesimpl);
        if (valueOf2.longValue() <= 0) {
            valueOf2 = null;
        }
        if (valueOf2 != null) {
            long longValue2 = valueOf2.longValue();
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            str2 = String.format("%02d%s", Arrays.copyOf(new Object[]{Long.valueOf(longValue2), CollectionsKt___CollectionsKt.getOrNull(listOf, 1)}, 2));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        }
        StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
        String format = String.format("%02d%s", Arrays.copyOf(new Object[]{Long.valueOf(m9483getInWholeSecondsimpl), CollectionsKt___CollectionsKt.getOrNull(listOf, 2)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new String[]{str, str2, format}), AnyExtensionKt.empty(stringCompanionObject3), null, null, 0, null, null, 62, null);
    }

    @NotNull
    public static final String formatDurationWithLocaleNoSecondsIfHoursMoreThanZero(int i, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        long duration = DurationKt.toDuration(i, DurationUnit.SECONDS);
        long m9477getInWholeDaysimpl = Duration.m9477getInWholeDaysimpl(duration);
        long m9478getInWholeHoursimpl = Duration.m9478getInWholeHoursimpl(Duration.m9497minusLRDsOJo(duration, DurationKt.toDuration(m9477getInWholeDaysimpl, DurationUnit.DAYS)));
        DurationUnit durationUnit = DurationUnit.HOURS;
        long m9481getInWholeMinutesimpl = Duration.m9481getInWholeMinutesimpl(Duration.m9497minusLRDsOJo(duration, DurationKt.toDuration(m9478getInWholeHoursimpl, durationUnit)));
        long m9483getInWholeSecondsimpl = Duration.m9483getInWholeSecondsimpl(Duration.m9497minusLRDsOJo(Duration.m9497minusLRDsOJo(duration, DurationKt.toDuration(m9478getInWholeHoursimpl, durationUnit)), DurationKt.toDuration(m9481getInWholeMinutesimpl, DurationUnit.MINUTES)));
        List listOf = Intrinsics.areEqual(locale.getLanguage(), "ru") ? CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{" д. ", " ч. ", " м. ", " с."}) : CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{" d. ", " h. ", " m. ", " s."});
        if (m9477getInWholeDaysimpl > 0) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%02d%s", Arrays.copyOf(new Object[]{Long.valueOf(m9477getInWholeDaysimpl), listOf.get(0)}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            String format2 = String.format("%02d%s", Arrays.copyOf(new Object[]{Long.valueOf(m9478getInWholeHoursimpl), listOf.get(1)}, 2));
            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
            return CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new String[]{format, format2}), AnyExtensionKt.empty(stringCompanionObject), null, null, 0, null, null, 62, null);
        }
        if (m9478getInWholeHoursimpl > 0) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String format3 = String.format("%02d%s", Arrays.copyOf(new Object[]{Long.valueOf(m9478getInWholeHoursimpl), listOf.get(1)}, 2));
            Intrinsics.checkNotNullExpressionValue(format3, "format(...)");
            String format4 = String.format("%02d%s", Arrays.copyOf(new Object[]{Long.valueOf(m9481getInWholeMinutesimpl), listOf.get(2)}, 2));
            Intrinsics.checkNotNullExpressionValue(format4, "format(...)");
            return CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new String[]{format3, format4}), AnyExtensionKt.empty(stringCompanionObject2), null, null, 0, null, null, 62, null);
        }
        StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
        String format5 = String.format("%02d%s", Arrays.copyOf(new Object[]{Long.valueOf(m9481getInWholeMinutesimpl), listOf.get(2)}, 2));
        Intrinsics.checkNotNullExpressionValue(format5, "format(...)");
        String format6 = String.format("%02d%s", Arrays.copyOf(new Object[]{Long.valueOf(m9483getInWholeSecondsimpl), listOf.get(3)}, 2));
        Intrinsics.checkNotNullExpressionValue(format6, "format(...)");
        return CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new String[]{format5, format6}), AnyExtensionKt.empty(stringCompanionObject3), null, null, 0, null, null, 62, null);
    }

    @NotNull
    public static final String formatDurationNoSecondsWithHoursWithLocale(int i, @NotNull Locale locale) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(locale, "locale");
        long duration = DurationKt.toDuration(i, DurationUnit.SECONDS);
        long m9478getInWholeHoursimpl = Duration.m9478getInWholeHoursimpl(duration);
        DurationUnit durationUnit = DurationUnit.HOURS;
        long m9481getInWholeMinutesimpl = Duration.m9481getInWholeMinutesimpl(Duration.m9497minusLRDsOJo(duration, DurationKt.toDuration(m9478getInWholeHoursimpl, durationUnit)));
        long m9483getInWholeSecondsimpl = Duration.m9483getInWholeSecondsimpl(Duration.m9497minusLRDsOJo(Duration.m9497minusLRDsOJo(duration, DurationKt.toDuration(m9478getInWholeHoursimpl, durationUnit)), DurationKt.toDuration(m9481getInWholeMinutesimpl, DurationUnit.MINUTES)));
        List listOf = Intrinsics.areEqual(locale.getLanguage(), "ru") ? CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{" ч ", " мин ", " сек"}) : CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{" h ", " min ", " sec"});
        Long valueOf = Long.valueOf(m9478getInWholeHoursimpl);
        String str3 = null;
        if (valueOf.longValue() <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            long longValue = valueOf.longValue();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = String.format("%02d%s", Arrays.copyOf(new Object[]{Long.valueOf(longValue), CollectionsKt___CollectionsKt.getOrNull(listOf, 0)}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        } else {
            str = null;
        }
        Long valueOf2 = Long.valueOf(m9481getInWholeMinutesimpl);
        if (valueOf2.longValue() <= 0) {
            valueOf2 = null;
        }
        if (valueOf2 != null) {
            long longValue2 = valueOf2.longValue();
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            str2 = String.format("%02d%s", Arrays.copyOf(new Object[]{Long.valueOf(longValue2), CollectionsKt___CollectionsKt.getOrNull(listOf, 1)}, 2));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        } else {
            str2 = null;
        }
        Long valueOf3 = Long.valueOf(m9483getInWholeSecondsimpl);
        if (m9478getInWholeHoursimpl != 0) {
            valueOf3 = null;
        }
        if (valueOf3 != null) {
            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
            str3 = String.format("%02d%s", Arrays.copyOf(new Object[]{Long.valueOf(m9483getInWholeSecondsimpl), CollectionsKt___CollectionsKt.getOrNull(listOf, 2)}, 2));
            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        }
        return CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new String[]{str, str2, str3}), AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, null, 0, null, null, 62, null);
    }

    public static final int dpToPx(int i, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return FloatExtensionKt.roundToIntSafely(i * context.getResources().getDisplayMetrics().density);
    }

    public static final float pxToDp(int i, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Dp.m6103constructorimpl(FloatExtensionKt.roundToIntSafely(i / context.getResources().getDisplayMetrics().density));
    }
}
