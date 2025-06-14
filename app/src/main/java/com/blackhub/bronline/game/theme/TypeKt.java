package com.blackhub.bronline.game.theme;

import androidx.compose.material3.Typography;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.SystemFontFamily;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: Type.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Typography", "Landroidx/compose/material3/Typography;", "getTypography", "()Landroidx/compose/material3/Typography;", "app_siteRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TypeKt {

    @NotNull
    public static final Typography Typography;

    static {
        SystemFontFamily systemFontFamily = FontFamily.INSTANCE.getDefault();
        FontWeight normal = FontWeight.INSTANCE.getNormal();
        long j = 0;
        FontStyle fontStyle = null;
        FontSynthesis fontSynthesis = null;
        String str = null;
        BaselineShift baselineShift = null;
        TextGeometricTransform textGeometricTransform = null;
        LocaleList localeList = null;
        long j2 = 0;
        TextDecoration textDecoration = null;
        Shadow shadow = null;
        DrawStyle drawStyle = null;
        int i = 0;
        int i2 = 0;
        Typography = new Typography(null, null, null, null, null, null, null, null, null, new TextStyle(j, TextUnitKt.getSp(16), normal, fontStyle, fontSynthesis, systemFontFamily, str, TextUnitKt.getSp(0.5d), baselineShift, textGeometricTransform, localeList, j2, textDecoration, shadow, drawStyle, i, i2, TextUnitKt.getSp(24), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null), null, null, null, null, null, 32255, null);
    }

    @NotNull
    public static final Typography getTypography() {
        return Typography;
    }
}
