package com.blackhub.bronline.game.gui.tuning.ui;

import com.blackhub.bronline.game.gui.tuning.adapters.TuningDetailsInDiagnosticAdapter;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDiagnosticViewModel;
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
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  C:\javanew\classes3.dex
 */
/* compiled from: UILayoutTuningDiagnostics.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$setObservers$4", f = "UILayoutTuningDiagnostics.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class UILayoutTuningDiagnostics$setObservers$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ UILayoutTuningDiagnostics this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UILayoutTuningDiagnostics$setObservers$4(UILayoutTuningDiagnostics uILayoutTuningDiagnostics, Continuation<? super UILayoutTuningDiagnostics$setObservers$4> continuation) {
        super(2, continuation);
        this.this$0 = uILayoutTuningDiagnostics;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new UILayoutTuningDiagnostics$setObservers$4(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((UILayoutTuningDiagnostics$setObservers$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        TuningDiagnosticViewModel diagnosticViewModel;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            diagnosticViewModel = this.this$0.getDiagnosticViewModel();
            SharedFlow<Integer> newPosForUpdateItem = diagnosticViewModel.getNewPosForUpdateItem();
            final UILayoutTuningDiagnostics uILayoutTuningDiagnostics = this.this$0;
            FlowCollector<? super Integer> flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$setObservers$4.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                }

                @Nullable
                public final Object emit(int i2, @NotNull Continuation<? super Unit> continuation) {
                    TuningDetailsInDiagnosticAdapter tuningDetailsInDiagnosticAdapter;
                    tuningDetailsInDiagnosticAdapter = UILayoutTuningDiagnostics.this.detailsAdapter;
                    if (tuningDetailsInDiagnosticAdapter != null) {
                        tuningDetailsInDiagnosticAdapter.notifyItemChanged(i2);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (newPosForUpdateItem.collect(flowCollector, this) == coroutine_suspended) {
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
