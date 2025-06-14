package com.blackhub.bronline.game.core.extension;

import android.text.Html;
import android.text.Spanned;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.AnnotatedString;
import com.blackhub.bronline.game.core.constants.FilePrefix;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.utils.DateFormatter;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.apache.http.client.utils.URLEncodedUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: StringExtension.kt */
@Metadata(d1 = {"\u0000n\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001a\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t\u001a\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t\u001a\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000b\u001a\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tH\u0002\u001a\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tH\u0002\u001a\u0018\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u001a\u001a\u0010\u0013\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017\u001a\n\u0010\u0018\u001a\u00020\u0005*\u00020\u0005\u001a\u0014\u0010\u0019\u001a\u00020\u0005*\u0004\u0018\u00010\u00052\u0006\u0010\u001a\u001a\u00020\u001b\u001a\u001e\u0010\u001c\u001a\u00020\u001d*\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00172\b\b\u0002\u0010\u001f\u001a\u00020\u0017\u001a\n\u0010 \u001a\u00020!*\u00020\u0005\u001a\n\u0010\"\u001a\u00020#*\u00020\u0005\u001a\f\u0010$\u001a\u00020\t*\u0004\u0018\u00010\u0005\u001a\f\u0010%\u001a\u00020\t*\u0004\u0018\u00010\u0005\u001a\n\u0010&\u001a\u00020\u000b*\u00020\u0005\u001a\n\u0010'\u001a\u00020\u0005*\u00020\u0005\u001a\n\u0010(\u001a\u00020\u0005*\u00020\u0005\u001a\n\u0010)\u001a\u00020**\u00020\u0005\u001a\n\u0010+\u001a\u00020\u000b*\u00020\u0005\u001a\f\u0010,\u001a\u00020\u0005*\u0004\u0018\u00010\u0005\u001a\f\u0010-\u001a\u00020**\u0004\u0018\u00010\u0005\u001a\f\u0010.\u001a\u00020**\u0004\u0018\u00010\u0005\u001a\n\u0010/\u001a\u00020**\u00020\u0005\u001a\n\u00100\u001a\u00020\u0005*\u00020\u0005\u001a\f\u00101\u001a\u00020\u0007*\u0004\u0018\u00010\u0005\u001a\n\u00102\u001a\u00020\u0005*\u00020\u0005\u001a\n\u00103\u001a\u00020\u0017*\u00020\u0005\u001a\n\u00104\u001a\u00020\u000b*\u00020\u0005\u001a \u00105\u001a\u000206*\u00020\u00052\n\b\u0002\u00107\u001a\u0004\u0018\u000106ø\u0001\u0000¢\u0006\u0004\b8\u00109\u001a\n\u0010:\u001a\u00020\t*\u00020\u0005\u001a\n\u0010;\u001a\u00020\t*\u00020\u0005\"\u0017\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006<"}, d2 = {"orEmpty", "", "getOrEmpty", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "formatMoneyAmount", "", "amount", "", "isDecimal", "", "divByHundred", "", "formatMoneyDropZeros", "getBalanceFormatWithComma", "Ljava/text/DecimalFormat;", "getBalanceFormatWithDot", "getDecimalFormat", "symbols", "Ljava/text/DecimalFormatSymbols;", "addCharAtIndex", "char", "", FirebaseAnalytics.Param.INDEX, "", "capitalizeWords", "formattedUnit", "value", "", "getImageTypePathInCDN", "Lcom/blackhub/bronline/game/core/enums/ImageTypePathInCDNEnum;", "rewardType", "internalId", "htmlStringToSpanned", "Landroid/text/Spanned;", "htmlTextToAnnotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "isNotValid", "isValid", "parseDateToLongWithPattern", "removeAfterFirstDot", "removeAllSpace", "removeAllSpaceToDouble", "", "removeAllSpaceToLong", "splitLinkForYouTubeVideoId", "toDoubleAmount", "toDoubleOrZero", "toDoubleOrZeroIfEmpty", "toFilterKey", "toFloatOrZero", "toFormatNumber", "toIntOrZero", "toLongOrZero", "tryToColorInt", "Landroidx/compose/ui/graphics/Color;", "defaultColor", "tryToColorInt-0Yiz4hI", "(Ljava/lang/String;Landroidx/compose/ui/graphics/Color;)J", "validateEmail", "validateNickName", "app_siteRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStringExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringExtension.kt\ncom/blackhub/bronline/game/core/extension/StringExtensionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,246:1\n1#2:247\n470#3:248\n*S KotlinDebug\n*F\n+ 1 StringExtension.kt\ncom/blackhub/bronline/game/core/extension/StringExtensionKt\n*L\n222#1:248\n*E\n"})
/* loaded from: classes3.dex */
public final class StringExtensionKt {
    @NotNull
    public static final CharSequence getOrEmpty(@Nullable CharSequence charSequence) {
        return charSequence == null ? "" : charSequence;
    }

    @NotNull
    public static final String formattedUnit(@Nullable String str, @NotNull Number value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value + " " + ((Object) getOrEmpty(str));
    }

    public static final int toIntOrZero(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(str);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return 0;
    }

    public static final long toLongOrZero(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Long longOrNull = StringsKt__StringNumberConversionsKt.toLongOrNull(str);
        if (longOrNull != null) {
            return longOrNull.longValue();
        }
        return 0L;
    }

    public static final double toDoubleOrZero(@Nullable String str) {
        Double doubleOrNull;
        if (str == null || (doubleOrNull = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(str)) == null) {
            return 0.0d;
        }
        return doubleOrNull.doubleValue();
    }

    public static final float toFloatOrZero(@Nullable String str) {
        Float floatOrNull;
        if (str == null || (floatOrNull = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(str)) == null) {
            return 0.0f;
        }
        return floatOrNull.floatValue();
    }

    @NotNull
    public static final String removeAllSpace(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new Regex("\\s").replace(str, "");
    }

    public static final long removeAllSpaceToLong(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Long.parseLong(removeAllSpace(str));
    }

    public static final double removeAllSpaceToDouble(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Double.parseDouble(removeAllSpace(StringsKt__StringsJVMKt.replace$default(str, ",", ".", false, 4, (Object) null)));
    }

    @NotNull
    public static final String removeAfterFirstDot(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, '.', 0, false, 6, (Object) null);
        if (indexOf$default == -1) {
            return str;
        }
        String substring = str.substring(0, indexOf$default);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    @NotNull
    public static final String addCharAtIndex(@NotNull String str, char c, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            StringBuilder sb = new StringBuilder(str);
            sb.insert(i, c);
            str = sb.toString();
        } catch (IndexOutOfBoundsException unused) {
        }
        Intrinsics.checkNotNull(str);
        return str;
    }

    public static final double toDoubleAmount(@Nullable String str) {
        if (str == null) {
            str = "";
        }
        List split$default = StringsKt__StringsKt.split$default((CharSequence) str, new char[]{'.'}, false, 0, 6, (Object) null);
        if (split$default.size() == 2) {
            return toDoubleOrZero((String) split$default.get(0)) + (toDoubleOrZero((String) split$default.get(1)) / 100);
        }
        return toDoubleOrZero(str);
    }

    public static final DecimalFormat getBalanceFormatWithDot(boolean z) {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setGroupingSeparator(' ');
        decimalFormatSymbols.setDecimalSeparator('.');
        return getDecimalFormat(z, decimalFormatSymbols);
    }

    public static final DecimalFormat getBalanceFormatWithComma(boolean z) {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setGroupingSeparator(' ');
        decimalFormatSymbols.setDecimalSeparator(',');
        return getDecimalFormat(z, decimalFormatSymbols);
    }

    public static final DecimalFormat getDecimalFormat(boolean z, DecimalFormatSymbols decimalFormatSymbols) {
        if (z) {
            return new DecimalFormat("###,##0.00", decimalFormatSymbols);
        }
        return new DecimalFormat("###,###", decimalFormatSymbols);
    }

    public static final double toDoubleOrZeroIfEmpty(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0) {
            return 0.0d;
        }
        return Double.parseDouble(str);
    }

    @NotNull
    public static final String toFilterKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return "filter[" + str + "]";
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
    
        if ((!kotlin.text.StringsKt__StringsJVMKt.isBlank(r1)) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean isValid(@org.jetbrains.annotations.Nullable java.lang.String r1) {
        /*
            if (r1 == 0) goto L17
            int r0 = r1.length()
            if (r0 <= 0) goto L11
            boolean r1 = kotlin.text.StringsKt__StringsJVMKt.isBlank(r1)
            r0 = 1
            r1 = r1 ^ r0
            if (r1 == 0) goto L11
            goto L12
        L11:
            r0 = 0
        L12:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            goto L18
        L17:
            r1 = 0
        L18:
            boolean r1 = com.blackhub.bronline.game.core.extension.BooleanExtensionKt.getOrFalse(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.core.extension.StringExtensionKt.isValid(java.lang.String):boolean");
    }

    public static final boolean isNotValid(@Nullable String str) {
        return !isValid(str);
    }

    @NotNull
    public static final String capitalizeWords(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return CollectionsKt___CollectionsKt.joinToString$default(new Regex("\\s+").split(str, 0), " ", null, null, 0, null, StringExtensionKt$capitalizeWords$1.INSTANCE, 30, null);
    }

    @NotNull
    public static final String toFormatNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return new Regex("(\\d)(\\d{3})(\\d{3})(\\d{2})(\\d{2})").replace(str, "+$1 $2 $3 $4 $5");
        } catch (RuntimeException unused) {
            return AnyExtensionKt.empty(str);
        }
    }

    public static final boolean validateEmail(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Pattern compile = Pattern.compile("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,64}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+");
        Intrinsics.checkNotNullExpressionValue(compile, "compile(...)");
        return compile.matcher(str).matches() && StringsKt__StringsKt.substringAfter$default(str, "@", (String) null, 2, (Object) null).length() <= 255;
    }

    public static final boolean validateNickName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Pattern compile = Pattern.compile("[a-zA-Z0-9\\+\\!\\#\\.\\,\\_\\%\\-\\$\\€\\^\\+\\&\\*\\(\\)\\~\\?\\:\\;\\/\\']{1,50}+");
        Intrinsics.checkNotNullExpressionValue(compile, "compile(...)");
        return compile.matcher(str).matches();
    }

    public static final long parseDateToLongWithPattern(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return LongExtensionKt.getOrZero(DateFormatter.INSTANCE.parseToLong(str, DateFormatter.DD_MM_YYYY));
    }

    @NotNull
    public static final String splitLinkForYouTubeVideoId(@Nullable String str) {
        String empty;
        if (str != null) {
            if (str.length() > 0 && StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) URLEncodedUtils.NAME_VALUE_SEPARATOR, false, 2, (Object) null)) {
                empty = (String) StringsKt__StringsKt.split$default((CharSequence) str, new String[]{URLEncodedUtils.NAME_VALUE_SEPARATOR}, false, 0, 6, (Object) null).get(1);
            } else {
                empty = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
            }
            if (empty != null) {
                return empty;
            }
        }
        return AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
    }

    @NotNull
    public static final String formatMoneyDropZeros(long j) {
        String format = getBalanceFormatWithDot(!DoubleExtensionKt.isDecimal(Double.valueOf(r2))).format(j / 100);
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public static /* synthetic */ String formatMoneyAmount$default(long j, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        return formatMoneyAmount(j, z, z2);
    }

    @NotNull
    public static final String formatMoneyAmount(long j, boolean z, boolean z2) {
        String format = getBalanceFormatWithDot(z).format(j / (z2 ? 100 : 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public static /* synthetic */ String formatMoneyAmount$default(float f, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        return formatMoneyAmount(f, z, z2);
    }

    @NotNull
    public static final String formatMoneyAmount(float f, boolean z, boolean z2) {
        String format = getBalanceFormatWithDot(z).format(Float.valueOf(f / (z2 ? 100 : 1)));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    @NotNull
    public static final String formatMoneyAmount(float f) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%,.0f ₽", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    @NotNull
    public static final Spanned htmlStringToSpanned(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Spanned fromHtml = Html.fromHtml(str, 0);
        Intrinsics.checkNotNull(fromHtml);
        return fromHtml;
    }

    @NotNull
    public static final AnnotatedString htmlTextToAnnotatedString(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return ComposeExtensionKt.toAnnotatedString(htmlStringToSpanned(str));
    }

    /* renamed from: tryToColorInt-0Yiz4hI$default */
    public static /* synthetic */ long m6851tryToColorInt0Yiz4hI$default(String str, Color color, int i, Object obj) {
        if ((i & 1) != 0) {
            color = null;
        }
        return m6850tryToColorInt0Yiz4hI(str, color);
    }

    public static /* synthetic */ ImageTypePathInCDNEnum getImageTypePathInCDN$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return getImageTypePathInCDN(str, i, i2);
    }

    @NotNull
    public static final ImageTypePathInCDNEnum getImageTypePathInCDN(@NotNull String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (StringsKt__StringsJVMKt.startsWith$default(str, FilePrefix.IC_PREFIX, false, 2, null)) {
            return ImageTypePathInCDNEnum.ICON;
        }
        if (StringsKt__StringsJVMKt.startsWith$default(str, FilePrefix.BG_PREFIX, false, 2, null)) {
            return ImageTypePathInCDNEnum.BACKGROUND;
        }
        if (i == 5) {
            return ImageTypePathInCDNEnum.VEHICLE;
        }
        if (i != 11) {
            return ImageTypePathInCDNEnum.IMAGE;
        }
        if (i2 == 134) {
            return ImageTypePathInCDNEnum.SKIN;
        }
        return ImageTypePathInCDNEnum.ACCESSORY;
    }

    /* renamed from: tryToColorInt-0Yiz4hI */
    public static final long m6850tryToColorInt0Yiz4hI(@NotNull String tryToColorInt, @Nullable Color color) {
        Intrinsics.checkNotNullParameter(tryToColorInt, "$this$tryToColorInt");
        try {
            return ColorKt.Color(android.graphics.Color.parseColor(tryToColorInt));
        } catch (Exception unused) {
            return color != null ? color.m3787unboximpl() : Color.INSTANCE.m3814getWhite0d7_KjU();
        }
    }
}
