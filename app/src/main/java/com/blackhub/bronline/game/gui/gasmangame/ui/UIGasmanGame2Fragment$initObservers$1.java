package com.blackhub.bronline.game.gui.gasmangame.ui;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.blackhub.bronline.databinding.FragmentGasmanGame2Binding;
import com.blackhub.bronline.game.gui.gasmangame.uistate.GasmanChildUIState;
import com.blackhub.bronline.game.gui.gasmangame.viewmodel.GasmanChildViewModel;
import java.util.Collection;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;
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
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: UIGasmanGame2Fragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame2Fragment$initObservers$1", f = "UIGasmanGame2Fragment.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class UIGasmanGame2Fragment$initObservers$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ UIGasmanGame2Fragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UIGasmanGame2Fragment$initObservers$1(UIGasmanGame2Fragment uIGasmanGame2Fragment, Continuation<? super UIGasmanGame2Fragment$initObservers$1> continuation) {
        super(2, continuation);
        this.this$0 = uIGasmanGame2Fragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new UIGasmanGame2Fragment$initObservers$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((UIGasmanGame2Fragment$initObservers$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
    /* compiled from: UIGasmanGame2Fragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame2Fragment$initObservers$1$1", f = "UIGasmanGame2Fragment.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame2Fragment$initObservers$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;
        public final /* synthetic */ UIGasmanGame2Fragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UIGasmanGame2Fragment uIGasmanGame2Fragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = uIGasmanGame2Fragment;
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
            GasmanChildViewModel gasmanChildViewModel;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                gasmanChildViewModel = this.this$0.getGasmanChildViewModel();
                StateFlow<GasmanChildUIState> uiState = gasmanChildViewModel.getUiState();
                final UIGasmanGame2Fragment uIGasmanGame2Fragment = this.this$0;
                FlowCollector<? super GasmanChildUIState> flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame2Fragment.initObservers.1.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((GasmanChildUIState) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull GasmanChildUIState gasmanChildUIState, @NotNull Continuation<? super Unit> continuation) {
                        FragmentGasmanGame2Binding binding;
                        GasmanChildViewModel gasmanChildViewModel2;
                        if (gasmanChildUIState.getAnimateGas()) {
                            UIGasmanGame2Fragment.this.animateGas();
                            UIGasmanGame2Fragment.this.getViewModel().gasAnimated();
                        }
                        binding = UIGasmanGame2Fragment.this.getBinding();
                        binding.tvTopPlot.setText(String.valueOf(gasmanChildUIState.getTopPlotQuantity()));
                        int topPlotQuantity = gasmanChildUIState.getTopPlotQuantity();
                        if (topPlotQuantity == 0) {
                            binding.ivCornerPipeTopPlot.setVisibility(0);
                        } else if (topPlotQuantity == 1) {
                            binding.ivCornerPipeTopPlot1.setVisibility(0);
                        }
                        binding.tvMiddlePlot.setText(String.valueOf(gasmanChildUIState.getMiddlePlotQuantity()));
                        int middlePlotQuantity = gasmanChildUIState.getMiddlePlotQuantity();
                        if (middlePlotQuantity == 0) {
                            binding.ivStraightPipeMiddlePlot.setVisibility(0);
                        } else if (middlePlotQuantity == 1) {
                            binding.ivStraightPipeMiddlePlot1.setVisibility(0);
                        } else if (middlePlotQuantity == 2) {
                            binding.ivStraightPipeMiddlePlot2.setVisibility(0);
                        }
                        binding.tvBotPlot.setText(String.valueOf(gasmanChildUIState.getBotPlotQuantity()));
                        if (gasmanChildUIState.getBotPlotQuantity() == 0) {
                            binding.ivTeePipeBotPlot.setVisibility(0);
                        }
                        Collection<Boolean> values = gasmanChildUIState.getCheckIfPipesInPlaces().values();
                        if (!(values instanceof Collection) || !values.isEmpty()) {
                            Iterator<T> it = values.iterator();
                            while (it.hasNext()) {
                                if (!((Boolean) it.next()).booleanValue()) {
                                    break;
                                }
                            }
                        }
                        gasmanChildViewModel2 = UIGasmanGame2Fragment.this.getGasmanChildViewModel();
                        gasmanChildViewModel2.setAnimateGas();
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
