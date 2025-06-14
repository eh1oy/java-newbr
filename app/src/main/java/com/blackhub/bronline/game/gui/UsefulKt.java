package com.blackhub.bronline.game.gui;

import android.annotation.SuppressLint;
import android.text.Html;
import android.text.Spanned;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.lifecycle.Lifecycle;
import androidx.media3.extractor.text.webvtt.WebvttCssParser;
import com.caverock.androidsvg.SVG;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: Useful.kt */
@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0010\u0010\u0004\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u001a\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u001a\u0010\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u001a\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013\u001a\u0016\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018\u001a\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u001aH\u0007\u001a\u0010\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001¨\u0006\u001e"}, d2 = {"getPriceWithDot", "", "number", "", "getPriceWithSpaces", "getTextLength", "", "textView", "Landroid/widget/TextView;", "hideSystemUI", "", SVG.View.NODE_NAME, "Landroid/view/View;", "hideSystemUIWindow", "window", "Landroid/view/Window;", "isActivityValid", "", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "Landroidx/activity/ComponentActivity;", "isValidCharField", "inputChar", "", "validationChars", "", "setCustomTouchInterceptor", "Landroid/widget/PopupWindow;", "transformColors", "Landroid/text/Spanned;", "str", "app_siteRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUseful.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Useful.kt\ncom/blackhub/bronline/game/gui/UsefulKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,360:1\n13365#2,2:361\n*S KotlinDebug\n*F\n+ 1 Useful.kt\ncom/blackhub/bronline/game/gui/UsefulKt\n*L\n346#1:361,2\n*E\n"})
/* loaded from: classes3.dex */
public final class UsefulKt {
    @NotNull
    public static final String getPriceWithSpaces(@Nullable Number number) {
        if (number == null) {
            number = 0;
        }
        String format = new DecimalFormat("#,###,###", new DecimalFormatSymbols(Locale.getDefault())).format(number);
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    @NotNull
    public static final String getPriceWithDot(@NotNull Number number) {
        Intrinsics.checkNotNullParameter(number, "number");
        DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormatSymbols.setGroupingSeparator('.');
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        return decimalFormat.format(number).toString();
    }

    @NotNull
    public static final Spanned transformColors(@Nullable String str) {
        int i;
        if (str == null) {
            str = "random text";
        }
        LinkedList linkedList = new LinkedList();
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (i3 != str.length() && str.charAt(i3) == '{' && (i = i3 + 7) < str.length()) {
                String str2 = new String() + "#";
                int i4 = i3 + 1;
                String substring = str.substring(i4, i);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                linkedList.addLast(str2 + substring);
                String substring2 = str.substring(0, i4);
                Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                String substring3 = str.substring(i, str.length());
                Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
                str = substring2 + "repl" + i2 + substring3;
                i2++;
            }
        }
        Iterator it = linkedList.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (i5 == 0) {
                String quote = Pattern.quote(new String() + "{repl" + i5 + WebvttCssParser.RULE_END);
                Intrinsics.checkNotNullExpressionValue(quote, "quote(...)");
                str = new Regex(quote).replace(str, "<font color='" + str3 + "'>");
            } else {
                String quote2 = Pattern.quote(new String() + "{repl" + i5 + WebvttCssParser.RULE_END);
                Intrinsics.checkNotNullExpressionValue(quote2, "quote(...)");
                str = new Regex(quote2).replace(str, "</font><font color='" + str3 + "'>");
            }
            i5++;
        }
        if (linkedList.size() >= 1) {
            str = str + "</font>";
        }
        String quote3 = Pattern.quote(StringUtils.LF);
        Intrinsics.checkNotNullExpressionValue(quote3, "quote(...)");
        Spanned fromHtml = Html.fromHtml(new Regex(quote3).replace(str, "<br>"), 0);
        Intrinsics.checkNotNull(fromHtml);
        return fromHtml;
    }

    public static final int getTextLength(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(textView.getTextSize());
        textPaint.setTypeface(textView.getTypeface());
        return (int) textPaint.measureText(textView.getText().toString());
    }

    public static final void hideSystemUIWindow(@Nullable Window window) {
        hideSystemUI(window != null ? window.getDecorView() : null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
    
        r2 = r2.getWindowInsetsController();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void hideSystemUI(@org.jetbrains.annotations.Nullable android.view.View r2) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L20
            if (r2 == 0) goto L28
            android.view.WindowInsetsController r2 = androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$$ExternalSyntheticApiModelOutline2.m(r2)
            if (r2 == 0) goto L28
            int r0 = androidx.core.view.WindowInsetsCompat$TypeImpl30$$ExternalSyntheticApiModelOutline0.m()
            int r1 = androidx.core.view.WindowInsetsCompat$TypeImpl30$$ExternalSyntheticApiModelOutline1.m()
            r0 = r0 | r1
            int r1 = com.blackhub.bronline.game.gui.UsefulKt$$ExternalSyntheticApiModelOutline0.m()
            r0 = r0 | r1
            androidx.core.view.SoftwareKeyboardControllerCompat$Impl30$$ExternalSyntheticApiModelOutline4.m(r2, r0)
            goto L28
        L20:
            if (r2 != 0) goto L23
            goto L28
        L23:
            r0 = 7942(0x1f06, float:1.1129E-41)
            r2.setSystemUiVisibility(r0)
        L28:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.UsefulKt.hideSystemUI(android.view.View):void");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public static final void setCustomTouchInterceptor(@NotNull PopupWindow window) {
        Intrinsics.checkNotNullParameter(window, "window");
        window.setTouchInterceptor(new View.OnTouchListener() { // from class: com.blackhub.bronline.game.gui.UsefulKt$$ExternalSyntheticLambda1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean customTouchInterceptor$lambda$1;
                customTouchInterceptor$lambda$1 = UsefulKt.setCustomTouchInterceptor$lambda$1(view, motionEvent);
                return customTouchInterceptor$lambda$1;
            }
        });
    }

    public static final boolean setCustomTouchInterceptor$lambda$1(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            return motionEvent.getX() < 0.0f || motionEvent.getX() > ((float) view.getWidth()) || motionEvent.getY() < 0.0f || motionEvent.getY() > ((float) view.getHeight());
        }
        return false;
    }

    public static final boolean isActivityValid(@NotNull ComponentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return !activity.isFinishing() && !activity.isDestroyed() && activity.getLifecycle().getState().isAtLeast(Lifecycle.State.STARTED) && activity.getWindow().getDecorView().getWindowVisibility() == 0;
    }

    public static final boolean isValidCharField(char c, @NotNull char[] validationChars) {
        Intrinsics.checkNotNullParameter(validationChars, "validationChars");
        boolean z = false;
        for (char c2 : validationChars) {
            if (c == c2) {
                z = true;
            }
        }
        return z;
    }
}
