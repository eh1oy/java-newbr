package com.blackhub.bronline.game.gui.gasmangame.ui;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import com.blackhub.bronline.databinding.FragmentGasmanGame1Binding;
import com.blackhub.bronline.game.gui.gasmangame.uistate.GasmanChildUIState;
import com.blackhub.bronline.game.gui.gasmangame.viewmodel.GasmanChildViewModel;
import java.util.Collection;
import java.util.Iterator;
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
/* compiled from: UIGasmanGame1Fragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame1Fragment$initObservers$1", f = "UIGasmanGame1Fragment.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class UIGasmanGame1Fragment$initObservers$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ UIGasmanGame1Fragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UIGasmanGame1Fragment$initObservers$1(UIGasmanGame1Fragment uIGasmanGame1Fragment, Continuation<? super UIGasmanGame1Fragment$initObservers$1> continuation) {
        super(2, continuation);
        this.this$0 = uIGasmanGame1Fragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new UIGasmanGame1Fragment$initObservers$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((UIGasmanGame1Fragment$initObservers$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Lifecycle lifecycle = this.this$0.getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
            Flow flowWithLifecycle = FlowExtKt.flowWithLifecycle(uiState, lifecycle, Lifecycle.State.STARTED);
            final UIGasmanGame1Fragment uIGasmanGame1Fragment = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame1Fragment$initObservers$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((GasmanChildUIState) obj2, (Continuation<? super Unit>) continuation);
                }

                @Nullable
                public final Object emit(@NotNull GasmanChildUIState gasmanChildUIState, @NotNull Continuation<? super Unit> continuation) {
                    FragmentGasmanGame1Binding binding;
                    GasmanChildViewModel gasmanChildViewModel2;
                    if (gasmanChildUIState.getAnimateGas()) {
                        UIGasmanGame1Fragment.this.animateGas();
                        UIGasmanGame1Fragment.this.getViewModel().gasAnimated();
                    }
                    binding = UIGasmanGame1Fragment.this.getBinding();
                    binding.tvTopPlot.setText(String.valueOf(gasmanChildUIState.getTopPlotQuantity()));
                    int topPlotQuantity = gasmanChildUIState.getTopPlotQuantity();
                    if (topPlotQuantity == 0) {
                        binding.ivStraightPipeTopPlot.setVisibility(0);
                    } else if (topPlotQuantity == 1) {
                        binding.ivStraightPipeTopPlot1.setVisibility(0);
                    }
                    binding.tvMiddlePlot.setText(String.valueOf(gasmanChildUIState.getMiddlePlotQuantity()));
                    int middlePlotQuantity = gasmanChildUIState.getMiddlePlotQuantity();
                    if (middlePlotQuantity == 0) {
                        binding.ivCornerPipeMiddlePlot.setVisibility(0);
                    } else if (middlePlotQuantity == 1) {
                        binding.ivCornerPipeMiddlePlot1.setVisibility(0);
                    } else if (middlePlotQuantity == 2) {
                        binding.ivCornerPipeMiddlePlot2.setVisibility(0);
                    }
                    binding.tvBotPlot.setText(String.valueOf(gasmanChildUIState.getBotPlotQuantity()));
                    Collection<Boolean> values = gasmanChildUIState.getCheckIfPipesInPlaces().values();
                    if (!(values instanceof Collection) || !values.isEmpty()) {
                        Iterator<T> it = values.iterator();
                        while (it.hasNext()) {
                            if (!((Boolean) it.next()).booleanValue()) {
                                break;
                            }
                        }
                    }
                    gasmanChildViewModel2 = UIGasmanGame1Fragment.this.getGasmanChildViewModel();
                    gasmanChildViewModel2.setAnimateGas();
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
