package com.blackhub.bronline.game.gui.donate;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: GUIDonate.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$GUIDonateKt {

    @NotNull
    public static final ComposableSingletons$GUIDonateKt INSTANCE = new ComposableSingletons$GUIDonateKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f76lambda1 = ComposableLambdaKt.composableLambdaInstance(-1025773732, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.ComposableSingletons$GUIDonateKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        @Composable
        public final void invoke(@Nullable Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1025773732, i, -1, "com.blackhub.bronline.game.gui.donate.ComposableSingletons$GUIDonateKt.lambda-1.<anonymous> (GUIDonate.kt:818)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f77lambda2 = ComposableLambdaKt.composableLambdaInstance(2070458299, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.ComposableSingletons$GUIDonateKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        @Composable
        public final void invoke(@Nullable Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2070458299, i, -1, "com.blackhub.bronline.game.gui.donate.ComposableSingletons$GUIDonateKt.lambda-2.<anonymous> (GUIDonate.kt:845)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f78lambda3 = ComposableLambdaKt.composableLambdaInstance(-1691057428, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.ComposableSingletons$GUIDonateKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        @Composable
        public final void invoke(@Nullable Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1691057428, i, -1, "com.blackhub.bronline.game.gui.donate.ComposableSingletons$GUIDonateKt.lambda-3.<anonymous> (GUIDonate.kt:900)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-4, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f79lambda4 = ComposableLambdaKt.composableLambdaInstance(-385215521, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.ComposableSingletons$GUIDonateKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        @Composable
        public final void invoke(@Nullable Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-385215521, i, -1, "com.blackhub.bronline.game.gui.donate.ComposableSingletons$GUIDonateKt.lambda-4.<anonymous> (GUIDonate.kt:930)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    @NotNull
    /* renamed from: getLambda-1$app_siteRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6889getLambda1$app_siteRelease() {
        return f76lambda1;
    }

    @NotNull
    /* renamed from: getLambda-2$app_siteRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6890getLambda2$app_siteRelease() {
        return f77lambda2;
    }

    @NotNull
    /* renamed from: getLambda-3$app_siteRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6891getLambda3$app_siteRelease() {
        return f78lambda3;
    }

    @NotNull
    /* renamed from: getLambda-4$app_siteRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6892getLambda4$app_siteRelease() {
        return f79lambda4;
    }
}
