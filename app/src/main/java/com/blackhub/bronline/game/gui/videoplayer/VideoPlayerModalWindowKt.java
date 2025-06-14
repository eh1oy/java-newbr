package com.blackhub.bronline.game.gui.videoplayer;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.res.StringResources_androidKt;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.ui.widget.dialog.DialogCustomBlockKt;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: VideoPlayerModalWindow.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a)\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0005\u001a\r\u0010\u0006\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"VideoPlayerModalWindow", "", "onClickDismiss", "Lkotlin/Function0;", "onClickConfirm", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "VideoPlayerModalWindowPreview", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVideoPlayerModalWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoPlayerModalWindow.kt\ncom/blackhub/bronline/game/gui/videoplayer/VideoPlayerModalWindowKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,60:1\n1116#2,6:61\n1116#2,6:67\n*S KotlinDebug\n*F\n+ 1 VideoPlayerModalWindow.kt\ncom/blackhub/bronline/game/gui/videoplayer/VideoPlayerModalWindowKt\n*L\n32#1:61,6\n33#1:67,6\n*E\n"})
/* loaded from: classes3.dex */
public final class VideoPlayerModalWindowKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void VideoPlayerModalWindow(@NotNull final Function0<Unit> onClickDismiss, @NotNull final Function0<Unit> onClickConfirm, @Nullable Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(onClickDismiss, "onClickDismiss");
        Intrinsics.checkNotNullParameter(onClickConfirm, "onClickConfirm");
        Composer startRestartGroup = composer.startRestartGroup(-158095079);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(onClickDismiss) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(onClickConfirm) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-158095079, i2, -1, "com.blackhub.bronline.game.gui.videoplayer.VideoPlayerModalWindow (VideoPlayerModalWindow.kt:23)");
            }
            String upperCase = StringResources_androidKt.stringResource(R.string.common_confirmation, startRestartGroup, 6).toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            String stringResource = StringResources_androidKt.stringResource(R.string.common_continue, startRestartGroup, 6);
            String stringResource2 = StringResources_androidKt.stringResource(R.string.common_dismiss, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-667485390);
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.videoplayer.VideoPlayerModalWindowKt$VideoPlayerModalWindow$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        onClickConfirm.invoke();
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-667485338);
            boolean z2 = (i2 & 14) == 4;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.videoplayer.VideoPlayerModalWindowKt$VideoPlayerModalWindow$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        onClickDismiss.invoke();
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            composer2 = startRestartGroup;
            DialogCustomBlockKt.m7520DialogCustomBlockkoCIM3s(null, R.color.total_black_70, upperCase, null, 0L, 0.0f, null, false, stringResource, stringResource2, null, 0L, 0L, 1.0f, 0.0f, null, null, function0, (Function0) rememberedValue2, ComposableSingletons$VideoPlayerModalWindowKt.INSTANCE.m7201getLambda1$app_siteRelease(), composer2, 48, 805309440, 122105);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.videoplayer.VideoPlayerModalWindowKt$VideoPlayerModalWindow$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i3) {
                    VideoPlayerModalWindowKt.VideoPlayerModalWindow(onClickDismiss, onClickConfirm, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void VideoPlayerModalWindowPreview(@Nullable Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-238991563);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-238991563, i, -1, "com.blackhub.bronline.game.gui.videoplayer.VideoPlayerModalWindowPreview (VideoPlayerModalWindow.kt:54)");
            }
            VideoPlayerModalWindow(new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.videoplayer.VideoPlayerModalWindowKt$VideoPlayerModalWindowPreview$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.videoplayer.VideoPlayerModalWindowKt$VideoPlayerModalWindowPreview$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, startRestartGroup, 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.videoplayer.VideoPlayerModalWindowKt$VideoPlayerModalWindowPreview$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    VideoPlayerModalWindowKt.VideoPlayerModalWindowPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
