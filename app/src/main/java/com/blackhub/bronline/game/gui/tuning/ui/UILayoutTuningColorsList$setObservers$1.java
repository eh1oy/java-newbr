package com.blackhub.bronline.game.gui.tuning.ui;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.media3.extractor.text.cea.Cea708Decoder;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningColorListViewModel;
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
/* compiled from: UILayoutTuningColorsList.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$setObservers$1", f = "UILayoutTuningColorsList.kt", i = {}, l = {Cea708Decoder.COMMAND_CW5}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class UILayoutTuningColorsList$setObservers$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ UILayoutTuningColorsList this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UILayoutTuningColorsList$setObservers$1(UILayoutTuningColorsList uILayoutTuningColorsList, Continuation<? super UILayoutTuningColorsList$setObservers$1> continuation) {
        super(2, continuation);
        this.this$0 = uILayoutTuningColorsList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new UILayoutTuningColorsList$setObservers$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((UILayoutTuningColorsList$setObservers$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        TuningColorListViewModel colorListViewModel;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            colorListViewModel = this.this$0.getColorListViewModel();
            StateFlow<Integer> newColorCost = colorListViewModel.getNewColorCost();
            Lifecycle lifecycle = this.this$0.getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
            Flow flowWithLifecycle = FlowExtKt.flowWithLifecycle(newColorCost, lifecycle, Lifecycle.State.STARTED);
            final UILayoutTuningColorsList uILayoutTuningColorsList = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$setObservers$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                }

                @Nullable
                public final Object emit(int i2, @NotNull Continuation<? super Unit> continuation) {
                    UILayoutTuningColorsList.this.setColorCostInView(i2);
                    UILayoutTuningColorsList.this.colorCost = i2;
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
