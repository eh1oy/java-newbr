package com.blackhub.bronline.game.gui.donate;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateMainViewModel;
import com.blackhub.bronline.game.ui.blackpass.BlackPassBoostHintUIKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: GUIDonate.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$12", f = "GUIDonate.kt", i = {}, l = {830}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class GUIDonate$setObservers$12 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ GUIDonate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GUIDonate$setObservers$12(GUIDonate gUIDonate, Continuation<? super GUIDonate$setObservers$12> continuation) {
        super(2, continuation);
        this.this$0 = gUIDonate;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new GUIDonate$setObservers$12(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((GUIDonate$setObservers$12) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        DonateMainViewModel donateViewModel;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            donateViewModel = this.this$0.getDonateViewModel();
            StateFlow<Boolean> showBoostLevelsHintBPView = donateViewModel.getShowBoostLevelsHintBPView();
            Lifecycle lifecycle = this.this$0.getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
            Flow flowWithLifecycle = FlowExtKt.flowWithLifecycle(showBoostLevelsHintBPView, lifecycle, Lifecycle.State.STARTED);
            final GUIDonate gUIDonate = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$12.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                }

                @Nullable
                public final Object emit(boolean z, @NotNull Continuation<? super Unit> continuation) {
                    if (z) {
                        ComposeView composeView = GUIDonate.access$getBinding(GUIDonate.this).composeViewFirstDonateFullScreen;
                        final GUIDonate gUIDonate2 = GUIDonate.this;
                        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
                        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1097950241, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$12$1$1$1
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer, int i2) {
                                BlackPassMainViewModel blackPassMainViewModel;
                                DonateMainViewModel donateViewModel2;
                                if ((i2 & 11) != 2 || !composer.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1097950241, i2, -1, "com.blackhub.bronline.game.gui.donate.GUIDonate.setObservers.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GUIDonate.kt:834)");
                                    }
                                    blackPassMainViewModel = GUIDonate.this.getBlackPassMainViewModel();
                                    donateViewModel2 = GUIDonate.this.getDonateViewModel();
                                    BlackPassBoostHintUIKt.BlackPassBoostHintUI(blackPassMainViewModel, donateViewModel2, composer, 72);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer.skipToGroupEnd();
                            }
                        }));
                        composeView.setVisibility(0);
                    } else if (GUIDonate.access$getBinding(GUIDonate.this).composeViewFirstDonateFullScreen.getVisibility() != 8) {
                        ComposeView composeView2 = GUIDonate.access$getBinding(GUIDonate.this).composeViewFirstDonateFullScreen;
                        composeView2.setContent(ComposableSingletons$GUIDonateKt.INSTANCE.m6890getLambda2$app_siteRelease());
                        composeView2.setVisibility(8);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowWithLifecycle.collect(flowCollector, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
