package com.blackhub.bronline.game.common.resources;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.res.ColorResources_androidKt;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardModel;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: ColorResourceCompose.kt */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\bJ\u0015\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\bJ\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0014\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Lcom/blackhub/bronline/game/common/resources/ColorResourceCompose;", "", "()V", "getBPPrizeDialogButtonBgColor", "Landroidx/compose/ui/graphics/Color;", "ifGetAward", "", "getBPPrizeDialogButtonBgColor-XeAY9LY", "(ZLandroidx/compose/runtime/Composer;I)J", "getBPPrizeDialogButtonTextColor", "getBPPrizeDialogButtonTextColor-XeAY9LY", "getBPPrizeDialogTitleBgColor", "getBPPrizeDialogTitleBgColor-XeAY9LY", "getCalendarPrizeItemColor", "Landroidx/compose/ui/graphics/Brush;", "prizeItem", "Lcom/blackhub/bronline/game/core/utils/attachment/reward/CommonRewardModel;", "(Lcom/blackhub/bronline/game/core/utils/attachment/reward/CommonRewardModel;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Brush;", "getGiftsPurchaseGiftBrushColor", "isStandard", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Brush;", "getGiftsPurchaseGiftButtonBgColor", "getGiftsPurchaseGiftButtonBgColor-XeAY9LY", "getGiftsPurchaseGiftTitleBgColor", "app_siteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ColorResourceCompose {
    public static final int $stable = 0;

    @NotNull
    public static final ColorResourceCompose INSTANCE = new ColorResourceCompose();

    @Composable
    /* renamed from: getBPPrizeDialogButtonBgColor-XeAY9LY, reason: not valid java name */
    public final long m6828getBPPrizeDialogButtonBgColorXeAY9LY(boolean z, @Nullable Composer composer, int i) {
        long colorResource;
        composer.startReplaceableGroup(1769402467);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1769402467, i, -1, "com.blackhub.bronline.game.common.resources.ColorResourceCompose.getBPPrizeDialogButtonBgColor (ColorResourceCompose.kt:10)");
        }
        if (z) {
            composer.startReplaceableGroup(-2040936588);
            colorResource = ColorResources_androidKt.colorResource(R.color.yellow, composer, 6);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-2040936532);
            colorResource = ColorResources_androidKt.colorResource(R.color.red, composer, 6);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return colorResource;
    }

    @Composable
    /* renamed from: getBPPrizeDialogButtonTextColor-XeAY9LY, reason: not valid java name */
    public final long m6829getBPPrizeDialogButtonTextColorXeAY9LY(boolean z, @Nullable Composer composer, int i) {
        long colorResource;
        composer.startReplaceableGroup(-1293087749);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1293087749, i, -1, "com.blackhub.bronline.game.common.resources.ColorResourceCompose.getBPPrizeDialogButtonTextColor (ColorResourceCompose.kt:17)");
        }
        if (z) {
            composer.startReplaceableGroup(-1614397980);
            colorResource = ColorResources_androidKt.colorResource(R.color.total_black, composer, 6);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1614397919);
            colorResource = ColorResources_androidKt.colorResource(R.color.white, composer, 6);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return colorResource;
    }

    @Composable
    /* renamed from: getBPPrizeDialogTitleBgColor-XeAY9LY, reason: not valid java name */
    public final long m6830getBPPrizeDialogTitleBgColorXeAY9LY(boolean z, @Nullable Composer composer, int i) {
        long colorResource;
        composer.startReplaceableGroup(2130340933);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2130340933, i, -1, "com.blackhub.bronline.game.common.resources.ColorResourceCompose.getBPPrizeDialogTitleBgColor (ColorResourceCompose.kt:24)");
        }
        if (z) {
            composer.startReplaceableGroup(1165810216);
            colorResource = ColorResources_androidKt.colorResource(R.color.red, composer, 6);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1165810269);
            colorResource = ColorResources_androidKt.colorResource(R.color.yellow, composer, 6);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return colorResource;
    }

    @Composable
    @NotNull
    public final Brush getGiftsPurchaseGiftBrushColor(boolean z, @Nullable Composer composer, int i) {
        Brush m3730radialGradientP_VxKs$default;
        composer.startReplaceableGroup(-1236865721);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1236865721, i, -1, "com.blackhub.bronline.game.common.resources.ColorResourceCompose.getGiftsPurchaseGiftBrushColor (ColorResourceCompose.kt:31)");
        }
        if (z) {
            composer.startReplaceableGroup(-519866966);
            m3730radialGradientP_VxKs$default = Brush.Companion.m3730radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m3767boximpl(ColorResources_androidKt.colorResource(R.color.dark_medium_green, composer, 6)), Color.m3767boximpl(ColorResources_androidKt.colorResource(2131100871, composer, 6))}), 0L, 0.0f, 0, 14, (Object) null);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-519866760);
            m3730radialGradientP_VxKs$default = Brush.Companion.m3730radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m3767boximpl(ColorResources_androidKt.colorResource(R.color.yellow_orange, composer, 6)), Color.m3767boximpl(ColorResources_androidKt.colorResource(2131100871, composer, 6))}), 0L, 0.0f, 0, 14, (Object) null);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m3730radialGradientP_VxKs$default;
    }

    @Composable
    @NotNull
    public final Brush getGiftsPurchaseGiftTitleBgColor(boolean z, @Nullable Composer composer, int i) {
        Brush m3734verticalGradient8A3gB4$default;
        composer.startReplaceableGroup(733765348);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(733765348, i, -1, "com.blackhub.bronline.game.common.resources.ColorResourceCompose.getGiftsPurchaseGiftTitleBgColor (ColorResourceCompose.kt:48)");
        }
        if (z) {
            composer.startReplaceableGroup(-651802207);
            m3734verticalGradient8A3gB4$default = Brush.Companion.m3734verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m3767boximpl(ColorResources_androidKt.colorResource(R.color.dark_medium_green, composer, 6)), Color.m3767boximpl(ColorResources_androidKt.colorResource(R.color.dark_medium_green, composer, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-651801993);
            m3734verticalGradient8A3gB4$default = Brush.Companion.m3734verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m3767boximpl(ColorResources_androidKt.colorResource(R.color.yellow, composer, 6)), Color.m3767boximpl(ColorResources_androidKt.colorResource(R.color.yellow_orange, composer, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m3734verticalGradient8A3gB4$default;
    }

    @Composable
    /* renamed from: getGiftsPurchaseGiftButtonBgColor-XeAY9LY, reason: not valid java name */
    public final long m6831getGiftsPurchaseGiftButtonBgColorXeAY9LY(boolean z, @Nullable Composer composer, int i) {
        long colorResource;
        composer.startReplaceableGroup(1226572699);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1226572699, i, -1, "com.blackhub.bronline.game.common.resources.ColorResourceCompose.getGiftsPurchaseGiftButtonBgColor (ColorResourceCompose.kt:65)");
        }
        if (z) {
            composer.startReplaceableGroup(1742600197);
            colorResource = ColorResources_androidKt.colorResource(R.color.dark_medium_green, composer, 6);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1742600264);
            colorResource = ColorResources_androidKt.colorResource(R.color.yellow_orange, composer, 6);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return colorResource;
    }

    @Composable
    @NotNull
    public final Brush getCalendarPrizeItemColor(@NotNull CommonRewardModel prizeItem, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(prizeItem, "prizeItem");
        composer.startReplaceableGroup(-1347652835);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1347652835, i, -1, "com.blackhub.bronline.game.common.resources.ColorResourceCompose.getCalendarPrizeItemColor (ColorResourceCompose.kt:74)");
        }
        Brush m3734verticalGradient8A3gB4$default = Brush.Companion.m3734verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m3767boximpl(ColorResources_androidKt.colorResource(R.color.total_black, composer, 6)), Color.m3767boximpl(ColorResources_androidKt.colorResource(prizeItem.getColorIdForPrizeItem(), composer, 0))}), 0.0f, 0.0f, 0, 14, (Object) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m3734verticalGradient8A3gB4$default;
    }
}
