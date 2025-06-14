package com.blackhub.bronline.game.gui.donate;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateMainViewModel;
import com.blackhub.bronline.game.ui.blackpass.lastchance.BlackPassLastChanceUIKt;
import com.blackhub.bronline.game.ui.widget.other.FakeDialogKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
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
@DebugMetadata(c = "com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$11", f = "GUIDonate.kt", i = {}, l = {796}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class GUIDonate$setObservers$11 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ GUIDonate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GUIDonate$setObservers$11(GUIDonate gUIDonate, Continuation<? super GUIDonate$setObservers$11> continuation) {
        super(2, continuation);
        this.this$0 = gUIDonate;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new GUIDonate$setObservers$11(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((GUIDonate$setObservers$11) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            StateFlow<Boolean> showLastChanceBPBoostView = donateViewModel.getShowLastChanceBPBoostView();
            Lifecycle lifecycle = this.this$0.getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
            Flow flowWithLifecycle = FlowExtKt.flowWithLifecycle(showLastChanceBPBoostView, lifecycle, Lifecycle.State.STARTED);
            final GUIDonate gUIDonate = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$11.1
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
                        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(100785024, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$11$1$1$1
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
                                if ((i2 & 11) != 2 || !composer.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(100785024, i2, -1, "com.blackhub.bronline.game.gui.donate.GUIDonate.setObservers.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GUIDonate.kt:800)");
                                    }
                                    long colorResource = ColorResources_androidKt.colorResource(R.color.total_black_90, composer, 6);
                                    final GUIDonate gUIDonate3 = GUIDonate.this;
                                    FakeDialogKt.m7526FakeDialog3IgeMak(null, colorResource, ComposableLambdaKt.composableLambda(composer, -1773983732, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$11$1$1$1.1
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer2, int i3) {
                                            DonateMainViewModel donateViewModel2;
                                            BlackPassMainViewModel blackPassMainViewModel;
                                            if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1773983732, i3, -1, "com.blackhub.bronline.game.gui.donate.GUIDonate.setObservers.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GUIDonate.kt:801)");
                                                }
                                                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                                Alignment center = Alignment.INSTANCE.getCenter();
                                                GUIDonate gUIDonate4 = GUIDonate.this;
                                                composer2.startReplaceableGroup(733328855);
                                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                                                composer2.startReplaceableGroup(-1323940314);
                                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxSize$default);
                                                if (!(composer2.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer2.startReusableNode();
                                                if (composer2.getInserting()) {
                                                    composer2.createNode(constructor);
                                                } else {
                                                    composer2.useNode();
                                                }
                                                Composer m3307constructorimpl = Updater.m3307constructorimpl(composer2);
                                                Updater.m3314setimpl(m3307constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                                Updater.m3314setimpl(m3307constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                                if (m3307constructorimpl.getInserting() || !Intrinsics.areEqual(m3307constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                    m3307constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                    m3307constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                }
                                                modifierMaterializerOf.invoke(SkippableUpdater.m3298boximpl(SkippableUpdater.m3299constructorimpl(composer2)), composer2, 0);
                                                composer2.startReplaceableGroup(2058660585);
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                donateViewModel2 = gUIDonate4.getDonateViewModel();
                                                blackPassMainViewModel = gUIDonate4.getBlackPassMainViewModel();
                                                BlackPassLastChanceUIKt.BlackPassLastChanceUI(donateViewModel2, blackPassMainViewModel, composer2, 72);
                                                composer2.endReplaceableGroup();
                                                composer2.endNode();
                                                composer2.endReplaceableGroup();
                                                composer2.endReplaceableGroup();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer2.skipToGroupEnd();
                                        }
                                    }), composer, 384, 1);
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
                        composeView2.setContent(ComposableSingletons$GUIDonateKt.INSTANCE.m6889getLambda1$app_siteRelease());
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
