package com.blackhub.bronline.game.core.utils;

import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.DateExtensionKt;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: DateFormatter.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0004J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fJ\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0004¢\u0006\u0002\u0010\u0019J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004J\u000e\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004J\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001e\u001a\u00020\u0004¢\u0006\u0002\u0010 J\u000e\u0010!\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fJ\u0015\u0010\"\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001e\u001a\u00020\u0004¢\u0006\u0002\u0010 J\u001d\u0010#\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0002\u0010$J\u000e\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u000fJ\u001a\u0010'\u001a\u00020\u0004*\u00020\u00042\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/blackhub/bronline/game/core/utils/DateFormatter;", "", "()V", "DD_MMMM", "", "DD_MM_YYYY", "DD_MM_YYYY_HH_MM", "D_MMMM_YYYY", "ISO_8601_Z", DateFormatter.MMMM, "YYYY_MM_DD", "ruLocale", "Ljava/util/Locale;", "MMMMFormat", "millsInSecond", "", "ddMMMMFormat", "ddMMMMyyyyFormat", "ddMMyyyyFormat", "formatToDate", "pattern", "formatToDdMonthYYYY", "getDayDiff", "", "date", "(Ljava/lang/String;)Ljava/lang/Integer;", "isDate", "", "dateText", "iso8601ToDdMMyyyy", "isoDate", "iso8601ToDdMMyyyyZZZZ", "(Ljava/lang/String;)Ljava/lang/Long;", "mmssFormat", "parseIso8601ToLong", "parseToLong", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Long;", "yyyyMMddWithDashesFormat", "millis", "transformDateFormat", "patterFrom", "patterTo", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDateFormatter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateFormatter.kt\ncom/blackhub/bronline/game/core/utils/DateFormatter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n1#2:118\n*E\n"})
/* loaded from: classes3.dex */
public final class DateFormatter {

    @NotNull
    public static final String DD_MMMM = "dd MMMM";

    @NotNull
    public static final String DD_MM_YYYY = "dd.MM.yyyy";

    @NotNull
    public static final String DD_MM_YYYY_HH_MM = "dd.MM.yyyy HH:mm";

    @NotNull
    public static final String D_MMMM_YYYY = "d MMMM yyyy";

    @NotNull
    public static final String ISO_8601_Z = "yyyy-MM-dd'T'HH:mm:ssZZZZ";

    @NotNull
    public static final String MMMM = "MMMM";

    @NotNull
    public static final String YYYY_MM_DD = "yyyy-MM-dd";

    @NotNull
    public static final DateFormatter INSTANCE = new DateFormatter();

    @NotNull
    public static final Locale ruLocale = new Locale("ru", "RU");
    public static final int $stable = 8;

    @NotNull
    public final String ddMMyyyyFormat(long millsInSecond) {
        String format = new SimpleDateFormat(DD_MM_YYYY, ruLocale).format(new Date(millsInSecond));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    @NotNull
    public final String mmssFormat(long millsInSecond) {
        String format = new SimpleDateFormat("mm:ss", ruLocale).format(new Date(millsInSecond));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    @NotNull
    public final String ddMMMMFormat(long millsInSecond) {
        String format = new SimpleDateFormat(DD_MMMM, ruLocale).format(new Date(millsInSecond));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    @NotNull
    public final String MMMMFormat(long millsInSecond) {
        String format = new SimpleDateFormat(MMMM, ruLocale).format(new Date(millsInSecond));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    @NotNull
    public final String ddMMMMyyyyFormat(long millsInSecond) {
        String format = new SimpleDateFormat("dd MMMM yyyy", ruLocale).format(new Date(millsInSecond));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    @NotNull
    public final String yyyyMMddWithDashesFormat(long millis) {
        try {
            String format = new SimpleDateFormat("yyyy-MM-dd", ruLocale).format(Long.valueOf(millis));
            Intrinsics.checkNotNull(format);
            return format;
        } catch (IllegalArgumentException e) {
            Log.e("TAG", "yyyyMMddWithDashesFormat: e " + e);
            return AnyExtensionKt.empty(this);
        }
    }

    @NotNull
    public final String iso8601ToDdMMyyyy(@NotNull String isoDate) {
        Intrinsics.checkNotNullParameter(isoDate, "isoDate");
        Long parseIso8601ToLong = parseIso8601ToLong(isoDate);
        String ddMMyyyyFormat = parseIso8601ToLong != null ? INSTANCE.ddMMyyyyFormat(parseIso8601ToLong.longValue()) : null;
        return ddMMyyyyFormat == null ? "" : ddMMyyyyFormat;
    }

    @Nullable
    public final Long iso8601ToDdMMyyyyZZZZ(@NotNull String isoDate) {
        Intrinsics.checkNotNullParameter(isoDate, "isoDate");
        try {
            Date parse = new SimpleDateFormat(ISO_8601_Z, ruLocale).parse(isoDate);
            if (parse != null) {
                return Long.valueOf(parse.getTime());
            }
            return null;
        } catch (ParseException unused) {
            return null;
        }
    }

    public final boolean isDate(@NotNull String dateText, @NotNull String pattern) {
        Intrinsics.checkNotNullParameter(dateText, "dateText");
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        try {
            new SimpleDateFormat(pattern, ruLocale).parse(dateText);
            return true;
        } catch (ParseException unused) {
            return false;
        }
    }

    @Nullable
    public final Integer getDayDiff(@NotNull String date) {
        Intrinsics.checkNotNullParameter(date, "date");
        Long iso8601ToDdMMyyyyZZZZ = INSTANCE.iso8601ToDdMMyyyyZZZZ(date);
        if (iso8601ToDdMMyyyyZZZZ == null) {
            return null;
        }
        long longValue = iso8601ToDdMMyyyyZZZZ.longValue();
        return Integer.valueOf((int) Math.abs(DateExtensionKt.getStartOfTheDayByTimestamp(longValue) - DateExtensionKt.getStartOfTheDayByTimestamp(Calendar.getInstance().getTimeInMillis())));
    }

    @Nullable
    public final Long parseIso8601ToLong(@NotNull String isoDate) {
        Intrinsics.checkNotNullParameter(isoDate, "isoDate");
        return parseToLong(isoDate, ISO_8601_Z);
    }

    @NotNull
    public final String formatToDdMonthYYYY(long millsInSecond) {
        String format = new SimpleDateFormat("dd MMMM yyyy", ruLocale).format(Long.valueOf(millsInSecond));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    @Nullable
    public final Long parseToLong(@NotNull String date, @NotNull String pattern) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        try {
            Date parse = new SimpleDateFormat(pattern, ruLocale).parse(date);
            if (parse != null) {
                return Long.valueOf(parse.getTime());
            }
            return null;
        } catch (ParseException unused) {
            return null;
        }
    }

    @NotNull
    public final String formatToDate(long millsInSecond, @NotNull String pattern) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, ruLocale);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Europe/Moscow"));
        String format = simpleDateFormat.format(Long.valueOf(millsInSecond));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    @NotNull
    public final String transformDateFormat(@NotNull String str, @NotNull String patterFrom, @NotNull String patterTo) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(patterFrom, "patterFrom");
        Intrinsics.checkNotNullParameter(patterTo, "patterTo");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(patterTo, Locale.getDefault());
        Date parse = new SimpleDateFormat(patterFrom, Locale.getDefault()).parse(str);
        if (parse == null) {
            parse = new Date();
        }
        String format = simpleDateFormat.format(parse);
        return format == null ? "" : format;
    }
}
