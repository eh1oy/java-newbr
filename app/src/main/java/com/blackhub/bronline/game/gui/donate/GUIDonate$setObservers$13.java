package com.blackhub.bronline.game.gui.donate;

import android.graphics.Bitmap;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.utils.attachment.task.CommonTaskModel;
import com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel;
import com.blackhub.bronline.game.gui.donate.data.PreviewPrize;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateMainViewModel;
import com.blackhub.bronline.game.ui.widget.dialog.PreviewRewardDialogUiKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: GUIDonate.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$13", f = "GUIDonate.kt", i = {}, l = {859}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class GUIDonate$setObservers$13 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ GUIDonate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GUIDonate$setObservers$13(GUIDonate gUIDonate, Continuation<? super GUIDonate$setObservers$13> continuation) {
        super(2, continuation);
        this.this$0 = gUIDonate;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new GUIDonate$setObservers$13(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((GUIDonate$setObservers$13) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            SharedFlow<PreviewPrize> previewPrize = donateViewModel.getPreviewPrize();
            Lifecycle lifecycle = this.this$0.getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
            Flow flowWithLifecycle = FlowExtKt.flowWithLifecycle(previewPrize, lifecycle, Lifecycle.State.STARTED);
            final GUIDonate gUIDonate = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$13.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((PreviewPrize) obj2, (Continuation<? super Unit>) continuation);
                }

                @Nullable
                public final Object emit(@NotNull final PreviewPrize previewPrize2, @NotNull Continuation<? super Unit> continuation) {
                    final int i2;
                    int typeOfAward = previewPrize2.getTypeOfAward();
                    if (typeOfAward != 0) {
                        i2 = 3;
                        if (typeOfAward != 3) {
                            if (typeOfAward != 4) {
                                i2 = 1;
                            }
                        }
                        ComposeView composeView = GUIDonate.access$getBinding(GUIDonate.this).composeViewSecondDonateFullScreen;
                        final GUIDonate gUIDonate2 = GUIDonate.this;
                        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
                        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-492322163, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$13$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                            public final void invoke(@Nullable Composer composer, int i3) {
                                if ((i3 & 11) != 2 || !composer.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-492322163, i3, -1, "com.blackhub.bronline.game.gui.donate.GUIDonate.setObservers.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GUIDonate.kt:869)");
                                    }
                                    String name = PreviewPrize.this.getName();
                                    int i4 = i2;
                                    CommonRarityEnum rarity = PreviewPrize.this.getRarity();
                                    Bitmap image = PreviewPrize.this.getImage();
                                    final PreviewPrize previewPrize3 = PreviewPrize.this;
                                    final GUIDonate gUIDonate3 = gUIDonate2;
                                    PreviewRewardDialogUiKt.PreviewRewardDialogUi(name, i4, rarity, image, 0, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$13$1$1$1.1
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
                                            DonateMainViewModel donateViewModel2;
                                            BlackPassMainViewModel blackPassMainViewModel;
                                            DonateMainViewModel donateViewModel3;
                                            if (PreviewPrize.this.getTypeOfAward() == 4) {
                                                blackPassMainViewModel = gUIDonate3.getBlackPassMainViewModel();
                                                blackPassMainViewModel.onTaskClick(new CommonTaskModel(false, PreviewPrize.this.getId(), 0, null, null, 0, 0, null, null, null, 0, 2045, null));
                                                donateViewModel3 = gUIDonate3.getDonateViewModel();
                                                donateViewModel3.closePreviewPrize();
                                                return;
                                            }
                                            donateViewModel2 = gUIDonate3.getDonateViewModel();
                                            donateViewModel2.closePreviewPrize();
                                        }
                                    }, composer, 4096, 16);
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
                        return Unit.INSTANCE;
                    }
                    i2 = 2;
                    ComposeView composeView2 = GUIDonate.access$getBinding(GUIDonate.this).composeViewSecondDonateFullScreen;
                    final GUIDonate gUIDonate22 = GUIDonate.this;
                    composeView2.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
                    composeView2.setContent(ComposableLambdaKt.composableLambdaInstance(-492322163, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$13$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        public final void invoke(@Nullable Composer composer, int i3) {
                            if ((i3 & 11) != 2 || !composer.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-492322163, i3, -1, "com.blackhub.bronline.game.gui.donate.GUIDonate.setObservers.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GUIDonate.kt:869)");
                                }
                                String name = PreviewPrize.this.getName();
                                int i4 = i2;
                                CommonRarityEnum rarity = PreviewPrize.this.getRarity();
                                Bitmap image = PreviewPrize.this.getImage();
                                final PreviewPrize previewPrize3 = PreviewPrize.this;
                                final GUIDonate gUIDonate3 = gUIDonate22;
                                PreviewRewardDialogUiKt.PreviewRewardDialogUi(name, i4, rarity, image, 0, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$13$1$1$1.1
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
                                        DonateMainViewModel donateViewModel2;
                                        BlackPassMainViewModel blackPassMainViewModel;
                                        DonateMainViewModel donateViewModel3;
                                        if (PreviewPrize.this.getTypeOfAward() == 4) {
                                            blackPassMainViewModel = gUIDonate3.getBlackPassMainViewModel();
                                            blackPassMainViewModel.onTaskClick(new CommonTaskModel(false, PreviewPrize.this.getId(), 0, null, null, 0, 0, null, null, null, 0, 2045, null));
                                            donateViewModel3 = gUIDonate3.getDonateViewModel();
                                            donateViewModel3.closePreviewPrize();
                                            return;
                                        }
                                        donateViewModel2 = gUIDonate3.getDonateViewModel();
                                        donateViewModel2.closePreviewPrize();
                                    }
                                }, composer, 4096, 16);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer.skipToGroupEnd();
                        }
                    }));
                    composeView2.setVisibility(0);
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
