package com.blackhub.bronline.launcher.activities;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.blackhub.bronline.game.common.composemanager.ComposableProvider;
import com.blackhub.bronline.game.ui.widget.utils.StampReleaseKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes4.dex
 */
/* compiled from: MainActivity.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$MainActivityKt {

    @NotNull
    public static final ComposableSingletons$MainActivityKt INSTANCE = new ComposableSingletons$MainActivityKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function3<ComposableProvider, Composer, Integer, Unit> f224lambda1 = ComposableLambdaKt.composableLambdaInstance(581352538, false, new Function3<ComposableProvider, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.launcher.activities.ComposableSingletons$MainActivityKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ComposableProvider composableProvider, Composer composer, Integer num) {
            invoke(composableProvider, composer, num.intValue());
            return Unit.INSTANCE;
        }

        @Composable
        @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_]]")
        public final void invoke(@NotNull ComposableProvider setComposableContentForKotlin, @Nullable Composer composer, int i) {
            Intrinsics.checkNotNullParameter(setComposableContentForKotlin, "$this$setComposableContentForKotlin");
            if ((i & 81) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(581352538, i, -1, "com.blackhub.bronline.launcher.activities.ComposableSingletons$MainActivityKt.lambda-1.<anonymous> (MainActivity.kt:73)");
                }
                composer.startReplaceableGroup(1179870843);
                StampReleaseKt.StampRelease(composer, 0);
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    @NotNull
    /* renamed from: getLambda-1$app_siteRelease, reason: not valid java name */
    public final Function3<ComposableProvider, Composer, Integer, Unit> m7562getLambda1$app_siteRelease() {
        return f224lambda1;
    }
}
