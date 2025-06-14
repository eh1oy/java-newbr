package com.blackhub.bronline.game.core.extension;

import android.annotation.SuppressLint;
import android.content.res.Configuration;
import android.graphics.BlurMaskFilter;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.StampedPathEffectStyle;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ComposeExtension.kt */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a&\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a&\u0010\u0007\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001aN\u0010\b\u001a\u00020\t*\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0016\u0010\u0015\u001a\u00020\r*\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a$\u0010\u0018\u001a\u00020\t*\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\u00022\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0007\u001a\u0011\u0010\u001b\u001a\u00020\u000f*\u00020\u001cH\u0007¢\u0006\u0002\u0010\u001d\u001ad\u0010\u001e\u001a\u00020\t*\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010 \u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010!\u001a\u00020\u000f2\b\b\u0002\u0010\"\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a<\u0010%\u001a\u00020\t*\u00020\t2\b\b\u0002\u0010&\u001a\u00020\u00022\b\b\u0002\u0010'\u001a\u00020\u00022\b\b\u0002\u0010(\u001a\u00020\u001c2\b\b\u0002\u0010)\u001a\u00020\r2\b\b\u0002\u0010*\u001a\u00020\u001c\u001a,\u0010+\u001a\u00020\t*\u00020\t2\u0006\u0010,\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b.\u0010/\u001a\n\u00100\u001a\u000201*\u000202\u001a\u0011\u00103\u001a\u00020\u000f*\u00020\u001cH\u0007¢\u0006\u0002\u0010\u001d\u001a\u0011\u00104\u001a\u00020\u000f*\u00020\u001cH\u0007¢\u0006\u0002\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"IfFalse", "", "", "func", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Boolean;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "IfTrue", "coloredShadow", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "alpha", "", "borderRadius", "Landroidx/compose/ui/unit/Dp;", "shadowRadius", "offsetY", "offsetX", "coloredShadow-PRYyx80", "(Landroidx/compose/ui/Modifier;JFFFFF)Landroidx/compose/ui/Modifier;", "dpToPx", "dpToPx-8Feqmps", "(FLandroidx/compose/runtime/Composer;I)F", "noRippleClickable", "isEnable", "onClick", "pxToDp", "", "(ILandroidx/compose/runtime/Composer;I)F", "shadow", "transparency", "blurRadius", "spread", "modifier", "shadow-o6VuwKU", "(Landroidx/compose/ui/Modifier;JFFFFFFLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "shimmerLoadingAnimation", "isShowShimmer", "isLightModeActive", "widthOfShadowBrush", "angleOfAxisY", "durationMillis", "stampedBorder", "strokeWidth", "cornerRadiusDp", "stampedBorder-aa2Vgzc", "(Landroidx/compose/ui/Modifier;FJF)Landroidx/compose/ui/Modifier;", "toAnnotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "Landroid/text/Spanned;", "toHorizontalPercentDp", "toVerticalPercentSwDp", "app_siteRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComposeExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeExtension.kt\ncom/blackhub/bronline/game/core/extension/ComposeExtensionKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,321:1\n74#2:322\n74#2:324\n74#2:337\n74#2:341\n1#3:323\n1099#4:325\n13309#5,2:326\n154#6:328\n154#6:329\n154#6:330\n154#6:331\n154#6:332\n154#6:333\n154#6:334\n154#6:335\n154#6:336\n154#6:338\n154#6:342\n92#7:339\n75#7:340\n92#7:343\n75#7:344\n*S KotlinDebug\n*F\n+ 1 ComposeExtension.kt\ncom/blackhub/bronline/game/core/extension/ComposeExtensionKt\n*L\n52#1:322\n55#1:324\n229#1:337\n239#1:341\n57#1:325\n60#1:326,2\n130#1:328\n131#1:329\n132#1:330\n133#1:331\n166#1:332\n167#1:333\n168#1:334\n169#1:335\n170#1:336\n229#1:338\n239#1:342\n230#1:339\n230#1:340\n240#1:343\n240#1:344\n*E\n"})
/* loaded from: classes3.dex */
public final class ComposeExtensionKt {
    @Composable
    /* renamed from: dpToPx-8Feqmps */
    public static final float m6846dpToPx8Feqmps(float f, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-3840204);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-3840204, i, -1, "com.blackhub.bronline.game.core.extension.dpToPx (ComposeExtension.kt:51)");
        }
        float mo311toPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo311toPx0680j_4(f);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mo311toPx0680j_4;
    }

    @Composable
    public static final float pxToDp(int i, @Nullable Composer composer, int i2) {
        composer.startReplaceableGroup(-2002864317);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2002864317, i2, -1, "com.blackhub.bronline.game.core.extension.pxToDp (ComposeExtension.kt:54)");
        }
        float mo308toDpu2uoSUM = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo308toDpu2uoSUM(i);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mo308toDpu2uoSUM;
    }

    @NotNull
    /* renamed from: stampedBorder-aa2Vgzc */
    public static final Modifier m6849stampedBorderaa2Vgzc(@NotNull Modifier stampedBorder, float f, long j, float f2) {
        Intrinsics.checkNotNullParameter(stampedBorder, "$this$stampedBorder");
        return ComposedModifierKt.composed$default(stampedBorder, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.blackhub.bronline.game.core.extension.ComposeExtensionKt$stampedBorder$1
            public final /* synthetic */ long $color;
            public final /* synthetic */ float $cornerRadiusDp;
            public final /* synthetic */ float $strokeWidth;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ComposeExtensionKt$stampedBorder$1(float f3, float f22, long j2) {
                super(3);
                r1 = f3;
                r2 = f22;
                r3 = j2;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
                return invoke(modifier, composer, num.intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(882943718);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(882943718, i, -1, "com.blackhub.bronline.game.core.extension.stampedBorder.<anonymous> (ComposeExtension.kt:92)");
                }
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                float mo311toPx0680j_4 = density.mo311toPx0680j_4(r1);
                float mo311toPx0680j_42 = density.mo311toPx0680j_4(r2);
                Path Path = AndroidPath_androidKt.Path();
                Path.lineTo(20.0f, 0.0f);
                Path.lineTo(20.0f, 20.0f);
                Path.lineTo(0.0f, 20.0f);
                Path.close();
                Modifier then = composed.then(DrawModifierKt.drawWithCache(Modifier.INSTANCE, new Function1<CacheDrawScope, DrawResult>() { // from class: com.blackhub.bronline.game.core.extension.ComposeExtensionKt$stampedBorder$1.1
                    public final /* synthetic */ long $color;
                    public final /* synthetic */ float $cornerRadiusPx;
                    public final /* synthetic */ Path $square;
                    public final /* synthetic */ float $strokeWidthPx;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(float mo311toPx0680j_43, Path Path2, float mo311toPx0680j_422, long j2) {
                        super(1);
                        r1 = mo311toPx0680j_43;
                        r2 = Path2;
                        r3 = mo311toPx0680j_422;
                        r4 = j2;
                    }

                    /* compiled from: ComposeExtension.kt */
                    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: com.blackhub.bronline.game.core.extension.ComposeExtensionKt$stampedBorder$1$1$1 */
                    public static final class C00851 extends Lambda implements Function1<DrawScope, Unit> {
                        public final /* synthetic */ long $color;
                        public final /* synthetic */ float $cornerRadiusPx;
                        public final /* synthetic */ Path $square;
                        public final /* synthetic */ float $strokeWidthPx;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C00851(float f, Path path, float f2, long j) {
                            super(1);
                            r1 = f;
                            r2 = path;
                            r3 = f2;
                            r4 = j;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke */
                        public final void invoke2(@NotNull DrawScope onDrawBehind) {
                            Intrinsics.checkNotNullParameter(onDrawBehind, "$this$onDrawBehind");
                            Stroke stroke = new Stroke(r1, 0.0f, 0, 0, PathEffect.INSTANCE.m4051stampedPathEffect7aD1DOk(r2, 30.0f, 0.0f, StampedPathEffectStyle.INSTANCE.m4121getTranslateYpspkwk()), 14, null);
                            DrawScope.m4323drawRoundRectuAw5IA$default(onDrawBehind, r4, 0L, 0L, CornerRadiusKt.CornerRadius$default(r3, 0.0f, 2, null), stroke, 0.0f, null, 0, 230, null);
                        }
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final DrawResult invoke(@NotNull CacheDrawScope drawWithCache) {
                        Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
                        return drawWithCache.onDrawBehind(new Function1<DrawScope, Unit>() { // from class: com.blackhub.bronline.game.core.extension.ComposeExtensionKt.stampedBorder.1.1.1
                            public final /* synthetic */ long $color;
                            public final /* synthetic */ float $cornerRadiusPx;
                            public final /* synthetic */ Path $square;
                            public final /* synthetic */ float $strokeWidthPx;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public C00851(float f3, Path path, float f22, long j2) {
                                super(1);
                                r1 = f3;
                                r2 = path;
                                r3 = f22;
                                r4 = j2;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke */
                            public final void invoke2(@NotNull DrawScope onDrawBehind) {
                                Intrinsics.checkNotNullParameter(onDrawBehind, "$this$onDrawBehind");
                                Stroke stroke = new Stroke(r1, 0.0f, 0, 0, PathEffect.INSTANCE.m4051stampedPathEffect7aD1DOk(r2, 30.0f, 0.0f, StampedPathEffectStyle.INSTANCE.m4121getTranslateYpspkwk()), 14, null);
                                DrawScope.m4323drawRoundRectuAw5IA$default(onDrawBehind, r4, 0L, 0L, CornerRadiusKt.CornerRadius$default(r3, 0.0f, 2, null), stroke, 0.0f, null, 0, 230, null);
                            }
                        });
                    }
                }));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return then;
            }

            /* compiled from: ComposeExtension.kt */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/draw/CacheDrawScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.blackhub.bronline.game.core.extension.ComposeExtensionKt$stampedBorder$1$1 */
            public static final class AnonymousClass1 extends Lambda implements Function1<CacheDrawScope, DrawResult> {
                public final /* synthetic */ long $color;
                public final /* synthetic */ float $cornerRadiusPx;
                public final /* synthetic */ Path $square;
                public final /* synthetic */ float $strokeWidthPx;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(float mo311toPx0680j_43, Path Path2, float mo311toPx0680j_422, long j2) {
                    super(1);
                    r1 = mo311toPx0680j_43;
                    r2 = Path2;
                    r3 = mo311toPx0680j_422;
                    r4 = j2;
                }

                /* compiled from: ComposeExtension.kt */
                @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.blackhub.bronline.game.core.extension.ComposeExtensionKt$stampedBorder$1$1$1 */
                public static final class C00851 extends Lambda implements Function1<DrawScope, Unit> {
                    public final /* synthetic */ long $color;
                    public final /* synthetic */ float $cornerRadiusPx;
                    public final /* synthetic */ Path $square;
                    public final /* synthetic */ float $strokeWidthPx;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00851(float f3, Path path, float f22, long j2) {
                        super(1);
                        r1 = f3;
                        r2 = path;
                        r3 = f22;
                        r4 = j2;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke */
                    public final void invoke2(@NotNull DrawScope onDrawBehind) {
                        Intrinsics.checkNotNullParameter(onDrawBehind, "$this$onDrawBehind");
                        Stroke stroke = new Stroke(r1, 0.0f, 0, 0, PathEffect.INSTANCE.m4051stampedPathEffect7aD1DOk(r2, 30.0f, 0.0f, StampedPathEffectStyle.INSTANCE.m4121getTranslateYpspkwk()), 14, null);
                        DrawScope.m4323drawRoundRectuAw5IA$default(onDrawBehind, r4, 0L, 0L, CornerRadiusKt.CornerRadius$default(r3, 0.0f, 2, null), stroke, 0.0f, null, 0, 230, null);
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final DrawResult invoke(@NotNull CacheDrawScope drawWithCache) {
                    Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
                    return drawWithCache.onDrawBehind(new Function1<DrawScope, Unit>() { // from class: com.blackhub.bronline.game.core.extension.ComposeExtensionKt.stampedBorder.1.1.1
                        public final /* synthetic */ long $color;
                        public final /* synthetic */ float $cornerRadiusPx;
                        public final /* synthetic */ Path $square;
                        public final /* synthetic */ float $strokeWidthPx;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C00851(float f3, Path path, float f22, long j2) {
                            super(1);
                            r1 = f3;
                            r2 = path;
                            r3 = f22;
                            r4 = j2;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke */
                        public final void invoke2(@NotNull DrawScope onDrawBehind) {
                            Intrinsics.checkNotNullParameter(onDrawBehind, "$this$onDrawBehind");
                            Stroke stroke = new Stroke(r1, 0.0f, 0, 0, PathEffect.INSTANCE.m4051stampedPathEffect7aD1DOk(r2, 30.0f, 0.0f, StampedPathEffectStyle.INSTANCE.m4121getTranslateYpspkwk()), 14, null);
                            DrawScope.m4323drawRoundRectuAw5IA$default(onDrawBehind, r4, 0L, 0L, CornerRadiusKt.CornerRadius$default(r3, 0.0f, 2, null), stroke, 0.0f, null, 0, 230, null);
                        }
                    });
                }
            }
        }, 1, null);
    }

    @NotNull
    /* renamed from: coloredShadow-PRYyx80 */
    public static final Modifier m6844coloredShadowPRYyx80(@NotNull Modifier coloredShadow, long j, float f, float f2, float f3, float f4, float f5) {
        Intrinsics.checkNotNullParameter(coloredShadow, "$this$coloredShadow");
        return ComposedModifierKt.composed$default(coloredShadow, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.blackhub.bronline.game.core.extension.ComposeExtensionKt$coloredShadow$1
            public final /* synthetic */ float $alpha;
            public final /* synthetic */ float $borderRadius;
            public final /* synthetic */ long $color;
            public final /* synthetic */ float $offsetX;
            public final /* synthetic */ float $offsetY;
            public final /* synthetic */ float $shadowRadius;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ComposeExtensionKt$coloredShadow$1(long j2, float f6, float f32, float f52, float f42, float f22) {
                super(3);
                r1 = j2;
                r3 = f6;
                r4 = f32;
                r5 = f52;
                r6 = f42;
                r7 = f22;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
                return invoke(modifier, composer, num.intValue());
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
                jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.blackhub.bronline.game.core.extension.ComposeExtensionKt$coloredShadow$1$1$1.<init>(int, float, float, float, int, float):void, class status: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:290)
                	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
                	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
                	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:193)
                	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
                	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
                	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
                	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
                */
            @androidx.compose.runtime.Composable
            @org.jetbrains.annotations.NotNull
            public final androidx.compose.ui.Modifier invoke(@org.jetbrains.annotations.NotNull androidx.compose.ui.Modifier r20, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r21, int r22) {
                /*
                    r19 = this;
                    r0 = r19
                    r1 = r20
                    r2 = r21
                    java.lang.String r3 = "$this$composed"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
                    r3 = 1976406872(0x75cd9358, float:5.2119597E32)
                    r2.startReplaceableGroup(r3)
                    boolean r4 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                    if (r4 == 0) goto L1f
                    r4 = -1
                    java.lang.String r5 = "com.blackhub.bronline.game.core.extension.coloredShadow.<anonymous> (ComposeExtension.kt:134)"
                    r6 = r22
                    androidx.compose.runtime.ComposerKt.traceEventStart(r3, r6, r4, r5)
                L1f:
                    long r6 = r1
                    float r8 = r3
                    r12 = 14
                    r13 = 0
                    r9 = 0
                    r10 = 0
                    r11 = 0
                    long r3 = androidx.compose.ui.graphics.Color.m3776copywmQWz5c$default(r6, r8, r9, r10, r11, r12, r13)
                    int r10 = androidx.compose.ui.graphics.ColorKt.m3831toArgb8_81llA(r3)
                    long r11 = r1
                    r17 = 14
                    r18 = 0
                    r13 = 0
                    r14 = 0
                    r15 = 0
                    r16 = 0
                    long r3 = androidx.compose.ui.graphics.Color.m3776copywmQWz5c$default(r11, r13, r14, r15, r16, r17, r18)
                    int r6 = androidx.compose.ui.graphics.ColorKt.m3831toArgb8_81llA(r3)
                    r3 = 113415086(0x6c293ae, float:7.3191685E-35)
                    r2.startReplaceableGroup(r3)
                    boolean r3 = r2.changed(r6)
                    float r4 = r4
                    boolean r4 = r2.changed(r4)
                    r3 = r3 | r4
                    float r4 = r5
                    boolean r4 = r2.changed(r4)
                    r3 = r3 | r4
                    float r4 = r6
                    boolean r4 = r2.changed(r4)
                    r3 = r3 | r4
                    boolean r4 = r2.changed(r10)
                    r3 = r3 | r4
                    float r4 = r7
                    boolean r4 = r2.changed(r4)
                    r3 = r3 | r4
                    float r7 = r4
                    float r8 = r5
                    float r9 = r6
                    float r11 = r7
                    java.lang.Object r4 = r21.rememberedValue()
                    if (r3 != 0) goto L85
                    androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.INSTANCE
                    java.lang.Object r3 = r3.getEmpty()
                    if (r4 != r3) goto L8e
                L85:
                    com.blackhub.bronline.game.core.extension.ComposeExtensionKt$coloredShadow$1$1$1 r4 = new com.blackhub.bronline.game.core.extension.ComposeExtensionKt$coloredShadow$1$1$1
                    r5 = r4
                    r5.<init>()
                    r2.updateRememberedValue(r4)
                L8e:
                    kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
                    r21.endReplaceableGroup()
                    androidx.compose.ui.Modifier r1 = androidx.compose.ui.draw.DrawModifierKt.drawBehind(r1, r4)
                    boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                    if (r3 == 0) goto La0
                    androidx.compose.runtime.ComposerKt.traceEventEnd()
                La0:
                    r21.endReplaceableGroup()
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.core.extension.ComposeExtensionKt$coloredShadow$1.invoke(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
            }
        }, 1, null);
    }

    @NotNull
    /* renamed from: shadow-o6VuwKU */
    public static final Modifier m6847shadowo6VuwKU(@NotNull Modifier shadow, long j, float f, float f2, float f3, float f4, float f5, float f6, @NotNull Modifier modifier) {
        Intrinsics.checkNotNullParameter(shadow, "$this$shadow");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        return shadow.then(DrawModifierKt.drawBehind(modifier, new Function1<DrawScope, Unit>() { // from class: com.blackhub.bronline.game.core.extension.ComposeExtensionKt$shadow$1
            public final /* synthetic */ float $blurRadius;
            public final /* synthetic */ float $borderRadius;
            public final /* synthetic */ long $color;
            public final /* synthetic */ float $offsetX;
            public final /* synthetic */ float $offsetY;
            public final /* synthetic */ float $spread;
            public final /* synthetic */ float $transparency;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ComposeExtensionKt$shadow$1(float f62, float f52, float f42, float f32, long j2, float f7, float f22) {
                super(1);
                r1 = f62;
                r2 = f52;
                r3 = f42;
                r4 = f32;
                r5 = j2;
                r7 = f7;
                r8 = f22;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@NotNull DrawScope drawBehind) {
                Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
                float f7 = r1;
                float f8 = r2;
                float f9 = r3;
                float f10 = r4;
                long j2 = r5;
                float f11 = r7;
                float f12 = r8;
                Canvas canvas = drawBehind.getDrawContext().getCanvas();
                Paint Paint = AndroidPaint_androidKt.Paint();
                android.graphics.Paint internalPaint = Paint.getInternalPaint();
                float mo311toPx0680j_4 = drawBehind.mo311toPx0680j_4(f7);
                float f13 = 0.0f - mo311toPx0680j_4;
                float mo311toPx0680j_42 = drawBehind.mo311toPx0680j_4(f8) + f13;
                float mo311toPx0680j_43 = f13 + drawBehind.mo311toPx0680j_4(f9);
                float m3605getWidthimpl = Size.m3605getWidthimpl(drawBehind.mo4326getSizeNHjbRc()) + mo311toPx0680j_4;
                float m3602getHeightimpl = Size.m3602getHeightimpl(drawBehind.mo4326getSizeNHjbRc()) + mo311toPx0680j_4;
                if (!Dp.m6108equalsimpl0(f10, Dp.m6103constructorimpl(0))) {
                    internalPaint.setMaskFilter(new BlurMaskFilter(drawBehind.mo311toPx0680j_4(f10), BlurMaskFilter.Blur.NORMAL));
                }
                internalPaint.setColor(ColorKt.m3831toArgb8_81llA(ColorKt.Color$default(Color.m3783getRedimpl(j2), Color.m3782getGreenimpl(j2), Color.m3780getBlueimpl(j2), RangesKt___RangesKt.coerceIn(Color.m3779getAlphaimpl(j2) * f11, 0.0f, 1.0f), null, 16, null)));
                canvas.drawRoundRect(mo311toPx0680j_42, mo311toPx0680j_43, m3605getWidthimpl, m3602getHeightimpl, drawBehind.mo311toPx0680j_4(f12), drawBehind.mo311toPx0680j_4(f12), Paint);
            }
        }));
    }

    @SuppressLint({"ModifierFactoryUnreferencedReceiver"})
    @NotNull
    public static final Modifier noRippleClickable(@NotNull Modifier modifier, boolean z, @NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return ComposedModifierKt.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.blackhub.bronline.game.core.extension.ComposeExtensionKt$noRippleClickable$1
            public final /* synthetic */ boolean $isEnable;
            public final /* synthetic */ Function0<Unit> $onClick;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ComposeExtensionKt$noRippleClickable$1(boolean z2, Function0<Unit> onClick2) {
                super(3);
                r1 = z2;
                r2 = onClick2;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
                jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.blackhub.bronline.game.core.extension.ComposeExtensionKt$noRippleClickable$1$2$1.<init>(kotlin.jvm.functions.Function0<kotlin.Unit>):void, class status: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:290)
                	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
                	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
                	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:193)
                	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
                	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
                	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
                	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
                */
            @androidx.compose.runtime.Composable
            @org.jetbrains.annotations.NotNull
            public final androidx.compose.ui.Modifier invoke(@org.jetbrains.annotations.NotNull androidx.compose.ui.Modifier r11, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r12, int r13) {
                /*
                    r10 = this;
                    java.lang.String r0 = "$this$composed"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
                    r0 = 1376618216(0x520d86e8, float:1.51963435E11)
                    r12.startReplaceableGroup(r0)
                    boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                    if (r1 == 0) goto L17
                    r1 = -1
                    java.lang.String r2 = "com.blackhub.bronline.game.core.extension.noRippleClickable.<anonymous> (ComposeExtension.kt:211)"
                    androidx.compose.runtime.ComposerKt.traceEventStart(r0, r13, r1, r2)
                L17:
                    r13 = -1072492232(0xffffffffc0131138, float:-2.297926)
                    r12.startReplaceableGroup(r13)
                    java.lang.Object r13 = r12.rememberedValue()
                    androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.INSTANCE
                    java.lang.Object r1 = r0.getEmpty()
                    if (r13 != r1) goto L30
                    androidx.compose.foundation.interaction.MutableInteractionSource r13 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
                    r12.updateRememberedValue(r13)
                L30:
                    r2 = r13
                    androidx.compose.foundation.interaction.MutableInteractionSource r2 = (androidx.compose.foundation.interaction.MutableInteractionSource) r2
                    r12.endReplaceableGroup()
                    boolean r4 = r1
                    r13 = -1072492118(0xffffffffc01311aa, float:-2.2979531)
                    r12.startReplaceableGroup(r13)
                    kotlin.jvm.functions.Function0<kotlin.Unit> r13 = r2
                    boolean r13 = r12.changed(r13)
                    kotlin.jvm.functions.Function0<kotlin.Unit> r1 = r2
                    java.lang.Object r3 = r12.rememberedValue()
                    if (r13 != 0) goto L52
                    java.lang.Object r13 = r0.getEmpty()
                    if (r3 != r13) goto L5a
                L52:
                    com.blackhub.bronline.game.core.extension.ComposeExtensionKt$noRippleClickable$1$2$1 r3 = new com.blackhub.bronline.game.core.extension.ComposeExtensionKt$noRippleClickable$1$2$1
                    r3.<init>()
                    r12.updateRememberedValue(r3)
                L5a:
                    r7 = r3
                    kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
                    r12.endReplaceableGroup()
                    r8 = 24
                    r9 = 0
                    r3 = 0
                    r5 = 0
                    r6 = 0
                    r1 = r11
                    androidx.compose.ui.Modifier r13 = androidx.compose.foundation.ClickableKt.m240clickableO2vRcR0$default(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                    androidx.compose.ui.Modifier r11 = r11.then(r13)
                    boolean r13 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                    if (r13 == 0) goto L78
                    androidx.compose.runtime.ComposerKt.traceEventEnd()
                L78:
                    r12.endReplaceableGroup()
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.core.extension.ComposeExtensionKt$noRippleClickable$1.invoke(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
            }
        }, 1, null);
    }

    public static /* synthetic */ Modifier noRippleClickable$default(Modifier modifier, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return noRippleClickable(modifier, z, function0);
    }

    @Composable
    public static final float toVerticalPercentSwDp(int i, @Nullable Composer composer, int i2) {
        composer.startReplaceableGroup(519005832);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(519005832, i2, -1, "com.blackhub.bronline.game.core.extension.toVerticalPercentSwDp (ComposeExtension.kt:227)");
        }
        float m6103constructorimpl = Dp.m6103constructorimpl(Dp.m6103constructorimpl(Dp.m6103constructorimpl(((Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).smallestScreenWidthDp) * i) / 100);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m6103constructorimpl;
    }

    @Composable
    public static final float toHorizontalPercentDp(int i, @Nullable Composer composer, int i2) {
        composer.startReplaceableGroup(-494074758);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-494074758, i2, -1, "com.blackhub.bronline.game.core.extension.toHorizontalPercentDp (ComposeExtension.kt:237)");
        }
        float m6103constructorimpl = Dp.m6103constructorimpl(Dp.m6103constructorimpl(Dp.m6103constructorimpl(((Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenHeightDp) * i) / 100);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m6103constructorimpl;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void IfTrue(@Nullable Boolean bool, @NotNull Function2<? super Composer, ? super Integer, Unit> func, @Nullable Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(func, "func");
        Composer startRestartGroup = composer.startRestartGroup(1878034798);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(bool) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(func) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1878034798, i2, -1, "com.blackhub.bronline.game.core.extension.IfTrue (ComposeExtension.kt:244)");
            }
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                func.invoke(startRestartGroup, Integer.valueOf((i2 >> 3) & 14));
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.core.extension.ComposeExtensionKt$IfTrue$1
                public final /* synthetic */ int $$changed;
                public final /* synthetic */ Function2<Composer, Integer, Unit> $func;
                public final /* synthetic */ Boolean $this_IfTrue;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public ComposeExtensionKt$IfTrue$1(Boolean bool2, Function2<? super Composer, ? super Integer, Unit> func2, int i3) {
                    super(2);
                    r1 = bool2;
                    r2 = func2;
                    r3 = i3;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i3) {
                    ComposeExtensionKt.IfTrue(r1, r2, composer2, RecomposeScopeImplKt.updateChangedFlags(r3 | 1));
                }
            });
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void IfFalse(@Nullable Boolean bool, @NotNull Function2<? super Composer, ? super Integer, Unit> func, @Nullable Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(func, "func");
        Composer startRestartGroup = composer.startRestartGroup(962945985);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(bool) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(func) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(962945985, i2, -1, "com.blackhub.bronline.game.core.extension.IfFalse (ComposeExtension.kt:252)");
            }
            if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
                func.invoke(startRestartGroup, Integer.valueOf((i2 >> 3) & 14));
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.core.extension.ComposeExtensionKt$IfFalse$1
                public final /* synthetic */ int $$changed;
                public final /* synthetic */ Function2<Composer, Integer, Unit> $func;
                public final /* synthetic */ Boolean $this_IfFalse;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public ComposeExtensionKt$IfFalse$1(Boolean bool2, Function2<? super Composer, ? super Integer, Unit> func2, int i3) {
                    super(2);
                    r1 = bool2;
                    r2 = func2;
                    r3 = i3;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i3) {
                    ComposeExtensionKt.IfFalse(r1, r2, composer2, RecomposeScopeImplKt.updateChangedFlags(r3 | 1));
                }
            });
        }
    }

    public static /* synthetic */ Modifier shimmerLoadingAnimation$default(Modifier modifier, boolean z, boolean z2, int i, float f, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = false;
        }
        if ((i3 & 2) != 0) {
            z2 = true;
        }
        boolean z3 = z2;
        if ((i3 & 4) != 0) {
            i = 500;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            f = 270.0f;
        }
        float f2 = f;
        if ((i3 & 16) != 0) {
            i2 = 1000;
        }
        return shimmerLoadingAnimation(modifier, z, z3, i4, f2, i2);
    }

    @NotNull
    public static final Modifier shimmerLoadingAnimation(@NotNull Modifier modifier, boolean z, boolean z2, int i, float f, int i2) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return !z ? modifier : ComposedModifierKt.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.blackhub.bronline.game.core.extension.ComposeExtensionKt$shimmerLoadingAnimation$1
            public final /* synthetic */ float $angleOfAxisY;
            public final /* synthetic */ int $durationMillis;
            public final /* synthetic */ boolean $isLightModeActive;
            public final /* synthetic */ int $widthOfShadowBrush;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ComposeExtensionKt$shimmerLoadingAnimation$1(boolean z22, int i22, int i3, float f2) {
                super(3);
                r1 = z22;
                r2 = i22;
                r3 = i3;
                r4 = f2;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i3) {
                List listOf;
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(43186338);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(43186338, i3, -1, "com.blackhub.bronline.game.core.extension.shimmerLoadingAnimation.<anonymous> (ComposeExtension.kt:271)");
                }
                if (r1) {
                    long m3814getWhite0d7_KjU = Color.INSTANCE.m3814getWhite0d7_KjU();
                    listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m3767boximpl(Color.m3776copywmQWz5c$default(m3814getWhite0d7_KjU, 0.0f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3767boximpl(Color.m3776copywmQWz5c$default(m3814getWhite0d7_KjU, 0.3f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3767boximpl(Color.m3776copywmQWz5c$default(m3814getWhite0d7_KjU, 0.5f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3767boximpl(Color.m3776copywmQWz5c$default(m3814getWhite0d7_KjU, 0.3f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3767boximpl(Color.m3776copywmQWz5c$default(m3814getWhite0d7_KjU, 0.0f, 0.0f, 0.0f, 0.0f, 14, null))});
                } else {
                    long m3803getBlack0d7_KjU = Color.INSTANCE.m3803getBlack0d7_KjU();
                    listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m3767boximpl(Color.m3776copywmQWz5c$default(m3803getBlack0d7_KjU, 0.0f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3767boximpl(Color.m3776copywmQWz5c$default(m3803getBlack0d7_KjU, 0.3f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3767boximpl(Color.m3776copywmQWz5c$default(m3803getBlack0d7_KjU, 0.5f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3767boximpl(Color.m3776copywmQWz5c$default(m3803getBlack0d7_KjU, 0.3f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3767boximpl(Color.m3776copywmQWz5c$default(m3803getBlack0d7_KjU, 0.0f, 0.0f, 0.0f, 0.0f, 14, null))});
                }
                List list = listOf;
                State<Float> animateFloat = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition("", composer, 6, 0), 0.0f, r3 + r2, AnimationSpecKt.m125infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(r2, 0, EasingKt.getLinearEasing(), 2, null), RepeatMode.Restart, 0L, 4, null), "Shimmer loading animation", composer, InfiniteTransition.$stable | 24624 | (InfiniteRepeatableSpec.$stable << 9), 0);
                Modifier background$default = BackgroundKt.background$default(composed, Brush.Companion.m3728linearGradientmHitzGk$default(Brush.INSTANCE, list, OffsetKt.Offset(animateFloat.getValue().floatValue() - r3, 0.0f), OffsetKt.Offset(animateFloat.getValue().floatValue(), r4), 0, 8, (Object) null), null, 0.0f, 6, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return background$default;
            }
        }, 1, null);
    }

    @NotNull
    public static final AnnotatedString toAnnotatedString(@NotNull Spanned spanned) {
        Intrinsics.checkNotNullParameter(spanned, "<this>");
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        builder.append(spanned.toString());
        Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
        Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
        for (Object obj : spans) {
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (obj instanceof StyleSpan) {
                int style = ((StyleSpan) obj).getStyle();
                if (style == 1) {
                    builder.addStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65531, (DefaultConstructorMarker) null), spanStart, spanEnd);
                } else if (style == 2) {
                    builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, FontStyle.m5708boximpl(FontStyle.INSTANCE.m5717getItalic_LCdwA()), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65527, (DefaultConstructorMarker) null), spanStart, spanEnd);
                } else if (style == 3) {
                    builder.addStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), FontStyle.m5708boximpl(FontStyle.INSTANCE.m5717getItalic_LCdwA()), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65523, (DefaultConstructorMarker) null), spanStart, spanEnd);
                }
            } else if (obj instanceof UnderlineSpan) {
                builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (DefaultConstructorMarker) null), spanStart, spanEnd);
            } else if (obj instanceof ForegroundColorSpan) {
                builder.addStyle(new SpanStyle(ColorKt.Color(((ForegroundColorSpan) obj).getForegroundColor()), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null), spanStart, spanEnd);
            }
        }
        return builder.toAnnotatedString();
    }
}
