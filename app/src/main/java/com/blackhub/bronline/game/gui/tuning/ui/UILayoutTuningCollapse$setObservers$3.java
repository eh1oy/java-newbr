package com.blackhub.bronline.game.gui.tuning.ui;

import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningViewCarViewModel;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: UILayoutTuningCollapse.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$setObservers$3", f = "UILayoutTuningCollapse.kt", i = {}, l = {190}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class UILayoutTuningCollapse$setObservers$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ UILayoutTuningCollapse this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UILayoutTuningCollapse$setObservers$3(UILayoutTuningCollapse uILayoutTuningCollapse, Continuation<? super UILayoutTuningCollapse$setObservers$3> continuation) {
        super(2, continuation);
        this.this$0 = uILayoutTuningCollapse;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new UILayoutTuningCollapse$setObservers$3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((UILayoutTuningCollapse$setObservers$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        TuningViewCarViewModel viewCarViewModel;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            viewCarViewModel = this.this$0.getViewCarViewModel();
            StateFlow<Boolean> newIfShowViewCar = viewCarViewModel.getNewIfShowViewCar();
            final UILayoutTuningCollapse uILayoutTuningCollapse = this.this$0;
            FlowCollector<? super Boolean> flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$setObservers$3.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                }

                @Nullable
                public final Object emit(boolean z, @NotNull Continuation<? super Unit> continuation) {
                    if (z) {
                        UILayoutTuningCollapse.this.setVisibleRootView(4);
                    } else {
                        UILayoutTuningCollapse.this.setVisibleRootView(0);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (newIfShowViewCar.collect(flowCollector, this) == coroutine_suspended) {
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
