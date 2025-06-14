package com.blackhub.bronline.game.gui.gasmangame.ui;

import android.view.View;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.blackhub.bronline.R;
import com.blackhub.bronline.game.core.extension.ViewExtensionKt;
import com.blackhub.bronline.game.gui.gasmangame.uistate.GasmanParentUIState;
import com.blackhub.bronline.game.gui.gasmangame.viewmodel.GasmanParentViewModel;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: GUIGasmanGame.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.gasmangame.ui.GUIGasmanGame$initViewModel$1", f = "GUIGasmanGame.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class GUIGasmanGame$initViewModel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ GUIGasmanGame this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GUIGasmanGame$initViewModel$1(GUIGasmanGame gUIGasmanGame, Continuation<? super GUIGasmanGame$initViewModel$1> continuation) {
        super(2, continuation);
        this.this$0 = gUIGasmanGame;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new GUIGasmanGame$initViewModel$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((GUIGasmanGame$initViewModel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
    /* compiled from: GUIGasmanGame.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.blackhub.bronline.game.gui.gasmangame.ui.GUIGasmanGame$initViewModel$1$1", f = "GUIGasmanGame.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.blackhub.bronline.game.gui.gasmangame.ui.GUIGasmanGame$initViewModel$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;
        public final /* synthetic */ GUIGasmanGame this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(GUIGasmanGame gUIGasmanGame, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = gUIGasmanGame;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            GasmanParentViewModel parentViewModel;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                parentViewModel = this.this$0.getParentViewModel();
                StateFlow<GasmanParentUIState> uiState = parentViewModel.getUiState();
                final GUIGasmanGame gUIGasmanGame = this.this$0;
                FlowCollector<? super GasmanParentUIState> flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.GUIGasmanGame.initViewModel.1.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((GasmanParentUIState) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull GasmanParentUIState gasmanParentUIState, @NotNull Continuation<? super Unit> continuation) {
                        GasmanParentViewModel parentViewModel2;
                        GasmanParentViewModel parentViewModel3;
                        FragmentActivity activity;
                        if (gasmanParentUIState.getLoadingFragmentEnded()) {
                            parentViewModel3 = GUIGasmanGame.this.getParentViewModel();
                            parentViewModel3.calculateGames();
                            Group containerGroup = GUIGasmanGame.access$getBinding(GUIGasmanGame.this).containerGroup;
                            Intrinsics.checkNotNullExpressionValue(containerGroup, "containerGroup");
                            ViewExtensionKt.animateAlphaForAll(containerGroup, 1.0f);
                            if (gasmanParentUIState.isNeedToShowDialog() && (activity = GUIGasmanGame.this.getActivity()) != null) {
                                new UIGasmanHintDialog(activity).show();
                            }
                        }
                        if (!gasmanParentUIState.getRandomListOfGames().isEmpty()) {
                            int quantityOfChecks = gasmanParentUIState.getQuantityOfChecks();
                            if (quantityOfChecks < 3 && gasmanParentUIState.getCurrentFragmentNumber() != gasmanParentUIState.getRandomListOfGames().get(quantityOfChecks).intValue()) {
                                GUIGasmanGame.this.replaceChildFragment(gasmanParentUIState.getRandomListOfGames().get(quantityOfChecks).intValue());
                            }
                            GUIGasmanGame.access$getBinding(GUIGasmanGame.this).tvQuantityOfChecks.setText(GUIGasmanGame.this.getString(R.string.gasman_checked_int_of_3, Boxing.boxInt(quantityOfChecks)));
                            if (quantityOfChecks == 1) {
                                GUIGasmanGame gUIGasmanGame2 = GUIGasmanGame.this;
                                View vResultOfCheck1 = GUIGasmanGame.access$getBinding(gUIGasmanGame2).vResultOfCheck1;
                                Intrinsics.checkNotNullExpressionValue(vResultOfCheck1, "vResultOfCheck1");
                                gUIGasmanGame2.setResultDrawable(vResultOfCheck1, quantityOfChecks);
                            } else if (quantityOfChecks == 2) {
                                GUIGasmanGame gUIGasmanGame3 = GUIGasmanGame.this;
                                View vResultOfCheck2 = GUIGasmanGame.access$getBinding(gUIGasmanGame3).vResultOfCheck2;
                                Intrinsics.checkNotNullExpressionValue(vResultOfCheck2, "vResultOfCheck2");
                                gUIGasmanGame3.setResultDrawable(vResultOfCheck2, quantityOfChecks);
                            } else if (quantityOfChecks == 3) {
                                GUIGasmanGame gUIGasmanGame4 = GUIGasmanGame.this;
                                View vResultOfCheck3 = GUIGasmanGame.access$getBinding(gUIGasmanGame4).vResultOfCheck3;
                                Intrinsics.checkNotNullExpressionValue(vResultOfCheck3, "vResultOfCheck3");
                                gUIGasmanGame4.setResultDrawable(vResultOfCheck3, quantityOfChecks);
                                parentViewModel2 = GUIGasmanGame.this.getParentViewModel();
                                parentViewModel2.sendGameEnded();
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (uiState.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Lifecycle lifecycle = this.this$0.getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, anonymousClass1, this) == coroutine_suspended) {
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
